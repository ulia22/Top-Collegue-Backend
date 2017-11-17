/**
 * 
 */
package dev.tcb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.tcb.entite.Collegue;

/**
 * @author ETY9
 *
 */
public interface CollegueRepository extends JpaRepository<Collegue, Integer>{

	Collegue findBynom(String nom);
}
