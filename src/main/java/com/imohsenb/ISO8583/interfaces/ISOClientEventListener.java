package com.imohsenb.ISO8583.interfaces;

import java.nio.ByteBuffer;

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

    default ByteBuffer beforeSendingMessage(final ByteBuffer buffer) {
        beforeSendingMessage();
        return buffer;
    }

    default byte[] afterReceiveResponse(final byte[] resp) {
        afterReceiveResponse();
        return resp;
    }
}
