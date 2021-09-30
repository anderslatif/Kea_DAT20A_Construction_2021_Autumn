package dk.andl.paintings.repositories;

import dk.andl.paintings.models.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
}
