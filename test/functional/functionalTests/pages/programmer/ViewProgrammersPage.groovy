package functionalTests.pages.programmer

import geb.Page

class ViewProgrammersPage extends Page{
    static at = {$("title").text() == "View Programmers" }
    static url = "programmer/view"
    static content = {
        programmerId { $("input", id: "programmer-id")}
        viewProgrammer{ $("input", id: "view-programmer-info")}
    }
}
