package common

import geb.Page

class BasePage extends Page {

    static content = {
        sideMenu { module SideMenuNavigationModule }
    }
}
