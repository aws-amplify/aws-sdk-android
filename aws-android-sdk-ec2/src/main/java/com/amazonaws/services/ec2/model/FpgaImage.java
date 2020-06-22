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
 * Describes an Amazon FPGA image (AFI).
 * </p>
 */
public class FpgaImage implements Serializable {
    /**
     * <p>
     * The FPGA image identifier (AFI ID).
     * </p>
     */
    private String fpgaImageId;

    /**
     * <p>
     * The global FPGA image identifier (AGFI ID).
     * </p>
     */
    private String fpgaImageGlobalId;

    /**
     * <p>
     * The name of the AFI.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The description of the AFI.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The version of the AWS Shell that was used to create the bitstream.
     * </p>
     */
    private String shellVersion;

    /**
     * <p>
     * Information about the PCI bus.
     * </p>
     */
    private PciId pciId;

    /**
     * <p>
     * Information about the state of the AFI.
     * </p>
     */
    private FpgaImageState state;

    /**
     * <p>
     * The date and time the AFI was created.
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * The time of the most recent update to the AFI.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The AWS account ID of the AFI owner.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * The alias of the AFI owner. Possible values include <code>self</code>,
     * <code>amazon</code>, and <code>aws-marketplace</code>.
     * </p>
     */
    private String ownerAlias;

    /**
     * <p>
     * The product codes for the AFI.
     * </p>
     */
    private java.util.List<ProductCode> productCodes;

    /**
     * <p>
     * Any tags assigned to the AFI.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Indicates whether the AFI is public.
     * </p>
     */
    private Boolean publicValue;

    /**
     * <p>
     * Indicates whether data retention support is enabled for the AFI.
     * </p>
     */
    private Boolean dataRetentionSupport;

    /**
     * <p>
     * The FPGA image identifier (AFI ID).
     * </p>
     *
     * @return <p>
     *         The FPGA image identifier (AFI ID).
     *         </p>
     */
    public String getFpgaImageId() {
        return fpgaImageId;
    }

    /**
     * <p>
     * The FPGA image identifier (AFI ID).
     * </p>
     *
     * @param fpgaImageId <p>
     *            The FPGA image identifier (AFI ID).
     *            </p>
     */
    public void setFpgaImageId(String fpgaImageId) {
        this.fpgaImageId = fpgaImageId;
    }

    /**
     * <p>
     * The FPGA image identifier (AFI ID).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fpgaImageId <p>
     *            The FPGA image identifier (AFI ID).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FpgaImage withFpgaImageId(String fpgaImageId) {
        this.fpgaImageId = fpgaImageId;
        return this;
    }

    /**
     * <p>
     * The global FPGA image identifier (AGFI ID).
     * </p>
     *
     * @return <p>
     *         The global FPGA image identifier (AGFI ID).
     *         </p>
     */
    public String getFpgaImageGlobalId() {
        return fpgaImageGlobalId;
    }

    /**
     * <p>
     * The global FPGA image identifier (AGFI ID).
     * </p>
     *
     * @param fpgaImageGlobalId <p>
     *            The global FPGA image identifier (AGFI ID).
     *            </p>
     */
    public void setFpgaImageGlobalId(String fpgaImageGlobalId) {
        this.fpgaImageGlobalId = fpgaImageGlobalId;
    }

    /**
     * <p>
     * The global FPGA image identifier (AGFI ID).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fpgaImageGlobalId <p>
     *            The global FPGA image identifier (AGFI ID).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FpgaImage withFpgaImageGlobalId(String fpgaImageGlobalId) {
        this.fpgaImageGlobalId = fpgaImageGlobalId;
        return this;
    }

    /**
     * <p>
     * The name of the AFI.
     * </p>
     *
     * @return <p>
     *         The name of the AFI.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the AFI.
     * </p>
     *
     * @param name <p>
     *            The name of the AFI.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the AFI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the AFI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FpgaImage withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the AFI.
     * </p>
     *
     * @return <p>
     *         The description of the AFI.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the AFI.
     * </p>
     *
     * @param description <p>
     *            The description of the AFI.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the AFI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the AFI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FpgaImage withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The version of the AWS Shell that was used to create the bitstream.
     * </p>
     *
     * @return <p>
     *         The version of the AWS Shell that was used to create the
     *         bitstream.
     *         </p>
     */
    public String getShellVersion() {
        return shellVersion;
    }

    /**
     * <p>
     * The version of the AWS Shell that was used to create the bitstream.
     * </p>
     *
     * @param shellVersion <p>
     *            The version of the AWS Shell that was used to create the
     *            bitstream.
     *            </p>
     */
    public void setShellVersion(String shellVersion) {
        this.shellVersion = shellVersion;
    }

    /**
     * <p>
     * The version of the AWS Shell that was used to create the bitstream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param shellVersion <p>
     *            The version of the AWS Shell that was used to create the
     *            bitstream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FpgaImage withShellVersion(String shellVersion) {
        this.shellVersion = shellVersion;
        return this;
    }

    /**
     * <p>
     * Information about the PCI bus.
     * </p>
     *
     * @return <p>
     *         Information about the PCI bus.
     *         </p>
     */
    public PciId getPciId() {
        return pciId;
    }

    /**
     * <p>
     * Information about the PCI bus.
     * </p>
     *
     * @param pciId <p>
     *            Information about the PCI bus.
     *            </p>
     */
    public void setPciId(PciId pciId) {
        this.pciId = pciId;
    }

    /**
     * <p>
     * Information about the PCI bus.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pciId <p>
     *            Information about the PCI bus.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FpgaImage withPciId(PciId pciId) {
        this.pciId = pciId;
        return this;
    }

    /**
     * <p>
     * Information about the state of the AFI.
     * </p>
     *
     * @return <p>
     *         Information about the state of the AFI.
     *         </p>
     */
    public FpgaImageState getState() {
        return state;
    }

    /**
     * <p>
     * Information about the state of the AFI.
     * </p>
     *
     * @param state <p>
     *            Information about the state of the AFI.
     *            </p>
     */
    public void setState(FpgaImageState state) {
        this.state = state;
    }

    /**
     * <p>
     * Information about the state of the AFI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param state <p>
     *            Information about the state of the AFI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FpgaImage withState(FpgaImageState state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The date and time the AFI was created.
     * </p>
     *
     * @return <p>
     *         The date and time the AFI was created.
     *         </p>
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * <p>
     * The date and time the AFI was created.
     * </p>
     *
     * @param createTime <p>
     *            The date and time the AFI was created.
     *            </p>
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The date and time the AFI was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createTime <p>
     *            The date and time the AFI was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FpgaImage withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * <p>
     * The time of the most recent update to the AFI.
     * </p>
     *
     * @return <p>
     *         The time of the most recent update to the AFI.
     *         </p>
     */
    public java.util.Date getUpdateTime() {
        return updateTime;
    }

    /**
     * <p>
     * The time of the most recent update to the AFI.
     * </p>
     *
     * @param updateTime <p>
     *            The time of the most recent update to the AFI.
     *            </p>
     */
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The time of the most recent update to the AFI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateTime <p>
     *            The time of the most recent update to the AFI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FpgaImage withUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the AFI owner.
     * </p>
     *
     * @return <p>
     *         The AWS account ID of the AFI owner.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the AFI owner.
     * </p>
     *
     * @param ownerId <p>
     *            The AWS account ID of the AFI owner.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the AFI owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerId <p>
     *            The AWS account ID of the AFI owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FpgaImage withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * <p>
     * The alias of the AFI owner. Possible values include <code>self</code>,
     * <code>amazon</code>, and <code>aws-marketplace</code>.
     * </p>
     *
     * @return <p>
     *         The alias of the AFI owner. Possible values include
     *         <code>self</code>, <code>amazon</code>, and
     *         <code>aws-marketplace</code>.
     *         </p>
     */
    public String getOwnerAlias() {
        return ownerAlias;
    }

    /**
     * <p>
     * The alias of the AFI owner. Possible values include <code>self</code>,
     * <code>amazon</code>, and <code>aws-marketplace</code>.
     * </p>
     *
     * @param ownerAlias <p>
     *            The alias of the AFI owner. Possible values include
     *            <code>self</code>, <code>amazon</code>, and
     *            <code>aws-marketplace</code>.
     *            </p>
     */
    public void setOwnerAlias(String ownerAlias) {
        this.ownerAlias = ownerAlias;
    }

    /**
     * <p>
     * The alias of the AFI owner. Possible values include <code>self</code>,
     * <code>amazon</code>, and <code>aws-marketplace</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerAlias <p>
     *            The alias of the AFI owner. Possible values include
     *            <code>self</code>, <code>amazon</code>, and
     *            <code>aws-marketplace</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FpgaImage withOwnerAlias(String ownerAlias) {
        this.ownerAlias = ownerAlias;
        return this;
    }

    /**
     * <p>
     * The product codes for the AFI.
     * </p>
     *
     * @return <p>
     *         The product codes for the AFI.
     *         </p>
     */
    public java.util.List<ProductCode> getProductCodes() {
        return productCodes;
    }

    /**
     * <p>
     * The product codes for the AFI.
     * </p>
     *
     * @param productCodes <p>
     *            The product codes for the AFI.
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
     * The product codes for the AFI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productCodes <p>
     *            The product codes for the AFI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FpgaImage withProductCodes(ProductCode... productCodes) {
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
     * The product codes for the AFI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productCodes <p>
     *            The product codes for the AFI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FpgaImage withProductCodes(java.util.Collection<ProductCode> productCodes) {
        setProductCodes(productCodes);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the AFI.
     * </p>
     *
     * @return <p>
     *         Any tags assigned to the AFI.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the AFI.
     * </p>
     *
     * @param tags <p>
     *            Any tags assigned to the AFI.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags assigned to the AFI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the AFI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FpgaImage withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the AFI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the AFI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FpgaImage withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Indicates whether the AFI is public.
     * </p>
     *
     * @return <p>
     *         Indicates whether the AFI is public.
     *         </p>
     */
    public Boolean isPublic() {
        return publicValue;
    }

    /**
     * <p>
     * Indicates whether the AFI is public.
     * </p>
     *
     * @return <p>
     *         Indicates whether the AFI is public.
     *         </p>
     */
    public Boolean getPublic() {
        return publicValue;
    }

    /**
     * <p>
     * Indicates whether the AFI is public.
     * </p>
     *
     * @param publicValue <p>
     *            Indicates whether the AFI is public.
     *            </p>
     */
    public void setPublic(Boolean publicValue) {
        this.publicValue = publicValue;
    }

    /**
     * <p>
     * Indicates whether the AFI is public.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicValue <p>
     *            Indicates whether the AFI is public.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FpgaImage withPublic(Boolean publicValue) {
        this.publicValue = publicValue;
        return this;
    }

    /**
     * <p>
     * Indicates whether data retention support is enabled for the AFI.
     * </p>
     *
     * @return <p>
     *         Indicates whether data retention support is enabled for the AFI.
     *         </p>
     */
    public Boolean isDataRetentionSupport() {
        return dataRetentionSupport;
    }

    /**
     * <p>
     * Indicates whether data retention support is enabled for the AFI.
     * </p>
     *
     * @return <p>
     *         Indicates whether data retention support is enabled for the AFI.
     *         </p>
     */
    public Boolean getDataRetentionSupport() {
        return dataRetentionSupport;
    }

    /**
     * <p>
     * Indicates whether data retention support is enabled for the AFI.
     * </p>
     *
     * @param dataRetentionSupport <p>
     *            Indicates whether data retention support is enabled for the
     *            AFI.
     *            </p>
     */
    public void setDataRetentionSupport(Boolean dataRetentionSupport) {
        this.dataRetentionSupport = dataRetentionSupport;
    }

    /**
     * <p>
     * Indicates whether data retention support is enabled for the AFI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataRetentionSupport <p>
     *            Indicates whether data retention support is enabled for the
     *            AFI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FpgaImage withDataRetentionSupport(Boolean dataRetentionSupport) {
        this.dataRetentionSupport = dataRetentionSupport;
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
        if (getFpgaImageId() != null)
            sb.append("FpgaImageId: " + getFpgaImageId() + ",");
        if (getFpgaImageGlobalId() != null)
            sb.append("FpgaImageGlobalId: " + getFpgaImageGlobalId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getShellVersion() != null)
            sb.append("ShellVersion: " + getShellVersion() + ",");
        if (getPciId() != null)
            sb.append("PciId: " + getPciId() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getCreateTime() != null)
            sb.append("CreateTime: " + getCreateTime() + ",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: " + getUpdateTime() + ",");
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getOwnerAlias() != null)
            sb.append("OwnerAlias: " + getOwnerAlias() + ",");
        if (getProductCodes() != null)
            sb.append("ProductCodes: " + getProductCodes() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getPublic() != null)
            sb.append("Public: " + getPublic() + ",");
        if (getDataRetentionSupport() != null)
            sb.append("DataRetentionSupport: " + getDataRetentionSupport());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFpgaImageId() == null) ? 0 : getFpgaImageId().hashCode());
        hashCode = prime * hashCode
                + ((getFpgaImageGlobalId() == null) ? 0 : getFpgaImageGlobalId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getShellVersion() == null) ? 0 : getShellVersion().hashCode());
        hashCode = prime * hashCode + ((getPciId() == null) ? 0 : getPciId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getOwnerAlias() == null) ? 0 : getOwnerAlias().hashCode());
        hashCode = prime * hashCode
                + ((getProductCodes() == null) ? 0 : getProductCodes().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getPublic() == null) ? 0 : getPublic().hashCode());
        hashCode = prime * hashCode
                + ((getDataRetentionSupport() == null) ? 0 : getDataRetentionSupport().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FpgaImage == false)
            return false;
        FpgaImage other = (FpgaImage) obj;

        if (other.getFpgaImageId() == null ^ this.getFpgaImageId() == null)
            return false;
        if (other.getFpgaImageId() != null
                && other.getFpgaImageId().equals(this.getFpgaImageId()) == false)
            return false;
        if (other.getFpgaImageGlobalId() == null ^ this.getFpgaImageGlobalId() == null)
            return false;
        if (other.getFpgaImageGlobalId() != null
                && other.getFpgaImageGlobalId().equals(this.getFpgaImageGlobalId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getShellVersion() == null ^ this.getShellVersion() == null)
            return false;
        if (other.getShellVersion() != null
                && other.getShellVersion().equals(this.getShellVersion()) == false)
            return false;
        if (other.getPciId() == null ^ this.getPciId() == null)
            return false;
        if (other.getPciId() != null && other.getPciId().equals(this.getPciId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null
                && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null
                && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getOwnerAlias() == null ^ this.getOwnerAlias() == null)
            return false;
        if (other.getOwnerAlias() != null
                && other.getOwnerAlias().equals(this.getOwnerAlias()) == false)
            return false;
        if (other.getProductCodes() == null ^ this.getProductCodes() == null)
            return false;
        if (other.getProductCodes() != null
                && other.getProductCodes().equals(this.getProductCodes()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getPublic() == null ^ this.getPublic() == null)
            return false;
        if (other.getPublic() != null && other.getPublic().equals(this.getPublic()) == false)
            return false;
        if (other.getDataRetentionSupport() == null ^ this.getDataRetentionSupport() == null)
            return false;
        if (other.getDataRetentionSupport() != null
                && other.getDataRetentionSupport().equals(this.getDataRetentionSupport()) == false)
            return false;
        return true;
    }
}
