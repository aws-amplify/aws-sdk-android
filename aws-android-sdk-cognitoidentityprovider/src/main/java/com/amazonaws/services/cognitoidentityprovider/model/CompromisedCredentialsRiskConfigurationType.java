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
 * The compromised credentials risk configuration type.
 * </p>
 */
public class CompromisedCredentialsRiskConfigurationType implements Serializable {
    /**
     * <p>
     * Perform the action for these events. The default is to perform all events
     * if no event filter is specified.
     * </p>
     */
    private java.util.List<String> eventFilter;

    /**
     * <p>
     * The compromised credentials risk configuration actions.
     * </p>
     */
    private CompromisedCredentialsActionsType actions;

    /**
     * <p>
     * Perform the action for these events. The default is to perform all events
     * if no event filter is specified.
     * </p>
     *
     * @return <p>
     *         Perform the action for these events. The default is to perform
     *         all events if no event filter is specified.
     *         </p>
     */
    public java.util.List<String> getEventFilter() {
        return eventFilter;
    }

    /**
     * <p>
     * Perform the action for these events. The default is to perform all events
     * if no event filter is specified.
     * </p>
     *
     * @param eventFilter <p>
     *            Perform the action for these events. The default is to perform
     *            all events if no event filter is specified.
     *            </p>
     */
    public void setEventFilter(java.util.Collection<String> eventFilter) {
        if (eventFilter == null) {
            this.eventFilter = null;
            return;
        }

        this.eventFilter = new java.util.ArrayList<String>(eventFilter);
    }

    /**
     * <p>
     * Perform the action for these events. The default is to perform all events
     * if no event filter is specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventFilter <p>
     *            Perform the action for these events. The default is to perform
     *            all events if no event filter is specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompromisedCredentialsRiskConfigurationType withEventFilter(String... eventFilter) {
        if (getEventFilter() == null) {
            this.eventFilter = new java.util.ArrayList<String>(eventFilter.length);
        }
        for (String value : eventFilter) {
            this.eventFilter.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Perform the action for these events. The default is to perform all events
     * if no event filter is specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventFilter <p>
     *            Perform the action for these events. The default is to perform
     *            all events if no event filter is specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompromisedCredentialsRiskConfigurationType withEventFilter(
            java.util.Collection<String> eventFilter) {
        setEventFilter(eventFilter);
        return this;
    }

    /**
     * <p>
     * The compromised credentials risk configuration actions.
     * </p>
     *
     * @return <p>
     *         The compromised credentials risk configuration actions.
     *         </p>
     */
    public CompromisedCredentialsActionsType getActions() {
        return actions;
    }

    /**
     * <p>
     * The compromised credentials risk configuration actions.
     * </p>
     *
     * @param actions <p>
     *            The compromised credentials risk configuration actions.
     *            </p>
     */
    public void setActions(CompromisedCredentialsActionsType actions) {
        this.actions = actions;
    }

    /**
     * <p>
     * The compromised credentials risk configuration actions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actions <p>
     *            The compromised credentials risk configuration actions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompromisedCredentialsRiskConfigurationType withActions(
            CompromisedCredentialsActionsType actions) {
        this.actions = actions;
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
        if (getEventFilter() != null)
            sb.append("EventFilter: " + getEventFilter() + ",");
        if (getActions() != null)
            sb.append("Actions: " + getActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEventFilter() == null) ? 0 : getEventFilter().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompromisedCredentialsRiskConfigurationType == false)
            return false;
        CompromisedCredentialsRiskConfigurationType other = (CompromisedCredentialsRiskConfigurationType) obj;

        if (other.getEventFilter() == null ^ this.getEventFilter() == null)
            return false;
        if (other.getEventFilter() != null
                && other.getEventFilter().equals(this.getEventFilter()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        return true;
    }
}
