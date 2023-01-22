

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CombinationOfCards
{
	
public static char[] act1(char[] st, int n){
    char str[] = new char[n];
    System.arraycopy( st, 0, str, 0, st.length );
    for (int i=0; i<n; i++){
    	str[i] = str[i] == '1'? '0':'1';          
    }
  	return str;
  }
  
  public static char[] act2(char[] st, int n){
    char str[] = new char[n];
    System.arraycopy( st, 0, str, 0, st.length );
    for (int i=0; i<n; i=i+2){
    	str[i] = str[i] == '1'? '0':'1';          
    }
    return str;
  }
  public static char[] act3(char[] st, int n){
    char str[] = new char[n];
    System.arraycopy( st, 0, str, 0, st.length );
    for (int i=1; i<n; i=i+2){
    	str[i] = str[i] == '1'? '0':'1';          
    }
    return str;
  }
  public static char[] act4(char[] st, int n){
    char str[] = new char[n];
    System.arraycopy( st, 0, str, 0, st.length );
    for (int i=0; i<n; i=i+3){
    	str[i] = str[i] == '1'? '0':'1';          
    }
    return str;
  }
  public static String combinationOfCards(int input1,int input2,String input3,String input4)
  {
	//Write code here
	String s = new String("");
	char str[] = new char[input1];
    for (int i =0; i<input1; i++)
      str[i] = '1'; 
    int f1 = 1, f2 = 1, f3 = 1, f4 = 1 , f5 = 0, f6 =0, f7 = 0, f0 = 1;
    char[] act5 = new char[input1]; char[] act6 = new char[input1]; char[] act7 = new char[input1];
  	char[] act1 = act1(str, str.length);
    char[] act2 = act2(str, str.length); 
    char[] act3 = act3(str, str.length);
    char[] act4 = act4(str, str.length);
    if (input2>1){
    	act5 = act4(act1, act1.length);
    	act6 = act4(act2, act2.length);
    	act7 = act4(act3, act3.length);
    	f5 = 1; f6=1; f7=1;
    }
    if (input2<=1)
        f0 = 0;
    if (!input3.equals("-1"))
    {
        String[] inp3 = input3.split(",");
        int a3 = 0;	
		for (int j = 0; j<inp3.length; j++){
		//	if (inp3[j] != ','){
				a3 =Integer.parseInt(inp3[j]);
				a3 = a3 - 1;
				if (a3>=0){
				if (act1[a3] != '1')
					f1 = 0;
				if (act2[a3] != '1')
					f2 = 0;
				if (act3[a3] != '1')
					f3 = 0;
				if (act4[a3] != '1')
					f4 = 0;
				if (act5[a3] != '1')
					f5 = 0;
				if (act6[a3] != '1')
					f6 = 0;
				if (act7[a3] != '1')
					f7 = 0;
				if (str[a3] != '1')
					f0 = 0;
			}
		}	
    }
    if (!input4.equals("-1"))
    {
	   String[] inp4 = input4.split(",");
       int a4 = 0;	
       
	   for (int k = 0; k<inp4.length; k++){
			//if (inp4[k] != ','){
        		a4 =Integer.parseInt(inp4[k]);
        		a4 = a4-1;
        		if (a4>=0){
				if (act1[a4] != '0')
					f1 = 0;
				if (act2[a4] != '0')
					f2 = 0;
				if (act3[a4] != '0')
					f3 = 0;
				if (act4[a4] != '0')
					f4 = 0;
				if (act5[a4] != '0')
					f5 = 0;
				if (act6[a4] != '0')
					f6 = 0;
				if (act7[a4] != '0')
					f7 = 0;
				if (str[a4] != '0')
					f0 = 0;
			}
    	}
    }
    
//    if (input3.equals("-1") && input4.equals("-1")){
  //  s = new String(act1) + "#" + new String(act7) + "#" + new String(act2) + "#" + new String(act4) + "#" + new String(act5) + "#" + new String(act3) + "#" + new String(act6);
   // }
    //else{
    	if (f1 == 1){
			if(s != null && !s.isEmpty()) 
				s = s + "#" + new String(act1);
			else
 				s = ""+ new String(act1); 
		}
		if (f7 == 1){
			if(s != null && !s.isEmpty()) 
				s = s + "#" + new String(act7);
			else
 				s = ""+new String(act7); 
		}
		if (f2 == 1){
			if(s != null && !s.isEmpty()) 
				s = s + "#" + new String(act2);
			else
 				s = ""+new String(act2); 
		}
		if (f4 == 1){
			if(s != null && !s.isEmpty()) 
				s = s + "#" + new String(act4);
			else
 				s = ""+new String(act4); 
		}
		if (f5 == 1){
			if(s != null && !s.isEmpty()) 
				s = s + "#" + new String(act5);
			else
 				s = ""+new String(act5); 
		}
		if (f3 == 1){
			if(s != null && !s.isEmpty()) 
				s = s + "#" + new String(act3);
			else
 				s = ""+new String(act3); 
		}
        if (f6 == 1){
				if(s != null && !s.isEmpty()) 
					s = s + "#" + new String(act6);
				else
					s = ""+new String(act6); 
			}
        if (f0 == 1){
				if(s != null && !s.isEmpty()) 
					s = s + "#" + new String(str);
				else
					s = ""+new String(str); 
			}
  //  }
    
    return s;
    
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(combinationOfCards(40,3,"16","2,25"));
		System.out.println(combinationOfCards(10,1,"-1","7"));
	}
}