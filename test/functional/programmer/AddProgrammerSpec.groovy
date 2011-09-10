package programmer

import functionalTests.PairingMatrixGebSpec
import functionalTests.pages.programmer.AddProgrammerPage
import functionalTests.pages.programmer.ShowPairingMatrixPage
import org.matrix.Programmer
import functionalTests.pages.programmer.ViewProgrammerInfoPage

class AddProgrammerSpec extends PairingMatrixGebSpec{

    def "should go to show pairing matrix page when clicking on the view matrix button"() {
        given:
        at AddProgrammerPage

        when:
        viewPairingMatrix.click()

        then:
        assert at(ShowPairingMatrixPage)
    }

    def "should go to view programmer info page when a programmer is added/saved"() {
        setup:
        def prog = new Programmer(programmerName: "saumya", programmerId: "1234")

        when:
        to AddProgrammerPage
        and:
        prog.save()

        then:
        assert at(ViewProgrammerInfoPage)
    }




}
