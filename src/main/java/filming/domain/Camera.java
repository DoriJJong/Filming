package filming.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Camera extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column(name = "CAMERA_SEQ")
    private Long seq;

    private String name;

}