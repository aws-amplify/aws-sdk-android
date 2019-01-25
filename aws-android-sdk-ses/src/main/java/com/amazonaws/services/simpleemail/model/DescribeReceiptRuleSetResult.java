/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents the details of the specified receipt rule set.
 * </p>
 */
public class DescribeReceiptRuleSetResult implements Serializable {
    /**
     * <p>
     * The metadata for the receipt rule set, which consists of the rule set
     * name and the timestamp of when the rule set was created.
     * </p>
     */
    private ReceiptRuleSetMetadata metadata;

    /**
     * <p>
     * A list of the receipt rules that belong to the specified receipt rule
     * set.
     * </p>
     */
    private java.util.List<ReceiptRule> rules = new java.util.ArrayList<ReceiptRule>();

    /**
     * <p>
     * The metadata for the receipt rule set, which consists of the rule set
     * name and the timestamp of when the rule set was created.
     * </p>
     *
     * @return <p>
     *         The metadata for the receipt rule set, which consists of the rule
     *         set name and the timestamp of when the rule set was created.
     *         </p>
     */
    public ReceiptRuleSetMetadata getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * The metadata for the receipt rule set, which consists of the rule set
     * name and the timestamp of when the rule set was created.
     * </p>
     *
     * @param metadata <p>
     *            The metadata for the receipt rule set, which consists of the
     *            rule set name and the timestamp of when the rule set was
     *            created.
     *            </p>
     */
    public void setMetadata(ReceiptRuleSetMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The metadata for the receipt rule set, which consists of the rule set
     * name and the timestamp of when the rule set was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metadata <p>
     *            The metadata for the receipt rule set, which consists of the
     *            rule set name and the timestamp of when the rule set was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReceiptRuleSetResult withMetadata(ReceiptRuleSetMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * <p>
     * A list of the receipt rules that belong to the specified receipt rule
     * set.
     * </p>
     *
     * @return <p>
     *         A list of the receipt rules that belong to the specified receipt
     *         rule set.
     *         </p>
     */
    public java.util.List<ReceiptRule> getRules() {
        return rules;
    }

    /**
     * <p>
     * A list of the receipt rules that belong to the specified receipt rule
     * set.
     * </p>
     *
     * @param rules <p>
     *            A list of the receipt rules that belong to the specified
     *            receipt rule set.
     *            </p>
     */
    public void setRules(java.util.Collection<ReceiptRule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<ReceiptRule>(rules);
    }

    /**
     * <p>
     * A list of the receipt rules that belong to the specified receipt rule
     * set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            A list of the receipt rules that belong to the specified
     *            receipt rule set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReceiptRuleSetResult withRules(ReceiptRule... rules) {
        if (getRules() == null) {
            this.rules = new java.util.ArrayList<ReceiptRule>(rules.length);
        }
        for (ReceiptRule value : rules) {
            this.rules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the receipt rules that belong to the specified receipt rule
     * set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            A list of the receipt rules that belong to the specified
     *            receipt rule set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReceiptRuleSetResult withRules(java.util.Collection<ReceiptRule> rules) {
        setRules(rules);
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
        if (getMetadata() != null)
            sb.append("Metadata: " + getMetadata() + ",");
        if (getRules() != null)
            sb.append("Rules: " + getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReceiptRuleSetResult == false)
            return false;
        DescribeReceiptRuleSetResult other = (DescribeReceiptRuleSetResult) obj;

        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }
}
