class Student{
    String name;
    int age;
    int marks;
    Student(){
         name="praveen kumar";
         age=21;
         marks=100;
        
    }
    Student(String a){
         name=a;
         age=21;
         marks=100;
          

    }
    Student(int a){
        name="Azarutheen";
        age=a;
        marks=100;
        


    }
    void display(){
      System.out.println("|Name : "+name+"| Age : "+age+" |Marks :"+marks+"|");
      System.out.println("|----------------------------------------------------------|");

    }
    
    public static void main(String []args){
      Student s1=new Student();
      Student s2=new Student("Yukes kanna");
      Student s3=new Student(100);
      System.out.println("|----------------------------------------------------------|");
       System.out.println("default constructor overloding");
      s1.display();
      System.out.println("Stirng constructor overloding");
      s2.display();
      System.out.println("integer constructor overloding");
      s3.display();


    }
}