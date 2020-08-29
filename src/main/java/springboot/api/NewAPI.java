package springboot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springboot.dto.NewDTO;
import springboot.service.INewService;

@RestController
public class NewAPI {

	@Autowired
	private INewService INewService;
	
	//@RequestMapping(value = "/new",method = RequestMethod.POST)
	@PostMapping(value = "/new")
	public NewDTO createNew(@RequestBody NewDTO model) {
      return INewService.save(model);
	}
	
	
	
	  @PutMapping(value = "/new/{id}") 
	  public NewDTO updateNew(@RequestBody NewDTO newDto, @PathVariable("id") long id) { 
		  newDto.setId(id);
		  return INewService.save(newDto); 
	  }
	 
	  
	  
	  
	 @DeleteMapping(value = "/new") 
	 public void deleteNew(@RequestBody long[] ids){ 
		 INewService.delete(ids);
	 }
	 
}
