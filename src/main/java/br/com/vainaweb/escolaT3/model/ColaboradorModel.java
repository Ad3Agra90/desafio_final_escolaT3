package br.com.vainaweb.escolaT3.model;

import br.com.vainaweb.escolaT3.enums.Cargo;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ColaboradorModel {
	@Id
	private Long id;
	private String nome;
	private String email;
	private String Cpf;
	private Cargo cargo;
	private Endereco endereco;
}
