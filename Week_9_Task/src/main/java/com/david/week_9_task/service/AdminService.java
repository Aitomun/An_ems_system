package com.david.week_9_task.service;

import com.david.week_9_task.model.Attendance;

import java.util.List;

public interface AdminService {
    List<Attendance> getAllAttendance();
    public boolean isValidAdmin(String email, String password);
}
