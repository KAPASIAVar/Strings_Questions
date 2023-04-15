import java.util.*;
public class String_oddeven_character {
    public static void main(String args[]) {
        // Your Code Here
	Scanner sc=new Scanner(System.in);
	String st=sc.next();
	StringBuilder sb=new StringBuilder(st);
	for(int i=0;i<st.length();i++){
		char c=st.charAt(i);
		int x=(int)c;
		if(i%2==0){
			x++;
		}
		else x--;
		char ch=(char)x;
		sb.setCharAt(i,ch);
	}
	System.out.print(sb.toString());
    }
}
