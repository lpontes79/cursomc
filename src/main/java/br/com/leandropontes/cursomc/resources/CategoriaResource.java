package br.com.leandropontes.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.leandropontes.cursomc.domain.Categoria;
import br.com.leandropontes.cursomc.services.CategoriaService;
import br.com.leandropontes.cursomc.services.exceptions.ObjectNotFoundException;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	@Autowired
	private CategoriaService service;
	
	//@RequestMapping(method = RequestMethod.GET)
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj;
		obj = service.find(id);
		return ResponseEntity.ok().body(obj);
		
		
	}

}
