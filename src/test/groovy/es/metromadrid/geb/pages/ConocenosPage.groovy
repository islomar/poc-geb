package es.metromadrid.geb.pages;

import geb.Page;

public class ConocenosPage extends Page{
	
	static url = "es/conocenos/index.html"
			
	static content = {
		textoContenidoDos { $('#col1 .dos p').text() }
	}

	static at = {
		title.equals("Conócenos | Metro de Madrid")
		textoContenidoDos != null//"Más de 7.500 personas trabajan para que más de 2 millones de personas al día puedan realizar sus desplazamientos de la forma más cómoda, rápida y segura por una red que, en la actualidad, cuenta con 293 Kilómetros y 300 estaciones.Más de 7.500 personas trabajan para que más de 2 millones de personas al día puedan realizar sus desplazamientos de la forma más cómoda, rápida y segura por una red que, en la actualidad, cuenta con 293 Kilómetros y 300 estaciones."
	}
}