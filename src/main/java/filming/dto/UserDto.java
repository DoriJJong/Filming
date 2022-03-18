package filming.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserDto {

    private String token;
    private String email;
    private String nickName;
    private String password;
    private String uuid;

    @Builder
    public UserDto(String token, String email, String nickName, String password, String uuid) {
        this.token = token;
        this.email = email;
        this.nickName = nickName;
        this.password = password;
        this.uuid = uuid;
    }
}
