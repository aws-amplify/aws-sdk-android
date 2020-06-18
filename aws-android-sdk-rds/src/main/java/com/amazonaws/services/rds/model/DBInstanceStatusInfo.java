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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * Provides a list of status information for a DB instance.
 * </p>
 */
public class DBInstanceStatusInfo implements Serializable {
    /**
     * <p>
     * This value is currently "read replication."
     * </p>
     */
    private String statusType;

    /**
     * <p>
     * Boolean value that is true if the instance is operating normally, or
     * false if the instance is in an error state.
     * </p>
     */
    private Boolean normal;

    /**
     * <p>
     * Status of the DB instance. For a StatusType of read replica, the values
     * can be replicating, replication stop point set, replication stop point
     * reached, error, stopped, or terminated.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Details of the error if there is an error for the instance. If the
     * instance isn't in an error state, this value is blank.
     * </p>
     */
    private String message;

    /**
     * <p>
     * This value is currently "read replication."
     * </p>
     *
     * @return <p>
     *         This value is currently "read replication."
     *         </p>
     */
    public String getStatusType() {
        return statusType;
    }

    /**
     * <p>
     * This value is currently "read replication."
     * </p>
     *
     * @param statusType <p>
     *            This value is currently "read replication."
     *            </p>
     */
    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    /**
     * <p>
     * This value is currently "read replication."
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusType <p>
     *            This value is currently "read replication."
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstanceStatusInfo withStatusType(String statusType) {
        this.statusType = statusType;
        return this;
    }

    /**
     * <p>
     * Boolean value that is true if the instance is operating normally, or
     * false if the instance is in an error state.
     * </p>
     *
     * @return <p>
     *         Boolean value that is true if the instance is operating normally,
     *         or false if the instance is in an error state.
     *         </p>
     */
    public Boolean isNormal() {
        return normal;
    }

    /**
     * <p>
     * Boolean value that is true if the instance is operating normally, or
     * false if the instance is in an error state.
     * </p>
     *
     * @return <p>
     *         Boolean value that is true if the instance is operating normally,
     *         or false if the instance is in an error state.
     *         </p>
     */
    public Boolean getNormal() {
        return normal;
    }

    /**
     * <p>
     * Boolean value that is true if the instance is operating normally, or
     * false if the instance is in an error state.
     * </p>
     *
     * @param normal <p>
     *            Boolean value that is true if the instance is operating
     *            normally, or false if the instance is in an error state.
     *            </p>
     */
    public void setNormal(Boolean normal) {
        this.normal = normal;
    }

    /**
     * <p>
     * Boolean value that is true if the instance is operating normally, or
     * false if the instance is in an error state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param normal <p>
     *            Boolean value that is true if the instance is operating
     *            normally, or false if the instance is in an error state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstanceStatusInfo withNormal(Boolean normal) {
        this.normal = normal;
        return this;
    }

    /**
     * <p>
     * Status of the DB instance. For a StatusType of read replica, the values
     * can be replicating, replication stop point set, replication stop point
     * reached, error, stopped, or terminated.
     * </p>
     *
     * @return <p>
     *         Status of the DB instance. For a StatusType of read replica, the
     *         values can be replicating, replication stop point set,
     *         replication stop point reached, error, stopped, or terminated.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Status of the DB instance. For a StatusType of read replica, the values
     * can be replicating, replication stop point set, replication stop point
     * reached, error, stopped, or terminated.
     * </p>
     *
     * @param status <p>
     *            Status of the DB instance. For a StatusType of read replica,
     *            the values can be replicating, replication stop point set,
     *            replication stop point reached, error, stopped, or terminated.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the DB instance. For a StatusType of read replica, the values
     * can be replicating, replication stop point set, replication stop point
     * reached, error, stopped, or terminated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            Status of the DB instance. For a StatusType of read replica,
     *            the values can be replicating, replication stop point set,
     *            replication stop point reached, error, stopped, or terminated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstanceStatusInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Details of the error if there is an error for the instance. If the
     * instance isn't in an error state, this value is blank.
     * </p>
     *
     * @return <p>
     *         Details of the error if there is an error for the instance. If
     *         the instance isn't in an error state, this value is blank.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * Details of the error if there is an error for the instance. If the
     * instance isn't in an error state, this value is blank.
     * </p>
     *
     * @param message <p>
     *            Details of the error if there is an error for the instance. If
     *            the instance isn't in an error state, this value is blank.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Details of the error if there is an error for the instance. If the
     * instance isn't in an error state, this value is blank.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            Details of the error if there is an error for the instance. If
     *            the instance isn't in an error state, this value is blank.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstanceStatusInfo withMessage(String message) {
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
        if (getStatusType() != null)
            sb.append("StatusType: " + getStatusType() + ",");
        if (getNormal() != null)
            sb.append("Normal: " + getNormal() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatusType() == null) ? 0 : getStatusType().hashCode());
        hashCode = prime * hashCode + ((getNormal() == null) ? 0 : getNormal().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBInstanceStatusInfo == false)
            return false;
        DBInstanceStatusInfo other = (DBInstanceStatusInfo) obj;

        if (other.getStatusType() == null ^ this.getStatusType() == null)
            return false;
        if (other.getStatusType() != null
                && other.getStatusType().equals(this.getStatusType()) == false)
            return false;
        if (other.getNormal() == null ^ this.getNormal() == null)
            return false;
        if (other.getNormal() != null && other.getNormal().equals(this.getNormal()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }
}
