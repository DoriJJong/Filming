package filming.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class PhotoLike extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PHOTOLIKE_SEQ")
    private Long seq;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

}
