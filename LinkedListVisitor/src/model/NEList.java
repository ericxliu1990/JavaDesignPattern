package model;

import algorithm.IListAlgo;
import algorithm.ToString;

public class NEList implements IList {
	private Object first;
	private IList rest;
	
	public NEList(Object first, IList rest){
		this.first = first;
		this.rest = rest;
	}
	
	public final Object getFirst(){
		return first; 
	}
	
	public final IList getRest(){
		return rest;
	}
	
	@Override
	public Object execute(IListAlgo algo, Object... input) {
		return algo.nonEmptyCase(this, input);
	}

	@Override
	public IList push(Object input) {
		return new NEList(input, this);
	}
	@Override
	public String toString(){
		return (String)execute(ToString.Singleton);
	}

}
