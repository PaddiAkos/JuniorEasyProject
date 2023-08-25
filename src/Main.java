import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try {

            List<Data> d = new ArrayList<>();

            try (BufferedReader reader = new BufferedReader(new FileReader("CSDemo.csv"))) {
                String sor;

                reader.readLine(); 

                while ((sor = reader.readLine()) != null) {
                    Data donto = new Data(sor);
                    d.add(donto);

                }
                {
                    d.sort((d1, d2) -> d2.getName().compareTo(d1.getName()));
                    for (Data data: d) {

                        System.out.println(data.getName());

                    }

                    System.out.println("__________________________________________________________________");

                    List<Data> x  = d.stream()
                            .filter(number ->number.getNumber() >= 2 && number.getNumber() <= 6 )
                            .toList();
                             x.forEach(System.out::println);
                    }
                }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}