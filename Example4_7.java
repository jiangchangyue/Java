class Rectangle{
    double x,y,width,height;
    //Rectangle(){ }
    Rectangle(double x,double y,double width,double height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }

    public void resetX(double a){
        x=a;
    }
    public double getX(){
        return x;
    }
    public void resetY(double b){
        y=b;
    }
    public  double getY(){
        return y;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
}
class Circle{
    double x,y,radius;
    //Circle(){}
    Circle(double x,double y,double radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }


   public void resetX(double a){
        x=a;
    }
    public double getX(){
        return x;
    }
    public void resetY(double b){
        y=b;
    }
    public double getY(){
        return y;
    }
    public double getRadius(){
        return radius;
    }
}
class Geometry{
    Rectangle rect;
    Circle circle;
    Geometry(Rectangle rect, Circle circle){
        this.rect=rect;
        this.circle=circle;
    }
    public void setCirclePosition(double x,double y){
        circle.resetX(x);
        circle.resetY(y);
    }
    public void setRectanglePosition(double x,double y){
        rect.resetX(x);
        rect.resetY(y);
    }
    public void showState(){
        double circleX=circle.getX();
        double rectX=rect.getX();
        if(rectX-rect.getWidth()>=circleX+circle.getRadius())
            System.out.println("������Բ���Ҳ�");
        if(rectX+rect.getWidth()<=circleX-circle.getRadius())
            System.out.println("������Բ�����");
    }
}
public class Example4_7 {
    public static void main(String  args[]){
        Rectangle rect=new Rectangle(30,40,120,80);
        Circle circle=new Circle(260,30,60);
        Geometry geometry;
        geometry=new Geometry(rect,circle);
        System.out.print("����ͼ����Բ�;��ε�λ�ù�ϵ�ǣ�");
        geometry.showState();
        System.out.println("����ͼ�����µ�����Բ�;��ε�λ��.");
        geometry.setRectanglePosition(220,160);
        geometry.setCirclePosition(40,30);
        System.out.print("�����󣬼���ͼ����Բ�;��ε�λ�ù�ϵ��:");
        geometry.showState();
    }
}