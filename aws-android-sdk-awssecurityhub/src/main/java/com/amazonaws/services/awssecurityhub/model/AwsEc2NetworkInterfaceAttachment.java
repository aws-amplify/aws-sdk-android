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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the network interface attachment.
 * </p>
 */
public class AwsEc2NetworkInterfaceAttachment implements Serializable {
    /**
     * <p>
     * The timestamp indicating when the attachment initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String attachTime;

    /**
     * <p>
     * The identifier of the network interface attachment
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String attachmentId;

    /**
     * <p>
     * Indicates whether the network interface is deleted when the instance is
     * terminated.
     * </p>
     */
    private Boolean deleteOnTermination;

    /**
     * <p>
     * The device index of the network interface attachment on the instance.
     * </p>
     */
    private Integer deviceIndex;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The AWS account ID of the owner of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String instanceOwnerId;

    /**
     * <p>
     * The attachment state.
     * </p>
     * <p>
     * Valid values: <code>attaching</code> | <code>attached</code> |
     * <code>detaching</code> | <code>detached</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String status;

    /**
     * <p>
     * The timestamp indicating when the attachment initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The timestamp indicating when the attachment initiated.
     *         </p>
     */
    public String getAttachTime() {
        return attachTime;
    }

    /**
     * <p>
     * The timestamp indicating when the attachment initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param attachTime <p>
     *            The timestamp indicating when the attachment initiated.
     *            </p>
     */
    public void setAttachTime(String attachTime) {
        this.attachTime = attachTime;
    }

    /**
     * <p>
     * The timestamp indicating when the attachment initiated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param attachTime <p>
     *            The timestamp indicating when the attachment initiated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2NetworkInterfaceAttachment withAttachTime(String attachTime) {
        this.attachTime = attachTime;
        return this;
    }

    /**
     * <p>
     * The identifier of the network interface attachment
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The identifier of the network interface attachment
     *         </p>
     */
    public String getAttachmentId() {
        return attachmentId;
    }

    /**
     * <p>
     * The identifier of the network interface attachment
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param attachmentId <p>
     *            The identifier of the network interface attachment
     *            </p>
     */
    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    /**
     * <p>
     * The identifier of the network interface attachment
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param attachmentId <p>
     *            The identifier of the network interface attachment
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2NetworkInterfaceAttachment withAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
        return this;
    }

    /**
     * <p>
     * Indicates whether the network interface is deleted when the instance is
     * terminated.
     * </p>
     *
     * @return <p>
     *         Indicates whether the network interface is deleted when the
     *         instance is terminated.
     *         </p>
     */
    public Boolean isDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the network interface is deleted when the instance is
     * terminated.
     * </p>
     *
     * @return <p>
     *         Indicates whether the network interface is deleted when the
     *         instance is terminated.
     *         </p>
     */
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the network interface is deleted when the instance is
     * terminated.
     * </p>
     *
     * @param deleteOnTermination <p>
     *            Indicates whether the network interface is deleted when the
     *            instance is terminated.
     *            </p>
     */
    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the network interface is deleted when the instance is
     * terminated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteOnTermination <p>
     *            Indicates whether the network interface is deleted when the
     *            instance is terminated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2NetworkInterfaceAttachment withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    /**
     * <p>
     * The device index of the network interface attachment on the instance.
     * </p>
     *
     * @return <p>
     *         The device index of the network interface attachment on the
     *         instance.
     *         </p>
     */
    public Integer getDeviceIndex() {
        return deviceIndex;
    }

    /**
     * <p>
     * The device index of the network interface attachment on the instance.
     * </p>
     *
     * @param deviceIndex <p>
     *            The device index of the network interface attachment on the
     *            instance.
     *            </p>
     */
    public void setDeviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
    }

    /**
     * <p>
     * The device index of the network interface attachment on the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceIndex <p>
     *            The device index of the network interface attachment on the
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2NetworkInterfaceAttachment withDeviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
        return this;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ID of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2NetworkInterfaceAttachment withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The AWS account ID of the owner of the instance.
     *         </p>
     */
    public String getInstanceOwnerId() {
        return instanceOwnerId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param instanceOwnerId <p>
     *            The AWS account ID of the owner of the instance.
     *            </p>
     */
    public void setInstanceOwnerId(String instanceOwnerId) {
        this.instanceOwnerId = instanceOwnerId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param instanceOwnerId <p>
     *            The AWS account ID of the owner of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2NetworkInterfaceAttachment withInstanceOwnerId(String instanceOwnerId) {
        this.instanceOwnerId = instanceOwnerId;
        return this;
    }

    /**
     * <p>
     * The attachment state.
     * </p>
     * <p>
     * Valid values: <code>attaching</code> | <code>attached</code> |
     * <code>detaching</code> | <code>detached</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The attachment state.
     *         </p>
     *         <p>
     *         Valid values: <code>attaching</code> | <code>attached</code> |
     *         <code>detaching</code> | <code>detached</code>
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The attachment state.
     * </p>
     * <p>
     * Valid values: <code>attaching</code> | <code>attached</code> |
     * <code>detaching</code> | <code>detached</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param status <p>
     *            The attachment state.
     *            </p>
     *            <p>
     *            Valid values: <code>attaching</code> | <code>attached</code> |
     *            <code>detaching</code> | <code>detached</code>
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The attachment state.
     * </p>
     * <p>
     * Valid values: <code>attaching</code> | <code>attached</code> |
     * <code>detaching</code> | <code>detached</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param status <p>
     *            The attachment state.
     *            </p>
     *            <p>
     *            Valid values: <code>attaching</code> | <code>attached</code> |
     *            <code>detaching</code> | <code>detached</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2NetworkInterfaceAttachment withStatus(String status) {
        this.status = status;
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
        if (getAttachTime() != null)
            sb.append("AttachTime: " + getAttachTime() + ",");
        if (getAttachmentId() != null)
            sb.append("AttachmentId: " + getAttachmentId() + ",");
        if (getDeleteOnTermination() != null)
            sb.append("DeleteOnTermination: " + getDeleteOnTermination() + ",");
        if (getDeviceIndex() != null)
            sb.append("DeviceIndex: " + getDeviceIndex() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getInstanceOwnerId() != null)
            sb.append("InstanceOwnerId: " + getInstanceOwnerId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachTime() == null) ? 0 : getAttachTime().hashCode());
        hashCode = prime * hashCode
                + ((getAttachmentId() == null) ? 0 : getAttachmentId().hashCode());
        hashCode = prime * hashCode
                + ((getDeleteOnTermination() == null) ? 0 : getDeleteOnTermination().hashCode());
        hashCode = prime * hashCode
                + ((getDeviceIndex() == null) ? 0 : getDeviceIndex().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceOwnerId() == null) ? 0 : getInstanceOwnerId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2NetworkInterfaceAttachment == false)
            return false;
        AwsEc2NetworkInterfaceAttachment other = (AwsEc2NetworkInterfaceAttachment) obj;

        if (other.getAttachTime() == null ^ this.getAttachTime() == null)
            return false;
        if (other.getAttachTime() != null
                && other.getAttachTime().equals(this.getAttachTime()) == false)
            return false;
        if (other.getAttachmentId() == null ^ this.getAttachmentId() == null)
            return false;
        if (other.getAttachmentId() != null
                && other.getAttachmentId().equals(this.getAttachmentId()) == false)
            return false;
        if (other.getDeleteOnTermination() == null ^ this.getDeleteOnTermination() == null)
            return false;
        if (other.getDeleteOnTermination() != null
                && other.getDeleteOnTermination().equals(this.getDeleteOnTermination()) == false)
            return false;
        if (other.getDeviceIndex() == null ^ this.getDeviceIndex() == null)
            return false;
        if (other.getDeviceIndex() != null
                && other.getDeviceIndex().equals(this.getDeviceIndex()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getInstanceOwnerId() == null ^ this.getInstanceOwnerId() == null)
            return false;
        if (other.getInstanceOwnerId() != null
                && other.getInstanceOwnerId().equals(this.getInstanceOwnerId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
