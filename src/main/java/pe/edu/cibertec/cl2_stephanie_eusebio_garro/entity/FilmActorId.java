package pe.edu.cibertec.cl2_stephanie_eusebio_garro.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class FilmActorId implements Serializable {
    private Integer actorId;
    private Integer filmId;
}
