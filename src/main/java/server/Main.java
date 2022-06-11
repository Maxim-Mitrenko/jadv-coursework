package server;

import general.Log;
import general.Logger;
import general.Read;
import general.ReadResult;

import java.io.File;

public class Main {

    public static final File logFile = new File("src\\main\\java\\server\\file.log");
    public static final Log log = new Logger(logFile);
    public static final File settings = new File("src\\main\\java\\server\\settings.txt");
    public static final Read read = new Read(settings,log);
    public static final ReadResult result = read.read();

    public static void main(String[] args) {
        Server server = new Server(log);
        server.start(result.getIp(), result.getPort());
    }
}
