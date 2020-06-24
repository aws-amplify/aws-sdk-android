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

/**
 * <p>
 * Identifies a participant in a handshake.
 * </p>
 */
public class HandshakeParty implements Serializable {
    /**
     * <p>
     * The unique identifier (ID) for the party.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for
     * handshake ID string requires "h-" followed by from 8 to 32 lower-case
     * letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String id;

    /**
     * <p>
     * The type of party.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATION, EMAIL
     */
    private String type;

    /**
     * <p>
     * The unique identifier (ID) for the party.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for
     * handshake ID string requires "h-" followed by from 8 to 32 lower-case
     * letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         The unique identifier (ID) for the party.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         for handshake ID string requires "h-" followed by from 8 to 32
     *         lower-case letters or digits.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier (ID) for the party.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for
     * handshake ID string requires "h-" followed by from 8 to 32 lower-case
     * letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param id <p>
     *            The unique identifier (ID) for the party.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for handshake ID string requires "h-" followed by
     *            from 8 to 32 lower-case letters or digits.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier (ID) for the party.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for
     * handshake ID string requires "h-" followed by from 8 to 32 lower-case
     * letters or digits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param id <p>
     *            The unique identifier (ID) for the party.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for handshake ID string requires "h-" followed by
     *            from 8 to 32 lower-case letters or digits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HandshakeParty withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The type of party.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATION, EMAIL
     *
     * @return <p>
     *         The type of party.
     *         </p>
     * @see HandshakePartyType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of party.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATION, EMAIL
     *
     * @param type <p>
     *            The type of party.
     *            </p>
     * @see HandshakePartyType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of party.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATION, EMAIL
     *
     * @param type <p>
     *            The type of party.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HandshakePartyType
     */
    public HandshakeParty withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of party.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATION, EMAIL
     *
     * @param type <p>
     *            The type of party.
     *            </p>
     * @see HandshakePartyType
     */
    public void setType(HandshakePartyType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of party.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, ORGANIZATION, EMAIL
     *
     * @param type <p>
     *            The type of party.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HandshakePartyType
     */
    public HandshakeParty withType(HandshakePartyType type) {
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HandshakeParty == false)
            return false;
        HandshakeParty other = (HandshakeParty) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
