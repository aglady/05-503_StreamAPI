package ru.gr05503.domain;

public record OrderItem(
        String product,
        int quantity,
        int priceRub
) {
    public int total(){
        return quantity * priceRub;
    }
}
