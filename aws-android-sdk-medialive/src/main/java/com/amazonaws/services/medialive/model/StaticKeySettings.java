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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * Static Key Settings
 */
public class StaticKeySettings implements Serializable {
    /**
     * The URL of the license server used for protecting content.
     */
    private InputLocation keyProviderServer;

    /**
     * Static key value as a 32 character hexadecimal string.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 32<br/>
     */
    private String staticKeyValue;

    /**
     * The URL of the license server used for protecting content.
     *
     * @return The URL of the license server used for protecting content.
     */
    public InputLocation getKeyProviderServer() {
        return keyProviderServer;
    }

    /**
     * The URL of the license server used for protecting content.
     *
     * @param keyProviderServer The URL of the license server used for
     *            protecting content.
     */
    public void setKeyProviderServer(InputLocation keyProviderServer) {
        this.keyProviderServer = keyProviderServer;
    }

    /**
     * The URL of the license server used for protecting content.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyProviderServer The URL of the license server used for
     *            protecting content.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StaticKeySettings withKeyProviderServer(InputLocation keyProviderServer) {
        this.keyProviderServer = keyProviderServer;
        return this;
    }

    /**
     * Static key value as a 32 character hexadecimal string.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 32<br/>
     *
     * @return Static key value as a 32 character hexadecimal string.
     */
    public String getStaticKeyValue() {
        return staticKeyValue;
    }

    /**
     * Static key value as a 32 character hexadecimal string.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 32<br/>
     *
     * @param staticKeyValue Static key value as a 32 character hexadecimal
     *            string.
     */
    public void setStaticKeyValue(String staticKeyValue) {
        this.staticKeyValue = staticKeyValue;
    }

    /**
     * Static key value as a 32 character hexadecimal string.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 32<br/>
     *
     * @param staticKeyValue Static key value as a 32 character hexadecimal
     *            string.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StaticKeySettings withStaticKeyValue(String staticKeyValue) {
        this.staticKeyValue = staticKeyValue;
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
        if (getKeyProviderServer() != null)
            sb.append("KeyProviderServer: " + getKeyProviderServer() + ",");
        if (getStaticKeyValue() != null)
            sb.append("StaticKeyValue: " + getStaticKeyValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getKeyProviderServer() == null) ? 0 : getKeyProviderServer().hashCode());
        hashCode = prime * hashCode
                + ((getStaticKeyValue() == null) ? 0 : getStaticKeyValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StaticKeySettings == false)
            return false;
        StaticKeySettings other = (StaticKeySettings) obj;

        if (other.getKeyProviderServer() == null ^ this.getKeyProviderServer() == null)
            return false;
        if (other.getKeyProviderServer() != null
                && other.getKeyProviderServer().equals(this.getKeyProviderServer()) == false)
            return false;
        if (other.getStaticKeyValue() == null ^ this.getStaticKeyValue() == null)
            return false;
        if (other.getStaticKeyValue() != null
                && other.getStaticKeyValue().equals(this.getStaticKeyValue()) == false)
            return false;
        return true;
    }
}
