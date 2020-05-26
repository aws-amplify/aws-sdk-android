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
 * Error information for the data source creation or update.
 * </p>
 */
public class DataSourceErrorInfo implements Serializable {
    /**
     * <p>
     * Error type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TIMEOUT, ENGINE_VERSION_NOT_SUPPORTED,
     * UNKNOWN_HOST, GENERIC_SQL_FAILURE, CONFLICT, UNKNOWN
     */
    private String type;

    /**
     * <p>
     * Error message.
     * </p>
     */
    private String message;

    /**
     * <p>
     * Error type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TIMEOUT, ENGINE_VERSION_NOT_SUPPORTED,
     * UNKNOWN_HOST, GENERIC_SQL_FAILURE, CONFLICT, UNKNOWN
     *
     * @return <p>
     *         Error type.
     *         </p>
     * @see DataSourceErrorInfoType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Error type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TIMEOUT, ENGINE_VERSION_NOT_SUPPORTED,
     * UNKNOWN_HOST, GENERIC_SQL_FAILURE, CONFLICT, UNKNOWN
     *
     * @param type <p>
     *            Error type.
     *            </p>
     * @see DataSourceErrorInfoType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Error type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TIMEOUT, ENGINE_VERSION_NOT_SUPPORTED,
     * UNKNOWN_HOST, GENERIC_SQL_FAILURE, CONFLICT, UNKNOWN
     *
     * @param type <p>
     *            Error type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataSourceErrorInfoType
     */
    public DataSourceErrorInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Error type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TIMEOUT, ENGINE_VERSION_NOT_SUPPORTED,
     * UNKNOWN_HOST, GENERIC_SQL_FAILURE, CONFLICT, UNKNOWN
     *
     * @param type <p>
     *            Error type.
     *            </p>
     * @see DataSourceErrorInfoType
     */
    public void setType(DataSourceErrorInfoType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Error type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TIMEOUT, ENGINE_VERSION_NOT_SUPPORTED,
     * UNKNOWN_HOST, GENERIC_SQL_FAILURE, CONFLICT, UNKNOWN
     *
     * @param type <p>
     *            Error type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataSourceErrorInfoType
     */
    public DataSourceErrorInfo withType(DataSourceErrorInfoType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Error message.
     * </p>
     *
     * @return <p>
     *         Error message.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * Error message.
     * </p>
     *
     * @param message <p>
     *            Error message.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Error message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            Error message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceErrorInfo withMessage(String message) {
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

        if (obj instanceof DataSourceErrorInfo == false)
            return false;
        DataSourceErrorInfo other = (DataSourceErrorInfo) obj;

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
