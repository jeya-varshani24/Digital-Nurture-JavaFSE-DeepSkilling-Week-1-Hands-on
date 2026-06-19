class Logger{
    private static Logger instance = new Logger();
    private Logger(){
        System.out.println("Logger instance is created");
    }
    public static Logger getInstance(){
        return instance;
    }
}
public class SingletonPatternExample{
    public static void main(String[] args){
    Logger l1=Logger.getInstance();
    Logger l2=Logger.getInstance();
    if(l1==l2){
        System.out.println("Both loggers are same");
    }
    else{
        System.out.println("Both loggers are different");
    }
}
}
