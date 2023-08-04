public class ExceptionTest {

    public Integer divide(int a, int b){
        try{
           return a/b;
        }finally {
            System.out.println("finally");
        }

    }

    public static void main(String[] args) {
        box b1 = new box();
        box b2 = new box();
        b1.height = 1;
        b1.length = 2;
        b1.width = 3;
        b2= b1;

        System.out.println(b2.height);
        System.out.println(b2.width);
        System.out.println(b2.height);


        ExceptionTest exceptionTest = new ExceptionTest();
        try
        {
            System.out.println(exceptionTest.divide(10,0));
        }catch (Exception ex){
            System.out.println("division by 0");
        }
    }
}

class box{
    int width;
    int height;
    int length;
}
