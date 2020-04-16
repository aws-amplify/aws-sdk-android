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

/**
 * <p>
 * A workflow run is an execution of a workflow providing all the runtime
 * information.
 * </p>
 */
public class WorkflowRun implements Serializable {
    /**
     * <p>
     * Name of the workflow which was executed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String name;

    /**
     * <p>
     * The ID of this workflow run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String workflowRunId;

    /**
     * <p>
     * The workflow run properties which were set during the run.
     * </p>
     */
    private java.util.Map<String, String> workflowRunProperties;

    /**
     * <p>
     * The date and time when the workflow run was started.
     * </p>
     */
    private java.util.Date startedOn;

    /**
     * <p>
     * The date and time when the workflow run completed.
     * </p>
     */
    private java.util.Date completedOn;

    /**
     * <p>
     * The status of the workflow run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, COMPLETED
     */
    private String status;

    /**
     * <p>
     * The statistics of the run.
     * </p>
     */
    private WorkflowRunStatistics statistics;

    /**
     * <p>
     * The graph representing all the AWS Glue components that belong to the
     * workflow as nodes and directed connections between them as edges.
     * </p>
     */
    private WorkflowGraph graph;

    /**
     * <p>
     * Name of the workflow which was executed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         Name of the workflow which was executed.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Name of the workflow which was executed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            Name of the workflow which was executed.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the workflow which was executed.
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
     *            Name of the workflow which was executed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkflowRun withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The ID of this workflow run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The ID of this workflow run.
     *         </p>
     */
    public String getWorkflowRunId() {
        return workflowRunId;
    }

    /**
     * <p>
     * The ID of this workflow run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param workflowRunId <p>
     *            The ID of this workflow run.
     *            </p>
     */
    public void setWorkflowRunId(String workflowRunId) {
        this.workflowRunId = workflowRunId;
    }

    /**
     * <p>
     * The ID of this workflow run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param workflowRunId <p>
     *            The ID of this workflow run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkflowRun withWorkflowRunId(String workflowRunId) {
        this.workflowRunId = workflowRunId;
        return this;
    }

    /**
     * <p>
     * The workflow run properties which were set during the run.
     * </p>
     *
     * @return <p>
     *         The workflow run properties which were set during the run.
     *         </p>
     */
    public java.util.Map<String, String> getWorkflowRunProperties() {
        return workflowRunProperties;
    }

    /**
     * <p>
     * The workflow run properties which were set during the run.
     * </p>
     *
     * @param workflowRunProperties <p>
     *            The workflow run properties which were set during the run.
     *            </p>
     */
    public void setWorkflowRunProperties(java.util.Map<String, String> workflowRunProperties) {
        this.workflowRunProperties = workflowRunProperties;
    }

    /**
     * <p>
     * The workflow run properties which were set during the run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param workflowRunProperties <p>
     *            The workflow run properties which were set during the run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkflowRun withWorkflowRunProperties(java.util.Map<String, String> workflowRunProperties) {
        this.workflowRunProperties = workflowRunProperties;
        return this;
    }

    /**
     * <p>
     * The workflow run properties which were set during the run.
     * </p>
     * <p>
     * The method adds a new key-value pair into WorkflowRunProperties
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into WorkflowRunProperties.
     * @param value The corresponding value of the entry to be added into
     *            WorkflowRunProperties.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkflowRun addWorkflowRunPropertiesEntry(String key, String value) {
        if (null == this.workflowRunProperties) {
            this.workflowRunProperties = new java.util.HashMap<String, String>();
        }
        if (this.workflowRunProperties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.workflowRunProperties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into WorkflowRunProperties.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public WorkflowRun clearWorkflowRunPropertiesEntries() {
        this.workflowRunProperties = null;
        return this;
    }

    /**
     * <p>
     * The date and time when the workflow run was started.
     * </p>
     *
     * @return <p>
     *         The date and time when the workflow run was started.
     *         </p>
     */
    public java.util.Date getStartedOn() {
        return startedOn;
    }

    /**
     * <p>
     * The date and time when the workflow run was started.
     * </p>
     *
     * @param startedOn <p>
     *            The date and time when the workflow run was started.
     *            </p>
     */
    public void setStartedOn(java.util.Date startedOn) {
        this.startedOn = startedOn;
    }

    /**
     * <p>
     * The date and time when the workflow run was started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startedOn <p>
     *            The date and time when the workflow run was started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkflowRun withStartedOn(java.util.Date startedOn) {
        this.startedOn = startedOn;
        return this;
    }

    /**
     * <p>
     * The date and time when the workflow run completed.
     * </p>
     *
     * @return <p>
     *         The date and time when the workflow run completed.
     *         </p>
     */
    public java.util.Date getCompletedOn() {
        return completedOn;
    }

    /**
     * <p>
     * The date and time when the workflow run completed.
     * </p>
     *
     * @param completedOn <p>
     *            The date and time when the workflow run completed.
     *            </p>
     */
    public void setCompletedOn(java.util.Date completedOn) {
        this.completedOn = completedOn;
    }

    /**
     * <p>
     * The date and time when the workflow run completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completedOn <p>
     *            The date and time when the workflow run completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkflowRun withCompletedOn(java.util.Date completedOn) {
        this.completedOn = completedOn;
        return this;
    }

    /**
     * <p>
     * The status of the workflow run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, COMPLETED
     *
     * @return <p>
     *         The status of the workflow run.
     *         </p>
     * @see WorkflowRunStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the workflow run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, COMPLETED
     *
     * @param status <p>
     *            The status of the workflow run.
     *            </p>
     * @see WorkflowRunStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the workflow run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, COMPLETED
     *
     * @param status <p>
     *            The status of the workflow run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WorkflowRunStatus
     */
    public WorkflowRun withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the workflow run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, COMPLETED
     *
     * @param status <p>
     *            The status of the workflow run.
     *            </p>
     * @see WorkflowRunStatus
     */
    public void setStatus(WorkflowRunStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the workflow run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, COMPLETED
     *
     * @param status <p>
     *            The status of the workflow run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WorkflowRunStatus
     */
    public WorkflowRun withStatus(WorkflowRunStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The statistics of the run.
     * </p>
     *
     * @return <p>
     *         The statistics of the run.
     *         </p>
     */
    public WorkflowRunStatistics getStatistics() {
        return statistics;
    }

    /**
     * <p>
     * The statistics of the run.
     * </p>
     *
     * @param statistics <p>
     *            The statistics of the run.
     *            </p>
     */
    public void setStatistics(WorkflowRunStatistics statistics) {
        this.statistics = statistics;
    }

    /**
     * <p>
     * The statistics of the run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statistics <p>
     *            The statistics of the run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkflowRun withStatistics(WorkflowRunStatistics statistics) {
        this.statistics = statistics;
        return this;
    }

    /**
     * <p>
     * The graph representing all the AWS Glue components that belong to the
     * workflow as nodes and directed connections between them as edges.
     * </p>
     *
     * @return <p>
     *         The graph representing all the AWS Glue components that belong to
     *         the workflow as nodes and directed connections between them as
     *         edges.
     *         </p>
     */
    public WorkflowGraph getGraph() {
        return graph;
    }

    /**
     * <p>
     * The graph representing all the AWS Glue components that belong to the
     * workflow as nodes and directed connections between them as edges.
     * </p>
     *
     * @param graph <p>
     *            The graph representing all the AWS Glue components that belong
     *            to the workflow as nodes and directed connections between them
     *            as edges.
     *            </p>
     */
    public void setGraph(WorkflowGraph graph) {
        this.graph = graph;
    }

    /**
     * <p>
     * The graph representing all the AWS Glue components that belong to the
     * workflow as nodes and directed connections between them as edges.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param graph <p>
     *            The graph representing all the AWS Glue components that belong
     *            to the workflow as nodes and directed connections between them
     *            as edges.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkflowRun withGraph(WorkflowGraph graph) {
        this.graph = graph;
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
        if (getWorkflowRunId() != null)
            sb.append("WorkflowRunId: " + getWorkflowRunId() + ",");
        if (getWorkflowRunProperties() != null)
            sb.append("WorkflowRunProperties: " + getWorkflowRunProperties() + ",");
        if (getStartedOn() != null)
            sb.append("StartedOn: " + getStartedOn() + ",");
        if (getCompletedOn() != null)
            sb.append("CompletedOn: " + getCompletedOn() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatistics() != null)
            sb.append("Statistics: " + getStatistics() + ",");
        if (getGraph() != null)
            sb.append("Graph: " + getGraph());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getWorkflowRunId() == null) ? 0 : getWorkflowRunId().hashCode());
        hashCode = prime
                * hashCode
                + ((getWorkflowRunProperties() == null) ? 0 : getWorkflowRunProperties().hashCode());
        hashCode = prime * hashCode + ((getStartedOn() == null) ? 0 : getStartedOn().hashCode());
        hashCode = prime * hashCode
                + ((getCompletedOn() == null) ? 0 : getCompletedOn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        hashCode = prime * hashCode + ((getGraph() == null) ? 0 : getGraph().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowRun == false)
            return false;
        WorkflowRun other = (WorkflowRun) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getWorkflowRunId() == null ^ this.getWorkflowRunId() == null)
            return false;
        if (other.getWorkflowRunId() != null
                && other.getWorkflowRunId().equals(this.getWorkflowRunId()) == false)
            return false;
        if (other.getWorkflowRunProperties() == null ^ this.getWorkflowRunProperties() == null)
            return false;
        if (other.getWorkflowRunProperties() != null
                && other.getWorkflowRunProperties().equals(this.getWorkflowRunProperties()) == false)
            return false;
        if (other.getStartedOn() == null ^ this.getStartedOn() == null)
            return false;
        if (other.getStartedOn() != null
                && other.getStartedOn().equals(this.getStartedOn()) == false)
            return false;
        if (other.getCompletedOn() == null ^ this.getCompletedOn() == null)
            return false;
        if (other.getCompletedOn() != null
                && other.getCompletedOn().equals(this.getCompletedOn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null
                && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        if (other.getGraph() == null ^ this.getGraph() == null)
            return false;
        if (other.getGraph() != null && other.getGraph().equals(this.getGraph()) == false)
            return false;
        return true;
    }
}
