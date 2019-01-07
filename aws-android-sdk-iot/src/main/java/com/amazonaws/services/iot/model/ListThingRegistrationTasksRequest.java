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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * List bulk thing provisioning tasks.
 * </p>
 */
public class ListThingRegistrationTasksRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The status of the bulk thing provisioning task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Cancelled,
     * Cancelling
     */
    private String status;

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     *
     * @return <p>
     *         The token to retrieve the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token to retrieve the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to retrieve the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListThingRegistrationTasksRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @return <p>
     *         The maximum number of results to return at one time.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return at one time.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return at one time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListThingRegistrationTasksRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The status of the bulk thing provisioning task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Cancelled,
     * Cancelling
     *
     * @return <p>
     *         The status of the bulk thing provisioning task.
     *         </p>
     * @see Status
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the bulk thing provisioning task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Cancelled,
     * Cancelling
     *
     * @param status <p>
     *            The status of the bulk thing provisioning task.
     *            </p>
     * @see Status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the bulk thing provisioning task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Cancelled,
     * Cancelling
     *
     * @param status <p>
     *            The status of the bulk thing provisioning task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Status
     */
    public ListThingRegistrationTasksRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the bulk thing provisioning task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Cancelled,
     * Cancelling
     *
     * @param status <p>
     *            The status of the bulk thing provisioning task.
     *            </p>
     * @see Status
     */
    public void setStatus(Status status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the bulk thing provisioning task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Completed, Failed, Cancelled,
     * Cancelling
     *
     * @param status <p>
     *            The status of the bulk thing provisioning task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Status
     */
    public ListThingRegistrationTasksRequest withStatus(Status status) {
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
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListThingRegistrationTasksRequest == false)
            return false;
        ListThingRegistrationTasksRequest other = (ListThingRegistrationTasksRequest) obj;

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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
