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

package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;

public class GetInstancesHealthStatusResult implements Serializable {
    /**
     * <p>
     * A complex type that contains the IDs and the health status of the
     * instances that you specified in the <code>GetInstancesHealthStatus</code>
     * request.
     * </p>
     */
    private java.util.Map<String, String> status;

    /**
     * <p>
     * If more than <code>MaxResults</code> instances match the specified
     * criteria, you can submit another <code>GetInstancesHealthStatus</code>
     * request to get the next group of results. Specify the value of
     * <code>NextToken</code> from the previous response in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A complex type that contains the IDs and the health status of the
     * instances that you specified in the <code>GetInstancesHealthStatus</code>
     * request.
     * </p>
     *
     * @return <p>
     *         A complex type that contains the IDs and the health status of the
     *         instances that you specified in the
     *         <code>GetInstancesHealthStatus</code> request.
     *         </p>
     */
    public java.util.Map<String, String> getStatus() {
        return status;
    }

    /**
     * <p>
     * A complex type that contains the IDs and the health status of the
     * instances that you specified in the <code>GetInstancesHealthStatus</code>
     * request.
     * </p>
     *
     * @param status <p>
     *            A complex type that contains the IDs and the health status of
     *            the instances that you specified in the
     *            <code>GetInstancesHealthStatus</code> request.
     *            </p>
     */
    public void setStatus(java.util.Map<String, String> status) {
        this.status = status;
    }

    /**
     * <p>
     * A complex type that contains the IDs and the health status of the
     * instances that you specified in the <code>GetInstancesHealthStatus</code>
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            A complex type that contains the IDs and the health status of
     *            the instances that you specified in the
     *            <code>GetInstancesHealthStatus</code> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInstancesHealthStatusResult withStatus(java.util.Map<String, String> status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * A complex type that contains the IDs and the health status of the
     * instances that you specified in the <code>GetInstancesHealthStatus</code>
     * request.
     * </p>
     * <p>
     * The method adds a new key-value pair into Status parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Status.
     * @param value The corresponding value of the entry to be added into
     *            Status.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInstancesHealthStatusResult addStatusEntry(String key, String value) {
        if (null == this.status) {
            this.status = new java.util.HashMap<String, String>();
        }
        if (this.status.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.status.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Status.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public GetInstancesHealthStatusResult clearStatusEntries() {
        this.status = null;
        return this;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> instances match the specified
     * criteria, you can submit another <code>GetInstancesHealthStatus</code>
     * request to get the next group of results. Specify the value of
     * <code>NextToken</code> from the previous response in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @return <p>
     *         If more than <code>MaxResults</code> instances match the
     *         specified criteria, you can submit another
     *         <code>GetInstancesHealthStatus</code> request to get the next
     *         group of results. Specify the value of <code>NextToken</code>
     *         from the previous response in the next request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> instances match the specified
     * criteria, you can submit another <code>GetInstancesHealthStatus</code>
     * request to get the next group of results. Specify the value of
     * <code>NextToken</code> from the previous response in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param nextToken <p>
     *            If more than <code>MaxResults</code> instances match the
     *            specified criteria, you can submit another
     *            <code>GetInstancesHealthStatus</code> request to get the next
     *            group of results. Specify the value of <code>NextToken</code>
     *            from the previous response in the next request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If more than <code>MaxResults</code> instances match the specified
     * criteria, you can submit another <code>GetInstancesHealthStatus</code>
     * request to get the next group of results. Specify the value of
     * <code>NextToken</code> from the previous response in the next request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param nextToken <p>
     *            If more than <code>MaxResults</code> instances match the
     *            specified criteria, you can submit another
     *            <code>GetInstancesHealthStatus</code> request to get the next
     *            group of results. Specify the value of <code>NextToken</code>
     *            from the previous response in the next request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInstancesHealthStatusResult withNextToken(String nextToken) {
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInstancesHealthStatusResult == false)
            return false;
        GetInstancesHealthStatusResult other = (GetInstancesHealthStatusResult) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
