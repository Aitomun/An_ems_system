package com.david.week_9_task.service;

import com.david.week_9_task.model.Leave;

import java.util.List;

public interface LeaveService {
    List<Leave> getAllLeave();

    Leave processLeave(Leave leave);

    void denyLeave(Long leaveId);

    void approveLeave(Long leaveId);
}
