class Stud{
	String name;
	int roll;
	double marks;
void insert(String n,int r,double m) {
	name=n;
	roll=r;
	marks=m;
}
void display() 
  {System.out.println("Name="+name+" "+"Roll no.="+roll+" "+"Marks="+marks);
  }
}
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stud s1=new Stud();
		Stud s2=new Stud();
		s1.insert("Amit",01, 91);
		s2.insert("Jay", 02, 92.5);
		s1.display();
		s2.display();
	}

}
