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


/**
 * <p>An access point used to access a bucket.</p>
 */
public class AccessPoint implements Serializable {
    /**
     * <p>The name of this access point.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     */
    private String name;

    /**
     * <p>Indicates whether this access point allows access from the public internet. If <code>VpcConfiguration</code> is specified for this access point, then <code>NetworkOrigin</code> is <code>VPC</code>, and the access point doesn't allow access from the public internet. Otherwise, <code>NetworkOrigin</code> is <code>Internet</code>, and the access point allows access from the public internet, subject to the access point and bucket access policies.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Internet, VPC
     */
    private String networkOrigin;

    /**
     * <p>The virtual private cloud (VPC) configuration for this access point, if one exists.</p>
     */
    private VpcConfiguration vpcConfiguration;

    /**
     * <p>The name of the bucket associated with this access point.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     */
    private String bucket;

    /**
     * <p>The name of this access point.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     *
     * @return <p>The name of this access point.</p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The name of this access point.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     *
     * @param name <p>The name of this access point.</p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The name of this access point.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     *
     * @param name <p>The name of this access point.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AccessPoint withName(String name) {
        this.name = name;
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
    public AccessPoint withNetworkOrigin(String networkOrigin) {
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
    public AccessPoint withNetworkOrigin(NetworkOrigin networkOrigin) {
        this.networkOrigin = networkOrigin.toString();
        return this;
    }

    /**
     * <p>The virtual private cloud (VPC) configuration for this access point, if one exists.</p>
     *
     * @return <p>The virtual private cloud (VPC) configuration for this access point, if one exists.</p>
     */
    public VpcConfiguration getVpcConfiguration() {
        return vpcConfiguration;
    }

    /**
     * <p>The virtual private cloud (VPC) configuration for this access point, if one exists.</p>
     *
     * @param vpcConfiguration <p>The virtual private cloud (VPC) configuration for this access point, if one exists.</p>
     */
    public void setVpcConfiguration(VpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * <p>The virtual private cloud (VPC) configuration for this access point, if one exists.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcConfiguration <p>The virtual private cloud (VPC) configuration for this access point, if one exists.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AccessPoint withVpcConfiguration(VpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
        return this;
    }

    /**
     * <p>The name of the bucket associated with this access point.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     *
     * @return <p>The name of the bucket associated with this access point.</p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>The name of the bucket associated with this access point.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     *
     * @param bucket <p>The name of the bucket associated with this access point.</p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>The name of the bucket associated with this access point.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     *
     * @param bucket <p>The name of the bucket associated with this access point.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AccessPoint withBucket(String bucket) {
        this.bucket = bucket;
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
        if (getNetworkOrigin() != null) sb.append("NetworkOrigin: " + getNetworkOrigin() + ",");
        if (getVpcConfiguration() != null) sb.append("VpcConfiguration: " + getVpcConfiguration() + ",");
        if (getBucket() != null) sb.append("Bucket: " + getBucket());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNetworkOrigin() == null) ? 0 : getNetworkOrigin().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AccessPoint == false) return false;
        AccessPoint other = (AccessPoint)obj;

        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getNetworkOrigin() == null ^ this.getNetworkOrigin() == null) return false;
        if (other.getNetworkOrigin() != null && other.getNetworkOrigin().equals(this.getNetworkOrigin()) == false) return false;
        if (other.getVpcConfiguration() == null ^ this.getVpcConfiguration() == null) return false;
        if (other.getVpcConfiguration() != null && other.getVpcConfiguration().equals(this.getVpcConfiguration()) == false) return false;
        if (other.getBucket() == null ^ this.getBucket() == null) return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false) return false;
        return true;
    }
}
