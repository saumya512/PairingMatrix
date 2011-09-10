package org.matrix


class ProgrammerController {

    def create = {
        [programmerList: Programmer.list()]
    }

    def save = {
        def newProgrammer = new Programmer(params)

        if(newProgrammer.save()) {
            flash.message = "Programmer Added"
            redirect(action: 'view', params: [id: newProgrammer.programmerId])
        }
    }

    def view = {
        def programmerToDisplay = (params.name) ? Programmer.get(params.uniqueId) : Programmer.findByProgrammerId(params.id)
        if (params.name) {
            programmerToDisplay.name = params.name
        }
        [programmerToDisplay: programmerToDisplay]
    }

    def show = {
        render "pairimg matrix"
    }
}


