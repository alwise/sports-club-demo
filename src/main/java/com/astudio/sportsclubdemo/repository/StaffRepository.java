package com.astudio.sportsclubdemo.repository;

import com.astudio.sportsclubdemo.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff,Integer> {
}
