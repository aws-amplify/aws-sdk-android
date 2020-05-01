/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.amazonelasticfilesystem.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The calling account has reached the limit for elastic network interfaces for
 * the specific AWS Region. The client should try to delete some elastic network
 * interfaces or get the account limit raised. For more information, see <a
 * href=
 * "https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Appendix_Limits.html"
 * >Amazon VPC Limits</a> in the <i>Amazon VPC User Guide </i> (see the Network
 * interfaces per VPC entry in the table).
 * </p>
 */
public class NetworkInterfaceLimitExceededException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String errorCode;

    /**
     * Constructs a new NetworkInterfaceLimitExceededException with the
     * specified error message.
     *
     * @param message Describes the error encountered.
     */
    public NetworkInterfaceLimitExceededException(String message) {
        super(message);
    }

    /**
     * Returns the value of the errorCode property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return The value of the errorCode property for this object.
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of errorCode
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param errorCode The new value for the errorCode property for this
     *            object.
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
