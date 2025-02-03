package designpatterns.behavioral.chainofresponsibility;

//A concrete handler
public class ProjectLead  extends Employee {

    public ProjectLead(LeaveApprover successor) {
            super("Project Leader", successor);
            //TODO Auto-generated constructor stub
        }
    
        
    @Override
    protected boolean proccessRequest(LeaveApplication application) {
        if(application.getType() == LeaveApplication.Type.Sick) {
            if(application.getNoOfDays() < 2) {
                application.approve(getApproverRole());
                return true;
            }
        }
        return false;
    }

}
