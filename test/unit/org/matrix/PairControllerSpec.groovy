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

        def pairs = [new Pair(programmerName: 'saumya', pairProgrammerName: 'aditi', noOfTimesPaired: '2')]
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

    def "should update pair if it already exists when input is from pairing matrix" () {
        setup:
        def pairs = [new Pair(programmerName: 'saumya', pairProgrammerName: 'aditi', noOfTimesPaired: '2')]
        mockDomain(Pair, pairs)
        PairController controller = new PairController()
                controller.params.pairProgrammersName = 'aditi'
        controller.params.programmersName = 'saumya'
        controller.params.noOfTimesTheyPaired = "5"

        when:
        controller.updateMatrix()

        then:
        Pair.count() == 1
    }

    def "should add pair when input is from pairing matrix" () {
        def pairs = []
        mockDomain(Pair, pairs)
        PairController controller = new PairController()
                controller.params.pairProgrammersName = 'aditi'
        controller.params.programmersName = 'saumya'
        controller.params.noOfTimesTheyPaired = "5"

        when:
        controller.updateMatrix()

        then:
        Pair.count() == 1
    }

    def "should update pair if it already exists even in reverse direction when input is from pairing matrix" () {
        setup:
        def pairs = [new Pair(programmerName: 'saumya', pairProgrammerName: 'aditi', noOfTimesPaired: '2')]
        mockDomain(Pair, pairs)
        PairController controller = new PairController()
                controller.params.pairProgrammersName = 'saumya'
        controller.params.programmersName = 'aditi'
        controller.params.noOfTimesTheyPaired = "5"

        when:
        controller.updateMatrix()

        then:
        Pair.count() == 1
    }
}