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
     * GENERATE_EVENTBRIDGE_EVENT, SEND_NOTIFICATION, CREATE_CASE, UPDATE_CASE,
     * END_ASSOCIATED_TASKS, SUBMIT_AUTO_EVALUATION
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
     * <p>
     * Supported only for <code>TriggerEventSource</code> values:
     * <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnRealTimeCallAnalysisAvailable</code> |
     * <code>OnRealTimeChatAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code> |
     * <code>OnContactEvaluationSubmit</code> | <code>OnMetricDataUpdate</code>
     * </p>
     */
    private EventBridgeActionDefinition eventBridgeAction;

    /**
     * <p>
     * Information about the contact category action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values:
     * <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnRealTimeCallAnalysisAvailable</code> |
     * <code>OnRealTimeChatAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code> |
     * <code>OnZendeskTicketCreate</code> |
     * <code>OnZendeskTicketStatusUpdate</code> |
     * <code>OnSalesforceCaseCreate</code>
     * </p>
     */
    private AssignContactCategoryActionDefinition assignContactCategoryAction;

    /**
     * <p>
     * Information about the send notification action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values:
     * <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnRealTimeCallAnalysisAvailable</code> |
     * <code>OnRealTimeChatAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code> |
     * <code>OnContactEvaluationSubmit</code> | <code>OnMetricDataUpdate</code>
     * </p>
     */
    private SendNotificationActionDefinition sendNotificationAction;

    /**
     * <p>
     * Information about the create case action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values:
     * <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code>.
     * </p>
     */
    private CreateCaseActionDefinition createCaseAction;

    /**
     * <p>
     * Information about the update case action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values:
     * <code>OnCaseCreate</code> | <code>OnCaseUpdate</code>.
     * </p>
     */
    private UpdateCaseActionDefinition updateCaseAction;

    /**
     * <p>
     * Information about the end associated tasks action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values:
     * <code>OnCaseUpdate</code>.
     * </p>
     */
    private EndAssociatedTasksActionDefinition endAssociatedTasksAction;

    /**
     * <p>
     * Information about the submit automated evaluation action.
     * </p>
     */
    private SubmitAutoEvaluationActionDefinition submitAutoEvaluationAction;

    /**
     * <p>
     * The type of action that creates a rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_TASK, ASSIGN_CONTACT_CATEGORY,
     * GENERATE_EVENTBRIDGE_EVENT, SEND_NOTIFICATION, CREATE_CASE, UPDATE_CASE,
     * END_ASSOCIATED_TASKS, SUBMIT_AUTO_EVALUATION
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
     * GENERATE_EVENTBRIDGE_EVENT, SEND_NOTIFICATION, CREATE_CASE, UPDATE_CASE,
     * END_ASSOCIATED_TASKS, SUBMIT_AUTO_EVALUATION
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
     * GENERATE_EVENTBRIDGE_EVENT, SEND_NOTIFICATION, CREATE_CASE, UPDATE_CASE,
     * END_ASSOCIATED_TASKS, SUBMIT_AUTO_EVALUATION
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
     * GENERATE_EVENTBRIDGE_EVENT, SEND_NOTIFICATION, CREATE_CASE, UPDATE_CASE,
     * END_ASSOCIATED_TASKS, SUBMIT_AUTO_EVALUATION
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
     * GENERATE_EVENTBRIDGE_EVENT, SEND_NOTIFICATION, CREATE_CASE, UPDATE_CASE,
     * END_ASSOCIATED_TASKS, SUBMIT_AUTO_EVALUATION
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
     * <p>
     * Supported only for <code>TriggerEventSource</code> values:
     * <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnRealTimeCallAnalysisAvailable</code> |
     * <code>OnRealTimeChatAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code> |
     * <code>OnContactEvaluationSubmit</code> | <code>OnMetricDataUpdate</code>
     * </p>
     *
     * @return <p>
     *         Information about the EventBridge action.
     *         </p>
     *         <p>
     *         Supported only for <code>TriggerEventSource</code> values:
     *         <code>OnPostCallAnalysisAvailable</code> |
     *         <code>OnRealTimeCallAnalysisAvailable</code> |
     *         <code>OnRealTimeChatAnalysisAvailable</code> |
     *         <code>OnPostChatAnalysisAvailable</code> |
     *         <code>OnContactEvaluationSubmit</code> |
     *         <code>OnMetricDataUpdate</code>
     *         </p>
     */
    public EventBridgeActionDefinition getEventBridgeAction() {
        return eventBridgeAction;
    }

    /**
     * <p>
     * Information about the EventBridge action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values:
     * <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnRealTimeCallAnalysisAvailable</code> |
     * <code>OnRealTimeChatAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code> |
     * <code>OnContactEvaluationSubmit</code> | <code>OnMetricDataUpdate</code>
     * </p>
     *
     * @param eventBridgeAction <p>
     *            Information about the EventBridge action.
     *            </p>
     *            <p>
     *            Supported only for <code>TriggerEventSource</code> values:
     *            <code>OnPostCallAnalysisAvailable</code> |
     *            <code>OnRealTimeCallAnalysisAvailable</code> |
     *            <code>OnRealTimeChatAnalysisAvailable</code> |
     *            <code>OnPostChatAnalysisAvailable</code> |
     *            <code>OnContactEvaluationSubmit</code> |
     *            <code>OnMetricDataUpdate</code>
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
     * Supported only for <code>TriggerEventSource</code> values:
     * <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnRealTimeCallAnalysisAvailable</code> |
     * <code>OnRealTimeChatAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code> |
     * <code>OnContactEvaluationSubmit</code> | <code>OnMetricDataUpdate</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventBridgeAction <p>
     *            Information about the EventBridge action.
     *            </p>
     *            <p>
     *            Supported only for <code>TriggerEventSource</code> values:
     *            <code>OnPostCallAnalysisAvailable</code> |
     *            <code>OnRealTimeCallAnalysisAvailable</code> |
     *            <code>OnRealTimeChatAnalysisAvailable</code> |
     *            <code>OnPostChatAnalysisAvailable</code> |
     *            <code>OnContactEvaluationSubmit</code> |
     *            <code>OnMetricDataUpdate</code>
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
     * <p>
     * Supported only for <code>TriggerEventSource</code> values:
     * <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnRealTimeCallAnalysisAvailable</code> |
     * <code>OnRealTimeChatAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code> |
     * <code>OnZendeskTicketCreate</code> |
     * <code>OnZendeskTicketStatusUpdate</code> |
     * <code>OnSalesforceCaseCreate</code>
     * </p>
     *
     * @return <p>
     *         Information about the contact category action.
     *         </p>
     *         <p>
     *         Supported only for <code>TriggerEventSource</code> values:
     *         <code>OnPostCallAnalysisAvailable</code> |
     *         <code>OnRealTimeCallAnalysisAvailable</code> |
     *         <code>OnRealTimeChatAnalysisAvailable</code> |
     *         <code>OnPostChatAnalysisAvailable</code> |
     *         <code>OnZendeskTicketCreate</code> |
     *         <code>OnZendeskTicketStatusUpdate</code> |
     *         <code>OnSalesforceCaseCreate</code>
     *         </p>
     */
    public AssignContactCategoryActionDefinition getAssignContactCategoryAction() {
        return assignContactCategoryAction;
    }

    /**
     * <p>
     * Information about the contact category action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values:
     * <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnRealTimeCallAnalysisAvailable</code> |
     * <code>OnRealTimeChatAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code> |
     * <code>OnZendeskTicketCreate</code> |
     * <code>OnZendeskTicketStatusUpdate</code> |
     * <code>OnSalesforceCaseCreate</code>
     * </p>
     *
     * @param assignContactCategoryAction <p>
     *            Information about the contact category action.
     *            </p>
     *            <p>
     *            Supported only for <code>TriggerEventSource</code> values:
     *            <code>OnPostCallAnalysisAvailable</code> |
     *            <code>OnRealTimeCallAnalysisAvailable</code> |
     *            <code>OnRealTimeChatAnalysisAvailable</code> |
     *            <code>OnPostChatAnalysisAvailable</code> |
     *            <code>OnZendeskTicketCreate</code> |
     *            <code>OnZendeskTicketStatusUpdate</code> |
     *            <code>OnSalesforceCaseCreate</code>
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
     * Supported only for <code>TriggerEventSource</code> values:
     * <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnRealTimeCallAnalysisAvailable</code> |
     * <code>OnRealTimeChatAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code> |
     * <code>OnZendeskTicketCreate</code> |
     * <code>OnZendeskTicketStatusUpdate</code> |
     * <code>OnSalesforceCaseCreate</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assignContactCategoryAction <p>
     *            Information about the contact category action.
     *            </p>
     *            <p>
     *            Supported only for <code>TriggerEventSource</code> values:
     *            <code>OnPostCallAnalysisAvailable</code> |
     *            <code>OnRealTimeCallAnalysisAvailable</code> |
     *            <code>OnRealTimeChatAnalysisAvailable</code> |
     *            <code>OnPostChatAnalysisAvailable</code> |
     *            <code>OnZendeskTicketCreate</code> |
     *            <code>OnZendeskTicketStatusUpdate</code> |
     *            <code>OnSalesforceCaseCreate</code>
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
     * <p>
     * Supported only for <code>TriggerEventSource</code> values:
     * <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnRealTimeCallAnalysisAvailable</code> |
     * <code>OnRealTimeChatAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code> |
     * <code>OnContactEvaluationSubmit</code> | <code>OnMetricDataUpdate</code>
     * </p>
     *
     * @return <p>
     *         Information about the send notification action.
     *         </p>
     *         <p>
     *         Supported only for <code>TriggerEventSource</code> values:
     *         <code>OnPostCallAnalysisAvailable</code> |
     *         <code>OnRealTimeCallAnalysisAvailable</code> |
     *         <code>OnRealTimeChatAnalysisAvailable</code> |
     *         <code>OnPostChatAnalysisAvailable</code> |
     *         <code>OnContactEvaluationSubmit</code> |
     *         <code>OnMetricDataUpdate</code>
     *         </p>
     */
    public SendNotificationActionDefinition getSendNotificationAction() {
        return sendNotificationAction;
    }

    /**
     * <p>
     * Information about the send notification action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values:
     * <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnRealTimeCallAnalysisAvailable</code> |
     * <code>OnRealTimeChatAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code> |
     * <code>OnContactEvaluationSubmit</code> | <code>OnMetricDataUpdate</code>
     * </p>
     *
     * @param sendNotificationAction <p>
     *            Information about the send notification action.
     *            </p>
     *            <p>
     *            Supported only for <code>TriggerEventSource</code> values:
     *            <code>OnPostCallAnalysisAvailable</code> |
     *            <code>OnRealTimeCallAnalysisAvailable</code> |
     *            <code>OnRealTimeChatAnalysisAvailable</code> |
     *            <code>OnPostChatAnalysisAvailable</code> |
     *            <code>OnContactEvaluationSubmit</code> |
     *            <code>OnMetricDataUpdate</code>
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
     * Supported only for <code>TriggerEventSource</code> values:
     * <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnRealTimeCallAnalysisAvailable</code> |
     * <code>OnRealTimeChatAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code> |
     * <code>OnContactEvaluationSubmit</code> | <code>OnMetricDataUpdate</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sendNotificationAction <p>
     *            Information about the send notification action.
     *            </p>
     *            <p>
     *            Supported only for <code>TriggerEventSource</code> values:
     *            <code>OnPostCallAnalysisAvailable</code> |
     *            <code>OnRealTimeCallAnalysisAvailable</code> |
     *            <code>OnRealTimeChatAnalysisAvailable</code> |
     *            <code>OnPostChatAnalysisAvailable</code> |
     *            <code>OnContactEvaluationSubmit</code> |
     *            <code>OnMetricDataUpdate</code>
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
     * <p>
     * Information about the create case action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values:
     * <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code>.
     * </p>
     *
     * @return <p>
     *         Information about the create case action.
     *         </p>
     *         <p>
     *         Supported only for <code>TriggerEventSource</code> values:
     *         <code>OnPostCallAnalysisAvailable</code> |
     *         <code>OnPostChatAnalysisAvailable</code>.
     *         </p>
     */
    public CreateCaseActionDefinition getCreateCaseAction() {
        return createCaseAction;
    }

    /**
     * <p>
     * Information about the create case action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values:
     * <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code>.
     * </p>
     *
     * @param createCaseAction <p>
     *            Information about the create case action.
     *            </p>
     *            <p>
     *            Supported only for <code>TriggerEventSource</code> values:
     *            <code>OnPostCallAnalysisAvailable</code> |
     *            <code>OnPostChatAnalysisAvailable</code>.
     *            </p>
     */
    public void setCreateCaseAction(CreateCaseActionDefinition createCaseAction) {
        this.createCaseAction = createCaseAction;
    }

    /**
     * <p>
     * Information about the create case action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values:
     * <code>OnPostCallAnalysisAvailable</code> |
     * <code>OnPostChatAnalysisAvailable</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createCaseAction <p>
     *            Information about the create case action.
     *            </p>
     *            <p>
     *            Supported only for <code>TriggerEventSource</code> values:
     *            <code>OnPostCallAnalysisAvailable</code> |
     *            <code>OnPostChatAnalysisAvailable</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleAction withCreateCaseAction(CreateCaseActionDefinition createCaseAction) {
        this.createCaseAction = createCaseAction;
        return this;
    }

    /**
     * <p>
     * Information about the update case action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values:
     * <code>OnCaseCreate</code> | <code>OnCaseUpdate</code>.
     * </p>
     *
     * @return <p>
     *         Information about the update case action.
     *         </p>
     *         <p>
     *         Supported only for <code>TriggerEventSource</code> values:
     *         <code>OnCaseCreate</code> | <code>OnCaseUpdate</code>.
     *         </p>
     */
    public UpdateCaseActionDefinition getUpdateCaseAction() {
        return updateCaseAction;
    }

    /**
     * <p>
     * Information about the update case action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values:
     * <code>OnCaseCreate</code> | <code>OnCaseUpdate</code>.
     * </p>
     *
     * @param updateCaseAction <p>
     *            Information about the update case action.
     *            </p>
     *            <p>
     *            Supported only for <code>TriggerEventSource</code> values:
     *            <code>OnCaseCreate</code> | <code>OnCaseUpdate</code>.
     *            </p>
     */
    public void setUpdateCaseAction(UpdateCaseActionDefinition updateCaseAction) {
        this.updateCaseAction = updateCaseAction;
    }

    /**
     * <p>
     * Information about the update case action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values:
     * <code>OnCaseCreate</code> | <code>OnCaseUpdate</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateCaseAction <p>
     *            Information about the update case action.
     *            </p>
     *            <p>
     *            Supported only for <code>TriggerEventSource</code> values:
     *            <code>OnCaseCreate</code> | <code>OnCaseUpdate</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleAction withUpdateCaseAction(UpdateCaseActionDefinition updateCaseAction) {
        this.updateCaseAction = updateCaseAction;
        return this;
    }

    /**
     * <p>
     * Information about the end associated tasks action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values:
     * <code>OnCaseUpdate</code>.
     * </p>
     *
     * @return <p>
     *         Information about the end associated tasks action.
     *         </p>
     *         <p>
     *         Supported only for <code>TriggerEventSource</code> values:
     *         <code>OnCaseUpdate</code>.
     *         </p>
     */
    public EndAssociatedTasksActionDefinition getEndAssociatedTasksAction() {
        return endAssociatedTasksAction;
    }

    /**
     * <p>
     * Information about the end associated tasks action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values:
     * <code>OnCaseUpdate</code>.
     * </p>
     *
     * @param endAssociatedTasksAction <p>
     *            Information about the end associated tasks action.
     *            </p>
     *            <p>
     *            Supported only for <code>TriggerEventSource</code> values:
     *            <code>OnCaseUpdate</code>.
     *            </p>
     */
    public void setEndAssociatedTasksAction(
            EndAssociatedTasksActionDefinition endAssociatedTasksAction) {
        this.endAssociatedTasksAction = endAssociatedTasksAction;
    }

    /**
     * <p>
     * Information about the end associated tasks action.
     * </p>
     * <p>
     * Supported only for <code>TriggerEventSource</code> values:
     * <code>OnCaseUpdate</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endAssociatedTasksAction <p>
     *            Information about the end associated tasks action.
     *            </p>
     *            <p>
     *            Supported only for <code>TriggerEventSource</code> values:
     *            <code>OnCaseUpdate</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleAction withEndAssociatedTasksAction(
            EndAssociatedTasksActionDefinition endAssociatedTasksAction) {
        this.endAssociatedTasksAction = endAssociatedTasksAction;
        return this;
    }

    /**
     * <p>
     * Information about the submit automated evaluation action.
     * </p>
     *
     * @return <p>
     *         Information about the submit automated evaluation action.
     *         </p>
     */
    public SubmitAutoEvaluationActionDefinition getSubmitAutoEvaluationAction() {
        return submitAutoEvaluationAction;
    }

    /**
     * <p>
     * Information about the submit automated evaluation action.
     * </p>
     *
     * @param submitAutoEvaluationAction <p>
     *            Information about the submit automated evaluation action.
     *            </p>
     */
    public void setSubmitAutoEvaluationAction(
            SubmitAutoEvaluationActionDefinition submitAutoEvaluationAction) {
        this.submitAutoEvaluationAction = submitAutoEvaluationAction;
    }

    /**
     * <p>
     * Information about the submit automated evaluation action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param submitAutoEvaluationAction <p>
     *            Information about the submit automated evaluation action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RuleAction withSubmitAutoEvaluationAction(
            SubmitAutoEvaluationActionDefinition submitAutoEvaluationAction) {
        this.submitAutoEvaluationAction = submitAutoEvaluationAction;
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
            sb.append("SendNotificationAction: " + getSendNotificationAction() + ",");
        if (getCreateCaseAction() != null)
            sb.append("CreateCaseAction: " + getCreateCaseAction() + ",");
        if (getUpdateCaseAction() != null)
            sb.append("UpdateCaseAction: " + getUpdateCaseAction() + ",");
        if (getEndAssociatedTasksAction() != null)
            sb.append("EndAssociatedTasksAction: " + getEndAssociatedTasksAction() + ",");
        if (getSubmitAutoEvaluationAction() != null)
            sb.append("SubmitAutoEvaluationAction: " + getSubmitAutoEvaluationAction());
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
        hashCode = prime * hashCode
                + ((getCreateCaseAction() == null) ? 0 : getCreateCaseAction().hashCode());
        hashCode = prime * hashCode
                + ((getUpdateCaseAction() == null) ? 0 : getUpdateCaseAction().hashCode());
        hashCode = prime
                * hashCode
                + ((getEndAssociatedTasksAction() == null) ? 0 : getEndAssociatedTasksAction()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSubmitAutoEvaluationAction() == null) ? 0 : getSubmitAutoEvaluationAction()
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
        if (other.getCreateCaseAction() == null ^ this.getCreateCaseAction() == null)
            return false;
        if (other.getCreateCaseAction() != null
                && other.getCreateCaseAction().equals(this.getCreateCaseAction()) == false)
            return false;
        if (other.getUpdateCaseAction() == null ^ this.getUpdateCaseAction() == null)
            return false;
        if (other.getUpdateCaseAction() != null
                && other.getUpdateCaseAction().equals(this.getUpdateCaseAction()) == false)
            return false;
        if (other.getEndAssociatedTasksAction() == null
                ^ this.getEndAssociatedTasksAction() == null)
            return false;
        if (other.getEndAssociatedTasksAction() != null
                && other.getEndAssociatedTasksAction().equals(this.getEndAssociatedTasksAction()) == false)
            return false;
        if (other.getSubmitAutoEvaluationAction() == null
                ^ this.getSubmitAutoEvaluationAction() == null)
            return false;
        if (other.getSubmitAutoEvaluationAction() != null
                && other.getSubmitAutoEvaluationAction().equals(
                        this.getSubmitAutoEvaluationAction()) == false)
            return false;
        return true;
    }
}
