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
 * Discovers registered instances for a specified namespace and service. You can
 * use <code>DiscoverInstances</code> to discover instances for any type of
 * namespace. For public and private DNS namespaces, you can also use DNS
 * queries to discover instances.
 * </p>
 */
public class DiscoverInstancesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the namespace that you specified when you registered the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String namespaceName;

    /**
     * <p>
     * The name of the service that you specified when you registered the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>((?=^.{1,127}$)^([a-zA-Z0-
     * 9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9])(\.([a-zA-Z0-9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9]))
     * *$)|(^\.$)<br/>
     */
    private String serviceName;

    /**
     * <p>
     * The maximum number of instances that you want AWS Cloud Map to return in
     * the response to a <code>DiscoverInstances</code> request. If you don't
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
     * A string map that contains attributes with values that you can use to
     * filter instances by any custom attribute that you specified when you
     * registered the instance. Only instances that match all the specified
     * key/value pairs will be returned.
     * </p>
     */
    private java.util.Map<String, String> queryParameters;

    /**
     * <p>
     * The health status of the instances that you want to discover.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEALTHY, UNHEALTHY, ALL
     */
    private String healthStatus;

    /**
     * <p>
     * The name of the namespace that you specified when you registered the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The name of the namespace that you specified when you registered
     *         the instance.
     *         </p>
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    /**
     * <p>
     * The name of the namespace that you specified when you registered the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param namespaceName <p>
     *            The name of the namespace that you specified when you
     *            registered the instance.
     *            </p>
     */
    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    /**
     * <p>
     * The name of the namespace that you specified when you registered the
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param namespaceName <p>
     *            The name of the namespace that you specified when you
     *            registered the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiscoverInstancesRequest withNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }

    /**
     * <p>
     * The name of the service that you specified when you registered the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>((?=^.{1,127}$)^([a-zA-Z0-
     * 9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9])(\.([a-zA-Z0-9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9]))
     * *$)|(^\.$)<br/>
     *
     * @return <p>
     *         The name of the service that you specified when you registered
     *         the instance.
     *         </p>
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * <p>
     * The name of the service that you specified when you registered the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>((?=^.{1,127}$)^([a-zA-Z0-
     * 9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9])(\.([a-zA-Z0-9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9]))
     * *$)|(^\.$)<br/>
     *
     * @param serviceName <p>
     *            The name of the service that you specified when you registered
     *            the instance.
     *            </p>
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service that you specified when you registered the
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>((?=^.{1,127}$)^([a-zA-Z0-
     * 9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9])(\.([a-zA-Z0-9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9]))
     * *$)|(^\.$)<br/>
     *
     * @param serviceName <p>
     *            The name of the service that you specified when you registered
     *            the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiscoverInstancesRequest withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * <p>
     * The maximum number of instances that you want AWS Cloud Map to return in
     * the response to a <code>DiscoverInstances</code> request. If you don't
     * specify a value for <code>MaxResults</code>, AWS Cloud Map returns up to
     * 100 instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of instances that you want AWS Cloud Map to
     *         return in the response to a <code>DiscoverInstances</code>
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
     * the response to a <code>DiscoverInstances</code> request. If you don't
     * specify a value for <code>MaxResults</code>, AWS Cloud Map returns up to
     * 100 instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of instances that you want AWS Cloud Map to
     *            return in the response to a <code>DiscoverInstances</code>
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
     * the response to a <code>DiscoverInstances</code> request. If you don't
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
     *            return in the response to a <code>DiscoverInstances</code>
     *            request. If you don't specify a value for
     *            <code>MaxResults</code>, AWS Cloud Map returns up to 100
     *            instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiscoverInstancesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * A string map that contains attributes with values that you can use to
     * filter instances by any custom attribute that you specified when you
     * registered the instance. Only instances that match all the specified
     * key/value pairs will be returned.
     * </p>
     *
     * @return <p>
     *         A string map that contains attributes with values that you can
     *         use to filter instances by any custom attribute that you
     *         specified when you registered the instance. Only instances that
     *         match all the specified key/value pairs will be returned.
     *         </p>
     */
    public java.util.Map<String, String> getQueryParameters() {
        return queryParameters;
    }

    /**
     * <p>
     * A string map that contains attributes with values that you can use to
     * filter instances by any custom attribute that you specified when you
     * registered the instance. Only instances that match all the specified
     * key/value pairs will be returned.
     * </p>
     *
     * @param queryParameters <p>
     *            A string map that contains attributes with values that you can
     *            use to filter instances by any custom attribute that you
     *            specified when you registered the instance. Only instances
     *            that match all the specified key/value pairs will be returned.
     *            </p>
     */
    public void setQueryParameters(java.util.Map<String, String> queryParameters) {
        this.queryParameters = queryParameters;
    }

    /**
     * <p>
     * A string map that contains attributes with values that you can use to
     * filter instances by any custom attribute that you specified when you
     * registered the instance. Only instances that match all the specified
     * key/value pairs will be returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryParameters <p>
     *            A string map that contains attributes with values that you can
     *            use to filter instances by any custom attribute that you
     *            specified when you registered the instance. Only instances
     *            that match all the specified key/value pairs will be returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiscoverInstancesRequest withQueryParameters(
            java.util.Map<String, String> queryParameters) {
        this.queryParameters = queryParameters;
        return this;
    }

    /**
     * <p>
     * A string map that contains attributes with values that you can use to
     * filter instances by any custom attribute that you specified when you
     * registered the instance. Only instances that match all the specified
     * key/value pairs will be returned.
     * </p>
     * <p>
     * The method adds a new key-value pair into QueryParameters parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into QueryParameters.
     * @param value The corresponding value of the entry to be added into
     *            QueryParameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DiscoverInstancesRequest addQueryParametersEntry(String key, String value) {
        if (null == this.queryParameters) {
            this.queryParameters = new java.util.HashMap<String, String>();
        }
        if (this.queryParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.queryParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into QueryParameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public DiscoverInstancesRequest clearQueryParametersEntries() {
        this.queryParameters = null;
        return this;
    }

    /**
     * <p>
     * The health status of the instances that you want to discover.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEALTHY, UNHEALTHY, ALL
     *
     * @return <p>
     *         The health status of the instances that you want to discover.
     *         </p>
     * @see HealthStatusFilter
     */
    public String getHealthStatus() {
        return healthStatus;
    }

    /**
     * <p>
     * The health status of the instances that you want to discover.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEALTHY, UNHEALTHY, ALL
     *
     * @param healthStatus <p>
     *            The health status of the instances that you want to discover.
     *            </p>
     * @see HealthStatusFilter
     */
    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * <p>
     * The health status of the instances that you want to discover.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEALTHY, UNHEALTHY, ALL
     *
     * @param healthStatus <p>
     *            The health status of the instances that you want to discover.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HealthStatusFilter
     */
    public DiscoverInstancesRequest withHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }

    /**
     * <p>
     * The health status of the instances that you want to discover.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEALTHY, UNHEALTHY, ALL
     *
     * @param healthStatus <p>
     *            The health status of the instances that you want to discover.
     *            </p>
     * @see HealthStatusFilter
     */
    public void setHealthStatus(HealthStatusFilter healthStatus) {
        this.healthStatus = healthStatus.toString();
    }

    /**
     * <p>
     * The health status of the instances that you want to discover.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEALTHY, UNHEALTHY, ALL
     *
     * @param healthStatus <p>
     *            The health status of the instances that you want to discover.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HealthStatusFilter
     */
    public DiscoverInstancesRequest withHealthStatus(HealthStatusFilter healthStatus) {
        this.healthStatus = healthStatus.toString();
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
        if (getNamespaceName() != null)
            sb.append("NamespaceName: " + getNamespaceName() + ",");
        if (getServiceName() != null)
            sb.append("ServiceName: " + getServiceName() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getQueryParameters() != null)
            sb.append("QueryParameters: " + getQueryParameters() + ",");
        if (getHealthStatus() != null)
            sb.append("HealthStatus: " + getHealthStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNamespaceName() == null) ? 0 : getNamespaceName().hashCode());
        hashCode = prime * hashCode
                + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode
                + ((getQueryParameters() == null) ? 0 : getQueryParameters().hashCode());
        hashCode = prime * hashCode
                + ((getHealthStatus() == null) ? 0 : getHealthStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiscoverInstancesRequest == false)
            return false;
        DiscoverInstancesRequest other = (DiscoverInstancesRequest) obj;

        if (other.getNamespaceName() == null ^ this.getNamespaceName() == null)
            return false;
        if (other.getNamespaceName() != null
                && other.getNamespaceName().equals(this.getNamespaceName()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null
                && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getQueryParameters() == null ^ this.getQueryParameters() == null)
            return false;
        if (other.getQueryParameters() != null
                && other.getQueryParameters().equals(this.getQueryParameters()) == false)
            return false;
        if (other.getHealthStatus() == null ^ this.getHealthStatus() == null)
            return false;
        if (other.getHealthStatus() != null
                && other.getHealthStatus().equals(this.getHealthStatus()) == false)
            return false;
        return true;
    }
}
