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

/**
 * <p>
 * Contains summary information about a contact flow.
 * </p>
 * <p>
 * You can also create and update contact flows using the <a href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html"
 * >Amazon Connect Flow language</a>.
 * </p>
 */
public class ContactFlowSummary implements Serializable {
    /**
     * <p>
     * The identifier of the contact flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String id;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact flow.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The name of the contact flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String name;

    /**
     * <p>
     * The type of contact flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTACT_FLOW, CUSTOMER_QUEUE, CUSTOMER_HOLD,
     * CUSTOMER_WHISPER, AGENT_HOLD, AGENT_WHISPER, OUTBOUND_WHISPER,
     * AGENT_TRANSFER, QUEUE_TRANSFER
     */
    private String contactFlowType;

    /**
     * <p>
     * The type of contact flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     */
    private String contactFlowState;

    /**
     * <p>
     * The identifier of the contact flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         The identifier of the contact flow.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the contact flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param id <p>
     *            The identifier of the contact flow.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the contact flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param id <p>
     *            The identifier of the contact flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactFlowSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact flow.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the contact flow.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact flow.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the contact flow.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the contact flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactFlowSummary withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The name of the contact flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The name of the contact flow.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the contact flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param name <p>
     *            The name of the contact flow.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the contact flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param name <p>
     *            The name of the contact flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactFlowSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of contact flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTACT_FLOW, CUSTOMER_QUEUE, CUSTOMER_HOLD,
     * CUSTOMER_WHISPER, AGENT_HOLD, AGENT_WHISPER, OUTBOUND_WHISPER,
     * AGENT_TRANSFER, QUEUE_TRANSFER
     *
     * @return <p>
     *         The type of contact flow.
     *         </p>
     * @see ContactFlowType
     */
    public String getContactFlowType() {
        return contactFlowType;
    }

    /**
     * <p>
     * The type of contact flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTACT_FLOW, CUSTOMER_QUEUE, CUSTOMER_HOLD,
     * CUSTOMER_WHISPER, AGENT_HOLD, AGENT_WHISPER, OUTBOUND_WHISPER,
     * AGENT_TRANSFER, QUEUE_TRANSFER
     *
     * @param contactFlowType <p>
     *            The type of contact flow.
     *            </p>
     * @see ContactFlowType
     */
    public void setContactFlowType(String contactFlowType) {
        this.contactFlowType = contactFlowType;
    }

    /**
     * <p>
     * The type of contact flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTACT_FLOW, CUSTOMER_QUEUE, CUSTOMER_HOLD,
     * CUSTOMER_WHISPER, AGENT_HOLD, AGENT_WHISPER, OUTBOUND_WHISPER,
     * AGENT_TRANSFER, QUEUE_TRANSFER
     *
     * @param contactFlowType <p>
     *            The type of contact flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactFlowType
     */
    public ContactFlowSummary withContactFlowType(String contactFlowType) {
        this.contactFlowType = contactFlowType;
        return this;
    }

    /**
     * <p>
     * The type of contact flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTACT_FLOW, CUSTOMER_QUEUE, CUSTOMER_HOLD,
     * CUSTOMER_WHISPER, AGENT_HOLD, AGENT_WHISPER, OUTBOUND_WHISPER,
     * AGENT_TRANSFER, QUEUE_TRANSFER
     *
     * @param contactFlowType <p>
     *            The type of contact flow.
     *            </p>
     * @see ContactFlowType
     */
    public void setContactFlowType(ContactFlowType contactFlowType) {
        this.contactFlowType = contactFlowType.toString();
    }

    /**
     * <p>
     * The type of contact flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTACT_FLOW, CUSTOMER_QUEUE, CUSTOMER_HOLD,
     * CUSTOMER_WHISPER, AGENT_HOLD, AGENT_WHISPER, OUTBOUND_WHISPER,
     * AGENT_TRANSFER, QUEUE_TRANSFER
     *
     * @param contactFlowType <p>
     *            The type of contact flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactFlowType
     */
    public ContactFlowSummary withContactFlowType(ContactFlowType contactFlowType) {
        this.contactFlowType = contactFlowType.toString();
        return this;
    }

    /**
     * <p>
     * The type of contact flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @return <p>
     *         The type of contact flow.
     *         </p>
     * @see ContactFlowState
     */
    public String getContactFlowState() {
        return contactFlowState;
    }

    /**
     * <p>
     * The type of contact flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @param contactFlowState <p>
     *            The type of contact flow.
     *            </p>
     * @see ContactFlowState
     */
    public void setContactFlowState(String contactFlowState) {
        this.contactFlowState = contactFlowState;
    }

    /**
     * <p>
     * The type of contact flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @param contactFlowState <p>
     *            The type of contact flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactFlowState
     */
    public ContactFlowSummary withContactFlowState(String contactFlowState) {
        this.contactFlowState = contactFlowState;
        return this;
    }

    /**
     * <p>
     * The type of contact flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @param contactFlowState <p>
     *            The type of contact flow.
     *            </p>
     * @see ContactFlowState
     */
    public void setContactFlowState(ContactFlowState contactFlowState) {
        this.contactFlowState = contactFlowState.toString();
    }

    /**
     * <p>
     * The type of contact flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @param contactFlowState <p>
     *            The type of contact flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactFlowState
     */
    public ContactFlowSummary withContactFlowState(ContactFlowState contactFlowState) {
        this.contactFlowState = contactFlowState.toString();
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getContactFlowType() != null)
            sb.append("ContactFlowType: " + getContactFlowType() + ",");
        if (getContactFlowState() != null)
            sb.append("ContactFlowState: " + getContactFlowState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getContactFlowType() == null) ? 0 : getContactFlowType().hashCode());
        hashCode = prime * hashCode
                + ((getContactFlowState() == null) ? 0 : getContactFlowState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContactFlowSummary == false)
            return false;
        ContactFlowSummary other = (ContactFlowSummary) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getContactFlowType() == null ^ this.getContactFlowType() == null)
            return false;
        if (other.getContactFlowType() != null
                && other.getContactFlowType().equals(this.getContactFlowType()) == false)
            return false;
        if (other.getContactFlowState() == null ^ this.getContactFlowState() == null)
            return false;
        if (other.getContactFlowState() != null
                && other.getContactFlowState().equals(this.getContactFlowState()) == false)
            return false;
        return true;
    }
}
