package store.order;

import java.io.Serializable;

import lombok.Builder;
import lombok.experimental.Accessors;
import store.product.ProductOut;

@Builder @Accessors(fluent = true)
public record ItemOut implements Serializable(
    private static final long serialVersionUID = 1L;
    String id,
    ProductOut product,
    Integer quantity,
    Double total
) {}
