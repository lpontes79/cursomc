package br.com.leandropontes.cursomc.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.leandropontes.cursomc.domain.Estado;
import br.com.leandropontes.cursomc.repositories.EstadoRepository;

@RestController
@RequestMapping(value = "/estados")
public class EstadoResource {
	@Autowired
	private EstadoRepository repo;
	
	//@RequestMapping(method = RequestMethod.GET)
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Optional<Estado> obj;
		obj = repo.findById(id);
		return ResponseEntity.ok().body(obj.get());
		
	}

}
