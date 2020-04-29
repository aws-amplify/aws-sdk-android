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

package com.amazonaws.services.awscloudmap.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists summary information about the instances that you registered by using a
 * specified service.
 * </p>
 */
public class ListInstancesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the service that you want to list instances for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String serviceId;

    /**
     * <p>
     * For the first <code>ListInstances</code> request, omit this value.
     * </p>
     * <p>
     * If more than <code>MaxResults</code> instances match the specified
     * criteria, you can submit another <code>ListInstances</code> request to
     * get the next group of results. Specify the value of
     * <code>NextToken</code> from the previous response in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of instances that you want AWS Cloud Map to return in
     * the response to a <code>ListInstances</code> request. If you don't
     * specify a value for <code>MaxResults</code>, AWS Cloud Map returns up to
     * 100 instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ID of the service that you want to list instances for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         The ID of the service that you want to list instances for.
     *         </p>
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * <p>
     * The ID of the service that you want to list instances for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param serviceId <p>
     *            The ID of the service that you want to list instances for.
     *            </p>
     */
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The ID of the service that you want to list instances for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param serviceId <p>
     *            The ID of the service that you want to list instances for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInstancesRequest withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * <p>
     * For the first <code>ListInstances</code> request, omit this value.
     * </p>
     * <p>
     * If more than <code>MaxResults</code> instances match the specified
     * criteria, you can submit another <code>ListInstances</code> request to
     * get the next group of results. Specify the value of
     * <code>NextToken</code> from the previous response in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @return <p>
     *         For the first <code>ListInstances</code> request, omit this
     *         value.
     *         </p>
     *         <p>
     *         If more than <code>MaxResults</code> instances match the
     *         specified criteria, you can submit another
     *         <code>ListInstances</code> request to get the next group of
     *         results. Specify the value of <code>NextToken</code> from the
     *         previous response in the next request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * For the first <code>ListInstances</code> request, omit this value.
     * </p>
     * <p>
     * If more than <code>MaxResults</code> instances match the specified
     * criteria, you can submit another <code>ListInstances</code> request to
     * get the next group of results. Specify the value of
     * <code>NextToken</code> from the previous response in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param nextToken <p>
     *            For the first <code>ListInstances</code> request, omit this
     *            value.
     *            </p>
     *            <p>
     *            If more than <code>MaxResults</code> instances match the
     *            specified criteria, you can submit another
     *            <code>ListInstances</code> request to get the next group of
     *            results. Specify the value of <code>NextToken</code> from the
     *            previous response in the next request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * For the first <code>ListInstances</code> request, omit this value.
     * </p>
     * <p>
     * If more than <code>MaxResults</code> instances match the specified
     * criteria, you can submit another <code>ListInstances</code> request to
     * get the next group of results. Specify the value of
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
     *            For the first <code>ListInstances</code> request, omit this
     *            value.
     *            </p>
     *            <p>
     *            If more than <code>MaxResults</code> instances match the
     *            specified criteria, you can submit another
     *            <code>ListInstances</code> request to get the next group of
     *            results. Specify the value of <code>NextToken</code> from the
     *            previous response in the next request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInstancesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of instances that you want AWS Cloud Map to return in
     * the response to a <code>ListInstances</code> request. If you don't
     * specify a value for <code>MaxResults</code>, AWS Cloud Map returns up to
     * 100 instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of instances that you want AWS Cloud Map to
     *         return in the response to a <code>ListInstances</code> request.
     *         If you don't specify a value for <code>MaxResults</code>, AWS
     *         Cloud Map returns up to 100 instances.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of instances that you want AWS Cloud Map to return in
     * the response to a <code>ListInstances</code> request. If you don't
     * specify a value for <code>MaxResults</code>, AWS Cloud Map returns up to
     * 100 instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of instances that you want AWS Cloud Map to
     *            return in the response to a <code>ListInstances</code>
     *            request. If you don't specify a value for
     *            <code>MaxResults</code>, AWS Cloud Map returns up to 100
     *            instances.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of instances that you want AWS Cloud Map to return in
     * the response to a <code>ListInstances</code> request. If you don't
     * specify a value for <code>MaxResults</code>, AWS Cloud Map returns up to
     * 100 instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of instances that you want AWS Cloud Map to
     *            return in the response to a <code>ListInstances</code>
     *            request. If you don't specify a value for
     *            <code>MaxResults</code>, AWS Cloud Map returns up to 100
     *            instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInstancesRequest withMaxResults(Integer maxResults) {
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
        if (getServiceId() != null)
            sb.append("ServiceId: " + getServiceId() + ",");
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

        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
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

        if (obj instanceof ListInstancesRequest == false)
            return false;
        ListInstancesRequest other = (ListInstancesRequest) obj;

        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null
                && other.getServiceId().equals(this.getServiceId()) == false)
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
