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
 * Contains rules to be applied to the affected accounts. Policies can be
 * attached directly to accounts, or to roots and OUs to affect all accounts in
 * those hierarchies.
 * </p>
 */
public class Policy implements Serializable {
    /**
     * <p>
     * A structure that contains additional details about the policy.
     * </p>
     */
    private PolicySummary policySummary;

    /**
     * <p>
     * The text content of the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000000<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String content;

    /**
     * <p>
     * A structure that contains additional details about the policy.
     * </p>
     *
     * @return <p>
     *         A structure that contains additional details about the policy.
     *         </p>
     */
    public PolicySummary getPolicySummary() {
        return policySummary;
    }

    /**
     * <p>
     * A structure that contains additional details about the policy.
     * </p>
     *
     * @param policySummary <p>
     *            A structure that contains additional details about the policy.
     *            </p>
     */
    public void setPolicySummary(PolicySummary policySummary) {
        this.policySummary = policySummary;
    }

    /**
     * <p>
     * A structure that contains additional details about the policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policySummary <p>
     *            A structure that contains additional details about the policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Policy withPolicySummary(PolicySummary policySummary) {
        this.policySummary = policySummary;
        return this;
    }

    /**
     * <p>
     * The text content of the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000000<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         The text content of the policy.
     *         </p>
     */
    public String getContent() {
        return content;
    }

    /**
     * <p>
     * The text content of the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000000<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param content <p>
     *            The text content of the policy.
     *            </p>
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The text content of the policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000000<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param content <p>
     *            The text content of the policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Policy withContent(String content) {
        this.content = content;
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
        if (getPolicySummary() != null)
            sb.append("PolicySummary: " + getPolicySummary() + ",");
        if (getContent() != null)
            sb.append("Content: " + getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPolicySummary() == null) ? 0 : getPolicySummary().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Policy == false)
            return false;
        Policy other = (Policy) obj;

        if (other.getPolicySummary() == null ^ this.getPolicySummary() == null)
            return false;
        if (other.getPolicySummary() != null
                && other.getPolicySummary().equals(this.getPolicySummary()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }
}
