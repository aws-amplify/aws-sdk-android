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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the workgroup with the specified name. The workgroup's name cannot be
 * changed.
 * </p>
 */
public class UpdateWorkGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The specified workgroup that will be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]{1,128}<br/>
     */
    private String workGroup;

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
     * The workgroup configuration that will be updated for the given workgroup.
     * </p>
     */
    private WorkGroupConfigurationUpdates configurationUpdates;

    /**
     * <p>
     * The workgroup state that will be updated for the given workgroup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String state;

    /**
     * <p>
     * The specified workgroup that will be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]{1,128}<br/>
     *
     * @return <p>
     *         The specified workgroup that will be updated.
     *         </p>
     */
    public String getWorkGroup() {
        return workGroup;
    }

    /**
     * <p>
     * The specified workgroup that will be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]{1,128}<br/>
     *
     * @param workGroup <p>
     *            The specified workgroup that will be updated.
     *            </p>
     */
    public void setWorkGroup(String workGroup) {
        this.workGroup = workGroup;
    }

    /**
     * <p>
     * The specified workgroup that will be updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]{1,128}<br/>
     *
     * @param workGroup <p>
     *            The specified workgroup that will be updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateWorkGroupRequest withWorkGroup(String workGroup) {
        this.workGroup = workGroup;
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
    public UpdateWorkGroupRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The workgroup configuration that will be updated for the given workgroup.
     * </p>
     *
     * @return <p>
     *         The workgroup configuration that will be updated for the given
     *         workgroup.
     *         </p>
     */
    public WorkGroupConfigurationUpdates getConfigurationUpdates() {
        return configurationUpdates;
    }

    /**
     * <p>
     * The workgroup configuration that will be updated for the given workgroup.
     * </p>
     *
     * @param configurationUpdates <p>
     *            The workgroup configuration that will be updated for the given
     *            workgroup.
     *            </p>
     */
    public void setConfigurationUpdates(WorkGroupConfigurationUpdates configurationUpdates) {
        this.configurationUpdates = configurationUpdates;
    }

    /**
     * <p>
     * The workgroup configuration that will be updated for the given workgroup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationUpdates <p>
     *            The workgroup configuration that will be updated for the given
     *            workgroup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateWorkGroupRequest withConfigurationUpdates(
            WorkGroupConfigurationUpdates configurationUpdates) {
        this.configurationUpdates = configurationUpdates;
        return this;
    }

    /**
     * <p>
     * The workgroup state that will be updated for the given workgroup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return <p>
     *         The workgroup state that will be updated for the given workgroup.
     *         </p>
     * @see WorkGroupState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The workgroup state that will be updated for the given workgroup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param state <p>
     *            The workgroup state that will be updated for the given
     *            workgroup.
     *            </p>
     * @see WorkGroupState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The workgroup state that will be updated for the given workgroup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param state <p>
     *            The workgroup state that will be updated for the given
     *            workgroup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WorkGroupState
     */
    public UpdateWorkGroupRequest withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The workgroup state that will be updated for the given workgroup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param state <p>
     *            The workgroup state that will be updated for the given
     *            workgroup.
     *            </p>
     * @see WorkGroupState
     */
    public void setState(WorkGroupState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The workgroup state that will be updated for the given workgroup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param state <p>
     *            The workgroup state that will be updated for the given
     *            workgroup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WorkGroupState
     */
    public UpdateWorkGroupRequest withState(WorkGroupState state) {
        this.state = state.toString();
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
        if (getWorkGroup() != null)
            sb.append("WorkGroup: " + getWorkGroup() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getConfigurationUpdates() != null)
            sb.append("ConfigurationUpdates: " + getConfigurationUpdates() + ",");
        if (getState() != null)
            sb.append("State: " + getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkGroup() == null) ? 0 : getWorkGroup().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getConfigurationUpdates() == null) ? 0 : getConfigurationUpdates().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWorkGroupRequest == false)
            return false;
        UpdateWorkGroupRequest other = (UpdateWorkGroupRequest) obj;

        if (other.getWorkGroup() == null ^ this.getWorkGroup() == null)
            return false;
        if (other.getWorkGroup() != null
                && other.getWorkGroup().equals(this.getWorkGroup()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getConfigurationUpdates() == null ^ this.getConfigurationUpdates() == null)
            return false;
        if (other.getConfigurationUpdates() != null
                && other.getConfigurationUpdates().equals(this.getConfigurationUpdates()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }
}
