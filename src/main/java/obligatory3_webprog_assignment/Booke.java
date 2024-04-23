package obligatory3_webprog_assignment;

    public class Booke implements Comparable<Booke> {


    private int id;
    private String film;
    private int kvantitet;
    private String fornavn;
    private String etternavn;
    private String telefonnummer;
    private String email;


    public Booke(int id, String film, int kvantitet, String fornavn, String etternavn, String telefonnummer, String email) {
        this.id=id;
        this.film=film;
        this.kvantitet=kvantitet;
        this.fornavn=fornavn;
        this.etternavn=etternavn;
        this.telefonnummer=telefonnummer;
        this.email=email;
    }
    public Booke(){

    }

    // Getters og setters for alle feltene


    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilm() {

        return film;
    }

    public void setFilm(String film) {

        this.film = film;
    }

    public int getKvantitet() {

        return kvantitet;
    }

    public void setKvantitet(int kvantitet) {

        this.kvantitet = kvantitet;
    }

    public String getFornavn() {

    return fornavn;
    }

    public void setFornavn(String fornavn) {

        this.fornavn = fornavn;
    }

    public String getEtternavn() {

        return etternavn;
    }

    public void setEtternavn(String etternavn) {

        this.etternavn = etternavn;
    }

    public String getTelefonnummer() {

        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {

        this.telefonnummer = telefonnummer;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }
    public int compareTo(Booke b){

        return this.etternavn.compareTo(b.etternavn);
    }
}
