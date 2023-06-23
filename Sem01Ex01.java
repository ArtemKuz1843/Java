import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Sem01Ex01 {
    public static void main(String[] args) {
        int[] arr = random(10, 0, 2);
    System.out.println(Arrays.toString(arr));
    System.out.println(count(arr));    
    }
    static int[] random(int kol, int min, int max){
        int[] arr = new int[kol];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(min, max);
        }
        return arr;
    }
    static int count(int[]arr){
        int max_kol = 0;
        int kol = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 1){
                kol += 1;
                if (max_kol < kol){
                    max_kol = kol;
                }
            }
            else {
                kol = 0;
            }
        }
        return max_kol;
    }
}

// Дан массив двоичных чисел, например [1,1,0,1,1,1], 
// вывести максимальное количество подряд идущих 1.

// import java.util.Arrays;
// import java.util.Random;

// public class j1 {
//   public static void main(String[] args) {
//     int[] arr = random(10, 0, 2);
//   System.out.println(Arrays.toString(arr));
//   System.out.println(count(arr));
//   }
//   static int[] random(int kol, int min, int max){
//     int[] arr = new int[kol];
//     Random random = new Random();
//     for (int i = 0; i < arr.length; i++) {
//       arr[i] = random.nextInt(min, max);
//     } 
//     return arr;
//   }
//   static int count(int[]arr){
//     int max_kol = 0;
//     int kol = 0;
//     for (int i = 0; i < arr.length; i++) {
//       if (arr[i] == 1){
//         kol += 1;
//         if (max_kol < kol){
//           max_kol = kol;
//         }
//       }
//       else{
//         kol = 0;
//       }
//     }
//     return max_kol;
//   }
// }
//////////////////////////////////////

// Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.

// public class Main2 {
//     /*
//     Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
//      */
//     public static void main(String[] args) {
//         String line = "Добро пожаловать на курс по Java";
//         System.out.println(reverse(line));
//     }

//     static String reverse(String line) {
//         String[] temp = line.split(" ");
//         String res = "";
//         for (int i = temp.length - 1; i >= 0; i--) {
//             res += temp[i] + " ";
//         }
//         return res;
//     }
// }

// int b = a++ (здесь a == 3, 
// а затем принимает
//  значение 4) + (--a (здесь
//   a сразу принимает
//    значение 3: 4 (стало на
//     предыдущем шаге) -1 ) * a++ (здесь а еще 3));