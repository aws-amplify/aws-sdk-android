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

package com.amazonaws.services.shield.model;

import java.io.Serializable;

public class ListAttacksResult implements Serializable {
    /**
     * <p>
     * The attack information for the specified time range.
     * </p>
     */
    private java.util.List<AttackSummary> attackSummaries;

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data
     * available. If not null, more results are available. Pass this value for
     * the <code>NextMarker</code> parameter in a subsequent call to
     * <code>ListAttacks</code> to retrieve the next set of items.
     * </p>
     * <p>
     * AWS WAF might return the list of <a>AttackSummary</a> objects in batches
     * smaller than the number specified by MaxResults. If there are more
     * <a>AttackSummary</a> objects to return, AWS WAF will always also return a
     * <code>NextToken</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^.*$<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The attack information for the specified time range.
     * </p>
     *
     * @return <p>
     *         The attack information for the specified time range.
     *         </p>
     */
    public java.util.List<AttackSummary> getAttackSummaries() {
        return attackSummaries;
    }

    /**
     * <p>
     * The attack information for the specified time range.
     * </p>
     *
     * @param attackSummaries <p>
     *            The attack information for the specified time range.
     *            </p>
     */
    public void setAttackSummaries(java.util.Collection<AttackSummary> attackSummaries) {
        if (attackSummaries == null) {
            this.attackSummaries = null;
            return;
        }

        this.attackSummaries = new java.util.ArrayList<AttackSummary>(attackSummaries);
    }

    /**
     * <p>
     * The attack information for the specified time range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attackSummaries <p>
     *            The attack information for the specified time range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAttacksResult withAttackSummaries(AttackSummary... attackSummaries) {
        if (getAttackSummaries() == null) {
            this.attackSummaries = new java.util.ArrayList<AttackSummary>(attackSummaries.length);
        }
        for (AttackSummary value : attackSummaries) {
            this.attackSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The attack information for the specified time range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attackSummaries <p>
     *            The attack information for the specified time range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAttacksResult withAttackSummaries(java.util.Collection<AttackSummary> attackSummaries) {
        setAttackSummaries(attackSummaries);
        return this;
    }

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data
     * available. If not null, more results are available. Pass this value for
     * the <code>NextMarker</code> parameter in a subsequent call to
     * <code>ListAttacks</code> to retrieve the next set of items.
     * </p>
     * <p>
     * AWS WAF might return the list of <a>AttackSummary</a> objects in batches
     * smaller than the number specified by MaxResults. If there are more
     * <a>AttackSummary</a> objects to return, AWS WAF will always also return a
     * <code>NextToken</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^.*$<br/>
     *
     * @return <p>
     *         The token returned by a previous call to indicate that there is
     *         more data available. If not null, more results are available.
     *         Pass this value for the <code>NextMarker</code> parameter in a
     *         subsequent call to <code>ListAttacks</code> to retrieve the next
     *         set of items.
     *         </p>
     *         <p>
     *         AWS WAF might return the list of <a>AttackSummary</a> objects in
     *         batches smaller than the number specified by MaxResults. If there
     *         are more <a>AttackSummary</a> objects to return, AWS WAF will
     *         always also return a <code>NextToken</code>.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data
     * available. If not null, more results are available. Pass this value for
     * the <code>NextMarker</code> parameter in a subsequent call to
     * <code>ListAttacks</code> to retrieve the next set of items.
     * </p>
     * <p>
     * AWS WAF might return the list of <a>AttackSummary</a> objects in batches
     * smaller than the number specified by MaxResults. If there are more
     * <a>AttackSummary</a> objects to return, AWS WAF will always also return a
     * <code>NextToken</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^.*$<br/>
     *
     * @param nextToken <p>
     *            The token returned by a previous call to indicate that there
     *            is more data available. If not null, more results are
     *            available. Pass this value for the <code>NextMarker</code>
     *            parameter in a subsequent call to <code>ListAttacks</code> to
     *            retrieve the next set of items.
     *            </p>
     *            <p>
     *            AWS WAF might return the list of <a>AttackSummary</a> objects
     *            in batches smaller than the number specified by MaxResults. If
     *            there are more <a>AttackSummary</a> objects to return, AWS WAF
     *            will always also return a <code>NextToken</code>.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data
     * available. If not null, more results are available. Pass this value for
     * the <code>NextMarker</code> parameter in a subsequent call to
     * <code>ListAttacks</code> to retrieve the next set of items.
     * </p>
     * <p>
     * AWS WAF might return the list of <a>AttackSummary</a> objects in batches
     * smaller than the number specified by MaxResults. If there are more
     * <a>AttackSummary</a> objects to return, AWS WAF will always also return a
     * <code>NextToken</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^.*$<br/>
     *
     * @param nextToken <p>
     *            The token returned by a previous call to indicate that there
     *            is more data available. If not null, more results are
     *            available. Pass this value for the <code>NextMarker</code>
     *            parameter in a subsequent call to <code>ListAttacks</code> to
     *            retrieve the next set of items.
     *            </p>
     *            <p>
     *            AWS WAF might return the list of <a>AttackSummary</a> objects
     *            in batches smaller than the number specified by MaxResults. If
     *            there are more <a>AttackSummary</a> objects to return, AWS WAF
     *            will always also return a <code>NextToken</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAttacksResult withNextToken(String nextToken) {
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
        if (getAttackSummaries() != null)
            sb.append("AttackSummaries: " + getAttackSummaries() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAttackSummaries() == null) ? 0 : getAttackSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAttacksResult == false)
            return false;
        ListAttacksResult other = (ListAttacksResult) obj;

        if (other.getAttackSummaries() == null ^ this.getAttackSummaries() == null)
            return false;
        if (other.getAttackSummaries() != null
                && other.getAttackSummaries().equals(this.getAttackSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
