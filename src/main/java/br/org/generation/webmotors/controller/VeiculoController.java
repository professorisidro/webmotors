package br.org.generation.webmotors.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.webmotors.model.Veiculo;

@RestController
public class VeiculoController {
	
	@GetMapping("/veiculo/teste")
	public Veiculo testeVeiculo() {
		Veiculo v = new Veiculo();
		v.setId(1234);
		v.setMarca("Vokis");
		v.setModelo("Fusca");
		v.setAno(1978);
		v.setCor("Azul Geladeira da vó");
		v.setPreco(115800);
		v.setTipo("esportivo");
		v.setDetalhes("Veiculo impecavel. "
				+ "Motor Porsche Cayenne Turbo, "
				+ "acabamento em couro caramelo. "
				+ "Trio Elétrico, multimidia com navegação automatica, "
				+ "rodas de 23 polegadas."
				+ "Câmera de Ré."
				+ "Serve café expresso (pó do café não incluso)");
		return v;
	}
}
