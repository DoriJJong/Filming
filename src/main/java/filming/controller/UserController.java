package filming.controller;

import filming.domain.User;
import filming.dto.ResponseDto;
import filming.dto.UserDto;
import filming.security.TokenProvider;
import filming.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/auth")
public class UserController {

    private final UserService userService;

    private final TokenProvider tokenProvider;

    public UserController(UserService userService, TokenProvider tokenProvider) {
        this.userService = userService;
        this.tokenProvider = tokenProvider;
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@RequestBody UserDto userDto) {

        try {

            User user = User.builder()
                    .uuid(UUID.randomUUID().toString())
                    .email(userDto.getEmail())
                    .nickName(userDto.getNickName())
                    .password(userDto.getPassword())
                    .build();

            User registeredUser = userService.create(user);

            UserDto responseUserDto = UserDto.builder()
                    .uuid(registeredUser.getUuid())
                    .email(registeredUser.getEmail())
                    .nickName(registeredUser.getNickName())
                    .build();

            return ResponseEntity.ok().body(responseUserDto);

        } catch (Exception e) {

            ResponseDto responseDto = ResponseDto.builder()
                    .error(e.getMessage())
                    .build();

            return ResponseEntity.badRequest().body(responseDto);

        }

    }

    @PostMapping("/signin")
    public ResponseEntity<?> authenticate(@RequestBody UserDto userDto) {

        User user = userService.getByCredentials(userDto.getEmail(), userDto.getPassword());

        if(user != null) {

            final String token = tokenProvider.crate(user);
            final UserDto responseUserDto = UserDto.builder()
                    .email(user.getEmail())
                    .uuid(user.getUuid())
                    .token(token)
                    .build();

            return ResponseEntity.ok().body(responseUserDto);

        } else {

            ResponseDto responseDto = ResponseDto.builder()
                    .error("Login Failed.")
                    .build();

            return ResponseEntity.badRequest().body(responseDto);
        }

    }

}
