package greens.learn.salmple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import greens.learn.salmple.entity.SampleAdminTable;
import greens.learn.salmple.service.SampleService;

@RestController
@RequestMapping("/admin")
public class SampleController {
	
	@Autowired
	SampleService sampleService;
	
	
	@PostMapping("/add")
	public SampleAdminTable createUser(@RequestBody SampleAdminTable sampleAdminTable)
	{	
		sampleService.user(sampleAdminTable);
		return sampleAdminTable;		
	}

}
