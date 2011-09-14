package org.matrix

import grails.plugin.spock.ControllerSpec

class PairControllerSpec extends ControllerSpec {

    def "should save pair"() {
        setup:
        def pairs = []
        mockDomain(Pair, pairs)
        PairController controller = new PairController()
        controller.params.pairProgrammerName = 'aditi'
        controller.params.programmerName = 'saumya'
        controller.params.noOfTimesPaired = "1"

        when:
        controller.save()

        then:
        Pair.count() == 1
    }
}