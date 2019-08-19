import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MethodPracticeTest {

    private MethodPractice practiceClass;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        practiceClass = new MethodPractice();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testDisplayMultiplicationTable() {

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        practiceClass.displayMultiplicationTable(3);

        assertThat(out.toString(), is("3 6 9 12 15 18 21 24 27"));
    }



}
