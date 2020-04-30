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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Retrieve a JSON array of up to twenty of your most recently created jobs.
 * This array includes in-process, completed, and errored jobs. This will return
 * the jobs themselves, not just a list of the jobs. To retrieve the twenty next
 * most recent jobs, use the nextToken string returned with the array.
 */
public class ListJobsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * Optional. Number of jobs, up to twenty, that will be returned at one
     * time.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     */
    private Integer maxResults;

    /**
     * Optional. Use this string, provided with the response to a previous
     * request, to request the next batch of jobs.
     */
    private String nextToken;

    /**
     * Optional. When you request lists of resources, you can specify whether
     * they are sorted in ASCENDING or DESCENDING order. Default varies by
     * resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     */
    private String order;

    /**
     * Optional. Provide a queue name to get back only jobs from that queue.
     */
    private String queue;

    /**
     * Optional. A job's status can be SUBMITTED, PROGRESSING, COMPLETE,
     * CANCELED, or ERROR.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, PROGRESSING, COMPLETE, CANCELED, ERROR
     */
    private String status;

    /**
     * Optional. Number of jobs, up to twenty, that will be returned at one
     * time.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @return Optional. Number of jobs, up to twenty, that will be returned at
     *         one time.
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * Optional. Number of jobs, up to twenty, that will be returned at one
     * time.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @param maxResults Optional. Number of jobs, up to twenty, that will be
     *            returned at one time.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * Optional. Number of jobs, up to twenty, that will be returned at one
     * time.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 20<br/>
     *
     * @param maxResults Optional. Number of jobs, up to twenty, that will be
     *            returned at one time.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListJobsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Optional. Use this string, provided with the response to a previous
     * request, to request the next batch of jobs.
     *
     * @return Optional. Use this string, provided with the response to a
     *         previous request, to request the next batch of jobs.
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * Optional. Use this string, provided with the response to a previous
     * request, to request the next batch of jobs.
     *
     * @param nextToken Optional. Use this string, provided with the response to
     *            a previous request, to request the next batch of jobs.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Optional. Use this string, provided with the response to a previous
     * request, to request the next batch of jobs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken Optional. Use this string, provided with the response to
     *            a previous request, to request the next batch of jobs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListJobsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Optional. When you request lists of resources, you can specify whether
     * they are sorted in ASCENDING or DESCENDING order. Default varies by
     * resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @return Optional. When you request lists of resources, you can specify
     *         whether they are sorted in ASCENDING or DESCENDING order. Default
     *         varies by resource.
     * @see Order
     */
    public String getOrder() {
        return order;
    }

    /**
     * Optional. When you request lists of resources, you can specify whether
     * they are sorted in ASCENDING or DESCENDING order. Default varies by
     * resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param order Optional. When you request lists of resources, you can
     *            specify whether they are sorted in ASCENDING or DESCENDING
     *            order. Default varies by resource.
     * @see Order
     */
    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * Optional. When you request lists of resources, you can specify whether
     * they are sorted in ASCENDING or DESCENDING order. Default varies by
     * resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param order Optional. When you request lists of resources, you can
     *            specify whether they are sorted in ASCENDING or DESCENDING
     *            order. Default varies by resource.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Order
     */
    public ListJobsRequest withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * Optional. When you request lists of resources, you can specify whether
     * they are sorted in ASCENDING or DESCENDING order. Default varies by
     * resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param order Optional. When you request lists of resources, you can
     *            specify whether they are sorted in ASCENDING or DESCENDING
     *            order. Default varies by resource.
     * @see Order
     */
    public void setOrder(Order order) {
        this.order = order.toString();
    }

    /**
     * Optional. When you request lists of resources, you can specify whether
     * they are sorted in ASCENDING or DESCENDING order. Default varies by
     * resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASCENDING, DESCENDING
     *
     * @param order Optional. When you request lists of resources, you can
     *            specify whether they are sorted in ASCENDING or DESCENDING
     *            order. Default varies by resource.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Order
     */
    public ListJobsRequest withOrder(Order order) {
        this.order = order.toString();
        return this;
    }

    /**
     * Optional. Provide a queue name to get back only jobs from that queue.
     *
     * @return Optional. Provide a queue name to get back only jobs from that
     *         queue.
     */
    public String getQueue() {
        return queue;
    }

    /**
     * Optional. Provide a queue name to get back only jobs from that queue.
     *
     * @param queue Optional. Provide a queue name to get back only jobs from
     *            that queue.
     */
    public void setQueue(String queue) {
        this.queue = queue;
    }

    /**
     * Optional. Provide a queue name to get back only jobs from that queue.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queue Optional. Provide a queue name to get back only jobs from
     *            that queue.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListJobsRequest withQueue(String queue) {
        this.queue = queue;
        return this;
    }

    /**
     * Optional. A job's status can be SUBMITTED, PROGRESSING, COMPLETE,
     * CANCELED, or ERROR.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, PROGRESSING, COMPLETE, CANCELED, ERROR
     *
     * @return Optional. A job's status can be SUBMITTED, PROGRESSING, COMPLETE,
     *         CANCELED, or ERROR.
     * @see JobStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * Optional. A job's status can be SUBMITTED, PROGRESSING, COMPLETE,
     * CANCELED, or ERROR.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, PROGRESSING, COMPLETE, CANCELED, ERROR
     *
     * @param status Optional. A job's status can be SUBMITTED, PROGRESSING,
     *            COMPLETE, CANCELED, or ERROR.
     * @see JobStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Optional. A job's status can be SUBMITTED, PROGRESSING, COMPLETE,
     * CANCELED, or ERROR.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, PROGRESSING, COMPLETE, CANCELED, ERROR
     *
     * @param status Optional. A job's status can be SUBMITTED, PROGRESSING,
     *            COMPLETE, CANCELED, or ERROR.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public ListJobsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Optional. A job's status can be SUBMITTED, PROGRESSING, COMPLETE,
     * CANCELED, or ERROR.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, PROGRESSING, COMPLETE, CANCELED, ERROR
     *
     * @param status Optional. A job's status can be SUBMITTED, PROGRESSING,
     *            COMPLETE, CANCELED, or ERROR.
     * @see JobStatus
     */
    public void setStatus(JobStatus status) {
        this.status = status.toString();
    }

    /**
     * Optional. A job's status can be SUBMITTED, PROGRESSING, COMPLETE,
     * CANCELED, or ERROR.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, PROGRESSING, COMPLETE, CANCELED, ERROR
     *
     * @param status Optional. A job's status can be SUBMITTED, PROGRESSING,
     *            COMPLETE, CANCELED, or ERROR.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobStatus
     */
    public ListJobsRequest withStatus(JobStatus status) {
        this.status = status.toString();
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
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getOrder() != null)
            sb.append("Order: " + getOrder() + ",");
        if (getQueue() != null)
            sb.append("Queue: " + getQueue() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOrder() == null) ? 0 : getOrder().hashCode());
        hashCode = prime * hashCode + ((getQueue() == null) ? 0 : getQueue().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListJobsRequest == false)
            return false;
        ListJobsRequest other = (ListJobsRequest) obj;

        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOrder() == null ^ this.getOrder() == null)
            return false;
        if (other.getOrder() != null && other.getOrder().equals(this.getOrder()) == false)
            return false;
        if (other.getQueue() == null ^ this.getQueue() == null)
            return false;
        if (other.getQueue() != null && other.getQueue().equals(this.getQueue()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
