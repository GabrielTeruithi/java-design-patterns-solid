package designpatterns.behavioral.memento.command;

public interface WorkflowCommand {

    void execute();

    void undo();
}
