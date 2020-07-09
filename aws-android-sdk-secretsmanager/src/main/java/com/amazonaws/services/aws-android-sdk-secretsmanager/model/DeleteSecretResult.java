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
package com.amazonaws.services.aws-android-sdk-secretsmanager.model;

import java.io.Serializable;


public class DeleteSecretResult implements Serializable {
    /**
     * <p>The ARN of the secret that is now scheduled for deletion.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String aRN;

    /**
     * <p>The friendly name of the secret that is now scheduled for deletion.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String name;

    /**
     * <p>The date and time after which this secret can be deleted by Secrets Manager and can no longer be restored. This value is the date and time of the delete request plus the number of days specified in <code>RecoveryWindowInDays</code>.</p>
     */
    private java.util.Date deletionDate;

    /**
     * <p>The ARN of the secret that is now scheduled for deletion.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>The ARN of the secret that is now scheduled for deletion.</p>
     */
    public String getARN() {
        return aRN;
    }

    /**
     * <p>The ARN of the secret that is now scheduled for deletion.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param aRN <p>The ARN of the secret that is now scheduled for deletion.</p>
     */
    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>The ARN of the secret that is now scheduled for deletion.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param aRN <p>The ARN of the secret that is now scheduled for deletion.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DeleteSecretResult withARN(String aRN) {
        this.aRN = aRN;
        return this;
    }

    /**
     * <p>The friendly name of the secret that is now scheduled for deletion.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>The friendly name of the secret that is now scheduled for deletion.</p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The friendly name of the secret that is now scheduled for deletion.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name <p>The friendly name of the secret that is now scheduled for deletion.</p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The friendly name of the secret that is now scheduled for deletion.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name <p>The friendly name of the secret that is now scheduled for deletion.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DeleteSecretResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>The date and time after which this secret can be deleted by Secrets Manager and can no longer be restored. This value is the date and time of the delete request plus the number of days specified in <code>RecoveryWindowInDays</code>.</p>
     *
     * @return <p>The date and time after which this secret can be deleted by Secrets Manager and can no longer be restored. This value is the date and time of the delete request plus the number of days specified in <code>RecoveryWindowInDays</code>.</p>
     */
    public java.util.Date getDeletionDate() {
        return deletionDate;
    }

    /**
     * <p>The date and time after which this secret can be deleted by Secrets Manager and can no longer be restored. This value is the date and time of the delete request plus the number of days specified in <code>RecoveryWindowInDays</code>.</p>
     *
     * @param deletionDate <p>The date and time after which this secret can be deleted by Secrets Manager and can no longer be restored. This value is the date and time of the delete request plus the number of days specified in <code>RecoveryWindowInDays</code>.</p>
     */
    public void setDeletionDate(java.util.Date deletionDate) {
        this.deletionDate = deletionDate;
    }

    /**
     * <p>The date and time after which this secret can be deleted by Secrets Manager and can no longer be restored. This value is the date and time of the delete request plus the number of days specified in <code>RecoveryWindowInDays</code>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deletionDate <p>The date and time after which this secret can be deleted by Secrets Manager and can no longer be restored. This value is the date and time of the delete request plus the number of days specified in <code>RecoveryWindowInDays</code>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DeleteSecretResult withDeletionDate(java.util.Date deletionDate) {
        this.deletionDate = deletionDate;
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
        if (getARN() != null) sb.append("ARN: " + getARN() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getDeletionDate() != null) sb.append("DeletionDate: " + getDeletionDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDeletionDate() == null) ? 0 : getDeletionDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteSecretResult == false) return false;
        DeleteSecretResult other = (DeleteSecretResult)obj;

        if (other.getARN() == null ^ this.getARN() == null) return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false) return false;
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getDeletionDate() == null ^ this.getDeletionDate() == null) return false;
        if (other.getDeletionDate() != null && other.getDeletionDate().equals(this.getDeletionDate()) == false) return false;
        return true;
    }
}
