public class Main{
 static void myTriangle(int a, int b, int c) { 
    if(a==b && b==c) {
        System.out.println("the triangle is equilateral");
        }
         else if(a==b || b==c ||c==a) {
            System.out.println("it is an isosless triangle");
        }else{
            System.out.println("it is a scalene");
        } 
}

public static void main(String[] args){
    Main myObj = new Main();
    myTriangle(2,3,2);
}

}