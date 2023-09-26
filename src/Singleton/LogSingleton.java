package Singleton;

public class LogSingleton {

    private static LogSingleton instance;
    public String log;


    private LogSingleton(String Novolog){
        this.log = Novolog;

    }

    public static LogSingleton getInstance(String Novolog){

        if(instance == null){
            instance = new LogSingleton(Novolog);
        }
        return instance;
    }












}
