class Student{
	int number;
	String name;
	Student(){}
	Student{
		this.number=number;
		this.name=name;
	}
	public int getNumber(){
		return number;
	}
	public String getName(){
		return name;
	}
}
class UniverStudent extends Student{
	boolean isMarriage;
	UniverStudent(int number,String name,boolean b){}
	public boolean getIsMarriage(){
		return isMarriage;
	}
}
public class Example{
	public static void main(String args[]){
		UniverStudent zhang=new UniverStudent(20111,"����",false);
		int number=zhang.getNumber();
		String name=zhang.getName();
		boolean marriage=zhang.getIsMarriage();
		System.out.println(name+"��ѧ���ǣ�"+number);
		if(marriage==true){
			System.out.println(name+"�ѻ�");
		}
		else{
			System.out.println(name+"δ��");
		}
	}
}