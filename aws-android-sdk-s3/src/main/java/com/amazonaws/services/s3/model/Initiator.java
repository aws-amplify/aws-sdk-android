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
 * Container element that identifies who initiated the multipart upload.
 * </p>
 */
public class Initiator implements Serializable {
    /**
     * <p>
     * If the principal is an AWS account, it provides the Canonical User ID. If
     * the principal is an IAM User, it provides a user ARN value.
     * </p>
     */
    private String iD;

    /**
     * <p>
     * Name of the Principal.
     * </p>
     */
    private String displayName;

    /**
     * <p>
     * If the principal is an AWS account, it provides the Canonical User ID. If
     * the principal is an IAM User, it provides a user ARN value.
     * </p>
     *
     * @return <p>
     *         If the principal is an AWS account, it provides the Canonical
     *         User ID. If the principal is an IAM User, it provides a user ARN
     *         value.
     *         </p>
     */
    public String getID() {
        return iD;
    }

    /**
     * <p>
     * If the principal is an AWS account, it provides the Canonical User ID. If
     * the principal is an IAM User, it provides a user ARN value.
     * </p>
     *
     * @param iD <p>
     *            If the principal is an AWS account, it provides the Canonical
     *            User ID. If the principal is an IAM User, it provides a user
     *            ARN value.
     *            </p>
     */
    public void setID(String iD) {
        this.iD = iD;
    }

    /**
     * <p>
     * If the principal is an AWS account, it provides the Canonical User ID. If
     * the principal is an IAM User, it provides a user ARN value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iD <p>
     *            If the principal is an AWS account, it provides the Canonical
     *            User ID. If the principal is an IAM User, it provides a user
     *            ARN value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Initiator withID(String iD) {
        this.iD = iD;
        return this;
    }

    /**
     * <p>
     * Name of the Principal.
     * </p>
     *
     * @return <p>
     *         Name of the Principal.
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * Name of the Principal.
     * </p>
     *
     * @param displayName <p>
     *            Name of the Principal.
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * Name of the Principal.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param displayName <p>
     *            Name of the Principal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Initiator withDisplayName(String displayName) {
        this.displayName = displayName;
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
        if (getID() != null)
            sb.append("ID: " + getID() + ",");
        if (getDisplayName() != null)
            sb.append("DisplayName: " + getDisplayName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getID() == null) ? 0 : getID().hashCode());
        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Initiator == false)
            return false;
        Initiator other = (Initiator) obj;

        if (other.getID() == null ^ this.getID() == null)
            return false;
        if (other.getID() != null && other.getID().equals(this.getID()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null
                && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        return true;
    }
}
