package uz.pdp.DB;

import uz.pdp.entity.Category;
import uz.pdp.entity.User;

import java.util.ArrayList;
import java.util.List;

public interface DB {
    List<User> USERS = new ArrayList<>(List.of(
            new User("akmal", "3333", "3333", "user"),
            new User("bahrom", "4444", "4444", "user"),
            new User("admin", "1111", "1111", "admin")
    ));

    List<Category> CATEGORIES = new ArrayList<>(List.of(
            new Category("Books"),
            new Category("Clothes"),
            new Category("Electronics"),
            new Category("Furniture")
    ));

}
