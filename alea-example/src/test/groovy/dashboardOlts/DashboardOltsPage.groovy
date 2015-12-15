package dashboardOlts

import createCustomer.pages.BasePage

class DashboardOltsPage extends BasePage {

    static url = "/lab/html/dashboard_olts"

    static content = {
        oltIdLink { $("html body div#wrap div#container div#autorefresh h1 a.modal-action") }
    }

    static at = {
        oltIdLink
    }

}
