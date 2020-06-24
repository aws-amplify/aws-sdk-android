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

package com.amazonaws.services.organizations.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about a policy type and its status in the associated
 * root.
 * </p>
 */
public class PolicyTypeSummary implements Serializable {
    /**
     * <p>
     * The name of the policy type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_CONTROL_POLICY, TAG_POLICY, BACKUP_POLICY
     */
    private String type;

    /**
     * <p>
     * The status of the policy type as it relates to the associated root. To
     * attach a policy of the specified type to a root or to an OU or account in
     * that root, it must be available in the organization and enabled for that
     * root.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, PENDING_ENABLE, PENDING_DISABLE
     */
    private String status;

    /**
     * <p>
     * The name of the policy type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_CONTROL_POLICY, TAG_POLICY, BACKUP_POLICY
     *
     * @return <p>
     *         The name of the policy type.
     *         </p>
     * @see PolicyType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The name of the policy type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_CONTROL_POLICY, TAG_POLICY, BACKUP_POLICY
     *
     * @param type <p>
     *            The name of the policy type.
     *            </p>
     * @see PolicyType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The name of the policy type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_CONTROL_POLICY, TAG_POLICY, BACKUP_POLICY
     *
     * @param type <p>
     *            The name of the policy type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PolicyType
     */
    public PolicyTypeSummary withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The name of the policy type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_CONTROL_POLICY, TAG_POLICY, BACKUP_POLICY
     *
     * @param type <p>
     *            The name of the policy type.
     *            </p>
     * @see PolicyType
     */
    public void setType(PolicyType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The name of the policy type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_CONTROL_POLICY, TAG_POLICY, BACKUP_POLICY
     *
     * @param type <p>
     *            The name of the policy type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PolicyType
     */
    public PolicyTypeSummary withType(PolicyType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The status of the policy type as it relates to the associated root. To
     * attach a policy of the specified type to a root or to an OU or account in
     * that root, it must be available in the organization and enabled for that
     * root.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, PENDING_ENABLE, PENDING_DISABLE
     *
     * @return <p>
     *         The status of the policy type as it relates to the associated
     *         root. To attach a policy of the specified type to a root or to an
     *         OU or account in that root, it must be available in the
     *         organization and enabled for that root.
     *         </p>
     * @see PolicyTypeStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the policy type as it relates to the associated root. To
     * attach a policy of the specified type to a root or to an OU or account in
     * that root, it must be available in the organization and enabled for that
     * root.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, PENDING_ENABLE, PENDING_DISABLE
     *
     * @param status <p>
     *            The status of the policy type as it relates to the associated
     *            root. To attach a policy of the specified type to a root or to
     *            an OU or account in that root, it must be available in the
     *            organization and enabled for that root.
     *            </p>
     * @see PolicyTypeStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the policy type as it relates to the associated root. To
     * attach a policy of the specified type to a root or to an OU or account in
     * that root, it must be available in the organization and enabled for that
     * root.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, PENDING_ENABLE, PENDING_DISABLE
     *
     * @param status <p>
     *            The status of the policy type as it relates to the associated
     *            root. To attach a policy of the specified type to a root or to
     *            an OU or account in that root, it must be available in the
     *            organization and enabled for that root.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PolicyTypeStatus
     */
    public PolicyTypeSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the policy type as it relates to the associated root. To
     * attach a policy of the specified type to a root or to an OU or account in
     * that root, it must be available in the organization and enabled for that
     * root.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, PENDING_ENABLE, PENDING_DISABLE
     *
     * @param status <p>
     *            The status of the policy type as it relates to the associated
     *            root. To attach a policy of the specified type to a root or to
     *            an OU or account in that root, it must be available in the
     *            organization and enabled for that root.
     *            </p>
     * @see PolicyTypeStatus
     */
    public void setStatus(PolicyTypeStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the policy type as it relates to the associated root. To
     * attach a policy of the specified type to a root or to an OU or account in
     * that root, it must be available in the organization and enabled for that
     * root.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, PENDING_ENABLE, PENDING_DISABLE
     *
     * @param status <p>
     *            The status of the policy type as it relates to the associated
     *            root. To attach a policy of the specified type to a root or to
     *            an OU or account in that root, it must be available in the
     *            organization and enabled for that root.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PolicyTypeStatus
     */
    public PolicyTypeSummary withStatus(PolicyTypeStatus status) {
        this.status = status.toString();
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyTypeSummary == false)
            return false;
        PolicyTypeSummary other = (PolicyTypeSummary) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
