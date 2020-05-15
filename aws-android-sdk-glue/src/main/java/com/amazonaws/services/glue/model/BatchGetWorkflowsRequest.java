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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of resource metadata for a given list of workflow names. After
 * calling the <code>ListWorkflows</code> operation, you can call this operation
 * to access the data to which you have been granted permissions. This operation
 * supports all IAM permissions, including permission conditions that uses tags.
 * </p>
 */
public class BatchGetWorkflowsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A list of workflow names, which may be the names returned from the
     * <code>ListWorkflows</code> operation.
     * </p>
     */
    private java.util.List<String> names;

    /**
     * <p>
     * Specifies whether to include a graph when returning the workflow resource
     * metadata.
     * </p>
     */
    private Boolean includeGraph;

    /**
     * <p>
     * A list of workflow names, which may be the names returned from the
     * <code>ListWorkflows</code> operation.
     * </p>
     *
     * @return <p>
     *         A list of workflow names, which may be the names returned from
     *         the <code>ListWorkflows</code> operation.
     *         </p>
     */
    public java.util.List<String> getNames() {
        return names;
    }

    /**
     * <p>
     * A list of workflow names, which may be the names returned from the
     * <code>ListWorkflows</code> operation.
     * </p>
     *
     * @param names <p>
     *            A list of workflow names, which may be the names returned from
     *            the <code>ListWorkflows</code> operation.
     *            </p>
     */
    public void setNames(java.util.Collection<String> names) {
        if (names == null) {
            this.names = null;
            return;
        }

        this.names = new java.util.ArrayList<String>(names);
    }

    /**
     * <p>
     * A list of workflow names, which may be the names returned from the
     * <code>ListWorkflows</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param names <p>
     *            A list of workflow names, which may be the names returned from
     *            the <code>ListWorkflows</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetWorkflowsRequest withNames(String... names) {
        if (getNames() == null) {
            this.names = new java.util.ArrayList<String>(names.length);
        }
        for (String value : names) {
            this.names.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of workflow names, which may be the names returned from the
     * <code>ListWorkflows</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param names <p>
     *            A list of workflow names, which may be the names returned from
     *            the <code>ListWorkflows</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetWorkflowsRequest withNames(java.util.Collection<String> names) {
        setNames(names);
        return this;
    }

    /**
     * <p>
     * Specifies whether to include a graph when returning the workflow resource
     * metadata.
     * </p>
     *
     * @return <p>
     *         Specifies whether to include a graph when returning the workflow
     *         resource metadata.
     *         </p>
     */
    public Boolean isIncludeGraph() {
        return includeGraph;
    }

    /**
     * <p>
     * Specifies whether to include a graph when returning the workflow resource
     * metadata.
     * </p>
     *
     * @return <p>
     *         Specifies whether to include a graph when returning the workflow
     *         resource metadata.
     *         </p>
     */
    public Boolean getIncludeGraph() {
        return includeGraph;
    }

    /**
     * <p>
     * Specifies whether to include a graph when returning the workflow resource
     * metadata.
     * </p>
     *
     * @param includeGraph <p>
     *            Specifies whether to include a graph when returning the
     *            workflow resource metadata.
     *            </p>
     */
    public void setIncludeGraph(Boolean includeGraph) {
        this.includeGraph = includeGraph;
    }

    /**
     * <p>
     * Specifies whether to include a graph when returning the workflow resource
     * metadata.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeGraph <p>
     *            Specifies whether to include a graph when returning the
     *            workflow resource metadata.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetWorkflowsRequest withIncludeGraph(Boolean includeGraph) {
        this.includeGraph = includeGraph;
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
        if (getNames() != null)
            sb.append("Names: " + getNames() + ",");
        if (getIncludeGraph() != null)
            sb.append("IncludeGraph: " + getIncludeGraph());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNames() == null) ? 0 : getNames().hashCode());
        hashCode = prime * hashCode
                + ((getIncludeGraph() == null) ? 0 : getIncludeGraph().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetWorkflowsRequest == false)
            return false;
        BatchGetWorkflowsRequest other = (BatchGetWorkflowsRequest) obj;

        if (other.getNames() == null ^ this.getNames() == null)
            return false;
        if (other.getNames() != null && other.getNames().equals(this.getNames()) == false)
            return false;
        if (other.getIncludeGraph() == null ^ this.getIncludeGraph() == null)
            return false;
        if (other.getIncludeGraph() != null
                && other.getIncludeGraph().equals(this.getIncludeGraph()) == false)
            return false;
        return true;
    }
}
