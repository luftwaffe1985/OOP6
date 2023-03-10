package OOP6;

import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;

class Log {
    // Попытался сделать логи =)
    public Log() {
    }

    public void record(String msg) {
        Date date = new Date();
        Path path = Paths.get("C:\\Users\\Asus\\IdeaProjects\\OOP6\\src\\OOP6\\log.txt");
        try (FileWriter writer = new FileWriter(path.toString(), true)) {

            writer.write(msg);
            writer.write(date.toString());
            writer.write('\n');
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
