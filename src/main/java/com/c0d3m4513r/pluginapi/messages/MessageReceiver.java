package com.c0d3m4513r.pluginapi.messages;

import lombok.NonNull;
import lombok.val;

/**
 * Represents something that can receive (and send) messages.
 * All functions need to be async safe.
 */
public interface MessageReceiver {

    /**
     * Sends a message to this receiver.
     *
     * <p>If text formatting is not supported in the implementation
     * it will be displayed as plain text.</p>
     *
     * This needs to be async safe
     * @param message The message
     */
    void sendMessage(@NonNull String message);


    /**
     * Sends the message(s) to this receiver.
     *
     * <p>If text formatting is not supported in the implementation
     * it will be displayed as plain text.</p>
     *
     * This needs to be async safe
     *
     * @param messages The message(s)
     */
    default void sendMessages(@NonNull String... messages) {
        for (val message : messages) {
            this.sendMessage(message);
        }
    }

    /**
     * Sends the message(s) to this receiver.
     *
     * <p>If text formatting is not supported in the implementation
     * it will be displayed as plain text.</p>
     *
     * This needs to be async safe
     *
     * @param messages The messages
     */
    default void sendMessages(@NonNull Iterable<String> messages) {
        for (val message : messages) {
            this.sendMessage(message);
        }
    }

}
