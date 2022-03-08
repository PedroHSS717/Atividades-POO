package atividade;

public class Funcionario {
	
	private int matricula;
	private String nome;
	private String cargo;
	private double salario;
	private String endereco;
	private int telefone;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}s
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return "Funcionario [matricula=" + matricula + ", nome=" + nome + ", cargo=" + cargo + ", salario=" + salario
				+ ", endereco=" + endereco + ", telefone=" + telefone + "]";
	}
	

}
