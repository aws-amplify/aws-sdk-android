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

/**
 * <p>
 * Describes an image attribute.
 * </p>
 */
public class DescribeImageAttributeResult implements Serializable {
    /**
     * <p>
     * The block device mapping entries.
     * </p>
     */
    private java.util.List<BlockDeviceMapping> blockDeviceMappings;

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     */
    private String imageId;

    /**
     * <p>
     * The launch permissions.
     * </p>
     */
    private java.util.List<LaunchPermission> launchPermissions;

    /**
     * <p>
     * The product codes.
     * </p>
     */
    private java.util.List<ProductCode> productCodes;

    /**
     * <p>
     * A description for the AMI.
     * </p>
     */
    private AttributeValue description;

    /**
     * <p>
     * The kernel ID.
     * </p>
     */
    private AttributeValue kernelId;

    /**
     * <p>
     * The RAM disk ID.
     * </p>
     */
    private AttributeValue ramdiskId;

    /**
     * <p>
     * Indicates whether enhanced networking with the Intel 82599 Virtual
     * Function interface is enabled.
     * </p>
     */
    private AttributeValue sriovNetSupport;

    /**
     * <p>
     * The block device mapping entries.
     * </p>
     *
     * @return <p>
     *         The block device mapping entries.
     *         </p>
     */
    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        return blockDeviceMappings;
    }

    /**
     * <p>
     * The block device mapping entries.
     * </p>
     *
     * @param blockDeviceMappings <p>
     *            The block device mapping entries.
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
     * The block device mapping entries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockDeviceMappings <p>
     *            The block device mapping entries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImageAttributeResult withBlockDeviceMappings(
            BlockDeviceMapping... blockDeviceMappings) {
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
     * The block device mapping entries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockDeviceMappings <p>
     *            The block device mapping entries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImageAttributeResult withBlockDeviceMappings(
            java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     *
     * @return <p>
     *         The ID of the AMI.
     *         </p>
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     *
     * @param imageId <p>
     *            The ID of the AMI.
     *            </p>
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageId <p>
     *            The ID of the AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImageAttributeResult withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * <p>
     * The launch permissions.
     * </p>
     *
     * @return <p>
     *         The launch permissions.
     *         </p>
     */
    public java.util.List<LaunchPermission> getLaunchPermissions() {
        return launchPermissions;
    }

    /**
     * <p>
     * The launch permissions.
     * </p>
     *
     * @param launchPermissions <p>
     *            The launch permissions.
     *            </p>
     */
    public void setLaunchPermissions(java.util.Collection<LaunchPermission> launchPermissions) {
        if (launchPermissions == null) {
            this.launchPermissions = null;
            return;
        }

        this.launchPermissions = new java.util.ArrayList<LaunchPermission>(launchPermissions);
    }

    /**
     * <p>
     * The launch permissions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchPermissions <p>
     *            The launch permissions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImageAttributeResult withLaunchPermissions(LaunchPermission... launchPermissions) {
        if (getLaunchPermissions() == null) {
            this.launchPermissions = new java.util.ArrayList<LaunchPermission>(
                    launchPermissions.length);
        }
        for (LaunchPermission value : launchPermissions) {
            this.launchPermissions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The launch permissions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchPermissions <p>
     *            The launch permissions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImageAttributeResult withLaunchPermissions(
            java.util.Collection<LaunchPermission> launchPermissions) {
        setLaunchPermissions(launchPermissions);
        return this;
    }

    /**
     * <p>
     * The product codes.
     * </p>
     *
     * @return <p>
     *         The product codes.
     *         </p>
     */
    public java.util.List<ProductCode> getProductCodes() {
        return productCodes;
    }

    /**
     * <p>
     * The product codes.
     * </p>
     *
     * @param productCodes <p>
     *            The product codes.
     *            </p>
     */
    public void setProductCodes(java.util.Collection<ProductCode> productCodes) {
        if (productCodes == null) {
            this.productCodes = null;
            return;
        }

        this.productCodes = new java.util.ArrayList<ProductCode>(productCodes);
    }

    /**
     * <p>
     * The product codes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productCodes <p>
     *            The product codes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImageAttributeResult withProductCodes(ProductCode... productCodes) {
        if (getProductCodes() == null) {
            this.productCodes = new java.util.ArrayList<ProductCode>(productCodes.length);
        }
        for (ProductCode value : productCodes) {
            this.productCodes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The product codes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productCodes <p>
     *            The product codes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImageAttributeResult withProductCodes(
            java.util.Collection<ProductCode> productCodes) {
        setProductCodes(productCodes);
        return this;
    }

    /**
     * <p>
     * A description for the AMI.
     * </p>
     *
     * @return <p>
     *         A description for the AMI.
     *         </p>
     */
    public AttributeValue getDescription() {
        return description;
    }

    /**
     * <p>
     * A description for the AMI.
     * </p>
     *
     * @param description <p>
     *            A description for the AMI.
     *            </p>
     */
    public void setDescription(AttributeValue description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description for the AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImageAttributeResult withDescription(AttributeValue description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The kernel ID.
     * </p>
     *
     * @return <p>
     *         The kernel ID.
     *         </p>
     */
    public AttributeValue getKernelId() {
        return kernelId;
    }

    /**
     * <p>
     * The kernel ID.
     * </p>
     *
     * @param kernelId <p>
     *            The kernel ID.
     *            </p>
     */
    public void setKernelId(AttributeValue kernelId) {
        this.kernelId = kernelId;
    }

    /**
     * <p>
     * The kernel ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kernelId <p>
     *            The kernel ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImageAttributeResult withKernelId(AttributeValue kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    /**
     * <p>
     * The RAM disk ID.
     * </p>
     *
     * @return <p>
     *         The RAM disk ID.
     *         </p>
     */
    public AttributeValue getRamdiskId() {
        return ramdiskId;
    }

    /**
     * <p>
     * The RAM disk ID.
     * </p>
     *
     * @param ramdiskId <p>
     *            The RAM disk ID.
     *            </p>
     */
    public void setRamdiskId(AttributeValue ramdiskId) {
        this.ramdiskId = ramdiskId;
    }

    /**
     * <p>
     * The RAM disk ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ramdiskId <p>
     *            The RAM disk ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImageAttributeResult withRamdiskId(AttributeValue ramdiskId) {
        this.ramdiskId = ramdiskId;
        return this;
    }

    /**
     * <p>
     * Indicates whether enhanced networking with the Intel 82599 Virtual
     * Function interface is enabled.
     * </p>
     *
     * @return <p>
     *         Indicates whether enhanced networking with the Intel 82599
     *         Virtual Function interface is enabled.
     *         </p>
     */
    public AttributeValue getSriovNetSupport() {
        return sriovNetSupport;
    }

    /**
     * <p>
     * Indicates whether enhanced networking with the Intel 82599 Virtual
     * Function interface is enabled.
     * </p>
     *
     * @param sriovNetSupport <p>
     *            Indicates whether enhanced networking with the Intel 82599
     *            Virtual Function interface is enabled.
     *            </p>
     */
    public void setSriovNetSupport(AttributeValue sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
    }

    /**
     * <p>
     * Indicates whether enhanced networking with the Intel 82599 Virtual
     * Function interface is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sriovNetSupport <p>
     *            Indicates whether enhanced networking with the Intel 82599
     *            Virtual Function interface is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImageAttributeResult withSriovNetSupport(AttributeValue sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
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
        if (getImageId() != null)
            sb.append("ImageId: " + getImageId() + ",");
        if (getLaunchPermissions() != null)
            sb.append("LaunchPermissions: " + getLaunchPermissions() + ",");
        if (getProductCodes() != null)
            sb.append("ProductCodes: " + getProductCodes() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getKernelId() != null)
            sb.append("KernelId: " + getKernelId() + ",");
        if (getRamdiskId() != null)
            sb.append("RamdiskId: " + getRamdiskId() + ",");
        if (getSriovNetSupport() != null)
            sb.append("SriovNetSupport: " + getSriovNetSupport());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode
                + ((getLaunchPermissions() == null) ? 0 : getLaunchPermissions().hashCode());
        hashCode = prime * hashCode
                + ((getProductCodes() == null) ? 0 : getProductCodes().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode());
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode());
        hashCode = prime * hashCode
                + ((getSriovNetSupport() == null) ? 0 : getSriovNetSupport().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeImageAttributeResult == false)
            return false;
        DescribeImageAttributeResult other = (DescribeImageAttributeResult) obj;

        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null)
            return false;
        if (other.getBlockDeviceMappings() != null
                && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getLaunchPermissions() == null ^ this.getLaunchPermissions() == null)
            return false;
        if (other.getLaunchPermissions() != null
                && other.getLaunchPermissions().equals(this.getLaunchPermissions()) == false)
            return false;
        if (other.getProductCodes() == null ^ this.getProductCodes() == null)
            return false;
        if (other.getProductCodes() != null
                && other.getProductCodes().equals(this.getProductCodes()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
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
        if (other.getSriovNetSupport() == null ^ this.getSriovNetSupport() == null)
            return false;
        if (other.getSriovNetSupport() != null
                && other.getSriovNetSupport().equals(this.getSriovNetSupport()) == false)
            return false;
        return true;
    }
}
