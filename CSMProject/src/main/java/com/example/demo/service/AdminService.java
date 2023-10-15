package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepository;

@Service
public class AdminService {
	@Autowired
	private AdminRepository repository;

	public Admin addAdmin(Admin admin) {
		return repository.save(admin);
	}

	public List<Admin> getAllAdmins() {
		return repository.findAll();
	}

	public Admin getAdminByAdminID(int adminID) {
		return repository.findByAdminID(adminID);
	}

	public Admin getAdminByAccountID(int accountID) {
		return repository.findByAccount_AccountID(accountID);
	}
}
