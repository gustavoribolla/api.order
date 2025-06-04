package store.order;

import java.io.Serializable;

import lombok.Builder;
import lombok.experimental.Accessors;
import java.util.Date;
import java.util.List;

@Builder @Accessors(fluent = true)
public record OrderOut implements Serializable(
    private static final long serialVersionUID = 1L;
    String id,
    Date date,
    List<ItemOut> items,
    Double total
) {}
