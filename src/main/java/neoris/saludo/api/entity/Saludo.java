package neoris.saludo.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import neoris.saludo.api.request.CreateSaludoRequest;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "saludo")
public class Saludo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name="tipo_saludo" , length = 45, unique=true)
	private String tipo_saludo;
	@Column(name = "saludo")
	private String saludo;
	
	public Saludo(CreateSaludoRequest createSaludoRequest) {
		this.tipo_saludo = createSaludoRequest.getTipo_saludo();
		this.saludo = createSaludoRequest.getSaludo();
	}
	
	
}
