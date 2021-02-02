package ru.netology.repository;


import ru.netology.domain.Product;

public class ProductRepository {

    private static Product[] items = new Product[0];
    private static final Product[] item = new Product[0];

    public static void save(Product item) {
        int length = items.length + 1;
        Product[] tmp = new Product[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lasIndex = tmp.length - 1;
        tmp[lasIndex] = item;
        items = tmp;
    }

    public Product[] findAll() {return items;}

    public void removeById (int id) {
        int length = items.length - 1;
        Product[] tmp = new Product[length];
        int index = 0;
        for (Product item : items) {
            if(item.getId() != id) {
                tmp[index] =item;
                index++;
            }
        }

    }

}
