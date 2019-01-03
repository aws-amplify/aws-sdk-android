/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a Device Defender security profile behavior violation.
 * </p>
 */
public class ViolationEvent implements Serializable {
    /**
     * <p>
     * The ID of the violation event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     */
    private String violationId;

    /**
     * <p>
     * The name of the thing responsible for the violation event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String thingName;

    /**
     * <p>
     * The name of the security profile whose behavior was violated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String securityProfileName;

    /**
     * <p>
     * The behavior which was violated.
     * </p>
     */
    private Behavior behavior;

    /**
     * <p>
     * The value of the metric (the measurement).
     * </p>
     */
    private MetricValue metricValue;

    /**
     * <p>
     * The type of violation event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>in-alarm, alarm-cleared, alarm-invalidated
     */
    private String violationEventType;

    /**
     * <p>
     * The time the violation event occurred.
     * </p>
     */
    private java.util.Date violationEventTime;

    /**
     * <p>
     * The ID of the violation event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @return <p>
     *         The ID of the violation event.
     *         </p>
     */
    public String getViolationId() {
        return violationId;
    }

    /**
     * <p>
     * The ID of the violation event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @param violationId <p>
     *            The ID of the violation event.
     *            </p>
     */
    public void setViolationId(String violationId) {
        this.violationId = violationId;
    }

    /**
     * <p>
     * The ID of the violation event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @param violationId <p>
     *            The ID of the violation event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViolationEvent withViolationId(String violationId) {
        this.violationId = violationId;
        return this;
    }

    /**
     * <p>
     * The name of the thing responsible for the violation event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the thing responsible for the violation event.
     *         </p>
     */
    public String getThingName() {
        return thingName;
    }

    /**
     * <p>
     * The name of the thing responsible for the violation event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingName <p>
     *            The name of the thing responsible for the violation event.
     *            </p>
     */
    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing responsible for the violation event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingName <p>
     *            The name of the thing responsible for the violation event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViolationEvent withThingName(String thingName) {
        this.thingName = thingName;
        return this;
    }

    /**
     * <p>
     * The name of the security profile whose behavior was violated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the security profile whose behavior was violated.
     *         </p>
     */
    public String getSecurityProfileName() {
        return securityProfileName;
    }

    /**
     * <p>
     * The name of the security profile whose behavior was violated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param securityProfileName <p>
     *            The name of the security profile whose behavior was violated.
     *            </p>
     */
    public void setSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
    }

    /**
     * <p>
     * The name of the security profile whose behavior was violated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param securityProfileName <p>
     *            The name of the security profile whose behavior was violated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViolationEvent withSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
        return this;
    }

    /**
     * <p>
     * The behavior which was violated.
     * </p>
     *
     * @return <p>
     *         The behavior which was violated.
     *         </p>
     */
    public Behavior getBehavior() {
        return behavior;
    }

    /**
     * <p>
     * The behavior which was violated.
     * </p>
     *
     * @param behavior <p>
     *            The behavior which was violated.
     *            </p>
     */
    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    /**
     * <p>
     * The behavior which was violated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param behavior <p>
     *            The behavior which was violated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViolationEvent withBehavior(Behavior behavior) {
        this.behavior = behavior;
        return this;
    }

    /**
     * <p>
     * The value of the metric (the measurement).
     * </p>
     *
     * @return <p>
     *         The value of the metric (the measurement).
     *         </p>
     */
    public MetricValue getMetricValue() {
        return metricValue;
    }

    /**
     * <p>
     * The value of the metric (the measurement).
     * </p>
     *
     * @param metricValue <p>
     *            The value of the metric (the measurement).
     *            </p>
     */
    public void setMetricValue(MetricValue metricValue) {
        this.metricValue = metricValue;
    }

    /**
     * <p>
     * The value of the metric (the measurement).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricValue <p>
     *            The value of the metric (the measurement).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViolationEvent withMetricValue(MetricValue metricValue) {
        this.metricValue = metricValue;
        return this;
    }

    /**
     * <p>
     * The type of violation event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>in-alarm, alarm-cleared, alarm-invalidated
     *
     * @return <p>
     *         The type of violation event.
     *         </p>
     * @see ViolationEventType
     */
    public String getViolationEventType() {
        return violationEventType;
    }

    /**
     * <p>
     * The type of violation event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>in-alarm, alarm-cleared, alarm-invalidated
     *
     * @param violationEventType <p>
     *            The type of violation event.
     *            </p>
     * @see ViolationEventType
     */
    public void setViolationEventType(String violationEventType) {
        this.violationEventType = violationEventType;
    }

    /**
     * <p>
     * The type of violation event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>in-alarm, alarm-cleared, alarm-invalidated
     *
     * @param violationEventType <p>
     *            The type of violation event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ViolationEventType
     */
    public ViolationEvent withViolationEventType(String violationEventType) {
        this.violationEventType = violationEventType;
        return this;
    }

    /**
     * <p>
     * The type of violation event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>in-alarm, alarm-cleared, alarm-invalidated
     *
     * @param violationEventType <p>
     *            The type of violation event.
     *            </p>
     * @see ViolationEventType
     */
    public void setViolationEventType(ViolationEventType violationEventType) {
        this.violationEventType = violationEventType.toString();
    }

    /**
     * <p>
     * The type of violation event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>in-alarm, alarm-cleared, alarm-invalidated
     *
     * @param violationEventType <p>
     *            The type of violation event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ViolationEventType
     */
    public ViolationEvent withViolationEventType(ViolationEventType violationEventType) {
        this.violationEventType = violationEventType.toString();
        return this;
    }

    /**
     * <p>
     * The time the violation event occurred.
     * </p>
     *
     * @return <p>
     *         The time the violation event occurred.
     *         </p>
     */
    public java.util.Date getViolationEventTime() {
        return violationEventTime;
    }

    /**
     * <p>
     * The time the violation event occurred.
     * </p>
     *
     * @param violationEventTime <p>
     *            The time the violation event occurred.
     *            </p>
     */
    public void setViolationEventTime(java.util.Date violationEventTime) {
        this.violationEventTime = violationEventTime;
    }

    /**
     * <p>
     * The time the violation event occurred.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param violationEventTime <p>
     *            The time the violation event occurred.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViolationEvent withViolationEventTime(java.util.Date violationEventTime) {
        this.violationEventTime = violationEventTime;
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
        if (getViolationId() != null)
            sb.append("violationId: " + getViolationId() + ",");
        if (getThingName() != null)
            sb.append("thingName: " + getThingName() + ",");
        if (getSecurityProfileName() != null)
            sb.append("securityProfileName: " + getSecurityProfileName() + ",");
        if (getBehavior() != null)
            sb.append("behavior: " + getBehavior() + ",");
        if (getMetricValue() != null)
            sb.append("metricValue: " + getMetricValue() + ",");
        if (getViolationEventType() != null)
            sb.append("violationEventType: " + getViolationEventType() + ",");
        if (getViolationEventTime() != null)
            sb.append("violationEventTime: " + getViolationEventTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getViolationId() == null) ? 0 : getViolationId().hashCode());
        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityProfileName() == null) ? 0 : getSecurityProfileName().hashCode());
        hashCode = prime * hashCode + ((getBehavior() == null) ? 0 : getBehavior().hashCode());
        hashCode = prime * hashCode
                + ((getMetricValue() == null) ? 0 : getMetricValue().hashCode());
        hashCode = prime * hashCode
                + ((getViolationEventType() == null) ? 0 : getViolationEventType().hashCode());
        hashCode = prime * hashCode
                + ((getViolationEventTime() == null) ? 0 : getViolationEventTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ViolationEvent == false)
            return false;
        ViolationEvent other = (ViolationEvent) obj;

        if (other.getViolationId() == null ^ this.getViolationId() == null)
            return false;
        if (other.getViolationId() != null
                && other.getViolationId().equals(this.getViolationId()) == false)
            return false;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null
                && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getSecurityProfileName() == null ^ this.getSecurityProfileName() == null)
            return false;
        if (other.getSecurityProfileName() != null
                && other.getSecurityProfileName().equals(this.getSecurityProfileName()) == false)
            return false;
        if (other.getBehavior() == null ^ this.getBehavior() == null)
            return false;
        if (other.getBehavior() != null && other.getBehavior().equals(this.getBehavior()) == false)
            return false;
        if (other.getMetricValue() == null ^ this.getMetricValue() == null)
            return false;
        if (other.getMetricValue() != null
                && other.getMetricValue().equals(this.getMetricValue()) == false)
            return false;
        if (other.getViolationEventType() == null ^ this.getViolationEventType() == null)
            return false;
        if (other.getViolationEventType() != null
                && other.getViolationEventType().equals(this.getViolationEventType()) == false)
            return false;
        if (other.getViolationEventTime() == null ^ this.getViolationEventTime() == null)
            return false;
        if (other.getViolationEventTime() != null
                && other.getViolationEventTime().equals(this.getViolationEventTime()) == false)
            return false;
        return true;
    }
}
