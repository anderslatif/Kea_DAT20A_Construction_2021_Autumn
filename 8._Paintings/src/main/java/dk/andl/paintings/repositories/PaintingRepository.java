package dk.andl.paintings.repositories;

import dk.andl.paintings.models.Painting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PaintingRepository extends JpaRepository<Painting, Long> {

    List<Painting> findPaintingsByArtistAndYear(String artistName, int year);

    @Query(value = "SELECT * FROM paintings WHERE price > ?", nativeQuery = true)
    List<Painting> findPaintingsAboveACertainPrice(double price);

}
