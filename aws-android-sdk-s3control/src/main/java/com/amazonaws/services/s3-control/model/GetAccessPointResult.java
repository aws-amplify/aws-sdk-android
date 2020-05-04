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
package com.amazonaws.services.s3-control.model;

import java.io.Serializable;


public class GetAccessPointResult implements Serializable {
    /**
     * <p>The name of the specified access point.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     */
    private String name;

    /**
     * <p>The name of the bucket associated with the specified access point.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     */
    private String bucket;

    /**
     * <p>Indicates whether this access point allows access from the public internet. If <code>VpcConfiguration</code> is specified for this access point, then <code>NetworkOrigin</code> is <code>VPC</code>, and the access point doesn't allow access from the public internet. Otherwise, <code>NetworkOrigin</code> is <code>Internet</code>, and the access point allows access from the public internet, subject to the access point and bucket access policies.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Internet, VPC
     */
    private String networkOrigin;

    /**
     * <p>Contains the virtual private cloud (VPC) configuration for the specified access point.</p>
     */
    private VpcConfiguration vpcConfiguration;

    /**
     * <p>The <code>PublicAccessBlock</code> configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status">The Meaning of "Public"</a> in the Amazon Simple Storage Service Developer Guide.</p>
     */
    private PublicAccessBlockConfiguration publicAccessBlockConfiguration;

    /**
     * <p>The date and time when the specified access point was created.</p>
     */
    private java.util.Date creationDate;

    /**
     * <p>The name of the specified access point.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     *
     * @return <p>The name of the specified access point.</p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The name of the specified access point.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     *
     * @param name <p>The name of the specified access point.</p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The name of the specified access point.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     *
     * @param name <p>The name of the specified access point.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetAccessPointResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>The name of the bucket associated with the specified access point.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     *
     * @return <p>The name of the bucket associated with the specified access point.</p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>The name of the bucket associated with the specified access point.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     *
     * @param bucket <p>The name of the bucket associated with the specified access point.</p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>The name of the bucket associated with the specified access point.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     *
     * @param bucket <p>The name of the bucket associated with the specified access point.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetAccessPointResult withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>Indicates whether this access point allows access from the public internet. If <code>VpcConfiguration</code> is specified for this access point, then <code>NetworkOrigin</code> is <code>VPC</code>, and the access point doesn't allow access from the public internet. Otherwise, <code>NetworkOrigin</code> is <code>Internet</code>, and the access point allows access from the public internet, subject to the access point and bucket access policies.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Internet, VPC
     *
     * @return <p>Indicates whether this access point allows access from the public internet. If <code>VpcConfiguration</code> is specified for this access point, then <code>NetworkOrigin</code> is <code>VPC</code>, and the access point doesn't allow access from the public internet. Otherwise, <code>NetworkOrigin</code> is <code>Internet</code>, and the access point allows access from the public internet, subject to the access point and bucket access policies.</p>
     *
     * @see NetworkOrigin
     */
    public String getNetworkOrigin() {
        return networkOrigin;
    }

    /**
     * <p>Indicates whether this access point allows access from the public internet. If <code>VpcConfiguration</code> is specified for this access point, then <code>NetworkOrigin</code> is <code>VPC</code>, and the access point doesn't allow access from the public internet. Otherwise, <code>NetworkOrigin</code> is <code>Internet</code>, and the access point allows access from the public internet, subject to the access point and bucket access policies.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Internet, VPC
     *
     * @param networkOrigin <p>Indicates whether this access point allows access from the public internet. If <code>VpcConfiguration</code> is specified for this access point, then <code>NetworkOrigin</code> is <code>VPC</code>, and the access point doesn't allow access from the public internet. Otherwise, <code>NetworkOrigin</code> is <code>Internet</code>, and the access point allows access from the public internet, subject to the access point and bucket access policies.</p>
     *
     * @see NetworkOrigin
     */
    public void setNetworkOrigin(String networkOrigin) {
        this.networkOrigin = networkOrigin;
    }

    /**
     * <p>Indicates whether this access point allows access from the public internet. If <code>VpcConfiguration</code> is specified for this access point, then <code>NetworkOrigin</code> is <code>VPC</code>, and the access point doesn't allow access from the public internet. Otherwise, <code>NetworkOrigin</code> is <code>Internet</code>, and the access point allows access from the public internet, subject to the access point and bucket access policies.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Internet, VPC
     *
     * @param networkOrigin <p>Indicates whether this access point allows access from the public internet. If <code>VpcConfiguration</code> is specified for this access point, then <code>NetworkOrigin</code> is <code>VPC</code>, and the access point doesn't allow access from the public internet. Otherwise, <code>NetworkOrigin</code> is <code>Internet</code>, and the access point allows access from the public internet, subject to the access point and bucket access policies.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see NetworkOrigin
     */
    public GetAccessPointResult withNetworkOrigin(String networkOrigin) {
        this.networkOrigin = networkOrigin;
        return this;
    }

    /**
     * <p>Indicates whether this access point allows access from the public internet. If <code>VpcConfiguration</code> is specified for this access point, then <code>NetworkOrigin</code> is <code>VPC</code>, and the access point doesn't allow access from the public internet. Otherwise, <code>NetworkOrigin</code> is <code>Internet</code>, and the access point allows access from the public internet, subject to the access point and bucket access policies.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Internet, VPC
     *
     * @param networkOrigin <p>Indicates whether this access point allows access from the public internet. If <code>VpcConfiguration</code> is specified for this access point, then <code>NetworkOrigin</code> is <code>VPC</code>, and the access point doesn't allow access from the public internet. Otherwise, <code>NetworkOrigin</code> is <code>Internet</code>, and the access point allows access from the public internet, subject to the access point and bucket access policies.</p>
     *
     * @see NetworkOrigin
     */
    public void setNetworkOrigin(NetworkOrigin networkOrigin) {
        this.networkOrigin = networkOrigin.toString();
    }

    /**
     * <p>Indicates whether this access point allows access from the public internet. If <code>VpcConfiguration</code> is specified for this access point, then <code>NetworkOrigin</code> is <code>VPC</code>, and the access point doesn't allow access from the public internet. Otherwise, <code>NetworkOrigin</code> is <code>Internet</code>, and the access point allows access from the public internet, subject to the access point and bucket access policies.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Internet, VPC
     *
     * @param networkOrigin <p>Indicates whether this access point allows access from the public internet. If <code>VpcConfiguration</code> is specified for this access point, then <code>NetworkOrigin</code> is <code>VPC</code>, and the access point doesn't allow access from the public internet. Otherwise, <code>NetworkOrigin</code> is <code>Internet</code>, and the access point allows access from the public internet, subject to the access point and bucket access policies.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see NetworkOrigin
     */
    public GetAccessPointResult withNetworkOrigin(NetworkOrigin networkOrigin) {
        this.networkOrigin = networkOrigin.toString();
        return this;
    }

    /**
     * <p>Contains the virtual private cloud (VPC) configuration for the specified access point.</p>
     *
     * @return <p>Contains the virtual private cloud (VPC) configuration for the specified access point.</p>
     */
    public VpcConfiguration getVpcConfiguration() {
        return vpcConfiguration;
    }

    /**
     * <p>Contains the virtual private cloud (VPC) configuration for the specified access point.</p>
     *
     * @param vpcConfiguration <p>Contains the virtual private cloud (VPC) configuration for the specified access point.</p>
     */
    public void setVpcConfiguration(VpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * <p>Contains the virtual private cloud (VPC) configuration for the specified access point.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcConfiguration <p>Contains the virtual private cloud (VPC) configuration for the specified access point.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetAccessPointResult withVpcConfiguration(VpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
        return this;
    }

    /**
     * <p>The <code>PublicAccessBlock</code> configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status">The Meaning of "Public"</a> in the Amazon Simple Storage Service Developer Guide.</p>
     *
     * @return <p>The <code>PublicAccessBlock</code> configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status">The Meaning of "Public"</a> in the Amazon Simple Storage Service Developer Guide.</p>
     */
    public PublicAccessBlockConfiguration getPublicAccessBlockConfiguration() {
        return publicAccessBlockConfiguration;
    }

    /**
     * <p>The <code>PublicAccessBlock</code> configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status">The Meaning of "Public"</a> in the Amazon Simple Storage Service Developer Guide.</p>
     *
     * @param publicAccessBlockConfiguration <p>The <code>PublicAccessBlock</code> configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status">The Meaning of "Public"</a> in the Amazon Simple Storage Service Developer Guide.</p>
     */
    public void setPublicAccessBlockConfiguration(PublicAccessBlockConfiguration publicAccessBlockConfiguration) {
        this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
    }

    /**
     * <p>The <code>PublicAccessBlock</code> configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status">The Meaning of "Public"</a> in the Amazon Simple Storage Service Developer Guide.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicAccessBlockConfiguration <p>The <code>PublicAccessBlock</code> configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status">The Meaning of "Public"</a> in the Amazon Simple Storage Service Developer Guide.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetAccessPointResult withPublicAccessBlockConfiguration(PublicAccessBlockConfiguration publicAccessBlockConfiguration) {
        this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
        return this;
    }

    /**
     * <p>The date and time when the specified access point was created.</p>
     *
     * @return <p>The date and time when the specified access point was created.</p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>The date and time when the specified access point was created.</p>
     *
     * @param creationDate <p>The date and time when the specified access point was created.</p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>The date and time when the specified access point was created.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationDate <p>The date and time when the specified access point was created.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetAccessPointResult withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getBucket() != null) sb.append("Bucket: " + getBucket() + ",");
        if (getNetworkOrigin() != null) sb.append("NetworkOrigin: " + getNetworkOrigin() + ",");
        if (getVpcConfiguration() != null) sb.append("VpcConfiguration: " + getVpcConfiguration() + ",");
        if (getPublicAccessBlockConfiguration() != null) sb.append("PublicAccessBlockConfiguration: " + getPublicAccessBlockConfiguration() + ",");
        if (getCreationDate() != null) sb.append("CreationDate: " + getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getNetworkOrigin() == null) ? 0 : getNetworkOrigin().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPublicAccessBlockConfiguration() == null) ? 0 : getPublicAccessBlockConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetAccessPointResult == false) return false;
        GetAccessPointResult other = (GetAccessPointResult)obj;

        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getBucket() == null ^ this.getBucket() == null) return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false) return false;
        if (other.getNetworkOrigin() == null ^ this.getNetworkOrigin() == null) return false;
        if (other.getNetworkOrigin() != null && other.getNetworkOrigin().equals(this.getNetworkOrigin()) == false) return false;
        if (other.getVpcConfiguration() == null ^ this.getVpcConfiguration() == null) return false;
        if (other.getVpcConfiguration() != null && other.getVpcConfiguration().equals(this.getVpcConfiguration()) == false) return false;
        if (other.getPublicAccessBlockConfiguration() == null ^ this.getPublicAccessBlockConfiguration() == null) return false;
        if (other.getPublicAccessBlockConfiguration() != null && other.getPublicAccessBlockConfiguration().equals(this.getPublicAccessBlockConfiguration()) == false) return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null) return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false) return false;
        return true;
    }
}
