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

import com.amazonaws.AmazonClientException;

/**
 * An exception that's thrown when the subscription to a silent sync dataset
 * fails
 * @deprecated The Amazon Cognito Sync SDK for Android is deprecated as of release 2.9.0. Please use the AWS AppSync SDK for Android along with AWS AppSync service instead.
 */
@Deprecated
public class SubscribeFailedException extends AmazonClientException {
    private static final long serialVersionUID = 5706724903415180392L;

    /**
     * @param message the exception message.
     * @param throwable exception as throwable.
     */
    public SubscribeFailedException(String message, Throwable throwable) {
        super(message, throwable);
    }

    /**
     * @param message the exception message.
     */
    public SubscribeFailedException(String message) {
        super(message);
    }

}
