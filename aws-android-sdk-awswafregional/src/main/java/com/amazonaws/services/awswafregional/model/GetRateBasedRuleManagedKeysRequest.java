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
 * Returns an array of IP addresses currently being blocked by the
 * <a>RateBasedRule</a> that is specified by the <code>RuleId</code>. The
 * maximum number of managed keys that will be blocked is 10,000. If more than
 * 10,000 addresses exceed the rate limit, the 10,000 addresses with the highest
 * rates will be blocked.
 * </p>
 */
public class GetRateBasedRuleManagedKeysRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The <code>RuleId</code> of the <a>RateBasedRule</a> for which you want to
     * get a list of <code>ManagedKeys</code>. <code>RuleId</code> is returned
     * by <a>CreateRateBasedRule</a> and by <a>ListRateBasedRules</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String ruleId;

    /**
     * <p>
     * A null value and not currently used. Do not include this in your request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String nextMarker;

    /**
     * <p>
     * The <code>RuleId</code> of the <a>RateBasedRule</a> for which you want to
     * get a list of <code>ManagedKeys</code>. <code>RuleId</code> is returned
     * by <a>CreateRateBasedRule</a> and by <a>ListRateBasedRules</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The <code>RuleId</code> of the <a>RateBasedRule</a> for which you
     *         want to get a list of <code>ManagedKeys</code>.
     *         <code>RuleId</code> is returned by <a>CreateRateBasedRule</a> and
     *         by <a>ListRateBasedRules</a>.
     *         </p>
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * <p>
     * The <code>RuleId</code> of the <a>RateBasedRule</a> for which you want to
     * get a list of <code>ManagedKeys</code>. <code>RuleId</code> is returned
     * by <a>CreateRateBasedRule</a> and by <a>ListRateBasedRules</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param ruleId <p>
     *            The <code>RuleId</code> of the <a>RateBasedRule</a> for which
     *            you want to get a list of <code>ManagedKeys</code>.
     *            <code>RuleId</code> is returned by <a>CreateRateBasedRule</a>
     *            and by <a>ListRateBasedRules</a>.
     *            </p>
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * The <code>RuleId</code> of the <a>RateBasedRule</a> for which you want to
     * get a list of <code>ManagedKeys</code>. <code>RuleId</code> is returned
     * by <a>CreateRateBasedRule</a> and by <a>ListRateBasedRules</a>.
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
     *            The <code>RuleId</code> of the <a>RateBasedRule</a> for which
     *            you want to get a list of <code>ManagedKeys</code>.
     *            <code>RuleId</code> is returned by <a>CreateRateBasedRule</a>
     *            and by <a>ListRateBasedRules</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRateBasedRuleManagedKeysRequest withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * <p>
     * A null value and not currently used. Do not include this in your request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A null value and not currently used. Do not include this in your
     *         request.
     *         </p>
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * <p>
     * A null value and not currently used. Do not include this in your request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextMarker <p>
     *            A null value and not currently used. Do not include this in
     *            your request.
     *            </p>
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * A null value and not currently used. Do not include this in your request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextMarker <p>
     *            A null value and not currently used. Do not include this in
     *            your request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRateBasedRuleManagedKeysRequest withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
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
        if (getNextMarker() != null)
            sb.append("NextMarker: " + getNextMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRateBasedRuleManagedKeysRequest == false)
            return false;
        GetRateBasedRuleManagedKeysRequest other = (GetRateBasedRuleManagedKeysRequest) obj;

        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
    }
}
