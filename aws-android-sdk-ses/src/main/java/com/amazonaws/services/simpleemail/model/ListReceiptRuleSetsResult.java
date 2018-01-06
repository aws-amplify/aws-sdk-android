/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * <p>
 * A list of receipt rule sets that exist under your AWS account.
 * </p>
 */
public class ListReceiptRuleSetsResult implements Serializable {
    /**
     * <p>
     * The metadata for the currently active receipt rule set. The metadata
     * consists of the rule set name and the timestamp of when the rule set was
     * created.
     * </p>
     */
    private java.util.List<ReceiptRuleSetMetadata> ruleSets = new java.util.ArrayList<ReceiptRuleSetMetadata>();

    /**
     * <p>
     * A token indicating that there are additional receipt rule sets available
     * to be listed. Pass this token to successive calls of
     * <code>ListReceiptRuleSets</code> to retrieve up to 100 receipt rule sets
     * at a time.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The metadata for the currently active receipt rule set. The metadata
     * consists of the rule set name and the timestamp of when the rule set was
     * created.
     * </p>
     *
     * @return <p>
     *         The metadata for the currently active receipt rule set. The
     *         metadata consists of the rule set name and the timestamp of when
     *         the rule set was created.
     *         </p>
     */
    public java.util.List<ReceiptRuleSetMetadata> getRuleSets() {
        return ruleSets;
    }

    /**
     * <p>
     * The metadata for the currently active receipt rule set. The metadata
     * consists of the rule set name and the timestamp of when the rule set was
     * created.
     * </p>
     *
     * @param ruleSets <p>
     *            The metadata for the currently active receipt rule set. The
     *            metadata consists of the rule set name and the timestamp of
     *            when the rule set was created.
     *            </p>
     */
    public void setRuleSets(java.util.Collection<ReceiptRuleSetMetadata> ruleSets) {
        if (ruleSets == null) {
            this.ruleSets = null;
            return;
        }

        this.ruleSets = new java.util.ArrayList<ReceiptRuleSetMetadata>(ruleSets);
    }

    /**
     * <p>
     * The metadata for the currently active receipt rule set. The metadata
     * consists of the rule set name and the timestamp of when the rule set was
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ruleSets <p>
     *            The metadata for the currently active receipt rule set. The
     *            metadata consists of the rule set name and the timestamp of
     *            when the rule set was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListReceiptRuleSetsResult withRuleSets(ReceiptRuleSetMetadata... ruleSets) {
        if (getRuleSets() == null) {
            this.ruleSets = new java.util.ArrayList<ReceiptRuleSetMetadata>(ruleSets.length);
        }
        for (ReceiptRuleSetMetadata value : ruleSets) {
            this.ruleSets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The metadata for the currently active receipt rule set. The metadata
     * consists of the rule set name and the timestamp of when the rule set was
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ruleSets <p>
     *            The metadata for the currently active receipt rule set. The
     *            metadata consists of the rule set name and the timestamp of
     *            when the rule set was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListReceiptRuleSetsResult withRuleSets(
            java.util.Collection<ReceiptRuleSetMetadata> ruleSets) {
        setRuleSets(ruleSets);
        return this;
    }

    /**
     * <p>
     * A token indicating that there are additional receipt rule sets available
     * to be listed. Pass this token to successive calls of
     * <code>ListReceiptRuleSets</code> to retrieve up to 100 receipt rule sets
     * at a time.
     * </p>
     *
     * @return <p>
     *         A token indicating that there are additional receipt rule sets
     *         available to be listed. Pass this token to successive calls of
     *         <code>ListReceiptRuleSets</code> to retrieve up to 100 receipt
     *         rule sets at a time.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token indicating that there are additional receipt rule sets available
     * to be listed. Pass this token to successive calls of
     * <code>ListReceiptRuleSets</code> to retrieve up to 100 receipt rule sets
     * at a time.
     * </p>
     *
     * @param nextToken <p>
     *            A token indicating that there are additional receipt rule sets
     *            available to be listed. Pass this token to successive calls of
     *            <code>ListReceiptRuleSets</code> to retrieve up to 100 receipt
     *            rule sets at a time.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token indicating that there are additional receipt rule sets available
     * to be listed. Pass this token to successive calls of
     * <code>ListReceiptRuleSets</code> to retrieve up to 100 receipt rule sets
     * at a time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token indicating that there are additional receipt rule sets
     *            available to be listed. Pass this token to successive calls of
     *            <code>ListReceiptRuleSets</code> to retrieve up to 100 receipt
     *            rule sets at a time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListReceiptRuleSetsResult withNextToken(String nextToken) {
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
        if (getRuleSets() != null)
            sb.append("RuleSets: " + getRuleSets() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleSets() == null) ? 0 : getRuleSets().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListReceiptRuleSetsResult == false)
            return false;
        ListReceiptRuleSetsResult other = (ListReceiptRuleSetsResult) obj;

        if (other.getRuleSets() == null ^ this.getRuleSets() == null)
            return false;
        if (other.getRuleSets() != null && other.getRuleSets().equals(this.getRuleSets()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
