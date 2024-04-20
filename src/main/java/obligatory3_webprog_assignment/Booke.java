package obligatory3_webprog_assignment;

public class Booke {
    private Long id;
    private String film;
    private int kvantitet;
    private String fornavn;
    private String etternavn;
    private String telefonnummer;
    private String email;


    public Booke() {
    }

    // Getters og setters for alle feltene

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

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
}
