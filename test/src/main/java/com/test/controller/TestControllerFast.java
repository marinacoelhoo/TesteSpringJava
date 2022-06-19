package com.test.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Carro;
import com.test.model.CasadosFast;
import com.test.model.Celular;
import com.test.repository.TestRepositoryFast;
import com.test.service.FastService;

@RestController()
@RequestMapping("/fast")

public class TestControllerFast {

	@Autowired
	public TestRepositoryFast testRepositoryFast;
	@Autowired
	public FastService fastService;

	@PostMapping(value = "/salvarTodos")
	public String salvarTodosNomes(@RequestBody List<CasadosFast> fast) {
		fastService.salvarTodosNomes(fast);

		return "Salvo";

	}

	@GetMapping(value = "/hello")
	public String teste() {

		Celular iphone = new Celular();
		iphone.setAtivo(true);
		iphone.setId("22");
		iphone.setDataLancamento(LocalDateTime.now());
		iphone.setModelo("Iphone13");
		
		//Quando quer exibir no servidor
		//System.out.println("O modelo desse celular é: " + iphone.getModelo());
		
		Carro virtus = new Carro();
		virtus.setCor("Branco");
		virtus.setId("2022");
		virtus.setModelo("Volks");
		
		Carro amarok = new Carro();
		amarok.setCor("Vermelho");
		amarok.setId("2023");
		amarok.setModelo("AA");

		String mensagem   = "A cor do meu carro virtus é: "+ virtus.getCor();
		System.out.println(mensagem + "Hello World Heroku");
		

		
		return mensagem;
//		
//		List<Carro>listaDeCarros = new ArrayList<>();
//		
//		listaDeCarros.add(amarok);
//		listaDeCarros.add(virtus);
//		
////		for(Carro c: listaDeCarros) {
////			System.out.println(c.getModelo());
////		}
////		
//		
//		System.out.println("COR = "+listaDeCarros.get(0).getCor());
//		System.out.println("COR = "+listaDeCarros.get(1).getCor());
		
	
		

		
		//Quando quer exibir no cliente
		//return "O modelo desse celular é: " + iphone.getModelo();
			
		
		
//		System.out.println("HelloWorld");
//		return "HelloWorld";
	}

}
