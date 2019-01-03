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
 * Information about an active Device Defender security profile behavior
 * violation.
 * </p>
 */
public class ActiveViolation implements Serializable {
    /**
     * <p>
     * The ID of the active violation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     */
    private String violationId;

    /**
     * <p>
     * The name of the thing responsible for the active violation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String thingName;

    /**
     * <p>
     * The security profile whose behavior is in violation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String securityProfileName;

    /**
     * <p>
     * The behavior which is being violated.
     * </p>
     */
    private Behavior behavior;

    /**
     * <p>
     * The value of the metric (the measurement) which caused the most recent
     * violation.
     * </p>
     */
    private MetricValue lastViolationValue;

    /**
     * <p>
     * The time the most recent violation occurred.
     * </p>
     */
    private java.util.Date lastViolationTime;

    /**
     * <p>
     * The time the violation started.
     * </p>
     */
    private java.util.Date violationStartTime;

    /**
     * <p>
     * The ID of the active violation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @return <p>
     *         The ID of the active violation.
     *         </p>
     */
    public String getViolationId() {
        return violationId;
    }

    /**
     * <p>
     * The ID of the active violation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @param violationId <p>
     *            The ID of the active violation.
     *            </p>
     */
    public void setViolationId(String violationId) {
        this.violationId = violationId;
    }

    /**
     * <p>
     * The ID of the active violation.
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
     *            The ID of the active violation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActiveViolation withViolationId(String violationId) {
        this.violationId = violationId;
        return this;
    }

    /**
     * <p>
     * The name of the thing responsible for the active violation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the thing responsible for the active violation.
     *         </p>
     */
    public String getThingName() {
        return thingName;
    }

    /**
     * <p>
     * The name of the thing responsible for the active violation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingName <p>
     *            The name of the thing responsible for the active violation.
     *            </p>
     */
    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing responsible for the active violation.
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
     *            The name of the thing responsible for the active violation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActiveViolation withThingName(String thingName) {
        this.thingName = thingName;
        return this;
    }

    /**
     * <p>
     * The security profile whose behavior is in violation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The security profile whose behavior is in violation.
     *         </p>
     */
    public String getSecurityProfileName() {
        return securityProfileName;
    }

    /**
     * <p>
     * The security profile whose behavior is in violation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param securityProfileName <p>
     *            The security profile whose behavior is in violation.
     *            </p>
     */
    public void setSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
    }

    /**
     * <p>
     * The security profile whose behavior is in violation.
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
     *            The security profile whose behavior is in violation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActiveViolation withSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
        return this;
    }

    /**
     * <p>
     * The behavior which is being violated.
     * </p>
     *
     * @return <p>
     *         The behavior which is being violated.
     *         </p>
     */
    public Behavior getBehavior() {
        return behavior;
    }

    /**
     * <p>
     * The behavior which is being violated.
     * </p>
     *
     * @param behavior <p>
     *            The behavior which is being violated.
     *            </p>
     */
    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    /**
     * <p>
     * The behavior which is being violated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param behavior <p>
     *            The behavior which is being violated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActiveViolation withBehavior(Behavior behavior) {
        this.behavior = behavior;
        return this;
    }

    /**
     * <p>
     * The value of the metric (the measurement) which caused the most recent
     * violation.
     * </p>
     *
     * @return <p>
     *         The value of the metric (the measurement) which caused the most
     *         recent violation.
     *         </p>
     */
    public MetricValue getLastViolationValue() {
        return lastViolationValue;
    }

    /**
     * <p>
     * The value of the metric (the measurement) which caused the most recent
     * violation.
     * </p>
     *
     * @param lastViolationValue <p>
     *            The value of the metric (the measurement) which caused the
     *            most recent violation.
     *            </p>
     */
    public void setLastViolationValue(MetricValue lastViolationValue) {
        this.lastViolationValue = lastViolationValue;
    }

    /**
     * <p>
     * The value of the metric (the measurement) which caused the most recent
     * violation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastViolationValue <p>
     *            The value of the metric (the measurement) which caused the
     *            most recent violation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActiveViolation withLastViolationValue(MetricValue lastViolationValue) {
        this.lastViolationValue = lastViolationValue;
        return this;
    }

    /**
     * <p>
     * The time the most recent violation occurred.
     * </p>
     *
     * @return <p>
     *         The time the most recent violation occurred.
     *         </p>
     */
    public java.util.Date getLastViolationTime() {
        return lastViolationTime;
    }

    /**
     * <p>
     * The time the most recent violation occurred.
     * </p>
     *
     * @param lastViolationTime <p>
     *            The time the most recent violation occurred.
     *            </p>
     */
    public void setLastViolationTime(java.util.Date lastViolationTime) {
        this.lastViolationTime = lastViolationTime;
    }

    /**
     * <p>
     * The time the most recent violation occurred.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastViolationTime <p>
     *            The time the most recent violation occurred.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActiveViolation withLastViolationTime(java.util.Date lastViolationTime) {
        this.lastViolationTime = lastViolationTime;
        return this;
    }

    /**
     * <p>
     * The time the violation started.
     * </p>
     *
     * @return <p>
     *         The time the violation started.
     *         </p>
     */
    public java.util.Date getViolationStartTime() {
        return violationStartTime;
    }

    /**
     * <p>
     * The time the violation started.
     * </p>
     *
     * @param violationStartTime <p>
     *            The time the violation started.
     *            </p>
     */
    public void setViolationStartTime(java.util.Date violationStartTime) {
        this.violationStartTime = violationStartTime;
    }

    /**
     * <p>
     * The time the violation started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param violationStartTime <p>
     *            The time the violation started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActiveViolation withViolationStartTime(java.util.Date violationStartTime) {
        this.violationStartTime = violationStartTime;
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
        if (getLastViolationValue() != null)
            sb.append("lastViolationValue: " + getLastViolationValue() + ",");
        if (getLastViolationTime() != null)
            sb.append("lastViolationTime: " + getLastViolationTime() + ",");
        if (getViolationStartTime() != null)
            sb.append("violationStartTime: " + getViolationStartTime());
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
                + ((getLastViolationValue() == null) ? 0 : getLastViolationValue().hashCode());
        hashCode = prime * hashCode
                + ((getLastViolationTime() == null) ? 0 : getLastViolationTime().hashCode());
        hashCode = prime * hashCode
                + ((getViolationStartTime() == null) ? 0 : getViolationStartTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActiveViolation == false)
            return false;
        ActiveViolation other = (ActiveViolation) obj;

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
        if (other.getLastViolationValue() == null ^ this.getLastViolationValue() == null)
            return false;
        if (other.getLastViolationValue() != null
                && other.getLastViolationValue().equals(this.getLastViolationValue()) == false)
            return false;
        if (other.getLastViolationTime() == null ^ this.getLastViolationTime() == null)
            return false;
        if (other.getLastViolationTime() != null
                && other.getLastViolationTime().equals(this.getLastViolationTime()) == false)
            return false;
        if (other.getViolationStartTime() == null ^ this.getViolationStartTime() == null)
            return false;
        if (other.getViolationStartTime() != null
                && other.getViolationStartTime().equals(this.getViolationStartTime()) == false)
            return false;
        return true;
    }
}
