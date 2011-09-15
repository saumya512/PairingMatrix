var returnToView = function(buttonId) {
    $(buttonId).click(function() {
       $(window.location).attr("href", "/programmer/view");
    });
};
