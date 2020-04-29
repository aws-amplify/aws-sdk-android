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
 * A <code>RateBasedRule</code> is identical to a regular <a>Rule</a>, with one
 * addition: a <code>RateBasedRule</code> counts the number of requests that
 * arrive from a specified IP address every five minutes. For example, based on
 * recent requests that you've seen from an attacker, you might create a
 * <code>RateBasedRule</code> that includes the following conditions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The requests come from 192.0.2.44.
 * </p>
 * </li>
 * <li>
 * <p>
 * They contain the value <code>BadBot</code> in the <code>User-Agent</code>
 * header.
 * </p>
 * </li>
 * </ul>
 * <p>
 * In the rule, you also define the rate limit as 1,000.
 * </p>
 * <p>
 * Requests that meet both of these conditions and exceed 1,000 requests every
 * five minutes trigger the rule's action (block or count), which is defined in
 * the web ACL.
 * </p>
 */
public class RateBasedRule implements Serializable {
    /**
     * <p>
     * A unique identifier for a <code>RateBasedRule</code>. You use
     * <code>RuleId</code> to get more information about a
     * <code>RateBasedRule</code> (see <a>GetRateBasedRule</a>), update a
     * <code>RateBasedRule</code> (see <a>UpdateRateBasedRule</a>), insert a
     * <code>RateBasedRule</code> into a <code>WebACL</code> or delete one from
     * a <code>WebACL</code> (see <a>UpdateWebACL</a>), or delete a
     * <code>RateBasedRule</code> from AWS WAF (see <a>DeleteRateBasedRule</a>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String ruleId;

    /**
     * <p>
     * A friendly name or description for a <code>RateBasedRule</code>. You
     * can't change the name of a <code>RateBasedRule</code> after you create
     * it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String name;

    /**
     * <p>
     * A friendly name or description for the metrics for a
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
     * The <code>Predicates</code> object contains one <code>Predicate</code>
     * element for each <a>ByteMatchSet</a>, <a>IPSet</a>, or
     * <a>SqlInjectionMatchSet</a> object that you want to include in a
     * <code>RateBasedRule</code>.
     * </p>
     */
    private java.util.List<Predicate> matchPredicates;

    /**
     * <p>
     * The field that AWS WAF uses to determine if requests are likely arriving
     * from single source and thus subject to rate monitoring. The only valid
     * value for <code>RateKey</code> is <code>IP</code>. <code>IP</code>
     * indicates that requests arriving from the same IP address are subject to
     * the <code>RateLimit</code> that is specified in the
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
     * A unique identifier for a <code>RateBasedRule</code>. You use
     * <code>RuleId</code> to get more information about a
     * <code>RateBasedRule</code> (see <a>GetRateBasedRule</a>), update a
     * <code>RateBasedRule</code> (see <a>UpdateRateBasedRule</a>), insert a
     * <code>RateBasedRule</code> into a <code>WebACL</code> or delete one from
     * a <code>WebACL</code> (see <a>UpdateWebACL</a>), or delete a
     * <code>RateBasedRule</code> from AWS WAF (see <a>DeleteRateBasedRule</a>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A unique identifier for a <code>RateBasedRule</code>. You use
     *         <code>RuleId</code> to get more information about a
     *         <code>RateBasedRule</code> (see <a>GetRateBasedRule</a>), update
     *         a <code>RateBasedRule</code> (see <a>UpdateRateBasedRule</a>),
     *         insert a <code>RateBasedRule</code> into a <code>WebACL</code> or
     *         delete one from a <code>WebACL</code> (see <a>UpdateWebACL</a>),
     *         or delete a <code>RateBasedRule</code> from AWS WAF (see
     *         <a>DeleteRateBasedRule</a>).
     *         </p>
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * <p>
     * A unique identifier for a <code>RateBasedRule</code>. You use
     * <code>RuleId</code> to get more information about a
     * <code>RateBasedRule</code> (see <a>GetRateBasedRule</a>), update a
     * <code>RateBasedRule</code> (see <a>UpdateRateBasedRule</a>), insert a
     * <code>RateBasedRule</code> into a <code>WebACL</code> or delete one from
     * a <code>WebACL</code> (see <a>UpdateWebACL</a>), or delete a
     * <code>RateBasedRule</code> from AWS WAF (see <a>DeleteRateBasedRule</a>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param ruleId <p>
     *            A unique identifier for a <code>RateBasedRule</code>. You use
     *            <code>RuleId</code> to get more information about a
     *            <code>RateBasedRule</code> (see <a>GetRateBasedRule</a>),
     *            update a <code>RateBasedRule</code> (see
     *            <a>UpdateRateBasedRule</a>), insert a
     *            <code>RateBasedRule</code> into a <code>WebACL</code> or
     *            delete one from a <code>WebACL</code> (see
     *            <a>UpdateWebACL</a>), or delete a <code>RateBasedRule</code>
     *            from AWS WAF (see <a>DeleteRateBasedRule</a>).
     *            </p>
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * A unique identifier for a <code>RateBasedRule</code>. You use
     * <code>RuleId</code> to get more information about a
     * <code>RateBasedRule</code> (see <a>GetRateBasedRule</a>), update a
     * <code>RateBasedRule</code> (see <a>UpdateRateBasedRule</a>), insert a
     * <code>RateBasedRule</code> into a <code>WebACL</code> or delete one from
     * a <code>WebACL</code> (see <a>UpdateWebACL</a>), or delete a
     * <code>RateBasedRule</code> from AWS WAF (see <a>DeleteRateBasedRule</a>).
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
     *            A unique identifier for a <code>RateBasedRule</code>. You use
     *            <code>RuleId</code> to get more information about a
     *            <code>RateBasedRule</code> (see <a>GetRateBasedRule</a>),
     *            update a <code>RateBasedRule</code> (see
     *            <a>UpdateRateBasedRule</a>), insert a
     *            <code>RateBasedRule</code> into a <code>WebACL</code> or
     *            delete one from a <code>WebACL</code> (see
     *            <a>UpdateWebACL</a>), or delete a <code>RateBasedRule</code>
     *            from AWS WAF (see <a>DeleteRateBasedRule</a>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RateBasedRule withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * <p>
     * A friendly name or description for a <code>RateBasedRule</code>. You
     * can't change the name of a <code>RateBasedRule</code> after you create
     * it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A friendly name or description for a <code>RateBasedRule</code>.
     *         You can't change the name of a <code>RateBasedRule</code> after
     *         you create it.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A friendly name or description for a <code>RateBasedRule</code>. You
     * can't change the name of a <code>RateBasedRule</code> after you create
     * it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            A friendly name or description for a
     *            <code>RateBasedRule</code>. You can't change the name of a
     *            <code>RateBasedRule</code> after you create it.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name or description for a <code>RateBasedRule</code>. You
     * can't change the name of a <code>RateBasedRule</code> after you create
     * it.
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
     *            A friendly name or description for a
     *            <code>RateBasedRule</code>. You can't change the name of a
     *            <code>RateBasedRule</code> after you create it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RateBasedRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A friendly name or description for the metrics for a
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
     *         A friendly name or description for the metrics for a
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
     * A friendly name or description for the metrics for a
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
     *            A friendly name or description for the metrics for a
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
     * A friendly name or description for the metrics for a
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
     *            A friendly name or description for the metrics for a
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
    public RateBasedRule withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * <p>
     * The <code>Predicates</code> object contains one <code>Predicate</code>
     * element for each <a>ByteMatchSet</a>, <a>IPSet</a>, or
     * <a>SqlInjectionMatchSet</a> object that you want to include in a
     * <code>RateBasedRule</code>.
     * </p>
     *
     * @return <p>
     *         The <code>Predicates</code> object contains one
     *         <code>Predicate</code> element for each <a>ByteMatchSet</a>,
     *         <a>IPSet</a>, or <a>SqlInjectionMatchSet</a> object that you want
     *         to include in a <code>RateBasedRule</code>.
     *         </p>
     */
    public java.util.List<Predicate> getMatchPredicates() {
        return matchPredicates;
    }

    /**
     * <p>
     * The <code>Predicates</code> object contains one <code>Predicate</code>
     * element for each <a>ByteMatchSet</a>, <a>IPSet</a>, or
     * <a>SqlInjectionMatchSet</a> object that you want to include in a
     * <code>RateBasedRule</code>.
     * </p>
     *
     * @param matchPredicates <p>
     *            The <code>Predicates</code> object contains one
     *            <code>Predicate</code> element for each <a>ByteMatchSet</a>,
     *            <a>IPSet</a>, or <a>SqlInjectionMatchSet</a> object that you
     *            want to include in a <code>RateBasedRule</code>.
     *            </p>
     */
    public void setMatchPredicates(java.util.Collection<Predicate> matchPredicates) {
        if (matchPredicates == null) {
            this.matchPredicates = null;
            return;
        }

        this.matchPredicates = new java.util.ArrayList<Predicate>(matchPredicates);
    }

    /**
     * <p>
     * The <code>Predicates</code> object contains one <code>Predicate</code>
     * element for each <a>ByteMatchSet</a>, <a>IPSet</a>, or
     * <a>SqlInjectionMatchSet</a> object that you want to include in a
     * <code>RateBasedRule</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param matchPredicates <p>
     *            The <code>Predicates</code> object contains one
     *            <code>Predicate</code> element for each <a>ByteMatchSet</a>,
     *            <a>IPSet</a>, or <a>SqlInjectionMatchSet</a> object that you
     *            want to include in a <code>RateBasedRule</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RateBasedRule withMatchPredicates(Predicate... matchPredicates) {
        if (getMatchPredicates() == null) {
            this.matchPredicates = new java.util.ArrayList<Predicate>(matchPredicates.length);
        }
        for (Predicate value : matchPredicates) {
            this.matchPredicates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The <code>Predicates</code> object contains one <code>Predicate</code>
     * element for each <a>ByteMatchSet</a>, <a>IPSet</a>, or
     * <a>SqlInjectionMatchSet</a> object that you want to include in a
     * <code>RateBasedRule</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param matchPredicates <p>
     *            The <code>Predicates</code> object contains one
     *            <code>Predicate</code> element for each <a>ByteMatchSet</a>,
     *            <a>IPSet</a>, or <a>SqlInjectionMatchSet</a> object that you
     *            want to include in a <code>RateBasedRule</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RateBasedRule withMatchPredicates(java.util.Collection<Predicate> matchPredicates) {
        setMatchPredicates(matchPredicates);
        return this;
    }

    /**
     * <p>
     * The field that AWS WAF uses to determine if requests are likely arriving
     * from single source and thus subject to rate monitoring. The only valid
     * value for <code>RateKey</code> is <code>IP</code>. <code>IP</code>
     * indicates that requests arriving from the same IP address are subject to
     * the <code>RateLimit</code> that is specified in the
     * <code>RateBasedRule</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IP
     *
     * @return <p>
     *         The field that AWS WAF uses to determine if requests are likely
     *         arriving from single source and thus subject to rate monitoring.
     *         The only valid value for <code>RateKey</code> is <code>IP</code>.
     *         <code>IP</code> indicates that requests arriving from the same IP
     *         address are subject to the <code>RateLimit</code> that is
     *         specified in the <code>RateBasedRule</code>.
     *         </p>
     * @see RateKey
     */
    public String getRateKey() {
        return rateKey;
    }

    /**
     * <p>
     * The field that AWS WAF uses to determine if requests are likely arriving
     * from single source and thus subject to rate monitoring. The only valid
     * value for <code>RateKey</code> is <code>IP</code>. <code>IP</code>
     * indicates that requests arriving from the same IP address are subject to
     * the <code>RateLimit</code> that is specified in the
     * <code>RateBasedRule</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IP
     *
     * @param rateKey <p>
     *            The field that AWS WAF uses to determine if requests are
     *            likely arriving from single source and thus subject to rate
     *            monitoring. The only valid value for <code>RateKey</code> is
     *            <code>IP</code>. <code>IP</code> indicates that requests
     *            arriving from the same IP address are subject to the
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
     * from single source and thus subject to rate monitoring. The only valid
     * value for <code>RateKey</code> is <code>IP</code>. <code>IP</code>
     * indicates that requests arriving from the same IP address are subject to
     * the <code>RateLimit</code> that is specified in the
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
     *            likely arriving from single source and thus subject to rate
     *            monitoring. The only valid value for <code>RateKey</code> is
     *            <code>IP</code>. <code>IP</code> indicates that requests
     *            arriving from the same IP address are subject to the
     *            <code>RateLimit</code> that is specified in the
     *            <code>RateBasedRule</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RateKey
     */
    public RateBasedRule withRateKey(String rateKey) {
        this.rateKey = rateKey;
        return this;
    }

    /**
     * <p>
     * The field that AWS WAF uses to determine if requests are likely arriving
     * from single source and thus subject to rate monitoring. The only valid
     * value for <code>RateKey</code> is <code>IP</code>. <code>IP</code>
     * indicates that requests arriving from the same IP address are subject to
     * the <code>RateLimit</code> that is specified in the
     * <code>RateBasedRule</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IP
     *
     * @param rateKey <p>
     *            The field that AWS WAF uses to determine if requests are
     *            likely arriving from single source and thus subject to rate
     *            monitoring. The only valid value for <code>RateKey</code> is
     *            <code>IP</code>. <code>IP</code> indicates that requests
     *            arriving from the same IP address are subject to the
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
     * from single source and thus subject to rate monitoring. The only valid
     * value for <code>RateKey</code> is <code>IP</code>. <code>IP</code>
     * indicates that requests arriving from the same IP address are subject to
     * the <code>RateLimit</code> that is specified in the
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
     *            likely arriving from single source and thus subject to rate
     *            monitoring. The only valid value for <code>RateKey</code> is
     *            <code>IP</code>. <code>IP</code> indicates that requests
     *            arriving from the same IP address are subject to the
     *            <code>RateLimit</code> that is specified in the
     *            <code>RateBasedRule</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RateKey
     */
    public RateBasedRule withRateKey(RateKey rateKey) {
        this.rateKey = rateKey.toString();
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
    public RateBasedRule withRateLimit(Long rateLimit) {
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getMetricName() != null)
            sb.append("MetricName: " + getMetricName() + ",");
        if (getMatchPredicates() != null)
            sb.append("MatchPredicates: " + getMatchPredicates() + ",");
        if (getRateKey() != null)
            sb.append("RateKey: " + getRateKey() + ",");
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode
                + ((getMatchPredicates() == null) ? 0 : getMatchPredicates().hashCode());
        hashCode = prime * hashCode + ((getRateKey() == null) ? 0 : getRateKey().hashCode());
        hashCode = prime * hashCode + ((getRateLimit() == null) ? 0 : getRateLimit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RateBasedRule == false)
            return false;
        RateBasedRule other = (RateBasedRule) obj;

        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null
                && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getMatchPredicates() == null ^ this.getMatchPredicates() == null)
            return false;
        if (other.getMatchPredicates() != null
                && other.getMatchPredicates().equals(this.getMatchPredicates()) == false)
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
        return true;
    }
}
