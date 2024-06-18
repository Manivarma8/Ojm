package tamilnadu;      // IS A
public class MobilePhone extends Telephone
{

public static void main(String[] args)
{
MobilePhone nokia = new MobilePhone();
nokia.dial(); 
nokia.redial();
nokia.messaging(); 

}
public void call_from_anywhere()
{
System.out.println("Handy phones");
}
public void messaging()
{
System.out.println("Send Messages");
}
}
