package obligatory3_webprog_assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookingController {

    @Autowired
    private BookingRepository repo;

    @PostMapping("/lagreBooking")
    public void lagreBooking(Booke innBooke) {
       repo.lagreBooking(innBooke);
    }
    @GetMapping("/hentAlleBookinger")
    public List<Booke> hentAlleBookinger() {
        return repo.hentAlleBookinger();
    }
    @GetMapping("/slettEnBooking")
    public void slettEnBooking(@RequestParam Long id) {
        repo.slettEnBooking(id);
    }
    @GetMapping("/slettAlleBookinger")
    public void slettAlleBookinger() {
        repo.slettAlleBookinger();
    }
}
