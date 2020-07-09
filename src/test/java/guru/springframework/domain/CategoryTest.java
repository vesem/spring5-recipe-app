package guru.springframework.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryTest {

    Category category;

    @Before
    public void setUp(){
        category = new Category();
    }

    @Test
    public void getId() {
        Long idValue = 4l;

        category.setId(idValue);
        assertEquals(idValue, category.getId());
    }

    @Test
    public void getDescription() {
        String descriptionValue = "This is a test";

        category.setDescription(descriptionValue);
        assertEquals(descriptionValue, category.getDescription());
    }

    @Test
    public void getRecipes() {
    }
}