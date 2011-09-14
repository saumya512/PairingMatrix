package org.matrix


class ProgrammerController {

    def create = {
        [programmerList: Programmer.list()]
    }

    def save = {
        def newProgrammer = new Programmer(params)
        def progExists = Programmer.findByProgrammerId(params.programmerId)
        if(progExists == null)
        {
        if(newProgrammer.save()) {
            redirect(action: 'view', params: [id: newProgrammer.programmerId])
        }
        }
        redirect(action: 'view', params: [id: newProgrammer.programmerId])
    }

    def view = {
        [programmerList: Programmer.list()]
    }

    def show = {
          def programmerToDisplay = Programmer.findByProgrammerId(params.programmerId)
          [programmerToDisplay: programmerToDisplay]
    }

}


