package com.david.week_9_task.service.Impl;

import com.david.week_9_task.Repository.AttendanceRepository;
import com.david.week_9_task.model.Attendance;
import com.david.week_9_task.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceServiceImpl implements AttendanceService {
    private AttendanceRepository attendanceRepository;

    @Autowired
    public AttendanceServiceImpl(AttendanceRepository attendanceRepository){
        this.attendanceRepository = attendanceRepository;
    }

    @Override
    public List<Attendance> getAllAttendance() {
        return attendanceRepository.findAll();
    }

    @Override
    public Attendance addAttendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }
}
