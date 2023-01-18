/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about why a property is not valid.
 * </p>
 */
public class PropertyValidationExceptionProperty implements Serializable {
    /**
     * <p>
     * The full property path.
     * </p>
     */
    private String propertyPath;

    /**
     * <p>
     * Why the property is not valid.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID_FORMAT, UNIQUE_CONSTRAINT_VIOLATED,
     * REFERENCED_RESOURCE_NOT_FOUND, RESOURCE_NAME_ALREADY_EXISTS,
     * REQUIRED_PROPERTY_MISSING, NOT_SUPPORTED
     */
    private String reason;

    /**
     * <p>
     * A message describing why the property is not valid.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The full property path.
     * </p>
     *
     * @return <p>
     *         The full property path.
     *         </p>
     */
    public String getPropertyPath() {
        return propertyPath;
    }

    /**
     * <p>
     * The full property path.
     * </p>
     *
     * @param propertyPath <p>
     *            The full property path.
     *            </p>
     */
    public void setPropertyPath(String propertyPath) {
        this.propertyPath = propertyPath;
    }

    /**
     * <p>
     * The full property path.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param propertyPath <p>
     *            The full property path.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PropertyValidationExceptionProperty withPropertyPath(String propertyPath) {
        this.propertyPath = propertyPath;
        return this;
    }

    /**
     * <p>
     * Why the property is not valid.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID_FORMAT, UNIQUE_CONSTRAINT_VIOLATED,
     * REFERENCED_RESOURCE_NOT_FOUND, RESOURCE_NAME_ALREADY_EXISTS,
     * REQUIRED_PROPERTY_MISSING, NOT_SUPPORTED
     *
     * @return <p>
     *         Why the property is not valid.
     *         </p>
     * @see PropertyValidationExceptionReason
     */
    public String getReason() {
        return reason;
    }

    /**
     * <p>
     * Why the property is not valid.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID_FORMAT, UNIQUE_CONSTRAINT_VIOLATED,
     * REFERENCED_RESOURCE_NOT_FOUND, RESOURCE_NAME_ALREADY_EXISTS,
     * REQUIRED_PROPERTY_MISSING, NOT_SUPPORTED
     *
     * @param reason <p>
     *            Why the property is not valid.
     *            </p>
     * @see PropertyValidationExceptionReason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * Why the property is not valid.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID_FORMAT, UNIQUE_CONSTRAINT_VIOLATED,
     * REFERENCED_RESOURCE_NOT_FOUND, RESOURCE_NAME_ALREADY_EXISTS,
     * REQUIRED_PROPERTY_MISSING, NOT_SUPPORTED
     *
     * @param reason <p>
     *            Why the property is not valid.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PropertyValidationExceptionReason
     */
    public PropertyValidationExceptionProperty withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * <p>
     * Why the property is not valid.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID_FORMAT, UNIQUE_CONSTRAINT_VIOLATED,
     * REFERENCED_RESOURCE_NOT_FOUND, RESOURCE_NAME_ALREADY_EXISTS,
     * REQUIRED_PROPERTY_MISSING, NOT_SUPPORTED
     *
     * @param reason <p>
     *            Why the property is not valid.
     *            </p>
     * @see PropertyValidationExceptionReason
     */
    public void setReason(PropertyValidationExceptionReason reason) {
        this.reason = reason.toString();
    }

    /**
     * <p>
     * Why the property is not valid.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID_FORMAT, UNIQUE_CONSTRAINT_VIOLATED,
     * REFERENCED_RESOURCE_NOT_FOUND, RESOURCE_NAME_ALREADY_EXISTS,
     * REQUIRED_PROPERTY_MISSING, NOT_SUPPORTED
     *
     * @param reason <p>
     *            Why the property is not valid.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PropertyValidationExceptionReason
     */
    public PropertyValidationExceptionProperty withReason(PropertyValidationExceptionReason reason) {
        this.reason = reason.toString();
        return this;
    }

    /**
     * <p>
     * A message describing why the property is not valid.
     * </p>
     *
     * @return <p>
     *         A message describing why the property is not valid.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * A message describing why the property is not valid.
     * </p>
     *
     * @param message <p>
     *            A message describing why the property is not valid.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message describing why the property is not valid.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            A message describing why the property is not valid.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PropertyValidationExceptionProperty withMessage(String message) {
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
        if (getPropertyPath() != null)
            sb.append("PropertyPath: " + getPropertyPath() + ",");
        if (getReason() != null)
            sb.append("Reason: " + getReason() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPropertyPath() == null) ? 0 : getPropertyPath().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PropertyValidationExceptionProperty == false)
            return false;
        PropertyValidationExceptionProperty other = (PropertyValidationExceptionProperty) obj;

        if (other.getPropertyPath() == null ^ this.getPropertyPath() == null)
            return false;
        if (other.getPropertyPath() != null
                && other.getPropertyPath().equals(this.getPropertyPath()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }
}
