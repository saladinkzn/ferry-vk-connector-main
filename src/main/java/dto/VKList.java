package dto;

import java.util.List;

/**
 * @author sala
 */
public class VKList<TElement> {
    private List<TElement> items;
    private int count;

    public List<TElement> getItems() {
        return items;
    }

    public void setItems(List<TElement> items) {
        this.items = items;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
