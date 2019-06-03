/*
为课本例4.7的类 Circle，Rectangle，Geometry设计构造函数，以便通过各种方式建立对象。
*/

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
            System.out.println("矩形在圆的右侧");
        if(rectX+rect.getWidth()<=circleX-circle.getRadius())
            System.out.println("矩形在圆的左侧");
    }
}
public class Example4_7 {
    public static void main(String  args[]){
        Rectangle rect=new Rectangle(30,40,120,80);
        Circle circle=new Circle(260,30,60);
        Geometry geometry;
        geometry=new Geometry(rect,circle);
        System.out.print("几何图形中圆和矩形的位置关系是：");
        geometry.showState();
        System.out.println("几何图形重新调整了圆和矩形的位置.");
        geometry.setRectanglePosition(220,160);
        geometry.setCirclePosition(40,30);
        System.out.print("调整后，几何图形中圆和矩形的位置关系是:");
        geometry.showState();
    }
}
