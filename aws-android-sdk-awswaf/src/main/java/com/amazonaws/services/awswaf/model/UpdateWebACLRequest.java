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
 * Inserts or deletes <a>ActivatedRule</a> objects in a <code>WebACL</code>.
 * Each <code>Rule</code> identifies web requests that you want to allow, block,
 * or count. When you update a <code>WebACL</code>, you specify the following
 * values:
 * </p>
 * <ul>
 * <li>
 * <p>
 * A default action for the <code>WebACL</code>, either <code>ALLOW</code> or
 * <code>BLOCK</code>. AWS WAF performs the default action if a request doesn't
 * match the criteria in any of the <code>Rules</code> in a <code>WebACL</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <code>Rules</code> that you want to add or delete. If you want to replace
 * one <code>Rule</code> with another, you delete the existing <code>Rule</code>
 * and add the new one.
 * </p>
 * </li>
 * <li>
 * <p>
 * For each <code>Rule</code>, whether you want AWS WAF to allow requests, block
 * requests, or count requests that match the conditions in the
 * <code>Rule</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The order in which you want AWS WAF to evaluate the <code>Rules</code> in a
 * <code>WebACL</code>. If you add more than one <code>Rule</code> to a
 * <code>WebACL</code>, AWS WAF evaluates each request against the
 * <code>Rules</code> in order based on the value of <code>Priority</code>. (The
 * <code>Rule</code> that has the lowest value for <code>Priority</code> is
 * evaluated first.) When a web request matches all the predicates (such as
 * <code>ByteMatchSets</code> and <code>IPSets</code>) in a <code>Rule</code>,
 * AWS WAF immediately takes the corresponding action, allow or block, and
 * doesn't evaluate the request against the remaining <code>Rules</code> in the
 * <code>WebACL</code>, if any.
 * </p>
 * </li>
 * </ul>
 * <p>
 * To create and configure a <code>WebACL</code>, perform the following steps:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Create and update the predicates that you want to include in
 * <code>Rules</code>. For more information, see <a>CreateByteMatchSet</a>,
 * <a>UpdateByteMatchSet</a>, <a>CreateIPSet</a>, <a>UpdateIPSet</a>,
 * <a>CreateSqlInjectionMatchSet</a>, and <a>UpdateSqlInjectionMatchSet</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Create and update the <code>Rules</code> that you want to include in the
 * <code>WebACL</code>. For more information, see <a>CreateRule</a> and
 * <a>UpdateRule</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Create a <code>WebACL</code>. See <a>CreateWebACL</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use <code>GetChangeToken</code> to get the change token that you provide in
 * the <code>ChangeToken</code> parameter of an <a>UpdateWebACL</a> request.
 * </p>
 * </li>
 * <li>
 * <p>
 * Submit an <code>UpdateWebACL</code> request to specify the <code>Rules</code>
 * that you want to include in the <code>WebACL</code>, to specify the default
 * action, and to associate the <code>WebACL</code> with a CloudFront
 * distribution.
 * </p>
 * <p>
 * The <code>ActivatedRule</code> can be a rule group. If you specify a rule
 * group as your <code>ActivatedRule</code> , you can exclude specific rules
 * from that rule group.
 * </p>
 * <p>
 * If you already have a rule group associated with a web ACL and want to submit
 * an <code>UpdateWebACL</code> request to exclude certain rules from that rule
 * group, you must first remove the rule group from the web ACL, the re-insert
 * it again, specifying the excluded rules. For details, see
 * <a>ActivatedRule$ExcludedRules</a> .
 * </p>
 * </li>
 * </ol>
 * <p>
 * Be aware that if you try to add a RATE_BASED rule to a web ACL without
 * setting the rule type when first creating the rule, the <a>UpdateWebACL</a>
 * request will fail because the request tries to add a REGULAR rule (the
 * default rule type) with the specified ID, which does not exist.
 * </p>
 * <p>
 * For more information about how to use the AWS WAF API to allow or block HTTP
 * requests, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
 * Developer Guide</a>.
 * </p>
 */
public class UpdateWebACLRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The <code>WebACLId</code> of the <a>WebACL</a> that you want to update.
     * <code>WebACLId</code> is returned by <a>CreateWebACL</a> and by
     * <a>ListWebACLs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String webACLId;

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
     * An array of updates to make to the <a>WebACL</a>.
     * </p>
     * <p>
     * An array of <code>WebACLUpdate</code> objects that you want to insert
     * into or delete from a <a>WebACL</a>. For more information, see the
     * applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>WebACLUpdate</a>: Contains <code>Action</code> and
     * <code>ActivatedRule</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ActivatedRule</a>: Contains <code>Action</code>,
     * <code>OverrideAction</code>, <code>Priority</code>, <code>RuleId</code>,
     * and <code>Type</code>. <code>ActivatedRule|OverrideAction</code> applies
     * only when updating or adding a <code>RuleGroup</code> to a
     * <code>WebACL</code>. In this case, you do not use
     * <code>ActivatedRule|Action</code>. For all other update requests,
     * <code>ActivatedRule|Action</code> is used instead of
     * <code>ActivatedRule|OverrideAction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>WafAction</a>: Contains <code>Type</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<WebACLUpdate> updates;

    /**
     * <p>
     * A default action for the web ACL, either ALLOW or BLOCK. AWS WAF performs
     * the default action if a request doesn't match the criteria in any of the
     * rules in a web ACL.
     * </p>
     */
    private WafAction defaultAction;

    /**
     * <p>
     * The <code>WebACLId</code> of the <a>WebACL</a> that you want to update.
     * <code>WebACLId</code> is returned by <a>CreateWebACL</a> and by
     * <a>ListWebACLs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The <code>WebACLId</code> of the <a>WebACL</a> that you want to
     *         update. <code>WebACLId</code> is returned by <a>CreateWebACL</a>
     *         and by <a>ListWebACLs</a>.
     *         </p>
     */
    public String getWebACLId() {
        return webACLId;
    }

    /**
     * <p>
     * The <code>WebACLId</code> of the <a>WebACL</a> that you want to update.
     * <code>WebACLId</code> is returned by <a>CreateWebACL</a> and by
     * <a>ListWebACLs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param webACLId <p>
     *            The <code>WebACLId</code> of the <a>WebACL</a> that you want
     *            to update. <code>WebACLId</code> is returned by
     *            <a>CreateWebACL</a> and by <a>ListWebACLs</a>.
     *            </p>
     */
    public void setWebACLId(String webACLId) {
        this.webACLId = webACLId;
    }

    /**
     * <p>
     * The <code>WebACLId</code> of the <a>WebACL</a> that you want to update.
     * <code>WebACLId</code> is returned by <a>CreateWebACL</a> and by
     * <a>ListWebACLs</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param webACLId <p>
     *            The <code>WebACLId</code> of the <a>WebACL</a> that you want
     *            to update. <code>WebACLId</code> is returned by
     *            <a>CreateWebACL</a> and by <a>ListWebACLs</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateWebACLRequest withWebACLId(String webACLId) {
        this.webACLId = webACLId;
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
    public UpdateWebACLRequest withChangeToken(String changeToken) {
        this.changeToken = changeToken;
        return this;
    }

    /**
     * <p>
     * An array of updates to make to the <a>WebACL</a>.
     * </p>
     * <p>
     * An array of <code>WebACLUpdate</code> objects that you want to insert
     * into or delete from a <a>WebACL</a>. For more information, see the
     * applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>WebACLUpdate</a>: Contains <code>Action</code> and
     * <code>ActivatedRule</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ActivatedRule</a>: Contains <code>Action</code>,
     * <code>OverrideAction</code>, <code>Priority</code>, <code>RuleId</code>,
     * and <code>Type</code>. <code>ActivatedRule|OverrideAction</code> applies
     * only when updating or adding a <code>RuleGroup</code> to a
     * <code>WebACL</code>. In this case, you do not use
     * <code>ActivatedRule|Action</code>. For all other update requests,
     * <code>ActivatedRule|Action</code> is used instead of
     * <code>ActivatedRule|OverrideAction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>WafAction</a>: Contains <code>Type</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         An array of updates to make to the <a>WebACL</a>.
     *         </p>
     *         <p>
     *         An array of <code>WebACLUpdate</code> objects that you want to
     *         insert into or delete from a <a>WebACL</a>. For more information,
     *         see the applicable data types:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a>WebACLUpdate</a>: Contains <code>Action</code> and
     *         <code>ActivatedRule</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>ActivatedRule</a>: Contains <code>Action</code>,
     *         <code>OverrideAction</code>, <code>Priority</code>,
     *         <code>RuleId</code>, and <code>Type</code>.
     *         <code>ActivatedRule|OverrideAction</code> applies only when
     *         updating or adding a <code>RuleGroup</code> to a
     *         <code>WebACL</code>. In this case, you do not use
     *         <code>ActivatedRule|Action</code>. For all other update requests,
     *         <code>ActivatedRule|Action</code> is used instead of
     *         <code>ActivatedRule|OverrideAction</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>WafAction</a>: Contains <code>Type</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<WebACLUpdate> getUpdates() {
        return updates;
    }

    /**
     * <p>
     * An array of updates to make to the <a>WebACL</a>.
     * </p>
     * <p>
     * An array of <code>WebACLUpdate</code> objects that you want to insert
     * into or delete from a <a>WebACL</a>. For more information, see the
     * applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>WebACLUpdate</a>: Contains <code>Action</code> and
     * <code>ActivatedRule</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ActivatedRule</a>: Contains <code>Action</code>,
     * <code>OverrideAction</code>, <code>Priority</code>, <code>RuleId</code>,
     * and <code>Type</code>. <code>ActivatedRule|OverrideAction</code> applies
     * only when updating or adding a <code>RuleGroup</code> to a
     * <code>WebACL</code>. In this case, you do not use
     * <code>ActivatedRule|Action</code>. For all other update requests,
     * <code>ActivatedRule|Action</code> is used instead of
     * <code>ActivatedRule|OverrideAction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>WafAction</a>: Contains <code>Type</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param updates <p>
     *            An array of updates to make to the <a>WebACL</a>.
     *            </p>
     *            <p>
     *            An array of <code>WebACLUpdate</code> objects that you want to
     *            insert into or delete from a <a>WebACL</a>. For more
     *            information, see the applicable data types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>WebACLUpdate</a>: Contains <code>Action</code> and
     *            <code>ActivatedRule</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ActivatedRule</a>: Contains <code>Action</code>,
     *            <code>OverrideAction</code>, <code>Priority</code>,
     *            <code>RuleId</code>, and <code>Type</code>.
     *            <code>ActivatedRule|OverrideAction</code> applies only when
     *            updating or adding a <code>RuleGroup</code> to a
     *            <code>WebACL</code>. In this case, you do not use
     *            <code>ActivatedRule|Action</code>. For all other update
     *            requests, <code>ActivatedRule|Action</code> is used instead of
     *            <code>ActivatedRule|OverrideAction</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>WafAction</a>: Contains <code>Type</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setUpdates(java.util.Collection<WebACLUpdate> updates) {
        if (updates == null) {
            this.updates = null;
            return;
        }

        this.updates = new java.util.ArrayList<WebACLUpdate>(updates);
    }

    /**
     * <p>
     * An array of updates to make to the <a>WebACL</a>.
     * </p>
     * <p>
     * An array of <code>WebACLUpdate</code> objects that you want to insert
     * into or delete from a <a>WebACL</a>. For more information, see the
     * applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>WebACLUpdate</a>: Contains <code>Action</code> and
     * <code>ActivatedRule</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ActivatedRule</a>: Contains <code>Action</code>,
     * <code>OverrideAction</code>, <code>Priority</code>, <code>RuleId</code>,
     * and <code>Type</code>. <code>ActivatedRule|OverrideAction</code> applies
     * only when updating or adding a <code>RuleGroup</code> to a
     * <code>WebACL</code>. In this case, you do not use
     * <code>ActivatedRule|Action</code>. For all other update requests,
     * <code>ActivatedRule|Action</code> is used instead of
     * <code>ActivatedRule|OverrideAction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>WafAction</a>: Contains <code>Type</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updates <p>
     *            An array of updates to make to the <a>WebACL</a>.
     *            </p>
     *            <p>
     *            An array of <code>WebACLUpdate</code> objects that you want to
     *            insert into or delete from a <a>WebACL</a>. For more
     *            information, see the applicable data types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>WebACLUpdate</a>: Contains <code>Action</code> and
     *            <code>ActivatedRule</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ActivatedRule</a>: Contains <code>Action</code>,
     *            <code>OverrideAction</code>, <code>Priority</code>,
     *            <code>RuleId</code>, and <code>Type</code>.
     *            <code>ActivatedRule|OverrideAction</code> applies only when
     *            updating or adding a <code>RuleGroup</code> to a
     *            <code>WebACL</code>. In this case, you do not use
     *            <code>ActivatedRule|Action</code>. For all other update
     *            requests, <code>ActivatedRule|Action</code> is used instead of
     *            <code>ActivatedRule|OverrideAction</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>WafAction</a>: Contains <code>Type</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateWebACLRequest withUpdates(WebACLUpdate... updates) {
        if (getUpdates() == null) {
            this.updates = new java.util.ArrayList<WebACLUpdate>(updates.length);
        }
        for (WebACLUpdate value : updates) {
            this.updates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of updates to make to the <a>WebACL</a>.
     * </p>
     * <p>
     * An array of <code>WebACLUpdate</code> objects that you want to insert
     * into or delete from a <a>WebACL</a>. For more information, see the
     * applicable data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>WebACLUpdate</a>: Contains <code>Action</code> and
     * <code>ActivatedRule</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ActivatedRule</a>: Contains <code>Action</code>,
     * <code>OverrideAction</code>, <code>Priority</code>, <code>RuleId</code>,
     * and <code>Type</code>. <code>ActivatedRule|OverrideAction</code> applies
     * only when updating or adding a <code>RuleGroup</code> to a
     * <code>WebACL</code>. In this case, you do not use
     * <code>ActivatedRule|Action</code>. For all other update requests,
     * <code>ActivatedRule|Action</code> is used instead of
     * <code>ActivatedRule|OverrideAction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>WafAction</a>: Contains <code>Type</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updates <p>
     *            An array of updates to make to the <a>WebACL</a>.
     *            </p>
     *            <p>
     *            An array of <code>WebACLUpdate</code> objects that you want to
     *            insert into or delete from a <a>WebACL</a>. For more
     *            information, see the applicable data types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>WebACLUpdate</a>: Contains <code>Action</code> and
     *            <code>ActivatedRule</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ActivatedRule</a>: Contains <code>Action</code>,
     *            <code>OverrideAction</code>, <code>Priority</code>,
     *            <code>RuleId</code>, and <code>Type</code>.
     *            <code>ActivatedRule|OverrideAction</code> applies only when
     *            updating or adding a <code>RuleGroup</code> to a
     *            <code>WebACL</code>. In this case, you do not use
     *            <code>ActivatedRule|Action</code>. For all other update
     *            requests, <code>ActivatedRule|Action</code> is used instead of
     *            <code>ActivatedRule|OverrideAction</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>WafAction</a>: Contains <code>Type</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateWebACLRequest withUpdates(java.util.Collection<WebACLUpdate> updates) {
        setUpdates(updates);
        return this;
    }

    /**
     * <p>
     * A default action for the web ACL, either ALLOW or BLOCK. AWS WAF performs
     * the default action if a request doesn't match the criteria in any of the
     * rules in a web ACL.
     * </p>
     *
     * @return <p>
     *         A default action for the web ACL, either ALLOW or BLOCK. AWS WAF
     *         performs the default action if a request doesn't match the
     *         criteria in any of the rules in a web ACL.
     *         </p>
     */
    public WafAction getDefaultAction() {
        return defaultAction;
    }

    /**
     * <p>
     * A default action for the web ACL, either ALLOW or BLOCK. AWS WAF performs
     * the default action if a request doesn't match the criteria in any of the
     * rules in a web ACL.
     * </p>
     *
     * @param defaultAction <p>
     *            A default action for the web ACL, either ALLOW or BLOCK. AWS
     *            WAF performs the default action if a request doesn't match the
     *            criteria in any of the rules in a web ACL.
     *            </p>
     */
    public void setDefaultAction(WafAction defaultAction) {
        this.defaultAction = defaultAction;
    }

    /**
     * <p>
     * A default action for the web ACL, either ALLOW or BLOCK. AWS WAF performs
     * the default action if a request doesn't match the criteria in any of the
     * rules in a web ACL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultAction <p>
     *            A default action for the web ACL, either ALLOW or BLOCK. AWS
     *            WAF performs the default action if a request doesn't match the
     *            criteria in any of the rules in a web ACL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateWebACLRequest withDefaultAction(WafAction defaultAction) {
        this.defaultAction = defaultAction;
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
        if (getWebACLId() != null)
            sb.append("WebACLId: " + getWebACLId() + ",");
        if (getChangeToken() != null)
            sb.append("ChangeToken: " + getChangeToken() + ",");
        if (getUpdates() != null)
            sb.append("Updates: " + getUpdates() + ",");
        if (getDefaultAction() != null)
            sb.append("DefaultAction: " + getDefaultAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebACLId() == null) ? 0 : getWebACLId().hashCode());
        hashCode = prime * hashCode
                + ((getChangeToken() == null) ? 0 : getChangeToken().hashCode());
        hashCode = prime * hashCode + ((getUpdates() == null) ? 0 : getUpdates().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultAction() == null) ? 0 : getDefaultAction().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWebACLRequest == false)
            return false;
        UpdateWebACLRequest other = (UpdateWebACLRequest) obj;

        if (other.getWebACLId() == null ^ this.getWebACLId() == null)
            return false;
        if (other.getWebACLId() != null && other.getWebACLId().equals(this.getWebACLId()) == false)
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
        if (other.getDefaultAction() == null ^ this.getDefaultAction() == null)
            return false;
        if (other.getDefaultAction() != null
                && other.getDefaultAction().equals(this.getDefaultAction()) == false)
            return false;
        return true;
    }
}
