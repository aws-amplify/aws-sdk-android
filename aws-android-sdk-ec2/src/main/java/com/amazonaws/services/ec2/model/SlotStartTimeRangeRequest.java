/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes the time period for a Scheduled Instance to start its first
 * schedule.
 * </p>
 */
public class SlotStartTimeRangeRequest implements Serializable {

    /**
     * The earliest date and time, in UTC, for the Scheduled Instance to
     * start.
     */
    private java.util.Date earliestTime;

    /**
     * The latest date and time, in UTC, for the Scheduled Instance to start.
     */
    private java.util.Date latestTime;

    /**
     * The earliest date and time, in UTC, for the Scheduled Instance to
     * start.
     *
     * @return The earliest date and time, in UTC, for the Scheduled Instance to
     *         start.
     */
    public java.util.Date getEarliestTime() {
        return earliestTime;
    }
    
    /**
     * The earliest date and time, in UTC, for the Scheduled Instance to
     * start.
     *
     * @param earliestTime The earliest date and time, in UTC, for the Scheduled Instance to
     *         start.
     */
    public void setEarliestTime(java.util.Date earliestTime) {
        this.earliestTime = earliestTime;
    }
    
    /**
     * The earliest date and time, in UTC, for the Scheduled Instance to
     * start.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param earliestTime The earliest date and time, in UTC, for the Scheduled Instance to
     *         start.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SlotStartTimeRangeRequest withEarliestTime(java.util.Date earliestTime) {
        this.earliestTime = earliestTime;
        return this;
    }

    /**
     * The latest date and time, in UTC, for the Scheduled Instance to start.
     *
     * @return The latest date and time, in UTC, for the Scheduled Instance to start.
     */
    public java.util.Date getLatestTime() {
        return latestTime;
    }
    
    /**
     * The latest date and time, in UTC, for the Scheduled Instance to start.
     *
     * @param latestTime The latest date and time, in UTC, for the Scheduled Instance to start.
     */
    public void setLatestTime(java.util.Date latestTime) {
        this.latestTime = latestTime;
    }
    
    /**
     * The latest date and time, in UTC, for the Scheduled Instance to start.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param latestTime The latest date and time, in UTC, for the Scheduled Instance to start.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SlotStartTimeRangeRequest withLatestTime(java.util.Date latestTime) {
        this.latestTime = latestTime;
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
        if (getEarliestTime() != null) sb.append("EarliestTime: " + getEarliestTime() + ",");
        if (getLatestTime() != null) sb.append("LatestTime: " + getLatestTime() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEarliestTime() == null) ? 0 : getEarliestTime().hashCode()); 
        hashCode = prime * hashCode + ((getLatestTime() == null) ? 0 : getLatestTime().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SlotStartTimeRangeRequest == false) return false;
        SlotStartTimeRangeRequest other = (SlotStartTimeRangeRequest)obj;
        
        if (other.getEarliestTime() == null ^ this.getEarliestTime() == null) return false;
        if (other.getEarliestTime() != null && other.getEarliestTime().equals(this.getEarliestTime()) == false) return false; 
        if (other.getLatestTime() == null ^ this.getLatestTime() == null) return false;
        if (other.getLatestTime() != null && other.getLatestTime().equals(this.getLatestTime()) == false) return false; 
        return true;
    }
    
}
    