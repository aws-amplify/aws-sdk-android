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
 * The <code>ActivatedRule</code> object in an <a>UpdateWebACL</a> request
 * specifies a <code>Rule</code> that you want to insert or delete, the priority
 * of the <code>Rule</code> in the <code>WebACL</code>, and the action that you
 * want AWS WAF to take when a web request matches the <code>Rule</code> (
 * <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>).
 * </p>
 * <p>
 * To specify whether to insert or delete a <code>Rule</code>, use the
 * <code>Action</code> parameter in the <a>WebACLUpdate</a> data type.
 * </p>
 */
public class ActivatedRule implements Serializable {
    /**
     * <p>
     * Specifies the order in which the <code>Rules</code> in a
     * <code>WebACL</code> are evaluated. Rules with a lower value for
     * <code>Priority</code> are evaluated before <code>Rules</code> with a
     * higher value. The value must be a unique integer. If you add multiple
     * <code>Rules</code> to a <code>WebACL</code>, the values don't need to be
     * consecutive.
     * </p>
     */
    private Integer priority;

    /**
     * <p>
     * The <code>RuleId</code> for a <code>Rule</code>. You use
     * <code>RuleId</code> to get more information about a <code>Rule</code>
     * (see <a>GetRule</a>), update a <code>Rule</code> (see <a>UpdateRule</a>),
     * insert a <code>Rule</code> into a <code>WebACL</code> or delete a one
     * from a <code>WebACL</code> (see <a>UpdateWebACL</a>), or delete a
     * <code>Rule</code> from AWS WAF (see <a>DeleteRule</a>).
     * </p>
     * <p>
     * <code>RuleId</code> is returned by <a>CreateRule</a> and by
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
     * Specifies the action that CloudFront or AWS WAF takes when a web request
     * matches the conditions in the <code>Rule</code>. Valid values for
     * <code>Action</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW</code>: CloudFront responds with the requested object.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BLOCK</code>: CloudFront responds with an HTTP 403 (Forbidden)
     * status code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code>: AWS WAF increments a counter of requests that match
     * the conditions in the rule and then continues to inspect the web request
     * based on the remaining rules in the web ACL.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>ActivatedRule|OverrideAction</code> applies only when updating or
     * adding a <code>RuleGroup</code> to a <code>WebACL</code>. In this case,
     * you do not use <code>ActivatedRule|Action</code>. For all other update
     * requests, <code>ActivatedRule|Action</code> is used instead of
     * <code>ActivatedRule|OverrideAction</code>.
     * </p>
     */
    private WafAction action;

    /**
     * <p>
     * Use the <code>OverrideAction</code> to test your <code>RuleGroup</code>.
     * </p>
     * <p>
     * Any rule in a <code>RuleGroup</code> can potentially block a request. If
     * you set the <code>OverrideAction</code> to <code>None</code>, the
     * <code>RuleGroup</code> will block a request if any individual rule in the
     * <code>RuleGroup</code> matches the request and is configured to block
     * that request. However if you first want to test the
     * <code>RuleGroup</code>, set the <code>OverrideAction</code> to
     * <code>Count</code>. The <code>RuleGroup</code> will then override any
     * block action specified by individual rules contained within the group.
     * Instead of blocking matching requests, those requests will be counted.
     * You can view a record of counted requests using
     * <a>GetSampledRequests</a>.
     * </p>
     * <p>
     * <code>ActivatedRule|OverrideAction</code> applies only when updating or
     * adding a <code>RuleGroup</code> to a <code>WebACL</code>. In this case
     * you do not use <code>ActivatedRule|Action</code>. For all other update
     * requests, <code>ActivatedRule|Action</code> is used instead of
     * <code>ActivatedRule|OverrideAction</code>.
     * </p>
     */
    private WafOverrideAction overrideAction;

    /**
     * <p>
     * The rule type, either <code>REGULAR</code>, as defined by <a>Rule</a>,
     * <code>RATE_BASED</code>, as defined by <a>RateBasedRule</a>, or
     * <code>GROUP</code>, as defined by <a>RuleGroup</a>. The default is
     * REGULAR. Although this field is optional, be aware that if you try to add
     * a RATE_BASED rule to a web ACL without setting the type, the
     * <a>UpdateWebACL</a> request will fail because the request tries to add a
     * REGULAR rule with the specified ID, which does not exist.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGULAR, RATE_BASED, GROUP
     */
    private String type;

    /**
     * <p>
     * An array of rules to exclude from a rule group. This is applicable only
     * when the <code>ActivatedRule</code> refers to a <code>RuleGroup</code>.
     * </p>
     * <p>
     * Sometimes it is necessary to troubleshoot rule groups that are blocking
     * traffic unexpectedly (false positives). One troubleshooting technique is
     * to identify the specific rule within the rule group that is blocking the
     * legitimate traffic and then disable (exclude) that particular rule. You
     * can exclude rules from both your own rule groups and AWS Marketplace rule
     * groups that have been associated with a web ACL.
     * </p>
     * <p>
     * Specifying <code>ExcludedRules</code> does not remove those rules from
     * the rule group. Rather, it changes the action for the rules to
     * <code>COUNT</code>. Therefore, requests that match an
     * <code>ExcludedRule</code> are counted but not blocked. The
     * <code>RuleGroup</code> owner will receive COUNT metrics for each
     * <code>ExcludedRule</code>.
     * </p>
     * <p>
     * If you want to exclude rules from a rule group that is already associated
     * with a web ACL, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the AWS WAF logs to identify the IDs of the rules that you want to
     * exclude. For more information about the logs, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/logging.html"
     * >Logging Web ACL Traffic Information</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateWebACL</a> request that has two actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first action deletes the existing rule group from the web ACL. That
     * is, in the <a>UpdateWebACL</a> request, the first
     * <code>Updates:Action</code> should be <code>DELETE</code> and
     * <code>Updates:ActivatedRule:RuleId</code> should be the rule group that
     * contains the rules that you want to exclude.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second action inserts the same rule group back in, but specifying the
     * rules to exclude. That is, the second <code>Updates:Action</code> should
     * be <code>INSERT</code>, <code>Updates:ActivatedRule:RuleId</code> should
     * be the rule group that you just removed, and <code>ExcludedRules</code>
     * should contain the rules that you want to exclude.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ol>
     */
    private java.util.List<ExcludedRule> excludedRules;

    /**
     * <p>
     * Specifies the order in which the <code>Rules</code> in a
     * <code>WebACL</code> are evaluated. Rules with a lower value for
     * <code>Priority</code> are evaluated before <code>Rules</code> with a
     * higher value. The value must be a unique integer. If you add multiple
     * <code>Rules</code> to a <code>WebACL</code>, the values don't need to be
     * consecutive.
     * </p>
     *
     * @return <p>
     *         Specifies the order in which the <code>Rules</code> in a
     *         <code>WebACL</code> are evaluated. Rules with a lower value for
     *         <code>Priority</code> are evaluated before <code>Rules</code>
     *         with a higher value. The value must be a unique integer. If you
     *         add multiple <code>Rules</code> to a <code>WebACL</code>, the
     *         values don't need to be consecutive.
     *         </p>
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * <p>
     * Specifies the order in which the <code>Rules</code> in a
     * <code>WebACL</code> are evaluated. Rules with a lower value for
     * <code>Priority</code> are evaluated before <code>Rules</code> with a
     * higher value. The value must be a unique integer. If you add multiple
     * <code>Rules</code> to a <code>WebACL</code>, the values don't need to be
     * consecutive.
     * </p>
     *
     * @param priority <p>
     *            Specifies the order in which the <code>Rules</code> in a
     *            <code>WebACL</code> are evaluated. Rules with a lower value
     *            for <code>Priority</code> are evaluated before
     *            <code>Rules</code> with a higher value. The value must be a
     *            unique integer. If you add multiple <code>Rules</code> to a
     *            <code>WebACL</code>, the values don't need to be consecutive.
     *            </p>
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * Specifies the order in which the <code>Rules</code> in a
     * <code>WebACL</code> are evaluated. Rules with a lower value for
     * <code>Priority</code> are evaluated before <code>Rules</code> with a
     * higher value. The value must be a unique integer. If you add multiple
     * <code>Rules</code> to a <code>WebACL</code>, the values don't need to be
     * consecutive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param priority <p>
     *            Specifies the order in which the <code>Rules</code> in a
     *            <code>WebACL</code> are evaluated. Rules with a lower value
     *            for <code>Priority</code> are evaluated before
     *            <code>Rules</code> with a higher value. The value must be a
     *            unique integer. If you add multiple <code>Rules</code> to a
     *            <code>WebACL</code>, the values don't need to be consecutive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivatedRule withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * <p>
     * The <code>RuleId</code> for a <code>Rule</code>. You use
     * <code>RuleId</code> to get more information about a <code>Rule</code>
     * (see <a>GetRule</a>), update a <code>Rule</code> (see <a>UpdateRule</a>),
     * insert a <code>Rule</code> into a <code>WebACL</code> or delete a one
     * from a <code>WebACL</code> (see <a>UpdateWebACL</a>), or delete a
     * <code>Rule</code> from AWS WAF (see <a>DeleteRule</a>).
     * </p>
     * <p>
     * <code>RuleId</code> is returned by <a>CreateRule</a> and by
     * <a>ListRules</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The <code>RuleId</code> for a <code>Rule</code>. You use
     *         <code>RuleId</code> to get more information about a
     *         <code>Rule</code> (see <a>GetRule</a>), update a
     *         <code>Rule</code> (see <a>UpdateRule</a>), insert a
     *         <code>Rule</code> into a <code>WebACL</code> or delete a one from
     *         a <code>WebACL</code> (see <a>UpdateWebACL</a>), or delete a
     *         <code>Rule</code> from AWS WAF (see <a>DeleteRule</a>).
     *         </p>
     *         <p>
     *         <code>RuleId</code> is returned by <a>CreateRule</a> and by
     *         <a>ListRules</a>.
     *         </p>
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * <p>
     * The <code>RuleId</code> for a <code>Rule</code>. You use
     * <code>RuleId</code> to get more information about a <code>Rule</code>
     * (see <a>GetRule</a>), update a <code>Rule</code> (see <a>UpdateRule</a>),
     * insert a <code>Rule</code> into a <code>WebACL</code> or delete a one
     * from a <code>WebACL</code> (see <a>UpdateWebACL</a>), or delete a
     * <code>Rule</code> from AWS WAF (see <a>DeleteRule</a>).
     * </p>
     * <p>
     * <code>RuleId</code> is returned by <a>CreateRule</a> and by
     * <a>ListRules</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param ruleId <p>
     *            The <code>RuleId</code> for a <code>Rule</code>. You use
     *            <code>RuleId</code> to get more information about a
     *            <code>Rule</code> (see <a>GetRule</a>), update a
     *            <code>Rule</code> (see <a>UpdateRule</a>), insert a
     *            <code>Rule</code> into a <code>WebACL</code> or delete a one
     *            from a <code>WebACL</code> (see <a>UpdateWebACL</a>), or
     *            delete a <code>Rule</code> from AWS WAF (see
     *            <a>DeleteRule</a>).
     *            </p>
     *            <p>
     *            <code>RuleId</code> is returned by <a>CreateRule</a> and by
     *            <a>ListRules</a>.
     *            </p>
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * The <code>RuleId</code> for a <code>Rule</code>. You use
     * <code>RuleId</code> to get more information about a <code>Rule</code>
     * (see <a>GetRule</a>), update a <code>Rule</code> (see <a>UpdateRule</a>),
     * insert a <code>Rule</code> into a <code>WebACL</code> or delete a one
     * from a <code>WebACL</code> (see <a>UpdateWebACL</a>), or delete a
     * <code>Rule</code> from AWS WAF (see <a>DeleteRule</a>).
     * </p>
     * <p>
     * <code>RuleId</code> is returned by <a>CreateRule</a> and by
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
     *            The <code>RuleId</code> for a <code>Rule</code>. You use
     *            <code>RuleId</code> to get more information about a
     *            <code>Rule</code> (see <a>GetRule</a>), update a
     *            <code>Rule</code> (see <a>UpdateRule</a>), insert a
     *            <code>Rule</code> into a <code>WebACL</code> or delete a one
     *            from a <code>WebACL</code> (see <a>UpdateWebACL</a>), or
     *            delete a <code>Rule</code> from AWS WAF (see
     *            <a>DeleteRule</a>).
     *            </p>
     *            <p>
     *            <code>RuleId</code> is returned by <a>CreateRule</a> and by
     *            <a>ListRules</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivatedRule withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * <p>
     * Specifies the action that CloudFront or AWS WAF takes when a web request
     * matches the conditions in the <code>Rule</code>. Valid values for
     * <code>Action</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW</code>: CloudFront responds with the requested object.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BLOCK</code>: CloudFront responds with an HTTP 403 (Forbidden)
     * status code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code>: AWS WAF increments a counter of requests that match
     * the conditions in the rule and then continues to inspect the web request
     * based on the remaining rules in the web ACL.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>ActivatedRule|OverrideAction</code> applies only when updating or
     * adding a <code>RuleGroup</code> to a <code>WebACL</code>. In this case,
     * you do not use <code>ActivatedRule|Action</code>. For all other update
     * requests, <code>ActivatedRule|Action</code> is used instead of
     * <code>ActivatedRule|OverrideAction</code>.
     * </p>
     *
     * @return <p>
     *         Specifies the action that CloudFront or AWS WAF takes when a web
     *         request matches the conditions in the <code>Rule</code>. Valid
     *         values for <code>Action</code> include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALLOW</code>: CloudFront responds with the requested
     *         object.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BLOCK</code>: CloudFront responds with an HTTP 403
     *         (Forbidden) status code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COUNT</code>: AWS WAF increments a counter of requests that
     *         match the conditions in the rule and then continues to inspect
     *         the web request based on the remaining rules in the web ACL.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>ActivatedRule|OverrideAction</code> applies only when
     *         updating or adding a <code>RuleGroup</code> to a
     *         <code>WebACL</code>. In this case, you do not use
     *         <code>ActivatedRule|Action</code>. For all other update requests,
     *         <code>ActivatedRule|Action</code> is used instead of
     *         <code>ActivatedRule|OverrideAction</code>.
     *         </p>
     */
    public WafAction getAction() {
        return action;
    }

    /**
     * <p>
     * Specifies the action that CloudFront or AWS WAF takes when a web request
     * matches the conditions in the <code>Rule</code>. Valid values for
     * <code>Action</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW</code>: CloudFront responds with the requested object.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BLOCK</code>: CloudFront responds with an HTTP 403 (Forbidden)
     * status code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code>: AWS WAF increments a counter of requests that match
     * the conditions in the rule and then continues to inspect the web request
     * based on the remaining rules in the web ACL.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>ActivatedRule|OverrideAction</code> applies only when updating or
     * adding a <code>RuleGroup</code> to a <code>WebACL</code>. In this case,
     * you do not use <code>ActivatedRule|Action</code>. For all other update
     * requests, <code>ActivatedRule|Action</code> is used instead of
     * <code>ActivatedRule|OverrideAction</code>.
     * </p>
     *
     * @param action <p>
     *            Specifies the action that CloudFront or AWS WAF takes when a
     *            web request matches the conditions in the <code>Rule</code>.
     *            Valid values for <code>Action</code> include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALLOW</code>: CloudFront responds with the requested
     *            object.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BLOCK</code>: CloudFront responds with an HTTP 403
     *            (Forbidden) status code.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>COUNT</code>: AWS WAF increments a counter of requests
     *            that match the conditions in the rule and then continues to
     *            inspect the web request based on the remaining rules in the
     *            web ACL.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <code>ActivatedRule|OverrideAction</code> applies only when
     *            updating or adding a <code>RuleGroup</code> to a
     *            <code>WebACL</code>. In this case, you do not use
     *            <code>ActivatedRule|Action</code>. For all other update
     *            requests, <code>ActivatedRule|Action</code> is used instead of
     *            <code>ActivatedRule|OverrideAction</code>.
     *            </p>
     */
    public void setAction(WafAction action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies the action that CloudFront or AWS WAF takes when a web request
     * matches the conditions in the <code>Rule</code>. Valid values for
     * <code>Action</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW</code>: CloudFront responds with the requested object.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BLOCK</code>: CloudFront responds with an HTTP 403 (Forbidden)
     * status code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code>: AWS WAF increments a counter of requests that match
     * the conditions in the rule and then continues to inspect the web request
     * based on the remaining rules in the web ACL.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>ActivatedRule|OverrideAction</code> applies only when updating or
     * adding a <code>RuleGroup</code> to a <code>WebACL</code>. In this case,
     * you do not use <code>ActivatedRule|Action</code>. For all other update
     * requests, <code>ActivatedRule|Action</code> is used instead of
     * <code>ActivatedRule|OverrideAction</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param action <p>
     *            Specifies the action that CloudFront or AWS WAF takes when a
     *            web request matches the conditions in the <code>Rule</code>.
     *            Valid values for <code>Action</code> include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALLOW</code>: CloudFront responds with the requested
     *            object.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BLOCK</code>: CloudFront responds with an HTTP 403
     *            (Forbidden) status code.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>COUNT</code>: AWS WAF increments a counter of requests
     *            that match the conditions in the rule and then continues to
     *            inspect the web request based on the remaining rules in the
     *            web ACL.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <code>ActivatedRule|OverrideAction</code> applies only when
     *            updating or adding a <code>RuleGroup</code> to a
     *            <code>WebACL</code>. In this case, you do not use
     *            <code>ActivatedRule|Action</code>. For all other update
     *            requests, <code>ActivatedRule|Action</code> is used instead of
     *            <code>ActivatedRule|OverrideAction</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivatedRule withAction(WafAction action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * Use the <code>OverrideAction</code> to test your <code>RuleGroup</code>.
     * </p>
     * <p>
     * Any rule in a <code>RuleGroup</code> can potentially block a request. If
     * you set the <code>OverrideAction</code> to <code>None</code>, the
     * <code>RuleGroup</code> will block a request if any individual rule in the
     * <code>RuleGroup</code> matches the request and is configured to block
     * that request. However if you first want to test the
     * <code>RuleGroup</code>, set the <code>OverrideAction</code> to
     * <code>Count</code>. The <code>RuleGroup</code> will then override any
     * block action specified by individual rules contained within the group.
     * Instead of blocking matching requests, those requests will be counted.
     * You can view a record of counted requests using
     * <a>GetSampledRequests</a>.
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
     *         Use the <code>OverrideAction</code> to test your
     *         <code>RuleGroup</code>.
     *         </p>
     *         <p>
     *         Any rule in a <code>RuleGroup</code> can potentially block a
     *         request. If you set the <code>OverrideAction</code> to
     *         <code>None</code>, the <code>RuleGroup</code> will block a
     *         request if any individual rule in the <code>RuleGroup</code>
     *         matches the request and is configured to block that request.
     *         However if you first want to test the <code>RuleGroup</code>, set
     *         the <code>OverrideAction</code> to <code>Count</code>. The
     *         <code>RuleGroup</code> will then override any block action
     *         specified by individual rules contained within the group. Instead
     *         of blocking matching requests, those requests will be counted.
     *         You can view a record of counted requests using
     *         <a>GetSampledRequests</a>.
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
    public WafOverrideAction getOverrideAction() {
        return overrideAction;
    }

    /**
     * <p>
     * Use the <code>OverrideAction</code> to test your <code>RuleGroup</code>.
     * </p>
     * <p>
     * Any rule in a <code>RuleGroup</code> can potentially block a request. If
     * you set the <code>OverrideAction</code> to <code>None</code>, the
     * <code>RuleGroup</code> will block a request if any individual rule in the
     * <code>RuleGroup</code> matches the request and is configured to block
     * that request. However if you first want to test the
     * <code>RuleGroup</code>, set the <code>OverrideAction</code> to
     * <code>Count</code>. The <code>RuleGroup</code> will then override any
     * block action specified by individual rules contained within the group.
     * Instead of blocking matching requests, those requests will be counted.
     * You can view a record of counted requests using
     * <a>GetSampledRequests</a>.
     * </p>
     * <p>
     * <code>ActivatedRule|OverrideAction</code> applies only when updating or
     * adding a <code>RuleGroup</code> to a <code>WebACL</code>. In this case
     * you do not use <code>ActivatedRule|Action</code>. For all other update
     * requests, <code>ActivatedRule|Action</code> is used instead of
     * <code>ActivatedRule|OverrideAction</code>.
     * </p>
     *
     * @param overrideAction <p>
     *            Use the <code>OverrideAction</code> to test your
     *            <code>RuleGroup</code>.
     *            </p>
     *            <p>
     *            Any rule in a <code>RuleGroup</code> can potentially block a
     *            request. If you set the <code>OverrideAction</code> to
     *            <code>None</code>, the <code>RuleGroup</code> will block a
     *            request if any individual rule in the <code>RuleGroup</code>
     *            matches the request and is configured to block that request.
     *            However if you first want to test the <code>RuleGroup</code>,
     *            set the <code>OverrideAction</code> to <code>Count</code>. The
     *            <code>RuleGroup</code> will then override any block action
     *            specified by individual rules contained within the group.
     *            Instead of blocking matching requests, those requests will be
     *            counted. You can view a record of counted requests using
     *            <a>GetSampledRequests</a>.
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
    public void setOverrideAction(WafOverrideAction overrideAction) {
        this.overrideAction = overrideAction;
    }

    /**
     * <p>
     * Use the <code>OverrideAction</code> to test your <code>RuleGroup</code>.
     * </p>
     * <p>
     * Any rule in a <code>RuleGroup</code> can potentially block a request. If
     * you set the <code>OverrideAction</code> to <code>None</code>, the
     * <code>RuleGroup</code> will block a request if any individual rule in the
     * <code>RuleGroup</code> matches the request and is configured to block
     * that request. However if you first want to test the
     * <code>RuleGroup</code>, set the <code>OverrideAction</code> to
     * <code>Count</code>. The <code>RuleGroup</code> will then override any
     * block action specified by individual rules contained within the group.
     * Instead of blocking matching requests, those requests will be counted.
     * You can view a record of counted requests using
     * <a>GetSampledRequests</a>.
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
     * @param overrideAction <p>
     *            Use the <code>OverrideAction</code> to test your
     *            <code>RuleGroup</code>.
     *            </p>
     *            <p>
     *            Any rule in a <code>RuleGroup</code> can potentially block a
     *            request. If you set the <code>OverrideAction</code> to
     *            <code>None</code>, the <code>RuleGroup</code> will block a
     *            request if any individual rule in the <code>RuleGroup</code>
     *            matches the request and is configured to block that request.
     *            However if you first want to test the <code>RuleGroup</code>,
     *            set the <code>OverrideAction</code> to <code>Count</code>. The
     *            <code>RuleGroup</code> will then override any block action
     *            specified by individual rules contained within the group.
     *            Instead of blocking matching requests, those requests will be
     *            counted. You can view a record of counted requests using
     *            <a>GetSampledRequests</a>.
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
    public ActivatedRule withOverrideAction(WafOverrideAction overrideAction) {
        this.overrideAction = overrideAction;
        return this;
    }

    /**
     * <p>
     * The rule type, either <code>REGULAR</code>, as defined by <a>Rule</a>,
     * <code>RATE_BASED</code>, as defined by <a>RateBasedRule</a>, or
     * <code>GROUP</code>, as defined by <a>RuleGroup</a>. The default is
     * REGULAR. Although this field is optional, be aware that if you try to add
     * a RATE_BASED rule to a web ACL without setting the type, the
     * <a>UpdateWebACL</a> request will fail because the request tries to add a
     * REGULAR rule with the specified ID, which does not exist.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGULAR, RATE_BASED, GROUP
     *
     * @return <p>
     *         The rule type, either <code>REGULAR</code>, as defined by
     *         <a>Rule</a>, <code>RATE_BASED</code>, as defined by
     *         <a>RateBasedRule</a>, or <code>GROUP</code>, as defined by
     *         <a>RuleGroup</a>. The default is REGULAR. Although this field is
     *         optional, be aware that if you try to add a RATE_BASED rule to a
     *         web ACL without setting the type, the <a>UpdateWebACL</a> request
     *         will fail because the request tries to add a REGULAR rule with
     *         the specified ID, which does not exist.
     *         </p>
     * @see WafRuleType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The rule type, either <code>REGULAR</code>, as defined by <a>Rule</a>,
     * <code>RATE_BASED</code>, as defined by <a>RateBasedRule</a>, or
     * <code>GROUP</code>, as defined by <a>RuleGroup</a>. The default is
     * REGULAR. Although this field is optional, be aware that if you try to add
     * a RATE_BASED rule to a web ACL without setting the type, the
     * <a>UpdateWebACL</a> request will fail because the request tries to add a
     * REGULAR rule with the specified ID, which does not exist.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGULAR, RATE_BASED, GROUP
     *
     * @param type <p>
     *            The rule type, either <code>REGULAR</code>, as defined by
     *            <a>Rule</a>, <code>RATE_BASED</code>, as defined by
     *            <a>RateBasedRule</a>, or <code>GROUP</code>, as defined by
     *            <a>RuleGroup</a>. The default is REGULAR. Although this field
     *            is optional, be aware that if you try to add a RATE_BASED rule
     *            to a web ACL without setting the type, the <a>UpdateWebACL</a>
     *            request will fail because the request tries to add a REGULAR
     *            rule with the specified ID, which does not exist.
     *            </p>
     * @see WafRuleType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The rule type, either <code>REGULAR</code>, as defined by <a>Rule</a>,
     * <code>RATE_BASED</code>, as defined by <a>RateBasedRule</a>, or
     * <code>GROUP</code>, as defined by <a>RuleGroup</a>. The default is
     * REGULAR. Although this field is optional, be aware that if you try to add
     * a RATE_BASED rule to a web ACL without setting the type, the
     * <a>UpdateWebACL</a> request will fail because the request tries to add a
     * REGULAR rule with the specified ID, which does not exist.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGULAR, RATE_BASED, GROUP
     *
     * @param type <p>
     *            The rule type, either <code>REGULAR</code>, as defined by
     *            <a>Rule</a>, <code>RATE_BASED</code>, as defined by
     *            <a>RateBasedRule</a>, or <code>GROUP</code>, as defined by
     *            <a>RuleGroup</a>. The default is REGULAR. Although this field
     *            is optional, be aware that if you try to add a RATE_BASED rule
     *            to a web ACL without setting the type, the <a>UpdateWebACL</a>
     *            request will fail because the request tries to add a REGULAR
     *            rule with the specified ID, which does not exist.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WafRuleType
     */
    public ActivatedRule withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The rule type, either <code>REGULAR</code>, as defined by <a>Rule</a>,
     * <code>RATE_BASED</code>, as defined by <a>RateBasedRule</a>, or
     * <code>GROUP</code>, as defined by <a>RuleGroup</a>. The default is
     * REGULAR. Although this field is optional, be aware that if you try to add
     * a RATE_BASED rule to a web ACL without setting the type, the
     * <a>UpdateWebACL</a> request will fail because the request tries to add a
     * REGULAR rule with the specified ID, which does not exist.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGULAR, RATE_BASED, GROUP
     *
     * @param type <p>
     *            The rule type, either <code>REGULAR</code>, as defined by
     *            <a>Rule</a>, <code>RATE_BASED</code>, as defined by
     *            <a>RateBasedRule</a>, or <code>GROUP</code>, as defined by
     *            <a>RuleGroup</a>. The default is REGULAR. Although this field
     *            is optional, be aware that if you try to add a RATE_BASED rule
     *            to a web ACL without setting the type, the <a>UpdateWebACL</a>
     *            request will fail because the request tries to add a REGULAR
     *            rule with the specified ID, which does not exist.
     *            </p>
     * @see WafRuleType
     */
    public void setType(WafRuleType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The rule type, either <code>REGULAR</code>, as defined by <a>Rule</a>,
     * <code>RATE_BASED</code>, as defined by <a>RateBasedRule</a>, or
     * <code>GROUP</code>, as defined by <a>RuleGroup</a>. The default is
     * REGULAR. Although this field is optional, be aware that if you try to add
     * a RATE_BASED rule to a web ACL without setting the type, the
     * <a>UpdateWebACL</a> request will fail because the request tries to add a
     * REGULAR rule with the specified ID, which does not exist.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGULAR, RATE_BASED, GROUP
     *
     * @param type <p>
     *            The rule type, either <code>REGULAR</code>, as defined by
     *            <a>Rule</a>, <code>RATE_BASED</code>, as defined by
     *            <a>RateBasedRule</a>, or <code>GROUP</code>, as defined by
     *            <a>RuleGroup</a>. The default is REGULAR. Although this field
     *            is optional, be aware that if you try to add a RATE_BASED rule
     *            to a web ACL without setting the type, the <a>UpdateWebACL</a>
     *            request will fail because the request tries to add a REGULAR
     *            rule with the specified ID, which does not exist.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WafRuleType
     */
    public ActivatedRule withType(WafRuleType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * An array of rules to exclude from a rule group. This is applicable only
     * when the <code>ActivatedRule</code> refers to a <code>RuleGroup</code>.
     * </p>
     * <p>
     * Sometimes it is necessary to troubleshoot rule groups that are blocking
     * traffic unexpectedly (false positives). One troubleshooting technique is
     * to identify the specific rule within the rule group that is blocking the
     * legitimate traffic and then disable (exclude) that particular rule. You
     * can exclude rules from both your own rule groups and AWS Marketplace rule
     * groups that have been associated with a web ACL.
     * </p>
     * <p>
     * Specifying <code>ExcludedRules</code> does not remove those rules from
     * the rule group. Rather, it changes the action for the rules to
     * <code>COUNT</code>. Therefore, requests that match an
     * <code>ExcludedRule</code> are counted but not blocked. The
     * <code>RuleGroup</code> owner will receive COUNT metrics for each
     * <code>ExcludedRule</code>.
     * </p>
     * <p>
     * If you want to exclude rules from a rule group that is already associated
     * with a web ACL, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the AWS WAF logs to identify the IDs of the rules that you want to
     * exclude. For more information about the logs, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/logging.html"
     * >Logging Web ACL Traffic Information</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateWebACL</a> request that has two actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first action deletes the existing rule group from the web ACL. That
     * is, in the <a>UpdateWebACL</a> request, the first
     * <code>Updates:Action</code> should be <code>DELETE</code> and
     * <code>Updates:ActivatedRule:RuleId</code> should be the rule group that
     * contains the rules that you want to exclude.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second action inserts the same rule group back in, but specifying the
     * rules to exclude. That is, the second <code>Updates:Action</code> should
     * be <code>INSERT</code>, <code>Updates:ActivatedRule:RuleId</code> should
     * be the rule group that you just removed, and <code>ExcludedRules</code>
     * should contain the rules that you want to exclude.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ol>
     *
     * @return <p>
     *         An array of rules to exclude from a rule group. This is
     *         applicable only when the <code>ActivatedRule</code> refers to a
     *         <code>RuleGroup</code>.
     *         </p>
     *         <p>
     *         Sometimes it is necessary to troubleshoot rule groups that are
     *         blocking traffic unexpectedly (false positives). One
     *         troubleshooting technique is to identify the specific rule within
     *         the rule group that is blocking the legitimate traffic and then
     *         disable (exclude) that particular rule. You can exclude rules
     *         from both your own rule groups and AWS Marketplace rule groups
     *         that have been associated with a web ACL.
     *         </p>
     *         <p>
     *         Specifying <code>ExcludedRules</code> does not remove those rules
     *         from the rule group. Rather, it changes the action for the rules
     *         to <code>COUNT</code>. Therefore, requests that match an
     *         <code>ExcludedRule</code> are counted but not blocked. The
     *         <code>RuleGroup</code> owner will receive COUNT metrics for each
     *         <code>ExcludedRule</code>.
     *         </p>
     *         <p>
     *         If you want to exclude rules from a rule group that is already
     *         associated with a web ACL, perform the following steps:
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         Use the AWS WAF logs to identify the IDs of the rules that you
     *         want to exclude. For more information about the logs, see <a
     *         href=
     *         "https://docs.aws.amazon.com/waf/latest/developerguide/logging.html"
     *         >Logging Web ACL Traffic Information</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Submit an <a>UpdateWebACL</a> request that has two actions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The first action deletes the existing rule group from the web
     *         ACL. That is, in the <a>UpdateWebACL</a> request, the first
     *         <code>Updates:Action</code> should be <code>DELETE</code> and
     *         <code>Updates:ActivatedRule:RuleId</code> should be the rule
     *         group that contains the rules that you want to exclude.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The second action inserts the same rule group back in, but
     *         specifying the rules to exclude. That is, the second
     *         <code>Updates:Action</code> should be <code>INSERT</code>,
     *         <code>Updates:ActivatedRule:RuleId</code> should be the rule
     *         group that you just removed, and <code>ExcludedRules</code>
     *         should contain the rules that you want to exclude.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ol>
     */
    public java.util.List<ExcludedRule> getExcludedRules() {
        return excludedRules;
    }

    /**
     * <p>
     * An array of rules to exclude from a rule group. This is applicable only
     * when the <code>ActivatedRule</code> refers to a <code>RuleGroup</code>.
     * </p>
     * <p>
     * Sometimes it is necessary to troubleshoot rule groups that are blocking
     * traffic unexpectedly (false positives). One troubleshooting technique is
     * to identify the specific rule within the rule group that is blocking the
     * legitimate traffic and then disable (exclude) that particular rule. You
     * can exclude rules from both your own rule groups and AWS Marketplace rule
     * groups that have been associated with a web ACL.
     * </p>
     * <p>
     * Specifying <code>ExcludedRules</code> does not remove those rules from
     * the rule group. Rather, it changes the action for the rules to
     * <code>COUNT</code>. Therefore, requests that match an
     * <code>ExcludedRule</code> are counted but not blocked. The
     * <code>RuleGroup</code> owner will receive COUNT metrics for each
     * <code>ExcludedRule</code>.
     * </p>
     * <p>
     * If you want to exclude rules from a rule group that is already associated
     * with a web ACL, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the AWS WAF logs to identify the IDs of the rules that you want to
     * exclude. For more information about the logs, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/logging.html"
     * >Logging Web ACL Traffic Information</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateWebACL</a> request that has two actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first action deletes the existing rule group from the web ACL. That
     * is, in the <a>UpdateWebACL</a> request, the first
     * <code>Updates:Action</code> should be <code>DELETE</code> and
     * <code>Updates:ActivatedRule:RuleId</code> should be the rule group that
     * contains the rules that you want to exclude.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second action inserts the same rule group back in, but specifying the
     * rules to exclude. That is, the second <code>Updates:Action</code> should
     * be <code>INSERT</code>, <code>Updates:ActivatedRule:RuleId</code> should
     * be the rule group that you just removed, and <code>ExcludedRules</code>
     * should contain the rules that you want to exclude.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ol>
     *
     * @param excludedRules <p>
     *            An array of rules to exclude from a rule group. This is
     *            applicable only when the <code>ActivatedRule</code> refers to
     *            a <code>RuleGroup</code>.
     *            </p>
     *            <p>
     *            Sometimes it is necessary to troubleshoot rule groups that are
     *            blocking traffic unexpectedly (false positives). One
     *            troubleshooting technique is to identify the specific rule
     *            within the rule group that is blocking the legitimate traffic
     *            and then disable (exclude) that particular rule. You can
     *            exclude rules from both your own rule groups and AWS
     *            Marketplace rule groups that have been associated with a web
     *            ACL.
     *            </p>
     *            <p>
     *            Specifying <code>ExcludedRules</code> does not remove those
     *            rules from the rule group. Rather, it changes the action for
     *            the rules to <code>COUNT</code>. Therefore, requests that
     *            match an <code>ExcludedRule</code> are counted but not
     *            blocked. The <code>RuleGroup</code> owner will receive COUNT
     *            metrics for each <code>ExcludedRule</code>.
     *            </p>
     *            <p>
     *            If you want to exclude rules from a rule group that is already
     *            associated with a web ACL, perform the following steps:
     *            </p>
     *            <ol>
     *            <li>
     *            <p>
     *            Use the AWS WAF logs to identify the IDs of the rules that you
     *            want to exclude. For more information about the logs, see <a
     *            href=
     *            "https://docs.aws.amazon.com/waf/latest/developerguide/logging.html"
     *            >Logging Web ACL Traffic Information</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Submit an <a>UpdateWebACL</a> request that has two actions:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The first action deletes the existing rule group from the web
     *            ACL. That is, in the <a>UpdateWebACL</a> request, the first
     *            <code>Updates:Action</code> should be <code>DELETE</code> and
     *            <code>Updates:ActivatedRule:RuleId</code> should be the rule
     *            group that contains the rules that you want to exclude.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The second action inserts the same rule group back in, but
     *            specifying the rules to exclude. That is, the second
     *            <code>Updates:Action</code> should be <code>INSERT</code>,
     *            <code>Updates:ActivatedRule:RuleId</code> should be the rule
     *            group that you just removed, and <code>ExcludedRules</code>
     *            should contain the rules that you want to exclude.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ol>
     */
    public void setExcludedRules(java.util.Collection<ExcludedRule> excludedRules) {
        if (excludedRules == null) {
            this.excludedRules = null;
            return;
        }

        this.excludedRules = new java.util.ArrayList<ExcludedRule>(excludedRules);
    }

    /**
     * <p>
     * An array of rules to exclude from a rule group. This is applicable only
     * when the <code>ActivatedRule</code> refers to a <code>RuleGroup</code>.
     * </p>
     * <p>
     * Sometimes it is necessary to troubleshoot rule groups that are blocking
     * traffic unexpectedly (false positives). One troubleshooting technique is
     * to identify the specific rule within the rule group that is blocking the
     * legitimate traffic and then disable (exclude) that particular rule. You
     * can exclude rules from both your own rule groups and AWS Marketplace rule
     * groups that have been associated with a web ACL.
     * </p>
     * <p>
     * Specifying <code>ExcludedRules</code> does not remove those rules from
     * the rule group. Rather, it changes the action for the rules to
     * <code>COUNT</code>. Therefore, requests that match an
     * <code>ExcludedRule</code> are counted but not blocked. The
     * <code>RuleGroup</code> owner will receive COUNT metrics for each
     * <code>ExcludedRule</code>.
     * </p>
     * <p>
     * If you want to exclude rules from a rule group that is already associated
     * with a web ACL, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the AWS WAF logs to identify the IDs of the rules that you want to
     * exclude. For more information about the logs, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/logging.html"
     * >Logging Web ACL Traffic Information</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateWebACL</a> request that has two actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first action deletes the existing rule group from the web ACL. That
     * is, in the <a>UpdateWebACL</a> request, the first
     * <code>Updates:Action</code> should be <code>DELETE</code> and
     * <code>Updates:ActivatedRule:RuleId</code> should be the rule group that
     * contains the rules that you want to exclude.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second action inserts the same rule group back in, but specifying the
     * rules to exclude. That is, the second <code>Updates:Action</code> should
     * be <code>INSERT</code>, <code>Updates:ActivatedRule:RuleId</code> should
     * be the rule group that you just removed, and <code>ExcludedRules</code>
     * should contain the rules that you want to exclude.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ol>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param excludedRules <p>
     *            An array of rules to exclude from a rule group. This is
     *            applicable only when the <code>ActivatedRule</code> refers to
     *            a <code>RuleGroup</code>.
     *            </p>
     *            <p>
     *            Sometimes it is necessary to troubleshoot rule groups that are
     *            blocking traffic unexpectedly (false positives). One
     *            troubleshooting technique is to identify the specific rule
     *            within the rule group that is blocking the legitimate traffic
     *            and then disable (exclude) that particular rule. You can
     *            exclude rules from both your own rule groups and AWS
     *            Marketplace rule groups that have been associated with a web
     *            ACL.
     *            </p>
     *            <p>
     *            Specifying <code>ExcludedRules</code> does not remove those
     *            rules from the rule group. Rather, it changes the action for
     *            the rules to <code>COUNT</code>. Therefore, requests that
     *            match an <code>ExcludedRule</code> are counted but not
     *            blocked. The <code>RuleGroup</code> owner will receive COUNT
     *            metrics for each <code>ExcludedRule</code>.
     *            </p>
     *            <p>
     *            If you want to exclude rules from a rule group that is already
     *            associated with a web ACL, perform the following steps:
     *            </p>
     *            <ol>
     *            <li>
     *            <p>
     *            Use the AWS WAF logs to identify the IDs of the rules that you
     *            want to exclude. For more information about the logs, see <a
     *            href=
     *            "https://docs.aws.amazon.com/waf/latest/developerguide/logging.html"
     *            >Logging Web ACL Traffic Information</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Submit an <a>UpdateWebACL</a> request that has two actions:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The first action deletes the existing rule group from the web
     *            ACL. That is, in the <a>UpdateWebACL</a> request, the first
     *            <code>Updates:Action</code> should be <code>DELETE</code> and
     *            <code>Updates:ActivatedRule:RuleId</code> should be the rule
     *            group that contains the rules that you want to exclude.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The second action inserts the same rule group back in, but
     *            specifying the rules to exclude. That is, the second
     *            <code>Updates:Action</code> should be <code>INSERT</code>,
     *            <code>Updates:ActivatedRule:RuleId</code> should be the rule
     *            group that you just removed, and <code>ExcludedRules</code>
     *            should contain the rules that you want to exclude.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ol>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivatedRule withExcludedRules(ExcludedRule... excludedRules) {
        if (getExcludedRules() == null) {
            this.excludedRules = new java.util.ArrayList<ExcludedRule>(excludedRules.length);
        }
        for (ExcludedRule value : excludedRules) {
            this.excludedRules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of rules to exclude from a rule group. This is applicable only
     * when the <code>ActivatedRule</code> refers to a <code>RuleGroup</code>.
     * </p>
     * <p>
     * Sometimes it is necessary to troubleshoot rule groups that are blocking
     * traffic unexpectedly (false positives). One troubleshooting technique is
     * to identify the specific rule within the rule group that is blocking the
     * legitimate traffic and then disable (exclude) that particular rule. You
     * can exclude rules from both your own rule groups and AWS Marketplace rule
     * groups that have been associated with a web ACL.
     * </p>
     * <p>
     * Specifying <code>ExcludedRules</code> does not remove those rules from
     * the rule group. Rather, it changes the action for the rules to
     * <code>COUNT</code>. Therefore, requests that match an
     * <code>ExcludedRule</code> are counted but not blocked. The
     * <code>RuleGroup</code> owner will receive COUNT metrics for each
     * <code>ExcludedRule</code>.
     * </p>
     * <p>
     * If you want to exclude rules from a rule group that is already associated
     * with a web ACL, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the AWS WAF logs to identify the IDs of the rules that you want to
     * exclude. For more information about the logs, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/logging.html"
     * >Logging Web ACL Traffic Information</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateWebACL</a> request that has two actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first action deletes the existing rule group from the web ACL. That
     * is, in the <a>UpdateWebACL</a> request, the first
     * <code>Updates:Action</code> should be <code>DELETE</code> and
     * <code>Updates:ActivatedRule:RuleId</code> should be the rule group that
     * contains the rules that you want to exclude.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second action inserts the same rule group back in, but specifying the
     * rules to exclude. That is, the second <code>Updates:Action</code> should
     * be <code>INSERT</code>, <code>Updates:ActivatedRule:RuleId</code> should
     * be the rule group that you just removed, and <code>ExcludedRules</code>
     * should contain the rules that you want to exclude.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ol>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param excludedRules <p>
     *            An array of rules to exclude from a rule group. This is
     *            applicable only when the <code>ActivatedRule</code> refers to
     *            a <code>RuleGroup</code>.
     *            </p>
     *            <p>
     *            Sometimes it is necessary to troubleshoot rule groups that are
     *            blocking traffic unexpectedly (false positives). One
     *            troubleshooting technique is to identify the specific rule
     *            within the rule group that is blocking the legitimate traffic
     *            and then disable (exclude) that particular rule. You can
     *            exclude rules from both your own rule groups and AWS
     *            Marketplace rule groups that have been associated with a web
     *            ACL.
     *            </p>
     *            <p>
     *            Specifying <code>ExcludedRules</code> does not remove those
     *            rules from the rule group. Rather, it changes the action for
     *            the rules to <code>COUNT</code>. Therefore, requests that
     *            match an <code>ExcludedRule</code> are counted but not
     *            blocked. The <code>RuleGroup</code> owner will receive COUNT
     *            metrics for each <code>ExcludedRule</code>.
     *            </p>
     *            <p>
     *            If you want to exclude rules from a rule group that is already
     *            associated with a web ACL, perform the following steps:
     *            </p>
     *            <ol>
     *            <li>
     *            <p>
     *            Use the AWS WAF logs to identify the IDs of the rules that you
     *            want to exclude. For more information about the logs, see <a
     *            href=
     *            "https://docs.aws.amazon.com/waf/latest/developerguide/logging.html"
     *            >Logging Web ACL Traffic Information</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Submit an <a>UpdateWebACL</a> request that has two actions:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The first action deletes the existing rule group from the web
     *            ACL. That is, in the <a>UpdateWebACL</a> request, the first
     *            <code>Updates:Action</code> should be <code>DELETE</code> and
     *            <code>Updates:ActivatedRule:RuleId</code> should be the rule
     *            group that contains the rules that you want to exclude.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The second action inserts the same rule group back in, but
     *            specifying the rules to exclude. That is, the second
     *            <code>Updates:Action</code> should be <code>INSERT</code>,
     *            <code>Updates:ActivatedRule:RuleId</code> should be the rule
     *            group that you just removed, and <code>ExcludedRules</code>
     *            should contain the rules that you want to exclude.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ol>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActivatedRule withExcludedRules(java.util.Collection<ExcludedRule> excludedRules) {
        setExcludedRules(excludedRules);
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
        if (getPriority() != null)
            sb.append("Priority: " + getPriority() + ",");
        if (getRuleId() != null)
            sb.append("RuleId: " + getRuleId() + ",");
        if (getAction() != null)
            sb.append("Action: " + getAction() + ",");
        if (getOverrideAction() != null)
            sb.append("OverrideAction: " + getOverrideAction() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getExcludedRules() != null)
            sb.append("ExcludedRules: " + getExcludedRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode
                + ((getOverrideAction() == null) ? 0 : getOverrideAction().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getExcludedRules() == null) ? 0 : getExcludedRules().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActivatedRule == false)
            return false;
        ActivatedRule other = (ActivatedRule) obj;

        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getOverrideAction() == null ^ this.getOverrideAction() == null)
            return false;
        if (other.getOverrideAction() != null
                && other.getOverrideAction().equals(this.getOverrideAction()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getExcludedRules() == null ^ this.getExcludedRules() == null)
            return false;
        if (other.getExcludedRules() != null
                && other.getExcludedRules().equals(this.getExcludedRules()) == false)
            return false;
        return true;
    }
}
