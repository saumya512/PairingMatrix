package org.matrix

import grails.plugin.spock.ControllerSpec

class ProgrammerControllerSpec extends ControllerSpec {

    def "should save programmer with Id and name"() {
        setup:
        def programmers = []
        mockDomain(Programmer, programmers)
        ProgrammerController controller = new ProgrammerController()
        controller.params.programmers = '1234'
        controller.params.programmerName = 'saumya'

        when:
        controller.save()

        then:
        Programmer.count() == 1
    }

    def 'should make the save action redirect to view programmers page'() {
        setup:
        def programmers = []
        mockDomain(Programmer, programmers)
        ProgrammerController controller = new ProgrammerController()
        controller.params.programmerId = '1234'
        controller.params.programmerName = 'saumya'

        when:
        controller.save()

        then:
        redirectArgs == [action: "view", params: [id: "1234"]]
    }
}
