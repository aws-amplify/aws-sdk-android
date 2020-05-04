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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Creates an access point and associates it with the specified bucket.</p>
 */
public class CreateAccessPointRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The AWS account ID for the owner of the bucket for which you want to create an access point.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     */
    private String accountId;

    /**
     * <p>The name you want to assign to this access point.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     */
    private String name;

    /**
     * <p>The name of the bucket that you want to associate this access point with.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     */
    private String bucket;

    /**
     * <p>If you include this field, Amazon S3 restricts access to this access point to requests from the specified virtual private cloud (VPC).</p>
     */
    private VpcConfiguration vpcConfiguration;

    /**
     * <p>The <code>PublicAccessBlock</code> configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status">The Meaning of "Public"</a> in the Amazon Simple Storage Service Developer Guide.</p>
     */
    private PublicAccessBlockConfiguration publicAccessBlockConfiguration;

    /**
     * <p>The AWS account ID for the owner of the bucket for which you want to create an access point.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @return <p>The AWS account ID for the owner of the bucket for which you want to create an access point.</p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>The AWS account ID for the owner of the bucket for which you want to create an access point.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @param accountId <p>The AWS account ID for the owner of the bucket for which you want to create an access point.</p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>The AWS account ID for the owner of the bucket for which you want to create an access point.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @param accountId <p>The AWS account ID for the owner of the bucket for which you want to create an access point.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateAccessPointRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>The name you want to assign to this access point.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     *
     * @return <p>The name you want to assign to this access point.</p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The name you want to assign to this access point.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     *
     * @param name <p>The name you want to assign to this access point.</p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The name you want to assign to this access point.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     *
     * @param name <p>The name you want to assign to this access point.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateAccessPointRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>The name of the bucket that you want to associate this access point with.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     *
     * @return <p>The name of the bucket that you want to associate this access point with.</p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>The name of the bucket that you want to associate this access point with.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     *
     * @param bucket <p>The name of the bucket that you want to associate this access point with.</p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>The name of the bucket that you want to associate this access point with.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     *
     * @param bucket <p>The name of the bucket that you want to associate this access point with.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateAccessPointRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>If you include this field, Amazon S3 restricts access to this access point to requests from the specified virtual private cloud (VPC).</p>
     *
     * @return <p>If you include this field, Amazon S3 restricts access to this access point to requests from the specified virtual private cloud (VPC).</p>
     */
    public VpcConfiguration getVpcConfiguration() {
        return vpcConfiguration;
    }

    /**
     * <p>If you include this field, Amazon S3 restricts access to this access point to requests from the specified virtual private cloud (VPC).</p>
     *
     * @param vpcConfiguration <p>If you include this field, Amazon S3 restricts access to this access point to requests from the specified virtual private cloud (VPC).</p>
     */
    public void setVpcConfiguration(VpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * <p>If you include this field, Amazon S3 restricts access to this access point to requests from the specified virtual private cloud (VPC).</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcConfiguration <p>If you include this field, Amazon S3 restricts access to this access point to requests from the specified virtual private cloud (VPC).</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateAccessPointRequest withVpcConfiguration(VpcConfiguration vpcConfiguration) {
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
    public CreateAccessPointRequest withPublicAccessBlockConfiguration(PublicAccessBlockConfiguration publicAccessBlockConfiguration) {
        this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
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
        if (getAccountId() != null) sb.append("AccountId: " + getAccountId() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getBucket() != null) sb.append("Bucket: " + getBucket() + ",");
        if (getVpcConfiguration() != null) sb.append("VpcConfiguration: " + getVpcConfiguration() + ",");
        if (getPublicAccessBlockConfiguration() != null) sb.append("PublicAccessBlockConfiguration: " + getPublicAccessBlockConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPublicAccessBlockConfiguration() == null) ? 0 : getPublicAccessBlockConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateAccessPointRequest == false) return false;
        CreateAccessPointRequest other = (CreateAccessPointRequest)obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false;
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getBucket() == null ^ this.getBucket() == null) return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false) return false;
        if (other.getVpcConfiguration() == null ^ this.getVpcConfiguration() == null) return false;
        if (other.getVpcConfiguration() != null && other.getVpcConfiguration().equals(this.getVpcConfiguration()) == false) return false;
        if (other.getPublicAccessBlockConfiguration() == null ^ this.getPublicAccessBlockConfiguration() == null) return false;
        if (other.getPublicAccessBlockConfiguration() != null && other.getPublicAccessBlockConfiguration().equals(this.getPublicAccessBlockConfiguration()) == false) return false;
        return true;
    }
}
