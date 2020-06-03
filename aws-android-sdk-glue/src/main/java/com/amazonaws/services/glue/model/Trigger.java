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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a specific trigger.
 * </p>
 */
public class Trigger implements Serializable {
    /**
     * <p>
     * The name of the trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String name;

    /**
     * <p>
     * The name of the workflow associated with the trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String workflowName;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String id;

    /**
     * <p>
     * The type of trigger that this is.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCHEDULED, CONDITIONAL, ON_DEMAND
     */
    private String type;

    /**
     * <p>
     * The current state of the trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, CREATED, ACTIVATING, ACTIVATED,
     * DEACTIVATING, DEACTIVATED, DELETING, UPDATING
     */
    private String state;

    /**
     * <p>
     * A description of this trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String description;

    /**
     * <p>
     * A <code>cron</code> expression used to specify the schedule (see <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html"
     * >Time-Based Schedules for Jobs and Crawlers</a>. For example, to run
     * something every day at 12:15 UTC, you would specify:
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     */
    private String schedule;

    /**
     * <p>
     * The actions initiated by this trigger.
     * </p>
     */
    private java.util.List<Action> actions;

    /**
     * <p>
     * The predicate of this trigger, which defines when it will fire.
     * </p>
     */
    private Predicate predicate;

    /**
     * <p>
     * The name of the trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the trigger.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The name of the trigger.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the trigger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The name of the trigger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Trigger withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The name of the workflow associated with the trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the workflow associated with the trigger.
     *         </p>
     */
    public String getWorkflowName() {
        return workflowName;
    }

    /**
     * <p>
     * The name of the workflow associated with the trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param workflowName <p>
     *            The name of the workflow associated with the trigger.
     *            </p>
     */
    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }

    /**
     * <p>
     * The name of the workflow associated with the trigger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param workflowName <p>
     *            The name of the workflow associated with the trigger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Trigger withWorkflowName(String workflowName) {
        this.workflowName = workflowName;
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param id <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param id <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Trigger withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The type of trigger that this is.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCHEDULED, CONDITIONAL, ON_DEMAND
     *
     * @return <p>
     *         The type of trigger that this is.
     *         </p>
     * @see TriggerType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of trigger that this is.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCHEDULED, CONDITIONAL, ON_DEMAND
     *
     * @param type <p>
     *            The type of trigger that this is.
     *            </p>
     * @see TriggerType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of trigger that this is.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCHEDULED, CONDITIONAL, ON_DEMAND
     *
     * @param type <p>
     *            The type of trigger that this is.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TriggerType
     */
    public Trigger withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of trigger that this is.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCHEDULED, CONDITIONAL, ON_DEMAND
     *
     * @param type <p>
     *            The type of trigger that this is.
     *            </p>
     * @see TriggerType
     */
    public void setType(TriggerType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of trigger that this is.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCHEDULED, CONDITIONAL, ON_DEMAND
     *
     * @param type <p>
     *            The type of trigger that this is.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TriggerType
     */
    public Trigger withType(TriggerType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The current state of the trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, CREATED, ACTIVATING, ACTIVATED,
     * DEACTIVATING, DEACTIVATED, DELETING, UPDATING
     *
     * @return <p>
     *         The current state of the trigger.
     *         </p>
     * @see TriggerState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The current state of the trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, CREATED, ACTIVATING, ACTIVATED,
     * DEACTIVATING, DEACTIVATED, DELETING, UPDATING
     *
     * @param state <p>
     *            The current state of the trigger.
     *            </p>
     * @see TriggerState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the trigger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, CREATED, ACTIVATING, ACTIVATED,
     * DEACTIVATING, DEACTIVATED, DELETING, UPDATING
     *
     * @param state <p>
     *            The current state of the trigger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TriggerState
     */
    public Trigger withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The current state of the trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, CREATED, ACTIVATING, ACTIVATED,
     * DEACTIVATING, DEACTIVATED, DELETING, UPDATING
     *
     * @param state <p>
     *            The current state of the trigger.
     *            </p>
     * @see TriggerState
     */
    public void setState(TriggerState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The current state of the trigger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, CREATED, ACTIVATING, ACTIVATED,
     * DEACTIVATING, DEACTIVATED, DELETING, UPDATING
     *
     * @param state <p>
     *            The current state of the trigger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TriggerState
     */
    public Trigger withState(TriggerState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * A description of this trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         A description of this trigger.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of this trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param description <p>
     *            A description of this trigger.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of this trigger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param description <p>
     *            A description of this trigger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Trigger withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A <code>cron</code> expression used to specify the schedule (see <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html"
     * >Time-Based Schedules for Jobs and Crawlers</a>. For example, to run
     * something every day at 12:15 UTC, you would specify:
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     *
     * @return <p>
     *         A <code>cron</code> expression used to specify the schedule (see
     *         <a href=
     *         "https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html"
     *         >Time-Based Schedules for Jobs and Crawlers</a>. For example, to
     *         run something every day at 12:15 UTC, you would specify:
     *         <code>cron(15 12 * * ? *)</code>.
     *         </p>
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * <p>
     * A <code>cron</code> expression used to specify the schedule (see <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html"
     * >Time-Based Schedules for Jobs and Crawlers</a>. For example, to run
     * something every day at 12:15 UTC, you would specify:
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     *
     * @param schedule <p>
     *            A <code>cron</code> expression used to specify the schedule
     *            (see <a href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html"
     *            >Time-Based Schedules for Jobs and Crawlers</a>. For example,
     *            to run something every day at 12:15 UTC, you would specify:
     *            <code>cron(15 12 * * ? *)</code>.
     *            </p>
     */
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * A <code>cron</code> expression used to specify the schedule (see <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html"
     * >Time-Based Schedules for Jobs and Crawlers</a>. For example, to run
     * something every day at 12:15 UTC, you would specify:
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schedule <p>
     *            A <code>cron</code> expression used to specify the schedule
     *            (see <a href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html"
     *            >Time-Based Schedules for Jobs and Crawlers</a>. For example,
     *            to run something every day at 12:15 UTC, you would specify:
     *            <code>cron(15 12 * * ? *)</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Trigger withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * <p>
     * The actions initiated by this trigger.
     * </p>
     *
     * @return <p>
     *         The actions initiated by this trigger.
     *         </p>
     */
    public java.util.List<Action> getActions() {
        return actions;
    }

    /**
     * <p>
     * The actions initiated by this trigger.
     * </p>
     *
     * @param actions <p>
     *            The actions initiated by this trigger.
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
     * The actions initiated by this trigger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actions <p>
     *            The actions initiated by this trigger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Trigger withActions(Action... actions) {
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
     * The actions initiated by this trigger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actions <p>
     *            The actions initiated by this trigger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Trigger withActions(java.util.Collection<Action> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * The predicate of this trigger, which defines when it will fire.
     * </p>
     *
     * @return <p>
     *         The predicate of this trigger, which defines when it will fire.
     *         </p>
     */
    public Predicate getPredicate() {
        return predicate;
    }

    /**
     * <p>
     * The predicate of this trigger, which defines when it will fire.
     * </p>
     *
     * @param predicate <p>
     *            The predicate of this trigger, which defines when it will
     *            fire.
     *            </p>
     */
    public void setPredicate(Predicate predicate) {
        this.predicate = predicate;
    }

    /**
     * <p>
     * The predicate of this trigger, which defines when it will fire.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param predicate <p>
     *            The predicate of this trigger, which defines when it will
     *            fire.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Trigger withPredicate(Predicate predicate) {
        this.predicate = predicate;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getWorkflowName() != null)
            sb.append("WorkflowName: " + getWorkflowName() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getSchedule() != null)
            sb.append("Schedule: " + getSchedule() + ",");
        if (getActions() != null)
            sb.append("Actions: " + getActions() + ",");
        if (getPredicate() != null)
            sb.append("Predicate: " + getPredicate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getWorkflowName() == null) ? 0 : getWorkflowName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getPredicate() == null) ? 0 : getPredicate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Trigger == false)
            return false;
        Trigger other = (Trigger) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getWorkflowName() == null ^ this.getWorkflowName() == null)
            return false;
        if (other.getWorkflowName() != null
                && other.getWorkflowName().equals(this.getWorkflowName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getPredicate() == null ^ this.getPredicate() == null)
            return false;
        if (other.getPredicate() != null
                && other.getPredicate().equals(this.getPredicate()) == false)
            return false;
        return true;
    }
}
