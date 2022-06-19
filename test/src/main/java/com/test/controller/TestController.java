package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.TestModel;
import com.test.repository.TestRepository;
import com.test.service.TestService;

@RestController()
@RequestMapping("/test")
public class TestController {
	// Quando vai importar um repository ou service precisa do @Autowired, ele
	// instancia o objeto
	@Autowired
	public TestRepository testRepository;
	@Autowired
	public TestService testService;

	// declarando os metodos http (get, post, delete, update)
	@PostMapping(value = "/salvar")
	public String salvar(@RequestBody TestModel test) {
		testService.salvarEntidade(test);
		return "Salvo";
	}

	@PostMapping(value = "/salvarAll")
	public String salvarVarios(@RequestBody List<TestModel> test) {
		testService.salvarVarios(test);
		return "Salvo";
	}

	@GetMapping(value = "/listar")
	public List<TestModel> listarTodos() {
		List<TestModel> list = testService.buscarTodos();

		return list;
	}

	@PutMapping(value = "/alterar")
	public String alterar(@RequestBody TestModel test) {
		testService.alterarEntidade(test);
		return "Alterado";
	}

	@DeleteMapping(value = "/deletar/{id}")
	public String deletar(@PathVariable Long id) {
		testService.deletarEntidade(id);
		System.out.println(id.toString());
		return "Deletado";
	}

	@GetMapping(value = "/buscar")
	public List<TestModel> buscarPeloNome(@RequestParam String name) {
//		List<TestModel>listTest = testService.buscarPeloNome(name);
//		return listTest;
		return testService.buscarPeloNome(name);

	}

}
