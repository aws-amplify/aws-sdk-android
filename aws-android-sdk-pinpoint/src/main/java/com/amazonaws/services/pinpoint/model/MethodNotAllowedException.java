/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import com.amazonaws.AmazonServiceException;

/**
 * 
 */
public class MethodNotAllowedException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String accessControlAllowOrigin;

    private MessageBody messageBody;

    /**
     * Constructs a new MethodNotAllowedException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public MethodNotAllowedException(String message) {
        super(message);
    }

    /**
     * Returns the value of the accessControlAllowOrigin property for this
     * object.
     *
     * @return The value of the accessControlAllowOrigin property for this
     *         object.
     */
    public String getAccessControlAllowOrigin() {
        return accessControlAllowOrigin;
    }

    /**
     * Sets the value of accessControlAllowOrigin
     *
     * @param accessControlAllowOrigin The new value for the
     *            accessControlAllowOrigin property for this object.
     */
    public void setAccessControlAllowOrigin(String accessControlAllowOrigin) {
        this.accessControlAllowOrigin = accessControlAllowOrigin;
    }

    /**
     * Returns the value of the messageBody property for this object.
     *
     * @return The value of the messageBody property for this object.
     */
    public MessageBody getMessageBody() {
        return messageBody;
    }

    /**
     * Sets the value of messageBody
     *
     * @param messageBody The new value for the messageBody property for this
     *            object.
     */
    public void setMessageBody(MessageBody messageBody) {
        this.messageBody = messageBody;
    }
}
