
package com.amazonaws.mobileconnectors.iot;

import com.amazonaws.AmazonClientException;

/**
 * Certificate exception ecapsulates all of the various underlying
 * certificate/keystore exceptions.
 */
public class AWSIotCertificateException extends AmazonClientException {
    /**
     * Create a new AWSIotCertificateException.
     * 
     * @param message error message.
     * @param t throwable - the underlying exception.
     */
    public AWSIotCertificateException(String message, Throwable t) {
        super(message, t);
    }

    /**
     * Create a new AWSIotCertificateException.
     * 
     * @param message error message.
     */
    public AWSIotCertificateException(String message) {
        super(message);
    }
}
