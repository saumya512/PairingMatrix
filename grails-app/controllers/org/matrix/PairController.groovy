package org.matrix

class PairController {

    def create = {
        [pairList: Pair.list()]
    }

    def save = {
        def newPair = new Pair(programmerName: params.programmersName, pairProgrammerName: params.pairName, noOfTimesPaired: params.noOfTimesPaired)
        def existingPair = Pair.findByPairProgrammerNameAndProgrammerName(params.pairName, params.programmersName)
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
      render : "show"
    }


}
