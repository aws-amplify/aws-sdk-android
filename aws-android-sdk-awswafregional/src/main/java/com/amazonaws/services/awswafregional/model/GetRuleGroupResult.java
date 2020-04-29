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

package com.amazonaws.services.awswafregional.model;

import java.io.Serializable;

public class GetRuleGroupResult implements Serializable {
    /**
     * <p>
     * Information about the <a>RuleGroup</a> that you specified in the
     * <code>GetRuleGroup</code> request.
     * </p>
     */
    private RuleGroup ruleGroup;

    /**
     * <p>
     * Information about the <a>RuleGroup</a> that you specified in the
     * <code>GetRuleGroup</code> request.
     * </p>
     *
     * @return <p>
     *         Information about the <a>RuleGroup</a> that you specified in the
     *         <code>GetRuleGroup</code> request.
     *         </p>
     */
    public RuleGroup getRuleGroup() {
        return ruleGroup;
    }

    /**
     * <p>
     * Information about the <a>RuleGroup</a> that you specified in the
     * <code>GetRuleGroup</code> request.
     * </p>
     *
     * @param ruleGroup <p>
     *            Information about the <a>RuleGroup</a> that you specified in
     *            the <code>GetRuleGroup</code> request.
     *            </p>
     */
    public void setRuleGroup(RuleGroup ruleGroup) {
        this.ruleGroup = ruleGroup;
    }

    /**
     * <p>
     * Information about the <a>RuleGroup</a> that you specified in the
     * <code>GetRuleGroup</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ruleGroup <p>
     *            Information about the <a>RuleGroup</a> that you specified in
     *            the <code>GetRuleGroup</code> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRuleGroupResult withRuleGroup(RuleGroup ruleGroup) {
        this.ruleGroup = ruleGroup;
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
        if (getRuleGroup() != null)
            sb.append("RuleGroup: " + getRuleGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleGroup() == null) ? 0 : getRuleGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRuleGroupResult == false)
            return false;
        GetRuleGroupResult other = (GetRuleGroupResult) obj;

        if (other.getRuleGroup() == null ^ this.getRuleGroup() == null)
            return false;
        if (other.getRuleGroup() != null
                && other.getRuleGroup().equals(this.getRuleGroup()) == false)
            return false;
        return true;
    }
}
