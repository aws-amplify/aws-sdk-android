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
 * Modifies the Availability Zone, instance count, instance type, or network
 * platform (EC2-Classic or EC2-VPC) of your Reserved Instances. The Reserved
 * Instances to be modified must be identical, except for Availability Zone,
 * network platform, and instance type.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-modifying.html"
 * >Modifying Reserved Instances</a> in the Amazon Elastic Compute Cloud User
 * Guide.
 * </p>
 */
public class ModifyReservedInstancesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The IDs of the Reserved Instances to modify.
     * </p>
     */
    private java.util.List<String> reservedInstancesIds;

    /**
     * <p>
     * A unique, case-sensitive token you provide to ensure idempotency of your
     * modification request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The configuration settings for the Reserved Instances to modify.
     * </p>
     */
    private java.util.List<ReservedInstancesConfiguration> targetConfigurations;

    /**
     * <p>
     * The IDs of the Reserved Instances to modify.
     * </p>
     *
     * @return <p>
     *         The IDs of the Reserved Instances to modify.
     *         </p>
     */
    public java.util.List<String> getReservedInstancesIds() {
        return reservedInstancesIds;
    }

    /**
     * <p>
     * The IDs of the Reserved Instances to modify.
     * </p>
     *
     * @param reservedInstancesIds <p>
     *            The IDs of the Reserved Instances to modify.
     *            </p>
     */
    public void setReservedInstancesIds(java.util.Collection<String> reservedInstancesIds) {
        if (reservedInstancesIds == null) {
            this.reservedInstancesIds = null;
            return;
        }

        this.reservedInstancesIds = new java.util.ArrayList<String>(reservedInstancesIds);
    }

    /**
     * <p>
     * The IDs of the Reserved Instances to modify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedInstancesIds <p>
     *            The IDs of the Reserved Instances to modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReservedInstancesRequest withReservedInstancesIds(String... reservedInstancesIds) {
        if (getReservedInstancesIds() == null) {
            this.reservedInstancesIds = new java.util.ArrayList<String>(reservedInstancesIds.length);
        }
        for (String value : reservedInstancesIds) {
            this.reservedInstancesIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Reserved Instances to modify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedInstancesIds <p>
     *            The IDs of the Reserved Instances to modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReservedInstancesRequest withReservedInstancesIds(
            java.util.Collection<String> reservedInstancesIds) {
        setReservedInstancesIds(reservedInstancesIds);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive token you provide to ensure idempotency of your
     * modification request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     *
     * @return <p>
     *         A unique, case-sensitive token you provide to ensure idempotency
     *         of your modification request. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *         >Ensuring Idempotency</a>.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token you provide to ensure idempotency of your
     * modification request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     *
     * @param clientToken <p>
     *            A unique, case-sensitive token you provide to ensure
     *            idempotency of your modification request. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >Ensuring Idempotency</a>.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token you provide to ensure idempotency of your
     * modification request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            A unique, case-sensitive token you provide to ensure
     *            idempotency of your modification request. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >Ensuring Idempotency</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReservedInstancesRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The configuration settings for the Reserved Instances to modify.
     * </p>
     *
     * @return <p>
     *         The configuration settings for the Reserved Instances to modify.
     *         </p>
     */
    public java.util.List<ReservedInstancesConfiguration> getTargetConfigurations() {
        return targetConfigurations;
    }

    /**
     * <p>
     * The configuration settings for the Reserved Instances to modify.
     * </p>
     *
     * @param targetConfigurations <p>
     *            The configuration settings for the Reserved Instances to
     *            modify.
     *            </p>
     */
    public void setTargetConfigurations(
            java.util.Collection<ReservedInstancesConfiguration> targetConfigurations) {
        if (targetConfigurations == null) {
            this.targetConfigurations = null;
            return;
        }

        this.targetConfigurations = new java.util.ArrayList<ReservedInstancesConfiguration>(
                targetConfigurations);
    }

    /**
     * <p>
     * The configuration settings for the Reserved Instances to modify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetConfigurations <p>
     *            The configuration settings for the Reserved Instances to
     *            modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReservedInstancesRequest withTargetConfigurations(
            ReservedInstancesConfiguration... targetConfigurations) {
        if (getTargetConfigurations() == null) {
            this.targetConfigurations = new java.util.ArrayList<ReservedInstancesConfiguration>(
                    targetConfigurations.length);
        }
        for (ReservedInstancesConfiguration value : targetConfigurations) {
            this.targetConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The configuration settings for the Reserved Instances to modify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetConfigurations <p>
     *            The configuration settings for the Reserved Instances to
     *            modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyReservedInstancesRequest withTargetConfigurations(
            java.util.Collection<ReservedInstancesConfiguration> targetConfigurations) {
        setTargetConfigurations(targetConfigurations);
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
        if (getReservedInstancesIds() != null)
            sb.append("ReservedInstancesIds: " + getReservedInstancesIds() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getTargetConfigurations() != null)
            sb.append("TargetConfigurations: " + getTargetConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReservedInstancesIds() == null) ? 0 : getReservedInstancesIds().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode
                + ((getTargetConfigurations() == null) ? 0 : getTargetConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyReservedInstancesRequest == false)
            return false;
        ModifyReservedInstancesRequest other = (ModifyReservedInstancesRequest) obj;

        if (other.getReservedInstancesIds() == null ^ this.getReservedInstancesIds() == null)
            return false;
        if (other.getReservedInstancesIds() != null
                && other.getReservedInstancesIds().equals(this.getReservedInstancesIds()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTargetConfigurations() == null ^ this.getTargetConfigurations() == null)
            return false;
        if (other.getTargetConfigurations() != null
                && other.getTargetConfigurations().equals(this.getTargetConfigurations()) == false)
            return false;
        return true;
    }
}
