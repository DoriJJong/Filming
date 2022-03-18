package filming.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class PointHistory extends BaseTimeEntity {

    @Id
    @GeneratedValue
    private Long seq;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    private int accumulatePoint;

    private int extractPoint;

    private String extractContent;

}