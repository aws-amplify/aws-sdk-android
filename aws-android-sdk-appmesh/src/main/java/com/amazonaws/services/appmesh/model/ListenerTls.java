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

package com.amazonaws.services.appmesh.model;

import java.io.Serializable;

/**
 * <p>
 * An object that represents the Transport Layer Security (TLS) properties for a
 * listener.
 * </p>
 */
public class ListenerTls implements Serializable {
    /**
     * <p>
     * A reference to an object that represents a listener's TLS certificate.
     * </p>
     */
    private ListenerTlsCertificate certificate;

    /**
     * <p>
     * Specify one of the following modes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b/>STRICT – Listener only accepts connections with TLS enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b/>PERMISSIVE – Listener accepts connections with or without TLS
     * enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b/>DISABLED – Listener only accepts connections without TLS.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, PERMISSIVE, STRICT
     */
    private String mode;

    /**
     * <p>
     * A reference to an object that represents a listener's TLS certificate.
     * </p>
     *
     * @return <p>
     *         A reference to an object that represents a listener's TLS
     *         certificate.
     *         </p>
     */
    public ListenerTlsCertificate getCertificate() {
        return certificate;
    }

    /**
     * <p>
     * A reference to an object that represents a listener's TLS certificate.
     * </p>
     *
     * @param certificate <p>
     *            A reference to an object that represents a listener's TLS
     *            certificate.
     *            </p>
     */
    public void setCertificate(ListenerTlsCertificate certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * A reference to an object that represents a listener's TLS certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificate <p>
     *            A reference to an object that represents a listener's TLS
     *            certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListenerTls withCertificate(ListenerTlsCertificate certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * <p>
     * Specify one of the following modes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b/>STRICT – Listener only accepts connections with TLS enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b/>PERMISSIVE – Listener accepts connections with or without TLS
     * enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b/>DISABLED – Listener only accepts connections without TLS.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, PERMISSIVE, STRICT
     *
     * @return <p>
     *         Specify one of the following modes.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b/>STRICT – Listener only accepts connections with TLS enabled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b/>PERMISSIVE – Listener accepts connections with or without TLS
     *         enabled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b/>DISABLED – Listener only accepts connections without TLS.
     *         </p>
     *         </li>
     *         </ul>
     * @see ListenerTlsMode
     */
    public String getMode() {
        return mode;
    }

    /**
     * <p>
     * Specify one of the following modes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b/>STRICT – Listener only accepts connections with TLS enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b/>PERMISSIVE – Listener accepts connections with or without TLS
     * enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b/>DISABLED – Listener only accepts connections without TLS.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, PERMISSIVE, STRICT
     *
     * @param mode <p>
     *            Specify one of the following modes.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b/>STRICT – Listener only accepts connections with TLS
     *            enabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b/>PERMISSIVE – Listener accepts connections with or without
     *            TLS enabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b/>DISABLED – Listener only accepts connections without TLS.
     *            </p>
     *            </li>
     *            </ul>
     * @see ListenerTlsMode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * Specify one of the following modes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b/>STRICT – Listener only accepts connections with TLS enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b/>PERMISSIVE – Listener accepts connections with or without TLS
     * enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b/>DISABLED – Listener only accepts connections without TLS.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, PERMISSIVE, STRICT
     *
     * @param mode <p>
     *            Specify one of the following modes.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b/>STRICT – Listener only accepts connections with TLS
     *            enabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b/>PERMISSIVE – Listener accepts connections with or without
     *            TLS enabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b/>DISABLED – Listener only accepts connections without TLS.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ListenerTlsMode
     */
    public ListenerTls withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * <p>
     * Specify one of the following modes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b/>STRICT – Listener only accepts connections with TLS enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b/>PERMISSIVE – Listener accepts connections with or without TLS
     * enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b/>DISABLED – Listener only accepts connections without TLS.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, PERMISSIVE, STRICT
     *
     * @param mode <p>
     *            Specify one of the following modes.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b/>STRICT – Listener only accepts connections with TLS
     *            enabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b/>PERMISSIVE – Listener accepts connections with or without
     *            TLS enabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b/>DISABLED – Listener only accepts connections without TLS.
     *            </p>
     *            </li>
     *            </ul>
     * @see ListenerTlsMode
     */
    public void setMode(ListenerTlsMode mode) {
        this.mode = mode.toString();
    }

    /**
     * <p>
     * Specify one of the following modes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b/>STRICT – Listener only accepts connections with TLS enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b/>PERMISSIVE – Listener accepts connections with or without TLS
     * enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b/>DISABLED – Listener only accepts connections without TLS.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, PERMISSIVE, STRICT
     *
     * @param mode <p>
     *            Specify one of the following modes.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b/>STRICT – Listener only accepts connections with TLS
     *            enabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b/>PERMISSIVE – Listener accepts connections with or without
     *            TLS enabled.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b/>DISABLED – Listener only accepts connections without TLS.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ListenerTlsMode
     */
    public ListenerTls withMode(ListenerTlsMode mode) {
        this.mode = mode.toString();
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
        if (getCertificate() != null)
            sb.append("certificate: " + getCertificate() + ",");
        if (getMode() != null)
            sb.append("mode: " + getMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListenerTls == false)
            return false;
        ListenerTls other = (ListenerTls) obj;

        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null
                && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        return true;
    }
}
