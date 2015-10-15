package algorithm;

import model.MTList;
import model.NEList;

public class GetLength implements IListAlgo {
	
	public static GetLength Singleton = new GetLength();
	
	private GetLength(){
		
	}
	
	@Override
	public Object emptyCase(MTList host, Object... input) {
		return 0;
	}

	@Override
	public Object nonEmptyCase(NEList host, Object... input) {
		Object restLen = host.getRest().execute(this);
		return 1 + (Integer)restLen;
	}

}
