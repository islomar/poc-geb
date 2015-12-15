package createCustomer

import geb.spock.GebReportingSpec
import spock.lang.Ignore

class CreateNewCustomerSpec extends GebReportingSpec {

    @Ignore
    def "go to Create new customer page"() {
        when: "the user goes to the new customer page"
            to CreateNewCustomerPage

        and: "fills the form with correct values"
            nameInput = "John"
            surnameInput = "Doe"
            //accesoDropDown1 = "4"
            //accesoDropDown.selectByVisibleText("3Megas")

            //$("#templates-ids.form-group div.col-md-3 select.form-control.template-id")
            accesoDropDown1.click()
            accesoDropDown1.find("option").find{ it.value() == "4" }.click()

//            interact {
//                moveToElement(manualsMenu.toggle)
//            }

            //serialNumberInput = "1111111111111111"

        and: "save the new user"
            //guardarButton.click()

        then:
            at CreateNewCustomerPage
            accesoDropDown.val() == "xxx"
    }

}
