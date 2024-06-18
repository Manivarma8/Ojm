class Magan extends Appa
{

public static void main(String[] args)
{
Magan mm = new Magan(); 
//mm.work(); 
//mm.watching_tv();
//Appa appa = new Appa(); 
//appa.chat_with_friends();
//appa.watching_tv(); 
Appa appa = new Magan(); 
appa.watching_tv();
appa.chat_with_friends(); 
//appa.work();      
}

public void work()
{
System.out.println("Java Projects");
}

public void watching_tv()
{
System.out.println("Watching Smart TV"); 
}

}
