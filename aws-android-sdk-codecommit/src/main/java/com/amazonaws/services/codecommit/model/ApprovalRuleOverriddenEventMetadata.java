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

package com.amazonaws.services.codecommit.model;

import java.io.Serializable;

/**
 * <p>
 * Returns information about an override event for approval rules for a pull
 * request.
 * </p>
 */
public class ApprovalRuleOverriddenEventMetadata implements Serializable {
    /**
     * <p>
     * The revision ID of the pull request when the override event occurred.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * The status of the override event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERRIDE, REVOKE
     */
    private String overrideStatus;

    /**
     * <p>
     * The revision ID of the pull request when the override event occurred.
     * </p>
     *
     * @return <p>
     *         The revision ID of the pull request when the override event
     *         occurred.
     *         </p>
     */
    public String getRevisionId() {
        return revisionId;
    }

    /**
     * <p>
     * The revision ID of the pull request when the override event occurred.
     * </p>
     *
     * @param revisionId <p>
     *            The revision ID of the pull request when the override event
     *            occurred.
     *            </p>
     */
    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The revision ID of the pull request when the override event occurred.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revisionId <p>
     *            The revision ID of the pull request when the override event
     *            occurred.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApprovalRuleOverriddenEventMetadata withRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }

    /**
     * <p>
     * The status of the override event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERRIDE, REVOKE
     *
     * @return <p>
     *         The status of the override event.
     *         </p>
     * @see OverrideStatus
     */
    public String getOverrideStatus() {
        return overrideStatus;
    }

    /**
     * <p>
     * The status of the override event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERRIDE, REVOKE
     *
     * @param overrideStatus <p>
     *            The status of the override event.
     *            </p>
     * @see OverrideStatus
     */
    public void setOverrideStatus(String overrideStatus) {
        this.overrideStatus = overrideStatus;
    }

    /**
     * <p>
     * The status of the override event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERRIDE, REVOKE
     *
     * @param overrideStatus <p>
     *            The status of the override event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OverrideStatus
     */
    public ApprovalRuleOverriddenEventMetadata withOverrideStatus(String overrideStatus) {
        this.overrideStatus = overrideStatus;
        return this;
    }

    /**
     * <p>
     * The status of the override event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERRIDE, REVOKE
     *
     * @param overrideStatus <p>
     *            The status of the override event.
     *            </p>
     * @see OverrideStatus
     */
    public void setOverrideStatus(OverrideStatus overrideStatus) {
        this.overrideStatus = overrideStatus.toString();
    }

    /**
     * <p>
     * The status of the override event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OVERRIDE, REVOKE
     *
     * @param overrideStatus <p>
     *            The status of the override event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OverrideStatus
     */
    public ApprovalRuleOverriddenEventMetadata withOverrideStatus(OverrideStatus overrideStatus) {
        this.overrideStatus = overrideStatus.toString();
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
        if (getRevisionId() != null)
            sb.append("revisionId: " + getRevisionId() + ",");
        if (getOverrideStatus() != null)
            sb.append("overrideStatus: " + getOverrideStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        hashCode = prime * hashCode
                + ((getOverrideStatus() == null) ? 0 : getOverrideStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApprovalRuleOverriddenEventMetadata == false)
            return false;
        ApprovalRuleOverriddenEventMetadata other = (ApprovalRuleOverriddenEventMetadata) obj;

        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null
                && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        if (other.getOverrideStatus() == null ^ this.getOverrideStatus() == null)
            return false;
        if (other.getOverrideStatus() != null
                && other.getOverrideStatus().equals(this.getOverrideStatus()) == false)
            return false;
        return true;
    }
}
