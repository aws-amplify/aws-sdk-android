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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates a Device Defender security profile.
 * </p>
 */
public class UpdateSecurityProfileRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the security profile you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String securityProfileName;

    /**
     * <p>
     * A description of the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     */
    private String securityProfileDescription;

    /**
     * <p>
     * Specifies the behaviors that, when violated by a device (thing), cause an
     * alert.
     * </p>
     */
    private java.util.List<Behavior> behaviors;

    /**
     * <p>
     * Where the alerts are sent. (Alerts are always sent to the console.)
     * </p>
     */
    private java.util.Map<String, AlertTarget> alertTargets;

    /**
     * <p>
     * The expected version of the security profile. A new version is generated
     * whenever the security profile is updated. If you specify a value that is
     * different than the actual version, a
     * <code>VersionConflictException</code> is thrown.
     * </p>
     */
    private Long expectedVersion;

    /**
     * <p>
     * The name of the security profile you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the security profile you want to update.
     *         </p>
     */
    public String getSecurityProfileName() {
        return securityProfileName;
    }

    /**
     * <p>
     * The name of the security profile you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param securityProfileName <p>
     *            The name of the security profile you want to update.
     *            </p>
     */
    public void setSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
    }

    /**
     * <p>
     * The name of the security profile you want to update.
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
     *            The name of the security profile you want to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSecurityProfileRequest withSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
        return this;
    }

    /**
     * <p>
     * A description of the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @return <p>
     *         A description of the security profile.
     *         </p>
     */
    public String getSecurityProfileDescription() {
        return securityProfileDescription;
    }

    /**
     * <p>
     * A description of the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @param securityProfileDescription <p>
     *            A description of the security profile.
     *            </p>
     */
    public void setSecurityProfileDescription(String securityProfileDescription) {
        this.securityProfileDescription = securityProfileDescription;
    }

    /**
     * <p>
     * A description of the security profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @param securityProfileDescription <p>
     *            A description of the security profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSecurityProfileRequest withSecurityProfileDescription(
            String securityProfileDescription) {
        this.securityProfileDescription = securityProfileDescription;
        return this;
    }

    /**
     * <p>
     * Specifies the behaviors that, when violated by a device (thing), cause an
     * alert.
     * </p>
     *
     * @return <p>
     *         Specifies the behaviors that, when violated by a device (thing),
     *         cause an alert.
     *         </p>
     */
    public java.util.List<Behavior> getBehaviors() {
        return behaviors;
    }

    /**
     * <p>
     * Specifies the behaviors that, when violated by a device (thing), cause an
     * alert.
     * </p>
     *
     * @param behaviors <p>
     *            Specifies the behaviors that, when violated by a device
     *            (thing), cause an alert.
     *            </p>
     */
    public void setBehaviors(java.util.Collection<Behavior> behaviors) {
        if (behaviors == null) {
            this.behaviors = null;
            return;
        }

        this.behaviors = new java.util.ArrayList<Behavior>(behaviors);
    }

    /**
     * <p>
     * Specifies the behaviors that, when violated by a device (thing), cause an
     * alert.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param behaviors <p>
     *            Specifies the behaviors that, when violated by a device
     *            (thing), cause an alert.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSecurityProfileRequest withBehaviors(Behavior... behaviors) {
        if (getBehaviors() == null) {
            this.behaviors = new java.util.ArrayList<Behavior>(behaviors.length);
        }
        for (Behavior value : behaviors) {
            this.behaviors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the behaviors that, when violated by a device (thing), cause an
     * alert.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param behaviors <p>
     *            Specifies the behaviors that, when violated by a device
     *            (thing), cause an alert.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSecurityProfileRequest withBehaviors(java.util.Collection<Behavior> behaviors) {
        setBehaviors(behaviors);
        return this;
    }

    /**
     * <p>
     * Where the alerts are sent. (Alerts are always sent to the console.)
     * </p>
     *
     * @return <p>
     *         Where the alerts are sent. (Alerts are always sent to the
     *         console.)
     *         </p>
     */
    public java.util.Map<String, AlertTarget> getAlertTargets() {
        return alertTargets;
    }

    /**
     * <p>
     * Where the alerts are sent. (Alerts are always sent to the console.)
     * </p>
     *
     * @param alertTargets <p>
     *            Where the alerts are sent. (Alerts are always sent to the
     *            console.)
     *            </p>
     */
    public void setAlertTargets(java.util.Map<String, AlertTarget> alertTargets) {
        this.alertTargets = alertTargets;
    }

    /**
     * <p>
     * Where the alerts are sent. (Alerts are always sent to the console.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param alertTargets <p>
     *            Where the alerts are sent. (Alerts are always sent to the
     *            console.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSecurityProfileRequest withAlertTargets(
            java.util.Map<String, AlertTarget> alertTargets) {
        this.alertTargets = alertTargets;
        return this;
    }

    /**
     * <p>
     * Where the alerts are sent. (Alerts are always sent to the console.)
     * </p>
     * <p>
     * The method adds a new key-value pair into alertTargets parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into alertTargets.
     * @param value The corresponding value of the entry to be added into
     *            alertTargets.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSecurityProfileRequest addalertTargetsEntry(String key, AlertTarget value) {
        if (null == this.alertTargets) {
            this.alertTargets = new java.util.HashMap<String, AlertTarget>();
        }
        if (this.alertTargets.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.alertTargets.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into alertTargets.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UpdateSecurityProfileRequest clearalertTargetsEntries() {
        this.alertTargets = null;
        return this;
    }

    /**
     * <p>
     * The expected version of the security profile. A new version is generated
     * whenever the security profile is updated. If you specify a value that is
     * different than the actual version, a
     * <code>VersionConflictException</code> is thrown.
     * </p>
     *
     * @return <p>
     *         The expected version of the security profile. A new version is
     *         generated whenever the security profile is updated. If you
     *         specify a value that is different than the actual version, a
     *         <code>VersionConflictException</code> is thrown.
     *         </p>
     */
    public Long getExpectedVersion() {
        return expectedVersion;
    }

    /**
     * <p>
     * The expected version of the security profile. A new version is generated
     * whenever the security profile is updated. If you specify a value that is
     * different than the actual version, a
     * <code>VersionConflictException</code> is thrown.
     * </p>
     *
     * @param expectedVersion <p>
     *            The expected version of the security profile. A new version is
     *            generated whenever the security profile is updated. If you
     *            specify a value that is different than the actual version, a
     *            <code>VersionConflictException</code> is thrown.
     *            </p>
     */
    public void setExpectedVersion(Long expectedVersion) {
        this.expectedVersion = expectedVersion;
    }

    /**
     * <p>
     * The expected version of the security profile. A new version is generated
     * whenever the security profile is updated. If you specify a value that is
     * different than the actual version, a
     * <code>VersionConflictException</code> is thrown.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expectedVersion <p>
     *            The expected version of the security profile. A new version is
     *            generated whenever the security profile is updated. If you
     *            specify a value that is different than the actual version, a
     *            <code>VersionConflictException</code> is thrown.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSecurityProfileRequest withExpectedVersion(Long expectedVersion) {
        this.expectedVersion = expectedVersion;
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
        if (getSecurityProfileName() != null)
            sb.append("securityProfileName: " + getSecurityProfileName() + ",");
        if (getSecurityProfileDescription() != null)
            sb.append("securityProfileDescription: " + getSecurityProfileDescription() + ",");
        if (getBehaviors() != null)
            sb.append("behaviors: " + getBehaviors() + ",");
        if (getAlertTargets() != null)
            sb.append("alertTargets: " + getAlertTargets() + ",");
        if (getExpectedVersion() != null)
            sb.append("expectedVersion: " + getExpectedVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSecurityProfileName() == null) ? 0 : getSecurityProfileName().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecurityProfileDescription() == null) ? 0 : getSecurityProfileDescription()
                        .hashCode());
        hashCode = prime * hashCode + ((getBehaviors() == null) ? 0 : getBehaviors().hashCode());
        hashCode = prime * hashCode
                + ((getAlertTargets() == null) ? 0 : getAlertTargets().hashCode());
        hashCode = prime * hashCode
                + ((getExpectedVersion() == null) ? 0 : getExpectedVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSecurityProfileRequest == false)
            return false;
        UpdateSecurityProfileRequest other = (UpdateSecurityProfileRequest) obj;

        if (other.getSecurityProfileName() == null ^ this.getSecurityProfileName() == null)
            return false;
        if (other.getSecurityProfileName() != null
                && other.getSecurityProfileName().equals(this.getSecurityProfileName()) == false)
            return false;
        if (other.getSecurityProfileDescription() == null
                ^ this.getSecurityProfileDescription() == null)
            return false;
        if (other.getSecurityProfileDescription() != null
                && other.getSecurityProfileDescription().equals(
                        this.getSecurityProfileDescription()) == false)
            return false;
        if (other.getBehaviors() == null ^ this.getBehaviors() == null)
            return false;
        if (other.getBehaviors() != null
                && other.getBehaviors().equals(this.getBehaviors()) == false)
            return false;
        if (other.getAlertTargets() == null ^ this.getAlertTargets() == null)
            return false;
        if (other.getAlertTargets() != null
                && other.getAlertTargets().equals(this.getAlertTargets()) == false)
            return false;
        if (other.getExpectedVersion() == null ^ this.getExpectedVersion() == null)
            return false;
        if (other.getExpectedVersion() != null
                && other.getExpectedVersion().equals(this.getExpectedVersion()) == false)
            return false;
        return true;
    }
}
