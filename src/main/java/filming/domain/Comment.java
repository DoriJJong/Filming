package filming.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Comment extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column(name = "COMMENT_SEQ")
    private Long seq;

    @ManyToOne
    @JoinColumn(name = "BOARD_SEQ")
    private Board board;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    private String content;

}