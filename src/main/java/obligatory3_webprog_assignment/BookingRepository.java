package obligatory3_webprog_assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class BookingRepository {
    @Autowired
    private JdbcTemplate db;

    public void lagreBooking(Booke innBooke){
        String sql="INSERT INTO Booke (film, kvantitet, fornavn, etternavn, telefonnummer, email) VALUES(?,?,?,?,?,?)";
        db.update(sql, innBooke.getFilm(), innBooke.getKvantitet(), innBooke.getFornavn(), innBooke.getEtternavn(),
                innBooke.getTelefonnummer(), innBooke.getEmail());
    }

    public List<Booke> hentAlleBookinger(){
        String sql="SELECT * FROM Booke";
        List <Booke> alleBooker = db.query(sql, new BeanPropertyRowMapper(Booke.class));
        Collections.sort(alleBooker);
        return alleBooker;
    }
    public void slettEnBooking(Long id) {
        String sql = "DELETE FROM Booke WHERE id = ?";
        db.update(sql, id);
    }
    public void slettAlleBookinger(){
        String sql="DELETE FROM Booke";
        db.update(sql);
    }
}
