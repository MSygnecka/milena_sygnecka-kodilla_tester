public class SimpleArray {
    public static void main(String[] args) {
String[] friends = new String[5];
        friends[0] = "Ania";
        friends[1] = "Agnieszka";
        friends[2] = "Kasia";
        friends[3] = "Tomek";
        friends[4] = "Konrad";
        String friend = friends[3];
        System.out.println (friend);
        int numberOfElements = friends.length;
        System.out.println ("Moja tablica zawiera " + numberOfElements + " elementów");
    }

}