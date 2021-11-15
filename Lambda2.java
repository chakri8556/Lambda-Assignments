package lambda;

public class Orders {
		double price;

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public Orders(double price) {
			super();
			this.price = price;
		}

		@Override
		public String toString() {
			return "Orders [price=" + price + "]";
		}
		
		
		
}
package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question2 {
	
	public static void main(String[] args) {
		List<Orders> l = Arrays.asList(new Orders(5000),
				new Orders(15000),
				new Orders(25000));
				
		/*List<Orders> l = new ArrayList<>();
		l.add(new Orders(5000));
		l.add(new Orders(15000));
		l.add(new Orders(25000));*/
		l.stream().filter(o->o.getPrice()>10000).forEach(o->System.out.println("Orders is Placed"+o));
		
	}

}