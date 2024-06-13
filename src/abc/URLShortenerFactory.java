package abc;

public class URLShortenerFactory {
    public static URLShortener getURLShortener(ShorteningStrategy strategy) {
        switch (strategy) {
            case RANDOM:
                return new RandomURLShortener();
            case SEQUENTIAL:
                return new SequentialURLShortener();
            default:
                throw new IllegalArgumentException("Unknown strategy: " + strategy);
        }
    }

    public static void main(String[] args) {
        URLShortener randomShortener = URLShortenerFactory.getURLShortener(ShorteningStrategy.RANDOM);
        URLShortener sequentialShortener = URLShortenerFactory.getURLShortener(ShorteningStrategy.SEQUENTIAL);

        String longURL1 = "http://really-long-domain-name.com/some-very-long-path/onemore-long-part";
        String longURL2 = "http://google.com/search=backend";

        System.out.println("Random strategy:");
        System.out.println(randomShortener.shortenURL(longURL1));
        System.out.println(randomShortener.shortenURL(longURL2));

        System.out.println("\nSequential strategy:");
        System.out.println(sequentialShortener.shortenURL(longURL1));
        System.out.println(sequentialShortener.shortenURL(longURL2));
    }
}
