package org.matrix

class PairController {

    def create = {
        [pairList: Pair.list()]
    }

    def save = {
        def newPair = new Pair(programmerName: params.programmersName, pairProgrammerName: params.pairsName, noOfTimesPaired: params.noOfTimesTheyPaired)
        def existingPair = Pair.findByPairProgrammerNameAndProgrammerName(params.pairsName, params.programmersName)
        if(existingPair!=null) {
            existingPair.noOfTimesPaired= newPair.noOfTimesPaired
            existingPair.save()
            redirect(action: 'pairTable')
        }
        else if(newPair.save()) {
            redirect(action: 'pairTable')
        }
    }

    def pairTable = {
        [pairList: Pair.list()]
    }

    def createMatrix = {
        render : "matrix"
    }

    def showMatrix = {
      def newPair = new Pair(programmerName: params.programmersName, pairProgrammerName: params.pairsName, noOfTimesPaired: params.noOfTimesTheyPaired)
        def existingPair = Pair.findByPairProgrammerNameAndProgrammerName(params.pairsName, params.programmersName)
        if(existingPair!=null) {
            existingPair.noOfTimesPaired= newPair.noOfTimesPaired
            existingPair.save()
        }
        else if(newPair.save()) {
        }
    }


}
