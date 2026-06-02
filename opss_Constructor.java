package Java_trin;

public class opss_Constructor {
	
	String name;
	int age;
	opss_Constructor(){
		name="default";
		age=34;
		
	}
	opss_Constructor(String name,int age){
		this.name=name;
		this.age=age;
	}
	opss_Constructor(String name){
		
		this.name=name;
		age=23;
	}
	public void display() {
		System.out.println("name  : "+name+"age : "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		opss_Constructor c=new opss_Constructor() ; 	
		c.age=22;
		c.name="manika";
		
		
		
		
		
		
		
		
		
                                          
		

	}

}
