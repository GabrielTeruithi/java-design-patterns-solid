package designpatterns.behavioral.state;

//Context class
public class Order {

	private OrderState currenState;

	public Order(){
		currenState = new New();
	}

	public double cancel() {
		double charges = currenState.handleCancellation();
		currenState = new Cancelled();
		return charges;
	}

	public void paymentSuccessful() {
		currenState = new Paid();
	}

	public void dispatched() {
		currenState = new InTransit();

	}

	public void delivered() {
		currenState = new Delivered();

	}
}
