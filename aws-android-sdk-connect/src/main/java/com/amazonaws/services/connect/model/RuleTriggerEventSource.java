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
 * The name of the event source. This field is required if
 * <code>TriggerEventSource</code> is one of the following values:
 * <code>OnZendeskTicketCreate</code> | <code>OnZendeskTicketStatusUpdate</code>
 * | <code>OnSalesforceCaseCreate</code>
 * </p>
 */
public class RuleTriggerEventSource implements Serializable {
    /**
     * <p>
     * The name of the event source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OnPostCallAnalysisAvailable,
     * OnRealTimeCallAnalysisAvailable, OnPostChatAnalysisAvailable,
     * OnZendeskTicketCreate, OnZendeskTicketStatusUpdate,
     * OnSalesforceCaseCreate, OnContactEvaluationSubmit
     */
    private String eventSourceName;

    /**
     * <p>
     * The identifier for the integration association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     */
    private String integrationAssociationId;

    /**
     * <p>
     * The name of the event source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OnPostCallAnalysisAvailable,
     * OnRealTimeCallAnalysisAvailable, OnPostChatAnalysisAvailable,
     * OnZendeskTicketCreate, OnZendeskTicketStatusUpdate,
     * OnSalesforceCaseCreate, OnContactEvaluationSubmit
     *
     * @return <p>
     *         The name of the event source.
     *         </p>
     * @see EventSourceName
     */
    public String getEventSourceName() {
        return eventSourceName;
    }

    /**
     * <p>
     * The name of the event source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OnPostCallAnalysisAvailable,
     * OnRealTimeCallAnalysisAvailable, OnPostChatAnalysisAvailable,
     * OnZendeskTicketCreate, OnZendeskTicketStatusUpdate,
     * OnSalesforceCaseCreate, OnContactEvaluationSubmit
     *
     * @param eventSourceName <p>
     *            The name of the event source.
     *            </p>
     * @see EventSourceName
     */
    public void setEventSourceName(String eventSourceName) {
        this.eventSourceName = eventSourceName;
    }

    /**
     * <p>
     * The name of the event source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OnPostCallAnalysisAvailable,
     * OnRealTimeCallAnalysisAvailable, OnPostChatAnalysisAvailable,
     * OnZendeskTicketCreate, OnZendeskTicketStatusUpdate,
     * OnSalesforceCaseCreate, OnContactEvaluationSubmit
     *
     * @param eventSourceName <p>
     *            The name of the event source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EventSourceName
     */
    public RuleTriggerEventSource withEventSourceName(String eventSourceName) {
        this.eventSourceName = eventSourceName;
        return this;
    }

    /**
     * <p>
     * The name of the event source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OnPostCallAnalysisAvailable,
     * OnRealTimeCallAnalysisAvailable, OnPostChatAnalysisAvailable,
     * OnZendeskTicketCreate, OnZendeskTicketStatusUpdate,
     * OnSalesforceCaseCreate, OnContactEvaluationSubmit
     *
     * @param eventSourceName <p>
     *            The name of the event source.
     *            </p>
     * @see EventSourceName
     */
    public void setEventSourceName(EventSourceName eventSourceName) {
        this.eventSourceName = eventSourceName.toString();
    }

    /**
     * <p>
     * The name of the event source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OnPostCallAnalysisAvailable,
     * OnRealTimeCallAnalysisAvailable, OnPostChatAnalysisAvailable,
     * OnZendeskTicketCreate, OnZendeskTicketStatusUpdate,
     * OnSalesforceCaseCreate, OnContactEvaluationSubmit
     *
     * @param eventSourceName <p>
     *            The name of the event source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EventSourceName
     */
    public RuleTriggerEventSource withEventSourceName(EventSourceName eventSourceName) {
        this.eventSourceName = eventSourceName.toString();
        return this;
    }

    /**
     * <p>
     * The identifier for the integration association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @return <p>
     *         The identifier for the integration association.
     *         </p>
     */
    public String getIntegrationAssociationId() {
        return integrationAssociationId;
    }

    /**
     * <p>
     * The identifier for the integration association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @param integrationAssociationId <p>
     *            The identifier for the integration association.
     *            </p>
     */
    public void setIntegrationAssociationId(String integrationAssociationId) {
        this.integrationAssociationId = integrationAssociationId;
    }

    /**
     * <p>
     * The identifier for the integration association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @param integrationAssociationId <p>
     *            The identifier for the integration association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleTriggerEventSource withIntegrationAssociationId(String integrationAssociationId) {
        this.integrationAssociationId = integrationAssociationId;
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
        if (getEventSourceName() != null)
            sb.append("EventSourceName: " + getEventSourceName() + ",");
        if (getIntegrationAssociationId() != null)
            sb.append("IntegrationAssociationId: " + getIntegrationAssociationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEventSourceName() == null) ? 0 : getEventSourceName().hashCode());
        hashCode = prime
                * hashCode
                + ((getIntegrationAssociationId() == null) ? 0 : getIntegrationAssociationId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleTriggerEventSource == false)
            return false;
        RuleTriggerEventSource other = (RuleTriggerEventSource) obj;

        if (other.getEventSourceName() == null ^ this.getEventSourceName() == null)
            return false;
        if (other.getEventSourceName() != null
                && other.getEventSourceName().equals(this.getEventSourceName()) == false)
            return false;
        if (other.getIntegrationAssociationId() == null
                ^ this.getIntegrationAssociationId() == null)
            return false;
        if (other.getIntegrationAssociationId() != null
                && other.getIntegrationAssociationId().equals(this.getIntegrationAssociationId()) == false)
            return false;
        return true;
    }
}
