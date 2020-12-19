package com.astudio.sportsclubdemo.controller;

import com.astudio.sportsclubdemo.entity.Staff;
import com.astudio.sportsclubdemo.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @PostMapping("/register")
    public Staff register(@RequestBody  Staff staff){
        return staffService.register(staff);
    }


    @GetMapping("/staffs")
    public List<Staff> getStaffs(){
        return staffService.getAll();
    }

}
