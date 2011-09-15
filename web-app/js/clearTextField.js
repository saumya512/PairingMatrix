var clearField = function(textFieldId) {
       $(textFieldId).onclick(function() {
           if($(textFieldId).val()=="enter programmer name")
           {
               $(textFieldId).val("");
           }
    });
};