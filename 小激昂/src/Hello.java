public class Hello {
    public int a;
    public Hello(){
        this.a = 0;
    }
    public Hello(int a){
        this.a = a;
    }
    public int get(){
        return a;
    }

    public static void main(String args[]){
        System.out.println("Hello");
    }
}