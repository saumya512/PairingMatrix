describe('pair-matrix', function() {
   beforeEach(function() {
         var tempHTML =
             '<input type="button" id="pair00" value="0">';
       $(tempHTML).appendTo("#fixtures");
       pairMatrix("#pair00");
   });

    it('increments the value of the button when its clicked', function() {
        $("#pair00").click();
        expect($('#pair00').val()).toEqual("1");
    });

    afterEach(function() {
        $('body#fixtures > *').not(".jasmine_reporter").not('script').remove()
    });
});