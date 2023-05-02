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
 * A list of <code>ActionTypes</code> associated with a rule.
 * </p>
 */
public class RuleSummary implements Serializable {
    /**
     * <p>
     * The name of the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String name;

    /**
     * <p>
     * A unique identifier for the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String ruleId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     */
    private String ruleArn;

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
     * The publish status of the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, PUBLISHED
     */
    private String publishStatus;

    /**
     * <p>
     * A list of ActionTypes associated with a rule.
     * </p>
     */
    private java.util.List<ActionSummary> actionSummaries;

    /**
     * <p>
     * The timestamp for when the rule was created.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * The timestamp for when the rule was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * The name of the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the rule.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param name <p>
     *            The name of the rule.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param name <p>
     *            The name of the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A unique identifier for the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         A unique identifier for the rule.
     *         </p>
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * <p>
     * A unique identifier for the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param ruleId <p>
     *            A unique identifier for the rule.
     *            </p>
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * A unique identifier for the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param ruleId <p>
     *            A unique identifier for the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleSummary withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the rule.
     *         </p>
     */
    public String getRuleArn() {
        return ruleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     *
     * @param ruleArn <p>
     *            The Amazon Resource Name (ARN) of the rule.
     *            </p>
     */
    public void setRuleArn(String ruleArn) {
        this.ruleArn = ruleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ruleArn <p>
     *            The Amazon Resource Name (ARN) of the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleSummary withRuleArn(String ruleArn) {
        this.ruleArn = ruleArn;
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
    public RuleSummary withEventSourceName(String eventSourceName) {
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
    public RuleSummary withEventSourceName(EventSourceName eventSourceName) {
        this.eventSourceName = eventSourceName.toString();
        return this;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, PUBLISHED
     *
     * @return <p>
     *         The publish status of the rule.
     *         </p>
     * @see RulePublishStatus
     */
    public String getPublishStatus() {
        return publishStatus;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, PUBLISHED
     *
     * @param publishStatus <p>
     *            The publish status of the rule.
     *            </p>
     * @see RulePublishStatus
     */
    public void setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, PUBLISHED
     *
     * @param publishStatus <p>
     *            The publish status of the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RulePublishStatus
     */
    public RuleSummary withPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
        return this;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, PUBLISHED
     *
     * @param publishStatus <p>
     *            The publish status of the rule.
     *            </p>
     * @see RulePublishStatus
     */
    public void setPublishStatus(RulePublishStatus publishStatus) {
        this.publishStatus = publishStatus.toString();
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, PUBLISHED
     *
     * @param publishStatus <p>
     *            The publish status of the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RulePublishStatus
     */
    public RuleSummary withPublishStatus(RulePublishStatus publishStatus) {
        this.publishStatus = publishStatus.toString();
        return this;
    }

    /**
     * <p>
     * A list of ActionTypes associated with a rule.
     * </p>
     *
     * @return <p>
     *         A list of ActionTypes associated with a rule.
     *         </p>
     */
    public java.util.List<ActionSummary> getActionSummaries() {
        return actionSummaries;
    }

    /**
     * <p>
     * A list of ActionTypes associated with a rule.
     * </p>
     *
     * @param actionSummaries <p>
     *            A list of ActionTypes associated with a rule.
     *            </p>
     */
    public void setActionSummaries(java.util.Collection<ActionSummary> actionSummaries) {
        if (actionSummaries == null) {
            this.actionSummaries = null;
            return;
        }

        this.actionSummaries = new java.util.ArrayList<ActionSummary>(actionSummaries);
    }

    /**
     * <p>
     * A list of ActionTypes associated with a rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionSummaries <p>
     *            A list of ActionTypes associated with a rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleSummary withActionSummaries(ActionSummary... actionSummaries) {
        if (getActionSummaries() == null) {
            this.actionSummaries = new java.util.ArrayList<ActionSummary>(actionSummaries.length);
        }
        for (ActionSummary value : actionSummaries) {
            this.actionSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of ActionTypes associated with a rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionSummaries <p>
     *            A list of ActionTypes associated with a rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleSummary withActionSummaries(java.util.Collection<ActionSummary> actionSummaries) {
        setActionSummaries(actionSummaries);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the rule was created.
     * </p>
     *
     * @return <p>
     *         The timestamp for when the rule was created.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * The timestamp for when the rule was created.
     * </p>
     *
     * @param createdTime <p>
     *            The timestamp for when the rule was created.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The timestamp for when the rule was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            The timestamp for when the rule was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleSummary withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * <p>
     * The timestamp for when the rule was last updated.
     * </p>
     *
     * @return <p>
     *         The timestamp for when the rule was last updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * <p>
     * The timestamp for when the rule was last updated.
     * </p>
     *
     * @param lastUpdatedTime <p>
     *            The timestamp for when the rule was last updated.
     *            </p>
     */
    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The timestamp for when the rule was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTime <p>
     *            The timestamp for when the rule was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleSummary withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
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
        if (getRuleId() != null)
            sb.append("RuleId: " + getRuleId() + ",");
        if (getRuleArn() != null)
            sb.append("RuleArn: " + getRuleArn() + ",");
        if (getEventSourceName() != null)
            sb.append("EventSourceName: " + getEventSourceName() + ",");
        if (getPublishStatus() != null)
            sb.append("PublishStatus: " + getPublishStatus() + ",");
        if (getActionSummaries() != null)
            sb.append("ActionSummaries: " + getActionSummaries() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: " + getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        hashCode = prime * hashCode + ((getRuleArn() == null) ? 0 : getRuleArn().hashCode());
        hashCode = prime * hashCode
                + ((getEventSourceName() == null) ? 0 : getEventSourceName().hashCode());
        hashCode = prime * hashCode
                + ((getPublishStatus() == null) ? 0 : getPublishStatus().hashCode());
        hashCode = prime * hashCode
                + ((getActionSummaries() == null) ? 0 : getActionSummaries().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleSummary == false)
            return false;
        RuleSummary other = (RuleSummary) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        if (other.getRuleArn() == null ^ this.getRuleArn() == null)
            return false;
        if (other.getRuleArn() != null && other.getRuleArn().equals(this.getRuleArn()) == false)
            return false;
        if (other.getEventSourceName() == null ^ this.getEventSourceName() == null)
            return false;
        if (other.getEventSourceName() != null
                && other.getEventSourceName().equals(this.getEventSourceName()) == false)
            return false;
        if (other.getPublishStatus() == null ^ this.getPublishStatus() == null)
            return false;
        if (other.getPublishStatus() != null
                && other.getPublishStatus().equals(this.getPublishStatus()) == false)
            return false;
        if (other.getActionSummaries() == null ^ this.getActionSummaries() == null)
            return false;
        if (other.getActionSummaries() != null
                && other.getActionSummaries().equals(this.getActionSummaries()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null
                && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }
}
