package common.actor;

public class RunnableRunner implements IRunner{

	private Runnable r;
	
	public RunnableRunner(Runnable r){
		this.r = r;
	}
	
	public Object run() {
		// TODO Auto-generated method stub
		if( r != null){
			r.run();
		}
		return null;
	}

}
