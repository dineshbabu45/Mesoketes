import java.util.*;
public class Mesoketes {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String a="";
a=in.nextLine();
int ms=0,mn=0,mw=0,me=0,count=0;
String[] m=a.replaceAll(" ","").split(";");
for(int i=0;i<m.length;i++) {
System.out.println(m[i]);
}
if(m[0].contains("1$")) {
for(int i=0;i<m.length;i++)
{
char[] ch=m[i].toCharArray();

for(int j=0;j<ch.length;j++) {
if(ch[j]=='X'&&ch[j-2]=='S'&&ch[j+2]>ms) {
	count++;
	ms=ch[j+2];
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

System.out.println(count);
}


}
}