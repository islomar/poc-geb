package dashboardOlts

import geb.spock.GebReportingSpec

class DashboardOltsSpec extends GebReportingSpec {

    def "Navigate to Dashboard OLTs page"() {

        when:
            to DashboardOltsPage

        then:
            at DashboardOltsPage
    }
}
