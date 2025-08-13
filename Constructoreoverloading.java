class Constructoreoverloading{
    Constructoreoverloading(String a){
        System.out.println(a);
    }
    Constructoreoverloading(int a,int b,int c){
         int d=a+b+c;
         System.out.println(d);
    }
public static void main (String []args){
    Constructoreoverloading mo=new Constructoreoverloading("This is the constructer Oveeloading:");
    Constructoreoverloading m =new Constructoreoverloading(5,6,7);


}
}
