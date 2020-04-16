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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Networking options for a job, such as network traffic encryption between
 * containers, whether to allow inbound and outbound network calls to and from
 * containers, and the VPC subnets and security groups to use for VPC-enabled
 * jobs.
 * </p>
 */
public class NetworkConfig implements Serializable {
    /**
     * <p>
     * Whether to allow inbound and outbound network calls to and from the
     * containers used for the processing job.
     * </p>
     */
    private Boolean enableNetworkIsolation;

    /**
     * <p>
     * Specifies a VPC that your training jobs and hosted models have access to.
     * Control access to and from your training and model containers by
     * configuring the VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html"
     * >Protect Endpoints by Using an Amazon Virtual Private Cloud</a> and <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html">
     * Protect Training Jobs by Using an Amazon Virtual Private Cloud</a>.
     * </p>
     */
    private VpcConfig vpcConfig;

    /**
     * <p>
     * Whether to allow inbound and outbound network calls to and from the
     * containers used for the processing job.
     * </p>
     *
     * @return <p>
     *         Whether to allow inbound and outbound network calls to and from
     *         the containers used for the processing job.
     *         </p>
     */
    public Boolean isEnableNetworkIsolation() {
        return enableNetworkIsolation;
    }

    /**
     * <p>
     * Whether to allow inbound and outbound network calls to and from the
     * containers used for the processing job.
     * </p>
     *
     * @return <p>
     *         Whether to allow inbound and outbound network calls to and from
     *         the containers used for the processing job.
     *         </p>
     */
    public Boolean getEnableNetworkIsolation() {
        return enableNetworkIsolation;
    }

    /**
     * <p>
     * Whether to allow inbound and outbound network calls to and from the
     * containers used for the processing job.
     * </p>
     *
     * @param enableNetworkIsolation <p>
     *            Whether to allow inbound and outbound network calls to and
     *            from the containers used for the processing job.
     *            </p>
     */
    public void setEnableNetworkIsolation(Boolean enableNetworkIsolation) {
        this.enableNetworkIsolation = enableNetworkIsolation;
    }

    /**
     * <p>
     * Whether to allow inbound and outbound network calls to and from the
     * containers used for the processing job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableNetworkIsolation <p>
     *            Whether to allow inbound and outbound network calls to and
     *            from the containers used for the processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkConfig withEnableNetworkIsolation(Boolean enableNetworkIsolation) {
        this.enableNetworkIsolation = enableNetworkIsolation;
        return this;
    }

    /**
     * <p>
     * Specifies a VPC that your training jobs and hosted models have access to.
     * Control access to and from your training and model containers by
     * configuring the VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html"
     * >Protect Endpoints by Using an Amazon Virtual Private Cloud</a> and <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html">
     * Protect Training Jobs by Using an Amazon Virtual Private Cloud</a>.
     * </p>
     *
     * @return <p>
     *         Specifies a VPC that your training jobs and hosted models have
     *         access to. Control access to and from your training and model
     *         containers by configuring the VPC. For more information, see <a
     *         href
     *         ="https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html"
     *         >Protect Endpoints by Using an Amazon Virtual Private Cloud</a>
     *         and <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html"
     *         >Protect Training Jobs by Using an Amazon Virtual Private
     *         Cloud</a>.
     *         </p>
     */
    public VpcConfig getVpcConfig() {
        return vpcConfig;
    }

    /**
     * <p>
     * Specifies a VPC that your training jobs and hosted models have access to.
     * Control access to and from your training and model containers by
     * configuring the VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html"
     * >Protect Endpoints by Using an Amazon Virtual Private Cloud</a> and <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html">
     * Protect Training Jobs by Using an Amazon Virtual Private Cloud</a>.
     * </p>
     *
     * @param vpcConfig <p>
     *            Specifies a VPC that your training jobs and hosted models have
     *            access to. Control access to and from your training and model
     *            containers by configuring the VPC. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html"
     *            >Protect Endpoints by Using an Amazon Virtual Private
     *            Cloud</a> and <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html"
     *            >Protect Training Jobs by Using an Amazon Virtual Private
     *            Cloud</a>.
     *            </p>
     */
    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * Specifies a VPC that your training jobs and hosted models have access to.
     * Control access to and from your training and model containers by
     * configuring the VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html"
     * >Protect Endpoints by Using an Amazon Virtual Private Cloud</a> and <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html">
     * Protect Training Jobs by Using an Amazon Virtual Private Cloud</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcConfig <p>
     *            Specifies a VPC that your training jobs and hosted models have
     *            access to. Control access to and from your training and model
     *            containers by configuring the VPC. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html"
     *            >Protect Endpoints by Using an Amazon Virtual Private
     *            Cloud</a> and <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/train-vpc.html"
     *            >Protect Training Jobs by Using an Amazon Virtual Private
     *            Cloud</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkConfig withVpcConfig(VpcConfig vpcConfig) {
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
        if (getEnableNetworkIsolation() != null)
            sb.append("EnableNetworkIsolation: " + getEnableNetworkIsolation() + ",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: " + getVpcConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getEnableNetworkIsolation() == null) ? 0 : getEnableNetworkIsolation()
                        .hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkConfig == false)
            return false;
        NetworkConfig other = (NetworkConfig) obj;

        if (other.getEnableNetworkIsolation() == null ^ this.getEnableNetworkIsolation() == null)
            return false;
        if (other.getEnableNetworkIsolation() != null
                && other.getEnableNetworkIsolation().equals(this.getEnableNetworkIsolation()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null
                && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        return true;
    }
}
