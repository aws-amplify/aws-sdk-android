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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * Details for a rule in a WAF WebACL.
 * </p>
 */
public class AwsWafWebAclRule implements Serializable {
    /**
     * <p>
     * Specifies the action that CloudFront or AWS WAF takes when a web request
     * matches the conditions in the Rule.
     * </p>
     */
    private WafAction action;

    /**
     * <p>
     * Rules to exclude from a rule group.
     * </p>
     */
    private java.util.List<WafExcludedRule> excludedRules;

    /**
     * <p>
     * Use the <code>OverrideAction</code> to test your RuleGroup.
     * </p>
     * <p>
     * Any rule in a RuleGroup can potentially block a request. If you set the
     * <code>OverrideAction</code> to <code>None</code>, the RuleGroup blocks a
     * request if any individual rule in the RuleGroup matches the request and
     * is configured to block that request.
     * </p>
     * <p>
     * However, if you first want to test the RuleGroup, set the
     * <code>OverrideAction</code> to <code>Count</code>. The RuleGroup then
     * overrides any block action specified by individual rules contained within
     * the group. Instead of blocking matching requests, those requests are
     * counted.
     * </p>
     * <p>
     * <code>ActivatedRule</code>|<code>OverrideAction</code> applies only when
     * updating or adding a RuleGroup to a WebACL. In this case you do not use
     * <code>ActivatedRule</code>|<code>Action</code>. For all other update
     * requests, <code>ActivatedRule</code>|<code>Action</code> is used instead
     * of <code>ActivatedRule</code>|<code>OverrideAction</code>.
     * </p>
     */
    private WafOverrideAction overrideAction;

    /**
     * <p>
     * Specifies the order in which the Rules in a WebACL are evaluated. Rules
     * with a lower value for Priority are evaluated before Rules with a higher
     * value. The value must be a unique integer. If you add multiple Rules to a
     * WebACL, the values do not need to be consecutive.
     * </p>
     */
    private Integer priority;

    /**
     * <p>
     * The identifier for a Rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String ruleId;

    /**
     * <p>
     * The rule type.
     * </p>
     * <p>
     * Valid values: <code>REGULAR</code> | <code>RATE_BASED</code> |
     * <code>GROUP</code>
     * </p>
     * <p>
     * The default is <code>REGULAR</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String type;

    /**
     * <p>
     * Specifies the action that CloudFront or AWS WAF takes when a web request
     * matches the conditions in the Rule.
     * </p>
     *
     * @return <p>
     *         Specifies the action that CloudFront or AWS WAF takes when a web
     *         request matches the conditions in the Rule.
     *         </p>
     */
    public WafAction getAction() {
        return action;
    }

    /**
     * <p>
     * Specifies the action that CloudFront or AWS WAF takes when a web request
     * matches the conditions in the Rule.
     * </p>
     *
     * @param action <p>
     *            Specifies the action that CloudFront or AWS WAF takes when a
     *            web request matches the conditions in the Rule.
     *            </p>
     */
    public void setAction(WafAction action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies the action that CloudFront or AWS WAF takes when a web request
     * matches the conditions in the Rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param action <p>
     *            Specifies the action that CloudFront or AWS WAF takes when a
     *            web request matches the conditions in the Rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsWafWebAclRule withAction(WafAction action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * Rules to exclude from a rule group.
     * </p>
     *
     * @return <p>
     *         Rules to exclude from a rule group.
     *         </p>
     */
    public java.util.List<WafExcludedRule> getExcludedRules() {
        return excludedRules;
    }

    /**
     * <p>
     * Rules to exclude from a rule group.
     * </p>
     *
     * @param excludedRules <p>
     *            Rules to exclude from a rule group.
     *            </p>
     */
    public void setExcludedRules(java.util.Collection<WafExcludedRule> excludedRules) {
        if (excludedRules == null) {
            this.excludedRules = null;
            return;
        }

        this.excludedRules = new java.util.ArrayList<WafExcludedRule>(excludedRules);
    }

    /**
     * <p>
     * Rules to exclude from a rule group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param excludedRules <p>
     *            Rules to exclude from a rule group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsWafWebAclRule withExcludedRules(WafExcludedRule... excludedRules) {
        if (getExcludedRules() == null) {
            this.excludedRules = new java.util.ArrayList<WafExcludedRule>(excludedRules.length);
        }
        for (WafExcludedRule value : excludedRules) {
            this.excludedRules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Rules to exclude from a rule group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param excludedRules <p>
     *            Rules to exclude from a rule group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsWafWebAclRule withExcludedRules(java.util.Collection<WafExcludedRule> excludedRules) {
        setExcludedRules(excludedRules);
        return this;
    }

    /**
     * <p>
     * Use the <code>OverrideAction</code> to test your RuleGroup.
     * </p>
     * <p>
     * Any rule in a RuleGroup can potentially block a request. If you set the
     * <code>OverrideAction</code> to <code>None</code>, the RuleGroup blocks a
     * request if any individual rule in the RuleGroup matches the request and
     * is configured to block that request.
     * </p>
     * <p>
     * However, if you first want to test the RuleGroup, set the
     * <code>OverrideAction</code> to <code>Count</code>. The RuleGroup then
     * overrides any block action specified by individual rules contained within
     * the group. Instead of blocking matching requests, those requests are
     * counted.
     * </p>
     * <p>
     * <code>ActivatedRule</code>|<code>OverrideAction</code> applies only when
     * updating or adding a RuleGroup to a WebACL. In this case you do not use
     * <code>ActivatedRule</code>|<code>Action</code>. For all other update
     * requests, <code>ActivatedRule</code>|<code>Action</code> is used instead
     * of <code>ActivatedRule</code>|<code>OverrideAction</code>.
     * </p>
     *
     * @return <p>
     *         Use the <code>OverrideAction</code> to test your RuleGroup.
     *         </p>
     *         <p>
     *         Any rule in a RuleGroup can potentially block a request. If you
     *         set the <code>OverrideAction</code> to <code>None</code>, the
     *         RuleGroup blocks a request if any individual rule in the
     *         RuleGroup matches the request and is configured to block that
     *         request.
     *         </p>
     *         <p>
     *         However, if you first want to test the RuleGroup, set the
     *         <code>OverrideAction</code> to <code>Count</code>. The RuleGroup
     *         then overrides any block action specified by individual rules
     *         contained within the group. Instead of blocking matching
     *         requests, those requests are counted.
     *         </p>
     *         <p>
     *         <code>ActivatedRule</code>|<code>OverrideAction</code> applies
     *         only when updating or adding a RuleGroup to a WebACL. In this
     *         case you do not use <code>ActivatedRule</code>|
     *         <code>Action</code>. For all other update requests,
     *         <code>ActivatedRule</code>|<code>Action</code> is used instead of
     *         <code>ActivatedRule</code>|<code>OverrideAction</code>.
     *         </p>
     */
    public WafOverrideAction getOverrideAction() {
        return overrideAction;
    }

    /**
     * <p>
     * Use the <code>OverrideAction</code> to test your RuleGroup.
     * </p>
     * <p>
     * Any rule in a RuleGroup can potentially block a request. If you set the
     * <code>OverrideAction</code> to <code>None</code>, the RuleGroup blocks a
     * request if any individual rule in the RuleGroup matches the request and
     * is configured to block that request.
     * </p>
     * <p>
     * However, if you first want to test the RuleGroup, set the
     * <code>OverrideAction</code> to <code>Count</code>. The RuleGroup then
     * overrides any block action specified by individual rules contained within
     * the group. Instead of blocking matching requests, those requests are
     * counted.
     * </p>
     * <p>
     * <code>ActivatedRule</code>|<code>OverrideAction</code> applies only when
     * updating or adding a RuleGroup to a WebACL. In this case you do not use
     * <code>ActivatedRule</code>|<code>Action</code>. For all other update
     * requests, <code>ActivatedRule</code>|<code>Action</code> is used instead
     * of <code>ActivatedRule</code>|<code>OverrideAction</code>.
     * </p>
     *
     * @param overrideAction <p>
     *            Use the <code>OverrideAction</code> to test your RuleGroup.
     *            </p>
     *            <p>
     *            Any rule in a RuleGroup can potentially block a request. If
     *            you set the <code>OverrideAction</code> to <code>None</code>,
     *            the RuleGroup blocks a request if any individual rule in the
     *            RuleGroup matches the request and is configured to block that
     *            request.
     *            </p>
     *            <p>
     *            However, if you first want to test the RuleGroup, set the
     *            <code>OverrideAction</code> to <code>Count</code>. The
     *            RuleGroup then overrides any block action specified by
     *            individual rules contained within the group. Instead of
     *            blocking matching requests, those requests are counted.
     *            </p>
     *            <p>
     *            <code>ActivatedRule</code>|<code>OverrideAction</code> applies
     *            only when updating or adding a RuleGroup to a WebACL. In this
     *            case you do not use <code>ActivatedRule</code>|
     *            <code>Action</code>. For all other update requests,
     *            <code>ActivatedRule</code>|<code>Action</code> is used instead
     *            of <code>ActivatedRule</code>|<code>OverrideAction</code>.
     *            </p>
     */
    public void setOverrideAction(WafOverrideAction overrideAction) {
        this.overrideAction = overrideAction;
    }

    /**
     * <p>
     * Use the <code>OverrideAction</code> to test your RuleGroup.
     * </p>
     * <p>
     * Any rule in a RuleGroup can potentially block a request. If you set the
     * <code>OverrideAction</code> to <code>None</code>, the RuleGroup blocks a
     * request if any individual rule in the RuleGroup matches the request and
     * is configured to block that request.
     * </p>
     * <p>
     * However, if you first want to test the RuleGroup, set the
     * <code>OverrideAction</code> to <code>Count</code>. The RuleGroup then
     * overrides any block action specified by individual rules contained within
     * the group. Instead of blocking matching requests, those requests are
     * counted.
     * </p>
     * <p>
     * <code>ActivatedRule</code>|<code>OverrideAction</code> applies only when
     * updating or adding a RuleGroup to a WebACL. In this case you do not use
     * <code>ActivatedRule</code>|<code>Action</code>. For all other update
     * requests, <code>ActivatedRule</code>|<code>Action</code> is used instead
     * of <code>ActivatedRule</code>|<code>OverrideAction</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param overrideAction <p>
     *            Use the <code>OverrideAction</code> to test your RuleGroup.
     *            </p>
     *            <p>
     *            Any rule in a RuleGroup can potentially block a request. If
     *            you set the <code>OverrideAction</code> to <code>None</code>,
     *            the RuleGroup blocks a request if any individual rule in the
     *            RuleGroup matches the request and is configured to block that
     *            request.
     *            </p>
     *            <p>
     *            However, if you first want to test the RuleGroup, set the
     *            <code>OverrideAction</code> to <code>Count</code>. The
     *            RuleGroup then overrides any block action specified by
     *            individual rules contained within the group. Instead of
     *            blocking matching requests, those requests are counted.
     *            </p>
     *            <p>
     *            <code>ActivatedRule</code>|<code>OverrideAction</code> applies
     *            only when updating or adding a RuleGroup to a WebACL. In this
     *            case you do not use <code>ActivatedRule</code>|
     *            <code>Action</code>. For all other update requests,
     *            <code>ActivatedRule</code>|<code>Action</code> is used instead
     *            of <code>ActivatedRule</code>|<code>OverrideAction</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsWafWebAclRule withOverrideAction(WafOverrideAction overrideAction) {
        this.overrideAction = overrideAction;
        return this;
    }

    /**
     * <p>
     * Specifies the order in which the Rules in a WebACL are evaluated. Rules
     * with a lower value for Priority are evaluated before Rules with a higher
     * value. The value must be a unique integer. If you add multiple Rules to a
     * WebACL, the values do not need to be consecutive.
     * </p>
     *
     * @return <p>
     *         Specifies the order in which the Rules in a WebACL are evaluated.
     *         Rules with a lower value for Priority are evaluated before Rules
     *         with a higher value. The value must be a unique integer. If you
     *         add multiple Rules to a WebACL, the values do not need to be
     *         consecutive.
     *         </p>
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * <p>
     * Specifies the order in which the Rules in a WebACL are evaluated. Rules
     * with a lower value for Priority are evaluated before Rules with a higher
     * value. The value must be a unique integer. If you add multiple Rules to a
     * WebACL, the values do not need to be consecutive.
     * </p>
     *
     * @param priority <p>
     *            Specifies the order in which the Rules in a WebACL are
     *            evaluated. Rules with a lower value for Priority are evaluated
     *            before Rules with a higher value. The value must be a unique
     *            integer. If you add multiple Rules to a WebACL, the values do
     *            not need to be consecutive.
     *            </p>
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * Specifies the order in which the Rules in a WebACL are evaluated. Rules
     * with a lower value for Priority are evaluated before Rules with a higher
     * value. The value must be a unique integer. If you add multiple Rules to a
     * WebACL, the values do not need to be consecutive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param priority <p>
     *            Specifies the order in which the Rules in a WebACL are
     *            evaluated. Rules with a lower value for Priority are evaluated
     *            before Rules with a higher value. The value must be a unique
     *            integer. If you add multiple Rules to a WebACL, the values do
     *            not need to be consecutive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsWafWebAclRule withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * <p>
     * The identifier for a Rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The identifier for a Rule.
     *         </p>
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * <p>
     * The identifier for a Rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param ruleId <p>
     *            The identifier for a Rule.
     *            </p>
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * The identifier for a Rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param ruleId <p>
     *            The identifier for a Rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsWafWebAclRule withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * <p>
     * The rule type.
     * </p>
     * <p>
     * Valid values: <code>REGULAR</code> | <code>RATE_BASED</code> |
     * <code>GROUP</code>
     * </p>
     * <p>
     * The default is <code>REGULAR</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The rule type.
     *         </p>
     *         <p>
     *         Valid values: <code>REGULAR</code> | <code>RATE_BASED</code> |
     *         <code>GROUP</code>
     *         </p>
     *         <p>
     *         The default is <code>REGULAR</code>.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The rule type.
     * </p>
     * <p>
     * Valid values: <code>REGULAR</code> | <code>RATE_BASED</code> |
     * <code>GROUP</code>
     * </p>
     * <p>
     * The default is <code>REGULAR</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param type <p>
     *            The rule type.
     *            </p>
     *            <p>
     *            Valid values: <code>REGULAR</code> | <code>RATE_BASED</code> |
     *            <code>GROUP</code>
     *            </p>
     *            <p>
     *            The default is <code>REGULAR</code>.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The rule type.
     * </p>
     * <p>
     * Valid values: <code>REGULAR</code> | <code>RATE_BASED</code> |
     * <code>GROUP</code>
     * </p>
     * <p>
     * The default is <code>REGULAR</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param type <p>
     *            The rule type.
     *            </p>
     *            <p>
     *            Valid values: <code>REGULAR</code> | <code>RATE_BASED</code> |
     *            <code>GROUP</code>
     *            </p>
     *            <p>
     *            The default is <code>REGULAR</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsWafWebAclRule withType(String type) {
        this.type = type;
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
        if (getAction() != null)
            sb.append("Action: " + getAction() + ",");
        if (getExcludedRules() != null)
            sb.append("ExcludedRules: " + getExcludedRules() + ",");
        if (getOverrideAction() != null)
            sb.append("OverrideAction: " + getOverrideAction() + ",");
        if (getPriority() != null)
            sb.append("Priority: " + getPriority() + ",");
        if (getRuleId() != null)
            sb.append("RuleId: " + getRuleId() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode
                + ((getExcludedRules() == null) ? 0 : getExcludedRules().hashCode());
        hashCode = prime * hashCode
                + ((getOverrideAction() == null) ? 0 : getOverrideAction().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsWafWebAclRule == false)
            return false;
        AwsWafWebAclRule other = (AwsWafWebAclRule) obj;

        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getExcludedRules() == null ^ this.getExcludedRules() == null)
            return false;
        if (other.getExcludedRules() != null
                && other.getExcludedRules().equals(this.getExcludedRules()) == false)
            return false;
        if (other.getOverrideAction() == null ^ this.getOverrideAction() == null)
            return false;
        if (other.getOverrideAction() != null
                && other.getOverrideAction().equals(this.getOverrideAction()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
