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
 * Puts the specified workflow run properties for the given workflow run. If a
 * property already exists for the specified run, then it overrides the value
 * otherwise adds the property to existing properties.
 * </p>
 */
public class PutWorkflowRunPropertiesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Name of the workflow which was run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String name;

    /**
     * <p>
     * The ID of the workflow run for which the run properties should be
     * updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String runId;

    /**
     * <p>
     * The properties to put for the specified run.
     * </p>
     */
    private java.util.Map<String, String> runProperties;

    /**
     * <p>
     * Name of the workflow which was run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         Name of the workflow which was run.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Name of the workflow which was run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            Name of the workflow which was run.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the workflow which was run.
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
     *            Name of the workflow which was run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutWorkflowRunPropertiesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The ID of the workflow run for which the run properties should be
     * updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The ID of the workflow run for which the run properties should be
     *         updated.
     *         </p>
     */
    public String getRunId() {
        return runId;
    }

    /**
     * <p>
     * The ID of the workflow run for which the run properties should be
     * updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param runId <p>
     *            The ID of the workflow run for which the run properties should
     *            be updated.
     *            </p>
     */
    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * <p>
     * The ID of the workflow run for which the run properties should be
     * updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param runId <p>
     *            The ID of the workflow run for which the run properties should
     *            be updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutWorkflowRunPropertiesRequest withRunId(String runId) {
        this.runId = runId;
        return this;
    }

    /**
     * <p>
     * The properties to put for the specified run.
     * </p>
     *
     * @return <p>
     *         The properties to put for the specified run.
     *         </p>
     */
    public java.util.Map<String, String> getRunProperties() {
        return runProperties;
    }

    /**
     * <p>
     * The properties to put for the specified run.
     * </p>
     *
     * @param runProperties <p>
     *            The properties to put for the specified run.
     *            </p>
     */
    public void setRunProperties(java.util.Map<String, String> runProperties) {
        this.runProperties = runProperties;
    }

    /**
     * <p>
     * The properties to put for the specified run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param runProperties <p>
     *            The properties to put for the specified run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutWorkflowRunPropertiesRequest withRunProperties(
            java.util.Map<String, String> runProperties) {
        this.runProperties = runProperties;
        return this;
    }

    /**
     * <p>
     * The properties to put for the specified run.
     * </p>
     * <p>
     * The method adds a new key-value pair into RunProperties parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into RunProperties.
     * @param value The corresponding value of the entry to be added into
     *            RunProperties.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutWorkflowRunPropertiesRequest addRunPropertiesEntry(String key, String value) {
        if (null == this.runProperties) {
            this.runProperties = new java.util.HashMap<String, String>();
        }
        if (this.runProperties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.runProperties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RunProperties.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public PutWorkflowRunPropertiesRequest clearRunPropertiesEntries() {
        this.runProperties = null;
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
        if (getRunId() != null)
            sb.append("RunId: " + getRunId() + ",");
        if (getRunProperties() != null)
            sb.append("RunProperties: " + getRunProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRunId() == null) ? 0 : getRunId().hashCode());
        hashCode = prime * hashCode
                + ((getRunProperties() == null) ? 0 : getRunProperties().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutWorkflowRunPropertiesRequest == false)
            return false;
        PutWorkflowRunPropertiesRequest other = (PutWorkflowRunPropertiesRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRunId() == null ^ this.getRunId() == null)
            return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false)
            return false;
        if (other.getRunProperties() == null ^ this.getRunProperties() == null)
            return false;
        if (other.getRunProperties() != null
                && other.getRunProperties().equals(this.getRunProperties()) == false)
            return false;
        return true;
    }
}
