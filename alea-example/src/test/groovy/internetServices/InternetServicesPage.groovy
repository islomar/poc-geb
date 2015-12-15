package internetServices

import geb.Page

class InternetServicesPage extends Page {

    static url = "/lab/html/internet_service"

    static content = {
        heading { $("h1") }
        addInternetServiceLink { $("a#add-internet-services") }
    }

    static at = {
        heading.text() == "Servicios de Internet"
        addInternetServiceLink
    }

}
