import java.io.*;
class Student{
int sno;
String name;
int mark1,mark2,total;
float average;

void input()throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter sno,Name,Mark 1,Mark 2");
sno=Integer.parseInt(br.readLine());
name=br.readLine();
mark1=Integer.parseInt(br.readLine());
mark2=Integer.parseInt(br.readLine());
}

void process(){
total = mark1+mark2;
average = (float)total/2;
}

void output(){
System.out.println(sno+"\n"+name+"\n"+mark1+"\n"+mark2+"\n"+total+"\n"+average);
}
}


class MyStudent{
public static void main(String arg[])throws IOException
{

Student stud1 = new Student();
stud1.input();
stud1.process();
stud1.output();
}
}