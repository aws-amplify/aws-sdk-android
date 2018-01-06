/**
 * Copyright 2013-2018 Amazon.com, 
 * Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Amazon Software License (the "License"). 
 * You may not use this file except in compliance with the 
 * License. A copy of the License is located at
 * 
 *     http://aws.amazon.com/asl/
 * 
 * or in the "license" file accompanying this file. This file is 
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, express or implied. See the License 
 * for the specific language governing permissions and 
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.cognito.exceptions;

/**
 * This exception is thrown when the data set of interest is not authorized to
 * be accessed
 */
public class DataAccessNotAuthorizedException extends DataStorageException {

    private static final long serialVersionUID = 5067700802587075978L;

    /**
     * @param detailMessage the exception message.
     * @param throwable exception as throwable.
     */
    public DataAccessNotAuthorizedException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

    /**
     * @param detailMessage the exception message.
     */
    public DataAccessNotAuthorizedException(String detailMessage) {
        super(detailMessage);
    }

}
