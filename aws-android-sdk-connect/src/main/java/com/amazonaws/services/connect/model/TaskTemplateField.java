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
 * Describes a single task template field.
 * </p>
 */
public class TaskTemplateField implements Serializable {
    /**
     * <p>
     * The unique identifier for the field.
     * </p>
     */
    private TaskTemplateFieldIdentifier id;

    /**
     * <p>
     * The description of the field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String description;

    /**
     * <p>
     * Indicates the type of field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, DESCRIPTION, SCHEDULED_TIME, QUICK_CONNECT,
     * URL, NUMBER, TEXT, TEXT_AREA, DATE_TIME, BOOLEAN, SINGLE_SELECT, EMAIL
     */
    private String type;

    /**
     * <p>
     * A list of options for a single select field.
     * </p>
     */
    private java.util.List<String> singleSelectOptions;

    /**
     * <p>
     * The unique identifier for the field.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the field.
     *         </p>
     */
    public TaskTemplateFieldIdentifier getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier for the field.
     * </p>
     *
     * @param id <p>
     *            The unique identifier for the field.
     *            </p>
     */
    public void setId(TaskTemplateFieldIdentifier id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The unique identifier for the field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskTemplateField withId(TaskTemplateFieldIdentifier id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The description of the field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The description of the field.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param description <p>
     *            The description of the field.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param description <p>
     *            The description of the field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskTemplateField withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Indicates the type of field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, DESCRIPTION, SCHEDULED_TIME, QUICK_CONNECT,
     * URL, NUMBER, TEXT, TEXT_AREA, DATE_TIME, BOOLEAN, SINGLE_SELECT, EMAIL
     *
     * @return <p>
     *         Indicates the type of field.
     *         </p>
     * @see TaskTemplateFieldType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Indicates the type of field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, DESCRIPTION, SCHEDULED_TIME, QUICK_CONNECT,
     * URL, NUMBER, TEXT, TEXT_AREA, DATE_TIME, BOOLEAN, SINGLE_SELECT, EMAIL
     *
     * @param type <p>
     *            Indicates the type of field.
     *            </p>
     * @see TaskTemplateFieldType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Indicates the type of field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, DESCRIPTION, SCHEDULED_TIME, QUICK_CONNECT,
     * URL, NUMBER, TEXT, TEXT_AREA, DATE_TIME, BOOLEAN, SINGLE_SELECT, EMAIL
     *
     * @param type <p>
     *            Indicates the type of field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TaskTemplateFieldType
     */
    public TaskTemplateField withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Indicates the type of field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, DESCRIPTION, SCHEDULED_TIME, QUICK_CONNECT,
     * URL, NUMBER, TEXT, TEXT_AREA, DATE_TIME, BOOLEAN, SINGLE_SELECT, EMAIL
     *
     * @param type <p>
     *            Indicates the type of field.
     *            </p>
     * @see TaskTemplateFieldType
     */
    public void setType(TaskTemplateFieldType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Indicates the type of field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, DESCRIPTION, SCHEDULED_TIME, QUICK_CONNECT,
     * URL, NUMBER, TEXT, TEXT_AREA, DATE_TIME, BOOLEAN, SINGLE_SELECT, EMAIL
     *
     * @param type <p>
     *            Indicates the type of field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TaskTemplateFieldType
     */
    public TaskTemplateField withType(TaskTemplateFieldType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A list of options for a single select field.
     * </p>
     *
     * @return <p>
     *         A list of options for a single select field.
     *         </p>
     */
    public java.util.List<String> getSingleSelectOptions() {
        return singleSelectOptions;
    }

    /**
     * <p>
     * A list of options for a single select field.
     * </p>
     *
     * @param singleSelectOptions <p>
     *            A list of options for a single select field.
     *            </p>
     */
    public void setSingleSelectOptions(java.util.Collection<String> singleSelectOptions) {
        if (singleSelectOptions == null) {
            this.singleSelectOptions = null;
            return;
        }

        this.singleSelectOptions = new java.util.ArrayList<String>(singleSelectOptions);
    }

    /**
     * <p>
     * A list of options for a single select field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param singleSelectOptions <p>
     *            A list of options for a single select field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskTemplateField withSingleSelectOptions(String... singleSelectOptions) {
        if (getSingleSelectOptions() == null) {
            this.singleSelectOptions = new java.util.ArrayList<String>(singleSelectOptions.length);
        }
        for (String value : singleSelectOptions) {
            this.singleSelectOptions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of options for a single select field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param singleSelectOptions <p>
     *            A list of options for a single select field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskTemplateField withSingleSelectOptions(
            java.util.Collection<String> singleSelectOptions) {
        setSingleSelectOptions(singleSelectOptions);
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getSingleSelectOptions() != null)
            sb.append("SingleSelectOptions: " + getSingleSelectOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getSingleSelectOptions() == null) ? 0 : getSingleSelectOptions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskTemplateField == false)
            return false;
        TaskTemplateField other = (TaskTemplateField) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getSingleSelectOptions() == null ^ this.getSingleSelectOptions() == null)
            return false;
        if (other.getSingleSelectOptions() != null
                && other.getSingleSelectOptions().equals(this.getSingleSelectOptions()) == false)
            return false;
        return true;
    }
}
