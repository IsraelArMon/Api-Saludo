package neoris.saludo.api.response;

import javax.xml.bind.annotation.XmlInlineBinaryData;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import neoris.saludo.api.entity.Saludo;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaludoResponse {

	private long id;
	private String tipo_saludo;
	private String saludo;
	public SaludoResponse(Saludo saludo) {
		this.id = saludo.getId();
		this.tipo_saludo = saludo.getTipo_saludo();
		this.saludo = saludo.getSaludo();
	}
}
