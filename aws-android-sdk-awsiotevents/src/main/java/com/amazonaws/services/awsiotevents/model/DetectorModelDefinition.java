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

package com.amazonaws.services.awsiotevents.model;

import java.io.Serializable;

/**
 * <p>
 * Information that defines how a detector operates.
 * </p>
 */
public class DetectorModelDefinition implements Serializable {
    /**
     * <p>
     * Information about the states of the detector.
     * </p>
     */
    private java.util.List<State> states;

    /**
     * <p>
     * The state that is entered at the creation of each detector (instance).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String initialStateName;

    /**
     * <p>
     * Information about the states of the detector.
     * </p>
     *
     * @return <p>
     *         Information about the states of the detector.
     *         </p>
     */
    public java.util.List<State> getStates() {
        return states;
    }

    /**
     * <p>
     * Information about the states of the detector.
     * </p>
     *
     * @param states <p>
     *            Information about the states of the detector.
     *            </p>
     */
    public void setStates(java.util.Collection<State> states) {
        if (states == null) {
            this.states = null;
            return;
        }

        this.states = new java.util.ArrayList<State>(states);
    }

    /**
     * <p>
     * Information about the states of the detector.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param states <p>
     *            Information about the states of the detector.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectorModelDefinition withStates(State... states) {
        if (getStates() == null) {
            this.states = new java.util.ArrayList<State>(states.length);
        }
        for (State value : states) {
            this.states.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the states of the detector.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param states <p>
     *            Information about the states of the detector.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectorModelDefinition withStates(java.util.Collection<State> states) {
        setStates(states);
        return this;
    }

    /**
     * <p>
     * The state that is entered at the creation of each detector (instance).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The state that is entered at the creation of each detector
     *         (instance).
     *         </p>
     */
    public String getInitialStateName() {
        return initialStateName;
    }

    /**
     * <p>
     * The state that is entered at the creation of each detector (instance).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param initialStateName <p>
     *            The state that is entered at the creation of each detector
     *            (instance).
     *            </p>
     */
    public void setInitialStateName(String initialStateName) {
        this.initialStateName = initialStateName;
    }

    /**
     * <p>
     * The state that is entered at the creation of each detector (instance).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param initialStateName <p>
     *            The state that is entered at the creation of each detector
     *            (instance).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectorModelDefinition withInitialStateName(String initialStateName) {
        this.initialStateName = initialStateName;
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
        if (getStates() != null)
            sb.append("states: " + getStates() + ",");
        if (getInitialStateName() != null)
            sb.append("initialStateName: " + getInitialStateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStates() == null) ? 0 : getStates().hashCode());
        hashCode = prime * hashCode
                + ((getInitialStateName() == null) ? 0 : getInitialStateName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectorModelDefinition == false)
            return false;
        DetectorModelDefinition other = (DetectorModelDefinition) obj;

        if (other.getStates() == null ^ this.getStates() == null)
            return false;
        if (other.getStates() != null && other.getStates().equals(this.getStates()) == false)
            return false;
        if (other.getInitialStateName() == null ^ this.getInitialStateName() == null)
            return false;
        if (other.getInitialStateName() != null
                && other.getInitialStateName().equals(this.getInitialStateName()) == false)
            return false;
        return true;
    }
}
