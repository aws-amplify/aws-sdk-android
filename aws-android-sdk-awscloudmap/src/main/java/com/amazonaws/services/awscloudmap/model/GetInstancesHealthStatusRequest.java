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
 * Gets the current health status (<code>Healthy</code>, <code>Unhealthy</code>,
 * or <code>Unknown</code>) of one or more instances that are associated with a
 * specified service.
 * </p>
 * <note>
 * <p>
 * There is a brief delay between when you register an instance and when the
 * health status for the instance is available.
 * </p>
 * </note>
 */
public class GetInstancesHealthStatusRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the service that the instance is associated with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String serviceId;

    /**
     * <p>
     * An array that contains the IDs of all the instances that you want to get
     * the health status for.
     * </p>
     * <p>
     * If you omit <code>Instances</code>, AWS Cloud Map returns the health
     * status for all the instances that are associated with the specified
     * service.
     * </p>
     * <note>
     * <p>
     * To get the IDs for the instances that you've registered by using a
     * specified service, submit a <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_ListInstances.html"
     * >ListInstances</a> request.
     * </p>
     * </note>
     */
    private java.util.List<String> instances;

    /**
     * <p>
     * The maximum number of instances that you want AWS Cloud Map to return in
     * the response to a <code>GetInstancesHealthStatus</code> request. If you
     * don't specify a value for <code>MaxResults</code>, AWS Cloud Map returns
     * up to 100 instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * For the first <code>GetInstancesHealthStatus</code> request, omit this
     * value.
     * </p>
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
     * The ID of the service that the instance is associated with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         The ID of the service that the instance is associated with.
     *         </p>
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * <p>
     * The ID of the service that the instance is associated with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param serviceId <p>
     *            The ID of the service that the instance is associated with.
     *            </p>
     */
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The ID of the service that the instance is associated with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param serviceId <p>
     *            The ID of the service that the instance is associated with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInstancesHealthStatusRequest withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * <p>
     * An array that contains the IDs of all the instances that you want to get
     * the health status for.
     * </p>
     * <p>
     * If you omit <code>Instances</code>, AWS Cloud Map returns the health
     * status for all the instances that are associated with the specified
     * service.
     * </p>
     * <note>
     * <p>
     * To get the IDs for the instances that you've registered by using a
     * specified service, submit a <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_ListInstances.html"
     * >ListInstances</a> request.
     * </p>
     * </note>
     *
     * @return <p>
     *         An array that contains the IDs of all the instances that you want
     *         to get the health status for.
     *         </p>
     *         <p>
     *         If you omit <code>Instances</code>, AWS Cloud Map returns the
     *         health status for all the instances that are associated with the
     *         specified service.
     *         </p>
     *         <note>
     *         <p>
     *         To get the IDs for the instances that you've registered by using
     *         a specified service, submit a <a href=
     *         "https://docs.aws.amazon.com/cloud-map/latest/api/API_ListInstances.html"
     *         >ListInstances</a> request.
     *         </p>
     *         </note>
     */
    public java.util.List<String> getInstances() {
        return instances;
    }

    /**
     * <p>
     * An array that contains the IDs of all the instances that you want to get
     * the health status for.
     * </p>
     * <p>
     * If you omit <code>Instances</code>, AWS Cloud Map returns the health
     * status for all the instances that are associated with the specified
     * service.
     * </p>
     * <note>
     * <p>
     * To get the IDs for the instances that you've registered by using a
     * specified service, submit a <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_ListInstances.html"
     * >ListInstances</a> request.
     * </p>
     * </note>
     *
     * @param instances <p>
     *            An array that contains the IDs of all the instances that you
     *            want to get the health status for.
     *            </p>
     *            <p>
     *            If you omit <code>Instances</code>, AWS Cloud Map returns the
     *            health status for all the instances that are associated with
     *            the specified service.
     *            </p>
     *            <note>
     *            <p>
     *            To get the IDs for the instances that you've registered by
     *            using a specified service, submit a <a href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_ListInstances.html"
     *            >ListInstances</a> request.
     *            </p>
     *            </note>
     */
    public void setInstances(java.util.Collection<String> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new java.util.ArrayList<String>(instances);
    }

    /**
     * <p>
     * An array that contains the IDs of all the instances that you want to get
     * the health status for.
     * </p>
     * <p>
     * If you omit <code>Instances</code>, AWS Cloud Map returns the health
     * status for all the instances that are associated with the specified
     * service.
     * </p>
     * <note>
     * <p>
     * To get the IDs for the instances that you've registered by using a
     * specified service, submit a <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_ListInstances.html"
     * >ListInstances</a> request.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instances <p>
     *            An array that contains the IDs of all the instances that you
     *            want to get the health status for.
     *            </p>
     *            <p>
     *            If you omit <code>Instances</code>, AWS Cloud Map returns the
     *            health status for all the instances that are associated with
     *            the specified service.
     *            </p>
     *            <note>
     *            <p>
     *            To get the IDs for the instances that you've registered by
     *            using a specified service, submit a <a href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_ListInstances.html"
     *            >ListInstances</a> request.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInstancesHealthStatusRequest withInstances(String... instances) {
        if (getInstances() == null) {
            this.instances = new java.util.ArrayList<String>(instances.length);
        }
        for (String value : instances) {
            this.instances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array that contains the IDs of all the instances that you want to get
     * the health status for.
     * </p>
     * <p>
     * If you omit <code>Instances</code>, AWS Cloud Map returns the health
     * status for all the instances that are associated with the specified
     * service.
     * </p>
     * <note>
     * <p>
     * To get the IDs for the instances that you've registered by using a
     * specified service, submit a <a href=
     * "https://docs.aws.amazon.com/cloud-map/latest/api/API_ListInstances.html"
     * >ListInstances</a> request.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instances <p>
     *            An array that contains the IDs of all the instances that you
     *            want to get the health status for.
     *            </p>
     *            <p>
     *            If you omit <code>Instances</code>, AWS Cloud Map returns the
     *            health status for all the instances that are associated with
     *            the specified service.
     *            </p>
     *            <note>
     *            <p>
     *            To get the IDs for the instances that you've registered by
     *            using a specified service, submit a <a href=
     *            "https://docs.aws.amazon.com/cloud-map/latest/api/API_ListInstances.html"
     *            >ListInstances</a> request.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInstancesHealthStatusRequest withInstances(java.util.Collection<String> instances) {
        setInstances(instances);
        return this;
    }

    /**
     * <p>
     * The maximum number of instances that you want AWS Cloud Map to return in
     * the response to a <code>GetInstancesHealthStatus</code> request. If you
     * don't specify a value for <code>MaxResults</code>, AWS Cloud Map returns
     * up to 100 instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of instances that you want AWS Cloud Map to
     *         return in the response to a <code>GetInstancesHealthStatus</code>
     *         request. If you don't specify a value for <code>MaxResults</code>
     *         , AWS Cloud Map returns up to 100 instances.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of instances that you want AWS Cloud Map to return in
     * the response to a <code>GetInstancesHealthStatus</code> request. If you
     * don't specify a value for <code>MaxResults</code>, AWS Cloud Map returns
     * up to 100 instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of instances that you want AWS Cloud Map to
     *            return in the response to a
     *            <code>GetInstancesHealthStatus</code> request. If you don't
     *            specify a value for <code>MaxResults</code>, AWS Cloud Map
     *            returns up to 100 instances.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of instances that you want AWS Cloud Map to return in
     * the response to a <code>GetInstancesHealthStatus</code> request. If you
     * don't specify a value for <code>MaxResults</code>, AWS Cloud Map returns
     * up to 100 instances.
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
     *            return in the response to a
     *            <code>GetInstancesHealthStatus</code> request. If you don't
     *            specify a value for <code>MaxResults</code>, AWS Cloud Map
     *            returns up to 100 instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInstancesHealthStatusRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * For the first <code>GetInstancesHealthStatus</code> request, omit this
     * value.
     * </p>
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
     *         For the first <code>GetInstancesHealthStatus</code> request, omit
     *         this value.
     *         </p>
     *         <p>
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
     * For the first <code>GetInstancesHealthStatus</code> request, omit this
     * value.
     * </p>
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
     *            For the first <code>GetInstancesHealthStatus</code> request,
     *            omit this value.
     *            </p>
     *            <p>
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
     * For the first <code>GetInstancesHealthStatus</code> request, omit this
     * value.
     * </p>
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
     *            For the first <code>GetInstancesHealthStatus</code> request,
     *            omit this value.
     *            </p>
     *            <p>
     *            If more than <code>MaxResults</code> instances match the
     *            specified criteria, you can submit another
     *            <code>GetInstancesHealthStatus</code> request to get the next
     *            group of results. Specify the value of <code>NextToken</code>
     *            from the previous response in the next request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInstancesHealthStatusRequest withNextToken(String nextToken) {
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
        if (getServiceId() != null)
            sb.append("ServiceId: " + getServiceId() + ",");
        if (getInstances() != null)
            sb.append("Instances: " + getInstances() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInstancesHealthStatusRequest == false)
            return false;
        GetInstancesHealthStatusRequest other = (GetInstancesHealthStatusRequest) obj;

        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null
                && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null
                && other.getInstances().equals(this.getInstances()) == false)
            return false;
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
        return true;
    }
}
