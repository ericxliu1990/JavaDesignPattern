package algorithm;

import model.MTList;
import model.NEList;

public interface IListAlgo {
	public Object emptyCase(MTList host, Object... input);
	public Object nonEmptyCase(NEList host, Object... input);
}
