import geb.spock.GebReportingSpec
import es.metromadrid.geb.pages.HomePage;

class HomeSpec extends GebReportingSpec {

    def "go to Metro de Madrid homepage"() {
        when:
        	to HomePage
        	
        then:
        	at HomePage
    }
}