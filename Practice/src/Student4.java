class Student4{  
    int id;  
    String name; 
    double attendance;
    //creating a parameterized constructor  
    Student4(int i,String n,double att){  
    id = i;  
    name = n; 
    attendance=att;
    }
    
    Student4(int i,String n){  
        id = i;  
        name = n;
    }  
    //method to display the values  
    void display(){System.out.println(id+" "+name+" "+attendance);}  
   
    public static void main(String args[]){  
    //creating objects and passing values  
    Student4 s1 = new Student4(111,"Karan");  
    Student4 s2 = new Student4(222,"Aryan",83.8);  
    //calling method to display the values of object  
    s1.display();  
    s2.display();  
   }  
}  
