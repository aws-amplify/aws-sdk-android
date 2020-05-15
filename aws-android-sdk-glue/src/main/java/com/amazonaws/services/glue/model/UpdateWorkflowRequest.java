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
 * Updates an existing workflow.
 * </p>
 */
public class UpdateWorkflowRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Name of the workflow to be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String name;

    /**
     * <p>
     * The description of the workflow.
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
     * Name of the workflow to be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         Name of the workflow to be updated.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Name of the workflow to be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            Name of the workflow to be updated.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the workflow to be updated.
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
     *            Name of the workflow to be updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateWorkflowRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the workflow.
     * </p>
     *
     * @return <p>
     *         The description of the workflow.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the workflow.
     * </p>
     *
     * @param description <p>
     *            The description of the workflow.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the workflow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the workflow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateWorkflowRequest withDescription(String description) {
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
    public UpdateWorkflowRequest withDefaultRunProperties(
            java.util.Map<String, String> defaultRunProperties) {
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
    public UpdateWorkflowRequest addDefaultRunPropertiesEntry(String key, String value) {
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
    public UpdateWorkflowRequest clearDefaultRunPropertiesEntries() {
        this.defaultRunProperties = null;
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
            sb.append("DefaultRunProperties: " + getDefaultRunProperties());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWorkflowRequest == false)
            return false;
        UpdateWorkflowRequest other = (UpdateWorkflowRequest) obj;

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
        return true;
    }
}
