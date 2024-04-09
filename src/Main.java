import java.util.Arrays;

public class Main {



    public static void main(String[] args) {


        int mojNiz[] = {55, 5, 7, 180, 10, 200, 60, 600, 3};

        int max = mojNiz[0];

        for (int i = 0; i < mojNiz.length; i++) {
            if (mojNiz[i] > max){
                max = mojNiz[i];
            }
        }

        System.out.println(max);

        Arrays.sort(mojNiz);

        System.out.println(mojNiz[0]);
        System.out.println(mojNiz[mojNiz.length-1]);



    }




}
