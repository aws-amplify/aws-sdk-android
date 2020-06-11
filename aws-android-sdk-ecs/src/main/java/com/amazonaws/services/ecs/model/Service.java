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

/**
 * <p>
 * Details on a service within a cluster
 * </p>
 */
public class Service implements Serializable {
    /**
     * <p>
     * The ARN that identifies the service. The ARN contains the
     * <code>arn:aws:ecs</code> namespace, followed by the Region of the
     * service, the AWS account ID of the service owner, the
     * <code>service</code> namespace, and then the service name. For example,
     * <code>arn:aws:ecs:region:012345678910:service/my-service</code>.
     * </p>
     */
    private String serviceArn;

    /**
     * <p>
     * The name of your service. Up to 255 letters (uppercase and lowercase),
     * numbers, and hyphens are allowed. Service names must be unique within a
     * cluster, but you can have similarly named services in multiple clusters
     * within a Region or across multiple Regions.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster that hosts the service.
     * </p>
     */
    private String clusterArn;

    /**
     * <p>
     * A list of Elastic Load Balancing load balancer objects, containing the
     * load balancer name, the container name (as it appears in a container
     * definition), and the container port to access from the load balancer.
     * </p>
     */
    private java.util.List<LoadBalancer> loadBalancers;

    /**
     * <p>
     * The details of the service discovery registries to assign to this
     * service. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html"
     * >Service Discovery</a>.
     * </p>
     */
    private java.util.List<ServiceRegistry> serviceRegistries;

    /**
     * <p>
     * The status of the service. The valid values are <code>ACTIVE</code>,
     * <code>DRAINING</code>, or <code>INACTIVE</code>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The desired number of instantiations of the task definition to keep
     * running on the service. This value is specified when the service is
     * created with <a>CreateService</a>, and it can be modified with
     * <a>UpdateService</a>.
     * </p>
     */
    private Integer desiredCount;

    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>RUNNING</code>
     * state.
     * </p>
     */
    private Integer runningCount;

    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>PENDING</code>
     * state.
     * </p>
     */
    private Integer pendingCount;

    /**
     * <p>
     * The launch type on which your service is running. If no value is
     * specified, it will default to <code>EC2</code>. Valid values include
     * <code>EC2</code> and <code>FARGATE</code>. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     */
    private String launchType;

    /**
     * <p>
     * The capacity provider strategy associated with the service.
     * </p>
     */
    private java.util.List<CapacityProviderStrategyItem> capacityProviderStrategy;

    /**
     * <p>
     * The platform version on which to run your service. A platform version is
     * only specified for tasks using the Fargate launch type. If one is not
     * specified, the <code>LATEST</code> platform version is used by default.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     * >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     */
    private String platformVersion;

    /**
     * <p>
     * The task definition to use for tasks in the service. This value is
     * specified when the service is created with <a>CreateService</a>, and it
     * can be modified with <a>UpdateService</a>.
     * </p>
     */
    private String taskDefinition;

    /**
     * <p>
     * Optional deployment parameters that control how many tasks run during the
     * deployment and the ordering of stopping and starting tasks.
     * </p>
     */
    private DeploymentConfiguration deploymentConfiguration;

    /**
     * <p>
     * Information about a set of Amazon ECS tasks in either an AWS CodeDeploy
     * or an <code>EXTERNAL</code> deployment. An Amazon ECS task set includes
     * details such as the desired number of tasks, how many tasks are running,
     * and whether the task set serves production traffic.
     * </p>
     */
    private java.util.List<TaskSet> taskSets;

    /**
     * <p>
     * The current state of deployments for the service.
     * </p>
     */
    private java.util.List<Deployment> deployments;

    /**
     * <p>
     * The ARN of the IAM role associated with the service that allows the
     * Amazon ECS container agent to register container instances with an
     * Elastic Load Balancing load balancer.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The event stream for your service. A maximum of 100 of the latest events
     * are displayed.
     * </p>
     */
    private java.util.List<ServiceEvent> events;

    /**
     * <p>
     * The Unix timestamp for when the service was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The placement constraints for the tasks in the service.
     * </p>
     */
    private java.util.List<PlacementConstraint> placementConstraints;

    /**
     * <p>
     * The placement strategy that determines how tasks for the service are
     * placed.
     * </p>
     */
    private java.util.List<PlacementStrategy> placementStrategy;

    /**
     * <p>
     * The VPC subnet and security group configuration for tasks that receive
     * their own elastic network interface by using the <code>awsvpc</code>
     * networking mode.
     * </p>
     */
    private NetworkConfiguration networkConfiguration;

    /**
     * <p>
     * The period of time, in seconds, that the Amazon ECS service scheduler
     * ignores unhealthy Elastic Load Balancing target health checks after a
     * task has first started.
     * </p>
     */
    private Integer healthCheckGracePeriodSeconds;

    /**
     * <p>
     * The scheduling strategy to use for the service. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html"
     * >Services</a>.
     * </p>
     * <p>
     * There are two service scheduler strategies available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLICA</code>-The replica scheduling strategy places and maintains
     * the desired number of tasks across your cluster. By default, the service
     * scheduler spreads tasks across Availability Zones. You can use task
     * placement strategies and constraints to customize task placement
     * decisions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAEMON</code>-The daemon scheduling strategy deploys exactly one
     * task on each active container instance that meets all of the task
     * placement constraints that you specify in your cluster. The service
     * scheduler also evaluates the task placement constraints for running tasks
     * and will stop tasks that do not meet the placement constraints.
     * </p>
     * <note>
     * <p>
     * Fargate tasks do not support the <code>DAEMON</code> scheduling strategy.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REPLICA, DAEMON
     */
    private String schedulingStrategy;

    /**
     * <p>
     * The deployment controller type the service is using. When using the
     * DescribeServices API, this field is omitted if the service is using the
     * <code>ECS</code> deployment controller type.
     * </p>
     */
    private DeploymentController deploymentController;

    /**
     * <p>
     * The metadata that you apply to the service to help you categorize and
     * organize them. Each tag consists of a key and an optional value, both of
     * which you define.
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
     * The principal that created the service.
     * </p>
     */
    private String createdBy;

    /**
     * <p>
     * Specifies whether to enable Amazon ECS managed tags for the tasks in the
     * service. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html"
     * >Tagging Your Amazon ECS Resources</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     */
    private Boolean enableECSManagedTags;

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition or the
     * service to the task. If no value is specified, the tags are not
     * propagated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TASK_DEFINITION, SERVICE
     */
    private String propagateTags;

    /**
     * <p>
     * The ARN that identifies the service. The ARN contains the
     * <code>arn:aws:ecs</code> namespace, followed by the Region of the
     * service, the AWS account ID of the service owner, the
     * <code>service</code> namespace, and then the service name. For example,
     * <code>arn:aws:ecs:region:012345678910:service/my-service</code>.
     * </p>
     *
     * @return <p>
     *         The ARN that identifies the service. The ARN contains the
     *         <code>arn:aws:ecs</code> namespace, followed by the Region of the
     *         service, the AWS account ID of the service owner, the
     *         <code>service</code> namespace, and then the service name. For
     *         example,
     *         <code>arn:aws:ecs:region:012345678910:service/my-service</code>.
     *         </p>
     */
    public String getServiceArn() {
        return serviceArn;
    }

    /**
     * <p>
     * The ARN that identifies the service. The ARN contains the
     * <code>arn:aws:ecs</code> namespace, followed by the Region of the
     * service, the AWS account ID of the service owner, the
     * <code>service</code> namespace, and then the service name. For example,
     * <code>arn:aws:ecs:region:012345678910:service/my-service</code>.
     * </p>
     *
     * @param serviceArn <p>
     *            The ARN that identifies the service. The ARN contains the
     *            <code>arn:aws:ecs</code> namespace, followed by the Region of
     *            the service, the AWS account ID of the service owner, the
     *            <code>service</code> namespace, and then the service name. For
     *            example,
     *            <code>arn:aws:ecs:region:012345678910:service/my-service</code>
     *            .
     *            </p>
     */
    public void setServiceArn(String serviceArn) {
        this.serviceArn = serviceArn;
    }

    /**
     * <p>
     * The ARN that identifies the service. The ARN contains the
     * <code>arn:aws:ecs</code> namespace, followed by the Region of the
     * service, the AWS account ID of the service owner, the
     * <code>service</code> namespace, and then the service name. For example,
     * <code>arn:aws:ecs:region:012345678910:service/my-service</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceArn <p>
     *            The ARN that identifies the service. The ARN contains the
     *            <code>arn:aws:ecs</code> namespace, followed by the Region of
     *            the service, the AWS account ID of the service owner, the
     *            <code>service</code> namespace, and then the service name. For
     *            example,
     *            <code>arn:aws:ecs:region:012345678910:service/my-service</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withServiceArn(String serviceArn) {
        this.serviceArn = serviceArn;
        return this;
    }

    /**
     * <p>
     * The name of your service. Up to 255 letters (uppercase and lowercase),
     * numbers, and hyphens are allowed. Service names must be unique within a
     * cluster, but you can have similarly named services in multiple clusters
     * within a Region or across multiple Regions.
     * </p>
     *
     * @return <p>
     *         The name of your service. Up to 255 letters (uppercase and
     *         lowercase), numbers, and hyphens are allowed. Service names must
     *         be unique within a cluster, but you can have similarly named
     *         services in multiple clusters within a Region or across multiple
     *         Regions.
     *         </p>
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * <p>
     * The name of your service. Up to 255 letters (uppercase and lowercase),
     * numbers, and hyphens are allowed. Service names must be unique within a
     * cluster, but you can have similarly named services in multiple clusters
     * within a Region or across multiple Regions.
     * </p>
     *
     * @param serviceName <p>
     *            The name of your service. Up to 255 letters (uppercase and
     *            lowercase), numbers, and hyphens are allowed. Service names
     *            must be unique within a cluster, but you can have similarly
     *            named services in multiple clusters within a Region or across
     *            multiple Regions.
     *            </p>
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of your service. Up to 255 letters (uppercase and lowercase),
     * numbers, and hyphens are allowed. Service names must be unique within a
     * cluster, but you can have similarly named services in multiple clusters
     * within a Region or across multiple Regions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceName <p>
     *            The name of your service. Up to 255 letters (uppercase and
     *            lowercase), numbers, and hyphens are allowed. Service names
     *            must be unique within a cluster, but you can have similarly
     *            named services in multiple clusters within a Region or across
     *            multiple Regions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster that hosts the service.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the cluster that hosts the
     *         service.
     *         </p>
     */
    public String getClusterArn() {
        return clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster that hosts the service.
     * </p>
     *
     * @param clusterArn <p>
     *            The Amazon Resource Name (ARN) of the cluster that hosts the
     *            service.
     *            </p>
     */
    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster that hosts the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterArn <p>
     *            The Amazon Resource Name (ARN) of the cluster that hosts the
     *            service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
        return this;
    }

    /**
     * <p>
     * A list of Elastic Load Balancing load balancer objects, containing the
     * load balancer name, the container name (as it appears in a container
     * definition), and the container port to access from the load balancer.
     * </p>
     *
     * @return <p>
     *         A list of Elastic Load Balancing load balancer objects,
     *         containing the load balancer name, the container name (as it
     *         appears in a container definition), and the container port to
     *         access from the load balancer.
     *         </p>
     */
    public java.util.List<LoadBalancer> getLoadBalancers() {
        return loadBalancers;
    }

    /**
     * <p>
     * A list of Elastic Load Balancing load balancer objects, containing the
     * load balancer name, the container name (as it appears in a container
     * definition), and the container port to access from the load balancer.
     * </p>
     *
     * @param loadBalancers <p>
     *            A list of Elastic Load Balancing load balancer objects,
     *            containing the load balancer name, the container name (as it
     *            appears in a container definition), and the container port to
     *            access from the load balancer.
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
     * A list of Elastic Load Balancing load balancer objects, containing the
     * load balancer name, the container name (as it appears in a container
     * definition), and the container port to access from the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancers <p>
     *            A list of Elastic Load Balancing load balancer objects,
     *            containing the load balancer name, the container name (as it
     *            appears in a container definition), and the container port to
     *            access from the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withLoadBalancers(LoadBalancer... loadBalancers) {
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
     * A list of Elastic Load Balancing load balancer objects, containing the
     * load balancer name, the container name (as it appears in a container
     * definition), and the container port to access from the load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancers <p>
     *            A list of Elastic Load Balancing load balancer objects,
     *            containing the load balancer name, the container name (as it
     *            appears in a container definition), and the container port to
     *            access from the load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withLoadBalancers(java.util.Collection<LoadBalancer> loadBalancers) {
        setLoadBalancers(loadBalancers);
        return this;
    }

    /**
     * <p>
     * The details of the service discovery registries to assign to this
     * service. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html"
     * >Service Discovery</a>.
     * </p>
     *
     * @return <p>
     *         The details of the service discovery registries to assign to this
     *         service. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html"
     *         >Service Discovery</a>.
     *         </p>
     */
    public java.util.List<ServiceRegistry> getServiceRegistries() {
        return serviceRegistries;
    }

    /**
     * <p>
     * The details of the service discovery registries to assign to this
     * service. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html"
     * >Service Discovery</a>.
     * </p>
     *
     * @param serviceRegistries <p>
     *            The details of the service discovery registries to assign to
     *            this service. For more information, see <a href=
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
     * The details of the service discovery registries to assign to this
     * service. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html"
     * >Service Discovery</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceRegistries <p>
     *            The details of the service discovery registries to assign to
     *            this service. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html"
     *            >Service Discovery</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withServiceRegistries(ServiceRegistry... serviceRegistries) {
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
     * The details of the service discovery registries to assign to this
     * service. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html"
     * >Service Discovery</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceRegistries <p>
     *            The details of the service discovery registries to assign to
     *            this service. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html"
     *            >Service Discovery</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withServiceRegistries(java.util.Collection<ServiceRegistry> serviceRegistries) {
        setServiceRegistries(serviceRegistries);
        return this;
    }

    /**
     * <p>
     * The status of the service. The valid values are <code>ACTIVE</code>,
     * <code>DRAINING</code>, or <code>INACTIVE</code>.
     * </p>
     *
     * @return <p>
     *         The status of the service. The valid values are
     *         <code>ACTIVE</code>, <code>DRAINING</code>, or
     *         <code>INACTIVE</code>.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the service. The valid values are <code>ACTIVE</code>,
     * <code>DRAINING</code>, or <code>INACTIVE</code>.
     * </p>
     *
     * @param status <p>
     *            The status of the service. The valid values are
     *            <code>ACTIVE</code>, <code>DRAINING</code>, or
     *            <code>INACTIVE</code>.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the service. The valid values are <code>ACTIVE</code>,
     * <code>DRAINING</code>, or <code>INACTIVE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the service. The valid values are
     *            <code>ACTIVE</code>, <code>DRAINING</code>, or
     *            <code>INACTIVE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The desired number of instantiations of the task definition to keep
     * running on the service. This value is specified when the service is
     * created with <a>CreateService</a>, and it can be modified with
     * <a>UpdateService</a>.
     * </p>
     *
     * @return <p>
     *         The desired number of instantiations of the task definition to
     *         keep running on the service. This value is specified when the
     *         service is created with <a>CreateService</a>, and it can be
     *         modified with <a>UpdateService</a>.
     *         </p>
     */
    public Integer getDesiredCount() {
        return desiredCount;
    }

    /**
     * <p>
     * The desired number of instantiations of the task definition to keep
     * running on the service. This value is specified when the service is
     * created with <a>CreateService</a>, and it can be modified with
     * <a>UpdateService</a>.
     * </p>
     *
     * @param desiredCount <p>
     *            The desired number of instantiations of the task definition to
     *            keep running on the service. This value is specified when the
     *            service is created with <a>CreateService</a>, and it can be
     *            modified with <a>UpdateService</a>.
     *            </p>
     */
    public void setDesiredCount(Integer desiredCount) {
        this.desiredCount = desiredCount;
    }

    /**
     * <p>
     * The desired number of instantiations of the task definition to keep
     * running on the service. This value is specified when the service is
     * created with <a>CreateService</a>, and it can be modified with
     * <a>UpdateService</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param desiredCount <p>
     *            The desired number of instantiations of the task definition to
     *            keep running on the service. This value is specified when the
     *            service is created with <a>CreateService</a>, and it can be
     *            modified with <a>UpdateService</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withDesiredCount(Integer desiredCount) {
        this.desiredCount = desiredCount;
        return this;
    }

    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>RUNNING</code>
     * state.
     * </p>
     *
     * @return <p>
     *         The number of tasks in the cluster that are in the
     *         <code>RUNNING</code> state.
     *         </p>
     */
    public Integer getRunningCount() {
        return runningCount;
    }

    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>RUNNING</code>
     * state.
     * </p>
     *
     * @param runningCount <p>
     *            The number of tasks in the cluster that are in the
     *            <code>RUNNING</code> state.
     *            </p>
     */
    public void setRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
    }

    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>RUNNING</code>
     * state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param runningCount <p>
     *            The number of tasks in the cluster that are in the
     *            <code>RUNNING</code> state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
        return this;
    }

    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>PENDING</code>
     * state.
     * </p>
     *
     * @return <p>
     *         The number of tasks in the cluster that are in the
     *         <code>PENDING</code> state.
     *         </p>
     */
    public Integer getPendingCount() {
        return pendingCount;
    }

    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>PENDING</code>
     * state.
     * </p>
     *
     * @param pendingCount <p>
     *            The number of tasks in the cluster that are in the
     *            <code>PENDING</code> state.
     *            </p>
     */
    public void setPendingCount(Integer pendingCount) {
        this.pendingCount = pendingCount;
    }

    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>PENDING</code>
     * state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pendingCount <p>
     *            The number of tasks in the cluster that are in the
     *            <code>PENDING</code> state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withPendingCount(Integer pendingCount) {
        this.pendingCount = pendingCount;
        return this;
    }

    /**
     * <p>
     * The launch type on which your service is running. If no value is
     * specified, it will default to <code>EC2</code>. Valid values include
     * <code>EC2</code> and <code>FARGATE</code>. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @return <p>
     *         The launch type on which your service is running. If no value is
     *         specified, it will default to <code>EC2</code>. Valid values
     *         include <code>EC2</code> and <code>FARGATE</code>. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     *         >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container
     *         Service Developer Guide</i>.
     *         </p>
     * @see LaunchType
     */
    public String getLaunchType() {
        return launchType;
    }

    /**
     * <p>
     * The launch type on which your service is running. If no value is
     * specified, it will default to <code>EC2</code>. Valid values include
     * <code>EC2</code> and <code>FARGATE</code>. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @param launchType <p>
     *            The launch type on which your service is running. If no value
     *            is specified, it will default to <code>EC2</code>. Valid
     *            values include <code>EC2</code> and <code>FARGATE</code>. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     *            >Amazon ECS Launch Types</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     * @see LaunchType
     */
    public void setLaunchType(String launchType) {
        this.launchType = launchType;
    }

    /**
     * <p>
     * The launch type on which your service is running. If no value is
     * specified, it will default to <code>EC2</code>. Valid values include
     * <code>EC2</code> and <code>FARGATE</code>. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @param launchType <p>
     *            The launch type on which your service is running. If no value
     *            is specified, it will default to <code>EC2</code>. Valid
     *            values include <code>EC2</code> and <code>FARGATE</code>. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     *            >Amazon ECS Launch Types</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LaunchType
     */
    public Service withLaunchType(String launchType) {
        this.launchType = launchType;
        return this;
    }

    /**
     * <p>
     * The launch type on which your service is running. If no value is
     * specified, it will default to <code>EC2</code>. Valid values include
     * <code>EC2</code> and <code>FARGATE</code>. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @param launchType <p>
     *            The launch type on which your service is running. If no value
     *            is specified, it will default to <code>EC2</code>. Valid
     *            values include <code>EC2</code> and <code>FARGATE</code>. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     *            >Amazon ECS Launch Types</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     * @see LaunchType
     */
    public void setLaunchType(LaunchType launchType) {
        this.launchType = launchType.toString();
    }

    /**
     * <p>
     * The launch type on which your service is running. If no value is
     * specified, it will default to <code>EC2</code>. Valid values include
     * <code>EC2</code> and <code>FARGATE</code>. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     * >Amazon ECS Launch Types</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EC2, FARGATE
     *
     * @param launchType <p>
     *            The launch type on which your service is running. If no value
     *            is specified, it will default to <code>EC2</code>. Valid
     *            values include <code>EC2</code> and <code>FARGATE</code>. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html"
     *            >Amazon ECS Launch Types</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LaunchType
     */
    public Service withLaunchType(LaunchType launchType) {
        this.launchType = launchType.toString();
        return this;
    }

    /**
     * <p>
     * The capacity provider strategy associated with the service.
     * </p>
     *
     * @return <p>
     *         The capacity provider strategy associated with the service.
     *         </p>
     */
    public java.util.List<CapacityProviderStrategyItem> getCapacityProviderStrategy() {
        return capacityProviderStrategy;
    }

    /**
     * <p>
     * The capacity provider strategy associated with the service.
     * </p>
     *
     * @param capacityProviderStrategy <p>
     *            The capacity provider strategy associated with the service.
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
     * The capacity provider strategy associated with the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityProviderStrategy <p>
     *            The capacity provider strategy associated with the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withCapacityProviderStrategy(
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
     * The capacity provider strategy associated with the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityProviderStrategy <p>
     *            The capacity provider strategy associated with the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withCapacityProviderStrategy(
            java.util.Collection<CapacityProviderStrategyItem> capacityProviderStrategy) {
        setCapacityProviderStrategy(capacityProviderStrategy);
        return this;
    }

    /**
     * <p>
     * The platform version on which to run your service. A platform version is
     * only specified for tasks using the Fargate launch type. If one is not
     * specified, the <code>LATEST</code> platform version is used by default.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     * >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The platform version on which to run your service. A platform
     *         version is only specified for tasks using the Fargate launch
     *         type. If one is not specified, the <code>LATEST</code> platform
     *         version is used by default. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     *         >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic
     *         Container Service Developer Guide</i>.
     *         </p>
     */
    public String getPlatformVersion() {
        return platformVersion;
    }

    /**
     * <p>
     * The platform version on which to run your service. A platform version is
     * only specified for tasks using the Fargate launch type. If one is not
     * specified, the <code>LATEST</code> platform version is used by default.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     * >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @param platformVersion <p>
     *            The platform version on which to run your service. A platform
     *            version is only specified for tasks using the Fargate launch
     *            type. If one is not specified, the <code>LATEST</code>
     *            platform version is used by default. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     *            >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     */
    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * The platform version on which to run your service. A platform version is
     * only specified for tasks using the Fargate launch type. If one is not
     * specified, the <code>LATEST</code> platform version is used by default.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     * >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformVersion <p>
     *            The platform version on which to run your service. A platform
     *            version is only specified for tasks using the Fargate launch
     *            type. If one is not specified, the <code>LATEST</code>
     *            platform version is used by default. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     *            >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
        return this;
    }

    /**
     * <p>
     * The task definition to use for tasks in the service. This value is
     * specified when the service is created with <a>CreateService</a>, and it
     * can be modified with <a>UpdateService</a>.
     * </p>
     *
     * @return <p>
     *         The task definition to use for tasks in the service. This value
     *         is specified when the service is created with
     *         <a>CreateService</a>, and it can be modified with
     *         <a>UpdateService</a>.
     *         </p>
     */
    public String getTaskDefinition() {
        return taskDefinition;
    }

    /**
     * <p>
     * The task definition to use for tasks in the service. This value is
     * specified when the service is created with <a>CreateService</a>, and it
     * can be modified with <a>UpdateService</a>.
     * </p>
     *
     * @param taskDefinition <p>
     *            The task definition to use for tasks in the service. This
     *            value is specified when the service is created with
     *            <a>CreateService</a>, and it can be modified with
     *            <a>UpdateService</a>.
     *            </p>
     */
    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }

    /**
     * <p>
     * The task definition to use for tasks in the service. This value is
     * specified when the service is created with <a>CreateService</a>, and it
     * can be modified with <a>UpdateService</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskDefinition <p>
     *            The task definition to use for tasks in the service. This
     *            value is specified when the service is created with
     *            <a>CreateService</a>, and it can be modified with
     *            <a>UpdateService</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
        return this;
    }

    /**
     * <p>
     * Optional deployment parameters that control how many tasks run during the
     * deployment and the ordering of stopping and starting tasks.
     * </p>
     *
     * @return <p>
     *         Optional deployment parameters that control how many tasks run
     *         during the deployment and the ordering of stopping and starting
     *         tasks.
     *         </p>
     */
    public DeploymentConfiguration getDeploymentConfiguration() {
        return deploymentConfiguration;
    }

    /**
     * <p>
     * Optional deployment parameters that control how many tasks run during the
     * deployment and the ordering of stopping and starting tasks.
     * </p>
     *
     * @param deploymentConfiguration <p>
     *            Optional deployment parameters that control how many tasks run
     *            during the deployment and the ordering of stopping and
     *            starting tasks.
     *            </p>
     */
    public void setDeploymentConfiguration(DeploymentConfiguration deploymentConfiguration) {
        this.deploymentConfiguration = deploymentConfiguration;
    }

    /**
     * <p>
     * Optional deployment parameters that control how many tasks run during the
     * deployment and the ordering of stopping and starting tasks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentConfiguration <p>
     *            Optional deployment parameters that control how many tasks run
     *            during the deployment and the ordering of stopping and
     *            starting tasks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withDeploymentConfiguration(DeploymentConfiguration deploymentConfiguration) {
        this.deploymentConfiguration = deploymentConfiguration;
        return this;
    }

    /**
     * <p>
     * Information about a set of Amazon ECS tasks in either an AWS CodeDeploy
     * or an <code>EXTERNAL</code> deployment. An Amazon ECS task set includes
     * details such as the desired number of tasks, how many tasks are running,
     * and whether the task set serves production traffic.
     * </p>
     *
     * @return <p>
     *         Information about a set of Amazon ECS tasks in either an AWS
     *         CodeDeploy or an <code>EXTERNAL</code> deployment. An Amazon ECS
     *         task set includes details such as the desired number of tasks,
     *         how many tasks are running, and whether the task set serves
     *         production traffic.
     *         </p>
     */
    public java.util.List<TaskSet> getTaskSets() {
        return taskSets;
    }

    /**
     * <p>
     * Information about a set of Amazon ECS tasks in either an AWS CodeDeploy
     * or an <code>EXTERNAL</code> deployment. An Amazon ECS task set includes
     * details such as the desired number of tasks, how many tasks are running,
     * and whether the task set serves production traffic.
     * </p>
     *
     * @param taskSets <p>
     *            Information about a set of Amazon ECS tasks in either an AWS
     *            CodeDeploy or an <code>EXTERNAL</code> deployment. An Amazon
     *            ECS task set includes details such as the desired number of
     *            tasks, how many tasks are running, and whether the task set
     *            serves production traffic.
     *            </p>
     */
    public void setTaskSets(java.util.Collection<TaskSet> taskSets) {
        if (taskSets == null) {
            this.taskSets = null;
            return;
        }

        this.taskSets = new java.util.ArrayList<TaskSet>(taskSets);
    }

    /**
     * <p>
     * Information about a set of Amazon ECS tasks in either an AWS CodeDeploy
     * or an <code>EXTERNAL</code> deployment. An Amazon ECS task set includes
     * details such as the desired number of tasks, how many tasks are running,
     * and whether the task set serves production traffic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskSets <p>
     *            Information about a set of Amazon ECS tasks in either an AWS
     *            CodeDeploy or an <code>EXTERNAL</code> deployment. An Amazon
     *            ECS task set includes details such as the desired number of
     *            tasks, how many tasks are running, and whether the task set
     *            serves production traffic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withTaskSets(TaskSet... taskSets) {
        if (getTaskSets() == null) {
            this.taskSets = new java.util.ArrayList<TaskSet>(taskSets.length);
        }
        for (TaskSet value : taskSets) {
            this.taskSets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about a set of Amazon ECS tasks in either an AWS CodeDeploy
     * or an <code>EXTERNAL</code> deployment. An Amazon ECS task set includes
     * details such as the desired number of tasks, how many tasks are running,
     * and whether the task set serves production traffic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskSets <p>
     *            Information about a set of Amazon ECS tasks in either an AWS
     *            CodeDeploy or an <code>EXTERNAL</code> deployment. An Amazon
     *            ECS task set includes details such as the desired number of
     *            tasks, how many tasks are running, and whether the task set
     *            serves production traffic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withTaskSets(java.util.Collection<TaskSet> taskSets) {
        setTaskSets(taskSets);
        return this;
    }

    /**
     * <p>
     * The current state of deployments for the service.
     * </p>
     *
     * @return <p>
     *         The current state of deployments for the service.
     *         </p>
     */
    public java.util.List<Deployment> getDeployments() {
        return deployments;
    }

    /**
     * <p>
     * The current state of deployments for the service.
     * </p>
     *
     * @param deployments <p>
     *            The current state of deployments for the service.
     *            </p>
     */
    public void setDeployments(java.util.Collection<Deployment> deployments) {
        if (deployments == null) {
            this.deployments = null;
            return;
        }

        this.deployments = new java.util.ArrayList<Deployment>(deployments);
    }

    /**
     * <p>
     * The current state of deployments for the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deployments <p>
     *            The current state of deployments for the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withDeployments(Deployment... deployments) {
        if (getDeployments() == null) {
            this.deployments = new java.util.ArrayList<Deployment>(deployments.length);
        }
        for (Deployment value : deployments) {
            this.deployments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The current state of deployments for the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deployments <p>
     *            The current state of deployments for the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withDeployments(java.util.Collection<Deployment> deployments) {
        setDeployments(deployments);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role associated with the service that allows the
     * Amazon ECS container agent to register container instances with an
     * Elastic Load Balancing load balancer.
     * </p>
     *
     * @return <p>
     *         The ARN of the IAM role associated with the service that allows
     *         the Amazon ECS container agent to register container instances
     *         with an Elastic Load Balancing load balancer.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role associated with the service that allows the
     * Amazon ECS container agent to register container instances with an
     * Elastic Load Balancing load balancer.
     * </p>
     *
     * @param roleArn <p>
     *            The ARN of the IAM role associated with the service that
     *            allows the Amazon ECS container agent to register container
     *            instances with an Elastic Load Balancing load balancer.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role associated with the service that allows the
     * Amazon ECS container agent to register container instances with an
     * Elastic Load Balancing load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn <p>
     *            The ARN of the IAM role associated with the service that
     *            allows the Amazon ECS container agent to register container
     *            instances with an Elastic Load Balancing load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The event stream for your service. A maximum of 100 of the latest events
     * are displayed.
     * </p>
     *
     * @return <p>
     *         The event stream for your service. A maximum of 100 of the latest
     *         events are displayed.
     *         </p>
     */
    public java.util.List<ServiceEvent> getEvents() {
        return events;
    }

    /**
     * <p>
     * The event stream for your service. A maximum of 100 of the latest events
     * are displayed.
     * </p>
     *
     * @param events <p>
     *            The event stream for your service. A maximum of 100 of the
     *            latest events are displayed.
     *            </p>
     */
    public void setEvents(java.util.Collection<ServiceEvent> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new java.util.ArrayList<ServiceEvent>(events);
    }

    /**
     * <p>
     * The event stream for your service. A maximum of 100 of the latest events
     * are displayed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param events <p>
     *            The event stream for your service. A maximum of 100 of the
     *            latest events are displayed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withEvents(ServiceEvent... events) {
        if (getEvents() == null) {
            this.events = new java.util.ArrayList<ServiceEvent>(events.length);
        }
        for (ServiceEvent value : events) {
            this.events.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The event stream for your service. A maximum of 100 of the latest events
     * are displayed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param events <p>
     *            The event stream for your service. A maximum of 100 of the
     *            latest events are displayed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withEvents(java.util.Collection<ServiceEvent> events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the service was created.
     * </p>
     *
     * @return <p>
     *         The Unix timestamp for when the service was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the service was created.
     * </p>
     *
     * @param createdAt <p>
     *            The Unix timestamp for when the service was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the service was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The Unix timestamp for when the service was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The placement constraints for the tasks in the service.
     * </p>
     *
     * @return <p>
     *         The placement constraints for the tasks in the service.
     *         </p>
     */
    public java.util.List<PlacementConstraint> getPlacementConstraints() {
        return placementConstraints;
    }

    /**
     * <p>
     * The placement constraints for the tasks in the service.
     * </p>
     *
     * @param placementConstraints <p>
     *            The placement constraints for the tasks in the service.
     *            </p>
     */
    public void setPlacementConstraints(
            java.util.Collection<PlacementConstraint> placementConstraints) {
        if (placementConstraints == null) {
            this.placementConstraints = null;
            return;
        }

        this.placementConstraints = new java.util.ArrayList<PlacementConstraint>(
                placementConstraints);
    }

    /**
     * <p>
     * The placement constraints for the tasks in the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param placementConstraints <p>
     *            The placement constraints for the tasks in the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withPlacementConstraints(PlacementConstraint... placementConstraints) {
        if (getPlacementConstraints() == null) {
            this.placementConstraints = new java.util.ArrayList<PlacementConstraint>(
                    placementConstraints.length);
        }
        for (PlacementConstraint value : placementConstraints) {
            this.placementConstraints.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The placement constraints for the tasks in the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param placementConstraints <p>
     *            The placement constraints for the tasks in the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withPlacementConstraints(
            java.util.Collection<PlacementConstraint> placementConstraints) {
        setPlacementConstraints(placementConstraints);
        return this;
    }

    /**
     * <p>
     * The placement strategy that determines how tasks for the service are
     * placed.
     * </p>
     *
     * @return <p>
     *         The placement strategy that determines how tasks for the service
     *         are placed.
     *         </p>
     */
    public java.util.List<PlacementStrategy> getPlacementStrategy() {
        return placementStrategy;
    }

    /**
     * <p>
     * The placement strategy that determines how tasks for the service are
     * placed.
     * </p>
     *
     * @param placementStrategy <p>
     *            The placement strategy that determines how tasks for the
     *            service are placed.
     *            </p>
     */
    public void setPlacementStrategy(java.util.Collection<PlacementStrategy> placementStrategy) {
        if (placementStrategy == null) {
            this.placementStrategy = null;
            return;
        }

        this.placementStrategy = new java.util.ArrayList<PlacementStrategy>(placementStrategy);
    }

    /**
     * <p>
     * The placement strategy that determines how tasks for the service are
     * placed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param placementStrategy <p>
     *            The placement strategy that determines how tasks for the
     *            service are placed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withPlacementStrategy(PlacementStrategy... placementStrategy) {
        if (getPlacementStrategy() == null) {
            this.placementStrategy = new java.util.ArrayList<PlacementStrategy>(
                    placementStrategy.length);
        }
        for (PlacementStrategy value : placementStrategy) {
            this.placementStrategy.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The placement strategy that determines how tasks for the service are
     * placed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param placementStrategy <p>
     *            The placement strategy that determines how tasks for the
     *            service are placed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withPlacementStrategy(java.util.Collection<PlacementStrategy> placementStrategy) {
        setPlacementStrategy(placementStrategy);
        return this;
    }

    /**
     * <p>
     * The VPC subnet and security group configuration for tasks that receive
     * their own elastic network interface by using the <code>awsvpc</code>
     * networking mode.
     * </p>
     *
     * @return <p>
     *         The VPC subnet and security group configuration for tasks that
     *         receive their own elastic network interface by using the
     *         <code>awsvpc</code> networking mode.
     *         </p>
     */
    public NetworkConfiguration getNetworkConfiguration() {
        return networkConfiguration;
    }

    /**
     * <p>
     * The VPC subnet and security group configuration for tasks that receive
     * their own elastic network interface by using the <code>awsvpc</code>
     * networking mode.
     * </p>
     *
     * @param networkConfiguration <p>
     *            The VPC subnet and security group configuration for tasks that
     *            receive their own elastic network interface by using the
     *            <code>awsvpc</code> networking mode.
     *            </p>
     */
    public void setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    /**
     * <p>
     * The VPC subnet and security group configuration for tasks that receive
     * their own elastic network interface by using the <code>awsvpc</code>
     * networking mode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkConfiguration <p>
     *            The VPC subnet and security group configuration for tasks that
     *            receive their own elastic network interface by using the
     *            <code>awsvpc</code> networking mode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }

    /**
     * <p>
     * The period of time, in seconds, that the Amazon ECS service scheduler
     * ignores unhealthy Elastic Load Balancing target health checks after a
     * task has first started.
     * </p>
     *
     * @return <p>
     *         The period of time, in seconds, that the Amazon ECS service
     *         scheduler ignores unhealthy Elastic Load Balancing target health
     *         checks after a task has first started.
     *         </p>
     */
    public Integer getHealthCheckGracePeriodSeconds() {
        return healthCheckGracePeriodSeconds;
    }

    /**
     * <p>
     * The period of time, in seconds, that the Amazon ECS service scheduler
     * ignores unhealthy Elastic Load Balancing target health checks after a
     * task has first started.
     * </p>
     *
     * @param healthCheckGracePeriodSeconds <p>
     *            The period of time, in seconds, that the Amazon ECS service
     *            scheduler ignores unhealthy Elastic Load Balancing target
     *            health checks after a task has first started.
     *            </p>
     */
    public void setHealthCheckGracePeriodSeconds(Integer healthCheckGracePeriodSeconds) {
        this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
    }

    /**
     * <p>
     * The period of time, in seconds, that the Amazon ECS service scheduler
     * ignores unhealthy Elastic Load Balancing target health checks after a
     * task has first started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param healthCheckGracePeriodSeconds <p>
     *            The period of time, in seconds, that the Amazon ECS service
     *            scheduler ignores unhealthy Elastic Load Balancing target
     *            health checks after a task has first started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withHealthCheckGracePeriodSeconds(Integer healthCheckGracePeriodSeconds) {
        this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
        return this;
    }

    /**
     * <p>
     * The scheduling strategy to use for the service. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html"
     * >Services</a>.
     * </p>
     * <p>
     * There are two service scheduler strategies available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLICA</code>-The replica scheduling strategy places and maintains
     * the desired number of tasks across your cluster. By default, the service
     * scheduler spreads tasks across Availability Zones. You can use task
     * placement strategies and constraints to customize task placement
     * decisions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAEMON</code>-The daemon scheduling strategy deploys exactly one
     * task on each active container instance that meets all of the task
     * placement constraints that you specify in your cluster. The service
     * scheduler also evaluates the task placement constraints for running tasks
     * and will stop tasks that do not meet the placement constraints.
     * </p>
     * <note>
     * <p>
     * Fargate tasks do not support the <code>DAEMON</code> scheduling strategy.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REPLICA, DAEMON
     *
     * @return <p>
     *         The scheduling strategy to use for the service. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html"
     *         >Services</a>.
     *         </p>
     *         <p>
     *         There are two service scheduler strategies available:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>REPLICA</code>-The replica scheduling strategy places and
     *         maintains the desired number of tasks across your cluster. By
     *         default, the service scheduler spreads tasks across Availability
     *         Zones. You can use task placement strategies and constraints to
     *         customize task placement decisions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DAEMON</code>-The daemon scheduling strategy deploys
     *         exactly one task on each active container instance that meets all
     *         of the task placement constraints that you specify in your
     *         cluster. The service scheduler also evaluates the task placement
     *         constraints for running tasks and will stop tasks that do not
     *         meet the placement constraints.
     *         </p>
     *         <note>
     *         <p>
     *         Fargate tasks do not support the <code>DAEMON</code> scheduling
     *         strategy.
     *         </p>
     *         </note></li>
     *         </ul>
     * @see SchedulingStrategy
     */
    public String getSchedulingStrategy() {
        return schedulingStrategy;
    }

    /**
     * <p>
     * The scheduling strategy to use for the service. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html"
     * >Services</a>.
     * </p>
     * <p>
     * There are two service scheduler strategies available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLICA</code>-The replica scheduling strategy places and maintains
     * the desired number of tasks across your cluster. By default, the service
     * scheduler spreads tasks across Availability Zones. You can use task
     * placement strategies and constraints to customize task placement
     * decisions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAEMON</code>-The daemon scheduling strategy deploys exactly one
     * task on each active container instance that meets all of the task
     * placement constraints that you specify in your cluster. The service
     * scheduler also evaluates the task placement constraints for running tasks
     * and will stop tasks that do not meet the placement constraints.
     * </p>
     * <note>
     * <p>
     * Fargate tasks do not support the <code>DAEMON</code> scheduling strategy.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REPLICA, DAEMON
     *
     * @param schedulingStrategy <p>
     *            The scheduling strategy to use for the service. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html"
     *            >Services</a>.
     *            </p>
     *            <p>
     *            There are two service scheduler strategies available:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>REPLICA</code>-The replica scheduling strategy places
     *            and maintains the desired number of tasks across your cluster.
     *            By default, the service scheduler spreads tasks across
     *            Availability Zones. You can use task placement strategies and
     *            constraints to customize task placement decisions.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DAEMON</code>-The daemon scheduling strategy deploys
     *            exactly one task on each active container instance that meets
     *            all of the task placement constraints that you specify in your
     *            cluster. The service scheduler also evaluates the task
     *            placement constraints for running tasks and will stop tasks
     *            that do not meet the placement constraints.
     *            </p>
     *            <note>
     *            <p>
     *            Fargate tasks do not support the <code>DAEMON</code>
     *            scheduling strategy.
     *            </p>
     *            </note></li>
     *            </ul>
     * @see SchedulingStrategy
     */
    public void setSchedulingStrategy(String schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy;
    }

    /**
     * <p>
     * The scheduling strategy to use for the service. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html"
     * >Services</a>.
     * </p>
     * <p>
     * There are two service scheduler strategies available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLICA</code>-The replica scheduling strategy places and maintains
     * the desired number of tasks across your cluster. By default, the service
     * scheduler spreads tasks across Availability Zones. You can use task
     * placement strategies and constraints to customize task placement
     * decisions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAEMON</code>-The daemon scheduling strategy deploys exactly one
     * task on each active container instance that meets all of the task
     * placement constraints that you specify in your cluster. The service
     * scheduler also evaluates the task placement constraints for running tasks
     * and will stop tasks that do not meet the placement constraints.
     * </p>
     * <note>
     * <p>
     * Fargate tasks do not support the <code>DAEMON</code> scheduling strategy.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REPLICA, DAEMON
     *
     * @param schedulingStrategy <p>
     *            The scheduling strategy to use for the service. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html"
     *            >Services</a>.
     *            </p>
     *            <p>
     *            There are two service scheduler strategies available:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>REPLICA</code>-The replica scheduling strategy places
     *            and maintains the desired number of tasks across your cluster.
     *            By default, the service scheduler spreads tasks across
     *            Availability Zones. You can use task placement strategies and
     *            constraints to customize task placement decisions.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DAEMON</code>-The daemon scheduling strategy deploys
     *            exactly one task on each active container instance that meets
     *            all of the task placement constraints that you specify in your
     *            cluster. The service scheduler also evaluates the task
     *            placement constraints for running tasks and will stop tasks
     *            that do not meet the placement constraints.
     *            </p>
     *            <note>
     *            <p>
     *            Fargate tasks do not support the <code>DAEMON</code>
     *            scheduling strategy.
     *            </p>
     *            </note></li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SchedulingStrategy
     */
    public Service withSchedulingStrategy(String schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy;
        return this;
    }

    /**
     * <p>
     * The scheduling strategy to use for the service. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html"
     * >Services</a>.
     * </p>
     * <p>
     * There are two service scheduler strategies available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLICA</code>-The replica scheduling strategy places and maintains
     * the desired number of tasks across your cluster. By default, the service
     * scheduler spreads tasks across Availability Zones. You can use task
     * placement strategies and constraints to customize task placement
     * decisions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAEMON</code>-The daemon scheduling strategy deploys exactly one
     * task on each active container instance that meets all of the task
     * placement constraints that you specify in your cluster. The service
     * scheduler also evaluates the task placement constraints for running tasks
     * and will stop tasks that do not meet the placement constraints.
     * </p>
     * <note>
     * <p>
     * Fargate tasks do not support the <code>DAEMON</code> scheduling strategy.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REPLICA, DAEMON
     *
     * @param schedulingStrategy <p>
     *            The scheduling strategy to use for the service. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html"
     *            >Services</a>.
     *            </p>
     *            <p>
     *            There are two service scheduler strategies available:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>REPLICA</code>-The replica scheduling strategy places
     *            and maintains the desired number of tasks across your cluster.
     *            By default, the service scheduler spreads tasks across
     *            Availability Zones. You can use task placement strategies and
     *            constraints to customize task placement decisions.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DAEMON</code>-The daemon scheduling strategy deploys
     *            exactly one task on each active container instance that meets
     *            all of the task placement constraints that you specify in your
     *            cluster. The service scheduler also evaluates the task
     *            placement constraints for running tasks and will stop tasks
     *            that do not meet the placement constraints.
     *            </p>
     *            <note>
     *            <p>
     *            Fargate tasks do not support the <code>DAEMON</code>
     *            scheduling strategy.
     *            </p>
     *            </note></li>
     *            </ul>
     * @see SchedulingStrategy
     */
    public void setSchedulingStrategy(SchedulingStrategy schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy.toString();
    }

    /**
     * <p>
     * The scheduling strategy to use for the service. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html"
     * >Services</a>.
     * </p>
     * <p>
     * There are two service scheduler strategies available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLICA</code>-The replica scheduling strategy places and maintains
     * the desired number of tasks across your cluster. By default, the service
     * scheduler spreads tasks across Availability Zones. You can use task
     * placement strategies and constraints to customize task placement
     * decisions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAEMON</code>-The daemon scheduling strategy deploys exactly one
     * task on each active container instance that meets all of the task
     * placement constraints that you specify in your cluster. The service
     * scheduler also evaluates the task placement constraints for running tasks
     * and will stop tasks that do not meet the placement constraints.
     * </p>
     * <note>
     * <p>
     * Fargate tasks do not support the <code>DAEMON</code> scheduling strategy.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REPLICA, DAEMON
     *
     * @param schedulingStrategy <p>
     *            The scheduling strategy to use for the service. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html"
     *            >Services</a>.
     *            </p>
     *            <p>
     *            There are two service scheduler strategies available:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>REPLICA</code>-The replica scheduling strategy places
     *            and maintains the desired number of tasks across your cluster.
     *            By default, the service scheduler spreads tasks across
     *            Availability Zones. You can use task placement strategies and
     *            constraints to customize task placement decisions.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DAEMON</code>-The daemon scheduling strategy deploys
     *            exactly one task on each active container instance that meets
     *            all of the task placement constraints that you specify in your
     *            cluster. The service scheduler also evaluates the task
     *            placement constraints for running tasks and will stop tasks
     *            that do not meet the placement constraints.
     *            </p>
     *            <note>
     *            <p>
     *            Fargate tasks do not support the <code>DAEMON</code>
     *            scheduling strategy.
     *            </p>
     *            </note></li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SchedulingStrategy
     */
    public Service withSchedulingStrategy(SchedulingStrategy schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The deployment controller type the service is using. When using the
     * DescribeServices API, this field is omitted if the service is using the
     * <code>ECS</code> deployment controller type.
     * </p>
     *
     * @return <p>
     *         The deployment controller type the service is using. When using
     *         the DescribeServices API, this field is omitted if the service is
     *         using the <code>ECS</code> deployment controller type.
     *         </p>
     */
    public DeploymentController getDeploymentController() {
        return deploymentController;
    }

    /**
     * <p>
     * The deployment controller type the service is using. When using the
     * DescribeServices API, this field is omitted if the service is using the
     * <code>ECS</code> deployment controller type.
     * </p>
     *
     * @param deploymentController <p>
     *            The deployment controller type the service is using. When
     *            using the DescribeServices API, this field is omitted if the
     *            service is using the <code>ECS</code> deployment controller
     *            type.
     *            </p>
     */
    public void setDeploymentController(DeploymentController deploymentController) {
        this.deploymentController = deploymentController;
    }

    /**
     * <p>
     * The deployment controller type the service is using. When using the
     * DescribeServices API, this field is omitted if the service is using the
     * <code>ECS</code> deployment controller type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentController <p>
     *            The deployment controller type the service is using. When
     *            using the DescribeServices API, this field is omitted if the
     *            service is using the <code>ECS</code> deployment controller
     *            type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withDeploymentController(DeploymentController deploymentController) {
        this.deploymentController = deploymentController;
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to the service to help you categorize and
     * organize them. Each tag consists of a key and an optional value, both of
     * which you define.
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
     *         The metadata that you apply to the service to help you categorize
     *         and organize them. Each tag consists of a key and an optional
     *         value, both of which you define.
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
     * The metadata that you apply to the service to help you categorize and
     * organize them. Each tag consists of a key and an optional value, both of
     * which you define.
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
     *            The metadata that you apply to the service to help you
     *            categorize and organize them. Each tag consists of a key and
     *            an optional value, both of which you define.
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
     * The metadata that you apply to the service to help you categorize and
     * organize them. Each tag consists of a key and an optional value, both of
     * which you define.
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
     *            The metadata that you apply to the service to help you
     *            categorize and organize them. Each tag consists of a key and
     *            an optional value, both of which you define.
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
    public Service withTags(Tag... tags) {
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
     * The metadata that you apply to the service to help you categorize and
     * organize them. Each tag consists of a key and an optional value, both of
     * which you define.
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
     *            The metadata that you apply to the service to help you
     *            categorize and organize them. Each tag consists of a key and
     *            an optional value, both of which you define.
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
    public Service withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The principal that created the service.
     * </p>
     *
     * @return <p>
     *         The principal that created the service.
     *         </p>
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * <p>
     * The principal that created the service.
     * </p>
     *
     * @param createdBy <p>
     *            The principal that created the service.
     *            </p>
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The principal that created the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdBy <p>
     *            The principal that created the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable Amazon ECS managed tags for the tasks in the
     * service. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html"
     * >Tagging Your Amazon ECS Resources</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies whether to enable Amazon ECS managed tags for the tasks
     *         in the service. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html"
     *         >Tagging Your Amazon ECS Resources</a> in the <i>Amazon Elastic
     *         Container Service Developer Guide</i>.
     *         </p>
     */
    public Boolean isEnableECSManagedTags() {
        return enableECSManagedTags;
    }

    /**
     * <p>
     * Specifies whether to enable Amazon ECS managed tags for the tasks in the
     * service. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html"
     * >Tagging Your Amazon ECS Resources</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies whether to enable Amazon ECS managed tags for the tasks
     *         in the service. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html"
     *         >Tagging Your Amazon ECS Resources</a> in the <i>Amazon Elastic
     *         Container Service Developer Guide</i>.
     *         </p>
     */
    public Boolean getEnableECSManagedTags() {
        return enableECSManagedTags;
    }

    /**
     * <p>
     * Specifies whether to enable Amazon ECS managed tags for the tasks in the
     * service. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html"
     * >Tagging Your Amazon ECS Resources</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @param enableECSManagedTags <p>
     *            Specifies whether to enable Amazon ECS managed tags for the
     *            tasks in the service. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html"
     *            >Tagging Your Amazon ECS Resources</a> in the <i>Amazon
     *            Elastic Container Service Developer Guide</i>.
     *            </p>
     */
    public void setEnableECSManagedTags(Boolean enableECSManagedTags) {
        this.enableECSManagedTags = enableECSManagedTags;
    }

    /**
     * <p>
     * Specifies whether to enable Amazon ECS managed tags for the tasks in the
     * service. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html"
     * >Tagging Your Amazon ECS Resources</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableECSManagedTags <p>
     *            Specifies whether to enable Amazon ECS managed tags for the
     *            tasks in the service. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html"
     *            >Tagging Your Amazon ECS Resources</a> in the <i>Amazon
     *            Elastic Container Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withEnableECSManagedTags(Boolean enableECSManagedTags) {
        this.enableECSManagedTags = enableECSManagedTags;
        return this;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition or the
     * service to the task. If no value is specified, the tags are not
     * propagated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TASK_DEFINITION, SERVICE
     *
     * @return <p>
     *         Specifies whether to propagate the tags from the task definition
     *         or the service to the task. If no value is specified, the tags
     *         are not propagated.
     *         </p>
     * @see PropagateTags
     */
    public String getPropagateTags() {
        return propagateTags;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition or the
     * service to the task. If no value is specified, the tags are not
     * propagated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TASK_DEFINITION, SERVICE
     *
     * @param propagateTags <p>
     *            Specifies whether to propagate the tags from the task
     *            definition or the service to the task. If no value is
     *            specified, the tags are not propagated.
     *            </p>
     * @see PropagateTags
     */
    public void setPropagateTags(String propagateTags) {
        this.propagateTags = propagateTags;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition or the
     * service to the task. If no value is specified, the tags are not
     * propagated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TASK_DEFINITION, SERVICE
     *
     * @param propagateTags <p>
     *            Specifies whether to propagate the tags from the task
     *            definition or the service to the task. If no value is
     *            specified, the tags are not propagated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PropagateTags
     */
    public Service withPropagateTags(String propagateTags) {
        this.propagateTags = propagateTags;
        return this;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition or the
     * service to the task. If no value is specified, the tags are not
     * propagated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TASK_DEFINITION, SERVICE
     *
     * @param propagateTags <p>
     *            Specifies whether to propagate the tags from the task
     *            definition or the service to the task. If no value is
     *            specified, the tags are not propagated.
     *            </p>
     * @see PropagateTags
     */
    public void setPropagateTags(PropagateTags propagateTags) {
        this.propagateTags = propagateTags.toString();
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition or the
     * service to the task. If no value is specified, the tags are not
     * propagated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TASK_DEFINITION, SERVICE
     *
     * @param propagateTags <p>
     *            Specifies whether to propagate the tags from the task
     *            definition or the service to the task. If no value is
     *            specified, the tags are not propagated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PropagateTags
     */
    public Service withPropagateTags(PropagateTags propagateTags) {
        this.propagateTags = propagateTags.toString();
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
        if (getServiceArn() != null)
            sb.append("serviceArn: " + getServiceArn() + ",");
        if (getServiceName() != null)
            sb.append("serviceName: " + getServiceName() + ",");
        if (getClusterArn() != null)
            sb.append("clusterArn: " + getClusterArn() + ",");
        if (getLoadBalancers() != null)
            sb.append("loadBalancers: " + getLoadBalancers() + ",");
        if (getServiceRegistries() != null)
            sb.append("serviceRegistries: " + getServiceRegistries() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getDesiredCount() != null)
            sb.append("desiredCount: " + getDesiredCount() + ",");
        if (getRunningCount() != null)
            sb.append("runningCount: " + getRunningCount() + ",");
        if (getPendingCount() != null)
            sb.append("pendingCount: " + getPendingCount() + ",");
        if (getLaunchType() != null)
            sb.append("launchType: " + getLaunchType() + ",");
        if (getCapacityProviderStrategy() != null)
            sb.append("capacityProviderStrategy: " + getCapacityProviderStrategy() + ",");
        if (getPlatformVersion() != null)
            sb.append("platformVersion: " + getPlatformVersion() + ",");
        if (getTaskDefinition() != null)
            sb.append("taskDefinition: " + getTaskDefinition() + ",");
        if (getDeploymentConfiguration() != null)
            sb.append("deploymentConfiguration: " + getDeploymentConfiguration() + ",");
        if (getTaskSets() != null)
            sb.append("taskSets: " + getTaskSets() + ",");
        if (getDeployments() != null)
            sb.append("deployments: " + getDeployments() + ",");
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getEvents() != null)
            sb.append("events: " + getEvents() + ",");
        if (getCreatedAt() != null)
            sb.append("createdAt: " + getCreatedAt() + ",");
        if (getPlacementConstraints() != null)
            sb.append("placementConstraints: " + getPlacementConstraints() + ",");
        if (getPlacementStrategy() != null)
            sb.append("placementStrategy: " + getPlacementStrategy() + ",");
        if (getNetworkConfiguration() != null)
            sb.append("networkConfiguration: " + getNetworkConfiguration() + ",");
        if (getHealthCheckGracePeriodSeconds() != null)
            sb.append("healthCheckGracePeriodSeconds: " + getHealthCheckGracePeriodSeconds() + ",");
        if (getSchedulingStrategy() != null)
            sb.append("schedulingStrategy: " + getSchedulingStrategy() + ",");
        if (getDeploymentController() != null)
            sb.append("deploymentController: " + getDeploymentController() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getCreatedBy() != null)
            sb.append("createdBy: " + getCreatedBy() + ",");
        if (getEnableECSManagedTags() != null)
            sb.append("enableECSManagedTags: " + getEnableECSManagedTags() + ",");
        if (getPropagateTags() != null)
            sb.append("propagateTags: " + getPropagateTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceArn() == null) ? 0 : getServiceArn().hashCode());
        hashCode = prime * hashCode
                + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode
                + ((getLoadBalancers() == null) ? 0 : getLoadBalancers().hashCode());
        hashCode = prime * hashCode
                + ((getServiceRegistries() == null) ? 0 : getServiceRegistries().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getDesiredCount() == null) ? 0 : getDesiredCount().hashCode());
        hashCode = prime * hashCode
                + ((getRunningCount() == null) ? 0 : getRunningCount().hashCode());
        hashCode = prime * hashCode
                + ((getPendingCount() == null) ? 0 : getPendingCount().hashCode());
        hashCode = prime * hashCode + ((getLaunchType() == null) ? 0 : getLaunchType().hashCode());
        hashCode = prime
                * hashCode
                + ((getCapacityProviderStrategy() == null) ? 0 : getCapacityProviderStrategy()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode
                + ((getTaskDefinition() == null) ? 0 : getTaskDefinition().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeploymentConfiguration() == null) ? 0 : getDeploymentConfiguration()
                        .hashCode());
        hashCode = prime * hashCode + ((getTaskSets() == null) ? 0 : getTaskSets().hashCode());
        hashCode = prime * hashCode
                + ((getDeployments() == null) ? 0 : getDeployments().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getPlacementConstraints() == null) ? 0 : getPlacementConstraints().hashCode());
        hashCode = prime * hashCode
                + ((getPlacementStrategy() == null) ? 0 : getPlacementStrategy().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkConfiguration() == null) ? 0 : getNetworkConfiguration().hashCode());
        hashCode = prime
                * hashCode
                + ((getHealthCheckGracePeriodSeconds() == null) ? 0
                        : getHealthCheckGracePeriodSeconds().hashCode());
        hashCode = prime * hashCode
                + ((getSchedulingStrategy() == null) ? 0 : getSchedulingStrategy().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentController() == null) ? 0 : getDeploymentController().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode
                + ((getEnableECSManagedTags() == null) ? 0 : getEnableECSManagedTags().hashCode());
        hashCode = prime * hashCode
                + ((getPropagateTags() == null) ? 0 : getPropagateTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Service == false)
            return false;
        Service other = (Service) obj;

        if (other.getServiceArn() == null ^ this.getServiceArn() == null)
            return false;
        if (other.getServiceArn() != null
                && other.getServiceArn().equals(this.getServiceArn()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null
                && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null
                && other.getClusterArn().equals(this.getClusterArn()) == false)
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDesiredCount() == null ^ this.getDesiredCount() == null)
            return false;
        if (other.getDesiredCount() != null
                && other.getDesiredCount().equals(this.getDesiredCount()) == false)
            return false;
        if (other.getRunningCount() == null ^ this.getRunningCount() == null)
            return false;
        if (other.getRunningCount() != null
                && other.getRunningCount().equals(this.getRunningCount()) == false)
            return false;
        if (other.getPendingCount() == null ^ this.getPendingCount() == null)
            return false;
        if (other.getPendingCount() != null
                && other.getPendingCount().equals(this.getPendingCount()) == false)
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
        if (other.getTaskDefinition() == null ^ this.getTaskDefinition() == null)
            return false;
        if (other.getTaskDefinition() != null
                && other.getTaskDefinition().equals(this.getTaskDefinition()) == false)
            return false;
        if (other.getDeploymentConfiguration() == null ^ this.getDeploymentConfiguration() == null)
            return false;
        if (other.getDeploymentConfiguration() != null
                && other.getDeploymentConfiguration().equals(this.getDeploymentConfiguration()) == false)
            return false;
        if (other.getTaskSets() == null ^ this.getTaskSets() == null)
            return false;
        if (other.getTaskSets() != null && other.getTaskSets().equals(this.getTaskSets()) == false)
            return false;
        if (other.getDeployments() == null ^ this.getDeployments() == null)
            return false;
        if (other.getDeployments() != null
                && other.getDeployments().equals(this.getDeployments()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getPlacementConstraints() == null ^ this.getPlacementConstraints() == null)
            return false;
        if (other.getPlacementConstraints() != null
                && other.getPlacementConstraints().equals(this.getPlacementConstraints()) == false)
            return false;
        if (other.getPlacementStrategy() == null ^ this.getPlacementStrategy() == null)
            return false;
        if (other.getPlacementStrategy() != null
                && other.getPlacementStrategy().equals(this.getPlacementStrategy()) == false)
            return false;
        if (other.getNetworkConfiguration() == null ^ this.getNetworkConfiguration() == null)
            return false;
        if (other.getNetworkConfiguration() != null
                && other.getNetworkConfiguration().equals(this.getNetworkConfiguration()) == false)
            return false;
        if (other.getHealthCheckGracePeriodSeconds() == null
                ^ this.getHealthCheckGracePeriodSeconds() == null)
            return false;
        if (other.getHealthCheckGracePeriodSeconds() != null
                && other.getHealthCheckGracePeriodSeconds().equals(
                        this.getHealthCheckGracePeriodSeconds()) == false)
            return false;
        if (other.getSchedulingStrategy() == null ^ this.getSchedulingStrategy() == null)
            return false;
        if (other.getSchedulingStrategy() != null
                && other.getSchedulingStrategy().equals(this.getSchedulingStrategy()) == false)
            return false;
        if (other.getDeploymentController() == null ^ this.getDeploymentController() == null)
            return false;
        if (other.getDeploymentController() != null
                && other.getDeploymentController().equals(this.getDeploymentController()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null
                && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getEnableECSManagedTags() == null ^ this.getEnableECSManagedTags() == null)
            return false;
        if (other.getEnableECSManagedTags() != null
                && other.getEnableECSManagedTags().equals(this.getEnableECSManagedTags()) == false)
            return false;
        if (other.getPropagateTags() == null ^ this.getPropagateTags() == null)
            return false;
        if (other.getPropagateTags() != null
                && other.getPropagateTags().equals(this.getPropagateTags()) == false)
            return false;
        return true;
    }
}
