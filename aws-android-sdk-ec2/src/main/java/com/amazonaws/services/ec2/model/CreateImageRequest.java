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
 * Creates an Amazon EBS-backed AMI from an Amazon EBS-backed instance that is
 * either running or stopped.
 * </p>
 * <p>
 * If you customized your instance with instance store volumes or EBS volumes in
 * addition to the root device volume, the new AMI contains block device mapping
 * information for those volumes. When you launch an instance from this new AMI,
 * the instance automatically launches with those additional volumes.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami-ebs.html"
 * >Creating Amazon EBS-Backed Linux AMIs</a> in the <i>Amazon Elastic Compute
 * Cloud User Guide</i>.
 * </p>
 */
public class CreateImageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The block device mappings. This parameter cannot be used to modify the
     * encryption status of existing volumes or snapshots. To create an AMI with
     * encrypted snapshots, use the <a>CopyImage</a> action.
     * </p>
     */
    private java.util.List<BlockDeviceMapping> blockDeviceMappings;

    /**
     * <p>
     * A description for the new image.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * A name for the new image.
     * </p>
     * <p>
     * Constraints: 3-128 alphanumeric characters, parentheses (()), square
     * brackets ([]), spaces ( ), periods (.), slashes (/), dashes (-), single
     * quotes ('), at-signs (@), or underscores(_)
     * </p>
     */
    private String name;

    /**
     * <p>
     * By default, Amazon EC2 attempts to shut down and reboot the instance
     * before creating the image. If the 'No Reboot' option is set, Amazon EC2
     * doesn't shut down the instance before creating the image. When this
     * option is used, file system integrity on the created image can't be
     * guaranteed.
     * </p>
     */
    private Boolean noReboot;

    /**
     * <p>
     * The block device mappings. This parameter cannot be used to modify the
     * encryption status of existing volumes or snapshots. To create an AMI with
     * encrypted snapshots, use the <a>CopyImage</a> action.
     * </p>
     *
     * @return <p>
     *         The block device mappings. This parameter cannot be used to
     *         modify the encryption status of existing volumes or snapshots. To
     *         create an AMI with encrypted snapshots, use the <a>CopyImage</a>
     *         action.
     *         </p>
     */
    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        return blockDeviceMappings;
    }

    /**
     * <p>
     * The block device mappings. This parameter cannot be used to modify the
     * encryption status of existing volumes or snapshots. To create an AMI with
     * encrypted snapshots, use the <a>CopyImage</a> action.
     * </p>
     *
     * @param blockDeviceMappings <p>
     *            The block device mappings. This parameter cannot be used to
     *            modify the encryption status of existing volumes or snapshots.
     *            To create an AMI with encrypted snapshots, use the
     *            <a>CopyImage</a> action.
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
     * The block device mappings. This parameter cannot be used to modify the
     * encryption status of existing volumes or snapshots. To create an AMI with
     * encrypted snapshots, use the <a>CopyImage</a> action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockDeviceMappings <p>
     *            The block device mappings. This parameter cannot be used to
     *            modify the encryption status of existing volumes or snapshots.
     *            To create an AMI with encrypted snapshots, use the
     *            <a>CopyImage</a> action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateImageRequest withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
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
     * The block device mappings. This parameter cannot be used to modify the
     * encryption status of existing volumes or snapshots. To create an AMI with
     * encrypted snapshots, use the <a>CopyImage</a> action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockDeviceMappings <p>
     *            The block device mappings. This parameter cannot be used to
     *            modify the encryption status of existing volumes or snapshots.
     *            To create an AMI with encrypted snapshots, use the
     *            <a>CopyImage</a> action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateImageRequest withBlockDeviceMappings(
            java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * A description for the new image.
     * </p>
     *
     * @return <p>
     *         A description for the new image.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description for the new image.
     * </p>
     *
     * @param description <p>
     *            A description for the new image.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the new image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description for the new image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateImageRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateImageRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
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
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateImageRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * A name for the new image.
     * </p>
     * <p>
     * Constraints: 3-128 alphanumeric characters, parentheses (()), square
     * brackets ([]), spaces ( ), periods (.), slashes (/), dashes (-), single
     * quotes ('), at-signs (@), or underscores(_)
     * </p>
     *
     * @return <p>
     *         A name for the new image.
     *         </p>
     *         <p>
     *         Constraints: 3-128 alphanumeric characters, parentheses (()),
     *         square brackets ([]), spaces ( ), periods (.), slashes (/),
     *         dashes (-), single quotes ('), at-signs (@), or underscores(_)
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A name for the new image.
     * </p>
     * <p>
     * Constraints: 3-128 alphanumeric characters, parentheses (()), square
     * brackets ([]), spaces ( ), periods (.), slashes (/), dashes (-), single
     * quotes ('), at-signs (@), or underscores(_)
     * </p>
     *
     * @param name <p>
     *            A name for the new image.
     *            </p>
     *            <p>
     *            Constraints: 3-128 alphanumeric characters, parentheses (()),
     *            square brackets ([]), spaces ( ), periods (.), slashes (/),
     *            dashes (-), single quotes ('), at-signs (@), or underscores(_)
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the new image.
     * </p>
     * <p>
     * Constraints: 3-128 alphanumeric characters, parentheses (()), square
     * brackets ([]), spaces ( ), periods (.), slashes (/), dashes (-), single
     * quotes ('), at-signs (@), or underscores(_)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            A name for the new image.
     *            </p>
     *            <p>
     *            Constraints: 3-128 alphanumeric characters, parentheses (()),
     *            square brackets ([]), spaces ( ), periods (.), slashes (/),
     *            dashes (-), single quotes ('), at-signs (@), or underscores(_)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateImageRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * By default, Amazon EC2 attempts to shut down and reboot the instance
     * before creating the image. If the 'No Reboot' option is set, Amazon EC2
     * doesn't shut down the instance before creating the image. When this
     * option is used, file system integrity on the created image can't be
     * guaranteed.
     * </p>
     *
     * @return <p>
     *         By default, Amazon EC2 attempts to shut down and reboot the
     *         instance before creating the image. If the 'No Reboot' option is
     *         set, Amazon EC2 doesn't shut down the instance before creating
     *         the image. When this option is used, file system integrity on the
     *         created image can't be guaranteed.
     *         </p>
     */
    public Boolean isNoReboot() {
        return noReboot;
    }

    /**
     * <p>
     * By default, Amazon EC2 attempts to shut down and reboot the instance
     * before creating the image. If the 'No Reboot' option is set, Amazon EC2
     * doesn't shut down the instance before creating the image. When this
     * option is used, file system integrity on the created image can't be
     * guaranteed.
     * </p>
     *
     * @return <p>
     *         By default, Amazon EC2 attempts to shut down and reboot the
     *         instance before creating the image. If the 'No Reboot' option is
     *         set, Amazon EC2 doesn't shut down the instance before creating
     *         the image. When this option is used, file system integrity on the
     *         created image can't be guaranteed.
     *         </p>
     */
    public Boolean getNoReboot() {
        return noReboot;
    }

    /**
     * <p>
     * By default, Amazon EC2 attempts to shut down and reboot the instance
     * before creating the image. If the 'No Reboot' option is set, Amazon EC2
     * doesn't shut down the instance before creating the image. When this
     * option is used, file system integrity on the created image can't be
     * guaranteed.
     * </p>
     *
     * @param noReboot <p>
     *            By default, Amazon EC2 attempts to shut down and reboot the
     *            instance before creating the image. If the 'No Reboot' option
     *            is set, Amazon EC2 doesn't shut down the instance before
     *            creating the image. When this option is used, file system
     *            integrity on the created image can't be guaranteed.
     *            </p>
     */
    public void setNoReboot(Boolean noReboot) {
        this.noReboot = noReboot;
    }

    /**
     * <p>
     * By default, Amazon EC2 attempts to shut down and reboot the instance
     * before creating the image. If the 'No Reboot' option is set, Amazon EC2
     * doesn't shut down the instance before creating the image. When this
     * option is used, file system integrity on the created image can't be
     * guaranteed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param noReboot <p>
     *            By default, Amazon EC2 attempts to shut down and reboot the
     *            instance before creating the image. If the 'No Reboot' option
     *            is set, Amazon EC2 doesn't shut down the instance before
     *            creating the image. When this option is used, file system
     *            integrity on the created image can't be guaranteed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateImageRequest withNoReboot(Boolean noReboot) {
        this.noReboot = noReboot;
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
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getNoReboot() != null)
            sb.append("NoReboot: " + getNoReboot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNoReboot() == null) ? 0 : getNoReboot().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateImageRequest == false)
            return false;
        CreateImageRequest other = (CreateImageRequest) obj;

        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null)
            return false;
        if (other.getBlockDeviceMappings() != null
                && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNoReboot() == null ^ this.getNoReboot() == null)
            return false;
        if (other.getNoReboot() != null && other.getNoReboot().equals(this.getNoReboot()) == false)
            return false;
        return true;
    }
}
