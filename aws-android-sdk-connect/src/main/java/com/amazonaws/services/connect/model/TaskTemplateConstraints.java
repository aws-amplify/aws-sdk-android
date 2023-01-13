/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Describes constraints that apply to the template fields.
 * </p>
 */
public class TaskTemplateConstraints implements Serializable {
    /**
     * <p>
     * Lists the fields that are required to be filled by agents.
     * </p>
     */
    private java.util.List<RequiredFieldInfo> requiredFields;

    /**
     * <p>
     * Lists the fields that are read-only to agents, and cannot be edited.
     * </p>
     */
    private java.util.List<ReadOnlyFieldInfo> readOnlyFields;

    /**
     * <p>
     * Lists the fields that are invisible to agents.
     * </p>
     */
    private java.util.List<InvisibleFieldInfo> invisibleFields;

    /**
     * <p>
     * Lists the fields that are required to be filled by agents.
     * </p>
     *
     * @return <p>
     *         Lists the fields that are required to be filled by agents.
     *         </p>
     */
    public java.util.List<RequiredFieldInfo> getRequiredFields() {
        return requiredFields;
    }

    /**
     * <p>
     * Lists the fields that are required to be filled by agents.
     * </p>
     *
     * @param requiredFields <p>
     *            Lists the fields that are required to be filled by agents.
     *            </p>
     */
    public void setRequiredFields(java.util.Collection<RequiredFieldInfo> requiredFields) {
        if (requiredFields == null) {
            this.requiredFields = null;
            return;
        }

        this.requiredFields = new java.util.ArrayList<RequiredFieldInfo>(requiredFields);
    }

    /**
     * <p>
     * Lists the fields that are required to be filled by agents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requiredFields <p>
     *            Lists the fields that are required to be filled by agents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskTemplateConstraints withRequiredFields(RequiredFieldInfo... requiredFields) {
        if (getRequiredFields() == null) {
            this.requiredFields = new java.util.ArrayList<RequiredFieldInfo>(requiredFields.length);
        }
        for (RequiredFieldInfo value : requiredFields) {
            this.requiredFields.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Lists the fields that are required to be filled by agents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requiredFields <p>
     *            Lists the fields that are required to be filled by agents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskTemplateConstraints withRequiredFields(
            java.util.Collection<RequiredFieldInfo> requiredFields) {
        setRequiredFields(requiredFields);
        return this;
    }

    /**
     * <p>
     * Lists the fields that are read-only to agents, and cannot be edited.
     * </p>
     *
     * @return <p>
     *         Lists the fields that are read-only to agents, and cannot be
     *         edited.
     *         </p>
     */
    public java.util.List<ReadOnlyFieldInfo> getReadOnlyFields() {
        return readOnlyFields;
    }

    /**
     * <p>
     * Lists the fields that are read-only to agents, and cannot be edited.
     * </p>
     *
     * @param readOnlyFields <p>
     *            Lists the fields that are read-only to agents, and cannot be
     *            edited.
     *            </p>
     */
    public void setReadOnlyFields(java.util.Collection<ReadOnlyFieldInfo> readOnlyFields) {
        if (readOnlyFields == null) {
            this.readOnlyFields = null;
            return;
        }

        this.readOnlyFields = new java.util.ArrayList<ReadOnlyFieldInfo>(readOnlyFields);
    }

    /**
     * <p>
     * Lists the fields that are read-only to agents, and cannot be edited.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param readOnlyFields <p>
     *            Lists the fields that are read-only to agents, and cannot be
     *            edited.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskTemplateConstraints withReadOnlyFields(ReadOnlyFieldInfo... readOnlyFields) {
        if (getReadOnlyFields() == null) {
            this.readOnlyFields = new java.util.ArrayList<ReadOnlyFieldInfo>(readOnlyFields.length);
        }
        for (ReadOnlyFieldInfo value : readOnlyFields) {
            this.readOnlyFields.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Lists the fields that are read-only to agents, and cannot be edited.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param readOnlyFields <p>
     *            Lists the fields that are read-only to agents, and cannot be
     *            edited.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskTemplateConstraints withReadOnlyFields(
            java.util.Collection<ReadOnlyFieldInfo> readOnlyFields) {
        setReadOnlyFields(readOnlyFields);
        return this;
    }

    /**
     * <p>
     * Lists the fields that are invisible to agents.
     * </p>
     *
     * @return <p>
     *         Lists the fields that are invisible to agents.
     *         </p>
     */
    public java.util.List<InvisibleFieldInfo> getInvisibleFields() {
        return invisibleFields;
    }

    /**
     * <p>
     * Lists the fields that are invisible to agents.
     * </p>
     *
     * @param invisibleFields <p>
     *            Lists the fields that are invisible to agents.
     *            </p>
     */
    public void setInvisibleFields(java.util.Collection<InvisibleFieldInfo> invisibleFields) {
        if (invisibleFields == null) {
            this.invisibleFields = null;
            return;
        }

        this.invisibleFields = new java.util.ArrayList<InvisibleFieldInfo>(invisibleFields);
    }

    /**
     * <p>
     * Lists the fields that are invisible to agents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invisibleFields <p>
     *            Lists the fields that are invisible to agents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskTemplateConstraints withInvisibleFields(InvisibleFieldInfo... invisibleFields) {
        if (getInvisibleFields() == null) {
            this.invisibleFields = new java.util.ArrayList<InvisibleFieldInfo>(
                    invisibleFields.length);
        }
        for (InvisibleFieldInfo value : invisibleFields) {
            this.invisibleFields.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Lists the fields that are invisible to agents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invisibleFields <p>
     *            Lists the fields that are invisible to agents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskTemplateConstraints withInvisibleFields(
            java.util.Collection<InvisibleFieldInfo> invisibleFields) {
        setInvisibleFields(invisibleFields);
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
        if (getRequiredFields() != null)
            sb.append("RequiredFields: " + getRequiredFields() + ",");
        if (getReadOnlyFields() != null)
            sb.append("ReadOnlyFields: " + getReadOnlyFields() + ",");
        if (getInvisibleFields() != null)
            sb.append("InvisibleFields: " + getInvisibleFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRequiredFields() == null) ? 0 : getRequiredFields().hashCode());
        hashCode = prime * hashCode
                + ((getReadOnlyFields() == null) ? 0 : getReadOnlyFields().hashCode());
        hashCode = prime * hashCode
                + ((getInvisibleFields() == null) ? 0 : getInvisibleFields().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskTemplateConstraints == false)
            return false;
        TaskTemplateConstraints other = (TaskTemplateConstraints) obj;

        if (other.getRequiredFields() == null ^ this.getRequiredFields() == null)
            return false;
        if (other.getRequiredFields() != null
                && other.getRequiredFields().equals(this.getRequiredFields()) == false)
            return false;
        if (other.getReadOnlyFields() == null ^ this.getReadOnlyFields() == null)
            return false;
        if (other.getReadOnlyFields() != null
                && other.getReadOnlyFields().equals(this.getReadOnlyFields()) == false)
            return false;
        if (other.getInvisibleFields() == null ^ this.getInvisibleFields() == null)
            return false;
        if (other.getInvisibleFields() != null
                && other.getInvisibleFields().equals(this.getInvisibleFields()) == false)
            return false;
        return true;
    }
}
