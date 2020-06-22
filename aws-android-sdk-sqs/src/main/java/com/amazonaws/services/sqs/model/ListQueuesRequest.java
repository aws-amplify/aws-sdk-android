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

package com.amazonaws.services.sqs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of your queues. The maximum number of queues that can be
 * returned is 1,000. If you specify a value for the optional
 * <code>QueueNamePrefix</code> parameter, only queues with a name that begins
 * with the specified value are returned.
 * </p>
 * <note>
 * <p>
 * Cross-account permissions don't apply to this action. For more information,
 * see <a href=
 * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name"
 * >Grant Cross-Account Permissions to a Role and a User Name</a> in the
 * <i>Amazon Simple Queue Service Developer Guide</i>.
 * </p>
 * </note>
 */
public class ListQueuesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A string to use for filtering the list results. Only those queues whose
     * name begins with the specified string are returned.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     */
    private String queueNamePrefix;

    /**
     * <p>
     * Pagination token to request the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Maximum number of results to include in the response.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * A string to use for filtering the list results. Only those queues whose
     * name begins with the specified string are returned.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     *
     * @return <p>
     *         A string to use for filtering the list results. Only those queues
     *         whose name begins with the specified string are returned.
     *         </p>
     *         <p>
     *         Queue URLs and names are case-sensitive.
     *         </p>
     */
    public String getQueueNamePrefix() {
        return queueNamePrefix;
    }

    /**
     * <p>
     * A string to use for filtering the list results. Only those queues whose
     * name begins with the specified string are returned.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     *
     * @param queueNamePrefix <p>
     *            A string to use for filtering the list results. Only those
     *            queues whose name begins with the specified string are
     *            returned.
     *            </p>
     *            <p>
     *            Queue URLs and names are case-sensitive.
     *            </p>
     */
    public void setQueueNamePrefix(String queueNamePrefix) {
        this.queueNamePrefix = queueNamePrefix;
    }

    /**
     * <p>
     * A string to use for filtering the list results. Only those queues whose
     * name begins with the specified string are returned.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueNamePrefix <p>
     *            A string to use for filtering the list results. Only those
     *            queues whose name begins with the specified string are
     *            returned.
     *            </p>
     *            <p>
     *            Queue URLs and names are case-sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListQueuesRequest withQueueNamePrefix(String queueNamePrefix) {
        this.queueNamePrefix = queueNamePrefix;
        return this;
    }

    /**
     * <p>
     * Pagination token to request the next set of results.
     * </p>
     *
     * @return <p>
     *         Pagination token to request the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Pagination token to request the next set of results.
     * </p>
     *
     * @param nextToken <p>
     *            Pagination token to request the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token to request the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            Pagination token to request the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListQueuesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Maximum number of results to include in the response.
     * </p>
     *
     * @return <p>
     *         Maximum number of results to include in the response.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * Maximum number of results to include in the response.
     * </p>
     *
     * @param maxResults <p>
     *            Maximum number of results to include in the response.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of results to include in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            Maximum number of results to include in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListQueuesRequest withMaxResults(Integer maxResults) {
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
        if (getQueueNamePrefix() != null)
            sb.append("QueueNamePrefix: " + getQueueNamePrefix() + ",");
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
                + ((getQueueNamePrefix() == null) ? 0 : getQueueNamePrefix().hashCode());
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

        if (obj instanceof ListQueuesRequest == false)
            return false;
        ListQueuesRequest other = (ListQueuesRequest) obj;

        if (other.getQueueNamePrefix() == null ^ this.getQueueNamePrefix() == null)
            return false;
        if (other.getQueueNamePrefix() != null
                && other.getQueueNamePrefix().equals(this.getQueueNamePrefix()) == false)
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
