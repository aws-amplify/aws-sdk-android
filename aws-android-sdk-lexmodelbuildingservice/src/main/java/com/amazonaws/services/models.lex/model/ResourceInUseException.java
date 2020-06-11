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

package com.amazonaws.services.models.lex.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The resource that you are attempting to delete is referred to by another
 * resource. Use this information to remove references to the resource that you
 * are trying to delete.
 * </p>
 * <p>
 * The body of the exception contains a JSON object that describes the resource.
 * </p>
 * <p>
 * <code>{ "resourceType": BOT | BOTALIAS | BOTCHANNEL | INTENT,</code>
 * </p>
 * <p>
 * <code>"resourceReference": {</code>
 * </p>
 * <p>
 * <code>"name": <i>string</i>, "version": <i>string</i> } }</code>
 * </p>
 */
public class ResourceInUseException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private String referenceType;

    /**
     * <p>
     * Describes the resource that refers to the resource that you are
     * attempting to delete. This object is returned as part of the
     * <code>ResourceInUseException</code> exception.
     * </p>
     */
    private ResourceReference exampleReference;

    /**
     * Constructs a new ResourceInUseException with the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public ResourceInUseException(String message) {
        super(message);
    }

    /**
     * Returns the value of the referenceType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Intent, Bot, BotAlias, BotChannel
     *
     * @return The value of the referenceType property for this object.
     * @see ReferenceType
     */
    public String getReferenceType() {
        return referenceType;
    }

    /**
     * Sets the value of referenceType
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Intent, Bot, BotAlias, BotChannel
     *
     * @param referenceType The new value for the referenceType property for
     *            this object.
     * @see ReferenceType
     */
    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }

    /**
     * <p>
     * Describes the resource that refers to the resource that you are
     * attempting to delete. This object is returned as part of the
     * <code>ResourceInUseException</code> exception.
     * </p>
     *
     * @return <p>
     *         Describes the resource that refers to the resource that you are
     *         attempting to delete. This object is returned as part of the
     *         <code>ResourceInUseException</code> exception.
     *         </p>
     */
    public ResourceReference getExampleReference() {
        return exampleReference;
    }

    /**
     * <p>
     * Describes the resource that refers to the resource that you are
     * attempting to delete. This object is returned as part of the
     * <code>ResourceInUseException</code> exception.
     * </p>
     *
     * @param exampleReference <p>
     *            Describes the resource that refers to the resource that you
     *            are attempting to delete. This object is returned as part of
     *            the <code>ResourceInUseException</code> exception.
     *            </p>
     */
    public void setExampleReference(ResourceReference exampleReference) {
        this.exampleReference = exampleReference;
    }
}
