package algorithm;

import model.MTList;
import model.NEList;

public class ToString implements IListAlgo {

	public static final ToString Singleton = new ToString();
	
	private ToString(){
		
	}
	
	@Override
	public Object emptyCase(MTList host, Object... input) {
		return "[]";
	}

	@Override
	public Object nonEmptyCase(NEList host, Object... input) {
		Object restString = host.getRest().execute(ToStringHelper.Singleton, new String());
		return "(" + host.getFirst().toString() + restString;
	}

}
