package guru.springframework.domain;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class CategoryTest extends TestCase {

    Category category;

    @Before
    public void setUp() {
        category = new Category();
    }

    @Test
    public void testGetId() {
        long idValue = 4l;
        category.setId(idValue);
        assertEquals(java.util.Optional.ofNullable(idValue), java.util.Optional.ofNullable(category.getId()));
    }

    @Test
    public void testGetDescription() {
    }

    @Test
    public void testGetRecipes() {
    }
}