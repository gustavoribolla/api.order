package store.order;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import lombok.Builder;

@Builder
public record OrderOut(
    String id,
    Date date,
    List<ItemOut> items,
    Double total
) implements Serializable {
    private static final long serialVersionUID = 1L;
}
