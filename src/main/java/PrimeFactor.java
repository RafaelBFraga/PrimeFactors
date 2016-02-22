import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {


    public List generate(int dividend) {

        List<Integer> primeFactors = new ArrayList<>();
        int divisor = 2;

        while(divisor <= dividend) {
            if (dividend % divisor == 0) {
                dividend = dividend / divisor;
                primeFactors.add(divisor);
            }else
            {
                divisor++;
            }
        }

        return primeFactors;
    }

    public void printList(List primeFactors){
        primeFactors.stream().forEach(System.out::println);
    }
}
