package springboot.service;

import springboot.dto.NewDTO;

public interface INewService {

	NewDTO save(NewDTO newDTO);
	
	void delete(long[] ids);
	
}
