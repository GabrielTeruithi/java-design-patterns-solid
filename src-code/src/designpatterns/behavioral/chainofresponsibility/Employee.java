package designpatterns.behavioral.chainofresponsibility;

//Abstract handler
public abstract class Employee implements LeaveApprover {

    private String role;
    private LeaveApprover successor;

    public Employee(String role, LeaveApprover successor) {
        this.role = role;
        this.successor = successor;
    }

    protected abstract boolean proccessRequest(LeaveApplication application);

    @Override
    public void processLeaveApplication(LeaveApplication application) {
        if (!proccessRequest(application) && successor != null) {
            successor.processLeaveApplication(application);
        }

    }

    @Override
    public String getApproverRole() {
        return role;
    }

}