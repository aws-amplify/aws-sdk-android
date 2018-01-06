/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class SMSMfaSettingsType implements Serializable {
    /**
     * The new value for the enabled property for this object.
     */
    private Boolean enabled;

    /**
     * The new value for the preferredMfa property for this object.
     */
    private Boolean preferredMfa;

    /**
     * Returns the value of the enabled property for this object.
     *
     * @return The value of the enabled property for this object.
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Returns the value of the enabled property for this object.
     *
     * @return The value of the enabled property for this object.
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of enabled
     *
     * @param enabled The new value for the enabled property for this object.
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Sets the value of the enabled property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled The new value for the enabled property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMSMfaSettingsType withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Returns the value of the preferredMfa property for this object.
     *
     * @return The value of the preferredMfa property for this object.
     */
    public Boolean isPreferredMfa() {
        return preferredMfa;
    }

    /**
     * Returns the value of the preferredMfa property for this object.
     *
     * @return The value of the preferredMfa property for this object.
     */
    public Boolean getPreferredMfa() {
        return preferredMfa;
    }

    /**
     * Sets the value of preferredMfa
     *
     * @param preferredMfa The new value for the preferredMfa property for this
     *            object.
     */
    public void setPreferredMfa(Boolean preferredMfa) {
        this.preferredMfa = preferredMfa;
    }

    /**
     * Sets the value of the preferredMfa property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preferredMfa The new value for the preferredMfa property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMSMfaSettingsType withPreferredMfa(Boolean preferredMfa) {
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

        if (obj instanceof SMSMfaSettingsType == false)
            return false;
        SMSMfaSettingsType other = (SMSMfaSettingsType) obj;

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
