
package com.amazonaws.mobileconnectors.cognito.exceptions;

/**
 * This exception is thrown when a service request failed due to network
 * connectivity problem.
 */
public class NetworkException extends DataStorageException {

    private static final long serialVersionUID = 8685123233927843893L;

    /**
     * @param detailMessage the exception message.
     * @param throwable exception as throwable.
     */
    public NetworkException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

    /**
     * @param detailMessage the exception message.
     */
    public NetworkException(String detailMessage) {
        super(detailMessage);
    }

}
