package week_04_sorting_methodReference_stream.equal_hashcode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Objects;

@AllArgsConstructor
//@EqualsAndHashCode
@Data
public class Money {
    int amount;
    String currencyCode;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Money money = (Money) o;
//
//        if (amount != money.amount) return false;
//        return Objects.equals(currencyCode, money.currencyCode);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = amount;
//        result = 31 * result + (currencyCode != null ? currencyCode.hashCode() : 0);
//        return result;
//    }
}
