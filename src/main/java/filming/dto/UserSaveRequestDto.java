package filming.dto;

import filming.domain.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@NoArgsConstructor
public class UserSaveRequestDto {

    private String token;
    private String email;
    private String nickName;
    private UUID id;

    @Builder
    public UserSaveRequestDto(String token, String email, String nickName, UUID id) {
        this.token = token;
        this.email = email;
        this.nickName = nickName;
        this.id = id;
    }

}
