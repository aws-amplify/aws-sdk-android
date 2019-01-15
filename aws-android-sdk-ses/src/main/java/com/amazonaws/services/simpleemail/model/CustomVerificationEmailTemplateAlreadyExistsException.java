/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * specified already exists.
 * </p>
 */
public class CustomVerificationEmailTemplateAlreadyExistsException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Indicates that the provided custom verification email template with the
     * specified template name already exists.
     * </p>
     */
    private String customVerificationEmailTemplateName;

    /**
     * Constructs a new CustomVerificationEmailTemplateAlreadyExistsException
     * with the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public CustomVerificationEmailTemplateAlreadyExistsException(String message) {
        super(message);
    }

    /**
     * <p>
     * Indicates that the provided custom verification email template with the
     * specified template name already exists.
     * </p>
     *
     * @return <p>
     *         Indicates that the provided custom verification email template
     *         with the specified template name already exists.
     *         </p>
     */
    public String getCustomVerificationEmailTemplateName() {
        return customVerificationEmailTemplateName;
    }

    /**
     * <p>
     * Indicates that the provided custom verification email template with the
     * specified template name already exists.
     * </p>
     *
     * @param customVerificationEmailTemplateName <p>
     *            Indicates that the provided custom verification email template
     *            with the specified template name already exists.
     *            </p>
     */
    public void setCustomVerificationEmailTemplateName(String customVerificationEmailTemplateName) {
        this.customVerificationEmailTemplateName = customVerificationEmailTemplateName;
    }
}
