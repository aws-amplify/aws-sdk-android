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
 * Create a task set in the specified cluster and service. This is used when a
 * service uses the <code>EXTERNAL</code> deployment controller type. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html"
 * >Amazon ECS Deployment Types</a> in the <i>Amazon Elastic Container Service
 * Developer Guide</i>.
 * </p>
 */
public class CreateTaskSetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service to
     * create the task set in.
     * </p>
     */
    private String service;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the service to create the task set in.
     * </p>
     */
    private String cluster;

    /**
     * <p>
     * An optional non-unique tag that identifies this task set in external
     * systems. If the task set is associated with a service discovery registry,
     * the tasks in this task set will have the
     * <code>ECS_TASK_SET_EXTERNAL_ID</code> AWS Cloud Map attribute set to the
     * provided value.
     * </p>
     */
    private String externalId;

    /**
     * <p>
     * The task definition for the tasks in the task set to use.
     * </p>
     */
    private String taskDefinition;

    /**
     * <p>
     * An object representing the network configuration for a task or service.
     * </p>
     */
    private NetworkConfiguration networkConfiguration;

    /**
     * <p>
     * A load balancer object representing the load balancer to use with the
     * task set. The supported load balancer types are either an Application
     * Load Balancer or a Network Load Balancer.
     * </p>
     */
    private java.util.List<LoadBalancer> loadBalancers;

    /**
     * <p>
     * The details of the service discovery registries to assign to this task
     * set. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html"
     * >Service Discovery</a>.
     * </p>
     */
    private java.util.List<ServiceRegistry> serviceRegistries;

    /**
     * <p>
     * The launch type that new tasks in the task set will use. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * If a <code>launchType</code> is specified, the
     * <code>capacityProviderStrategy</code> parameter must be omitted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     */
    private String launchType;

    /**
     * <p>
     * The capacity provider strategy to use for the task set.
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
     * If a <code>capacityProviderStrategy</code> is specified, the
     * <code>launchType</code> parameter must be omitted. If no
     * <code>capacityProviderStrategy</code> or <code>launchType</code> is
     * specified, the <code>defaultCapacityProviderStrategy</code> for the
     * cluster is used.
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
     * The <a>PutClusterCapacityProviders</a> API operation is used to update
     * the list of available capacity providers for a cluster after the cluster
     * is created.
     * </p>
     */
    private java.util.List<CapacityProviderStrategyItem> capacityProviderStrategy;

    /**
     * <p>
     * The platform version that the tasks in the task set should use. A
     * platform version is specified only for tasks using the Fargate launch
     * type. If one isn't specified, the <code>LATEST</code> platform version is
     * used by default.
     * </p>
     */
    private String platformVersion;

    /**
     * <p>
     * A floating-point percentage of the desired number of tasks to place and
     * keep running in the task set.
     * </p>
     */
    private Scale scale;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. Up to 32 ASCII characters are allowed.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The metadata that you apply to the task set to help you categorize and
     * organize them. Each tag consists of a key and an optional value, both of
     * which you define. When a service is deleted, the tags are deleted as
     * well.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have
     * only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources,
     * remember that other services may have restrictions on allowed characters.
     * Generally allowed characters are: letters, numbers, and spaces
     * representable in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or
     * lowercase combination of such as a prefix for either keys or values as it
     * is reserved for AWS use. You cannot edit or delete tag keys or values
     * with this prefix. Tags with this prefix do not count against your tags
     * per resource limit.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service to
     * create the task set in.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the service
     *         to create the task set in.
     *         </p>
     */
    public String getService() {
        return service;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service to
     * create the task set in.
     * </p>
     *
     * @param service <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            service to create the task set in.
     *            </p>
     */
    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service to
     * create the task set in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param service <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            service to create the task set in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTaskSetRequest withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the service to create the task set in.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the cluster
     *         that hosts the service to create the task set in.
     *         </p>
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the service to create the task set in.
     * </p>
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that hosts the service to create the task set in.
     *            </p>
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the service to create the task set in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that hosts the service to create the task set in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTaskSetRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * <p>
     * An optional non-unique tag that identifies this task set in external
     * systems. If the task set is associated with a service discovery registry,
     * the tasks in this task set will have the
     * <code>ECS_TASK_SET_EXTERNAL_ID</code> AWS Cloud Map attribute set to the
     * provided value.
     * </p>
     *
     * @return <p>
     *         An optional non-unique tag that identifies this task set in
     *         external systems. If the task set is associated with a service
     *         discovery registry, the tasks in this task set will have the
     *         <code>ECS_TASK_SET_EXTERNAL_ID</code> AWS Cloud Map attribute set
     *         to the provided value.
     *         </p>
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * <p>
     * An optional non-unique tag that identifies this task set in external
     * systems. If the task set is associated with a service discovery registry,
     * the tasks in this task set will have the
     * <code>ECS_TASK_SET_EXTERNAL_ID</code> AWS Cloud Map attribute set to the
     * provided value.
     * </p>
     *
     * @param externalId <p>
     *            An optional non-unique tag that identifies this task set in
     *            external systems. If the task set is associated with a service
     *            discovery registry, the tasks in this task set will have the
     *            <code>ECS_TASK_SET_EXTERNAL_ID</code> AWS Cloud Map attribute
     *            set to the provided value.
     *            </p>
     */
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * An optional non-unique tag that identifies this task set in external
     * systems. If the task set is associated with a service discovery registry,
     * the tasks in this task set will have the
     * <code>ECS_TASK_SET_EXTERNAL_ID</code> AWS Cloud Map attribute set to the
     * provided value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param externalId <p>
     *            An optional non-unique tag that identifies this task set in
     *            external systems. If the task set is associated with a service
     *            discovery registry, the tasks in this task set will have the
     *            <code>ECS_TASK_SET_EXTERNAL_ID</code> AWS Cloud Map attribute
     *            set to the provided value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTaskSetRequest withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * <p>
     * The task definition for the tasks in the task set to use.
     * </p>
     *
     * @return <p>
     *         The task definition for the tasks in the task set to use.
     *         </p>
     */
    public String getTaskDefinition() {
        return taskDefinition;
    }

    /**
     * <p>
     * The task definition for the tasks in the task set to use.
     * </p>
     *
     * @param taskDefinition <p>
     *            The task definition for the tasks in the task set to use.
     *            </p>
     */
    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }

    /**
     * <p>
     * The task definition for the tasks in the task set to use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskDefinition <p>
     *            The task definition for the tasks in the task set to use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTaskSetRequest withTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
        return this;
    }

    /**
     * <p>
     * An object representing the network configuration for a task or service.
     * </p>
     *
     * @return <p>
     *         An object representing the network configuration for a task or
     *         service.
     *         </p>
     */
    public NetworkConfiguration getNetworkConfiguration() {
        return networkConfiguration;
    }

    /**
     * <p>
     * An object representing the network configuration for a task or service.
     * </p>
     *
     * @param networkConfiguration <p>
     *            An object representing the network configuration for a task or
     *            service.
     *            </p>
     */
    public void setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    /**
     * <p>
     * An object representing the network configuration for a task or service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkConfiguration <p>
     *            An object representing the network configuration for a task or
     *            service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTaskSetRequest withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }

    /**
     * <p>
     * A load balancer object representing the load balancer to use with the
     * task set. The supported load balancer types are either an Application
     * Load Balancer or a Network Load Balancer.
     * </p>
     *
     * @return <p>
     *         A load balancer object representing the load balancer to use with
     *         the task set. The supported load balancer types are either an
     *         Application Load Balancer or a Network Load Balancer.
     *         </p>
     */
    public java.util.List<LoadBalancer> getLoadBalancers() {
        return loadBalancers;
    }

    /**
     * <p>
     * A load balancer object representing the load balancer to use with the
     * task set. The supported load balancer types are either an Application
     * Load Balancer or a Network Load Balancer.
     * </p>
     *
     * @param loadBalancers <p>
     *            A load balancer object representing the load balancer to use
     *            with the task set. The supported load balancer types are
     *            either an Application Load Balancer or a Network Load
     *            Balancer.
     *            </p>
     */
    public void setLoadBalancers(java.util.Collection<LoadBalancer> loadBalancers) {
        if (loadBalancers == null) {
            this.loadBalancers = null;
            return;
        }

        this.loadBalancers = new java.util.ArrayList<LoadBalancer>(loadBalancers);
    }

    /**
     * <p>
     * A load balancer object representing the load balancer to use with the
     * task set. The supported load balancer types are either an Application
     * Load Balancer or a Network Load Balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancers <p>
     *            A load balancer object representing the load balancer to use
     *            with the task set. The supported load balancer types are
     *            either an Application Load Balancer or a Network Load
     *            Balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTaskSetRequest withLoadBalancers(LoadBalancer... loadBalancers) {
        if (getLoadBalancers() == null) {
            this.loadBalancers = new java.util.ArrayList<LoadBalancer>(loadBalancers.length);
        }
        for (LoadBalancer value : loadBalancers) {
            this.loadBalancers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A load balancer object representing the load balancer to use with the
     * task set. The supported load balancer types are either an Application
     * Load Balancer or a Network Load Balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancers <p>
     *            A load balancer object representing the load balancer to use
     *            with the task set. The supported load balancer types are
     *            either an Application Load Balancer or a Network Load
     *            Balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTaskSetRequest withLoadBalancers(java.util.Collection<LoadBalancer> loadBalancers) {
        setLoadBalancers(loadBalancers);
        return this;
    }

    /**
     * <p>
     * The details of the service discovery registries to assign to this task
     * set. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html"
     * >Service Discovery</a>.
     * </p>
     *
     * @return <p>
     *         The details of the service discovery registries to assign to this
     *         task set. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html"
     *         >Service Discovery</a>.
     *         </p>
     */
    public java.util.List<ServiceRegistry> getServiceRegistries() {
        return serviceRegistries;
    }

    /**
     * <p>
     * The details of the service discovery registries to assign to this task
     * set. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html"
     * >Service Discovery</a>.
     * </p>
     *
     * @param serviceRegistries <p>
     *            The details of the service discovery registries to assign to
     *            this task set. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html"
     *            >Service Discovery</a>.
     *            </p>
     */
    public void setServiceRegistries(java.util.Collection<ServiceRegistry> serviceRegistries) {
        if (serviceRegistries == null) {
            this.serviceRegistries = null;
            return;
        }

        this.serviceRegistries = new java.util.ArrayList<ServiceRegistry>(serviceRegistries);
    }

    /**
     * <p>
     * The details of the service discovery registries to assign to this task
     * set. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html"
     * >Service Discovery</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceRegistries <p>
     *            The details of the service discovery registries to assign to
     *            this task set. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html"
     *            >Service Discovery</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTaskSetRequest withServiceRegistries(ServiceRegistry... serviceRegistries) {
        if (getServiceRegistries() == null) {
            this.serviceRegistries = new java.util.ArrayList<ServiceRegistry>(
                    serviceRegistries.length);
        }
        for (ServiceRegistry value : serviceRegistries) {
            this.serviceRegistries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The details of the service discovery registries to assign to this task
     * set. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html"
     * >Service Discovery</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceRegistries <p>
     *            The details of the service discovery registries to assign to
     *            this task set. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html"
     *            >Service Discovery</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTaskSetRequest withServiceRegistries(
            java.util.Collection<ServiceRegistry> serviceRegistries) {
        setServiceRegistries(serviceRegistries);
        return this;
    }

    /**
     * <p>
     * The launch type that new tasks in the task set will use. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * If a <code>launchType</code> is specified, the
     * <code>capacityProviderStrategy</code> parameter must be omitted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @return <p>
     *         The launch type that new tasks in the task set will use. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     *         >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container
     *         Service Developer Guide</i>.
     *         </p>
     *         <p>
     *         If a <code>launchType</code> is specified, the
     *         <code>capacityProviderStrategy</code> parameter must be omitted.
     *         </p>
     * @see LaunchType
     */
    public String getLaunchType() {
        return launchType;
    }

    /**
     * <p>
     * The launch type that new tasks in the task set will use. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * If a <code>launchType</code> is specified, the
     * <code>capacityProviderStrategy</code> parameter must be omitted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @param launchType <p>
     *            The launch type that new tasks in the task set will use. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     *            >Amazon ECS Launch Types</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            If a <code>launchType</code> is specified, the
     *            <code>capacityProviderStrategy</code> parameter must be
     *            omitted.
     *            </p>
     * @see LaunchType
     */
    public void setLaunchType(String launchType) {
        this.launchType = launchType;
    }

    /**
     * <p>
     * The launch type that new tasks in the task set will use. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * If a <code>launchType</code> is specified, the
     * <code>capacityProviderStrategy</code> parameter must be omitted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @param launchType <p>
     *            The launch type that new tasks in the task set will use. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     *            >Amazon ECS Launch Types</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            If a <code>launchType</code> is specified, the
     *            <code>capacityProviderStrategy</code> parameter must be
     *            omitted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LaunchType
     */
    public CreateTaskSetRequest withLaunchType(String launchType) {
        this.launchType = launchType;
        return this;
    }

    /**
     * <p>
     * The launch type that new tasks in the task set will use. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * If a <code>launchType</code> is specified, the
     * <code>capacityProviderStrategy</code> parameter must be omitted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @param launchType <p>
     *            The launch type that new tasks in the task set will use. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     *            >Amazon ECS Launch Types</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            If a <code>launchType</code> is specified, the
     *            <code>capacityProviderStrategy</code> parameter must be
     *            omitted.
     *            </p>
     * @see LaunchType
     */
    public void setLaunchType(LaunchType launchType) {
        this.launchType = launchType.toString();
    }

    /**
     * <p>
     * The launch type that new tasks in the task set will use. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * If a <code>launchType</code> is specified, the
     * <code>capacityProviderStrategy</code> parameter must be omitted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @param launchType <p>
     *            The launch type that new tasks in the task set will use. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     *            >Amazon ECS Launch Types</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            If a <code>launchType</code> is specified, the
     *            <code>capacityProviderStrategy</code> parameter must be
     *            omitted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LaunchType
     */
    public CreateTaskSetRequest withLaunchType(LaunchType launchType) {
        this.launchType = launchType.toString();
        return this;
    }

    /**
     * <p>
     * The capacity provider strategy to use for the task set.
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
     * If a <code>capacityProviderStrategy</code> is specified, the
     * <code>launchType</code> parameter must be omitted. If no
     * <code>capacityProviderStrategy</code> or <code>launchType</code> is
     * specified, the <code>defaultCapacityProviderStrategy</code> for the
     * cluster is used.
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
     * The <a>PutClusterCapacityProviders</a> API operation is used to update
     * the list of available capacity providers for a cluster after the cluster
     * is created.
     * </p>
     *
     * @return <p>
     *         The capacity provider strategy to use for the task set.
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
     *         If a <code>capacityProviderStrategy</code> is specified, the
     *         <code>launchType</code> parameter must be omitted. If no
     *         <code>capacityProviderStrategy</code> or <code>launchType</code>
     *         is specified, the <code>defaultCapacityProviderStrategy</code>
     *         for the cluster is used.
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
     *         <p>
     *         The <a>PutClusterCapacityProviders</a> API operation is used to
     *         update the list of available capacity providers for a cluster
     *         after the cluster is created.
     *         </p>
     */
    public java.util.List<CapacityProviderStrategyItem> getCapacityProviderStrategy() {
        return capacityProviderStrategy;
    }

    /**
     * <p>
     * The capacity provider strategy to use for the task set.
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
     * If a <code>capacityProviderStrategy</code> is specified, the
     * <code>launchType</code> parameter must be omitted. If no
     * <code>capacityProviderStrategy</code> or <code>launchType</code> is
     * specified, the <code>defaultCapacityProviderStrategy</code> for the
     * cluster is used.
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
     * The <a>PutClusterCapacityProviders</a> API operation is used to update
     * the list of available capacity providers for a cluster after the cluster
     * is created.
     * </p>
     *
     * @param capacityProviderStrategy <p>
     *            The capacity provider strategy to use for the task set.
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
     *            If a <code>capacityProviderStrategy</code> is specified, the
     *            <code>launchType</code> parameter must be omitted. If no
     *            <code>capacityProviderStrategy</code> or
     *            <code>launchType</code> is specified, the
     *            <code>defaultCapacityProviderStrategy</code> for the cluster
     *            is used.
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
     *            <p>
     *            The <a>PutClusterCapacityProviders</a> API operation is used
     *            to update the list of available capacity providers for a
     *            cluster after the cluster is created.
     *            </p>
     */
    public void setCapacityProviderStrategy(
            java.util.Collection<CapacityProviderStrategyItem> capacityProviderStrategy) {
        if (capacityProviderStrategy == null) {
            this.capacityProviderStrategy = null;
            return;
        }

        this.capacityProviderStrategy = new java.util.ArrayList<CapacityProviderStrategyItem>(
                capacityProviderStrategy);
    }

    /**
     * <p>
     * The capacity provider strategy to use for the task set.
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
     * If a <code>capacityProviderStrategy</code> is specified, the
     * <code>launchType</code> parameter must be omitted. If no
     * <code>capacityProviderStrategy</code> or <code>launchType</code> is
     * specified, the <code>defaultCapacityProviderStrategy</code> for the
     * cluster is used.
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
     * The <a>PutClusterCapacityProviders</a> API operation is used to update
     * the list of available capacity providers for a cluster after the cluster
     * is created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityProviderStrategy <p>
     *            The capacity provider strategy to use for the task set.
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
     *            If a <code>capacityProviderStrategy</code> is specified, the
     *            <code>launchType</code> parameter must be omitted. If no
     *            <code>capacityProviderStrategy</code> or
     *            <code>launchType</code> is specified, the
     *            <code>defaultCapacityProviderStrategy</code> for the cluster
     *            is used.
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
     *            <p>
     *            The <a>PutClusterCapacityProviders</a> API operation is used
     *            to update the list of available capacity providers for a
     *            cluster after the cluster is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTaskSetRequest withCapacityProviderStrategy(
            CapacityProviderStrategyItem... capacityProviderStrategy) {
        if (getCapacityProviderStrategy() == null) {
            this.capacityProviderStrategy = new java.util.ArrayList<CapacityProviderStrategyItem>(
                    capacityProviderStrategy.length);
        }
        for (CapacityProviderStrategyItem value : capacityProviderStrategy) {
            this.capacityProviderStrategy.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The capacity provider strategy to use for the task set.
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
     * If a <code>capacityProviderStrategy</code> is specified, the
     * <code>launchType</code> parameter must be omitted. If no
     * <code>capacityProviderStrategy</code> or <code>launchType</code> is
     * specified, the <code>defaultCapacityProviderStrategy</code> for the
     * cluster is used.
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
     * The <a>PutClusterCapacityProviders</a> API operation is used to update
     * the list of available capacity providers for a cluster after the cluster
     * is created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityProviderStrategy <p>
     *            The capacity provider strategy to use for the task set.
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
     *            If a <code>capacityProviderStrategy</code> is specified, the
     *            <code>launchType</code> parameter must be omitted. If no
     *            <code>capacityProviderStrategy</code> or
     *            <code>launchType</code> is specified, the
     *            <code>defaultCapacityProviderStrategy</code> for the cluster
     *            is used.
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
     *            <p>
     *            The <a>PutClusterCapacityProviders</a> API operation is used
     *            to update the list of available capacity providers for a
     *            cluster after the cluster is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTaskSetRequest withCapacityProviderStrategy(
            java.util.Collection<CapacityProviderStrategyItem> capacityProviderStrategy) {
        setCapacityProviderStrategy(capacityProviderStrategy);
        return this;
    }

    /**
     * <p>
     * The platform version that the tasks in the task set should use. A
     * platform version is specified only for tasks using the Fargate launch
     * type. If one isn't specified, the <code>LATEST</code> platform version is
     * used by default.
     * </p>
     *
     * @return <p>
     *         The platform version that the tasks in the task set should use. A
     *         platform version is specified only for tasks using the Fargate
     *         launch type. If one isn't specified, the <code>LATEST</code>
     *         platform version is used by default.
     *         </p>
     */
    public String getPlatformVersion() {
        return platformVersion;
    }

    /**
     * <p>
     * The platform version that the tasks in the task set should use. A
     * platform version is specified only for tasks using the Fargate launch
     * type. If one isn't specified, the <code>LATEST</code> platform version is
     * used by default.
     * </p>
     *
     * @param platformVersion <p>
     *            The platform version that the tasks in the task set should
     *            use. A platform version is specified only for tasks using the
     *            Fargate launch type. If one isn't specified, the
     *            <code>LATEST</code> platform version is used by default.
     *            </p>
     */
    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * The platform version that the tasks in the task set should use. A
     * platform version is specified only for tasks using the Fargate launch
     * type. If one isn't specified, the <code>LATEST</code> platform version is
     * used by default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformVersion <p>
     *            The platform version that the tasks in the task set should
     *            use. A platform version is specified only for tasks using the
     *            Fargate launch type. If one isn't specified, the
     *            <code>LATEST</code> platform version is used by default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTaskSetRequest withPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
        return this;
    }

    /**
     * <p>
     * A floating-point percentage of the desired number of tasks to place and
     * keep running in the task set.
     * </p>
     *
     * @return <p>
     *         A floating-point percentage of the desired number of tasks to
     *         place and keep running in the task set.
     *         </p>
     */
    public Scale getScale() {
        return scale;
    }

    /**
     * <p>
     * A floating-point percentage of the desired number of tasks to place and
     * keep running in the task set.
     * </p>
     *
     * @param scale <p>
     *            A floating-point percentage of the desired number of tasks to
     *            place and keep running in the task set.
     *            </p>
     */
    public void setScale(Scale scale) {
        this.scale = scale;
    }

    /**
     * <p>
     * A floating-point percentage of the desired number of tasks to place and
     * keep running in the task set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scale <p>
     *            A floating-point percentage of the desired number of tasks to
     *            place and keep running in the task set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTaskSetRequest withScale(Scale scale) {
        this.scale = scale;
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. Up to 32 ASCII characters are allowed.
     * </p>
     *
     * @return <p>
     *         Unique, case-sensitive identifier that you provide to ensure the
     *         idempotency of the request. Up to 32 ASCII characters are
     *         allowed.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. Up to 32 ASCII characters are allowed.
     * </p>
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. Up to 32 ASCII characters are
     *            allowed.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. Up to 32 ASCII characters are allowed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. Up to 32 ASCII characters are
     *            allowed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTaskSetRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to the task set to help you categorize and
     * organize them. Each tag consists of a key and an optional value, both of
     * which you define. When a service is deleted, the tags are deleted as
     * well.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have
     * only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources,
     * remember that other services may have restrictions on allowed characters.
     * Generally allowed characters are: letters, numbers, and spaces
     * representable in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or
     * lowercase combination of such as a prefix for either keys or values as it
     * is reserved for AWS use. You cannot edit or delete tag keys or values
     * with this prefix. Tags with this prefix do not count against your tags
     * per resource limit.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The metadata that you apply to the task set to help you
     *         categorize and organize them. Each tag consists of a key and an
     *         optional value, both of which you define. When a service is
     *         deleted, the tags are deleted as well.
     *         </p>
     *         <p>
     *         The following basic restrictions apply to tags:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Maximum number of tags per resource - 50
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For each resource, each tag key must be unique, and each tag key
     *         can have only one value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum key length - 128 Unicode characters in UTF-8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum value length - 256 Unicode characters in UTF-8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If your tagging schema is used across multiple services and
     *         resources, remember that other services may have restrictions on
     *         allowed characters. Generally allowed characters are: letters,
     *         numbers, and spaces representable in UTF-8, and the following
     *         characters: + - = . _ : / @.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Tag keys and values are case-sensitive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or
     *         lowercase combination of such as a prefix for either keys or
     *         values as it is reserved for AWS use. You cannot edit or delete
     *         tag keys or values with this prefix. Tags with this prefix do not
     *         count against your tags per resource limit.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The metadata that you apply to the task set to help you categorize and
     * organize them. Each tag consists of a key and an optional value, both of
     * which you define. When a service is deleted, the tags are deleted as
     * well.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have
     * only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources,
     * remember that other services may have restrictions on allowed characters.
     * Generally allowed characters are: letters, numbers, and spaces
     * representable in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or
     * lowercase combination of such as a prefix for either keys or values as it
     * is reserved for AWS use. You cannot edit or delete tag keys or values
     * with this prefix. Tags with this prefix do not count against your tags
     * per resource limit.
     * </p>
     * </li>
     * </ul>
     *
     * @param tags <p>
     *            The metadata that you apply to the task set to help you
     *            categorize and organize them. Each tag consists of a key and
     *            an optional value, both of which you define. When a service is
     *            deleted, the tags are deleted as well.
     *            </p>
     *            <p>
     *            The following basic restrictions apply to tags:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Maximum number of tags per resource - 50
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For each resource, each tag key must be unique, and each tag
     *            key can have only one value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum key length - 128 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum value length - 256 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If your tagging schema is used across multiple services and
     *            resources, remember that other services may have restrictions
     *            on allowed characters. Generally allowed characters are:
     *            letters, numbers, and spaces representable in UTF-8, and the
     *            following characters: + - = . _ : / @.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Tag keys and values are case-sensitive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Do not use <code>aws:</code>, <code>AWS:</code>, or any upper
     *            or lowercase combination of such as a prefix for either keys
     *            or values as it is reserved for AWS use. You cannot edit or
     *            delete tag keys or values with this prefix. Tags with this
     *            prefix do not count against your tags per resource limit.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The metadata that you apply to the task set to help you categorize and
     * organize them. Each tag consists of a key and an optional value, both of
     * which you define. When a service is deleted, the tags are deleted as
     * well.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have
     * only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources,
     * remember that other services may have restrictions on allowed characters.
     * Generally allowed characters are: letters, numbers, and spaces
     * representable in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or
     * lowercase combination of such as a prefix for either keys or values as it
     * is reserved for AWS use. You cannot edit or delete tag keys or values
     * with this prefix. Tags with this prefix do not count against your tags
     * per resource limit.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The metadata that you apply to the task set to help you
     *            categorize and organize them. Each tag consists of a key and
     *            an optional value, both of which you define. When a service is
     *            deleted, the tags are deleted as well.
     *            </p>
     *            <p>
     *            The following basic restrictions apply to tags:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Maximum number of tags per resource - 50
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For each resource, each tag key must be unique, and each tag
     *            key can have only one value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum key length - 128 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum value length - 256 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If your tagging schema is used across multiple services and
     *            resources, remember that other services may have restrictions
     *            on allowed characters. Generally allowed characters are:
     *            letters, numbers, and spaces representable in UTF-8, and the
     *            following characters: + - = . _ : / @.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Tag keys and values are case-sensitive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Do not use <code>aws:</code>, <code>AWS:</code>, or any upper
     *            or lowercase combination of such as a prefix for either keys
     *            or values as it is reserved for AWS use. You cannot edit or
     *            delete tag keys or values with this prefix. Tags with this
     *            prefix do not count against your tags per resource limit.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTaskSetRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to the task set to help you categorize and
     * organize them. Each tag consists of a key and an optional value, both of
     * which you define. When a service is deleted, the tags are deleted as
     * well.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have
     * only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources,
     * remember that other services may have restrictions on allowed characters.
     * Generally allowed characters are: letters, numbers, and spaces
     * representable in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or
     * lowercase combination of such as a prefix for either keys or values as it
     * is reserved for AWS use. You cannot edit or delete tag keys or values
     * with this prefix. Tags with this prefix do not count against your tags
     * per resource limit.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The metadata that you apply to the task set to help you
     *            categorize and organize them. Each tag consists of a key and
     *            an optional value, both of which you define. When a service is
     *            deleted, the tags are deleted as well.
     *            </p>
     *            <p>
     *            The following basic restrictions apply to tags:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Maximum number of tags per resource - 50
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For each resource, each tag key must be unique, and each tag
     *            key can have only one value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum key length - 128 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum value length - 256 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If your tagging schema is used across multiple services and
     *            resources, remember that other services may have restrictions
     *            on allowed characters. Generally allowed characters are:
     *            letters, numbers, and spaces representable in UTF-8, and the
     *            following characters: + - = . _ : / @.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Tag keys and values are case-sensitive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Do not use <code>aws:</code>, <code>AWS:</code>, or any upper
     *            or lowercase combination of such as a prefix for either keys
     *            or values as it is reserved for AWS use. You cannot edit or
     *            delete tag keys or values with this prefix. Tags with this
     *            prefix do not count against your tags per resource limit.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTaskSetRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getService() != null)
            sb.append("service: " + getService() + ",");
        if (getCluster() != null)
            sb.append("cluster: " + getCluster() + ",");
        if (getExternalId() != null)
            sb.append("externalId: " + getExternalId() + ",");
        if (getTaskDefinition() != null)
            sb.append("taskDefinition: " + getTaskDefinition() + ",");
        if (getNetworkConfiguration() != null)
            sb.append("networkConfiguration: " + getNetworkConfiguration() + ",");
        if (getLoadBalancers() != null)
            sb.append("loadBalancers: " + getLoadBalancers() + ",");
        if (getServiceRegistries() != null)
            sb.append("serviceRegistries: " + getServiceRegistries() + ",");
        if (getLaunchType() != null)
            sb.append("launchType: " + getLaunchType() + ",");
        if (getCapacityProviderStrategy() != null)
            sb.append("capacityProviderStrategy: " + getCapacityProviderStrategy() + ",");
        if (getPlatformVersion() != null)
            sb.append("platformVersion: " + getPlatformVersion() + ",");
        if (getScale() != null)
            sb.append("scale: " + getScale() + ",");
        if (getClientToken() != null)
            sb.append("clientToken: " + getClientToken() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        hashCode = prime * hashCode
                + ((getTaskDefinition() == null) ? 0 : getTaskDefinition().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkConfiguration() == null) ? 0 : getNetworkConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getLoadBalancers() == null) ? 0 : getLoadBalancers().hashCode());
        hashCode = prime * hashCode
                + ((getServiceRegistries() == null) ? 0 : getServiceRegistries().hashCode());
        hashCode = prime * hashCode + ((getLaunchType() == null) ? 0 : getLaunchType().hashCode());
        hashCode = prime
                * hashCode
                + ((getCapacityProviderStrategy() == null) ? 0 : getCapacityProviderStrategy()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode + ((getScale() == null) ? 0 : getScale().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTaskSetRequest == false)
            return false;
        CreateTaskSetRequest other = (CreateTaskSetRequest) obj;

        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null
                && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        if (other.getTaskDefinition() == null ^ this.getTaskDefinition() == null)
            return false;
        if (other.getTaskDefinition() != null
                && other.getTaskDefinition().equals(this.getTaskDefinition()) == false)
            return false;
        if (other.getNetworkConfiguration() == null ^ this.getNetworkConfiguration() == null)
            return false;
        if (other.getNetworkConfiguration() != null
                && other.getNetworkConfiguration().equals(this.getNetworkConfiguration()) == false)
            return false;
        if (other.getLoadBalancers() == null ^ this.getLoadBalancers() == null)
            return false;
        if (other.getLoadBalancers() != null
                && other.getLoadBalancers().equals(this.getLoadBalancers()) == false)
            return false;
        if (other.getServiceRegistries() == null ^ this.getServiceRegistries() == null)
            return false;
        if (other.getServiceRegistries() != null
                && other.getServiceRegistries().equals(this.getServiceRegistries()) == false)
            return false;
        if (other.getLaunchType() == null ^ this.getLaunchType() == null)
            return false;
        if (other.getLaunchType() != null
                && other.getLaunchType().equals(this.getLaunchType()) == false)
            return false;
        if (other.getCapacityProviderStrategy() == null
                ^ this.getCapacityProviderStrategy() == null)
            return false;
        if (other.getCapacityProviderStrategy() != null
                && other.getCapacityProviderStrategy().equals(this.getCapacityProviderStrategy()) == false)
            return false;
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null
                && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        if (other.getScale() == null ^ this.getScale() == null)
            return false;
        if (other.getScale() != null && other.getScale().equals(this.getScale()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
