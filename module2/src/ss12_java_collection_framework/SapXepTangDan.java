package ss12_java_collection_framework;

import java.util.Comparator;

public class SapXepTangDan  implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o1.getPrice(),o2.getPrice());
    }
}