package tamilnadu;

public class Father{

int balance = 10000;
public static void main(String[] args){
 Father dad = new Father();
System.out.println(dad.balance);
dad.spend();
}
void spend(){
System.out.println("Spending " + balance);
}
}

