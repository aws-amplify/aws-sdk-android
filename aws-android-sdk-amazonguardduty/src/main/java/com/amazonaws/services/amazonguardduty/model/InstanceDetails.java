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

package com.amazonaws.services.amazonguardduty.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the details of an instance.
 * </p>
 */
public class InstanceDetails implements Serializable {
    /**
     * <p>
     * The Availability Zone of the EC2 instance.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The profile information of the EC2 instance.
     * </p>
     */
    private IamInstanceProfile iamInstanceProfile;

    /**
     * <p>
     * The image description of the EC2 instance.
     * </p>
     */
    private String imageDescription;

    /**
     * <p>
     * The image ID of the EC2 instance.
     * </p>
     */
    private String imageId;

    /**
     * <p>
     * The ID of the EC2 instance.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The state of the EC2 instance.
     * </p>
     */
    private String instanceState;

    /**
     * <p>
     * The type of the EC2 instance.
     * </p>
     */
    private String instanceType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Outpost. Only applicable to AWS
     * Outposts instances.
     * </p>
     */
    private String outpostArn;

    /**
     * <p>
     * The launch time of the EC2 instance.
     * </p>
     */
    private String launchTime;

    /**
     * <p>
     * The elastic network interface information of the EC2 instance.
     * </p>
     */
    private java.util.List<NetworkInterface> networkInterfaces;

    /**
     * <p>
     * The platform of the EC2 instance.
     * </p>
     */
    private String platform;

    /**
     * <p>
     * The product code of the EC2 instance.
     * </p>
     */
    private java.util.List<ProductCode> productCodes;

    /**
     * <p>
     * The tags of the EC2 instance.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Availability Zone of the EC2 instance.
     * </p>
     *
     * @return <p>
     *         The Availability Zone of the EC2 instance.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the EC2 instance.
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone of the EC2 instance.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone of the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceDetails withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The profile information of the EC2 instance.
     * </p>
     *
     * @return <p>
     *         The profile information of the EC2 instance.
     *         </p>
     */
    public IamInstanceProfile getIamInstanceProfile() {
        return iamInstanceProfile;
    }

    /**
     * <p>
     * The profile information of the EC2 instance.
     * </p>
     *
     * @param iamInstanceProfile <p>
     *            The profile information of the EC2 instance.
     *            </p>
     */
    public void setIamInstanceProfile(IamInstanceProfile iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }

    /**
     * <p>
     * The profile information of the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iamInstanceProfile <p>
     *            The profile information of the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceDetails withIamInstanceProfile(IamInstanceProfile iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
        return this;
    }

    /**
     * <p>
     * The image description of the EC2 instance.
     * </p>
     *
     * @return <p>
     *         The image description of the EC2 instance.
     *         </p>
     */
    public String getImageDescription() {
        return imageDescription;
    }

    /**
     * <p>
     * The image description of the EC2 instance.
     * </p>
     *
     * @param imageDescription <p>
     *            The image description of the EC2 instance.
     *            </p>
     */
    public void setImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
    }

    /**
     * <p>
     * The image description of the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageDescription <p>
     *            The image description of the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceDetails withImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
        return this;
    }

    /**
     * <p>
     * The image ID of the EC2 instance.
     * </p>
     *
     * @return <p>
     *         The image ID of the EC2 instance.
     *         </p>
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * <p>
     * The image ID of the EC2 instance.
     * </p>
     *
     * @param imageId <p>
     *            The image ID of the EC2 instance.
     *            </p>
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The image ID of the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageId <p>
     *            The image ID of the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceDetails withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * <p>
     * The ID of the EC2 instance.
     * </p>
     *
     * @return <p>
     *         The ID of the EC2 instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the EC2 instance.
     * </p>
     *
     * @param instanceId <p>
     *            The ID of the EC2 instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceId <p>
     *            The ID of the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceDetails withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The state of the EC2 instance.
     * </p>
     *
     * @return <p>
     *         The state of the EC2 instance.
     *         </p>
     */
    public String getInstanceState() {
        return instanceState;
    }

    /**
     * <p>
     * The state of the EC2 instance.
     * </p>
     *
     * @param instanceState <p>
     *            The state of the EC2 instance.
     *            </p>
     */
    public void setInstanceState(String instanceState) {
        this.instanceState = instanceState;
    }

    /**
     * <p>
     * The state of the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceState <p>
     *            The state of the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceDetails withInstanceState(String instanceState) {
        this.instanceState = instanceState;
        return this;
    }

    /**
     * <p>
     * The type of the EC2 instance.
     * </p>
     *
     * @return <p>
     *         The type of the EC2 instance.
     *         </p>
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The type of the EC2 instance.
     * </p>
     *
     * @param instanceType <p>
     *            The type of the EC2 instance.
     *            </p>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The type of the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceType <p>
     *            The type of the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceDetails withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Outpost. Only applicable to AWS
     * Outposts instances.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the AWS Outpost. Only
     *         applicable to AWS Outposts instances.
     *         </p>
     */
    public String getOutpostArn() {
        return outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Outpost. Only applicable to AWS
     * Outposts instances.
     * </p>
     *
     * @param outpostArn <p>
     *            The Amazon Resource Name (ARN) of the AWS Outpost. Only
     *            applicable to AWS Outposts instances.
     *            </p>
     */
    public void setOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Outpost. Only applicable to AWS
     * Outposts instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outpostArn <p>
     *            The Amazon Resource Name (ARN) of the AWS Outpost. Only
     *            applicable to AWS Outposts instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceDetails withOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
        return this;
    }

    /**
     * <p>
     * The launch time of the EC2 instance.
     * </p>
     *
     * @return <p>
     *         The launch time of the EC2 instance.
     *         </p>
     */
    public String getLaunchTime() {
        return launchTime;
    }

    /**
     * <p>
     * The launch time of the EC2 instance.
     * </p>
     *
     * @param launchTime <p>
     *            The launch time of the EC2 instance.
     *            </p>
     */
    public void setLaunchTime(String launchTime) {
        this.launchTime = launchTime;
    }

    /**
     * <p>
     * The launch time of the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchTime <p>
     *            The launch time of the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceDetails withLaunchTime(String launchTime) {
        this.launchTime = launchTime;
        return this;
    }

    /**
     * <p>
     * The elastic network interface information of the EC2 instance.
     * </p>
     *
     * @return <p>
     *         The elastic network interface information of the EC2 instance.
     *         </p>
     */
    public java.util.List<NetworkInterface> getNetworkInterfaces() {
        return networkInterfaces;
    }

    /**
     * <p>
     * The elastic network interface information of the EC2 instance.
     * </p>
     *
     * @param networkInterfaces <p>
     *            The elastic network interface information of the EC2 instance.
     *            </p>
     */
    public void setNetworkInterfaces(java.util.Collection<NetworkInterface> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }

        this.networkInterfaces = new java.util.ArrayList<NetworkInterface>(networkInterfaces);
    }

    /**
     * <p>
     * The elastic network interface information of the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaces <p>
     *            The elastic network interface information of the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceDetails withNetworkInterfaces(NetworkInterface... networkInterfaces) {
        if (getNetworkInterfaces() == null) {
            this.networkInterfaces = new java.util.ArrayList<NetworkInterface>(
                    networkInterfaces.length);
        }
        for (NetworkInterface value : networkInterfaces) {
            this.networkInterfaces.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The elastic network interface information of the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaces <p>
     *            The elastic network interface information of the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceDetails withNetworkInterfaces(
            java.util.Collection<NetworkInterface> networkInterfaces) {
        setNetworkInterfaces(networkInterfaces);
        return this;
    }

    /**
     * <p>
     * The platform of the EC2 instance.
     * </p>
     *
     * @return <p>
     *         The platform of the EC2 instance.
     *         </p>
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * <p>
     * The platform of the EC2 instance.
     * </p>
     *
     * @param platform <p>
     *            The platform of the EC2 instance.
     *            </p>
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform of the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platform <p>
     *            The platform of the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceDetails withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * <p>
     * The product code of the EC2 instance.
     * </p>
     *
     * @return <p>
     *         The product code of the EC2 instance.
     *         </p>
     */
    public java.util.List<ProductCode> getProductCodes() {
        return productCodes;
    }

    /**
     * <p>
     * The product code of the EC2 instance.
     * </p>
     *
     * @param productCodes <p>
     *            The product code of the EC2 instance.
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
     * The product code of the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productCodes <p>
     *            The product code of the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceDetails withProductCodes(ProductCode... productCodes) {
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
     * The product code of the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param productCodes <p>
     *            The product code of the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceDetails withProductCodes(java.util.Collection<ProductCode> productCodes) {
        setProductCodes(productCodes);
        return this;
    }

    /**
     * <p>
     * The tags of the EC2 instance.
     * </p>
     *
     * @return <p>
     *         The tags of the EC2 instance.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of the EC2 instance.
     * </p>
     *
     * @param tags <p>
     *            The tags of the EC2 instance.
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
     * The tags of the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags of the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceDetails withTags(Tag... tags) {
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
     * The tags of the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags of the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceDetails withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getIamInstanceProfile() != null)
            sb.append("IamInstanceProfile: " + getIamInstanceProfile() + ",");
        if (getImageDescription() != null)
            sb.append("ImageDescription: " + getImageDescription() + ",");
        if (getImageId() != null)
            sb.append("ImageId: " + getImageId() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getInstanceState() != null)
            sb.append("InstanceState: " + getInstanceState() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getOutpostArn() != null)
            sb.append("OutpostArn: " + getOutpostArn() + ",");
        if (getLaunchTime() != null)
            sb.append("LaunchTime: " + getLaunchTime() + ",");
        if (getNetworkInterfaces() != null)
            sb.append("NetworkInterfaces: " + getNetworkInterfaces() + ",");
        if (getPlatform() != null)
            sb.append("Platform: " + getPlatform() + ",");
        if (getProductCodes() != null)
            sb.append("ProductCodes: " + getProductCodes() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode
                + ((getIamInstanceProfile() == null) ? 0 : getIamInstanceProfile().hashCode());
        hashCode = prime * hashCode
                + ((getImageDescription() == null) ? 0 : getImageDescription().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceState() == null) ? 0 : getInstanceState().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getOutpostArn() == null) ? 0 : getOutpostArn().hashCode());
        hashCode = prime * hashCode + ((getLaunchTime() == null) ? 0 : getLaunchTime().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfaces() == null) ? 0 : getNetworkInterfaces().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode
                + ((getProductCodes() == null) ? 0 : getProductCodes().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceDetails == false)
            return false;
        InstanceDetails other = (InstanceDetails) obj;

        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getIamInstanceProfile() == null ^ this.getIamInstanceProfile() == null)
            return false;
        if (other.getIamInstanceProfile() != null
                && other.getIamInstanceProfile().equals(this.getIamInstanceProfile()) == false)
            return false;
        if (other.getImageDescription() == null ^ this.getImageDescription() == null)
            return false;
        if (other.getImageDescription() != null
                && other.getImageDescription().equals(this.getImageDescription()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getInstanceState() == null ^ this.getInstanceState() == null)
            return false;
        if (other.getInstanceState() != null
                && other.getInstanceState().equals(this.getInstanceState()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getOutpostArn() == null ^ this.getOutpostArn() == null)
            return false;
        if (other.getOutpostArn() != null
                && other.getOutpostArn().equals(this.getOutpostArn()) == false)
            return false;
        if (other.getLaunchTime() == null ^ this.getLaunchTime() == null)
            return false;
        if (other.getLaunchTime() != null
                && other.getLaunchTime().equals(this.getLaunchTime()) == false)
            return false;
        if (other.getNetworkInterfaces() == null ^ this.getNetworkInterfaces() == null)
            return false;
        if (other.getNetworkInterfaces() != null
                && other.getNetworkInterfaces().equals(this.getNetworkInterfaces()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
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
        return true;
    }
}
