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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * A Retention configuration for an object.
 * </p>
 */
public class ObjectLockRetention implements Serializable {
    /**
     * <p>
     * Indicates the Retention mode for the specified object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     */
    private String mode;

    /**
     * <p>
     * The date on which this Object Lock Retention will expire.
     * </p>
     */
    private java.util.Date retainUntilDate;

    /**
     * <p>
     * Indicates the Retention mode for the specified object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     *
     * @return <p>
     *         Indicates the Retention mode for the specified object.
     *         </p>
     * @see ObjectLockRetentionMode
     */
    public String getMode() {
        return mode;
    }

    /**
     * <p>
     * Indicates the Retention mode for the specified object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     *
     * @param mode <p>
     *            Indicates the Retention mode for the specified object.
     *            </p>
     * @see ObjectLockRetentionMode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * Indicates the Retention mode for the specified object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     *
     * @param mode <p>
     *            Indicates the Retention mode for the specified object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectLockRetentionMode
     */
    public ObjectLockRetention withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * <p>
     * Indicates the Retention mode for the specified object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     *
     * @param mode <p>
     *            Indicates the Retention mode for the specified object.
     *            </p>
     * @see ObjectLockRetentionMode
     */
    public void setMode(ObjectLockRetentionMode mode) {
        this.mode = mode.toString();
    }

    /**
     * <p>
     * Indicates the Retention mode for the specified object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GOVERNANCE, COMPLIANCE
     *
     * @param mode <p>
     *            Indicates the Retention mode for the specified object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectLockRetentionMode
     */
    public ObjectLockRetention withMode(ObjectLockRetentionMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * The date on which this Object Lock Retention will expire.
     * </p>
     *
     * @return <p>
     *         The date on which this Object Lock Retention will expire.
     *         </p>
     */
    public java.util.Date getRetainUntilDate() {
        return retainUntilDate;
    }

    /**
     * <p>
     * The date on which this Object Lock Retention will expire.
     * </p>
     *
     * @param retainUntilDate <p>
     *            The date on which this Object Lock Retention will expire.
     *            </p>
     */
    public void setRetainUntilDate(java.util.Date retainUntilDate) {
        this.retainUntilDate = retainUntilDate;
    }

    /**
     * <p>
     * The date on which this Object Lock Retention will expire.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param retainUntilDate <p>
     *            The date on which this Object Lock Retention will expire.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ObjectLockRetention withRetainUntilDate(java.util.Date retainUntilDate) {
        this.retainUntilDate = retainUntilDate;
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
        if (getMode() != null)
            sb.append("Mode: " + getMode() + ",");
        if (getRetainUntilDate() != null)
            sb.append("RetainUntilDate: " + getRetainUntilDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode
                + ((getRetainUntilDate() == null) ? 0 : getRetainUntilDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ObjectLockRetention == false)
            return false;
        ObjectLockRetention other = (ObjectLockRetention) obj;

        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getRetainUntilDate() == null ^ this.getRetainUntilDate() == null)
            return false;
        if (other.getRetainUntilDate() != null
                && other.getRetainUntilDate().equals(this.getRetainUntilDate()) == false)
            return false;
        return true;
    }
}
