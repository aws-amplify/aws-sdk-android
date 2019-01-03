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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class ListViolationEventsResult implements Serializable {
    /**
     * <p>
     * The security profile violation alerts issued for this account during the
     * given time frame, potentially filtered by security profile, behavior
     * violated, or thing (device) violating.
     * </p>
     */
    private java.util.List<ViolationEvent> violationEvents;

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The security profile violation alerts issued for this account during the
     * given time frame, potentially filtered by security profile, behavior
     * violated, or thing (device) violating.
     * </p>
     *
     * @return <p>
     *         The security profile violation alerts issued for this account
     *         during the given time frame, potentially filtered by security
     *         profile, behavior violated, or thing (device) violating.
     *         </p>
     */
    public java.util.List<ViolationEvent> getViolationEvents() {
        return violationEvents;
    }

    /**
     * <p>
     * The security profile violation alerts issued for this account during the
     * given time frame, potentially filtered by security profile, behavior
     * violated, or thing (device) violating.
     * </p>
     *
     * @param violationEvents <p>
     *            The security profile violation alerts issued for this account
     *            during the given time frame, potentially filtered by security
     *            profile, behavior violated, or thing (device) violating.
     *            </p>
     */
    public void setViolationEvents(java.util.Collection<ViolationEvent> violationEvents) {
        if (violationEvents == null) {
            this.violationEvents = null;
            return;
        }

        this.violationEvents = new java.util.ArrayList<ViolationEvent>(violationEvents);
    }

    /**
     * <p>
     * The security profile violation alerts issued for this account during the
     * given time frame, potentially filtered by security profile, behavior
     * violated, or thing (device) violating.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param violationEvents <p>
     *            The security profile violation alerts issued for this account
     *            during the given time frame, potentially filtered by security
     *            profile, behavior violated, or thing (device) violating.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListViolationEventsResult withViolationEvents(ViolationEvent... violationEvents) {
        if (getViolationEvents() == null) {
            this.violationEvents = new java.util.ArrayList<ViolationEvent>(violationEvents.length);
        }
        for (ViolationEvent value : violationEvents) {
            this.violationEvents.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The security profile violation alerts issued for this account during the
     * given time frame, potentially filtered by security profile, behavior
     * violated, or thing (device) violating.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param violationEvents <p>
     *            The security profile violation alerts issued for this account
     *            during the given time frame, potentially filtered by security
     *            profile, behavior violated, or thing (device) violating.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListViolationEventsResult withViolationEvents(
            java.util.Collection<ViolationEvent> violationEvents) {
        setViolationEvents(violationEvents);
        return this;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     *
     * @return <p>
     *         A token that can be used to retrieve the next set of results, or
     *         <code>null</code> if there are no additional results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     *
     * @param nextToken <p>
     *            A token that can be used to retrieve the next set of results,
     *            or <code>null</code> if there are no additional results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token that can be used to retrieve the next set of results,
     *            or <code>null</code> if there are no additional results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListViolationEventsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getViolationEvents() != null)
            sb.append("violationEvents: " + getViolationEvents() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getViolationEvents() == null) ? 0 : getViolationEvents().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListViolationEventsResult == false)
            return false;
        ListViolationEventsResult other = (ListViolationEventsResult) obj;

        if (other.getViolationEvents() == null ^ this.getViolationEvents() == null)
            return false;
        if (other.getViolationEvents() != null
                && other.getViolationEvents().equals(this.getViolationEvents()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
