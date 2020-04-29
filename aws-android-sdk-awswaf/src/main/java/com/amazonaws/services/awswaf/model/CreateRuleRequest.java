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
 * Creates a <code>Rule</code>, which contains the <code>IPSet</code> objects,
 * <code>ByteMatchSet</code> objects, and other predicates that identify the
 * requests that you want to block. If you add more than one predicate to a
 * <code>Rule</code>, a request must match all of the specifications to be
 * allowed or blocked. For example, suppose that you add the following to a
 * <code>Rule</code>:
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
 * You then add the <code>Rule</code> to a <code>WebACL</code> and specify that
 * you want to blocks requests that satisfy the <code>Rule</code>. For a request
 * to be blocked, it must come from the IP address 192.0.2.44 <i>and</i> the
 * <code>User-Agent</code> header in the request must contain the value
 * <code>BadBot</code>.
 * </p>
 * <p>
 * To create and configure a <code>Rule</code>, perform the following steps:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Create and update the predicates that you want to include in the
 * <code>Rule</code>. For more information, see <a>CreateByteMatchSet</a>,
 * <a>CreateIPSet</a>, and <a>CreateSqlInjectionMatchSet</a>.
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
 * Submit a <code>CreateRule</code> request.
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
 * Submit an <code>UpdateRule</code> request to specify the predicates that you
 * want to include in the <code>Rule</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Create and update a <code>WebACL</code> that contains the <code>Rule</code>.
 * For more information, see <a>CreateWebACL</a>.
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
public class CreateRuleRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A friendly name or description of the <a>Rule</a>. You can't change the
     * name of a <code>Rule</code> after you create it.
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
     * You can't change the name of the metric after you create the
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
     * The value returned by the most recent call to <a>GetChangeToken</a>.
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
     * A friendly name or description of the <a>Rule</a>. You can't change the
     * name of a <code>Rule</code> after you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A friendly name or description of the <a>Rule</a>. You can't
     *         change the name of a <code>Rule</code> after you create it.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>Rule</a>. You can't change the
     * name of a <code>Rule</code> after you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            A friendly name or description of the <a>Rule</a>. You can't
     *            change the name of a <code>Rule</code> after you create it.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>Rule</a>. You can't change the
     * name of a <code>Rule</code> after you create it.
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
     *            A friendly name or description of the <a>Rule</a>. You can't
     *            change the name of a <code>Rule</code> after you create it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRuleRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A friendly name or description for the metrics for this <code>Rule</code>
     * . The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with
     * maximum length 128 and minimum length one. It can't contain whitespace or
     * metric names reserved for AWS WAF, including "All" and "Default_Action."
     * You can't change the name of the metric after you create the
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
     *         change the name of the metric after you create the
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
     * You can't change the name of the metric after you create the
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
     *            "Default_Action." You can't change the name of the metric
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
     * You can't change the name of the metric after you create the
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
     *            "Default_Action." You can't change the name of the metric
     *            after you create the <code>Rule</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRuleRequest withMetricName(String metricName) {
        this.metricName = metricName;
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
    public CreateRuleRequest withChangeToken(String changeToken) {
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
    public CreateRuleRequest withTags(Tag... tags) {
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
    public CreateRuleRequest withTags(java.util.Collection<Tag> tags) {
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

        if (obj instanceof CreateRuleRequest == false)
            return false;
        CreateRuleRequest other = (CreateRuleRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null
                && other.getMetricName().equals(this.getMetricName()) == false)
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
