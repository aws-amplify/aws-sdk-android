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

public class ListAssociatedApprovalRuleTemplatesForRepositoryResult implements Serializable {
    /**
     * <p>
     * The names of all approval rule templates associated with the repository.
     * </p>
     */
    private java.util.List<String> approvalRuleTemplateNames;

    /**
     * <p>
     * An enumeration token that allows the operation to batch the next results
     * of the operation.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The names of all approval rule templates associated with the repository.
     * </p>
     *
     * @return <p>
     *         The names of all approval rule templates associated with the
     *         repository.
     *         </p>
     */
    public java.util.List<String> getApprovalRuleTemplateNames() {
        return approvalRuleTemplateNames;
    }

    /**
     * <p>
     * The names of all approval rule templates associated with the repository.
     * </p>
     *
     * @param approvalRuleTemplateNames <p>
     *            The names of all approval rule templates associated with the
     *            repository.
     *            </p>
     */
    public void setApprovalRuleTemplateNames(java.util.Collection<String> approvalRuleTemplateNames) {
        if (approvalRuleTemplateNames == null) {
            this.approvalRuleTemplateNames = null;
            return;
        }

        this.approvalRuleTemplateNames = new java.util.ArrayList<String>(approvalRuleTemplateNames);
    }

    /**
     * <p>
     * The names of all approval rule templates associated with the repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approvalRuleTemplateNames <p>
     *            The names of all approval rule templates associated with the
     *            repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAssociatedApprovalRuleTemplatesForRepositoryResult withApprovalRuleTemplateNames(
            String... approvalRuleTemplateNames) {
        if (getApprovalRuleTemplateNames() == null) {
            this.approvalRuleTemplateNames = new java.util.ArrayList<String>(
                    approvalRuleTemplateNames.length);
        }
        for (String value : approvalRuleTemplateNames) {
            this.approvalRuleTemplateNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of all approval rule templates associated with the repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approvalRuleTemplateNames <p>
     *            The names of all approval rule templates associated with the
     *            repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAssociatedApprovalRuleTemplatesForRepositoryResult withApprovalRuleTemplateNames(
            java.util.Collection<String> approvalRuleTemplateNames) {
        setApprovalRuleTemplateNames(approvalRuleTemplateNames);
        return this;
    }

    /**
     * <p>
     * An enumeration token that allows the operation to batch the next results
     * of the operation.
     * </p>
     *
     * @return <p>
     *         An enumeration token that allows the operation to batch the next
     *         results of the operation.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * An enumeration token that allows the operation to batch the next results
     * of the operation.
     * </p>
     *
     * @param nextToken <p>
     *            An enumeration token that allows the operation to batch the
     *            next results of the operation.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that allows the operation to batch the next results
     * of the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            An enumeration token that allows the operation to batch the
     *            next results of the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAssociatedApprovalRuleTemplatesForRepositoryResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getApprovalRuleTemplateNames() != null)
            sb.append("approvalRuleTemplateNames: " + getApprovalRuleTemplateNames() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getApprovalRuleTemplateNames() == null) ? 0 : getApprovalRuleTemplateNames()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAssociatedApprovalRuleTemplatesForRepositoryResult == false)
            return false;
        ListAssociatedApprovalRuleTemplatesForRepositoryResult other = (ListAssociatedApprovalRuleTemplatesForRepositoryResult) obj;

        if (other.getApprovalRuleTemplateNames() == null
                ^ this.getApprovalRuleTemplateNames() == null)
            return false;
        if (other.getApprovalRuleTemplateNames() != null
                && other.getApprovalRuleTemplateNames().equals(this.getApprovalRuleTemplateNames()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
