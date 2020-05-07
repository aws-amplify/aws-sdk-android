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
 * The options for Spot Instances.
 * </p>
 */
public class LaunchTemplateSpotMarketOptions implements Serializable {
    /**
     * <p>
     * The maximum hourly price you're willing to pay for the Spot Instances.
     * </p>
     */
    private String maxPrice;

    /**
     * <p>
     * The Spot Instance request type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     */
    private String spotInstanceType;

    /**
     * <p>
     * The required duration for the Spot Instances (also known as Spot blocks),
     * in minutes. This value must be a multiple of 60 (60, 120, 180, 240, 300,
     * or 360).
     * </p>
     */
    private Integer blockDurationMinutes;

    /**
     * <p>
     * The end date of the request. For a one-time request, the request remains
     * active until all instances launch, the request is canceled, or this date
     * is reached. If the request is persistent, it remains active until it is
     * canceled or this date and time is reached.
     * </p>
     */
    private java.util.Date validUntil;

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hibernate, stop, terminate
     */
    private String instanceInterruptionBehavior;

    /**
     * <p>
     * The maximum hourly price you're willing to pay for the Spot Instances.
     * </p>
     *
     * @return <p>
     *         The maximum hourly price you're willing to pay for the Spot
     *         Instances.
     *         </p>
     */
    public String getMaxPrice() {
        return maxPrice;
    }

    /**
     * <p>
     * The maximum hourly price you're willing to pay for the Spot Instances.
     * </p>
     *
     * @param maxPrice <p>
     *            The maximum hourly price you're willing to pay for the Spot
     *            Instances.
     *            </p>
     */
    public void setMaxPrice(String maxPrice) {
        this.maxPrice = maxPrice;
    }

    /**
     * <p>
     * The maximum hourly price you're willing to pay for the Spot Instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxPrice <p>
     *            The maximum hourly price you're willing to pay for the Spot
     *            Instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplateSpotMarketOptions withMaxPrice(String maxPrice) {
        this.maxPrice = maxPrice;
        return this;
    }

    /**
     * <p>
     * The Spot Instance request type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @return <p>
     *         The Spot Instance request type.
     *         </p>
     * @see SpotInstanceType
     */
    public String getSpotInstanceType() {
        return spotInstanceType;
    }

    /**
     * <p>
     * The Spot Instance request type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @param spotInstanceType <p>
     *            The Spot Instance request type.
     *            </p>
     * @see SpotInstanceType
     */
    public void setSpotInstanceType(String spotInstanceType) {
        this.spotInstanceType = spotInstanceType;
    }

    /**
     * <p>
     * The Spot Instance request type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @param spotInstanceType <p>
     *            The Spot Instance request type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SpotInstanceType
     */
    public LaunchTemplateSpotMarketOptions withSpotInstanceType(String spotInstanceType) {
        this.spotInstanceType = spotInstanceType;
        return this;
    }

    /**
     * <p>
     * The Spot Instance request type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @param spotInstanceType <p>
     *            The Spot Instance request type.
     *            </p>
     * @see SpotInstanceType
     */
    public void setSpotInstanceType(SpotInstanceType spotInstanceType) {
        this.spotInstanceType = spotInstanceType.toString();
    }

    /**
     * <p>
     * The Spot Instance request type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @param spotInstanceType <p>
     *            The Spot Instance request type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SpotInstanceType
     */
    public LaunchTemplateSpotMarketOptions withSpotInstanceType(SpotInstanceType spotInstanceType) {
        this.spotInstanceType = spotInstanceType.toString();
        return this;
    }

    /**
     * <p>
     * The required duration for the Spot Instances (also known as Spot blocks),
     * in minutes. This value must be a multiple of 60 (60, 120, 180, 240, 300,
     * or 360).
     * </p>
     *
     * @return <p>
     *         The required duration for the Spot Instances (also known as Spot
     *         blocks), in minutes. This value must be a multiple of 60 (60,
     *         120, 180, 240, 300, or 360).
     *         </p>
     */
    public Integer getBlockDurationMinutes() {
        return blockDurationMinutes;
    }

    /**
     * <p>
     * The required duration for the Spot Instances (also known as Spot blocks),
     * in minutes. This value must be a multiple of 60 (60, 120, 180, 240, 300,
     * or 360).
     * </p>
     *
     * @param blockDurationMinutes <p>
     *            The required duration for the Spot Instances (also known as
     *            Spot blocks), in minutes. This value must be a multiple of 60
     *            (60, 120, 180, 240, 300, or 360).
     *            </p>
     */
    public void setBlockDurationMinutes(Integer blockDurationMinutes) {
        this.blockDurationMinutes = blockDurationMinutes;
    }

    /**
     * <p>
     * The required duration for the Spot Instances (also known as Spot blocks),
     * in minutes. This value must be a multiple of 60 (60, 120, 180, 240, 300,
     * or 360).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockDurationMinutes <p>
     *            The required duration for the Spot Instances (also known as
     *            Spot blocks), in minutes. This value must be a multiple of 60
     *            (60, 120, 180, 240, 300, or 360).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplateSpotMarketOptions withBlockDurationMinutes(Integer blockDurationMinutes) {
        this.blockDurationMinutes = blockDurationMinutes;
        return this;
    }

    /**
     * <p>
     * The end date of the request. For a one-time request, the request remains
     * active until all instances launch, the request is canceled, or this date
     * is reached. If the request is persistent, it remains active until it is
     * canceled or this date and time is reached.
     * </p>
     *
     * @return <p>
     *         The end date of the request. For a one-time request, the request
     *         remains active until all instances launch, the request is
     *         canceled, or this date is reached. If the request is persistent,
     *         it remains active until it is canceled or this date and time is
     *         reached.
     *         </p>
     */
    public java.util.Date getValidUntil() {
        return validUntil;
    }

    /**
     * <p>
     * The end date of the request. For a one-time request, the request remains
     * active until all instances launch, the request is canceled, or this date
     * is reached. If the request is persistent, it remains active until it is
     * canceled or this date and time is reached.
     * </p>
     *
     * @param validUntil <p>
     *            The end date of the request. For a one-time request, the
     *            request remains active until all instances launch, the request
     *            is canceled, or this date is reached. If the request is
     *            persistent, it remains active until it is canceled or this
     *            date and time is reached.
     *            </p>
     */
    public void setValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
    }

    /**
     * <p>
     * The end date of the request. For a one-time request, the request remains
     * active until all instances launch, the request is canceled, or this date
     * is reached. If the request is persistent, it remains active until it is
     * canceled or this date and time is reached.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validUntil <p>
     *            The end date of the request. For a one-time request, the
     *            request remains active until all instances launch, the request
     *            is canceled, or this date is reached. If the request is
     *            persistent, it remains active until it is canceled or this
     *            date and time is reached.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplateSpotMarketOptions withValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hibernate, stop, terminate
     *
     * @return <p>
     *         The behavior when a Spot Instance is interrupted.
     *         </p>
     * @see InstanceInterruptionBehavior
     */
    public String getInstanceInterruptionBehavior() {
        return instanceInterruptionBehavior;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hibernate, stop, terminate
     *
     * @param instanceInterruptionBehavior <p>
     *            The behavior when a Spot Instance is interrupted.
     *            </p>
     * @see InstanceInterruptionBehavior
     */
    public void setInstanceInterruptionBehavior(String instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hibernate, stop, terminate
     *
     * @param instanceInterruptionBehavior <p>
     *            The behavior when a Spot Instance is interrupted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceInterruptionBehavior
     */
    public LaunchTemplateSpotMarketOptions withInstanceInterruptionBehavior(
            String instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
        return this;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hibernate, stop, terminate
     *
     * @param instanceInterruptionBehavior <p>
     *            The behavior when a Spot Instance is interrupted.
     *            </p>
     * @see InstanceInterruptionBehavior
     */
    public void setInstanceInterruptionBehavior(
            InstanceInterruptionBehavior instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior.toString();
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hibernate, stop, terminate
     *
     * @param instanceInterruptionBehavior <p>
     *            The behavior when a Spot Instance is interrupted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceInterruptionBehavior
     */
    public LaunchTemplateSpotMarketOptions withInstanceInterruptionBehavior(
            InstanceInterruptionBehavior instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior.toString();
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
        if (getMaxPrice() != null)
            sb.append("MaxPrice: " + getMaxPrice() + ",");
        if (getSpotInstanceType() != null)
            sb.append("SpotInstanceType: " + getSpotInstanceType() + ",");
        if (getBlockDurationMinutes() != null)
            sb.append("BlockDurationMinutes: " + getBlockDurationMinutes() + ",");
        if (getValidUntil() != null)
            sb.append("ValidUntil: " + getValidUntil() + ",");
        if (getInstanceInterruptionBehavior() != null)
            sb.append("InstanceInterruptionBehavior: " + getInstanceInterruptionBehavior());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxPrice() == null) ? 0 : getMaxPrice().hashCode());
        hashCode = prime * hashCode
                + ((getSpotInstanceType() == null) ? 0 : getSpotInstanceType().hashCode());
        hashCode = prime * hashCode
                + ((getBlockDurationMinutes() == null) ? 0 : getBlockDurationMinutes().hashCode());
        hashCode = prime * hashCode + ((getValidUntil() == null) ? 0 : getValidUntil().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceInterruptionBehavior() == null) ? 0
                        : getInstanceInterruptionBehavior().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchTemplateSpotMarketOptions == false)
            return false;
        LaunchTemplateSpotMarketOptions other = (LaunchTemplateSpotMarketOptions) obj;

        if (other.getMaxPrice() == null ^ this.getMaxPrice() == null)
            return false;
        if (other.getMaxPrice() != null && other.getMaxPrice().equals(this.getMaxPrice()) == false)
            return false;
        if (other.getSpotInstanceType() == null ^ this.getSpotInstanceType() == null)
            return false;
        if (other.getSpotInstanceType() != null
                && other.getSpotInstanceType().equals(this.getSpotInstanceType()) == false)
            return false;
        if (other.getBlockDurationMinutes() == null ^ this.getBlockDurationMinutes() == null)
            return false;
        if (other.getBlockDurationMinutes() != null
                && other.getBlockDurationMinutes().equals(this.getBlockDurationMinutes()) == false)
            return false;
        if (other.getValidUntil() == null ^ this.getValidUntil() == null)
            return false;
        if (other.getValidUntil() != null
                && other.getValidUntil().equals(this.getValidUntil()) == false)
            return false;
        if (other.getInstanceInterruptionBehavior() == null
                ^ this.getInstanceInterruptionBehavior() == null)
            return false;
        if (other.getInstanceInterruptionBehavior() != null
                && other.getInstanceInterruptionBehavior().equals(
                        this.getInstanceInterruptionBehavior()) == false)
            return false;
        return true;
    }
}
