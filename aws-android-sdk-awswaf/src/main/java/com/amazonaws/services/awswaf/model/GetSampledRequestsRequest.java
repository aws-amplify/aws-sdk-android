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
 * Gets detailed information about a specified number of requests--a
 * sample--that AWS WAF randomly selects from among the first 5,000 requests
 * that your AWS resource received during a time range that you choose. You can
 * specify a sample size of up to 500 requests, and you can specify any time
 * range in the previous three hours.
 * </p>
 * <p>
 * <code>GetSampledRequests</code> returns a time range, which is usually the
 * time range that you specified. However, if your resource (such as a
 * CloudFront distribution) received 5,000 requests before the specified time
 * range elapsed, <code>GetSampledRequests</code> returns an updated time range.
 * This new time range indicates the actual period during which AWS WAF selected
 * the requests in the sample.
 * </p>
 */
public class GetSampledRequestsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The <code>WebACLId</code> of the <code>WebACL</code> for which you want
     * <code>GetSampledRequests</code> to return a sample of requests.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String webAclId;

    /**
     * <p>
     * <code>RuleId</code> is one of three values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>RuleId</code> of the <code>Rule</code> or the
     * <code>RuleGroupId</code> of the <code>RuleGroup</code> for which you want
     * <code>GetSampledRequests</code> to return a sample of requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Default_Action</code>, which causes <code>GetSampledRequests</code>
     * to return a sample of the requests that didn't match any of the rules in
     * the specified <code>WebACL</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String ruleId;

    /**
     * <p>
     * The start date and time and the end date and time of the range for which
     * you want <code>GetSampledRequests</code> to return a sample of requests.
     * You must specify the times in Coordinated Universal Time (UTC) format.
     * UTC format includes the special designator, <code>Z</code>. For example,
     * <code>"2016-09-27T14:50Z"</code>. You can specify any time range in the
     * previous three hours.
     * </p>
     */
    private TimeWindow timeWindow;

    /**
     * <p>
     * The number of requests that you want AWS WAF to return from among the
     * first 5,000 requests that your AWS resource received during the time
     * range. If your resource received fewer requests than the value of
     * <code>MaxItems</code>, <code>GetSampledRequests</code> returns
     * information about all of them.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     */
    private Long maxItems;

    /**
     * <p>
     * The <code>WebACLId</code> of the <code>WebACL</code> for which you want
     * <code>GetSampledRequests</code> to return a sample of requests.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The <code>WebACLId</code> of the <code>WebACL</code> for which
     *         you want <code>GetSampledRequests</code> to return a sample of
     *         requests.
     *         </p>
     */
    public String getWebAclId() {
        return webAclId;
    }

    /**
     * <p>
     * The <code>WebACLId</code> of the <code>WebACL</code> for which you want
     * <code>GetSampledRequests</code> to return a sample of requests.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param webAclId <p>
     *            The <code>WebACLId</code> of the <code>WebACL</code> for which
     *            you want <code>GetSampledRequests</code> to return a sample of
     *            requests.
     *            </p>
     */
    public void setWebAclId(String webAclId) {
        this.webAclId = webAclId;
    }

    /**
     * <p>
     * The <code>WebACLId</code> of the <code>WebACL</code> for which you want
     * <code>GetSampledRequests</code> to return a sample of requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param webAclId <p>
     *            The <code>WebACLId</code> of the <code>WebACL</code> for which
     *            you want <code>GetSampledRequests</code> to return a sample of
     *            requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSampledRequestsRequest withWebAclId(String webAclId) {
        this.webAclId = webAclId;
        return this;
    }

    /**
     * <p>
     * <code>RuleId</code> is one of three values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>RuleId</code> of the <code>Rule</code> or the
     * <code>RuleGroupId</code> of the <code>RuleGroup</code> for which you want
     * <code>GetSampledRequests</code> to return a sample of requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Default_Action</code>, which causes <code>GetSampledRequests</code>
     * to return a sample of the requests that didn't match any of the rules in
     * the specified <code>WebACL</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         <code>RuleId</code> is one of three values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>RuleId</code> of the <code>Rule</code> or the
     *         <code>RuleGroupId</code> of the <code>RuleGroup</code> for which
     *         you want <code>GetSampledRequests</code> to return a sample of
     *         requests.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Default_Action</code>, which causes
     *         <code>GetSampledRequests</code> to return a sample of the
     *         requests that didn't match any of the rules in the specified
     *         <code>WebACL</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * <p>
     * <code>RuleId</code> is one of three values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>RuleId</code> of the <code>Rule</code> or the
     * <code>RuleGroupId</code> of the <code>RuleGroup</code> for which you want
     * <code>GetSampledRequests</code> to return a sample of requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Default_Action</code>, which causes <code>GetSampledRequests</code>
     * to return a sample of the requests that didn't match any of the rules in
     * the specified <code>WebACL</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param ruleId <p>
     *            <code>RuleId</code> is one of three values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The <code>RuleId</code> of the <code>Rule</code> or the
     *            <code>RuleGroupId</code> of the <code>RuleGroup</code> for
     *            which you want <code>GetSampledRequests</code> to return a
     *            sample of requests.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Default_Action</code>, which causes
     *            <code>GetSampledRequests</code> to return a sample of the
     *            requests that didn't match any of the rules in the specified
     *            <code>WebACL</code>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * <code>RuleId</code> is one of three values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>RuleId</code> of the <code>Rule</code> or the
     * <code>RuleGroupId</code> of the <code>RuleGroup</code> for which you want
     * <code>GetSampledRequests</code> to return a sample of requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Default_Action</code>, which causes <code>GetSampledRequests</code>
     * to return a sample of the requests that didn't match any of the rules in
     * the specified <code>WebACL</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param ruleId <p>
     *            <code>RuleId</code> is one of three values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The <code>RuleId</code> of the <code>Rule</code> or the
     *            <code>RuleGroupId</code> of the <code>RuleGroup</code> for
     *            which you want <code>GetSampledRequests</code> to return a
     *            sample of requests.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Default_Action</code>, which causes
     *            <code>GetSampledRequests</code> to return a sample of the
     *            requests that didn't match any of the rules in the specified
     *            <code>WebACL</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSampledRequestsRequest withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * <p>
     * The start date and time and the end date and time of the range for which
     * you want <code>GetSampledRequests</code> to return a sample of requests.
     * You must specify the times in Coordinated Universal Time (UTC) format.
     * UTC format includes the special designator, <code>Z</code>. For example,
     * <code>"2016-09-27T14:50Z"</code>. You can specify any time range in the
     * previous three hours.
     * </p>
     *
     * @return <p>
     *         The start date and time and the end date and time of the range
     *         for which you want <code>GetSampledRequests</code> to return a
     *         sample of requests. You must specify the times in Coordinated
     *         Universal Time (UTC) format. UTC format includes the special
     *         designator, <code>Z</code>. For example,
     *         <code>"2016-09-27T14:50Z"</code>. You can specify any time range
     *         in the previous three hours.
     *         </p>
     */
    public TimeWindow getTimeWindow() {
        return timeWindow;
    }

    /**
     * <p>
     * The start date and time and the end date and time of the range for which
     * you want <code>GetSampledRequests</code> to return a sample of requests.
     * You must specify the times in Coordinated Universal Time (UTC) format.
     * UTC format includes the special designator, <code>Z</code>. For example,
     * <code>"2016-09-27T14:50Z"</code>. You can specify any time range in the
     * previous three hours.
     * </p>
     *
     * @param timeWindow <p>
     *            The start date and time and the end date and time of the range
     *            for which you want <code>GetSampledRequests</code> to return a
     *            sample of requests. You must specify the times in Coordinated
     *            Universal Time (UTC) format. UTC format includes the special
     *            designator, <code>Z</code>. For example,
     *            <code>"2016-09-27T14:50Z"</code>. You can specify any time
     *            range in the previous three hours.
     *            </p>
     */
    public void setTimeWindow(TimeWindow timeWindow) {
        this.timeWindow = timeWindow;
    }

    /**
     * <p>
     * The start date and time and the end date and time of the range for which
     * you want <code>GetSampledRequests</code> to return a sample of requests.
     * You must specify the times in Coordinated Universal Time (UTC) format.
     * UTC format includes the special designator, <code>Z</code>. For example,
     * <code>"2016-09-27T14:50Z"</code>. You can specify any time range in the
     * previous three hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeWindow <p>
     *            The start date and time and the end date and time of the range
     *            for which you want <code>GetSampledRequests</code> to return a
     *            sample of requests. You must specify the times in Coordinated
     *            Universal Time (UTC) format. UTC format includes the special
     *            designator, <code>Z</code>. For example,
     *            <code>"2016-09-27T14:50Z"</code>. You can specify any time
     *            range in the previous three hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSampledRequestsRequest withTimeWindow(TimeWindow timeWindow) {
        this.timeWindow = timeWindow;
        return this;
    }

    /**
     * <p>
     * The number of requests that you want AWS WAF to return from among the
     * first 5,000 requests that your AWS resource received during the time
     * range. If your resource received fewer requests than the value of
     * <code>MaxItems</code>, <code>GetSampledRequests</code> returns
     * information about all of them.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     *
     * @return <p>
     *         The number of requests that you want AWS WAF to return from among
     *         the first 5,000 requests that your AWS resource received during
     *         the time range. If your resource received fewer requests than the
     *         value of <code>MaxItems</code>, <code>GetSampledRequests</code>
     *         returns information about all of them.
     *         </p>
     */
    public Long getMaxItems() {
        return maxItems;
    }

    /**
     * <p>
     * The number of requests that you want AWS WAF to return from among the
     * first 5,000 requests that your AWS resource received during the time
     * range. If your resource received fewer requests than the value of
     * <code>MaxItems</code>, <code>GetSampledRequests</code> returns
     * information about all of them.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     *
     * @param maxItems <p>
     *            The number of requests that you want AWS WAF to return from
     *            among the first 5,000 requests that your AWS resource received
     *            during the time range. If your resource received fewer
     *            requests than the value of <code>MaxItems</code>,
     *            <code>GetSampledRequests</code> returns information about all
     *            of them.
     *            </p>
     */
    public void setMaxItems(Long maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The number of requests that you want AWS WAF to return from among the
     * first 5,000 requests that your AWS resource received during the time
     * range. If your resource received fewer requests than the value of
     * <code>MaxItems</code>, <code>GetSampledRequests</code> returns
     * information about all of them.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     *
     * @param maxItems <p>
     *            The number of requests that you want AWS WAF to return from
     *            among the first 5,000 requests that your AWS resource received
     *            during the time range. If your resource received fewer
     *            requests than the value of <code>MaxItems</code>,
     *            <code>GetSampledRequests</code> returns information about all
     *            of them.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSampledRequestsRequest withMaxItems(Long maxItems) {
        this.maxItems = maxItems;
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
        if (getWebAclId() != null)
            sb.append("WebAclId: " + getWebAclId() + ",");
        if (getRuleId() != null)
            sb.append("RuleId: " + getRuleId() + ",");
        if (getTimeWindow() != null)
            sb.append("TimeWindow: " + getTimeWindow() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebAclId() == null) ? 0 : getWebAclId().hashCode());
        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        hashCode = prime * hashCode + ((getTimeWindow() == null) ? 0 : getTimeWindow().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSampledRequestsRequest == false)
            return false;
        GetSampledRequestsRequest other = (GetSampledRequestsRequest) obj;

        if (other.getWebAclId() == null ^ this.getWebAclId() == null)
            return false;
        if (other.getWebAclId() != null && other.getWebAclId().equals(this.getWebAclId()) == false)
            return false;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        if (other.getTimeWindow() == null ^ this.getTimeWindow() == null)
            return false;
        if (other.getTimeWindow() != null
                && other.getTimeWindow().equals(this.getTimeWindow()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }
}
