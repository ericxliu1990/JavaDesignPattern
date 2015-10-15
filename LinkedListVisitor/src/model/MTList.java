package model;

import algorithm.IListAlgo;
import algorithm.ToString;

public class MTList implements IList {
	
	public static final MTList Singleton = new MTList();

	private MTList(){
		
	}
	@Override
	public Object execute(IListAlgo algo, Object... input) {
		return algo.emptyCase(this, input);
	}
	@Override
	public IList push(Object input) {
		return new NEList(input, Singleton);
	}
	@Override
	public String toString(){
		return (String) execute(ToString.Singleton);
	}
}
