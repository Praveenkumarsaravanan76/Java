class Functionoverloading{
    void multiply(int a,int b){
        int c=a*b;
        System.out.println(c);
    }
    void add(int a,int b,int c){
         int d=a+b+c;
         System.out.println(d);
    }
public static void main (String []args){
    Functionoverloading fo=new Functionoverloading();
    fo.multiply(6,5);
    fo.add(1,2,3);


}
}
