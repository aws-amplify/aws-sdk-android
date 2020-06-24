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
 * Returns information about an event for an approval rule.
 * </p>
 */
public class ApprovalRuleEventMetadata implements Serializable {
    /**
     * <p>
     * The name of the approval rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String approvalRuleName;

    /**
     * <p>
     * The system-generated ID of the approval rule.
     * </p>
     */
    private String approvalRuleId;

    /**
     * <p>
     * The content of the approval rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3000<br/>
     */
    private String approvalRuleContent;

    /**
     * <p>
     * The name of the approval rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the approval rule.
     *         </p>
     */
    public String getApprovalRuleName() {
        return approvalRuleName;
    }

    /**
     * <p>
     * The name of the approval rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param approvalRuleName <p>
     *            The name of the approval rule.
     *            </p>
     */
    public void setApprovalRuleName(String approvalRuleName) {
        this.approvalRuleName = approvalRuleName;
    }

    /**
     * <p>
     * The name of the approval rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param approvalRuleName <p>
     *            The name of the approval rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApprovalRuleEventMetadata withApprovalRuleName(String approvalRuleName) {
        this.approvalRuleName = approvalRuleName;
        return this;
    }

    /**
     * <p>
     * The system-generated ID of the approval rule.
     * </p>
     *
     * @return <p>
     *         The system-generated ID of the approval rule.
     *         </p>
     */
    public String getApprovalRuleId() {
        return approvalRuleId;
    }

    /**
     * <p>
     * The system-generated ID of the approval rule.
     * </p>
     *
     * @param approvalRuleId <p>
     *            The system-generated ID of the approval rule.
     *            </p>
     */
    public void setApprovalRuleId(String approvalRuleId) {
        this.approvalRuleId = approvalRuleId;
    }

    /**
     * <p>
     * The system-generated ID of the approval rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approvalRuleId <p>
     *            The system-generated ID of the approval rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApprovalRuleEventMetadata withApprovalRuleId(String approvalRuleId) {
        this.approvalRuleId = approvalRuleId;
        return this;
    }

    /**
     * <p>
     * The content of the approval rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3000<br/>
     *
     * @return <p>
     *         The content of the approval rule.
     *         </p>
     */
    public String getApprovalRuleContent() {
        return approvalRuleContent;
    }

    /**
     * <p>
     * The content of the approval rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3000<br/>
     *
     * @param approvalRuleContent <p>
     *            The content of the approval rule.
     *            </p>
     */
    public void setApprovalRuleContent(String approvalRuleContent) {
        this.approvalRuleContent = approvalRuleContent;
    }

    /**
     * <p>
     * The content of the approval rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3000<br/>
     *
     * @param approvalRuleContent <p>
     *            The content of the approval rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApprovalRuleEventMetadata withApprovalRuleContent(String approvalRuleContent) {
        this.approvalRuleContent = approvalRuleContent;
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
        if (getApprovalRuleName() != null)
            sb.append("approvalRuleName: " + getApprovalRuleName() + ",");
        if (getApprovalRuleId() != null)
            sb.append("approvalRuleId: " + getApprovalRuleId() + ",");
        if (getApprovalRuleContent() != null)
            sb.append("approvalRuleContent: " + getApprovalRuleContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApprovalRuleName() == null) ? 0 : getApprovalRuleName().hashCode());
        hashCode = prime * hashCode
                + ((getApprovalRuleId() == null) ? 0 : getApprovalRuleId().hashCode());
        hashCode = prime * hashCode
                + ((getApprovalRuleContent() == null) ? 0 : getApprovalRuleContent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApprovalRuleEventMetadata == false)
            return false;
        ApprovalRuleEventMetadata other = (ApprovalRuleEventMetadata) obj;

        if (other.getApprovalRuleName() == null ^ this.getApprovalRuleName() == null)
            return false;
        if (other.getApprovalRuleName() != null
                && other.getApprovalRuleName().equals(this.getApprovalRuleName()) == false)
            return false;
        if (other.getApprovalRuleId() == null ^ this.getApprovalRuleId() == null)
            return false;
        if (other.getApprovalRuleId() != null
                && other.getApprovalRuleId().equals(this.getApprovalRuleId()) == false)
            return false;
        if (other.getApprovalRuleContent() == null ^ this.getApprovalRuleContent() == null)
            return false;
        if (other.getApprovalRuleContent() != null
                && other.getApprovalRuleContent().equals(this.getApprovalRuleContent()) == false)
            return false;
        return true;
    }
}
