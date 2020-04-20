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
 * Information that defines a state of a detector.
 * </p>
 */
public class State implements Serializable {
    /**
     * <p>
     * The name of the state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String stateName;

    /**
     * <p>
     * When an input is received and the <code>condition</code> is TRUE, perform
     * the specified <code>actions</code>.
     * </p>
     */
    private OnInputLifecycle onInput;

    /**
     * <p>
     * When entering this state, perform these <code>actions</code> if the
     * <code>condition</code> is TRUE.
     * </p>
     */
    private OnEnterLifecycle onEnter;

    /**
     * <p>
     * When exiting this state, perform these <code>actions</code> if the
     * specified <code>condition</code> is <code>TRUE</code>.
     * </p>
     */
    private OnExitLifecycle onExit;

    /**
     * <p>
     * The name of the state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The name of the state.
     *         </p>
     */
    public String getStateName() {
        return stateName;
    }

    /**
     * <p>
     * The name of the state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param stateName <p>
     *            The name of the state.
     *            </p>
     */
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    /**
     * <p>
     * The name of the state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param stateName <p>
     *            The name of the state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public State withStateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    /**
     * <p>
     * When an input is received and the <code>condition</code> is TRUE, perform
     * the specified <code>actions</code>.
     * </p>
     *
     * @return <p>
     *         When an input is received and the <code>condition</code> is TRUE,
     *         perform the specified <code>actions</code>.
     *         </p>
     */
    public OnInputLifecycle getOnInput() {
        return onInput;
    }

    /**
     * <p>
     * When an input is received and the <code>condition</code> is TRUE, perform
     * the specified <code>actions</code>.
     * </p>
     *
     * @param onInput <p>
     *            When an input is received and the <code>condition</code> is
     *            TRUE, perform the specified <code>actions</code>.
     *            </p>
     */
    public void setOnInput(OnInputLifecycle onInput) {
        this.onInput = onInput;
    }

    /**
     * <p>
     * When an input is received and the <code>condition</code> is TRUE, perform
     * the specified <code>actions</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onInput <p>
     *            When an input is received and the <code>condition</code> is
     *            TRUE, perform the specified <code>actions</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public State withOnInput(OnInputLifecycle onInput) {
        this.onInput = onInput;
        return this;
    }

    /**
     * <p>
     * When entering this state, perform these <code>actions</code> if the
     * <code>condition</code> is TRUE.
     * </p>
     *
     * @return <p>
     *         When entering this state, perform these <code>actions</code> if
     *         the <code>condition</code> is TRUE.
     *         </p>
     */
    public OnEnterLifecycle getOnEnter() {
        return onEnter;
    }

    /**
     * <p>
     * When entering this state, perform these <code>actions</code> if the
     * <code>condition</code> is TRUE.
     * </p>
     *
     * @param onEnter <p>
     *            When entering this state, perform these <code>actions</code>
     *            if the <code>condition</code> is TRUE.
     *            </p>
     */
    public void setOnEnter(OnEnterLifecycle onEnter) {
        this.onEnter = onEnter;
    }

    /**
     * <p>
     * When entering this state, perform these <code>actions</code> if the
     * <code>condition</code> is TRUE.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onEnter <p>
     *            When entering this state, perform these <code>actions</code>
     *            if the <code>condition</code> is TRUE.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public State withOnEnter(OnEnterLifecycle onEnter) {
        this.onEnter = onEnter;
        return this;
    }

    /**
     * <p>
     * When exiting this state, perform these <code>actions</code> if the
     * specified <code>condition</code> is <code>TRUE</code>.
     * </p>
     *
     * @return <p>
     *         When exiting this state, perform these <code>actions</code> if
     *         the specified <code>condition</code> is <code>TRUE</code>.
     *         </p>
     */
    public OnExitLifecycle getOnExit() {
        return onExit;
    }

    /**
     * <p>
     * When exiting this state, perform these <code>actions</code> if the
     * specified <code>condition</code> is <code>TRUE</code>.
     * </p>
     *
     * @param onExit <p>
     *            When exiting this state, perform these <code>actions</code> if
     *            the specified <code>condition</code> is <code>TRUE</code>.
     *            </p>
     */
    public void setOnExit(OnExitLifecycle onExit) {
        this.onExit = onExit;
    }

    /**
     * <p>
     * When exiting this state, perform these <code>actions</code> if the
     * specified <code>condition</code> is <code>TRUE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onExit <p>
     *            When exiting this state, perform these <code>actions</code> if
     *            the specified <code>condition</code> is <code>TRUE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public State withOnExit(OnExitLifecycle onExit) {
        this.onExit = onExit;
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
        if (getStateName() != null)
            sb.append("stateName: " + getStateName() + ",");
        if (getOnInput() != null)
            sb.append("onInput: " + getOnInput() + ",");
        if (getOnEnter() != null)
            sb.append("onEnter: " + getOnEnter() + ",");
        if (getOnExit() != null)
            sb.append("onExit: " + getOnExit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStateName() == null) ? 0 : getStateName().hashCode());
        hashCode = prime * hashCode + ((getOnInput() == null) ? 0 : getOnInput().hashCode());
        hashCode = prime * hashCode + ((getOnEnter() == null) ? 0 : getOnEnter().hashCode());
        hashCode = prime * hashCode + ((getOnExit() == null) ? 0 : getOnExit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof State == false)
            return false;
        State other = (State) obj;

        if (other.getStateName() == null ^ this.getStateName() == null)
            return false;
        if (other.getStateName() != null
                && other.getStateName().equals(this.getStateName()) == false)
            return false;
        if (other.getOnInput() == null ^ this.getOnInput() == null)
            return false;
        if (other.getOnInput() != null && other.getOnInput().equals(this.getOnInput()) == false)
            return false;
        if (other.getOnEnter() == null ^ this.getOnEnter() == null)
            return false;
        if (other.getOnEnter() != null && other.getOnEnter().equals(this.getOnEnter()) == false)
            return false;
        if (other.getOnExit() == null ^ this.getOnExit() == null)
            return false;
        if (other.getOnExit() != null && other.getOnExit().equals(this.getOnExit()) == false)
            return false;
        return true;
    }
}
