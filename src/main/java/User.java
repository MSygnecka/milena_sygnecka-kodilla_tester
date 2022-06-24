public class User {

   public String name;
   public int age;

   public User(String name, int age) {
      this.name = name;
      this.age = age;
   }

   public static void main(String[] args) {
      User anna = new User("anna", 23);
      User katarzyna = new User("katarzyna", 35);
      User tomasz = new User("tomasz", 30);
      User piotr = new User("piotr", 38);
      User agnieszka = new User("agnieszka", 28);

      User[] users = {anna, katarzyna, tomasz, piotr, agnieszka};

      int sum = 0;
      double average = 0;
      for (int i = 0; i < users.length; i++) {
         User user = users[i];
         sum = sum + user.age;
      }
      average = sum / users.length;

      for (int i = 0; i < users.length; i++) {
         User user = users[i];
         if (average > user.age) {
            System.out.println(user.name);
         }
      }
   }
}

