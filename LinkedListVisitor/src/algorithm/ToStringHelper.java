package algorithm;

import model.MTList;
import model.NEList;

public class ToStringHelper implements IListAlgo {

	public static final ToStringHelper Singleton = new ToStringHelper();
	
	private ToStringHelper(){
		
	}
	
	@Override
	public Object emptyCase(MTList host, Object... acc) {
		return acc[0] + ")";
	}

	@Override
	public Object nonEmptyCase(NEList host, Object... acc) {
		return host.getRest().execute(this, acc[0] + ", " + host.getFirst());
	}

}
