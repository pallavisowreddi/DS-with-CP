// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Node{
   private int data;
    Node next;
    Node(int a){
        data=a;
        next=null;
        
    }
    public void getdata(){
        System.out.println(data);
    }
    public void getref(){
        System.out.println(next);
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("Anusha");
        Node a =new Node(20);
        
        Node  b=new Node(28);
        a.getdata();
        a.getref();
        
        a.next=b;
        
        a.getref();
        System.out.println(a);
        System.out.println(b);
    }
}
