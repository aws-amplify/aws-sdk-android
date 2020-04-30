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

package com.amazonaws.services.schemas.model;

import java.io.Serializable;

public class StopDiscovererResult implements Serializable {
    /**
     * <p>
     * The ID of the discoverer.
     * </p>
     */
    private String discovererId;

    /**
     * <p>
     * The state of the discoverer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTED, STOPPED
     */
    private String state;

    /**
     * <p>
     * The ID of the discoverer.
     * </p>
     *
     * @return <p>
     *         The ID of the discoverer.
     *         </p>
     */
    public String getDiscovererId() {
        return discovererId;
    }

    /**
     * <p>
     * The ID of the discoverer.
     * </p>
     *
     * @param discovererId <p>
     *            The ID of the discoverer.
     *            </p>
     */
    public void setDiscovererId(String discovererId) {
        this.discovererId = discovererId;
    }

    /**
     * <p>
     * The ID of the discoverer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param discovererId <p>
     *            The ID of the discoverer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopDiscovererResult withDiscovererId(String discovererId) {
        this.discovererId = discovererId;
        return this;
    }

    /**
     * <p>
     * The state of the discoverer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTED, STOPPED
     *
     * @return <p>
     *         The state of the discoverer.
     *         </p>
     * @see DiscovererState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the discoverer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTED, STOPPED
     *
     * @param state <p>
     *            The state of the discoverer.
     *            </p>
     * @see DiscovererState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the discoverer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTED, STOPPED
     *
     * @param state <p>
     *            The state of the discoverer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DiscovererState
     */
    public StopDiscovererResult withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the discoverer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTED, STOPPED
     *
     * @param state <p>
     *            The state of the discoverer.
     *            </p>
     * @see DiscovererState
     */
    public void setState(DiscovererState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the discoverer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STARTED, STOPPED
     *
     * @param state <p>
     *            The state of the discoverer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DiscovererState
     */
    public StopDiscovererResult withState(DiscovererState state) {
        this.state = state.toString();
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
        if (getDiscovererId() != null)
            sb.append("DiscovererId: " + getDiscovererId() + ",");
        if (getState() != null)
            sb.append("State: " + getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDiscovererId() == null) ? 0 : getDiscovererId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopDiscovererResult == false)
            return false;
        StopDiscovererResult other = (StopDiscovererResult) obj;

        if (other.getDiscovererId() == null ^ this.getDiscovererId() == null)
            return false;
        if (other.getDiscovererId() != null
                && other.getDiscovererId().equals(this.getDiscovererId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }
}
