package functionalTests

import geb.spock.GebSpec
import geb.Browser

class PairingMatrixGebSpec extends GebSpec {
    Browser createBrowser() {
        Browser browser = new Browser()
        browser.baseUrl = getBaseUrl()
        browser
    }

    protected GString getBaseUrl() {
        return "http://localhost:${getPort()}/PairingMatrix/"
    }

    String getPort() {
        System.getProperty("server.port", "8080")
    }
}