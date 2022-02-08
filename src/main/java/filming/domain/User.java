package filming.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
public class User extends BaseTimeEntity {

    @Id
    @Column(name = "USER_ID")
    private String id;

    @OneToMany(mappedBy = "user")
    private List<UserCamera> userCameras;

    private String password;

    private String name;

    private String nickName;

    private String gender;

    private int age;

    private String phoneNumber;

    private String thumbnail;

    private int status;

    private String url;

}