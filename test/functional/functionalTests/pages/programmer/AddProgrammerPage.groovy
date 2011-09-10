package functionalTests.pages.programmer

import geb.Page

class AddProgrammerPage extends Page{
    static at = {$("title").text() == "Add a Programmer" }
    static url = "programmer/save"
    static content = {
        programmerId { $("input", id: "programmer-id")}
        programmerName { $("input", id: "programmer-name")}
        save { $("input", id: "save-programmer-info")}
        viewPairingMatrix { $("button", id: "View-Pairing-Matrix")}
    }
}
