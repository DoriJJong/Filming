package filming.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Board extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOARD_SEQ")
    private Long seq;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @Column(length = 200)
    private String title;

    @Column(length = 1000)
    private String content;

}
