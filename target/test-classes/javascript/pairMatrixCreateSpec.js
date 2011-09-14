describe('create-pair-matrix', function() {
   beforeEach(function() {
         var tempHTML =
              '    <g:textField name="programmer1" id="programmer-1"/>'+
                 '<g:textField name="programmer2" id="programmer-2"/>'+
                 '<g:textField name="programmer3" id="programmer-3"/>'+
           '<g:textField name="programmer4" id="programmer-4"/>'+
                 ' <label id="prog1">Programmer1</label>'+
                  '<label id="prog2">Programmer2</label>'+
       '<label id="prog3">Programmer3</label>'+
       '<label id="prog4">Programmer4</label>'+
                  '<input type="submit" id="create-matrix" value="Create Matrix"/>';
       $(tempHTML).appendTo("#fixtures");
       createPairMatrix();
   });

    it('programmer names in the labels of showMatrix Page should be changed to the programmer names entered in createMatrix page', function() {
        $("#programmer-1").val("saumya");
        $("#programmer-2").val("sneha");
        $("#programmer-3").val("sharvani");
        $("#programmer-4").val("pooja");
        $("#create-matrix").click();
        expect($('#prog1').val()).toEqual("saumya");
        expect($('#prog2').val()).toEqual("sneha");
        expect($('#prog3').val()).toEqual("sharvani");
        expect($('#prog4').val()).toEqual("pooja");
    });

    afterEach(function() {
        $('body#fixtures > *').not(".jasmine_reporter").not('script').remove()
    });
});