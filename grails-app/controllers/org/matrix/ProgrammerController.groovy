package org.matrix

import grails.converters.deep.JSON

class ProgrammerController {

    def create = {
        [programmerList: Programmer.list()]
    }

    def save = {
        def newProgrammer = new Programmer(params)

        if(newProgrammer.save()) {
            flash.message = "Programmer Added"
            redirect(action: 'show', params: [id: newProgrammer.programmerId])
        }
    }

    def show = {
        def programmerToDisplay = (params.name) ? Programmer.get(params.uniqueId) : Programmer.findByProgrammerId(params.id)
        if (params.name) {
            programmerToDisplay.name = params.name
        }
        [programmerToDisplay: programmerToDisplay]
    }

//    def delete = {
//        def deleteProgrammer = Programmer.findByProgrammerId(params.id);
//        if (deleteProgrammer != null) {
//            deleteProgrammer.delete();
//            flash.message = "Programmer deleted."
//        }
//        else
//            flash.warning = "Programmer not found."
//        redirect(action: 'search')
//    }
}


