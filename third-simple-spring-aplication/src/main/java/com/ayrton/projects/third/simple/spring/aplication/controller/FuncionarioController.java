package com.ayrton.projects.third.simple.spring.aplication.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ayrton.projects.third.simple.spring.aplication.domain.Funcionario;
import com.ayrton.projects.third.simple.spring.aplication.service.FuncionarioService;

@Controller
public class FuncionarioController {

	FuncionarioService funcionarioService;
	Funcionario funcionario;

	@Autowired
	public FuncionarioController(FuncionarioService funcionarioService, Funcionario funcionario) {
		this.funcionarioService = funcionarioService;
		this.funcionario = funcionario;
	}
	
	@GetMapping("/")
	public String getIndex() {
		return "index";
	}

	@GetMapping("/detalhes-funcionario/{numeroAleatorioFuncionario}")
	public String obterDetalhesFuncionario(
			@PathVariable(value = "numeroAleatorioFuncionario") int numeroAleatorioFuncionario, Model model) {

		switch (numeroAleatorioFuncionario) {
		case 1:
			Funcionario funcionario1 = funcionarioService.obterFuncionario(numeroAleatorioFuncionario);

			int codigoFuncionario = funcionario1.getCodigoFuncionario();
			model.addAttribute("codigoFuncionario", codigoFuncionario);
			
			String nomeFuncionario = funcionario1.getNomeFuncionario();
			model.addAttribute("nomeFuncionario", nomeFuncionario);

			String apelidoFuncionario = funcionario1.getApelidoFuncionario();
			model.addAttribute("apelidoFuncionario", apelidoFuncionario);

			String cargoFuncionario = funcionario1.getCargoFuncionario();
			model.addAttribute("cargoFuncionario", cargoFuncionario);

			int anoNascimento = funcionario1.getAnoNascimentoFuncionario();
			model.addAttribute("anoNascimento", anoNascimento);

			Date dataContrato = funcionario1.getDataContrato();
			model.addAttribute("dataContrato", dataContrato);
			
			Double salarioLiquido = funcionario1.getSalarioLiquido();
			model.addAttribute("salarioLiquido", salarioLiquido);
			
			break;
			

		case 2:
			Funcionario funcionario2 = funcionarioService.obterFuncionario(numeroAleatorioFuncionario);
			
			int codigoFuncionario2 = funcionario2.getCodigoFuncionario();
			model.addAttribute("codigoFuncionario", codigoFuncionario2);
			
			String nomeFuncionario2 = funcionario2.getNomeFuncionario();
			model.addAttribute("nomeFuncionario", nomeFuncionario2);

			String apelidoFuncionario2 = funcionario2.getApelidoFuncionario();
			model.addAttribute("apelidoFuncionario", apelidoFuncionario2);

			String cargoFuncionario2 = funcionario2.getCargoFuncionario();
			model.addAttribute("cargoFuncionario", cargoFuncionario2);

			int anoNascimento2 = funcionario2.getAnoNascimentoFuncionario();
			model.addAttribute("anoNascimento", anoNascimento2);

			Date dataContrato2 = funcionario2.getDataContrato();
			model.addAttribute("dataContrato", dataContrato2);
			
			Double salarioLiquido2 = funcionario2.getSalarioLiquido();
			model.addAttribute("salarioLiquido", salarioLiquido2);
			
			break;

		case 3:
			Funcionario funcionario3 = funcionarioService.obterFuncionario(numeroAleatorioFuncionario);

			int codigoFuncionario3 = funcionario3.getCodigoFuncionario();
			model.addAttribute("codigoFuncionario", codigoFuncionario3);
			
			String nomeFuncionario3 = funcionario3.getNomeFuncionario();
			model.addAttribute("nomeFuncionario", nomeFuncionario3);

			String apelidoFuncionario3 = funcionario3.getApelidoFuncionario();
			model.addAttribute("apelidoFuncionario", apelidoFuncionario3);

			String cargoFuncionario3 = funcionario3.getCargoFuncionario();
			model.addAttribute("cargoFuncionario", cargoFuncionario3);

			int anoNascimento3 = funcionario3.getAnoNascimentoFuncionario();
			model.addAttribute("anoNascimento", anoNascimento3);

			Date dataContrato3 = funcionario3.getDataContrato();
			model.addAttribute("dataContrato", dataContrato3);
			
			Double salarioLiquido3 = funcionario3.getSalarioLiquido();
			model.addAttribute("salarioLiquido", salarioLiquido3);
			
			break;

		case 4:
			Funcionario funcionario4 = funcionarioService.obterFuncionario(numeroAleatorioFuncionario);

			int codigoFuncionario4 = funcionario4.getCodigoFuncionario();
			model.addAttribute("codigoFuncionario", codigoFuncionario4);
			
			String nomeFuncionario4 = funcionario4.getNomeFuncionario();
			model.addAttribute("nomeFuncionario", nomeFuncionario4);

			String apelidoFuncionario4 = funcionario4.getApelidoFuncionario();
			model.addAttribute("apelidoFuncionario", apelidoFuncionario4);

			String cargoFuncionario4 = funcionario4.getCargoFuncionario();
			model.addAttribute("cargoFuncionario", cargoFuncionario4);

			int anoNascimento4 = funcionario4.getAnoNascimentoFuncionario();
			model.addAttribute("anoNascimento", anoNascimento4);

			Date dataContrato4 = funcionario4.getDataContrato();
			model.addAttribute("dataContrato", dataContrato4);
			
			Double salarioLiquido4 = funcionario4.getSalarioLiquido();
			model.addAttribute("salarioLiquido", salarioLiquido4);
			
			break;

		default:
			Funcionario funcionarioDefault = funcionarioService.obterFuncionario(numeroAleatorioFuncionario);
			
			if (funcionarioDefault == null) {
				model.addAttribute("nomeFuncionario", "[Sem registo]");
				model.addAttribute("apelidoFuncionario", "[Sem registo]");
				model.addAttribute("cargoFuncionario", "[Sem registo]");
				model.addAttribute("anoNascimento", "[Sem registo]");
				model.addAttribute("dataContrato", "[Sem registo]");
			}

			break;
		}
		
		return "index";
		
	}

}
