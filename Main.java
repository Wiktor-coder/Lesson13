import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");
        Queue<String> clientsQ = new LinkedList<>(firstClients);

        while (!clientsQ.isEmpty()) {
            String currentClient = clientsQ.poll();
            System.out.println("Клиент: " + currentClient + " сделала новый маникюр.");

            if (Math.random() < 0.5) {
                String friendName = "a friend of " + currentClient;
                clientsQ.offer(friendName);
            }
        }
    }
}


