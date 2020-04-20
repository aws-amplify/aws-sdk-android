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
 * A workflow represents a flow in which AWS Glue components should be executed
 * to complete a logical task.
 * </p>
 */
public class Workflow implements Serializable {
    /**
     * <p>
     * The name of the workflow representing the flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String name;

    /**
     * <p>
     * A description of the workflow.
     * </p>
     */
    private String description;

    /**
     * <p>
     * A collection of properties to be used as part of each execution of the
     * workflow.
     * </p>
     */
    private java.util.Map<String, String> defaultRunProperties;

    /**
     * <p>
     * The date and time when the workflow was created.
     * </p>
     */
    private java.util.Date createdOn;

    /**
     * <p>
     * The date and time when the workflow was last modified.
     * </p>
     */
    private java.util.Date lastModifiedOn;

    /**
     * <p>
     * The information about the last execution of the workflow.
     * </p>
     */
    private WorkflowRun lastRun;

    /**
     * <p>
     * The graph representing all the AWS Glue components that belong to the
     * workflow as nodes and directed connections between them as edges.
     * </p>
     */
    private WorkflowGraph graph;

    /**
     * <p>
     * The name of the workflow representing the flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the workflow representing the flow.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the workflow representing the flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The name of the workflow representing the flow.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the workflow representing the flow.
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
     *            The name of the workflow representing the flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Workflow withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A description of the workflow.
     * </p>
     *
     * @return <p>
     *         A description of the workflow.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the workflow.
     * </p>
     *
     * @param description <p>
     *            A description of the workflow.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the workflow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description of the workflow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Workflow withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A collection of properties to be used as part of each execution of the
     * workflow.
     * </p>
     *
     * @return <p>
     *         A collection of properties to be used as part of each execution
     *         of the workflow.
     *         </p>
     */
    public java.util.Map<String, String> getDefaultRunProperties() {
        return defaultRunProperties;
    }

    /**
     * <p>
     * A collection of properties to be used as part of each execution of the
     * workflow.
     * </p>
     *
     * @param defaultRunProperties <p>
     *            A collection of properties to be used as part of each
     *            execution of the workflow.
     *            </p>
     */
    public void setDefaultRunProperties(java.util.Map<String, String> defaultRunProperties) {
        this.defaultRunProperties = defaultRunProperties;
    }

    /**
     * <p>
     * A collection of properties to be used as part of each execution of the
     * workflow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultRunProperties <p>
     *            A collection of properties to be used as part of each
     *            execution of the workflow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Workflow withDefaultRunProperties(java.util.Map<String, String> defaultRunProperties) {
        this.defaultRunProperties = defaultRunProperties;
        return this;
    }

    /**
     * <p>
     * A collection of properties to be used as part of each execution of the
     * workflow.
     * </p>
     * <p>
     * The method adds a new key-value pair into DefaultRunProperties parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into DefaultRunProperties.
     * @param value The corresponding value of the entry to be added into
     *            DefaultRunProperties.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Workflow addDefaultRunPropertiesEntry(String key, String value) {
        if (null == this.defaultRunProperties) {
            this.defaultRunProperties = new java.util.HashMap<String, String>();
        }
        if (this.defaultRunProperties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.defaultRunProperties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DefaultRunProperties.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Workflow clearDefaultRunPropertiesEntries() {
        this.defaultRunProperties = null;
        return this;
    }

    /**
     * <p>
     * The date and time when the workflow was created.
     * </p>
     *
     * @return <p>
     *         The date and time when the workflow was created.
     *         </p>
     */
    public java.util.Date getCreatedOn() {
        return createdOn;
    }

    /**
     * <p>
     * The date and time when the workflow was created.
     * </p>
     *
     * @param createdOn <p>
     *            The date and time when the workflow was created.
     *            </p>
     */
    public void setCreatedOn(java.util.Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * <p>
     * The date and time when the workflow was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdOn <p>
     *            The date and time when the workflow was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Workflow withCreatedOn(java.util.Date createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * <p>
     * The date and time when the workflow was last modified.
     * </p>
     *
     * @return <p>
     *         The date and time when the workflow was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedOn() {
        return lastModifiedOn;
    }

    /**
     * <p>
     * The date and time when the workflow was last modified.
     * </p>
     *
     * @param lastModifiedOn <p>
     *            The date and time when the workflow was last modified.
     *            </p>
     */
    public void setLastModifiedOn(java.util.Date lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
    }

    /**
     * <p>
     * The date and time when the workflow was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedOn <p>
     *            The date and time when the workflow was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Workflow withLastModifiedOn(java.util.Date lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
        return this;
    }

    /**
     * <p>
     * The information about the last execution of the workflow.
     * </p>
     *
     * @return <p>
     *         The information about the last execution of the workflow.
     *         </p>
     */
    public WorkflowRun getLastRun() {
        return lastRun;
    }

    /**
     * <p>
     * The information about the last execution of the workflow.
     * </p>
     *
     * @param lastRun <p>
     *            The information about the last execution of the workflow.
     *            </p>
     */
    public void setLastRun(WorkflowRun lastRun) {
        this.lastRun = lastRun;
    }

    /**
     * <p>
     * The information about the last execution of the workflow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastRun <p>
     *            The information about the last execution of the workflow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Workflow withLastRun(WorkflowRun lastRun) {
        this.lastRun = lastRun;
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
    public Workflow withGraph(WorkflowGraph graph) {
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDefaultRunProperties() != null)
            sb.append("DefaultRunProperties: " + getDefaultRunProperties() + ",");
        if (getCreatedOn() != null)
            sb.append("CreatedOn: " + getCreatedOn() + ",");
        if (getLastModifiedOn() != null)
            sb.append("LastModifiedOn: " + getLastModifiedOn() + ",");
        if (getLastRun() != null)
            sb.append("LastRun: " + getLastRun() + ",");
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
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultRunProperties() == null) ? 0 : getDefaultRunProperties().hashCode());
        hashCode = prime * hashCode + ((getCreatedOn() == null) ? 0 : getCreatedOn().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedOn() == null) ? 0 : getLastModifiedOn().hashCode());
        hashCode = prime * hashCode + ((getLastRun() == null) ? 0 : getLastRun().hashCode());
        hashCode = prime * hashCode + ((getGraph() == null) ? 0 : getGraph().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Workflow == false)
            return false;
        Workflow other = (Workflow) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDefaultRunProperties() == null ^ this.getDefaultRunProperties() == null)
            return false;
        if (other.getDefaultRunProperties() != null
                && other.getDefaultRunProperties().equals(this.getDefaultRunProperties()) == false)
            return false;
        if (other.getCreatedOn() == null ^ this.getCreatedOn() == null)
            return false;
        if (other.getCreatedOn() != null
                && other.getCreatedOn().equals(this.getCreatedOn()) == false)
            return false;
        if (other.getLastModifiedOn() == null ^ this.getLastModifiedOn() == null)
            return false;
        if (other.getLastModifiedOn() != null
                && other.getLastModifiedOn().equals(this.getLastModifiedOn()) == false)
            return false;
        if (other.getLastRun() == null ^ this.getLastRun() == null)
            return false;
        if (other.getLastRun() != null && other.getLastRun().equals(this.getLastRun()) == false)
            return false;
        if (other.getGraph() == null ^ this.getGraph() == null)
            return false;
        if (other.getGraph() != null && other.getGraph().equals(this.getGraph()) == false)
            return false;
        return true;
    }
}
