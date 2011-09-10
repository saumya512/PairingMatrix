package org.matrix

import grails.plugin.spock.ControllerSpec

class ProgrammerControllerSpec extends ControllerSpec {

    def "should save programmer with Id and name"() {
        setup:
        def programmers = []
        mockDomain(Programmer, programmers)
        ProgrammerController controller = new ProgrammerController()
        controller.params.programmerId = '1234'
        controller.params.programmerName = 'saumya'

        when:
        controller.save()

        then:
        Programmer.count() == 1
    }
}
