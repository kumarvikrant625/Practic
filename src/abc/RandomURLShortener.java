package abc;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomURLShortener implements URLShortener {
    private static final String ALPHANUMERIC = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int SHORT_URL_LENGTH = 6;

    private final Map<String, String> urlMap = new HashMap<>();
    private final Random random = new Random();

    @Override
    public String shortenURL(String longURL) {
        String shortURL;
        do {
            shortURL = generateRandomString();
        } while (urlMap.containsKey(shortURL));

        urlMap.put(shortURL, longURL);
        return BASE_URL + shortURL;
    }

    private String generateRandomString() {
        StringBuilder sb = new StringBuilder(SHORT_URL_LENGTH);
        for (int i = 0; i < SHORT_URL_LENGTH; i++) {
            sb.append(ALPHANUMERIC.charAt(random.nextInt(ALPHANUMERIC.length())));
        }
        return sb.toString();
    }
}
