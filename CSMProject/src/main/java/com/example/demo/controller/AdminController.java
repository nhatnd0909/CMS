package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Admin;
import com.example.demo.service.AccountService;
import com.example.demo.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService service;
	@Autowired
	private AccountService accountService;

	@PostMapping("/add")
	public Admin addAdmin(@RequestBody Admin admin) {
		accountService.addAccount(admin.getAccount());
		return service.addAdmin(admin);
	}

	@GetMapping("getAll")
	public List<Admin> getAllAdmins() {
		return service.getAllAdmins();
	}
	
	@GetMapping("/{adminID}")
    public Admin getAdminByAdminID(@PathVariable int adminID) {
        return service.getAdminByAdminID(adminID);
    }
	
	@GetMapping("by-account/{accountID}")
    public Admin getAdminByAccountID(@PathVariable int accountID) {
        return service.getAdminByAccountID(accountID);
    }
}
