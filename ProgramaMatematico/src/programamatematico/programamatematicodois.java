package programamatematico;
public class programamatematicodois {
    public static void main(String[] args) {

    int a = 0, b = 30, p = 0;
    long m = 1;

        for(a=1;a<b;a++){
        if(a%2==0){
            p+=a;
        }else{
            m*=a;
    }
    System.out.println("as operações resultaram em p: " + p + " e m: " + m);
    }
    }
}

