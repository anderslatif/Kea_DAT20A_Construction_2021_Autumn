package dk.andl.paintings.repositories;

import dk.andl.paintings.models.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
