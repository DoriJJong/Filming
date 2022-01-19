package filming.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Photo extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PHOTO_SEQ")
    private Long seq;

    @ManyToOne
    @JoinColumn(name = "BOARD_SEQ")
    private Board board;

}
