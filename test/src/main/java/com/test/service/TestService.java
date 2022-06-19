package com.test.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.CasadosFast;
import com.test.model.TestModel;
import com.test.repository.TestRepository;

@Service
public class TestService {

	@Autowired
	public TestRepository testRepository;

	// salvar
	public void salvarEntidade(TestModel test) {
		test.setData(dataFormatadaAgora());
		testRepository.save(test);

	}

	// gera data atual
	public LocalDateTime dataFormatadaAgora() {
		LocalDateTime date = LocalDateTime.now();

		return date;
	}

	// listar todos
	public List<TestModel> buscarTodos() {

		return testRepository.findAll();
	}

	// alterando o nome e a data
	public void alterarEntidade(TestModel test) {
		test.setData(dataFormatadaAgora());
		testRepository.save(test);

	}

	public void salvarVarios(List<TestModel> test) {
		test.forEach(objetoTeste -> {
			objetoTeste.setData(dataFormatadaAgora());
		});

		testRepository.saveAll(test);

	}

	public void deletarEntidade(Long id) {
		testRepository.deleteById(id);

	}

	public List<TestModel> buscarPeloNome(String name) {

		return testRepository.findByName(name);

	}


}

//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy
// HH:mm:ss");
// String agoraString = date.format(formatter);
// date.parse(agoraString);
