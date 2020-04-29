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
 * Returns the <a>RuleGroup</a> that is specified by the
 * <code>RuleGroupId</code> that you included in the <code>GetRuleGroup</code>
 * request.
 * </p>
 * <p>
 * To view the rules in a rule group, use <a>ListActivatedRulesInRuleGroup</a>.
 * </p>
 */
public class GetRuleGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The <code>RuleGroupId</code> of the <a>RuleGroup</a> that you want to
     * get. <code>RuleGroupId</code> is returned by <a>CreateRuleGroup</a> and
     * by <a>ListRuleGroups</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String ruleGroupId;

    /**
     * <p>
     * The <code>RuleGroupId</code> of the <a>RuleGroup</a> that you want to
     * get. <code>RuleGroupId</code> is returned by <a>CreateRuleGroup</a> and
     * by <a>ListRuleGroups</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The <code>RuleGroupId</code> of the <a>RuleGroup</a> that you
     *         want to get. <code>RuleGroupId</code> is returned by
     *         <a>CreateRuleGroup</a> and by <a>ListRuleGroups</a>.
     *         </p>
     */
    public String getRuleGroupId() {
        return ruleGroupId;
    }

    /**
     * <p>
     * The <code>RuleGroupId</code> of the <a>RuleGroup</a> that you want to
     * get. <code>RuleGroupId</code> is returned by <a>CreateRuleGroup</a> and
     * by <a>ListRuleGroups</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param ruleGroupId <p>
     *            The <code>RuleGroupId</code> of the <a>RuleGroup</a> that you
     *            want to get. <code>RuleGroupId</code> is returned by
     *            <a>CreateRuleGroup</a> and by <a>ListRuleGroups</a>.
     *            </p>
     */
    public void setRuleGroupId(String ruleGroupId) {
        this.ruleGroupId = ruleGroupId;
    }

    /**
     * <p>
     * The <code>RuleGroupId</code> of the <a>RuleGroup</a> that you want to
     * get. <code>RuleGroupId</code> is returned by <a>CreateRuleGroup</a> and
     * by <a>ListRuleGroups</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param ruleGroupId <p>
     *            The <code>RuleGroupId</code> of the <a>RuleGroup</a> that you
     *            want to get. <code>RuleGroupId</code> is returned by
     *            <a>CreateRuleGroup</a> and by <a>ListRuleGroups</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRuleGroupRequest withRuleGroupId(String ruleGroupId) {
        this.ruleGroupId = ruleGroupId;
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
        if (getRuleGroupId() != null)
            sb.append("RuleGroupId: " + getRuleGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRuleGroupId() == null) ? 0 : getRuleGroupId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRuleGroupRequest == false)
            return false;
        GetRuleGroupRequest other = (GetRuleGroupRequest) obj;

        if (other.getRuleGroupId() == null ^ this.getRuleGroupId() == null)
            return false;
        if (other.getRuleGroupId() != null
                && other.getRuleGroupId().equals(this.getRuleGroupId()) == false)
            return false;
        return true;
    }
}
