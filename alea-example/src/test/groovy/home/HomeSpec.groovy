package home

import geb.spock.GebReportingSpec
import listCustomers.CustomerListPage


class HomeSpec extends GebReportingSpec {

    def "go to Felix homepage"() {
        when:
            to CustomerListPage

        then:
            at CustomerListPage
    }

}
