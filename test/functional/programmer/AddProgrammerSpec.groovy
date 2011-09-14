package programmer

import functionalTests.PairingMatrixGebSpec
import functionalTests.pages.programmer.AddProgrammerPage
import functionalTests.pages.programmer.ShowPairingMatrixPage
import org.matrix.Programmer
import functionalTests.pages.programmer.ViewProgrammerInfoPage
import functionalTests.pages.programmer.ViewProgrammersPage

class AddProgrammerSpec extends PairingMatrixGebSpec{

    def "should go to view programmers page when a programmer is added"() {

        when:
        to AddProgrammerPage
        and:
        programmerId << "123"
        programmerName << "saumya"
        save.click()


        then:
        assert at(ViewProgrammersPage)
    }

    def 'should not add the programmer to the table if he already exists'() {

        when:
        to AddProgrammerPage
        and:
        programmerId << "123"
        programmerName << "saumya"
        save.click()

        then:
        Programmer.count() == 1
    }
}
