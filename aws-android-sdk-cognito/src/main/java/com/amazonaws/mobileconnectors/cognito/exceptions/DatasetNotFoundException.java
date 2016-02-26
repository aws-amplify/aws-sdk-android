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

/**
 * This exception is thrown when the dataset that is attempted to access does
 * not exist.
 */
public class DatasetNotFoundException extends DataStorageException {

    private static final long serialVersionUID = -5043074429464815354L;

    public DatasetNotFoundException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

    public DatasetNotFoundException(String detailMessage) {
        super(detailMessage);
    }

}
