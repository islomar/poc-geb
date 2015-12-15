package createCustomer.pages

import geb.Page

class CreateNewCustomerPage extends Page {

    static url = "/lab/html/customer/new"

    static content = {
        sideMenu { module SideMenuNavigationModule }

        createNewCustomerForm { $("form #new-customer-form") }
        nuevoClienteLegend { $("fieldset legend") }
        nameInput { $("#name") }
        surnameInput { $("#surname") }

        accesoDropDown1 { $('html body div#wrap div#container div.row div.col-md-12 form#new-customer-form.form-horizontal fieldset div#templates-ids.form-group div.col-md-3 select.form-control.template-id') }

        accesoDropDown2 { $("#templates-ids.form-group div.col-md-3 select.form-control.template-id:first") }
        serialNumberInput(wait:true) { $("input #serial_number") }

        guardarButton { $("button", type: "submit") }
    }

    static at = {
        title.equals("Felix-Xema")
        nuevoClienteLegend.text() == "Nuevo cliente"
    }
}
