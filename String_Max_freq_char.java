import java.util.*;
class Pair
{
    public char value1;
    public int value2;
    public Pair(char a, int b)
    {
        value1=a;
        value2=b;
        
    }
    
}
public class String_Max_freq_char {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		Pair p=new Pair('a',0);
		int freq[]=new int[26];
		for(int i=0;i<st.length();i++){
			freq[st.charAt(i)-'a']++;
		}
		for(int i=0;i<26;i++){
			int val=i+97;
			char ch=(char)val;
			if(freq[i]>p.value2){
				p.value1=ch;
				p.value2=freq[i];
			}
		}
		System.out.print(p.value1);

    }
}
