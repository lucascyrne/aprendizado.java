package programamatematico;
public class ProgramaMatematico {
    public static void main(String[] args) {
     
    int a = 0, b = 8, p = 0;
    long m = 1;
    
    while (a<b) {
        if(a%2==0) {
        p+=a;
        }else{
        m*=a;
        }
        a++;
    }
        System.out.println("as operações resultaram em p: " + p + " e m: " + m);
    }
}
    
    

/*
1º CÓDIGO - ERRADO

int a = 0;
    int b = 30;
    int p = 0;
    int m = 1;
    
    while (a<b) {
        a++;  
        do {
            if (int a % 2 == 0) {
            (int p+=a);
            } if {
                (int m*=a);
            }
        }
        }
        System.out.println("os valores dos pares e ímpares diante das operações é " p, m);  

2º CÓDIGO USANDO "FOR" - TRUE - programamatematicodois

int a = 0, b = 30, p = 0;
long m = 1;

for(a=1;a<b<a++){
    if(a%2==0){
    p+=a;
}else{
    m*=a
}
System.out.println("as operações resultaram em p: " + p + " e m: " + m);
*/
