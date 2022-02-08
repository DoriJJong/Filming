package filming.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Rating {

    @Id
    @Column(name = "RATING_ID")
    private String name;

    private int point;

}