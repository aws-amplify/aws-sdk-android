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
 * A combination of <a>ByteMatchSet</a>, <a>IPSet</a>, and/or
 * <a>SqlInjectionMatchSet</a> objects that identify the web requests that you
 * want to allow, block, or count. For example, you might create a
 * <code>Rule</code> that includes the following predicates:
 * </p>
 * <ul>
 * <li>
 * <p>
 * An <code>IPSet</code> that causes AWS WAF to search for web requests that
 * originate from the IP address <code>192.0.2.44</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * A <code>ByteMatchSet</code> that causes AWS WAF to search for web requests
 * for which the value of the <code>User-Agent</code> header is
 * <code>BadBot</code>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * To match the settings in this <code>Rule</code>, a request must originate
 * from <code>192.0.2.44</code> AND include a <code>User-Agent</code> header for
 * which the value is <code>BadBot</code>.
 * </p>
 */
public class Rule implements Serializable {
    /**
     * <p>
     * A unique identifier for a <code>Rule</code>. You use <code>RuleId</code>
     * to get more information about a <code>Rule</code> (see <a>GetRule</a>),
     * update a <code>Rule</code> (see <a>UpdateRule</a>), insert a
     * <code>Rule</code> into a <code>WebACL</code> or delete a one from a
     * <code>WebACL</code> (see <a>UpdateWebACL</a>), or delete a
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
     * The friendly name or description for the <code>Rule</code>. You can't
     * change the name of a <code>Rule</code> after you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String name;

    /**
     * <p>
     * A friendly name or description for the metrics for this <code>Rule</code>
     * . The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with
     * maximum length 128 and minimum length one. It can't contain whitespace or
     * metric names reserved for AWS WAF, including "All" and "Default_Action."
     * You can't change <code>MetricName</code> after you create the
     * <code>Rule</code>.
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
     * <code>Rule</code>.
     * </p>
     */
    private java.util.List<Predicate> predicates;

    /**
     * <p>
     * A unique identifier for a <code>Rule</code>. You use <code>RuleId</code>
     * to get more information about a <code>Rule</code> (see <a>GetRule</a>),
     * update a <code>Rule</code> (see <a>UpdateRule</a>), insert a
     * <code>Rule</code> into a <code>WebACL</code> or delete a one from a
     * <code>WebACL</code> (see <a>UpdateWebACL</a>), or delete a
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
     *         A unique identifier for a <code>Rule</code>. You use
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
     * A unique identifier for a <code>Rule</code>. You use <code>RuleId</code>
     * to get more information about a <code>Rule</code> (see <a>GetRule</a>),
     * update a <code>Rule</code> (see <a>UpdateRule</a>), insert a
     * <code>Rule</code> into a <code>WebACL</code> or delete a one from a
     * <code>WebACL</code> (see <a>UpdateWebACL</a>), or delete a
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
     *            A unique identifier for a <code>Rule</code>. You use
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
     * A unique identifier for a <code>Rule</code>. You use <code>RuleId</code>
     * to get more information about a <code>Rule</code> (see <a>GetRule</a>),
     * update a <code>Rule</code> (see <a>UpdateRule</a>), insert a
     * <code>Rule</code> into a <code>WebACL</code> or delete a one from a
     * <code>WebACL</code> (see <a>UpdateWebACL</a>), or delete a
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
     *            A unique identifier for a <code>Rule</code>. You use
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
    public Rule withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * <p>
     * The friendly name or description for the <code>Rule</code>. You can't
     * change the name of a <code>Rule</code> after you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The friendly name or description for the <code>Rule</code>. You
     *         can't change the name of a <code>Rule</code> after you create it.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The friendly name or description for the <code>Rule</code>. You can't
     * change the name of a <code>Rule</code> after you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            The friendly name or description for the <code>Rule</code>.
     *            You can't change the name of a <code>Rule</code> after you
     *            create it.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name or description for the <code>Rule</code>. You can't
     * change the name of a <code>Rule</code> after you create it.
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
     *            The friendly name or description for the <code>Rule</code>.
     *            You can't change the name of a <code>Rule</code> after you
     *            create it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Rule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A friendly name or description for the metrics for this <code>Rule</code>
     * . The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with
     * maximum length 128 and minimum length one. It can't contain whitespace or
     * metric names reserved for AWS WAF, including "All" and "Default_Action."
     * You can't change <code>MetricName</code> after you create the
     * <code>Rule</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A friendly name or description for the metrics for this
     *         <code>Rule</code>. The name can contain only alphanumeric
     *         characters (A-Z, a-z, 0-9), with maximum length 128 and minimum
     *         length one. It can't contain whitespace or metric names reserved
     *         for AWS WAF, including "All" and "Default_Action." You can't
     *         change <code>MetricName</code> after you create the
     *         <code>Rule</code>.
     *         </p>
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * <p>
     * A friendly name or description for the metrics for this <code>Rule</code>
     * . The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with
     * maximum length 128 and minimum length one. It can't contain whitespace or
     * metric names reserved for AWS WAF, including "All" and "Default_Action."
     * You can't change <code>MetricName</code> after you create the
     * <code>Rule</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param metricName <p>
     *            A friendly name or description for the metrics for this
     *            <code>Rule</code>. The name can contain only alphanumeric
     *            characters (A-Z, a-z, 0-9), with maximum length 128 and
     *            minimum length one. It can't contain whitespace or metric
     *            names reserved for AWS WAF, including "All" and
     *            "Default_Action." You can't change <code>MetricName</code>
     *            after you create the <code>Rule</code>.
     *            </p>
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * A friendly name or description for the metrics for this <code>Rule</code>
     * . The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with
     * maximum length 128 and minimum length one. It can't contain whitespace or
     * metric names reserved for AWS WAF, including "All" and "Default_Action."
     * You can't change <code>MetricName</code> after you create the
     * <code>Rule</code>.
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
     *            <code>Rule</code>. The name can contain only alphanumeric
     *            characters (A-Z, a-z, 0-9), with maximum length 128 and
     *            minimum length one. It can't contain whitespace or metric
     *            names reserved for AWS WAF, including "All" and
     *            "Default_Action." You can't change <code>MetricName</code>
     *            after you create the <code>Rule</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Rule withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * <p>
     * The <code>Predicates</code> object contains one <code>Predicate</code>
     * element for each <a>ByteMatchSet</a>, <a>IPSet</a>, or
     * <a>SqlInjectionMatchSet</a> object that you want to include in a
     * <code>Rule</code>.
     * </p>
     *
     * @return <p>
     *         The <code>Predicates</code> object contains one
     *         <code>Predicate</code> element for each <a>ByteMatchSet</a>,
     *         <a>IPSet</a>, or <a>SqlInjectionMatchSet</a> object that you want
     *         to include in a <code>Rule</code>.
     *         </p>
     */
    public java.util.List<Predicate> getPredicates() {
        return predicates;
    }

    /**
     * <p>
     * The <code>Predicates</code> object contains one <code>Predicate</code>
     * element for each <a>ByteMatchSet</a>, <a>IPSet</a>, or
     * <a>SqlInjectionMatchSet</a> object that you want to include in a
     * <code>Rule</code>.
     * </p>
     *
     * @param predicates <p>
     *            The <code>Predicates</code> object contains one
     *            <code>Predicate</code> element for each <a>ByteMatchSet</a>,
     *            <a>IPSet</a>, or <a>SqlInjectionMatchSet</a> object that you
     *            want to include in a <code>Rule</code>.
     *            </p>
     */
    public void setPredicates(java.util.Collection<Predicate> predicates) {
        if (predicates == null) {
            this.predicates = null;
            return;
        }

        this.predicates = new java.util.ArrayList<Predicate>(predicates);
    }

    /**
     * <p>
     * The <code>Predicates</code> object contains one <code>Predicate</code>
     * element for each <a>ByteMatchSet</a>, <a>IPSet</a>, or
     * <a>SqlInjectionMatchSet</a> object that you want to include in a
     * <code>Rule</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param predicates <p>
     *            The <code>Predicates</code> object contains one
     *            <code>Predicate</code> element for each <a>ByteMatchSet</a>,
     *            <a>IPSet</a>, or <a>SqlInjectionMatchSet</a> object that you
     *            want to include in a <code>Rule</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Rule withPredicates(Predicate... predicates) {
        if (getPredicates() == null) {
            this.predicates = new java.util.ArrayList<Predicate>(predicates.length);
        }
        for (Predicate value : predicates) {
            this.predicates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The <code>Predicates</code> object contains one <code>Predicate</code>
     * element for each <a>ByteMatchSet</a>, <a>IPSet</a>, or
     * <a>SqlInjectionMatchSet</a> object that you want to include in a
     * <code>Rule</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param predicates <p>
     *            The <code>Predicates</code> object contains one
     *            <code>Predicate</code> element for each <a>ByteMatchSet</a>,
     *            <a>IPSet</a>, or <a>SqlInjectionMatchSet</a> object that you
     *            want to include in a <code>Rule</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Rule withPredicates(java.util.Collection<Predicate> predicates) {
        setPredicates(predicates);
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
        if (getPredicates() != null)
            sb.append("Predicates: " + getPredicates());
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
        hashCode = prime * hashCode + ((getPredicates() == null) ? 0 : getPredicates().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Rule == false)
            return false;
        Rule other = (Rule) obj;

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
        if (other.getPredicates() == null ^ this.getPredicates() == null)
            return false;
        if (other.getPredicates() != null
                && other.getPredicates().equals(this.getPredicates()) == false)
            return false;
        return true;
    }
}
