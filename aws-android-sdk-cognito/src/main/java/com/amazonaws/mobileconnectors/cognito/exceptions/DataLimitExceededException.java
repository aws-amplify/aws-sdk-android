
package com.amazonaws.mobileconnectors.cognito.exceptions;

/**
 * This exception is thrown when the dataset operation exceeds certain limit,
 * e.g. maximum of 20 datasets per identity, 1024 records per dataset, and 1mb
 * in size per dataset, etc.
 */
public class DataLimitExceededException extends DataStorageException {

    private static final long serialVersionUID = 4722137117318719134L;

    /**
     * @param detailMessage the exception message.
     * @param throwable exception as throwable.
     */
    public DataLimitExceededException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

    /**
     * @param detailMessage the exception message.
     */
    public DataLimitExceededException(String detailMessage) {
        super(detailMessage);
    }

}
