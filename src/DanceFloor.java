import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class DanceFloor {

    public static String[] musicType = {"Hip-hop", "Electro", "RNB", "Pop"};

    public static void main(String[] args) {
        while (true) {
            String randomMusic = musicType[ThreadLocalRandom.current().nextInt(0, musicType.length)];
            System.out.println("Сейчас играет " + randomMusic);

            Map<String, String> humans = new HashMap<>();
            humans.put("Петя", "RNB");
            humans.put("Ваня", "Pop");
            humans.put("Коля", "Electro");
            humans.put("Оля", "Hip-hop");
            humans.put("Таня", "Pop");

            for (Map.Entry h : humans.entrySet()) {
                String value = h.getValue().toString();
                if (value.equals(randomMusic)) {
                    System.out.println(h.getKey() + " танцует");
                }
                System.out.println(h.getKey() + " пьёт в баре");
            }
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e){
                System.out.println("Такие дела,ошибочка в залипании");
            }
        }
    }
}
