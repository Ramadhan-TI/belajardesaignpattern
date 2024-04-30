public class Main {
    public static void main(String[] args) {
        Channel ch = new Channel("Rama Rael Kertia");
        User user1 = new User("Fadli Begal");
        User user2 = new User("Rizki Begal Panton");
        User user3 = new User("Rehan Pukol Rizki");

        ch.addSubscriber(user1);
        ch.addSubscriber(user2);
        ch.notifyUser("Ada video baru buat anda! Jangan lupa di subscribe ya!");

        user3.subscribe(ch);
        ch.notifyUser("Video baru!");
     }
}