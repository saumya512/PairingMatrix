package programmer

import functionalTests.PairingMatrixGebSpec
import functionalTests.pages.programmer.ViewProgrammerInfoPage

import functionalTests.pages.programmer.ViewProgrammersPage
import org.matrix.Programmer
import functionalTests.pages.programmer.AddProgrammerPage

class ViewProgrammersSpec extends PairingMatrixGebSpec{

    def "should go to show programmers detail page on clicking the view programmer info button"() {
        setup:
        at AddProgrammerPage
        new Programmer(programmerId: "1", programmerName: "saumya").save()

        when:
        to ViewProgrammersPage
        and:
        programmerId << "1"
        viewProgrammer.click()

        then:
        assert at(ViewProgrammerInfoPage)
    }

    def "should remain on view programmers page if a non existing id is input in the programmer id input text box"() {
        setup:
        new Programmer(programmerId: "1", programmerName: "saumya").save()

        when:
        to ViewProgrammersPage
        and:
        programmerId << "2"
        viewProgrammer.click()

        then:
        assert at(ViewProgrammersPage)
    }
}