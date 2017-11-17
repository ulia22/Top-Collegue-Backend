/**
 * 
 */
package dev.tcb.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.tcb.entite.Collegue;
import dev.tcb.repository.CollegueRepository;

/**
 * @author ETY9
 *
 */
@RestController
@RequestMapping("/collegues")
@CrossOrigin(origins="*")
public class CollegueController {

	@Autowired
	private CollegueRepository colRepo;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Collegue> getAllCollegues(){
		return colRepo.findAll();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public List<Collegue> saveCollegue(@RequestBody
			Collegue newCollegue){
		colRepo.save(newCollegue);
		return colRepo.findAll();
	}
	
	@RequestMapping(value="/{nom}/score", method=RequestMethod.PUT)
	public Collegue updateCollegue(@PathVariable String nom, @RequestBody Collegue unCollegue){
		Collegue c = colRepo.findBynom(nom);
		c.setScore(unCollegue.getScore());
		return colRepo.save(c);
	}
}
