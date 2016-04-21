package slp.core.modeling;

import java.util.List;

import slp.core.counting.Counter;
import slp.core.counting.Vocabulary;

public class KNModel implements Model {

	private final Counter counter;

	public KNModel(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public double modelSequence(List<Integer> indices) {
		int[][] counts = this.counter.getFullCounts(indices);
		double probability = 0.0;
		double mass = 1.0;
		// say [a, b, c, d], i ranges from 3 to 0 incl. 
		for (int i = counts[0].length - 1; i >= 0; i--) {
			
		}
		probability += mass / Vocabulary.size;
		return probability;

	}

}
