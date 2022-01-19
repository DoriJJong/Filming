package filming.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class LoginHistory extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @Column(length = 15)
    private String ip;

    @Column(length = 1)
    private String type;

    @Column(length = 3)
    private String route;

    @Column(length = 1)
    private String result;

}
