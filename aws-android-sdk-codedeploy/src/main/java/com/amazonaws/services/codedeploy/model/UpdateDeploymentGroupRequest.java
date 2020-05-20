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
 * Changes information about a deployment group.
 * </p>
 */
public class UpdateDeploymentGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The application name that corresponds to the deployment group to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * <p>
     * The current name of the deployment group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String currentDeploymentGroupName;

    /**
     * <p>
     * The new name of the deployment group, if you want to change it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String newDeploymentGroupName;

    /**
     * <p>
     * The replacement deployment configuration name to use, if you want to
     * change it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String deploymentConfigName;

    /**
     * <p>
     * The replacement set of Amazon EC2 tags on which to filter, if you want to
     * change them. To keep the existing tags, enter their names. To remove
     * tags, do not enter any tag names.
     * </p>
     */
    private java.util.List<EC2TagFilter> ec2TagFilters;

    /**
     * <p>
     * The replacement set of on-premises instance tags on which to filter, if
     * you want to change them. To keep the existing tags, enter their names. To
     * remove tags, do not enter any tag names.
     * </p>
     */
    private java.util.List<TagFilter> onPremisesInstanceTagFilters;

    /**
     * <p>
     * The replacement list of Auto Scaling groups to be included in the
     * deployment group, if you want to change them. To keep the Auto Scaling
     * groups, enter their names. To remove Auto Scaling groups, do not enter
     * any Auto Scaling group names.
     * </p>
     */
    private java.util.List<String> autoScalingGroups;

    /**
     * <p>
     * A replacement ARN for the service role, if you want to change it.
     * </p>
     */
    private String serviceRoleArn;

    /**
     * <p>
     * Information about triggers to change when the deployment group is
     * updated. For examples, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-edit.html"
     * >Edit a Trigger in a CodeDeploy Deployment Group</a> in the <i>AWS
     * CodeDeploy User Guide</i>.
     * </p>
     */
    private java.util.List<TriggerConfig> triggerConfigurations;

    /**
     * <p>
     * Information to add or change about Amazon CloudWatch alarms when the
     * deployment group is updated.
     * </p>
     */
    private AlarmConfiguration alarmConfiguration;

    /**
     * <p>
     * Information for an automatic rollback configuration that is added or
     * changed when a deployment group is updated.
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
     * Information about the load balancer used in a deployment.
     * </p>
     */
    private LoadBalancerInfo loadBalancerInfo;

    /**
     * <p>
     * Information about groups of tags applied to on-premises instances. The
     * deployment group includes only EC2 instances identified by all the tag
     * groups.
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
     * Information about an on-premises instance tag set. The deployment group
     * includes only on-premises instances identified by all the tag groups.
     * </p>
     */
    private OnPremisesTagSet onPremisesTagSet;

    /**
     * <p>
     * The application name that corresponds to the deployment group to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The application name that corresponds to the deployment group to
     *         update.
     *         </p>
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * <p>
     * The application name that corresponds to the deployment group to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The application name that corresponds to the deployment group
     *            to update.
     *            </p>
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The application name that corresponds to the deployment group to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The application name that corresponds to the deployment group
     *            to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentGroupRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * <p>
     * The current name of the deployment group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The current name of the deployment group.
     *         </p>
     */
    public String getCurrentDeploymentGroupName() {
        return currentDeploymentGroupName;
    }

    /**
     * <p>
     * The current name of the deployment group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param currentDeploymentGroupName <p>
     *            The current name of the deployment group.
     *            </p>
     */
    public void setCurrentDeploymentGroupName(String currentDeploymentGroupName) {
        this.currentDeploymentGroupName = currentDeploymentGroupName;
    }

    /**
     * <p>
     * The current name of the deployment group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param currentDeploymentGroupName <p>
     *            The current name of the deployment group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentGroupRequest withCurrentDeploymentGroupName(
            String currentDeploymentGroupName) {
        this.currentDeploymentGroupName = currentDeploymentGroupName;
        return this;
    }

    /**
     * <p>
     * The new name of the deployment group, if you want to change it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The new name of the deployment group, if you want to change it.
     *         </p>
     */
    public String getNewDeploymentGroupName() {
        return newDeploymentGroupName;
    }

    /**
     * <p>
     * The new name of the deployment group, if you want to change it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param newDeploymentGroupName <p>
     *            The new name of the deployment group, if you want to change
     *            it.
     *            </p>
     */
    public void setNewDeploymentGroupName(String newDeploymentGroupName) {
        this.newDeploymentGroupName = newDeploymentGroupName;
    }

    /**
     * <p>
     * The new name of the deployment group, if you want to change it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param newDeploymentGroupName <p>
     *            The new name of the deployment group, if you want to change
     *            it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentGroupRequest withNewDeploymentGroupName(String newDeploymentGroupName) {
        this.newDeploymentGroupName = newDeploymentGroupName;
        return this;
    }

    /**
     * <p>
     * The replacement deployment configuration name to use, if you want to
     * change it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The replacement deployment configuration name to use, if you want
     *         to change it.
     *         </p>
     */
    public String getDeploymentConfigName() {
        return deploymentConfigName;
    }

    /**
     * <p>
     * The replacement deployment configuration name to use, if you want to
     * change it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentConfigName <p>
     *            The replacement deployment configuration name to use, if you
     *            want to change it.
     *            </p>
     */
    public void setDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
    }

    /**
     * <p>
     * The replacement deployment configuration name to use, if you want to
     * change it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentConfigName <p>
     *            The replacement deployment configuration name to use, if you
     *            want to change it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentGroupRequest withDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
        return this;
    }

    /**
     * <p>
     * The replacement set of Amazon EC2 tags on which to filter, if you want to
     * change them. To keep the existing tags, enter their names. To remove
     * tags, do not enter any tag names.
     * </p>
     *
     * @return <p>
     *         The replacement set of Amazon EC2 tags on which to filter, if you
     *         want to change them. To keep the existing tags, enter their
     *         names. To remove tags, do not enter any tag names.
     *         </p>
     */
    public java.util.List<EC2TagFilter> getEc2TagFilters() {
        return ec2TagFilters;
    }

    /**
     * <p>
     * The replacement set of Amazon EC2 tags on which to filter, if you want to
     * change them. To keep the existing tags, enter their names. To remove
     * tags, do not enter any tag names.
     * </p>
     *
     * @param ec2TagFilters <p>
     *            The replacement set of Amazon EC2 tags on which to filter, if
     *            you want to change them. To keep the existing tags, enter
     *            their names. To remove tags, do not enter any tag names.
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
     * The replacement set of Amazon EC2 tags on which to filter, if you want to
     * change them. To keep the existing tags, enter their names. To remove
     * tags, do not enter any tag names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ec2TagFilters <p>
     *            The replacement set of Amazon EC2 tags on which to filter, if
     *            you want to change them. To keep the existing tags, enter
     *            their names. To remove tags, do not enter any tag names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentGroupRequest withEc2TagFilters(EC2TagFilter... ec2TagFilters) {
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
     * The replacement set of Amazon EC2 tags on which to filter, if you want to
     * change them. To keep the existing tags, enter their names. To remove
     * tags, do not enter any tag names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ec2TagFilters <p>
     *            The replacement set of Amazon EC2 tags on which to filter, if
     *            you want to change them. To keep the existing tags, enter
     *            their names. To remove tags, do not enter any tag names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentGroupRequest withEc2TagFilters(
            java.util.Collection<EC2TagFilter> ec2TagFilters) {
        setEc2TagFilters(ec2TagFilters);
        return this;
    }

    /**
     * <p>
     * The replacement set of on-premises instance tags on which to filter, if
     * you want to change them. To keep the existing tags, enter their names. To
     * remove tags, do not enter any tag names.
     * </p>
     *
     * @return <p>
     *         The replacement set of on-premises instance tags on which to
     *         filter, if you want to change them. To keep the existing tags,
     *         enter their names. To remove tags, do not enter any tag names.
     *         </p>
     */
    public java.util.List<TagFilter> getOnPremisesInstanceTagFilters() {
        return onPremisesInstanceTagFilters;
    }

    /**
     * <p>
     * The replacement set of on-premises instance tags on which to filter, if
     * you want to change them. To keep the existing tags, enter their names. To
     * remove tags, do not enter any tag names.
     * </p>
     *
     * @param onPremisesInstanceTagFilters <p>
     *            The replacement set of on-premises instance tags on which to
     *            filter, if you want to change them. To keep the existing tags,
     *            enter their names. To remove tags, do not enter any tag names.
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
     * The replacement set of on-premises instance tags on which to filter, if
     * you want to change them. To keep the existing tags, enter their names. To
     * remove tags, do not enter any tag names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onPremisesInstanceTagFilters <p>
     *            The replacement set of on-premises instance tags on which to
     *            filter, if you want to change them. To keep the existing tags,
     *            enter their names. To remove tags, do not enter any tag names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentGroupRequest withOnPremisesInstanceTagFilters(
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
     * The replacement set of on-premises instance tags on which to filter, if
     * you want to change them. To keep the existing tags, enter their names. To
     * remove tags, do not enter any tag names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onPremisesInstanceTagFilters <p>
     *            The replacement set of on-premises instance tags on which to
     *            filter, if you want to change them. To keep the existing tags,
     *            enter their names. To remove tags, do not enter any tag names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentGroupRequest withOnPremisesInstanceTagFilters(
            java.util.Collection<TagFilter> onPremisesInstanceTagFilters) {
        setOnPremisesInstanceTagFilters(onPremisesInstanceTagFilters);
        return this;
    }

    /**
     * <p>
     * The replacement list of Auto Scaling groups to be included in the
     * deployment group, if you want to change them. To keep the Auto Scaling
     * groups, enter their names. To remove Auto Scaling groups, do not enter
     * any Auto Scaling group names.
     * </p>
     *
     * @return <p>
     *         The replacement list of Auto Scaling groups to be included in the
     *         deployment group, if you want to change them. To keep the Auto
     *         Scaling groups, enter their names. To remove Auto Scaling groups,
     *         do not enter any Auto Scaling group names.
     *         </p>
     */
    public java.util.List<String> getAutoScalingGroups() {
        return autoScalingGroups;
    }

    /**
     * <p>
     * The replacement list of Auto Scaling groups to be included in the
     * deployment group, if you want to change them. To keep the Auto Scaling
     * groups, enter their names. To remove Auto Scaling groups, do not enter
     * any Auto Scaling group names.
     * </p>
     *
     * @param autoScalingGroups <p>
     *            The replacement list of Auto Scaling groups to be included in
     *            the deployment group, if you want to change them. To keep the
     *            Auto Scaling groups, enter their names. To remove Auto Scaling
     *            groups, do not enter any Auto Scaling group names.
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
     * The replacement list of Auto Scaling groups to be included in the
     * deployment group, if you want to change them. To keep the Auto Scaling
     * groups, enter their names. To remove Auto Scaling groups, do not enter
     * any Auto Scaling group names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoScalingGroups <p>
     *            The replacement list of Auto Scaling groups to be included in
     *            the deployment group, if you want to change them. To keep the
     *            Auto Scaling groups, enter their names. To remove Auto Scaling
     *            groups, do not enter any Auto Scaling group names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentGroupRequest withAutoScalingGroups(String... autoScalingGroups) {
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
     * The replacement list of Auto Scaling groups to be included in the
     * deployment group, if you want to change them. To keep the Auto Scaling
     * groups, enter their names. To remove Auto Scaling groups, do not enter
     * any Auto Scaling group names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoScalingGroups <p>
     *            The replacement list of Auto Scaling groups to be included in
     *            the deployment group, if you want to change them. To keep the
     *            Auto Scaling groups, enter their names. To remove Auto Scaling
     *            groups, do not enter any Auto Scaling group names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentGroupRequest withAutoScalingGroups(
            java.util.Collection<String> autoScalingGroups) {
        setAutoScalingGroups(autoScalingGroups);
        return this;
    }

    /**
     * <p>
     * A replacement ARN for the service role, if you want to change it.
     * </p>
     *
     * @return <p>
     *         A replacement ARN for the service role, if you want to change it.
     *         </p>
     */
    public String getServiceRoleArn() {
        return serviceRoleArn;
    }

    /**
     * <p>
     * A replacement ARN for the service role, if you want to change it.
     * </p>
     *
     * @param serviceRoleArn <p>
     *            A replacement ARN for the service role, if you want to change
     *            it.
     *            </p>
     */
    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * A replacement ARN for the service role, if you want to change it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceRoleArn <p>
     *            A replacement ARN for the service role, if you want to change
     *            it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentGroupRequest withServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
        return this;
    }

    /**
     * <p>
     * Information about triggers to change when the deployment group is
     * updated. For examples, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-edit.html"
     * >Edit a Trigger in a CodeDeploy Deployment Group</a> in the <i>AWS
     * CodeDeploy User Guide</i>.
     * </p>
     *
     * @return <p>
     *         Information about triggers to change when the deployment group is
     *         updated. For examples, see <a href=
     *         "https://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-edit.html"
     *         >Edit a Trigger in a CodeDeploy Deployment Group</a> in the
     *         <i>AWS CodeDeploy User Guide</i>.
     *         </p>
     */
    public java.util.List<TriggerConfig> getTriggerConfigurations() {
        return triggerConfigurations;
    }

    /**
     * <p>
     * Information about triggers to change when the deployment group is
     * updated. For examples, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-edit.html"
     * >Edit a Trigger in a CodeDeploy Deployment Group</a> in the <i>AWS
     * CodeDeploy User Guide</i>.
     * </p>
     *
     * @param triggerConfigurations <p>
     *            Information about triggers to change when the deployment group
     *            is updated. For examples, see <a href=
     *            "https://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-edit.html"
     *            >Edit a Trigger in a CodeDeploy Deployment Group</a> in the
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
     * Information about triggers to change when the deployment group is
     * updated. For examples, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-edit.html"
     * >Edit a Trigger in a CodeDeploy Deployment Group</a> in the <i>AWS
     * CodeDeploy User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param triggerConfigurations <p>
     *            Information about triggers to change when the deployment group
     *            is updated. For examples, see <a href=
     *            "https://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-edit.html"
     *            >Edit a Trigger in a CodeDeploy Deployment Group</a> in the
     *            <i>AWS CodeDeploy User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentGroupRequest withTriggerConfigurations(
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
     * Information about triggers to change when the deployment group is
     * updated. For examples, see <a href=
     * "https://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-edit.html"
     * >Edit a Trigger in a CodeDeploy Deployment Group</a> in the <i>AWS
     * CodeDeploy User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param triggerConfigurations <p>
     *            Information about triggers to change when the deployment group
     *            is updated. For examples, see <a href=
     *            "https://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-edit.html"
     *            >Edit a Trigger in a CodeDeploy Deployment Group</a> in the
     *            <i>AWS CodeDeploy User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentGroupRequest withTriggerConfigurations(
            java.util.Collection<TriggerConfig> triggerConfigurations) {
        setTriggerConfigurations(triggerConfigurations);
        return this;
    }

    /**
     * <p>
     * Information to add or change about Amazon CloudWatch alarms when the
     * deployment group is updated.
     * </p>
     *
     * @return <p>
     *         Information to add or change about Amazon CloudWatch alarms when
     *         the deployment group is updated.
     *         </p>
     */
    public AlarmConfiguration getAlarmConfiguration() {
        return alarmConfiguration;
    }

    /**
     * <p>
     * Information to add or change about Amazon CloudWatch alarms when the
     * deployment group is updated.
     * </p>
     *
     * @param alarmConfiguration <p>
     *            Information to add or change about Amazon CloudWatch alarms
     *            when the deployment group is updated.
     *            </p>
     */
    public void setAlarmConfiguration(AlarmConfiguration alarmConfiguration) {
        this.alarmConfiguration = alarmConfiguration;
    }

    /**
     * <p>
     * Information to add or change about Amazon CloudWatch alarms when the
     * deployment group is updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param alarmConfiguration <p>
     *            Information to add or change about Amazon CloudWatch alarms
     *            when the deployment group is updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentGroupRequest withAlarmConfiguration(AlarmConfiguration alarmConfiguration) {
        this.alarmConfiguration = alarmConfiguration;
        return this;
    }

    /**
     * <p>
     * Information for an automatic rollback configuration that is added or
     * changed when a deployment group is updated.
     * </p>
     *
     * @return <p>
     *         Information for an automatic rollback configuration that is added
     *         or changed when a deployment group is updated.
     *         </p>
     */
    public AutoRollbackConfiguration getAutoRollbackConfiguration() {
        return autoRollbackConfiguration;
    }

    /**
     * <p>
     * Information for an automatic rollback configuration that is added or
     * changed when a deployment group is updated.
     * </p>
     *
     * @param autoRollbackConfiguration <p>
     *            Information for an automatic rollback configuration that is
     *            added or changed when a deployment group is updated.
     *            </p>
     */
    public void setAutoRollbackConfiguration(AutoRollbackConfiguration autoRollbackConfiguration) {
        this.autoRollbackConfiguration = autoRollbackConfiguration;
    }

    /**
     * <p>
     * Information for an automatic rollback configuration that is added or
     * changed when a deployment group is updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoRollbackConfiguration <p>
     *            Information for an automatic rollback configuration that is
     *            added or changed when a deployment group is updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentGroupRequest withAutoRollbackConfiguration(
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
    public UpdateDeploymentGroupRequest withDeploymentStyle(DeploymentStyle deploymentStyle) {
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
    public UpdateDeploymentGroupRequest withBlueGreenDeploymentConfiguration(
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
    public UpdateDeploymentGroupRequest withLoadBalancerInfo(LoadBalancerInfo loadBalancerInfo) {
        this.loadBalancerInfo = loadBalancerInfo;
        return this;
    }

    /**
     * <p>
     * Information about groups of tags applied to on-premises instances. The
     * deployment group includes only EC2 instances identified by all the tag
     * groups.
     * </p>
     *
     * @return <p>
     *         Information about groups of tags applied to on-premises
     *         instances. The deployment group includes only EC2 instances
     *         identified by all the tag groups.
     *         </p>
     */
    public EC2TagSet getEc2TagSet() {
        return ec2TagSet;
    }

    /**
     * <p>
     * Information about groups of tags applied to on-premises instances. The
     * deployment group includes only EC2 instances identified by all the tag
     * groups.
     * </p>
     *
     * @param ec2TagSet <p>
     *            Information about groups of tags applied to on-premises
     *            instances. The deployment group includes only EC2 instances
     *            identified by all the tag groups.
     *            </p>
     */
    public void setEc2TagSet(EC2TagSet ec2TagSet) {
        this.ec2TagSet = ec2TagSet;
    }

    /**
     * <p>
     * Information about groups of tags applied to on-premises instances. The
     * deployment group includes only EC2 instances identified by all the tag
     * groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ec2TagSet <p>
     *            Information about groups of tags applied to on-premises
     *            instances. The deployment group includes only EC2 instances
     *            identified by all the tag groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentGroupRequest withEc2TagSet(EC2TagSet ec2TagSet) {
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
    public UpdateDeploymentGroupRequest withEcsServices(ECSService... ecsServices) {
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
    public UpdateDeploymentGroupRequest withEcsServices(java.util.Collection<ECSService> ecsServices) {
        setEcsServices(ecsServices);
        return this;
    }

    /**
     * <p>
     * Information about an on-premises instance tag set. The deployment group
     * includes only on-premises instances identified by all the tag groups.
     * </p>
     *
     * @return <p>
     *         Information about an on-premises instance tag set. The deployment
     *         group includes only on-premises instances identified by all the
     *         tag groups.
     *         </p>
     */
    public OnPremisesTagSet getOnPremisesTagSet() {
        return onPremisesTagSet;
    }

    /**
     * <p>
     * Information about an on-premises instance tag set. The deployment group
     * includes only on-premises instances identified by all the tag groups.
     * </p>
     *
     * @param onPremisesTagSet <p>
     *            Information about an on-premises instance tag set. The
     *            deployment group includes only on-premises instances
     *            identified by all the tag groups.
     *            </p>
     */
    public void setOnPremisesTagSet(OnPremisesTagSet onPremisesTagSet) {
        this.onPremisesTagSet = onPremisesTagSet;
    }

    /**
     * <p>
     * Information about an on-premises instance tag set. The deployment group
     * includes only on-premises instances identified by all the tag groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onPremisesTagSet <p>
     *            Information about an on-premises instance tag set. The
     *            deployment group includes only on-premises instances
     *            identified by all the tag groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentGroupRequest withOnPremisesTagSet(OnPremisesTagSet onPremisesTagSet) {
        this.onPremisesTagSet = onPremisesTagSet;
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
        if (getCurrentDeploymentGroupName() != null)
            sb.append("currentDeploymentGroupName: " + getCurrentDeploymentGroupName() + ",");
        if (getNewDeploymentGroupName() != null)
            sb.append("newDeploymentGroupName: " + getNewDeploymentGroupName() + ",");
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
            sb.append("onPremisesTagSet: " + getOnPremisesTagSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime
                * hashCode
                + ((getCurrentDeploymentGroupName() == null) ? 0 : getCurrentDeploymentGroupName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getNewDeploymentGroupName() == null) ? 0 : getNewDeploymentGroupName()
                        .hashCode());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDeploymentGroupRequest == false)
            return false;
        UpdateDeploymentGroupRequest other = (UpdateDeploymentGroupRequest) obj;

        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null
                && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getCurrentDeploymentGroupName() == null
                ^ this.getCurrentDeploymentGroupName() == null)
            return false;
        if (other.getCurrentDeploymentGroupName() != null
                && other.getCurrentDeploymentGroupName().equals(
                        this.getCurrentDeploymentGroupName()) == false)
            return false;
        if (other.getNewDeploymentGroupName() == null ^ this.getNewDeploymentGroupName() == null)
            return false;
        if (other.getNewDeploymentGroupName() != null
                && other.getNewDeploymentGroupName().equals(this.getNewDeploymentGroupName()) == false)
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
        return true;
    }
}
