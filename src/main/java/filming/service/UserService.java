package filming.service;

import filming.domain.User;
import filming.domain.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User create(final User user) {

        if(user == null || user.getEmail() == null){
            throw new RuntimeException("Inalid arguments");
        }

        final String email = user.getEmail();

        if(userRepository.existsByEmail(email)){
            throw new RuntimeException("Email already exists");
        }

        return userRepository.save(user);
    }
}
