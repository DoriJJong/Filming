package filming.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Board extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column(name = "BOARD_SEQ")
    private Long seq;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    private String title;

    private String content;

    private int views;

    private int likes;

    private String showFlag;

}