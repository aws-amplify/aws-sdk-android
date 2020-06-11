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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes the specified services running in your cluster.
 * </p>
 */
public class DescribeServicesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN)the cluster that hosts
     * the service to describe. If you do not specify a cluster, the default
     * cluster is assumed. This parameter is required if the service or services
     * you are describing were launched in any cluster other than the default
     * cluster.
     * </p>
     */
    private String cluster;

    /**
     * <p>
     * A list of services to describe. You may specify up to 10 services to
     * describe in a single operation.
     * </p>
     */
    private java.util.List<String> services;

    /**
     * <p>
     * Specifies whether you want to see the resource tags for the service. If
     * <code>TAGS</code> is specified, the tags are included in the response. If
     * this field is omitted, tags are not included in the response.
     * </p>
     */
    private java.util.List<String> include;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN)the cluster that hosts
     * the service to describe. If you do not specify a cluster, the default
     * cluster is assumed. This parameter is required if the service or services
     * you are describing were launched in any cluster other than the default
     * cluster.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN)the cluster that
     *         hosts the service to describe. If you do not specify a cluster,
     *         the default cluster is assumed. This parameter is required if the
     *         service or services you are describing were launched in any
     *         cluster other than the default cluster.
     *         </p>
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN)the cluster that hosts
     * the service to describe. If you do not specify a cluster, the default
     * cluster is assumed. This parameter is required if the service or services
     * you are describing were launched in any cluster other than the default
     * cluster.
     * </p>
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN)the cluster
     *            that hosts the service to describe. If you do not specify a
     *            cluster, the default cluster is assumed. This parameter is
     *            required if the service or services you are describing were
     *            launched in any cluster other than the default cluster.
     *            </p>
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN)the cluster that hosts
     * the service to describe. If you do not specify a cluster, the default
     * cluster is assumed. This parameter is required if the service or services
     * you are describing were launched in any cluster other than the default
     * cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN)the cluster
     *            that hosts the service to describe. If you do not specify a
     *            cluster, the default cluster is assumed. This parameter is
     *            required if the service or services you are describing were
     *            launched in any cluster other than the default cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeServicesRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * <p>
     * A list of services to describe. You may specify up to 10 services to
     * describe in a single operation.
     * </p>
     *
     * @return <p>
     *         A list of services to describe. You may specify up to 10 services
     *         to describe in a single operation.
     *         </p>
     */
    public java.util.List<String> getServices() {
        return services;
    }

    /**
     * <p>
     * A list of services to describe. You may specify up to 10 services to
     * describe in a single operation.
     * </p>
     *
     * @param services <p>
     *            A list of services to describe. You may specify up to 10
     *            services to describe in a single operation.
     *            </p>
     */
    public void setServices(java.util.Collection<String> services) {
        if (services == null) {
            this.services = null;
            return;
        }

        this.services = new java.util.ArrayList<String>(services);
    }

    /**
     * <p>
     * A list of services to describe. You may specify up to 10 services to
     * describe in a single operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param services <p>
     *            A list of services to describe. You may specify up to 10
     *            services to describe in a single operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeServicesRequest withServices(String... services) {
        if (getServices() == null) {
            this.services = new java.util.ArrayList<String>(services.length);
        }
        for (String value : services) {
            this.services.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of services to describe. You may specify up to 10 services to
     * describe in a single operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param services <p>
     *            A list of services to describe. You may specify up to 10
     *            services to describe in a single operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeServicesRequest withServices(java.util.Collection<String> services) {
        setServices(services);
        return this;
    }

    /**
     * <p>
     * Specifies whether you want to see the resource tags for the service. If
     * <code>TAGS</code> is specified, the tags are included in the response. If
     * this field is omitted, tags are not included in the response.
     * </p>
     *
     * @return <p>
     *         Specifies whether you want to see the resource tags for the
     *         service. If <code>TAGS</code> is specified, the tags are included
     *         in the response. If this field is omitted, tags are not included
     *         in the response.
     *         </p>
     */
    public java.util.List<String> getInclude() {
        return include;
    }

    /**
     * <p>
     * Specifies whether you want to see the resource tags for the service. If
     * <code>TAGS</code> is specified, the tags are included in the response. If
     * this field is omitted, tags are not included in the response.
     * </p>
     *
     * @param include <p>
     *            Specifies whether you want to see the resource tags for the
     *            service. If <code>TAGS</code> is specified, the tags are
     *            included in the response. If this field is omitted, tags are
     *            not included in the response.
     *            </p>
     */
    public void setInclude(java.util.Collection<String> include) {
        if (include == null) {
            this.include = null;
            return;
        }

        this.include = new java.util.ArrayList<String>(include);
    }

    /**
     * <p>
     * Specifies whether you want to see the resource tags for the service. If
     * <code>TAGS</code> is specified, the tags are included in the response. If
     * this field is omitted, tags are not included in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param include <p>
     *            Specifies whether you want to see the resource tags for the
     *            service. If <code>TAGS</code> is specified, the tags are
     *            included in the response. If this field is omitted, tags are
     *            not included in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeServicesRequest withInclude(String... include) {
        if (getInclude() == null) {
            this.include = new java.util.ArrayList<String>(include.length);
        }
        for (String value : include) {
            this.include.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies whether you want to see the resource tags for the service. If
     * <code>TAGS</code> is specified, the tags are included in the response. If
     * this field is omitted, tags are not included in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param include <p>
     *            Specifies whether you want to see the resource tags for the
     *            service. If <code>TAGS</code> is specified, the tags are
     *            included in the response. If this field is omitted, tags are
     *            not included in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeServicesRequest withInclude(java.util.Collection<String> include) {
        setInclude(include);
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
        if (getCluster() != null)
            sb.append("cluster: " + getCluster() + ",");
        if (getServices() != null)
            sb.append("services: " + getServices() + ",");
        if (getInclude() != null)
            sb.append("include: " + getInclude());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getServices() == null) ? 0 : getServices().hashCode());
        hashCode = prime * hashCode + ((getInclude() == null) ? 0 : getInclude().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeServicesRequest == false)
            return false;
        DescribeServicesRequest other = (DescribeServicesRequest) obj;

        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getServices() == null ^ this.getServices() == null)
            return false;
        if (other.getServices() != null && other.getServices().equals(this.getServices()) == false)
            return false;
        if (other.getInclude() == null ^ this.getInclude() == null)
            return false;
        if (other.getInclude() != null && other.getInclude().equals(this.getInclude()) == false)
            return false;
        return true;
    }
}
