/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a launch configuration.
 * </p>
 */
public class LaunchConfiguration implements Serializable {
    /**
     * <p>
     * The name of the launch configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String launchConfigurationName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the launch configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String launchConfigurationARN;

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String imageId;

    /**
     * <p>
     * The name of the key pair.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String keyName;

    /**
     * <p>
     * The security groups to associate with the instances.
     * </p>
     */
    private java.util.List<String> securityGroups = new java.util.ArrayList<String>();

    /**
     * <p>
     * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances
     * to. This parameter can only be used if you are launching EC2-Classic
     * instances. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     * >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String classicLinkVPCId;

    /**
     * <p>
     * The IDs of one or more security groups for the VPC specified in
     * <code>ClassicLinkVPCId</code>. This parameter is required if you specify
     * a ClassicLink-enabled VPC, and cannot be used otherwise. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     * >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private java.util.List<String> classicLinkVPCSecurityGroups = new java.util.ArrayList<String>();

    /**
     * <p>
     * The user data available to the instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 21847<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String userData;

    /**
     * <p>
     * The instance type for the instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String instanceType;

    /**
     * <p>
     * The ID of the kernel associated with the AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String kernelId;

    /**
     * <p>
     * The ID of the RAM disk associated with the AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String ramdiskId;

    /**
     * <p>
     * A block device mapping, which specifies the block devices for the
     * instance.
     * </p>
     */
    private java.util.List<BlockDeviceMapping> blockDeviceMappings = new java.util.ArrayList<BlockDeviceMapping>();

    /**
     * <p>
     * Controls whether instances in this group are launched with detailed (
     * <code>true</code>) or basic (<code>false</code>) monitoring.
     * </p>
     */
    private InstanceMonitoring instanceMonitoring;

    /**
     * <p>
     * The price to bid when launching Spot Instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String spotPrice;

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the instance profile associated
     * with the IAM role for the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String iamInstanceProfile;

    /**
     * <p>
     * The creation date and time for the launch configuration.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * Controls whether the instance is optimized for EBS I/O (<code>true</code>
     * ) or not (<code>false</code>).
     * </p>
     */
    private Boolean ebsOptimized;

    /**
     * <p>
     * [EC2-VPC] Indicates whether to assign a public IP address to each
     * instance.
     * </p>
     */
    private Boolean associatePublicIpAddress;

    /**
     * <p>
     * The tenancy of the instance, either <code>default</code> or
     * <code>dedicated</code>. An instance with <code>dedicated</code> tenancy
     * runs in an isolated, single-tenant hardware and can only be launched into
     * a VPC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String placementTenancy;

    /**
     * <p>
     * The name of the launch configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the launch configuration.
     *         </p>
     */
    public String getLaunchConfigurationName() {
        return launchConfigurationName;
    }

    /**
     * <p>
     * The name of the launch configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param launchConfigurationName <p>
     *            The name of the launch configuration.
     *            </p>
     */
    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }

    /**
     * <p>
     * The name of the launch configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param launchConfigurationName <p>
     *            The name of the launch configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchConfiguration withLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the launch configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the launch configuration.
     *         </p>
     */
    public String getLaunchConfigurationARN() {
        return launchConfigurationARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the launch configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param launchConfigurationARN <p>
     *            The Amazon Resource Name (ARN) of the launch configuration.
     *            </p>
     */
    public void setLaunchConfigurationARN(String launchConfigurationARN) {
        this.launchConfigurationARN = launchConfigurationARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the launch configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param launchConfigurationARN <p>
     *            The Amazon Resource Name (ARN) of the launch configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchConfiguration withLaunchConfigurationARN(String launchConfigurationARN) {
        this.launchConfigurationARN = launchConfigurationARN;
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The ID of the Amazon Machine Image (AMI).
     *         </p>
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param imageId <p>
     *            The ID of the Amazon Machine Image (AMI).
     *            </p>
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param imageId <p>
     *            The ID of the Amazon Machine Image (AMI).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchConfiguration withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * <p>
     * The name of the key pair.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the key pair.
     *         </p>
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * <p>
     * The name of the key pair.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param keyName <p>
     *            The name of the key pair.
     *            </p>
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The name of the key pair.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param keyName <p>
     *            The name of the key pair.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchConfiguration withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * <p>
     * The security groups to associate with the instances.
     * </p>
     *
     * @return <p>
     *         The security groups to associate with the instances.
     *         </p>
     */
    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * The security groups to associate with the instances.
     * </p>
     *
     * @param securityGroups <p>
     *            The security groups to associate with the instances.
     *            </p>
     */
    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<String>(securityGroups);
    }

    /**
     * <p>
     * The security groups to associate with the instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            The security groups to associate with the instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchConfiguration withSecurityGroups(String... securityGroups) {
        if (getSecurityGroups() == null) {
            this.securityGroups = new java.util.ArrayList<String>(securityGroups.length);
        }
        for (String value : securityGroups) {
            this.securityGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The security groups to associate with the instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            The security groups to associate with the instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchConfiguration withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances
     * to. This parameter can only be used if you are launching EC2-Classic
     * instances. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     * >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The ID of a ClassicLink-enabled VPC to link your EC2-Classic
     *         instances to. This parameter can only be used if you are
     *         launching EC2-Classic instances. For more information, see <a
     *         href=
     *         "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     *         >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     *         </p>
     */
    public String getClassicLinkVPCId() {
        return classicLinkVPCId;
    }

    /**
     * <p>
     * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances
     * to. This parameter can only be used if you are launching EC2-Classic
     * instances. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     * >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param classicLinkVPCId <p>
     *            The ID of a ClassicLink-enabled VPC to link your EC2-Classic
     *            instances to. This parameter can only be used if you are
     *            launching EC2-Classic instances. For more information, see <a
     *            href=
     *            "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     *            >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User
     *            Guide</i>.
     *            </p>
     */
    public void setClassicLinkVPCId(String classicLinkVPCId) {
        this.classicLinkVPCId = classicLinkVPCId;
    }

    /**
     * <p>
     * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances
     * to. This parameter can only be used if you are launching EC2-Classic
     * instances. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     * >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param classicLinkVPCId <p>
     *            The ID of a ClassicLink-enabled VPC to link your EC2-Classic
     *            instances to. This parameter can only be used if you are
     *            launching EC2-Classic instances. For more information, see <a
     *            href=
     *            "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     *            >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchConfiguration withClassicLinkVPCId(String classicLinkVPCId) {
        this.classicLinkVPCId = classicLinkVPCId;
        return this;
    }

    /**
     * <p>
     * The IDs of one or more security groups for the VPC specified in
     * <code>ClassicLinkVPCId</code>. This parameter is required if you specify
     * a ClassicLink-enabled VPC, and cannot be used otherwise. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     * >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     *
     * @return <p>
     *         The IDs of one or more security groups for the VPC specified in
     *         <code>ClassicLinkVPCId</code>. This parameter is required if you
     *         specify a ClassicLink-enabled VPC, and cannot be used otherwise.
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     *         >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     *         </p>
     */
    public java.util.List<String> getClassicLinkVPCSecurityGroups() {
        return classicLinkVPCSecurityGroups;
    }

    /**
     * <p>
     * The IDs of one or more security groups for the VPC specified in
     * <code>ClassicLinkVPCId</code>. This parameter is required if you specify
     * a ClassicLink-enabled VPC, and cannot be used otherwise. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     * >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     *
     * @param classicLinkVPCSecurityGroups <p>
     *            The IDs of one or more security groups for the VPC specified
     *            in <code>ClassicLinkVPCId</code>. This parameter is required
     *            if you specify a ClassicLink-enabled VPC, and cannot be used
     *            otherwise. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     *            >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User
     *            Guide</i>.
     *            </p>
     */
    public void setClassicLinkVPCSecurityGroups(
            java.util.Collection<String> classicLinkVPCSecurityGroups) {
        if (classicLinkVPCSecurityGroups == null) {
            this.classicLinkVPCSecurityGroups = null;
            return;
        }

        this.classicLinkVPCSecurityGroups = new java.util.ArrayList<String>(
                classicLinkVPCSecurityGroups);
    }

    /**
     * <p>
     * The IDs of one or more security groups for the VPC specified in
     * <code>ClassicLinkVPCId</code>. This parameter is required if you specify
     * a ClassicLink-enabled VPC, and cannot be used otherwise. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     * >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param classicLinkVPCSecurityGroups <p>
     *            The IDs of one or more security groups for the VPC specified
     *            in <code>ClassicLinkVPCId</code>. This parameter is required
     *            if you specify a ClassicLink-enabled VPC, and cannot be used
     *            otherwise. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     *            >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchConfiguration withClassicLinkVPCSecurityGroups(
            String... classicLinkVPCSecurityGroups) {
        if (getClassicLinkVPCSecurityGroups() == null) {
            this.classicLinkVPCSecurityGroups = new java.util.ArrayList<String>(
                    classicLinkVPCSecurityGroups.length);
        }
        for (String value : classicLinkVPCSecurityGroups) {
            this.classicLinkVPCSecurityGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of one or more security groups for the VPC specified in
     * <code>ClassicLinkVPCId</code>. This parameter is required if you specify
     * a ClassicLink-enabled VPC, and cannot be used otherwise. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     * >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param classicLinkVPCSecurityGroups <p>
     *            The IDs of one or more security groups for the VPC specified
     *            in <code>ClassicLinkVPCId</code>. This parameter is required
     *            if you specify a ClassicLink-enabled VPC, and cannot be used
     *            otherwise. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     *            >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchConfiguration withClassicLinkVPCSecurityGroups(
            java.util.Collection<String> classicLinkVPCSecurityGroups) {
        setClassicLinkVPCSecurityGroups(classicLinkVPCSecurityGroups);
        return this;
    }

    /**
     * <p>
     * The user data available to the instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 21847<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The user data available to the instances.
     *         </p>
     */
    public String getUserData() {
        return userData;
    }

    /**
     * <p>
     * The user data available to the instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 21847<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param userData <p>
     *            The user data available to the instances.
     *            </p>
     */
    public void setUserData(String userData) {
        this.userData = userData;
    }

    /**
     * <p>
     * The user data available to the instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 21847<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param userData <p>
     *            The user data available to the instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchConfiguration withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * <p>
     * The instance type for the instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The instance type for the instances.
     *         </p>
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The instance type for the instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param instanceType <p>
     *            The instance type for the instances.
     *            </p>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type for the instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param instanceType <p>
     *            The instance type for the instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchConfiguration withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The ID of the kernel associated with the AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The ID of the kernel associated with the AMI.
     *         </p>
     */
    public String getKernelId() {
        return kernelId;
    }

    /**
     * <p>
     * The ID of the kernel associated with the AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param kernelId <p>
     *            The ID of the kernel associated with the AMI.
     *            </p>
     */
    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }

    /**
     * <p>
     * The ID of the kernel associated with the AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param kernelId <p>
     *            The ID of the kernel associated with the AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchConfiguration withKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    /**
     * <p>
     * The ID of the RAM disk associated with the AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The ID of the RAM disk associated with the AMI.
     *         </p>
     */
    public String getRamdiskId() {
        return ramdiskId;
    }

    /**
     * <p>
     * The ID of the RAM disk associated with the AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param ramdiskId <p>
     *            The ID of the RAM disk associated with the AMI.
     *            </p>
     */
    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }

    /**
     * <p>
     * The ID of the RAM disk associated with the AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param ramdiskId <p>
     *            The ID of the RAM disk associated with the AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchConfiguration withRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
        return this;
    }

    /**
     * <p>
     * A block device mapping, which specifies the block devices for the
     * instance.
     * </p>
     *
     * @return <p>
     *         A block device mapping, which specifies the block devices for the
     *         instance.
     *         </p>
     */
    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        return blockDeviceMappings;
    }

    /**
     * <p>
     * A block device mapping, which specifies the block devices for the
     * instance.
     * </p>
     *
     * @param blockDeviceMappings <p>
     *            A block device mapping, which specifies the block devices for
     *            the instance.
     *            </p>
     */
    public void setBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }

        this.blockDeviceMappings = new java.util.ArrayList<BlockDeviceMapping>(blockDeviceMappings);
    }

    /**
     * <p>
     * A block device mapping, which specifies the block devices for the
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockDeviceMappings <p>
     *            A block device mapping, which specifies the block devices for
     *            the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchConfiguration withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
        if (getBlockDeviceMappings() == null) {
            this.blockDeviceMappings = new java.util.ArrayList<BlockDeviceMapping>(
                    blockDeviceMappings.length);
        }
        for (BlockDeviceMapping value : blockDeviceMappings) {
            this.blockDeviceMappings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A block device mapping, which specifies the block devices for the
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockDeviceMappings <p>
     *            A block device mapping, which specifies the block devices for
     *            the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchConfiguration withBlockDeviceMappings(
            java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * Controls whether instances in this group are launched with detailed (
     * <code>true</code>) or basic (<code>false</code>) monitoring.
     * </p>
     *
     * @return <p>
     *         Controls whether instances in this group are launched with
     *         detailed (<code>true</code>) or basic (<code>false</code>)
     *         monitoring.
     *         </p>
     */
    public InstanceMonitoring getInstanceMonitoring() {
        return instanceMonitoring;
    }

    /**
     * <p>
     * Controls whether instances in this group are launched with detailed (
     * <code>true</code>) or basic (<code>false</code>) monitoring.
     * </p>
     *
     * @param instanceMonitoring <p>
     *            Controls whether instances in this group are launched with
     *            detailed (<code>true</code>) or basic (<code>false</code>)
     *            monitoring.
     *            </p>
     */
    public void setInstanceMonitoring(InstanceMonitoring instanceMonitoring) {
        this.instanceMonitoring = instanceMonitoring;
    }

    /**
     * <p>
     * Controls whether instances in this group are launched with detailed (
     * <code>true</code>) or basic (<code>false</code>) monitoring.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceMonitoring <p>
     *            Controls whether instances in this group are launched with
     *            detailed (<code>true</code>) or basic (<code>false</code>)
     *            monitoring.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchConfiguration withInstanceMonitoring(InstanceMonitoring instanceMonitoring) {
        this.instanceMonitoring = instanceMonitoring;
        return this;
    }

    /**
     * <p>
     * The price to bid when launching Spot Instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The price to bid when launching Spot Instances.
     *         </p>
     */
    public String getSpotPrice() {
        return spotPrice;
    }

    /**
     * <p>
     * The price to bid when launching Spot Instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param spotPrice <p>
     *            The price to bid when launching Spot Instances.
     *            </p>
     */
    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }

    /**
     * <p>
     * The price to bid when launching Spot Instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param spotPrice <p>
     *            The price to bid when launching Spot Instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchConfiguration withSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the instance profile associated
     * with the IAM role for the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name or Amazon Resource Name (ARN) of the instance profile
     *         associated with the IAM role for the instance.
     *         </p>
     */
    public String getIamInstanceProfile() {
        return iamInstanceProfile;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the instance profile associated
     * with the IAM role for the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param iamInstanceProfile <p>
     *            The name or Amazon Resource Name (ARN) of the instance profile
     *            associated with the IAM role for the instance.
     *            </p>
     */
    public void setIamInstanceProfile(String iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the instance profile associated
     * with the IAM role for the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param iamInstanceProfile <p>
     *            The name or Amazon Resource Name (ARN) of the instance profile
     *            associated with the IAM role for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchConfiguration withIamInstanceProfile(String iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
        return this;
    }

    /**
     * <p>
     * The creation date and time for the launch configuration.
     * </p>
     *
     * @return <p>
     *         The creation date and time for the launch configuration.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * The creation date and time for the launch configuration.
     * </p>
     *
     * @param createdTime <p>
     *            The creation date and time for the launch configuration.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The creation date and time for the launch configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            The creation date and time for the launch configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchConfiguration withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * <p>
     * Controls whether the instance is optimized for EBS I/O (<code>true</code>
     * ) or not (<code>false</code>).
     * </p>
     *
     * @return <p>
     *         Controls whether the instance is optimized for EBS I/O (
     *         <code>true</code>) or not (<code>false</code>).
     *         </p>
     */
    public Boolean isEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * <p>
     * Controls whether the instance is optimized for EBS I/O (<code>true</code>
     * ) or not (<code>false</code>).
     * </p>
     *
     * @return <p>
     *         Controls whether the instance is optimized for EBS I/O (
     *         <code>true</code>) or not (<code>false</code>).
     *         </p>
     */
    public Boolean getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * <p>
     * Controls whether the instance is optimized for EBS I/O (<code>true</code>
     * ) or not (<code>false</code>).
     * </p>
     *
     * @param ebsOptimized <p>
     *            Controls whether the instance is optimized for EBS I/O (
     *            <code>true</code>) or not (<code>false</code>).
     *            </p>
     */
    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * <p>
     * Controls whether the instance is optimized for EBS I/O (<code>true</code>
     * ) or not (<code>false</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ebsOptimized <p>
     *            Controls whether the instance is optimized for EBS I/O (
     *            <code>true</code>) or not (<code>false</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchConfiguration withEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] Indicates whether to assign a public IP address to each
     * instance.
     * </p>
     *
     * @return <p>
     *         [EC2-VPC] Indicates whether to assign a public IP address to each
     *         instance.
     *         </p>
     */
    public Boolean isAssociatePublicIpAddress() {
        return associatePublicIpAddress;
    }

    /**
     * <p>
     * [EC2-VPC] Indicates whether to assign a public IP address to each
     * instance.
     * </p>
     *
     * @return <p>
     *         [EC2-VPC] Indicates whether to assign a public IP address to each
     *         instance.
     *         </p>
     */
    public Boolean getAssociatePublicIpAddress() {
        return associatePublicIpAddress;
    }

    /**
     * <p>
     * [EC2-VPC] Indicates whether to assign a public IP address to each
     * instance.
     * </p>
     *
     * @param associatePublicIpAddress <p>
     *            [EC2-VPC] Indicates whether to assign a public IP address to
     *            each instance.
     *            </p>
     */
    public void setAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
    }

    /**
     * <p>
     * [EC2-VPC] Indicates whether to assign a public IP address to each
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associatePublicIpAddress <p>
     *            [EC2-VPC] Indicates whether to assign a public IP address to
     *            each instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchConfiguration withAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
        return this;
    }

    /**
     * <p>
     * The tenancy of the instance, either <code>default</code> or
     * <code>dedicated</code>. An instance with <code>dedicated</code> tenancy
     * runs in an isolated, single-tenant hardware and can only be launched into
     * a VPC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The tenancy of the instance, either <code>default</code> or
     *         <code>dedicated</code>. An instance with <code>dedicated</code>
     *         tenancy runs in an isolated, single-tenant hardware and can only
     *         be launched into a VPC.
     *         </p>
     */
    public String getPlacementTenancy() {
        return placementTenancy;
    }

    /**
     * <p>
     * The tenancy of the instance, either <code>default</code> or
     * <code>dedicated</code>. An instance with <code>dedicated</code> tenancy
     * runs in an isolated, single-tenant hardware and can only be launched into
     * a VPC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param placementTenancy <p>
     *            The tenancy of the instance, either <code>default</code> or
     *            <code>dedicated</code>. An instance with
     *            <code>dedicated</code> tenancy runs in an isolated,
     *            single-tenant hardware and can only be launched into a VPC.
     *            </p>
     */
    public void setPlacementTenancy(String placementTenancy) {
        this.placementTenancy = placementTenancy;
    }

    /**
     * <p>
     * The tenancy of the instance, either <code>default</code> or
     * <code>dedicated</code>. An instance with <code>dedicated</code> tenancy
     * runs in an isolated, single-tenant hardware and can only be launched into
     * a VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param placementTenancy <p>
     *            The tenancy of the instance, either <code>default</code> or
     *            <code>dedicated</code>. An instance with
     *            <code>dedicated</code> tenancy runs in an isolated,
     *            single-tenant hardware and can only be launched into a VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchConfiguration withPlacementTenancy(String placementTenancy) {
        this.placementTenancy = placementTenancy;
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
        if (getLaunchConfigurationName() != null)
            sb.append("LaunchConfigurationName: " + getLaunchConfigurationName() + ",");
        if (getLaunchConfigurationARN() != null)
            sb.append("LaunchConfigurationARN: " + getLaunchConfigurationARN() + ",");
        if (getImageId() != null)
            sb.append("ImageId: " + getImageId() + ",");
        if (getKeyName() != null)
            sb.append("KeyName: " + getKeyName() + ",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: " + getSecurityGroups() + ",");
        if (getClassicLinkVPCId() != null)
            sb.append("ClassicLinkVPCId: " + getClassicLinkVPCId() + ",");
        if (getClassicLinkVPCSecurityGroups() != null)
            sb.append("ClassicLinkVPCSecurityGroups: " + getClassicLinkVPCSecurityGroups() + ",");
        if (getUserData() != null)
            sb.append("UserData: " + getUserData() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getKernelId() != null)
            sb.append("KernelId: " + getKernelId() + ",");
        if (getRamdiskId() != null)
            sb.append("RamdiskId: " + getRamdiskId() + ",");
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (getInstanceMonitoring() != null)
            sb.append("InstanceMonitoring: " + getInstanceMonitoring() + ",");
        if (getSpotPrice() != null)
            sb.append("SpotPrice: " + getSpotPrice() + ",");
        if (getIamInstanceProfile() != null)
            sb.append("IamInstanceProfile: " + getIamInstanceProfile() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: " + getEbsOptimized() + ",");
        if (getAssociatePublicIpAddress() != null)
            sb.append("AssociatePublicIpAddress: " + getAssociatePublicIpAddress() + ",");
        if (getPlacementTenancy() != null)
            sb.append("PlacementTenancy: " + getPlacementTenancy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getLaunchConfigurationName() == null) ? 0 : getLaunchConfigurationName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getLaunchConfigurationARN() == null) ? 0 : getLaunchConfigurationARN()
                        .hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode
                + ((getClassicLinkVPCId() == null) ? 0 : getClassicLinkVPCId().hashCode());
        hashCode = prime
                * hashCode
                + ((getClassicLinkVPCSecurityGroups() == null) ? 0
                        : getClassicLinkVPCSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode());
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode());
        hashCode = prime * hashCode
                + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceMonitoring() == null) ? 0 : getInstanceMonitoring().hashCode());
        hashCode = prime * hashCode + ((getSpotPrice() == null) ? 0 : getSpotPrice().hashCode());
        hashCode = prime * hashCode
                + ((getIamInstanceProfile() == null) ? 0 : getIamInstanceProfile().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        hashCode = prime
                * hashCode
                + ((getAssociatePublicIpAddress() == null) ? 0 : getAssociatePublicIpAddress()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPlacementTenancy() == null) ? 0 : getPlacementTenancy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchConfiguration == false)
            return false;
        LaunchConfiguration other = (LaunchConfiguration) obj;

        if (other.getLaunchConfigurationName() == null ^ this.getLaunchConfigurationName() == null)
            return false;
        if (other.getLaunchConfigurationName() != null
                && other.getLaunchConfigurationName().equals(this.getLaunchConfigurationName()) == false)
            return false;
        if (other.getLaunchConfigurationARN() == null ^ this.getLaunchConfigurationARN() == null)
            return false;
        if (other.getLaunchConfigurationARN() != null
                && other.getLaunchConfigurationARN().equals(this.getLaunchConfigurationARN()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null
                && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getClassicLinkVPCId() == null ^ this.getClassicLinkVPCId() == null)
            return false;
        if (other.getClassicLinkVPCId() != null
                && other.getClassicLinkVPCId().equals(this.getClassicLinkVPCId()) == false)
            return false;
        if (other.getClassicLinkVPCSecurityGroups() == null
                ^ this.getClassicLinkVPCSecurityGroups() == null)
            return false;
        if (other.getClassicLinkVPCSecurityGroups() != null
                && other.getClassicLinkVPCSecurityGroups().equals(
                        this.getClassicLinkVPCSecurityGroups()) == false)
            return false;
        if (other.getUserData() == null ^ this.getUserData() == null)
            return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getKernelId() == null ^ this.getKernelId() == null)
            return false;
        if (other.getKernelId() != null && other.getKernelId().equals(this.getKernelId()) == false)
            return false;
        if (other.getRamdiskId() == null ^ this.getRamdiskId() == null)
            return false;
        if (other.getRamdiskId() != null
                && other.getRamdiskId().equals(this.getRamdiskId()) == false)
            return false;
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null)
            return false;
        if (other.getBlockDeviceMappings() != null
                && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false)
            return false;
        if (other.getInstanceMonitoring() == null ^ this.getInstanceMonitoring() == null)
            return false;
        if (other.getInstanceMonitoring() != null
                && other.getInstanceMonitoring().equals(this.getInstanceMonitoring()) == false)
            return false;
        if (other.getSpotPrice() == null ^ this.getSpotPrice() == null)
            return false;
        if (other.getSpotPrice() != null
                && other.getSpotPrice().equals(this.getSpotPrice()) == false)
            return false;
        if (other.getIamInstanceProfile() == null ^ this.getIamInstanceProfile() == null)
            return false;
        if (other.getIamInstanceProfile() != null
                && other.getIamInstanceProfile().equals(this.getIamInstanceProfile()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getEbsOptimized() == null ^ this.getEbsOptimized() == null)
            return false;
        if (other.getEbsOptimized() != null
                && other.getEbsOptimized().equals(this.getEbsOptimized()) == false)
            return false;
        if (other.getAssociatePublicIpAddress() == null
                ^ this.getAssociatePublicIpAddress() == null)
            return false;
        if (other.getAssociatePublicIpAddress() != null
                && other.getAssociatePublicIpAddress().equals(this.getAssociatePublicIpAddress()) == false)
            return false;
        if (other.getPlacementTenancy() == null ^ this.getPlacementTenancy() == null)
            return false;
        if (other.getPlacementTenancy() != null
                && other.getPlacementTenancy().equals(this.getPlacementTenancy()) == false)
            return false;
        return true;
    }
}
