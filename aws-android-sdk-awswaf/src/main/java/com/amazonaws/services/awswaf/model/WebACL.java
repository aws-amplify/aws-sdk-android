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
 * Contains the <code>Rules</code> that identify the requests that you want to
 * allow, block, or count. In a <code>WebACL</code>, you also specify a default
 * action (<code>ALLOW</code> or <code>BLOCK</code>), and the action for each
 * <code>Rule</code> that you add to a <code>WebACL</code>, for example, block
 * requests from specified IP addresses or block requests from specified
 * referrers. You also associate the <code>WebACL</code> with a CloudFront
 * distribution to identify the requests that you want AWS WAF to filter. If you
 * add more than one <code>Rule</code> to a <code>WebACL</code>, a request needs
 * to match only one of the specifications to be allowed, blocked, or counted.
 * For more information, see <a>UpdateWebACL</a>.
 * </p>
 */
public class WebACL implements Serializable {
    /**
     * <p>
     * A unique identifier for a <code>WebACL</code>. You use
     * <code>WebACLId</code> to get information about a <code>WebACL</code> (see
     * <a>GetWebACL</a>), update a <code>WebACL</code> (see
     * <a>UpdateWebACL</a>), and delete a <code>WebACL</code> from AWS WAF (see
     * <a>DeleteWebACL</a>).
     * </p>
     * <p>
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
     * A friendly name or description of the <code>WebACL</code>. You can't
     * change the name of a <code>WebACL</code> after you create it.
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
     * <code>WebACL</code>. The name can contain only alphanumeric characters
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
     * The action to perform if none of the <code>Rules</code> contained in the
     * <code>WebACL</code> match. The action is specified by the
     * <a>WafAction</a> object.
     * </p>
     */
    private WafAction defaultAction;

    /**
     * <p>
     * An array that contains the action for each <code>Rule</code> in a
     * <code>WebACL</code>, the priority of the <code>Rule</code>, and the ID of
     * the <code>Rule</code>.
     * </p>
     */
    private java.util.List<ActivatedRule> rules;

    /**
     * <p>
     * Tha Amazon Resource Name (ARN) of the web ACL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String webACLArn;

    /**
     * <p>
     * A unique identifier for a <code>WebACL</code>. You use
     * <code>WebACLId</code> to get information about a <code>WebACL</code> (see
     * <a>GetWebACL</a>), update a <code>WebACL</code> (see
     * <a>UpdateWebACL</a>), and delete a <code>WebACL</code> from AWS WAF (see
     * <a>DeleteWebACL</a>).
     * </p>
     * <p>
     * <code>WebACLId</code> is returned by <a>CreateWebACL</a> and by
     * <a>ListWebACLs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A unique identifier for a <code>WebACL</code>. You use
     *         <code>WebACLId</code> to get information about a
     *         <code>WebACL</code> (see <a>GetWebACL</a>), update a
     *         <code>WebACL</code> (see <a>UpdateWebACL</a>), and delete a
     *         <code>WebACL</code> from AWS WAF (see <a>DeleteWebACL</a>).
     *         </p>
     *         <p>
     *         <code>WebACLId</code> is returned by <a>CreateWebACL</a> and by
     *         <a>ListWebACLs</a>.
     *         </p>
     */
    public String getWebACLId() {
        return webACLId;
    }

    /**
     * <p>
     * A unique identifier for a <code>WebACL</code>. You use
     * <code>WebACLId</code> to get information about a <code>WebACL</code> (see
     * <a>GetWebACL</a>), update a <code>WebACL</code> (see
     * <a>UpdateWebACL</a>), and delete a <code>WebACL</code> from AWS WAF (see
     * <a>DeleteWebACL</a>).
     * </p>
     * <p>
     * <code>WebACLId</code> is returned by <a>CreateWebACL</a> and by
     * <a>ListWebACLs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param webACLId <p>
     *            A unique identifier for a <code>WebACL</code>. You use
     *            <code>WebACLId</code> to get information about a
     *            <code>WebACL</code> (see <a>GetWebACL</a>), update a
     *            <code>WebACL</code> (see <a>UpdateWebACL</a>), and delete a
     *            <code>WebACL</code> from AWS WAF (see <a>DeleteWebACL</a>).
     *            </p>
     *            <p>
     *            <code>WebACLId</code> is returned by <a>CreateWebACL</a> and
     *            by <a>ListWebACLs</a>.
     *            </p>
     */
    public void setWebACLId(String webACLId) {
        this.webACLId = webACLId;
    }

    /**
     * <p>
     * A unique identifier for a <code>WebACL</code>. You use
     * <code>WebACLId</code> to get information about a <code>WebACL</code> (see
     * <a>GetWebACL</a>), update a <code>WebACL</code> (see
     * <a>UpdateWebACL</a>), and delete a <code>WebACL</code> from AWS WAF (see
     * <a>DeleteWebACL</a>).
     * </p>
     * <p>
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
     *            A unique identifier for a <code>WebACL</code>. You use
     *            <code>WebACLId</code> to get information about a
     *            <code>WebACL</code> (see <a>GetWebACL</a>), update a
     *            <code>WebACL</code> (see <a>UpdateWebACL</a>), and delete a
     *            <code>WebACL</code> from AWS WAF (see <a>DeleteWebACL</a>).
     *            </p>
     *            <p>
     *            <code>WebACLId</code> is returned by <a>CreateWebACL</a> and
     *            by <a>ListWebACLs</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WebACL withWebACLId(String webACLId) {
        this.webACLId = webACLId;
        return this;
    }

    /**
     * <p>
     * A friendly name or description of the <code>WebACL</code>. You can't
     * change the name of a <code>WebACL</code> after you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A friendly name or description of the <code>WebACL</code>. You
     *         can't change the name of a <code>WebACL</code> after you create
     *         it.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A friendly name or description of the <code>WebACL</code>. You can't
     * change the name of a <code>WebACL</code> after you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            A friendly name or description of the <code>WebACL</code>. You
     *            can't change the name of a <code>WebACL</code> after you
     *            create it.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name or description of the <code>WebACL</code>. You can't
     * change the name of a <code>WebACL</code> after you create it.
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
     *            A friendly name or description of the <code>WebACL</code>. You
     *            can't change the name of a <code>WebACL</code> after you
     *            create it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WebACL withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A friendly name or description for the metrics for this
     * <code>WebACL</code>. The name can contain only alphanumeric characters
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
     *         <code>WebACL</code>. The name can contain only alphanumeric
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
     * <code>WebACL</code>. The name can contain only alphanumeric characters
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
     *            <code>WebACL</code>. The name can contain only alphanumeric
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
     * <code>WebACL</code>. The name can contain only alphanumeric characters
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
     *            <code>WebACL</code>. The name can contain only alphanumeric
     *            characters (A-Z, a-z, 0-9), with maximum length 128 and
     *            minimum length one. It can't contain whitespace or metric
     *            names reserved for AWS WAF, including "All" and
     *            "Default_Action." You can't change <code>MetricName</code>
     *            after you create the <code>WebACL</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WebACL withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * <p>
     * The action to perform if none of the <code>Rules</code> contained in the
     * <code>WebACL</code> match. The action is specified by the
     * <a>WafAction</a> object.
     * </p>
     *
     * @return <p>
     *         The action to perform if none of the <code>Rules</code> contained
     *         in the <code>WebACL</code> match. The action is specified by the
     *         <a>WafAction</a> object.
     *         </p>
     */
    public WafAction getDefaultAction() {
        return defaultAction;
    }

    /**
     * <p>
     * The action to perform if none of the <code>Rules</code> contained in the
     * <code>WebACL</code> match. The action is specified by the
     * <a>WafAction</a> object.
     * </p>
     *
     * @param defaultAction <p>
     *            The action to perform if none of the <code>Rules</code>
     *            contained in the <code>WebACL</code> match. The action is
     *            specified by the <a>WafAction</a> object.
     *            </p>
     */
    public void setDefaultAction(WafAction defaultAction) {
        this.defaultAction = defaultAction;
    }

    /**
     * <p>
     * The action to perform if none of the <code>Rules</code> contained in the
     * <code>WebACL</code> match. The action is specified by the
     * <a>WafAction</a> object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultAction <p>
     *            The action to perform if none of the <code>Rules</code>
     *            contained in the <code>WebACL</code> match. The action is
     *            specified by the <a>WafAction</a> object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WebACL withDefaultAction(WafAction defaultAction) {
        this.defaultAction = defaultAction;
        return this;
    }

    /**
     * <p>
     * An array that contains the action for each <code>Rule</code> in a
     * <code>WebACL</code>, the priority of the <code>Rule</code>, and the ID of
     * the <code>Rule</code>.
     * </p>
     *
     * @return <p>
     *         An array that contains the action for each <code>Rule</code> in a
     *         <code>WebACL</code>, the priority of the <code>Rule</code>, and
     *         the ID of the <code>Rule</code>.
     *         </p>
     */
    public java.util.List<ActivatedRule> getRules() {
        return rules;
    }

    /**
     * <p>
     * An array that contains the action for each <code>Rule</code> in a
     * <code>WebACL</code>, the priority of the <code>Rule</code>, and the ID of
     * the <code>Rule</code>.
     * </p>
     *
     * @param rules <p>
     *            An array that contains the action for each <code>Rule</code>
     *            in a <code>WebACL</code>, the priority of the
     *            <code>Rule</code>, and the ID of the <code>Rule</code>.
     *            </p>
     */
    public void setRules(java.util.Collection<ActivatedRule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<ActivatedRule>(rules);
    }

    /**
     * <p>
     * An array that contains the action for each <code>Rule</code> in a
     * <code>WebACL</code>, the priority of the <code>Rule</code>, and the ID of
     * the <code>Rule</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            An array that contains the action for each <code>Rule</code>
     *            in a <code>WebACL</code>, the priority of the
     *            <code>Rule</code>, and the ID of the <code>Rule</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WebACL withRules(ActivatedRule... rules) {
        if (getRules() == null) {
            this.rules = new java.util.ArrayList<ActivatedRule>(rules.length);
        }
        for (ActivatedRule value : rules) {
            this.rules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array that contains the action for each <code>Rule</code> in a
     * <code>WebACL</code>, the priority of the <code>Rule</code>, and the ID of
     * the <code>Rule</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rules <p>
     *            An array that contains the action for each <code>Rule</code>
     *            in a <code>WebACL</code>, the priority of the
     *            <code>Rule</code>, and the ID of the <code>Rule</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WebACL withRules(java.util.Collection<ActivatedRule> rules) {
        setRules(rules);
        return this;
    }

    /**
     * <p>
     * Tha Amazon Resource Name (ARN) of the web ACL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         Tha Amazon Resource Name (ARN) of the web ACL.
     *         </p>
     */
    public String getWebACLArn() {
        return webACLArn;
    }

    /**
     * <p>
     * Tha Amazon Resource Name (ARN) of the web ACL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param webACLArn <p>
     *            Tha Amazon Resource Name (ARN) of the web ACL.
     *            </p>
     */
    public void setWebACLArn(String webACLArn) {
        this.webACLArn = webACLArn;
    }

    /**
     * <p>
     * Tha Amazon Resource Name (ARN) of the web ACL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param webACLArn <p>
     *            Tha Amazon Resource Name (ARN) of the web ACL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WebACL withWebACLArn(String webACLArn) {
        this.webACLArn = webACLArn;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getMetricName() != null)
            sb.append("MetricName: " + getMetricName() + ",");
        if (getDefaultAction() != null)
            sb.append("DefaultAction: " + getDefaultAction() + ",");
        if (getRules() != null)
            sb.append("Rules: " + getRules() + ",");
        if (getWebACLArn() != null)
            sb.append("WebACLArn: " + getWebACLArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebACLId() == null) ? 0 : getWebACLId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultAction() == null) ? 0 : getDefaultAction().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        hashCode = prime * hashCode + ((getWebACLArn() == null) ? 0 : getWebACLArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WebACL == false)
            return false;
        WebACL other = (WebACL) obj;

        if (other.getWebACLId() == null ^ this.getWebACLId() == null)
            return false;
        if (other.getWebACLId() != null && other.getWebACLId().equals(this.getWebACLId()) == false)
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
        if (other.getDefaultAction() == null ^ this.getDefaultAction() == null)
            return false;
        if (other.getDefaultAction() != null
                && other.getDefaultAction().equals(this.getDefaultAction()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        if (other.getWebACLArn() == null ^ this.getWebACLArn() == null)
            return false;
        if (other.getWebACLArn() != null
                && other.getWebACLArn().equals(this.getWebACLArn()) == false)
            return false;
        return true;
    }
}
