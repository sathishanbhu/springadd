package greens.learn.salmple.service.impl;

import java.util.ArrayList;
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
	public AdminTable updateAdmin(AdminTable adminTable) {
		
		adminRepo.save(adminTable);
		return adminTable;
	}
	
	@Override
	public List<AdminTable> deleteAdmin(Integer adminTableId) {
		
		adminRepo.deleteById(adminTableId);
		List<AdminTable> adminTable=showAdmin();
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

	@Override
	public List<Character> getFlag(Character adminFlag) {
		
		List<AdminTable> adminTable=adminRepo.findByAdminFlag(adminFlag);
		List<Character> flagList=new ArrayList<Character>();
		for(AdminTable flag:adminTable) {
		flagList.add(flag.getAdminFlag());
		}
		
		return flagList;
	}

}
