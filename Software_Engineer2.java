
public class Software_Engineer2 extends Graduate_Student
{
public static void main(String[] args)
{

Graduate_Student ayyappan = new Software_Engineer2(); 
ayyappan.appear_exams(); 
//ayyappan.go_to_office();
Software_Engineer2 ase = (Software_Engineer2)ayyappan; 
ase.do_projects();
}

public void go_to_office()
{
System.out.println("Going to Office"); 
}

public void do_projects()
{
System.out.println("Involving in Projects"); 
}

}
