/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * The Amazon Connect instance.
 * </p>
 */
public class Instance implements Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String id;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The identity management type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML, CONNECT_MANAGED, EXISTING_DIRECTORY
     */
    private String identityManagementType;

    /**
     * <p>
     * The alias of instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 62<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*$<br/>
     */
    private String instanceAlias;

    /**
     * <p>
     * When the instance was created.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * The service role of the instance.
     * </p>
     */
    private String serviceRole;

    /**
     * <p>
     * The state of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, ACTIVE, CREATION_FAILED
     */
    private String instanceStatus;

    /**
     * <p>
     * Relevant details why the instance was not successfully created.
     * </p>
     */
    private InstanceStatusReason statusReason;

    /**
     * <p>
     * Whether inbound calls are enabled.
     * </p>
     */
    private Boolean inboundCallsEnabled;

    /**
     * <p>
     * Whether outbound calls are enabled.
     * </p>
     */
    private Boolean outboundCallsEnabled;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can find the
     *         instanceId in the ARN of the instance.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param id <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param id <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the instance.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the instance.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The identity management type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML, CONNECT_MANAGED, EXISTING_DIRECTORY
     *
     * @return <p>
     *         The identity management type.
     *         </p>
     * @see DirectoryType
     */
    public String getIdentityManagementType() {
        return identityManagementType;
    }

    /**
     * <p>
     * The identity management type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML, CONNECT_MANAGED, EXISTING_DIRECTORY
     *
     * @param identityManagementType <p>
     *            The identity management type.
     *            </p>
     * @see DirectoryType
     */
    public void setIdentityManagementType(String identityManagementType) {
        this.identityManagementType = identityManagementType;
    }

    /**
     * <p>
     * The identity management type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML, CONNECT_MANAGED, EXISTING_DIRECTORY
     *
     * @param identityManagementType <p>
     *            The identity management type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DirectoryType
     */
    public Instance withIdentityManagementType(String identityManagementType) {
        this.identityManagementType = identityManagementType;
        return this;
    }

    /**
     * <p>
     * The identity management type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML, CONNECT_MANAGED, EXISTING_DIRECTORY
     *
     * @param identityManagementType <p>
     *            The identity management type.
     *            </p>
     * @see DirectoryType
     */
    public void setIdentityManagementType(DirectoryType identityManagementType) {
        this.identityManagementType = identityManagementType.toString();
    }

    /**
     * <p>
     * The identity management type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML, CONNECT_MANAGED, EXISTING_DIRECTORY
     *
     * @param identityManagementType <p>
     *            The identity management type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DirectoryType
     */
    public Instance withIdentityManagementType(DirectoryType identityManagementType) {
        this.identityManagementType = identityManagementType.toString();
        return this;
    }

    /**
     * <p>
     * The alias of instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 62<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*$<br/>
     *
     * @return <p>
     *         The alias of instance.
     *         </p>
     */
    public String getInstanceAlias() {
        return instanceAlias;
    }

    /**
     * <p>
     * The alias of instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 62<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*$<br/>
     *
     * @param instanceAlias <p>
     *            The alias of instance.
     *            </p>
     */
    public void setInstanceAlias(String instanceAlias) {
        this.instanceAlias = instanceAlias;
    }

    /**
     * <p>
     * The alias of instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 62<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*$<br/>
     *
     * @param instanceAlias <p>
     *            The alias of instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withInstanceAlias(String instanceAlias) {
        this.instanceAlias = instanceAlias;
        return this;
    }

    /**
     * <p>
     * When the instance was created.
     * </p>
     *
     * @return <p>
     *         When the instance was created.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * When the instance was created.
     * </p>
     *
     * @param createdTime <p>
     *            When the instance was created.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * When the instance was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            When the instance was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * <p>
     * The service role of the instance.
     * </p>
     *
     * @return <p>
     *         The service role of the instance.
     *         </p>
     */
    public String getServiceRole() {
        return serviceRole;
    }

    /**
     * <p>
     * The service role of the instance.
     * </p>
     *
     * @param serviceRole <p>
     *            The service role of the instance.
     *            </p>
     */
    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The service role of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceRole <p>
     *            The service role of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }

    /**
     * <p>
     * The state of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, ACTIVE, CREATION_FAILED
     *
     * @return <p>
     *         The state of the instance.
     *         </p>
     * @see InstanceStatus
     */
    public String getInstanceStatus() {
        return instanceStatus;
    }

    /**
     * <p>
     * The state of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, ACTIVE, CREATION_FAILED
     *
     * @param instanceStatus <p>
     *            The state of the instance.
     *            </p>
     * @see InstanceStatus
     */
    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    /**
     * <p>
     * The state of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, ACTIVE, CREATION_FAILED
     *
     * @param instanceStatus <p>
     *            The state of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceStatus
     */
    public Instance withInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * <p>
     * The state of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, ACTIVE, CREATION_FAILED
     *
     * @param instanceStatus <p>
     *            The state of the instance.
     *            </p>
     * @see InstanceStatus
     */
    public void setInstanceStatus(InstanceStatus instanceStatus) {
        this.instanceStatus = instanceStatus.toString();
    }

    /**
     * <p>
     * The state of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, ACTIVE, CREATION_FAILED
     *
     * @param instanceStatus <p>
     *            The state of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceStatus
     */
    public Instance withInstanceStatus(InstanceStatus instanceStatus) {
        this.instanceStatus = instanceStatus.toString();
        return this;
    }

    /**
     * <p>
     * Relevant details why the instance was not successfully created.
     * </p>
     *
     * @return <p>
     *         Relevant details why the instance was not successfully created.
     *         </p>
     */
    public InstanceStatusReason getStatusReason() {
        return statusReason;
    }

    /**
     * <p>
     * Relevant details why the instance was not successfully created.
     * </p>
     *
     * @param statusReason <p>
     *            Relevant details why the instance was not successfully
     *            created.
     *            </p>
     */
    public void setStatusReason(InstanceStatusReason statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * Relevant details why the instance was not successfully created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusReason <p>
     *            Relevant details why the instance was not successfully
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withStatusReason(InstanceStatusReason statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    /**
     * <p>
     * Whether inbound calls are enabled.
     * </p>
     *
     * @return <p>
     *         Whether inbound calls are enabled.
     *         </p>
     */
    public Boolean isInboundCallsEnabled() {
        return inboundCallsEnabled;
    }

    /**
     * <p>
     * Whether inbound calls are enabled.
     * </p>
     *
     * @return <p>
     *         Whether inbound calls are enabled.
     *         </p>
     */
    public Boolean getInboundCallsEnabled() {
        return inboundCallsEnabled;
    }

    /**
     * <p>
     * Whether inbound calls are enabled.
     * </p>
     *
     * @param inboundCallsEnabled <p>
     *            Whether inbound calls are enabled.
     *            </p>
     */
    public void setInboundCallsEnabled(Boolean inboundCallsEnabled) {
        this.inboundCallsEnabled = inboundCallsEnabled;
    }

    /**
     * <p>
     * Whether inbound calls are enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inboundCallsEnabled <p>
     *            Whether inbound calls are enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withInboundCallsEnabled(Boolean inboundCallsEnabled) {
        this.inboundCallsEnabled = inboundCallsEnabled;
        return this;
    }

    /**
     * <p>
     * Whether outbound calls are enabled.
     * </p>
     *
     * @return <p>
     *         Whether outbound calls are enabled.
     *         </p>
     */
    public Boolean isOutboundCallsEnabled() {
        return outboundCallsEnabled;
    }

    /**
     * <p>
     * Whether outbound calls are enabled.
     * </p>
     *
     * @return <p>
     *         Whether outbound calls are enabled.
     *         </p>
     */
    public Boolean getOutboundCallsEnabled() {
        return outboundCallsEnabled;
    }

    /**
     * <p>
     * Whether outbound calls are enabled.
     * </p>
     *
     * @param outboundCallsEnabled <p>
     *            Whether outbound calls are enabled.
     *            </p>
     */
    public void setOutboundCallsEnabled(Boolean outboundCallsEnabled) {
        this.outboundCallsEnabled = outboundCallsEnabled;
    }

    /**
     * <p>
     * Whether outbound calls are enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outboundCallsEnabled <p>
     *            Whether outbound calls are enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withOutboundCallsEnabled(Boolean outboundCallsEnabled) {
        this.outboundCallsEnabled = outboundCallsEnabled;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getIdentityManagementType() != null)
            sb.append("IdentityManagementType: " + getIdentityManagementType() + ",");
        if (getInstanceAlias() != null)
            sb.append("InstanceAlias: " + getInstanceAlias() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getServiceRole() != null)
            sb.append("ServiceRole: " + getServiceRole() + ",");
        if (getInstanceStatus() != null)
            sb.append("InstanceStatus: " + getInstanceStatus() + ",");
        if (getStatusReason() != null)
            sb.append("StatusReason: " + getStatusReason() + ",");
        if (getInboundCallsEnabled() != null)
            sb.append("InboundCallsEnabled: " + getInboundCallsEnabled() + ",");
        if (getOutboundCallsEnabled() != null)
            sb.append("OutboundCallsEnabled: " + getOutboundCallsEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getIdentityManagementType() == null) ? 0 : getIdentityManagementType()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getInstanceAlias() == null) ? 0 : getInstanceAlias().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceStatus() == null) ? 0 : getInstanceStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode
                + ((getInboundCallsEnabled() == null) ? 0 : getInboundCallsEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getOutboundCallsEnabled() == null) ? 0 : getOutboundCallsEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Instance == false)
            return false;
        Instance other = (Instance) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getIdentityManagementType() == null ^ this.getIdentityManagementType() == null)
            return false;
        if (other.getIdentityManagementType() != null
                && other.getIdentityManagementType().equals(this.getIdentityManagementType()) == false)
            return false;
        if (other.getInstanceAlias() == null ^ this.getInstanceAlias() == null)
            return false;
        if (other.getInstanceAlias() != null
                && other.getInstanceAlias().equals(this.getInstanceAlias()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getServiceRole() == null ^ this.getServiceRole() == null)
            return false;
        if (other.getServiceRole() != null
                && other.getServiceRole().equals(this.getServiceRole()) == false)
            return false;
        if (other.getInstanceStatus() == null ^ this.getInstanceStatus() == null)
            return false;
        if (other.getInstanceStatus() != null
                && other.getInstanceStatus().equals(this.getInstanceStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null
                && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getInboundCallsEnabled() == null ^ this.getInboundCallsEnabled() == null)
            return false;
        if (other.getInboundCallsEnabled() != null
                && other.getInboundCallsEnabled().equals(this.getInboundCallsEnabled()) == false)
            return false;
        if (other.getOutboundCallsEnabled() == null ^ this.getOutboundCallsEnabled() == null)
            return false;
        if (other.getOutboundCallsEnabled() != null
                && other.getOutboundCallsEnabled().equals(this.getOutboundCallsEnabled()) == false)
            return false;
        return true;
    }
}
