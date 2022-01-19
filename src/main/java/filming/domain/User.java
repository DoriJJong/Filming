package filming.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class User extends BaseTimeEntity {

    @Id
    @Column(name = "USER_ID")
    private String id;

    @Column(length = 30, nullable = false)
    private String password;

    @Column(length = 100)
    private String email;

    private int birthday;

    @Column(length = 10)
    private String name;

    @Column(length = 200)
    private String represent_photo;

}
