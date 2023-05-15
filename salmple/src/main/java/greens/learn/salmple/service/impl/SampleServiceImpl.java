package greens.learn.salmple.service.impl;

import org.springframework.stereotype.Service;

import greens.learn.salmple.entity.SampleAdminTable;
import greens.learn.salmple.service.SampleService;

@Service
public class SampleServiceImpl implements SampleService {

	@Override
	public SampleAdminTable user(SampleAdminTable sampleAdminTable) {
		
		sampleAdminTable.setAns(sampleAdminTable.getaValue()+sampleAdminTable.getbValue());
		
		return sampleAdminTable;
	}

}
