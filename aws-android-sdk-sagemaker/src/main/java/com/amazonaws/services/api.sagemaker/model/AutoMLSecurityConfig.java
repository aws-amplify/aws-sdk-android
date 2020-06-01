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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * Security options.
 * </p>
 */
public class AutoMLSecurityConfig implements Serializable {
    /**
     * <p>
     * The key used to encrypt stored data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String volumeKmsKeyId;

    /**
     * <p>
     * Whether to use traffic encryption between the container layers.
     * </p>
     */
    private Boolean enableInterContainerTrafficEncryption;

    /**
     * <p>
     * VPC configuration.
     * </p>
     */
    private VpcConfig vpcConfig;

    /**
     * <p>
     * The key used to encrypt stored data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The key used to encrypt stored data.
     *         </p>
     */
    public String getVolumeKmsKeyId() {
        return volumeKmsKeyId;
    }

    /**
     * <p>
     * The key used to encrypt stored data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param volumeKmsKeyId <p>
     *            The key used to encrypt stored data.
     *            </p>
     */
    public void setVolumeKmsKeyId(String volumeKmsKeyId) {
        this.volumeKmsKeyId = volumeKmsKeyId;
    }

    /**
     * <p>
     * The key used to encrypt stored data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param volumeKmsKeyId <p>
     *            The key used to encrypt stored data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLSecurityConfig withVolumeKmsKeyId(String volumeKmsKeyId) {
        this.volumeKmsKeyId = volumeKmsKeyId;
        return this;
    }

    /**
     * <p>
     * Whether to use traffic encryption between the container layers.
     * </p>
     *
     * @return <p>
     *         Whether to use traffic encryption between the container layers.
     *         </p>
     */
    public Boolean isEnableInterContainerTrafficEncryption() {
        return enableInterContainerTrafficEncryption;
    }

    /**
     * <p>
     * Whether to use traffic encryption between the container layers.
     * </p>
     *
     * @return <p>
     *         Whether to use traffic encryption between the container layers.
     *         </p>
     */
    public Boolean getEnableInterContainerTrafficEncryption() {
        return enableInterContainerTrafficEncryption;
    }

    /**
     * <p>
     * Whether to use traffic encryption between the container layers.
     * </p>
     *
     * @param enableInterContainerTrafficEncryption <p>
     *            Whether to use traffic encryption between the container
     *            layers.
     *            </p>
     */
    public void setEnableInterContainerTrafficEncryption(
            Boolean enableInterContainerTrafficEncryption) {
        this.enableInterContainerTrafficEncryption = enableInterContainerTrafficEncryption;
    }

    /**
     * <p>
     * Whether to use traffic encryption between the container layers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableInterContainerTrafficEncryption <p>
     *            Whether to use traffic encryption between the container
     *            layers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLSecurityConfig withEnableInterContainerTrafficEncryption(
            Boolean enableInterContainerTrafficEncryption) {
        this.enableInterContainerTrafficEncryption = enableInterContainerTrafficEncryption;
        return this;
    }

    /**
     * <p>
     * VPC configuration.
     * </p>
     *
     * @return <p>
     *         VPC configuration.
     *         </p>
     */
    public VpcConfig getVpcConfig() {
        return vpcConfig;
    }

    /**
     * <p>
     * VPC configuration.
     * </p>
     *
     * @param vpcConfig <p>
     *            VPC configuration.
     *            </p>
     */
    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * VPC configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcConfig <p>
     *            VPC configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLSecurityConfig withVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
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
        if (getVolumeKmsKeyId() != null)
            sb.append("VolumeKmsKeyId: " + getVolumeKmsKeyId() + ",");
        if (getEnableInterContainerTrafficEncryption() != null)
            sb.append("EnableInterContainerTrafficEncryption: "
                    + getEnableInterContainerTrafficEncryption() + ",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: " + getVpcConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVolumeKmsKeyId() == null) ? 0 : getVolumeKmsKeyId().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnableInterContainerTrafficEncryption() == null) ? 0
                        : getEnableInterContainerTrafficEncryption().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLSecurityConfig == false)
            return false;
        AutoMLSecurityConfig other = (AutoMLSecurityConfig) obj;

        if (other.getVolumeKmsKeyId() == null ^ this.getVolumeKmsKeyId() == null)
            return false;
        if (other.getVolumeKmsKeyId() != null
                && other.getVolumeKmsKeyId().equals(this.getVolumeKmsKeyId()) == false)
            return false;
        if (other.getEnableInterContainerTrafficEncryption() == null
                ^ this.getEnableInterContainerTrafficEncryption() == null)
            return false;
        if (other.getEnableInterContainerTrafficEncryption() != null
                && other.getEnableInterContainerTrafficEncryption().equals(
                        this.getEnableInterContainerTrafficEncryption()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null
                && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        return true;
    }
}
