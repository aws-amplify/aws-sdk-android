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
 * Specifies the criteria that are used to select the handshakes for the
 * operation.
 * </p>
 */
public class HandshakeFilter implements Serializable {
    /**
     * <p>
     * Specifies the type of handshake action.
     * </p>
     * <p>
     * If you specify <code>ActionType</code>, you cannot also specify
     * <code>ParentHandshakeId</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVITE, ENABLE_ALL_FEATURES, APPROVE_ALL_FEATURES,
     * ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE
     */
    private String actionType;

    /**
     * <p>
     * Specifies the parent handshake. Only used for handshake types that are a
     * child of another type.
     * </p>
     * <p>
     * If you specify <code>ParentHandshakeId</code>, you cannot also specify
     * <code>ActionType</code>.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for
     * handshake ID string requires "h-" followed by from 8 to 32 lower-case
     * letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 34<br/>
     * <b>Pattern: </b>^h-[0-9a-z]{8,32}$<br/>
     */
    private String parentHandshakeId;

    /**
     * <p>
     * Specifies the type of handshake action.
     * </p>
     * <p>
     * If you specify <code>ActionType</code>, you cannot also specify
     * <code>ParentHandshakeId</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVITE, ENABLE_ALL_FEATURES, APPROVE_ALL_FEATURES,
     * ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE
     *
     * @return <p>
     *         Specifies the type of handshake action.
     *         </p>
     *         <p>
     *         If you specify <code>ActionType</code>, you cannot also specify
     *         <code>ParentHandshakeId</code>.
     *         </p>
     * @see ActionType
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * <p>
     * Specifies the type of handshake action.
     * </p>
     * <p>
     * If you specify <code>ActionType</code>, you cannot also specify
     * <code>ParentHandshakeId</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVITE, ENABLE_ALL_FEATURES, APPROVE_ALL_FEATURES,
     * ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE
     *
     * @param actionType <p>
     *            Specifies the type of handshake action.
     *            </p>
     *            <p>
     *            If you specify <code>ActionType</code>, you cannot also
     *            specify <code>ParentHandshakeId</code>.
     *            </p>
     * @see ActionType
     */
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * Specifies the type of handshake action.
     * </p>
     * <p>
     * If you specify <code>ActionType</code>, you cannot also specify
     * <code>ParentHandshakeId</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVITE, ENABLE_ALL_FEATURES, APPROVE_ALL_FEATURES,
     * ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE
     *
     * @param actionType <p>
     *            Specifies the type of handshake action.
     *            </p>
     *            <p>
     *            If you specify <code>ActionType</code>, you cannot also
     *            specify <code>ParentHandshakeId</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActionType
     */
    public HandshakeFilter withActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * <p>
     * Specifies the type of handshake action.
     * </p>
     * <p>
     * If you specify <code>ActionType</code>, you cannot also specify
     * <code>ParentHandshakeId</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVITE, ENABLE_ALL_FEATURES, APPROVE_ALL_FEATURES,
     * ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE
     *
     * @param actionType <p>
     *            Specifies the type of handshake action.
     *            </p>
     *            <p>
     *            If you specify <code>ActionType</code>, you cannot also
     *            specify <code>ParentHandshakeId</code>.
     *            </p>
     * @see ActionType
     */
    public void setActionType(ActionType actionType) {
        this.actionType = actionType.toString();
    }

    /**
     * <p>
     * Specifies the type of handshake action.
     * </p>
     * <p>
     * If you specify <code>ActionType</code>, you cannot also specify
     * <code>ParentHandshakeId</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVITE, ENABLE_ALL_FEATURES, APPROVE_ALL_FEATURES,
     * ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE
     *
     * @param actionType <p>
     *            Specifies the type of handshake action.
     *            </p>
     *            <p>
     *            If you specify <code>ActionType</code>, you cannot also
     *            specify <code>ParentHandshakeId</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActionType
     */
    public HandshakeFilter withActionType(ActionType actionType) {
        this.actionType = actionType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the parent handshake. Only used for handshake types that are a
     * child of another type.
     * </p>
     * <p>
     * If you specify <code>ParentHandshakeId</code>, you cannot also specify
     * <code>ActionType</code>.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for
     * handshake ID string requires "h-" followed by from 8 to 32 lower-case
     * letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 34<br/>
     * <b>Pattern: </b>^h-[0-9a-z]{8,32}$<br/>
     *
     * @return <p>
     *         Specifies the parent handshake. Only used for handshake types
     *         that are a child of another type.
     *         </p>
     *         <p>
     *         If you specify <code>ParentHandshakeId</code>, you cannot also
     *         specify <code>ActionType</code>.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         for handshake ID string requires "h-" followed by from 8 to 32
     *         lower-case letters or digits.
     *         </p>
     */
    public String getParentHandshakeId() {
        return parentHandshakeId;
    }

    /**
     * <p>
     * Specifies the parent handshake. Only used for handshake types that are a
     * child of another type.
     * </p>
     * <p>
     * If you specify <code>ParentHandshakeId</code>, you cannot also specify
     * <code>ActionType</code>.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for
     * handshake ID string requires "h-" followed by from 8 to 32 lower-case
     * letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 34<br/>
     * <b>Pattern: </b>^h-[0-9a-z]{8,32}$<br/>
     *
     * @param parentHandshakeId <p>
     *            Specifies the parent handshake. Only used for handshake types
     *            that are a child of another type.
     *            </p>
     *            <p>
     *            If you specify <code>ParentHandshakeId</code>, you cannot also
     *            specify <code>ActionType</code>.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for handshake ID string requires "h-" followed by
     *            from 8 to 32 lower-case letters or digits.
     *            </p>
     */
    public void setParentHandshakeId(String parentHandshakeId) {
        this.parentHandshakeId = parentHandshakeId;
    }

    /**
     * <p>
     * Specifies the parent handshake. Only used for handshake types that are a
     * child of another type.
     * </p>
     * <p>
     * If you specify <code>ParentHandshakeId</code>, you cannot also specify
     * <code>ActionType</code>.
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
     * <b>Length: </b> - 34<br/>
     * <b>Pattern: </b>^h-[0-9a-z]{8,32}$<br/>
     *
     * @param parentHandshakeId <p>
     *            Specifies the parent handshake. Only used for handshake types
     *            that are a child of another type.
     *            </p>
     *            <p>
     *            If you specify <code>ParentHandshakeId</code>, you cannot also
     *            specify <code>ActionType</code>.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for handshake ID string requires "h-" followed by
     *            from 8 to 32 lower-case letters or digits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HandshakeFilter withParentHandshakeId(String parentHandshakeId) {
        this.parentHandshakeId = parentHandshakeId;
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
        if (getActionType() != null)
            sb.append("ActionType: " + getActionType() + ",");
        if (getParentHandshakeId() != null)
            sb.append("ParentHandshakeId: " + getParentHandshakeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        hashCode = prime * hashCode
                + ((getParentHandshakeId() == null) ? 0 : getParentHandshakeId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HandshakeFilter == false)
            return false;
        HandshakeFilter other = (HandshakeFilter) obj;

        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null
                && other.getActionType().equals(this.getActionType()) == false)
            return false;
        if (other.getParentHandshakeId() == null ^ this.getParentHandshakeId() == null)
            return false;
        if (other.getParentHandshakeId() != null
                && other.getParentHandshakeId().equals(this.getParentHandshakeId()) == false)
            return false;
        return true;
    }
}
