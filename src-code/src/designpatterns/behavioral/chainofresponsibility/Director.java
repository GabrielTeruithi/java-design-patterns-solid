package designpatterns.behavioral.chainofresponsibility;

import designpatterns.behavioral.chainofresponsibility.LeaveApplication.Type;

public class Director extends Employee {

	public Director(LeaveApprover nextApprover) {
		super("Director", nextApprover);
	}
	
	@Override
	protected boolean proccessRequest(LeaveApplication application) {
		if(application.getType() == Type.PTO) {
			application.approve(getApproverRole());
			return true;
		}
		return false;
	}
	
}