package greens.learn.salmple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import greens.learn.salmple.entity.AdminTable;
import greens.learn.salmple.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	
	@PostMapping("/save")
	public AdminTable createAdmin(@RequestBody AdminTable adminTable)
	{	
		adminService.createAdmin(adminTable);
		return adminTable;		
	}

}
