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
package com.amazonaws.services.s3-control.model;

import java.io.Serializable;


/**
 * <p/>
 */
public class S3Retention implements Serializable {
    /**
     * <p>The date when the applied Object Retention will expire on all objects in the Batch Operations job.</p>
     */
    private java.util.Date retainUntilDate;

    /**
     * <p>The Retention mode to be applied to all objects in the Batch Operations job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANCE, GOVERNANCE
     */
    private String mode;

    /**
     * <p>The date when the applied Object Retention will expire on all objects in the Batch Operations job.</p>
     *
     * @return <p>The date when the applied Object Retention will expire on all objects in the Batch Operations job.</p>
     */
    public java.util.Date getRetainUntilDate() {
        return retainUntilDate;
    }

    /**
     * <p>The date when the applied Object Retention will expire on all objects in the Batch Operations job.</p>
     *
     * @param retainUntilDate <p>The date when the applied Object Retention will expire on all objects in the Batch Operations job.</p>
     */
    public void setRetainUntilDate(java.util.Date retainUntilDate) {
        this.retainUntilDate = retainUntilDate;
    }

    /**
     * <p>The date when the applied Object Retention will expire on all objects in the Batch Operations job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param retainUntilDate <p>The date when the applied Object Retention will expire on all objects in the Batch Operations job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3Retention withRetainUntilDate(java.util.Date retainUntilDate) {
        this.retainUntilDate = retainUntilDate;
        return this;
    }

    /**
     * <p>The Retention mode to be applied to all objects in the Batch Operations job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANCE, GOVERNANCE
     *
     * @return <p>The Retention mode to be applied to all objects in the Batch Operations job.</p>
     *
     * @see S3ObjectLockRetentionMode
     */
    public String getMode() {
        return mode;
    }

    /**
     * <p>The Retention mode to be applied to all objects in the Batch Operations job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANCE, GOVERNANCE
     *
     * @param mode <p>The Retention mode to be applied to all objects in the Batch Operations job.</p>
     *
     * @see S3ObjectLockRetentionMode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>The Retention mode to be applied to all objects in the Batch Operations job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANCE, GOVERNANCE
     *
     * @param mode <p>The Retention mode to be applied to all objects in the Batch Operations job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see S3ObjectLockRetentionMode
     */
    public S3Retention withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * <p>The Retention mode to be applied to all objects in the Batch Operations job.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANCE, GOVERNANCE
     *
     * @param mode <p>The Retention mode to be applied to all objects in the Batch Operations job.</p>
     *
     * @see S3ObjectLockRetentionMode
     */
    public void setMode(S3ObjectLockRetentionMode mode) {
        this.mode = mode.toString();
    }

    /**
     * <p>The Retention mode to be applied to all objects in the Batch Operations job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANCE, GOVERNANCE
     *
     * @param mode <p>The Retention mode to be applied to all objects in the Batch Operations job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see S3ObjectLockRetentionMode
     */
    public S3Retention withMode(S3ObjectLockRetentionMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRetainUntilDate() != null) sb.append("RetainUntilDate: " + getRetainUntilDate() + ",");
        if (getMode() != null) sb.append("Mode: " + getMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRetainUntilDate() == null) ? 0 : getRetainUntilDate().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof S3Retention == false) return false;
        S3Retention other = (S3Retention)obj;

        if (other.getRetainUntilDate() == null ^ this.getRetainUntilDate() == null) return false;
        if (other.getRetainUntilDate() != null && other.getRetainUntilDate().equals(this.getRetainUntilDate()) == false) return false;
        if (other.getMode() == null ^ this.getMode() == null) return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false) return false;
        return true;
    }
}
