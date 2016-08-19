package biz.bagira.shds.objects;

import org.springframework.stereotype.Component;
import org.springframework.webflow.execution.RequestContext;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Дмитрий on 09.08.2016.
 */
@Component
public class UserService {

private ConcurrentHashMap<String,User> userMap = new ConcurrentHashMap<String, User>();

    public UserService() {
        User user = new User();
        user.setUsername("user");
        user.setPassword("pass");
        userMap.put(user.getUsername(),user);
    }

    public String checkUser(User user){

        if (userMap.containsValue(user))
        {
            return "success";
        }
        else return "failed";
    }

public boolean createUser(User user, RequestContext context){
   if (!userMap.containsKey(user.getUsername())) {
       userMap.put(user.getUsername(), user);
       context.getFlashScope().put("user",user);


       return true;
   }else return false;
}
}
