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
 * Updates a receipt rule.
 * </p>
 * <p>
 * For information about managing receipt rules, see the <a href=
 * "https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rules.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 * <p>
 * You can execute this operation no more than once per second.
 * </p>
 */
public class UpdateReceiptRuleRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the receipt rule set that the receipt rule belongs to.
     * </p>
     */
    private String ruleSetName;

    /**
     * <p>
     * A data structure that contains the updated receipt rule information.
     * </p>
     */
    private ReceiptRule rule;

    /**
     * <p>
     * The name of the receipt rule set that the receipt rule belongs to.
     * </p>
     *
     * @return <p>
     *         The name of the receipt rule set that the receipt rule belongs
     *         to.
     *         </p>
     */
    public String getRuleSetName() {
        return ruleSetName;
    }

    /**
     * <p>
     * The name of the receipt rule set that the receipt rule belongs to.
     * </p>
     *
     * @param ruleSetName <p>
     *            The name of the receipt rule set that the receipt rule belongs
     *            to.
     *            </p>
     */
    public void setRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
    }

    /**
     * <p>
     * The name of the receipt rule set that the receipt rule belongs to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ruleSetName <p>
     *            The name of the receipt rule set that the receipt rule belongs
     *            to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateReceiptRuleRequest withRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
        return this;
    }

    /**
     * <p>
     * A data structure that contains the updated receipt rule information.
     * </p>
     *
     * @return <p>
     *         A data structure that contains the updated receipt rule
     *         information.
     *         </p>
     */
    public ReceiptRule getRule() {
        return rule;
    }

    /**
     * <p>
     * A data structure that contains the updated receipt rule information.
     * </p>
     *
     * @param rule <p>
     *            A data structure that contains the updated receipt rule
     *            information.
     *            </p>
     */
    public void setRule(ReceiptRule rule) {
        this.rule = rule;
    }

    /**
     * <p>
     * A data structure that contains the updated receipt rule information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rule <p>
     *            A data structure that contains the updated receipt rule
     *            information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateReceiptRuleRequest withRule(ReceiptRule rule) {
        this.rule = rule;
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
        if (getRule() != null)
            sb.append("Rule: " + getRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRuleSetName() == null) ? 0 : getRuleSetName().hashCode());
        hashCode = prime * hashCode + ((getRule() == null) ? 0 : getRule().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateReceiptRuleRequest == false)
            return false;
        UpdateReceiptRuleRequest other = (UpdateReceiptRuleRequest) obj;

        if (other.getRuleSetName() == null ^ this.getRuleSetName() == null)
            return false;
        if (other.getRuleSetName() != null
                && other.getRuleSetName().equals(this.getRuleSetName()) == false)
            return false;
        if (other.getRule() == null ^ this.getRule() == null)
            return false;
        if (other.getRule() != null && other.getRule().equals(this.getRule()) == false)
            return false;
        return true;
    }
}
