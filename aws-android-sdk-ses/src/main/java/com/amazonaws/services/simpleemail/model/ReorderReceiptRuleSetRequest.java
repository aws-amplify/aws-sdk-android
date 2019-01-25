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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Reorders the receipt rules within a receipt rule set.
 * </p>
 * <note>
 * <p>
 * All of the rules in the rule set must be represented in this request. That
 * is, this API will return an error if the reorder request doesn't explicitly
 * position all of the rules.
 * </p>
 * </note>
 * <p>
 * For information about managing receipt rule sets, see the <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 * <p>
 * You can execute this operation no more than once per second.
 * </p>
 */
public class ReorderReceiptRuleSetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the receipt rule set to reorder.
     * </p>
     */
    private String ruleSetName;

    /**
     * <p>
     * A list of the specified receipt rule set's receipt rules in the order
     * that you want to put them.
     * </p>
     */
    private java.util.List<String> ruleNames = new java.util.ArrayList<String>();

    /**
     * <p>
     * The name of the receipt rule set to reorder.
     * </p>
     *
     * @return <p>
     *         The name of the receipt rule set to reorder.
     *         </p>
     */
    public String getRuleSetName() {
        return ruleSetName;
    }

    /**
     * <p>
     * The name of the receipt rule set to reorder.
     * </p>
     *
     * @param ruleSetName <p>
     *            The name of the receipt rule set to reorder.
     *            </p>
     */
    public void setRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
    }

    /**
     * <p>
     * The name of the receipt rule set to reorder.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ruleSetName <p>
     *            The name of the receipt rule set to reorder.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReorderReceiptRuleSetRequest withRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
        return this;
    }

    /**
     * <p>
     * A list of the specified receipt rule set's receipt rules in the order
     * that you want to put them.
     * </p>
     *
     * @return <p>
     *         A list of the specified receipt rule set's receipt rules in the
     *         order that you want to put them.
     *         </p>
     */
    public java.util.List<String> getRuleNames() {
        return ruleNames;
    }

    /**
     * <p>
     * A list of the specified receipt rule set's receipt rules in the order
     * that you want to put them.
     * </p>
     *
     * @param ruleNames <p>
     *            A list of the specified receipt rule set's receipt rules in
     *            the order that you want to put them.
     *            </p>
     */
    public void setRuleNames(java.util.Collection<String> ruleNames) {
        if (ruleNames == null) {
            this.ruleNames = null;
            return;
        }

        this.ruleNames = new java.util.ArrayList<String>(ruleNames);
    }

    /**
     * <p>
     * A list of the specified receipt rule set's receipt rules in the order
     * that you want to put them.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ruleNames <p>
     *            A list of the specified receipt rule set's receipt rules in
     *            the order that you want to put them.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReorderReceiptRuleSetRequest withRuleNames(String... ruleNames) {
        if (getRuleNames() == null) {
            this.ruleNames = new java.util.ArrayList<String>(ruleNames.length);
        }
        for (String value : ruleNames) {
            this.ruleNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the specified receipt rule set's receipt rules in the order
     * that you want to put them.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ruleNames <p>
     *            A list of the specified receipt rule set's receipt rules in
     *            the order that you want to put them.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReorderReceiptRuleSetRequest withRuleNames(java.util.Collection<String> ruleNames) {
        setRuleNames(ruleNames);
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
        if (getRuleSetName() != null)
            sb.append("RuleSetName: " + getRuleSetName() + ",");
        if (getRuleNames() != null)
            sb.append("RuleNames: " + getRuleNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRuleSetName() == null) ? 0 : getRuleSetName().hashCode());
        hashCode = prime * hashCode + ((getRuleNames() == null) ? 0 : getRuleNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReorderReceiptRuleSetRequest == false)
            return false;
        ReorderReceiptRuleSetRequest other = (ReorderReceiptRuleSetRequest) obj;

        if (other.getRuleSetName() == null ^ this.getRuleSetName() == null)
            return false;
        if (other.getRuleSetName() != null
                && other.getRuleSetName().equals(this.getRuleSetName()) == false)
            return false;
        if (other.getRuleNames() == null ^ this.getRuleNames() == null)
            return false;
        if (other.getRuleNames() != null
                && other.getRuleNames().equals(this.getRuleNames()) == false)
            return false;
        return true;
    }
}
