import java.util.Scanner;
import java.lang.Math;
public class Number {
    public static Scanner sc = new Scanner(System.in);
    // Nhap vao 1 so bat ki
    public static int enterNumber(){
        int number;
        System.out.println("Nhap 1 so");
        number = Integer.parseInt(sc.nextLine());
        return number;
    }
    // Nhap 1 so le duong
    public static int enterN(){
        int number;
        System.out.println("Nhap N");
        do{
            number = Integer.parseInt(sc.nextLine());
            if(number % 2 == 0 || number <= 0){
                System.out.println("Nhap lai N le duong");
            }
        }while (number % 2 == 0 || number <= 0);
        return number;
    }
    // kiem tra 1 so co phai so nguyen to
    public static boolean isPrime(int number){
        if(number < 2){
            return false;
        }else{
            for(int i = 2; i <= Math.sqrt(number); i++){
                if(number % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    // hien thi number so nguyen to dau tien
    public static void showListPrime(int number){
        int count = 0;
        int i = 2;
        while(count < number){
            if(isPrime(i) == true){
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        int n = enterN();
        boolean checkPrime = isPrime(n);
        if(checkPrime == true){
            System.out.println("N la so nguyen to");
        }else{
            System.out.println("N khong la so nguyen to");
        }
        System.out.printf("day %d so nguyen to dau tien la : ", n);
        showListPrime(n);
    }
}
