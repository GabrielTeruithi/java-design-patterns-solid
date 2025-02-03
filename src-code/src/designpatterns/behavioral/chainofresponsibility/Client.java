package designpatterns.behavioral.chainofresponsibility;

import java.time.LocalDate;

import designpatterns.behavioral.chainofresponsibility.LeaveApplication.Type;

public class Client {

	public static void main(String[] args) {
		LeaveApplication application = LeaveApplication.getBuilder().withType(Type.Sick).from(LocalDate.now())
				.to(LocalDate.of(2020, 2, 28)).build();

		
		System.out.println(application);
		LeaveApprover approver = createChain();
		approver.processLeaveApplication(application);
		System.out.println(application);

	}

	private static LeaveApprover createChain() {
		Director director = new Director(null);
		Manager manager = new Manager(director);
		ProjectLead projectLead = new ProjectLead(manager);
		return projectLead;

	}

}
