package designpatterns.behavioral.interpreter;

//Abstract expression
public interface PermissionExpression {

	boolean interpret(User user); 
}
