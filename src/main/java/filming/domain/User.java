package filming.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint (
                columnNames = {"email", "uuid"}
        )
    }
)
public class User extends BaseTimeEntity {

    @Id
    @Column(name = "USER_ID")
    @GeneratedValue
    private Long seq;

    @OneToMany(mappedBy = "user")
    private List<UserCamera> userCameras;

    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String uuid;

    private String email;

    private String password;

    private String name;

    private String nickName;

    private String gender;

    private int age;

    private String phoneNumber;

    private String thumbnail;

    private String url;

    @Builder
    public User(Long seq, List<UserCamera> userCameras, String uuid, String email, String password, String name, String nickName, String gender, int age, String phoneNumber, String thumbnail, String url) {
        this.seq = seq;
        this.userCameras = userCameras;
        this.uuid = uuid;
        this.email = email;
        this.password = password;
        this.name = name;
        this.nickName = nickName;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.thumbnail = thumbnail;
        this.url = url;
    }

    public User update(String name) {
        this.name = name;
        return this;
    }

}