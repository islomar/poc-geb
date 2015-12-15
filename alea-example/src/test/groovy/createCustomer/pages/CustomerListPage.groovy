package createCustomer.pages

import geb.Page

class CustomerListPage extends Page {

    static url = ""

    static content = {
        searchInputField { $("input #criteria") }
        sideMenu { module SideMenuNavigationModule }
    }

    static at = {
        title.equals("Felix-Xema")
    }

}
