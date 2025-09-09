package kr.hhplus.be.server.layered.domain.order;

public enum OrderStatus {
    PAYMENT_WAITING,
    PAYMENT_COMPLETE,
    DELIVERY_PREPARING,
    DELIVERING,
    DELIVERY_COMPLETE,
    CANCEL,
    REFUND
}