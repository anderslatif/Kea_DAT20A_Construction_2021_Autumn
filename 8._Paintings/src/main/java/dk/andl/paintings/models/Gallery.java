package dk.andl.paintings.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Table(name = "galleries")
@Entity
public class Gallery {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column
    private String owner;

    @Column
    private String name;

    @Column
    private String location;

    @Column
    private int squareFeet;

    @OneToMany(mappedBy = "gallery", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Artist> artists;

}
