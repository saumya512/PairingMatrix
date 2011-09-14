var pairMatrix = function(buttonId) {
    $(buttonId).click(function() {
        var buttonInteger = parseInt($(this).attr("value"));
        buttonInteger=buttonInteger+1;
        var buttonValue = buttonInteger.toString();
        $(buttonId).attr('value',buttonValue);
    });
};