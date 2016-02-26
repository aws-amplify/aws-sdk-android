/**
 * Copyright 2013-2016 Amazon.com, 
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

import com.amazonaws.AmazonClientException;

/**
 * This exception is thrown when an error occurs during an data storage
 * operation.
 */
public class DataStorageException extends AmazonClientException {

    private static final long serialVersionUID = -6906342391685175623L;

    public DataStorageException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

    public DataStorageException(String detailMessage) {
        super(detailMessage);
    }

}
