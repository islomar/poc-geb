package sideMenuNavigation

import listCustomers.CustomerListPage
import dashboardOlts.DashboardOltsPage
import geb.spock.GebReportingSpec
import spock.lang.Ignore

class SideMenuNavigationSpec extends GebReportingSpec {

    @Ignore
    def "The user clicks on the Dashboard OLTs icon of the side menu"() {

//        given:
//            to CustomerListPage

        when: "the user clicks on the Dashboard OLTs icon of the side menu"
            to CustomerListPage
            //sideMenu.clickOnDashboardOltsIcon()
            $("ul li a#html-action figure i.icon-dashboard").parent().parent().click()

        then: "the Dashboard OLTs page is rendered"
            waitFor {
                at DashboardOltsPage
            }
    }
}
