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

package com.amazonaws.services.athena.model;

import java.io.Serializable;

/**
 * <p>
 * The summary information for the workgroup, which includes its name, state,
 * description, and the date and time it was created.
 * </p>
 */
public class WorkGroupSummary implements Serializable {
    /**
     * <p>
     * The name of the workgroup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]{1,128}<br/>
     */
    private String name;

    /**
     * <p>
     * The state of the workgroup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String state;

    /**
     * <p>
     * The workgroup description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The workgroup creation date and time.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The name of the workgroup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]{1,128}<br/>
     *
     * @return <p>
     *         The name of the workgroup.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the workgroup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]{1,128}<br/>
     *
     * @param name <p>
     *            The name of the workgroup.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the workgroup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]{1,128}<br/>
     *
     * @param name <p>
     *            The name of the workgroup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkGroupSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The state of the workgroup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return <p>
     *         The state of the workgroup.
     *         </p>
     * @see WorkGroupState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the workgroup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param state <p>
     *            The state of the workgroup.
     *            </p>
     * @see WorkGroupState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the workgroup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param state <p>
     *            The state of the workgroup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WorkGroupState
     */
    public WorkGroupSummary withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the workgroup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param state <p>
     *            The state of the workgroup.
     *            </p>
     * @see WorkGroupState
     */
    public void setState(WorkGroupState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the workgroup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param state <p>
     *            The state of the workgroup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WorkGroupState
     */
    public WorkGroupSummary withState(WorkGroupState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The workgroup description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         The workgroup description.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The workgroup description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description <p>
     *            The workgroup description.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The workgroup description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description <p>
     *            The workgroup description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkGroupSummary withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The workgroup creation date and time.
     * </p>
     *
     * @return <p>
     *         The workgroup creation date and time.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The workgroup creation date and time.
     * </p>
     *
     * @param creationTime <p>
     *            The workgroup creation date and time.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The workgroup creation date and time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The workgroup creation date and time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WorkGroupSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
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
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkGroupSummary == false)
            return false;
        WorkGroupSummary other = (WorkGroupSummary) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }
}
