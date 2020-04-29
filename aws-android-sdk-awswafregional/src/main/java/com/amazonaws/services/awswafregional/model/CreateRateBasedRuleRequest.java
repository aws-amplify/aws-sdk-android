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
 * Creates a <a>RateBasedRule</a>. The <code>RateBasedRule</code> contains a
 * <code>RateLimit</code>, which specifies the maximum number of requests that
 * AWS WAF allows from a specified IP address in a five-minute period. The
 * <code>RateBasedRule</code> also contains the <code>IPSet</code> objects,
 * <code>ByteMatchSet</code> objects, and other predicates that identify the
 * requests that you want to count or block if these requests exceed the
 * <code>RateLimit</code>.
 * </p>
 * <p>
 * If you add more than one predicate to a <code>RateBasedRule</code>, a request
 * not only must exceed the <code>RateLimit</code>, but it also must match all
 * the conditions to be counted or blocked. For example, suppose you add the
 * following to a <code>RateBasedRule</code>:
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
 * specify that you want to block requests that meet the conditions in the rule.
 * For a request to be blocked, it must come from the IP address 192.0.2.44
 * <i>and</i> the <code>User-Agent</code> header in the request must contain the
 * value <code>BadBot</code>. Further, requests that match these two conditions
 * must be received at a rate of more than 1,000 requests every five minutes. If
 * both conditions are met and the rate is exceeded, AWS WAF blocks the
 * requests. If the rate drops below 1,000 for a five-minute period, AWS WAF no
 * longer blocks the requests.
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
 * <p>
 * To create and configure a <code>RateBasedRule</code>, perform the following
 * steps:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Create and update the predicates that you want to include in the rule. For
 * more information, see <a>CreateByteMatchSet</a>, <a>CreateIPSet</a>, and
 * <a>CreateSqlInjectionMatchSet</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use <a>GetChangeToken</a> to get the change token that you provide in the
 * <code>ChangeToken</code> parameter of a <code>CreateRule</code> request.
 * </p>
 * </li>
 * <li>
 * <p>
 * Submit a <code>CreateRateBasedRule</code> request.
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
 * Submit an <code>UpdateRateBasedRule</code> request to specify the predicates
 * that you want to include in the rule.
 * </p>
 * </li>
 * <li>
 * <p>
 * Create and update a <code>WebACL</code> that contains the
 * <code>RateBasedRule</code>. For more information, see <a>CreateWebACL</a>.
 * </p>
 * </li>
 * </ol>
 * <p>
 * For more information about how to use the AWS WAF API to allow or block HTTP
 * requests, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
 * Developer Guide</a>.
 * </p>
 */
public class CreateRateBasedRuleRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A friendly name or description of the <a>RateBasedRule</a>. You can't
     * change the name of a <code>RateBasedRule</code> after you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String name;

    /**
     * <p>
     * A friendly name or description for the metrics for this
     * <code>RateBasedRule</code>. The name can contain only alphanumeric
     * characters (A-Z, a-z, 0-9), with maximum length 128 and minimum length
     * one. It can't contain whitespace or metric names reserved for AWS WAF,
     * including "All" and "Default_Action." You can't change the name of the
     * metric after you create the <code>RateBasedRule</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String metricName;

    /**
     * <p>
     * The field that AWS WAF uses to determine if requests are likely arriving
     * from a single source and thus subject to rate monitoring. The only valid
     * value for <code>RateKey</code> is <code>IP</code>. <code>IP</code>
     * indicates that requests that arrive from the same IP address are subject
     * to the <code>RateLimit</code> that is specified in the
     * <code>RateBasedRule</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IP
     */
    private String rateKey;

    /**
     * <p>
     * The maximum number of requests, which have an identical value in the
     * field that is specified by <code>RateKey</code>, allowed in a five-minute
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
     * The <code>ChangeToken</code> that you used to submit the
     * <code>CreateRateBasedRule</code> request. You can also use this value to
     * query the status of the request. For more information, see
     * <a>GetChangeTokenStatus</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String changeToken;

    /**
     * <p/>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A friendly name or description of the <a>RateBasedRule</a>. You can't
     * change the name of a <code>RateBasedRule</code> after you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A friendly name or description of the <a>RateBasedRule</a>. You
     *         can't change the name of a <code>RateBasedRule</code> after you
     *         create it.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>RateBasedRule</a>. You can't
     * change the name of a <code>RateBasedRule</code> after you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            A friendly name or description of the <a>RateBasedRule</a>.
     *            You can't change the name of a <code>RateBasedRule</code>
     *            after you create it.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>RateBasedRule</a>. You can't
     * change the name of a <code>RateBasedRule</code> after you create it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            A friendly name or description of the <a>RateBasedRule</a>.
     *            You can't change the name of a <code>RateBasedRule</code>
     *            after you create it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRateBasedRuleRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A friendly name or description for the metrics for this
     * <code>RateBasedRule</code>. The name can contain only alphanumeric
     * characters (A-Z, a-z, 0-9), with maximum length 128 and minimum length
     * one. It can't contain whitespace or metric names reserved for AWS WAF,
     * including "All" and "Default_Action." You can't change the name of the
     * metric after you create the <code>RateBasedRule</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A friendly name or description for the metrics for this
     *         <code>RateBasedRule</code>. The name can contain only
     *         alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128
     *         and minimum length one. It can't contain whitespace or metric
     *         names reserved for AWS WAF, including "All" and "Default_Action."
     *         You can't change the name of the metric after you create the
     *         <code>RateBasedRule</code>.
     *         </p>
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * <p>
     * A friendly name or description for the metrics for this
     * <code>RateBasedRule</code>. The name can contain only alphanumeric
     * characters (A-Z, a-z, 0-9), with maximum length 128 and minimum length
     * one. It can't contain whitespace or metric names reserved for AWS WAF,
     * including "All" and "Default_Action." You can't change the name of the
     * metric after you create the <code>RateBasedRule</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param metricName <p>
     *            A friendly name or description for the metrics for this
     *            <code>RateBasedRule</code>. The name can contain only
     *            alphanumeric characters (A-Z, a-z, 0-9), with maximum length
     *            128 and minimum length one. It can't contain whitespace or
     *            metric names reserved for AWS WAF, including "All" and
     *            "Default_Action." You can't change the name of the metric
     *            after you create the <code>RateBasedRule</code>.
     *            </p>
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * A friendly name or description for the metrics for this
     * <code>RateBasedRule</code>. The name can contain only alphanumeric
     * characters (A-Z, a-z, 0-9), with maximum length 128 and minimum length
     * one. It can't contain whitespace or metric names reserved for AWS WAF,
     * including "All" and "Default_Action." You can't change the name of the
     * metric after you create the <code>RateBasedRule</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param metricName <p>
     *            A friendly name or description for the metrics for this
     *            <code>RateBasedRule</code>. The name can contain only
     *            alphanumeric characters (A-Z, a-z, 0-9), with maximum length
     *            128 and minimum length one. It can't contain whitespace or
     *            metric names reserved for AWS WAF, including "All" and
     *            "Default_Action." You can't change the name of the metric
     *            after you create the <code>RateBasedRule</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRateBasedRuleRequest withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * <p>
     * The field that AWS WAF uses to determine if requests are likely arriving
     * from a single source and thus subject to rate monitoring. The only valid
     * value for <code>RateKey</code> is <code>IP</code>. <code>IP</code>
     * indicates that requests that arrive from the same IP address are subject
     * to the <code>RateLimit</code> that is specified in the
     * <code>RateBasedRule</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IP
     *
     * @return <p>
     *         The field that AWS WAF uses to determine if requests are likely
     *         arriving from a single source and thus subject to rate
     *         monitoring. The only valid value for <code>RateKey</code> is
     *         <code>IP</code>. <code>IP</code> indicates that requests that
     *         arrive from the same IP address are subject to the
     *         <code>RateLimit</code> that is specified in the
     *         <code>RateBasedRule</code>.
     *         </p>
     * @see RateKey
     */
    public String getRateKey() {
        return rateKey;
    }

    /**
     * <p>
     * The field that AWS WAF uses to determine if requests are likely arriving
     * from a single source and thus subject to rate monitoring. The only valid
     * value for <code>RateKey</code> is <code>IP</code>. <code>IP</code>
     * indicates that requests that arrive from the same IP address are subject
     * to the <code>RateLimit</code> that is specified in the
     * <code>RateBasedRule</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IP
     *
     * @param rateKey <p>
     *            The field that AWS WAF uses to determine if requests are
     *            likely arriving from a single source and thus subject to rate
     *            monitoring. The only valid value for <code>RateKey</code> is
     *            <code>IP</code>. <code>IP</code> indicates that requests that
     *            arrive from the same IP address are subject to the
     *            <code>RateLimit</code> that is specified in the
     *            <code>RateBasedRule</code>.
     *            </p>
     * @see RateKey
     */
    public void setRateKey(String rateKey) {
        this.rateKey = rateKey;
    }

    /**
     * <p>
     * The field that AWS WAF uses to determine if requests are likely arriving
     * from a single source and thus subject to rate monitoring. The only valid
     * value for <code>RateKey</code> is <code>IP</code>. <code>IP</code>
     * indicates that requests that arrive from the same IP address are subject
     * to the <code>RateLimit</code> that is specified in the
     * <code>RateBasedRule</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IP
     *
     * @param rateKey <p>
     *            The field that AWS WAF uses to determine if requests are
     *            likely arriving from a single source and thus subject to rate
     *            monitoring. The only valid value for <code>RateKey</code> is
     *            <code>IP</code>. <code>IP</code> indicates that requests that
     *            arrive from the same IP address are subject to the
     *            <code>RateLimit</code> that is specified in the
     *            <code>RateBasedRule</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RateKey
     */
    public CreateRateBasedRuleRequest withRateKey(String rateKey) {
        this.rateKey = rateKey;
        return this;
    }

    /**
     * <p>
     * The field that AWS WAF uses to determine if requests are likely arriving
     * from a single source and thus subject to rate monitoring. The only valid
     * value for <code>RateKey</code> is <code>IP</code>. <code>IP</code>
     * indicates that requests that arrive from the same IP address are subject
     * to the <code>RateLimit</code> that is specified in the
     * <code>RateBasedRule</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IP
     *
     * @param rateKey <p>
     *            The field that AWS WAF uses to determine if requests are
     *            likely arriving from a single source and thus subject to rate
     *            monitoring. The only valid value for <code>RateKey</code> is
     *            <code>IP</code>. <code>IP</code> indicates that requests that
     *            arrive from the same IP address are subject to the
     *            <code>RateLimit</code> that is specified in the
     *            <code>RateBasedRule</code>.
     *            </p>
     * @see RateKey
     */
    public void setRateKey(RateKey rateKey) {
        this.rateKey = rateKey.toString();
    }

    /**
     * <p>
     * The field that AWS WAF uses to determine if requests are likely arriving
     * from a single source and thus subject to rate monitoring. The only valid
     * value for <code>RateKey</code> is <code>IP</code>. <code>IP</code>
     * indicates that requests that arrive from the same IP address are subject
     * to the <code>RateLimit</code> that is specified in the
     * <code>RateBasedRule</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IP
     *
     * @param rateKey <p>
     *            The field that AWS WAF uses to determine if requests are
     *            likely arriving from a single source and thus subject to rate
     *            monitoring. The only valid value for <code>RateKey</code> is
     *            <code>IP</code>. <code>IP</code> indicates that requests that
     *            arrive from the same IP address are subject to the
     *            <code>RateLimit</code> that is specified in the
     *            <code>RateBasedRule</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RateKey
     */
    public CreateRateBasedRuleRequest withRateKey(RateKey rateKey) {
        this.rateKey = rateKey.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of requests, which have an identical value in the
     * field that is specified by <code>RateKey</code>, allowed in a five-minute
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
     *         the field that is specified by <code>RateKey</code>, allowed in a
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
     * field that is specified by <code>RateKey</code>, allowed in a five-minute
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
     *            in the field that is specified by <code>RateKey</code>,
     *            allowed in a five-minute period. If the number of requests
     *            exceeds the <code>RateLimit</code> and the other predicates
     *            specified in the rule are also met, AWS WAF triggers the
     *            action that is specified for this rule.
     *            </p>
     */
    public void setRateLimit(Long rateLimit) {
        this.rateLimit = rateLimit;
    }

    /**
     * <p>
     * The maximum number of requests, which have an identical value in the
     * field that is specified by <code>RateKey</code>, allowed in a five-minute
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
     *            in the field that is specified by <code>RateKey</code>,
     *            allowed in a five-minute period. If the number of requests
     *            exceeds the <code>RateLimit</code> and the other predicates
     *            specified in the rule are also met, AWS WAF triggers the
     *            action that is specified for this rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRateBasedRuleRequest withRateLimit(Long rateLimit) {
        this.rateLimit = rateLimit;
        return this;
    }

    /**
     * <p>
     * The <code>ChangeToken</code> that you used to submit the
     * <code>CreateRateBasedRule</code> request. You can also use this value to
     * query the status of the request. For more information, see
     * <a>GetChangeTokenStatus</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The <code>ChangeToken</code> that you used to submit the
     *         <code>CreateRateBasedRule</code> request. You can also use this
     *         value to query the status of the request. For more information,
     *         see <a>GetChangeTokenStatus</a>.
     *         </p>
     */
    public String getChangeToken() {
        return changeToken;
    }

    /**
     * <p>
     * The <code>ChangeToken</code> that you used to submit the
     * <code>CreateRateBasedRule</code> request. You can also use this value to
     * query the status of the request. For more information, see
     * <a>GetChangeTokenStatus</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param changeToken <p>
     *            The <code>ChangeToken</code> that you used to submit the
     *            <code>CreateRateBasedRule</code> request. You can also use
     *            this value to query the status of the request. For more
     *            information, see <a>GetChangeTokenStatus</a>.
     *            </p>
     */
    public void setChangeToken(String changeToken) {
        this.changeToken = changeToken;
    }

    /**
     * <p>
     * The <code>ChangeToken</code> that you used to submit the
     * <code>CreateRateBasedRule</code> request. You can also use this value to
     * query the status of the request. For more information, see
     * <a>GetChangeTokenStatus</a>.
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
     *            The <code>ChangeToken</code> that you used to submit the
     *            <code>CreateRateBasedRule</code> request. You can also use
     *            this value to query the status of the request. For more
     *            information, see <a>GetChangeTokenStatus</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRateBasedRuleRequest withChangeToken(String changeToken) {
        this.changeToken = changeToken;
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p/>
     *
     * @param tags <p/>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRateBasedRuleRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRateBasedRuleRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getMetricName() != null)
            sb.append("MetricName: " + getMetricName() + ",");
        if (getRateKey() != null)
            sb.append("RateKey: " + getRateKey() + ",");
        if (getRateLimit() != null)
            sb.append("RateLimit: " + getRateLimit() + ",");
        if (getChangeToken() != null)
            sb.append("ChangeToken: " + getChangeToken() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getRateKey() == null) ? 0 : getRateKey().hashCode());
        hashCode = prime * hashCode + ((getRateLimit() == null) ? 0 : getRateLimit().hashCode());
        hashCode = prime * hashCode
                + ((getChangeToken() == null) ? 0 : getChangeToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRateBasedRuleRequest == false)
            return false;
        CreateRateBasedRuleRequest other = (CreateRateBasedRuleRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null
                && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getRateKey() == null ^ this.getRateKey() == null)
            return false;
        if (other.getRateKey() != null && other.getRateKey().equals(this.getRateKey()) == false)
            return false;
        if (other.getRateLimit() == null ^ this.getRateLimit() == null)
            return false;
        if (other.getRateLimit() != null
                && other.getRateLimit().equals(this.getRateLimit()) == false)
            return false;
        if (other.getChangeToken() == null ^ this.getChangeToken() == null)
            return false;
        if (other.getChangeToken() != null
                && other.getChangeToken().equals(this.getChangeToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
