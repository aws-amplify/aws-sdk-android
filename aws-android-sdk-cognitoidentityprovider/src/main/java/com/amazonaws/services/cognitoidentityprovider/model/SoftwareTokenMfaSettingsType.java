/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * The type used for enabling software token MFA at the user level. If an MFA
 * type is activated for a user, the user will be prompted for MFA during all
 * sign-in attempts, unless device tracking is turned on and the device has been
 * trusted. If you want MFA to be applied selectively based on the assessed risk
 * level of sign-in attempts, deactivate MFA for users and turn on Adaptive
 * Authentication for the user pool.
 * </p>
 */
public class SoftwareTokenMfaSettingsType implements Serializable {
    /**
     * <p>
     * Specifies whether software token MFA is activated. If an MFA type is
     * activated for a user, the user will be prompted for MFA during all
     * sign-in attempts, unless device tracking is turned on and the device has
     * been trusted.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * Specifies whether software token MFA is the preferred MFA method.
     * </p>
     */
    private Boolean preferredMfa;

    /**
     * <p>
     * Specifies whether software token MFA is activated. If an MFA type is
     * activated for a user, the user will be prompted for MFA during all
     * sign-in attempts, unless device tracking is turned on and the device has
     * been trusted.
     * </p>
     *
     * @return <p>
     *         Specifies whether software token MFA is activated. If an MFA type
     *         is activated for a user, the user will be prompted for MFA during
     *         all sign-in attempts, unless device tracking is turned on and the
     *         device has been trusted.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether software token MFA is activated. If an MFA type is
     * activated for a user, the user will be prompted for MFA during all
     * sign-in attempts, unless device tracking is turned on and the device has
     * been trusted.
     * </p>
     *
     * @return <p>
     *         Specifies whether software token MFA is activated. If an MFA type
     *         is activated for a user, the user will be prompted for MFA during
     *         all sign-in attempts, unless device tracking is turned on and the
     *         device has been trusted.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Specifies whether software token MFA is activated. If an MFA type is
     * activated for a user, the user will be prompted for MFA during all
     * sign-in attempts, unless device tracking is turned on and the device has
     * been trusted.
     * </p>
     *
     * @param enabled <p>
     *            Specifies whether software token MFA is activated. If an MFA
     *            type is activated for a user, the user will be prompted for
     *            MFA during all sign-in attempts, unless device tracking is
     *            turned on and the device has been trusted.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether software token MFA is activated. If an MFA type is
     * activated for a user, the user will be prompted for MFA during all
     * sign-in attempts, unless device tracking is turned on and the device has
     * been trusted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Specifies whether software token MFA is activated. If an MFA
     *            type is activated for a user, the user will be prompted for
     *            MFA during all sign-in attempts, unless device tracking is
     *            turned on and the device has been trusted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SoftwareTokenMfaSettingsType withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * Specifies whether software token MFA is the preferred MFA method.
     * </p>
     *
     * @return <p>
     *         Specifies whether software token MFA is the preferred MFA method.
     *         </p>
     */
    public Boolean isPreferredMfa() {
        return preferredMfa;
    }

    /**
     * <p>
     * Specifies whether software token MFA is the preferred MFA method.
     * </p>
     *
     * @return <p>
     *         Specifies whether software token MFA is the preferred MFA method.
     *         </p>
     */
    public Boolean getPreferredMfa() {
        return preferredMfa;
    }

    /**
     * <p>
     * Specifies whether software token MFA is the preferred MFA method.
     * </p>
     *
     * @param preferredMfa <p>
     *            Specifies whether software token MFA is the preferred MFA
     *            method.
     *            </p>
     */
    public void setPreferredMfa(Boolean preferredMfa) {
        this.preferredMfa = preferredMfa;
    }

    /**
     * <p>
     * Specifies whether software token MFA is the preferred MFA method.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferredMfa <p>
     *            Specifies whether software token MFA is the preferred MFA
     *            method.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SoftwareTokenMfaSettingsType withPreferredMfa(Boolean preferredMfa) {
        this.preferredMfa = preferredMfa;
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
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getPreferredMfa() != null)
            sb.append("PreferredMfa: " + getPreferredMfa());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getPreferredMfa() == null) ? 0 : getPreferredMfa().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SoftwareTokenMfaSettingsType == false)
            return false;
        SoftwareTokenMfaSettingsType other = (SoftwareTokenMfaSettingsType) obj;

        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getPreferredMfa() == null ^ this.getPreferredMfa() == null)
            return false;
        if (other.getPreferredMfa() != null
                && other.getPreferredMfa().equals(this.getPreferredMfa()) == false)
            return false;
        return true;
    }
}
