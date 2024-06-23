package com.david.week_9_task.controller;


import com.david.week_9_task.model.Leave;
import com.david.week_9_task.service.LeaveService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@AllArgsConstructor
@Controller
public class LeaveController {
    private LeaveService leaveService;

    @GetMapping("/leave")
    public String listAllLeave(Model model){
        model.addAttribute("leave", leaveService.getAllLeave());
        return "leave";
    }

    @GetMapping("/leave/form")
    public String showLeaveForm(Model model) {
        model.addAttribute("leave", new Leave());
        return "leave_application";
    }

    @PostMapping("/leave/form")
    public String submitLeaveForm(Leave leave) {
        leaveService.processLeave(leave);
        return "approved";
    }
}
