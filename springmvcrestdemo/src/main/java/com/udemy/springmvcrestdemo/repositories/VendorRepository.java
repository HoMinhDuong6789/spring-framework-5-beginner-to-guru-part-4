package com.udemy.springmvcrestdemo.repositories;

import com.udemy.springmvcrestdemo.domain.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor, Long> {
}