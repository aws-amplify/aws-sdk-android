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
 * Specifies the <code>actions</code> to be performed when the
 * <code>condition</code> evaluates to TRUE.
 * </p>
 */
public class Event implements Serializable {
    /**
     * <p>
     * The name of the event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     */
    private String eventName;

    /**
     * <p>
     * Optional. The Boolean expression that, when TRUE, causes the
     * <code>actions</code> to be performed. If not present, the actions are
     * performed (=TRUE). If the expression result is not a Boolean value, the
     * actions are not performed (=FALSE).
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
     * The name of the event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @return <p>
     *         The name of the event.
     *         </p>
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * <p>
     * The name of the event.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param eventName <p>
     *            The name of the event.
     *            </p>
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * <p>
     * The name of the event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     *
     * @param eventName <p>
     *            The name of the event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * <p>
     * Optional. The Boolean expression that, when TRUE, causes the
     * <code>actions</code> to be performed. If not present, the actions are
     * performed (=TRUE). If the expression result is not a Boolean value, the
     * actions are not performed (=FALSE).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     *
     * @return <p>
     *         Optional. The Boolean expression that, when TRUE, causes the
     *         <code>actions</code> to be performed. If not present, the actions
     *         are performed (=TRUE). If the expression result is not a Boolean
     *         value, the actions are not performed (=FALSE).
     *         </p>
     */
    public String getCondition() {
        return condition;
    }

    /**
     * <p>
     * Optional. The Boolean expression that, when TRUE, causes the
     * <code>actions</code> to be performed. If not present, the actions are
     * performed (=TRUE). If the expression result is not a Boolean value, the
     * actions are not performed (=FALSE).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     *
     * @param condition <p>
     *            Optional. The Boolean expression that, when TRUE, causes the
     *            <code>actions</code> to be performed. If not present, the
     *            actions are performed (=TRUE). If the expression result is not
     *            a Boolean value, the actions are not performed (=FALSE).
     *            </p>
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * Optional. The Boolean expression that, when TRUE, causes the
     * <code>actions</code> to be performed. If not present, the actions are
     * performed (=TRUE). If the expression result is not a Boolean value, the
     * actions are not performed (=FALSE).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     *
     * @param condition <p>
     *            Optional. The Boolean expression that, when TRUE, causes the
     *            <code>actions</code> to be performed. If not present, the
     *            actions are performed (=TRUE). If the expression result is not
     *            a Boolean value, the actions are not performed (=FALSE).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event withCondition(String condition) {
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
    public Event withActions(Action... actions) {
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
    public Event withActions(java.util.Collection<Action> actions) {
        setActions(actions);
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
            sb.append("actions: " + getActions());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Event == false)
            return false;
        Event other = (Event) obj;

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
        return true;
    }
}
