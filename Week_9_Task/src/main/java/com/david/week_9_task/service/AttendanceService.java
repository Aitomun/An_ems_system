package com.david.week_9_task.service;

import com.david.week_9_task.model.Attendance;

import java.util.List;

public interface AttendanceService {
    List<Attendance> getAllAttendance();
    Attendance addAttendance(Attendance attendance);
}
