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
 * Describes a CloudFormation stack record created as a result of the
 * <code>create cloud formation stack</code> operation.
 * </p>
 * <p>
 * A CloudFormation stack record provides information about the AWS
 * CloudFormation stack used to create a new Amazon Elastic Compute Cloud
 * instance from an exported Lightsail instance snapshot.
 * </p>
 */
public class CloudFormationStackRecord implements Serializable {
    /**
     * <p>
     * The name of the CloudFormation stack record. It starts with
     * <code>CloudFormationStackRecord</code> followed by a GUID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudFormation stack record.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String arn;

    /**
     * <p>
     * The date when the CloudFormation stack record was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * A list of objects describing the Availability Zone and AWS Region of the
     * CloudFormation stack record.
     * </p>
     */
    private ResourceLocation location;

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>CloudFormationStackRecord</code>
     * ).
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
     * The current state of the CloudFormation stack record.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Started, Succeeded, Failed
     */
    private String state;

    /**
     * <p>
     * A list of objects describing the source of the CloudFormation stack
     * record.
     * </p>
     */
    private java.util.List<CloudFormationStackRecordSourceInfo> sourceInfo;

    /**
     * <p>
     * A list of objects describing the destination service, which is AWS
     * CloudFormation, and the Amazon Resource Name (ARN) of the AWS
     * CloudFormation stack.
     * </p>
     */
    private DestinationInfo destinationInfo;

    /**
     * <p>
     * The name of the CloudFormation stack record. It starts with
     * <code>CloudFormationStackRecord</code> followed by a GUID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the CloudFormation stack record. It starts with
     *         <code>CloudFormationStackRecord</code> followed by a GUID.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the CloudFormation stack record. It starts with
     * <code>CloudFormationStackRecord</code> followed by a GUID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param name <p>
     *            The name of the CloudFormation stack record. It starts with
     *            <code>CloudFormationStackRecord</code> followed by a GUID.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the CloudFormation stack record. It starts with
     * <code>CloudFormationStackRecord</code> followed by a GUID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param name <p>
     *            The name of the CloudFormation stack record. It starts with
     *            <code>CloudFormationStackRecord</code> followed by a GUID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFormationStackRecord withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudFormation stack record.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the CloudFormation stack
     *         record.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudFormation stack record.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the CloudFormation stack
     *            record.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudFormation stack record.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the CloudFormation stack
     *            record.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFormationStackRecord withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The date when the CloudFormation stack record was created.
     * </p>
     *
     * @return <p>
     *         The date when the CloudFormation stack record was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The date when the CloudFormation stack record was created.
     * </p>
     *
     * @param createdAt <p>
     *            The date when the CloudFormation stack record was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date when the CloudFormation stack record was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The date when the CloudFormation stack record was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFormationStackRecord withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * A list of objects describing the Availability Zone and AWS Region of the
     * CloudFormation stack record.
     * </p>
     *
     * @return <p>
     *         A list of objects describing the Availability Zone and AWS Region
     *         of the CloudFormation stack record.
     *         </p>
     */
    public ResourceLocation getLocation() {
        return location;
    }

    /**
     * <p>
     * A list of objects describing the Availability Zone and AWS Region of the
     * CloudFormation stack record.
     * </p>
     *
     * @param location <p>
     *            A list of objects describing the Availability Zone and AWS
     *            Region of the CloudFormation stack record.
     *            </p>
     */
    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * A list of objects describing the Availability Zone and AWS Region of the
     * CloudFormation stack record.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            A list of objects describing the Availability Zone and AWS
     *            Region of the CloudFormation stack record.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFormationStackRecord withLocation(ResourceLocation location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>CloudFormationStackRecord</code>
     * ).
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
     *         <code>CloudFormationStackRecord</code>).
     *         </p>
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>CloudFormationStackRecord</code>
     * ).
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
     *            <code>CloudFormationStackRecord</code>).
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>CloudFormationStackRecord</code>
     * ).
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
     *            <code>CloudFormationStackRecord</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public CloudFormationStackRecord withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>CloudFormationStackRecord</code>
     * ).
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
     *            <code>CloudFormationStackRecord</code>).
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>CloudFormationStackRecord</code>
     * ).
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
     *            <code>CloudFormationStackRecord</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public CloudFormationStackRecord withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The current state of the CloudFormation stack record.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Started, Succeeded, Failed
     *
     * @return <p>
     *         The current state of the CloudFormation stack record.
     *         </p>
     * @see RecordState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The current state of the CloudFormation stack record.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Started, Succeeded, Failed
     *
     * @param state <p>
     *            The current state of the CloudFormation stack record.
     *            </p>
     * @see RecordState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the CloudFormation stack record.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Started, Succeeded, Failed
     *
     * @param state <p>
     *            The current state of the CloudFormation stack record.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RecordState
     */
    public CloudFormationStackRecord withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The current state of the CloudFormation stack record.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Started, Succeeded, Failed
     *
     * @param state <p>
     *            The current state of the CloudFormation stack record.
     *            </p>
     * @see RecordState
     */
    public void setState(RecordState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The current state of the CloudFormation stack record.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Started, Succeeded, Failed
     *
     * @param state <p>
     *            The current state of the CloudFormation stack record.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RecordState
     */
    public CloudFormationStackRecord withState(RecordState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * A list of objects describing the source of the CloudFormation stack
     * record.
     * </p>
     *
     * @return <p>
     *         A list of objects describing the source of the CloudFormation
     *         stack record.
     *         </p>
     */
    public java.util.List<CloudFormationStackRecordSourceInfo> getSourceInfo() {
        return sourceInfo;
    }

    /**
     * <p>
     * A list of objects describing the source of the CloudFormation stack
     * record.
     * </p>
     *
     * @param sourceInfo <p>
     *            A list of objects describing the source of the CloudFormation
     *            stack record.
     *            </p>
     */
    public void setSourceInfo(java.util.Collection<CloudFormationStackRecordSourceInfo> sourceInfo) {
        if (sourceInfo == null) {
            this.sourceInfo = null;
            return;
        }

        this.sourceInfo = new java.util.ArrayList<CloudFormationStackRecordSourceInfo>(sourceInfo);
    }

    /**
     * <p>
     * A list of objects describing the source of the CloudFormation stack
     * record.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceInfo <p>
     *            A list of objects describing the source of the CloudFormation
     *            stack record.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFormationStackRecord withSourceInfo(
            CloudFormationStackRecordSourceInfo... sourceInfo) {
        if (getSourceInfo() == null) {
            this.sourceInfo = new java.util.ArrayList<CloudFormationStackRecordSourceInfo>(
                    sourceInfo.length);
        }
        for (CloudFormationStackRecordSourceInfo value : sourceInfo) {
            this.sourceInfo.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects describing the source of the CloudFormation stack
     * record.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceInfo <p>
     *            A list of objects describing the source of the CloudFormation
     *            stack record.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFormationStackRecord withSourceInfo(
            java.util.Collection<CloudFormationStackRecordSourceInfo> sourceInfo) {
        setSourceInfo(sourceInfo);
        return this;
    }

    /**
     * <p>
     * A list of objects describing the destination service, which is AWS
     * CloudFormation, and the Amazon Resource Name (ARN) of the AWS
     * CloudFormation stack.
     * </p>
     *
     * @return <p>
     *         A list of objects describing the destination service, which is
     *         AWS CloudFormation, and the Amazon Resource Name (ARN) of the AWS
     *         CloudFormation stack.
     *         </p>
     */
    public DestinationInfo getDestinationInfo() {
        return destinationInfo;
    }

    /**
     * <p>
     * A list of objects describing the destination service, which is AWS
     * CloudFormation, and the Amazon Resource Name (ARN) of the AWS
     * CloudFormation stack.
     * </p>
     *
     * @param destinationInfo <p>
     *            A list of objects describing the destination service, which is
     *            AWS CloudFormation, and the Amazon Resource Name (ARN) of the
     *            AWS CloudFormation stack.
     *            </p>
     */
    public void setDestinationInfo(DestinationInfo destinationInfo) {
        this.destinationInfo = destinationInfo;
    }

    /**
     * <p>
     * A list of objects describing the destination service, which is AWS
     * CloudFormation, and the Amazon Resource Name (ARN) of the AWS
     * CloudFormation stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationInfo <p>
     *            A list of objects describing the destination service, which is
     *            AWS CloudFormation, and the Amazon Resource Name (ARN) of the
     *            AWS CloudFormation stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFormationStackRecord withDestinationInfo(DestinationInfo destinationInfo) {
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

        if (obj instanceof CloudFormationStackRecord == false)
            return false;
        CloudFormationStackRecord other = (CloudFormationStackRecord) obj;

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
