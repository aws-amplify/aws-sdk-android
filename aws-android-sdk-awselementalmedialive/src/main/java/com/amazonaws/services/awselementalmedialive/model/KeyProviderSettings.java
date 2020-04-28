/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

/**
 * Key Provider Settings
 */
public class KeyProviderSettings implements Serializable {
    /**
     * Static Key Settings
     */
    private StaticKeySettings staticKeySettings;

    /**
     * Static Key Settings
     *
     * @return Static Key Settings
     */
    public StaticKeySettings getStaticKeySettings() {
        return staticKeySettings;
    }

    /**
     * Static Key Settings
     *
     * @param staticKeySettings Static Key Settings
     */
    public void setStaticKeySettings(StaticKeySettings staticKeySettings) {
        this.staticKeySettings = staticKeySettings;
    }

    /**
     * Static Key Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param staticKeySettings Static Key Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KeyProviderSettings withStaticKeySettings(StaticKeySettings staticKeySettings) {
        this.staticKeySettings = staticKeySettings;
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
        if (getStaticKeySettings() != null)
            sb.append("StaticKeySettings: " + getStaticKeySettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStaticKeySettings() == null) ? 0 : getStaticKeySettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeyProviderSettings == false)
            return false;
        KeyProviderSettings other = (KeyProviderSettings) obj;

        if (other.getStaticKeySettings() == null ^ this.getStaticKeySettings() == null)
            return false;
        if (other.getStaticKeySettings() != null
                && other.getStaticKeySettings().equals(this.getStaticKeySettings()) == false)
            return false;
        return true;
    }
}
