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
 * Information about the action to be performed when a rule is triggered.
 * </p>
 */
public class RuleAction implements Serializable {
    /**
     * <p>
     * The type of action that creates a rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_TASK, ASSIGN_CONTACT_CATEGORY,
     * GENERATE_EVENTBRIDGE_EVENT, SEND_NOTIFICATION
     */
    private String actionType;

    /**
     * <p>
     * Information about the task action. This field is required if
     * <code>TriggerEventSource</code> is one of the following values:
     * <code>OnZendeskTicketCreate</code> |
     * <code>OnZendeskTicketStatusUpdate</code> |
     * <code>OnSalesforceCaseCreate</code>
     * </p>
     */
    private TaskActionDefinition taskAction;

    /**
     * <p>
     * Information about the EventBridge action.
     * </p>
     */
    private EventBridgeActionDefinition eventBridgeAction;

    /**
     * <p>
     * Information about the contact category action.
     * </p>
     */
    private AssignContactCategoryActionDefinition assignContactCategoryAction;

    /**
     * <p>
     * Information about the send notification action.
     * </p>
     */
    private SendNotificationActionDefinition sendNotificationAction;

    /**
     * <p>
     * The type of action that creates a rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_TASK, ASSIGN_CONTACT_CATEGORY,
     * GENERATE_EVENTBRIDGE_EVENT, SEND_NOTIFICATION
     *
     * @return <p>
     *         The type of action that creates a rule.
     *         </p>
     * @see ActionType
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * <p>
     * The type of action that creates a rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_TASK, ASSIGN_CONTACT_CATEGORY,
     * GENERATE_EVENTBRIDGE_EVENT, SEND_NOTIFICATION
     *
     * @param actionType <p>
     *            The type of action that creates a rule.
     *            </p>
     * @see ActionType
     */
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The type of action that creates a rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_TASK, ASSIGN_CONTACT_CATEGORY,
     * GENERATE_EVENTBRIDGE_EVENT, SEND_NOTIFICATION
     *
     * @param actionType <p>
     *            The type of action that creates a rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActionType
     */
    public RuleAction withActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * <p>
     * The type of action that creates a rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_TASK, ASSIGN_CONTACT_CATEGORY,
     * GENERATE_EVENTBRIDGE_EVENT, SEND_NOTIFICATION
     *
     * @param actionType <p>
     *            The type of action that creates a rule.
     *            </p>
     * @see ActionType
     */
    public void setActionType(ActionType actionType) {
        this.actionType = actionType.toString();
    }

    /**
     * <p>
     * The type of action that creates a rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_TASK, ASSIGN_CONTACT_CATEGORY,
     * GENERATE_EVENTBRIDGE_EVENT, SEND_NOTIFICATION
     *
     * @param actionType <p>
     *            The type of action that creates a rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActionType
     */
    public RuleAction withActionType(ActionType actionType) {
        this.actionType = actionType.toString();
        return this;
    }

    /**
     * <p>
     * Information about the task action. This field is required if
     * <code>TriggerEventSource</code> is one of the following values:
     * <code>OnZendeskTicketCreate</code> |
     * <code>OnZendeskTicketStatusUpdate</code> |
     * <code>OnSalesforceCaseCreate</code>
     * </p>
     *
     * @return <p>
     *         Information about the task action. This field is required if
     *         <code>TriggerEventSource</code> is one of the following values:
     *         <code>OnZendeskTicketCreate</code> |
     *         <code>OnZendeskTicketStatusUpdate</code> |
     *         <code>OnSalesforceCaseCreate</code>
     *         </p>
     */
    public TaskActionDefinition getTaskAction() {
        return taskAction;
    }

    /**
     * <p>
     * Information about the task action. This field is required if
     * <code>TriggerEventSource</code> is one of the following values:
     * <code>OnZendeskTicketCreate</code> |
     * <code>OnZendeskTicketStatusUpdate</code> |
     * <code>OnSalesforceCaseCreate</code>
     * </p>
     *
     * @param taskAction <p>
     *            Information about the task action. This field is required if
     *            <code>TriggerEventSource</code> is one of the following
     *            values: <code>OnZendeskTicketCreate</code> |
     *            <code>OnZendeskTicketStatusUpdate</code> |
     *            <code>OnSalesforceCaseCreate</code>
     *            </p>
     */
    public void setTaskAction(TaskActionDefinition taskAction) {
        this.taskAction = taskAction;
    }

    /**
     * <p>
     * Information about the task action. This field is required if
     * <code>TriggerEventSource</code> is one of the following values:
     * <code>OnZendeskTicketCreate</code> |
     * <code>OnZendeskTicketStatusUpdate</code> |
     * <code>OnSalesforceCaseCreate</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskAction <p>
     *            Information about the task action. This field is required if
     *            <code>TriggerEventSource</code> is one of the following
     *            values: <code>OnZendeskTicketCreate</code> |
     *            <code>OnZendeskTicketStatusUpdate</code> |
     *            <code>OnSalesforceCaseCreate</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleAction withTaskAction(TaskActionDefinition taskAction) {
        this.taskAction = taskAction;
        return this;
    }

    /**
     * <p>
     * Information about the EventBridge action.
     * </p>
     *
     * @return <p>
     *         Information about the EventBridge action.
     *         </p>
     */
    public EventBridgeActionDefinition getEventBridgeAction() {
        return eventBridgeAction;
    }

    /**
     * <p>
     * Information about the EventBridge action.
     * </p>
     *
     * @param eventBridgeAction <p>
     *            Information about the EventBridge action.
     *            </p>
     */
    public void setEventBridgeAction(EventBridgeActionDefinition eventBridgeAction) {
        this.eventBridgeAction = eventBridgeAction;
    }

    /**
     * <p>
     * Information about the EventBridge action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventBridgeAction <p>
     *            Information about the EventBridge action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleAction withEventBridgeAction(EventBridgeActionDefinition eventBridgeAction) {
        this.eventBridgeAction = eventBridgeAction;
        return this;
    }

    /**
     * <p>
     * Information about the contact category action.
     * </p>
     *
     * @return <p>
     *         Information about the contact category action.
     *         </p>
     */
    public AssignContactCategoryActionDefinition getAssignContactCategoryAction() {
        return assignContactCategoryAction;
    }

    /**
     * <p>
     * Information about the contact category action.
     * </p>
     *
     * @param assignContactCategoryAction <p>
     *            Information about the contact category action.
     *            </p>
     */
    public void setAssignContactCategoryAction(
            AssignContactCategoryActionDefinition assignContactCategoryAction) {
        this.assignContactCategoryAction = assignContactCategoryAction;
    }

    /**
     * <p>
     * Information about the contact category action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assignContactCategoryAction <p>
     *            Information about the contact category action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleAction withAssignContactCategoryAction(
            AssignContactCategoryActionDefinition assignContactCategoryAction) {
        this.assignContactCategoryAction = assignContactCategoryAction;
        return this;
    }

    /**
     * <p>
     * Information about the send notification action.
     * </p>
     *
     * @return <p>
     *         Information about the send notification action.
     *         </p>
     */
    public SendNotificationActionDefinition getSendNotificationAction() {
        return sendNotificationAction;
    }

    /**
     * <p>
     * Information about the send notification action.
     * </p>
     *
     * @param sendNotificationAction <p>
     *            Information about the send notification action.
     *            </p>
     */
    public void setSendNotificationAction(SendNotificationActionDefinition sendNotificationAction) {
        this.sendNotificationAction = sendNotificationAction;
    }

    /**
     * <p>
     * Information about the send notification action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sendNotificationAction <p>
     *            Information about the send notification action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleAction withSendNotificationAction(
            SendNotificationActionDefinition sendNotificationAction) {
        this.sendNotificationAction = sendNotificationAction;
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
        if (getActionType() != null)
            sb.append("ActionType: " + getActionType() + ",");
        if (getTaskAction() != null)
            sb.append("TaskAction: " + getTaskAction() + ",");
        if (getEventBridgeAction() != null)
            sb.append("EventBridgeAction: " + getEventBridgeAction() + ",");
        if (getAssignContactCategoryAction() != null)
            sb.append("AssignContactCategoryAction: " + getAssignContactCategoryAction() + ",");
        if (getSendNotificationAction() != null)
            sb.append("SendNotificationAction: " + getSendNotificationAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        hashCode = prime * hashCode + ((getTaskAction() == null) ? 0 : getTaskAction().hashCode());
        hashCode = prime * hashCode
                + ((getEventBridgeAction() == null) ? 0 : getEventBridgeAction().hashCode());
        hashCode = prime
                * hashCode
                + ((getAssignContactCategoryAction() == null) ? 0
                        : getAssignContactCategoryAction().hashCode());
        hashCode = prime
                * hashCode
                + ((getSendNotificationAction() == null) ? 0 : getSendNotificationAction()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleAction == false)
            return false;
        RuleAction other = (RuleAction) obj;

        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null
                && other.getActionType().equals(this.getActionType()) == false)
            return false;
        if (other.getTaskAction() == null ^ this.getTaskAction() == null)
            return false;
        if (other.getTaskAction() != null
                && other.getTaskAction().equals(this.getTaskAction()) == false)
            return false;
        if (other.getEventBridgeAction() == null ^ this.getEventBridgeAction() == null)
            return false;
        if (other.getEventBridgeAction() != null
                && other.getEventBridgeAction().equals(this.getEventBridgeAction()) == false)
            return false;
        if (other.getAssignContactCategoryAction() == null
                ^ this.getAssignContactCategoryAction() == null)
            return false;
        if (other.getAssignContactCategoryAction() != null
                && other.getAssignContactCategoryAction().equals(
                        this.getAssignContactCategoryAction()) == false)
            return false;
        if (other.getSendNotificationAction() == null ^ this.getSendNotificationAction() == null)
            return false;
        if (other.getSendNotificationAction() != null
                && other.getSendNotificationAction().equals(this.getSendNotificationAction()) == false)
            return false;
        return true;
    }
}
