import java.util.Scanner;

public class Array {
    public static Scanner sc = new Scanner(System.in);
// Tao mang moi
    public static int[] enterArrayElement(int[] arr, int length) {
        System.out.printf("Nhap %d phan tu cua mang arr %n", length);
        for (int i = 0; i < length; i++) {
            System.out.printf("Nhap phan tu index %d %n", i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        return arr;
    }
// Hien thi phan tu cua 1 mang
    public static void showArrayElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
// In ra phan tu cua mang la so nguyen to neu khong hien thi thong bao
    public static void checkPrimeInArray(int[] arr) {
        System.out.println("Day cac so nguyen to trong mang la : ");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Number.isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
                count++;
            }
        }
        System.out.println();
        if (count == 0) {
            System.out.println("Khong co so nguyen to nao trong mang");
        }
    }
// kiem tra xem 1 so co nam trong mang khong neu co tra ve vi tri, neu khong dua ra thong bao
    public static void checkNumberInArray(int[] arr, int number) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                System.out.printf("%d o vi tri index %d %n", number, i);
                count++;
            }
        }
        if (count == 0) {
            System.out.printf("%d khong nam trong mang %n", number);
        }
    }
// xoa 1 phan tu trong mang
    public static int[] deleteAnElementInArray(int[] arr, int number) {
        if (arr[arr.length - 1] == number) {
            arr[arr.length - 1] = 0;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == number) {
                for (int j = i + 1; j < arr.length; j++) {
                    arr[i] = arr[j];
                }
            }
        }
        return arr;
    }
// sap xep mang theo thu tu tang dan
    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    // them 1 phan tu vao mang va sap xep theo thu tu tang dan
    public static int[] addElementtoArray(int[] arr, int number){
        int[] newArr = new int[arr.length + 1];
        newArr[newArr.length - 1] = number;
        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        newArr = sortArray(newArr);
        return newArr;
    }

    public static void main(String[] args) {
        int num = Number.enterN();
        int[] arr = new int[num];
        arr = enterArrayElement(arr, num);
        showArrayElements(arr);
////        checkPrimeInArray(arr);
////        checkNumberInArray(arr, num);
//        int[] deledArray = deleteAnElementInArray(arr,num);
//        System.out.printf("mang moi sau khi xoa  %d la : %n", num);
//        for(int i: deledArray){
//            System.out.print(i + " ");
//        }
//        int[] sortedArray = sortArray(arr);
//        System.out.printf("mang moi sau khi sap xep la : %n");
//        for (int i : sortedArray) {
//            System.out.print(i + " ");
//        }
        int x = Number.enterNumber();
        int[] addedArray = addElementtoArray(arr, x);
        System.out.printf("mang moi sau khi add %d va sap xep la : %n", x);
        for (int i : addedArray){
            System.out.print(i + " ");
        }


    }
}
