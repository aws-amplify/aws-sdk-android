
package com.amazonaws.mobileconnectors.cognito.exceptions;

/**
 * This exception is thrown when a service request failed due to network
 * connectivity problem.
 * @deprecated The Amazon Cognito Sync SDK for Android is deprecated as of release 2.9.0. Please use the AWS AppSync SDK for Android along with AWS AppSync service instead.
 */
@Deprecated
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
