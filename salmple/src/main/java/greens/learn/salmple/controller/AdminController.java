package greens.learn.salmple.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/get-all")
	public List<AdminTable> shwoAdmin()
	{	
		List<AdminTable> adminTable=adminService.showAdmin();
		return adminTable;		
	}
	
	@GetMapping("/get-by-id")
	public Optional<AdminTable> getAdmin(@RequestBody AdminTable id)
	{	
		Optional<AdminTable> adminTable=adminService.getAdmin(id.getAdminId());
		return adminTable;		
	
	}			

}
