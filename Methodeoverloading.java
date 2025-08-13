class Methodeeoverloading{
    void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    void add(int a,int b,int c){
         int d=a+b+c;
         System.out.println(d);
    }
public static void main (String []args){
    Methodeeoverloading mo=new Methodeeoverloading();
    mo.add(5,6);
    mo.add(5,6,7);


}
}
