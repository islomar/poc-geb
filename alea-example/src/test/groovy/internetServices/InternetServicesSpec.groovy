package internetServices

import listCustomers.CustomerListPage
import geb.spock.GebReportingSpec
import internetServices.InternetServicesPage

class InternetServicesSpec extends GebReportingSpec {

    def "The user navigates to the Internet Services page"() {

        given: "the user has logged in"
            to CustomerListPage

        when: "the user clicks on toggle menu"
            navigationBarToggleMenu.dropdownToggle.click()

        and: "the user clicks on Internet services option"
            navigationBarToggleMenu.clickOnInternetServices()

        then:
            at InternetServicesPage
    }
}
