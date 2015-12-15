package common

import geb.Module

class NavigationBarModule extends Module{

    static content = {
        dropdownToggle {
            $("html body header div.navbar.navbar-default.navbar-fixed-top div.navbar-container div.collapse.navbar-collapse ul.nav.navbar-nav.navbar-right li.dropdown a.dropdown-toggle i.icon-align-justify")
        }

        internetServicesLink {
            $("html body header div.navbar.navbar-default.navbar-fixed-top div.navbar-container div.collapse.navbar-collapse ul.nav.navbar-nav.navbar-right li.dropdown ul.dropdown-menu li a")[3]
        }
    }

    void clickOnInternetServices() {
        internetServicesLink.click()
    }
}
