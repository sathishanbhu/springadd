package greens.learn.salmple.service.impl;

import java.util.List;
import java.util.Optional;

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
	
	@Override
	public List<AdminTable> showAdmin() {
		
		List<AdminTable> adminTable=adminRepo.findAll();
		return adminTable;
	}

	@Override
	public Optional<AdminTable> getAdmin(int id) {
		
		Optional<AdminTable> adminTable=adminRepo.findById(id);
		return adminTable;
	}

}
