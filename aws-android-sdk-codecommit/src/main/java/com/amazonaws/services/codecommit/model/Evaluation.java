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
 * Returns information about the approval rules applied to a pull request and
 * whether conditions have been met.
 * </p>
 */
public class Evaluation implements Serializable {
    /**
     * <p>
     * Whether the state of the pull request is approved.
     * </p>
     */
    private Boolean approved;

    /**
     * <p>
     * Whether the approval rule requirements for the pull request have been
     * overridden and no longer need to be met.
     * </p>
     */
    private Boolean overridden;

    /**
     * <p>
     * The names of the approval rules that have had their conditions met.
     * </p>
     */
    private java.util.List<String> approvalRulesSatisfied;

    /**
     * <p>
     * The names of the approval rules that have not had their conditions met.
     * </p>
     */
    private java.util.List<String> approvalRulesNotSatisfied;

    /**
     * <p>
     * Whether the state of the pull request is approved.
     * </p>
     *
     * @return <p>
     *         Whether the state of the pull request is approved.
     *         </p>
     */
    public Boolean isApproved() {
        return approved;
    }

    /**
     * <p>
     * Whether the state of the pull request is approved.
     * </p>
     *
     * @return <p>
     *         Whether the state of the pull request is approved.
     *         </p>
     */
    public Boolean getApproved() {
        return approved;
    }

    /**
     * <p>
     * Whether the state of the pull request is approved.
     * </p>
     *
     * @param approved <p>
     *            Whether the state of the pull request is approved.
     *            </p>
     */
    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    /**
     * <p>
     * Whether the state of the pull request is approved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approved <p>
     *            Whether the state of the pull request is approved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Evaluation withApproved(Boolean approved) {
        this.approved = approved;
        return this;
    }

    /**
     * <p>
     * Whether the approval rule requirements for the pull request have been
     * overridden and no longer need to be met.
     * </p>
     *
     * @return <p>
     *         Whether the approval rule requirements for the pull request have
     *         been overridden and no longer need to be met.
     *         </p>
     */
    public Boolean isOverridden() {
        return overridden;
    }

    /**
     * <p>
     * Whether the approval rule requirements for the pull request have been
     * overridden and no longer need to be met.
     * </p>
     *
     * @return <p>
     *         Whether the approval rule requirements for the pull request have
     *         been overridden and no longer need to be met.
     *         </p>
     */
    public Boolean getOverridden() {
        return overridden;
    }

    /**
     * <p>
     * Whether the approval rule requirements for the pull request have been
     * overridden and no longer need to be met.
     * </p>
     *
     * @param overridden <p>
     *            Whether the approval rule requirements for the pull request
     *            have been overridden and no longer need to be met.
     *            </p>
     */
    public void setOverridden(Boolean overridden) {
        this.overridden = overridden;
    }

    /**
     * <p>
     * Whether the approval rule requirements for the pull request have been
     * overridden and no longer need to be met.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param overridden <p>
     *            Whether the approval rule requirements for the pull request
     *            have been overridden and no longer need to be met.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Evaluation withOverridden(Boolean overridden) {
        this.overridden = overridden;
        return this;
    }

    /**
     * <p>
     * The names of the approval rules that have had their conditions met.
     * </p>
     *
     * @return <p>
     *         The names of the approval rules that have had their conditions
     *         met.
     *         </p>
     */
    public java.util.List<String> getApprovalRulesSatisfied() {
        return approvalRulesSatisfied;
    }

    /**
     * <p>
     * The names of the approval rules that have had their conditions met.
     * </p>
     *
     * @param approvalRulesSatisfied <p>
     *            The names of the approval rules that have had their conditions
     *            met.
     *            </p>
     */
    public void setApprovalRulesSatisfied(java.util.Collection<String> approvalRulesSatisfied) {
        if (approvalRulesSatisfied == null) {
            this.approvalRulesSatisfied = null;
            return;
        }

        this.approvalRulesSatisfied = new java.util.ArrayList<String>(approvalRulesSatisfied);
    }

    /**
     * <p>
     * The names of the approval rules that have had their conditions met.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approvalRulesSatisfied <p>
     *            The names of the approval rules that have had their conditions
     *            met.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Evaluation withApprovalRulesSatisfied(String... approvalRulesSatisfied) {
        if (getApprovalRulesSatisfied() == null) {
            this.approvalRulesSatisfied = new java.util.ArrayList<String>(
                    approvalRulesSatisfied.length);
        }
        for (String value : approvalRulesSatisfied) {
            this.approvalRulesSatisfied.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of the approval rules that have had their conditions met.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approvalRulesSatisfied <p>
     *            The names of the approval rules that have had their conditions
     *            met.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Evaluation withApprovalRulesSatisfied(java.util.Collection<String> approvalRulesSatisfied) {
        setApprovalRulesSatisfied(approvalRulesSatisfied);
        return this;
    }

    /**
     * <p>
     * The names of the approval rules that have not had their conditions met.
     * </p>
     *
     * @return <p>
     *         The names of the approval rules that have not had their
     *         conditions met.
     *         </p>
     */
    public java.util.List<String> getApprovalRulesNotSatisfied() {
        return approvalRulesNotSatisfied;
    }

    /**
     * <p>
     * The names of the approval rules that have not had their conditions met.
     * </p>
     *
     * @param approvalRulesNotSatisfied <p>
     *            The names of the approval rules that have not had their
     *            conditions met.
     *            </p>
     */
    public void setApprovalRulesNotSatisfied(java.util.Collection<String> approvalRulesNotSatisfied) {
        if (approvalRulesNotSatisfied == null) {
            this.approvalRulesNotSatisfied = null;
            return;
        }

        this.approvalRulesNotSatisfied = new java.util.ArrayList<String>(approvalRulesNotSatisfied);
    }

    /**
     * <p>
     * The names of the approval rules that have not had their conditions met.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approvalRulesNotSatisfied <p>
     *            The names of the approval rules that have not had their
     *            conditions met.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Evaluation withApprovalRulesNotSatisfied(String... approvalRulesNotSatisfied) {
        if (getApprovalRulesNotSatisfied() == null) {
            this.approvalRulesNotSatisfied = new java.util.ArrayList<String>(
                    approvalRulesNotSatisfied.length);
        }
        for (String value : approvalRulesNotSatisfied) {
            this.approvalRulesNotSatisfied.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of the approval rules that have not had their conditions met.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approvalRulesNotSatisfied <p>
     *            The names of the approval rules that have not had their
     *            conditions met.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Evaluation withApprovalRulesNotSatisfied(
            java.util.Collection<String> approvalRulesNotSatisfied) {
        setApprovalRulesNotSatisfied(approvalRulesNotSatisfied);
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
        if (getApproved() != null)
            sb.append("approved: " + getApproved() + ",");
        if (getOverridden() != null)
            sb.append("overridden: " + getOverridden() + ",");
        if (getApprovalRulesSatisfied() != null)
            sb.append("approvalRulesSatisfied: " + getApprovalRulesSatisfied() + ",");
        if (getApprovalRulesNotSatisfied() != null)
            sb.append("approvalRulesNotSatisfied: " + getApprovalRulesNotSatisfied());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApproved() == null) ? 0 : getApproved().hashCode());
        hashCode = prime * hashCode + ((getOverridden() == null) ? 0 : getOverridden().hashCode());
        hashCode = prime
                * hashCode
                + ((getApprovalRulesSatisfied() == null) ? 0 : getApprovalRulesSatisfied()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getApprovalRulesNotSatisfied() == null) ? 0 : getApprovalRulesNotSatisfied()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Evaluation == false)
            return false;
        Evaluation other = (Evaluation) obj;

        if (other.getApproved() == null ^ this.getApproved() == null)
            return false;
        if (other.getApproved() != null && other.getApproved().equals(this.getApproved()) == false)
            return false;
        if (other.getOverridden() == null ^ this.getOverridden() == null)
            return false;
        if (other.getOverridden() != null
                && other.getOverridden().equals(this.getOverridden()) == false)
            return false;
        if (other.getApprovalRulesSatisfied() == null ^ this.getApprovalRulesSatisfied() == null)
            return false;
        if (other.getApprovalRulesSatisfied() != null
                && other.getApprovalRulesSatisfied().equals(this.getApprovalRulesSatisfied()) == false)
            return false;
        if (other.getApprovalRulesNotSatisfied() == null
                ^ this.getApprovalRulesNotSatisfied() == null)
            return false;
        if (other.getApprovalRulesNotSatisfied() != null
                && other.getApprovalRulesNotSatisfied().equals(this.getApprovalRulesNotSatisfied()) == false)
            return false;
        return true;
    }
}
