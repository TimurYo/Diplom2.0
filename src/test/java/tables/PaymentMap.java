package tables;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;


@Data
@NoArgsConstructor
public class PaymentMap {
    public String id;
    public String amount;
    public String created;
    public String status;
    public String transaction_id;

    public String getAmount() {
        return amount;
    }

}