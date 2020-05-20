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
 * Information about a deployment group.
 * </p>
 */
public class DeploymentGroupInfo implements Serializable {
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
     * The deployment group ID.
     * </p>
     */
    private String deploymentGroupId;

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
     * The Amazon EC2 tags on which to filter. The deployment group includes EC2
     * instances with any of the specified tags.
     * </p>
     */
    private java.util.List<EC2TagFilter> ec2TagFilters;

    /**
     * <p>
     * The on-premises instance tags on which to filter. The deployment group
     * includes on-premises instances with any of the specified tags.
     * </p>
     */
    private java.util.List<TagFilter> onPremisesInstanceTagFilters;

    /**
     * <p>
     * A list of associated Auto Scaling groups.
     * </p>
     */
    private java.util.List<AutoScalingGroup> autoScalingGroups;

    /**
     * <p>
     * A service role Amazon Resource Name (ARN) that grants CodeDeploy
     * permission to make calls to AWS services on your behalf. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/getting-started-create-service-role.html"
     * >Create a Service Role for AWS CodeDeploy</a> in the <i>AWS CodeDeploy
     * User Guide</i>.
     * </p>
     */
    private String serviceRoleArn;

    /**
     * <p>
     * Information about the deployment group's target revision, including type
     * and location.
     * </p>
     */
    private RevisionLocation targetRevision;

    /**
     * <p>
     * Information about triggers associated with the deployment group.
     * </p>
     */
    private java.util.List<TriggerConfig> triggerConfigurations;

    /**
     * <p>
     * A list of alarms associated with the deployment group.
     * </p>
     */
    private AlarmConfiguration alarmConfiguration;

    /**
     * <p>
     * Information about the automatic rollback configuration associated with
     * the deployment group.
     * </p>
     */
    private AutoRollbackConfiguration autoRollbackConfiguration;

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
     * Information about blue/green deployment options for a deployment group.
     * </p>
     */
    private BlueGreenDeploymentConfiguration blueGreenDeploymentConfiguration;

    /**
     * <p>
     * Information about the load balancer to use in a deployment.
     * </p>
     */
    private LoadBalancerInfo loadBalancerInfo;

    /**
     * <p>
     * Information about the most recent successful deployment to the deployment
     * group.
     * </p>
     */
    private LastDeploymentInfo lastSuccessfulDeployment;

    /**
     * <p>
     * Information about the most recent attempted deployment to the deployment
     * group.
     * </p>
     */
    private LastDeploymentInfo lastAttemptedDeployment;

    /**
     * <p>
     * Information about groups of tags applied to an EC2 instance. The
     * deployment group includes only EC2 instances identified by all of the tag
     * groups. Cannot be used in the same call as ec2TagFilters.
     * </p>
     */
    private EC2TagSet ec2TagSet;

    /**
     * <p>
     * Information about groups of tags applied to an on-premises instance. The
     * deployment group includes only on-premises instances identified by all
     * the tag groups. Cannot be used in the same call as
     * onPremisesInstanceTagFilters.
     * </p>
     */
    private OnPremisesTagSet onPremisesTagSet;

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
     * The target Amazon ECS services in the deployment group. This applies only
     * to deployment groups that use the Amazon ECS compute platform. A target
     * Amazon ECS service is specified as an Amazon ECS cluster and service name
     * pair using the format
     * <code>&lt;clustername&gt;:&lt;servicename&gt;</code>.
     * </p>
     */
    private java.util.List<ECSService> ecsServices;

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
    public DeploymentGroupInfo withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * <p>
     * The deployment group ID.
     * </p>
     *
     * @return <p>
     *         The deployment group ID.
     *         </p>
     */
    public String getDeploymentGroupId() {
        return deploymentGroupId;
    }

    /**
     * <p>
     * The deployment group ID.
     * </p>
     *
     * @param deploymentGroupId <p>
     *            The deployment group ID.
     *            </p>
     */
    public void setDeploymentGroupId(String deploymentGroupId) {
        this.deploymentGroupId = deploymentGroupId;
    }

    /**
     * <p>
     * The deployment group ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentGroupId <p>
     *            The deployment group ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentGroupInfo withDeploymentGroupId(String deploymentGroupId) {
        this.deploymentGroupId = deploymentGroupId;
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
    public DeploymentGroupInfo withDeploymentGroupName(String deploymentGroupName) {
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
    public DeploymentGroupInfo withDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 tags on which to filter. The deployment group includes EC2
     * instances with any of the specified tags.
     * </p>
     *
     * @return <p>
     *         The Amazon EC2 tags on which to filter. The deployment group
     *         includes EC2 instances with any of the specified tags.
     *         </p>
     */
    public java.util.List<EC2TagFilter> getEc2TagFilters() {
        return ec2TagFilters;
    }

    /**
     * <p>
     * The Amazon EC2 tags on which to filter. The deployment group includes EC2
     * instances with any of the specified tags.
     * </p>
     *
     * @param ec2TagFilters <p>
     *            The Amazon EC2 tags on which to filter. The deployment group
     *            includes EC2 instances with any of the specified tags.
     *            </p>
     */
    public void setEc2TagFilters(java.util.Collection<EC2TagFilter> ec2TagFilters) {
        if (ec2TagFilters == null) {
            this.ec2TagFilters = null;
            return;
        }

        this.ec2TagFilters = new java.util.ArrayList<EC2TagFilter>(ec2TagFilters);
    }

    /**
     * <p>
     * The Amazon EC2 tags on which to filter. The deployment group includes EC2
     * instances with any of the specified tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ec2TagFilters <p>
     *            The Amazon EC2 tags on which to filter. The deployment group
     *            includes EC2 instances with any of the specified tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentGroupInfo withEc2TagFilters(EC2TagFilter... ec2TagFilters) {
        if (getEc2TagFilters() == null) {
            this.ec2TagFilters = new java.util.ArrayList<EC2TagFilter>(ec2TagFilters.length);
        }
        for (EC2TagFilter value : ec2TagFilters) {
            this.ec2TagFilters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 tags on which to filter. The deployment group includes EC2
     * instances with any of the specified tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ec2TagFilters <p>
     *            The Amazon EC2 tags on which to filter. The deployment group
     *            includes EC2 instances with any of the specified tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentGroupInfo withEc2TagFilters(java.util.Collection<EC2TagFilter> ec2TagFilters) {
        setEc2TagFilters(ec2TagFilters);
        return this;
    }

    /**
     * <p>
     * The on-premises instance tags on which to filter. The deployment group
     * includes on-premises instances with any of the specified tags.
     * </p>
     *
     * @return <p>
     *         The on-premises instance tags on which to filter. The deployment
     *         group includes on-premises instances with any of the specified
     *         tags.
     *         </p>
     */
    public java.util.List<TagFilter> getOnPremisesInstanceTagFilters() {
        return onPremisesInstanceTagFilters;
    }

    /**
     * <p>
     * The on-premises instance tags on which to filter. The deployment group
     * includes on-premises instances with any of the specified tags.
     * </p>
     *
     * @param onPremisesInstanceTagFilters <p>
     *            The on-premises instance tags on which to filter. The
     *            deployment group includes on-premises instances with any of
     *            the specified tags.
     *            </p>
     */
    public void setOnPremisesInstanceTagFilters(
            java.util.Collection<TagFilter> onPremisesInstanceTagFilters) {
        if (onPremisesInstanceTagFilters == null) {
            this.onPremisesInstanceTagFilters = null;
            return;
        }

        this.onPremisesInstanceTagFilters = new java.util.ArrayList<TagFilter>(
                onPremisesInstanceTagFilters);
    }

    /**
     * <p>
     * The on-premises instance tags on which to filter. The deployment group
     * includes on-premises instances with any of the specified tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onPremisesInstanceTagFilters <p>
     *            The on-premises instance tags on which to filter. The
     *            deployment group includes on-premises instances with any of
     *            the specified tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentGroupInfo withOnPremisesInstanceTagFilters(
            TagFilter... onPremisesInstanceTagFilters) {
        if (getOnPremisesInstanceTagFilters() == null) {
            this.onPremisesInstanceTagFilters = new java.util.ArrayList<TagFilter>(
                    onPremisesInstanceTagFilters.length);
        }
        for (TagFilter value : onPremisesInstanceTagFilters) {
            this.onPremisesInstanceTagFilters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The on-premises instance tags on which to filter. The deployment group
     * includes on-premises instances with any of the specified tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onPremisesInstanceTagFilters <p>
     *            The on-premises instance tags on which to filter. The
     *            deployment group includes on-premises instances with any of
     *            the specified tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentGroupInfo withOnPremisesInstanceTagFilters(
            java.util.Collection<TagFilter> onPremisesInstanceTagFilters) {
        setOnPremisesInstanceTagFilters(onPremisesInstanceTagFilters);
        return this;
    }

    /**
     * <p>
     * A list of associated Auto Scaling groups.
     * </p>
     *
     * @return <p>
     *         A list of associated Auto Scaling groups.
     *         </p>
     */
    public java.util.List<AutoScalingGroup> getAutoScalingGroups() {
        return autoScalingGroups;
    }

    /**
     * <p>
     * A list of associated Auto Scaling groups.
     * </p>
     *
     * @param autoScalingGroups <p>
     *            A list of associated Auto Scaling groups.
     *            </p>
     */
    public void setAutoScalingGroups(java.util.Collection<AutoScalingGroup> autoScalingGroups) {
        if (autoScalingGroups == null) {
            this.autoScalingGroups = null;
            return;
        }

        this.autoScalingGroups = new java.util.ArrayList<AutoScalingGroup>(autoScalingGroups);
    }

    /**
     * <p>
     * A list of associated Auto Scaling groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoScalingGroups <p>
     *            A list of associated Auto Scaling groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentGroupInfo withAutoScalingGroups(AutoScalingGroup... autoScalingGroups) {
        if (getAutoScalingGroups() == null) {
            this.autoScalingGroups = new java.util.ArrayList<AutoScalingGroup>(
                    autoScalingGroups.length);
        }
        for (AutoScalingGroup value : autoScalingGroups) {
            this.autoScalingGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of associated Auto Scaling groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoScalingGroups <p>
     *            A list of associated Auto Scaling groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentGroupInfo withAutoScalingGroups(
            java.util.Collection<AutoScalingGroup> autoScalingGroups) {
        setAutoScalingGroups(autoScalingGroups);
        return this;
    }

    /**
     * <p>
     * A service role Amazon Resource Name (ARN) that grants CodeDeploy
     * permission to make calls to AWS services on your behalf. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/getting-started-create-service-role.html"
     * >Create a Service Role for AWS CodeDeploy</a> in the <i>AWS CodeDeploy
     * User Guide</i>.
     * </p>
     *
     * @return <p>
     *         A service role Amazon Resource Name (ARN) that grants CodeDeploy
     *         permission to make calls to AWS services on your behalf. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/codedeploy/latest/userguide/getting-started-create-service-role.html"
     *         >Create a Service Role for AWS CodeDeploy</a> in the <i>AWS
     *         CodeDeploy User Guide</i>.
     *         </p>
     */
    public String getServiceRoleArn() {
        return serviceRoleArn;
    }

    /**
     * <p>
     * A service role Amazon Resource Name (ARN) that grants CodeDeploy
     * permission to make calls to AWS services on your behalf. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/getting-started-create-service-role.html"
     * >Create a Service Role for AWS CodeDeploy</a> in the <i>AWS CodeDeploy
     * User Guide</i>.
     * </p>
     *
     * @param serviceRoleArn <p>
     *            A service role Amazon Resource Name (ARN) that grants
     *            CodeDeploy permission to make calls to AWS services on your
     *            behalf. For more information, see <a href=
     *            "https://docs.aws.amazon.com/codedeploy/latest/userguide/getting-started-create-service-role.html"
     *            >Create a Service Role for AWS CodeDeploy</a> in the <i>AWS
     *            CodeDeploy User Guide</i>.
     *            </p>
     */
    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * A service role Amazon Resource Name (ARN) that grants CodeDeploy
     * permission to make calls to AWS services on your behalf. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/getting-started-create-service-role.html"
     * >Create a Service Role for AWS CodeDeploy</a> in the <i>AWS CodeDeploy
     * User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceRoleArn <p>
     *            A service role Amazon Resource Name (ARN) that grants
     *            CodeDeploy permission to make calls to AWS services on your
     *            behalf. For more information, see <a href=
     *            "https://docs.aws.amazon.com/codedeploy/latest/userguide/getting-started-create-service-role.html"
     *            >Create a Service Role for AWS CodeDeploy</a> in the <i>AWS
     *            CodeDeploy User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentGroupInfo withServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
        return this;
    }

    /**
     * <p>
     * Information about the deployment group's target revision, including type
     * and location.
     * </p>
     *
     * @return <p>
     *         Information about the deployment group's target revision,
     *         including type and location.
     *         </p>
     */
    public RevisionLocation getTargetRevision() {
        return targetRevision;
    }

    /**
     * <p>
     * Information about the deployment group's target revision, including type
     * and location.
     * </p>
     *
     * @param targetRevision <p>
     *            Information about the deployment group's target revision,
     *            including type and location.
     *            </p>
     */
    public void setTargetRevision(RevisionLocation targetRevision) {
        this.targetRevision = targetRevision;
    }

    /**
     * <p>
     * Information about the deployment group's target revision, including type
     * and location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetRevision <p>
     *            Information about the deployment group's target revision,
     *            including type and location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentGroupInfo withTargetRevision(RevisionLocation targetRevision) {
        this.targetRevision = targetRevision;
        return this;
    }

    /**
     * <p>
     * Information about triggers associated with the deployment group.
     * </p>
     *
     * @return <p>
     *         Information about triggers associated with the deployment group.
     *         </p>
     */
    public java.util.List<TriggerConfig> getTriggerConfigurations() {
        return triggerConfigurations;
    }

    /**
     * <p>
     * Information about triggers associated with the deployment group.
     * </p>
     *
     * @param triggerConfigurations <p>
     *            Information about triggers associated with the deployment
     *            group.
     *            </p>
     */
    public void setTriggerConfigurations(java.util.Collection<TriggerConfig> triggerConfigurations) {
        if (triggerConfigurations == null) {
            this.triggerConfigurations = null;
            return;
        }

        this.triggerConfigurations = new java.util.ArrayList<TriggerConfig>(triggerConfigurations);
    }

    /**
     * <p>
     * Information about triggers associated with the deployment group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param triggerConfigurations <p>
     *            Information about triggers associated with the deployment
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentGroupInfo withTriggerConfigurations(TriggerConfig... triggerConfigurations) {
        if (getTriggerConfigurations() == null) {
            this.triggerConfigurations = new java.util.ArrayList<TriggerConfig>(
                    triggerConfigurations.length);
        }
        for (TriggerConfig value : triggerConfigurations) {
            this.triggerConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about triggers associated with the deployment group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param triggerConfigurations <p>
     *            Information about triggers associated with the deployment
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentGroupInfo withTriggerConfigurations(
            java.util.Collection<TriggerConfig> triggerConfigurations) {
        setTriggerConfigurations(triggerConfigurations);
        return this;
    }

    /**
     * <p>
     * A list of alarms associated with the deployment group.
     * </p>
     *
     * @return <p>
     *         A list of alarms associated with the deployment group.
     *         </p>
     */
    public AlarmConfiguration getAlarmConfiguration() {
        return alarmConfiguration;
    }

    /**
     * <p>
     * A list of alarms associated with the deployment group.
     * </p>
     *
     * @param alarmConfiguration <p>
     *            A list of alarms associated with the deployment group.
     *            </p>
     */
    public void setAlarmConfiguration(AlarmConfiguration alarmConfiguration) {
        this.alarmConfiguration = alarmConfiguration;
    }

    /**
     * <p>
     * A list of alarms associated with the deployment group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param alarmConfiguration <p>
     *            A list of alarms associated with the deployment group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentGroupInfo withAlarmConfiguration(AlarmConfiguration alarmConfiguration) {
        this.alarmConfiguration = alarmConfiguration;
        return this;
    }

    /**
     * <p>
     * Information about the automatic rollback configuration associated with
     * the deployment group.
     * </p>
     *
     * @return <p>
     *         Information about the automatic rollback configuration associated
     *         with the deployment group.
     *         </p>
     */
    public AutoRollbackConfiguration getAutoRollbackConfiguration() {
        return autoRollbackConfiguration;
    }

    /**
     * <p>
     * Information about the automatic rollback configuration associated with
     * the deployment group.
     * </p>
     *
     * @param autoRollbackConfiguration <p>
     *            Information about the automatic rollback configuration
     *            associated with the deployment group.
     *            </p>
     */
    public void setAutoRollbackConfiguration(AutoRollbackConfiguration autoRollbackConfiguration) {
        this.autoRollbackConfiguration = autoRollbackConfiguration;
    }

    /**
     * <p>
     * Information about the automatic rollback configuration associated with
     * the deployment group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoRollbackConfiguration <p>
     *            Information about the automatic rollback configuration
     *            associated with the deployment group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentGroupInfo withAutoRollbackConfiguration(
            AutoRollbackConfiguration autoRollbackConfiguration) {
        this.autoRollbackConfiguration = autoRollbackConfiguration;
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
    public DeploymentGroupInfo withDeploymentStyle(DeploymentStyle deploymentStyle) {
        this.deploymentStyle = deploymentStyle;
        return this;
    }

    /**
     * <p>
     * Information about blue/green deployment options for a deployment group.
     * </p>
     *
     * @return <p>
     *         Information about blue/green deployment options for a deployment
     *         group.
     *         </p>
     */
    public BlueGreenDeploymentConfiguration getBlueGreenDeploymentConfiguration() {
        return blueGreenDeploymentConfiguration;
    }

    /**
     * <p>
     * Information about blue/green deployment options for a deployment group.
     * </p>
     *
     * @param blueGreenDeploymentConfiguration <p>
     *            Information about blue/green deployment options for a
     *            deployment group.
     *            </p>
     */
    public void setBlueGreenDeploymentConfiguration(
            BlueGreenDeploymentConfiguration blueGreenDeploymentConfiguration) {
        this.blueGreenDeploymentConfiguration = blueGreenDeploymentConfiguration;
    }

    /**
     * <p>
     * Information about blue/green deployment options for a deployment group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blueGreenDeploymentConfiguration <p>
     *            Information about blue/green deployment options for a
     *            deployment group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentGroupInfo withBlueGreenDeploymentConfiguration(
            BlueGreenDeploymentConfiguration blueGreenDeploymentConfiguration) {
        this.blueGreenDeploymentConfiguration = blueGreenDeploymentConfiguration;
        return this;
    }

    /**
     * <p>
     * Information about the load balancer to use in a deployment.
     * </p>
     *
     * @return <p>
     *         Information about the load balancer to use in a deployment.
     *         </p>
     */
    public LoadBalancerInfo getLoadBalancerInfo() {
        return loadBalancerInfo;
    }

    /**
     * <p>
     * Information about the load balancer to use in a deployment.
     * </p>
     *
     * @param loadBalancerInfo <p>
     *            Information about the load balancer to use in a deployment.
     *            </p>
     */
    public void setLoadBalancerInfo(LoadBalancerInfo loadBalancerInfo) {
        this.loadBalancerInfo = loadBalancerInfo;
    }

    /**
     * <p>
     * Information about the load balancer to use in a deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancerInfo <p>
     *            Information about the load balancer to use in a deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentGroupInfo withLoadBalancerInfo(LoadBalancerInfo loadBalancerInfo) {
        this.loadBalancerInfo = loadBalancerInfo;
        return this;
    }

    /**
     * <p>
     * Information about the most recent successful deployment to the deployment
     * group.
     * </p>
     *
     * @return <p>
     *         Information about the most recent successful deployment to the
     *         deployment group.
     *         </p>
     */
    public LastDeploymentInfo getLastSuccessfulDeployment() {
        return lastSuccessfulDeployment;
    }

    /**
     * <p>
     * Information about the most recent successful deployment to the deployment
     * group.
     * </p>
     *
     * @param lastSuccessfulDeployment <p>
     *            Information about the most recent successful deployment to the
     *            deployment group.
     *            </p>
     */
    public void setLastSuccessfulDeployment(LastDeploymentInfo lastSuccessfulDeployment) {
        this.lastSuccessfulDeployment = lastSuccessfulDeployment;
    }

    /**
     * <p>
     * Information about the most recent successful deployment to the deployment
     * group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastSuccessfulDeployment <p>
     *            Information about the most recent successful deployment to the
     *            deployment group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentGroupInfo withLastSuccessfulDeployment(
            LastDeploymentInfo lastSuccessfulDeployment) {
        this.lastSuccessfulDeployment = lastSuccessfulDeployment;
        return this;
    }

    /**
     * <p>
     * Information about the most recent attempted deployment to the deployment
     * group.
     * </p>
     *
     * @return <p>
     *         Information about the most recent attempted deployment to the
     *         deployment group.
     *         </p>
     */
    public LastDeploymentInfo getLastAttemptedDeployment() {
        return lastAttemptedDeployment;
    }

    /**
     * <p>
     * Information about the most recent attempted deployment to the deployment
     * group.
     * </p>
     *
     * @param lastAttemptedDeployment <p>
     *            Information about the most recent attempted deployment to the
     *            deployment group.
     *            </p>
     */
    public void setLastAttemptedDeployment(LastDeploymentInfo lastAttemptedDeployment) {
        this.lastAttemptedDeployment = lastAttemptedDeployment;
    }

    /**
     * <p>
     * Information about the most recent attempted deployment to the deployment
     * group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastAttemptedDeployment <p>
     *            Information about the most recent attempted deployment to the
     *            deployment group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentGroupInfo withLastAttemptedDeployment(
            LastDeploymentInfo lastAttemptedDeployment) {
        this.lastAttemptedDeployment = lastAttemptedDeployment;
        return this;
    }

    /**
     * <p>
     * Information about groups of tags applied to an EC2 instance. The
     * deployment group includes only EC2 instances identified by all of the tag
     * groups. Cannot be used in the same call as ec2TagFilters.
     * </p>
     *
     * @return <p>
     *         Information about groups of tags applied to an EC2 instance. The
     *         deployment group includes only EC2 instances identified by all of
     *         the tag groups. Cannot be used in the same call as ec2TagFilters.
     *         </p>
     */
    public EC2TagSet getEc2TagSet() {
        return ec2TagSet;
    }

    /**
     * <p>
     * Information about groups of tags applied to an EC2 instance. The
     * deployment group includes only EC2 instances identified by all of the tag
     * groups. Cannot be used in the same call as ec2TagFilters.
     * </p>
     *
     * @param ec2TagSet <p>
     *            Information about groups of tags applied to an EC2 instance.
     *            The deployment group includes only EC2 instances identified by
     *            all of the tag groups. Cannot be used in the same call as
     *            ec2TagFilters.
     *            </p>
     */
    public void setEc2TagSet(EC2TagSet ec2TagSet) {
        this.ec2TagSet = ec2TagSet;
    }

    /**
     * <p>
     * Information about groups of tags applied to an EC2 instance. The
     * deployment group includes only EC2 instances identified by all of the tag
     * groups. Cannot be used in the same call as ec2TagFilters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ec2TagSet <p>
     *            Information about groups of tags applied to an EC2 instance.
     *            The deployment group includes only EC2 instances identified by
     *            all of the tag groups. Cannot be used in the same call as
     *            ec2TagFilters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentGroupInfo withEc2TagSet(EC2TagSet ec2TagSet) {
        this.ec2TagSet = ec2TagSet;
        return this;
    }

    /**
     * <p>
     * Information about groups of tags applied to an on-premises instance. The
     * deployment group includes only on-premises instances identified by all
     * the tag groups. Cannot be used in the same call as
     * onPremisesInstanceTagFilters.
     * </p>
     *
     * @return <p>
     *         Information about groups of tags applied to an on-premises
     *         instance. The deployment group includes only on-premises
     *         instances identified by all the tag groups. Cannot be used in the
     *         same call as onPremisesInstanceTagFilters.
     *         </p>
     */
    public OnPremisesTagSet getOnPremisesTagSet() {
        return onPremisesTagSet;
    }

    /**
     * <p>
     * Information about groups of tags applied to an on-premises instance. The
     * deployment group includes only on-premises instances identified by all
     * the tag groups. Cannot be used in the same call as
     * onPremisesInstanceTagFilters.
     * </p>
     *
     * @param onPremisesTagSet <p>
     *            Information about groups of tags applied to an on-premises
     *            instance. The deployment group includes only on-premises
     *            instances identified by all the tag groups. Cannot be used in
     *            the same call as onPremisesInstanceTagFilters.
     *            </p>
     */
    public void setOnPremisesTagSet(OnPremisesTagSet onPremisesTagSet) {
        this.onPremisesTagSet = onPremisesTagSet;
    }

    /**
     * <p>
     * Information about groups of tags applied to an on-premises instance. The
     * deployment group includes only on-premises instances identified by all
     * the tag groups. Cannot be used in the same call as
     * onPremisesInstanceTagFilters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onPremisesTagSet <p>
     *            Information about groups of tags applied to an on-premises
     *            instance. The deployment group includes only on-premises
     *            instances identified by all the tag groups. Cannot be used in
     *            the same call as onPremisesInstanceTagFilters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentGroupInfo withOnPremisesTagSet(OnPremisesTagSet onPremisesTagSet) {
        this.onPremisesTagSet = onPremisesTagSet;
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
    public DeploymentGroupInfo withComputePlatform(String computePlatform) {
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
    public DeploymentGroupInfo withComputePlatform(ComputePlatform computePlatform) {
        this.computePlatform = computePlatform.toString();
        return this;
    }

    /**
     * <p>
     * The target Amazon ECS services in the deployment group. This applies only
     * to deployment groups that use the Amazon ECS compute platform. A target
     * Amazon ECS service is specified as an Amazon ECS cluster and service name
     * pair using the format
     * <code>&lt;clustername&gt;:&lt;servicename&gt;</code>.
     * </p>
     *
     * @return <p>
     *         The target Amazon ECS services in the deployment group. This
     *         applies only to deployment groups that use the Amazon ECS compute
     *         platform. A target Amazon ECS service is specified as an Amazon
     *         ECS cluster and service name pair using the format
     *         <code>&lt;clustername&gt;:&lt;servicename&gt;</code>.
     *         </p>
     */
    public java.util.List<ECSService> getEcsServices() {
        return ecsServices;
    }

    /**
     * <p>
     * The target Amazon ECS services in the deployment group. This applies only
     * to deployment groups that use the Amazon ECS compute platform. A target
     * Amazon ECS service is specified as an Amazon ECS cluster and service name
     * pair using the format
     * <code>&lt;clustername&gt;:&lt;servicename&gt;</code>.
     * </p>
     *
     * @param ecsServices <p>
     *            The target Amazon ECS services in the deployment group. This
     *            applies only to deployment groups that use the Amazon ECS
     *            compute platform. A target Amazon ECS service is specified as
     *            an Amazon ECS cluster and service name pair using the format
     *            <code>&lt;clustername&gt;:&lt;servicename&gt;</code>.
     *            </p>
     */
    public void setEcsServices(java.util.Collection<ECSService> ecsServices) {
        if (ecsServices == null) {
            this.ecsServices = null;
            return;
        }

        this.ecsServices = new java.util.ArrayList<ECSService>(ecsServices);
    }

    /**
     * <p>
     * The target Amazon ECS services in the deployment group. This applies only
     * to deployment groups that use the Amazon ECS compute platform. A target
     * Amazon ECS service is specified as an Amazon ECS cluster and service name
     * pair using the format
     * <code>&lt;clustername&gt;:&lt;servicename&gt;</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ecsServices <p>
     *            The target Amazon ECS services in the deployment group. This
     *            applies only to deployment groups that use the Amazon ECS
     *            compute platform. A target Amazon ECS service is specified as
     *            an Amazon ECS cluster and service name pair using the format
     *            <code>&lt;clustername&gt;:&lt;servicename&gt;</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentGroupInfo withEcsServices(ECSService... ecsServices) {
        if (getEcsServices() == null) {
            this.ecsServices = new java.util.ArrayList<ECSService>(ecsServices.length);
        }
        for (ECSService value : ecsServices) {
            this.ecsServices.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The target Amazon ECS services in the deployment group. This applies only
     * to deployment groups that use the Amazon ECS compute platform. A target
     * Amazon ECS service is specified as an Amazon ECS cluster and service name
     * pair using the format
     * <code>&lt;clustername&gt;:&lt;servicename&gt;</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ecsServices <p>
     *            The target Amazon ECS services in the deployment group. This
     *            applies only to deployment groups that use the Amazon ECS
     *            compute platform. A target Amazon ECS service is specified as
     *            an Amazon ECS cluster and service name pair using the format
     *            <code>&lt;clustername&gt;:&lt;servicename&gt;</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentGroupInfo withEcsServices(java.util.Collection<ECSService> ecsServices) {
        setEcsServices(ecsServices);
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
        if (getDeploymentGroupId() != null)
            sb.append("deploymentGroupId: " + getDeploymentGroupId() + ",");
        if (getDeploymentGroupName() != null)
            sb.append("deploymentGroupName: " + getDeploymentGroupName() + ",");
        if (getDeploymentConfigName() != null)
            sb.append("deploymentConfigName: " + getDeploymentConfigName() + ",");
        if (getEc2TagFilters() != null)
            sb.append("ec2TagFilters: " + getEc2TagFilters() + ",");
        if (getOnPremisesInstanceTagFilters() != null)
            sb.append("onPremisesInstanceTagFilters: " + getOnPremisesInstanceTagFilters() + ",");
        if (getAutoScalingGroups() != null)
            sb.append("autoScalingGroups: " + getAutoScalingGroups() + ",");
        if (getServiceRoleArn() != null)
            sb.append("serviceRoleArn: " + getServiceRoleArn() + ",");
        if (getTargetRevision() != null)
            sb.append("targetRevision: " + getTargetRevision() + ",");
        if (getTriggerConfigurations() != null)
            sb.append("triggerConfigurations: " + getTriggerConfigurations() + ",");
        if (getAlarmConfiguration() != null)
            sb.append("alarmConfiguration: " + getAlarmConfiguration() + ",");
        if (getAutoRollbackConfiguration() != null)
            sb.append("autoRollbackConfiguration: " + getAutoRollbackConfiguration() + ",");
        if (getDeploymentStyle() != null)
            sb.append("deploymentStyle: " + getDeploymentStyle() + ",");
        if (getBlueGreenDeploymentConfiguration() != null)
            sb.append("blueGreenDeploymentConfiguration: " + getBlueGreenDeploymentConfiguration()
                    + ",");
        if (getLoadBalancerInfo() != null)
            sb.append("loadBalancerInfo: " + getLoadBalancerInfo() + ",");
        if (getLastSuccessfulDeployment() != null)
            sb.append("lastSuccessfulDeployment: " + getLastSuccessfulDeployment() + ",");
        if (getLastAttemptedDeployment() != null)
            sb.append("lastAttemptedDeployment: " + getLastAttemptedDeployment() + ",");
        if (getEc2TagSet() != null)
            sb.append("ec2TagSet: " + getEc2TagSet() + ",");
        if (getOnPremisesTagSet() != null)
            sb.append("onPremisesTagSet: " + getOnPremisesTagSet() + ",");
        if (getComputePlatform() != null)
            sb.append("computePlatform: " + getComputePlatform() + ",");
        if (getEcsServices() != null)
            sb.append("ecsServices: " + getEcsServices());
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
                + ((getDeploymentGroupId() == null) ? 0 : getDeploymentGroupId().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentGroupName() == null) ? 0 : getDeploymentGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentConfigName() == null) ? 0 : getDeploymentConfigName().hashCode());
        hashCode = prime * hashCode
                + ((getEc2TagFilters() == null) ? 0 : getEc2TagFilters().hashCode());
        hashCode = prime
                * hashCode
                + ((getOnPremisesInstanceTagFilters() == null) ? 0
                        : getOnPremisesInstanceTagFilters().hashCode());
        hashCode = prime * hashCode
                + ((getAutoScalingGroups() == null) ? 0 : getAutoScalingGroups().hashCode());
        hashCode = prime * hashCode
                + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getTargetRevision() == null) ? 0 : getTargetRevision().hashCode());
        hashCode = prime
                * hashCode
                + ((getTriggerConfigurations() == null) ? 0 : getTriggerConfigurations().hashCode());
        hashCode = prime * hashCode
                + ((getAlarmConfiguration() == null) ? 0 : getAlarmConfiguration().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoRollbackConfiguration() == null) ? 0 : getAutoRollbackConfiguration()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentStyle() == null) ? 0 : getDeploymentStyle().hashCode());
        hashCode = prime
                * hashCode
                + ((getBlueGreenDeploymentConfiguration() == null) ? 0
                        : getBlueGreenDeploymentConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getLoadBalancerInfo() == null) ? 0 : getLoadBalancerInfo().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastSuccessfulDeployment() == null) ? 0 : getLastSuccessfulDeployment()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getLastAttemptedDeployment() == null) ? 0 : getLastAttemptedDeployment()
                        .hashCode());
        hashCode = prime * hashCode + ((getEc2TagSet() == null) ? 0 : getEc2TagSet().hashCode());
        hashCode = prime * hashCode
                + ((getOnPremisesTagSet() == null) ? 0 : getOnPremisesTagSet().hashCode());
        hashCode = prime * hashCode
                + ((getComputePlatform() == null) ? 0 : getComputePlatform().hashCode());
        hashCode = prime * hashCode
                + ((getEcsServices() == null) ? 0 : getEcsServices().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentGroupInfo == false)
            return false;
        DeploymentGroupInfo other = (DeploymentGroupInfo) obj;

        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null
                && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getDeploymentGroupId() == null ^ this.getDeploymentGroupId() == null)
            return false;
        if (other.getDeploymentGroupId() != null
                && other.getDeploymentGroupId().equals(this.getDeploymentGroupId()) == false)
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
        if (other.getEc2TagFilters() == null ^ this.getEc2TagFilters() == null)
            return false;
        if (other.getEc2TagFilters() != null
                && other.getEc2TagFilters().equals(this.getEc2TagFilters()) == false)
            return false;
        if (other.getOnPremisesInstanceTagFilters() == null
                ^ this.getOnPremisesInstanceTagFilters() == null)
            return false;
        if (other.getOnPremisesInstanceTagFilters() != null
                && other.getOnPremisesInstanceTagFilters().equals(
                        this.getOnPremisesInstanceTagFilters()) == false)
            return false;
        if (other.getAutoScalingGroups() == null ^ this.getAutoScalingGroups() == null)
            return false;
        if (other.getAutoScalingGroups() != null
                && other.getAutoScalingGroups().equals(this.getAutoScalingGroups()) == false)
            return false;
        if (other.getServiceRoleArn() == null ^ this.getServiceRoleArn() == null)
            return false;
        if (other.getServiceRoleArn() != null
                && other.getServiceRoleArn().equals(this.getServiceRoleArn()) == false)
            return false;
        if (other.getTargetRevision() == null ^ this.getTargetRevision() == null)
            return false;
        if (other.getTargetRevision() != null
                && other.getTargetRevision().equals(this.getTargetRevision()) == false)
            return false;
        if (other.getTriggerConfigurations() == null ^ this.getTriggerConfigurations() == null)
            return false;
        if (other.getTriggerConfigurations() != null
                && other.getTriggerConfigurations().equals(this.getTriggerConfigurations()) == false)
            return false;
        if (other.getAlarmConfiguration() == null ^ this.getAlarmConfiguration() == null)
            return false;
        if (other.getAlarmConfiguration() != null
                && other.getAlarmConfiguration().equals(this.getAlarmConfiguration()) == false)
            return false;
        if (other.getAutoRollbackConfiguration() == null
                ^ this.getAutoRollbackConfiguration() == null)
            return false;
        if (other.getAutoRollbackConfiguration() != null
                && other.getAutoRollbackConfiguration().equals(this.getAutoRollbackConfiguration()) == false)
            return false;
        if (other.getDeploymentStyle() == null ^ this.getDeploymentStyle() == null)
            return false;
        if (other.getDeploymentStyle() != null
                && other.getDeploymentStyle().equals(this.getDeploymentStyle()) == false)
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
        if (other.getLastSuccessfulDeployment() == null
                ^ this.getLastSuccessfulDeployment() == null)
            return false;
        if (other.getLastSuccessfulDeployment() != null
                && other.getLastSuccessfulDeployment().equals(this.getLastSuccessfulDeployment()) == false)
            return false;
        if (other.getLastAttemptedDeployment() == null ^ this.getLastAttemptedDeployment() == null)
            return false;
        if (other.getLastAttemptedDeployment() != null
                && other.getLastAttemptedDeployment().equals(this.getLastAttemptedDeployment()) == false)
            return false;
        if (other.getEc2TagSet() == null ^ this.getEc2TagSet() == null)
            return false;
        if (other.getEc2TagSet() != null
                && other.getEc2TagSet().equals(this.getEc2TagSet()) == false)
            return false;
        if (other.getOnPremisesTagSet() == null ^ this.getOnPremisesTagSet() == null)
            return false;
        if (other.getOnPremisesTagSet() != null
                && other.getOnPremisesTagSet().equals(this.getOnPremisesTagSet()) == false)
            return false;
        if (other.getComputePlatform() == null ^ this.getComputePlatform() == null)
            return false;
        if (other.getComputePlatform() != null
                && other.getComputePlatform().equals(this.getComputePlatform()) == false)
            return false;
        if (other.getEcsServices() == null ^ this.getEcsServices() == null)
            return false;
        if (other.getEcsServices() != null
                && other.getEcsServices().equals(this.getEcsServices()) == false)
            return false;
        return true;
    }
}
