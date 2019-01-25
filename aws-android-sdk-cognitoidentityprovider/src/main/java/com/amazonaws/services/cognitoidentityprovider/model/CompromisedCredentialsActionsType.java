/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The compromised credentials actions type
 * </p>
 */
public class CompromisedCredentialsActionsType implements Serializable {
    /**
     * <p>
     * The event action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLOCK, NO_ACTION
     */
    private String eventAction;

    /**
     * <p>
     * The event action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLOCK, NO_ACTION
     *
     * @return <p>
     *         The event action.
     *         </p>
     * @see CompromisedCredentialsEventActionType
     */
    public String getEventAction() {
        return eventAction;
    }

    /**
     * <p>
     * The event action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLOCK, NO_ACTION
     *
     * @param eventAction <p>
     *            The event action.
     *            </p>
     * @see CompromisedCredentialsEventActionType
     */
    public void setEventAction(String eventAction) {
        this.eventAction = eventAction;
    }

    /**
     * <p>
     * The event action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLOCK, NO_ACTION
     *
     * @param eventAction <p>
     *            The event action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CompromisedCredentialsEventActionType
     */
    public CompromisedCredentialsActionsType withEventAction(String eventAction) {
        this.eventAction = eventAction;
        return this;
    }

    /**
     * <p>
     * The event action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLOCK, NO_ACTION
     *
     * @param eventAction <p>
     *            The event action.
     *            </p>
     * @see CompromisedCredentialsEventActionType
     */
    public void setEventAction(CompromisedCredentialsEventActionType eventAction) {
        this.eventAction = eventAction.toString();
    }

    /**
     * <p>
     * The event action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BLOCK, NO_ACTION
     *
     * @param eventAction <p>
     *            The event action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CompromisedCredentialsEventActionType
     */
    public CompromisedCredentialsActionsType withEventAction(
            CompromisedCredentialsEventActionType eventAction) {
        this.eventAction = eventAction.toString();
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
        if (getEventAction() != null)
            sb.append("EventAction: " + getEventAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEventAction() == null) ? 0 : getEventAction().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompromisedCredentialsActionsType == false)
            return false;
        CompromisedCredentialsActionsType other = (CompromisedCredentialsActionsType) obj;

        if (other.getEventAction() == null ^ this.getEventAction() == null)
            return false;
        if (other.getEventAction() != null
                && other.getEventAction().equals(this.getEventAction()) == false)
            return false;
        return true;
    }
}
