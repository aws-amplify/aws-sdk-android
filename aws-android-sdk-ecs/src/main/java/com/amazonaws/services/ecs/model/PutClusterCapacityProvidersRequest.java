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
 * Modifies the available capacity providers and the default capacity provider
 * strategy for a cluster.
 * </p>
 * <p>
 * You must specify both the available capacity providers and a default capacity
 * provider strategy for the cluster. If the specified cluster has existing
 * capacity providers associated with it, you must specify all existing capacity
 * providers in addition to any new ones you want to add. Any existing capacity
 * providers associated with a cluster that are omitted from a
 * <a>PutClusterCapacityProviders</a> API call will be disassociated with the
 * cluster. You can only disassociate an existing capacity provider from a
 * cluster if it's not being used by any existing tasks.
 * </p>
 * <p>
 * When creating a service or running a task on a cluster, if no capacity
 * provider or launch type is specified, then the cluster's default capacity
 * provider strategy is used. It is recommended to define a default capacity
 * provider strategy for your cluster, however you may specify an empty array (
 * <code>[]</code>) to bypass defining a default strategy.
 * </p>
 */
public class PutClusterCapacityProvidersRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster to
     * modify the capacity provider settings for. If you do not specify a
     * cluster, the default cluster is assumed.
     * </p>
     */
    private String cluster;

    /**
     * <p>
     * The name of one or more capacity providers to associate with the cluster.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the
     * capacity provider must already be created. New capacity providers can be
     * created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the
     * <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity providers. The
     * AWS Fargate capacity providers are available to all accounts and only
     * need to be associated with a cluster to be used.
     * </p>
     */
    private java.util.List<String> capacityProviders;

    /**
     * <p>
     * The capacity provider strategy to use by default for the cluster.
     * </p>
     * <p>
     * When creating a service or running a task on a cluster, if no capacity
     * provider or launch type is specified then the default capacity provider
     * strategy for the cluster is used.
     * </p>
     * <p>
     * A capacity provider strategy consists of one or more capacity providers
     * along with the <code>base</code> and <code>weight</code> to assign to
     * them. A capacity provider must be associated with the cluster to be used
     * in a capacity provider strategy. The <a>PutClusterCapacityProviders</a>
     * API is used to associate a capacity provider with a cluster. Only
     * capacity providers with an <code>ACTIVE</code> or <code>UPDATING</code>
     * status can be used.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the
     * capacity provider must already be created. New capacity providers can be
     * created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the
     * <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity providers. The
     * AWS Fargate capacity providers are available to all accounts and only
     * need to be associated with a cluster to be used.
     * </p>
     */
    private java.util.List<CapacityProviderStrategyItem> defaultCapacityProviderStrategy;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster to
     * modify the capacity provider settings for. If you do not specify a
     * cluster, the default cluster is assumed.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the cluster
     *         to modify the capacity provider settings for. If you do not
     *         specify a cluster, the default cluster is assumed.
     *         </p>
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster to
     * modify the capacity provider settings for. If you do not specify a
     * cluster, the default cluster is assumed.
     * </p>
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster to modify the capacity provider settings for. If you
     *            do not specify a cluster, the default cluster is assumed.
     *            </p>
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster to
     * modify the capacity provider settings for. If you do not specify a
     * cluster, the default cluster is assumed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster to modify the capacity provider settings for. If you
     *            do not specify a cluster, the default cluster is assumed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutClusterCapacityProvidersRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * <p>
     * The name of one or more capacity providers to associate with the cluster.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the
     * capacity provider must already be created. New capacity providers can be
     * created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the
     * <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity providers. The
     * AWS Fargate capacity providers are available to all accounts and only
     * need to be associated with a cluster to be used.
     * </p>
     *
     * @return <p>
     *         The name of one or more capacity providers to associate with the
     *         cluster.
     *         </p>
     *         <p>
     *         If specifying a capacity provider that uses an Auto Scaling
     *         group, the capacity provider must already be created. New
     *         capacity providers can be created with the
     *         <a>CreateCapacityProvider</a> API operation.
     *         </p>
     *         <p>
     *         To use a AWS Fargate capacity provider, specify either the
     *         <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity
     *         providers. The AWS Fargate capacity providers are available to
     *         all accounts and only need to be associated with a cluster to be
     *         used.
     *         </p>
     */
    public java.util.List<String> getCapacityProviders() {
        return capacityProviders;
    }

    /**
     * <p>
     * The name of one or more capacity providers to associate with the cluster.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the
     * capacity provider must already be created. New capacity providers can be
     * created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the
     * <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity providers. The
     * AWS Fargate capacity providers are available to all accounts and only
     * need to be associated with a cluster to be used.
     * </p>
     *
     * @param capacityProviders <p>
     *            The name of one or more capacity providers to associate with
     *            the cluster.
     *            </p>
     *            <p>
     *            If specifying a capacity provider that uses an Auto Scaling
     *            group, the capacity provider must already be created. New
     *            capacity providers can be created with the
     *            <a>CreateCapacityProvider</a> API operation.
     *            </p>
     *            <p>
     *            To use a AWS Fargate capacity provider, specify either the
     *            <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity
     *            providers. The AWS Fargate capacity providers are available to
     *            all accounts and only need to be associated with a cluster to
     *            be used.
     *            </p>
     */
    public void setCapacityProviders(java.util.Collection<String> capacityProviders) {
        if (capacityProviders == null) {
            this.capacityProviders = null;
            return;
        }

        this.capacityProviders = new java.util.ArrayList<String>(capacityProviders);
    }

    /**
     * <p>
     * The name of one or more capacity providers to associate with the cluster.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the
     * capacity provider must already be created. New capacity providers can be
     * created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the
     * <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity providers. The
     * AWS Fargate capacity providers are available to all accounts and only
     * need to be associated with a cluster to be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityProviders <p>
     *            The name of one or more capacity providers to associate with
     *            the cluster.
     *            </p>
     *            <p>
     *            If specifying a capacity provider that uses an Auto Scaling
     *            group, the capacity provider must already be created. New
     *            capacity providers can be created with the
     *            <a>CreateCapacityProvider</a> API operation.
     *            </p>
     *            <p>
     *            To use a AWS Fargate capacity provider, specify either the
     *            <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity
     *            providers. The AWS Fargate capacity providers are available to
     *            all accounts and only need to be associated with a cluster to
     *            be used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutClusterCapacityProvidersRequest withCapacityProviders(String... capacityProviders) {
        if (getCapacityProviders() == null) {
            this.capacityProviders = new java.util.ArrayList<String>(capacityProviders.length);
        }
        for (String value : capacityProviders) {
            this.capacityProviders.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The name of one or more capacity providers to associate with the cluster.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the
     * capacity provider must already be created. New capacity providers can be
     * created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the
     * <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity providers. The
     * AWS Fargate capacity providers are available to all accounts and only
     * need to be associated with a cluster to be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityProviders <p>
     *            The name of one or more capacity providers to associate with
     *            the cluster.
     *            </p>
     *            <p>
     *            If specifying a capacity provider that uses an Auto Scaling
     *            group, the capacity provider must already be created. New
     *            capacity providers can be created with the
     *            <a>CreateCapacityProvider</a> API operation.
     *            </p>
     *            <p>
     *            To use a AWS Fargate capacity provider, specify either the
     *            <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity
     *            providers. The AWS Fargate capacity providers are available to
     *            all accounts and only need to be associated with a cluster to
     *            be used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutClusterCapacityProvidersRequest withCapacityProviders(
            java.util.Collection<String> capacityProviders) {
        setCapacityProviders(capacityProviders);
        return this;
    }

    /**
     * <p>
     * The capacity provider strategy to use by default for the cluster.
     * </p>
     * <p>
     * When creating a service or running a task on a cluster, if no capacity
     * provider or launch type is specified then the default capacity provider
     * strategy for the cluster is used.
     * </p>
     * <p>
     * A capacity provider strategy consists of one or more capacity providers
     * along with the <code>base</code> and <code>weight</code> to assign to
     * them. A capacity provider must be associated with the cluster to be used
     * in a capacity provider strategy. The <a>PutClusterCapacityProviders</a>
     * API is used to associate a capacity provider with a cluster. Only
     * capacity providers with an <code>ACTIVE</code> or <code>UPDATING</code>
     * status can be used.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the
     * capacity provider must already be created. New capacity providers can be
     * created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the
     * <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity providers. The
     * AWS Fargate capacity providers are available to all accounts and only
     * need to be associated with a cluster to be used.
     * </p>
     *
     * @return <p>
     *         The capacity provider strategy to use by default for the cluster.
     *         </p>
     *         <p>
     *         When creating a service or running a task on a cluster, if no
     *         capacity provider or launch type is specified then the default
     *         capacity provider strategy for the cluster is used.
     *         </p>
     *         <p>
     *         A capacity provider strategy consists of one or more capacity
     *         providers along with the <code>base</code> and
     *         <code>weight</code> to assign to them. A capacity provider must
     *         be associated with the cluster to be used in a capacity provider
     *         strategy. The <a>PutClusterCapacityProviders</a> API is used to
     *         associate a capacity provider with a cluster. Only capacity
     *         providers with an <code>ACTIVE</code> or <code>UPDATING</code>
     *         status can be used.
     *         </p>
     *         <p>
     *         If specifying a capacity provider that uses an Auto Scaling
     *         group, the capacity provider must already be created. New
     *         capacity providers can be created with the
     *         <a>CreateCapacityProvider</a> API operation.
     *         </p>
     *         <p>
     *         To use a AWS Fargate capacity provider, specify either the
     *         <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity
     *         providers. The AWS Fargate capacity providers are available to
     *         all accounts and only need to be associated with a cluster to be
     *         used.
     *         </p>
     */
    public java.util.List<CapacityProviderStrategyItem> getDefaultCapacityProviderStrategy() {
        return defaultCapacityProviderStrategy;
    }

    /**
     * <p>
     * The capacity provider strategy to use by default for the cluster.
     * </p>
     * <p>
     * When creating a service or running a task on a cluster, if no capacity
     * provider or launch type is specified then the default capacity provider
     * strategy for the cluster is used.
     * </p>
     * <p>
     * A capacity provider strategy consists of one or more capacity providers
     * along with the <code>base</code> and <code>weight</code> to assign to
     * them. A capacity provider must be associated with the cluster to be used
     * in a capacity provider strategy. The <a>PutClusterCapacityProviders</a>
     * API is used to associate a capacity provider with a cluster. Only
     * capacity providers with an <code>ACTIVE</code> or <code>UPDATING</code>
     * status can be used.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the
     * capacity provider must already be created. New capacity providers can be
     * created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the
     * <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity providers. The
     * AWS Fargate capacity providers are available to all accounts and only
     * need to be associated with a cluster to be used.
     * </p>
     *
     * @param defaultCapacityProviderStrategy <p>
     *            The capacity provider strategy to use by default for the
     *            cluster.
     *            </p>
     *            <p>
     *            When creating a service or running a task on a cluster, if no
     *            capacity provider or launch type is specified then the default
     *            capacity provider strategy for the cluster is used.
     *            </p>
     *            <p>
     *            A capacity provider strategy consists of one or more capacity
     *            providers along with the <code>base</code> and
     *            <code>weight</code> to assign to them. A capacity provider
     *            must be associated with the cluster to be used in a capacity
     *            provider strategy. The <a>PutClusterCapacityProviders</a> API
     *            is used to associate a capacity provider with a cluster. Only
     *            capacity providers with an <code>ACTIVE</code> or
     *            <code>UPDATING</code> status can be used.
     *            </p>
     *            <p>
     *            If specifying a capacity provider that uses an Auto Scaling
     *            group, the capacity provider must already be created. New
     *            capacity providers can be created with the
     *            <a>CreateCapacityProvider</a> API operation.
     *            </p>
     *            <p>
     *            To use a AWS Fargate capacity provider, specify either the
     *            <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity
     *            providers. The AWS Fargate capacity providers are available to
     *            all accounts and only need to be associated with a cluster to
     *            be used.
     *            </p>
     */
    public void setDefaultCapacityProviderStrategy(
            java.util.Collection<CapacityProviderStrategyItem> defaultCapacityProviderStrategy) {
        if (defaultCapacityProviderStrategy == null) {
            this.defaultCapacityProviderStrategy = null;
            return;
        }

        this.defaultCapacityProviderStrategy = new java.util.ArrayList<CapacityProviderStrategyItem>(
                defaultCapacityProviderStrategy);
    }

    /**
     * <p>
     * The capacity provider strategy to use by default for the cluster.
     * </p>
     * <p>
     * When creating a service or running a task on a cluster, if no capacity
     * provider or launch type is specified then the default capacity provider
     * strategy for the cluster is used.
     * </p>
     * <p>
     * A capacity provider strategy consists of one or more capacity providers
     * along with the <code>base</code> and <code>weight</code> to assign to
     * them. A capacity provider must be associated with the cluster to be used
     * in a capacity provider strategy. The <a>PutClusterCapacityProviders</a>
     * API is used to associate a capacity provider with a cluster. Only
     * capacity providers with an <code>ACTIVE</code> or <code>UPDATING</code>
     * status can be used.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the
     * capacity provider must already be created. New capacity providers can be
     * created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the
     * <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity providers. The
     * AWS Fargate capacity providers are available to all accounts and only
     * need to be associated with a cluster to be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultCapacityProviderStrategy <p>
     *            The capacity provider strategy to use by default for the
     *            cluster.
     *            </p>
     *            <p>
     *            When creating a service or running a task on a cluster, if no
     *            capacity provider or launch type is specified then the default
     *            capacity provider strategy for the cluster is used.
     *            </p>
     *            <p>
     *            A capacity provider strategy consists of one or more capacity
     *            providers along with the <code>base</code> and
     *            <code>weight</code> to assign to them. A capacity provider
     *            must be associated with the cluster to be used in a capacity
     *            provider strategy. The <a>PutClusterCapacityProviders</a> API
     *            is used to associate a capacity provider with a cluster. Only
     *            capacity providers with an <code>ACTIVE</code> or
     *            <code>UPDATING</code> status can be used.
     *            </p>
     *            <p>
     *            If specifying a capacity provider that uses an Auto Scaling
     *            group, the capacity provider must already be created. New
     *            capacity providers can be created with the
     *            <a>CreateCapacityProvider</a> API operation.
     *            </p>
     *            <p>
     *            To use a AWS Fargate capacity provider, specify either the
     *            <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity
     *            providers. The AWS Fargate capacity providers are available to
     *            all accounts and only need to be associated with a cluster to
     *            be used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutClusterCapacityProvidersRequest withDefaultCapacityProviderStrategy(
            CapacityProviderStrategyItem... defaultCapacityProviderStrategy) {
        if (getDefaultCapacityProviderStrategy() == null) {
            this.defaultCapacityProviderStrategy = new java.util.ArrayList<CapacityProviderStrategyItem>(
                    defaultCapacityProviderStrategy.length);
        }
        for (CapacityProviderStrategyItem value : defaultCapacityProviderStrategy) {
            this.defaultCapacityProviderStrategy.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The capacity provider strategy to use by default for the cluster.
     * </p>
     * <p>
     * When creating a service or running a task on a cluster, if no capacity
     * provider or launch type is specified then the default capacity provider
     * strategy for the cluster is used.
     * </p>
     * <p>
     * A capacity provider strategy consists of one or more capacity providers
     * along with the <code>base</code> and <code>weight</code> to assign to
     * them. A capacity provider must be associated with the cluster to be used
     * in a capacity provider strategy. The <a>PutClusterCapacityProviders</a>
     * API is used to associate a capacity provider with a cluster. Only
     * capacity providers with an <code>ACTIVE</code> or <code>UPDATING</code>
     * status can be used.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the
     * capacity provider must already be created. New capacity providers can be
     * created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the
     * <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity providers. The
     * AWS Fargate capacity providers are available to all accounts and only
     * need to be associated with a cluster to be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultCapacityProviderStrategy <p>
     *            The capacity provider strategy to use by default for the
     *            cluster.
     *            </p>
     *            <p>
     *            When creating a service or running a task on a cluster, if no
     *            capacity provider or launch type is specified then the default
     *            capacity provider strategy for the cluster is used.
     *            </p>
     *            <p>
     *            A capacity provider strategy consists of one or more capacity
     *            providers along with the <code>base</code> and
     *            <code>weight</code> to assign to them. A capacity provider
     *            must be associated with the cluster to be used in a capacity
     *            provider strategy. The <a>PutClusterCapacityProviders</a> API
     *            is used to associate a capacity provider with a cluster. Only
     *            capacity providers with an <code>ACTIVE</code> or
     *            <code>UPDATING</code> status can be used.
     *            </p>
     *            <p>
     *            If specifying a capacity provider that uses an Auto Scaling
     *            group, the capacity provider must already be created. New
     *            capacity providers can be created with the
     *            <a>CreateCapacityProvider</a> API operation.
     *            </p>
     *            <p>
     *            To use a AWS Fargate capacity provider, specify either the
     *            <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity
     *            providers. The AWS Fargate capacity providers are available to
     *            all accounts and only need to be associated with a cluster to
     *            be used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutClusterCapacityProvidersRequest withDefaultCapacityProviderStrategy(
            java.util.Collection<CapacityProviderStrategyItem> defaultCapacityProviderStrategy) {
        setDefaultCapacityProviderStrategy(defaultCapacityProviderStrategy);
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
        if (getCapacityProviders() != null)
            sb.append("capacityProviders: " + getCapacityProviders() + ",");
        if (getDefaultCapacityProviderStrategy() != null)
            sb.append("defaultCapacityProviderStrategy: " + getDefaultCapacityProviderStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode
                + ((getCapacityProviders() == null) ? 0 : getCapacityProviders().hashCode());
        hashCode = prime
                * hashCode
                + ((getDefaultCapacityProviderStrategy() == null) ? 0
                        : getDefaultCapacityProviderStrategy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutClusterCapacityProvidersRequest == false)
            return false;
        PutClusterCapacityProvidersRequest other = (PutClusterCapacityProvidersRequest) obj;

        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getCapacityProviders() == null ^ this.getCapacityProviders() == null)
            return false;
        if (other.getCapacityProviders() != null
                && other.getCapacityProviders().equals(this.getCapacityProviders()) == false)
            return false;
        if (other.getDefaultCapacityProviderStrategy() == null
                ^ this.getDefaultCapacityProviderStrategy() == null)
            return false;
        if (other.getDefaultCapacityProviderStrategy() != null
                && other.getDefaultCapacityProviderStrategy().equals(
                        this.getDefaultCapacityProviderStrategy()) == false)
            return false;
        return true;
    }
}
