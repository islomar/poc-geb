package es.metromadrid.geb.pages;

import geb.Page;

public class HomePage extends Page {
	
	static url = ""

	static content = {
		conocenosLink { $("#cabecera ul.menu21ES li:nth-child(2) a") }
		estacionOrigenDropDown(wait:true) { $('select', name:'idOrigen') }
		estacionDestinoDropDown(wait:true) { $('select', name:'idDestino') }
		buscarButton { $("#buscar") }
	}

	static at = {
		title.equals("Bienvenidos | Metro de Madrid")
	}
}
