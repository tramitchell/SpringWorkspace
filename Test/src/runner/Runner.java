package runner;

import java.util.HashMap;
import java.util.Map;

public class Runner {

	public static void main(String[] args) {
		
		
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		Integer one = new Integer(1);
		
		m.put("a", one);
		m.put("b", one);
		System.out.println( m.get("a") );
		System.out.println( m.get("b") );
		
		
		
	}

}
