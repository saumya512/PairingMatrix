package functionalTests.pair

import geb.Page

class IncompleteDetailsPage extends Page{
    static at = {$("title").text() == "Sorry incomplete Details" }
    static url = "pair/save/"
    static content = {
        back { $("input", id: "back")}
    }
}
