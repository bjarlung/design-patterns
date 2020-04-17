package Structural.Bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        Movie movie = new Movie("Action", "John Wick", "2:15", "2014");

        Formatter printFormatter = new PrintFormatter();
        //contains the data of the movie as a list of detail objects
        Printer moviePrinter = new MoviePrinter(movie);

        String printedMaterial = moviePrinter.print(printFormatter);
        System.out.println(printedMaterial);

        Formatter htmlFormatter = new HtmlFormatter();
        String htmlMaterial = moviePrinter.print(htmlFormatter);
        System.out.println(htmlMaterial);
    }
}
