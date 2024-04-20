$(function(){
    hentAlleBookinger();
});

function lagreBooking() {
    const bookinger = {
        film: $("#film").val(),
        kvantitet: $("#kvantitet").val(),
        fornavn: $("#fornavn").val(),
        etternavn: $("#etternavn").val(),
        telefonnummer: $("#telefonnummer").val(),
        email: $("#email").val()
    };
    const url = "/lagreBooking";
    $.get(url, bookinger, function (resultat){
     return hentAlleBookinger();
    });
};
function hentAlleBookinger(){
    $.get("/hentAlleBookinger", function(data){
        formaterBookinger(data);
    });
};
function formaterBookinger(bookinger) {
    var ut = "<table class='table table-striped'>" +
        "<tr>" +
        "<th>Film</th><th>Kvantitet</th><th>Fornavn</th><th>Etternavn</th><th>Email</th>" +
        "</tr>";
    for (let i in bookinger) {
        ut += "<tr>" +
            "<td>" + bookinger[i].film + "</td>" +
            "<td>" + bookinger[i].kvantitet + "</td>" +
            "<td>" + bookinger[i].fornavn + "</td>" +
            "<td>" + bookinger[i].etternavn + "</td>" +
            "<td>" + bookinger[i].email + "</td>" +
            "</tr>";
    }
    $("#bookinger").html(ut);
}
function slettAlleBookinger() {
        $.get("/slettAlleBookinger", function(data){
            hentAlleBookinger();
        });
    };


