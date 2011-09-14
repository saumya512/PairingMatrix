package programmer

import functionalTests.PairingMatrixGebSpec
import functionalTests.pages.programmer.ViewProgrammerInfoPage
import functionalTests.pages.programmer.ShowPairingMatrixPage
import functionalTests.pages.programmer.ViewProgrammersPage
import org.matrix.Programmer
import functionalTests.pages.programmer.AddProgrammerPage
import org.apache.taglibs.standard.tag.common.core.WhenTagSupport

class ViewProgrammerInfoSpec extends PairingMatrixGebSpec{

    def "should go to show the same programmer's details on view programmers info page that is requested at view programmers page"() {
        setup:
        new Programmer(programmerId: "1", programmerName: "saumya").save()

        when:
        to ViewProgrammersPage
        programmerId << "1"
        viewProgrammer.click()
        and:
        at ViewProgrammerInfoPage

        then:
        assert progId.value == "1"
        assert progName.value == "saumya"
    }
}
