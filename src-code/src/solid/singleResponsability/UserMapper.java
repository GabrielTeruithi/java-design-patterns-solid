package solid.singleResponsability;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserMapper {

    ObjectMapper mapper = new ObjectMapper();

    public User mapUser(String userJson) {
        User user;
        try {
            user = mapper.readValue(userJson, User.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return user;
    }
}
