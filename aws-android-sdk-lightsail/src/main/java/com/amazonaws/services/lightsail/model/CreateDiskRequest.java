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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a block storage disk that can be attached to an Amazon Lightsail
 * instance in the same Availability Zone (e.g., <code>us-east-2a</code>).
 * </p>
 * <p>
 * The <code>create disk</code> operation supports tag-based access control via
 * request tags. For more information, see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public class CreateDiskRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique Lightsail disk name (e.g., <code>my-disk</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String diskName;

    /**
     * <p>
     * The Availability Zone where you want to create the disk (e.g.,
     * <code>us-east-2a</code>). Use the same Availability Zone as the Lightsail
     * instance to which you want to attach the disk.
     * </p>
     * <p>
     * Use the <code>get regions</code> operation to list the Availability Zones
     * where Lightsail is currently available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String availabilityZone;

    /**
     * <p>
     * The size of the disk in GB (e.g., <code>32</code>).
     * </p>
     */
    private Integer sizeInGb;

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the
     * <code>tag resource</code> operation.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * An array of objects that represent the add-ons to enable for the new
     * disk.
     * </p>
     */
    private java.util.List<AddOnRequest> addOns;

    /**
     * <p>
     * The unique Lightsail disk name (e.g., <code>my-disk</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The unique Lightsail disk name (e.g., <code>my-disk</code>).
     *         </p>
     */
    public String getDiskName() {
        return diskName;
    }

    /**
     * <p>
     * The unique Lightsail disk name (e.g., <code>my-disk</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param diskName <p>
     *            The unique Lightsail disk name (e.g., <code>my-disk</code>).
     *            </p>
     */
    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    /**
     * <p>
     * The unique Lightsail disk name (e.g., <code>my-disk</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param diskName <p>
     *            The unique Lightsail disk name (e.g., <code>my-disk</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDiskRequest withDiskName(String diskName) {
        this.diskName = diskName;
        return this;
    }

    /**
     * <p>
     * The Availability Zone where you want to create the disk (e.g.,
     * <code>us-east-2a</code>). Use the same Availability Zone as the Lightsail
     * instance to which you want to attach the disk.
     * </p>
     * <p>
     * Use the <code>get regions</code> operation to list the Availability Zones
     * where Lightsail is currently available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Availability Zone where you want to create the disk (e.g.,
     *         <code>us-east-2a</code>). Use the same Availability Zone as the
     *         Lightsail instance to which you want to attach the disk.
     *         </p>
     *         <p>
     *         Use the <code>get regions</code> operation to list the
     *         Availability Zones where Lightsail is currently available.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where you want to create the disk (e.g.,
     * <code>us-east-2a</code>). Use the same Availability Zone as the Lightsail
     * instance to which you want to attach the disk.
     * </p>
     * <p>
     * Use the <code>get regions</code> operation to list the Availability Zones
     * where Lightsail is currently available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param availabilityZone <p>
     *            The Availability Zone where you want to create the disk (e.g.,
     *            <code>us-east-2a</code>). Use the same Availability Zone as
     *            the Lightsail instance to which you want to attach the disk.
     *            </p>
     *            <p>
     *            Use the <code>get regions</code> operation to list the
     *            Availability Zones where Lightsail is currently available.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where you want to create the disk (e.g.,
     * <code>us-east-2a</code>). Use the same Availability Zone as the Lightsail
     * instance to which you want to attach the disk.
     * </p>
     * <p>
     * Use the <code>get regions</code> operation to list the Availability Zones
     * where Lightsail is currently available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param availabilityZone <p>
     *            The Availability Zone where you want to create the disk (e.g.,
     *            <code>us-east-2a</code>). Use the same Availability Zone as
     *            the Lightsail instance to which you want to attach the disk.
     *            </p>
     *            <p>
     *            Use the <code>get regions</code> operation to list the
     *            Availability Zones where Lightsail is currently available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDiskRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The size of the disk in GB (e.g., <code>32</code>).
     * </p>
     *
     * @return <p>
     *         The size of the disk in GB (e.g., <code>32</code>).
     *         </p>
     */
    public Integer getSizeInGb() {
        return sizeInGb;
    }

    /**
     * <p>
     * The size of the disk in GB (e.g., <code>32</code>).
     * </p>
     *
     * @param sizeInGb <p>
     *            The size of the disk in GB (e.g., <code>32</code>).
     *            </p>
     */
    public void setSizeInGb(Integer sizeInGb) {
        this.sizeInGb = sizeInGb;
    }

    /**
     * <p>
     * The size of the disk in GB (e.g., <code>32</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sizeInGb <p>
     *            The size of the disk in GB (e.g., <code>32</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDiskRequest withSizeInGb(Integer sizeInGb) {
        this.sizeInGb = sizeInGb;
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the
     * <code>tag resource</code> operation.
     * </p>
     *
     * @return <p>
     *         The tag keys and optional values to add to the resource during
     *         create.
     *         </p>
     *         <p>
     *         To tag a resource after it has been created, see the
     *         <code>tag resource</code> operation.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the
     * <code>tag resource</code> operation.
     * </p>
     *
     * @param tags <p>
     *            The tag keys and optional values to add to the resource during
     *            create.
     *            </p>
     *            <p>
     *            To tag a resource after it has been created, see the
     *            <code>tag resource</code> operation.
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
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the
     * <code>tag resource</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tag keys and optional values to add to the resource during
     *            create.
     *            </p>
     *            <p>
     *            To tag a resource after it has been created, see the
     *            <code>tag resource</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDiskRequest withTags(Tag... tags) {
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
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the
     * <code>tag resource</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tag keys and optional values to add to the resource during
     *            create.
     *            </p>
     *            <p>
     *            To tag a resource after it has been created, see the
     *            <code>tag resource</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDiskRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * An array of objects that represent the add-ons to enable for the new
     * disk.
     * </p>
     *
     * @return <p>
     *         An array of objects that represent the add-ons to enable for the
     *         new disk.
     *         </p>
     */
    public java.util.List<AddOnRequest> getAddOns() {
        return addOns;
    }

    /**
     * <p>
     * An array of objects that represent the add-ons to enable for the new
     * disk.
     * </p>
     *
     * @param addOns <p>
     *            An array of objects that represent the add-ons to enable for
     *            the new disk.
     *            </p>
     */
    public void setAddOns(java.util.Collection<AddOnRequest> addOns) {
        if (addOns == null) {
            this.addOns = null;
            return;
        }

        this.addOns = new java.util.ArrayList<AddOnRequest>(addOns);
    }

    /**
     * <p>
     * An array of objects that represent the add-ons to enable for the new
     * disk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addOns <p>
     *            An array of objects that represent the add-ons to enable for
     *            the new disk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDiskRequest withAddOns(AddOnRequest... addOns) {
        if (getAddOns() == null) {
            this.addOns = new java.util.ArrayList<AddOnRequest>(addOns.length);
        }
        for (AddOnRequest value : addOns) {
            this.addOns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that represent the add-ons to enable for the new
     * disk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addOns <p>
     *            An array of objects that represent the add-ons to enable for
     *            the new disk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDiskRequest withAddOns(java.util.Collection<AddOnRequest> addOns) {
        setAddOns(addOns);
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
        if (getDiskName() != null)
            sb.append("diskName: " + getDiskName() + ",");
        if (getAvailabilityZone() != null)
            sb.append("availabilityZone: " + getAvailabilityZone() + ",");
        if (getSizeInGb() != null)
            sb.append("sizeInGb: " + getSizeInGb() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getAddOns() != null)
            sb.append("addOns: " + getAddOns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDiskName() == null) ? 0 : getDiskName().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getSizeInGb() == null) ? 0 : getSizeInGb().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getAddOns() == null) ? 0 : getAddOns().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDiskRequest == false)
            return false;
        CreateDiskRequest other = (CreateDiskRequest) obj;

        if (other.getDiskName() == null ^ this.getDiskName() == null)
            return false;
        if (other.getDiskName() != null && other.getDiskName().equals(this.getDiskName()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getSizeInGb() == null ^ this.getSizeInGb() == null)
            return false;
        if (other.getSizeInGb() != null && other.getSizeInGb().equals(this.getSizeInGb()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getAddOns() == null ^ this.getAddOns() == null)
            return false;
        if (other.getAddOns() != null && other.getAddOns().equals(this.getAddOns()) == false)
            return false;
        return true;
    }
}
