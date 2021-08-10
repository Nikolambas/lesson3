import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] a = {1,0,1,1,0,1,0,0,1,0,1,1,1,0};        //1 задача
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            } else {
                a[i] = 0;
            }
        }

        int [] b = new int [100];                      //2 задача
        for (int i = 0; i < b.length; i++) {
            b[i]=i+1;
        }

        int[]c={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };    // 3 задача
        for (int i = 0; i < c.length; i++) {
            if (c[i]<6){
                c[i]=c[i]*2;
            }
        }

        int [][]d=new int[9][9];                        //4 задача
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[0].length; j++) {
                if (i==j){
                    d[i][j]=1;
                }else if (i+j==d.length-1){
                    d[i][j]=1;
                }
            }
        }

        int[]e ={1,5,8,3,9,5,8,10,35,6,-3,-25,39,6,8};   //6 задача
        System.out.println(minArray(e));
        System.out.println(maxArray(e));

        int [] ar = {1,2,3,4,2,};                         //7 задача
        System.out.println(returnBoolean(ar));

        int [] arr={3,5,6,1};                             //8 задача
        changeArray(arr,3);
        System.out.println(Arrays.toString(e));

    }

    public static int[] makeArray(int len,int initialValue){     //5 задача
        int [] a= new int[len];
        for (int i = 0; i < a.length; i++) {
            a[i]=initialValue;
        }
        return a;
    }

    public static int minArray(int[]a){         // метод для 6 задачи
        int b=a[0];
        for (int i = 0; i < a.length; i++) {
            if (b>a[i]){
                b=a[i];
            }
        }
        return b;
    }

    public static int maxArray(int[]a){           // метод для 6 задачи
        int b=a[0];
        for (int i = 0; i < a.length; i++) {
            if (b<a[i]){
                b=a[i];
            }
        }
        return b;
    }

    public static boolean returnBoolean(int [] a){            //7 задача
        int sum=0;
        int count=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        if (sum%2!=0){
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            count+=a[i];
            if (sum/count==2){
                return true;
            }
        }
        return false;
    }

    public static void changeArray(int[]a, int b) {             //8 задача
        if (0<b){
            for (int i = 0; i < b; i++) {
                int d = a[a.length-1];
                for (int j = 0; j < a.length; j++) {
                    int c = a[j];
                    a[j]=d;
                    d=c;
                }
            }
        }else if(0>b){
            b*=-1;
            for (int i = 0; i < b; i++) {
                int d = a[0];
                for (int j = a.length-1;0<=j;j--){
                     int c = a[j];
                     a[j]=d;
                     d=c;
                }
            }
        }
    }

    public static void printArrayInt(int[][]a){         //принт двумерного массива, для себя
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[j].length; j++) {
                System.out.println(Arrays.toString(a[j]));
            }
        }
    }



}
