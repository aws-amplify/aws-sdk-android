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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <note>
 * <p>
 * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
 * href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
 * >AWS WAF Classic</a> in the developer guide.
 * </p>
 * <p>
 * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the
 * <a href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS
 * WAF Developer Guide</a>. With the latest version, AWS WAF has a single set of
 * endpoints for regional and global use.
 * </p>
 * </note>
 * <p>
 * Inserts or deletes <a>Predicate</a> objects in a rule and updates the
 * <code>RateLimit</code> in the rule.
 * </p>
 * <p>
 * Each <code>Predicate</code> object identifies a predicate, such as a
 * <a>ByteMatchSet</a> or an <a>IPSet</a>, that specifies the web requests that
 * you want to block or count. The <code>RateLimit</code> specifies the number
 * of requests every five minutes that triggers the rule.
 * </p>
 * <p>
 * If you add more than one predicate to a <code>RateBasedRule</code>, a request
 * must match all the predicates and exceed the <code>RateLimit</code> to be
 * counted or blocked. For example, suppose you add the following to a
 * <code>RateBasedRule</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * An <code>IPSet</code> that matches the IP address <code>192.0.2.44/32</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * A <code>ByteMatchSet</code> that matches <code>BadBot</code> in the
 * <code>User-Agent</code> header
 * </p>
 * </li>
 * </ul>
 * <p>
 * Further, you specify a <code>RateLimit</code> of 1,000.
 * </p>
 * <p>
 * You then add the <code>RateBasedRule</code> to a <code>WebACL</code> and
 * specify that you want to block requests that satisfy the rule. For a request
 * to be blocked, it must come from the IP address 192.0.2.44 <i>and</i> the
 * <code>User-Agent</code> header in the request must contain the value
 * <code>BadBot</code>. Further, requests that match these two conditions much
 * be received at a rate of more than 1,000 every five minutes. If the rate
 * drops below this limit, AWS WAF no longer blocks the requests.
 * </p>
 * <p>
 * As a second example, suppose you want to limit requests to a particular page
 * on your site. To do this, you could add the following to a
 * <code>RateBasedRule</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * A <code>ByteMatchSet</code> with <code>FieldToMatch</code> of
 * <code>URI</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * A <code>PositionalConstraint</code> of <code>STARTS_WITH</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * A <code>TargetString</code> of <code>login</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * Further, you specify a <code>RateLimit</code> of 1,000.
 * </p>
 * <p>
 * By adding this <code>RateBasedRule</code> to a <code>WebACL</code>, you could
 * limit requests to your login page without affecting the rest of your site.
 * </p>
 */
public class UpdateRateBasedRuleRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The <code>RuleId</code> of the <code>RateBasedRule</code> that you want
     * to update. <code>RuleId</code> is returned by
     * <code>CreateRateBasedRule</code> and by <a>ListRateBasedRules</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String ruleId;

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String changeToken;

    /**
     * <p>
     * An array of <code>RuleUpdate</code> objects that you want to insert into
     * or delete from a <a>RateBasedRule</a>.
     * </p>
     */
    private java.util.List<RuleUpdate> updates;

    /**
     * <p>
     * The maximum number of requests, which have an identical value in the
     * field specified by the <code>RateKey</code>, allowed in a five-minute
     * period. If the number of requests exceeds the <code>RateLimit</code> and
     * the other predicates specified in the rule are also met, AWS WAF triggers
     * the action that is specified for this rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100 - 2000000000<br/>
     */
    private Long rateLimit;

    /**
     * <p>
     * The <code>RuleId</code> of the <code>RateBasedRule</code> that you want
     * to update. <code>RuleId</code> is returned by
     * <code>CreateRateBasedRule</code> and by <a>ListRateBasedRules</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The <code>RuleId</code> of the <code>RateBasedRule</code> that
     *         you want to update. <code>RuleId</code> is returned by
     *         <code>CreateRateBasedRule</code> and by
     *         <a>ListRateBasedRules</a>.
     *         </p>
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * <p>
     * The <code>RuleId</code> of the <code>RateBasedRule</code> that you want
     * to update. <code>RuleId</code> is returned by
     * <code>CreateRateBasedRule</code> and by <a>ListRateBasedRules</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param ruleId <p>
     *            The <code>RuleId</code> of the <code>RateBasedRule</code> that
     *            you want to update. <code>RuleId</code> is returned by
     *            <code>CreateRateBasedRule</code> and by
     *            <a>ListRateBasedRules</a>.
     *            </p>
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * The <code>RuleId</code> of the <code>RateBasedRule</code> that you want
     * to update. <code>RuleId</code> is returned by
     * <code>CreateRateBasedRule</code> and by <a>ListRateBasedRules</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param ruleId <p>
     *            The <code>RuleId</code> of the <code>RateBasedRule</code> that
     *            you want to update. <code>RuleId</code> is returned by
     *            <code>CreateRateBasedRule</code> and by
     *            <a>ListRateBasedRules</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRateBasedRuleRequest withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The value returned by the most recent call to
     *         <a>GetChangeToken</a>.
     *         </p>
     */
    public String getChangeToken() {
        return changeToken;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param changeToken <p>
     *            The value returned by the most recent call to
     *            <a>GetChangeToken</a>.
     *            </p>
     */
    public void setChangeToken(String changeToken) {
        this.changeToken = changeToken;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param changeToken <p>
     *            The value returned by the most recent call to
     *            <a>GetChangeToken</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRateBasedRuleRequest withChangeToken(String changeToken) {
        this.changeToken = changeToken;
        return this;
    }

    /**
     * <p>
     * An array of <code>RuleUpdate</code> objects that you want to insert into
     * or delete from a <a>RateBasedRule</a>.
     * </p>
     *
     * @return <p>
     *         An array of <code>RuleUpdate</code> objects that you want to
     *         insert into or delete from a <a>RateBasedRule</a>.
     *         </p>
     */
    public java.util.List<RuleUpdate> getUpdates() {
        return updates;
    }

    /**
     * <p>
     * An array of <code>RuleUpdate</code> objects that you want to insert into
     * or delete from a <a>RateBasedRule</a>.
     * </p>
     *
     * @param updates <p>
     *            An array of <code>RuleUpdate</code> objects that you want to
     *            insert into or delete from a <a>RateBasedRule</a>.
     *            </p>
     */
    public void setUpdates(java.util.Collection<RuleUpdate> updates) {
        if (updates == null) {
            this.updates = null;
            return;
        }

        this.updates = new java.util.ArrayList<RuleUpdate>(updates);
    }

    /**
     * <p>
     * An array of <code>RuleUpdate</code> objects that you want to insert into
     * or delete from a <a>RateBasedRule</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updates <p>
     *            An array of <code>RuleUpdate</code> objects that you want to
     *            insert into or delete from a <a>RateBasedRule</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRateBasedRuleRequest withUpdates(RuleUpdate... updates) {
        if (getUpdates() == null) {
            this.updates = new java.util.ArrayList<RuleUpdate>(updates.length);
        }
        for (RuleUpdate value : updates) {
            this.updates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>RuleUpdate</code> objects that you want to insert into
     * or delete from a <a>RateBasedRule</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updates <p>
     *            An array of <code>RuleUpdate</code> objects that you want to
     *            insert into or delete from a <a>RateBasedRule</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRateBasedRuleRequest withUpdates(java.util.Collection<RuleUpdate> updates) {
        setUpdates(updates);
        return this;
    }

    /**
     * <p>
     * The maximum number of requests, which have an identical value in the
     * field specified by the <code>RateKey</code>, allowed in a five-minute
     * period. If the number of requests exceeds the <code>RateLimit</code> and
     * the other predicates specified in the rule are also met, AWS WAF triggers
     * the action that is specified for this rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100 - 2000000000<br/>
     *
     * @return <p>
     *         The maximum number of requests, which have an identical value in
     *         the field specified by the <code>RateKey</code>, allowed in a
     *         five-minute period. If the number of requests exceeds the
     *         <code>RateLimit</code> and the other predicates specified in the
     *         rule are also met, AWS WAF triggers the action that is specified
     *         for this rule.
     *         </p>
     */
    public Long getRateLimit() {
        return rateLimit;
    }

    /**
     * <p>
     * The maximum number of requests, which have an identical value in the
     * field specified by the <code>RateKey</code>, allowed in a five-minute
     * period. If the number of requests exceeds the <code>RateLimit</code> and
     * the other predicates specified in the rule are also met, AWS WAF triggers
     * the action that is specified for this rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100 - 2000000000<br/>
     *
     * @param rateLimit <p>
     *            The maximum number of requests, which have an identical value
     *            in the field specified by the <code>RateKey</code>, allowed in
     *            a five-minute period. If the number of requests exceeds the
     *            <code>RateLimit</code> and the other predicates specified in
     *            the rule are also met, AWS WAF triggers the action that is
     *            specified for this rule.
     *            </p>
     */
    public void setRateLimit(Long rateLimit) {
        this.rateLimit = rateLimit;
    }

    /**
     * <p>
     * The maximum number of requests, which have an identical value in the
     * field specified by the <code>RateKey</code>, allowed in a five-minute
     * period. If the number of requests exceeds the <code>RateLimit</code> and
     * the other predicates specified in the rule are also met, AWS WAF triggers
     * the action that is specified for this rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100 - 2000000000<br/>
     *
     * @param rateLimit <p>
     *            The maximum number of requests, which have an identical value
     *            in the field specified by the <code>RateKey</code>, allowed in
     *            a five-minute period. If the number of requests exceeds the
     *            <code>RateLimit</code> and the other predicates specified in
     *            the rule are also met, AWS WAF triggers the action that is
     *            specified for this rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRateBasedRuleRequest withRateLimit(Long rateLimit) {
        this.rateLimit = rateLimit;
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
        if (getRuleId() != null)
            sb.append("RuleId: " + getRuleId() + ",");
        if (getChangeToken() != null)
            sb.append("ChangeToken: " + getChangeToken() + ",");
        if (getUpdates() != null)
            sb.append("Updates: " + getUpdates() + ",");
        if (getRateLimit() != null)
            sb.append("RateLimit: " + getRateLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        hashCode = prime * hashCode
                + ((getChangeToken() == null) ? 0 : getChangeToken().hashCode());
        hashCode = prime * hashCode + ((getUpdates() == null) ? 0 : getUpdates().hashCode());
        hashCode = prime * hashCode + ((getRateLimit() == null) ? 0 : getRateLimit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRateBasedRuleRequest == false)
            return false;
        UpdateRateBasedRuleRequest other = (UpdateRateBasedRuleRequest) obj;

        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        if (other.getChangeToken() == null ^ this.getChangeToken() == null)
            return false;
        if (other.getChangeToken() != null
                && other.getChangeToken().equals(this.getChangeToken()) == false)
            return false;
        if (other.getUpdates() == null ^ this.getUpdates() == null)
            return false;
        if (other.getUpdates() != null && other.getUpdates().equals(this.getUpdates()) == false)
            return false;
        if (other.getRateLimit() == null ^ this.getRateLimit() == null)
            return false;
        if (other.getRateLimit() != null
                && other.getRateLimit().equals(this.getRateLimit()) == false)
            return false;
        return true;
    }
}
