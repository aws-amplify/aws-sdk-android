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
 * Describes an export snapshot record.
 * </p>
 */
public class ExportSnapshotRecord implements Serializable {
    /**
     * <p>
     * The export snapshot record name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the export snapshot record.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String arn;

    /**
     * <p>
     * The date when the export snapshot record was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The AWS Region and Availability Zone where the export snapshot record is
     * located.
     * </p>
     */
    private ResourceLocation location;

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>ExportSnapshotRecord</code>).
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
     * The state of the export snapshot record.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Started, Succeeded, Failed
     */
    private String state;

    /**
     * <p>
     * A list of objects describing the source of the export snapshot record.
     * </p>
     */
    private ExportSnapshotRecordSourceInfo sourceInfo;

    /**
     * <p>
     * A list of objects describing the destination of the export snapshot
     * record.
     * </p>
     */
    private DestinationInfo destinationInfo;

    /**
     * <p>
     * The export snapshot record name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The export snapshot record name.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The export snapshot record name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param name <p>
     *            The export snapshot record name.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The export snapshot record name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param name <p>
     *            The export snapshot record name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportSnapshotRecord withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the export snapshot record.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the export snapshot record.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the export snapshot record.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the export snapshot record.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the export snapshot record.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the export snapshot record.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportSnapshotRecord withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The date when the export snapshot record was created.
     * </p>
     *
     * @return <p>
     *         The date when the export snapshot record was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The date when the export snapshot record was created.
     * </p>
     *
     * @param createdAt <p>
     *            The date when the export snapshot record was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date when the export snapshot record was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The date when the export snapshot record was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportSnapshotRecord withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The AWS Region and Availability Zone where the export snapshot record is
     * located.
     * </p>
     *
     * @return <p>
     *         The AWS Region and Availability Zone where the export snapshot
     *         record is located.
     *         </p>
     */
    public ResourceLocation getLocation() {
        return location;
    }

    /**
     * <p>
     * The AWS Region and Availability Zone where the export snapshot record is
     * located.
     * </p>
     *
     * @param location <p>
     *            The AWS Region and Availability Zone where the export snapshot
     *            record is located.
     *            </p>
     */
    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The AWS Region and Availability Zone where the export snapshot record is
     * located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            The AWS Region and Availability Zone where the export snapshot
     *            record is located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportSnapshotRecord withLocation(ResourceLocation location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>ExportSnapshotRecord</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @return <p>
     *         The Lightsail resource type (e.g.,
     *         <code>ExportSnapshotRecord</code>).
     *         </p>
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>ExportSnapshotRecord</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The Lightsail resource type (e.g.,
     *            <code>ExportSnapshotRecord</code>).
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>ExportSnapshotRecord</code>).
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
     *            The Lightsail resource type (e.g.,
     *            <code>ExportSnapshotRecord</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public ExportSnapshotRecord withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>ExportSnapshotRecord</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Instance, StaticIp, KeyPair, InstanceSnapshot,
     * Domain, PeeredVpc, LoadBalancer, LoadBalancerTlsCertificate, Disk,
     * DiskSnapshot, RelationalDatabase, RelationalDatabaseSnapshot,
     * ExportSnapshotRecord, CloudFormationStackRecord, Alarm, ContactMethod
     *
     * @param resourceType <p>
     *            The Lightsail resource type (e.g.,
     *            <code>ExportSnapshotRecord</code>).
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>ExportSnapshotRecord</code>).
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
     *            The Lightsail resource type (e.g.,
     *            <code>ExportSnapshotRecord</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public ExportSnapshotRecord withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The state of the export snapshot record.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Started, Succeeded, Failed
     *
     * @return <p>
     *         The state of the export snapshot record.
     *         </p>
     * @see RecordState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the export snapshot record.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Started, Succeeded, Failed
     *
     * @param state <p>
     *            The state of the export snapshot record.
     *            </p>
     * @see RecordState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the export snapshot record.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Started, Succeeded, Failed
     *
     * @param state <p>
     *            The state of the export snapshot record.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RecordState
     */
    public ExportSnapshotRecord withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the export snapshot record.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Started, Succeeded, Failed
     *
     * @param state <p>
     *            The state of the export snapshot record.
     *            </p>
     * @see RecordState
     */
    public void setState(RecordState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the export snapshot record.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Started, Succeeded, Failed
     *
     * @param state <p>
     *            The state of the export snapshot record.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RecordState
     */
    public ExportSnapshotRecord withState(RecordState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * A list of objects describing the source of the export snapshot record.
     * </p>
     *
     * @return <p>
     *         A list of objects describing the source of the export snapshot
     *         record.
     *         </p>
     */
    public ExportSnapshotRecordSourceInfo getSourceInfo() {
        return sourceInfo;
    }

    /**
     * <p>
     * A list of objects describing the source of the export snapshot record.
     * </p>
     *
     * @param sourceInfo <p>
     *            A list of objects describing the source of the export snapshot
     *            record.
     *            </p>
     */
    public void setSourceInfo(ExportSnapshotRecordSourceInfo sourceInfo) {
        this.sourceInfo = sourceInfo;
    }

    /**
     * <p>
     * A list of objects describing the source of the export snapshot record.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceInfo <p>
     *            A list of objects describing the source of the export snapshot
     *            record.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportSnapshotRecord withSourceInfo(ExportSnapshotRecordSourceInfo sourceInfo) {
        this.sourceInfo = sourceInfo;
        return this;
    }

    /**
     * <p>
     * A list of objects describing the destination of the export snapshot
     * record.
     * </p>
     *
     * @return <p>
     *         A list of objects describing the destination of the export
     *         snapshot record.
     *         </p>
     */
    public DestinationInfo getDestinationInfo() {
        return destinationInfo;
    }

    /**
     * <p>
     * A list of objects describing the destination of the export snapshot
     * record.
     * </p>
     *
     * @param destinationInfo <p>
     *            A list of objects describing the destination of the export
     *            snapshot record.
     *            </p>
     */
    public void setDestinationInfo(DestinationInfo destinationInfo) {
        this.destinationInfo = destinationInfo;
    }

    /**
     * <p>
     * A list of objects describing the destination of the export snapshot
     * record.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationInfo <p>
     *            A list of objects describing the destination of the export
     *            snapshot record.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportSnapshotRecord withDestinationInfo(DestinationInfo destinationInfo) {
        this.destinationInfo = destinationInfo;
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getCreatedAt() != null)
            sb.append("createdAt: " + getCreatedAt() + ",");
        if (getLocation() != null)
            sb.append("location: " + getLocation() + ",");
        if (getResourceType() != null)
            sb.append("resourceType: " + getResourceType() + ",");
        if (getState() != null)
            sb.append("state: " + getState() + ",");
        if (getSourceInfo() != null)
            sb.append("sourceInfo: " + getSourceInfo() + ",");
        if (getDestinationInfo() != null)
            sb.append("destinationInfo: " + getDestinationInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getSourceInfo() == null) ? 0 : getSourceInfo().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationInfo() == null) ? 0 : getDestinationInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportSnapshotRecord == false)
            return false;
        ExportSnapshotRecord other = (ExportSnapshotRecord) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getSourceInfo() == null ^ this.getSourceInfo() == null)
            return false;
        if (other.getSourceInfo() != null
                && other.getSourceInfo().equals(this.getSourceInfo()) == false)
            return false;
        if (other.getDestinationInfo() == null ^ this.getDestinationInfo() == null)
            return false;
        if (other.getDestinationInfo() != null
                && other.getDestinationInfo().equals(this.getDestinationInfo()) == false)
            return false;
        return true;
    }
}
