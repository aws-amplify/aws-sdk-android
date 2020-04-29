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

package com.amazonaws.services.awswaf.model;

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
 * Inserts or deletes <a>ActivatedRule</a> objects in a <code>RuleGroup</code>.
 * </p>
 * <p>
 * You can only insert <code>REGULAR</code> rules into a rule group.
 * </p>
 * <p>
 * You can have a maximum of ten rules per rule group.
 * </p>
 * <p>
 * To create and configure a <code>RuleGroup</code>, perform the following
 * steps:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Create and update the <code>Rules</code> that you want to include in the
 * <code>RuleGroup</code>. See <a>CreateRule</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use <code>GetChangeToken</code> to get the change token that you provide in
 * the <code>ChangeToken</code> parameter of an <a>UpdateRuleGroup</a> request.
 * </p>
 * </li>
 * <li>
 * <p>
 * Submit an <code>UpdateRuleGroup</code> request to add <code>Rules</code> to
 * the <code>RuleGroup</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Create and update a <code>WebACL</code> that contains the
 * <code>RuleGroup</code>. See <a>CreateWebACL</a>.
 * </p>
 * </li>
 * </ol>
 * <p>
 * If you want to replace one <code>Rule</code> with another, you delete the
 * existing one and add the new one.
 * </p>
 * <p>
 * For more information about how to use the AWS WAF API to allow or block HTTP
 * requests, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
 * Developer Guide</a>.
 * </p>
 */
public class UpdateRuleGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The <code>RuleGroupId</code> of the <a>RuleGroup</a> that you want to
     * update. <code>RuleGroupId</code> is returned by <a>CreateRuleGroup</a>
     * and by <a>ListRuleGroups</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String ruleGroupId;

    /**
     * <p>
     * An array of <code>RuleGroupUpdate</code> objects that you want to insert
     * into or delete from a <a>RuleGroup</a>.
     * </p>
     * <p>
     * You can only insert <code>REGULAR</code> rules into a rule group.
     * </p>
     * <p>
     * <code>ActivatedRule|OverrideAction</code> applies only when updating or
     * adding a <code>RuleGroup</code> to a <code>WebACL</code>. In this case
     * you do not use <code>ActivatedRule|Action</code>. For all other update
     * requests, <code>ActivatedRule|Action</code> is used instead of
     * <code>ActivatedRule|OverrideAction</code>.
     * </p>
     */
    private java.util.List<RuleGroupUpdate> updates;

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
     * The <code>RuleGroupId</code> of the <a>RuleGroup</a> that you want to
     * update. <code>RuleGroupId</code> is returned by <a>CreateRuleGroup</a>
     * and by <a>ListRuleGroups</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The <code>RuleGroupId</code> of the <a>RuleGroup</a> that you
     *         want to update. <code>RuleGroupId</code> is returned by
     *         <a>CreateRuleGroup</a> and by <a>ListRuleGroups</a>.
     *         </p>
     */
    public String getRuleGroupId() {
        return ruleGroupId;
    }

    /**
     * <p>
     * The <code>RuleGroupId</code> of the <a>RuleGroup</a> that you want to
     * update. <code>RuleGroupId</code> is returned by <a>CreateRuleGroup</a>
     * and by <a>ListRuleGroups</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param ruleGroupId <p>
     *            The <code>RuleGroupId</code> of the <a>RuleGroup</a> that you
     *            want to update. <code>RuleGroupId</code> is returned by
     *            <a>CreateRuleGroup</a> and by <a>ListRuleGroups</a>.
     *            </p>
     */
    public void setRuleGroupId(String ruleGroupId) {
        this.ruleGroupId = ruleGroupId;
    }

    /**
     * <p>
     * The <code>RuleGroupId</code> of the <a>RuleGroup</a> that you want to
     * update. <code>RuleGroupId</code> is returned by <a>CreateRuleGroup</a>
     * and by <a>ListRuleGroups</a>.
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
     *            want to update. <code>RuleGroupId</code> is returned by
     *            <a>CreateRuleGroup</a> and by <a>ListRuleGroups</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRuleGroupRequest withRuleGroupId(String ruleGroupId) {
        this.ruleGroupId = ruleGroupId;
        return this;
    }

    /**
     * <p>
     * An array of <code>RuleGroupUpdate</code> objects that you want to insert
     * into or delete from a <a>RuleGroup</a>.
     * </p>
     * <p>
     * You can only insert <code>REGULAR</code> rules into a rule group.
     * </p>
     * <p>
     * <code>ActivatedRule|OverrideAction</code> applies only when updating or
     * adding a <code>RuleGroup</code> to a <code>WebACL</code>. In this case
     * you do not use <code>ActivatedRule|Action</code>. For all other update
     * requests, <code>ActivatedRule|Action</code> is used instead of
     * <code>ActivatedRule|OverrideAction</code>.
     * </p>
     *
     * @return <p>
     *         An array of <code>RuleGroupUpdate</code> objects that you want to
     *         insert into or delete from a <a>RuleGroup</a>.
     *         </p>
     *         <p>
     *         You can only insert <code>REGULAR</code> rules into a rule group.
     *         </p>
     *         <p>
     *         <code>ActivatedRule|OverrideAction</code> applies only when
     *         updating or adding a <code>RuleGroup</code> to a
     *         <code>WebACL</code>. In this case you do not use
     *         <code>ActivatedRule|Action</code>. For all other update requests,
     *         <code>ActivatedRule|Action</code> is used instead of
     *         <code>ActivatedRule|OverrideAction</code>.
     *         </p>
     */
    public java.util.List<RuleGroupUpdate> getUpdates() {
        return updates;
    }

    /**
     * <p>
     * An array of <code>RuleGroupUpdate</code> objects that you want to insert
     * into or delete from a <a>RuleGroup</a>.
     * </p>
     * <p>
     * You can only insert <code>REGULAR</code> rules into a rule group.
     * </p>
     * <p>
     * <code>ActivatedRule|OverrideAction</code> applies only when updating or
     * adding a <code>RuleGroup</code> to a <code>WebACL</code>. In this case
     * you do not use <code>ActivatedRule|Action</code>. For all other update
     * requests, <code>ActivatedRule|Action</code> is used instead of
     * <code>ActivatedRule|OverrideAction</code>.
     * </p>
     *
     * @param updates <p>
     *            An array of <code>RuleGroupUpdate</code> objects that you want
     *            to insert into or delete from a <a>RuleGroup</a>.
     *            </p>
     *            <p>
     *            You can only insert <code>REGULAR</code> rules into a rule
     *            group.
     *            </p>
     *            <p>
     *            <code>ActivatedRule|OverrideAction</code> applies only when
     *            updating or adding a <code>RuleGroup</code> to a
     *            <code>WebACL</code>. In this case you do not use
     *            <code>ActivatedRule|Action</code>. For all other update
     *            requests, <code>ActivatedRule|Action</code> is used instead of
     *            <code>ActivatedRule|OverrideAction</code>.
     *            </p>
     */
    public void setUpdates(java.util.Collection<RuleGroupUpdate> updates) {
        if (updates == null) {
            this.updates = null;
            return;
        }

        this.updates = new java.util.ArrayList<RuleGroupUpdate>(updates);
    }

    /**
     * <p>
     * An array of <code>RuleGroupUpdate</code> objects that you want to insert
     * into or delete from a <a>RuleGroup</a>.
     * </p>
     * <p>
     * You can only insert <code>REGULAR</code> rules into a rule group.
     * </p>
     * <p>
     * <code>ActivatedRule|OverrideAction</code> applies only when updating or
     * adding a <code>RuleGroup</code> to a <code>WebACL</code>. In this case
     * you do not use <code>ActivatedRule|Action</code>. For all other update
     * requests, <code>ActivatedRule|Action</code> is used instead of
     * <code>ActivatedRule|OverrideAction</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updates <p>
     *            An array of <code>RuleGroupUpdate</code> objects that you want
     *            to insert into or delete from a <a>RuleGroup</a>.
     *            </p>
     *            <p>
     *            You can only insert <code>REGULAR</code> rules into a rule
     *            group.
     *            </p>
     *            <p>
     *            <code>ActivatedRule|OverrideAction</code> applies only when
     *            updating or adding a <code>RuleGroup</code> to a
     *            <code>WebACL</code>. In this case you do not use
     *            <code>ActivatedRule|Action</code>. For all other update
     *            requests, <code>ActivatedRule|Action</code> is used instead of
     *            <code>ActivatedRule|OverrideAction</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRuleGroupRequest withUpdates(RuleGroupUpdate... updates) {
        if (getUpdates() == null) {
            this.updates = new java.util.ArrayList<RuleGroupUpdate>(updates.length);
        }
        for (RuleGroupUpdate value : updates) {
            this.updates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>RuleGroupUpdate</code> objects that you want to insert
     * into or delete from a <a>RuleGroup</a>.
     * </p>
     * <p>
     * You can only insert <code>REGULAR</code> rules into a rule group.
     * </p>
     * <p>
     * <code>ActivatedRule|OverrideAction</code> applies only when updating or
     * adding a <code>RuleGroup</code> to a <code>WebACL</code>. In this case
     * you do not use <code>ActivatedRule|Action</code>. For all other update
     * requests, <code>ActivatedRule|Action</code> is used instead of
     * <code>ActivatedRule|OverrideAction</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updates <p>
     *            An array of <code>RuleGroupUpdate</code> objects that you want
     *            to insert into or delete from a <a>RuleGroup</a>.
     *            </p>
     *            <p>
     *            You can only insert <code>REGULAR</code> rules into a rule
     *            group.
     *            </p>
     *            <p>
     *            <code>ActivatedRule|OverrideAction</code> applies only when
     *            updating or adding a <code>RuleGroup</code> to a
     *            <code>WebACL</code>. In this case you do not use
     *            <code>ActivatedRule|Action</code>. For all other update
     *            requests, <code>ActivatedRule|Action</code> is used instead of
     *            <code>ActivatedRule|OverrideAction</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRuleGroupRequest withUpdates(java.util.Collection<RuleGroupUpdate> updates) {
        setUpdates(updates);
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
    public UpdateRuleGroupRequest withChangeToken(String changeToken) {
        this.changeToken = changeToken;
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
            sb.append("RuleGroupId: " + getRuleGroupId() + ",");
        if (getUpdates() != null)
            sb.append("Updates: " + getUpdates() + ",");
        if (getChangeToken() != null)
            sb.append("ChangeToken: " + getChangeToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRuleGroupId() == null) ? 0 : getRuleGroupId().hashCode());
        hashCode = prime * hashCode + ((getUpdates() == null) ? 0 : getUpdates().hashCode());
        hashCode = prime * hashCode
                + ((getChangeToken() == null) ? 0 : getChangeToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRuleGroupRequest == false)
            return false;
        UpdateRuleGroupRequest other = (UpdateRuleGroupRequest) obj;

        if (other.getRuleGroupId() == null ^ this.getRuleGroupId() == null)
            return false;
        if (other.getRuleGroupId() != null
                && other.getRuleGroupId().equals(this.getRuleGroupId()) == false)
            return false;
        if (other.getUpdates() == null ^ this.getUpdates() == null)
            return false;
        if (other.getUpdates() != null && other.getUpdates().equals(this.getUpdates()) == false)
            return false;
        if (other.getChangeToken() == null ^ this.getChangeToken() == null)
            return false;
        if (other.getChangeToken() != null
                && other.getChangeToken().equals(this.getChangeToken()) == false)
            return false;
        return true;
    }
}
