package programmer

import functionalTests.PairingMatrixGebSpec
import functionalTests.pages.programmer.ViewProgrammerInfoPage

import functionalTests.pages.programmer.ViewProgrammersPage
import org.matrix.Programmer

import functionalTests.pair.IncompleteDetailsPage

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
        progId.text().contains("1")
        progName.text().contains("saumya")

    }

    def "should go to the incomplete details page if any of the field for the add pair is left empty"() {
        when:
        to ViewProgrammerInfoPage
        programmersName << ""
        pairsName << "saumya"
        timesPaired << ""
        and:
        addPair.click()

        then:
        at IncompleteDetailsPage
    }
}
