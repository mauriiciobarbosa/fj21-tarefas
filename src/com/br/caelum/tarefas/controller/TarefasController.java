package com.br.caelum.tarefas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.caelum.jdbc.dao.Dao;
import com.caelum.jdbc.dao.TarefaDao;
import com.caelum.jdbc.model.Tarefa;

@Controller
public class TarefasController {
	@RequestMapping("novaTarefa")
	public String form() {
		return "/tarefa/formulario";
	}
	
	@RequestMapping("adicionaTarefa")
	public String adiciona(Tarefa tarefa) {
		Dao dao = new TarefaDao();
		dao.add(tarefa);
		return "/tarefa/adicionado";
	}
}
