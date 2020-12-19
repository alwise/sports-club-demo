package com.astudio.sportsclubdemo.service;

import com.astudio.sportsclubdemo.entity.Staff;
import com.astudio.sportsclubdemo.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {

    @Autowired
    private StaffRepository staffRepository;

    public Staff register(Staff staff){
        return staffRepository.save(staff);
    }

    public List<Staff> getAll(){
        return staffRepository.findAll();
    }

}
