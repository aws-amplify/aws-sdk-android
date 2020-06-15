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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

/**
 * <p>
 * The IP endpoint and protocol for calling.
 * </p>
 */
public class IPDialIn implements Serializable {
    /**
     * <p>
     * The IP address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String endpoint;

    /**
     * <p>
     * The protocol, including SIP, SIPS, and H323.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIP, SIPS, H323
     */
    private String commsProtocol;

    /**
     * <p>
     * The IP address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The IP address.
     *         </p>
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * <p>
     * The IP address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param endpoint <p>
     *            The IP address.
     *            </p>
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The IP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param endpoint <p>
     *            The IP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IPDialIn withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * <p>
     * The protocol, including SIP, SIPS, and H323.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIP, SIPS, H323
     *
     * @return <p>
     *         The protocol, including SIP, SIPS, and H323.
     *         </p>
     * @see CommsProtocol
     */
    public String getCommsProtocol() {
        return commsProtocol;
    }

    /**
     * <p>
     * The protocol, including SIP, SIPS, and H323.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIP, SIPS, H323
     *
     * @param commsProtocol <p>
     *            The protocol, including SIP, SIPS, and H323.
     *            </p>
     * @see CommsProtocol
     */
    public void setCommsProtocol(String commsProtocol) {
        this.commsProtocol = commsProtocol;
    }

    /**
     * <p>
     * The protocol, including SIP, SIPS, and H323.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIP, SIPS, H323
     *
     * @param commsProtocol <p>
     *            The protocol, including SIP, SIPS, and H323.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CommsProtocol
     */
    public IPDialIn withCommsProtocol(String commsProtocol) {
        this.commsProtocol = commsProtocol;
        return this;
    }

    /**
     * <p>
     * The protocol, including SIP, SIPS, and H323.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIP, SIPS, H323
     *
     * @param commsProtocol <p>
     *            The protocol, including SIP, SIPS, and H323.
     *            </p>
     * @see CommsProtocol
     */
    public void setCommsProtocol(CommsProtocol commsProtocol) {
        this.commsProtocol = commsProtocol.toString();
    }

    /**
     * <p>
     * The protocol, including SIP, SIPS, and H323.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIP, SIPS, H323
     *
     * @param commsProtocol <p>
     *            The protocol, including SIP, SIPS, and H323.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CommsProtocol
     */
    public IPDialIn withCommsProtocol(CommsProtocol commsProtocol) {
        this.commsProtocol = commsProtocol.toString();
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
        if (getEndpoint() != null)
            sb.append("Endpoint: " + getEndpoint() + ",");
        if (getCommsProtocol() != null)
            sb.append("CommsProtocol: " + getCommsProtocol());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode
                + ((getCommsProtocol() == null) ? 0 : getCommsProtocol().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IPDialIn == false)
            return false;
        IPDialIn other = (IPDialIn) obj;

        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getCommsProtocol() == null ^ this.getCommsProtocol() == null)
            return false;
        if (other.getCommsProtocol() != null
                && other.getCommsProtocol().equals(this.getCommsProtocol()) == false)
            return false;
        return true;
    }
}
