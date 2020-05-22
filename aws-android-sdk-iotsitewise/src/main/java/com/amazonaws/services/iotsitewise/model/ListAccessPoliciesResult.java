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

package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;

public class ListAccessPoliciesResult implements Serializable {
    /**
     * <p>
     * A list that summarizes each access policy.
     * </p>
     */
    private java.util.List<AccessPolicySummary> accessPolicySummaries;

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/=]+<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list that summarizes each access policy.
     * </p>
     *
     * @return <p>
     *         A list that summarizes each access policy.
     *         </p>
     */
    public java.util.List<AccessPolicySummary> getAccessPolicySummaries() {
        return accessPolicySummaries;
    }

    /**
     * <p>
     * A list that summarizes each access policy.
     * </p>
     *
     * @param accessPolicySummaries <p>
     *            A list that summarizes each access policy.
     *            </p>
     */
    public void setAccessPolicySummaries(
            java.util.Collection<AccessPolicySummary> accessPolicySummaries) {
        if (accessPolicySummaries == null) {
            this.accessPolicySummaries = null;
            return;
        }

        this.accessPolicySummaries = new java.util.ArrayList<AccessPolicySummary>(
                accessPolicySummaries);
    }

    /**
     * <p>
     * A list that summarizes each access policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessPolicySummaries <p>
     *            A list that summarizes each access policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAccessPoliciesResult withAccessPolicySummaries(
            AccessPolicySummary... accessPolicySummaries) {
        if (getAccessPolicySummaries() == null) {
            this.accessPolicySummaries = new java.util.ArrayList<AccessPolicySummary>(
                    accessPolicySummaries.length);
        }
        for (AccessPolicySummary value : accessPolicySummaries) {
            this.accessPolicySummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list that summarizes each access policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessPolicySummaries <p>
     *            A list that summarizes each access policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAccessPoliciesResult withAccessPolicySummaries(
            java.util.Collection<AccessPolicySummary> accessPolicySummaries) {
        setAccessPolicySummaries(accessPolicySummaries);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/=]+<br/>
     *
     * @return <p>
     *         The token for the next set of results, or null if there are no
     *         additional results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/=]+<br/>
     *
     * @param nextToken <p>
     *            The token for the next set of results, or null if there are no
     *            additional results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[A-Za-z0-9+/=]+<br/>
     *
     * @param nextToken <p>
     *            The token for the next set of results, or null if there are no
     *            additional results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAccessPoliciesResult withNextToken(String nextToken) {
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
        if (getAccessPolicySummaries() != null)
            sb.append("accessPolicySummaries: " + getAccessPolicySummaries() + ",");
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
                + ((getAccessPolicySummaries() == null) ? 0 : getAccessPolicySummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAccessPoliciesResult == false)
            return false;
        ListAccessPoliciesResult other = (ListAccessPoliciesResult) obj;

        if (other.getAccessPolicySummaries() == null ^ this.getAccessPolicySummaries() == null)
            return false;
        if (other.getAccessPolicySummaries() != null
                && other.getAccessPolicySummaries().equals(this.getAccessPolicySummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
