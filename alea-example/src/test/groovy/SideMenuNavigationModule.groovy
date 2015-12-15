import geb.Module


class SideMenuNavigationModule extends Module {

    static content = {
        homeIcon { $("a#html-action figure i.icon-list") }
        createCustomerIcon { $("a#html-action figure i.icon-user") }
        dashboardOltsIcon { $("a#html-action figure i.icon-dashboard") }
        leasesSearchIcon { $("a#html-action figure i.icon-search") }
    }

    void goToHome() {
        homeIcon.click()
    }

    void goToCreateCustomerPage() {
        createCustomerIcon.click()
    }

    void clickOnDashboardOltsIcon() {
        println "BEFORE clickOnDashboardOltsIcon!!!!!!!!"
        dashboardOltsIcon.click()
        println "AFTER clickOnDashboardOltsIcon!!!!!!!!"
    }

    void goToLeasesSearchPage() {
        leasesSearchIcon.click()
    }
}
