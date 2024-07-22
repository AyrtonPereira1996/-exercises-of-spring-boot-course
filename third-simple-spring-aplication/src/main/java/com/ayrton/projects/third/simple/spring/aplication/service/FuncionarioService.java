package com.ayrton.projects.third.simple.spring.aplication.service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayrton.projects.third.simple.spring.aplication.domain.Funcionario;

@Service
public class FuncionarioService {

	private Funcionario funcionario;

	private Calendar anoActual, anoNascimento = Calendar.getInstance();

	private Random random = new Random();

	@Autowired(required = true)
	public FuncionarioService(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public int calcularIdade(Funcionario funcionario) {
		int anoDeNascimento = funcionario.getAnoNascimentoFuncionario();
		int idade = (int) anoActual.get(Calendar.YEAR) - anoDeNascimento;
		return idade;
	}

	public int obterNumerosAleatorios() {
		int numeroAleatorio = random.nextInt(1990) + 9999;
		return numeroAleatorio;
	}

	public Funcionario obterFuncionario(int numeroAleatorio) {
		Calendar dataContrato;
		Funcionario funcionario = new Funcionario();
		

		if (numeroAleatorio == 1) {
			int codigoFuncionario = obterNumerosAleatorios();
			funcionario.setCodigoFuncionario(codigoFuncionario);
			funcionario.setNomeFuncionario("Joaquim Ernesto");
			funcionario.setApelidoFuncionario("Camuene");
			funcionario.setCargoFuncionario("Gestor de Contas");
			funcionario.setAnoNascimentoFuncionario(1995);
			dataContrato = new GregorianCalendar(2020, 10, 20);
			funcionario.setDataContrato(dataContrato.getTime());
			funcionario.setSalarioLiquido(14.899);

		} else if (numeroAleatorio == 2) {
			int codigoFuncionario = obterNumerosAleatorios();
			funcionario.setCodigoFuncionario(codigoFuncionario);
			funcionario.setNomeFuncionario("Bernardo Marcos");
			funcionario.setApelidoFuncionario("Silva");
			funcionario.setCargoFuncionario("Técnico TI");
			funcionario.setAnoNascimentoFuncionario(1994);
			dataContrato = new GregorianCalendar(2020, 10, 20);
			funcionario.setDataContrato(dataContrato.getTime());
			funcionario.setSalarioLiquido(16.899);

		} else if (numeroAleatorio == 3) {
			int codigoFuncionario = obterNumerosAleatorios();
			funcionario.setCodigoFuncionario(codigoFuncionario);
			funcionario.setNomeFuncionario("Ernesto");
			funcionario.setApelidoFuncionario("Camuene");
			funcionario.setCargoFuncionario("Administrador");
			funcionario.setAnoNascimentoFuncionario(1996);
			dataContrato = new GregorianCalendar(2020, 10, 20);
			funcionario.setDataContrato(dataContrato.getTime());
			funcionario.setSalarioLiquido(17.899);

		} else if (numeroAleatorio == 4) {
			int codigoFuncionario = obterNumerosAleatorios();
			funcionario.setCodigoFuncionario(codigoFuncionario);
			funcionario.setNomeFuncionario("Joana Joaquim");
			funcionario.setApelidoFuncionario("Camuene");
			funcionario.setCargoFuncionario("Gestor de Contas");
			funcionario.setAnoNascimentoFuncionario(1996);
			dataContrato = new GregorianCalendar(2020, 10, 20);
			funcionario.setDataContrato(dataContrato.getTime());
			funcionario.setSalarioLiquido(13.899);

		} else if (numeroAleatorio == 5) {
			int codigoFuncionario = obterNumerosAleatorios();
			funcionario.setCodigoFuncionario(codigoFuncionario);
			funcionario.setNomeFuncionario("Renata");
			funcionario.setApelidoFuncionario("Salomé");
			funcionario.setCargoFuncionario("Contabilista");
			funcionario.setAnoNascimentoFuncionario(1990);
			dataContrato = new GregorianCalendar(2020, 10, 20);
			funcionario.setDataContrato(dataContrato.getTime());
			funcionario.setSalarioLiquido(10.899);

		}

		return funcionario;

	}

}
