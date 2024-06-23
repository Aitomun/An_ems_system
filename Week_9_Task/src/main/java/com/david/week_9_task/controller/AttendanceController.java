package com.david.week_9_task.controller;

import com.david.week_9_task.model.Attendance;
import com.david.week_9_task.service.AttendanceService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class AttendanceController {
    private AttendanceService attendanceService;

    @GetMapping("/attendance")
    public String listAllAttendance(Model model){
        model.addAttribute("attendance", attendanceService.getAllAttendance());
        return "attendance_form";
    }

    @GetMapping("/attendance/form")
    public String showAttendanceForm(Model model) {
        Attendance attendance = new Attendance();
        model.addAttribute("attendance", attendance);
        return "attendance_form";
    }


    @PostMapping("/attendance/form")
    public String saveAttendance(@ModelAttribute("attendance") Attendance attendance) {
        attendanceService.addAttendance(attendance);
        return "welcome";
    }
}
