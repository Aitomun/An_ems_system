package com.david.week_9_task.service.Impl;

import com.david.week_9_task.Repository.LeaveRepository;
import com.david.week_9_task.model.Leave;
import com.david.week_9_task.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveServiceImpl implements LeaveService {
    private LeaveRepository leaveRepository;

    @Autowired
    public LeaveServiceImpl(LeaveRepository leaveRepository) {
        this.leaveRepository = leaveRepository;
    }

    @Override
    public List<Leave> getAllLeave() {
        return leaveRepository.findAll();
    }

    @Override
    public Leave processLeave(Leave leave) {
        return leaveRepository.save(leave);
    }

    @Override
    public void denyLeave(Long leaveId) {

    }

    @Override
    public void approveLeave(Long leaveId) {

    }
}
