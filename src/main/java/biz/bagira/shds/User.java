package biz.bagira.shds;

import javax.validation.constraints.Size;
import java.io.Serializable;



/**
 * Created by Дмитрий on 09.08.2016.
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(min = 6 , message = "{name.size.error}")
    private String username;
    @Size(min = 5, max = 10, message = "{password.size.error}")
    private String password;

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!username.equals(user.username)) return false;
        return password.equals(user.password);

    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
