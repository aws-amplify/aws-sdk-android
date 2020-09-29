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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


/**
 * <p>Describes a filter for a specific list of instances. </p>
 */
public class InstanceInformation implements Serializable {
    /**
     * <p>The instance ID. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     */
    private String instanceId;

    /**
     * <p>Connection status of SSM Agent. </p> <note> <p>The status <code>Inactive</code> has been deprecated and is no longer in use.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Online, ConnectionLost, Inactive
     */
    private String pingStatus;

    /**
     * <p>The date and time when agent last pinged Systems Manager service. </p>
     */
    private java.util.Date lastPingDateTime;

    /**
     * <p>The version of SSM Agent running on your Linux instance. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{1,6}(\.[0-9]{1,6}){2,3}$<br/>
     */
    private String agentVersion;

    /**
     * <p>Indicates whether the latest version of SSM Agent is running on your Linux Managed Instance. This field does not indicate whether or not the latest version is installed on Windows managed instances, because some older versions of Windows Server use the EC2Config service to process SSM requests.</p>
     */
    private Boolean isLatestVersion;

    /**
     * <p>The operating system platform type. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows, Linux
     */
    private String platformType;

    /**
     * <p>The name of the operating system platform running on your instance. </p>
     */
    private String platformName;

    /**
     * <p>The version of the OS platform running on your instance. </p>
     */
    private String platformVersion;

    /**
     * <p>The activation ID created by Systems Manager when the server or VM was registered.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     */
    private String activationId;

    /**
     * <p>The Amazon Identity and Access Management (IAM) role assigned to the on-premises Systems Manager managed instance. This call does not return the IAM role for EC2 instances. To retrieve the IAM role for an EC2 instance, use the Amazon EC2 <code>DescribeInstances</code> action. For information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html">DescribeInstances</a> in the <i>Amazon EC2 API Reference</i> or <a href="http://docs.aws.amazon.com/cli/latest/reference/ec2/describe-instances.html">describe-instances</a> in the <i>AWS CLI Command Reference</i>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String iamRole;

    /**
     * <p>The date the server or VM was registered with AWS as a managed instance.</p>
     */
    private java.util.Date registrationDate;

    /**
     * <p>The type of instance. Instances are either EC2 instances or managed instances. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ManagedInstance, Document, EC2Instance
     */
    private String resourceType;

    /**
     * <p>The name assigned to an on-premises server or virtual machine (VM) when it is activated as a Systems Manager managed instance. The name is specified as the <code>DefaultInstanceName</code> property using the <a>CreateActivation</a> command. It is applied to the managed instance by specifying the Activation Code and Activation ID when you install SSM Agent on the instance, as explained in <a href="http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-install-managed-linux.html">Install SSM Agent for a hybrid environment (Linux)</a> and <a href="http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-install-managed-win.html">Install SSM Agent for a hybrid environment (Windows)</a>. To retrieve the Name tag of an EC2 instance, use the Amazon EC2 <code>DescribeInstances</code> action. For information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html">DescribeInstances</a> in the <i>Amazon EC2 API Reference</i> or <a href="http://docs.aws.amazon.com/cli/latest/reference/ec2/describe-instances.html">describe-instances</a> in the <i>AWS CLI Command Reference</i>.</p>
     */
    private String name;

    /**
     * <p>The IP address of the managed instance.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 46<br/>
     */
    private String iPAddress;

    /**
     * <p>The fully qualified host name of the managed instance.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String computerName;

    /**
     * <p>The status of the association.</p>
     */
    private String associationStatus;

    /**
     * <p>The date the association was last run.</p>
     */
    private java.util.Date lastAssociationExecutionDate;

    /**
     * <p>The last date the association was successfully run.</p>
     */
    private java.util.Date lastSuccessfulAssociationExecutionDate;

    /**
     * <p>Information about the association.</p>
     */
    private InstanceAggregatedAssociationOverview associationOverview;

    /**
     * <p>The instance ID. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @return <p>The instance ID. </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>The instance ID. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @param instanceId <p>The instance ID. </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>The instance ID. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @param instanceId <p>The instance ID. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceInformation withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>Connection status of SSM Agent. </p> <note> <p>The status <code>Inactive</code> has been deprecated and is no longer in use.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Online, ConnectionLost, Inactive
     *
     * @return <p>Connection status of SSM Agent. </p> <note> <p>The status <code>Inactive</code> has been deprecated and is no longer in use.</p> </note>
     *
     * @see PingStatus
     */
    public String getPingStatus() {
        return pingStatus;
    }

    /**
     * <p>Connection status of SSM Agent. </p> <note> <p>The status <code>Inactive</code> has been deprecated and is no longer in use.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Online, ConnectionLost, Inactive
     *
     * @param pingStatus <p>Connection status of SSM Agent. </p> <note> <p>The status <code>Inactive</code> has been deprecated and is no longer in use.</p> </note>
     *
     * @see PingStatus
     */
    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    /**
     * <p>Connection status of SSM Agent. </p> <note> <p>The status <code>Inactive</code> has been deprecated and is no longer in use.</p> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Online, ConnectionLost, Inactive
     *
     * @param pingStatus <p>Connection status of SSM Agent. </p> <note> <p>The status <code>Inactive</code> has been deprecated and is no longer in use.</p> </note>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see PingStatus
     */
    public InstanceInformation withPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
        return this;
    }

    /**
     * <p>Connection status of SSM Agent. </p> <note> <p>The status <code>Inactive</code> has been deprecated and is no longer in use.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Online, ConnectionLost, Inactive
     *
     * @param pingStatus <p>Connection status of SSM Agent. </p> <note> <p>The status <code>Inactive</code> has been deprecated and is no longer in use.</p> </note>
     *
     * @see PingStatus
     */
    public void setPingStatus(PingStatus pingStatus) {
        this.pingStatus = pingStatus.toString();
    }

    /**
     * <p>Connection status of SSM Agent. </p> <note> <p>The status <code>Inactive</code> has been deprecated and is no longer in use.</p> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Online, ConnectionLost, Inactive
     *
     * @param pingStatus <p>Connection status of SSM Agent. </p> <note> <p>The status <code>Inactive</code> has been deprecated and is no longer in use.</p> </note>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see PingStatus
     */
    public InstanceInformation withPingStatus(PingStatus pingStatus) {
        this.pingStatus = pingStatus.toString();
        return this;
    }

    /**
     * <p>The date and time when agent last pinged Systems Manager service. </p>
     *
     * @return <p>The date and time when agent last pinged Systems Manager service. </p>
     */
    public java.util.Date getLastPingDateTime() {
        return lastPingDateTime;
    }

    /**
     * <p>The date and time when agent last pinged Systems Manager service. </p>
     *
     * @param lastPingDateTime <p>The date and time when agent last pinged Systems Manager service. </p>
     */
    public void setLastPingDateTime(java.util.Date lastPingDateTime) {
        this.lastPingDateTime = lastPingDateTime;
    }

    /**
     * <p>The date and time when agent last pinged Systems Manager service. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastPingDateTime <p>The date and time when agent last pinged Systems Manager service. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceInformation withLastPingDateTime(java.util.Date lastPingDateTime) {
        this.lastPingDateTime = lastPingDateTime;
        return this;
    }

    /**
     * <p>The version of SSM Agent running on your Linux instance. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{1,6}(\.[0-9]{1,6}){2,3}$<br/>
     *
     * @return <p>The version of SSM Agent running on your Linux instance. </p>
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    /**
     * <p>The version of SSM Agent running on your Linux instance. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{1,6}(\.[0-9]{1,6}){2,3}$<br/>
     *
     * @param agentVersion <p>The version of SSM Agent running on your Linux instance. </p>
     */
    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    /**
     * <p>The version of SSM Agent running on your Linux instance. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{1,6}(\.[0-9]{1,6}){2,3}$<br/>
     *
     * @param agentVersion <p>The version of SSM Agent running on your Linux instance. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceInformation withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * <p>Indicates whether the latest version of SSM Agent is running on your Linux Managed Instance. This field does not indicate whether or not the latest version is installed on Windows managed instances, because some older versions of Windows Server use the EC2Config service to process SSM requests.</p>
     *
     * @return <p>Indicates whether the latest version of SSM Agent is running on your Linux Managed Instance. This field does not indicate whether or not the latest version is installed on Windows managed instances, because some older versions of Windows Server use the EC2Config service to process SSM requests.</p>
     */
    public Boolean isIsLatestVersion() {
        return isLatestVersion;
    }

    /**
     * <p>Indicates whether the latest version of SSM Agent is running on your Linux Managed Instance. This field does not indicate whether or not the latest version is installed on Windows managed instances, because some older versions of Windows Server use the EC2Config service to process SSM requests.</p>
     *
     * @return <p>Indicates whether the latest version of SSM Agent is running on your Linux Managed Instance. This field does not indicate whether or not the latest version is installed on Windows managed instances, because some older versions of Windows Server use the EC2Config service to process SSM requests.</p>
     */
    public Boolean getIsLatestVersion() {
        return isLatestVersion;
    }

    /**
     * <p>Indicates whether the latest version of SSM Agent is running on your Linux Managed Instance. This field does not indicate whether or not the latest version is installed on Windows managed instances, because some older versions of Windows Server use the EC2Config service to process SSM requests.</p>
     *
     * @param isLatestVersion <p>Indicates whether the latest version of SSM Agent is running on your Linux Managed Instance. This field does not indicate whether or not the latest version is installed on Windows managed instances, because some older versions of Windows Server use the EC2Config service to process SSM requests.</p>
     */
    public void setIsLatestVersion(Boolean isLatestVersion) {
        this.isLatestVersion = isLatestVersion;
    }

    /**
     * <p>Indicates whether the latest version of SSM Agent is running on your Linux Managed Instance. This field does not indicate whether or not the latest version is installed on Windows managed instances, because some older versions of Windows Server use the EC2Config service to process SSM requests.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isLatestVersion <p>Indicates whether the latest version of SSM Agent is running on your Linux Managed Instance. This field does not indicate whether or not the latest version is installed on Windows managed instances, because some older versions of Windows Server use the EC2Config service to process SSM requests.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceInformation withIsLatestVersion(Boolean isLatestVersion) {
        this.isLatestVersion = isLatestVersion;
        return this;
    }

    /**
     * <p>The operating system platform type. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows, Linux
     *
     * @return <p>The operating system platform type. </p>
     *
     * @see PlatformType
     */
    public String getPlatformType() {
        return platformType;
    }

    /**
     * <p>The operating system platform type. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows, Linux
     *
     * @param platformType <p>The operating system platform type. </p>
     *
     * @see PlatformType
     */
    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }

    /**
     * <p>The operating system platform type. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows, Linux
     *
     * @param platformType <p>The operating system platform type. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see PlatformType
     */
    public InstanceInformation withPlatformType(String platformType) {
        this.platformType = platformType;
        return this;
    }

    /**
     * <p>The operating system platform type. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows, Linux
     *
     * @param platformType <p>The operating system platform type. </p>
     *
     * @see PlatformType
     */
    public void setPlatformType(PlatformType platformType) {
        this.platformType = platformType.toString();
    }

    /**
     * <p>The operating system platform type. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows, Linux
     *
     * @param platformType <p>The operating system platform type. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see PlatformType
     */
    public InstanceInformation withPlatformType(PlatformType platformType) {
        this.platformType = platformType.toString();
        return this;
    }

    /**
     * <p>The name of the operating system platform running on your instance. </p>
     *
     * @return <p>The name of the operating system platform running on your instance. </p>
     */
    public String getPlatformName() {
        return platformName;
    }

    /**
     * <p>The name of the operating system platform running on your instance. </p>
     *
     * @param platformName <p>The name of the operating system platform running on your instance. </p>
     */
    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    /**
     * <p>The name of the operating system platform running on your instance. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param platformName <p>The name of the operating system platform running on your instance. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceInformation withPlatformName(String platformName) {
        this.platformName = platformName;
        return this;
    }

    /**
     * <p>The version of the OS platform running on your instance. </p>
     *
     * @return <p>The version of the OS platform running on your instance. </p>
     */
    public String getPlatformVersion() {
        return platformVersion;
    }

    /**
     * <p>The version of the OS platform running on your instance. </p>
     *
     * @param platformVersion <p>The version of the OS platform running on your instance. </p>
     */
    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>The version of the OS platform running on your instance. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param platformVersion <p>The version of the OS platform running on your instance. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceInformation withPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
        return this;
    }

    /**
     * <p>The activation ID created by Systems Manager when the server or VM was registered.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>The activation ID created by Systems Manager when the server or VM was registered.</p>
     */
    public String getActivationId() {
        return activationId;
    }

    /**
     * <p>The activation ID created by Systems Manager when the server or VM was registered.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param activationId <p>The activation ID created by Systems Manager when the server or VM was registered.</p>
     */
    public void setActivationId(String activationId) {
        this.activationId = activationId;
    }

    /**
     * <p>The activation ID created by Systems Manager when the server or VM was registered.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param activationId <p>The activation ID created by Systems Manager when the server or VM was registered.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceInformation withActivationId(String activationId) {
        this.activationId = activationId;
        return this;
    }

    /**
     * <p>The Amazon Identity and Access Management (IAM) role assigned to the on-premises Systems Manager managed instance. This call does not return the IAM role for EC2 instances. To retrieve the IAM role for an EC2 instance, use the Amazon EC2 <code>DescribeInstances</code> action. For information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html">DescribeInstances</a> in the <i>Amazon EC2 API Reference</i> or <a href="http://docs.aws.amazon.com/cli/latest/reference/ec2/describe-instances.html">describe-instances</a> in the <i>AWS CLI Command Reference</i>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>The Amazon Identity and Access Management (IAM) role assigned to the on-premises Systems Manager managed instance. This call does not return the IAM role for EC2 instances. To retrieve the IAM role for an EC2 instance, use the Amazon EC2 <code>DescribeInstances</code> action. For information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html">DescribeInstances</a> in the <i>Amazon EC2 API Reference</i> or <a href="http://docs.aws.amazon.com/cli/latest/reference/ec2/describe-instances.html">describe-instances</a> in the <i>AWS CLI Command Reference</i>.</p>
     */
    public String getIamRole() {
        return iamRole;
    }

    /**
     * <p>The Amazon Identity and Access Management (IAM) role assigned to the on-premises Systems Manager managed instance. This call does not return the IAM role for EC2 instances. To retrieve the IAM role for an EC2 instance, use the Amazon EC2 <code>DescribeInstances</code> action. For information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html">DescribeInstances</a> in the <i>Amazon EC2 API Reference</i> or <a href="http://docs.aws.amazon.com/cli/latest/reference/ec2/describe-instances.html">describe-instances</a> in the <i>AWS CLI Command Reference</i>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param iamRole <p>The Amazon Identity and Access Management (IAM) role assigned to the on-premises Systems Manager managed instance. This call does not return the IAM role for EC2 instances. To retrieve the IAM role for an EC2 instance, use the Amazon EC2 <code>DescribeInstances</code> action. For information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html">DescribeInstances</a> in the <i>Amazon EC2 API Reference</i> or <a href="http://docs.aws.amazon.com/cli/latest/reference/ec2/describe-instances.html">describe-instances</a> in the <i>AWS CLI Command Reference</i>.</p>
     */
    public void setIamRole(String iamRole) {
        this.iamRole = iamRole;
    }

    /**
     * <p>The Amazon Identity and Access Management (IAM) role assigned to the on-premises Systems Manager managed instance. This call does not return the IAM role for EC2 instances. To retrieve the IAM role for an EC2 instance, use the Amazon EC2 <code>DescribeInstances</code> action. For information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html">DescribeInstances</a> in the <i>Amazon EC2 API Reference</i> or <a href="http://docs.aws.amazon.com/cli/latest/reference/ec2/describe-instances.html">describe-instances</a> in the <i>AWS CLI Command Reference</i>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param iamRole <p>The Amazon Identity and Access Management (IAM) role assigned to the on-premises Systems Manager managed instance. This call does not return the IAM role for EC2 instances. To retrieve the IAM role for an EC2 instance, use the Amazon EC2 <code>DescribeInstances</code> action. For information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html">DescribeInstances</a> in the <i>Amazon EC2 API Reference</i> or <a href="http://docs.aws.amazon.com/cli/latest/reference/ec2/describe-instances.html">describe-instances</a> in the <i>AWS CLI Command Reference</i>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceInformation withIamRole(String iamRole) {
        this.iamRole = iamRole;
        return this;
    }

    /**
     * <p>The date the server or VM was registered with AWS as a managed instance.</p>
     *
     * @return <p>The date the server or VM was registered with AWS as a managed instance.</p>
     */
    public java.util.Date getRegistrationDate() {
        return registrationDate;
    }

    /**
     * <p>The date the server or VM was registered with AWS as a managed instance.</p>
     *
     * @param registrationDate <p>The date the server or VM was registered with AWS as a managed instance.</p>
     */
    public void setRegistrationDate(java.util.Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    /**
     * <p>The date the server or VM was registered with AWS as a managed instance.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param registrationDate <p>The date the server or VM was registered with AWS as a managed instance.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceInformation withRegistrationDate(java.util.Date registrationDate) {
        this.registrationDate = registrationDate;
        return this;
    }

    /**
     * <p>The type of instance. Instances are either EC2 instances or managed instances. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ManagedInstance, Document, EC2Instance
     *
     * @return <p>The type of instance. Instances are either EC2 instances or managed instances. </p>
     *
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>The type of instance. Instances are either EC2 instances or managed instances. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ManagedInstance, Document, EC2Instance
     *
     * @param resourceType <p>The type of instance. Instances are either EC2 instances or managed instances. </p>
     *
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>The type of instance. Instances are either EC2 instances or managed instances. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ManagedInstance, Document, EC2Instance
     *
     * @param resourceType <p>The type of instance. Instances are either EC2 instances or managed instances. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ResourceType
     */
    public InstanceInformation withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>The type of instance. Instances are either EC2 instances or managed instances. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ManagedInstance, Document, EC2Instance
     *
     * @param resourceType <p>The type of instance. Instances are either EC2 instances or managed instances. </p>
     *
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>The type of instance. Instances are either EC2 instances or managed instances. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ManagedInstance, Document, EC2Instance
     *
     * @param resourceType <p>The type of instance. Instances are either EC2 instances or managed instances. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ResourceType
     */
    public InstanceInformation withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>The name assigned to an on-premises server or virtual machine (VM) when it is activated as a Systems Manager managed instance. The name is specified as the <code>DefaultInstanceName</code> property using the <a>CreateActivation</a> command. It is applied to the managed instance by specifying the Activation Code and Activation ID when you install SSM Agent on the instance, as explained in <a href="http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-install-managed-linux.html">Install SSM Agent for a hybrid environment (Linux)</a> and <a href="http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-install-managed-win.html">Install SSM Agent for a hybrid environment (Windows)</a>. To retrieve the Name tag of an EC2 instance, use the Amazon EC2 <code>DescribeInstances</code> action. For information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html">DescribeInstances</a> in the <i>Amazon EC2 API Reference</i> or <a href="http://docs.aws.amazon.com/cli/latest/reference/ec2/describe-instances.html">describe-instances</a> in the <i>AWS CLI Command Reference</i>.</p>
     *
     * @return <p>The name assigned to an on-premises server or virtual machine (VM) when it is activated as a Systems Manager managed instance. The name is specified as the <code>DefaultInstanceName</code> property using the <a>CreateActivation</a> command. It is applied to the managed instance by specifying the Activation Code and Activation ID when you install SSM Agent on the instance, as explained in <a href="http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-install-managed-linux.html">Install SSM Agent for a hybrid environment (Linux)</a> and <a href="http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-install-managed-win.html">Install SSM Agent for a hybrid environment (Windows)</a>. To retrieve the Name tag of an EC2 instance, use the Amazon EC2 <code>DescribeInstances</code> action. For information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html">DescribeInstances</a> in the <i>Amazon EC2 API Reference</i> or <a href="http://docs.aws.amazon.com/cli/latest/reference/ec2/describe-instances.html">describe-instances</a> in the <i>AWS CLI Command Reference</i>.</p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The name assigned to an on-premises server or virtual machine (VM) when it is activated as a Systems Manager managed instance. The name is specified as the <code>DefaultInstanceName</code> property using the <a>CreateActivation</a> command. It is applied to the managed instance by specifying the Activation Code and Activation ID when you install SSM Agent on the instance, as explained in <a href="http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-install-managed-linux.html">Install SSM Agent for a hybrid environment (Linux)</a> and <a href="http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-install-managed-win.html">Install SSM Agent for a hybrid environment (Windows)</a>. To retrieve the Name tag of an EC2 instance, use the Amazon EC2 <code>DescribeInstances</code> action. For information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html">DescribeInstances</a> in the <i>Amazon EC2 API Reference</i> or <a href="http://docs.aws.amazon.com/cli/latest/reference/ec2/describe-instances.html">describe-instances</a> in the <i>AWS CLI Command Reference</i>.</p>
     *
     * @param name <p>The name assigned to an on-premises server or virtual machine (VM) when it is activated as a Systems Manager managed instance. The name is specified as the <code>DefaultInstanceName</code> property using the <a>CreateActivation</a> command. It is applied to the managed instance by specifying the Activation Code and Activation ID when you install SSM Agent on the instance, as explained in <a href="http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-install-managed-linux.html">Install SSM Agent for a hybrid environment (Linux)</a> and <a href="http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-install-managed-win.html">Install SSM Agent for a hybrid environment (Windows)</a>. To retrieve the Name tag of an EC2 instance, use the Amazon EC2 <code>DescribeInstances</code> action. For information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html">DescribeInstances</a> in the <i>Amazon EC2 API Reference</i> or <a href="http://docs.aws.amazon.com/cli/latest/reference/ec2/describe-instances.html">describe-instances</a> in the <i>AWS CLI Command Reference</i>.</p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The name assigned to an on-premises server or virtual machine (VM) when it is activated as a Systems Manager managed instance. The name is specified as the <code>DefaultInstanceName</code> property using the <a>CreateActivation</a> command. It is applied to the managed instance by specifying the Activation Code and Activation ID when you install SSM Agent on the instance, as explained in <a href="http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-install-managed-linux.html">Install SSM Agent for a hybrid environment (Linux)</a> and <a href="http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-install-managed-win.html">Install SSM Agent for a hybrid environment (Windows)</a>. To retrieve the Name tag of an EC2 instance, use the Amazon EC2 <code>DescribeInstances</code> action. For information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html">DescribeInstances</a> in the <i>Amazon EC2 API Reference</i> or <a href="http://docs.aws.amazon.com/cli/latest/reference/ec2/describe-instances.html">describe-instances</a> in the <i>AWS CLI Command Reference</i>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name <p>The name assigned to an on-premises server or virtual machine (VM) when it is activated as a Systems Manager managed instance. The name is specified as the <code>DefaultInstanceName</code> property using the <a>CreateActivation</a> command. It is applied to the managed instance by specifying the Activation Code and Activation ID when you install SSM Agent on the instance, as explained in <a href="http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-install-managed-linux.html">Install SSM Agent for a hybrid environment (Linux)</a> and <a href="http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-install-managed-win.html">Install SSM Agent for a hybrid environment (Windows)</a>. To retrieve the Name tag of an EC2 instance, use the Amazon EC2 <code>DescribeInstances</code> action. For information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html">DescribeInstances</a> in the <i>Amazon EC2 API Reference</i> or <a href="http://docs.aws.amazon.com/cli/latest/reference/ec2/describe-instances.html">describe-instances</a> in the <i>AWS CLI Command Reference</i>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceInformation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>The IP address of the managed instance.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 46<br/>
     *
     * @return <p>The IP address of the managed instance.</p>
     */
    public String getIPAddress() {
        return iPAddress;
    }

    /**
     * <p>The IP address of the managed instance.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 46<br/>
     *
     * @param iPAddress <p>The IP address of the managed instance.</p>
     */
    public void setIPAddress(String iPAddress) {
        this.iPAddress = iPAddress;
    }

    /**
     * <p>The IP address of the managed instance.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 46<br/>
     *
     * @param iPAddress <p>The IP address of the managed instance.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceInformation withIPAddress(String iPAddress) {
        this.iPAddress = iPAddress;
        return this;
    }

    /**
     * <p>The fully qualified host name of the managed instance.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>The fully qualified host name of the managed instance.</p>
     */
    public String getComputerName() {
        return computerName;
    }

    /**
     * <p>The fully qualified host name of the managed instance.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param computerName <p>The fully qualified host name of the managed instance.</p>
     */
    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    /**
     * <p>The fully qualified host name of the managed instance.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param computerName <p>The fully qualified host name of the managed instance.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceInformation withComputerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

    /**
     * <p>The status of the association.</p>
     *
     * @return <p>The status of the association.</p>
     */
    public String getAssociationStatus() {
        return associationStatus;
    }

    /**
     * <p>The status of the association.</p>
     *
     * @param associationStatus <p>The status of the association.</p>
     */
    public void setAssociationStatus(String associationStatus) {
        this.associationStatus = associationStatus;
    }

    /**
     * <p>The status of the association.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associationStatus <p>The status of the association.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceInformation withAssociationStatus(String associationStatus) {
        this.associationStatus = associationStatus;
        return this;
    }

    /**
     * <p>The date the association was last run.</p>
     *
     * @return <p>The date the association was last run.</p>
     */
    public java.util.Date getLastAssociationExecutionDate() {
        return lastAssociationExecutionDate;
    }

    /**
     * <p>The date the association was last run.</p>
     *
     * @param lastAssociationExecutionDate <p>The date the association was last run.</p>
     */
    public void setLastAssociationExecutionDate(java.util.Date lastAssociationExecutionDate) {
        this.lastAssociationExecutionDate = lastAssociationExecutionDate;
    }

    /**
     * <p>The date the association was last run.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastAssociationExecutionDate <p>The date the association was last run.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceInformation withLastAssociationExecutionDate(java.util.Date lastAssociationExecutionDate) {
        this.lastAssociationExecutionDate = lastAssociationExecutionDate;
        return this;
    }

    /**
     * <p>The last date the association was successfully run.</p>
     *
     * @return <p>The last date the association was successfully run.</p>
     */
    public java.util.Date getLastSuccessfulAssociationExecutionDate() {
        return lastSuccessfulAssociationExecutionDate;
    }

    /**
     * <p>The last date the association was successfully run.</p>
     *
     * @param lastSuccessfulAssociationExecutionDate <p>The last date the association was successfully run.</p>
     */
    public void setLastSuccessfulAssociationExecutionDate(java.util.Date lastSuccessfulAssociationExecutionDate) {
        this.lastSuccessfulAssociationExecutionDate = lastSuccessfulAssociationExecutionDate;
    }

    /**
     * <p>The last date the association was successfully run.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastSuccessfulAssociationExecutionDate <p>The last date the association was successfully run.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceInformation withLastSuccessfulAssociationExecutionDate(java.util.Date lastSuccessfulAssociationExecutionDate) {
        this.lastSuccessfulAssociationExecutionDate = lastSuccessfulAssociationExecutionDate;
        return this;
    }

    /**
     * <p>Information about the association.</p>
     *
     * @return <p>Information about the association.</p>
     */
    public InstanceAggregatedAssociationOverview getAssociationOverview() {
        return associationOverview;
    }

    /**
     * <p>Information about the association.</p>
     *
     * @param associationOverview <p>Information about the association.</p>
     */
    public void setAssociationOverview(InstanceAggregatedAssociationOverview associationOverview) {
        this.associationOverview = associationOverview;
    }

    /**
     * <p>Information about the association.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associationOverview <p>Information about the association.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstanceInformation withAssociationOverview(InstanceAggregatedAssociationOverview associationOverview) {
        this.associationOverview = associationOverview;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getPingStatus() != null) sb.append("PingStatus: " + getPingStatus() + ",");
        if (getLastPingDateTime() != null) sb.append("LastPingDateTime: " + getLastPingDateTime() + ",");
        if (getAgentVersion() != null) sb.append("AgentVersion: " + getAgentVersion() + ",");
        if (getIsLatestVersion() != null) sb.append("IsLatestVersion: " + getIsLatestVersion() + ",");
        if (getPlatformType() != null) sb.append("PlatformType: " + getPlatformType() + ",");
        if (getPlatformName() != null) sb.append("PlatformName: " + getPlatformName() + ",");
        if (getPlatformVersion() != null) sb.append("PlatformVersion: " + getPlatformVersion() + ",");
        if (getActivationId() != null) sb.append("ActivationId: " + getActivationId() + ",");
        if (getIamRole() != null) sb.append("IamRole: " + getIamRole() + ",");
        if (getRegistrationDate() != null) sb.append("RegistrationDate: " + getRegistrationDate() + ",");
        if (getResourceType() != null) sb.append("ResourceType: " + getResourceType() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getIPAddress() != null) sb.append("IPAddress: " + getIPAddress() + ",");
        if (getComputerName() != null) sb.append("ComputerName: " + getComputerName() + ",");
        if (getAssociationStatus() != null) sb.append("AssociationStatus: " + getAssociationStatus() + ",");
        if (getLastAssociationExecutionDate() != null) sb.append("LastAssociationExecutionDate: " + getLastAssociationExecutionDate() + ",");
        if (getLastSuccessfulAssociationExecutionDate() != null) sb.append("LastSuccessfulAssociationExecutionDate: " + getLastSuccessfulAssociationExecutionDate() + ",");
        if (getAssociationOverview() != null) sb.append("AssociationOverview: " + getAssociationOverview());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getPingStatus() == null) ? 0 : getPingStatus().hashCode());
        hashCode = prime * hashCode + ((getLastPingDateTime() == null) ? 0 : getLastPingDateTime().hashCode());
        hashCode = prime * hashCode + ((getAgentVersion() == null) ? 0 : getAgentVersion().hashCode());
        hashCode = prime * hashCode + ((getIsLatestVersion() == null) ? 0 : getIsLatestVersion().hashCode());
        hashCode = prime * hashCode + ((getPlatformType() == null) ? 0 : getPlatformType().hashCode());
        hashCode = prime * hashCode + ((getPlatformName() == null) ? 0 : getPlatformName().hashCode());
        hashCode = prime * hashCode + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode + ((getActivationId() == null) ? 0 : getActivationId().hashCode());
        hashCode = prime * hashCode + ((getIamRole() == null) ? 0 : getIamRole().hashCode());
        hashCode = prime * hashCode + ((getRegistrationDate() == null) ? 0 : getRegistrationDate().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIPAddress() == null) ? 0 : getIPAddress().hashCode());
        hashCode = prime * hashCode + ((getComputerName() == null) ? 0 : getComputerName().hashCode());
        hashCode = prime * hashCode + ((getAssociationStatus() == null) ? 0 : getAssociationStatus().hashCode());
        hashCode = prime * hashCode + ((getLastAssociationExecutionDate() == null) ? 0 : getLastAssociationExecutionDate().hashCode());
        hashCode = prime * hashCode + ((getLastSuccessfulAssociationExecutionDate() == null) ? 0 : getLastSuccessfulAssociationExecutionDate().hashCode());
        hashCode = prime * hashCode + ((getAssociationOverview() == null) ? 0 : getAssociationOverview().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstanceInformation == false) return false;
        InstanceInformation other = (InstanceInformation)obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false;
        if (other.getPingStatus() == null ^ this.getPingStatus() == null) return false;
        if (other.getPingStatus() != null && other.getPingStatus().equals(this.getPingStatus()) == false) return false;
        if (other.getLastPingDateTime() == null ^ this.getLastPingDateTime() == null) return false;
        if (other.getLastPingDateTime() != null && other.getLastPingDateTime().equals(this.getLastPingDateTime()) == false) return false;
        if (other.getAgentVersion() == null ^ this.getAgentVersion() == null) return false;
        if (other.getAgentVersion() != null && other.getAgentVersion().equals(this.getAgentVersion()) == false) return false;
        if (other.getIsLatestVersion() == null ^ this.getIsLatestVersion() == null) return false;
        if (other.getIsLatestVersion() != null && other.getIsLatestVersion().equals(this.getIsLatestVersion()) == false) return false;
        if (other.getPlatformType() == null ^ this.getPlatformType() == null) return false;
        if (other.getPlatformType() != null && other.getPlatformType().equals(this.getPlatformType()) == false) return false;
        if (other.getPlatformName() == null ^ this.getPlatformName() == null) return false;
        if (other.getPlatformName() != null && other.getPlatformName().equals(this.getPlatformName()) == false) return false;
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null) return false;
        if (other.getPlatformVersion() != null && other.getPlatformVersion().equals(this.getPlatformVersion()) == false) return false;
        if (other.getActivationId() == null ^ this.getActivationId() == null) return false;
        if (other.getActivationId() != null && other.getActivationId().equals(this.getActivationId()) == false) return false;
        if (other.getIamRole() == null ^ this.getIamRole() == null) return false;
        if (other.getIamRole() != null && other.getIamRole().equals(this.getIamRole()) == false) return false;
        if (other.getRegistrationDate() == null ^ this.getRegistrationDate() == null) return false;
        if (other.getRegistrationDate() != null && other.getRegistrationDate().equals(this.getRegistrationDate()) == false) return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null) return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false) return false;
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getIPAddress() == null ^ this.getIPAddress() == null) return false;
        if (other.getIPAddress() != null && other.getIPAddress().equals(this.getIPAddress()) == false) return false;
        if (other.getComputerName() == null ^ this.getComputerName() == null) return false;
        if (other.getComputerName() != null && other.getComputerName().equals(this.getComputerName()) == false) return false;
        if (other.getAssociationStatus() == null ^ this.getAssociationStatus() == null) return false;
        if (other.getAssociationStatus() != null && other.getAssociationStatus().equals(this.getAssociationStatus()) == false) return false;
        if (other.getLastAssociationExecutionDate() == null ^ this.getLastAssociationExecutionDate() == null) return false;
        if (other.getLastAssociationExecutionDate() != null && other.getLastAssociationExecutionDate().equals(this.getLastAssociationExecutionDate()) == false) return false;
        if (other.getLastSuccessfulAssociationExecutionDate() == null ^ this.getLastSuccessfulAssociationExecutionDate() == null) return false;
        if (other.getLastSuccessfulAssociationExecutionDate() != null && other.getLastSuccessfulAssociationExecutionDate().equals(this.getLastSuccessfulAssociationExecutionDate()) == false) return false;
        if (other.getAssociationOverview() == null ^ this.getAssociationOverview() == null) return false;
        if (other.getAssociationOverview() != null && other.getAssociationOverview().equals(this.getAssociationOverview()) == false) return false;
        return true;
    }
}
