public class Main {



    public static void main(String[] args) {

        int [] niz = new int[3];
        niz[0] = 5;
        niz[1] = 6;
        niz[2] = 7;

//        for (int i = 0; i < niz.length; i++) {
//            System.out.println(niz[i]);
//        }


//        for (int a : niz){// hasNext
//            System.out.println(a);
//        }




        String [] s = {"Marko", "Ivan", "Pera"};// ------>[Ljava.lang.String;@65ab7765

        System.out.println(s);


        int mojNiz[] = {3, 5, 7, 9, 10};


        int [][] niz2d = new int[][]{
                {1,2,8},
                {3,4,10},
                {5,6,15}
        };

//        for (int a : mojNiz) {
//            System.out.println(a);
//        }

        for(int []n: niz2d){
            for (int a : n){
                System.out.print(a + " ");
            }
            System.out.println();
        }








    }




}
