

public class Main {
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5, 99};
        int n = A.length;
        int soma = Array(A,n);
        System.out.println("A soma dos elementos do array é: "+ soma);
    }

    public static int Array(int[] A, int n) {
        if (n == 0) {
            return 0;
        }else {
            return A[n - 1] + Array(A, n-1);
        }
    }
}