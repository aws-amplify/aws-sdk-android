/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The input failed to meet the constraints specified by the AWS service.
 * </p>
 */
public class ValidationException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The field where the invalid entry was detected.
     * </p>
     */
    private java.util.List<ValidationExceptionField> fieldList;

    /**
     * <p>
     * A message with the reason for the validation exception error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UnknownOperation, Missing, CannotParse,
     * FieldValidationFailed, Other
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
     * The field where the invalid entry was detected.
     * </p>
     *
     * @return <p>
     *         The field where the invalid entry was detected.
     *         </p>
     */
    public java.util.List<ValidationExceptionField> getFieldList() {
        return fieldList;
    }

    /**
     * <p>
     * The field where the invalid entry was detected.
     * </p>
     *
     * @param fieldList <p>
     *            The field where the invalid entry was detected.
     *            </p>
     */
    public void setFieldList(java.util.Collection<ValidationExceptionField> fieldList) {
        this.fieldList = fieldList == null ? null
                : new java.util.ArrayList<ValidationExceptionField>(fieldList);
    }

    /**
     * <p>
     * A message with the reason for the validation exception error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UnknownOperation, Missing, CannotParse,
     * FieldValidationFailed, Other
     *
     * @return <p>
     *         A message with the reason for the validation exception error.
     *         </p>
     * @see ValidationExceptionReason
     */
    public String getReason() {
        return reason;
    }

    /**
     * <p>
     * A message with the reason for the validation exception error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UnknownOperation, Missing, CannotParse,
     * FieldValidationFailed, Other
     *
     * @param reason <p>
     *            A message with the reason for the validation exception error.
     *            </p>
     * @see ValidationExceptionReason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }
}
