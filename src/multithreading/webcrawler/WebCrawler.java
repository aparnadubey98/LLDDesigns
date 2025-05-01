package multithreading.webcrawler;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WebCrawler {
    private final Set<String> visited = ConcurrentHashMap.newKeySet();
    private final ExecutorService executor;
    private final int MAX_DEPTH = 2;

    public WebCrawler() {
        this.executor = Executors.newFixedThreadPool(10);
    }

    
}
