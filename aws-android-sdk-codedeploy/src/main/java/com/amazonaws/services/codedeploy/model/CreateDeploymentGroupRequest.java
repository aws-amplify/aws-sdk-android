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
 * Creates a deployment group to which application revisions are deployed.
 * </p>
 */
public class CreateDeploymentGroupRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The name of a new deployment group for the specified application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String deploymentGroupName;

    /**
     * <p>
     * If specified, the deployment configuration name can be either one of the
     * predefined configurations provided with AWS CodeDeploy or a custom
     * deployment configuration that you create by calling the create deployment
     * configuration operation.
     * </p>
     * <p>
     * <code>CodeDeployDefault.OneAtATime</code> is the default deployment
     * configuration. It is used if a configuration isn't specified for the
     * deployment or deployment group.
     * </p>
     * <p>
     * For more information about the predefined deployment configurations in
     * AWS CodeDeploy, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations.html"
     * >Working with Deployment Configurations in CodeDeploy</a> in the <i>AWS
     * CodeDeploy User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String deploymentConfigName;

    /**
     * <p>
     * The Amazon EC2 tags on which to filter. The deployment group includes EC2
     * instances with any of the specified tags. Cannot be used in the same call
     * as ec2TagSet.
     * </p>
     */
    private java.util.List<EC2TagFilter> ec2TagFilters;

    /**
     * <p>
     * The on-premises instance tags on which to filter. The deployment group
     * includes on-premises instances with any of the specified tags. Cannot be
     * used in the same call as <code>OnPremisesTagSet</code>.
     * </p>
     */
    private java.util.List<TagFilter> onPremisesInstanceTagFilters;

    /**
     * <p>
     * A list of associated Amazon EC2 Auto Scaling groups.
     * </p>
     */
    private java.util.List<String> autoScalingGroups;

    /**
     * <p>
     * A service role Amazon Resource Name (ARN) that allows AWS CodeDeploy to
     * act on the user's behalf when interacting with AWS services.
     * </p>
     */
    private String serviceRoleArn;

    /**
     * <p>
     * Information about triggers to create when the deployment group is
     * created. For examples, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-sns.html"
     * >Create a Trigger for an AWS CodeDeploy Event</a> in the <i>AWS
     * CodeDeploy User Guide</i>.
     * </p>
     */
    private java.util.List<TriggerConfig> triggerConfigurations;

    /**
     * <p>
     * Information to add about Amazon CloudWatch alarms when the deployment
     * group is created.
     * </p>
     */
    private AlarmConfiguration alarmConfiguration;

    /**
     * <p>
     * Configuration information for an automatic rollback that is added when a
     * deployment group is created.
     * </p>
     */
    private AutoRollbackConfiguration autoRollbackConfiguration;

    /**
     * <p>
     * Information about the type of deployment, in-place or blue/green, that
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
     * Information about the load balancer used in a deployment.
     * </p>
     */
    private LoadBalancerInfo loadBalancerInfo;

    /**
     * <p>
     * Information about groups of tags applied to EC2 instances. The deployment
     * group includes only EC2 instances identified by all the tag groups.
     * Cannot be used in the same call as <code>ec2TagFilters</code>.
     * </p>
     */
    private EC2TagSet ec2TagSet;

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
     * Information about groups of tags applied to on-premises instances. The
     * deployment group includes only on-premises instances identified by all of
     * the tag groups. Cannot be used in the same call as
     * <code>onPremisesInstanceTagFilters</code>.
     * </p>
     */
    private OnPremisesTagSet onPremisesTagSet;

    /**
     * <p>
     * The metadata that you apply to CodeDeploy deployment groups to help you
     * organize and categorize them. Each tag consists of a key and an optional
     * value, both of which you define.
     * </p>
     */
    private java.util.List<Tag> tags;

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
    public CreateDeploymentGroupRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * <p>
     * The name of a new deployment group for the specified application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of a new deployment group for the specified application.
     *         </p>
     */
    public String getDeploymentGroupName() {
        return deploymentGroupName;
    }

    /**
     * <p>
     * The name of a new deployment group for the specified application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentGroupName <p>
     *            The name of a new deployment group for the specified
     *            application.
     *            </p>
     */
    public void setDeploymentGroupName(String deploymentGroupName) {
        this.deploymentGroupName = deploymentGroupName;
    }

    /**
     * <p>
     * The name of a new deployment group for the specified application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentGroupName <p>
     *            The name of a new deployment group for the specified
     *            application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentGroupRequest withDeploymentGroupName(String deploymentGroupName) {
        this.deploymentGroupName = deploymentGroupName;
        return this;
    }

    /**
     * <p>
     * If specified, the deployment configuration name can be either one of the
     * predefined configurations provided with AWS CodeDeploy or a custom
     * deployment configuration that you create by calling the create deployment
     * configuration operation.
     * </p>
     * <p>
     * <code>CodeDeployDefault.OneAtATime</code> is the default deployment
     * configuration. It is used if a configuration isn't specified for the
     * deployment or deployment group.
     * </p>
     * <p>
     * For more information about the predefined deployment configurations in
     * AWS CodeDeploy, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations.html"
     * >Working with Deployment Configurations in CodeDeploy</a> in the <i>AWS
     * CodeDeploy User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         If specified, the deployment configuration name can be either one
     *         of the predefined configurations provided with AWS CodeDeploy or
     *         a custom deployment configuration that you create by calling the
     *         create deployment configuration operation.
     *         </p>
     *         <p>
     *         <code>CodeDeployDefault.OneAtATime</code> is the default
     *         deployment configuration. It is used if a configuration isn't
     *         specified for the deployment or deployment group.
     *         </p>
     *         <p>
     *         For more information about the predefined deployment
     *         configurations in AWS CodeDeploy, see <a href=
     *         "https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations.html"
     *         >Working with Deployment Configurations in CodeDeploy</a> in the
     *         <i>AWS CodeDeploy User Guide</i>.
     *         </p>
     */
    public String getDeploymentConfigName() {
        return deploymentConfigName;
    }

    /**
     * <p>
     * If specified, the deployment configuration name can be either one of the
     * predefined configurations provided with AWS CodeDeploy or a custom
     * deployment configuration that you create by calling the create deployment
     * configuration operation.
     * </p>
     * <p>
     * <code>CodeDeployDefault.OneAtATime</code> is the default deployment
     * configuration. It is used if a configuration isn't specified for the
     * deployment or deployment group.
     * </p>
     * <p>
     * For more information about the predefined deployment configurations in
     * AWS CodeDeploy, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations.html"
     * >Working with Deployment Configurations in CodeDeploy</a> in the <i>AWS
     * CodeDeploy User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentConfigName <p>
     *            If specified, the deployment configuration name can be either
     *            one of the predefined configurations provided with AWS
     *            CodeDeploy or a custom deployment configuration that you
     *            create by calling the create deployment configuration
     *            operation.
     *            </p>
     *            <p>
     *            <code>CodeDeployDefault.OneAtATime</code> is the default
     *            deployment configuration. It is used if a configuration isn't
     *            specified for the deployment or deployment group.
     *            </p>
     *            <p>
     *            For more information about the predefined deployment
     *            configurations in AWS CodeDeploy, see <a href=
     *            "https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations.html"
     *            >Working with Deployment Configurations in CodeDeploy</a> in
     *            the <i>AWS CodeDeploy User Guide</i>.
     *            </p>
     */
    public void setDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
    }

    /**
     * <p>
     * If specified, the deployment configuration name can be either one of the
     * predefined configurations provided with AWS CodeDeploy or a custom
     * deployment configuration that you create by calling the create deployment
     * configuration operation.
     * </p>
     * <p>
     * <code>CodeDeployDefault.OneAtATime</code> is the default deployment
     * configuration. It is used if a configuration isn't specified for the
     * deployment or deployment group.
     * </p>
     * <p>
     * For more information about the predefined deployment configurations in
     * AWS CodeDeploy, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations.html"
     * >Working with Deployment Configurations in CodeDeploy</a> in the <i>AWS
     * CodeDeploy User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentConfigName <p>
     *            If specified, the deployment configuration name can be either
     *            one of the predefined configurations provided with AWS
     *            CodeDeploy or a custom deployment configuration that you
     *            create by calling the create deployment configuration
     *            operation.
     *            </p>
     *            <p>
     *            <code>CodeDeployDefault.OneAtATime</code> is the default
     *            deployment configuration. It is used if a configuration isn't
     *            specified for the deployment or deployment group.
     *            </p>
     *            <p>
     *            For more information about the predefined deployment
     *            configurations in AWS CodeDeploy, see <a href=
     *            "https://docs.aws.amazon.com/codedeploy/latest/userguide/deployment-configurations.html"
     *            >Working with Deployment Configurations in CodeDeploy</a> in
     *            the <i>AWS CodeDeploy User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentGroupRequest withDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 tags on which to filter. The deployment group includes EC2
     * instances with any of the specified tags. Cannot be used in the same call
     * as ec2TagSet.
     * </p>
     *
     * @return <p>
     *         The Amazon EC2 tags on which to filter. The deployment group
     *         includes EC2 instances with any of the specified tags. Cannot be
     *         used in the same call as ec2TagSet.
     *         </p>
     */
    public java.util.List<EC2TagFilter> getEc2TagFilters() {
        return ec2TagFilters;
    }

    /**
     * <p>
     * The Amazon EC2 tags on which to filter. The deployment group includes EC2
     * instances with any of the specified tags. Cannot be used in the same call
     * as ec2TagSet.
     * </p>
     *
     * @param ec2TagFilters <p>
     *            The Amazon EC2 tags on which to filter. The deployment group
     *            includes EC2 instances with any of the specified tags. Cannot
     *            be used in the same call as ec2TagSet.
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
     * instances with any of the specified tags. Cannot be used in the same call
     * as ec2TagSet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ec2TagFilters <p>
     *            The Amazon EC2 tags on which to filter. The deployment group
     *            includes EC2 instances with any of the specified tags. Cannot
     *            be used in the same call as ec2TagSet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentGroupRequest withEc2TagFilters(EC2TagFilter... ec2TagFilters) {
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
     * instances with any of the specified tags. Cannot be used in the same call
     * as ec2TagSet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ec2TagFilters <p>
     *            The Amazon EC2 tags on which to filter. The deployment group
     *            includes EC2 instances with any of the specified tags. Cannot
     *            be used in the same call as ec2TagSet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentGroupRequest withEc2TagFilters(
            java.util.Collection<EC2TagFilter> ec2TagFilters) {
        setEc2TagFilters(ec2TagFilters);
        return this;
    }

    /**
     * <p>
     * The on-premises instance tags on which to filter. The deployment group
     * includes on-premises instances with any of the specified tags. Cannot be
     * used in the same call as <code>OnPremisesTagSet</code>.
     * </p>
     *
     * @return <p>
     *         The on-premises instance tags on which to filter. The deployment
     *         group includes on-premises instances with any of the specified
     *         tags. Cannot be used in the same call as
     *         <code>OnPremisesTagSet</code>.
     *         </p>
     */
    public java.util.List<TagFilter> getOnPremisesInstanceTagFilters() {
        return onPremisesInstanceTagFilters;
    }

    /**
     * <p>
     * The on-premises instance tags on which to filter. The deployment group
     * includes on-premises instances with any of the specified tags. Cannot be
     * used in the same call as <code>OnPremisesTagSet</code>.
     * </p>
     *
     * @param onPremisesInstanceTagFilters <p>
     *            The on-premises instance tags on which to filter. The
     *            deployment group includes on-premises instances with any of
     *            the specified tags. Cannot be used in the same call as
     *            <code>OnPremisesTagSet</code>.
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
     * includes on-premises instances with any of the specified tags. Cannot be
     * used in the same call as <code>OnPremisesTagSet</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onPremisesInstanceTagFilters <p>
     *            The on-premises instance tags on which to filter. The
     *            deployment group includes on-premises instances with any of
     *            the specified tags. Cannot be used in the same call as
     *            <code>OnPremisesTagSet</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentGroupRequest withOnPremisesInstanceTagFilters(
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
     * includes on-premises instances with any of the specified tags. Cannot be
     * used in the same call as <code>OnPremisesTagSet</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onPremisesInstanceTagFilters <p>
     *            The on-premises instance tags on which to filter. The
     *            deployment group includes on-premises instances with any of
     *            the specified tags. Cannot be used in the same call as
     *            <code>OnPremisesTagSet</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentGroupRequest withOnPremisesInstanceTagFilters(
            java.util.Collection<TagFilter> onPremisesInstanceTagFilters) {
        setOnPremisesInstanceTagFilters(onPremisesInstanceTagFilters);
        return this;
    }

    /**
     * <p>
     * A list of associated Amazon EC2 Auto Scaling groups.
     * </p>
     *
     * @return <p>
     *         A list of associated Amazon EC2 Auto Scaling groups.
     *         </p>
     */
    public java.util.List<String> getAutoScalingGroups() {
        return autoScalingGroups;
    }

    /**
     * <p>
     * A list of associated Amazon EC2 Auto Scaling groups.
     * </p>
     *
     * @param autoScalingGroups <p>
     *            A list of associated Amazon EC2 Auto Scaling groups.
     *            </p>
     */
    public void setAutoScalingGroups(java.util.Collection<String> autoScalingGroups) {
        if (autoScalingGroups == null) {
            this.autoScalingGroups = null;
            return;
        }

        this.autoScalingGroups = new java.util.ArrayList<String>(autoScalingGroups);
    }

    /**
     * <p>
     * A list of associated Amazon EC2 Auto Scaling groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoScalingGroups <p>
     *            A list of associated Amazon EC2 Auto Scaling groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentGroupRequest withAutoScalingGroups(String... autoScalingGroups) {
        if (getAutoScalingGroups() == null) {
            this.autoScalingGroups = new java.util.ArrayList<String>(autoScalingGroups.length);
        }
        for (String value : autoScalingGroups) {
            this.autoScalingGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of associated Amazon EC2 Auto Scaling groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoScalingGroups <p>
     *            A list of associated Amazon EC2 Auto Scaling groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentGroupRequest withAutoScalingGroups(
            java.util.Collection<String> autoScalingGroups) {
        setAutoScalingGroups(autoScalingGroups);
        return this;
    }

    /**
     * <p>
     * A service role Amazon Resource Name (ARN) that allows AWS CodeDeploy to
     * act on the user's behalf when interacting with AWS services.
     * </p>
     *
     * @return <p>
     *         A service role Amazon Resource Name (ARN) that allows AWS
     *         CodeDeploy to act on the user's behalf when interacting with AWS
     *         services.
     *         </p>
     */
    public String getServiceRoleArn() {
        return serviceRoleArn;
    }

    /**
     * <p>
     * A service role Amazon Resource Name (ARN) that allows AWS CodeDeploy to
     * act on the user's behalf when interacting with AWS services.
     * </p>
     *
     * @param serviceRoleArn <p>
     *            A service role Amazon Resource Name (ARN) that allows AWS
     *            CodeDeploy to act on the user's behalf when interacting with
     *            AWS services.
     *            </p>
     */
    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * A service role Amazon Resource Name (ARN) that allows AWS CodeDeploy to
     * act on the user's behalf when interacting with AWS services.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceRoleArn <p>
     *            A service role Amazon Resource Name (ARN) that allows AWS
     *            CodeDeploy to act on the user's behalf when interacting with
     *            AWS services.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentGroupRequest withServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
        return this;
    }

    /**
     * <p>
     * Information about triggers to create when the deployment group is
     * created. For examples, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-sns.html"
     * >Create a Trigger for an AWS CodeDeploy Event</a> in the <i>AWS
     * CodeDeploy User Guide</i>.
     * </p>
     *
     * @return <p>
     *         Information about triggers to create when the deployment group is
     *         created. For examples, see <a href=
     *         "https://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-sns.html"
     *         >Create a Trigger for an AWS CodeDeploy Event</a> in the <i>AWS
     *         CodeDeploy User Guide</i>.
     *         </p>
     */
    public java.util.List<TriggerConfig> getTriggerConfigurations() {
        return triggerConfigurations;
    }

    /**
     * <p>
     * Information about triggers to create when the deployment group is
     * created. For examples, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-sns.html"
     * >Create a Trigger for an AWS CodeDeploy Event</a> in the <i>AWS
     * CodeDeploy User Guide</i>.
     * </p>
     *
     * @param triggerConfigurations <p>
     *            Information about triggers to create when the deployment group
     *            is created. For examples, see <a href=
     *            "https://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-sns.html"
     *            >Create a Trigger for an AWS CodeDeploy Event</a> in the
     *            <i>AWS CodeDeploy User Guide</i>.
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
     * Information about triggers to create when the deployment group is
     * created. For examples, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-sns.html"
     * >Create a Trigger for an AWS CodeDeploy Event</a> in the <i>AWS
     * CodeDeploy User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param triggerConfigurations <p>
     *            Information about triggers to create when the deployment group
     *            is created. For examples, see <a href=
     *            "https://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-sns.html"
     *            >Create a Trigger for an AWS CodeDeploy Event</a> in the
     *            <i>AWS CodeDeploy User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentGroupRequest withTriggerConfigurations(
            TriggerConfig... triggerConfigurations) {
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
     * Information about triggers to create when the deployment group is
     * created. For examples, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-sns.html"
     * >Create a Trigger for an AWS CodeDeploy Event</a> in the <i>AWS
     * CodeDeploy User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param triggerConfigurations <p>
     *            Information about triggers to create when the deployment group
     *            is created. For examples, see <a href=
     *            "https://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-sns.html"
     *            >Create a Trigger for an AWS CodeDeploy Event</a> in the
     *            <i>AWS CodeDeploy User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentGroupRequest withTriggerConfigurations(
            java.util.Collection<TriggerConfig> triggerConfigurations) {
        setTriggerConfigurations(triggerConfigurations);
        return this;
    }

    /**
     * <p>
     * Information to add about Amazon CloudWatch alarms when the deployment
     * group is created.
     * </p>
     *
     * @return <p>
     *         Information to add about Amazon CloudWatch alarms when the
     *         deployment group is created.
     *         </p>
     */
    public AlarmConfiguration getAlarmConfiguration() {
        return alarmConfiguration;
    }

    /**
     * <p>
     * Information to add about Amazon CloudWatch alarms when the deployment
     * group is created.
     * </p>
     *
     * @param alarmConfiguration <p>
     *            Information to add about Amazon CloudWatch alarms when the
     *            deployment group is created.
     *            </p>
     */
    public void setAlarmConfiguration(AlarmConfiguration alarmConfiguration) {
        this.alarmConfiguration = alarmConfiguration;
    }

    /**
     * <p>
     * Information to add about Amazon CloudWatch alarms when the deployment
     * group is created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param alarmConfiguration <p>
     *            Information to add about Amazon CloudWatch alarms when the
     *            deployment group is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentGroupRequest withAlarmConfiguration(AlarmConfiguration alarmConfiguration) {
        this.alarmConfiguration = alarmConfiguration;
        return this;
    }

    /**
     * <p>
     * Configuration information for an automatic rollback that is added when a
     * deployment group is created.
     * </p>
     *
     * @return <p>
     *         Configuration information for an automatic rollback that is added
     *         when a deployment group is created.
     *         </p>
     */
    public AutoRollbackConfiguration getAutoRollbackConfiguration() {
        return autoRollbackConfiguration;
    }

    /**
     * <p>
     * Configuration information for an automatic rollback that is added when a
     * deployment group is created.
     * </p>
     *
     * @param autoRollbackConfiguration <p>
     *            Configuration information for an automatic rollback that is
     *            added when a deployment group is created.
     *            </p>
     */
    public void setAutoRollbackConfiguration(AutoRollbackConfiguration autoRollbackConfiguration) {
        this.autoRollbackConfiguration = autoRollbackConfiguration;
    }

    /**
     * <p>
     * Configuration information for an automatic rollback that is added when a
     * deployment group is created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoRollbackConfiguration <p>
     *            Configuration information for an automatic rollback that is
     *            added when a deployment group is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentGroupRequest withAutoRollbackConfiguration(
            AutoRollbackConfiguration autoRollbackConfiguration) {
        this.autoRollbackConfiguration = autoRollbackConfiguration;
        return this;
    }

    /**
     * <p>
     * Information about the type of deployment, in-place or blue/green, that
     * you want to run and whether to route deployment traffic behind a load
     * balancer.
     * </p>
     *
     * @return <p>
     *         Information about the type of deployment, in-place or blue/green,
     *         that you want to run and whether to route deployment traffic
     *         behind a load balancer.
     *         </p>
     */
    public DeploymentStyle getDeploymentStyle() {
        return deploymentStyle;
    }

    /**
     * <p>
     * Information about the type of deployment, in-place or blue/green, that
     * you want to run and whether to route deployment traffic behind a load
     * balancer.
     * </p>
     *
     * @param deploymentStyle <p>
     *            Information about the type of deployment, in-place or
     *            blue/green, that you want to run and whether to route
     *            deployment traffic behind a load balancer.
     *            </p>
     */
    public void setDeploymentStyle(DeploymentStyle deploymentStyle) {
        this.deploymentStyle = deploymentStyle;
    }

    /**
     * <p>
     * Information about the type of deployment, in-place or blue/green, that
     * you want to run and whether to route deployment traffic behind a load
     * balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentStyle <p>
     *            Information about the type of deployment, in-place or
     *            blue/green, that you want to run and whether to route
     *            deployment traffic behind a load balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentGroupRequest withDeploymentStyle(DeploymentStyle deploymentStyle) {
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
    public CreateDeploymentGroupRequest withBlueGreenDeploymentConfiguration(
            BlueGreenDeploymentConfiguration blueGreenDeploymentConfiguration) {
        this.blueGreenDeploymentConfiguration = blueGreenDeploymentConfiguration;
        return this;
    }

    /**
     * <p>
     * Information about the load balancer used in a deployment.
     * </p>
     *
     * @return <p>
     *         Information about the load balancer used in a deployment.
     *         </p>
     */
    public LoadBalancerInfo getLoadBalancerInfo() {
        return loadBalancerInfo;
    }

    /**
     * <p>
     * Information about the load balancer used in a deployment.
     * </p>
     *
     * @param loadBalancerInfo <p>
     *            Information about the load balancer used in a deployment.
     *            </p>
     */
    public void setLoadBalancerInfo(LoadBalancerInfo loadBalancerInfo) {
        this.loadBalancerInfo = loadBalancerInfo;
    }

    /**
     * <p>
     * Information about the load balancer used in a deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancerInfo <p>
     *            Information about the load balancer used in a deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentGroupRequest withLoadBalancerInfo(LoadBalancerInfo loadBalancerInfo) {
        this.loadBalancerInfo = loadBalancerInfo;
        return this;
    }

    /**
     * <p>
     * Information about groups of tags applied to EC2 instances. The deployment
     * group includes only EC2 instances identified by all the tag groups.
     * Cannot be used in the same call as <code>ec2TagFilters</code>.
     * </p>
     *
     * @return <p>
     *         Information about groups of tags applied to EC2 instances. The
     *         deployment group includes only EC2 instances identified by all
     *         the tag groups. Cannot be used in the same call as
     *         <code>ec2TagFilters</code>.
     *         </p>
     */
    public EC2TagSet getEc2TagSet() {
        return ec2TagSet;
    }

    /**
     * <p>
     * Information about groups of tags applied to EC2 instances. The deployment
     * group includes only EC2 instances identified by all the tag groups.
     * Cannot be used in the same call as <code>ec2TagFilters</code>.
     * </p>
     *
     * @param ec2TagSet <p>
     *            Information about groups of tags applied to EC2 instances. The
     *            deployment group includes only EC2 instances identified by all
     *            the tag groups. Cannot be used in the same call as
     *            <code>ec2TagFilters</code>.
     *            </p>
     */
    public void setEc2TagSet(EC2TagSet ec2TagSet) {
        this.ec2TagSet = ec2TagSet;
    }

    /**
     * <p>
     * Information about groups of tags applied to EC2 instances. The deployment
     * group includes only EC2 instances identified by all the tag groups.
     * Cannot be used in the same call as <code>ec2TagFilters</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ec2TagSet <p>
     *            Information about groups of tags applied to EC2 instances. The
     *            deployment group includes only EC2 instances identified by all
     *            the tag groups. Cannot be used in the same call as
     *            <code>ec2TagFilters</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentGroupRequest withEc2TagSet(EC2TagSet ec2TagSet) {
        this.ec2TagSet = ec2TagSet;
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
    public CreateDeploymentGroupRequest withEcsServices(ECSService... ecsServices) {
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
    public CreateDeploymentGroupRequest withEcsServices(java.util.Collection<ECSService> ecsServices) {
        setEcsServices(ecsServices);
        return this;
    }

    /**
     * <p>
     * Information about groups of tags applied to on-premises instances. The
     * deployment group includes only on-premises instances identified by all of
     * the tag groups. Cannot be used in the same call as
     * <code>onPremisesInstanceTagFilters</code>.
     * </p>
     *
     * @return <p>
     *         Information about groups of tags applied to on-premises
     *         instances. The deployment group includes only on-premises
     *         instances identified by all of the tag groups. Cannot be used in
     *         the same call as <code>onPremisesInstanceTagFilters</code>.
     *         </p>
     */
    public OnPremisesTagSet getOnPremisesTagSet() {
        return onPremisesTagSet;
    }

    /**
     * <p>
     * Information about groups of tags applied to on-premises instances. The
     * deployment group includes only on-premises instances identified by all of
     * the tag groups. Cannot be used in the same call as
     * <code>onPremisesInstanceTagFilters</code>.
     * </p>
     *
     * @param onPremisesTagSet <p>
     *            Information about groups of tags applied to on-premises
     *            instances. The deployment group includes only on-premises
     *            instances identified by all of the tag groups. Cannot be used
     *            in the same call as <code>onPremisesInstanceTagFilters</code>.
     *            </p>
     */
    public void setOnPremisesTagSet(OnPremisesTagSet onPremisesTagSet) {
        this.onPremisesTagSet = onPremisesTagSet;
    }

    /**
     * <p>
     * Information about groups of tags applied to on-premises instances. The
     * deployment group includes only on-premises instances identified by all of
     * the tag groups. Cannot be used in the same call as
     * <code>onPremisesInstanceTagFilters</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onPremisesTagSet <p>
     *            Information about groups of tags applied to on-premises
     *            instances. The deployment group includes only on-premises
     *            instances identified by all of the tag groups. Cannot be used
     *            in the same call as <code>onPremisesInstanceTagFilters</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentGroupRequest withOnPremisesTagSet(OnPremisesTagSet onPremisesTagSet) {
        this.onPremisesTagSet = onPremisesTagSet;
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to CodeDeploy deployment groups to help you
     * organize and categorize them. Each tag consists of a key and an optional
     * value, both of which you define.
     * </p>
     *
     * @return <p>
     *         The metadata that you apply to CodeDeploy deployment groups to
     *         help you organize and categorize them. Each tag consists of a key
     *         and an optional value, both of which you define.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The metadata that you apply to CodeDeploy deployment groups to help you
     * organize and categorize them. Each tag consists of a key and an optional
     * value, both of which you define.
     * </p>
     *
     * @param tags <p>
     *            The metadata that you apply to CodeDeploy deployment groups to
     *            help you organize and categorize them. Each tag consists of a
     *            key and an optional value, both of which you define.
     *            </p>
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
     * The metadata that you apply to CodeDeploy deployment groups to help you
     * organize and categorize them. Each tag consists of a key and an optional
     * value, both of which you define.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The metadata that you apply to CodeDeploy deployment groups to
     *            help you organize and categorize them. Each tag consists of a
     *            key and an optional value, both of which you define.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentGroupRequest withTags(Tag... tags) {
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
     * The metadata that you apply to CodeDeploy deployment groups to help you
     * organize and categorize them. Each tag consists of a key and an optional
     * value, both of which you define.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The metadata that you apply to CodeDeploy deployment groups to
     *            help you organize and categorize them. Each tag consists of a
     *            key and an optional value, both of which you define.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getApplicationName() != null)
            sb.append("applicationName: " + getApplicationName() + ",");
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
        if (getEc2TagSet() != null)
            sb.append("ec2TagSet: " + getEc2TagSet() + ",");
        if (getEcsServices() != null)
            sb.append("ecsServices: " + getEcsServices() + ",");
        if (getOnPremisesTagSet() != null)
            sb.append("onPremisesTagSet: " + getOnPremisesTagSet() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
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
                + ((getEc2TagFilters() == null) ? 0 : getEc2TagFilters().hashCode());
        hashCode = prime
                * hashCode
                + ((getOnPremisesInstanceTagFilters() == null) ? 0
                        : getOnPremisesInstanceTagFilters().hashCode());
        hashCode = prime * hashCode
                + ((getAutoScalingGroups() == null) ? 0 : getAutoScalingGroups().hashCode());
        hashCode = prime * hashCode
                + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode());
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
        hashCode = prime * hashCode + ((getEc2TagSet() == null) ? 0 : getEc2TagSet().hashCode());
        hashCode = prime * hashCode
                + ((getEcsServices() == null) ? 0 : getEcsServices().hashCode());
        hashCode = prime * hashCode
                + ((getOnPremisesTagSet() == null) ? 0 : getOnPremisesTagSet().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDeploymentGroupRequest == false)
            return false;
        CreateDeploymentGroupRequest other = (CreateDeploymentGroupRequest) obj;

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
        if (other.getEc2TagSet() == null ^ this.getEc2TagSet() == null)
            return false;
        if (other.getEc2TagSet() != null
                && other.getEc2TagSet().equals(this.getEc2TagSet()) == false)
            return false;
        if (other.getEcsServices() == null ^ this.getEcsServices() == null)
            return false;
        if (other.getEcsServices() != null
                && other.getEcsServices().equals(this.getEcsServices()) == false)
            return false;
        if (other.getOnPremisesTagSet() == null ^ this.getOnPremisesTagSet() == null)
            return false;
        if (other.getOnPremisesTagSet() != null
                && other.getOnPremisesTagSet().equals(this.getOnPremisesTagSet()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
