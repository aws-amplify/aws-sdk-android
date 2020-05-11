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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class GetPasswordDataResult implements Serializable {
    /**
     * <p>
     * The ID of the Windows instance.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The password of the instance. Returns an empty string if the password is
     * not available.
     * </p>
     */
    private String passwordData;

    /**
     * <p>
     * The time the data was last updated.
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * The ID of the Windows instance.
     * </p>
     *
     * @return <p>
     *         The ID of the Windows instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the Windows instance.
     * </p>
     *
     * @param instanceId <p>
     *            The ID of the Windows instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the Windows instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceId <p>
     *            The ID of the Windows instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPasswordDataResult withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The password of the instance. Returns an empty string if the password is
     * not available.
     * </p>
     *
     * @return <p>
     *         The password of the instance. Returns an empty string if the
     *         password is not available.
     *         </p>
     */
    public String getPasswordData() {
        return passwordData;
    }

    /**
     * <p>
     * The password of the instance. Returns an empty string if the password is
     * not available.
     * </p>
     *
     * @param passwordData <p>
     *            The password of the instance. Returns an empty string if the
     *            password is not available.
     *            </p>
     */
    public void setPasswordData(String passwordData) {
        this.passwordData = passwordData;
    }

    /**
     * <p>
     * The password of the instance. Returns an empty string if the password is
     * not available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param passwordData <p>
     *            The password of the instance. Returns an empty string if the
     *            password is not available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPasswordDataResult withPasswordData(String passwordData) {
        this.passwordData = passwordData;
        return this;
    }

    /**
     * <p>
     * The time the data was last updated.
     * </p>
     *
     * @return <p>
     *         The time the data was last updated.
     *         </p>
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * The time the data was last updated.
     * </p>
     *
     * @param timestamp <p>
     *            The time the data was last updated.
     *            </p>
     */
    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time the data was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            The time the data was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPasswordDataResult withTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getPasswordData() != null)
            sb.append("PasswordData: " + getPasswordData() + ",");
        if (getTimestamp() != null)
            sb.append("Timestamp: " + getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getPasswordData() == null) ? 0 : getPasswordData().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPasswordDataResult == false)
            return false;
        GetPasswordDataResult other = (GetPasswordDataResult) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getPasswordData() == null ^ this.getPasswordData() == null)
            return false;
        if (other.getPasswordData() != null
                && other.getPasswordData().equals(this.getPasswordData()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }
}
