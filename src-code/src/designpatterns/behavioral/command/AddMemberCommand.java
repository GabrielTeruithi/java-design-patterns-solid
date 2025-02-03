package designpatterns.behavioral.command;

//A Concrete implementation of Command.
public class AddMemberCommand implements Command {

    private String emailAddress;
    private String listName;
    private EWSService receiver;

    public AddMemberCommand(String email, String listname, EWSService service) {
        this.emailAddress = email;
        this.listName = listname;
        this.receiver = service;
    }

    

    @Override
    public void execute() {
        receiver.addMember(emailAddress, listName);
    }

}
