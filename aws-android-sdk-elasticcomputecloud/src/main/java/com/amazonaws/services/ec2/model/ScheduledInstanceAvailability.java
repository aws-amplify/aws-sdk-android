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
 * Describes a schedule that is available for your Scheduled Instances.
 * </p>
 */
public class ScheduledInstanceAvailability implements Serializable {
    /**
     * <p>
     * The Availability Zone.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The number of available instances.
     * </p>
     */
    private Integer availableInstanceCount;

    /**
     * <p>
     * The time period for the first schedule to start.
     * </p>
     */
    private java.util.Date firstSlotStartTime;

    /**
     * <p>
     * The hourly price for a single instance.
     * </p>
     */
    private String hourlyPrice;

    /**
     * <p>
     * The instance type. You can specify one of the C3, C4, M4, or R3 instance
     * types.
     * </p>
     */
    private String instanceType;

    /**
     * <p>
     * The maximum term. The only possible value is 365 days.
     * </p>
     */
    private Integer maxTermDurationInDays;

    /**
     * <p>
     * The minimum term. The only possible value is 365 days.
     * </p>
     */
    private Integer minTermDurationInDays;

    /**
     * <p>
     * The network platform (<code>EC2-Classic</code> or <code>EC2-VPC</code>).
     * </p>
     */
    private String networkPlatform;

    /**
     * <p>
     * The platform (<code>Linux/UNIX</code> or <code>Windows</code>).
     * </p>
     */
    private String platform;

    /**
     * <p>
     * The purchase token. This token expires in two hours.
     * </p>
     */
    private String purchaseToken;

    /**
     * <p>
     * The schedule recurrence.
     * </p>
     */
    private ScheduledInstanceRecurrence recurrence;

    /**
     * <p>
     * The number of hours in the schedule.
     * </p>
     */
    private Integer slotDurationInHours;

    /**
     * <p>
     * The total number of hours for a single instance for the entire term.
     * </p>
     */
    private Integer totalScheduledInstanceHours;

    /**
     * <p>
     * The Availability Zone.
     * </p>
     *
     * @return <p>
     *         The Availability Zone.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstanceAvailability withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The number of available instances.
     * </p>
     *
     * @return <p>
     *         The number of available instances.
     *         </p>
     */
    public Integer getAvailableInstanceCount() {
        return availableInstanceCount;
    }

    /**
     * <p>
     * The number of available instances.
     * </p>
     *
     * @param availableInstanceCount <p>
     *            The number of available instances.
     *            </p>
     */
    public void setAvailableInstanceCount(Integer availableInstanceCount) {
        this.availableInstanceCount = availableInstanceCount;
    }

    /**
     * <p>
     * The number of available instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availableInstanceCount <p>
     *            The number of available instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstanceAvailability withAvailableInstanceCount(Integer availableInstanceCount) {
        this.availableInstanceCount = availableInstanceCount;
        return this;
    }

    /**
     * <p>
     * The time period for the first schedule to start.
     * </p>
     *
     * @return <p>
     *         The time period for the first schedule to start.
     *         </p>
     */
    public java.util.Date getFirstSlotStartTime() {
        return firstSlotStartTime;
    }

    /**
     * <p>
     * The time period for the first schedule to start.
     * </p>
     *
     * @param firstSlotStartTime <p>
     *            The time period for the first schedule to start.
     *            </p>
     */
    public void setFirstSlotStartTime(java.util.Date firstSlotStartTime) {
        this.firstSlotStartTime = firstSlotStartTime;
    }

    /**
     * <p>
     * The time period for the first schedule to start.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param firstSlotStartTime <p>
     *            The time period for the first schedule to start.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstanceAvailability withFirstSlotStartTime(java.util.Date firstSlotStartTime) {
        this.firstSlotStartTime = firstSlotStartTime;
        return this;
    }

    /**
     * <p>
     * The hourly price for a single instance.
     * </p>
     *
     * @return <p>
     *         The hourly price for a single instance.
     *         </p>
     */
    public String getHourlyPrice() {
        return hourlyPrice;
    }

    /**
     * <p>
     * The hourly price for a single instance.
     * </p>
     *
     * @param hourlyPrice <p>
     *            The hourly price for a single instance.
     *            </p>
     */
    public void setHourlyPrice(String hourlyPrice) {
        this.hourlyPrice = hourlyPrice;
    }

    /**
     * <p>
     * The hourly price for a single instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hourlyPrice <p>
     *            The hourly price for a single instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstanceAvailability withHourlyPrice(String hourlyPrice) {
        this.hourlyPrice = hourlyPrice;
        return this;
    }

    /**
     * <p>
     * The instance type. You can specify one of the C3, C4, M4, or R3 instance
     * types.
     * </p>
     *
     * @return <p>
     *         The instance type. You can specify one of the C3, C4, M4, or R3
     *         instance types.
     *         </p>
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The instance type. You can specify one of the C3, C4, M4, or R3 instance
     * types.
     * </p>
     *
     * @param instanceType <p>
     *            The instance type. You can specify one of the C3, C4, M4, or
     *            R3 instance types.
     *            </p>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type. You can specify one of the C3, C4, M4, or R3 instance
     * types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceType <p>
     *            The instance type. You can specify one of the C3, C4, M4, or
     *            R3 instance types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstanceAvailability withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The maximum term. The only possible value is 365 days.
     * </p>
     *
     * @return <p>
     *         The maximum term. The only possible value is 365 days.
     *         </p>
     */
    public Integer getMaxTermDurationInDays() {
        return maxTermDurationInDays;
    }

    /**
     * <p>
     * The maximum term. The only possible value is 365 days.
     * </p>
     *
     * @param maxTermDurationInDays <p>
     *            The maximum term. The only possible value is 365 days.
     *            </p>
     */
    public void setMaxTermDurationInDays(Integer maxTermDurationInDays) {
        this.maxTermDurationInDays = maxTermDurationInDays;
    }

    /**
     * <p>
     * The maximum term. The only possible value is 365 days.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxTermDurationInDays <p>
     *            The maximum term. The only possible value is 365 days.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstanceAvailability withMaxTermDurationInDays(Integer maxTermDurationInDays) {
        this.maxTermDurationInDays = maxTermDurationInDays;
        return this;
    }

    /**
     * <p>
     * The minimum term. The only possible value is 365 days.
     * </p>
     *
     * @return <p>
     *         The minimum term. The only possible value is 365 days.
     *         </p>
     */
    public Integer getMinTermDurationInDays() {
        return minTermDurationInDays;
    }

    /**
     * <p>
     * The minimum term. The only possible value is 365 days.
     * </p>
     *
     * @param minTermDurationInDays <p>
     *            The minimum term. The only possible value is 365 days.
     *            </p>
     */
    public void setMinTermDurationInDays(Integer minTermDurationInDays) {
        this.minTermDurationInDays = minTermDurationInDays;
    }

    /**
     * <p>
     * The minimum term. The only possible value is 365 days.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minTermDurationInDays <p>
     *            The minimum term. The only possible value is 365 days.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstanceAvailability withMinTermDurationInDays(Integer minTermDurationInDays) {
        this.minTermDurationInDays = minTermDurationInDays;
        return this;
    }

    /**
     * <p>
     * The network platform (<code>EC2-Classic</code> or <code>EC2-VPC</code>).
     * </p>
     *
     * @return <p>
     *         The network platform (<code>EC2-Classic</code> or
     *         <code>EC2-VPC</code>).
     *         </p>
     */
    public String getNetworkPlatform() {
        return networkPlatform;
    }

    /**
     * <p>
     * The network platform (<code>EC2-Classic</code> or <code>EC2-VPC</code>).
     * </p>
     *
     * @param networkPlatform <p>
     *            The network platform (<code>EC2-Classic</code> or
     *            <code>EC2-VPC</code>).
     *            </p>
     */
    public void setNetworkPlatform(String networkPlatform) {
        this.networkPlatform = networkPlatform;
    }

    /**
     * <p>
     * The network platform (<code>EC2-Classic</code> or <code>EC2-VPC</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkPlatform <p>
     *            The network platform (<code>EC2-Classic</code> or
     *            <code>EC2-VPC</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstanceAvailability withNetworkPlatform(String networkPlatform) {
        this.networkPlatform = networkPlatform;
        return this;
    }

    /**
     * <p>
     * The platform (<code>Linux/UNIX</code> or <code>Windows</code>).
     * </p>
     *
     * @return <p>
     *         The platform (<code>Linux/UNIX</code> or <code>Windows</code>).
     *         </p>
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * <p>
     * The platform (<code>Linux/UNIX</code> or <code>Windows</code>).
     * </p>
     *
     * @param platform <p>
     *            The platform (<code>Linux/UNIX</code> or <code>Windows</code>
     *            ).
     *            </p>
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform (<code>Linux/UNIX</code> or <code>Windows</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platform <p>
     *            The platform (<code>Linux/UNIX</code> or <code>Windows</code>
     *            ).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstanceAvailability withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * <p>
     * The purchase token. This token expires in two hours.
     * </p>
     *
     * @return <p>
     *         The purchase token. This token expires in two hours.
     *         </p>
     */
    public String getPurchaseToken() {
        return purchaseToken;
    }

    /**
     * <p>
     * The purchase token. This token expires in two hours.
     * </p>
     *
     * @param purchaseToken <p>
     *            The purchase token. This token expires in two hours.
     *            </p>
     */
    public void setPurchaseToken(String purchaseToken) {
        this.purchaseToken = purchaseToken;
    }

    /**
     * <p>
     * The purchase token. This token expires in two hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param purchaseToken <p>
     *            The purchase token. This token expires in two hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstanceAvailability withPurchaseToken(String purchaseToken) {
        this.purchaseToken = purchaseToken;
        return this;
    }

    /**
     * <p>
     * The schedule recurrence.
     * </p>
     *
     * @return <p>
     *         The schedule recurrence.
     *         </p>
     */
    public ScheduledInstanceRecurrence getRecurrence() {
        return recurrence;
    }

    /**
     * <p>
     * The schedule recurrence.
     * </p>
     *
     * @param recurrence <p>
     *            The schedule recurrence.
     *            </p>
     */
    public void setRecurrence(ScheduledInstanceRecurrence recurrence) {
        this.recurrence = recurrence;
    }

    /**
     * <p>
     * The schedule recurrence.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recurrence <p>
     *            The schedule recurrence.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstanceAvailability withRecurrence(ScheduledInstanceRecurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    /**
     * <p>
     * The number of hours in the schedule.
     * </p>
     *
     * @return <p>
     *         The number of hours in the schedule.
     *         </p>
     */
    public Integer getSlotDurationInHours() {
        return slotDurationInHours;
    }

    /**
     * <p>
     * The number of hours in the schedule.
     * </p>
     *
     * @param slotDurationInHours <p>
     *            The number of hours in the schedule.
     *            </p>
     */
    public void setSlotDurationInHours(Integer slotDurationInHours) {
        this.slotDurationInHours = slotDurationInHours;
    }

    /**
     * <p>
     * The number of hours in the schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slotDurationInHours <p>
     *            The number of hours in the schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstanceAvailability withSlotDurationInHours(Integer slotDurationInHours) {
        this.slotDurationInHours = slotDurationInHours;
        return this;
    }

    /**
     * <p>
     * The total number of hours for a single instance for the entire term.
     * </p>
     *
     * @return <p>
     *         The total number of hours for a single instance for the entire
     *         term.
     *         </p>
     */
    public Integer getTotalScheduledInstanceHours() {
        return totalScheduledInstanceHours;
    }

    /**
     * <p>
     * The total number of hours for a single instance for the entire term.
     * </p>
     *
     * @param totalScheduledInstanceHours <p>
     *            The total number of hours for a single instance for the entire
     *            term.
     *            </p>
     */
    public void setTotalScheduledInstanceHours(Integer totalScheduledInstanceHours) {
        this.totalScheduledInstanceHours = totalScheduledInstanceHours;
    }

    /**
     * <p>
     * The total number of hours for a single instance for the entire term.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalScheduledInstanceHours <p>
     *            The total number of hours for a single instance for the entire
     *            term.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstanceAvailability withTotalScheduledInstanceHours(
            Integer totalScheduledInstanceHours) {
        this.totalScheduledInstanceHours = totalScheduledInstanceHours;
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
        if (getAvailableInstanceCount() != null)
            sb.append("AvailableInstanceCount: " + getAvailableInstanceCount() + ",");
        if (getFirstSlotStartTime() != null)
            sb.append("FirstSlotStartTime: " + getFirstSlotStartTime() + ",");
        if (getHourlyPrice() != null)
            sb.append("HourlyPrice: " + getHourlyPrice() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getMaxTermDurationInDays() != null)
            sb.append("MaxTermDurationInDays: " + getMaxTermDurationInDays() + ",");
        if (getMinTermDurationInDays() != null)
            sb.append("MinTermDurationInDays: " + getMinTermDurationInDays() + ",");
        if (getNetworkPlatform() != null)
            sb.append("NetworkPlatform: " + getNetworkPlatform() + ",");
        if (getPlatform() != null)
            sb.append("Platform: " + getPlatform() + ",");
        if (getPurchaseToken() != null)
            sb.append("PurchaseToken: " + getPurchaseToken() + ",");
        if (getRecurrence() != null)
            sb.append("Recurrence: " + getRecurrence() + ",");
        if (getSlotDurationInHours() != null)
            sb.append("SlotDurationInHours: " + getSlotDurationInHours() + ",");
        if (getTotalScheduledInstanceHours() != null)
            sb.append("TotalScheduledInstanceHours: " + getTotalScheduledInstanceHours());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime
                * hashCode
                + ((getAvailableInstanceCount() == null) ? 0 : getAvailableInstanceCount()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getFirstSlotStartTime() == null) ? 0 : getFirstSlotStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getHourlyPrice() == null) ? 0 : getHourlyPrice().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime
                * hashCode
                + ((getMaxTermDurationInDays() == null) ? 0 : getMaxTermDurationInDays().hashCode());
        hashCode = prime
                * hashCode
                + ((getMinTermDurationInDays() == null) ? 0 : getMinTermDurationInDays().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkPlatform() == null) ? 0 : getNetworkPlatform().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode
                + ((getPurchaseToken() == null) ? 0 : getPurchaseToken().hashCode());
        hashCode = prime * hashCode + ((getRecurrence() == null) ? 0 : getRecurrence().hashCode());
        hashCode = prime * hashCode
                + ((getSlotDurationInHours() == null) ? 0 : getSlotDurationInHours().hashCode());
        hashCode = prime
                * hashCode
                + ((getTotalScheduledInstanceHours() == null) ? 0
                        : getTotalScheduledInstanceHours().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduledInstanceAvailability == false)
            return false;
        ScheduledInstanceAvailability other = (ScheduledInstanceAvailability) obj;

        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getAvailableInstanceCount() == null ^ this.getAvailableInstanceCount() == null)
            return false;
        if (other.getAvailableInstanceCount() != null
                && other.getAvailableInstanceCount().equals(this.getAvailableInstanceCount()) == false)
            return false;
        if (other.getFirstSlotStartTime() == null ^ this.getFirstSlotStartTime() == null)
            return false;
        if (other.getFirstSlotStartTime() != null
                && other.getFirstSlotStartTime().equals(this.getFirstSlotStartTime()) == false)
            return false;
        if (other.getHourlyPrice() == null ^ this.getHourlyPrice() == null)
            return false;
        if (other.getHourlyPrice() != null
                && other.getHourlyPrice().equals(this.getHourlyPrice()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getMaxTermDurationInDays() == null ^ this.getMaxTermDurationInDays() == null)
            return false;
        if (other.getMaxTermDurationInDays() != null
                && other.getMaxTermDurationInDays().equals(this.getMaxTermDurationInDays()) == false)
            return false;
        if (other.getMinTermDurationInDays() == null ^ this.getMinTermDurationInDays() == null)
            return false;
        if (other.getMinTermDurationInDays() != null
                && other.getMinTermDurationInDays().equals(this.getMinTermDurationInDays()) == false)
            return false;
        if (other.getNetworkPlatform() == null ^ this.getNetworkPlatform() == null)
            return false;
        if (other.getNetworkPlatform() != null
                && other.getNetworkPlatform().equals(this.getNetworkPlatform()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getPurchaseToken() == null ^ this.getPurchaseToken() == null)
            return false;
        if (other.getPurchaseToken() != null
                && other.getPurchaseToken().equals(this.getPurchaseToken()) == false)
            return false;
        if (other.getRecurrence() == null ^ this.getRecurrence() == null)
            return false;
        if (other.getRecurrence() != null
                && other.getRecurrence().equals(this.getRecurrence()) == false)
            return false;
        if (other.getSlotDurationInHours() == null ^ this.getSlotDurationInHours() == null)
            return false;
        if (other.getSlotDurationInHours() != null
                && other.getSlotDurationInHours().equals(this.getSlotDurationInHours()) == false)
            return false;
        if (other.getTotalScheduledInstanceHours() == null
                ^ this.getTotalScheduledInstanceHours() == null)
            return false;
        if (other.getTotalScheduledInstanceHours() != null
                && other.getTotalScheduledInstanceHours().equals(
                        this.getTotalScheduledInstanceHours()) == false)
            return false;
        return true;
    }
}
