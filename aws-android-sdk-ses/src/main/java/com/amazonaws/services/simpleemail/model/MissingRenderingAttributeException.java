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
 * Indicates that one or more of the replacement values for the specified
 * template was not specified. Ensure that the TemplateData object contains
 * references to all of the replacement tags in the specified template.
 * </p>
 */
public class MissingRenderingAttributeException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String templateName;

    /**
     * Constructs a new MissingRenderingAttributeException with the specified
     * error message.
     *
     * @param message Describes the error encountered.
     */
    public MissingRenderingAttributeException(String message) {
        super(message);
    }

    /**
     * Returns the value of the templateName property for this object.
     *
     * @return The value of the templateName property for this object.
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Sets the value of templateName
     *
     * @param templateName The new value for the templateName property for this
     *            object.
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }
}
