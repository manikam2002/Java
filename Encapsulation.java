package Java_trin;

public class Encapsulation {
	String clas;
	String name;
	int age;
public void smvec(String clas,int age,String name)	{
	this.clas=clas;
	this.age=age;
	this.name=name;
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation ob=new Encapsulation();
		ob.smvec("mca", 23, "Manikvel");
		
	    

	}

}
