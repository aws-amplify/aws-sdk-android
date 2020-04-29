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
 * The response from a <a>GetSampledRequests</a> request includes a
 * <code>SampledHTTPRequests</code> complex type that appears as
 * <code>SampledRequests</code> in the response syntax.
 * <code>SampledHTTPRequests</code> contains one <code>SampledHTTPRequest</code>
 * object for each web request that is returned by
 * <code>GetSampledRequests</code>.
 * </p>
 */
public class SampledHTTPRequest implements Serializable {
    /**
     * <p>
     * A complex type that contains detailed information about the request.
     * </p>
     */
    private HTTPRequest request;

    /**
     * <p>
     * A value that indicates how one result in the response relates
     * proportionally to other results in the response. A result that has a
     * weight of <code>2</code> represents roughly twice as many CloudFront web
     * requests as a result that has a weight of <code>1</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long weight;

    /**
     * <p>
     * The time at which AWS WAF received the request from your AWS resource, in
     * Unix time format (in seconds).
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * The action for the <code>Rule</code> that the request matched:
     * <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     * </p>
     */
    private String action;

    /**
     * <p>
     * This value is returned if the <code>GetSampledRequests</code> request
     * specifies the ID of a <code>RuleGroup</code> rather than the ID of an
     * individual rule. <code>RuleWithinRuleGroup</code> is the rule within the
     * specified <code>RuleGroup</code> that matched the request listed in the
     * response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String ruleWithinRuleGroup;

    /**
     * <p>
     * A complex type that contains detailed information about the request.
     * </p>
     *
     * @return <p>
     *         A complex type that contains detailed information about the
     *         request.
     *         </p>
     */
    public HTTPRequest getRequest() {
        return request;
    }

    /**
     * <p>
     * A complex type that contains detailed information about the request.
     * </p>
     *
     * @param request <p>
     *            A complex type that contains detailed information about the
     *            request.
     *            </p>
     */
    public void setRequest(HTTPRequest request) {
        this.request = request;
    }

    /**
     * <p>
     * A complex type that contains detailed information about the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param request <p>
     *            A complex type that contains detailed information about the
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SampledHTTPRequest withRequest(HTTPRequest request) {
        this.request = request;
        return this;
    }

    /**
     * <p>
     * A value that indicates how one result in the response relates
     * proportionally to other results in the response. A result that has a
     * weight of <code>2</code> represents roughly twice as many CloudFront web
     * requests as a result that has a weight of <code>1</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         A value that indicates how one result in the response relates
     *         proportionally to other results in the response. A result that
     *         has a weight of <code>2</code> represents roughly twice as many
     *         CloudFront web requests as a result that has a weight of
     *         <code>1</code>.
     *         </p>
     */
    public Long getWeight() {
        return weight;
    }

    /**
     * <p>
     * A value that indicates how one result in the response relates
     * proportionally to other results in the response. A result that has a
     * weight of <code>2</code> represents roughly twice as many CloudFront web
     * requests as a result that has a weight of <code>1</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param weight <p>
     *            A value that indicates how one result in the response relates
     *            proportionally to other results in the response. A result that
     *            has a weight of <code>2</code> represents roughly twice as
     *            many CloudFront web requests as a result that has a weight of
     *            <code>1</code>.
     *            </p>
     */
    public void setWeight(Long weight) {
        this.weight = weight;
    }

    /**
     * <p>
     * A value that indicates how one result in the response relates
     * proportionally to other results in the response. A result that has a
     * weight of <code>2</code> represents roughly twice as many CloudFront web
     * requests as a result that has a weight of <code>1</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param weight <p>
     *            A value that indicates how one result in the response relates
     *            proportionally to other results in the response. A result that
     *            has a weight of <code>2</code> represents roughly twice as
     *            many CloudFront web requests as a result that has a weight of
     *            <code>1</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SampledHTTPRequest withWeight(Long weight) {
        this.weight = weight;
        return this;
    }

    /**
     * <p>
     * The time at which AWS WAF received the request from your AWS resource, in
     * Unix time format (in seconds).
     * </p>
     *
     * @return <p>
     *         The time at which AWS WAF received the request from your AWS
     *         resource, in Unix time format (in seconds).
     *         </p>
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * The time at which AWS WAF received the request from your AWS resource, in
     * Unix time format (in seconds).
     * </p>
     *
     * @param timestamp <p>
     *            The time at which AWS WAF received the request from your AWS
     *            resource, in Unix time format (in seconds).
     *            </p>
     */
    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time at which AWS WAF received the request from your AWS resource, in
     * Unix time format (in seconds).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            The time at which AWS WAF received the request from your AWS
     *            resource, in Unix time format (in seconds).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SampledHTTPRequest withTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * <p>
     * The action for the <code>Rule</code> that the request matched:
     * <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     * </p>
     *
     * @return <p>
     *         The action for the <code>Rule</code> that the request matched:
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * The action for the <code>Rule</code> that the request matched:
     * <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     * </p>
     *
     * @param action <p>
     *            The action for the <code>Rule</code> that the request matched:
     *            <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *            </p>
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action for the <code>Rule</code> that the request matched:
     * <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param action <p>
     *            The action for the <code>Rule</code> that the request matched:
     *            <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SampledHTTPRequest withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * This value is returned if the <code>GetSampledRequests</code> request
     * specifies the ID of a <code>RuleGroup</code> rather than the ID of an
     * individual rule. <code>RuleWithinRuleGroup</code> is the rule within the
     * specified <code>RuleGroup</code> that matched the request listed in the
     * response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         This value is returned if the <code>GetSampledRequests</code>
     *         request specifies the ID of a <code>RuleGroup</code> rather than
     *         the ID of an individual rule. <code>RuleWithinRuleGroup</code> is
     *         the rule within the specified <code>RuleGroup</code> that matched
     *         the request listed in the response.
     *         </p>
     */
    public String getRuleWithinRuleGroup() {
        return ruleWithinRuleGroup;
    }

    /**
     * <p>
     * This value is returned if the <code>GetSampledRequests</code> request
     * specifies the ID of a <code>RuleGroup</code> rather than the ID of an
     * individual rule. <code>RuleWithinRuleGroup</code> is the rule within the
     * specified <code>RuleGroup</code> that matched the request listed in the
     * response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param ruleWithinRuleGroup <p>
     *            This value is returned if the <code>GetSampledRequests</code>
     *            request specifies the ID of a <code>RuleGroup</code> rather
     *            than the ID of an individual rule.
     *            <code>RuleWithinRuleGroup</code> is the rule within the
     *            specified <code>RuleGroup</code> that matched the request
     *            listed in the response.
     *            </p>
     */
    public void setRuleWithinRuleGroup(String ruleWithinRuleGroup) {
        this.ruleWithinRuleGroup = ruleWithinRuleGroup;
    }

    /**
     * <p>
     * This value is returned if the <code>GetSampledRequests</code> request
     * specifies the ID of a <code>RuleGroup</code> rather than the ID of an
     * individual rule. <code>RuleWithinRuleGroup</code> is the rule within the
     * specified <code>RuleGroup</code> that matched the request listed in the
     * response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param ruleWithinRuleGroup <p>
     *            This value is returned if the <code>GetSampledRequests</code>
     *            request specifies the ID of a <code>RuleGroup</code> rather
     *            than the ID of an individual rule.
     *            <code>RuleWithinRuleGroup</code> is the rule within the
     *            specified <code>RuleGroup</code> that matched the request
     *            listed in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SampledHTTPRequest withRuleWithinRuleGroup(String ruleWithinRuleGroup) {
        this.ruleWithinRuleGroup = ruleWithinRuleGroup;
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
        if (getRequest() != null)
            sb.append("Request: " + getRequest() + ",");
        if (getWeight() != null)
            sb.append("Weight: " + getWeight() + ",");
        if (getTimestamp() != null)
            sb.append("Timestamp: " + getTimestamp() + ",");
        if (getAction() != null)
            sb.append("Action: " + getAction() + ",");
        if (getRuleWithinRuleGroup() != null)
            sb.append("RuleWithinRuleGroup: " + getRuleWithinRuleGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequest() == null) ? 0 : getRequest().hashCode());
        hashCode = prime * hashCode + ((getWeight() == null) ? 0 : getWeight().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode
                + ((getRuleWithinRuleGroup() == null) ? 0 : getRuleWithinRuleGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SampledHTTPRequest == false)
            return false;
        SampledHTTPRequest other = (SampledHTTPRequest) obj;

        if (other.getRequest() == null ^ this.getRequest() == null)
            return false;
        if (other.getRequest() != null && other.getRequest().equals(this.getRequest()) == false)
            return false;
        if (other.getWeight() == null ^ this.getWeight() == null)
            return false;
        if (other.getWeight() != null && other.getWeight().equals(this.getWeight()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getRuleWithinRuleGroup() == null ^ this.getRuleWithinRuleGroup() == null)
            return false;
        if (other.getRuleWithinRuleGroup() != null
                && other.getRuleWithinRuleGroup().equals(this.getRuleWithinRuleGroup()) == false)
            return false;
        return true;
    }
}
