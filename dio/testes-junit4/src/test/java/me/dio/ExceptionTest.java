package me.dio;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.fail;

public class ExceptionTest {

    private String indexOutOfBoundExceptionMessage = "Index 0 out of bounds for length 0";
    @Test(expected = IndexOutOfBoundsException.class)
    public void expectedToSuccess(){
        new ArrayList<Object>().get(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    @Ignore
    public void expectedToFail(){
        List<String> list = new ArrayList<>();
        list.add("S1");
        list.get(0);
    }


    // Using rule


    @Rule
    public ExpectedException thrownException = ExpectedException.none();


    @Test
    public void shouldTestExceptionMessage() {

        List<Object> list = new ArrayList<>();

        thrownException.expect(IndexOutOfBoundsException.class);
        thrownException.expectMessage(indexOutOfBoundExceptionMessage);

        list.get(0);
    }


    @Test
    public void expectedException(){
        try {
            new ArrayList<>().get(0);
            fail("Expected that IndexOutOfBoundsException be throwed");
        }catch (IndexOutOfBoundsException ex){
            assertThat(ex.getMessage(), is(indexOutOfBoundExceptionMessage));
        }
    }
}
