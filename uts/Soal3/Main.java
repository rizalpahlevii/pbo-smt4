public class Main {

    public static void main(String[] args) {
        Encyclopedia encyclopedia = new Encyclopedia();
        encyclopedia.setTitle("My Book");
        encyclopedia.setAuthor("Muhammad Rizal Pahlevi");
        encyclopedia.setIsbn(181273123);
        encyclopedia.setVolume(20);
        System.out.println("Author : " + encyclopedia.getTitle());
        System.out.println("Title : " + encyclopedia.getAuthor());
        System.out.println("ISBN : " + encyclopedia.getIsbn());
        System.out.println("Volume : " + encyclopedia.getVolume());
    }
}
