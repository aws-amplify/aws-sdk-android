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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

/**
 * <p>
 * Contains a reference to a <code>Statement</code> element in a policy document
 * that determines the result of the simulation.
 * </p>
 * <p>
 * This data type is used by the <code>MatchedStatements</code> member of the
 * <code> <a>EvaluationResult</a> </code> type.
 * </p>
 */
public class Statement implements Serializable {
    /**
     * <p>
     * The identifier of the policy that was provided as an input.
     * </p>
     */
    private String sourcePolicyId;

    /**
     * <p>
     * The type of the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>user, group, role, aws-managed, user-managed,
     * resource, none
     */
    private String sourcePolicyType;

    /**
     * <p>
     * The row and column of the beginning of the <code>Statement</code> in an
     * IAM policy.
     * </p>
     */
    private Position startPosition;

    /**
     * <p>
     * The row and column of the end of a <code>Statement</code> in an IAM
     * policy.
     * </p>
     */
    private Position endPosition;

    /**
     * <p>
     * The identifier of the policy that was provided as an input.
     * </p>
     *
     * @return <p>
     *         The identifier of the policy that was provided as an input.
     *         </p>
     */
    public String getSourcePolicyId() {
        return sourcePolicyId;
    }

    /**
     * <p>
     * The identifier of the policy that was provided as an input.
     * </p>
     *
     * @param sourcePolicyId <p>
     *            The identifier of the policy that was provided as an input.
     *            </p>
     */
    public void setSourcePolicyId(String sourcePolicyId) {
        this.sourcePolicyId = sourcePolicyId;
    }

    /**
     * <p>
     * The identifier of the policy that was provided as an input.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourcePolicyId <p>
     *            The identifier of the policy that was provided as an input.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Statement withSourcePolicyId(String sourcePolicyId) {
        this.sourcePolicyId = sourcePolicyId;
        return this;
    }

    /**
     * <p>
     * The type of the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>user, group, role, aws-managed, user-managed,
     * resource, none
     *
     * @return <p>
     *         The type of the policy.
     *         </p>
     * @see PolicySourceType
     */
    public String getSourcePolicyType() {
        return sourcePolicyType;
    }

    /**
     * <p>
     * The type of the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>user, group, role, aws-managed, user-managed,
     * resource, none
     *
     * @param sourcePolicyType <p>
     *            The type of the policy.
     *            </p>
     * @see PolicySourceType
     */
    public void setSourcePolicyType(String sourcePolicyType) {
        this.sourcePolicyType = sourcePolicyType;
    }

    /**
     * <p>
     * The type of the policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>user, group, role, aws-managed, user-managed,
     * resource, none
     *
     * @param sourcePolicyType <p>
     *            The type of the policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PolicySourceType
     */
    public Statement withSourcePolicyType(String sourcePolicyType) {
        this.sourcePolicyType = sourcePolicyType;
        return this;
    }

    /**
     * <p>
     * The type of the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>user, group, role, aws-managed, user-managed,
     * resource, none
     *
     * @param sourcePolicyType <p>
     *            The type of the policy.
     *            </p>
     * @see PolicySourceType
     */
    public void setSourcePolicyType(PolicySourceType sourcePolicyType) {
        this.sourcePolicyType = sourcePolicyType.toString();
    }

    /**
     * <p>
     * The type of the policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>user, group, role, aws-managed, user-managed,
     * resource, none
     *
     * @param sourcePolicyType <p>
     *            The type of the policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PolicySourceType
     */
    public Statement withSourcePolicyType(PolicySourceType sourcePolicyType) {
        this.sourcePolicyType = sourcePolicyType.toString();
        return this;
    }

    /**
     * <p>
     * The row and column of the beginning of the <code>Statement</code> in an
     * IAM policy.
     * </p>
     *
     * @return <p>
     *         The row and column of the beginning of the <code>Statement</code>
     *         in an IAM policy.
     *         </p>
     */
    public Position getStartPosition() {
        return startPosition;
    }

    /**
     * <p>
     * The row and column of the beginning of the <code>Statement</code> in an
     * IAM policy.
     * </p>
     *
     * @param startPosition <p>
     *            The row and column of the beginning of the
     *            <code>Statement</code> in an IAM policy.
     *            </p>
     */
    public void setStartPosition(Position startPosition) {
        this.startPosition = startPosition;
    }

    /**
     * <p>
     * The row and column of the beginning of the <code>Statement</code> in an
     * IAM policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startPosition <p>
     *            The row and column of the beginning of the
     *            <code>Statement</code> in an IAM policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Statement withStartPosition(Position startPosition) {
        this.startPosition = startPosition;
        return this;
    }

    /**
     * <p>
     * The row and column of the end of a <code>Statement</code> in an IAM
     * policy.
     * </p>
     *
     * @return <p>
     *         The row and column of the end of a <code>Statement</code> in an
     *         IAM policy.
     *         </p>
     */
    public Position getEndPosition() {
        return endPosition;
    }

    /**
     * <p>
     * The row and column of the end of a <code>Statement</code> in an IAM
     * policy.
     * </p>
     *
     * @param endPosition <p>
     *            The row and column of the end of a <code>Statement</code> in
     *            an IAM policy.
     *            </p>
     */
    public void setEndPosition(Position endPosition) {
        this.endPosition = endPosition;
    }

    /**
     * <p>
     * The row and column of the end of a <code>Statement</code> in an IAM
     * policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endPosition <p>
     *            The row and column of the end of a <code>Statement</code> in
     *            an IAM policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Statement withEndPosition(Position endPosition) {
        this.endPosition = endPosition;
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
        if (getSourcePolicyId() != null)
            sb.append("SourcePolicyId: " + getSourcePolicyId() + ",");
        if (getSourcePolicyType() != null)
            sb.append("SourcePolicyType: " + getSourcePolicyType() + ",");
        if (getStartPosition() != null)
            sb.append("StartPosition: " + getStartPosition() + ",");
        if (getEndPosition() != null)
            sb.append("EndPosition: " + getEndPosition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSourcePolicyId() == null) ? 0 : getSourcePolicyId().hashCode());
        hashCode = prime * hashCode
                + ((getSourcePolicyType() == null) ? 0 : getSourcePolicyType().hashCode());
        hashCode = prime * hashCode
                + ((getStartPosition() == null) ? 0 : getStartPosition().hashCode());
        hashCode = prime * hashCode
                + ((getEndPosition() == null) ? 0 : getEndPosition().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Statement == false)
            return false;
        Statement other = (Statement) obj;

        if (other.getSourcePolicyId() == null ^ this.getSourcePolicyId() == null)
            return false;
        if (other.getSourcePolicyId() != null
                && other.getSourcePolicyId().equals(this.getSourcePolicyId()) == false)
            return false;
        if (other.getSourcePolicyType() == null ^ this.getSourcePolicyType() == null)
            return false;
        if (other.getSourcePolicyType() != null
                && other.getSourcePolicyType().equals(this.getSourcePolicyType()) == false)
            return false;
        if (other.getStartPosition() == null ^ this.getStartPosition() == null)
            return false;
        if (other.getStartPosition() != null
                && other.getStartPosition().equals(this.getStartPosition()) == false)
            return false;
        if (other.getEndPosition() == null ^ this.getEndPosition() == null)
            return false;
        if (other.getEndPosition() != null
                && other.getEndPosition().equals(this.getEndPosition()) == false)
            return false;
        return true;
    }
}
