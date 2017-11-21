/**
 * 
 */
package dev.tcb.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dev.tcb.entite.Collegue;
import dev.tcb.repository.CollegueRepository;

/**
 * @author ETY9
 *
 */
@RestController
@RequestMapping("/")
@CrossOrigin(origins="*")
public class GeneralController {

	@Autowired
	private CollegueRepository colRepo;
	
	@RequestMapping(method=RequestMethod.GET)
	public String getAllCollegues(){
		return "200";
	}
	
}
