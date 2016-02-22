import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by rfraga on 2/22/16.
 */
public class PrimeFactorTest {

    @Test
    public void shouldGeneratePrimeFactor() {
        PrimeFactor primeFactor = new PrimeFactor();
        List<Integer> primeFactors = new ArrayList<>();
        primeFactors.add(2);
        primeFactors.add(3);
        primeFactors.add(5);
        assertThat(primeFactor.generate(30),is(primeFactors));
    }

}