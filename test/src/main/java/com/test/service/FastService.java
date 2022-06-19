package com.test.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.CasadosFast;
import com.test.model.Celular;
import com.test.repository.TestRepositoryFast;

@Service
public class FastService {

	@Autowired
	public TestRepositoryFast testRepositoryFast;

	//void quando não precisa ter um return
	public void salvarTodosNomes(List<CasadosFast> fast) {
		
		//como instanciar um objeto
		CasadosFast casado = new CasadosFast();

		Celular celularIphone = new Celular();
		
		celularIphone.setId("1");
		celularIphone.setModelo("Iphone13");
		celularIphone.setDataLancamento(LocalDateTime.now());
		celularIphone.setAtivo(true);
		
		Celular celularNokia = new Celular();
		celularNokia.setId("10");
		celularNokia.setModelo("Nokia2");
		
		
		Celular celularSamsung = new Celular();

		celularSamsung.setId("3");
		celularSamsung.setModelo("Samsung");
		celularSamsung.setDataLancamento(LocalDateTime.now());
		celularSamsung.setAtivo(false);
		
		//declaração de lista
		List<Celular>listaDeCelulares = new ArrayList<>();
		
		//adicionando na lista
		listaDeCelulares.add(celularIphone);
		listaDeCelulares.add(celularSamsung);
		listaDeCelulares.add(celularNokia);
		
		//exibindo a lista no console
		//quando for objeto, começa com maiúscula. Quando for instância do objeto, CamelCase
		//quando é boolean, utiliza o "is" para pegar a info do atributo
		//quando não define o boolean, ele usa o false como padrão
		for (Celular c: listaDeCelulares) {
			System.out.println(c.isAtivo());
			//System.out.println("O celular está ativo = " + (c.isAtivo() ?"Sim":"Não"));
			
			String ativo = "";
			if(c.isAtivo()== true) {
				ativo = "Sim";
			}
			else {
				ativo = "Não";
			}
			
			System.out.println("O celular está ativo? " + ativo);
			System.out.println("O id desse celular é " +c.getId() + "O modelo desse celular é "  + c.getModelo() + "Esse celular está ativo para venda? " +c.isAtivo());
			
			Celular lg = new Celular();
			lg.setId("65");
			lg.setModelo("LG");
		}
		
		
		
		
		
		
		
//	for (CasadosFast casadosFast : fast) {
//			System.out.println("COMO ERA ANTES"+casadosFast.getCustomerFullName());
//			casadosFast.setCity("Votorantim");
			// casadosFast.setCustomerFullName("KAIQUE");
//			System.err.println("COMO FICOU DEPOIS"+casadosFast.getCustomerFullName());
//		}
//		testRepositoryFast.saveAll(fast);
	}

}
