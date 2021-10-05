package dk.andl.paintings.repositories;

import dk.andl.paintings.models.Painting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaintingRepository extends JpaRepository<Painting, Long> {
}
