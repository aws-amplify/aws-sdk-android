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

package com.amazonaws.services.accessanalyzer.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Validation exception error.
 * </p>
 */
public class ValidationException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * A list of fields that didn't validate.
     * </p>
     */
    private java.util.List<ValidationExceptionField> fieldList;

    /**
     * <p>
     * The reason for the exception.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cannotParse, fieldValidationFailed, other,
     * unknownOperation
     */
    private String reason;

    /**
     * Constructs a new ValidationException with the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public ValidationException(String message) {
        super(message);
    }

    /**
     * <p>
     * A list of fields that didn't validate.
     * </p>
     *
     * @return <p>
     *         A list of fields that didn't validate.
     *         </p>
     */
    public java.util.List<ValidationExceptionField> getFieldList() {
        return fieldList;
    }

    /**
     * <p>
     * A list of fields that didn't validate.
     * </p>
     *
     * @param fieldList <p>
     *            A list of fields that didn't validate.
     *            </p>
     */
    public void setFieldList(java.util.Collection<ValidationExceptionField> fieldList) {
        this.fieldList = fieldList == null ? null
                : new java.util.ArrayList<ValidationExceptionField>(fieldList);
    }

    /**
     * <p>
     * The reason for the exception.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cannotParse, fieldValidationFailed, other,
     * unknownOperation
     *
     * @return <p>
     *         The reason for the exception.
     *         </p>
     * @see ValidationExceptionReason
     */
    public String getReason() {
        return reason;
    }

    /**
     * <p>
     * The reason for the exception.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>cannotParse, fieldValidationFailed, other,
     * unknownOperation
     *
     * @param reason <p>
     *            The reason for the exception.
     *            </p>
     * @see ValidationExceptionReason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }
}
