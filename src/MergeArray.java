import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size1,size2,size3;

        System.out.print("Nhap vao kich thuoc mang 1: ");
        size1 = input.nextInt();
        int[] array1 = new int[size1];
        inputElementArray(array1);

        System.out.print("Nhap vao kich thuoc mang 2: ");
        size2 = input.nextInt();
        int[] array2 = new int[size2];
        inputElementArray(array2);

        size3 = size1 + size2;

        int[] array3 = new int[size3];

        for (int i = 0; i <size3-size2; i++) {
            array3[i] = array1[i];
        }

        for (int i = size1; i < size3; i++) {
            array3[i] = array2[i-size1];
        }

        System.out.print("Mang 1 : ");
        displayArray(array1);
        System.out.println();

        System.out.print("Mang 2 : ");
        displayArray(array2);
        System.out.println();

        System.out.print("Mang 3 : ");
        displayArray(array3);
    }

    public static void displayArray (int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
    public static void inputElementArray (int[] array){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Nhap vao phan tu thu %d cua mang : ",i+1);
            array[i] = input.nextInt();
        }
    }
}
