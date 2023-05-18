package greens.learn.salmple.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import greens.learn.salmple.entity.AdminTable;
import greens.learn.salmple.repo.AdminRepo;
import greens.learn.salmple.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminRepo adminRepo;

	@Override
	public AdminTable createAdmin(AdminTable adminTable) {
		
		adminRepo.save(adminTable);
		return adminTable;
	}

}
