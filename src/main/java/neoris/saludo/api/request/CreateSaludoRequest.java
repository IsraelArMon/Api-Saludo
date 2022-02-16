package neoris.saludo.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateSaludoRequest {

	@JsonProperty("tipo_saludo")
	private String tipo_saludo;
	
	private String saludo;
}
