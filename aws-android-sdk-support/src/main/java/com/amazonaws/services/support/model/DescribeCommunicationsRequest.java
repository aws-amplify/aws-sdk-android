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

package com.amazonaws.services.support.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns communications and attachments for one or more support cases. Use the
 * <code>afterTime</code> and <code>beforeTime</code> parameters to filter by
 * date. You can use the <code>caseId</code> parameter to restrict the results
 * to a specific case.
 * </p>
 * <p>
 * Case data is available for 12 months after creation. If a case was created
 * more than 12 months ago, a request for data might cause an error.
 * </p>
 * <p>
 * You can use the <code>maxResults</code> and <code>nextToken</code> parameters
 * to control the pagination of the results. Set <code>maxResults</code> to the
 * number of cases that you want to display on each page, and use
 * <code>nextToken</code> to specify the resumption of pagination.
 * </p>
 * <note>
 * <ul>
 * <li>
 * <p>
 * You must have a Business or Enterprise support plan to use the AWS Support
 * API.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you call the AWS Support API from an account that does not have a Business
 * or Enterprise support plan, the <code>SubscriptionRequiredException</code>
 * error message appears. For information about changing your support plan, see
 * <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
 * </p>
 * </li>
 * </ul>
 * </note>
 */
public class DescribeCommunicationsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is
     * an alphanumeric string formatted as shown in this example:
     * case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     */
    private String caseId;

    /**
     * <p>
     * The end date for a filtered date search on support case communications.
     * Case communications are available for 12 months after creation.
     * </p>
     */
    private String beforeTime;

    /**
     * <p>
     * The start date for a filtered date search on support case communications.
     * Case communications are available for 12 months after creation.
     * </p>
     */
    private String afterTime;

    /**
     * <p>
     * A resumption point for pagination.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return before paginating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is
     * an alphanumeric string formatted as shown in this example:
     * case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     *
     * @return <p>
     *         The AWS Support case ID requested or returned in the call. The
     *         case ID is an alphanumeric string formatted as shown in this
     *         example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     *         </p>
     */
    public String getCaseId() {
        return caseId;
    }

    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is
     * an alphanumeric string formatted as shown in this example:
     * case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     *
     * @param caseId <p>
     *            The AWS Support case ID requested or returned in the call. The
     *            case ID is an alphanumeric string formatted as shown in this
     *            example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     *            </p>
     */
    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is
     * an alphanumeric string formatted as shown in this example:
     * case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param caseId <p>
     *            The AWS Support case ID requested or returned in the call. The
     *            case ID is an alphanumeric string formatted as shown in this
     *            example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCommunicationsRequest withCaseId(String caseId) {
        this.caseId = caseId;
        return this;
    }

    /**
     * <p>
     * The end date for a filtered date search on support case communications.
     * Case communications are available for 12 months after creation.
     * </p>
     *
     * @return <p>
     *         The end date for a filtered date search on support case
     *         communications. Case communications are available for 12 months
     *         after creation.
     *         </p>
     */
    public String getBeforeTime() {
        return beforeTime;
    }

    /**
     * <p>
     * The end date for a filtered date search on support case communications.
     * Case communications are available for 12 months after creation.
     * </p>
     *
     * @param beforeTime <p>
     *            The end date for a filtered date search on support case
     *            communications. Case communications are available for 12
     *            months after creation.
     *            </p>
     */
    public void setBeforeTime(String beforeTime) {
        this.beforeTime = beforeTime;
    }

    /**
     * <p>
     * The end date for a filtered date search on support case communications.
     * Case communications are available for 12 months after creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param beforeTime <p>
     *            The end date for a filtered date search on support case
     *            communications. Case communications are available for 12
     *            months after creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCommunicationsRequest withBeforeTime(String beforeTime) {
        this.beforeTime = beforeTime;
        return this;
    }

    /**
     * <p>
     * The start date for a filtered date search on support case communications.
     * Case communications are available for 12 months after creation.
     * </p>
     *
     * @return <p>
     *         The start date for a filtered date search on support case
     *         communications. Case communications are available for 12 months
     *         after creation.
     *         </p>
     */
    public String getAfterTime() {
        return afterTime;
    }

    /**
     * <p>
     * The start date for a filtered date search on support case communications.
     * Case communications are available for 12 months after creation.
     * </p>
     *
     * @param afterTime <p>
     *            The start date for a filtered date search on support case
     *            communications. Case communications are available for 12
     *            months after creation.
     *            </p>
     */
    public void setAfterTime(String afterTime) {
        this.afterTime = afterTime;
    }

    /**
     * <p>
     * The start date for a filtered date search on support case communications.
     * Case communications are available for 12 months after creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param afterTime <p>
     *            The start date for a filtered date search on support case
     *            communications. Case communications are available for 12
     *            months after creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCommunicationsRequest withAfterTime(String afterTime) {
        this.afterTime = afterTime;
        return this;
    }

    /**
     * <p>
     * A resumption point for pagination.
     * </p>
     *
     * @return <p>
     *         A resumption point for pagination.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A resumption point for pagination.
     * </p>
     *
     * @param nextToken <p>
     *            A resumption point for pagination.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A resumption point for pagination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A resumption point for pagination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCommunicationsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return before paginating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 100<br/>
     *
     * @return <p>
     *         The maximum number of results to return before paginating.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return before paginating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return before paginating.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return before paginating.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return before paginating.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCommunicationsRequest withMaxResults(Integer maxResults) {
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
        if (getCaseId() != null)
            sb.append("caseId: " + getCaseId() + ",");
        if (getBeforeTime() != null)
            sb.append("beforeTime: " + getBeforeTime() + ",");
        if (getAfterTime() != null)
            sb.append("afterTime: " + getAfterTime() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCaseId() == null) ? 0 : getCaseId().hashCode());
        hashCode = prime * hashCode + ((getBeforeTime() == null) ? 0 : getBeforeTime().hashCode());
        hashCode = prime * hashCode + ((getAfterTime() == null) ? 0 : getAfterTime().hashCode());
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

        if (obj instanceof DescribeCommunicationsRequest == false)
            return false;
        DescribeCommunicationsRequest other = (DescribeCommunicationsRequest) obj;

        if (other.getCaseId() == null ^ this.getCaseId() == null)
            return false;
        if (other.getCaseId() != null && other.getCaseId().equals(this.getCaseId()) == false)
            return false;
        if (other.getBeforeTime() == null ^ this.getBeforeTime() == null)
            return false;
        if (other.getBeforeTime() != null
                && other.getBeforeTime().equals(this.getBeforeTime()) == false)
            return false;
        if (other.getAfterTime() == null ^ this.getAfterTime() == null)
            return false;
        if (other.getAfterTime() != null
                && other.getAfterTime().equals(this.getAfterTime()) == false)
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
