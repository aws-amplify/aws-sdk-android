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
 * Describes a Scheduled Instance.
 * </p>
 */
public class ScheduledInstance implements Serializable {
    /**
     * <p>
     * The Availability Zone.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The date when the Scheduled Instance was purchased.
     * </p>
     */
    private java.util.Date createDate;

    /**
     * <p>
     * The hourly price for a single instance.
     * </p>
     */
    private String hourlyPrice;

    /**
     * <p>
     * The number of instances.
     * </p>
     */
    private Integer instanceCount;

    /**
     * <p>
     * The instance type.
     * </p>
     */
    private String instanceType;

    /**
     * <p>
     * The network platform (<code>EC2-Classic</code> or <code>EC2-VPC</code>).
     * </p>
     */
    private String networkPlatform;

    /**
     * <p>
     * The time for the next schedule to start.
     * </p>
     */
    private java.util.Date nextSlotStartTime;

    /**
     * <p>
     * The platform (<code>Linux/UNIX</code> or <code>Windows</code>).
     * </p>
     */
    private String platform;

    /**
     * <p>
     * The time that the previous schedule ended or will end.
     * </p>
     */
    private java.util.Date previousSlotEndTime;

    /**
     * <p>
     * The schedule recurrence.
     * </p>
     */
    private ScheduledInstanceRecurrence recurrence;

    /**
     * <p>
     * The Scheduled Instance ID.
     * </p>
     */
    private String scheduledInstanceId;

    /**
     * <p>
     * The number of hours in the schedule.
     * </p>
     */
    private Integer slotDurationInHours;

    /**
     * <p>
     * The end date for the Scheduled Instance.
     * </p>
     */
    private java.util.Date termEndDate;

    /**
     * <p>
     * The start date for the Scheduled Instance.
     * </p>
     */
    private java.util.Date termStartDate;

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
    public ScheduledInstance withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The date when the Scheduled Instance was purchased.
     * </p>
     *
     * @return <p>
     *         The date when the Scheduled Instance was purchased.
     *         </p>
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }

    /**
     * <p>
     * The date when the Scheduled Instance was purchased.
     * </p>
     *
     * @param createDate <p>
     *            The date when the Scheduled Instance was purchased.
     *            </p>
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date when the Scheduled Instance was purchased.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createDate <p>
     *            The date when the Scheduled Instance was purchased.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstance withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
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
    public ScheduledInstance withHourlyPrice(String hourlyPrice) {
        this.hourlyPrice = hourlyPrice;
        return this;
    }

    /**
     * <p>
     * The number of instances.
     * </p>
     *
     * @return <p>
     *         The number of instances.
     *         </p>
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }

    /**
     * <p>
     * The number of instances.
     * </p>
     *
     * @param instanceCount <p>
     *            The number of instances.
     *            </p>
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceCount <p>
     *            The number of instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstance withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     *
     * @return <p>
     *         The instance type.
     *         </p>
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     *
     * @param instanceType <p>
     *            The instance type.
     *            </p>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceType <p>
     *            The instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstance withInstanceType(String instanceType) {
        this.instanceType = instanceType;
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
    public ScheduledInstance withNetworkPlatform(String networkPlatform) {
        this.networkPlatform = networkPlatform;
        return this;
    }

    /**
     * <p>
     * The time for the next schedule to start.
     * </p>
     *
     * @return <p>
     *         The time for the next schedule to start.
     *         </p>
     */
    public java.util.Date getNextSlotStartTime() {
        return nextSlotStartTime;
    }

    /**
     * <p>
     * The time for the next schedule to start.
     * </p>
     *
     * @param nextSlotStartTime <p>
     *            The time for the next schedule to start.
     *            </p>
     */
    public void setNextSlotStartTime(java.util.Date nextSlotStartTime) {
        this.nextSlotStartTime = nextSlotStartTime;
    }

    /**
     * <p>
     * The time for the next schedule to start.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextSlotStartTime <p>
     *            The time for the next schedule to start.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstance withNextSlotStartTime(java.util.Date nextSlotStartTime) {
        this.nextSlotStartTime = nextSlotStartTime;
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
    public ScheduledInstance withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * <p>
     * The time that the previous schedule ended or will end.
     * </p>
     *
     * @return <p>
     *         The time that the previous schedule ended or will end.
     *         </p>
     */
    public java.util.Date getPreviousSlotEndTime() {
        return previousSlotEndTime;
    }

    /**
     * <p>
     * The time that the previous schedule ended or will end.
     * </p>
     *
     * @param previousSlotEndTime <p>
     *            The time that the previous schedule ended or will end.
     *            </p>
     */
    public void setPreviousSlotEndTime(java.util.Date previousSlotEndTime) {
        this.previousSlotEndTime = previousSlotEndTime;
    }

    /**
     * <p>
     * The time that the previous schedule ended or will end.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param previousSlotEndTime <p>
     *            The time that the previous schedule ended or will end.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstance withPreviousSlotEndTime(java.util.Date previousSlotEndTime) {
        this.previousSlotEndTime = previousSlotEndTime;
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
    public ScheduledInstance withRecurrence(ScheduledInstanceRecurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    /**
     * <p>
     * The Scheduled Instance ID.
     * </p>
     *
     * @return <p>
     *         The Scheduled Instance ID.
     *         </p>
     */
    public String getScheduledInstanceId() {
        return scheduledInstanceId;
    }

    /**
     * <p>
     * The Scheduled Instance ID.
     * </p>
     *
     * @param scheduledInstanceId <p>
     *            The Scheduled Instance ID.
     *            </p>
     */
    public void setScheduledInstanceId(String scheduledInstanceId) {
        this.scheduledInstanceId = scheduledInstanceId;
    }

    /**
     * <p>
     * The Scheduled Instance ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduledInstanceId <p>
     *            The Scheduled Instance ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstance withScheduledInstanceId(String scheduledInstanceId) {
        this.scheduledInstanceId = scheduledInstanceId;
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
    public ScheduledInstance withSlotDurationInHours(Integer slotDurationInHours) {
        this.slotDurationInHours = slotDurationInHours;
        return this;
    }

    /**
     * <p>
     * The end date for the Scheduled Instance.
     * </p>
     *
     * @return <p>
     *         The end date for the Scheduled Instance.
     *         </p>
     */
    public java.util.Date getTermEndDate() {
        return termEndDate;
    }

    /**
     * <p>
     * The end date for the Scheduled Instance.
     * </p>
     *
     * @param termEndDate <p>
     *            The end date for the Scheduled Instance.
     *            </p>
     */
    public void setTermEndDate(java.util.Date termEndDate) {
        this.termEndDate = termEndDate;
    }

    /**
     * <p>
     * The end date for the Scheduled Instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param termEndDate <p>
     *            The end date for the Scheduled Instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstance withTermEndDate(java.util.Date termEndDate) {
        this.termEndDate = termEndDate;
        return this;
    }

    /**
     * <p>
     * The start date for the Scheduled Instance.
     * </p>
     *
     * @return <p>
     *         The start date for the Scheduled Instance.
     *         </p>
     */
    public java.util.Date getTermStartDate() {
        return termStartDate;
    }

    /**
     * <p>
     * The start date for the Scheduled Instance.
     * </p>
     *
     * @param termStartDate <p>
     *            The start date for the Scheduled Instance.
     *            </p>
     */
    public void setTermStartDate(java.util.Date termStartDate) {
        this.termStartDate = termStartDate;
    }

    /**
     * <p>
     * The start date for the Scheduled Instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param termStartDate <p>
     *            The start date for the Scheduled Instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduledInstance withTermStartDate(java.util.Date termStartDate) {
        this.termStartDate = termStartDate;
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
    public ScheduledInstance withTotalScheduledInstanceHours(Integer totalScheduledInstanceHours) {
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
        if (getCreateDate() != null)
            sb.append("CreateDate: " + getCreateDate() + ",");
        if (getHourlyPrice() != null)
            sb.append("HourlyPrice: " + getHourlyPrice() + ",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: " + getInstanceCount() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getNetworkPlatform() != null)
            sb.append("NetworkPlatform: " + getNetworkPlatform() + ",");
        if (getNextSlotStartTime() != null)
            sb.append("NextSlotStartTime: " + getNextSlotStartTime() + ",");
        if (getPlatform() != null)
            sb.append("Platform: " + getPlatform() + ",");
        if (getPreviousSlotEndTime() != null)
            sb.append("PreviousSlotEndTime: " + getPreviousSlotEndTime() + ",");
        if (getRecurrence() != null)
            sb.append("Recurrence: " + getRecurrence() + ",");
        if (getScheduledInstanceId() != null)
            sb.append("ScheduledInstanceId: " + getScheduledInstanceId() + ",");
        if (getSlotDurationInHours() != null)
            sb.append("SlotDurationInHours: " + getSlotDurationInHours() + ",");
        if (getTermEndDate() != null)
            sb.append("TermEndDate: " + getTermEndDate() + ",");
        if (getTermStartDate() != null)
            sb.append("TermStartDate: " + getTermStartDate() + ",");
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
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode
                + ((getHourlyPrice() == null) ? 0 : getHourlyPrice().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkPlatform() == null) ? 0 : getNetworkPlatform().hashCode());
        hashCode = prime * hashCode
                + ((getNextSlotStartTime() == null) ? 0 : getNextSlotStartTime().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode
                + ((getPreviousSlotEndTime() == null) ? 0 : getPreviousSlotEndTime().hashCode());
        hashCode = prime * hashCode + ((getRecurrence() == null) ? 0 : getRecurrence().hashCode());
        hashCode = prime * hashCode
                + ((getScheduledInstanceId() == null) ? 0 : getScheduledInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getSlotDurationInHours() == null) ? 0 : getSlotDurationInHours().hashCode());
        hashCode = prime * hashCode
                + ((getTermEndDate() == null) ? 0 : getTermEndDate().hashCode());
        hashCode = prime * hashCode
                + ((getTermStartDate() == null) ? 0 : getTermStartDate().hashCode());
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

        if (obj instanceof ScheduledInstance == false)
            return false;
        ScheduledInstance other = (ScheduledInstance) obj;

        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null
                && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getHourlyPrice() == null ^ this.getHourlyPrice() == null)
            return false;
        if (other.getHourlyPrice() != null
                && other.getHourlyPrice().equals(this.getHourlyPrice()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null
                && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getNetworkPlatform() == null ^ this.getNetworkPlatform() == null)
            return false;
        if (other.getNetworkPlatform() != null
                && other.getNetworkPlatform().equals(this.getNetworkPlatform()) == false)
            return false;
        if (other.getNextSlotStartTime() == null ^ this.getNextSlotStartTime() == null)
            return false;
        if (other.getNextSlotStartTime() != null
                && other.getNextSlotStartTime().equals(this.getNextSlotStartTime()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getPreviousSlotEndTime() == null ^ this.getPreviousSlotEndTime() == null)
            return false;
        if (other.getPreviousSlotEndTime() != null
                && other.getPreviousSlotEndTime().equals(this.getPreviousSlotEndTime()) == false)
            return false;
        if (other.getRecurrence() == null ^ this.getRecurrence() == null)
            return false;
        if (other.getRecurrence() != null
                && other.getRecurrence().equals(this.getRecurrence()) == false)
            return false;
        if (other.getScheduledInstanceId() == null ^ this.getScheduledInstanceId() == null)
            return false;
        if (other.getScheduledInstanceId() != null
                && other.getScheduledInstanceId().equals(this.getScheduledInstanceId()) == false)
            return false;
        if (other.getSlotDurationInHours() == null ^ this.getSlotDurationInHours() == null)
            return false;
        if (other.getSlotDurationInHours() != null
                && other.getSlotDurationInHours().equals(this.getSlotDurationInHours()) == false)
            return false;
        if (other.getTermEndDate() == null ^ this.getTermEndDate() == null)
            return false;
        if (other.getTermEndDate() != null
                && other.getTermEndDate().equals(this.getTermEndDate()) == false)
            return false;
        if (other.getTermStartDate() == null ^ this.getTermStartDate() == null)
            return false;
        if (other.getTermStartDate() != null
                && other.getTermStartDate().equals(this.getTermStartDate()) == false)
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
