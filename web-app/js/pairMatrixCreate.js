var prog1;
    var prog2;
    var prog3;
    var prog4;

var createPairMatrix = function() {

    $("#create-matrix").click(function() {
       prog1 = $("#programmer-1").val();

        prog2 = $("#programmer-2").val();
        prog3 = $("#programmer-3").val();
        prog4 = $("#programmer-4").val();
        $("#prog1").val(prog1);
        $("#prog2").val(prog2);
        $("#prog3").val(prog3);
        $("#prog4").val(prog4);
       // alert("pairing matrix created!!");
       // window.location.replace("http://localhost:8080/PairingMatrix/pair/showMatrix");
    });
};
