import java.math.BigDecimal;
public class BigNumber {
    public static void main(String[] args) {
        BigDecimal bb=new BigDecimal("99999999999.99999");
       BigDecimal bb2=new BigDecimal("888888888.88888");
       BigDecimal result = bb.multiply(bb2);
        System.out.println("Multiplication "+result);
    }
}
