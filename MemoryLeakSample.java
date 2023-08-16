import java.util.List;
import java.util.LinkedList;
import java.io.File;
import java.io.OutputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MemoryLeakTest {
    private List list = new LinkedList();
    private int index;
    public void load(File file) throws IOException {
        index = list.size();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String buf = reader.readLine();
        while(buf != null) {
           list.add(buf);
           buf = reader.readLine();
        }
    }

    public int printNextLine(OutputStream os) throws IOException {
        if(index >= list.size())
            return -1;
        String line = (String)list.get(index++);
        int len = line.length();
        os.write((index + ":").getBytes());
        os.write(line.getBytes());
        os.write('n');
        return len;
    }
}
