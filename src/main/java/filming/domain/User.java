package filming.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Getter
@NoArgsConstructor
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "email")})
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "UUID")
    @Column(name = "USER_ID")
    private UUID id;

    @OneToMany(mappedBy = "user")
    private List<UserCamera> userCameras;

    private String email;

    private String password;

    private String name;

    private String nickName;

    private String gender;

    private int age;

    private String phoneNumber;

    private String thumbnail;

    private int status;

    private String url;

    @Builder
    public User(UUID id, List<UserCamera> userCameras, String email, String password, String name, String nickName, String gender, int age, String phoneNumber, String thumbnail, int status, String url) {
        this.id = id;
        this.userCameras = userCameras;
        this.email = email;
        this.password = password;
        this.name = name;
        this.nickName = nickName;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.thumbnail = thumbnail;
        this.status = status;
        this.url = url;
    }
}