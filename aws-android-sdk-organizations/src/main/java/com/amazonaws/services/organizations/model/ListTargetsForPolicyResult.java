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

public class ListTargetsForPolicyResult implements Serializable {
    /**
     * <p>
     * A list of structures, each of which contains details about one of the
     * entities to which the specified policy is attached.
     * </p>
     */
    private java.util.List<PolicyTargetSummary> targets;

    /**
     * <p>
     * If present, indicates that more output is available than is included in
     * the current response. Use this value in the <code>NextToken</code>
     * request parameter in a subsequent call to the operation to get the next
     * part of the output. You should repeat this until the
     * <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100000<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of structures, each of which contains details about one of the
     * entities to which the specified policy is attached.
     * </p>
     *
     * @return <p>
     *         A list of structures, each of which contains details about one of
     *         the entities to which the specified policy is attached.
     *         </p>
     */
    public java.util.List<PolicyTargetSummary> getTargets() {
        return targets;
    }

    /**
     * <p>
     * A list of structures, each of which contains details about one of the
     * entities to which the specified policy is attached.
     * </p>
     *
     * @param targets <p>
     *            A list of structures, each of which contains details about one
     *            of the entities to which the specified policy is attached.
     *            </p>
     */
    public void setTargets(java.util.Collection<PolicyTargetSummary> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<PolicyTargetSummary>(targets);
    }

    /**
     * <p>
     * A list of structures, each of which contains details about one of the
     * entities to which the specified policy is attached.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            A list of structures, each of which contains details about one
     *            of the entities to which the specified policy is attached.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTargetsForPolicyResult withTargets(PolicyTargetSummary... targets) {
        if (getTargets() == null) {
            this.targets = new java.util.ArrayList<PolicyTargetSummary>(targets.length);
        }
        for (PolicyTargetSummary value : targets) {
            this.targets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of structures, each of which contains details about one of the
     * entities to which the specified policy is attached.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            A list of structures, each of which contains details about one
     *            of the entities to which the specified policy is attached.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTargetsForPolicyResult withTargets(java.util.Collection<PolicyTargetSummary> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * If present, indicates that more output is available than is included in
     * the current response. Use this value in the <code>NextToken</code>
     * request parameter in a subsequent call to the operation to get the next
     * part of the output. You should repeat this until the
     * <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100000<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         If present, indicates that more output is available than is
     *         included in the current response. Use this value in the
     *         <code>NextToken</code> request parameter in a subsequent call to
     *         the operation to get the next part of the output. You should
     *         repeat this until the <code>NextToken</code> response element
     *         comes back as <code>null</code>.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If present, indicates that more output is available than is included in
     * the current response. Use this value in the <code>NextToken</code>
     * request parameter in a subsequent call to the operation to get the next
     * part of the output. You should repeat this until the
     * <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100000<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param nextToken <p>
     *            If present, indicates that more output is available than is
     *            included in the current response. Use this value in the
     *            <code>NextToken</code> request parameter in a subsequent call
     *            to the operation to get the next part of the output. You
     *            should repeat this until the <code>NextToken</code> response
     *            element comes back as <code>null</code>.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If present, indicates that more output is available than is included in
     * the current response. Use this value in the <code>NextToken</code>
     * request parameter in a subsequent call to the operation to get the next
     * part of the output. You should repeat this until the
     * <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100000<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param nextToken <p>
     *            If present, indicates that more output is available than is
     *            included in the current response. Use this value in the
     *            <code>NextToken</code> request parameter in a subsequent call
     *            to the operation to get the next part of the output. You
     *            should repeat this until the <code>NextToken</code> response
     *            element comes back as <code>null</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTargetsForPolicyResult withNextToken(String nextToken) {
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
        if (getTargets() != null)
            sb.append("Targets: " + getTargets() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTargetsForPolicyResult == false)
            return false;
        ListTargetsForPolicyResult other = (ListTargetsForPolicyResult) obj;

        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
