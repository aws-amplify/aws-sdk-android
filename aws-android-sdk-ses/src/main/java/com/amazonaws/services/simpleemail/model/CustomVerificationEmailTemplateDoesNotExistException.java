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

package com.amazonaws.services.simpleemail.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Indicates that a custom verification email template with the name you
 * specified does not exist.
 * </p>
 */
public class CustomVerificationEmailTemplateDoesNotExistException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Indicates that the provided custom verification email template does not
     * exist.
     * </p>
     */
    private String customVerificationEmailTemplateName;

    /**
     * Constructs a new CustomVerificationEmailTemplateDoesNotExistException
     * with the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public CustomVerificationEmailTemplateDoesNotExistException(String message) {
        super(message);
    }

    /**
     * <p>
     * Indicates that the provided custom verification email template does not
     * exist.
     * </p>
     *
     * @return <p>
     *         Indicates that the provided custom verification email template
     *         does not exist.
     *         </p>
     */
    public String getCustomVerificationEmailTemplateName() {
        return customVerificationEmailTemplateName;
    }

    /**
     * <p>
     * Indicates that the provided custom verification email template does not
     * exist.
     * </p>
     *
     * @param customVerificationEmailTemplateName <p>
     *            Indicates that the provided custom verification email template
     *            does not exist.
     *            </p>
     */
    public void setCustomVerificationEmailTemplateName(String customVerificationEmailTemplateName) {
        this.customVerificationEmailTemplateName = customVerificationEmailTemplateName;
    }
}
