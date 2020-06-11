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
 * Runs and maintains a desired number of tasks from a specified task
 * definition. If the number of tasks running in a service drops below the
 * <code>desiredCount</code>, Amazon ECS runs another copy of the task in the
 * specified cluster. To update an existing service, see the UpdateService
 * action.
 * </p>
 * <p>
 * In addition to maintaining the desired count of tasks in your service, you
 * can optionally run your service behind one or more load balancers. The load
 * balancers distribute traffic across the tasks that are associated with the
 * service. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-load-balancing.html"
 * >Service Load Balancing</a> in the <i>Amazon Elastic Container Service
 * Developer Guide</i>.
 * </p>
 * <p>
 * Tasks for services that <i>do not</i> use a load balancer are considered
 * healthy if they're in the <code>RUNNING</code> state. Tasks for services that
 * <i>do</i> use a load balancer are considered healthy if they're in the
 * <code>RUNNING</code> state and the container instance that they're hosted on
 * is reported as healthy by the load balancer.
 * </p>
 * <p>
 * There are two service scheduler strategies available:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>REPLICA</code> - The replica scheduling strategy places and maintains
 * the desired number of tasks across your cluster. By default, the service
 * scheduler spreads tasks across Availability Zones. You can use task placement
 * strategies and constraints to customize task placement decisions. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html"
 * >Service Scheduler Concepts</a> in the <i>Amazon Elastic Container Service
 * Developer Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DAEMON</code> - The daemon scheduling strategy deploys exactly one task
 * on each active container instance that meets all of the task placement
 * constraints that you specify in your cluster. The service scheduler also
 * evaluates the task placement constraints for running tasks and will stop
 * tasks that do not meet the placement constraints. When using this strategy,
 * you don't need to specify a desired number of tasks, a task placement
 * strategy, or use Service Auto Scaling policies. For more information, see <a
 * href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html"
 * >Service Scheduler Concepts</a> in the <i>Amazon Elastic Container Service
 * Developer Guide</i>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can optionally specify a deployment configuration for your service. The
 * deployment is triggered by changing properties, such as the task definition
 * or the desired count of a service, with an <a>UpdateService</a> operation.
 * The default value for a replica service for
 * <code>minimumHealthyPercent</code> is 100%. The default value for a daemon
 * service for <code>minimumHealthyPercent</code> is 0%.
 * </p>
 * <p>
 * If a service is using the <code>ECS</code> deployment controller, the minimum
 * healthy percent represents a lower limit on the number of tasks in a service
 * that must remain in the <code>RUNNING</code> state during a deployment, as a
 * percentage of the desired number of tasks (rounded up to the nearest
 * integer), and while any container instances are in the <code>DRAINING</code>
 * state if the service contains tasks using the EC2 launch type. This parameter
 * enables you to deploy without using additional cluster capacity. For example,
 * if your service has a desired number of four tasks and a minimum healthy
 * percent of 50%, the scheduler might stop two existing tasks to free up
 * cluster capacity before starting two new tasks. Tasks for services that <i>do
 * not</i> use a load balancer are considered healthy if they're in the
 * <code>RUNNING</code> state. Tasks for services that <i>do</i> use a load
 * balancer are considered healthy if they're in the <code>RUNNING</code> state
 * and they're reported as healthy by the load balancer. The default value for
 * minimum healthy percent is 100%.
 * </p>
 * <p>
 * If a service is using the <code>ECS</code> deployment controller, the
 * <b>maximum percent</b> parameter represents an upper limit on the number of
 * tasks in a service that are allowed in the <code>RUNNING</code> or
 * <code>PENDING</code> state during a deployment, as a percentage of the
 * desired number of tasks (rounded down to the nearest integer), and while any
 * container instances are in the <code>DRAINING</code> state if the service
 * contains tasks using the EC2 launch type. This parameter enables you to
 * define the deployment batch size. For example, if your service has a desired
 * number of four tasks and a maximum percent value of 200%, the scheduler may
 * start four new tasks before stopping the four older tasks (provided that the
 * cluster resources required to do this are available). The default value for
 * maximum percent is 200%.
 * </p>
 * <p>
 * If a service is using either the <code>CODE_DEPLOY</code> or
 * <code>EXTERNAL</code> deployment controller types and tasks that use the EC2
 * launch type, the <b>minimum healthy percent</b> and <b>maximum percent</b>
 * values are used only to define the lower and upper limit on the number of the
 * tasks in the service that remain in the <code>RUNNING</code> state while the
 * container instances are in the <code>DRAINING</code> state. If the tasks in
 * the service use the Fargate launch type, the minimum healthy percent and
 * maximum percent values aren't used, although they're currently visible when
 * describing your service.
 * </p>
 * <p>
 * When creating a service that uses the <code>EXTERNAL</code> deployment
 * controller, you can specify only parameters that aren't controlled at the
 * task set level. The only required parameter is the service name. You control
 * your services using the <a>CreateTaskSet</a> operation. For more information,
 * see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html"
 * >Amazon ECS Deployment Types</a> in the <i>Amazon Elastic Container Service
 * Developer Guide</i>.
 * </p>
 * <p>
 * When the service scheduler launches new tasks, it determines task placement
 * in your cluster using the following logic:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Determine which of the container instances in your cluster can support your
 * service's task definition (for example, they have the required CPU, memory,
 * ports, and container instance attributes).
 * </p>
 * </li>
 * <li>
 * <p>
 * By default, the service scheduler attempts to balance tasks across
 * Availability Zones in this manner (although you can choose a different
 * placement strategy) with the <code>placementStrategy</code> parameter):
 * </p>
 * <ul>
 * <li>
 * <p>
 * Sort the valid container instances, giving priority to instances that have
 * the fewest number of running tasks for this service in their respective
 * Availability Zone. For example, if zone A has one running service task and
 * zones B and C each have zero, valid container instances in either zone B or C
 * are considered optimal for placement.
 * </p>
 * </li>
 * <li>
 * <p>
 * Place the new service task on a valid container instance in an optimal
 * Availability Zone (based on the previous steps), favoring container instances
 * with the fewest number of running tasks for this service.
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 */
public class CreateServiceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster on which
     * to run your service. If you do not specify a cluster, the default cluster
     * is assumed.
     * </p>
     */
    private String cluster;

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
     * The <code>family</code> and <code>revision</code> (
     * <code>family:revision</code>) or full ARN of the task definition to run
     * in your service. If a <code>revision</code> is not specified, the latest
     * <code>ACTIVE</code> revision is used.
     * </p>
     * <p>
     * A task definition must be specified if the service is using the
     * <code>ECS</code> deployment controller.
     * </p>
     */
    private String taskDefinition;

    /**
     * <p>
     * A load balancer object representing the load balancers to use with your
     * service. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-load-balancing.html"
     * >Service Load Balancing</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * If the service is using the rolling update (<code>ECS</code>) deployment
     * controller and using either an Application Load Balancer or Network Load
     * Balancer, you can specify multiple target groups to attach to the
     * service. The service-linked role is required for services that make use
     * of multiple target groups. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using-service-linked-roles.html"
     * >Using Service-Linked Roles for Amazon ECS</a> in the <i>Amazon Elastic
     * Container Service Developer Guide</i>.
     * </p>
     * <p>
     * If the service is using the <code>CODE_DEPLOY</code> deployment
     * controller, the service is required to use either an Application Load
     * Balancer or Network Load Balancer. When creating an AWS CodeDeploy
     * deployment group, you specify two target groups (referred to as a
     * <code>targetGroupPair</code>). During a deployment, AWS CodeDeploy
     * determines which task set in your service has the status
     * <code>PRIMARY</code> and associates one target group with it, and then
     * associates the other target group with the replacement task set. The load
     * balancer can also have up to two listeners: a required listener for
     * production traffic and an optional listener that allows you perform
     * validation tests with Lambda functions before routing production traffic
     * to it.
     * </p>
     * <p>
     * After you create a service using the <code>ECS</code> deployment
     * controller, the load balancer name or target group ARN, container name,
     * and container port specified in the service definition are immutable. If
     * you are using the <code>CODE_DEPLOY</code> deployment controller, these
     * values can be changed when updating the service.
     * </p>
     * <p>
     * For Application Load Balancers and Network Load Balancers, this object
     * must contain the load balancer target group ARN, the container name (as
     * it appears in a container definition), and the container port to access
     * from the load balancer. When a task from this service is placed on a
     * container instance, the container instance and port combination is
     * registered as a target in the target group specified here.
     * </p>
     * <p>
     * For Classic Load Balancers, this object must contain the load balancer
     * name, the container name (as it appears in a container definition), and
     * the container port to access from the load balancer. When a task from
     * this service is placed on a container instance, the container instance is
     * registered with the load balancer specified here.
     * </p>
     * <p>
     * Services with tasks that use the <code>awsvpc</code> network mode (for
     * example, those with the Fargate launch type) only support Application
     * Load Balancers and Network Load Balancers. Classic Load Balancers are not
     * supported. Also, when you create any target groups for these services,
     * you must choose <code>ip</code> as the target type, not
     * <code>instance</code>, because tasks that use the <code>awsvpc</code>
     * network mode are associated with an elastic network interface, not an
     * Amazon EC2 instance.
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
     * <note>
     * <p>
     * Service discovery is supported for Fargate tasks if you are using
     * platform version v1.1.0 or later. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     * >AWS Fargate Platform Versions</a>.
     * </p>
     * </note>
     */
    private java.util.List<ServiceRegistry> serviceRegistries;

    /**
     * <p>
     * The number of instantiations of the specified task definition to place
     * and keep running on your cluster.
     * </p>
     * <p>
     * This is required if <code>schedulingStrategy</code> is
     * <code>REPLICA</code> or is not specified. If
     * <code>schedulingStrategy</code> is <code>DAEMON</code> then this is not
     * required.
     * </p>
     */
    private Integer desiredCount;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. Up to 32 ASCII characters are allowed.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The launch type on which to run your service. For more information, see
     * <a href=
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
     * The capacity provider strategy to use for the service.
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
     * The platform version that your tasks in the service are running on. A
     * platform version is specified only for tasks using the Fargate launch
     * type. If one isn't specified, the <code>LATEST</code> platform version is
     * used by default. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     * >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     */
    private String platformVersion;

    /**
     * <p>
     * The name or full Amazon Resource Name (ARN) of the IAM role that allows
     * Amazon ECS to make calls to your load balancer on your behalf. This
     * parameter is only permitted if you are using a load balancer with your
     * service and your task definition does not use the <code>awsvpc</code>
     * network mode. If you specify the <code>role</code> parameter, you must
     * also specify a load balancer object with the <code>loadBalancers</code>
     * parameter.
     * </p>
     * <important>
     * <p>
     * If your account has already created the Amazon ECS service-linked role,
     * that role is used by default for your service unless you specify a role
     * here. The service-linked role is required if your task definition uses
     * the <code>awsvpc</code> network mode or if the service is configured to
     * use service discovery, an external deployment controller, multiple target
     * groups, or Elastic Inference accelerators in which case you should not
     * specify a role here. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using-service-linked-roles.html"
     * >Using Service-Linked Roles for Amazon ECS</a> in the <i>Amazon Elastic
     * Container Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * If your specified role has a path other than <code>/</code>, then you
     * must either specify the full role ARN (this is recommended) or prefix the
     * role name with the path. For example, if a role with the name
     * <code>bar</code> has a path of <code>/foo/</code> then you would specify
     * <code>/foo/bar</code> as the role name. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names"
     * >Friendly Names and Paths</a> in the <i>IAM User Guide</i>.
     * </p>
     */
    private String role;

    /**
     * <p>
     * Optional deployment parameters that control how many tasks run during the
     * deployment and the ordering of stopping and starting tasks.
     * </p>
     */
    private DeploymentConfiguration deploymentConfiguration;

    /**
     * <p>
     * An array of placement constraint objects to use for tasks in your
     * service. You can specify a maximum of 10 constraints per task (this limit
     * includes constraints in the task definition and those specified at
     * runtime).
     * </p>
     */
    private java.util.List<PlacementConstraint> placementConstraints;

    /**
     * <p>
     * The placement strategy objects to use for tasks in your service. You can
     * specify a maximum of five strategy rules per service.
     * </p>
     */
    private java.util.List<PlacementStrategy> placementStrategy;

    /**
     * <p>
     * The network configuration for the service. This parameter is required for
     * task definitions that use the <code>awsvpc</code> network mode to receive
     * their own elastic network interface, and it is not supported for other
     * network modes. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html"
     * >Task Networking</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     */
    private NetworkConfiguration networkConfiguration;

    /**
     * <p>
     * The period of time, in seconds, that the Amazon ECS service scheduler
     * should ignore unhealthy Elastic Load Balancing target health checks after
     * a task has first started. This is only used when your service is
     * configured to use a load balancer. If your service has a load balancer
     * defined and you don't specify a health check grace period value, the
     * default value of <code>0</code> is used.
     * </p>
     * <p>
     * If your service's tasks take a while to start and respond to Elastic Load
     * Balancing health checks, you can specify a health check grace period of
     * up to 2,147,483,647 seconds. During that time, the Amazon ECS service
     * scheduler ignores health check status. This grace period can prevent the
     * service scheduler from marking tasks as unhealthy and stopping them
     * before they have time to come up.
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
     * decisions. This scheduler strategy is required if the service is using
     * the <code>CODE_DEPLOY</code> or <code>EXTERNAL</code> deployment
     * controller types.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAEMON</code>-The daemon scheduling strategy deploys exactly one
     * task on each active container instance that meets all of the task
     * placement constraints that you specify in your cluster. The service
     * scheduler also evaluates the task placement constraints for running tasks
     * and will stop tasks that do not meet the placement constraints. When
     * you're using this strategy, you don't need to specify a desired number of
     * tasks, a task placement strategy, or use Service Auto Scaling policies.
     * </p>
     * <note>
     * <p>
     * Tasks using the Fargate launch type or the <code>CODE_DEPLOY</code> or
     * <code>EXTERNAL</code> deployment controller types don't support the
     * <code>DAEMON</code> scheduling strategy.
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
     * The deployment controller to use for the service.
     * </p>
     */
    private DeploymentController deploymentController;

    /**
     * <p>
     * The metadata that you apply to the service to help you categorize and
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
     * Specifies whether to enable Amazon ECS managed tags for the tasks within
     * the service. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html"
     * >Tagging Your Amazon ECS Resources</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     */
    private Boolean enableECSManagedTags;

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition or the
     * service to the tasks in the service. If no value is specified, the tags
     * are not propagated. Tags can only be propagated to the tasks within the
     * service during service creation. To add tags to a task after service
     * creation, use the <a>TagResource</a> API action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TASK_DEFINITION, SERVICE
     */
    private String propagateTags;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster on which
     * to run your service. If you do not specify a cluster, the default cluster
     * is assumed.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the cluster
     *         on which to run your service. If you do not specify a cluster,
     *         the default cluster is assumed.
     *         </p>
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster on which
     * to run your service. If you do not specify a cluster, the default cluster
     * is assumed.
     * </p>
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster on which to run your service. If you do not specify a
     *            cluster, the default cluster is assumed.
     *            </p>
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster on which
     * to run your service. If you do not specify a cluster, the default cluster
     * is assumed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster on which to run your service. If you do not specify a
     *            cluster, the default cluster is assumed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceRequest withCluster(String cluster) {
        this.cluster = cluster;
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
    public CreateServiceRequest withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (
     * <code>family:revision</code>) or full ARN of the task definition to run
     * in your service. If a <code>revision</code> is not specified, the latest
     * <code>ACTIVE</code> revision is used.
     * </p>
     * <p>
     * A task definition must be specified if the service is using the
     * <code>ECS</code> deployment controller.
     * </p>
     *
     * @return <p>
     *         The <code>family</code> and <code>revision</code> (
     *         <code>family:revision</code>) or full ARN of the task definition
     *         to run in your service. If a <code>revision</code> is not
     *         specified, the latest <code>ACTIVE</code> revision is used.
     *         </p>
     *         <p>
     *         A task definition must be specified if the service is using the
     *         <code>ECS</code> deployment controller.
     *         </p>
     */
    public String getTaskDefinition() {
        return taskDefinition;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (
     * <code>family:revision</code>) or full ARN of the task definition to run
     * in your service. If a <code>revision</code> is not specified, the latest
     * <code>ACTIVE</code> revision is used.
     * </p>
     * <p>
     * A task definition must be specified if the service is using the
     * <code>ECS</code> deployment controller.
     * </p>
     *
     * @param taskDefinition <p>
     *            The <code>family</code> and <code>revision</code> (
     *            <code>family:revision</code>) or full ARN of the task
     *            definition to run in your service. If a <code>revision</code>
     *            is not specified, the latest <code>ACTIVE</code> revision is
     *            used.
     *            </p>
     *            <p>
     *            A task definition must be specified if the service is using
     *            the <code>ECS</code> deployment controller.
     *            </p>
     */
    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (
     * <code>family:revision</code>) or full ARN of the task definition to run
     * in your service. If a <code>revision</code> is not specified, the latest
     * <code>ACTIVE</code> revision is used.
     * </p>
     * <p>
     * A task definition must be specified if the service is using the
     * <code>ECS</code> deployment controller.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskDefinition <p>
     *            The <code>family</code> and <code>revision</code> (
     *            <code>family:revision</code>) or full ARN of the task
     *            definition to run in your service. If a <code>revision</code>
     *            is not specified, the latest <code>ACTIVE</code> revision is
     *            used.
     *            </p>
     *            <p>
     *            A task definition must be specified if the service is using
     *            the <code>ECS</code> deployment controller.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceRequest withTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
        return this;
    }

    /**
     * <p>
     * A load balancer object representing the load balancers to use with your
     * service. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-load-balancing.html"
     * >Service Load Balancing</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * If the service is using the rolling update (<code>ECS</code>) deployment
     * controller and using either an Application Load Balancer or Network Load
     * Balancer, you can specify multiple target groups to attach to the
     * service. The service-linked role is required for services that make use
     * of multiple target groups. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using-service-linked-roles.html"
     * >Using Service-Linked Roles for Amazon ECS</a> in the <i>Amazon Elastic
     * Container Service Developer Guide</i>.
     * </p>
     * <p>
     * If the service is using the <code>CODE_DEPLOY</code> deployment
     * controller, the service is required to use either an Application Load
     * Balancer or Network Load Balancer. When creating an AWS CodeDeploy
     * deployment group, you specify two target groups (referred to as a
     * <code>targetGroupPair</code>). During a deployment, AWS CodeDeploy
     * determines which task set in your service has the status
     * <code>PRIMARY</code> and associates one target group with it, and then
     * associates the other target group with the replacement task set. The load
     * balancer can also have up to two listeners: a required listener for
     * production traffic and an optional listener that allows you perform
     * validation tests with Lambda functions before routing production traffic
     * to it.
     * </p>
     * <p>
     * After you create a service using the <code>ECS</code> deployment
     * controller, the load balancer name or target group ARN, container name,
     * and container port specified in the service definition are immutable. If
     * you are using the <code>CODE_DEPLOY</code> deployment controller, these
     * values can be changed when updating the service.
     * </p>
     * <p>
     * For Application Load Balancers and Network Load Balancers, this object
     * must contain the load balancer target group ARN, the container name (as
     * it appears in a container definition), and the container port to access
     * from the load balancer. When a task from this service is placed on a
     * container instance, the container instance and port combination is
     * registered as a target in the target group specified here.
     * </p>
     * <p>
     * For Classic Load Balancers, this object must contain the load balancer
     * name, the container name (as it appears in a container definition), and
     * the container port to access from the load balancer. When a task from
     * this service is placed on a container instance, the container instance is
     * registered with the load balancer specified here.
     * </p>
     * <p>
     * Services with tasks that use the <code>awsvpc</code> network mode (for
     * example, those with the Fargate launch type) only support Application
     * Load Balancers and Network Load Balancers. Classic Load Balancers are not
     * supported. Also, when you create any target groups for these services,
     * you must choose <code>ip</code> as the target type, not
     * <code>instance</code>, because tasks that use the <code>awsvpc</code>
     * network mode are associated with an elastic network interface, not an
     * Amazon EC2 instance.
     * </p>
     *
     * @return <p>
     *         A load balancer object representing the load balancers to use
     *         with your service. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-load-balancing.html"
     *         >Service Load Balancing</a> in the <i>Amazon Elastic Container
     *         Service Developer Guide</i>.
     *         </p>
     *         <p>
     *         If the service is using the rolling update (<code>ECS</code>)
     *         deployment controller and using either an Application Load
     *         Balancer or Network Load Balancer, you can specify multiple
     *         target groups to attach to the service. The service-linked role
     *         is required for services that make use of multiple target groups.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using-service-linked-roles.html"
     *         >Using Service-Linked Roles for Amazon ECS</a> in the <i>Amazon
     *         Elastic Container Service Developer Guide</i>.
     *         </p>
     *         <p>
     *         If the service is using the <code>CODE_DEPLOY</code> deployment
     *         controller, the service is required to use either an Application
     *         Load Balancer or Network Load Balancer. When creating an AWS
     *         CodeDeploy deployment group, you specify two target groups
     *         (referred to as a <code>targetGroupPair</code>). During a
     *         deployment, AWS CodeDeploy determines which task set in your
     *         service has the status <code>PRIMARY</code> and associates one
     *         target group with it, and then associates the other target group
     *         with the replacement task set. The load balancer can also have up
     *         to two listeners: a required listener for production traffic and
     *         an optional listener that allows you perform validation tests
     *         with Lambda functions before routing production traffic to it.
     *         </p>
     *         <p>
     *         After you create a service using the <code>ECS</code> deployment
     *         controller, the load balancer name or target group ARN, container
     *         name, and container port specified in the service definition are
     *         immutable. If you are using the <code>CODE_DEPLOY</code>
     *         deployment controller, these values can be changed when updating
     *         the service.
     *         </p>
     *         <p>
     *         For Application Load Balancers and Network Load Balancers, this
     *         object must contain the load balancer target group ARN, the
     *         container name (as it appears in a container definition), and the
     *         container port to access from the load balancer. When a task from
     *         this service is placed on a container instance, the container
     *         instance and port combination is registered as a target in the
     *         target group specified here.
     *         </p>
     *         <p>
     *         For Classic Load Balancers, this object must contain the load
     *         balancer name, the container name (as it appears in a container
     *         definition), and the container port to access from the load
     *         balancer. When a task from this service is placed on a container
     *         instance, the container instance is registered with the load
     *         balancer specified here.
     *         </p>
     *         <p>
     *         Services with tasks that use the <code>awsvpc</code> network mode
     *         (for example, those with the Fargate launch type) only support
     *         Application Load Balancers and Network Load Balancers. Classic
     *         Load Balancers are not supported. Also, when you create any
     *         target groups for these services, you must choose <code>ip</code>
     *         as the target type, not <code>instance</code>, because tasks that
     *         use the <code>awsvpc</code> network mode are associated with an
     *         elastic network interface, not an Amazon EC2 instance.
     *         </p>
     */
    public java.util.List<LoadBalancer> getLoadBalancers() {
        return loadBalancers;
    }

    /**
     * <p>
     * A load balancer object representing the load balancers to use with your
     * service. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-load-balancing.html"
     * >Service Load Balancing</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * If the service is using the rolling update (<code>ECS</code>) deployment
     * controller and using either an Application Load Balancer or Network Load
     * Balancer, you can specify multiple target groups to attach to the
     * service. The service-linked role is required for services that make use
     * of multiple target groups. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using-service-linked-roles.html"
     * >Using Service-Linked Roles for Amazon ECS</a> in the <i>Amazon Elastic
     * Container Service Developer Guide</i>.
     * </p>
     * <p>
     * If the service is using the <code>CODE_DEPLOY</code> deployment
     * controller, the service is required to use either an Application Load
     * Balancer or Network Load Balancer. When creating an AWS CodeDeploy
     * deployment group, you specify two target groups (referred to as a
     * <code>targetGroupPair</code>). During a deployment, AWS CodeDeploy
     * determines which task set in your service has the status
     * <code>PRIMARY</code> and associates one target group with it, and then
     * associates the other target group with the replacement task set. The load
     * balancer can also have up to two listeners: a required listener for
     * production traffic and an optional listener that allows you perform
     * validation tests with Lambda functions before routing production traffic
     * to it.
     * </p>
     * <p>
     * After you create a service using the <code>ECS</code> deployment
     * controller, the load balancer name or target group ARN, container name,
     * and container port specified in the service definition are immutable. If
     * you are using the <code>CODE_DEPLOY</code> deployment controller, these
     * values can be changed when updating the service.
     * </p>
     * <p>
     * For Application Load Balancers and Network Load Balancers, this object
     * must contain the load balancer target group ARN, the container name (as
     * it appears in a container definition), and the container port to access
     * from the load balancer. When a task from this service is placed on a
     * container instance, the container instance and port combination is
     * registered as a target in the target group specified here.
     * </p>
     * <p>
     * For Classic Load Balancers, this object must contain the load balancer
     * name, the container name (as it appears in a container definition), and
     * the container port to access from the load balancer. When a task from
     * this service is placed on a container instance, the container instance is
     * registered with the load balancer specified here.
     * </p>
     * <p>
     * Services with tasks that use the <code>awsvpc</code> network mode (for
     * example, those with the Fargate launch type) only support Application
     * Load Balancers and Network Load Balancers. Classic Load Balancers are not
     * supported. Also, when you create any target groups for these services,
     * you must choose <code>ip</code> as the target type, not
     * <code>instance</code>, because tasks that use the <code>awsvpc</code>
     * network mode are associated with an elastic network interface, not an
     * Amazon EC2 instance.
     * </p>
     *
     * @param loadBalancers <p>
     *            A load balancer object representing the load balancers to use
     *            with your service. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-load-balancing.html"
     *            >Service Load Balancing</a> in the <i>Amazon Elastic Container
     *            Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            If the service is using the rolling update (<code>ECS</code>)
     *            deployment controller and using either an Application Load
     *            Balancer or Network Load Balancer, you can specify multiple
     *            target groups to attach to the service. The service-linked
     *            role is required for services that make use of multiple target
     *            groups. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using-service-linked-roles.html"
     *            >Using Service-Linked Roles for Amazon ECS</a> in the
     *            <i>Amazon Elastic Container Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            If the service is using the <code>CODE_DEPLOY</code>
     *            deployment controller, the service is required to use either
     *            an Application Load Balancer or Network Load Balancer. When
     *            creating an AWS CodeDeploy deployment group, you specify two
     *            target groups (referred to as a <code>targetGroupPair</code>).
     *            During a deployment, AWS CodeDeploy determines which task set
     *            in your service has the status <code>PRIMARY</code> and
     *            associates one target group with it, and then associates the
     *            other target group with the replacement task set. The load
     *            balancer can also have up to two listeners: a required
     *            listener for production traffic and an optional listener that
     *            allows you perform validation tests with Lambda functions
     *            before routing production traffic to it.
     *            </p>
     *            <p>
     *            After you create a service using the <code>ECS</code>
     *            deployment controller, the load balancer name or target group
     *            ARN, container name, and container port specified in the
     *            service definition are immutable. If you are using the
     *            <code>CODE_DEPLOY</code> deployment controller, these values
     *            can be changed when updating the service.
     *            </p>
     *            <p>
     *            For Application Load Balancers and Network Load Balancers,
     *            this object must contain the load balancer target group ARN,
     *            the container name (as it appears in a container definition),
     *            and the container port to access from the load balancer. When
     *            a task from this service is placed on a container instance,
     *            the container instance and port combination is registered as a
     *            target in the target group specified here.
     *            </p>
     *            <p>
     *            For Classic Load Balancers, this object must contain the load
     *            balancer name, the container name (as it appears in a
     *            container definition), and the container port to access from
     *            the load balancer. When a task from this service is placed on
     *            a container instance, the container instance is registered
     *            with the load balancer specified here.
     *            </p>
     *            <p>
     *            Services with tasks that use the <code>awsvpc</code> network
     *            mode (for example, those with the Fargate launch type) only
     *            support Application Load Balancers and Network Load Balancers.
     *            Classic Load Balancers are not supported. Also, when you
     *            create any target groups for these services, you must choose
     *            <code>ip</code> as the target type, not <code>instance</code>,
     *            because tasks that use the <code>awsvpc</code> network mode
     *            are associated with an elastic network interface, not an
     *            Amazon EC2 instance.
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
     * A load balancer object representing the load balancers to use with your
     * service. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-load-balancing.html"
     * >Service Load Balancing</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * If the service is using the rolling update (<code>ECS</code>) deployment
     * controller and using either an Application Load Balancer or Network Load
     * Balancer, you can specify multiple target groups to attach to the
     * service. The service-linked role is required for services that make use
     * of multiple target groups. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using-service-linked-roles.html"
     * >Using Service-Linked Roles for Amazon ECS</a> in the <i>Amazon Elastic
     * Container Service Developer Guide</i>.
     * </p>
     * <p>
     * If the service is using the <code>CODE_DEPLOY</code> deployment
     * controller, the service is required to use either an Application Load
     * Balancer or Network Load Balancer. When creating an AWS CodeDeploy
     * deployment group, you specify two target groups (referred to as a
     * <code>targetGroupPair</code>). During a deployment, AWS CodeDeploy
     * determines which task set in your service has the status
     * <code>PRIMARY</code> and associates one target group with it, and then
     * associates the other target group with the replacement task set. The load
     * balancer can also have up to two listeners: a required listener for
     * production traffic and an optional listener that allows you perform
     * validation tests with Lambda functions before routing production traffic
     * to it.
     * </p>
     * <p>
     * After you create a service using the <code>ECS</code> deployment
     * controller, the load balancer name or target group ARN, container name,
     * and container port specified in the service definition are immutable. If
     * you are using the <code>CODE_DEPLOY</code> deployment controller, these
     * values can be changed when updating the service.
     * </p>
     * <p>
     * For Application Load Balancers and Network Load Balancers, this object
     * must contain the load balancer target group ARN, the container name (as
     * it appears in a container definition), and the container port to access
     * from the load balancer. When a task from this service is placed on a
     * container instance, the container instance and port combination is
     * registered as a target in the target group specified here.
     * </p>
     * <p>
     * For Classic Load Balancers, this object must contain the load balancer
     * name, the container name (as it appears in a container definition), and
     * the container port to access from the load balancer. When a task from
     * this service is placed on a container instance, the container instance is
     * registered with the load balancer specified here.
     * </p>
     * <p>
     * Services with tasks that use the <code>awsvpc</code> network mode (for
     * example, those with the Fargate launch type) only support Application
     * Load Balancers and Network Load Balancers. Classic Load Balancers are not
     * supported. Also, when you create any target groups for these services,
     * you must choose <code>ip</code> as the target type, not
     * <code>instance</code>, because tasks that use the <code>awsvpc</code>
     * network mode are associated with an elastic network interface, not an
     * Amazon EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancers <p>
     *            A load balancer object representing the load balancers to use
     *            with your service. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-load-balancing.html"
     *            >Service Load Balancing</a> in the <i>Amazon Elastic Container
     *            Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            If the service is using the rolling update (<code>ECS</code>)
     *            deployment controller and using either an Application Load
     *            Balancer or Network Load Balancer, you can specify multiple
     *            target groups to attach to the service. The service-linked
     *            role is required for services that make use of multiple target
     *            groups. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using-service-linked-roles.html"
     *            >Using Service-Linked Roles for Amazon ECS</a> in the
     *            <i>Amazon Elastic Container Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            If the service is using the <code>CODE_DEPLOY</code>
     *            deployment controller, the service is required to use either
     *            an Application Load Balancer or Network Load Balancer. When
     *            creating an AWS CodeDeploy deployment group, you specify two
     *            target groups (referred to as a <code>targetGroupPair</code>).
     *            During a deployment, AWS CodeDeploy determines which task set
     *            in your service has the status <code>PRIMARY</code> and
     *            associates one target group with it, and then associates the
     *            other target group with the replacement task set. The load
     *            balancer can also have up to two listeners: a required
     *            listener for production traffic and an optional listener that
     *            allows you perform validation tests with Lambda functions
     *            before routing production traffic to it.
     *            </p>
     *            <p>
     *            After you create a service using the <code>ECS</code>
     *            deployment controller, the load balancer name or target group
     *            ARN, container name, and container port specified in the
     *            service definition are immutable. If you are using the
     *            <code>CODE_DEPLOY</code> deployment controller, these values
     *            can be changed when updating the service.
     *            </p>
     *            <p>
     *            For Application Load Balancers and Network Load Balancers,
     *            this object must contain the load balancer target group ARN,
     *            the container name (as it appears in a container definition),
     *            and the container port to access from the load balancer. When
     *            a task from this service is placed on a container instance,
     *            the container instance and port combination is registered as a
     *            target in the target group specified here.
     *            </p>
     *            <p>
     *            For Classic Load Balancers, this object must contain the load
     *            balancer name, the container name (as it appears in a
     *            container definition), and the container port to access from
     *            the load balancer. When a task from this service is placed on
     *            a container instance, the container instance is registered
     *            with the load balancer specified here.
     *            </p>
     *            <p>
     *            Services with tasks that use the <code>awsvpc</code> network
     *            mode (for example, those with the Fargate launch type) only
     *            support Application Load Balancers and Network Load Balancers.
     *            Classic Load Balancers are not supported. Also, when you
     *            create any target groups for these services, you must choose
     *            <code>ip</code> as the target type, not <code>instance</code>,
     *            because tasks that use the <code>awsvpc</code> network mode
     *            are associated with an elastic network interface, not an
     *            Amazon EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceRequest withLoadBalancers(LoadBalancer... loadBalancers) {
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
     * A load balancer object representing the load balancers to use with your
     * service. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-load-balancing.html"
     * >Service Load Balancing</a> in the <i>Amazon Elastic Container Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * If the service is using the rolling update (<code>ECS</code>) deployment
     * controller and using either an Application Load Balancer or Network Load
     * Balancer, you can specify multiple target groups to attach to the
     * service. The service-linked role is required for services that make use
     * of multiple target groups. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using-service-linked-roles.html"
     * >Using Service-Linked Roles for Amazon ECS</a> in the <i>Amazon Elastic
     * Container Service Developer Guide</i>.
     * </p>
     * <p>
     * If the service is using the <code>CODE_DEPLOY</code> deployment
     * controller, the service is required to use either an Application Load
     * Balancer or Network Load Balancer. When creating an AWS CodeDeploy
     * deployment group, you specify two target groups (referred to as a
     * <code>targetGroupPair</code>). During a deployment, AWS CodeDeploy
     * determines which task set in your service has the status
     * <code>PRIMARY</code> and associates one target group with it, and then
     * associates the other target group with the replacement task set. The load
     * balancer can also have up to two listeners: a required listener for
     * production traffic and an optional listener that allows you perform
     * validation tests with Lambda functions before routing production traffic
     * to it.
     * </p>
     * <p>
     * After you create a service using the <code>ECS</code> deployment
     * controller, the load balancer name or target group ARN, container name,
     * and container port specified in the service definition are immutable. If
     * you are using the <code>CODE_DEPLOY</code> deployment controller, these
     * values can be changed when updating the service.
     * </p>
     * <p>
     * For Application Load Balancers and Network Load Balancers, this object
     * must contain the load balancer target group ARN, the container name (as
     * it appears in a container definition), and the container port to access
     * from the load balancer. When a task from this service is placed on a
     * container instance, the container instance and port combination is
     * registered as a target in the target group specified here.
     * </p>
     * <p>
     * For Classic Load Balancers, this object must contain the load balancer
     * name, the container name (as it appears in a container definition), and
     * the container port to access from the load balancer. When a task from
     * this service is placed on a container instance, the container instance is
     * registered with the load balancer specified here.
     * </p>
     * <p>
     * Services with tasks that use the <code>awsvpc</code> network mode (for
     * example, those with the Fargate launch type) only support Application
     * Load Balancers and Network Load Balancers. Classic Load Balancers are not
     * supported. Also, when you create any target groups for these services,
     * you must choose <code>ip</code> as the target type, not
     * <code>instance</code>, because tasks that use the <code>awsvpc</code>
     * network mode are associated with an elastic network interface, not an
     * Amazon EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancers <p>
     *            A load balancer object representing the load balancers to use
     *            with your service. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-load-balancing.html"
     *            >Service Load Balancing</a> in the <i>Amazon Elastic Container
     *            Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            If the service is using the rolling update (<code>ECS</code>)
     *            deployment controller and using either an Application Load
     *            Balancer or Network Load Balancer, you can specify multiple
     *            target groups to attach to the service. The service-linked
     *            role is required for services that make use of multiple target
     *            groups. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using-service-linked-roles.html"
     *            >Using Service-Linked Roles for Amazon ECS</a> in the
     *            <i>Amazon Elastic Container Service Developer Guide</i>.
     *            </p>
     *            <p>
     *            If the service is using the <code>CODE_DEPLOY</code>
     *            deployment controller, the service is required to use either
     *            an Application Load Balancer or Network Load Balancer. When
     *            creating an AWS CodeDeploy deployment group, you specify two
     *            target groups (referred to as a <code>targetGroupPair</code>).
     *            During a deployment, AWS CodeDeploy determines which task set
     *            in your service has the status <code>PRIMARY</code> and
     *            associates one target group with it, and then associates the
     *            other target group with the replacement task set. The load
     *            balancer can also have up to two listeners: a required
     *            listener for production traffic and an optional listener that
     *            allows you perform validation tests with Lambda functions
     *            before routing production traffic to it.
     *            </p>
     *            <p>
     *            After you create a service using the <code>ECS</code>
     *            deployment controller, the load balancer name or target group
     *            ARN, container name, and container port specified in the
     *            service definition are immutable. If you are using the
     *            <code>CODE_DEPLOY</code> deployment controller, these values
     *            can be changed when updating the service.
     *            </p>
     *            <p>
     *            For Application Load Balancers and Network Load Balancers,
     *            this object must contain the load balancer target group ARN,
     *            the container name (as it appears in a container definition),
     *            and the container port to access from the load balancer. When
     *            a task from this service is placed on a container instance,
     *            the container instance and port combination is registered as a
     *            target in the target group specified here.
     *            </p>
     *            <p>
     *            For Classic Load Balancers, this object must contain the load
     *            balancer name, the container name (as it appears in a
     *            container definition), and the container port to access from
     *            the load balancer. When a task from this service is placed on
     *            a container instance, the container instance is registered
     *            with the load balancer specified here.
     *            </p>
     *            <p>
     *            Services with tasks that use the <code>awsvpc</code> network
     *            mode (for example, those with the Fargate launch type) only
     *            support Application Load Balancers and Network Load Balancers.
     *            Classic Load Balancers are not supported. Also, when you
     *            create any target groups for these services, you must choose
     *            <code>ip</code> as the target type, not <code>instance</code>,
     *            because tasks that use the <code>awsvpc</code> network mode
     *            are associated with an elastic network interface, not an
     *            Amazon EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceRequest withLoadBalancers(java.util.Collection<LoadBalancer> loadBalancers) {
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
     * <note>
     * <p>
     * Service discovery is supported for Fargate tasks if you are using
     * platform version v1.1.0 or later. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     * >AWS Fargate Platform Versions</a>.
     * </p>
     * </note>
     *
     * @return <p>
     *         The details of the service discovery registries to assign to this
     *         service. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html"
     *         >Service Discovery</a>.
     *         </p>
     *         <note>
     *         <p>
     *         Service discovery is supported for Fargate tasks if you are using
     *         platform version v1.1.0 or later. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     *         >AWS Fargate Platform Versions</a>.
     *         </p>
     *         </note>
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
     * <note>
     * <p>
     * Service discovery is supported for Fargate tasks if you are using
     * platform version v1.1.0 or later. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     * >AWS Fargate Platform Versions</a>.
     * </p>
     * </note>
     *
     * @param serviceRegistries <p>
     *            The details of the service discovery registries to assign to
     *            this service. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html"
     *            >Service Discovery</a>.
     *            </p>
     *            <note>
     *            <p>
     *            Service discovery is supported for Fargate tasks if you are
     *            using platform version v1.1.0 or later. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     *            >AWS Fargate Platform Versions</a>.
     *            </p>
     *            </note>
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
     * <note>
     * <p>
     * Service discovery is supported for Fargate tasks if you are using
     * platform version v1.1.0 or later. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     * >AWS Fargate Platform Versions</a>.
     * </p>
     * </note>
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
     *            <note>
     *            <p>
     *            Service discovery is supported for Fargate tasks if you are
     *            using platform version v1.1.0 or later. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     *            >AWS Fargate Platform Versions</a>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceRequest withServiceRegistries(ServiceRegistry... serviceRegistries) {
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
     * <note>
     * <p>
     * Service discovery is supported for Fargate tasks if you are using
     * platform version v1.1.0 or later. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     * >AWS Fargate Platform Versions</a>.
     * </p>
     * </note>
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
     *            <note>
     *            <p>
     *            Service discovery is supported for Fargate tasks if you are
     *            using platform version v1.1.0 or later. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     *            >AWS Fargate Platform Versions</a>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceRequest withServiceRegistries(
            java.util.Collection<ServiceRegistry> serviceRegistries) {
        setServiceRegistries(serviceRegistries);
        return this;
    }

    /**
     * <p>
     * The number of instantiations of the specified task definition to place
     * and keep running on your cluster.
     * </p>
     * <p>
     * This is required if <code>schedulingStrategy</code> is
     * <code>REPLICA</code> or is not specified. If
     * <code>schedulingStrategy</code> is <code>DAEMON</code> then this is not
     * required.
     * </p>
     *
     * @return <p>
     *         The number of instantiations of the specified task definition to
     *         place and keep running on your cluster.
     *         </p>
     *         <p>
     *         This is required if <code>schedulingStrategy</code> is
     *         <code>REPLICA</code> or is not specified. If
     *         <code>schedulingStrategy</code> is <code>DAEMON</code> then this
     *         is not required.
     *         </p>
     */
    public Integer getDesiredCount() {
        return desiredCount;
    }

    /**
     * <p>
     * The number of instantiations of the specified task definition to place
     * and keep running on your cluster.
     * </p>
     * <p>
     * This is required if <code>schedulingStrategy</code> is
     * <code>REPLICA</code> or is not specified. If
     * <code>schedulingStrategy</code> is <code>DAEMON</code> then this is not
     * required.
     * </p>
     *
     * @param desiredCount <p>
     *            The number of instantiations of the specified task definition
     *            to place and keep running on your cluster.
     *            </p>
     *            <p>
     *            This is required if <code>schedulingStrategy</code> is
     *            <code>REPLICA</code> or is not specified. If
     *            <code>schedulingStrategy</code> is <code>DAEMON</code> then
     *            this is not required.
     *            </p>
     */
    public void setDesiredCount(Integer desiredCount) {
        this.desiredCount = desiredCount;
    }

    /**
     * <p>
     * The number of instantiations of the specified task definition to place
     * and keep running on your cluster.
     * </p>
     * <p>
     * This is required if <code>schedulingStrategy</code> is
     * <code>REPLICA</code> or is not specified. If
     * <code>schedulingStrategy</code> is <code>DAEMON</code> then this is not
     * required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param desiredCount <p>
     *            The number of instantiations of the specified task definition
     *            to place and keep running on your cluster.
     *            </p>
     *            <p>
     *            This is required if <code>schedulingStrategy</code> is
     *            <code>REPLICA</code> or is not specified. If
     *            <code>schedulingStrategy</code> is <code>DAEMON</code> then
     *            this is not required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceRequest withDesiredCount(Integer desiredCount) {
        this.desiredCount = desiredCount;
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
    public CreateServiceRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The launch type on which to run your service. For more information, see
     * <a href=
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
     *         The launch type on which to run your service. For more
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
     * The launch type on which to run your service. For more information, see
     * <a href=
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
     *            The launch type on which to run your service. For more
     *            information, see <a href=
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
     * The launch type on which to run your service. For more information, see
     * <a href=
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
     *            The launch type on which to run your service. For more
     *            information, see <a href=
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
    public CreateServiceRequest withLaunchType(String launchType) {
        this.launchType = launchType;
        return this;
    }

    /**
     * <p>
     * The launch type on which to run your service. For more information, see
     * <a href=
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
     *            The launch type on which to run your service. For more
     *            information, see <a href=
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
     * The launch type on which to run your service. For more information, see
     * <a href=
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
     *            The launch type on which to run your service. For more
     *            information, see <a href=
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
    public CreateServiceRequest withLaunchType(LaunchType launchType) {
        this.launchType = launchType.toString();
        return this;
    }

    /**
     * <p>
     * The capacity provider strategy to use for the service.
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
     *         The capacity provider strategy to use for the service.
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
     * The capacity provider strategy to use for the service.
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
     *            The capacity provider strategy to use for the service.
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
     * The capacity provider strategy to use for the service.
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
     *            The capacity provider strategy to use for the service.
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
    public CreateServiceRequest withCapacityProviderStrategy(
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
     * The capacity provider strategy to use for the service.
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
     *            The capacity provider strategy to use for the service.
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
    public CreateServiceRequest withCapacityProviderStrategy(
            java.util.Collection<CapacityProviderStrategyItem> capacityProviderStrategy) {
        setCapacityProviderStrategy(capacityProviderStrategy);
        return this;
    }

    /**
     * <p>
     * The platform version that your tasks in the service are running on. A
     * platform version is specified only for tasks using the Fargate launch
     * type. If one isn't specified, the <code>LATEST</code> platform version is
     * used by default. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     * >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The platform version that your tasks in the service are running
     *         on. A platform version is specified only for tasks using the
     *         Fargate launch type. If one isn't specified, the
     *         <code>LATEST</code> platform version is used by default. For more
     *         information, see <a href=
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
     * The platform version that your tasks in the service are running on. A
     * platform version is specified only for tasks using the Fargate launch
     * type. If one isn't specified, the <code>LATEST</code> platform version is
     * used by default. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     * >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @param platformVersion <p>
     *            The platform version that your tasks in the service are
     *            running on. A platform version is specified only for tasks
     *            using the Fargate launch type. If one isn't specified, the
     *            <code>LATEST</code> platform version is used by default. For
     *            more information, see <a href=
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
     * The platform version that your tasks in the service are running on. A
     * platform version is specified only for tasks using the Fargate launch
     * type. If one isn't specified, the <code>LATEST</code> platform version is
     * used by default. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     * >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformVersion <p>
     *            The platform version that your tasks in the service are
     *            running on. A platform version is specified only for tasks
     *            using the Fargate launch type. If one isn't specified, the
     *            <code>LATEST</code> platform version is used by default. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     *            >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceRequest withPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
        return this;
    }

    /**
     * <p>
     * The name or full Amazon Resource Name (ARN) of the IAM role that allows
     * Amazon ECS to make calls to your load balancer on your behalf. This
     * parameter is only permitted if you are using a load balancer with your
     * service and your task definition does not use the <code>awsvpc</code>
     * network mode. If you specify the <code>role</code> parameter, you must
     * also specify a load balancer object with the <code>loadBalancers</code>
     * parameter.
     * </p>
     * <important>
     * <p>
     * If your account has already created the Amazon ECS service-linked role,
     * that role is used by default for your service unless you specify a role
     * here. The service-linked role is required if your task definition uses
     * the <code>awsvpc</code> network mode or if the service is configured to
     * use service discovery, an external deployment controller, multiple target
     * groups, or Elastic Inference accelerators in which case you should not
     * specify a role here. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using-service-linked-roles.html"
     * >Using Service-Linked Roles for Amazon ECS</a> in the <i>Amazon Elastic
     * Container Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * If your specified role has a path other than <code>/</code>, then you
     * must either specify the full role ARN (this is recommended) or prefix the
     * role name with the path. For example, if a role with the name
     * <code>bar</code> has a path of <code>/foo/</code> then you would specify
     * <code>/foo/bar</code> as the role name. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names"
     * >Friendly Names and Paths</a> in the <i>IAM User Guide</i>.
     * </p>
     *
     * @return <p>
     *         The name or full Amazon Resource Name (ARN) of the IAM role that
     *         allows Amazon ECS to make calls to your load balancer on your
     *         behalf. This parameter is only permitted if you are using a load
     *         balancer with your service and your task definition does not use
     *         the <code>awsvpc</code> network mode. If you specify the
     *         <code>role</code> parameter, you must also specify a load
     *         balancer object with the <code>loadBalancers</code> parameter.
     *         </p>
     *         <important>
     *         <p>
     *         If your account has already created the Amazon ECS service-linked
     *         role, that role is used by default for your service unless you
     *         specify a role here. The service-linked role is required if your
     *         task definition uses the <code>awsvpc</code> network mode or if
     *         the service is configured to use service discovery, an external
     *         deployment controller, multiple target groups, or Elastic
     *         Inference accelerators in which case you should not specify a
     *         role here. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using-service-linked-roles.html"
     *         >Using Service-Linked Roles for Amazon ECS</a> in the <i>Amazon
     *         Elastic Container Service Developer Guide</i>.
     *         </p>
     *         </important>
     *         <p>
     *         If your specified role has a path other than <code>/</code>, then
     *         you must either specify the full role ARN (this is recommended)
     *         or prefix the role name with the path. For example, if a role
     *         with the name <code>bar</code> has a path of <code>/foo/</code>
     *         then you would specify <code>/foo/bar</code> as the role name.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names"
     *         >Friendly Names and Paths</a> in the <i>IAM User Guide</i>.
     *         </p>
     */
    public String getRole() {
        return role;
    }

    /**
     * <p>
     * The name or full Amazon Resource Name (ARN) of the IAM role that allows
     * Amazon ECS to make calls to your load balancer on your behalf. This
     * parameter is only permitted if you are using a load balancer with your
     * service and your task definition does not use the <code>awsvpc</code>
     * network mode. If you specify the <code>role</code> parameter, you must
     * also specify a load balancer object with the <code>loadBalancers</code>
     * parameter.
     * </p>
     * <important>
     * <p>
     * If your account has already created the Amazon ECS service-linked role,
     * that role is used by default for your service unless you specify a role
     * here. The service-linked role is required if your task definition uses
     * the <code>awsvpc</code> network mode or if the service is configured to
     * use service discovery, an external deployment controller, multiple target
     * groups, or Elastic Inference accelerators in which case you should not
     * specify a role here. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using-service-linked-roles.html"
     * >Using Service-Linked Roles for Amazon ECS</a> in the <i>Amazon Elastic
     * Container Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * If your specified role has a path other than <code>/</code>, then you
     * must either specify the full role ARN (this is recommended) or prefix the
     * role name with the path. For example, if a role with the name
     * <code>bar</code> has a path of <code>/foo/</code> then you would specify
     * <code>/foo/bar</code> as the role name. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names"
     * >Friendly Names and Paths</a> in the <i>IAM User Guide</i>.
     * </p>
     *
     * @param role <p>
     *            The name or full Amazon Resource Name (ARN) of the IAM role
     *            that allows Amazon ECS to make calls to your load balancer on
     *            your behalf. This parameter is only permitted if you are using
     *            a load balancer with your service and your task definition
     *            does not use the <code>awsvpc</code> network mode. If you
     *            specify the <code>role</code> parameter, you must also specify
     *            a load balancer object with the <code>loadBalancers</code>
     *            parameter.
     *            </p>
     *            <important>
     *            <p>
     *            If your account has already created the Amazon ECS
     *            service-linked role, that role is used by default for your
     *            service unless you specify a role here. The service-linked
     *            role is required if your task definition uses the
     *            <code>awsvpc</code> network mode or if the service is
     *            configured to use service discovery, an external deployment
     *            controller, multiple target groups, or Elastic Inference
     *            accelerators in which case you should not specify a role here.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using-service-linked-roles.html"
     *            >Using Service-Linked Roles for Amazon ECS</a> in the
     *            <i>Amazon Elastic Container Service Developer Guide</i>.
     *            </p>
     *            </important>
     *            <p>
     *            If your specified role has a path other than <code>/</code>,
     *            then you must either specify the full role ARN (this is
     *            recommended) or prefix the role name with the path. For
     *            example, if a role with the name <code>bar</code> has a path
     *            of <code>/foo/</code> then you would specify
     *            <code>/foo/bar</code> as the role name. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names"
     *            >Friendly Names and Paths</a> in the <i>IAM User Guide</i>.
     *            </p>
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The name or full Amazon Resource Name (ARN) of the IAM role that allows
     * Amazon ECS to make calls to your load balancer on your behalf. This
     * parameter is only permitted if you are using a load balancer with your
     * service and your task definition does not use the <code>awsvpc</code>
     * network mode. If you specify the <code>role</code> parameter, you must
     * also specify a load balancer object with the <code>loadBalancers</code>
     * parameter.
     * </p>
     * <important>
     * <p>
     * If your account has already created the Amazon ECS service-linked role,
     * that role is used by default for your service unless you specify a role
     * here. The service-linked role is required if your task definition uses
     * the <code>awsvpc</code> network mode or if the service is configured to
     * use service discovery, an external deployment controller, multiple target
     * groups, or Elastic Inference accelerators in which case you should not
     * specify a role here. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using-service-linked-roles.html"
     * >Using Service-Linked Roles for Amazon ECS</a> in the <i>Amazon Elastic
     * Container Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * If your specified role has a path other than <code>/</code>, then you
     * must either specify the full role ARN (this is recommended) or prefix the
     * role name with the path. For example, if a role with the name
     * <code>bar</code> has a path of <code>/foo/</code> then you would specify
     * <code>/foo/bar</code> as the role name. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names"
     * >Friendly Names and Paths</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param role <p>
     *            The name or full Amazon Resource Name (ARN) of the IAM role
     *            that allows Amazon ECS to make calls to your load balancer on
     *            your behalf. This parameter is only permitted if you are using
     *            a load balancer with your service and your task definition
     *            does not use the <code>awsvpc</code> network mode. If you
     *            specify the <code>role</code> parameter, you must also specify
     *            a load balancer object with the <code>loadBalancers</code>
     *            parameter.
     *            </p>
     *            <important>
     *            <p>
     *            If your account has already created the Amazon ECS
     *            service-linked role, that role is used by default for your
     *            service unless you specify a role here. The service-linked
     *            role is required if your task definition uses the
     *            <code>awsvpc</code> network mode or if the service is
     *            configured to use service discovery, an external deployment
     *            controller, multiple target groups, or Elastic Inference
     *            accelerators in which case you should not specify a role here.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using-service-linked-roles.html"
     *            >Using Service-Linked Roles for Amazon ECS</a> in the
     *            <i>Amazon Elastic Container Service Developer Guide</i>.
     *            </p>
     *            </important>
     *            <p>
     *            If your specified role has a path other than <code>/</code>,
     *            then you must either specify the full role ARN (this is
     *            recommended) or prefix the role name with the path. For
     *            example, if a role with the name <code>bar</code> has a path
     *            of <code>/foo/</code> then you would specify
     *            <code>/foo/bar</code> as the role name. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names"
     *            >Friendly Names and Paths</a> in the <i>IAM User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceRequest withRole(String role) {
        this.role = role;
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
    public CreateServiceRequest withDeploymentConfiguration(
            DeploymentConfiguration deploymentConfiguration) {
        this.deploymentConfiguration = deploymentConfiguration;
        return this;
    }

    /**
     * <p>
     * An array of placement constraint objects to use for tasks in your
     * service. You can specify a maximum of 10 constraints per task (this limit
     * includes constraints in the task definition and those specified at
     * runtime).
     * </p>
     *
     * @return <p>
     *         An array of placement constraint objects to use for tasks in your
     *         service. You can specify a maximum of 10 constraints per task
     *         (this limit includes constraints in the task definition and those
     *         specified at runtime).
     *         </p>
     */
    public java.util.List<PlacementConstraint> getPlacementConstraints() {
        return placementConstraints;
    }

    /**
     * <p>
     * An array of placement constraint objects to use for tasks in your
     * service. You can specify a maximum of 10 constraints per task (this limit
     * includes constraints in the task definition and those specified at
     * runtime).
     * </p>
     *
     * @param placementConstraints <p>
     *            An array of placement constraint objects to use for tasks in
     *            your service. You can specify a maximum of 10 constraints per
     *            task (this limit includes constraints in the task definition
     *            and those specified at runtime).
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
     * An array of placement constraint objects to use for tasks in your
     * service. You can specify a maximum of 10 constraints per task (this limit
     * includes constraints in the task definition and those specified at
     * runtime).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param placementConstraints <p>
     *            An array of placement constraint objects to use for tasks in
     *            your service. You can specify a maximum of 10 constraints per
     *            task (this limit includes constraints in the task definition
     *            and those specified at runtime).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceRequest withPlacementConstraints(
            PlacementConstraint... placementConstraints) {
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
     * An array of placement constraint objects to use for tasks in your
     * service. You can specify a maximum of 10 constraints per task (this limit
     * includes constraints in the task definition and those specified at
     * runtime).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param placementConstraints <p>
     *            An array of placement constraint objects to use for tasks in
     *            your service. You can specify a maximum of 10 constraints per
     *            task (this limit includes constraints in the task definition
     *            and those specified at runtime).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceRequest withPlacementConstraints(
            java.util.Collection<PlacementConstraint> placementConstraints) {
        setPlacementConstraints(placementConstraints);
        return this;
    }

    /**
     * <p>
     * The placement strategy objects to use for tasks in your service. You can
     * specify a maximum of five strategy rules per service.
     * </p>
     *
     * @return <p>
     *         The placement strategy objects to use for tasks in your service.
     *         You can specify a maximum of five strategy rules per service.
     *         </p>
     */
    public java.util.List<PlacementStrategy> getPlacementStrategy() {
        return placementStrategy;
    }

    /**
     * <p>
     * The placement strategy objects to use for tasks in your service. You can
     * specify a maximum of five strategy rules per service.
     * </p>
     *
     * @param placementStrategy <p>
     *            The placement strategy objects to use for tasks in your
     *            service. You can specify a maximum of five strategy rules per
     *            service.
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
     * The placement strategy objects to use for tasks in your service. You can
     * specify a maximum of five strategy rules per service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param placementStrategy <p>
     *            The placement strategy objects to use for tasks in your
     *            service. You can specify a maximum of five strategy rules per
     *            service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceRequest withPlacementStrategy(PlacementStrategy... placementStrategy) {
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
     * The placement strategy objects to use for tasks in your service. You can
     * specify a maximum of five strategy rules per service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param placementStrategy <p>
     *            The placement strategy objects to use for tasks in your
     *            service. You can specify a maximum of five strategy rules per
     *            service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceRequest withPlacementStrategy(
            java.util.Collection<PlacementStrategy> placementStrategy) {
        setPlacementStrategy(placementStrategy);
        return this;
    }

    /**
     * <p>
     * The network configuration for the service. This parameter is required for
     * task definitions that use the <code>awsvpc</code> network mode to receive
     * their own elastic network interface, and it is not supported for other
     * network modes. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html"
     * >Task Networking</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         The network configuration for the service. This parameter is
     *         required for task definitions that use the <code>awsvpc</code>
     *         network mode to receive their own elastic network interface, and
     *         it is not supported for other network modes. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html"
     *         >Task Networking</a> in the <i>Amazon Elastic Container Service
     *         Developer Guide</i>.
     *         </p>
     */
    public NetworkConfiguration getNetworkConfiguration() {
        return networkConfiguration;
    }

    /**
     * <p>
     * The network configuration for the service. This parameter is required for
     * task definitions that use the <code>awsvpc</code> network mode to receive
     * their own elastic network interface, and it is not supported for other
     * network modes. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html"
     * >Task Networking</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     *
     * @param networkConfiguration <p>
     *            The network configuration for the service. This parameter is
     *            required for task definitions that use the <code>awsvpc</code>
     *            network mode to receive their own elastic network interface,
     *            and it is not supported for other network modes. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html"
     *            >Task Networking</a> in the <i>Amazon Elastic Container
     *            Service Developer Guide</i>.
     *            </p>
     */
    public void setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    /**
     * <p>
     * The network configuration for the service. This parameter is required for
     * task definitions that use the <code>awsvpc</code> network mode to receive
     * their own elastic network interface, and it is not supported for other
     * network modes. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html"
     * >Task Networking</a> in the <i>Amazon Elastic Container Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkConfiguration <p>
     *            The network configuration for the service. This parameter is
     *            required for task definitions that use the <code>awsvpc</code>
     *            network mode to receive their own elastic network interface,
     *            and it is not supported for other network modes. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html"
     *            >Task Networking</a> in the <i>Amazon Elastic Container
     *            Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceRequest withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }

    /**
     * <p>
     * The period of time, in seconds, that the Amazon ECS service scheduler
     * should ignore unhealthy Elastic Load Balancing target health checks after
     * a task has first started. This is only used when your service is
     * configured to use a load balancer. If your service has a load balancer
     * defined and you don't specify a health check grace period value, the
     * default value of <code>0</code> is used.
     * </p>
     * <p>
     * If your service's tasks take a while to start and respond to Elastic Load
     * Balancing health checks, you can specify a health check grace period of
     * up to 2,147,483,647 seconds. During that time, the Amazon ECS service
     * scheduler ignores health check status. This grace period can prevent the
     * service scheduler from marking tasks as unhealthy and stopping them
     * before they have time to come up.
     * </p>
     *
     * @return <p>
     *         The period of time, in seconds, that the Amazon ECS service
     *         scheduler should ignore unhealthy Elastic Load Balancing target
     *         health checks after a task has first started. This is only used
     *         when your service is configured to use a load balancer. If your
     *         service has a load balancer defined and you don't specify a
     *         health check grace period value, the default value of
     *         <code>0</code> is used.
     *         </p>
     *         <p>
     *         If your service's tasks take a while to start and respond to
     *         Elastic Load Balancing health checks, you can specify a health
     *         check grace period of up to 2,147,483,647 seconds. During that
     *         time, the Amazon ECS service scheduler ignores health check
     *         status. This grace period can prevent the service scheduler from
     *         marking tasks as unhealthy and stopping them before they have
     *         time to come up.
     *         </p>
     */
    public Integer getHealthCheckGracePeriodSeconds() {
        return healthCheckGracePeriodSeconds;
    }

    /**
     * <p>
     * The period of time, in seconds, that the Amazon ECS service scheduler
     * should ignore unhealthy Elastic Load Balancing target health checks after
     * a task has first started. This is only used when your service is
     * configured to use a load balancer. If your service has a load balancer
     * defined and you don't specify a health check grace period value, the
     * default value of <code>0</code> is used.
     * </p>
     * <p>
     * If your service's tasks take a while to start and respond to Elastic Load
     * Balancing health checks, you can specify a health check grace period of
     * up to 2,147,483,647 seconds. During that time, the Amazon ECS service
     * scheduler ignores health check status. This grace period can prevent the
     * service scheduler from marking tasks as unhealthy and stopping them
     * before they have time to come up.
     * </p>
     *
     * @param healthCheckGracePeriodSeconds <p>
     *            The period of time, in seconds, that the Amazon ECS service
     *            scheduler should ignore unhealthy Elastic Load Balancing
     *            target health checks after a task has first started. This is
     *            only used when your service is configured to use a load
     *            balancer. If your service has a load balancer defined and you
     *            don't specify a health check grace period value, the default
     *            value of <code>0</code> is used.
     *            </p>
     *            <p>
     *            If your service's tasks take a while to start and respond to
     *            Elastic Load Balancing health checks, you can specify a health
     *            check grace period of up to 2,147,483,647 seconds. During that
     *            time, the Amazon ECS service scheduler ignores health check
     *            status. This grace period can prevent the service scheduler
     *            from marking tasks as unhealthy and stopping them before they
     *            have time to come up.
     *            </p>
     */
    public void setHealthCheckGracePeriodSeconds(Integer healthCheckGracePeriodSeconds) {
        this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
    }

    /**
     * <p>
     * The period of time, in seconds, that the Amazon ECS service scheduler
     * should ignore unhealthy Elastic Load Balancing target health checks after
     * a task has first started. This is only used when your service is
     * configured to use a load balancer. If your service has a load balancer
     * defined and you don't specify a health check grace period value, the
     * default value of <code>0</code> is used.
     * </p>
     * <p>
     * If your service's tasks take a while to start and respond to Elastic Load
     * Balancing health checks, you can specify a health check grace period of
     * up to 2,147,483,647 seconds. During that time, the Amazon ECS service
     * scheduler ignores health check status. This grace period can prevent the
     * service scheduler from marking tasks as unhealthy and stopping them
     * before they have time to come up.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param healthCheckGracePeriodSeconds <p>
     *            The period of time, in seconds, that the Amazon ECS service
     *            scheduler should ignore unhealthy Elastic Load Balancing
     *            target health checks after a task has first started. This is
     *            only used when your service is configured to use a load
     *            balancer. If your service has a load balancer defined and you
     *            don't specify a health check grace period value, the default
     *            value of <code>0</code> is used.
     *            </p>
     *            <p>
     *            If your service's tasks take a while to start and respond to
     *            Elastic Load Balancing health checks, you can specify a health
     *            check grace period of up to 2,147,483,647 seconds. During that
     *            time, the Amazon ECS service scheduler ignores health check
     *            status. This grace period can prevent the service scheduler
     *            from marking tasks as unhealthy and stopping them before they
     *            have time to come up.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceRequest withHealthCheckGracePeriodSeconds(
            Integer healthCheckGracePeriodSeconds) {
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
     * decisions. This scheduler strategy is required if the service is using
     * the <code>CODE_DEPLOY</code> or <code>EXTERNAL</code> deployment
     * controller types.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAEMON</code>-The daemon scheduling strategy deploys exactly one
     * task on each active container instance that meets all of the task
     * placement constraints that you specify in your cluster. The service
     * scheduler also evaluates the task placement constraints for running tasks
     * and will stop tasks that do not meet the placement constraints. When
     * you're using this strategy, you don't need to specify a desired number of
     * tasks, a task placement strategy, or use Service Auto Scaling policies.
     * </p>
     * <note>
     * <p>
     * Tasks using the Fargate launch type or the <code>CODE_DEPLOY</code> or
     * <code>EXTERNAL</code> deployment controller types don't support the
     * <code>DAEMON</code> scheduling strategy.
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
     *         customize task placement decisions. This scheduler strategy is
     *         required if the service is using the <code>CODE_DEPLOY</code> or
     *         <code>EXTERNAL</code> deployment controller types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DAEMON</code>-The daemon scheduling strategy deploys
     *         exactly one task on each active container instance that meets all
     *         of the task placement constraints that you specify in your
     *         cluster. The service scheduler also evaluates the task placement
     *         constraints for running tasks and will stop tasks that do not
     *         meet the placement constraints. When you're using this strategy,
     *         you don't need to specify a desired number of tasks, a task
     *         placement strategy, or use Service Auto Scaling policies.
     *         </p>
     *         <note>
     *         <p>
     *         Tasks using the Fargate launch type or the
     *         <code>CODE_DEPLOY</code> or <code>EXTERNAL</code> deployment
     *         controller types don't support the <code>DAEMON</code> scheduling
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
     * decisions. This scheduler strategy is required if the service is using
     * the <code>CODE_DEPLOY</code> or <code>EXTERNAL</code> deployment
     * controller types.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAEMON</code>-The daemon scheduling strategy deploys exactly one
     * task on each active container instance that meets all of the task
     * placement constraints that you specify in your cluster. The service
     * scheduler also evaluates the task placement constraints for running tasks
     * and will stop tasks that do not meet the placement constraints. When
     * you're using this strategy, you don't need to specify a desired number of
     * tasks, a task placement strategy, or use Service Auto Scaling policies.
     * </p>
     * <note>
     * <p>
     * Tasks using the Fargate launch type or the <code>CODE_DEPLOY</code> or
     * <code>EXTERNAL</code> deployment controller types don't support the
     * <code>DAEMON</code> scheduling strategy.
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
     *            constraints to customize task placement decisions. This
     *            scheduler strategy is required if the service is using the
     *            <code>CODE_DEPLOY</code> or <code>EXTERNAL</code> deployment
     *            controller types.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DAEMON</code>-The daemon scheduling strategy deploys
     *            exactly one task on each active container instance that meets
     *            all of the task placement constraints that you specify in your
     *            cluster. The service scheduler also evaluates the task
     *            placement constraints for running tasks and will stop tasks
     *            that do not meet the placement constraints. When you're using
     *            this strategy, you don't need to specify a desired number of
     *            tasks, a task placement strategy, or use Service Auto Scaling
     *            policies.
     *            </p>
     *            <note>
     *            <p>
     *            Tasks using the Fargate launch type or the
     *            <code>CODE_DEPLOY</code> or <code>EXTERNAL</code> deployment
     *            controller types don't support the <code>DAEMON</code>
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
     * decisions. This scheduler strategy is required if the service is using
     * the <code>CODE_DEPLOY</code> or <code>EXTERNAL</code> deployment
     * controller types.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAEMON</code>-The daemon scheduling strategy deploys exactly one
     * task on each active container instance that meets all of the task
     * placement constraints that you specify in your cluster. The service
     * scheduler also evaluates the task placement constraints for running tasks
     * and will stop tasks that do not meet the placement constraints. When
     * you're using this strategy, you don't need to specify a desired number of
     * tasks, a task placement strategy, or use Service Auto Scaling policies.
     * </p>
     * <note>
     * <p>
     * Tasks using the Fargate launch type or the <code>CODE_DEPLOY</code> or
     * <code>EXTERNAL</code> deployment controller types don't support the
     * <code>DAEMON</code> scheduling strategy.
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
     *            constraints to customize task placement decisions. This
     *            scheduler strategy is required if the service is using the
     *            <code>CODE_DEPLOY</code> or <code>EXTERNAL</code> deployment
     *            controller types.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DAEMON</code>-The daemon scheduling strategy deploys
     *            exactly one task on each active container instance that meets
     *            all of the task placement constraints that you specify in your
     *            cluster. The service scheduler also evaluates the task
     *            placement constraints for running tasks and will stop tasks
     *            that do not meet the placement constraints. When you're using
     *            this strategy, you don't need to specify a desired number of
     *            tasks, a task placement strategy, or use Service Auto Scaling
     *            policies.
     *            </p>
     *            <note>
     *            <p>
     *            Tasks using the Fargate launch type or the
     *            <code>CODE_DEPLOY</code> or <code>EXTERNAL</code> deployment
     *            controller types don't support the <code>DAEMON</code>
     *            scheduling strategy.
     *            </p>
     *            </note></li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SchedulingStrategy
     */
    public CreateServiceRequest withSchedulingStrategy(String schedulingStrategy) {
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
     * decisions. This scheduler strategy is required if the service is using
     * the <code>CODE_DEPLOY</code> or <code>EXTERNAL</code> deployment
     * controller types.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAEMON</code>-The daemon scheduling strategy deploys exactly one
     * task on each active container instance that meets all of the task
     * placement constraints that you specify in your cluster. The service
     * scheduler also evaluates the task placement constraints for running tasks
     * and will stop tasks that do not meet the placement constraints. When
     * you're using this strategy, you don't need to specify a desired number of
     * tasks, a task placement strategy, or use Service Auto Scaling policies.
     * </p>
     * <note>
     * <p>
     * Tasks using the Fargate launch type or the <code>CODE_DEPLOY</code> or
     * <code>EXTERNAL</code> deployment controller types don't support the
     * <code>DAEMON</code> scheduling strategy.
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
     *            constraints to customize task placement decisions. This
     *            scheduler strategy is required if the service is using the
     *            <code>CODE_DEPLOY</code> or <code>EXTERNAL</code> deployment
     *            controller types.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DAEMON</code>-The daemon scheduling strategy deploys
     *            exactly one task on each active container instance that meets
     *            all of the task placement constraints that you specify in your
     *            cluster. The service scheduler also evaluates the task
     *            placement constraints for running tasks and will stop tasks
     *            that do not meet the placement constraints. When you're using
     *            this strategy, you don't need to specify a desired number of
     *            tasks, a task placement strategy, or use Service Auto Scaling
     *            policies.
     *            </p>
     *            <note>
     *            <p>
     *            Tasks using the Fargate launch type or the
     *            <code>CODE_DEPLOY</code> or <code>EXTERNAL</code> deployment
     *            controller types don't support the <code>DAEMON</code>
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
     * decisions. This scheduler strategy is required if the service is using
     * the <code>CODE_DEPLOY</code> or <code>EXTERNAL</code> deployment
     * controller types.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAEMON</code>-The daemon scheduling strategy deploys exactly one
     * task on each active container instance that meets all of the task
     * placement constraints that you specify in your cluster. The service
     * scheduler also evaluates the task placement constraints for running tasks
     * and will stop tasks that do not meet the placement constraints. When
     * you're using this strategy, you don't need to specify a desired number of
     * tasks, a task placement strategy, or use Service Auto Scaling policies.
     * </p>
     * <note>
     * <p>
     * Tasks using the Fargate launch type or the <code>CODE_DEPLOY</code> or
     * <code>EXTERNAL</code> deployment controller types don't support the
     * <code>DAEMON</code> scheduling strategy.
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
     *            constraints to customize task placement decisions. This
     *            scheduler strategy is required if the service is using the
     *            <code>CODE_DEPLOY</code> or <code>EXTERNAL</code> deployment
     *            controller types.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DAEMON</code>-The daemon scheduling strategy deploys
     *            exactly one task on each active container instance that meets
     *            all of the task placement constraints that you specify in your
     *            cluster. The service scheduler also evaluates the task
     *            placement constraints for running tasks and will stop tasks
     *            that do not meet the placement constraints. When you're using
     *            this strategy, you don't need to specify a desired number of
     *            tasks, a task placement strategy, or use Service Auto Scaling
     *            policies.
     *            </p>
     *            <note>
     *            <p>
     *            Tasks using the Fargate launch type or the
     *            <code>CODE_DEPLOY</code> or <code>EXTERNAL</code> deployment
     *            controller types don't support the <code>DAEMON</code>
     *            scheduling strategy.
     *            </p>
     *            </note></li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SchedulingStrategy
     */
    public CreateServiceRequest withSchedulingStrategy(SchedulingStrategy schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The deployment controller to use for the service.
     * </p>
     *
     * @return <p>
     *         The deployment controller to use for the service.
     *         </p>
     */
    public DeploymentController getDeploymentController() {
        return deploymentController;
    }

    /**
     * <p>
     * The deployment controller to use for the service.
     * </p>
     *
     * @param deploymentController <p>
     *            The deployment controller to use for the service.
     *            </p>
     */
    public void setDeploymentController(DeploymentController deploymentController) {
        this.deploymentController = deploymentController;
    }

    /**
     * <p>
     * The deployment controller to use for the service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentController <p>
     *            The deployment controller to use for the service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceRequest withDeploymentController(DeploymentController deploymentController) {
        this.deploymentController = deploymentController;
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to the service to help you categorize and
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
     *         The metadata that you apply to the service to help you categorize
     *         and organize them. Each tag consists of a key and an optional
     *         value, both of which you define. When a service is deleted, the
     *         tags are deleted as well.
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
     *            The metadata that you apply to the service to help you
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
     * The metadata that you apply to the service to help you categorize and
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
     *            The metadata that you apply to the service to help you
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
    public CreateServiceRequest withTags(Tag... tags) {
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
     *            The metadata that you apply to the service to help you
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
    public CreateServiceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable Amazon ECS managed tags for the tasks within
     * the service. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html"
     * >Tagging Your Amazon ECS Resources</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies whether to enable Amazon ECS managed tags for the tasks
     *         within the service. For more information, see <a href=
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
     * Specifies whether to enable Amazon ECS managed tags for the tasks within
     * the service. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html"
     * >Tagging Your Amazon ECS Resources</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies whether to enable Amazon ECS managed tags for the tasks
     *         within the service. For more information, see <a href=
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
     * Specifies whether to enable Amazon ECS managed tags for the tasks within
     * the service. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html"
     * >Tagging Your Amazon ECS Resources</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @param enableECSManagedTags <p>
     *            Specifies whether to enable Amazon ECS managed tags for the
     *            tasks within the service. For more information, see <a href=
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
     * Specifies whether to enable Amazon ECS managed tags for the tasks within
     * the service. For more information, see <a href=
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
     *            tasks within the service. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html"
     *            >Tagging Your Amazon ECS Resources</a> in the <i>Amazon
     *            Elastic Container Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceRequest withEnableECSManagedTags(Boolean enableECSManagedTags) {
        this.enableECSManagedTags = enableECSManagedTags;
        return this;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition or the
     * service to the tasks in the service. If no value is specified, the tags
     * are not propagated. Tags can only be propagated to the tasks within the
     * service during service creation. To add tags to a task after service
     * creation, use the <a>TagResource</a> API action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TASK_DEFINITION, SERVICE
     *
     * @return <p>
     *         Specifies whether to propagate the tags from the task definition
     *         or the service to the tasks in the service. If no value is
     *         specified, the tags are not propagated. Tags can only be
     *         propagated to the tasks within the service during service
     *         creation. To add tags to a task after service creation, use the
     *         <a>TagResource</a> API action.
     *         </p>
     * @see PropagateTags
     */
    public String getPropagateTags() {
        return propagateTags;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition or the
     * service to the tasks in the service. If no value is specified, the tags
     * are not propagated. Tags can only be propagated to the tasks within the
     * service during service creation. To add tags to a task after service
     * creation, use the <a>TagResource</a> API action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TASK_DEFINITION, SERVICE
     *
     * @param propagateTags <p>
     *            Specifies whether to propagate the tags from the task
     *            definition or the service to the tasks in the service. If no
     *            value is specified, the tags are not propagated. Tags can only
     *            be propagated to the tasks within the service during service
     *            creation. To add tags to a task after service creation, use
     *            the <a>TagResource</a> API action.
     *            </p>
     * @see PropagateTags
     */
    public void setPropagateTags(String propagateTags) {
        this.propagateTags = propagateTags;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition or the
     * service to the tasks in the service. If no value is specified, the tags
     * are not propagated. Tags can only be propagated to the tasks within the
     * service during service creation. To add tags to a task after service
     * creation, use the <a>TagResource</a> API action.
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
     *            definition or the service to the tasks in the service. If no
     *            value is specified, the tags are not propagated. Tags can only
     *            be propagated to the tasks within the service during service
     *            creation. To add tags to a task after service creation, use
     *            the <a>TagResource</a> API action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PropagateTags
     */
    public CreateServiceRequest withPropagateTags(String propagateTags) {
        this.propagateTags = propagateTags;
        return this;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition or the
     * service to the tasks in the service. If no value is specified, the tags
     * are not propagated. Tags can only be propagated to the tasks within the
     * service during service creation. To add tags to a task after service
     * creation, use the <a>TagResource</a> API action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TASK_DEFINITION, SERVICE
     *
     * @param propagateTags <p>
     *            Specifies whether to propagate the tags from the task
     *            definition or the service to the tasks in the service. If no
     *            value is specified, the tags are not propagated. Tags can only
     *            be propagated to the tasks within the service during service
     *            creation. To add tags to a task after service creation, use
     *            the <a>TagResource</a> API action.
     *            </p>
     * @see PropagateTags
     */
    public void setPropagateTags(PropagateTags propagateTags) {
        this.propagateTags = propagateTags.toString();
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition or the
     * service to the tasks in the service. If no value is specified, the tags
     * are not propagated. Tags can only be propagated to the tasks within the
     * service during service creation. To add tags to a task after service
     * creation, use the <a>TagResource</a> API action.
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
     *            definition or the service to the tasks in the service. If no
     *            value is specified, the tags are not propagated. Tags can only
     *            be propagated to the tasks within the service during service
     *            creation. To add tags to a task after service creation, use
     *            the <a>TagResource</a> API action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PropagateTags
     */
    public CreateServiceRequest withPropagateTags(PropagateTags propagateTags) {
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
        if (getCluster() != null)
            sb.append("cluster: " + getCluster() + ",");
        if (getServiceName() != null)
            sb.append("serviceName: " + getServiceName() + ",");
        if (getTaskDefinition() != null)
            sb.append("taskDefinition: " + getTaskDefinition() + ",");
        if (getLoadBalancers() != null)
            sb.append("loadBalancers: " + getLoadBalancers() + ",");
        if (getServiceRegistries() != null)
            sb.append("serviceRegistries: " + getServiceRegistries() + ",");
        if (getDesiredCount() != null)
            sb.append("desiredCount: " + getDesiredCount() + ",");
        if (getClientToken() != null)
            sb.append("clientToken: " + getClientToken() + ",");
        if (getLaunchType() != null)
            sb.append("launchType: " + getLaunchType() + ",");
        if (getCapacityProviderStrategy() != null)
            sb.append("capacityProviderStrategy: " + getCapacityProviderStrategy() + ",");
        if (getPlatformVersion() != null)
            sb.append("platformVersion: " + getPlatformVersion() + ",");
        if (getRole() != null)
            sb.append("role: " + getRole() + ",");
        if (getDeploymentConfiguration() != null)
            sb.append("deploymentConfiguration: " + getDeploymentConfiguration() + ",");
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

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode
                + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode
                + ((getTaskDefinition() == null) ? 0 : getTaskDefinition().hashCode());
        hashCode = prime * hashCode
                + ((getLoadBalancers() == null) ? 0 : getLoadBalancers().hashCode());
        hashCode = prime * hashCode
                + ((getServiceRegistries() == null) ? 0 : getServiceRegistries().hashCode());
        hashCode = prime * hashCode
                + ((getDesiredCount() == null) ? 0 : getDesiredCount().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getLaunchType() == null) ? 0 : getLaunchType().hashCode());
        hashCode = prime
                * hashCode
                + ((getCapacityProviderStrategy() == null) ? 0 : getCapacityProviderStrategy()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeploymentConfiguration() == null) ? 0 : getDeploymentConfiguration()
                        .hashCode());
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

        if (obj instanceof CreateServiceRequest == false)
            return false;
        CreateServiceRequest other = (CreateServiceRequest) obj;

        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null
                && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getTaskDefinition() == null ^ this.getTaskDefinition() == null)
            return false;
        if (other.getTaskDefinition() != null
                && other.getTaskDefinition().equals(this.getTaskDefinition()) == false)
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
        if (other.getDesiredCount() == null ^ this.getDesiredCount() == null)
            return false;
        if (other.getDesiredCount() != null
                && other.getDesiredCount().equals(this.getDesiredCount()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
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
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getDeploymentConfiguration() == null ^ this.getDeploymentConfiguration() == null)
            return false;
        if (other.getDeploymentConfiguration() != null
                && other.getDeploymentConfiguration().equals(this.getDeploymentConfiguration()) == false)
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
