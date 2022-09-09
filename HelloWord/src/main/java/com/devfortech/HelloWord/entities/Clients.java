package com.devfortech.HelloWord.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.devfortech.HelloWord.dto.ClientsDTO;

@Entity
@Table(name = "tb_clients")
public class Clients implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String cpf;
	private String cep;
	private String endereco;
	private String numero;
	private String Bairro;
	private String cidade;
	private String estado;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant createdAt;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant updatedAt;
	
	public Clients(ClientsDTO dto) {
	this.id = dto.getId();
	this.name = dto.getName();
	this.cpf = dto.getCpf();
	this.cep = dto.getCep();
	this.endereco = dto.getEndereco();
	this.numero = dto.getNumero();
	this.Bairro = dto.getBairro();
	this.cidade = dto.getCidade();
	this.estado = dto.getEstado();

	}
	
	public Clients(Long id, String name, String cpf, String cep, String endereco, String numero, String bairro,
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
		Clients other = (Clients) obj;
		return Objects.equals(Bairro, other.Bairro) && Objects.equals(cep, other.cep)
				&& Objects.equals(cidade, other.cidade) && Objects.equals(cpf, other.cpf)
				&& Objects.equals(endereco, other.endereco) && Objects.equals(estado, other.estado)
				&& Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(numero, other.numero);
	}
	
	
	

}
