package com.david.week_9_task.service.Impl;

import com.david.week_9_task.Repository.AdminRepository;
import com.david.week_9_task.model.Admin;
import com.david.week_9_task.model.Attendance;
import com.david.week_9_task.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
@Service
public class AdminServiceImpl implements AdminService {
    private AdminRepository adminRepository;

    @Autowired
    public AdminServiceImpl(AdminRepository adminRepository){
        this.adminRepository = adminRepository;
    }

    @Override
    public List<Attendance> getAllAttendance() {
        return null;
    }

    @Override
    public boolean isValidAdmin(String email, String password) {
        Admin admin = adminRepository.findByEmail(email);
        if(admin != null && Objects.equals(admin.getPassword(), password)){
            return true;
        }else {
            return false;
        }
    }
}
