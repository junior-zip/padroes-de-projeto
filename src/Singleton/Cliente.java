package Singleton;

public class Cliente {


    public static void main(String[] args) {


        LogSingleton logSingleton = LogSingleton.getInstance("Pessoa");
        LogSingleton logSingleton1 = LogSingleton.getInstance("Animal");

        System.out.println(logSingleton.log);
        System.out.println(logSingleton1.log);

    }


}
