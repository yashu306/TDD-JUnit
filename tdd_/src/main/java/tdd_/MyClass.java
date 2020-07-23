package tdd_;

import tdd_.inp;

public class MyClass implements inp{
	public String compute(String str)
	{
		
		
        StringBuffer s = new StringBuffer(str);
        if(str.charAt(0)=='A')
        {
            if(str.charAt(1)=='A')
            {
                s.delete(0,2);
            }
            else{
                s.delete(0,1);
            }
        }
        else if(str.charAt(1)=='A')
        {
            s.delete(1,2);
        }
        return s.toString();
   
	}

}
