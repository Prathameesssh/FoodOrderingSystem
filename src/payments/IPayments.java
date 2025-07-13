package payments;

import java.util.Map;

import Customer.CustomerInformation;
import FoodItems.FoodItem;

public interface IPayments {

	void payment(double amount, CustomerInformation customer, Map<FoodItem, Integer> cartItems,String deliveryAgent, double discountedValue);
}
