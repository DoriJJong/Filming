package filming.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Getter
@NoArgsConstructor
@Entity
@IdClass(UserCamera.class)
public class UserCamera extends BaseTimeEntity implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name = "CAMERA_SEQ")
    private Camera camera;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserCamera that = (UserCamera) o;
        return Objects.equals(user, that.user) && Objects.equals(camera, that.camera);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, camera);
    }

}