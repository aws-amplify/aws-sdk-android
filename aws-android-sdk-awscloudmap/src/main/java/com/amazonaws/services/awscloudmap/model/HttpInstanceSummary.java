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

/**
 * <p>
 * In a response to a <a href=
 * "https://docs.aws.amazon.com/cloud-map/latest/api/API_DiscoverInstances.html"
 * >DiscoverInstances</a> request, <code>HttpInstanceSummary</code> contains
 * information about one instance that matches the values that you specified in
 * the request.
 * </p>
 */
public class HttpInstanceSummary implements Serializable {
    /**
     * <p>
     * The ID of an instance that matches the values that you specified in the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String instanceId;

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
     * If you configured health checking in the service, the current health
     * status of the service instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEALTHY, UNHEALTHY, UNKNOWN
     */
    private String healthStatus;

    /**
     * <p>
     * If you included any attributes when you registered the instance, the
     * values of those attributes.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * The ID of an instance that matches the values that you specified in the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         The ID of an instance that matches the values that you specified
     *         in the request.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of an instance that matches the values that you specified in the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param instanceId <p>
     *            The ID of an instance that matches the values that you
     *            specified in the request.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of an instance that matches the values that you specified in the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param instanceId <p>
     *            The ID of an instance that matches the values that you
     *            specified in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HttpInstanceSummary withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
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
    public HttpInstanceSummary withNamespaceName(String namespaceName) {
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
    public HttpInstanceSummary withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * <p>
     * If you configured health checking in the service, the current health
     * status of the service instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEALTHY, UNHEALTHY, UNKNOWN
     *
     * @return <p>
     *         If you configured health checking in the service, the current
     *         health status of the service instance.
     *         </p>
     * @see HealthStatus
     */
    public String getHealthStatus() {
        return healthStatus;
    }

    /**
     * <p>
     * If you configured health checking in the service, the current health
     * status of the service instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEALTHY, UNHEALTHY, UNKNOWN
     *
     * @param healthStatus <p>
     *            If you configured health checking in the service, the current
     *            health status of the service instance.
     *            </p>
     * @see HealthStatus
     */
    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * <p>
     * If you configured health checking in the service, the current health
     * status of the service instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEALTHY, UNHEALTHY, UNKNOWN
     *
     * @param healthStatus <p>
     *            If you configured health checking in the service, the current
     *            health status of the service instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HealthStatus
     */
    public HttpInstanceSummary withHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }

    /**
     * <p>
     * If you configured health checking in the service, the current health
     * status of the service instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEALTHY, UNHEALTHY, UNKNOWN
     *
     * @param healthStatus <p>
     *            If you configured health checking in the service, the current
     *            health status of the service instance.
     *            </p>
     * @see HealthStatus
     */
    public void setHealthStatus(HealthStatus healthStatus) {
        this.healthStatus = healthStatus.toString();
    }

    /**
     * <p>
     * If you configured health checking in the service, the current health
     * status of the service instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEALTHY, UNHEALTHY, UNKNOWN
     *
     * @param healthStatus <p>
     *            If you configured health checking in the service, the current
     *            health status of the service instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HealthStatus
     */
    public HttpInstanceSummary withHealthStatus(HealthStatus healthStatus) {
        this.healthStatus = healthStatus.toString();
        return this;
    }

    /**
     * <p>
     * If you included any attributes when you registered the instance, the
     * values of those attributes.
     * </p>
     *
     * @return <p>
     *         If you included any attributes when you registered the instance,
     *         the values of those attributes.
     *         </p>
     */
    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * If you included any attributes when you registered the instance, the
     * values of those attributes.
     * </p>
     *
     * @param attributes <p>
     *            If you included any attributes when you registered the
     *            instance, the values of those attributes.
     *            </p>
     */
    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * If you included any attributes when you registered the instance, the
     * values of those attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            If you included any attributes when you registered the
     *            instance, the values of those attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HttpInstanceSummary withAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * <p>
     * If you included any attributes when you registered the instance, the
     * values of those attributes.
     * </p>
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into
     *            Attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HttpInstanceSummary addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public HttpInstanceSummary clearAttributesEntries() {
        this.attributes = null;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getNamespaceName() != null)
            sb.append("NamespaceName: " + getNamespaceName() + ",");
        if (getServiceName() != null)
            sb.append("ServiceName: " + getServiceName() + ",");
        if (getHealthStatus() != null)
            sb.append("HealthStatus: " + getHealthStatus() + ",");
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getNamespaceName() == null) ? 0 : getNamespaceName().hashCode());
        hashCode = prime * hashCode
                + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode
                + ((getHealthStatus() == null) ? 0 : getHealthStatus().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpInstanceSummary == false)
            return false;
        HttpInstanceSummary other = (HttpInstanceSummary) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
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
        if (other.getHealthStatus() == null ^ this.getHealthStatus() == null)
            return false;
        if (other.getHealthStatus() != null
                && other.getHealthStatus().equals(this.getHealthStatus()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }
}
