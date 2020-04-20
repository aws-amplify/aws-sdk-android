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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new trigger.
 * </p>
 */
public class CreateTriggerRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The type of the new trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCHEDULED, CONDITIONAL, ON_DEMAND
     */
    private String type;

    /**
     * <p>
     * A <code>cron</code> expression used to specify the schedule (see <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html"
     * >Time-Based Schedules for Jobs and Crawlers</a>. For example, to run
     * something every day at 12:15 UTC, you would specify:
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     * <p>
     * This field is required when the trigger type is SCHEDULED.
     * </p>
     */
    private String schedule;

    /**
     * <p>
     * A predicate to specify when the new trigger should fire.
     * </p>
     * <p>
     * This field is required when the trigger type is <code>CONDITIONAL</code>.
     * </p>
     */
    private Predicate predicate;

    /**
     * <p>
     * The actions initiated by this trigger when it fires.
     * </p>
     */
    private java.util.List<Action> actions;

    /**
     * <p>
     * A description of the new trigger.
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
     * Set to <code>true</code> to start <code>SCHEDULED</code> and
     * <code>CONDITIONAL</code> triggers when created. True is not supported for
     * <code>ON_DEMAND</code> triggers.
     * </p>
     */
    private Boolean startOnCreation;

    /**
     * <p>
     * The tags to use with this trigger. You may use tags to limit access to
     * the trigger. For more information about tags in AWS Glue, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS
     * Tags in AWS Glue</a> in the developer guide.
     * </p>
     */
    private java.util.Map<String, String> tags;

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
    public CreateTriggerRequest withName(String name) {
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
    public CreateTriggerRequest withWorkflowName(String workflowName) {
        this.workflowName = workflowName;
        return this;
    }

    /**
     * <p>
     * The type of the new trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCHEDULED, CONDITIONAL, ON_DEMAND
     *
     * @return <p>
     *         The type of the new trigger.
     *         </p>
     * @see TriggerType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the new trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCHEDULED, CONDITIONAL, ON_DEMAND
     *
     * @param type <p>
     *            The type of the new trigger.
     *            </p>
     * @see TriggerType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the new trigger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCHEDULED, CONDITIONAL, ON_DEMAND
     *
     * @param type <p>
     *            The type of the new trigger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TriggerType
     */
    public CreateTriggerRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the new trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCHEDULED, CONDITIONAL, ON_DEMAND
     *
     * @param type <p>
     *            The type of the new trigger.
     *            </p>
     * @see TriggerType
     */
    public void setType(TriggerType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the new trigger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCHEDULED, CONDITIONAL, ON_DEMAND
     *
     * @param type <p>
     *            The type of the new trigger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TriggerType
     */
    public CreateTriggerRequest withType(TriggerType type) {
        this.type = type.toString();
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
     * <p>
     * This field is required when the trigger type is SCHEDULED.
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
     *         <p>
     *         This field is required when the trigger type is SCHEDULED.
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
     * <p>
     * This field is required when the trigger type is SCHEDULED.
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
     *            <p>
     *            This field is required when the trigger type is SCHEDULED.
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
     * This field is required when the trigger type is SCHEDULED.
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
     *            <p>
     *            This field is required when the trigger type is SCHEDULED.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTriggerRequest withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * <p>
     * A predicate to specify when the new trigger should fire.
     * </p>
     * <p>
     * This field is required when the trigger type is <code>CONDITIONAL</code>.
     * </p>
     *
     * @return <p>
     *         A predicate to specify when the new trigger should fire.
     *         </p>
     *         <p>
     *         This field is required when the trigger type is
     *         <code>CONDITIONAL</code>.
     *         </p>
     */
    public Predicate getPredicate() {
        return predicate;
    }

    /**
     * <p>
     * A predicate to specify when the new trigger should fire.
     * </p>
     * <p>
     * This field is required when the trigger type is <code>CONDITIONAL</code>.
     * </p>
     *
     * @param predicate <p>
     *            A predicate to specify when the new trigger should fire.
     *            </p>
     *            <p>
     *            This field is required when the trigger type is
     *            <code>CONDITIONAL</code>.
     *            </p>
     */
    public void setPredicate(Predicate predicate) {
        this.predicate = predicate;
    }

    /**
     * <p>
     * A predicate to specify when the new trigger should fire.
     * </p>
     * <p>
     * This field is required when the trigger type is <code>CONDITIONAL</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param predicate <p>
     *            A predicate to specify when the new trigger should fire.
     *            </p>
     *            <p>
     *            This field is required when the trigger type is
     *            <code>CONDITIONAL</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTriggerRequest withPredicate(Predicate predicate) {
        this.predicate = predicate;
        return this;
    }

    /**
     * <p>
     * The actions initiated by this trigger when it fires.
     * </p>
     *
     * @return <p>
     *         The actions initiated by this trigger when it fires.
     *         </p>
     */
    public java.util.List<Action> getActions() {
        return actions;
    }

    /**
     * <p>
     * The actions initiated by this trigger when it fires.
     * </p>
     *
     * @param actions <p>
     *            The actions initiated by this trigger when it fires.
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
     * The actions initiated by this trigger when it fires.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actions <p>
     *            The actions initiated by this trigger when it fires.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTriggerRequest withActions(Action... actions) {
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
     * The actions initiated by this trigger when it fires.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actions <p>
     *            The actions initiated by this trigger when it fires.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTriggerRequest withActions(java.util.Collection<Action> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * A description of the new trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         A description of the new trigger.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the new trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param description <p>
     *            A description of the new trigger.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the new trigger.
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
     *            A description of the new trigger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTriggerRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to start <code>SCHEDULED</code> and
     * <code>CONDITIONAL</code> triggers when created. True is not supported for
     * <code>ON_DEMAND</code> triggers.
     * </p>
     *
     * @return <p>
     *         Set to <code>true</code> to start <code>SCHEDULED</code> and
     *         <code>CONDITIONAL</code> triggers when created. True is not
     *         supported for <code>ON_DEMAND</code> triggers.
     *         </p>
     */
    public Boolean isStartOnCreation() {
        return startOnCreation;
    }

    /**
     * <p>
     * Set to <code>true</code> to start <code>SCHEDULED</code> and
     * <code>CONDITIONAL</code> triggers when created. True is not supported for
     * <code>ON_DEMAND</code> triggers.
     * </p>
     *
     * @return <p>
     *         Set to <code>true</code> to start <code>SCHEDULED</code> and
     *         <code>CONDITIONAL</code> triggers when created. True is not
     *         supported for <code>ON_DEMAND</code> triggers.
     *         </p>
     */
    public Boolean getStartOnCreation() {
        return startOnCreation;
    }

    /**
     * <p>
     * Set to <code>true</code> to start <code>SCHEDULED</code> and
     * <code>CONDITIONAL</code> triggers when created. True is not supported for
     * <code>ON_DEMAND</code> triggers.
     * </p>
     *
     * @param startOnCreation <p>
     *            Set to <code>true</code> to start <code>SCHEDULED</code> and
     *            <code>CONDITIONAL</code> triggers when created. True is not
     *            supported for <code>ON_DEMAND</code> triggers.
     *            </p>
     */
    public void setStartOnCreation(Boolean startOnCreation) {
        this.startOnCreation = startOnCreation;
    }

    /**
     * <p>
     * Set to <code>true</code> to start <code>SCHEDULED</code> and
     * <code>CONDITIONAL</code> triggers when created. True is not supported for
     * <code>ON_DEMAND</code> triggers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startOnCreation <p>
     *            Set to <code>true</code> to start <code>SCHEDULED</code> and
     *            <code>CONDITIONAL</code> triggers when created. True is not
     *            supported for <code>ON_DEMAND</code> triggers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTriggerRequest withStartOnCreation(Boolean startOnCreation) {
        this.startOnCreation = startOnCreation;
        return this;
    }

    /**
     * <p>
     * The tags to use with this trigger. You may use tags to limit access to
     * the trigger. For more information about tags in AWS Glue, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS
     * Tags in AWS Glue</a> in the developer guide.
     * </p>
     *
     * @return <p>
     *         The tags to use with this trigger. You may use tags to limit
     *         access to the trigger. For more information about tags in AWS
     *         Glue, see <a href=
     *         "https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html"
     *         >AWS Tags in AWS Glue</a> in the developer guide.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to use with this trigger. You may use tags to limit access to
     * the trigger. For more information about tags in AWS Glue, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS
     * Tags in AWS Glue</a> in the developer guide.
     * </p>
     *
     * @param tags <p>
     *            The tags to use with this trigger. You may use tags to limit
     *            access to the trigger. For more information about tags in AWS
     *            Glue, see <a href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html"
     *            >AWS Tags in AWS Glue</a> in the developer guide.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to use with this trigger. You may use tags to limit access to
     * the trigger. For more information about tags in AWS Glue, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS
     * Tags in AWS Glue</a> in the developer guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to use with this trigger. You may use tags to limit
     *            access to the trigger. For more information about tags in AWS
     *            Glue, see <a href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html"
     *            >AWS Tags in AWS Glue</a> in the developer guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTriggerRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags to use with this trigger. You may use tags to limit access to
     * the trigger. For more information about tags in AWS Glue, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS
     * Tags in AWS Glue</a> in the developer guide.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTriggerRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateTriggerRequest clearTagsEntries() {
        this.tags = null;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getSchedule() != null)
            sb.append("Schedule: " + getSchedule() + ",");
        if (getPredicate() != null)
            sb.append("Predicate: " + getPredicate() + ",");
        if (getActions() != null)
            sb.append("Actions: " + getActions() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getStartOnCreation() != null)
            sb.append("StartOnCreation: " + getStartOnCreation() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
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
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getPredicate() == null) ? 0 : getPredicate().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getStartOnCreation() == null) ? 0 : getStartOnCreation().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTriggerRequest == false)
            return false;
        CreateTriggerRequest other = (CreateTriggerRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getWorkflowName() == null ^ this.getWorkflowName() == null)
            return false;
        if (other.getWorkflowName() != null
                && other.getWorkflowName().equals(this.getWorkflowName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getPredicate() == null ^ this.getPredicate() == null)
            return false;
        if (other.getPredicate() != null
                && other.getPredicate().equals(this.getPredicate()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStartOnCreation() == null ^ this.getStartOnCreation() == null)
            return false;
        if (other.getStartOnCreation() != null
                && other.getStartOnCreation().equals(this.getStartOnCreation()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
