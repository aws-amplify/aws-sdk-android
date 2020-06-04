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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Allocates a Dedicated Host to your account. At a minimum, specify the
 * supported instance type or instance family, the Availability Zone in which to
 * allocate the host, and the number of hosts to allocate.
 * </p>
 */
public class AllocateHostsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Indicates whether the host accepts any untargeted instance launches that
     * match its instance type configuration, or if it only accepts Host tenancy
     * instance launches that specify its unique host ID. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-dedicated-hosts-work.html#dedicated-hosts-understanding"
     * > Understanding Instance Placement and Host Affinity</a> in the <i>Amazon
     * EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Default: <code>on</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     */
    private String autoPlacement;

    /**
     * <p>
     * The Availability Zone in which to allocate the Dedicated Host.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * Specifies the instance type to be supported by the Dedicated Hosts. If
     * you specify an instance type, the Dedicated Hosts support instances of
     * the specified instance type only.
     * </p>
     * <p>
     * If you want the Dedicated Hosts to support multiple instance types in a
     * specific instance family, omit this parameter and specify
     * <b>InstanceFamily</b> instead. You cannot specify <b>InstanceType</b> and
     * <b>InstanceFamily</b> in the same request.
     * </p>
     */
    private String instanceType;

    /**
     * <p>
     * Specifies the instance family to be supported by the Dedicated Hosts. If
     * you specify an instance family, the Dedicated Hosts support multiple
     * instance types within that instance family.
     * </p>
     * <p>
     * If you want the Dedicated Hosts to support a specific instance type only,
     * omit this parameter and specify <b>InstanceType</b> instead. You cannot
     * specify <b>InstanceFamily</b> and <b>InstanceType</b> in the same
     * request.
     * </p>
     */
    private String instanceFamily;

    /**
     * <p>
     * The number of Dedicated Hosts to allocate to your account with these
     * parameters.
     * </p>
     */
    private Integer quantity;

    /**
     * <p>
     * The tags to apply to the Dedicated Host during creation.
     * </p>
     */
    private java.util.List<TagSpecification> tagSpecifications;

    /**
     * <p>
     * Indicates whether to enable or disable host recovery for the Dedicated
     * Host. Host recovery is disabled by default. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"
     * > Host Recovery</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Default: <code>off</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     */
    private String hostRecovery;

    /**
     * <p>
     * Indicates whether the host accepts any untargeted instance launches that
     * match its instance type configuration, or if it only accepts Host tenancy
     * instance launches that specify its unique host ID. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-dedicated-hosts-work.html#dedicated-hosts-understanding"
     * > Understanding Instance Placement and Host Affinity</a> in the <i>Amazon
     * EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Default: <code>on</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @return <p>
     *         Indicates whether the host accepts any untargeted instance
     *         launches that match its instance type configuration, or if it
     *         only accepts Host tenancy instance launches that specify its
     *         unique host ID. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-dedicated-hosts-work.html#dedicated-hosts-understanding"
     *         > Understanding Instance Placement and Host Affinity</a> in the
     *         <i>Amazon EC2 User Guide for Linux Instances</i>.
     *         </p>
     *         <p>
     *         Default: <code>on</code>
     *         </p>
     * @see AutoPlacement
     */
    public String getAutoPlacement() {
        return autoPlacement;
    }

    /**
     * <p>
     * Indicates whether the host accepts any untargeted instance launches that
     * match its instance type configuration, or if it only accepts Host tenancy
     * instance launches that specify its unique host ID. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-dedicated-hosts-work.html#dedicated-hosts-understanding"
     * > Understanding Instance Placement and Host Affinity</a> in the <i>Amazon
     * EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Default: <code>on</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param autoPlacement <p>
     *            Indicates whether the host accepts any untargeted instance
     *            launches that match its instance type configuration, or if it
     *            only accepts Host tenancy instance launches that specify its
     *            unique host ID. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-dedicated-hosts-work.html#dedicated-hosts-understanding"
     *            > Understanding Instance Placement and Host Affinity</a> in
     *            the <i>Amazon EC2 User Guide for Linux Instances</i>.
     *            </p>
     *            <p>
     *            Default: <code>on</code>
     *            </p>
     * @see AutoPlacement
     */
    public void setAutoPlacement(String autoPlacement) {
        this.autoPlacement = autoPlacement;
    }

    /**
     * <p>
     * Indicates whether the host accepts any untargeted instance launches that
     * match its instance type configuration, or if it only accepts Host tenancy
     * instance launches that specify its unique host ID. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-dedicated-hosts-work.html#dedicated-hosts-understanding"
     * > Understanding Instance Placement and Host Affinity</a> in the <i>Amazon
     * EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Default: <code>on</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param autoPlacement <p>
     *            Indicates whether the host accepts any untargeted instance
     *            launches that match its instance type configuration, or if it
     *            only accepts Host tenancy instance launches that specify its
     *            unique host ID. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-dedicated-hosts-work.html#dedicated-hosts-understanding"
     *            > Understanding Instance Placement and Host Affinity</a> in
     *            the <i>Amazon EC2 User Guide for Linux Instances</i>.
     *            </p>
     *            <p>
     *            Default: <code>on</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoPlacement
     */
    public AllocateHostsRequest withAutoPlacement(String autoPlacement) {
        this.autoPlacement = autoPlacement;
        return this;
    }

    /**
     * <p>
     * Indicates whether the host accepts any untargeted instance launches that
     * match its instance type configuration, or if it only accepts Host tenancy
     * instance launches that specify its unique host ID. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-dedicated-hosts-work.html#dedicated-hosts-understanding"
     * > Understanding Instance Placement and Host Affinity</a> in the <i>Amazon
     * EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Default: <code>on</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param autoPlacement <p>
     *            Indicates whether the host accepts any untargeted instance
     *            launches that match its instance type configuration, or if it
     *            only accepts Host tenancy instance launches that specify its
     *            unique host ID. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-dedicated-hosts-work.html#dedicated-hosts-understanding"
     *            > Understanding Instance Placement and Host Affinity</a> in
     *            the <i>Amazon EC2 User Guide for Linux Instances</i>.
     *            </p>
     *            <p>
     *            Default: <code>on</code>
     *            </p>
     * @see AutoPlacement
     */
    public void setAutoPlacement(AutoPlacement autoPlacement) {
        this.autoPlacement = autoPlacement.toString();
    }

    /**
     * <p>
     * Indicates whether the host accepts any untargeted instance launches that
     * match its instance type configuration, or if it only accepts Host tenancy
     * instance launches that specify its unique host ID. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-dedicated-hosts-work.html#dedicated-hosts-understanding"
     * > Understanding Instance Placement and Host Affinity</a> in the <i>Amazon
     * EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Default: <code>on</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param autoPlacement <p>
     *            Indicates whether the host accepts any untargeted instance
     *            launches that match its instance type configuration, or if it
     *            only accepts Host tenancy instance launches that specify its
     *            unique host ID. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-dedicated-hosts-work.html#dedicated-hosts-understanding"
     *            > Understanding Instance Placement and Host Affinity</a> in
     *            the <i>Amazon EC2 User Guide for Linux Instances</i>.
     *            </p>
     *            <p>
     *            Default: <code>on</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoPlacement
     */
    public AllocateHostsRequest withAutoPlacement(AutoPlacement autoPlacement) {
        this.autoPlacement = autoPlacement.toString();
        return this;
    }

    /**
     * <p>
     * The Availability Zone in which to allocate the Dedicated Host.
     * </p>
     *
     * @return <p>
     *         The Availability Zone in which to allocate the Dedicated Host.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which to allocate the Dedicated Host.
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone in which to allocate the Dedicated Host.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which to allocate the Dedicated Host.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone in which to allocate the Dedicated Host.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateHostsRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     *
     * @return <p>
     *         Unique, case-sensitive identifier that you provide to ensure the
     *         idempotency of the request. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *         >How to Ensure Idempotency</a>.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >How to Ensure Idempotency</a>.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >How to Ensure Idempotency</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >How to Ensure Idempotency</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateHostsRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * Specifies the instance type to be supported by the Dedicated Hosts. If
     * you specify an instance type, the Dedicated Hosts support instances of
     * the specified instance type only.
     * </p>
     * <p>
     * If you want the Dedicated Hosts to support multiple instance types in a
     * specific instance family, omit this parameter and specify
     * <b>InstanceFamily</b> instead. You cannot specify <b>InstanceType</b> and
     * <b>InstanceFamily</b> in the same request.
     * </p>
     *
     * @return <p>
     *         Specifies the instance type to be supported by the Dedicated
     *         Hosts. If you specify an instance type, the Dedicated Hosts
     *         support instances of the specified instance type only.
     *         </p>
     *         <p>
     *         If you want the Dedicated Hosts to support multiple instance
     *         types in a specific instance family, omit this parameter and
     *         specify <b>InstanceFamily</b> instead. You cannot specify
     *         <b>InstanceType</b> and <b>InstanceFamily</b> in the same
     *         request.
     *         </p>
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * Specifies the instance type to be supported by the Dedicated Hosts. If
     * you specify an instance type, the Dedicated Hosts support instances of
     * the specified instance type only.
     * </p>
     * <p>
     * If you want the Dedicated Hosts to support multiple instance types in a
     * specific instance family, omit this parameter and specify
     * <b>InstanceFamily</b> instead. You cannot specify <b>InstanceType</b> and
     * <b>InstanceFamily</b> in the same request.
     * </p>
     *
     * @param instanceType <p>
     *            Specifies the instance type to be supported by the Dedicated
     *            Hosts. If you specify an instance type, the Dedicated Hosts
     *            support instances of the specified instance type only.
     *            </p>
     *            <p>
     *            If you want the Dedicated Hosts to support multiple instance
     *            types in a specific instance family, omit this parameter and
     *            specify <b>InstanceFamily</b> instead. You cannot specify
     *            <b>InstanceType</b> and <b>InstanceFamily</b> in the same
     *            request.
     *            </p>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * Specifies the instance type to be supported by the Dedicated Hosts. If
     * you specify an instance type, the Dedicated Hosts support instances of
     * the specified instance type only.
     * </p>
     * <p>
     * If you want the Dedicated Hosts to support multiple instance types in a
     * specific instance family, omit this parameter and specify
     * <b>InstanceFamily</b> instead. You cannot specify <b>InstanceType</b> and
     * <b>InstanceFamily</b> in the same request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceType <p>
     *            Specifies the instance type to be supported by the Dedicated
     *            Hosts. If you specify an instance type, the Dedicated Hosts
     *            support instances of the specified instance type only.
     *            </p>
     *            <p>
     *            If you want the Dedicated Hosts to support multiple instance
     *            types in a specific instance family, omit this parameter and
     *            specify <b>InstanceFamily</b> instead. You cannot specify
     *            <b>InstanceType</b> and <b>InstanceFamily</b> in the same
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateHostsRequest withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * Specifies the instance family to be supported by the Dedicated Hosts. If
     * you specify an instance family, the Dedicated Hosts support multiple
     * instance types within that instance family.
     * </p>
     * <p>
     * If you want the Dedicated Hosts to support a specific instance type only,
     * omit this parameter and specify <b>InstanceType</b> instead. You cannot
     * specify <b>InstanceFamily</b> and <b>InstanceType</b> in the same
     * request.
     * </p>
     *
     * @return <p>
     *         Specifies the instance family to be supported by the Dedicated
     *         Hosts. If you specify an instance family, the Dedicated Hosts
     *         support multiple instance types within that instance family.
     *         </p>
     *         <p>
     *         If you want the Dedicated Hosts to support a specific instance
     *         type only, omit this parameter and specify <b>InstanceType</b>
     *         instead. You cannot specify <b>InstanceFamily</b> and
     *         <b>InstanceType</b> in the same request.
     *         </p>
     */
    public String getInstanceFamily() {
        return instanceFamily;
    }

    /**
     * <p>
     * Specifies the instance family to be supported by the Dedicated Hosts. If
     * you specify an instance family, the Dedicated Hosts support multiple
     * instance types within that instance family.
     * </p>
     * <p>
     * If you want the Dedicated Hosts to support a specific instance type only,
     * omit this parameter and specify <b>InstanceType</b> instead. You cannot
     * specify <b>InstanceFamily</b> and <b>InstanceType</b> in the same
     * request.
     * </p>
     *
     * @param instanceFamily <p>
     *            Specifies the instance family to be supported by the Dedicated
     *            Hosts. If you specify an instance family, the Dedicated Hosts
     *            support multiple instance types within that instance family.
     *            </p>
     *            <p>
     *            If you want the Dedicated Hosts to support a specific instance
     *            type only, omit this parameter and specify <b>InstanceType</b>
     *            instead. You cannot specify <b>InstanceFamily</b> and
     *            <b>InstanceType</b> in the same request.
     *            </p>
     */
    public void setInstanceFamily(String instanceFamily) {
        this.instanceFamily = instanceFamily;
    }

    /**
     * <p>
     * Specifies the instance family to be supported by the Dedicated Hosts. If
     * you specify an instance family, the Dedicated Hosts support multiple
     * instance types within that instance family.
     * </p>
     * <p>
     * If you want the Dedicated Hosts to support a specific instance type only,
     * omit this parameter and specify <b>InstanceType</b> instead. You cannot
     * specify <b>InstanceFamily</b> and <b>InstanceType</b> in the same
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceFamily <p>
     *            Specifies the instance family to be supported by the Dedicated
     *            Hosts. If you specify an instance family, the Dedicated Hosts
     *            support multiple instance types within that instance family.
     *            </p>
     *            <p>
     *            If you want the Dedicated Hosts to support a specific instance
     *            type only, omit this parameter and specify <b>InstanceType</b>
     *            instead. You cannot specify <b>InstanceFamily</b> and
     *            <b>InstanceType</b> in the same request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateHostsRequest withInstanceFamily(String instanceFamily) {
        this.instanceFamily = instanceFamily;
        return this;
    }

    /**
     * <p>
     * The number of Dedicated Hosts to allocate to your account with these
     * parameters.
     * </p>
     *
     * @return <p>
     *         The number of Dedicated Hosts to allocate to your account with
     *         these parameters.
     *         </p>
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * <p>
     * The number of Dedicated Hosts to allocate to your account with these
     * parameters.
     * </p>
     *
     * @param quantity <p>
     *            The number of Dedicated Hosts to allocate to your account with
     *            these parameters.
     *            </p>
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of Dedicated Hosts to allocate to your account with these
     * parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quantity <p>
     *            The number of Dedicated Hosts to allocate to your account with
     *            these parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateHostsRequest withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * <p>
     * The tags to apply to the Dedicated Host during creation.
     * </p>
     *
     * @return <p>
     *         The tags to apply to the Dedicated Host during creation.
     *         </p>
     */
    public java.util.List<TagSpecification> getTagSpecifications() {
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the Dedicated Host during creation.
     * </p>
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the Dedicated Host during creation.
     *            </p>
     */
    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new java.util.ArrayList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply to the Dedicated Host during creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the Dedicated Host during creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateHostsRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (getTagSpecifications() == null) {
            this.tagSpecifications = new java.util.ArrayList<TagSpecification>(
                    tagSpecifications.length);
        }
        for (TagSpecification value : tagSpecifications) {
            this.tagSpecifications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the Dedicated Host during creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the Dedicated Host during creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateHostsRequest withTagSpecifications(
            java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * Indicates whether to enable or disable host recovery for the Dedicated
     * Host. Host recovery is disabled by default. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"
     * > Host Recovery</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Default: <code>off</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @return <p>
     *         Indicates whether to enable or disable host recovery for the
     *         Dedicated Host. Host recovery is disabled by default. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"
     *         > Host Recovery</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     *         </p>
     *         <p>
     *         Default: <code>off</code>
     *         </p>
     * @see HostRecovery
     */
    public String getHostRecovery() {
        return hostRecovery;
    }

    /**
     * <p>
     * Indicates whether to enable or disable host recovery for the Dedicated
     * Host. Host recovery is disabled by default. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"
     * > Host Recovery</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Default: <code>off</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param hostRecovery <p>
     *            Indicates whether to enable or disable host recovery for the
     *            Dedicated Host. Host recovery is disabled by default. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"
     *            > Host Recovery</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     *            <p>
     *            Default: <code>off</code>
     *            </p>
     * @see HostRecovery
     */
    public void setHostRecovery(String hostRecovery) {
        this.hostRecovery = hostRecovery;
    }

    /**
     * <p>
     * Indicates whether to enable or disable host recovery for the Dedicated
     * Host. Host recovery is disabled by default. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"
     * > Host Recovery</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Default: <code>off</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param hostRecovery <p>
     *            Indicates whether to enable or disable host recovery for the
     *            Dedicated Host. Host recovery is disabled by default. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"
     *            > Host Recovery</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     *            <p>
     *            Default: <code>off</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HostRecovery
     */
    public AllocateHostsRequest withHostRecovery(String hostRecovery) {
        this.hostRecovery = hostRecovery;
        return this;
    }

    /**
     * <p>
     * Indicates whether to enable or disable host recovery for the Dedicated
     * Host. Host recovery is disabled by default. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"
     * > Host Recovery</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Default: <code>off</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param hostRecovery <p>
     *            Indicates whether to enable or disable host recovery for the
     *            Dedicated Host. Host recovery is disabled by default. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"
     *            > Host Recovery</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     *            <p>
     *            Default: <code>off</code>
     *            </p>
     * @see HostRecovery
     */
    public void setHostRecovery(HostRecovery hostRecovery) {
        this.hostRecovery = hostRecovery.toString();
    }

    /**
     * <p>
     * Indicates whether to enable or disable host recovery for the Dedicated
     * Host. Host recovery is disabled by default. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"
     * > Host Recovery</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * Default: <code>off</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>on, off
     *
     * @param hostRecovery <p>
     *            Indicates whether to enable or disable host recovery for the
     *            Dedicated Host. Host recovery is disabled by default. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html"
     *            > Host Recovery</a> in the <i>Amazon Elastic Compute Cloud
     *            User Guide</i>.
     *            </p>
     *            <p>
     *            Default: <code>off</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HostRecovery
     */
    public AllocateHostsRequest withHostRecovery(HostRecovery hostRecovery) {
        this.hostRecovery = hostRecovery.toString();
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
        if (getAutoPlacement() != null)
            sb.append("AutoPlacement: " + getAutoPlacement() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getInstanceFamily() != null)
            sb.append("InstanceFamily: " + getInstanceFamily() + ",");
        if (getQuantity() != null)
            sb.append("Quantity: " + getQuantity() + ",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: " + getTagSpecifications() + ",");
        if (getHostRecovery() != null)
            sb.append("HostRecovery: " + getHostRecovery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAutoPlacement() == null) ? 0 : getAutoPlacement().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceFamily() == null) ? 0 : getInstanceFamily().hashCode());
        hashCode = prime * hashCode + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        hashCode = prime * hashCode
                + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode
                + ((getHostRecovery() == null) ? 0 : getHostRecovery().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AllocateHostsRequest == false)
            return false;
        AllocateHostsRequest other = (AllocateHostsRequest) obj;

        if (other.getAutoPlacement() == null ^ this.getAutoPlacement() == null)
            return false;
        if (other.getAutoPlacement() != null
                && other.getAutoPlacement().equals(this.getAutoPlacement()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getInstanceFamily() == null ^ this.getInstanceFamily() == null)
            return false;
        if (other.getInstanceFamily() != null
                && other.getInstanceFamily().equals(this.getInstanceFamily()) == false)
            return false;
        if (other.getQuantity() == null ^ this.getQuantity() == null)
            return false;
        if (other.getQuantity() != null && other.getQuantity().equals(this.getQuantity()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null
                && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getHostRecovery() == null ^ this.getHostRecovery() == null)
            return false;
        if (other.getHostRecovery() != null
                && other.getHostRecovery().equals(this.getHostRecovery()) == false)
            return false;
        return true;
    }
}
