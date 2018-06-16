import java.io.*;
import java.math.*;
import java.util.*;
import java.text.*;
class saur
{
    public static void main(String[] args)
    {
        BigDecimal pay1=new BigDecimal("100000.666756");
        BigDecimal pay2=new BigDecimal("100");
        BigDecimal pay3=pay1.subtract(pay2);
        pay3=pay3.setScale(2,BigDecimal.ROUND_HALF_UP);
        System.out.println(pay3.toString());
    }
}