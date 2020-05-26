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
 * Dashboard error.
 * </p>
 */
public class DashboardError implements Serializable {
    /**
     * <p>
     * Type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCESS_DENIED, SOURCE_NOT_FOUND,
     * DATA_SET_NOT_FOUND, INTERNAL_FAILURE, PARAMETER_VALUE_INCOMPATIBLE,
     * PARAMETER_TYPE_INVALID, PARAMETER_NOT_FOUND, COLUMN_TYPE_MISMATCH,
     * COLUMN_GEOGRAPHIC_ROLE_MISMATCH, COLUMN_REPLACEMENT_MISSING
     */
    private String type;

    /**
     * <p>
     * Message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String message;

    /**
     * <p>
     * Type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCESS_DENIED, SOURCE_NOT_FOUND,
     * DATA_SET_NOT_FOUND, INTERNAL_FAILURE, PARAMETER_VALUE_INCOMPATIBLE,
     * PARAMETER_TYPE_INVALID, PARAMETER_NOT_FOUND, COLUMN_TYPE_MISMATCH,
     * COLUMN_GEOGRAPHIC_ROLE_MISMATCH, COLUMN_REPLACEMENT_MISSING
     *
     * @return <p>
     *         Type.
     *         </p>
     * @see DashboardErrorType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCESS_DENIED, SOURCE_NOT_FOUND,
     * DATA_SET_NOT_FOUND, INTERNAL_FAILURE, PARAMETER_VALUE_INCOMPATIBLE,
     * PARAMETER_TYPE_INVALID, PARAMETER_NOT_FOUND, COLUMN_TYPE_MISMATCH,
     * COLUMN_GEOGRAPHIC_ROLE_MISMATCH, COLUMN_REPLACEMENT_MISSING
     *
     * @param type <p>
     *            Type.
     *            </p>
     * @see DashboardErrorType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCESS_DENIED, SOURCE_NOT_FOUND,
     * DATA_SET_NOT_FOUND, INTERNAL_FAILURE, PARAMETER_VALUE_INCOMPATIBLE,
     * PARAMETER_TYPE_INVALID, PARAMETER_NOT_FOUND, COLUMN_TYPE_MISMATCH,
     * COLUMN_GEOGRAPHIC_ROLE_MISMATCH, COLUMN_REPLACEMENT_MISSING
     *
     * @param type <p>
     *            Type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DashboardErrorType
     */
    public DashboardError withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCESS_DENIED, SOURCE_NOT_FOUND,
     * DATA_SET_NOT_FOUND, INTERNAL_FAILURE, PARAMETER_VALUE_INCOMPATIBLE,
     * PARAMETER_TYPE_INVALID, PARAMETER_NOT_FOUND, COLUMN_TYPE_MISMATCH,
     * COLUMN_GEOGRAPHIC_ROLE_MISMATCH, COLUMN_REPLACEMENT_MISSING
     *
     * @param type <p>
     *            Type.
     *            </p>
     * @see DashboardErrorType
     */
    public void setType(DashboardErrorType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCESS_DENIED, SOURCE_NOT_FOUND,
     * DATA_SET_NOT_FOUND, INTERNAL_FAILURE, PARAMETER_VALUE_INCOMPATIBLE,
     * PARAMETER_TYPE_INVALID, PARAMETER_NOT_FOUND, COLUMN_TYPE_MISMATCH,
     * COLUMN_GEOGRAPHIC_ROLE_MISMATCH, COLUMN_REPLACEMENT_MISSING
     *
     * @param type <p>
     *            Type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DashboardErrorType
     */
    public DashboardError withType(DashboardErrorType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         Message.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * Message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param message <p>
     *            Message.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param message <p>
     *            Message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DashboardError withMessage(String message) {
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

        if (obj instanceof DashboardError == false)
            return false;
        DashboardError other = (DashboardError) obj;

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
