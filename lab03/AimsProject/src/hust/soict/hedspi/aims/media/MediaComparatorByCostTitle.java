package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {
    @Override
    public int compare(Media m1, Media m2) {
        int costCompare = Float.compare(m2.getCost(), m1.getCost()); // Giảm dần theo giá
        if (costCompare == 0) {
            return m1.getTitle().compareToIgnoreCase(m2.getTitle());
        }
        return costCompare;
    }
}