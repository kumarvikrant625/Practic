package abc;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class SequentialURLShortener implements URLShortener {

    private final Map<String, String> urlMap = new HashMap<>();
    private final AtomicLong counter = new AtomicLong();

    @Override
    public String shortenURL(String longURL) {
        long id = counter.incrementAndGet();
        String shortURL = Long.toString(id);
        urlMap.put(shortURL, longURL);
        return BASE_URL + shortURL;
    }
}