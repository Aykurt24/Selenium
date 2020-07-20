package tstNG.day5;

public class _05_HowParamworks {
    public static void main(String[] args) {

        method("asd" , "123");

    }
    public static void method(String st1 ,String st2){

        System.out.println(st1);

        try{
            System.out.println(st2);
        }catch (Exception e){
            System.out.println("message");
        }


    }
}

