import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.SyncFailedException;

public class TextInput {
    public static void main(String[] args) throws IOException // добавили исключение throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // создали объект класса BufferedReader

        String str = reader.readLine(); // считали строку с консоли и записали ее в переменную str

    }
}
