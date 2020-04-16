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
 * Specifies the actions performed and the next state entered when a
 * <code>condition</code> evaluates to TRUE.
 * </p>
 */
public class TransitionEvent implements Serializable {
    /**
     * <p>
     * The name of the transition event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     */
    private String eventName;

    /**
     * <p>
     * Required. A Boolean expression that when TRUE causes the actions to be
     * performed and the <code>nextState</code> to be entered.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     */
    private String condition;

    /**
     * <p>
     * The actions to be performed.
     * </p>
     */
    private java.util.List<Action> actions;

    /**
     * <p>
     * The next state to enter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String nextState;

    /**
     * <p>
     * The name of the transition event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @return <p>
     *         The name of the transition event.
     *         </p>
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * <p>
     * The name of the transition event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param eventName <p>
     *            The name of the transition event.
     *            </p>
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * <p>
     * The name of the transition event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param eventName <p>
     *            The name of the transition event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitionEvent withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * <p>
     * Required. A Boolean expression that when TRUE causes the actions to be
     * performed and the <code>nextState</code> to be entered.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     *
     * @return <p>
     *         Required. A Boolean expression that when TRUE causes the actions
     *         to be performed and the <code>nextState</code> to be entered.
     *         </p>
     */
    public String getCondition() {
        return condition;
    }

    /**
     * <p>
     * Required. A Boolean expression that when TRUE causes the actions to be
     * performed and the <code>nextState</code> to be entered.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     *
     * @param condition <p>
     *            Required. A Boolean expression that when TRUE causes the
     *            actions to be performed and the <code>nextState</code> to be
     *            entered.
     *            </p>
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * Required. A Boolean expression that when TRUE causes the actions to be
     * performed and the <code>nextState</code> to be entered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     *
     * @param condition <p>
     *            Required. A Boolean expression that when TRUE causes the
     *            actions to be performed and the <code>nextState</code> to be
     *            entered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitionEvent withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * <p>
     * The actions to be performed.
     * </p>
     *
     * @return <p>
     *         The actions to be performed.
     *         </p>
     */
    public java.util.List<Action> getActions() {
        return actions;
    }

    /**
     * <p>
     * The actions to be performed.
     * </p>
     *
     * @param actions <p>
     *            The actions to be performed.
     *            </p>
     */
    public void setActions(java.util.Collection<Action> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<Action>(actions);
    }

    /**
     * <p>
     * The actions to be performed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actions <p>
     *            The actions to be performed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitionEvent withActions(Action... actions) {
        if (getActions() == null) {
            this.actions = new java.util.ArrayList<Action>(actions.length);
        }
        for (Action value : actions) {
            this.actions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The actions to be performed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actions <p>
     *            The actions to be performed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitionEvent withActions(java.util.Collection<Action> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * The next state to enter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The next state to enter.
     *         </p>
     */
    public String getNextState() {
        return nextState;
    }

    /**
     * <p>
     * The next state to enter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param nextState <p>
     *            The next state to enter.
     *            </p>
     */
    public void setNextState(String nextState) {
        this.nextState = nextState;
    }

    /**
     * <p>
     * The next state to enter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param nextState <p>
     *            The next state to enter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitionEvent withNextState(String nextState) {
        this.nextState = nextState;
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
        if (getEventName() != null)
            sb.append("eventName: " + getEventName() + ",");
        if (getCondition() != null)
            sb.append("condition: " + getCondition() + ",");
        if (getActions() != null)
            sb.append("actions: " + getActions() + ",");
        if (getNextState() != null)
            sb.append("nextState: " + getNextState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventName() == null) ? 0 : getEventName().hashCode());
        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getNextState() == null) ? 0 : getNextState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitionEvent == false)
            return false;
        TransitionEvent other = (TransitionEvent) obj;

        if (other.getEventName() == null ^ this.getEventName() == null)
            return false;
        if (other.getEventName() != null
                && other.getEventName().equals(this.getEventName()) == false)
            return false;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null
                && other.getCondition().equals(this.getCondition()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getNextState() == null ^ this.getNextState() == null)
            return false;
        if (other.getNextState() != null
                && other.getNextState().equals(this.getNextState()) == false)
            return false;
        return true;
    }
}
