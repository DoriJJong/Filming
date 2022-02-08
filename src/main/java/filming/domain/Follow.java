package filming.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Follow extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FOLLOW_SEQ")
    private Long seq;

    @ManyToOne
    @JoinColumn(name = "TO_USER_ID")
    private User toUser;

    @ManyToOne
    @JoinColumn(name = "FROM_USER_ID")
    private User fromUser;

}