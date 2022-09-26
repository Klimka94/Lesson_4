public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) { //Задача 1
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println(); //Задача 2
        for (int i = 3; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + "-e число. Не забудьте сдать отчёт!");
        }

        int year = 2021; //Задача 3
        int yearBefore = year - 200;
        int yearAfter = year + 100;
            for (int i = 0; i <= yearAfter; i = i + 79) {
                if (i>=yearBefore) {
                    System.out.println(i);
                }
            }

        for (int i = 1; i <= 30; i++){ //Задача 4
               if (i%3!=0 && i%5!=0) {
                   System.out.println(i+ ":");
               }
               else if (i%3==0 && i%5==0){
                   System.out.println(i + ": ping pong");
               }
               else if (i%5==0){
                   System.out.println(i + ": pong");
               }
               else if (i%3==0) {
                   System.out.println(i + ": ping");
               }
            }

        int x = 0; //Задача 5
        int y = 1;
        int z;
        System.out.print(x+ " ");
            for (int i = 2; i <= 10; i++) {
                z = x+y;
                System.out.print(z + " ");
                y = x;
                x = z;
            }
        }
    }