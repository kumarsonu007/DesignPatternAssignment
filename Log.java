package Logger;
	
class Logger 
{ 
    private volatile static Logger obj; 
  
    private Logger() {} 
  
    public static Logger getInstance() 
    { 
        if (obj == null) 
        { 
            // To make thread safe 
            synchronized (Logger.class) 
            { 
                // check again as multiple threads 
                // can reach above step 
                if (obj==null) 
                    obj = new Logger(); 
            } 
        } 
        return obj; 
    } 
    
    public void log(String msg) {
    	System.out.println(msg);
    }
    
} 

public class Log{
	
	public static void main(String args[])
	{
		Logger l = Logger.getInstance();
		l.log("logs captured");
	}
}