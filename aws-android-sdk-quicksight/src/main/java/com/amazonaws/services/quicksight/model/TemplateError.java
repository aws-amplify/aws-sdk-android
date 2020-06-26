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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * List of errors that occurred when the template version creation failed.
 * </p>
 */
public class TemplateError implements Serializable {
    /**
     * <p>
     * Type of error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOURCE_NOT_FOUND, DATA_SET_NOT_FOUND,
     * INTERNAL_FAILURE
     */
    private String type;

    /**
     * <p>
     * Description of the error type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String message;

    /**
     * <p>
     * Type of error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOURCE_NOT_FOUND, DATA_SET_NOT_FOUND,
     * INTERNAL_FAILURE
     *
     * @return <p>
     *         Type of error.
     *         </p>
     * @see TemplateErrorType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Type of error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOURCE_NOT_FOUND, DATA_SET_NOT_FOUND,
     * INTERNAL_FAILURE
     *
     * @param type <p>
     *            Type of error.
     *            </p>
     * @see TemplateErrorType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type of error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOURCE_NOT_FOUND, DATA_SET_NOT_FOUND,
     * INTERNAL_FAILURE
     *
     * @param type <p>
     *            Type of error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TemplateErrorType
     */
    public TemplateError withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Type of error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOURCE_NOT_FOUND, DATA_SET_NOT_FOUND,
     * INTERNAL_FAILURE
     *
     * @param type <p>
     *            Type of error.
     *            </p>
     * @see TemplateErrorType
     */
    public void setType(TemplateErrorType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Type of error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOURCE_NOT_FOUND, DATA_SET_NOT_FOUND,
     * INTERNAL_FAILURE
     *
     * @param type <p>
     *            Type of error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TemplateErrorType
     */
    public TemplateError withType(TemplateErrorType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Description of the error type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         Description of the error type.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * Description of the error type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param message <p>
     *            Description of the error type.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Description of the error type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param message <p>
     *            Description of the error type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateError == false)
            return false;
        TemplateError other = (TemplateError) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }
}
