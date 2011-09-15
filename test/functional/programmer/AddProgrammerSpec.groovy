package programmer

import functionalTests.PairingMatrixGebSpec
import functionalTests.pages.programmer.AddProgrammerPage

import org.matrix.Programmer

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

    def 'should not add programmer with no ID'() {
        when:
        to AddProgrammerPage
        and:
        programmerId << ""
        programmerName << "saumya"
        save.click()

        then:
        Programmer.count() == 0
    }

    def 'should not add the programmer to the table if he already exists'() {
        setup:
        new Programmer(programmerId: "123", programmerName: "saumya").save(flush:true)

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
