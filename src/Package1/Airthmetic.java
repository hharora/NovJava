package Package1;

public class Airthmetic {
//(((((10+2)+2)-2)*2)/2)
    int a=10; int b=2;
    int result;

    public int sum(int a, int b){
        return a+b;
    }
    public int sub( int a, int b) {
        return a-b;
    }
    public int multi (int a, int b){
        return a*b;
    }

    public void div(int a, int b){

        float d = (float) a /b;
        System.out.println("Final Answer :"+ d);

    }

    public static void main(String[] args) {

        System.out.println("Solve : (((((10+4)+2)-2)*2)/2)");
        Airthmetic cal = new Airthmetic();
        cal.result= cal.sum(cal.a,cal.b);
        System.out.println(cal.result);
        cal.result=cal.sum(cal.result,cal.b);
        System.out.println(cal.result);
        cal.result=cal.sub(cal.result,cal.b);
        System.out.println(cal.result);
        cal.result=cal.multi(cal.result,cal.b);
        System.out.println(cal.result);
        cal.div(cal.result,cal.b);

    }
}
