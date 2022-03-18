package filming.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class LoginHistory extends BaseTimeEntity {

    @Id
    @GeneratedValue
    private Long seq;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    private String ip;

    private String userAgent;

    private String route;

    private String result;

}