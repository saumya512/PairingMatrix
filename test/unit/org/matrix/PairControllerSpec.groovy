package org.matrix

import grails.plugin.spock.ControllerSpec

class PairControllerSpec extends ControllerSpec {

    def "should save pair"() {
        setup:
        def pairs = []
        mockDomain(Pair, pairs)
        PairController controller = new PairController()
        controller.params.pairProgrammersName = 'aditi'
        controller.params.programmersName = 'saumya'
        controller.params.noOfTimesTheyPaired = "1"

        when:
        controller.save()

        then:
        Pair.count() == 1
    }

    def "should update pair if it already exists" () {
        setup:
        new Pair(programmerName: 'saumya', pairProgrammerName: 'aditi', noOfTimesPaired: '2')
        def pairs = []
        mockDomain(Pair, pairs)
        PairController controller = new PairController()
        controller.params.pairProgrammersName = 'aditi'
        controller.params.programmersName = 'saumya'
        controller.params.noOfTimesTheyPaired = "5"

        when:
        controller.save()

        then:
        Pair.count() == 1
    }
}