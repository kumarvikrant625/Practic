package abc;

public interface URLShortener {

     String BASE_URL = "http://short.com/";

    String shortenURL(String longURL);
}