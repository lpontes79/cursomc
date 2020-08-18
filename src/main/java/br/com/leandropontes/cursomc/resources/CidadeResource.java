package br.com.leandropontes.cursomc.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.leandropontes.cursomc.domain.Cidade;
import br.com.leandropontes.cursomc.repositories.CidadeRepository;

@RestController
@RequestMapping(value = "/cidades")
public class CidadeResource {
	@Autowired
	private CidadeRepository repo;
	
	//@RequestMapping(method = RequestMethod.GET)
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Optional<Cidade> obj;
		obj = repo.findById(id);
		return ResponseEntity.ok().body(obj.get());
		
		
	}

}
