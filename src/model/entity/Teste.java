package model.entity;

import java.io.Serializable;
import java.util.Date;

public class Teste implements Serializable{
	private static final long serialVersionUID = 2032291879398685741L;
	
	private String nome;
	private Integer idade;
	private Double salario;
	private Date data_aniversario;
	
	public Teste() {		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Date getData_aniversario() {
		return data_aniversario;
	}

	public void setData_aniversario(Date data_aniversario) {
		this.data_aniversario = data_aniversario;
	}
	
	

}
