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

package com.amazonaws.services.organizations.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves information about a previously requested handshake. The handshake
 * ID comes from the response to the original <a>InviteAccountToOrganization</a>
 * operation that generated the handshake.
 * </p>
 * <p>
 * You can access handshakes that are <code>ACCEPTED</code>,
 * <code>DECLINED</code>, or <code>CANCELED</code> for only 30 days after they
 * change to that state. They're then deleted and no longer accessible.
 * </p>
 * <p>
 * This operation can be called from any account in the organization.
 * </p>
 */
public class DescribeHandshakeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier (ID) of the handshake that you want information
     * about. You can get the ID from the original call to
     * <a>InviteAccountToOrganization</a>, or from a call to
     * <a>ListHandshakesForAccount</a> or <a>ListHandshakesForOrganization</a>.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for
     * handshake ID string requires "h-" followed by from 8 to 32 lowercase
     * letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 34<br/>
     * <b>Pattern: </b>^h-[0-9a-z]{8,32}$<br/>
     */
    private String handshakeId;

    /**
     * <p>
     * The unique identifier (ID) of the handshake that you want information
     * about. You can get the ID from the original call to
     * <a>InviteAccountToOrganization</a>, or from a call to
     * <a>ListHandshakesForAccount</a> or <a>ListHandshakesForOrganization</a>.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for
     * handshake ID string requires "h-" followed by from 8 to 32 lowercase
     * letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 34<br/>
     * <b>Pattern: </b>^h-[0-9a-z]{8,32}$<br/>
     *
     * @return <p>
     *         The unique identifier (ID) of the handshake that you want
     *         information about. You can get the ID from the original call to
     *         <a>InviteAccountToOrganization</a>, or from a call to
     *         <a>ListHandshakesForAccount</a> or
     *         <a>ListHandshakesForOrganization</a>.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         for handshake ID string requires "h-" followed by from 8 to 32
     *         lowercase letters or digits.
     *         </p>
     */
    public String getHandshakeId() {
        return handshakeId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the handshake that you want information
     * about. You can get the ID from the original call to
     * <a>InviteAccountToOrganization</a>, or from a call to
     * <a>ListHandshakesForAccount</a> or <a>ListHandshakesForOrganization</a>.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for
     * handshake ID string requires "h-" followed by from 8 to 32 lowercase
     * letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 34<br/>
     * <b>Pattern: </b>^h-[0-9a-z]{8,32}$<br/>
     *
     * @param handshakeId <p>
     *            The unique identifier (ID) of the handshake that you want
     *            information about. You can get the ID from the original call
     *            to <a>InviteAccountToOrganization</a>, or from a call to
     *            <a>ListHandshakesForAccount</a> or
     *            <a>ListHandshakesForOrganization</a>.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for handshake ID string requires "h-" followed by
     *            from 8 to 32 lowercase letters or digits.
     *            </p>
     */
    public void setHandshakeId(String handshakeId) {
        this.handshakeId = handshakeId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the handshake that you want information
     * about. You can get the ID from the original call to
     * <a>InviteAccountToOrganization</a>, or from a call to
     * <a>ListHandshakesForAccount</a> or <a>ListHandshakesForOrganization</a>.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for
     * handshake ID string requires "h-" followed by from 8 to 32 lowercase
     * letters or digits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 34<br/>
     * <b>Pattern: </b>^h-[0-9a-z]{8,32}$<br/>
     *
     * @param handshakeId <p>
     *            The unique identifier (ID) of the handshake that you want
     *            information about. You can get the ID from the original call
     *            to <a>InviteAccountToOrganization</a>, or from a call to
     *            <a>ListHandshakesForAccount</a> or
     *            <a>ListHandshakesForOrganization</a>.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for handshake ID string requires "h-" followed by
     *            from 8 to 32 lowercase letters or digits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHandshakeRequest withHandshakeId(String handshakeId) {
        this.handshakeId = handshakeId;
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
        if (getHandshakeId() != null)
            sb.append("HandshakeId: " + getHandshakeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHandshakeId() == null) ? 0 : getHandshakeId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeHandshakeRequest == false)
            return false;
        DescribeHandshakeRequest other = (DescribeHandshakeRequest) obj;

        if (other.getHandshakeId() == null ^ this.getHandshakeId() == null)
            return false;
        if (other.getHandshakeId() != null
                && other.getHandshakeId().equals(this.getHandshakeId()) == false)
            return false;
        return true;
    }
}
