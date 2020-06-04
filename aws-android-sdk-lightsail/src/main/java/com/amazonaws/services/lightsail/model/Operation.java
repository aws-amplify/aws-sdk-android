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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the API operation.
 * </p>
 */
public class Operation implements Serializable {
    /**
     * <p>
     * The ID of the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String id;

    /**
     * <p>
     * The resource name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String resourceName;

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     */
    private String resourceType;

    /**
     * <p>
     * The timestamp when the operation was initialized (e.g.,
     * <code>1479816991.349</code>).
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The AWS Region and Availability Zone.
     * </p>
     */
    private ResourceLocation location;

    /**
     * <p>
     * A Boolean value indicating whether the operation is terminal.
     * </p>
     */
    private Boolean isTerminal;

    /**
     * <p>
     * Details about the operation (e.g., <code>Debian-1GB-Ohio-1</code>).
     * </p>
     */
    private String operationDetails;

    /**
     * <p>
     * The type of operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DeleteKnownHostKeys, DeleteInstance,
     * CreateInstance, StopInstance, StartInstance, RebootInstance,
     * OpenInstancePublicPorts, PutInstancePublicPorts,
     * CloseInstancePublicPorts, AllocateStaticIp, ReleaseStaticIp,
     * AttachStaticIp, DetachStaticIp, UpdateDomainEntry, DeleteDomainEntry,
     * CreateDomain, DeleteDomain, CreateInstanceSnapshot,
     * DeleteInstanceSnapshot, CreateInstancesFromSnapshot, CreateLoadBalancer,
     * DeleteLoadBalancer, AttachInstancesToLoadBalancer,
     * DetachInstancesFromLoadBalancer, UpdateLoadBalancerAttribute,
     * CreateLoadBalancerTlsCertificate, DeleteLoadBalancerTlsCertificate,
     * AttachLoadBalancerTlsCertificate, CreateDisk, DeleteDisk, AttachDisk,
     * DetachDisk, CreateDiskSnapshot, DeleteDiskSnapshot,
     * CreateDiskFromSnapshot, CreateRelationalDatabase,
     * UpdateRelationalDatabase, DeleteRelationalDatabase,
     * CreateRelationalDatabaseFromSnapshot, CreateRelationalDatabaseSnapshot,
     * DeleteRelationalDatabaseSnapshot, UpdateRelationalDatabaseParameters,
     * StartRelationalDatabase, RebootRelationalDatabase,
     * StopRelationalDatabase, EnableAddOn, DisableAddOn, PutAlarm, GetAlarms,
     * DeleteAlarm, TestAlarm, CreateContactMethod, GetContactMethods,
     * SendContactMethodVerification, DeleteContactMethod
     */
    private String operationType;

    /**
     * <p>
     * The status of the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NotStarted, Started, Failed, Completed, Succeeded
     */
    private String status;

    /**
     * <p>
     * The timestamp when the status was changed (e.g.,
     * <code>1479816991.349</code>).
     * </p>
     */
    private java.util.Date statusChangedAt;

    /**
     * <p>
     * The error code.
     * </p>
     */
    private String errorCode;

    /**
     * <p>
     * The error details.
     * </p>
     */
    private String errorDetails;

    /**
     * <p>
     * The ID of the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ID of the operation.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param id <p>
     *            The ID of the operation.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param id <p>
     *            The ID of the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Operation withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The resource name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The resource name.
     *         </p>
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * <p>
     * The resource name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param resourceName <p>
     *            The resource name.
     *            </p>
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The resource name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param resourceName <p>
     *            The resource name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Operation withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @return <p>
     *         The resource type.
     *         </p>
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The resource type.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The resource type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public Operation withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The resource type.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The resource type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public Operation withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when the operation was initialized (e.g.,
     * <code>1479816991.349</code>).
     * </p>
     *
     * @return <p>
     *         The timestamp when the operation was initialized (e.g.,
     *         <code>1479816991.349</code>).
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The timestamp when the operation was initialized (e.g.,
     * <code>1479816991.349</code>).
     * </p>
     *
     * @param createdAt <p>
     *            The timestamp when the operation was initialized (e.g.,
     *            <code>1479816991.349</code>).
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the operation was initialized (e.g.,
     * <code>1479816991.349</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The timestamp when the operation was initialized (e.g.,
     *            <code>1479816991.349</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Operation withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The AWS Region and Availability Zone.
     * </p>
     *
     * @return <p>
     *         The AWS Region and Availability Zone.
     *         </p>
     */
    public ResourceLocation getLocation() {
        return location;
    }

    /**
     * <p>
     * The AWS Region and Availability Zone.
     * </p>
     *
     * @param location <p>
     *            The AWS Region and Availability Zone.
     *            </p>
     */
    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The AWS Region and Availability Zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            The AWS Region and Availability Zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Operation withLocation(ResourceLocation location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the operation is terminal.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether the operation is terminal.
     *         </p>
     */
    public Boolean isIsTerminal() {
        return isTerminal;
    }

    /**
     * <p>
     * A Boolean value indicating whether the operation is terminal.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether the operation is terminal.
     *         </p>
     */
    public Boolean getIsTerminal() {
        return isTerminal;
    }

    /**
     * <p>
     * A Boolean value indicating whether the operation is terminal.
     * </p>
     *
     * @param isTerminal <p>
     *            A Boolean value indicating whether the operation is terminal.
     *            </p>
     */
    public void setIsTerminal(Boolean isTerminal) {
        this.isTerminal = isTerminal;
    }

    /**
     * <p>
     * A Boolean value indicating whether the operation is terminal.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isTerminal <p>
     *            A Boolean value indicating whether the operation is terminal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Operation withIsTerminal(Boolean isTerminal) {
        this.isTerminal = isTerminal;
        return this;
    }

    /**
     * <p>
     * Details about the operation (e.g., <code>Debian-1GB-Ohio-1</code>).
     * </p>
     *
     * @return <p>
     *         Details about the operation (e.g., <code>Debian-1GB-Ohio-1</code>
     *         ).
     *         </p>
     */
    public String getOperationDetails() {
        return operationDetails;
    }

    /**
     * <p>
     * Details about the operation (e.g., <code>Debian-1GB-Ohio-1</code>).
     * </p>
     *
     * @param operationDetails <p>
     *            Details about the operation (e.g.,
     *            <code>Debian-1GB-Ohio-1</code>).
     *            </p>
     */
    public void setOperationDetails(String operationDetails) {
        this.operationDetails = operationDetails;
    }

    /**
     * <p>
     * Details about the operation (e.g., <code>Debian-1GB-Ohio-1</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operationDetails <p>
     *            Details about the operation (e.g.,
     *            <code>Debian-1GB-Ohio-1</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Operation withOperationDetails(String operationDetails) {
        this.operationDetails = operationDetails;
        return this;
    }

    /**
     * <p>
     * The type of operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DeleteKnownHostKeys, DeleteInstance,
     * CreateInstance, StopInstance, StartInstance, RebootInstance,
     * OpenInstancePublicPorts, PutInstancePublicPorts,
     * CloseInstancePublicPorts, AllocateStaticIp, ReleaseStaticIp,
     * AttachStaticIp, DetachStaticIp, UpdateDomainEntry, DeleteDomainEntry,
     * CreateDomain, DeleteDomain, CreateInstanceSnapshot,
     * DeleteInstanceSnapshot, CreateInstancesFromSnapshot, CreateLoadBalancer,
     * DeleteLoadBalancer, AttachInstancesToLoadBalancer,
     * DetachInstancesFromLoadBalancer, UpdateLoadBalancerAttribute,
     * CreateLoadBalancerTlsCertificate, DeleteLoadBalancerTlsCertificate,
     * AttachLoadBalancerTlsCertificate, CreateDisk, DeleteDisk, AttachDisk,
     * DetachDisk, CreateDiskSnapshot, DeleteDiskSnapshot,
     * CreateDiskFromSnapshot, CreateRelationalDatabase,
     * UpdateRelationalDatabase, DeleteRelationalDatabase,
     * CreateRelationalDatabaseFromSnapshot, CreateRelationalDatabaseSnapshot,
     * DeleteRelationalDatabaseSnapshot, UpdateRelationalDatabaseParameters,
     * StartRelationalDatabase, RebootRelationalDatabase,
     * StopRelationalDatabase, EnableAddOn, DisableAddOn, PutAlarm, GetAlarms,
     * DeleteAlarm, TestAlarm, CreateContactMethod, GetContactMethods,
     * SendContactMethodVerification, DeleteContactMethod
     *
     * @return <p>
     *         The type of operation.
     *         </p>
     * @see OperationType
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * <p>
     * The type of operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DeleteKnownHostKeys, DeleteInstance,
     * CreateInstance, StopInstance, StartInstance, RebootInstance,
     * OpenInstancePublicPorts, PutInstancePublicPorts,
     * CloseInstancePublicPorts, AllocateStaticIp, ReleaseStaticIp,
     * AttachStaticIp, DetachStaticIp, UpdateDomainEntry, DeleteDomainEntry,
     * CreateDomain, DeleteDomain, CreateInstanceSnapshot,
     * DeleteInstanceSnapshot, CreateInstancesFromSnapshot, CreateLoadBalancer,
     * DeleteLoadBalancer, AttachInstancesToLoadBalancer,
     * DetachInstancesFromLoadBalancer, UpdateLoadBalancerAttribute,
     * CreateLoadBalancerTlsCertificate, DeleteLoadBalancerTlsCertificate,
     * AttachLoadBalancerTlsCertificate, CreateDisk, DeleteDisk, AttachDisk,
     * DetachDisk, CreateDiskSnapshot, DeleteDiskSnapshot,
     * CreateDiskFromSnapshot, CreateRelationalDatabase,
     * UpdateRelationalDatabase, DeleteRelationalDatabase,
     * CreateRelationalDatabaseFromSnapshot, CreateRelationalDatabaseSnapshot,
     * DeleteRelationalDatabaseSnapshot, UpdateRelationalDatabaseParameters,
     * StartRelationalDatabase, RebootRelationalDatabase,
     * StopRelationalDatabase, EnableAddOn, DisableAddOn, PutAlarm, GetAlarms,
     * DeleteAlarm, TestAlarm, CreateContactMethod, GetContactMethods,
     * SendContactMethodVerification, DeleteContactMethod
     *
     * @param operationType <p>
     *            The type of operation.
     *            </p>
     * @see OperationType
     */
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    /**
     * <p>
     * The type of operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DeleteKnownHostKeys, DeleteInstance,
     * CreateInstance, StopInstance, StartInstance, RebootInstance,
     * OpenInstancePublicPorts, PutInstancePublicPorts,
     * CloseInstancePublicPorts, AllocateStaticIp, ReleaseStaticIp,
     * AttachStaticIp, DetachStaticIp, UpdateDomainEntry, DeleteDomainEntry,
     * CreateDomain, DeleteDomain, CreateInstanceSnapshot,
     * DeleteInstanceSnapshot, CreateInstancesFromSnapshot, CreateLoadBalancer,
     * DeleteLoadBalancer, AttachInstancesToLoadBalancer,
     * DetachInstancesFromLoadBalancer, UpdateLoadBalancerAttribute,
     * CreateLoadBalancerTlsCertificate, DeleteLoadBalancerTlsCertificate,
     * AttachLoadBalancerTlsCertificate, CreateDisk, DeleteDisk, AttachDisk,
     * DetachDisk, CreateDiskSnapshot, DeleteDiskSnapshot,
     * CreateDiskFromSnapshot, CreateRelationalDatabase,
     * UpdateRelationalDatabase, DeleteRelationalDatabase,
     * CreateRelationalDatabaseFromSnapshot, CreateRelationalDatabaseSnapshot,
     * DeleteRelationalDatabaseSnapshot, UpdateRelationalDatabaseParameters,
     * StartRelationalDatabase, RebootRelationalDatabase,
     * StopRelationalDatabase, EnableAddOn, DisableAddOn, PutAlarm, GetAlarms,
     * DeleteAlarm, TestAlarm, CreateContactMethod, GetContactMethods,
     * SendContactMethodVerification, DeleteContactMethod
     *
     * @param operationType <p>
     *            The type of operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OperationType
     */
    public Operation withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * <p>
     * The type of operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DeleteKnownHostKeys, DeleteInstance,
     * CreateInstance, StopInstance, StartInstance, RebootInstance,
     * OpenInstancePublicPorts, PutInstancePublicPorts,
     * CloseInstancePublicPorts, AllocateStaticIp, ReleaseStaticIp,
     * AttachStaticIp, DetachStaticIp, UpdateDomainEntry, DeleteDomainEntry,
     * CreateDomain, DeleteDomain, CreateInstanceSnapshot,
     * DeleteInstanceSnapshot, CreateInstancesFromSnapshot, CreateLoadBalancer,
     * DeleteLoadBalancer, AttachInstancesToLoadBalancer,
     * DetachInstancesFromLoadBalancer, UpdateLoadBalancerAttribute,
     * CreateLoadBalancerTlsCertificate, DeleteLoadBalancerTlsCertificate,
     * AttachLoadBalancerTlsCertificate, CreateDisk, DeleteDisk, AttachDisk,
     * DetachDisk, CreateDiskSnapshot, DeleteDiskSnapshot,
     * CreateDiskFromSnapshot, CreateRelationalDatabase,
     * UpdateRelationalDatabase, DeleteRelationalDatabase,
     * CreateRelationalDatabaseFromSnapshot, CreateRelationalDatabaseSnapshot,
     * DeleteRelationalDatabaseSnapshot, UpdateRelationalDatabaseParameters,
     * StartRelationalDatabase, RebootRelationalDatabase,
     * StopRelationalDatabase, EnableAddOn, DisableAddOn, PutAlarm, GetAlarms,
     * DeleteAlarm, TestAlarm, CreateContactMethod, GetContactMethods,
     * SendContactMethodVerification, DeleteContactMethod
     *
     * @param operationType <p>
     *            The type of operation.
     *            </p>
     * @see OperationType
     */
    public void setOperationType(OperationType operationType) {
        this.operationType = operationType.toString();
    }

    /**
     * <p>
     * The type of operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DeleteKnownHostKeys, DeleteInstance,
     * CreateInstance, StopInstance, StartInstance, RebootInstance,
     * OpenInstancePublicPorts, PutInstancePublicPorts,
     * CloseInstancePublicPorts, AllocateStaticIp, ReleaseStaticIp,
     * AttachStaticIp, DetachStaticIp, UpdateDomainEntry, DeleteDomainEntry,
     * CreateDomain, DeleteDomain, CreateInstanceSnapshot,
     * DeleteInstanceSnapshot, CreateInstancesFromSnapshot, CreateLoadBalancer,
     * DeleteLoadBalancer, AttachInstancesToLoadBalancer,
     * DetachInstancesFromLoadBalancer, UpdateLoadBalancerAttribute,
     * CreateLoadBalancerTlsCertificate, DeleteLoadBalancerTlsCertificate,
     * AttachLoadBalancerTlsCertificate, CreateDisk, DeleteDisk, AttachDisk,
     * DetachDisk, CreateDiskSnapshot, DeleteDiskSnapshot,
     * CreateDiskFromSnapshot, CreateRelationalDatabase,
     * UpdateRelationalDatabase, DeleteRelationalDatabase,
     * CreateRelationalDatabaseFromSnapshot, CreateRelationalDatabaseSnapshot,
     * DeleteRelationalDatabaseSnapshot, UpdateRelationalDatabaseParameters,
     * StartRelationalDatabase, RebootRelationalDatabase,
     * StopRelationalDatabase, EnableAddOn, DisableAddOn, PutAlarm, GetAlarms,
     * DeleteAlarm, TestAlarm, CreateContactMethod, GetContactMethods,
     * SendContactMethodVerification, DeleteContactMethod
     *
     * @param operationType <p>
     *            The type of operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OperationType
     */
    public Operation withOperationType(OperationType operationType) {
        this.operationType = operationType.toString();
        return this;
    }

    /**
     * <p>
     * The status of the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NotStarted, Started, Failed, Completed, Succeeded
     *
     * @return <p>
     *         The status of the operation.
     *         </p>
     * @see OperationStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NotStarted, Started, Failed, Completed, Succeeded
     *
     * @param status <p>
     *            The status of the operation.
     *            </p>
     * @see OperationStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NotStarted, Started, Failed, Completed, Succeeded
     *
     * @param status <p>
     *            The status of the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OperationStatus
     */
    public Operation withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NotStarted, Started, Failed, Completed, Succeeded
     *
     * @param status <p>
     *            The status of the operation.
     *            </p>
     * @see OperationStatus
     */
    public void setStatus(OperationStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NotStarted, Started, Failed, Completed, Succeeded
     *
     * @param status <p>
     *            The status of the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OperationStatus
     */
    public Operation withStatus(OperationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when the status was changed (e.g.,
     * <code>1479816991.349</code>).
     * </p>
     *
     * @return <p>
     *         The timestamp when the status was changed (e.g.,
     *         <code>1479816991.349</code>).
     *         </p>
     */
    public java.util.Date getStatusChangedAt() {
        return statusChangedAt;
    }

    /**
     * <p>
     * The timestamp when the status was changed (e.g.,
     * <code>1479816991.349</code>).
     * </p>
     *
     * @param statusChangedAt <p>
     *            The timestamp when the status was changed (e.g.,
     *            <code>1479816991.349</code>).
     *            </p>
     */
    public void setStatusChangedAt(java.util.Date statusChangedAt) {
        this.statusChangedAt = statusChangedAt;
    }

    /**
     * <p>
     * The timestamp when the status was changed (e.g.,
     * <code>1479816991.349</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusChangedAt <p>
     *            The timestamp when the status was changed (e.g.,
     *            <code>1479816991.349</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Operation withStatusChangedAt(java.util.Date statusChangedAt) {
        this.statusChangedAt = statusChangedAt;
        return this;
    }

    /**
     * <p>
     * The error code.
     * </p>
     *
     * @return <p>
     *         The error code.
     *         </p>
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * <p>
     * The error code.
     * </p>
     *
     * @param errorCode <p>
     *            The error code.
     *            </p>
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorCode <p>
     *            The error code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Operation withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * <p>
     * The error details.
     * </p>
     *
     * @return <p>
     *         The error details.
     *         </p>
     */
    public String getErrorDetails() {
        return errorDetails;
    }

    /**
     * <p>
     * The error details.
     * </p>
     *
     * @param errorDetails <p>
     *            The error details.
     *            </p>
     */
    public void setErrorDetails(String errorDetails) {
        this.errorDetails = errorDetails;
    }

    /**
     * <p>
     * The error details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorDetails <p>
     *            The error details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Operation withErrorDetails(String errorDetails) {
        this.errorDetails = errorDetails;
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
            sb.append("id: " + getId() + ",");
        if (getResourceName() != null)
            sb.append("resourceName: " + getResourceName() + ",");
        if (getResourceType() != null)
            sb.append("resourceType: " + getResourceType() + ",");
        if (getCreatedAt() != null)
            sb.append("createdAt: " + getCreatedAt() + ",");
        if (getLocation() != null)
            sb.append("location: " + getLocation() + ",");
        if (getIsTerminal() != null)
            sb.append("isTerminal: " + getIsTerminal() + ",");
        if (getOperationDetails() != null)
            sb.append("operationDetails: " + getOperationDetails() + ",");
        if (getOperationType() != null)
            sb.append("operationType: " + getOperationType() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getStatusChangedAt() != null)
            sb.append("statusChangedAt: " + getStatusChangedAt() + ",");
        if (getErrorCode() != null)
            sb.append("errorCode: " + getErrorCode() + ",");
        if (getErrorDetails() != null)
            sb.append("errorDetails: " + getErrorDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getIsTerminal() == null) ? 0 : getIsTerminal().hashCode());
        hashCode = prime * hashCode
                + ((getOperationDetails() == null) ? 0 : getOperationDetails().hashCode());
        hashCode = prime * hashCode
                + ((getOperationType() == null) ? 0 : getOperationType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusChangedAt() == null) ? 0 : getStatusChangedAt().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode
                + ((getErrorDetails() == null) ? 0 : getErrorDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Operation == false)
            return false;
        Operation other = (Operation) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null
                && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getIsTerminal() == null ^ this.getIsTerminal() == null)
            return false;
        if (other.getIsTerminal() != null
                && other.getIsTerminal().equals(this.getIsTerminal()) == false)
            return false;
        if (other.getOperationDetails() == null ^ this.getOperationDetails() == null)
            return false;
        if (other.getOperationDetails() != null
                && other.getOperationDetails().equals(this.getOperationDetails()) == false)
            return false;
        if (other.getOperationType() == null ^ this.getOperationType() == null)
            return false;
        if (other.getOperationType() != null
                && other.getOperationType().equals(this.getOperationType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusChangedAt() == null ^ this.getStatusChangedAt() == null)
            return false;
        if (other.getStatusChangedAt() != null
                && other.getStatusChangedAt().equals(this.getStatusChangedAt()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null
                && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorDetails() == null ^ this.getErrorDetails() == null)
            return false;
        if (other.getErrorDetails() != null
                && other.getErrorDetails().equals(this.getErrorDetails()) == false)
            return false;
        return true;
    }
}
