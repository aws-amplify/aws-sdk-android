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

package com.amazonaws.services.shield.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns all ongoing DDoS attacks or all DDoS attacks during a specified time
 * period.
 * </p>
 */
public class ListAttacksRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource that was attacked. If this
     * is left blank, all applicable resources for this account will be
     * included.
     * </p>
     */
    private java.util.List<String> resourceArns;

    /**
     * <p>
     * The start of the time period for the attacks. This is a
     * <code>timestamp</code> type. The sample request above indicates a
     * <code>number</code> type because the default used by WAF is Unix time in
     * seconds. However any valid <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp format</a> is allowed.
     * </p>
     */
    private TimeRange startTime;

    /**
     * <p>
     * The end of the time period for the attacks. This is a
     * <code>timestamp</code> type. The sample request above indicates a
     * <code>number</code> type because the default used by WAF is Unix time in
     * seconds. However any valid <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp format</a> is allowed.
     * </p>
     */
    private TimeRange endTime;

    /**
     * <p>
     * The <code>ListAttacksRequest.NextMarker</code> value from a previous call
     * to <code>ListAttacksRequest</code>. Pass null if this is the first call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^.*$<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of <a>AttackSummary</a> objects to be returned. If
     * this is left blank, the first 20 results will be returned.
     * </p>
     * <p>
     * This is a maximum value; it is possible that AWS WAF will return the
     * results in smaller batches. That is, the number of <a>AttackSummary</a>
     * objects returned could be less than <code>MaxResults</code>, even if
     * there are still more <a>AttackSummary</a> objects yet to return. If there
     * are more <a>AttackSummary</a> objects to return, AWS WAF will always also
     * return a <code>NextToken</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10000<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource that was attacked. If this
     * is left blank, all applicable resources for this account will be
     * included.
     * </p>
     *
     * @return <p>
     *         The ARN (Amazon Resource Name) of the resource that was attacked.
     *         If this is left blank, all applicable resources for this account
     *         will be included.
     *         </p>
     */
    public java.util.List<String> getResourceArns() {
        return resourceArns;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource that was attacked. If this
     * is left blank, all applicable resources for this account will be
     * included.
     * </p>
     *
     * @param resourceArns <p>
     *            The ARN (Amazon Resource Name) of the resource that was
     *            attacked. If this is left blank, all applicable resources for
     *            this account will be included.
     *            </p>
     */
    public void setResourceArns(java.util.Collection<String> resourceArns) {
        if (resourceArns == null) {
            this.resourceArns = null;
            return;
        }

        this.resourceArns = new java.util.ArrayList<String>(resourceArns);
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource that was attacked. If this
     * is left blank, all applicable resources for this account will be
     * included.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceArns <p>
     *            The ARN (Amazon Resource Name) of the resource that was
     *            attacked. If this is left blank, all applicable resources for
     *            this account will be included.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAttacksRequest withResourceArns(String... resourceArns) {
        if (getResourceArns() == null) {
            this.resourceArns = new java.util.ArrayList<String>(resourceArns.length);
        }
        for (String value : resourceArns) {
            this.resourceArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource that was attacked. If this
     * is left blank, all applicable resources for this account will be
     * included.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceArns <p>
     *            The ARN (Amazon Resource Name) of the resource that was
     *            attacked. If this is left blank, all applicable resources for
     *            this account will be included.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAttacksRequest withResourceArns(java.util.Collection<String> resourceArns) {
        setResourceArns(resourceArns);
        return this;
    }

    /**
     * <p>
     * The start of the time period for the attacks. This is a
     * <code>timestamp</code> type. The sample request above indicates a
     * <code>number</code> type because the default used by WAF is Unix time in
     * seconds. However any valid <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp format</a> is allowed.
     * </p>
     *
     * @return <p>
     *         The start of the time period for the attacks. This is a
     *         <code>timestamp</code> type. The sample request above indicates a
     *         <code>number</code> type because the default used by WAF is Unix
     *         time in seconds. However any valid <a href=
     *         "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *         >timestamp format</a> is allowed.
     *         </p>
     */
    public TimeRange getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The start of the time period for the attacks. This is a
     * <code>timestamp</code> type. The sample request above indicates a
     * <code>number</code> type because the default used by WAF is Unix time in
     * seconds. However any valid <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp format</a> is allowed.
     * </p>
     *
     * @param startTime <p>
     *            The start of the time period for the attacks. This is a
     *            <code>timestamp</code> type. The sample request above
     *            indicates a <code>number</code> type because the default used
     *            by WAF is Unix time in seconds. However any valid <a href=
     *            "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *            >timestamp format</a> is allowed.
     *            </p>
     */
    public void setStartTime(TimeRange startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start of the time period for the attacks. This is a
     * <code>timestamp</code> type. The sample request above indicates a
     * <code>number</code> type because the default used by WAF is Unix time in
     * seconds. However any valid <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp format</a> is allowed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The start of the time period for the attacks. This is a
     *            <code>timestamp</code> type. The sample request above
     *            indicates a <code>number</code> type because the default used
     *            by WAF is Unix time in seconds. However any valid <a href=
     *            "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *            >timestamp format</a> is allowed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAttacksRequest withStartTime(TimeRange startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The end of the time period for the attacks. This is a
     * <code>timestamp</code> type. The sample request above indicates a
     * <code>number</code> type because the default used by WAF is Unix time in
     * seconds. However any valid <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp format</a> is allowed.
     * </p>
     *
     * @return <p>
     *         The end of the time period for the attacks. This is a
     *         <code>timestamp</code> type. The sample request above indicates a
     *         <code>number</code> type because the default used by WAF is Unix
     *         time in seconds. However any valid <a href=
     *         "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *         >timestamp format</a> is allowed.
     *         </p>
     */
    public TimeRange getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The end of the time period for the attacks. This is a
     * <code>timestamp</code> type. The sample request above indicates a
     * <code>number</code> type because the default used by WAF is Unix time in
     * seconds. However any valid <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp format</a> is allowed.
     * </p>
     *
     * @param endTime <p>
     *            The end of the time period for the attacks. This is a
     *            <code>timestamp</code> type. The sample request above
     *            indicates a <code>number</code> type because the default used
     *            by WAF is Unix time in seconds. However any valid <a href=
     *            "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *            >timestamp format</a> is allowed.
     *            </p>
     */
    public void setEndTime(TimeRange endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end of the time period for the attacks. This is a
     * <code>timestamp</code> type. The sample request above indicates a
     * <code>number</code> type because the default used by WAF is Unix time in
     * seconds. However any valid <a href=
     * "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     * >timestamp format</a> is allowed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The end of the time period for the attacks. This is a
     *            <code>timestamp</code> type. The sample request above
     *            indicates a <code>number</code> type because the default used
     *            by WAF is Unix time in seconds. However any valid <a href=
     *            "http://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#parameter-types"
     *            >timestamp format</a> is allowed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAttacksRequest withEndTime(TimeRange endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * The <code>ListAttacksRequest.NextMarker</code> value from a previous call
     * to <code>ListAttacksRequest</code>. Pass null if this is the first call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^.*$<br/>
     *
     * @return <p>
     *         The <code>ListAttacksRequest.NextMarker</code> value from a
     *         previous call to <code>ListAttacksRequest</code>. Pass null if
     *         this is the first call.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The <code>ListAttacksRequest.NextMarker</code> value from a previous call
     * to <code>ListAttacksRequest</code>. Pass null if this is the first call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^.*$<br/>
     *
     * @param nextToken <p>
     *            The <code>ListAttacksRequest.NextMarker</code> value from a
     *            previous call to <code>ListAttacksRequest</code>. Pass null if
     *            this is the first call.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>ListAttacksRequest.NextMarker</code> value from a previous call
     * to <code>ListAttacksRequest</code>. Pass null if this is the first call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^.*$<br/>
     *
     * @param nextToken <p>
     *            The <code>ListAttacksRequest.NextMarker</code> value from a
     *            previous call to <code>ListAttacksRequest</code>. Pass null if
     *            this is the first call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAttacksRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of <a>AttackSummary</a> objects to be returned. If
     * this is left blank, the first 20 results will be returned.
     * </p>
     * <p>
     * This is a maximum value; it is possible that AWS WAF will return the
     * results in smaller batches. That is, the number of <a>AttackSummary</a>
     * objects returned could be less than <code>MaxResults</code>, even if
     * there are still more <a>AttackSummary</a> objects yet to return. If there
     * are more <a>AttackSummary</a> objects to return, AWS WAF will always also
     * return a <code>NextToken</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10000<br/>
     *
     * @return <p>
     *         The maximum number of <a>AttackSummary</a> objects to be
     *         returned. If this is left blank, the first 20 results will be
     *         returned.
     *         </p>
     *         <p>
     *         This is a maximum value; it is possible that AWS WAF will return
     *         the results in smaller batches. That is, the number of
     *         <a>AttackSummary</a> objects returned could be less than
     *         <code>MaxResults</code>, even if there are still more
     *         <a>AttackSummary</a> objects yet to return. If there are more
     *         <a>AttackSummary</a> objects to return, AWS WAF will always also
     *         return a <code>NextToken</code>.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of <a>AttackSummary</a> objects to be returned. If
     * this is left blank, the first 20 results will be returned.
     * </p>
     * <p>
     * This is a maximum value; it is possible that AWS WAF will return the
     * results in smaller batches. That is, the number of <a>AttackSummary</a>
     * objects returned could be less than <code>MaxResults</code>, even if
     * there are still more <a>AttackSummary</a> objects yet to return. If there
     * are more <a>AttackSummary</a> objects to return, AWS WAF will always also
     * return a <code>NextToken</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of <a>AttackSummary</a> objects to be
     *            returned. If this is left blank, the first 20 results will be
     *            returned.
     *            </p>
     *            <p>
     *            This is a maximum value; it is possible that AWS WAF will
     *            return the results in smaller batches. That is, the number of
     *            <a>AttackSummary</a> objects returned could be less than
     *            <code>MaxResults</code>, even if there are still more
     *            <a>AttackSummary</a> objects yet to return. If there are more
     *            <a>AttackSummary</a> objects to return, AWS WAF will always
     *            also return a <code>NextToken</code>.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of <a>AttackSummary</a> objects to be returned. If
     * this is left blank, the first 20 results will be returned.
     * </p>
     * <p>
     * This is a maximum value; it is possible that AWS WAF will return the
     * results in smaller batches. That is, the number of <a>AttackSummary</a>
     * objects returned could be less than <code>MaxResults</code>, even if
     * there are still more <a>AttackSummary</a> objects yet to return. If there
     * are more <a>AttackSummary</a> objects to return, AWS WAF will always also
     * return a <code>NextToken</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of <a>AttackSummary</a> objects to be
     *            returned. If this is left blank, the first 20 results will be
     *            returned.
     *            </p>
     *            <p>
     *            This is a maximum value; it is possible that AWS WAF will
     *            return the results in smaller batches. That is, the number of
     *            <a>AttackSummary</a> objects returned could be less than
     *            <code>MaxResults</code>, even if there are still more
     *            <a>AttackSummary</a> objects yet to return. If there are more
     *            <a>AttackSummary</a> objects to return, AWS WAF will always
     *            also return a <code>NextToken</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAttacksRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getResourceArns() != null)
            sb.append("ResourceArns: " + getResourceArns() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceArns() == null) ? 0 : getResourceArns().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAttacksRequest == false)
            return false;
        ListAttacksRequest other = (ListAttacksRequest) obj;

        if (other.getResourceArns() == null ^ this.getResourceArns() == null)
            return false;
        if (other.getResourceArns() != null
                && other.getResourceArns().equals(this.getResourceArns()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
