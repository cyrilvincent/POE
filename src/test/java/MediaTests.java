import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import com.m2i.poe.media.Book;
import com.m2i.poe.media.BookJPARepository;
import com.m2i.poe.media.Cart;
import org.junit.Test;

import java.sql.SQLException;

public class MediaTests {

    @Test
    public void firstTest() {
        int i = 1;
        i += 1;
        assertEquals(2,i);
    }

    @Test
    public void netPriceTest() {
        Book b = new Book();
        b.setPrice(10);
        assertNotNull(b);
        assertEquals(9.985, b.getNetPrice(), 0.001);
        assertTrue(9.985 == b.getNetPrice());
    }

    @Test
    public void JPAGetByIdTest() throws SQLException {
        BookJPARepository repo = new BookJPARepository();
        Book b = repo.getById(1);
        assertNotNull(b);
        assertEquals("Java", b.getTitle());
    }

    @Test
    public void cartIsValid() {
        Cart cart = new Cart();
        assertFalse(cart.getIsValid());
        cart.add(new Book());
        assertTrue(cart.getIsValid());
    }
}
