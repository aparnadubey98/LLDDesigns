package inventory;

import java.util.List;

public class Shelf {
    private final List<Item> items;
    private final String id;
    private final String name;

    public Shelf(String id, String name, List<Item> items) {
        this.id = id;
        this.name = name;
        this.items = items;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public List<Item> getItems() {
        return items;
    }
    public Item getItemById(String itemId) {
        return items.stream()
                .filter(item -> item.getId().equals(itemId))
                .findFirst()
                .orElse(null);
    }
    public void addItem(Item item) {
        items.add(item);
    }
    public void removeItem(Item item) {
        items.remove(item);
    }
}
