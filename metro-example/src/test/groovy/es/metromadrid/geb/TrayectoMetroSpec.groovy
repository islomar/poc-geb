package es.metromadrid.geb

import geb.spock.GebReportingSpec;
import es.metromadrid.geb.pages.HomePage;
import es.metromadrid.geb.pages.TrayectoRecomendadoPage;

class TrayectoMetroSpec extends GebReportingSpec {

    def "selecciona trayecto desde Colombia a Campo de las Naciones"() {
        
		given:
			to HomePage
				
		when:
        	estacionOrigenDropDown = "Colombia"
			estacionDestinoDropDown = "Campo de las Naciones"
			buscarButton.click()
			
        then:
        	at TrayectoRecomendadoPage
    }
}