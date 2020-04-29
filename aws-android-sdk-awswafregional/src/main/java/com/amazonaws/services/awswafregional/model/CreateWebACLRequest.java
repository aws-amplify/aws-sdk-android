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
 * Creates a <code>WebACL</code>, which contains the <code>Rules</code> that
 * identify the CloudFront web requests that you want to allow, block, or count.
 * AWS WAF evaluates <code>Rules</code> in order based on the value of
 * <code>Priority</code> for each <code>Rule</code>.
 * </p>
 * <p>
 * You also specify a default action, either <code>ALLOW</code> or
 * <code>BLOCK</code>. If a web request doesn't match any of the
 * <code>Rules</code> in a <code>WebACL</code>, AWS WAF responds to the request
 * with the default action.
 * </p>
 * <p>
 * To create and configure a <code>WebACL</code>, perform the following steps:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Create and update the <code>ByteMatchSet</code> objects and other predicates
 * that you want to include in <code>Rules</code>. For more information, see
 * <a>CreateByteMatchSet</a>, <a>UpdateByteMatchSet</a>, <a>CreateIPSet</a>,
 * <a>UpdateIPSet</a>, <a>CreateSqlInjectionMatchSet</a>, and
 * <a>UpdateSqlInjectionMatchSet</a>.
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
 * Use <a>GetChangeToken</a> to get the change token that you provide in the
 * <code>ChangeToken</code> parameter of a <code>CreateWebACL</code> request.
 * </p>
 * </li>
 * <li>
 * <p>
 * Submit a <code>CreateWebACL</code> request.
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
 * Submit an <a>UpdateWebACL</a> request to specify the <code>Rules</code> that
 * you want to include in the <code>WebACL</code>, to specify the default
 * action, and to associate the <code>WebACL</code> with a CloudFront
 * distribution.
 * </p>
 * </li>
 * </ol>
 * <p>
 * For more information about how to use the AWS WAF API, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
 * Developer Guide</a>.
 * </p>
 */
public class CreateWebACLRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A friendly name or description of the <a>WebACL</a>. You can't change
     * <code>Name</code> after you create the <code>WebACL</code>.
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
     * <code>WebACL</code>.The name can contain only alphanumeric characters
     * (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It can't
     * contain whitespace or metric names reserved for AWS WAF, including "All"
     * and "Default_Action." You can't change <code>MetricName</code> after you
     * create the <code>WebACL</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String metricName;

    /**
     * <p>
     * The action that you want AWS WAF to take when a request doesn't match the
     * criteria specified in any of the <code>Rule</code> objects that are
     * associated with the <code>WebACL</code>.
     * </p>
     */
    private WafAction defaultAction;

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
     * A friendly name or description of the <a>WebACL</a>. You can't change
     * <code>Name</code> after you create the <code>WebACL</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A friendly name or description of the <a>WebACL</a>. You can't
     *         change <code>Name</code> after you create the <code>WebACL</code>
     *         .
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>WebACL</a>. You can't change
     * <code>Name</code> after you create the <code>WebACL</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            A friendly name or description of the <a>WebACL</a>. You can't
     *            change <code>Name</code> after you create the
     *            <code>WebACL</code>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>WebACL</a>. You can't change
     * <code>Name</code> after you create the <code>WebACL</code>.
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
     *            A friendly name or description of the <a>WebACL</a>. You can't
     *            change <code>Name</code> after you create the
     *            <code>WebACL</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateWebACLRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A friendly name or description for the metrics for this
     * <code>WebACL</code>.The name can contain only alphanumeric characters
     * (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It can't
     * contain whitespace or metric names reserved for AWS WAF, including "All"
     * and "Default_Action." You can't change <code>MetricName</code> after you
     * create the <code>WebACL</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A friendly name or description for the metrics for this
     *         <code>WebACL</code>.The name can contain only alphanumeric
     *         characters (A-Z, a-z, 0-9), with maximum length 128 and minimum
     *         length one. It can't contain whitespace or metric names reserved
     *         for AWS WAF, including "All" and "Default_Action." You can't
     *         change <code>MetricName</code> after you create the
     *         <code>WebACL</code>.
     *         </p>
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * <p>
     * A friendly name or description for the metrics for this
     * <code>WebACL</code>.The name can contain only alphanumeric characters
     * (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It can't
     * contain whitespace or metric names reserved for AWS WAF, including "All"
     * and "Default_Action." You can't change <code>MetricName</code> after you
     * create the <code>WebACL</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param metricName <p>
     *            A friendly name or description for the metrics for this
     *            <code>WebACL</code>.The name can contain only alphanumeric
     *            characters (A-Z, a-z, 0-9), with maximum length 128 and
     *            minimum length one. It can't contain whitespace or metric
     *            names reserved for AWS WAF, including "All" and
     *            "Default_Action." You can't change <code>MetricName</code>
     *            after you create the <code>WebACL</code>.
     *            </p>
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * A friendly name or description for the metrics for this
     * <code>WebACL</code>.The name can contain only alphanumeric characters
     * (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It can't
     * contain whitespace or metric names reserved for AWS WAF, including "All"
     * and "Default_Action." You can't change <code>MetricName</code> after you
     * create the <code>WebACL</code>.
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
     *            <code>WebACL</code>.The name can contain only alphanumeric
     *            characters (A-Z, a-z, 0-9), with maximum length 128 and
     *            minimum length one. It can't contain whitespace or metric
     *            names reserved for AWS WAF, including "All" and
     *            "Default_Action." You can't change <code>MetricName</code>
     *            after you create the <code>WebACL</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateWebACLRequest withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * <p>
     * The action that you want AWS WAF to take when a request doesn't match the
     * criteria specified in any of the <code>Rule</code> objects that are
     * associated with the <code>WebACL</code>.
     * </p>
     *
     * @return <p>
     *         The action that you want AWS WAF to take when a request doesn't
     *         match the criteria specified in any of the <code>Rule</code>
     *         objects that are associated with the <code>WebACL</code>.
     *         </p>
     */
    public WafAction getDefaultAction() {
        return defaultAction;
    }

    /**
     * <p>
     * The action that you want AWS WAF to take when a request doesn't match the
     * criteria specified in any of the <code>Rule</code> objects that are
     * associated with the <code>WebACL</code>.
     * </p>
     *
     * @param defaultAction <p>
     *            The action that you want AWS WAF to take when a request
     *            doesn't match the criteria specified in any of the
     *            <code>Rule</code> objects that are associated with the
     *            <code>WebACL</code>.
     *            </p>
     */
    public void setDefaultAction(WafAction defaultAction) {
        this.defaultAction = defaultAction;
    }

    /**
     * <p>
     * The action that you want AWS WAF to take when a request doesn't match the
     * criteria specified in any of the <code>Rule</code> objects that are
     * associated with the <code>WebACL</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultAction <p>
     *            The action that you want AWS WAF to take when a request
     *            doesn't match the criteria specified in any of the
     *            <code>Rule</code> objects that are associated with the
     *            <code>WebACL</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateWebACLRequest withDefaultAction(WafAction defaultAction) {
        this.defaultAction = defaultAction;
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
    public CreateWebACLRequest withChangeToken(String changeToken) {
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
    public CreateWebACLRequest withTags(Tag... tags) {
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
    public CreateWebACLRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getDefaultAction() != null)
            sb.append("DefaultAction: " + getDefaultAction() + ",");
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
                + ((getDefaultAction() == null) ? 0 : getDefaultAction().hashCode());
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

        if (obj instanceof CreateWebACLRequest == false)
            return false;
        CreateWebACLRequest other = (CreateWebACLRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null
                && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getDefaultAction() == null ^ this.getDefaultAction() == null)
            return false;
        if (other.getDefaultAction() != null
                && other.getDefaultAction().equals(this.getDefaultAction()) == false)
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
