package com.ayrton.projects.third.simple.spring.aplication.domain;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository
public class Funcionario {
	
	private int codigoFuncionario;
	private String nomeFuncionario;
	private String apelidoFuncionario;
	private String cargoFuncionario;
	private int anoNascimentoFuncionario;
	private Date dataContrato;
	private double salarioLiquido;
	
	
	public double getSalarioLiquido() {
		return salarioLiquido;
	}
	
	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}
	
	public int getCodigoFuncionario() {
		return codigoFuncionario;
	}
	public void setCodigoFuncionario(int codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public String getApelidoFuncionario() {
		return apelidoFuncionario;
	}
	public void setApelidoFuncionario(String apelidoFuncionario) {
		this.apelidoFuncionario = apelidoFuncionario;
	}
	public String getCargoFuncionario() {
		return cargoFuncionario;
	}
	public void setCargoFuncionario(String cargoFuncionario) {
		this.cargoFuncionario = cargoFuncionario;
	}
	public int getAnoNascimentoFuncionario() {
		return anoNascimentoFuncionario;
	}
	public void setAnoNascimentoFuncionario(int anoNascimentoFuncionario) {
		this.anoNascimentoFuncionario = anoNascimentoFuncionario;
	}
	public Date getDataContrato() {
		return dataContrato;
	}
	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}
	
	
	
	

}
