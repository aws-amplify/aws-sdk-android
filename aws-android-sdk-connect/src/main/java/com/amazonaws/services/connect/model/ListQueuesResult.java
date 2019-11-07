/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class ListQueuesResult implements Serializable {
    /**
     * <p>
     * Information about the queues.
     * </p>
     */
    private java.util.List<QueueSummary> queueSummaryList;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the queues.
     * </p>
     *
     * @return <p>
     *         Information about the queues.
     *         </p>
     */
    public java.util.List<QueueSummary> getQueueSummaryList() {
        return queueSummaryList;
    }

    /**
     * <p>
     * Information about the queues.
     * </p>
     *
     * @param queueSummaryList <p>
     *            Information about the queues.
     *            </p>
     */
    public void setQueueSummaryList(java.util.Collection<QueueSummary> queueSummaryList) {
        if (queueSummaryList == null) {
            this.queueSummaryList = null;
            return;
        }

        this.queueSummaryList = new java.util.ArrayList<QueueSummary>(queueSummaryList);
    }

    /**
     * <p>
     * Information about the queues.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueSummaryList <p>
     *            Information about the queues.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListQueuesResult withQueueSummaryList(QueueSummary... queueSummaryList) {
        if (getQueueSummaryList() == null) {
            this.queueSummaryList = new java.util.ArrayList<QueueSummary>(queueSummaryList.length);
        }
        for (QueueSummary value : queueSummaryList) {
            this.queueSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the queues.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueSummaryList <p>
     *            Information about the queues.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListQueuesResult withQueueSummaryList(java.util.Collection<QueueSummary> queueSummaryList) {
        setQueueSummaryList(queueSummaryList);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     *
     * @return <p>
     *         If there are additional results, this is the token for the next
     *         set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListQueuesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getQueueSummaryList() != null)
            sb.append("QueueSummaryList: " + getQueueSummaryList() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getQueueSummaryList() == null) ? 0 : getQueueSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListQueuesResult == false)
            return false;
        ListQueuesResult other = (ListQueuesResult) obj;

        if (other.getQueueSummaryList() == null ^ this.getQueueSummaryList() == null)
            return false;
        if (other.getQueueSummaryList() != null
                && other.getQueueSummaryList().equals(this.getQueueSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
