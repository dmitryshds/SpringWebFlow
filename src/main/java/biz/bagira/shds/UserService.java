package biz.bagira.shds;

import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Дмитрий on 09.08.2016.
 */
@Component
public class UserService {

private ConcurrentHashMap<String,User> userMap = new ConcurrentHashMap<String, User>();

    public UserService() {
        User user = new User();
        user.setName("user");
        user.setPassword("pass");
        userMap.put(user.getName(),user);
    }

    public String checkUser(User user){

        if (userMap.containsValue(user))
        {
            return "success";
        }
        else return "failed";
    }

public void createUser(User user){

    userMap.put(user.getName(),user);
}
}
