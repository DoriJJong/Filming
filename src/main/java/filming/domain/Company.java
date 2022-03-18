package filming.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Company extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column(name = "COMPANY_SEQ")
    private Long seq;

    @ManyToOne
    @JoinColumn(name = "CAMERA_SEQ")
    private Camera camera;

    private String name;

}