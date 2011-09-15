package functionalTests.pages.programmer

import geb.Page

class ViewProgrammerInfoPage extends Page{
    static at = {$("title").text() == "View Programmer Details" }
    static url = "programmer/show/"
    static content = {
        progId { $("label", id: "prog-id")}
        progName { $("label", id: "prog-name")}
        programmersName { $("input", id: "programmer-name")}
        pairsName { $("input", id: "pair-name")}
        timesPaired { $("input", id: "times-paired")}
        addPair { $("input", id: "save")}
    }
}
