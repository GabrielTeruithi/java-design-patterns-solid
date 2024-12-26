package singleResponsability;

//Handles incoming JSON requests that work on User resource/entity
public class UserController {
	//Store used by controller
    private final UserPersistenceService persistenceService = new UserPersistenceService();
    private final UserValidator userValidator = new UserValidator();
    private final UserMapper userMapper = new UserMapper();
    
    //Create a new user
    public String createUser(String userJson) {

        User user = userMapper.mapUser(userJson);
        boolean valid = userValidator.validateUser(user);

        if(!valid) {
            return "ERROR";
        }

        persistenceService.saveUser(user);
        
        return "SUCCESS";
    }

}