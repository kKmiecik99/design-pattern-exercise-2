package logger;

import java.sql.SQLOutput;
import java.time.LocalDateTime;

public class LoggerService {
    private static LoggerService instance;
    public static LoggerService getInstance() {
        if (instance==null){
            synchronized (LoggerService.class){
                if (instance == null){
                    instance = new LoggerService();
                }
            }

        }
        return instance;
    }
    public void log(String messageToPrint){
        System.out.println(messageToPrint);
        System.out.println("Login time: "+LocalDateTime.now());
    }
}
