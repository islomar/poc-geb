import geb.spock.GebReportingSpec
import es.metromadrid.geb.pages.HomePage;
import es.metromadrid.geb.pages.ConocenosPage;

class NavigateToConocenosFromHomeSpec extends GebReportingSpec {

    def "go to Conocenos from Homepage"() {
		
		given: "given we are at Homepage"
			to HomePage
		
        when: "we click on xxx"
			conocenosLink.click()
        	
        then:
        	at ConocenosPage
    }
}
