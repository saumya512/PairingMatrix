package functionalTests.pages.programmer

import geb.Page

class ViewProgrammerInfoPage extends Page{
    static at = {$("title").text() == "View Programmer Details" }
    static url = "programmer/show/"
    static content = {
        progId { $("label", id: "prog-id")}
        progName { $("label", id: "prog-name")}
        addPair { $("button", id: "save")}
    }
}
