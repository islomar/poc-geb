package dashboardOlts

import common.BasePage

class DashboardOltsPage extends BasePage {

    static url = "/lab/html/dashboard_olts"

    static content = {
        oltIdLink { $("div#autorefresh h1 a.modal-action") }
        divAutorefresh { $("div #autorefresh") }
    }

    static at = {
        divAutorefresh
        oltIdLink.text() == "lab:gpon1"
    }

}
