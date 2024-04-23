$(function(){
    hentAlleBookinger();
});
let tRegex = /^\d{8}$/; //tlf-nummeret må inkl. 8 sifre
let eRegex = /^[\w-.]+@([\w-]+\.)+[\w-]{2,4}$/;
function lagreBooking() {
    const bookinger = {
        film: $('input[name=film]:checked').val(),
        kvantitet: $('#kvantitet').val(),
        fornavn: $('#fornavn').val(),
        etternavn: $('#etternavn').val(),
        telefonnummer: $('#telefonnummer').val(),
        email: $('#email').val()
    };
    //validering og meldinger for validering
    if (!tRegex.test(bookinger.telefonnummer)) {
        alert("Ugyldig tlf-nummer, prøv igjen :)");
        return;
    }

    if (!eRegex.test(bookinger.email)){
        alert("Ugyldig email, prøv igjen :)");
        return;
    }
    const url = "/lagreBooking";
    $.post(url, bookinger, function (data) {
       console.log(data);
    });
}
function hentAlleBookinger(){
    $.get("/hentAlleBookinger", function(data){
        formaterBookinger(data);
    });
}
function formaterBookinger(bookinger) {
    let ut = "<table class='table table-striped'>" +
        "<tr>" +
        "<th>Film</th><th>Kvantitet</th><th>Fornavn</th><th>Etternavn</th><th>Telefonnummer</th><th>Email</th><th>Slett</th>"+
        "</tr>";
    for (const booking of bookinger) {
        ut += "<tr>" +
            "<td>" + booking.film + "</td>" +
            "<td>" + booking.kvantitet + "</td>" +
            "<td>" + booking.fornavn + "</td>" +
            "<td>" + booking.etternavn + "</td>" +
            "<td>"+ booking.telefonnummer+"</td>"+
            "<td>" + booking.email + "</td>" +
            "<td> <button class='btn btn-danger' onclick='slettEnBooking("+booking.id+")'>Slett</button></td>"+
            "</tr>";
    }
    ut+="</table>";
    $("#bookinger").html(ut);
}

function slettEnBooking(id) {
    const url = "/slettEnBooking?id="+id;
    $.get( url, function() {
        hentAlleBookinger();
    });
}

function slettAlleBookinger() {
        $.get("/slettAlleBookinger", function(){
            hentAlleBookinger();
        });
    }


