package com.imohsenb.ISO8583.interfaces;

/**
 * @author Mohsen Beiranvand
 */
public interface ISOClientEventListener {

    default void connecting() {
    }

    default void connected() {
    }

    default void connectionFailed() {
    }

    default void connectionClosed() {
    }

    default void disconnected() {
    }

    default void beforeSendingMessage() {
    }

    default void afterSendingMessage() {
    }

    default void onReceiveData() {
    }

    default void beforeReceiveResponse() {
    }

    default void afterReceiveResponse() {
    }
}
