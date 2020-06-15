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
 * The SIP address for the contact containing the URI and SIP address type.
 * </p>
 */
public class SipAddress implements Serializable {
    /**
     * <p>
     * The URI for the SIP address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^sip[s]?:([^@:]+)\@([^@]+)$<br/>
     */
    private String uri;

    /**
     * <p>
     * The type of the SIP address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WORK
     */
    private String type;

    /**
     * <p>
     * The URI for the SIP address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^sip[s]?:([^@:]+)\@([^@]+)$<br/>
     *
     * @return <p>
     *         The URI for the SIP address.
     *         </p>
     */
    public String getUri() {
        return uri;
    }

    /**
     * <p>
     * The URI for the SIP address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^sip[s]?:([^@:]+)\@([^@]+)$<br/>
     *
     * @param uri <p>
     *            The URI for the SIP address.
     *            </p>
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * <p>
     * The URI for the SIP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^sip[s]?:([^@:]+)\@([^@]+)$<br/>
     *
     * @param uri <p>
     *            The URI for the SIP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SipAddress withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * <p>
     * The type of the SIP address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WORK
     *
     * @return <p>
     *         The type of the SIP address.
     *         </p>
     * @see SipType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the SIP address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WORK
     *
     * @param type <p>
     *            The type of the SIP address.
     *            </p>
     * @see SipType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the SIP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WORK
     *
     * @param type <p>
     *            The type of the SIP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SipType
     */
    public SipAddress withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the SIP address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WORK
     *
     * @param type <p>
     *            The type of the SIP address.
     *            </p>
     * @see SipType
     */
    public void setType(SipType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the SIP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WORK
     *
     * @param type <p>
     *            The type of the SIP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SipType
     */
    public SipAddress withType(SipType type) {
        this.type = type.toString();
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
        if (getUri() != null)
            sb.append("Uri: " + getUri() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SipAddress == false)
            return false;
        SipAddress other = (SipAddress) obj;

        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
