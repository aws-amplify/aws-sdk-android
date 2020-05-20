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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deploys an application revision through the specified deployment group.
 * </p>
 */
public class CreateDeploymentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the IAM user or
     * AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * <p>
     * The name of the deployment group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String deploymentGroupName;

    /**
     * <p>
     * The type and location of the revision to deploy.
     * </p>
     */
    private RevisionLocation revision;

    /**
     * <p>
     * The name of a deployment configuration associated with the IAM user or
     * AWS account.
     * </p>
     * <p>
     * If not specified, the value configured in the deployment group is used as
     * the default. If the deployment group does not have a deployment
     * configuration associated with it, <code>CodeDeployDefault</code>.
     * <code>OneAtATime</code> is used by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String deploymentConfigName;

    /**
     * <p>
     * A comment about the deployment.
     * </p>
     */
    private String description;

    /**
     * <p>
     * If true, then if an <code>ApplicationStop</code>,
     * <code>BeforeBlockTraffic</code>, or <code>AfterBlockTraffic</code>
     * deployment lifecycle event to an instance fails, then the deployment
     * continues to the next deployment lifecycle event. For example, if
     * <code>ApplicationStop</code> fails, the deployment continues with
     * <code>DownloadBundle</code>. If <code>BeforeBlockTraffic</code> fails,
     * the deployment continues with <code>BlockTraffic</code>. If
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
     * Information about the instances that belong to the replacement
     * environment in a blue/green deployment.
     * </p>
     */
    private TargetInstances targetInstances;

    /**
     * <p>
     * Configuration information for an automatic rollback that is added when a
     * deployment is created.
     * </p>
     */
    private AutoRollbackConfiguration autoRollbackConfiguration;

    /**
     * <p>
     * Indicates whether to deploy to all instances or only to instances that
     * are not running the latest application revision.
     * </p>
     */
    private Boolean updateOutdatedInstancesOnly;

    /**
     * <p>
     * Information about how AWS CodeDeploy handles files that already exist in
     * a deployment target location but weren't part of the previous successful
     * deployment.
     * </p>
     * <p>
     * The <code>fileExistsBehavior</code> parameter takes any of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISALLOW: The deployment fails. This is also the default behavior if no
     * option is specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * OVERWRITE: The version of the file from the application revision
     * currently being deployed replaces the version already on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * RETAIN: The version of the file already on the instance is kept and used
     * as part of the new deployment.
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
     * The name of an AWS CodeDeploy application associated with the IAM user or
     * AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of an AWS CodeDeploy application associated with the IAM
     *         user or AWS account.
     *         </p>
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the IAM user or
     * AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of an AWS CodeDeploy application associated with the
     *            IAM user or AWS account.
     *            </p>
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the IAM user or
     * AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of an AWS CodeDeploy application associated with the
     *            IAM user or AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * <p>
     * The name of the deployment group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the deployment group.
     *         </p>
     */
    public String getDeploymentGroupName() {
        return deploymentGroupName;
    }

    /**
     * <p>
     * The name of the deployment group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentGroupName <p>
     *            The name of the deployment group.
     *            </p>
     */
    public void setDeploymentGroupName(String deploymentGroupName) {
        this.deploymentGroupName = deploymentGroupName;
    }

    /**
     * <p>
     * The name of the deployment group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentGroupName <p>
     *            The name of the deployment group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentRequest withDeploymentGroupName(String deploymentGroupName) {
        this.deploymentGroupName = deploymentGroupName;
        return this;
    }

    /**
     * <p>
     * The type and location of the revision to deploy.
     * </p>
     *
     * @return <p>
     *         The type and location of the revision to deploy.
     *         </p>
     */
    public RevisionLocation getRevision() {
        return revision;
    }

    /**
     * <p>
     * The type and location of the revision to deploy.
     * </p>
     *
     * @param revision <p>
     *            The type and location of the revision to deploy.
     *            </p>
     */
    public void setRevision(RevisionLocation revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The type and location of the revision to deploy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revision <p>
     *            The type and location of the revision to deploy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentRequest withRevision(RevisionLocation revision) {
        this.revision = revision;
        return this;
    }

    /**
     * <p>
     * The name of a deployment configuration associated with the IAM user or
     * AWS account.
     * </p>
     * <p>
     * If not specified, the value configured in the deployment group is used as
     * the default. If the deployment group does not have a deployment
     * configuration associated with it, <code>CodeDeployDefault</code>.
     * <code>OneAtATime</code> is used by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of a deployment configuration associated with the IAM
     *         user or AWS account.
     *         </p>
     *         <p>
     *         If not specified, the value configured in the deployment group is
     *         used as the default. If the deployment group does not have a
     *         deployment configuration associated with it,
     *         <code>CodeDeployDefault</code>.<code>OneAtATime</code> is used by
     *         default.
     *         </p>
     */
    public String getDeploymentConfigName() {
        return deploymentConfigName;
    }

    /**
     * <p>
     * The name of a deployment configuration associated with the IAM user or
     * AWS account.
     * </p>
     * <p>
     * If not specified, the value configured in the deployment group is used as
     * the default. If the deployment group does not have a deployment
     * configuration associated with it, <code>CodeDeployDefault</code>.
     * <code>OneAtATime</code> is used by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentConfigName <p>
     *            The name of a deployment configuration associated with the IAM
     *            user or AWS account.
     *            </p>
     *            <p>
     *            If not specified, the value configured in the deployment group
     *            is used as the default. If the deployment group does not have
     *            a deployment configuration associated with it,
     *            <code>CodeDeployDefault</code>.<code>OneAtATime</code> is used
     *            by default.
     *            </p>
     */
    public void setDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
    }

    /**
     * <p>
     * The name of a deployment configuration associated with the IAM user or
     * AWS account.
     * </p>
     * <p>
     * If not specified, the value configured in the deployment group is used as
     * the default. If the deployment group does not have a deployment
     * configuration associated with it, <code>CodeDeployDefault</code>.
     * <code>OneAtATime</code> is used by default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentConfigName <p>
     *            The name of a deployment configuration associated with the IAM
     *            user or AWS account.
     *            </p>
     *            <p>
     *            If not specified, the value configured in the deployment group
     *            is used as the default. If the deployment group does not have
     *            a deployment configuration associated with it,
     *            <code>CodeDeployDefault</code>.<code>OneAtATime</code> is used
     *            by default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentRequest withDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
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
    public CreateDeploymentRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * If true, then if an <code>ApplicationStop</code>,
     * <code>BeforeBlockTraffic</code>, or <code>AfterBlockTraffic</code>
     * deployment lifecycle event to an instance fails, then the deployment
     * continues to the next deployment lifecycle event. For example, if
     * <code>ApplicationStop</code> fails, the deployment continues with
     * <code>DownloadBundle</code>. If <code>BeforeBlockTraffic</code> fails,
     * the deployment continues with <code>BlockTraffic</code>. If
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
     *         <code>DownloadBundle</code>. If <code>BeforeBlockTraffic</code>
     *         fails, the deployment continues with <code>BlockTraffic</code>.
     *         If <code>AfterBlockTraffic</code> fails, the deployment continues
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
     * <code>DownloadBundle</code>. If <code>BeforeBlockTraffic</code> fails,
     * the deployment continues with <code>BlockTraffic</code>. If
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
     *         <code>DownloadBundle</code>. If <code>BeforeBlockTraffic</code>
     *         fails, the deployment continues with <code>BlockTraffic</code>.
     *         If <code>AfterBlockTraffic</code> fails, the deployment continues
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
     * <code>DownloadBundle</code>. If <code>BeforeBlockTraffic</code> fails,
     * the deployment continues with <code>BlockTraffic</code>. If
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
     *            with <code>DownloadBundle</code>. If
     *            <code>BeforeBlockTraffic</code> fails, the deployment
     *            continues with <code>BlockTraffic</code>. If
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
     * <code>DownloadBundle</code>. If <code>BeforeBlockTraffic</code> fails,
     * the deployment continues with <code>BlockTraffic</code>. If
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
     *            with <code>DownloadBundle</code>. If
     *            <code>BeforeBlockTraffic</code> fails, the deployment
     *            continues with <code>BlockTraffic</code>. If
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
    public CreateDeploymentRequest withIgnoreApplicationStopFailures(
            Boolean ignoreApplicationStopFailures) {
        this.ignoreApplicationStopFailures = ignoreApplicationStopFailures;
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
    public CreateDeploymentRequest withTargetInstances(TargetInstances targetInstances) {
        this.targetInstances = targetInstances;
        return this;
    }

    /**
     * <p>
     * Configuration information for an automatic rollback that is added when a
     * deployment is created.
     * </p>
     *
     * @return <p>
     *         Configuration information for an automatic rollback that is added
     *         when a deployment is created.
     *         </p>
     */
    public AutoRollbackConfiguration getAutoRollbackConfiguration() {
        return autoRollbackConfiguration;
    }

    /**
     * <p>
     * Configuration information for an automatic rollback that is added when a
     * deployment is created.
     * </p>
     *
     * @param autoRollbackConfiguration <p>
     *            Configuration information for an automatic rollback that is
     *            added when a deployment is created.
     *            </p>
     */
    public void setAutoRollbackConfiguration(AutoRollbackConfiguration autoRollbackConfiguration) {
        this.autoRollbackConfiguration = autoRollbackConfiguration;
    }

    /**
     * <p>
     * Configuration information for an automatic rollback that is added when a
     * deployment is created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoRollbackConfiguration <p>
     *            Configuration information for an automatic rollback that is
     *            added when a deployment is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentRequest withAutoRollbackConfiguration(
            AutoRollbackConfiguration autoRollbackConfiguration) {
        this.autoRollbackConfiguration = autoRollbackConfiguration;
        return this;
    }

    /**
     * <p>
     * Indicates whether to deploy to all instances or only to instances that
     * are not running the latest application revision.
     * </p>
     *
     * @return <p>
     *         Indicates whether to deploy to all instances or only to instances
     *         that are not running the latest application revision.
     *         </p>
     */
    public Boolean isUpdateOutdatedInstancesOnly() {
        return updateOutdatedInstancesOnly;
    }

    /**
     * <p>
     * Indicates whether to deploy to all instances or only to instances that
     * are not running the latest application revision.
     * </p>
     *
     * @return <p>
     *         Indicates whether to deploy to all instances or only to instances
     *         that are not running the latest application revision.
     *         </p>
     */
    public Boolean getUpdateOutdatedInstancesOnly() {
        return updateOutdatedInstancesOnly;
    }

    /**
     * <p>
     * Indicates whether to deploy to all instances or only to instances that
     * are not running the latest application revision.
     * </p>
     *
     * @param updateOutdatedInstancesOnly <p>
     *            Indicates whether to deploy to all instances or only to
     *            instances that are not running the latest application
     *            revision.
     *            </p>
     */
    public void setUpdateOutdatedInstancesOnly(Boolean updateOutdatedInstancesOnly) {
        this.updateOutdatedInstancesOnly = updateOutdatedInstancesOnly;
    }

    /**
     * <p>
     * Indicates whether to deploy to all instances or only to instances that
     * are not running the latest application revision.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateOutdatedInstancesOnly <p>
     *            Indicates whether to deploy to all instances or only to
     *            instances that are not running the latest application
     *            revision.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentRequest withUpdateOutdatedInstancesOnly(
            Boolean updateOutdatedInstancesOnly) {
        this.updateOutdatedInstancesOnly = updateOutdatedInstancesOnly;
        return this;
    }

    /**
     * <p>
     * Information about how AWS CodeDeploy handles files that already exist in
     * a deployment target location but weren't part of the previous successful
     * deployment.
     * </p>
     * <p>
     * The <code>fileExistsBehavior</code> parameter takes any of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISALLOW: The deployment fails. This is also the default behavior if no
     * option is specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * OVERWRITE: The version of the file from the application revision
     * currently being deployed replaces the version already on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * RETAIN: The version of the file already on the instance is kept and used
     * as part of the new deployment.
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
     *         <p>
     *         The <code>fileExistsBehavior</code> parameter takes any of the
     *         following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         DISALLOW: The deployment fails. This is also the default behavior
     *         if no option is specified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OVERWRITE: The version of the file from the application revision
     *         currently being deployed replaces the version already on the
     *         instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RETAIN: The version of the file already on the instance is kept
     *         and used as part of the new deployment.
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
     * <p>
     * The <code>fileExistsBehavior</code> parameter takes any of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISALLOW: The deployment fails. This is also the default behavior if no
     * option is specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * OVERWRITE: The version of the file from the application revision
     * currently being deployed replaces the version already on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * RETAIN: The version of the file already on the instance is kept and used
     * as part of the new deployment.
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
     *            <p>
     *            The <code>fileExistsBehavior</code> parameter takes any of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            DISALLOW: The deployment fails. This is also the default
     *            behavior if no option is specified.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OVERWRITE: The version of the file from the application
     *            revision currently being deployed replaces the version already
     *            on the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            RETAIN: The version of the file already on the instance is
     *            kept and used as part of the new deployment.
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
     * <p>
     * The <code>fileExistsBehavior</code> parameter takes any of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISALLOW: The deployment fails. This is also the default behavior if no
     * option is specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * OVERWRITE: The version of the file from the application revision
     * currently being deployed replaces the version already on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * RETAIN: The version of the file already on the instance is kept and used
     * as part of the new deployment.
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
     *            <p>
     *            The <code>fileExistsBehavior</code> parameter takes any of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            DISALLOW: The deployment fails. This is also the default
     *            behavior if no option is specified.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OVERWRITE: The version of the file from the application
     *            revision currently being deployed replaces the version already
     *            on the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            RETAIN: The version of the file already on the instance is
     *            kept and used as part of the new deployment.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileExistsBehavior
     */
    public CreateDeploymentRequest withFileExistsBehavior(String fileExistsBehavior) {
        this.fileExistsBehavior = fileExistsBehavior;
        return this;
    }

    /**
     * <p>
     * Information about how AWS CodeDeploy handles files that already exist in
     * a deployment target location but weren't part of the previous successful
     * deployment.
     * </p>
     * <p>
     * The <code>fileExistsBehavior</code> parameter takes any of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISALLOW: The deployment fails. This is also the default behavior if no
     * option is specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * OVERWRITE: The version of the file from the application revision
     * currently being deployed replaces the version already on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * RETAIN: The version of the file already on the instance is kept and used
     * as part of the new deployment.
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
     *            <p>
     *            The <code>fileExistsBehavior</code> parameter takes any of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            DISALLOW: The deployment fails. This is also the default
     *            behavior if no option is specified.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OVERWRITE: The version of the file from the application
     *            revision currently being deployed replaces the version already
     *            on the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            RETAIN: The version of the file already on the instance is
     *            kept and used as part of the new deployment.
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
     * <p>
     * The <code>fileExistsBehavior</code> parameter takes any of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISALLOW: The deployment fails. This is also the default behavior if no
     * option is specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * OVERWRITE: The version of the file from the application revision
     * currently being deployed replaces the version already on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * RETAIN: The version of the file already on the instance is kept and used
     * as part of the new deployment.
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
     *            <p>
     *            The <code>fileExistsBehavior</code> parameter takes any of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            DISALLOW: The deployment fails. This is also the default
     *            behavior if no option is specified.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OVERWRITE: The version of the file from the application
     *            revision currently being deployed replaces the version already
     *            on the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            RETAIN: The version of the file already on the instance is
     *            kept and used as part of the new deployment.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileExistsBehavior
     */
    public CreateDeploymentRequest withFileExistsBehavior(FileExistsBehavior fileExistsBehavior) {
        this.fileExistsBehavior = fileExistsBehavior.toString();
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
        if (getRevision() != null)
            sb.append("revision: " + getRevision() + ",");
        if (getDeploymentConfigName() != null)
            sb.append("deploymentConfigName: " + getDeploymentConfigName() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getIgnoreApplicationStopFailures() != null)
            sb.append("ignoreApplicationStopFailures: " + getIgnoreApplicationStopFailures() + ",");
        if (getTargetInstances() != null)
            sb.append("targetInstances: " + getTargetInstances() + ",");
        if (getAutoRollbackConfiguration() != null)
            sb.append("autoRollbackConfiguration: " + getAutoRollbackConfiguration() + ",");
        if (getUpdateOutdatedInstancesOnly() != null)
            sb.append("updateOutdatedInstancesOnly: " + getUpdateOutdatedInstancesOnly() + ",");
        if (getFileExistsBehavior() != null)
            sb.append("fileExistsBehavior: " + getFileExistsBehavior());
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
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentConfigName() == null) ? 0 : getDeploymentConfigName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getIgnoreApplicationStopFailures() == null) ? 0
                        : getIgnoreApplicationStopFailures().hashCode());
        hashCode = prime * hashCode
                + ((getTargetInstances() == null) ? 0 : getTargetInstances().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoRollbackConfiguration() == null) ? 0 : getAutoRollbackConfiguration()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getUpdateOutdatedInstancesOnly() == null) ? 0
                        : getUpdateOutdatedInstancesOnly().hashCode());
        hashCode = prime * hashCode
                + ((getFileExistsBehavior() == null) ? 0 : getFileExistsBehavior().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDeploymentRequest == false)
            return false;
        CreateDeploymentRequest other = (CreateDeploymentRequest) obj;

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
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        if (other.getDeploymentConfigName() == null ^ this.getDeploymentConfigName() == null)
            return false;
        if (other.getDeploymentConfigName() != null
                && other.getDeploymentConfigName().equals(this.getDeploymentConfigName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIgnoreApplicationStopFailures() == null
                ^ this.getIgnoreApplicationStopFailures() == null)
            return false;
        if (other.getIgnoreApplicationStopFailures() != null
                && other.getIgnoreApplicationStopFailures().equals(
                        this.getIgnoreApplicationStopFailures()) == false)
            return false;
        if (other.getTargetInstances() == null ^ this.getTargetInstances() == null)
            return false;
        if (other.getTargetInstances() != null
                && other.getTargetInstances().equals(this.getTargetInstances()) == false)
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
        if (other.getFileExistsBehavior() == null ^ this.getFileExistsBehavior() == null)
            return false;
        if (other.getFileExistsBehavior() != null
                && other.getFileExistsBehavior().equals(this.getFileExistsBehavior()) == false)
            return false;
        return true;
    }
}
