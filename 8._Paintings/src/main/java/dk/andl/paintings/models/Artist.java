package dk.andl.paintings.models;

import lombok.Data;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name="artists")
@Entity
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private String primaryStyle;

    @Column(length = 100)
    private String nationality;

    @Column
    private Date birthDate;

    @Enumerated(value = EnumType.STRING)
    @Column
    private Gender gender;

    @ManyToOne
    @JoinColumn(name = "gallery_id")
    @Nullable
    private Gallery gallery;

}
