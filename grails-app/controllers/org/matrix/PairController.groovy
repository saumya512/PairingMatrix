package org.matrix

class PairController {

    def create = {
        [pairList: Pair.list()]
    }

    def save = {
        if(params.programmersName!="" && params.pairsName!="" && params.noOfTimesTheyPaired!="")
        {
            def newPair = new Pair(programmerName: params.programmersName, pairProgrammerName: params.pairsName, noOfTimesPaired: params.noOfTimesTheyPaired)
            def existingPair = Pair.findByPairProgrammerNameAndProgrammerName(params.pairsName, params.programmersName)
            def sameReversePair = Pair.findByPairProgrammerNameAndProgrammerName(params.programmersName, params.pairsName)
            if(existingPair!=null) {
                existingPair.noOfTimesPaired= newPair.noOfTimesPaired
                existingPair.save()
                redirect(action: 'pairTable')
            }
            else if(sameReversePair!=null) {
                sameReversePair.noOfTimesPaired= newPair.noOfTimesPaired
                sameReversePair.save()
                redirect(action: 'pairTable')
            }
            else{
                newPair.save()
                redirect(action: 'pairTable')
            }
        }
        else
            return
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

    def updateMatrix = {
        updateOrAddPair(params.prog1, params.prog2, params.pair02)
        updateOrAddPair(params.prog1, params.prog3, params.pair01)
        updateOrAddPair(params.prog1, params.prog4, params.pair00)
        updateOrAddPair(params.prog2, params.prog3, params.pair11)
        updateOrAddPair(params.prog2, params.prog4, params.pair10)
        updateOrAddPair(params.prog3, params.prog4, params.pair20)
        redirect(action: 'pairTable')
    }

    private def updateOrAddPair(pair1, pair2, timesPaired)
    {  if(pair1!="enter programmer name" && pair2!="enter programmer name")
        {
            def newPair = new Pair(programmerName: pair1, pairProgrammerName: pair2, noOfTimesPaired: timesPaired)
            def existingPair = Pair.findByPairProgrammerNameAndProgrammerName(pair2, pair1)
            def sameReversePair = Pair.findByPairProgrammerNameAndProgrammerName(pair1, pair2)
            if(existingPair!=null) {
            existingPair.noOfTimesPaired= newPair.noOfTimesPaired
            existingPair.save()
            }
            else if(sameReversePair!=null) {
            sameReversePair.noOfTimesPaired= newPair.noOfTimesPaired
            sameReversePair.save()
            }
            else {
                newPair.save()
            }
        }
    }
}
