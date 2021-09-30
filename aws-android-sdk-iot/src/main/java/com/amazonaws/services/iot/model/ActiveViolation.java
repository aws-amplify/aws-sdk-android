/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     */
    private String thingName;

    /**
     * <p>
     * The security profile with the behavior is in violation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String securityProfileName;

    /**
     * <p>
     * The behavior that is being violated.
     * </p>
     */
    private Behavior behavior;

    /**
     * <p>
     * The value of the metric (the measurement) that caused the most recent
     * violation.
     * </p>
     */
    private MetricValue lastViolationValue;

    /**
     * <p>
     * The details of a violation event.
     * </p>
     */
    private ViolationEventAdditionalInfo violationEventAdditionalInfo;

    /**
     * <p>
     * The verification state of the violation (detect alarm).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FALSE_POSITIVE, BENIGN_POSITIVE, TRUE_POSITIVE,
     * UNKNOWN
     */
    private String verificationState;

    /**
     * <p>
     * The description of the verification state of the violation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     */
    private String verificationStateDescription;

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
     * The security profile with the behavior is in violation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The security profile with the behavior is in violation.
     *         </p>
     */
    public String getSecurityProfileName() {
        return securityProfileName;
    }

    /**
     * <p>
     * The security profile with the behavior is in violation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param securityProfileName <p>
     *            The security profile with the behavior is in violation.
     *            </p>
     */
    public void setSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
    }

    /**
     * <p>
     * The security profile with the behavior is in violation.
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
     *            The security profile with the behavior is in violation.
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
     * The behavior that is being violated.
     * </p>
     *
     * @return <p>
     *         The behavior that is being violated.
     *         </p>
     */
    public Behavior getBehavior() {
        return behavior;
    }

    /**
     * <p>
     * The behavior that is being violated.
     * </p>
     *
     * @param behavior <p>
     *            The behavior that is being violated.
     *            </p>
     */
    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    /**
     * <p>
     * The behavior that is being violated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param behavior <p>
     *            The behavior that is being violated.
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
     * The value of the metric (the measurement) that caused the most recent
     * violation.
     * </p>
     *
     * @return <p>
     *         The value of the metric (the measurement) that caused the most
     *         recent violation.
     *         </p>
     */
    public MetricValue getLastViolationValue() {
        return lastViolationValue;
    }

    /**
     * <p>
     * The value of the metric (the measurement) that caused the most recent
     * violation.
     * </p>
     *
     * @param lastViolationValue <p>
     *            The value of the metric (the measurement) that caused the most
     *            recent violation.
     *            </p>
     */
    public void setLastViolationValue(MetricValue lastViolationValue) {
        this.lastViolationValue = lastViolationValue;
    }

    /**
     * <p>
     * The value of the metric (the measurement) that caused the most recent
     * violation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastViolationValue <p>
     *            The value of the metric (the measurement) that caused the most
     *            recent violation.
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
     * The details of a violation event.
     * </p>
     *
     * @return <p>
     *         The details of a violation event.
     *         </p>
     */
    public ViolationEventAdditionalInfo getViolationEventAdditionalInfo() {
        return violationEventAdditionalInfo;
    }

    /**
     * <p>
     * The details of a violation event.
     * </p>
     *
     * @param violationEventAdditionalInfo <p>
     *            The details of a violation event.
     *            </p>
     */
    public void setViolationEventAdditionalInfo(
            ViolationEventAdditionalInfo violationEventAdditionalInfo) {
        this.violationEventAdditionalInfo = violationEventAdditionalInfo;
    }

    /**
     * <p>
     * The details of a violation event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param violationEventAdditionalInfo <p>
     *            The details of a violation event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActiveViolation withViolationEventAdditionalInfo(
            ViolationEventAdditionalInfo violationEventAdditionalInfo) {
        this.violationEventAdditionalInfo = violationEventAdditionalInfo;
        return this;
    }

    /**
     * <p>
     * The verification state of the violation (detect alarm).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FALSE_POSITIVE, BENIGN_POSITIVE, TRUE_POSITIVE,
     * UNKNOWN
     *
     * @return <p>
     *         The verification state of the violation (detect alarm).
     *         </p>
     * @see VerificationState
     */
    public String getVerificationState() {
        return verificationState;
    }

    /**
     * <p>
     * The verification state of the violation (detect alarm).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FALSE_POSITIVE, BENIGN_POSITIVE, TRUE_POSITIVE,
     * UNKNOWN
     *
     * @param verificationState <p>
     *            The verification state of the violation (detect alarm).
     *            </p>
     * @see VerificationState
     */
    public void setVerificationState(String verificationState) {
        this.verificationState = verificationState;
    }

    /**
     * <p>
     * The verification state of the violation (detect alarm).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FALSE_POSITIVE, BENIGN_POSITIVE, TRUE_POSITIVE,
     * UNKNOWN
     *
     * @param verificationState <p>
     *            The verification state of the violation (detect alarm).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VerificationState
     */
    public ActiveViolation withVerificationState(String verificationState) {
        this.verificationState = verificationState;
        return this;
    }

    /**
     * <p>
     * The verification state of the violation (detect alarm).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FALSE_POSITIVE, BENIGN_POSITIVE, TRUE_POSITIVE,
     * UNKNOWN
     *
     * @param verificationState <p>
     *            The verification state of the violation (detect alarm).
     *            </p>
     * @see VerificationState
     */
    public void setVerificationState(VerificationState verificationState) {
        this.verificationState = verificationState.toString();
    }

    /**
     * <p>
     * The verification state of the violation (detect alarm).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FALSE_POSITIVE, BENIGN_POSITIVE, TRUE_POSITIVE,
     * UNKNOWN
     *
     * @param verificationState <p>
     *            The verification state of the violation (detect alarm).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VerificationState
     */
    public ActiveViolation withVerificationState(VerificationState verificationState) {
        this.verificationState = verificationState.toString();
        return this;
    }

    /**
     * <p>
     * The description of the verification state of the violation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @return <p>
     *         The description of the verification state of the violation.
     *         </p>
     */
    public String getVerificationStateDescription() {
        return verificationStateDescription;
    }

    /**
     * <p>
     * The description of the verification state of the violation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @param verificationStateDescription <p>
     *            The description of the verification state of the violation.
     *            </p>
     */
    public void setVerificationStateDescription(String verificationStateDescription) {
        this.verificationStateDescription = verificationStateDescription;
    }

    /**
     * <p>
     * The description of the verification state of the violation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @param verificationStateDescription <p>
     *            The description of the verification state of the violation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActiveViolation withVerificationStateDescription(String verificationStateDescription) {
        this.verificationStateDescription = verificationStateDescription;
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
        if (getViolationEventAdditionalInfo() != null)
            sb.append("violationEventAdditionalInfo: " + getViolationEventAdditionalInfo() + ",");
        if (getVerificationState() != null)
            sb.append("verificationState: " + getVerificationState() + ",");
        if (getVerificationStateDescription() != null)
            sb.append("verificationStateDescription: " + getVerificationStateDescription() + ",");
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
        hashCode = prime
                * hashCode
                + ((getViolationEventAdditionalInfo() == null) ? 0
                        : getViolationEventAdditionalInfo().hashCode());
        hashCode = prime * hashCode
                + ((getVerificationState() == null) ? 0 : getVerificationState().hashCode());
        hashCode = prime
                * hashCode
                + ((getVerificationStateDescription() == null) ? 0
                        : getVerificationStateDescription().hashCode());
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
        if (other.getViolationEventAdditionalInfo() == null
                ^ this.getViolationEventAdditionalInfo() == null)
            return false;
        if (other.getViolationEventAdditionalInfo() != null
                && other.getViolationEventAdditionalInfo().equals(
                        this.getViolationEventAdditionalInfo()) == false)
            return false;
        if (other.getVerificationState() == null ^ this.getVerificationState() == null)
            return false;
        if (other.getVerificationState() != null
                && other.getVerificationState().equals(this.getVerificationState()) == false)
            return false;
        if (other.getVerificationStateDescription() == null
                ^ this.getVerificationStateDescription() == null)
            return false;
        if (other.getVerificationStateDescription() != null
                && other.getVerificationStateDescription().equals(
                        this.getVerificationStateDescription()) == false)
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
