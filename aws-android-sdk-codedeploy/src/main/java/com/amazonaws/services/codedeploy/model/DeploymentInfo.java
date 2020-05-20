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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a deployment.
 * </p>
 */
public class DeploymentInfo implements Serializable {
    /**
     * <p>
     * The application name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * <p>
     * The deployment group name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String deploymentGroupName;

    /**
     * <p>
     * The deployment configuration name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String deploymentConfigName;

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     */
    private String deploymentId;

    /**
     * <p>
     * Information about the application revision that was deployed to the
     * deployment group before the most recent successful deployment.
     * </p>
     */
    private RevisionLocation previousRevision;

    /**
     * <p>
     * Information about the location of stored application artifacts and the
     * service from which to retrieve them.
     * </p>
     */
    private RevisionLocation revision;

    /**
     * <p>
     * The current state of the deployment as a whole.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Created, Queued, InProgress, Baking, Succeeded,
     * Failed, Stopped, Ready
     */
    private String status;

    /**
     * <p>
     * Information about any error associated with this deployment.
     * </p>
     */
    private ErrorInformation errorInformation;

    /**
     * <p>
     * A timestamp that indicates when the deployment was created.
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * A timestamp that indicates when the deployment was deployed to the
     * deployment group.
     * </p>
     * <p>
     * In some cases, the reported value of the start time might be later than
     * the complete time. This is due to differences in the clock settings of
     * backend servers that participate in the deployment process.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * A timestamp that indicates when the deployment was complete.
     * </p>
     */
    private java.util.Date completeTime;

    /**
     * <p>
     * A summary of the deployment status of the instances in the deployment.
     * </p>
     */
    private DeploymentOverview deploymentOverview;

    /**
     * <p>
     * A comment about the deployment.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The means by which the deployment was created:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>user</code>: A user created the deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling</code>: Amazon EC2 Auto Scaling created the deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>codeDeployRollback</code>: A rollback process created the
     * deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>user, autoscaling, codeDeployRollback, CodeDeploy,
     * CloudFormation, CloudFormationRollback
     */
    private String creator;

    /**
     * <p>
     * If true, then if an <code>ApplicationStop</code>,
     * <code>BeforeBlockTraffic</code>, or <code>AfterBlockTraffic</code>
     * deployment lifecycle event to an instance fails, then the deployment
     * continues to the next deployment lifecycle event. For example, if
     * <code>ApplicationStop</code> fails, the deployment continues with
     * DownloadBundle. If <code>BeforeBlockTraffic</code> fails, the deployment
     * continues with <code>BlockTraffic</code>. If
     * <code>AfterBlockTraffic</code> fails, the deployment continues with
     * <code>ApplicationStop</code>.
     * </p>
     * <p>
     * If false or not specified, then if a lifecycle event fails during a
     * deployment to an instance, that deployment fails. If deployment to that
     * instance is part of an overall deployment and the number of healthy hosts
     * is not less than the minimum number of healthy hosts, then a deployment
     * to the next instance is attempted.
     * </p>
     * <p>
     * During a deployment, the AWS CodeDeploy agent runs the scripts specified
     * for <code>ApplicationStop</code>, <code>BeforeBlockTraffic</code>, and
     * <code>AfterBlockTraffic</code> in the AppSpec file from the previous
     * successful deployment. (All other scripts are run from the AppSpec file
     * in the current deployment.) If one of these scripts contains an error and
     * does not run successfully, the deployment can fail.
     * </p>
     * <p>
     * If the cause of the failure is a script from the last successful
     * deployment that will never run successfully, create a new deployment and
     * use <code>ignoreApplicationStopFailures</code> to specify that the
     * <code>ApplicationStop</code>, <code>BeforeBlockTraffic</code>, and
     * <code>AfterBlockTraffic</code> failures should be ignored.
     * </p>
     */
    private Boolean ignoreApplicationStopFailures;

    /**
     * <p>
     * Information about the automatic rollback configuration associated with
     * the deployment.
     * </p>
     */
    private AutoRollbackConfiguration autoRollbackConfiguration;

    /**
     * <p>
     * Indicates whether only instances that are not running the latest
     * application revision are to be deployed to.
     * </p>
     */
    private Boolean updateOutdatedInstancesOnly;

    /**
     * <p>
     * Information about a deployment rollback.
     * </p>
     */
    private RollbackInfo rollbackInfo;

    /**
     * <p>
     * Information about the type of deployment, either in-place or blue/green,
     * you want to run and whether to route deployment traffic behind a load
     * balancer.
     * </p>
     */
    private DeploymentStyle deploymentStyle;

    /**
     * <p>
     * Information about the instances that belong to the replacement
     * environment in a blue/green deployment.
     * </p>
     */
    private TargetInstances targetInstances;

    /**
     * <p>
     * Indicates whether the wait period set for the termination of instances in
     * the original environment has started. Status is 'false' if the KEEP_ALIVE
     * option is specified. Otherwise, 'true' as soon as the termination wait
     * period starts.
     * </p>
     */
    private Boolean instanceTerminationWaitTimeStarted;

    /**
     * <p>
     * Information about blue/green deployment options for this deployment.
     * </p>
     */
    private BlueGreenDeploymentConfiguration blueGreenDeploymentConfiguration;

    /**
     * <p>
     * Information about the load balancer used in the deployment.
     * </p>
     */
    private LoadBalancerInfo loadBalancerInfo;

    /**
     * <p>
     * Provides information about the results of a deployment, such as whether
     * instances in the original environment in a blue/green deployment were not
     * terminated.
     * </p>
     */
    private String additionalDeploymentStatusInfo;

    /**
     * <p>
     * Information about how AWS CodeDeploy handles files that already exist in
     * a deployment target location but weren't part of the previous successful
     * deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISALLOW</code>: The deployment fails. This is also the default
     * behavior if no option is specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OVERWRITE</code>: The version of the file from the application
     * revision currently being deployed replaces the version already on the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RETAIN</code>: The version of the file already on the instance is
     * kept and used as part of the new deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISALLOW, OVERWRITE, RETAIN
     */
    private String fileExistsBehavior;

    /**
     * <p>
     * Messages that contain information about the status of a deployment.
     * </p>
     */
    private java.util.List<String> deploymentStatusMessages;

    /**
     * <p>
     * The destination platform type for the deployment (<code>Lambda</code>,
     * <code>Server</code>, or <code>ECS</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Server, Lambda, ECS
     */
    private String computePlatform;

    /**
     * <p>
     * The unique ID for an external resource (for example, a CloudFormation
     * stack ID) that is linked to this deployment.
     * </p>
     */
    private String externalId;

    /**
     * <p>
     * The application name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The application name.
     *         </p>
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * <p>
     * The application name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The application name.
     *            </p>
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The application name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The application name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentInfo withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * <p>
     * The deployment group name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The deployment group name.
     *         </p>
     */
    public String getDeploymentGroupName() {
        return deploymentGroupName;
    }

    /**
     * <p>
     * The deployment group name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentGroupName <p>
     *            The deployment group name.
     *            </p>
     */
    public void setDeploymentGroupName(String deploymentGroupName) {
        this.deploymentGroupName = deploymentGroupName;
    }

    /**
     * <p>
     * The deployment group name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentGroupName <p>
     *            The deployment group name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentInfo withDeploymentGroupName(String deploymentGroupName) {
        this.deploymentGroupName = deploymentGroupName;
        return this;
    }

    /**
     * <p>
     * The deployment configuration name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The deployment configuration name.
     *         </p>
     */
    public String getDeploymentConfigName() {
        return deploymentConfigName;
    }

    /**
     * <p>
     * The deployment configuration name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentConfigName <p>
     *            The deployment configuration name.
     *            </p>
     */
    public void setDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
    }

    /**
     * <p>
     * The deployment configuration name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentConfigName <p>
     *            The deployment configuration name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentInfo withDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
        return this;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     *
     * @return <p>
     *         The unique ID of a deployment.
     *         </p>
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     *
     * @param deploymentId <p>
     *            The unique ID of a deployment.
     *            </p>
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentId <p>
     *            The unique ID of a deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentInfo withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * <p>
     * Information about the application revision that was deployed to the
     * deployment group before the most recent successful deployment.
     * </p>
     *
     * @return <p>
     *         Information about the application revision that was deployed to
     *         the deployment group before the most recent successful
     *         deployment.
     *         </p>
     */
    public RevisionLocation getPreviousRevision() {
        return previousRevision;
    }

    /**
     * <p>
     * Information about the application revision that was deployed to the
     * deployment group before the most recent successful deployment.
     * </p>
     *
     * @param previousRevision <p>
     *            Information about the application revision that was deployed
     *            to the deployment group before the most recent successful
     *            deployment.
     *            </p>
     */
    public void setPreviousRevision(RevisionLocation previousRevision) {
        this.previousRevision = previousRevision;
    }

    /**
     * <p>
     * Information about the application revision that was deployed to the
     * deployment group before the most recent successful deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param previousRevision <p>
     *            Information about the application revision that was deployed
     *            to the deployment group before the most recent successful
     *            deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentInfo withPreviousRevision(RevisionLocation previousRevision) {
        this.previousRevision = previousRevision;
        return this;
    }

    /**
     * <p>
     * Information about the location of stored application artifacts and the
     * service from which to retrieve them.
     * </p>
     *
     * @return <p>
     *         Information about the location of stored application artifacts
     *         and the service from which to retrieve them.
     *         </p>
     */
    public RevisionLocation getRevision() {
        return revision;
    }

    /**
     * <p>
     * Information about the location of stored application artifacts and the
     * service from which to retrieve them.
     * </p>
     *
     * @param revision <p>
     *            Information about the location of stored application artifacts
     *            and the service from which to retrieve them.
     *            </p>
     */
    public void setRevision(RevisionLocation revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * Information about the location of stored application artifacts and the
     * service from which to retrieve them.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revision <p>
     *            Information about the location of stored application artifacts
     *            and the service from which to retrieve them.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentInfo withRevision(RevisionLocation revision) {
        this.revision = revision;
        return this;
    }

    /**
     * <p>
     * The current state of the deployment as a whole.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Created, Queued, InProgress, Baking, Succeeded,
     * Failed, Stopped, Ready
     *
     * @return <p>
     *         The current state of the deployment as a whole.
     *         </p>
     * @see DeploymentStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current state of the deployment as a whole.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Created, Queued, InProgress, Baking, Succeeded,
     * Failed, Stopped, Ready
     *
     * @param status <p>
     *            The current state of the deployment as a whole.
     *            </p>
     * @see DeploymentStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the deployment as a whole.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Created, Queued, InProgress, Baking, Succeeded,
     * Failed, Stopped, Ready
     *
     * @param status <p>
     *            The current state of the deployment as a whole.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeploymentStatus
     */
    public DeploymentInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current state of the deployment as a whole.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Created, Queued, InProgress, Baking, Succeeded,
     * Failed, Stopped, Ready
     *
     * @param status <p>
     *            The current state of the deployment as a whole.
     *            </p>
     * @see DeploymentStatus
     */
    public void setStatus(DeploymentStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current state of the deployment as a whole.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Created, Queued, InProgress, Baking, Succeeded,
     * Failed, Stopped, Ready
     *
     * @param status <p>
     *            The current state of the deployment as a whole.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeploymentStatus
     */
    public DeploymentInfo withStatus(DeploymentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Information about any error associated with this deployment.
     * </p>
     *
     * @return <p>
     *         Information about any error associated with this deployment.
     *         </p>
     */
    public ErrorInformation getErrorInformation() {
        return errorInformation;
    }

    /**
     * <p>
     * Information about any error associated with this deployment.
     * </p>
     *
     * @param errorInformation <p>
     *            Information about any error associated with this deployment.
     *            </p>
     */
    public void setErrorInformation(ErrorInformation errorInformation) {
        this.errorInformation = errorInformation;
    }

    /**
     * <p>
     * Information about any error associated with this deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorInformation <p>
     *            Information about any error associated with this deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentInfo withErrorInformation(ErrorInformation errorInformation) {
        this.errorInformation = errorInformation;
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the deployment was created.
     * </p>
     *
     * @return <p>
     *         A timestamp that indicates when the deployment was created.
     *         </p>
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the deployment was created.
     * </p>
     *
     * @param createTime <p>
     *            A timestamp that indicates when the deployment was created.
     *            </p>
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the deployment was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createTime <p>
     *            A timestamp that indicates when the deployment was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentInfo withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the deployment was deployed to the
     * deployment group.
     * </p>
     * <p>
     * In some cases, the reported value of the start time might be later than
     * the complete time. This is due to differences in the clock settings of
     * backend servers that participate in the deployment process.
     * </p>
     *
     * @return <p>
     *         A timestamp that indicates when the deployment was deployed to
     *         the deployment group.
     *         </p>
     *         <p>
     *         In some cases, the reported value of the start time might be
     *         later than the complete time. This is due to differences in the
     *         clock settings of backend servers that participate in the
     *         deployment process.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the deployment was deployed to the
     * deployment group.
     * </p>
     * <p>
     * In some cases, the reported value of the start time might be later than
     * the complete time. This is due to differences in the clock settings of
     * backend servers that participate in the deployment process.
     * </p>
     *
     * @param startTime <p>
     *            A timestamp that indicates when the deployment was deployed to
     *            the deployment group.
     *            </p>
     *            <p>
     *            In some cases, the reported value of the start time might be
     *            later than the complete time. This is due to differences in
     *            the clock settings of backend servers that participate in the
     *            deployment process.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the deployment was deployed to the
     * deployment group.
     * </p>
     * <p>
     * In some cases, the reported value of the start time might be later than
     * the complete time. This is due to differences in the clock settings of
     * backend servers that participate in the deployment process.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            A timestamp that indicates when the deployment was deployed to
     *            the deployment group.
     *            </p>
     *            <p>
     *            In some cases, the reported value of the start time might be
     *            later than the complete time. This is due to differences in
     *            the clock settings of backend servers that participate in the
     *            deployment process.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentInfo withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the deployment was complete.
     * </p>
     *
     * @return <p>
     *         A timestamp that indicates when the deployment was complete.
     *         </p>
     */
    public java.util.Date getCompleteTime() {
        return completeTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the deployment was complete.
     * </p>
     *
     * @param completeTime <p>
     *            A timestamp that indicates when the deployment was complete.
     *            </p>
     */
    public void setCompleteTime(java.util.Date completeTime) {
        this.completeTime = completeTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the deployment was complete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completeTime <p>
     *            A timestamp that indicates when the deployment was complete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentInfo withCompleteTime(java.util.Date completeTime) {
        this.completeTime = completeTime;
        return this;
    }

    /**
     * <p>
     * A summary of the deployment status of the instances in the deployment.
     * </p>
     *
     * @return <p>
     *         A summary of the deployment status of the instances in the
     *         deployment.
     *         </p>
     */
    public DeploymentOverview getDeploymentOverview() {
        return deploymentOverview;
    }

    /**
     * <p>
     * A summary of the deployment status of the instances in the deployment.
     * </p>
     *
     * @param deploymentOverview <p>
     *            A summary of the deployment status of the instances in the
     *            deployment.
     *            </p>
     */
    public void setDeploymentOverview(DeploymentOverview deploymentOverview) {
        this.deploymentOverview = deploymentOverview;
    }

    /**
     * <p>
     * A summary of the deployment status of the instances in the deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentOverview <p>
     *            A summary of the deployment status of the instances in the
     *            deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentInfo withDeploymentOverview(DeploymentOverview deploymentOverview) {
        this.deploymentOverview = deploymentOverview;
        return this;
    }

    /**
     * <p>
     * A comment about the deployment.
     * </p>
     *
     * @return <p>
     *         A comment about the deployment.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A comment about the deployment.
     * </p>
     *
     * @param description <p>
     *            A comment about the deployment.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A comment about the deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A comment about the deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The means by which the deployment was created:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>user</code>: A user created the deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling</code>: Amazon EC2 Auto Scaling created the deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>codeDeployRollback</code>: A rollback process created the
     * deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>user, autoscaling, codeDeployRollback, CodeDeploy,
     * CloudFormation, CloudFormationRollback
     *
     * @return <p>
     *         The means by which the deployment was created:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>user</code>: A user created the deployment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>autoscaling</code>: Amazon EC2 Auto Scaling created the
     *         deployment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>codeDeployRollback</code>: A rollback process created the
     *         deployment.
     *         </p>
     *         </li>
     *         </ul>
     * @see DeploymentCreator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * <p>
     * The means by which the deployment was created:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>user</code>: A user created the deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling</code>: Amazon EC2 Auto Scaling created the deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>codeDeployRollback</code>: A rollback process created the
     * deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>user, autoscaling, codeDeployRollback, CodeDeploy,
     * CloudFormation, CloudFormationRollback
     *
     * @param creator <p>
     *            The means by which the deployment was created:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>user</code>: A user created the deployment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>autoscaling</code>: Amazon EC2 Auto Scaling created the
     *            deployment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>codeDeployRollback</code>: A rollback process created
     *            the deployment.
     *            </p>
     *            </li>
     *            </ul>
     * @see DeploymentCreator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * <p>
     * The means by which the deployment was created:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>user</code>: A user created the deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling</code>: Amazon EC2 Auto Scaling created the deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>codeDeployRollback</code>: A rollback process created the
     * deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>user, autoscaling, codeDeployRollback, CodeDeploy,
     * CloudFormation, CloudFormationRollback
     *
     * @param creator <p>
     *            The means by which the deployment was created:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>user</code>: A user created the deployment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>autoscaling</code>: Amazon EC2 Auto Scaling created the
     *            deployment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>codeDeployRollback</code>: A rollback process created
     *            the deployment.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeploymentCreator
     */
    public DeploymentInfo withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * <p>
     * The means by which the deployment was created:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>user</code>: A user created the deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling</code>: Amazon EC2 Auto Scaling created the deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>codeDeployRollback</code>: A rollback process created the
     * deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>user, autoscaling, codeDeployRollback, CodeDeploy,
     * CloudFormation, CloudFormationRollback
     *
     * @param creator <p>
     *            The means by which the deployment was created:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>user</code>: A user created the deployment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>autoscaling</code>: Amazon EC2 Auto Scaling created the
     *            deployment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>codeDeployRollback</code>: A rollback process created
     *            the deployment.
     *            </p>
     *            </li>
     *            </ul>
     * @see DeploymentCreator
     */
    public void setCreator(DeploymentCreator creator) {
        this.creator = creator.toString();
    }

    /**
     * <p>
     * The means by which the deployment was created:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>user</code>: A user created the deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>autoscaling</code>: Amazon EC2 Auto Scaling created the deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>codeDeployRollback</code>: A rollback process created the
     * deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>user, autoscaling, codeDeployRollback, CodeDeploy,
     * CloudFormation, CloudFormationRollback
     *
     * @param creator <p>
     *            The means by which the deployment was created:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>user</code>: A user created the deployment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>autoscaling</code>: Amazon EC2 Auto Scaling created the
     *            deployment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>codeDeployRollback</code>: A rollback process created
     *            the deployment.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeploymentCreator
     */
    public DeploymentInfo withCreator(DeploymentCreator creator) {
        this.creator = creator.toString();
        return this;
    }

    /**
     * <p>
     * If true, then if an <code>ApplicationStop</code>,
     * <code>BeforeBlockTraffic</code>, or <code>AfterBlockTraffic</code>
     * deployment lifecycle event to an instance fails, then the deployment
     * continues to the next deployment lifecycle event. For example, if
     * <code>ApplicationStop</code> fails, the deployment continues with
     * DownloadBundle. If <code>BeforeBlockTraffic</code> fails, the deployment
     * continues with <code>BlockTraffic</code>. If
     * <code>AfterBlockTraffic</code> fails, the deployment continues with
     * <code>ApplicationStop</code>.
     * </p>
     * <p>
     * If false or not specified, then if a lifecycle event fails during a
     * deployment to an instance, that deployment fails. If deployment to that
     * instance is part of an overall deployment and the number of healthy hosts
     * is not less than the minimum number of healthy hosts, then a deployment
     * to the next instance is attempted.
     * </p>
     * <p>
     * During a deployment, the AWS CodeDeploy agent runs the scripts specified
     * for <code>ApplicationStop</code>, <code>BeforeBlockTraffic</code>, and
     * <code>AfterBlockTraffic</code> in the AppSpec file from the previous
     * successful deployment. (All other scripts are run from the AppSpec file
     * in the current deployment.) If one of these scripts contains an error and
     * does not run successfully, the deployment can fail.
     * </p>
     * <p>
     * If the cause of the failure is a script from the last successful
     * deployment that will never run successfully, create a new deployment and
     * use <code>ignoreApplicationStopFailures</code> to specify that the
     * <code>ApplicationStop</code>, <code>BeforeBlockTraffic</code>, and
     * <code>AfterBlockTraffic</code> failures should be ignored.
     * </p>
     *
     * @return <p>
     *         If true, then if an <code>ApplicationStop</code>,
     *         <code>BeforeBlockTraffic</code>, or
     *         <code>AfterBlockTraffic</code> deployment lifecycle event to an
     *         instance fails, then the deployment continues to the next
     *         deployment lifecycle event. For example, if
     *         <code>ApplicationStop</code> fails, the deployment continues with
     *         DownloadBundle. If <code>BeforeBlockTraffic</code> fails, the
     *         deployment continues with <code>BlockTraffic</code>. If
     *         <code>AfterBlockTraffic</code> fails, the deployment continues
     *         with <code>ApplicationStop</code>.
     *         </p>
     *         <p>
     *         If false or not specified, then if a lifecycle event fails during
     *         a deployment to an instance, that deployment fails. If deployment
     *         to that instance is part of an overall deployment and the number
     *         of healthy hosts is not less than the minimum number of healthy
     *         hosts, then a deployment to the next instance is attempted.
     *         </p>
     *         <p>
     *         During a deployment, the AWS CodeDeploy agent runs the scripts
     *         specified for <code>ApplicationStop</code>,
     *         <code>BeforeBlockTraffic</code>, and
     *         <code>AfterBlockTraffic</code> in the AppSpec file from the
     *         previous successful deployment. (All other scripts are run from
     *         the AppSpec file in the current deployment.) If one of these
     *         scripts contains an error and does not run successfully, the
     *         deployment can fail.
     *         </p>
     *         <p>
     *         If the cause of the failure is a script from the last successful
     *         deployment that will never run successfully, create a new
     *         deployment and use <code>ignoreApplicationStopFailures</code> to
     *         specify that the <code>ApplicationStop</code>,
     *         <code>BeforeBlockTraffic</code>, and
     *         <code>AfterBlockTraffic</code> failures should be ignored.
     *         </p>
     */
    public Boolean isIgnoreApplicationStopFailures() {
        return ignoreApplicationStopFailures;
    }

    /**
     * <p>
     * If true, then if an <code>ApplicationStop</code>,
     * <code>BeforeBlockTraffic</code>, or <code>AfterBlockTraffic</code>
     * deployment lifecycle event to an instance fails, then the deployment
     * continues to the next deployment lifecycle event. For example, if
     * <code>ApplicationStop</code> fails, the deployment continues with
     * DownloadBundle. If <code>BeforeBlockTraffic</code> fails, the deployment
     * continues with <code>BlockTraffic</code>. If
     * <code>AfterBlockTraffic</code> fails, the deployment continues with
     * <code>ApplicationStop</code>.
     * </p>
     * <p>
     * If false or not specified, then if a lifecycle event fails during a
     * deployment to an instance, that deployment fails. If deployment to that
     * instance is part of an overall deployment and the number of healthy hosts
     * is not less than the minimum number of healthy hosts, then a deployment
     * to the next instance is attempted.
     * </p>
     * <p>
     * During a deployment, the AWS CodeDeploy agent runs the scripts specified
     * for <code>ApplicationStop</code>, <code>BeforeBlockTraffic</code>, and
     * <code>AfterBlockTraffic</code> in the AppSpec file from the previous
     * successful deployment. (All other scripts are run from the AppSpec file
     * in the current deployment.) If one of these scripts contains an error and
     * does not run successfully, the deployment can fail.
     * </p>
     * <p>
     * If the cause of the failure is a script from the last successful
     * deployment that will never run successfully, create a new deployment and
     * use <code>ignoreApplicationStopFailures</code> to specify that the
     * <code>ApplicationStop</code>, <code>BeforeBlockTraffic</code>, and
     * <code>AfterBlockTraffic</code> failures should be ignored.
     * </p>
     *
     * @return <p>
     *         If true, then if an <code>ApplicationStop</code>,
     *         <code>BeforeBlockTraffic</code>, or
     *         <code>AfterBlockTraffic</code> deployment lifecycle event to an
     *         instance fails, then the deployment continues to the next
     *         deployment lifecycle event. For example, if
     *         <code>ApplicationStop</code> fails, the deployment continues with
     *         DownloadBundle. If <code>BeforeBlockTraffic</code> fails, the
     *         deployment continues with <code>BlockTraffic</code>. If
     *         <code>AfterBlockTraffic</code> fails, the deployment continues
     *         with <code>ApplicationStop</code>.
     *         </p>
     *         <p>
     *         If false or not specified, then if a lifecycle event fails during
     *         a deployment to an instance, that deployment fails. If deployment
     *         to that instance is part of an overall deployment and the number
     *         of healthy hosts is not less than the minimum number of healthy
     *         hosts, then a deployment to the next instance is attempted.
     *         </p>
     *         <p>
     *         During a deployment, the AWS CodeDeploy agent runs the scripts
     *         specified for <code>ApplicationStop</code>,
     *         <code>BeforeBlockTraffic</code>, and
     *         <code>AfterBlockTraffic</code> in the AppSpec file from the
     *         previous successful deployment. (All other scripts are run from
     *         the AppSpec file in the current deployment.) If one of these
     *         scripts contains an error and does not run successfully, the
     *         deployment can fail.
     *         </p>
     *         <p>
     *         If the cause of the failure is a script from the last successful
     *         deployment that will never run successfully, create a new
     *         deployment and use <code>ignoreApplicationStopFailures</code> to
     *         specify that the <code>ApplicationStop</code>,
     *         <code>BeforeBlockTraffic</code>, and
     *         <code>AfterBlockTraffic</code> failures should be ignored.
     *         </p>
     */
    public Boolean getIgnoreApplicationStopFailures() {
        return ignoreApplicationStopFailures;
    }

    /**
     * <p>
     * If true, then if an <code>ApplicationStop</code>,
     * <code>BeforeBlockTraffic</code>, or <code>AfterBlockTraffic</code>
     * deployment lifecycle event to an instance fails, then the deployment
     * continues to the next deployment lifecycle event. For example, if
     * <code>ApplicationStop</code> fails, the deployment continues with
     * DownloadBundle. If <code>BeforeBlockTraffic</code> fails, the deployment
     * continues with <code>BlockTraffic</code>. If
     * <code>AfterBlockTraffic</code> fails, the deployment continues with
     * <code>ApplicationStop</code>.
     * </p>
     * <p>
     * If false or not specified, then if a lifecycle event fails during a
     * deployment to an instance, that deployment fails. If deployment to that
     * instance is part of an overall deployment and the number of healthy hosts
     * is not less than the minimum number of healthy hosts, then a deployment
     * to the next instance is attempted.
     * </p>
     * <p>
     * During a deployment, the AWS CodeDeploy agent runs the scripts specified
     * for <code>ApplicationStop</code>, <code>BeforeBlockTraffic</code>, and
     * <code>AfterBlockTraffic</code> in the AppSpec file from the previous
     * successful deployment. (All other scripts are run from the AppSpec file
     * in the current deployment.) If one of these scripts contains an error and
     * does not run successfully, the deployment can fail.
     * </p>
     * <p>
     * If the cause of the failure is a script from the last successful
     * deployment that will never run successfully, create a new deployment and
     * use <code>ignoreApplicationStopFailures</code> to specify that the
     * <code>ApplicationStop</code>, <code>BeforeBlockTraffic</code>, and
     * <code>AfterBlockTraffic</code> failures should be ignored.
     * </p>
     *
     * @param ignoreApplicationStopFailures <p>
     *            If true, then if an <code>ApplicationStop</code>,
     *            <code>BeforeBlockTraffic</code>, or
     *            <code>AfterBlockTraffic</code> deployment lifecycle event to
     *            an instance fails, then the deployment continues to the next
     *            deployment lifecycle event. For example, if
     *            <code>ApplicationStop</code> fails, the deployment continues
     *            with DownloadBundle. If <code>BeforeBlockTraffic</code> fails,
     *            the deployment continues with <code>BlockTraffic</code>. If
     *            <code>AfterBlockTraffic</code> fails, the deployment continues
     *            with <code>ApplicationStop</code>.
     *            </p>
     *            <p>
     *            If false or not specified, then if a lifecycle event fails
     *            during a deployment to an instance, that deployment fails. If
     *            deployment to that instance is part of an overall deployment
     *            and the number of healthy hosts is not less than the minimum
     *            number of healthy hosts, then a deployment to the next
     *            instance is attempted.
     *            </p>
     *            <p>
     *            During a deployment, the AWS CodeDeploy agent runs the scripts
     *            specified for <code>ApplicationStop</code>,
     *            <code>BeforeBlockTraffic</code>, and
     *            <code>AfterBlockTraffic</code> in the AppSpec file from the
     *            previous successful deployment. (All other scripts are run
     *            from the AppSpec file in the current deployment.) If one of
     *            these scripts contains an error and does not run successfully,
     *            the deployment can fail.
     *            </p>
     *            <p>
     *            If the cause of the failure is a script from the last
     *            successful deployment that will never run successfully, create
     *            a new deployment and use
     *            <code>ignoreApplicationStopFailures</code> to specify that the
     *            <code>ApplicationStop</code>, <code>BeforeBlockTraffic</code>,
     *            and <code>AfterBlockTraffic</code> failures should be ignored.
     *            </p>
     */
    public void setIgnoreApplicationStopFailures(Boolean ignoreApplicationStopFailures) {
        this.ignoreApplicationStopFailures = ignoreApplicationStopFailures;
    }

    /**
     * <p>
     * If true, then if an <code>ApplicationStop</code>,
     * <code>BeforeBlockTraffic</code>, or <code>AfterBlockTraffic</code>
     * deployment lifecycle event to an instance fails, then the deployment
     * continues to the next deployment lifecycle event. For example, if
     * <code>ApplicationStop</code> fails, the deployment continues with
     * DownloadBundle. If <code>BeforeBlockTraffic</code> fails, the deployment
     * continues with <code>BlockTraffic</code>. If
     * <code>AfterBlockTraffic</code> fails, the deployment continues with
     * <code>ApplicationStop</code>.
     * </p>
     * <p>
     * If false or not specified, then if a lifecycle event fails during a
     * deployment to an instance, that deployment fails. If deployment to that
     * instance is part of an overall deployment and the number of healthy hosts
     * is not less than the minimum number of healthy hosts, then a deployment
     * to the next instance is attempted.
     * </p>
     * <p>
     * During a deployment, the AWS CodeDeploy agent runs the scripts specified
     * for <code>ApplicationStop</code>, <code>BeforeBlockTraffic</code>, and
     * <code>AfterBlockTraffic</code> in the AppSpec file from the previous
     * successful deployment. (All other scripts are run from the AppSpec file
     * in the current deployment.) If one of these scripts contains an error and
     * does not run successfully, the deployment can fail.
     * </p>
     * <p>
     * If the cause of the failure is a script from the last successful
     * deployment that will never run successfully, create a new deployment and
     * use <code>ignoreApplicationStopFailures</code> to specify that the
     * <code>ApplicationStop</code>, <code>BeforeBlockTraffic</code>, and
     * <code>AfterBlockTraffic</code> failures should be ignored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ignoreApplicationStopFailures <p>
     *            If true, then if an <code>ApplicationStop</code>,
     *            <code>BeforeBlockTraffic</code>, or
     *            <code>AfterBlockTraffic</code> deployment lifecycle event to
     *            an instance fails, then the deployment continues to the next
     *            deployment lifecycle event. For example, if
     *            <code>ApplicationStop</code> fails, the deployment continues
     *            with DownloadBundle. If <code>BeforeBlockTraffic</code> fails,
     *            the deployment continues with <code>BlockTraffic</code>. If
     *            <code>AfterBlockTraffic</code> fails, the deployment continues
     *            with <code>ApplicationStop</code>.
     *            </p>
     *            <p>
     *            If false or not specified, then if a lifecycle event fails
     *            during a deployment to an instance, that deployment fails. If
     *            deployment to that instance is part of an overall deployment
     *            and the number of healthy hosts is not less than the minimum
     *            number of healthy hosts, then a deployment to the next
     *            instance is attempted.
     *            </p>
     *            <p>
     *            During a deployment, the AWS CodeDeploy agent runs the scripts
     *            specified for <code>ApplicationStop</code>,
     *            <code>BeforeBlockTraffic</code>, and
     *            <code>AfterBlockTraffic</code> in the AppSpec file from the
     *            previous successful deployment. (All other scripts are run
     *            from the AppSpec file in the current deployment.) If one of
     *            these scripts contains an error and does not run successfully,
     *            the deployment can fail.
     *            </p>
     *            <p>
     *            If the cause of the failure is a script from the last
     *            successful deployment that will never run successfully, create
     *            a new deployment and use
     *            <code>ignoreApplicationStopFailures</code> to specify that the
     *            <code>ApplicationStop</code>, <code>BeforeBlockTraffic</code>,
     *            and <code>AfterBlockTraffic</code> failures should be ignored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentInfo withIgnoreApplicationStopFailures(Boolean ignoreApplicationStopFailures) {
        this.ignoreApplicationStopFailures = ignoreApplicationStopFailures;
        return this;
    }

    /**
     * <p>
     * Information about the automatic rollback configuration associated with
     * the deployment.
     * </p>
     *
     * @return <p>
     *         Information about the automatic rollback configuration associated
     *         with the deployment.
     *         </p>
     */
    public AutoRollbackConfiguration getAutoRollbackConfiguration() {
        return autoRollbackConfiguration;
    }

    /**
     * <p>
     * Information about the automatic rollback configuration associated with
     * the deployment.
     * </p>
     *
     * @param autoRollbackConfiguration <p>
     *            Information about the automatic rollback configuration
     *            associated with the deployment.
     *            </p>
     */
    public void setAutoRollbackConfiguration(AutoRollbackConfiguration autoRollbackConfiguration) {
        this.autoRollbackConfiguration = autoRollbackConfiguration;
    }

    /**
     * <p>
     * Information about the automatic rollback configuration associated with
     * the deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoRollbackConfiguration <p>
     *            Information about the automatic rollback configuration
     *            associated with the deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentInfo withAutoRollbackConfiguration(
            AutoRollbackConfiguration autoRollbackConfiguration) {
        this.autoRollbackConfiguration = autoRollbackConfiguration;
        return this;
    }

    /**
     * <p>
     * Indicates whether only instances that are not running the latest
     * application revision are to be deployed to.
     * </p>
     *
     * @return <p>
     *         Indicates whether only instances that are not running the latest
     *         application revision are to be deployed to.
     *         </p>
     */
    public Boolean isUpdateOutdatedInstancesOnly() {
        return updateOutdatedInstancesOnly;
    }

    /**
     * <p>
     * Indicates whether only instances that are not running the latest
     * application revision are to be deployed to.
     * </p>
     *
     * @return <p>
     *         Indicates whether only instances that are not running the latest
     *         application revision are to be deployed to.
     *         </p>
     */
    public Boolean getUpdateOutdatedInstancesOnly() {
        return updateOutdatedInstancesOnly;
    }

    /**
     * <p>
     * Indicates whether only instances that are not running the latest
     * application revision are to be deployed to.
     * </p>
     *
     * @param updateOutdatedInstancesOnly <p>
     *            Indicates whether only instances that are not running the
     *            latest application revision are to be deployed to.
     *            </p>
     */
    public void setUpdateOutdatedInstancesOnly(Boolean updateOutdatedInstancesOnly) {
        this.updateOutdatedInstancesOnly = updateOutdatedInstancesOnly;
    }

    /**
     * <p>
     * Indicates whether only instances that are not running the latest
     * application revision are to be deployed to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateOutdatedInstancesOnly <p>
     *            Indicates whether only instances that are not running the
     *            latest application revision are to be deployed to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentInfo withUpdateOutdatedInstancesOnly(Boolean updateOutdatedInstancesOnly) {
        this.updateOutdatedInstancesOnly = updateOutdatedInstancesOnly;
        return this;
    }

    /**
     * <p>
     * Information about a deployment rollback.
     * </p>
     *
     * @return <p>
     *         Information about a deployment rollback.
     *         </p>
     */
    public RollbackInfo getRollbackInfo() {
        return rollbackInfo;
    }

    /**
     * <p>
     * Information about a deployment rollback.
     * </p>
     *
     * @param rollbackInfo <p>
     *            Information about a deployment rollback.
     *            </p>
     */
    public void setRollbackInfo(RollbackInfo rollbackInfo) {
        this.rollbackInfo = rollbackInfo;
    }

    /**
     * <p>
     * Information about a deployment rollback.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rollbackInfo <p>
     *            Information about a deployment rollback.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentInfo withRollbackInfo(RollbackInfo rollbackInfo) {
        this.rollbackInfo = rollbackInfo;
        return this;
    }

    /**
     * <p>
     * Information about the type of deployment, either in-place or blue/green,
     * you want to run and whether to route deployment traffic behind a load
     * balancer.
     * </p>
     *
     * @return <p>
     *         Information about the type of deployment, either in-place or
     *         blue/green, you want to run and whether to route deployment
     *         traffic behind a load balancer.
     *         </p>
     */
    public DeploymentStyle getDeploymentStyle() {
        return deploymentStyle;
    }

    /**
     * <p>
     * Information about the type of deployment, either in-place or blue/green,
     * you want to run and whether to route deployment traffic behind a load
     * balancer.
     * </p>
     *
     * @param deploymentStyle <p>
     *            Information about the type of deployment, either in-place or
     *            blue/green, you want to run and whether to route deployment
     *            traffic behind a load balancer.
     *            </p>
     */
    public void setDeploymentStyle(DeploymentStyle deploymentStyle) {
        this.deploymentStyle = deploymentStyle;
    }

    /**
     * <p>
     * Information about the type of deployment, either in-place or blue/green,
     * you want to run and whether to route deployment traffic behind a load
     * balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentStyle <p>
     *            Information about the type of deployment, either in-place or
     *            blue/green, you want to run and whether to route deployment
     *            traffic behind a load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentInfo withDeploymentStyle(DeploymentStyle deploymentStyle) {
        this.deploymentStyle = deploymentStyle;
        return this;
    }

    /**
     * <p>
     * Information about the instances that belong to the replacement
     * environment in a blue/green deployment.
     * </p>
     *
     * @return <p>
     *         Information about the instances that belong to the replacement
     *         environment in a blue/green deployment.
     *         </p>
     */
    public TargetInstances getTargetInstances() {
        return targetInstances;
    }

    /**
     * <p>
     * Information about the instances that belong to the replacement
     * environment in a blue/green deployment.
     * </p>
     *
     * @param targetInstances <p>
     *            Information about the instances that belong to the replacement
     *            environment in a blue/green deployment.
     *            </p>
     */
    public void setTargetInstances(TargetInstances targetInstances) {
        this.targetInstances = targetInstances;
    }

    /**
     * <p>
     * Information about the instances that belong to the replacement
     * environment in a blue/green deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetInstances <p>
     *            Information about the instances that belong to the replacement
     *            environment in a blue/green deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentInfo withTargetInstances(TargetInstances targetInstances) {
        this.targetInstances = targetInstances;
        return this;
    }

    /**
     * <p>
     * Indicates whether the wait period set for the termination of instances in
     * the original environment has started. Status is 'false' if the KEEP_ALIVE
     * option is specified. Otherwise, 'true' as soon as the termination wait
     * period starts.
     * </p>
     *
     * @return <p>
     *         Indicates whether the wait period set for the termination of
     *         instances in the original environment has started. Status is
     *         'false' if the KEEP_ALIVE option is specified. Otherwise, 'true'
     *         as soon as the termination wait period starts.
     *         </p>
     */
    public Boolean isInstanceTerminationWaitTimeStarted() {
        return instanceTerminationWaitTimeStarted;
    }

    /**
     * <p>
     * Indicates whether the wait period set for the termination of instances in
     * the original environment has started. Status is 'false' if the KEEP_ALIVE
     * option is specified. Otherwise, 'true' as soon as the termination wait
     * period starts.
     * </p>
     *
     * @return <p>
     *         Indicates whether the wait period set for the termination of
     *         instances in the original environment has started. Status is
     *         'false' if the KEEP_ALIVE option is specified. Otherwise, 'true'
     *         as soon as the termination wait period starts.
     *         </p>
     */
    public Boolean getInstanceTerminationWaitTimeStarted() {
        return instanceTerminationWaitTimeStarted;
    }

    /**
     * <p>
     * Indicates whether the wait period set for the termination of instances in
     * the original environment has started. Status is 'false' if the KEEP_ALIVE
     * option is specified. Otherwise, 'true' as soon as the termination wait
     * period starts.
     * </p>
     *
     * @param instanceTerminationWaitTimeStarted <p>
     *            Indicates whether the wait period set for the termination of
     *            instances in the original environment has started. Status is
     *            'false' if the KEEP_ALIVE option is specified. Otherwise,
     *            'true' as soon as the termination wait period starts.
     *            </p>
     */
    public void setInstanceTerminationWaitTimeStarted(Boolean instanceTerminationWaitTimeStarted) {
        this.instanceTerminationWaitTimeStarted = instanceTerminationWaitTimeStarted;
    }

    /**
     * <p>
     * Indicates whether the wait period set for the termination of instances in
     * the original environment has started. Status is 'false' if the KEEP_ALIVE
     * option is specified. Otherwise, 'true' as soon as the termination wait
     * period starts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceTerminationWaitTimeStarted <p>
     *            Indicates whether the wait period set for the termination of
     *            instances in the original environment has started. Status is
     *            'false' if the KEEP_ALIVE option is specified. Otherwise,
     *            'true' as soon as the termination wait period starts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentInfo withInstanceTerminationWaitTimeStarted(
            Boolean instanceTerminationWaitTimeStarted) {
        this.instanceTerminationWaitTimeStarted = instanceTerminationWaitTimeStarted;
        return this;
    }

    /**
     * <p>
     * Information about blue/green deployment options for this deployment.
     * </p>
     *
     * @return <p>
     *         Information about blue/green deployment options for this
     *         deployment.
     *         </p>
     */
    public BlueGreenDeploymentConfiguration getBlueGreenDeploymentConfiguration() {
        return blueGreenDeploymentConfiguration;
    }

    /**
     * <p>
     * Information about blue/green deployment options for this deployment.
     * </p>
     *
     * @param blueGreenDeploymentConfiguration <p>
     *            Information about blue/green deployment options for this
     *            deployment.
     *            </p>
     */
    public void setBlueGreenDeploymentConfiguration(
            BlueGreenDeploymentConfiguration blueGreenDeploymentConfiguration) {
        this.blueGreenDeploymentConfiguration = blueGreenDeploymentConfiguration;
    }

    /**
     * <p>
     * Information about blue/green deployment options for this deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blueGreenDeploymentConfiguration <p>
     *            Information about blue/green deployment options for this
     *            deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentInfo withBlueGreenDeploymentConfiguration(
            BlueGreenDeploymentConfiguration blueGreenDeploymentConfiguration) {
        this.blueGreenDeploymentConfiguration = blueGreenDeploymentConfiguration;
        return this;
    }

    /**
     * <p>
     * Information about the load balancer used in the deployment.
     * </p>
     *
     * @return <p>
     *         Information about the load balancer used in the deployment.
     *         </p>
     */
    public LoadBalancerInfo getLoadBalancerInfo() {
        return loadBalancerInfo;
    }

    /**
     * <p>
     * Information about the load balancer used in the deployment.
     * </p>
     *
     * @param loadBalancerInfo <p>
     *            Information about the load balancer used in the deployment.
     *            </p>
     */
    public void setLoadBalancerInfo(LoadBalancerInfo loadBalancerInfo) {
        this.loadBalancerInfo = loadBalancerInfo;
    }

    /**
     * <p>
     * Information about the load balancer used in the deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancerInfo <p>
     *            Information about the load balancer used in the deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentInfo withLoadBalancerInfo(LoadBalancerInfo loadBalancerInfo) {
        this.loadBalancerInfo = loadBalancerInfo;
        return this;
    }

    /**
     * <p>
     * Provides information about the results of a deployment, such as whether
     * instances in the original environment in a blue/green deployment were not
     * terminated.
     * </p>
     *
     * @return <p>
     *         Provides information about the results of a deployment, such as
     *         whether instances in the original environment in a blue/green
     *         deployment were not terminated.
     *         </p>
     */
    public String getAdditionalDeploymentStatusInfo() {
        return additionalDeploymentStatusInfo;
    }

    /**
     * <p>
     * Provides information about the results of a deployment, such as whether
     * instances in the original environment in a blue/green deployment were not
     * terminated.
     * </p>
     *
     * @param additionalDeploymentStatusInfo <p>
     *            Provides information about the results of a deployment, such
     *            as whether instances in the original environment in a
     *            blue/green deployment were not terminated.
     *            </p>
     */
    public void setAdditionalDeploymentStatusInfo(String additionalDeploymentStatusInfo) {
        this.additionalDeploymentStatusInfo = additionalDeploymentStatusInfo;
    }

    /**
     * <p>
     * Provides information about the results of a deployment, such as whether
     * instances in the original environment in a blue/green deployment were not
     * terminated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalDeploymentStatusInfo <p>
     *            Provides information about the results of a deployment, such
     *            as whether instances in the original environment in a
     *            blue/green deployment were not terminated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentInfo withAdditionalDeploymentStatusInfo(String additionalDeploymentStatusInfo) {
        this.additionalDeploymentStatusInfo = additionalDeploymentStatusInfo;
        return this;
    }

    /**
     * <p>
     * Information about how AWS CodeDeploy handles files that already exist in
     * a deployment target location but weren't part of the previous successful
     * deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISALLOW</code>: The deployment fails. This is also the default
     * behavior if no option is specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OVERWRITE</code>: The version of the file from the application
     * revision currently being deployed replaces the version already on the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RETAIN</code>: The version of the file already on the instance is
     * kept and used as part of the new deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISALLOW, OVERWRITE, RETAIN
     *
     * @return <p>
     *         Information about how AWS CodeDeploy handles files that already
     *         exist in a deployment target location but weren't part of the
     *         previous successful deployment.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DISALLOW</code>: The deployment fails. This is also the
     *         default behavior if no option is specified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OVERWRITE</code>: The version of the file from the
     *         application revision currently being deployed replaces the
     *         version already on the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RETAIN</code>: The version of the file already on the
     *         instance is kept and used as part of the new deployment.
     *         </p>
     *         </li>
     *         </ul>
     * @see FileExistsBehavior
     */
    public String getFileExistsBehavior() {
        return fileExistsBehavior;
    }

    /**
     * <p>
     * Information about how AWS CodeDeploy handles files that already exist in
     * a deployment target location but weren't part of the previous successful
     * deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISALLOW</code>: The deployment fails. This is also the default
     * behavior if no option is specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OVERWRITE</code>: The version of the file from the application
     * revision currently being deployed replaces the version already on the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RETAIN</code>: The version of the file already on the instance is
     * kept and used as part of the new deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISALLOW, OVERWRITE, RETAIN
     *
     * @param fileExistsBehavior <p>
     *            Information about how AWS CodeDeploy handles files that
     *            already exist in a deployment target location but weren't part
     *            of the previous successful deployment.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DISALLOW</code>: The deployment fails. This is also the
     *            default behavior if no option is specified.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OVERWRITE</code>: The version of the file from the
     *            application revision currently being deployed replaces the
     *            version already on the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RETAIN</code>: The version of the file already on the
     *            instance is kept and used as part of the new deployment.
     *            </p>
     *            </li>
     *            </ul>
     * @see FileExistsBehavior
     */
    public void setFileExistsBehavior(String fileExistsBehavior) {
        this.fileExistsBehavior = fileExistsBehavior;
    }

    /**
     * <p>
     * Information about how AWS CodeDeploy handles files that already exist in
     * a deployment target location but weren't part of the previous successful
     * deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISALLOW</code>: The deployment fails. This is also the default
     * behavior if no option is specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OVERWRITE</code>: The version of the file from the application
     * revision currently being deployed replaces the version already on the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RETAIN</code>: The version of the file already on the instance is
     * kept and used as part of the new deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISALLOW, OVERWRITE, RETAIN
     *
     * @param fileExistsBehavior <p>
     *            Information about how AWS CodeDeploy handles files that
     *            already exist in a deployment target location but weren't part
     *            of the previous successful deployment.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DISALLOW</code>: The deployment fails. This is also the
     *            default behavior if no option is specified.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OVERWRITE</code>: The version of the file from the
     *            application revision currently being deployed replaces the
     *            version already on the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RETAIN</code>: The version of the file already on the
     *            instance is kept and used as part of the new deployment.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileExistsBehavior
     */
    public DeploymentInfo withFileExistsBehavior(String fileExistsBehavior) {
        this.fileExistsBehavior = fileExistsBehavior;
        return this;
    }

    /**
     * <p>
     * Information about how AWS CodeDeploy handles files that already exist in
     * a deployment target location but weren't part of the previous successful
     * deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISALLOW</code>: The deployment fails. This is also the default
     * behavior if no option is specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OVERWRITE</code>: The version of the file from the application
     * revision currently being deployed replaces the version already on the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RETAIN</code>: The version of the file already on the instance is
     * kept and used as part of the new deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISALLOW, OVERWRITE, RETAIN
     *
     * @param fileExistsBehavior <p>
     *            Information about how AWS CodeDeploy handles files that
     *            already exist in a deployment target location but weren't part
     *            of the previous successful deployment.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DISALLOW</code>: The deployment fails. This is also the
     *            default behavior if no option is specified.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OVERWRITE</code>: The version of the file from the
     *            application revision currently being deployed replaces the
     *            version already on the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RETAIN</code>: The version of the file already on the
     *            instance is kept and used as part of the new deployment.
     *            </p>
     *            </li>
     *            </ul>
     * @see FileExistsBehavior
     */
    public void setFileExistsBehavior(FileExistsBehavior fileExistsBehavior) {
        this.fileExistsBehavior = fileExistsBehavior.toString();
    }

    /**
     * <p>
     * Information about how AWS CodeDeploy handles files that already exist in
     * a deployment target location but weren't part of the previous successful
     * deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISALLOW</code>: The deployment fails. This is also the default
     * behavior if no option is specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OVERWRITE</code>: The version of the file from the application
     * revision currently being deployed replaces the version already on the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RETAIN</code>: The version of the file already on the instance is
     * kept and used as part of the new deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISALLOW, OVERWRITE, RETAIN
     *
     * @param fileExistsBehavior <p>
     *            Information about how AWS CodeDeploy handles files that
     *            already exist in a deployment target location but weren't part
     *            of the previous successful deployment.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DISALLOW</code>: The deployment fails. This is also the
     *            default behavior if no option is specified.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OVERWRITE</code>: The version of the file from the
     *            application revision currently being deployed replaces the
     *            version already on the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RETAIN</code>: The version of the file already on the
     *            instance is kept and used as part of the new deployment.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileExistsBehavior
     */
    public DeploymentInfo withFileExistsBehavior(FileExistsBehavior fileExistsBehavior) {
        this.fileExistsBehavior = fileExistsBehavior.toString();
        return this;
    }

    /**
     * <p>
     * Messages that contain information about the status of a deployment.
     * </p>
     *
     * @return <p>
     *         Messages that contain information about the status of a
     *         deployment.
     *         </p>
     */
    public java.util.List<String> getDeploymentStatusMessages() {
        return deploymentStatusMessages;
    }

    /**
     * <p>
     * Messages that contain information about the status of a deployment.
     * </p>
     *
     * @param deploymentStatusMessages <p>
     *            Messages that contain information about the status of a
     *            deployment.
     *            </p>
     */
    public void setDeploymentStatusMessages(java.util.Collection<String> deploymentStatusMessages) {
        if (deploymentStatusMessages == null) {
            this.deploymentStatusMessages = null;
            return;
        }

        this.deploymentStatusMessages = new java.util.ArrayList<String>(deploymentStatusMessages);
    }

    /**
     * <p>
     * Messages that contain information about the status of a deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentStatusMessages <p>
     *            Messages that contain information about the status of a
     *            deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentInfo withDeploymentStatusMessages(String... deploymentStatusMessages) {
        if (getDeploymentStatusMessages() == null) {
            this.deploymentStatusMessages = new java.util.ArrayList<String>(
                    deploymentStatusMessages.length);
        }
        for (String value : deploymentStatusMessages) {
            this.deploymentStatusMessages.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Messages that contain information about the status of a deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentStatusMessages <p>
     *            Messages that contain information about the status of a
     *            deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentInfo withDeploymentStatusMessages(
            java.util.Collection<String> deploymentStatusMessages) {
        setDeploymentStatusMessages(deploymentStatusMessages);
        return this;
    }

    /**
     * <p>
     * The destination platform type for the deployment (<code>Lambda</code>,
     * <code>Server</code>, or <code>ECS</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Server, Lambda, ECS
     *
     * @return <p>
     *         The destination platform type for the deployment (
     *         <code>Lambda</code>, <code>Server</code>, or <code>ECS</code>).
     *         </p>
     * @see ComputePlatform
     */
    public String getComputePlatform() {
        return computePlatform;
    }

    /**
     * <p>
     * The destination platform type for the deployment (<code>Lambda</code>,
     * <code>Server</code>, or <code>ECS</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Server, Lambda, ECS
     *
     * @param computePlatform <p>
     *            The destination platform type for the deployment (
     *            <code>Lambda</code>, <code>Server</code>, or <code>ECS</code>
     *            ).
     *            </p>
     * @see ComputePlatform
     */
    public void setComputePlatform(String computePlatform) {
        this.computePlatform = computePlatform;
    }

    /**
     * <p>
     * The destination platform type for the deployment (<code>Lambda</code>,
     * <code>Server</code>, or <code>ECS</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Server, Lambda, ECS
     *
     * @param computePlatform <p>
     *            The destination platform type for the deployment (
     *            <code>Lambda</code>, <code>Server</code>, or <code>ECS</code>
     *            ).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComputePlatform
     */
    public DeploymentInfo withComputePlatform(String computePlatform) {
        this.computePlatform = computePlatform;
        return this;
    }

    /**
     * <p>
     * The destination platform type for the deployment (<code>Lambda</code>,
     * <code>Server</code>, or <code>ECS</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Server, Lambda, ECS
     *
     * @param computePlatform <p>
     *            The destination platform type for the deployment (
     *            <code>Lambda</code>, <code>Server</code>, or <code>ECS</code>
     *            ).
     *            </p>
     * @see ComputePlatform
     */
    public void setComputePlatform(ComputePlatform computePlatform) {
        this.computePlatform = computePlatform.toString();
    }

    /**
     * <p>
     * The destination platform type for the deployment (<code>Lambda</code>,
     * <code>Server</code>, or <code>ECS</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Server, Lambda, ECS
     *
     * @param computePlatform <p>
     *            The destination platform type for the deployment (
     *            <code>Lambda</code>, <code>Server</code>, or <code>ECS</code>
     *            ).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComputePlatform
     */
    public DeploymentInfo withComputePlatform(ComputePlatform computePlatform) {
        this.computePlatform = computePlatform.toString();
        return this;
    }

    /**
     * <p>
     * The unique ID for an external resource (for example, a CloudFormation
     * stack ID) that is linked to this deployment.
     * </p>
     *
     * @return <p>
     *         The unique ID for an external resource (for example, a
     *         CloudFormation stack ID) that is linked to this deployment.
     *         </p>
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * <p>
     * The unique ID for an external resource (for example, a CloudFormation
     * stack ID) that is linked to this deployment.
     * </p>
     *
     * @param externalId <p>
     *            The unique ID for an external resource (for example, a
     *            CloudFormation stack ID) that is linked to this deployment.
     *            </p>
     */
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * The unique ID for an external resource (for example, a CloudFormation
     * stack ID) that is linked to this deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param externalId <p>
     *            The unique ID for an external resource (for example, a
     *            CloudFormation stack ID) that is linked to this deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentInfo withExternalId(String externalId) {
        this.externalId = externalId;
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
        if (getApplicationName() != null)
            sb.append("applicationName: " + getApplicationName() + ",");
        if (getDeploymentGroupName() != null)
            sb.append("deploymentGroupName: " + getDeploymentGroupName() + ",");
        if (getDeploymentConfigName() != null)
            sb.append("deploymentConfigName: " + getDeploymentConfigName() + ",");
        if (getDeploymentId() != null)
            sb.append("deploymentId: " + getDeploymentId() + ",");
        if (getPreviousRevision() != null)
            sb.append("previousRevision: " + getPreviousRevision() + ",");
        if (getRevision() != null)
            sb.append("revision: " + getRevision() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getErrorInformation() != null)
            sb.append("errorInformation: " + getErrorInformation() + ",");
        if (getCreateTime() != null)
            sb.append("createTime: " + getCreateTime() + ",");
        if (getStartTime() != null)
            sb.append("startTime: " + getStartTime() + ",");
        if (getCompleteTime() != null)
            sb.append("completeTime: " + getCompleteTime() + ",");
        if (getDeploymentOverview() != null)
            sb.append("deploymentOverview: " + getDeploymentOverview() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getCreator() != null)
            sb.append("creator: " + getCreator() + ",");
        if (getIgnoreApplicationStopFailures() != null)
            sb.append("ignoreApplicationStopFailures: " + getIgnoreApplicationStopFailures() + ",");
        if (getAutoRollbackConfiguration() != null)
            sb.append("autoRollbackConfiguration: " + getAutoRollbackConfiguration() + ",");
        if (getUpdateOutdatedInstancesOnly() != null)
            sb.append("updateOutdatedInstancesOnly: " + getUpdateOutdatedInstancesOnly() + ",");
        if (getRollbackInfo() != null)
            sb.append("rollbackInfo: " + getRollbackInfo() + ",");
        if (getDeploymentStyle() != null)
            sb.append("deploymentStyle: " + getDeploymentStyle() + ",");
        if (getTargetInstances() != null)
            sb.append("targetInstances: " + getTargetInstances() + ",");
        if (getInstanceTerminationWaitTimeStarted() != null)
            sb.append("instanceTerminationWaitTimeStarted: "
                    + getInstanceTerminationWaitTimeStarted() + ",");
        if (getBlueGreenDeploymentConfiguration() != null)
            sb.append("blueGreenDeploymentConfiguration: " + getBlueGreenDeploymentConfiguration()
                    + ",");
        if (getLoadBalancerInfo() != null)
            sb.append("loadBalancerInfo: " + getLoadBalancerInfo() + ",");
        if (getAdditionalDeploymentStatusInfo() != null)
            sb.append("additionalDeploymentStatusInfo: " + getAdditionalDeploymentStatusInfo()
                    + ",");
        if (getFileExistsBehavior() != null)
            sb.append("fileExistsBehavior: " + getFileExistsBehavior() + ",");
        if (getDeploymentStatusMessages() != null)
            sb.append("deploymentStatusMessages: " + getDeploymentStatusMessages() + ",");
        if (getComputePlatform() != null)
            sb.append("computePlatform: " + getComputePlatform() + ",");
        if (getExternalId() != null)
            sb.append("externalId: " + getExternalId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentGroupName() == null) ? 0 : getDeploymentGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentConfigName() == null) ? 0 : getDeploymentConfigName().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode
                + ((getPreviousRevision() == null) ? 0 : getPreviousRevision().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getErrorInformation() == null) ? 0 : getErrorInformation().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getCompleteTime() == null) ? 0 : getCompleteTime().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentOverview() == null) ? 0 : getDeploymentOverview().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreator() == null) ? 0 : getCreator().hashCode());
        hashCode = prime
                * hashCode
                + ((getIgnoreApplicationStopFailures() == null) ? 0
                        : getIgnoreApplicationStopFailures().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoRollbackConfiguration() == null) ? 0 : getAutoRollbackConfiguration()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getUpdateOutdatedInstancesOnly() == null) ? 0
                        : getUpdateOutdatedInstancesOnly().hashCode());
        hashCode = prime * hashCode
                + ((getRollbackInfo() == null) ? 0 : getRollbackInfo().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentStyle() == null) ? 0 : getDeploymentStyle().hashCode());
        hashCode = prime * hashCode
                + ((getTargetInstances() == null) ? 0 : getTargetInstances().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceTerminationWaitTimeStarted() == null) ? 0
                        : getInstanceTerminationWaitTimeStarted().hashCode());
        hashCode = prime
                * hashCode
                + ((getBlueGreenDeploymentConfiguration() == null) ? 0
                        : getBlueGreenDeploymentConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getLoadBalancerInfo() == null) ? 0 : getLoadBalancerInfo().hashCode());
        hashCode = prime
                * hashCode
                + ((getAdditionalDeploymentStatusInfo() == null) ? 0
                        : getAdditionalDeploymentStatusInfo().hashCode());
        hashCode = prime * hashCode
                + ((getFileExistsBehavior() == null) ? 0 : getFileExistsBehavior().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeploymentStatusMessages() == null) ? 0 : getDeploymentStatusMessages()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getComputePlatform() == null) ? 0 : getComputePlatform().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentInfo == false)
            return false;
        DeploymentInfo other = (DeploymentInfo) obj;

        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null
                && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getDeploymentGroupName() == null ^ this.getDeploymentGroupName() == null)
            return false;
        if (other.getDeploymentGroupName() != null
                && other.getDeploymentGroupName().equals(this.getDeploymentGroupName()) == false)
            return false;
        if (other.getDeploymentConfigName() == null ^ this.getDeploymentConfigName() == null)
            return false;
        if (other.getDeploymentConfigName() != null
                && other.getDeploymentConfigName().equals(this.getDeploymentConfigName()) == false)
            return false;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null
                && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getPreviousRevision() == null ^ this.getPreviousRevision() == null)
            return false;
        if (other.getPreviousRevision() != null
                && other.getPreviousRevision().equals(this.getPreviousRevision()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getErrorInformation() == null ^ this.getErrorInformation() == null)
            return false;
        if (other.getErrorInformation() != null
                && other.getErrorInformation().equals(this.getErrorInformation()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null
                && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getCompleteTime() == null ^ this.getCompleteTime() == null)
            return false;
        if (other.getCompleteTime() != null
                && other.getCompleteTime().equals(this.getCompleteTime()) == false)
            return false;
        if (other.getDeploymentOverview() == null ^ this.getDeploymentOverview() == null)
            return false;
        if (other.getDeploymentOverview() != null
                && other.getDeploymentOverview().equals(this.getDeploymentOverview()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreator() == null ^ this.getCreator() == null)
            return false;
        if (other.getCreator() != null && other.getCreator().equals(this.getCreator()) == false)
            return false;
        if (other.getIgnoreApplicationStopFailures() == null
                ^ this.getIgnoreApplicationStopFailures() == null)
            return false;
        if (other.getIgnoreApplicationStopFailures() != null
                && other.getIgnoreApplicationStopFailures().equals(
                        this.getIgnoreApplicationStopFailures()) == false)
            return false;
        if (other.getAutoRollbackConfiguration() == null
                ^ this.getAutoRollbackConfiguration() == null)
            return false;
        if (other.getAutoRollbackConfiguration() != null
                && other.getAutoRollbackConfiguration().equals(this.getAutoRollbackConfiguration()) == false)
            return false;
        if (other.getUpdateOutdatedInstancesOnly() == null
                ^ this.getUpdateOutdatedInstancesOnly() == null)
            return false;
        if (other.getUpdateOutdatedInstancesOnly() != null
                && other.getUpdateOutdatedInstancesOnly().equals(
                        this.getUpdateOutdatedInstancesOnly()) == false)
            return false;
        if (other.getRollbackInfo() == null ^ this.getRollbackInfo() == null)
            return false;
        if (other.getRollbackInfo() != null
                && other.getRollbackInfo().equals(this.getRollbackInfo()) == false)
            return false;
        if (other.getDeploymentStyle() == null ^ this.getDeploymentStyle() == null)
            return false;
        if (other.getDeploymentStyle() != null
                && other.getDeploymentStyle().equals(this.getDeploymentStyle()) == false)
            return false;
        if (other.getTargetInstances() == null ^ this.getTargetInstances() == null)
            return false;
        if (other.getTargetInstances() != null
                && other.getTargetInstances().equals(this.getTargetInstances()) == false)
            return false;
        if (other.getInstanceTerminationWaitTimeStarted() == null
                ^ this.getInstanceTerminationWaitTimeStarted() == null)
            return false;
        if (other.getInstanceTerminationWaitTimeStarted() != null
                && other.getInstanceTerminationWaitTimeStarted().equals(
                        this.getInstanceTerminationWaitTimeStarted()) == false)
            return false;
        if (other.getBlueGreenDeploymentConfiguration() == null
                ^ this.getBlueGreenDeploymentConfiguration() == null)
            return false;
        if (other.getBlueGreenDeploymentConfiguration() != null
                && other.getBlueGreenDeploymentConfiguration().equals(
                        this.getBlueGreenDeploymentConfiguration()) == false)
            return false;
        if (other.getLoadBalancerInfo() == null ^ this.getLoadBalancerInfo() == null)
            return false;
        if (other.getLoadBalancerInfo() != null
                && other.getLoadBalancerInfo().equals(this.getLoadBalancerInfo()) == false)
            return false;
        if (other.getAdditionalDeploymentStatusInfo() == null
                ^ this.getAdditionalDeploymentStatusInfo() == null)
            return false;
        if (other.getAdditionalDeploymentStatusInfo() != null
                && other.getAdditionalDeploymentStatusInfo().equals(
                        this.getAdditionalDeploymentStatusInfo()) == false)
            return false;
        if (other.getFileExistsBehavior() == null ^ this.getFileExistsBehavior() == null)
            return false;
        if (other.getFileExistsBehavior() != null
                && other.getFileExistsBehavior().equals(this.getFileExistsBehavior()) == false)
            return false;
        if (other.getDeploymentStatusMessages() == null
                ^ this.getDeploymentStatusMessages() == null)
            return false;
        if (other.getDeploymentStatusMessages() != null
                && other.getDeploymentStatusMessages().equals(this.getDeploymentStatusMessages()) == false)
            return false;
        if (other.getComputePlatform() == null ^ this.getComputePlatform() == null)
            return false;
        if (other.getComputePlatform() != null
                && other.getComputePlatform().equals(this.getComputePlatform()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null
                && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        return true;
    }
}
