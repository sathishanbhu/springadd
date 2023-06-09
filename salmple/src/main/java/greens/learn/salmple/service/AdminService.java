package greens.learn.salmple.service;

import java.util.List;
import java.util.Optional;

import greens.learn.salmple.entity.AdminTable;

public interface AdminService {

	public AdminTable createAdmin(AdminTable adminTable);
	public AdminTable updateAdmin(AdminTable adminTable);
	public  List<AdminTable> deleteAdmin(Integer adminTableId);
	public List<AdminTable> showAdmin();
	public Optional<AdminTable> getAdmin(int adminTable);
	public List<Character> getFlag(Character character);		
}
