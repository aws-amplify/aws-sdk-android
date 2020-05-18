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
 * <important>
 * <p>
 * Updating the task placement strategies and constraints on an Amazon ECS
 * service remains in preview and is a Beta Service as defined by and subject to
 * the Beta Service Participation Service Terms located at <a
 * href="https://aws.amazon.com/service-terms"
 * >https://aws.amazon.com/service-terms</a> ("Beta Terms"). These Beta Terms
 * apply to your participation in this preview.
 * </p>
 * </important>
 * <p>
 * Modifies the parameters of a service.
 * </p>
 * <p>
 * For services using the rolling update (<code>ECS</code>) deployment
 * controller, the desired count, deployment configuration, network
 * configuration, task placement constraints and strategies, or task definition
 * used can be updated.
 * </p>
 * <p>
 * For services using the blue/green (<code>CODE_DEPLOY</code>) deployment
 * controller, only the desired count, deployment configuration, task placement
 * constraints and strategies, and health check grace period can be updated
 * using this API. If the network configuration, platform version, or task
 * definition need to be updated, a new AWS CodeDeploy deployment should be
 * created. For more information, see <a href=
 * "https://docs.aws.amazon.com/codedeploy/latest/APIReference/API_CreateDeployment.html"
 * >CreateDeployment</a> in the <i>AWS CodeDeploy API Reference</i>.
 * </p>
 * <p>
 * For services using an external deployment controller, you can update only the
 * desired count, task placement constraints and strategies, and health check
 * grace period using this API. If the launch type, load balancer, network
 * configuration, platform version, or task definition need to be updated, you
 * should create a new task set. For more information, see <a>CreateTaskSet</a>.
 * </p>
 * <p>
 * You can add to or subtract from the number of instantiations of a task
 * definition in a service by specifying the cluster that the service is running
 * in and a new <code>desiredCount</code> parameter.
 * </p>
 * <p>
 * If you have updated the Docker image of your application, you can create a
 * new task definition with that image and deploy it to your service. The
 * service scheduler uses the minimum healthy percent and maximum percent
 * parameters (in the service's deployment configuration) to determine the
 * deployment strategy.
 * </p>
 * <note>
 * <p>
 * If your updated Docker image uses the same tag as what is in the existing
 * task definition for your service (for example, <code>my_image:latest</code>),
 * you do not need to create a new revision of your task definition. You can
 * update the service using the <code>forceNewDeployment</code> option. The new
 * tasks launched by the deployment pull the current image/tag combination from
 * your repository when they start.
 * </p>
 * </note>
 * <p>
 * You can also update the deployment configuration of a service. When a
 * deployment is triggered by updating the task definition of a service, the
 * service scheduler uses the deployment configuration parameters,
 * <code>minimumHealthyPercent</code> and <code>maximumPercent</code>, to
 * determine the deployment strategy.
 * </p>
 * <ul>
 * <li>
 * <p>
 * If <code>minimumHealthyPercent</code> is below 100%, the scheduler can ignore
 * <code>desiredCount</code> temporarily during a deployment. For example, if
 * <code>desiredCount</code> is four tasks, a minimum of 50% allows the
 * scheduler to stop two existing tasks before starting two new tasks. Tasks for
 * services that do not use a load balancer are considered healthy if they are
 * in the <code>RUNNING</code> state. Tasks for services that use a load
 * balancer are considered healthy if they are in the <code>RUNNING</code> state
 * and the container instance they are hosted on is reported as healthy by the
 * load balancer.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <code>maximumPercent</code> parameter represents an upper limit on the
 * number of running tasks during a deployment, which enables you to define the
 * deployment batch size. For example, if <code>desiredCount</code> is four
 * tasks, a maximum of 200% starts four new tasks before stopping the four older
 * tasks (provided that the cluster resources required to do this are
 * available).
 * </p>
 * </li>
 * </ul>
 * <p>
 * When <a>UpdateService</a> stops a task during a deployment, the equivalent of
 * <code>docker stop</code> is issued to the containers running in the task.
 * This results in a <code>SIGTERM</code> and a 30-second timeout, after which
 * <code>SIGKILL</code> is sent and the containers are forcibly stopped. If the
 * container handles the <code>SIGTERM</code> gracefully and exits within 30
 * seconds from receiving it, no <code>SIGKILL</code> is sent.
 * </p>
 * <p>
 * When the service scheduler launches new tasks, it determines task placement
 * in your cluster with the following logic:
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
 * placement strategy):
 * </p>
 * <ul>
 * <li>
 * <p>
 * Sort the valid container instances by the fewest number of running tasks for
 * this service in the same Availability Zone as the instance. For example, if
 * zone A has one running service task and zones B and C each have zero, valid
 * container instances in either zone B or C are considered optimal for
 * placement.
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
 * <p>
 * When the service scheduler stops running tasks, it attempts to maintain
 * balance across the Availability Zones in your cluster using the following
 * logic:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Sort the container instances by the largest number of running tasks for this
 * service in the same Availability Zone as the instance. For example, if zone A
 * has one running service task and zones B and C each have two, container
 * instances in either zone B or C are considered optimal for termination.
 * </p>
 * </li>
 * <li>
 * <p>
 * Stop the task on a container instance in an optimal Availability Zone (based
 * on the previous steps), favoring container instances with the largest number
 * of running tasks for this service.
 * </p>
 * </li>
 * </ul>
 */
public class UpdateServiceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * your service is running on. If you do not specify a cluster, the default
     * cluster is assumed.
     * </p>
     */
    private String cluster;

    /**
     * <p>
     * The name of the service to update.
     * </p>
     */
    private String service;

    /**
     * <p>
     * The number of instantiations of the task to place and keep running in
     * your service.
     * </p>
     */
    private Integer desiredCount;

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (
     * <code>family:revision</code>) or full ARN of the task definition to run
     * in your service. If a <code>revision</code> is not specified, the latest
     * <code>ACTIVE</code> revision is used. If you modify the task definition
     * with <code>UpdateService</code>, Amazon ECS spawns a task with the new
     * version of the task definition and then stops an old task after the new
     * version is running.
     * </p>
     */
    private String taskDefinition;

    /**
     * <p>
     * The capacity provider strategy to update the service to use.
     * </p>
     * <p>
     * If the service is using the default capacity provider strategy for the
     * cluster, the service can be updated to use one or more capacity providers
     * as opposed to the default capacity provider strategy. However, when a
     * service is using a capacity provider strategy that is not the default
     * capacity provider strategy, the service cannot be updated to use the
     * cluster's default capacity provider strategy.
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
     * The <a>PutClusterCapacityProviders</a> API operation is used to update
     * the list of available capacity providers for a cluster after the cluster
     * is created.
     * </p>
     * <p/>
     */
    private java.util.List<CapacityProviderStrategyItem> capacityProviderStrategy;

    /**
     * <p>
     * Optional deployment parameters that control how many tasks run during the
     * deployment and the ordering of stopping and starting tasks.
     * </p>
     */
    private DeploymentConfiguration deploymentConfiguration;

    /**
     * <p>
     * An object representing the network configuration for a task or service.
     * </p>
     */
    private NetworkConfiguration networkConfiguration;

    /**
     * <p>
     * An array of task placement constraint objects to update the service to
     * use. If no value is specified, the existing placement constraints for the
     * service will remain unchanged. If this value is specified, it will
     * override any existing placement constraints defined for the service. To
     * remove all existing placement constraints, specify an empty array.
     * </p>
     * <p>
     * You can specify a maximum of 10 constraints per task (this limit includes
     * constraints in the task definition and those specified at runtime).
     * </p>
     */
    private java.util.List<PlacementConstraint> placementConstraints;

    /**
     * <p>
     * The task placement strategy objects to update the service to use. If no
     * value is specified, the existing placement strategy for the service will
     * remain unchanged. If this value is specified, it will override the
     * existing placement strategy defined for the service. To remove an
     * existing placement strategy, specify an empty object.
     * </p>
     * <p>
     * You can specify a maximum of five strategy rules per service.
     * </p>
     */
    private java.util.List<PlacementStrategy> placementStrategy;

    /**
     * <p>
     * The platform version on which your tasks in the service are running. A
     * platform version is only specified for tasks using the Fargate launch
     * type. If a platform version is not specified, the <code>LATEST</code>
     * platform version is used by default. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     * >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     */
    private String platformVersion;

    /**
     * <p>
     * Whether to force a new deployment of the service. Deployments are not
     * forced by default. You can use this option to trigger a new deployment
     * with no service definition changes. For example, you can update a
     * service's tasks to use a newer Docker image with the same image/tag
     * combination (<code>my_image:latest</code>) or to roll Fargate tasks onto
     * a newer platform version.
     * </p>
     */
    private Boolean forceNewDeployment;

    /**
     * <p>
     * The period of time, in seconds, that the Amazon ECS service scheduler
     * should ignore unhealthy Elastic Load Balancing target health checks after
     * a task has first started. This is only valid if your service is
     * configured to use a load balancer. If your service's tasks take a while
     * to start and respond to Elastic Load Balancing health checks, you can
     * specify a health check grace period of up to 2,147,483,647 seconds.
     * During that time, the Amazon ECS service scheduler ignores the Elastic
     * Load Balancing health check status. This grace period can prevent the ECS
     * service scheduler from marking tasks as unhealthy and stopping them
     * before they have time to come up.
     * </p>
     */
    private Integer healthCheckGracePeriodSeconds;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * your service is running on. If you do not specify a cluster, the default
     * cluster is assumed.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the cluster
     *         that your service is running on. If you do not specify a cluster,
     *         the default cluster is assumed.
     *         </p>
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * your service is running on. If you do not specify a cluster, the default
     * cluster is assumed.
     * </p>
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that your service is running on. If you do not specify
     *            a cluster, the default cluster is assumed.
     *            </p>
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * your service is running on. If you do not specify a cluster, the default
     * cluster is assumed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster that your service is running on. If you do not specify
     *            a cluster, the default cluster is assumed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateServiceRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * <p>
     * The name of the service to update.
     * </p>
     *
     * @return <p>
     *         The name of the service to update.
     *         </p>
     */
    public String getService() {
        return service;
    }

    /**
     * <p>
     * The name of the service to update.
     * </p>
     *
     * @param service <p>
     *            The name of the service to update.
     *            </p>
     */
    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The name of the service to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param service <p>
     *            The name of the service to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateServiceRequest withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * <p>
     * The number of instantiations of the task to place and keep running in
     * your service.
     * </p>
     *
     * @return <p>
     *         The number of instantiations of the task to place and keep
     *         running in your service.
     *         </p>
     */
    public Integer getDesiredCount() {
        return desiredCount;
    }

    /**
     * <p>
     * The number of instantiations of the task to place and keep running in
     * your service.
     * </p>
     *
     * @param desiredCount <p>
     *            The number of instantiations of the task to place and keep
     *            running in your service.
     *            </p>
     */
    public void setDesiredCount(Integer desiredCount) {
        this.desiredCount = desiredCount;
    }

    /**
     * <p>
     * The number of instantiations of the task to place and keep running in
     * your service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param desiredCount <p>
     *            The number of instantiations of the task to place and keep
     *            running in your service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateServiceRequest withDesiredCount(Integer desiredCount) {
        this.desiredCount = desiredCount;
        return this;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (
     * <code>family:revision</code>) or full ARN of the task definition to run
     * in your service. If a <code>revision</code> is not specified, the latest
     * <code>ACTIVE</code> revision is used. If you modify the task definition
     * with <code>UpdateService</code>, Amazon ECS spawns a task with the new
     * version of the task definition and then stops an old task after the new
     * version is running.
     * </p>
     *
     * @return <p>
     *         The <code>family</code> and <code>revision</code> (
     *         <code>family:revision</code>) or full ARN of the task definition
     *         to run in your service. If a <code>revision</code> is not
     *         specified, the latest <code>ACTIVE</code> revision is used. If
     *         you modify the task definition with <code>UpdateService</code>,
     *         Amazon ECS spawns a task with the new version of the task
     *         definition and then stops an old task after the new version is
     *         running.
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
     * <code>ACTIVE</code> revision is used. If you modify the task definition
     * with <code>UpdateService</code>, Amazon ECS spawns a task with the new
     * version of the task definition and then stops an old task after the new
     * version is running.
     * </p>
     *
     * @param taskDefinition <p>
     *            The <code>family</code> and <code>revision</code> (
     *            <code>family:revision</code>) or full ARN of the task
     *            definition to run in your service. If a <code>revision</code>
     *            is not specified, the latest <code>ACTIVE</code> revision is
     *            used. If you modify the task definition with
     *            <code>UpdateService</code>, Amazon ECS spawns a task with the
     *            new version of the task definition and then stops an old task
     *            after the new version is running.
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
     * <code>ACTIVE</code> revision is used. If you modify the task definition
     * with <code>UpdateService</code>, Amazon ECS spawns a task with the new
     * version of the task definition and then stops an old task after the new
     * version is running.
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
     *            used. If you modify the task definition with
     *            <code>UpdateService</code>, Amazon ECS spawns a task with the
     *            new version of the task definition and then stops an old task
     *            after the new version is running.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateServiceRequest withTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
        return this;
    }

    /**
     * <p>
     * The capacity provider strategy to update the service to use.
     * </p>
     * <p>
     * If the service is using the default capacity provider strategy for the
     * cluster, the service can be updated to use one or more capacity providers
     * as opposed to the default capacity provider strategy. However, when a
     * service is using a capacity provider strategy that is not the default
     * capacity provider strategy, the service cannot be updated to use the
     * cluster's default capacity provider strategy.
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
     * The <a>PutClusterCapacityProviders</a> API operation is used to update
     * the list of available capacity providers for a cluster after the cluster
     * is created.
     * </p>
     * <p/>
     *
     * @return <p>
     *         The capacity provider strategy to update the service to use.
     *         </p>
     *         <p>
     *         If the service is using the default capacity provider strategy
     *         for the cluster, the service can be updated to use one or more
     *         capacity providers as opposed to the default capacity provider
     *         strategy. However, when a service is using a capacity provider
     *         strategy that is not the default capacity provider strategy, the
     *         service cannot be updated to use the cluster's default capacity
     *         provider strategy.
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
     *         <p>
     *         The <a>PutClusterCapacityProviders</a> API operation is used to
     *         update the list of available capacity providers for a cluster
     *         after the cluster is created.
     *         </p>
     *         <p/>
     */
    public java.util.List<CapacityProviderStrategyItem> getCapacityProviderStrategy() {
        return capacityProviderStrategy;
    }

    /**
     * <p>
     * The capacity provider strategy to update the service to use.
     * </p>
     * <p>
     * If the service is using the default capacity provider strategy for the
     * cluster, the service can be updated to use one or more capacity providers
     * as opposed to the default capacity provider strategy. However, when a
     * service is using a capacity provider strategy that is not the default
     * capacity provider strategy, the service cannot be updated to use the
     * cluster's default capacity provider strategy.
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
     * The <a>PutClusterCapacityProviders</a> API operation is used to update
     * the list of available capacity providers for a cluster after the cluster
     * is created.
     * </p>
     * <p/>
     *
     * @param capacityProviderStrategy <p>
     *            The capacity provider strategy to update the service to use.
     *            </p>
     *            <p>
     *            If the service is using the default capacity provider strategy
     *            for the cluster, the service can be updated to use one or more
     *            capacity providers as opposed to the default capacity provider
     *            strategy. However, when a service is using a capacity provider
     *            strategy that is not the default capacity provider strategy,
     *            the service cannot be updated to use the cluster's default
     *            capacity provider strategy.
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
     *            <p>
     *            The <a>PutClusterCapacityProviders</a> API operation is used
     *            to update the list of available capacity providers for a
     *            cluster after the cluster is created.
     *            </p>
     *            <p/>
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
     * The capacity provider strategy to update the service to use.
     * </p>
     * <p>
     * If the service is using the default capacity provider strategy for the
     * cluster, the service can be updated to use one or more capacity providers
     * as opposed to the default capacity provider strategy. However, when a
     * service is using a capacity provider strategy that is not the default
     * capacity provider strategy, the service cannot be updated to use the
     * cluster's default capacity provider strategy.
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
     * The <a>PutClusterCapacityProviders</a> API operation is used to update
     * the list of available capacity providers for a cluster after the cluster
     * is created.
     * </p>
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityProviderStrategy <p>
     *            The capacity provider strategy to update the service to use.
     *            </p>
     *            <p>
     *            If the service is using the default capacity provider strategy
     *            for the cluster, the service can be updated to use one or more
     *            capacity providers as opposed to the default capacity provider
     *            strategy. However, when a service is using a capacity provider
     *            strategy that is not the default capacity provider strategy,
     *            the service cannot be updated to use the cluster's default
     *            capacity provider strategy.
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
     *            <p>
     *            The <a>PutClusterCapacityProviders</a> API operation is used
     *            to update the list of available capacity providers for a
     *            cluster after the cluster is created.
     *            </p>
     *            <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateServiceRequest withCapacityProviderStrategy(
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
     * The capacity provider strategy to update the service to use.
     * </p>
     * <p>
     * If the service is using the default capacity provider strategy for the
     * cluster, the service can be updated to use one or more capacity providers
     * as opposed to the default capacity provider strategy. However, when a
     * service is using a capacity provider strategy that is not the default
     * capacity provider strategy, the service cannot be updated to use the
     * cluster's default capacity provider strategy.
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
     * The <a>PutClusterCapacityProviders</a> API operation is used to update
     * the list of available capacity providers for a cluster after the cluster
     * is created.
     * </p>
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityProviderStrategy <p>
     *            The capacity provider strategy to update the service to use.
     *            </p>
     *            <p>
     *            If the service is using the default capacity provider strategy
     *            for the cluster, the service can be updated to use one or more
     *            capacity providers as opposed to the default capacity provider
     *            strategy. However, when a service is using a capacity provider
     *            strategy that is not the default capacity provider strategy,
     *            the service cannot be updated to use the cluster's default
     *            capacity provider strategy.
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
     *            <p>
     *            The <a>PutClusterCapacityProviders</a> API operation is used
     *            to update the list of available capacity providers for a
     *            cluster after the cluster is created.
     *            </p>
     *            <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateServiceRequest withCapacityProviderStrategy(
            java.util.Collection<CapacityProviderStrategyItem> capacityProviderStrategy) {
        setCapacityProviderStrategy(capacityProviderStrategy);
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
    public UpdateServiceRequest withDeploymentConfiguration(
            DeploymentConfiguration deploymentConfiguration) {
        this.deploymentConfiguration = deploymentConfiguration;
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
    public UpdateServiceRequest withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }

    /**
     * <p>
     * An array of task placement constraint objects to update the service to
     * use. If no value is specified, the existing placement constraints for the
     * service will remain unchanged. If this value is specified, it will
     * override any existing placement constraints defined for the service. To
     * remove all existing placement constraints, specify an empty array.
     * </p>
     * <p>
     * You can specify a maximum of 10 constraints per task (this limit includes
     * constraints in the task definition and those specified at runtime).
     * </p>
     *
     * @return <p>
     *         An array of task placement constraint objects to update the
     *         service to use. If no value is specified, the existing placement
     *         constraints for the service will remain unchanged. If this value
     *         is specified, it will override any existing placement constraints
     *         defined for the service. To remove all existing placement
     *         constraints, specify an empty array.
     *         </p>
     *         <p>
     *         You can specify a maximum of 10 constraints per task (this limit
     *         includes constraints in the task definition and those specified
     *         at runtime).
     *         </p>
     */
    public java.util.List<PlacementConstraint> getPlacementConstraints() {
        return placementConstraints;
    }

    /**
     * <p>
     * An array of task placement constraint objects to update the service to
     * use. If no value is specified, the existing placement constraints for the
     * service will remain unchanged. If this value is specified, it will
     * override any existing placement constraints defined for the service. To
     * remove all existing placement constraints, specify an empty array.
     * </p>
     * <p>
     * You can specify a maximum of 10 constraints per task (this limit includes
     * constraints in the task definition and those specified at runtime).
     * </p>
     *
     * @param placementConstraints <p>
     *            An array of task placement constraint objects to update the
     *            service to use. If no value is specified, the existing
     *            placement constraints for the service will remain unchanged.
     *            If this value is specified, it will override any existing
     *            placement constraints defined for the service. To remove all
     *            existing placement constraints, specify an empty array.
     *            </p>
     *            <p>
     *            You can specify a maximum of 10 constraints per task (this
     *            limit includes constraints in the task definition and those
     *            specified at runtime).
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
     * An array of task placement constraint objects to update the service to
     * use. If no value is specified, the existing placement constraints for the
     * service will remain unchanged. If this value is specified, it will
     * override any existing placement constraints defined for the service. To
     * remove all existing placement constraints, specify an empty array.
     * </p>
     * <p>
     * You can specify a maximum of 10 constraints per task (this limit includes
     * constraints in the task definition and those specified at runtime).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param placementConstraints <p>
     *            An array of task placement constraint objects to update the
     *            service to use. If no value is specified, the existing
     *            placement constraints for the service will remain unchanged.
     *            If this value is specified, it will override any existing
     *            placement constraints defined for the service. To remove all
     *            existing placement constraints, specify an empty array.
     *            </p>
     *            <p>
     *            You can specify a maximum of 10 constraints per task (this
     *            limit includes constraints in the task definition and those
     *            specified at runtime).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateServiceRequest withPlacementConstraints(
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
     * An array of task placement constraint objects to update the service to
     * use. If no value is specified, the existing placement constraints for the
     * service will remain unchanged. If this value is specified, it will
     * override any existing placement constraints defined for the service. To
     * remove all existing placement constraints, specify an empty array.
     * </p>
     * <p>
     * You can specify a maximum of 10 constraints per task (this limit includes
     * constraints in the task definition and those specified at runtime).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param placementConstraints <p>
     *            An array of task placement constraint objects to update the
     *            service to use. If no value is specified, the existing
     *            placement constraints for the service will remain unchanged.
     *            If this value is specified, it will override any existing
     *            placement constraints defined for the service. To remove all
     *            existing placement constraints, specify an empty array.
     *            </p>
     *            <p>
     *            You can specify a maximum of 10 constraints per task (this
     *            limit includes constraints in the task definition and those
     *            specified at runtime).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateServiceRequest withPlacementConstraints(
            java.util.Collection<PlacementConstraint> placementConstraints) {
        setPlacementConstraints(placementConstraints);
        return this;
    }

    /**
     * <p>
     * The task placement strategy objects to update the service to use. If no
     * value is specified, the existing placement strategy for the service will
     * remain unchanged. If this value is specified, it will override the
     * existing placement strategy defined for the service. To remove an
     * existing placement strategy, specify an empty object.
     * </p>
     * <p>
     * You can specify a maximum of five strategy rules per service.
     * </p>
     *
     * @return <p>
     *         The task placement strategy objects to update the service to use.
     *         If no value is specified, the existing placement strategy for the
     *         service will remain unchanged. If this value is specified, it
     *         will override the existing placement strategy defined for the
     *         service. To remove an existing placement strategy, specify an
     *         empty object.
     *         </p>
     *         <p>
     *         You can specify a maximum of five strategy rules per service.
     *         </p>
     */
    public java.util.List<PlacementStrategy> getPlacementStrategy() {
        return placementStrategy;
    }

    /**
     * <p>
     * The task placement strategy objects to update the service to use. If no
     * value is specified, the existing placement strategy for the service will
     * remain unchanged. If this value is specified, it will override the
     * existing placement strategy defined for the service. To remove an
     * existing placement strategy, specify an empty object.
     * </p>
     * <p>
     * You can specify a maximum of five strategy rules per service.
     * </p>
     *
     * @param placementStrategy <p>
     *            The task placement strategy objects to update the service to
     *            use. If no value is specified, the existing placement strategy
     *            for the service will remain unchanged. If this value is
     *            specified, it will override the existing placement strategy
     *            defined for the service. To remove an existing placement
     *            strategy, specify an empty object.
     *            </p>
     *            <p>
     *            You can specify a maximum of five strategy rules per service.
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
     * The task placement strategy objects to update the service to use. If no
     * value is specified, the existing placement strategy for the service will
     * remain unchanged. If this value is specified, it will override the
     * existing placement strategy defined for the service. To remove an
     * existing placement strategy, specify an empty object.
     * </p>
     * <p>
     * You can specify a maximum of five strategy rules per service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param placementStrategy <p>
     *            The task placement strategy objects to update the service to
     *            use. If no value is specified, the existing placement strategy
     *            for the service will remain unchanged. If this value is
     *            specified, it will override the existing placement strategy
     *            defined for the service. To remove an existing placement
     *            strategy, specify an empty object.
     *            </p>
     *            <p>
     *            You can specify a maximum of five strategy rules per service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateServiceRequest withPlacementStrategy(PlacementStrategy... placementStrategy) {
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
     * The task placement strategy objects to update the service to use. If no
     * value is specified, the existing placement strategy for the service will
     * remain unchanged. If this value is specified, it will override the
     * existing placement strategy defined for the service. To remove an
     * existing placement strategy, specify an empty object.
     * </p>
     * <p>
     * You can specify a maximum of five strategy rules per service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param placementStrategy <p>
     *            The task placement strategy objects to update the service to
     *            use. If no value is specified, the existing placement strategy
     *            for the service will remain unchanged. If this value is
     *            specified, it will override the existing placement strategy
     *            defined for the service. To remove an existing placement
     *            strategy, specify an empty object.
     *            </p>
     *            <p>
     *            You can specify a maximum of five strategy rules per service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateServiceRequest withPlacementStrategy(
            java.util.Collection<PlacementStrategy> placementStrategy) {
        setPlacementStrategy(placementStrategy);
        return this;
    }

    /**
     * <p>
     * The platform version on which your tasks in the service are running. A
     * platform version is only specified for tasks using the Fargate launch
     * type. If a platform version is not specified, the <code>LATEST</code>
     * platform version is used by default. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     * >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The platform version on which your tasks in the service are
     *         running. A platform version is only specified for tasks using the
     *         Fargate launch type. If a platform version is not specified, the
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
     * The platform version on which your tasks in the service are running. A
     * platform version is only specified for tasks using the Fargate launch
     * type. If a platform version is not specified, the <code>LATEST</code>
     * platform version is used by default. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     * >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     *
     * @param platformVersion <p>
     *            The platform version on which your tasks in the service are
     *            running. A platform version is only specified for tasks using
     *            the Fargate launch type. If a platform version is not
     *            specified, the <code>LATEST</code> platform version is used by
     *            default. For more information, see <a href=
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
     * The platform version on which your tasks in the service are running. A
     * platform version is only specified for tasks using the Fargate launch
     * type. If a platform version is not specified, the <code>LATEST</code>
     * platform version is used by default. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     * >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic Container
     * Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformVersion <p>
     *            The platform version on which your tasks in the service are
     *            running. A platform version is only specified for tasks using
     *            the Fargate launch type. If a platform version is not
     *            specified, the <code>LATEST</code> platform version is used by
     *            default. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html"
     *            >AWS Fargate Platform Versions</a> in the <i>Amazon Elastic
     *            Container Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateServiceRequest withPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
        return this;
    }

    /**
     * <p>
     * Whether to force a new deployment of the service. Deployments are not
     * forced by default. You can use this option to trigger a new deployment
     * with no service definition changes. For example, you can update a
     * service's tasks to use a newer Docker image with the same image/tag
     * combination (<code>my_image:latest</code>) or to roll Fargate tasks onto
     * a newer platform version.
     * </p>
     *
     * @return <p>
     *         Whether to force a new deployment of the service. Deployments are
     *         not forced by default. You can use this option to trigger a new
     *         deployment with no service definition changes. For example, you
     *         can update a service's tasks to use a newer Docker image with the
     *         same image/tag combination (<code>my_image:latest</code>) or to
     *         roll Fargate tasks onto a newer platform version.
     *         </p>
     */
    public Boolean isForceNewDeployment() {
        return forceNewDeployment;
    }

    /**
     * <p>
     * Whether to force a new deployment of the service. Deployments are not
     * forced by default. You can use this option to trigger a new deployment
     * with no service definition changes. For example, you can update a
     * service's tasks to use a newer Docker image with the same image/tag
     * combination (<code>my_image:latest</code>) or to roll Fargate tasks onto
     * a newer platform version.
     * </p>
     *
     * @return <p>
     *         Whether to force a new deployment of the service. Deployments are
     *         not forced by default. You can use this option to trigger a new
     *         deployment with no service definition changes. For example, you
     *         can update a service's tasks to use a newer Docker image with the
     *         same image/tag combination (<code>my_image:latest</code>) or to
     *         roll Fargate tasks onto a newer platform version.
     *         </p>
     */
    public Boolean getForceNewDeployment() {
        return forceNewDeployment;
    }

    /**
     * <p>
     * Whether to force a new deployment of the service. Deployments are not
     * forced by default. You can use this option to trigger a new deployment
     * with no service definition changes. For example, you can update a
     * service's tasks to use a newer Docker image with the same image/tag
     * combination (<code>my_image:latest</code>) or to roll Fargate tasks onto
     * a newer platform version.
     * </p>
     *
     * @param forceNewDeployment <p>
     *            Whether to force a new deployment of the service. Deployments
     *            are not forced by default. You can use this option to trigger
     *            a new deployment with no service definition changes. For
     *            example, you can update a service's tasks to use a newer
     *            Docker image with the same image/tag combination (
     *            <code>my_image:latest</code>) or to roll Fargate tasks onto a
     *            newer platform version.
     *            </p>
     */
    public void setForceNewDeployment(Boolean forceNewDeployment) {
        this.forceNewDeployment = forceNewDeployment;
    }

    /**
     * <p>
     * Whether to force a new deployment of the service. Deployments are not
     * forced by default. You can use this option to trigger a new deployment
     * with no service definition changes. For example, you can update a
     * service's tasks to use a newer Docker image with the same image/tag
     * combination (<code>my_image:latest</code>) or to roll Fargate tasks onto
     * a newer platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param forceNewDeployment <p>
     *            Whether to force a new deployment of the service. Deployments
     *            are not forced by default. You can use this option to trigger
     *            a new deployment with no service definition changes. For
     *            example, you can update a service's tasks to use a newer
     *            Docker image with the same image/tag combination (
     *            <code>my_image:latest</code>) or to roll Fargate tasks onto a
     *            newer platform version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateServiceRequest withForceNewDeployment(Boolean forceNewDeployment) {
        this.forceNewDeployment = forceNewDeployment;
        return this;
    }

    /**
     * <p>
     * The period of time, in seconds, that the Amazon ECS service scheduler
     * should ignore unhealthy Elastic Load Balancing target health checks after
     * a task has first started. This is only valid if your service is
     * configured to use a load balancer. If your service's tasks take a while
     * to start and respond to Elastic Load Balancing health checks, you can
     * specify a health check grace period of up to 2,147,483,647 seconds.
     * During that time, the Amazon ECS service scheduler ignores the Elastic
     * Load Balancing health check status. This grace period can prevent the ECS
     * service scheduler from marking tasks as unhealthy and stopping them
     * before they have time to come up.
     * </p>
     *
     * @return <p>
     *         The period of time, in seconds, that the Amazon ECS service
     *         scheduler should ignore unhealthy Elastic Load Balancing target
     *         health checks after a task has first started. This is only valid
     *         if your service is configured to use a load balancer. If your
     *         service's tasks take a while to start and respond to Elastic Load
     *         Balancing health checks, you can specify a health check grace
     *         period of up to 2,147,483,647 seconds. During that time, the
     *         Amazon ECS service scheduler ignores the Elastic Load Balancing
     *         health check status. This grace period can prevent the ECS
     *         service scheduler from marking tasks as unhealthy and stopping
     *         them before they have time to come up.
     *         </p>
     */
    public Integer getHealthCheckGracePeriodSeconds() {
        return healthCheckGracePeriodSeconds;
    }

    /**
     * <p>
     * The period of time, in seconds, that the Amazon ECS service scheduler
     * should ignore unhealthy Elastic Load Balancing target health checks after
     * a task has first started. This is only valid if your service is
     * configured to use a load balancer. If your service's tasks take a while
     * to start and respond to Elastic Load Balancing health checks, you can
     * specify a health check grace period of up to 2,147,483,647 seconds.
     * During that time, the Amazon ECS service scheduler ignores the Elastic
     * Load Balancing health check status. This grace period can prevent the ECS
     * service scheduler from marking tasks as unhealthy and stopping them
     * before they have time to come up.
     * </p>
     *
     * @param healthCheckGracePeriodSeconds <p>
     *            The period of time, in seconds, that the Amazon ECS service
     *            scheduler should ignore unhealthy Elastic Load Balancing
     *            target health checks after a task has first started. This is
     *            only valid if your service is configured to use a load
     *            balancer. If your service's tasks take a while to start and
     *            respond to Elastic Load Balancing health checks, you can
     *            specify a health check grace period of up to 2,147,483,647
     *            seconds. During that time, the Amazon ECS service scheduler
     *            ignores the Elastic Load Balancing health check status. This
     *            grace period can prevent the ECS service scheduler from
     *            marking tasks as unhealthy and stopping them before they have
     *            time to come up.
     *            </p>
     */
    public void setHealthCheckGracePeriodSeconds(Integer healthCheckGracePeriodSeconds) {
        this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
    }

    /**
     * <p>
     * The period of time, in seconds, that the Amazon ECS service scheduler
     * should ignore unhealthy Elastic Load Balancing target health checks after
     * a task has first started. This is only valid if your service is
     * configured to use a load balancer. If your service's tasks take a while
     * to start and respond to Elastic Load Balancing health checks, you can
     * specify a health check grace period of up to 2,147,483,647 seconds.
     * During that time, the Amazon ECS service scheduler ignores the Elastic
     * Load Balancing health check status. This grace period can prevent the ECS
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
     *            only valid if your service is configured to use a load
     *            balancer. If your service's tasks take a while to start and
     *            respond to Elastic Load Balancing health checks, you can
     *            specify a health check grace period of up to 2,147,483,647
     *            seconds. During that time, the Amazon ECS service scheduler
     *            ignores the Elastic Load Balancing health check status. This
     *            grace period can prevent the ECS service scheduler from
     *            marking tasks as unhealthy and stopping them before they have
     *            time to come up.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateServiceRequest withHealthCheckGracePeriodSeconds(
            Integer healthCheckGracePeriodSeconds) {
        this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
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
        if (getService() != null)
            sb.append("service: " + getService() + ",");
        if (getDesiredCount() != null)
            sb.append("desiredCount: " + getDesiredCount() + ",");
        if (getTaskDefinition() != null)
            sb.append("taskDefinition: " + getTaskDefinition() + ",");
        if (getCapacityProviderStrategy() != null)
            sb.append("capacityProviderStrategy: " + getCapacityProviderStrategy() + ",");
        if (getDeploymentConfiguration() != null)
            sb.append("deploymentConfiguration: " + getDeploymentConfiguration() + ",");
        if (getNetworkConfiguration() != null)
            sb.append("networkConfiguration: " + getNetworkConfiguration() + ",");
        if (getPlacementConstraints() != null)
            sb.append("placementConstraints: " + getPlacementConstraints() + ",");
        if (getPlacementStrategy() != null)
            sb.append("placementStrategy: " + getPlacementStrategy() + ",");
        if (getPlatformVersion() != null)
            sb.append("platformVersion: " + getPlatformVersion() + ",");
        if (getForceNewDeployment() != null)
            sb.append("forceNewDeployment: " + getForceNewDeployment() + ",");
        if (getHealthCheckGracePeriodSeconds() != null)
            sb.append("healthCheckGracePeriodSeconds: " + getHealthCheckGracePeriodSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode
                + ((getDesiredCount() == null) ? 0 : getDesiredCount().hashCode());
        hashCode = prime * hashCode
                + ((getTaskDefinition() == null) ? 0 : getTaskDefinition().hashCode());
        hashCode = prime
                * hashCode
                + ((getCapacityProviderStrategy() == null) ? 0 : getCapacityProviderStrategy()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDeploymentConfiguration() == null) ? 0 : getDeploymentConfiguration()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNetworkConfiguration() == null) ? 0 : getNetworkConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getPlacementConstraints() == null) ? 0 : getPlacementConstraints().hashCode());
        hashCode = prime * hashCode
                + ((getPlacementStrategy() == null) ? 0 : getPlacementStrategy().hashCode());
        hashCode = prime * hashCode
                + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode
                + ((getForceNewDeployment() == null) ? 0 : getForceNewDeployment().hashCode());
        hashCode = prime
                * hashCode
                + ((getHealthCheckGracePeriodSeconds() == null) ? 0
                        : getHealthCheckGracePeriodSeconds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServiceRequest == false)
            return false;
        UpdateServiceRequest other = (UpdateServiceRequest) obj;

        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getDesiredCount() == null ^ this.getDesiredCount() == null)
            return false;
        if (other.getDesiredCount() != null
                && other.getDesiredCount().equals(this.getDesiredCount()) == false)
            return false;
        if (other.getTaskDefinition() == null ^ this.getTaskDefinition() == null)
            return false;
        if (other.getTaskDefinition() != null
                && other.getTaskDefinition().equals(this.getTaskDefinition()) == false)
            return false;
        if (other.getCapacityProviderStrategy() == null
                ^ this.getCapacityProviderStrategy() == null)
            return false;
        if (other.getCapacityProviderStrategy() != null
                && other.getCapacityProviderStrategy().equals(this.getCapacityProviderStrategy()) == false)
            return false;
        if (other.getDeploymentConfiguration() == null ^ this.getDeploymentConfiguration() == null)
            return false;
        if (other.getDeploymentConfiguration() != null
                && other.getDeploymentConfiguration().equals(this.getDeploymentConfiguration()) == false)
            return false;
        if (other.getNetworkConfiguration() == null ^ this.getNetworkConfiguration() == null)
            return false;
        if (other.getNetworkConfiguration() != null
                && other.getNetworkConfiguration().equals(this.getNetworkConfiguration()) == false)
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
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null
                && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        if (other.getForceNewDeployment() == null ^ this.getForceNewDeployment() == null)
            return false;
        if (other.getForceNewDeployment() != null
                && other.getForceNewDeployment().equals(this.getForceNewDeployment()) == false)
            return false;
        if (other.getHealthCheckGracePeriodSeconds() == null
                ^ this.getHealthCheckGracePeriodSeconds() == null)
            return false;
        if (other.getHealthCheckGracePeriodSeconds() != null
                && other.getHealthCheckGracePeriodSeconds().equals(
                        this.getHealthCheckGracePeriodSeconds()) == false)
            return false;
        return true;
    }
}
