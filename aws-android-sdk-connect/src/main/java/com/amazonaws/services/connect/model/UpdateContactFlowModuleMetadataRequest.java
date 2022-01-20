/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates metadata about specified contact flow module.
 * </p>
 */
public class UpdateContactFlowModuleMetadataRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The identifier of the contact flow module.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String contactFlowModuleId;

    /**
     * <p>
     * The name of the contact flow module.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String name;

    /**
     * <p>
     * The description of the contact flow module.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String description;

    /**
     * <p>
     * The state of contact flow module.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     */
    private String state;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can find the
     *         instanceId in the ARN of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactFlowModuleMetadataRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The identifier of the contact flow module.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The identifier of the contact flow module.
     *         </p>
     */
    public String getContactFlowModuleId() {
        return contactFlowModuleId;
    }

    /**
     * <p>
     * The identifier of the contact flow module.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param contactFlowModuleId <p>
     *            The identifier of the contact flow module.
     *            </p>
     */
    public void setContactFlowModuleId(String contactFlowModuleId) {
        this.contactFlowModuleId = contactFlowModuleId;
    }

    /**
     * <p>
     * The identifier of the contact flow module.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param contactFlowModuleId <p>
     *            The identifier of the contact flow module.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactFlowModuleMetadataRequest withContactFlowModuleId(String contactFlowModuleId) {
        this.contactFlowModuleId = contactFlowModuleId;
        return this;
    }

    /**
     * <p>
     * The name of the contact flow module.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The name of the contact flow module.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the contact flow module.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            The name of the contact flow module.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the contact flow module.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            The name of the contact flow module.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactFlowModuleMetadataRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the contact flow module.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The description of the contact flow module.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the contact flow module.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param description <p>
     *            The description of the contact flow module.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the contact flow module.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param description <p>
     *            The description of the contact flow module.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactFlowModuleMetadataRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The state of contact flow module.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @return <p>
     *         The state of contact flow module.
     *         </p>
     * @see ContactFlowModuleState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of contact flow module.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @param state <p>
     *            The state of contact flow module.
     *            </p>
     * @see ContactFlowModuleState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of contact flow module.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @param state <p>
     *            The state of contact flow module.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactFlowModuleState
     */
    public UpdateContactFlowModuleMetadataRequest withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of contact flow module.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @param state <p>
     *            The state of contact flow module.
     *            </p>
     * @see ContactFlowModuleState
     */
    public void setState(ContactFlowModuleState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of contact flow module.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @param state <p>
     *            The state of contact flow module.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactFlowModuleState
     */
    public UpdateContactFlowModuleMetadataRequest withState(ContactFlowModuleState state) {
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getContactFlowModuleId() != null)
            sb.append("ContactFlowModuleId: " + getContactFlowModuleId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getState() != null)
            sb.append("State: " + getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getContactFlowModuleId() == null) ? 0 : getContactFlowModuleId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateContactFlowModuleMetadataRequest == false)
            return false;
        UpdateContactFlowModuleMetadataRequest other = (UpdateContactFlowModuleMetadataRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getContactFlowModuleId() == null ^ this.getContactFlowModuleId() == null)
            return false;
        if (other.getContactFlowModuleId() != null
                && other.getContactFlowModuleId().equals(this.getContactFlowModuleId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }
}
