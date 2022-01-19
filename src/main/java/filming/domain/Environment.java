package filming.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Environment extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @Column(length = 10)
    private String f_stop;

    @Column(length = 10)
    private String shutter_speed;

    @Column(length = 10)
    private String meter;

    private int iso;
}
