package service;



import com.example.d1.domain.User;

import java.util.List;

public interface UserService {

    List<User> list();
    User add(User user);
}
