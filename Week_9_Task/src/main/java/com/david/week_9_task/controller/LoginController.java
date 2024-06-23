package com.david.week_9_task.controller;

import com.david.week_9_task.exception.EmployeeNotFound;
import com.david.week_9_task.model.Employee;
import com.david.week_9_task.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {
    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "login";
    }

    @PostMapping("/loginEmployee")
    public String processLogin(@Valid @ModelAttribute("employee") Employee login, BindingResult bindingResult,
                               RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "login";
        }

        Employee employee = employeeService.findByEmail(login.getEmail());

        if (employee == null || !employee.getEmployeeToken().equals(login.getEmployeeToken())) {
            throw new EmployeeNotFound("Invalid email or password");
        }

        return "redirect:/employees/basic";
    }
}
