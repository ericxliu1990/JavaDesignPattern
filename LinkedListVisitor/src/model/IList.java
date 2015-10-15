package model;

import algorithm.IListAlgo;

public interface IList {
	public Object execute(IListAlgo algo, Object... input);
	public IList push(Object input);
}
