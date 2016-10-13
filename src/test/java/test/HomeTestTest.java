package test;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by malinni on 13/10/2016.
 */
public class HomeTestTest {

    private HomeTest test = new HomeTest();
    @Test
    public void test_question_1(){
        int a = test.question_1(10, 3);
        assertEquals(1, a);
        a = test.question_1(10, 2);
        assertEquals(2, a);
        a = test.question_1(10, 11);
        assertEquals(10, a);

    }

    @Test
    public void test_question_1_Better(){
        int a = test.question_1_Better(10, 3);
        assertEquals(1, a);

        a = test.question_1_Better(10, 2);
        assertEquals(2, a);

        a = test.question_1_Better(10, 11);
        assertEquals(10, a);

        a = test.question_1_Better(10, 0);
        assertEquals(10, a);
    }

    @Test
    public void test_question_2(){
        boolean ret = test.question_2(true, true, false, false, false, false);
        assertTrue(ret);

        ret = test.question_2(true, true, true, false, false, false);
        assertFalse(ret);

        ret = test.question_2(true, false, false, false, false, false);
        assertFalse(ret);
    }

    @Test
    public void test_question_3(){
        boolean ret = test.question_3(2);
        assertFalse(ret);

        ret = test.question_3(4);
        assertTrue(ret);

        ret = test.question_3(5);
        assertFalse(ret);

        ret = test.question_3(9);
        assertTrue(ret);

        ret = test.question_3(10);
        assertFalse(ret);

        ret = test.question_3(16);
        assertFalse(ret);

        ret = test.question_3(25);
        assertTrue(ret);
    }

    @Test
    public void test_question_4(){
        int ret = test.question_4(0);
        assertEquals(1, ret);

        ret = test.question_4(1);
        assertEquals(8, ret);

        ret = test.question_4(2);
        assertEquals(28, ret);

    }

    @Test
    public void test_question_5(){
        int ret = test.question_5(5);
        assertEquals(1, ret);

        ret = test.question_5(6);
        assertEquals(2, ret);

        ret = test.question_5(25);
        assertEquals(11, ret);

    }

    @Test
    public void test_question_6(){
        int ret = test.question_6(1);
        assertEquals(0, ret);

        ret = test.question_6(2);
        assertEquals(1, ret);

        ret = test.question_6(3);
        assertEquals(1, ret);

        ret = test.question_6(4);
        assertEquals(2, ret);
    }

    @Test
    public void test_question_7(){
        String ret = test.question_7("han.solo@gmail.com");
        assertEquals("Han Solo", ret);

        ret = test.question_7("CHEWBACCA@gmail.com, obi.wan.kenobi@gmail.com");
        assertEquals("Chewbacca, Obi Wan Kenobi", ret);

    }
}