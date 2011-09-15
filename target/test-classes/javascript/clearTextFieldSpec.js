describe('clear-text-field', function() {
   beforeEach(function() {
         var tempHTML =
              '    <g:textField name="programmer1" id="programmer-1" value="enter programmer name"/>';
       $(tempHTML).appendTo("#fixtures");
       clearField();
   });

    it('clears the text field when we click on it and its value at that time is "enter programmer name"', function() {
        $("#programmer-1").onclick();
        expect($('#programmer-1').val()).toEqual("");
    });

    afterEach(function() {
        $('body#fixtures > *').not(".jasmine_reporter").not('script').remove()
    });
});
