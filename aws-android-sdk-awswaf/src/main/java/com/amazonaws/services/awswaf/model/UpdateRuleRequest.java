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
 * Inserts or deletes <a>Predicate</a> objects in a <code>Rule</code>. Each
 * <code>Predicate</code> object identifies a predicate, such as a
 * <a>ByteMatchSet</a> or an <a>IPSet</a>, that specifies the web requests that
 * you want to allow, block, or count. If you add more than one predicate to a
 * <code>Rule</code>, a request must match all of the specifications to be
 * allowed, blocked, or counted. For example, suppose that you add the following
 * to a <code>Rule</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * A <code>ByteMatchSet</code> that matches the value <code>BadBot</code> in the
 * <code>User-Agent</code> header
 * </p>
 * </li>
 * <li>
 * <p>
 * An <code>IPSet</code> that matches the IP address <code>192.0.2.44</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * You then add the <code>Rule</code> to a <code>WebACL</code> and specify that
 * you want to block requests that satisfy the <code>Rule</code>. For a request
 * to be blocked, the <code>User-Agent</code> header in the request must contain
 * the value <code>BadBot</code> <i>and</i> the request must originate from the
 * IP address 192.0.2.44.
 * </p>
 * <p>
 * To create and configure a <code>Rule</code>, perform the following steps:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Create and update the predicates that you want to include in the
 * <code>Rule</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Create the <code>Rule</code>. See <a>CreateRule</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use <code>GetChangeToken</code> to get the change token that you provide in
 * the <code>ChangeToken</code> parameter of an <a>UpdateRule</a> request.
 * </p>
 * </li>
 * <li>
 * <p>
 * Submit an <code>UpdateRule</code> request to add predicates to the
 * <code>Rule</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Create and update a <code>WebACL</code> that contains the <code>Rule</code>.
 * See <a>CreateWebACL</a>.
 * </p>
 * </li>
 * </ol>
 * <p>
 * If you want to replace one <code>ByteMatchSet</code> or <code>IPSet</code>
 * with another, you delete the existing one and add the new one.
 * </p>
 * <p>
 * For more information about how to use the AWS WAF API to allow or block HTTP
 * requests, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
 * Developer Guide</a>.
 * </p>
 */
public class UpdateRuleRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The <code>RuleId</code> of the <code>Rule</code> that you want to update.
     * <code>RuleId</code> is returned by <code>CreateRule</code> and by
     * <a>ListRules</a>.
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
     * or delete from a <a>Rule</a>. For more information, see the applicable
     * data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>RuleUpdate</a>: Contains <code>Action</code> and
     * <code>Predicate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>Predicate</a>: Contains <code>DataId</code>, <code>Negated</code>, and
     * <code>Type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<RuleUpdate> updates;

    /**
     * <p>
     * The <code>RuleId</code> of the <code>Rule</code> that you want to update.
     * <code>RuleId</code> is returned by <code>CreateRule</code> and by
     * <a>ListRules</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The <code>RuleId</code> of the <code>Rule</code> that you want to
     *         update. <code>RuleId</code> is returned by
     *         <code>CreateRule</code> and by <a>ListRules</a>.
     *         </p>
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * <p>
     * The <code>RuleId</code> of the <code>Rule</code> that you want to update.
     * <code>RuleId</code> is returned by <code>CreateRule</code> and by
     * <a>ListRules</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param ruleId <p>
     *            The <code>RuleId</code> of the <code>Rule</code> that you want
     *            to update. <code>RuleId</code> is returned by
     *            <code>CreateRule</code> and by <a>ListRules</a>.
     *            </p>
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * The <code>RuleId</code> of the <code>Rule</code> that you want to update.
     * <code>RuleId</code> is returned by <code>CreateRule</code> and by
     * <a>ListRules</a>.
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
     *            The <code>RuleId</code> of the <code>Rule</code> that you want
     *            to update. <code>RuleId</code> is returned by
     *            <code>CreateRule</code> and by <a>ListRules</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRuleRequest withRuleId(String ruleId) {
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
    public UpdateRuleRequest withChangeToken(String changeToken) {
        this.changeToken = changeToken;
        return this;
    }

    /**
     * <p>
     * An array of <code>RuleUpdate</code> objects that you want to insert into
     * or delete from a <a>Rule</a>. For more information, see the applicable
     * data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>RuleUpdate</a>: Contains <code>Action</code> and
     * <code>Predicate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>Predicate</a>: Contains <code>DataId</code>, <code>Negated</code>, and
     * <code>Type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         An array of <code>RuleUpdate</code> objects that you want to
     *         insert into or delete from a <a>Rule</a>. For more information,
     *         see the applicable data types:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a>RuleUpdate</a>: Contains <code>Action</code> and
     *         <code>Predicate</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>Predicate</a>: Contains <code>DataId</code>,
     *         <code>Negated</code>, and <code>Type</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>FieldToMatch</a>: Contains <code>Data</code> and
     *         <code>Type</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<RuleUpdate> getUpdates() {
        return updates;
    }

    /**
     * <p>
     * An array of <code>RuleUpdate</code> objects that you want to insert into
     * or delete from a <a>Rule</a>. For more information, see the applicable
     * data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>RuleUpdate</a>: Contains <code>Action</code> and
     * <code>Predicate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>Predicate</a>: Contains <code>DataId</code>, <code>Negated</code>, and
     * <code>Type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param updates <p>
     *            An array of <code>RuleUpdate</code> objects that you want to
     *            insert into or delete from a <a>Rule</a>. For more
     *            information, see the applicable data types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>RuleUpdate</a>: Contains <code>Action</code> and
     *            <code>Predicate</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>Predicate</a>: Contains <code>DataId</code>,
     *            <code>Negated</code>, and <code>Type</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>FieldToMatch</a>: Contains <code>Data</code> and
     *            <code>Type</code>
     *            </p>
     *            </li>
     *            </ul>
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
     * or delete from a <a>Rule</a>. For more information, see the applicable
     * data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>RuleUpdate</a>: Contains <code>Action</code> and
     * <code>Predicate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>Predicate</a>: Contains <code>DataId</code>, <code>Negated</code>, and
     * <code>Type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updates <p>
     *            An array of <code>RuleUpdate</code> objects that you want to
     *            insert into or delete from a <a>Rule</a>. For more
     *            information, see the applicable data types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>RuleUpdate</a>: Contains <code>Action</code> and
     *            <code>Predicate</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>Predicate</a>: Contains <code>DataId</code>,
     *            <code>Negated</code>, and <code>Type</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>FieldToMatch</a>: Contains <code>Data</code> and
     *            <code>Type</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRuleRequest withUpdates(RuleUpdate... updates) {
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
     * or delete from a <a>Rule</a>. For more information, see the applicable
     * data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>RuleUpdate</a>: Contains <code>Action</code> and
     * <code>Predicate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>Predicate</a>: Contains <code>DataId</code>, <code>Negated</code>, and
     * <code>Type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updates <p>
     *            An array of <code>RuleUpdate</code> objects that you want to
     *            insert into or delete from a <a>Rule</a>. For more
     *            information, see the applicable data types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>RuleUpdate</a>: Contains <code>Action</code> and
     *            <code>Predicate</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>Predicate</a>: Contains <code>DataId</code>,
     *            <code>Negated</code>, and <code>Type</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>FieldToMatch</a>: Contains <code>Data</code> and
     *            <code>Type</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRuleRequest withUpdates(java.util.Collection<RuleUpdate> updates) {
        setUpdates(updates);
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
            sb.append("Updates: " + getUpdates());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRuleRequest == false)
            return false;
        UpdateRuleRequest other = (UpdateRuleRequest) obj;

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
        return true;
    }
}
