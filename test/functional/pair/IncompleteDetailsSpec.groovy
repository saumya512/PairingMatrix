package pair


import functionalTests.PairingMatrixGebSpec
import functionalTests.pair.IncompleteDetailsPage
import functionalTests.pages.programmer.ViewProgrammersPage

class IncompleteDetailsSpec extends PairingMatrixGebSpec{

    def "should go to the view programmers page when the back button is clicked"() {
        when:
        to IncompleteDetailsPage

        and:
        back.click()

        then:
        at ViewProgrammersPage
    }
}
