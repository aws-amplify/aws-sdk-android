/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mobileanalytics.model;

import java.io.Serializable;

/**
 * Session
 */
public class Session implements Serializable {

    private String id;

    private Long duration;

    private String startTimestamp;

    private String stopTimestamp;

    /**
     * Returns the value of the Id property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @return The value of the Id property for this object.
     */
    public String getId() {
        return id;
    }
    
    /**
     * Sets the value of the Id property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param id The new value for the Id property for this object.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * Sets the value of the Id property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param id The new value for the Id property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Session withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns the value of the Duration property for this object.
     *
     * @return The value of the Duration property for this object.
     */
    public Long getDuration() {
        return duration;
    }
    
    /**
     * Sets the value of the Duration property for this object.
     *
     * @param duration The new value for the Duration property for this object.
     */
    public void setDuration(Long duration) {
        this.duration = duration;
    }
    
    /**
     * Sets the value of the Duration property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param duration The new value for the Duration property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Session withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Returns the value of the StartTimestamp property for this object.
     *
     * @return The value of the StartTimestamp property for this object.
     */
    public String getStartTimestamp() {
        return startTimestamp;
    }
    
    /**
     * Sets the value of the StartTimestamp property for this object.
     *
     * @param startTimestamp The new value for the StartTimestamp property for this object.
     */
    public void setStartTimestamp(String startTimestamp) {
        this.startTimestamp = startTimestamp;
    }
    
    /**
     * Sets the value of the StartTimestamp property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTimestamp The new value for the StartTimestamp property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Session withStartTimestamp(String startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }

    /**
     * Returns the value of the StopTimestamp property for this object.
     *
     * @return The value of the StopTimestamp property for this object.
     */
    public String getStopTimestamp() {
        return stopTimestamp;
    }
    
    /**
     * Sets the value of the StopTimestamp property for this object.
     *
     * @param stopTimestamp The new value for the StopTimestamp property for this object.
     */
    public void setStopTimestamp(String stopTimestamp) {
        this.stopTimestamp = stopTimestamp;
    }
    
    /**
     * Sets the value of the StopTimestamp property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stopTimestamp The new value for the StopTimestamp property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Session withStopTimestamp(String stopTimestamp) {
        this.stopTimestamp = stopTimestamp;
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getDuration() != null) sb.append("Duration: " + getDuration() + ",");
        if (getStartTimestamp() != null) sb.append("StartTimestamp: " + getStartTimestamp() + ",");
        if (getStopTimestamp() != null) sb.append("StopTimestamp: " + getStopTimestamp() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode()); 
        hashCode = prime * hashCode + ((getStartTimestamp() == null) ? 0 : getStartTimestamp().hashCode()); 
        hashCode = prime * hashCode + ((getStopTimestamp() == null) ? 0 : getStopTimestamp().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Session == false) return false;
        Session other = (Session)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getDuration() == null ^ this.getDuration() == null) return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false) return false; 
        if (other.getStartTimestamp() == null ^ this.getStartTimestamp() == null) return false;
        if (other.getStartTimestamp() != null && other.getStartTimestamp().equals(this.getStartTimestamp()) == false) return false; 
        if (other.getStopTimestamp() == null ^ this.getStopTimestamp() == null) return false;
        if (other.getStopTimestamp() != null && other.getStopTimestamp().equals(this.getStopTimestamp()) == false) return false; 
        return true;
    }
    
}
    