public class Main {
    public static void main(String[] args) {
        hw4Ex2();
    }

    public static void hw4Ex1() {

        int clientIOS = 0;
        if (clientIOS==0) {
            System.out.println("Установите версию приложения для IOS по ссылке");}

        if (clientIOS==1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public  static void hw4Ex2(){
        int clientDeviseYear = 2013;
        int OSClient= 1 ;
        if (clientDeviseYear<2015&&OSClient==0) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } if (clientDeviseYear>2015&&OSClient==0) {
            System.out.println("Установите  версию приложения для IOS по ссылке");
        }
        if (clientDeviseYear<2015&&OSClient==1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }if (clientDeviseYear>2015&&OSClient==1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }







    }



    }
