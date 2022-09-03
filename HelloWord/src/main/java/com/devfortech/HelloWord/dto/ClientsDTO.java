package com.devfortech.HelloWord.dto;

import java.io.Serializable;
import java.util.Objects;

public class ClientsDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String cpf;
	private String cep;
	private String endereco;
	private String numero;
	private String Bairro;
	private String cidade;
	private String estado;
	
	
	public ClientsDTO() {}
	
	public ClientsDTO(Long id, String name, String cpf, String cep, String endereco, String numero, String bairro,
			String cidade, String estado) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.cep = cep;
		this.endereco = endereco;
		this.numero = numero;
		this.Bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Bairro, cep, cidade, cpf, endereco, estado, id, name, numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClientsDTO other = (ClientsDTO) obj;
		return Objects.equals(Bairro, other.Bairro) && Objects.equals(cep, other.cep)
				&& Objects.equals(cidade, other.cidade) && Objects.equals(cpf, other.cpf)
				&& Objects.equals(endereco, other.endereco) && Objects.equals(estado, other.estado)
				&& Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(numero, other.numero);
	}
	
	
	

}
