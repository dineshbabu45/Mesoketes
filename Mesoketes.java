import java.util.*;
public class Mesoketes {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String input=""; 
	input=in.nextLine(); //get a string input
	int ms=0,mn=0,mw=0,me=0,count=0; //initial maximum value in each direction(max) 
	String[] m=input.replaceAll(" ","").split(";"); //splitting each day and removing spaces
	for(int i=0;i<m.length;i++) {
	System.out.println(m[i]); //checking whether it is correctly splitted
	}
		if(m[0].contains("1$")) { //whether the input starts from day1
			for(int i=0;i<m.length;i++)
				{
				char[] ch=m[i].toCharArray();
				for(int j=0;j<ch.length;j++) {
					if(ch[j]=='X'&&ch[j-2]=='S'&&ch[j+2]>ms) { //count if condition satisfies
						count++;
						ms=ch[j+2];//changing max value
					}	
					if(ch[j]=='X'&&ch[j-2]=='E'&&ch[j+2]>me) {
					count++;
					me=ch[j+2];
					}	
					if(ch[j]=='X'&&ch[j-2]=='N'&&ch[j+2]>mn) {
					count++;
					mn=ch[j+2];
					}	
					if(ch[j]=='X'&&ch[j-2]=='W'&&ch[j+2]>mw) {
					count++;
					mw=ch[j+2];
					}	
				}
		}
	System.out.println("No of times attacked:"+count);
		}
	else
		System.out.println("enter from day1"); 
	}
}
