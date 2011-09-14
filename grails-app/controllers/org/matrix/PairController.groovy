package org.matrix

class PairController {

    def create = {
        [pairList: Pair.list()]
    }

    def save = {
        def newPair = new Pair(programmerName: params.programmersName, pairProgrammerName: params.pairName, noOfTimesPaired: params.noOfTimesPaired)
        if(newPair.save()) {
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
