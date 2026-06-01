/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The search criteria to be used to return contact flows.
 * </p>
 */
public class ContactFlowSearchCriteria implements Serializable {
    /**
     * <p>
     * A list of conditions which would be applied together with an
     * <code>OR</code> condition.
     * </p>
     */
    private java.util.List<ContactFlowSearchCriteria> orConditions;

    /**
     * <p>
     * A list of conditions which would be applied together with an
     * <code>AND</code> condition.
     * </p>
     */
    private java.util.List<ContactFlowSearchCriteria> andConditions;

    /**
     * <p>
     * A leaf node condition which can be used to specify a string condition.
     * </p>
     * <note>
     * <p>
     * The currently supported values for <code>FieldName</code> are
     * <code>name</code> and <code>description</code>.
     * </p>
     * </note>
     */
    private StringCondition stringCondition;

    /**
     * <p>
     * The type of flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTACT_FLOW, CUSTOMER_QUEUE, CUSTOMER_HOLD,
     * CUSTOMER_WHISPER, AGENT_HOLD, AGENT_WHISPER, OUTBOUND_WHISPER,
     * AGENT_TRANSFER, QUEUE_TRANSFER
     */
    private String typeCondition;

    /**
     * <p>
     * The state of the flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     */
    private String stateCondition;

    /**
     * <p>
     * The status of the flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISHED, SAVED
     */
    private String statusCondition;

    /**
     * <p>
     * A list of conditions which would be applied together with an
     * <code>OR</code> condition.
     * </p>
     *
     * @return <p>
     *         A list of conditions which would be applied together with an
     *         <code>OR</code> condition.
     *         </p>
     */
    public java.util.List<ContactFlowSearchCriteria> getOrConditions() {
        return orConditions;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an
     * <code>OR</code> condition.
     * </p>
     *
     * @param orConditions <p>
     *            A list of conditions which would be applied together with an
     *            <code>OR</code> condition.
     *            </p>
     */
    public void setOrConditions(java.util.Collection<ContactFlowSearchCriteria> orConditions) {
        if (orConditions == null) {
            this.orConditions = null;
            return;
        }

        this.orConditions = new java.util.ArrayList<ContactFlowSearchCriteria>(orConditions);
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an
     * <code>OR</code> condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param orConditions <p>
     *            A list of conditions which would be applied together with an
     *            <code>OR</code> condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactFlowSearchCriteria withOrConditions(ContactFlowSearchCriteria... orConditions) {
        if (getOrConditions() == null) {
            this.orConditions = new java.util.ArrayList<ContactFlowSearchCriteria>(
                    orConditions.length);
        }
        for (ContactFlowSearchCriteria value : orConditions) {
            this.orConditions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an
     * <code>OR</code> condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param orConditions <p>
     *            A list of conditions which would be applied together with an
     *            <code>OR</code> condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactFlowSearchCriteria withOrConditions(
            java.util.Collection<ContactFlowSearchCriteria> orConditions) {
        setOrConditions(orConditions);
        return this;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an
     * <code>AND</code> condition.
     * </p>
     *
     * @return <p>
     *         A list of conditions which would be applied together with an
     *         <code>AND</code> condition.
     *         </p>
     */
    public java.util.List<ContactFlowSearchCriteria> getAndConditions() {
        return andConditions;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an
     * <code>AND</code> condition.
     * </p>
     *
     * @param andConditions <p>
     *            A list of conditions which would be applied together with an
     *            <code>AND</code> condition.
     *            </p>
     */
    public void setAndConditions(java.util.Collection<ContactFlowSearchCriteria> andConditions) {
        if (andConditions == null) {
            this.andConditions = null;
            return;
        }

        this.andConditions = new java.util.ArrayList<ContactFlowSearchCriteria>(andConditions);
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an
     * <code>AND</code> condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param andConditions <p>
     *            A list of conditions which would be applied together with an
     *            <code>AND</code> condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactFlowSearchCriteria withAndConditions(ContactFlowSearchCriteria... andConditions) {
        if (getAndConditions() == null) {
            this.andConditions = new java.util.ArrayList<ContactFlowSearchCriteria>(
                    andConditions.length);
        }
        for (ContactFlowSearchCriteria value : andConditions) {
            this.andConditions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an
     * <code>AND</code> condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param andConditions <p>
     *            A list of conditions which would be applied together with an
     *            <code>AND</code> condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactFlowSearchCriteria withAndConditions(
            java.util.Collection<ContactFlowSearchCriteria> andConditions) {
        setAndConditions(andConditions);
        return this;
    }

    /**
     * <p>
     * A leaf node condition which can be used to specify a string condition.
     * </p>
     * <note>
     * <p>
     * The currently supported values for <code>FieldName</code> are
     * <code>name</code> and <code>description</code>.
     * </p>
     * </note>
     *
     * @return <p>
     *         A leaf node condition which can be used to specify a string
     *         condition.
     *         </p>
     *         <note>
     *         <p>
     *         The currently supported values for <code>FieldName</code> are
     *         <code>name</code> and <code>description</code>.
     *         </p>
     *         </note>
     */
    public StringCondition getStringCondition() {
        return stringCondition;
    }

    /**
     * <p>
     * A leaf node condition which can be used to specify a string condition.
     * </p>
     * <note>
     * <p>
     * The currently supported values for <code>FieldName</code> are
     * <code>name</code> and <code>description</code>.
     * </p>
     * </note>
     *
     * @param stringCondition <p>
     *            A leaf node condition which can be used to specify a string
     *            condition.
     *            </p>
     *            <note>
     *            <p>
     *            The currently supported values for <code>FieldName</code> are
     *            <code>name</code> and <code>description</code>.
     *            </p>
     *            </note>
     */
    public void setStringCondition(StringCondition stringCondition) {
        this.stringCondition = stringCondition;
    }

    /**
     * <p>
     * A leaf node condition which can be used to specify a string condition.
     * </p>
     * <note>
     * <p>
     * The currently supported values for <code>FieldName</code> are
     * <code>name</code> and <code>description</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stringCondition <p>
     *            A leaf node condition which can be used to specify a string
     *            condition.
     *            </p>
     *            <note>
     *            <p>
     *            The currently supported values for <code>FieldName</code> are
     *            <code>name</code> and <code>description</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactFlowSearchCriteria withStringCondition(StringCondition stringCondition) {
        this.stringCondition = stringCondition;
        return this;
    }

    /**
     * <p>
     * The type of flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTACT_FLOW, CUSTOMER_QUEUE, CUSTOMER_HOLD,
     * CUSTOMER_WHISPER, AGENT_HOLD, AGENT_WHISPER, OUTBOUND_WHISPER,
     * AGENT_TRANSFER, QUEUE_TRANSFER
     *
     * @return <p>
     *         The type of flow.
     *         </p>
     * @see ContactFlowType
     */
    public String getTypeCondition() {
        return typeCondition;
    }

    /**
     * <p>
     * The type of flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTACT_FLOW, CUSTOMER_QUEUE, CUSTOMER_HOLD,
     * CUSTOMER_WHISPER, AGENT_HOLD, AGENT_WHISPER, OUTBOUND_WHISPER,
     * AGENT_TRANSFER, QUEUE_TRANSFER
     *
     * @param typeCondition <p>
     *            The type of flow.
     *            </p>
     * @see ContactFlowType
     */
    public void setTypeCondition(String typeCondition) {
        this.typeCondition = typeCondition;
    }

    /**
     * <p>
     * The type of flow.
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
     * @param typeCondition <p>
     *            The type of flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactFlowType
     */
    public ContactFlowSearchCriteria withTypeCondition(String typeCondition) {
        this.typeCondition = typeCondition;
        return this;
    }

    /**
     * <p>
     * The type of flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTACT_FLOW, CUSTOMER_QUEUE, CUSTOMER_HOLD,
     * CUSTOMER_WHISPER, AGENT_HOLD, AGENT_WHISPER, OUTBOUND_WHISPER,
     * AGENT_TRANSFER, QUEUE_TRANSFER
     *
     * @param typeCondition <p>
     *            The type of flow.
     *            </p>
     * @see ContactFlowType
     */
    public void setTypeCondition(ContactFlowType typeCondition) {
        this.typeCondition = typeCondition.toString();
    }

    /**
     * <p>
     * The type of flow.
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
     * @param typeCondition <p>
     *            The type of flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactFlowType
     */
    public ContactFlowSearchCriteria withTypeCondition(ContactFlowType typeCondition) {
        this.typeCondition = typeCondition.toString();
        return this;
    }

    /**
     * <p>
     * The state of the flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @return <p>
     *         The state of the flow.
     *         </p>
     * @see ContactFlowState
     */
    public String getStateCondition() {
        return stateCondition;
    }

    /**
     * <p>
     * The state of the flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @param stateCondition <p>
     *            The state of the flow.
     *            </p>
     * @see ContactFlowState
     */
    public void setStateCondition(String stateCondition) {
        this.stateCondition = stateCondition;
    }

    /**
     * <p>
     * The state of the flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @param stateCondition <p>
     *            The state of the flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactFlowState
     */
    public ContactFlowSearchCriteria withStateCondition(String stateCondition) {
        this.stateCondition = stateCondition;
        return this;
    }

    /**
     * <p>
     * The state of the flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @param stateCondition <p>
     *            The state of the flow.
     *            </p>
     * @see ContactFlowState
     */
    public void setStateCondition(ContactFlowState stateCondition) {
        this.stateCondition = stateCondition.toString();
    }

    /**
     * <p>
     * The state of the flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @param stateCondition <p>
     *            The state of the flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactFlowState
     */
    public ContactFlowSearchCriteria withStateCondition(ContactFlowState stateCondition) {
        this.stateCondition = stateCondition.toString();
        return this;
    }

    /**
     * <p>
     * The status of the flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISHED, SAVED
     *
     * @return <p>
     *         The status of the flow.
     *         </p>
     * @see ContactFlowStatus
     */
    public String getStatusCondition() {
        return statusCondition;
    }

    /**
     * <p>
     * The status of the flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISHED, SAVED
     *
     * @param statusCondition <p>
     *            The status of the flow.
     *            </p>
     * @see ContactFlowStatus
     */
    public void setStatusCondition(String statusCondition) {
        this.statusCondition = statusCondition;
    }

    /**
     * <p>
     * The status of the flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISHED, SAVED
     *
     * @param statusCondition <p>
     *            The status of the flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactFlowStatus
     */
    public ContactFlowSearchCriteria withStatusCondition(String statusCondition) {
        this.statusCondition = statusCondition;
        return this;
    }

    /**
     * <p>
     * The status of the flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISHED, SAVED
     *
     * @param statusCondition <p>
     *            The status of the flow.
     *            </p>
     * @see ContactFlowStatus
     */
    public void setStatusCondition(ContactFlowStatus statusCondition) {
        this.statusCondition = statusCondition.toString();
    }

    /**
     * <p>
     * The status of the flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISHED, SAVED
     *
     * @param statusCondition <p>
     *            The status of the flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactFlowStatus
     */
    public ContactFlowSearchCriteria withStatusCondition(ContactFlowStatus statusCondition) {
        this.statusCondition = statusCondition.toString();
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
        if (getOrConditions() != null)
            sb.append("OrConditions: " + getOrConditions() + ",");
        if (getAndConditions() != null)
            sb.append("AndConditions: " + getAndConditions() + ",");
        if (getStringCondition() != null)
            sb.append("StringCondition: " + getStringCondition() + ",");
        if (getTypeCondition() != null)
            sb.append("TypeCondition: " + getTypeCondition() + ",");
        if (getStateCondition() != null)
            sb.append("StateCondition: " + getStateCondition() + ",");
        if (getStatusCondition() != null)
            sb.append("StatusCondition: " + getStatusCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOrConditions() == null) ? 0 : getOrConditions().hashCode());
        hashCode = prime * hashCode
                + ((getAndConditions() == null) ? 0 : getAndConditions().hashCode());
        hashCode = prime * hashCode
                + ((getStringCondition() == null) ? 0 : getStringCondition().hashCode());
        hashCode = prime * hashCode
                + ((getTypeCondition() == null) ? 0 : getTypeCondition().hashCode());
        hashCode = prime * hashCode
                + ((getStateCondition() == null) ? 0 : getStateCondition().hashCode());
        hashCode = prime * hashCode
                + ((getStatusCondition() == null) ? 0 : getStatusCondition().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContactFlowSearchCriteria == false)
            return false;
        ContactFlowSearchCriteria other = (ContactFlowSearchCriteria) obj;

        if (other.getOrConditions() == null ^ this.getOrConditions() == null)
            return false;
        if (other.getOrConditions() != null
                && other.getOrConditions().equals(this.getOrConditions()) == false)
            return false;
        if (other.getAndConditions() == null ^ this.getAndConditions() == null)
            return false;
        if (other.getAndConditions() != null
                && other.getAndConditions().equals(this.getAndConditions()) == false)
            return false;
        if (other.getStringCondition() == null ^ this.getStringCondition() == null)
            return false;
        if (other.getStringCondition() != null
                && other.getStringCondition().equals(this.getStringCondition()) == false)
            return false;
        if (other.getTypeCondition() == null ^ this.getTypeCondition() == null)
            return false;
        if (other.getTypeCondition() != null
                && other.getTypeCondition().equals(this.getTypeCondition()) == false)
            return false;
        if (other.getStateCondition() == null ^ this.getStateCondition() == null)
            return false;
        if (other.getStateCondition() != null
                && other.getStateCondition().equals(this.getStateCondition()) == false)
            return false;
        if (other.getStatusCondition() == null ^ this.getStatusCondition() == null)
            return false;
        if (other.getStatusCondition() != null
                && other.getStatusCondition().equals(this.getStatusCondition()) == false)
            return false;
        return true;
    }
}
