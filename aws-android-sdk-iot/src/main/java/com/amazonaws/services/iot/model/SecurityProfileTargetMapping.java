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
 * Information about a security profile and the target associated with it.
 * </p>
 */
public class SecurityProfileTargetMapping implements Serializable {
    /**
     * <p>
     * Information that identifies the security profile.
     * </p>
     */
    private SecurityProfileIdentifier securityProfileIdentifier;

    /**
     * <p>
     * Information about the target (thing group) associated with the security
     * profile.
     * </p>
     */
    private SecurityProfileTarget target;

    /**
     * <p>
     * Information that identifies the security profile.
     * </p>
     *
     * @return <p>
     *         Information that identifies the security profile.
     *         </p>
     */
    public SecurityProfileIdentifier getSecurityProfileIdentifier() {
        return securityProfileIdentifier;
    }

    /**
     * <p>
     * Information that identifies the security profile.
     * </p>
     *
     * @param securityProfileIdentifier <p>
     *            Information that identifies the security profile.
     *            </p>
     */
    public void setSecurityProfileIdentifier(SecurityProfileIdentifier securityProfileIdentifier) {
        this.securityProfileIdentifier = securityProfileIdentifier;
    }

    /**
     * <p>
     * Information that identifies the security profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityProfileIdentifier <p>
     *            Information that identifies the security profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecurityProfileTargetMapping withSecurityProfileIdentifier(
            SecurityProfileIdentifier securityProfileIdentifier) {
        this.securityProfileIdentifier = securityProfileIdentifier;
        return this;
    }

    /**
     * <p>
     * Information about the target (thing group) associated with the security
     * profile.
     * </p>
     *
     * @return <p>
     *         Information about the target (thing group) associated with the
     *         security profile.
     *         </p>
     */
    public SecurityProfileTarget getTarget() {
        return target;
    }

    /**
     * <p>
     * Information about the target (thing group) associated with the security
     * profile.
     * </p>
     *
     * @param target <p>
     *            Information about the target (thing group) associated with the
     *            security profile.
     *            </p>
     */
    public void setTarget(SecurityProfileTarget target) {
        this.target = target;
    }

    /**
     * <p>
     * Information about the target (thing group) associated with the security
     * profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param target <p>
     *            Information about the target (thing group) associated with the
     *            security profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecurityProfileTargetMapping withTarget(SecurityProfileTarget target) {
        this.target = target;
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
        if (getSecurityProfileIdentifier() != null)
            sb.append("securityProfileIdentifier: " + getSecurityProfileIdentifier() + ",");
        if (getTarget() != null)
            sb.append("target: " + getTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSecurityProfileIdentifier() == null) ? 0 : getSecurityProfileIdentifier()
                        .hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityProfileTargetMapping == false)
            return false;
        SecurityProfileTargetMapping other = (SecurityProfileTargetMapping) obj;

        if (other.getSecurityProfileIdentifier() == null
                ^ this.getSecurityProfileIdentifier() == null)
            return false;
        if (other.getSecurityProfileIdentifier() != null
                && other.getSecurityProfileIdentifier().equals(this.getSecurityProfileIdentifier()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        return true;
    }
}
