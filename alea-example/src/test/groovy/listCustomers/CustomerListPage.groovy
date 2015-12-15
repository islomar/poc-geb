package listCustomers

import geb.Page
import common.NavigationBarModule
import common.SideMenuNavigationModule

class CustomerListPage extends Page {

    static url = ""

    static content = {
        searchInputField { $("input #criteria") }
        sideMenu { module SideMenuNavigationModule }
        navigationBarToggleMenu { module NavigationBarModule }
    }

    static at = {
        title.equals("Felix-Xema")
    }

}
