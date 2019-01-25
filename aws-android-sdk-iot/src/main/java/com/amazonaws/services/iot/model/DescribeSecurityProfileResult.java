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

public class DescribeSecurityProfileResult implements Serializable {
    /**
     * <p>
     * The name of the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String securityProfileName;

    /**
     * <p>
     * The ARN of the security profile.
     * </p>
     */
    private String securityProfileArn;

    /**
     * <p>
     * A description of the security profile (associated with the security
     * profile when it was created or updated).
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
     * The version of the security profile. A new version is generated whenever
     * the security profile is updated.
     * </p>
     */
    private Long version;

    /**
     * <p>
     * The time the security profile was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The time the security profile was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * The name of the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the security profile.
     *         </p>
     */
    public String getSecurityProfileName() {
        return securityProfileName;
    }

    /**
     * <p>
     * The name of the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param securityProfileName <p>
     *            The name of the security profile.
     *            </p>
     */
    public void setSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
    }

    /**
     * <p>
     * The name of the security profile.
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
     *            The name of the security profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSecurityProfileResult withSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
        return this;
    }

    /**
     * <p>
     * The ARN of the security profile.
     * </p>
     *
     * @return <p>
     *         The ARN of the security profile.
     *         </p>
     */
    public String getSecurityProfileArn() {
        return securityProfileArn;
    }

    /**
     * <p>
     * The ARN of the security profile.
     * </p>
     *
     * @param securityProfileArn <p>
     *            The ARN of the security profile.
     *            </p>
     */
    public void setSecurityProfileArn(String securityProfileArn) {
        this.securityProfileArn = securityProfileArn;
    }

    /**
     * <p>
     * The ARN of the security profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityProfileArn <p>
     *            The ARN of the security profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSecurityProfileResult withSecurityProfileArn(String securityProfileArn) {
        this.securityProfileArn = securityProfileArn;
        return this;
    }

    /**
     * <p>
     * A description of the security profile (associated with the security
     * profile when it was created or updated).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @return <p>
     *         A description of the security profile (associated with the
     *         security profile when it was created or updated).
     *         </p>
     */
    public String getSecurityProfileDescription() {
        return securityProfileDescription;
    }

    /**
     * <p>
     * A description of the security profile (associated with the security
     * profile when it was created or updated).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @param securityProfileDescription <p>
     *            A description of the security profile (associated with the
     *            security profile when it was created or updated).
     *            </p>
     */
    public void setSecurityProfileDescription(String securityProfileDescription) {
        this.securityProfileDescription = securityProfileDescription;
    }

    /**
     * <p>
     * A description of the security profile (associated with the security
     * profile when it was created or updated).
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
     *            A description of the security profile (associated with the
     *            security profile when it was created or updated).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSecurityProfileResult withSecurityProfileDescription(
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
    public DescribeSecurityProfileResult withBehaviors(Behavior... behaviors) {
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
    public DescribeSecurityProfileResult withBehaviors(java.util.Collection<Behavior> behaviors) {
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
    public DescribeSecurityProfileResult withAlertTargets(
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
    public DescribeSecurityProfileResult addalertTargetsEntry(String key, AlertTarget value) {
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
    public DescribeSecurityProfileResult clearalertTargetsEntries() {
        this.alertTargets = null;
        return this;
    }

    /**
     * <p>
     * The version of the security profile. A new version is generated whenever
     * the security profile is updated.
     * </p>
     *
     * @return <p>
     *         The version of the security profile. A new version is generated
     *         whenever the security profile is updated.
     *         </p>
     */
    public Long getVersion() {
        return version;
    }

    /**
     * <p>
     * The version of the security profile. A new version is generated whenever
     * the security profile is updated.
     * </p>
     *
     * @param version <p>
     *            The version of the security profile. A new version is
     *            generated whenever the security profile is updated.
     *            </p>
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the security profile. A new version is generated whenever
     * the security profile is updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The version of the security profile. A new version is
     *            generated whenever the security profile is updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSecurityProfileResult withVersion(Long version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The time the security profile was created.
     * </p>
     *
     * @return <p>
     *         The time the security profile was created.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The time the security profile was created.
     * </p>
     *
     * @param creationDate <p>
     *            The time the security profile was created.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The time the security profile was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The time the security profile was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSecurityProfileResult withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The time the security profile was last modified.
     * </p>
     *
     * @return <p>
     *         The time the security profile was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * The time the security profile was last modified.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            The time the security profile was last modified.
     *            </p>
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The time the security profile was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            The time the security profile was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSecurityProfileResult withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
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
        if (getSecurityProfileArn() != null)
            sb.append("securityProfileArn: " + getSecurityProfileArn() + ",");
        if (getSecurityProfileDescription() != null)
            sb.append("securityProfileDescription: " + getSecurityProfileDescription() + ",");
        if (getBehaviors() != null)
            sb.append("behaviors: " + getBehaviors() + ",");
        if (getAlertTargets() != null)
            sb.append("alertTargets: " + getAlertTargets() + ",");
        if (getVersion() != null)
            sb.append("version: " + getVersion() + ",");
        if (getCreationDate() != null)
            sb.append("creationDate: " + getCreationDate() + ",");
        if (getLastModifiedDate() != null)
            sb.append("lastModifiedDate: " + getLastModifiedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSecurityProfileName() == null) ? 0 : getSecurityProfileName().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityProfileArn() == null) ? 0 : getSecurityProfileArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecurityProfileDescription() == null) ? 0 : getSecurityProfileDescription()
                        .hashCode());
        hashCode = prime * hashCode + ((getBehaviors() == null) ? 0 : getBehaviors().hashCode());
        hashCode = prime * hashCode
                + ((getAlertTargets() == null) ? 0 : getAlertTargets().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSecurityProfileResult == false)
            return false;
        DescribeSecurityProfileResult other = (DescribeSecurityProfileResult) obj;

        if (other.getSecurityProfileName() == null ^ this.getSecurityProfileName() == null)
            return false;
        if (other.getSecurityProfileName() != null
                && other.getSecurityProfileName().equals(this.getSecurityProfileName()) == false)
            return false;
        if (other.getSecurityProfileArn() == null ^ this.getSecurityProfileArn() == null)
            return false;
        if (other.getSecurityProfileArn() != null
                && other.getSecurityProfileArn().equals(this.getSecurityProfileArn()) == false)
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
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        return true;
    }
}
