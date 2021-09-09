/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Starts a Device Defender ML Detect mitigation actions task.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >StartDetectMitigationActionsTask</a> action.
 * </p>
 */
public class StartDetectMitigationActionsTaskRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The unique identifier of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String taskId;

    /**
     * <p>
     * Specifies the ML Detect findings to which the mitigation actions are
     * applied.
     * </p>
     */
    private DetectMitigationActionsTaskTarget target;

    /**
     * <p>
     * The actions to be performed when a device has unexpected behavior.
     * </p>
     */
    private java.util.List<String> actions;

    /**
     * <p>
     * Specifies the time period of which violation events occurred between.
     * </p>
     */
    private ViolationEventOccurrenceRange violationEventOccurrenceRange;

    /**
     * <p>
     * Specifies to list only active violations.
     * </p>
     */
    private Boolean includeOnlyActiveViolations;

    /**
     * <p>
     * Specifies to include suppressed alerts.
     * </p>
     */
    private Boolean includeSuppressedAlerts;

    /**
     * <p>
     * Each mitigation action task must have a unique client request token. If
     * you try to create a new task with the same token as a task that already
     * exists, an exception occurs. If you omit this value, Amazon Web Services
     * SDKs will automatically generate a unique client request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The unique identifier of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The unique identifier of the task.
     *         </p>
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * <p>
     * The unique identifier of the task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param taskId <p>
     *            The unique identifier of the task.
     *            </p>
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The unique identifier of the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param taskId <p>
     *            The unique identifier of the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDetectMitigationActionsTaskRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * <p>
     * Specifies the ML Detect findings to which the mitigation actions are
     * applied.
     * </p>
     *
     * @return <p>
     *         Specifies the ML Detect findings to which the mitigation actions
     *         are applied.
     *         </p>
     */
    public DetectMitigationActionsTaskTarget getTarget() {
        return target;
    }

    /**
     * <p>
     * Specifies the ML Detect findings to which the mitigation actions are
     * applied.
     * </p>
     *
     * @param target <p>
     *            Specifies the ML Detect findings to which the mitigation
     *            actions are applied.
     *            </p>
     */
    public void setTarget(DetectMitigationActionsTaskTarget target) {
        this.target = target;
    }

    /**
     * <p>
     * Specifies the ML Detect findings to which the mitigation actions are
     * applied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param target <p>
     *            Specifies the ML Detect findings to which the mitigation
     *            actions are applied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDetectMitigationActionsTaskRequest withTarget(
            DetectMitigationActionsTaskTarget target) {
        this.target = target;
        return this;
    }

    /**
     * <p>
     * The actions to be performed when a device has unexpected behavior.
     * </p>
     *
     * @return <p>
     *         The actions to be performed when a device has unexpected
     *         behavior.
     *         </p>
     */
    public java.util.List<String> getActions() {
        return actions;
    }

    /**
     * <p>
     * The actions to be performed when a device has unexpected behavior.
     * </p>
     *
     * @param actions <p>
     *            The actions to be performed when a device has unexpected
     *            behavior.
     *            </p>
     */
    public void setActions(java.util.Collection<String> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<String>(actions);
    }

    /**
     * <p>
     * The actions to be performed when a device has unexpected behavior.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actions <p>
     *            The actions to be performed when a device has unexpected
     *            behavior.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDetectMitigationActionsTaskRequest withActions(String... actions) {
        if (getActions() == null) {
            this.actions = new java.util.ArrayList<String>(actions.length);
        }
        for (String value : actions) {
            this.actions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The actions to be performed when a device has unexpected behavior.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actions <p>
     *            The actions to be performed when a device has unexpected
     *            behavior.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDetectMitigationActionsTaskRequest withActions(java.util.Collection<String> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * Specifies the time period of which violation events occurred between.
     * </p>
     *
     * @return <p>
     *         Specifies the time period of which violation events occurred
     *         between.
     *         </p>
     */
    public ViolationEventOccurrenceRange getViolationEventOccurrenceRange() {
        return violationEventOccurrenceRange;
    }

    /**
     * <p>
     * Specifies the time period of which violation events occurred between.
     * </p>
     *
     * @param violationEventOccurrenceRange <p>
     *            Specifies the time period of which violation events occurred
     *            between.
     *            </p>
     */
    public void setViolationEventOccurrenceRange(
            ViolationEventOccurrenceRange violationEventOccurrenceRange) {
        this.violationEventOccurrenceRange = violationEventOccurrenceRange;
    }

    /**
     * <p>
     * Specifies the time period of which violation events occurred between.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param violationEventOccurrenceRange <p>
     *            Specifies the time period of which violation events occurred
     *            between.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDetectMitigationActionsTaskRequest withViolationEventOccurrenceRange(
            ViolationEventOccurrenceRange violationEventOccurrenceRange) {
        this.violationEventOccurrenceRange = violationEventOccurrenceRange;
        return this;
    }

    /**
     * <p>
     * Specifies to list only active violations.
     * </p>
     *
     * @return <p>
     *         Specifies to list only active violations.
     *         </p>
     */
    public Boolean isIncludeOnlyActiveViolations() {
        return includeOnlyActiveViolations;
    }

    /**
     * <p>
     * Specifies to list only active violations.
     * </p>
     *
     * @return <p>
     *         Specifies to list only active violations.
     *         </p>
     */
    public Boolean getIncludeOnlyActiveViolations() {
        return includeOnlyActiveViolations;
    }

    /**
     * <p>
     * Specifies to list only active violations.
     * </p>
     *
     * @param includeOnlyActiveViolations <p>
     *            Specifies to list only active violations.
     *            </p>
     */
    public void setIncludeOnlyActiveViolations(Boolean includeOnlyActiveViolations) {
        this.includeOnlyActiveViolations = includeOnlyActiveViolations;
    }

    /**
     * <p>
     * Specifies to list only active violations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeOnlyActiveViolations <p>
     *            Specifies to list only active violations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDetectMitigationActionsTaskRequest withIncludeOnlyActiveViolations(
            Boolean includeOnlyActiveViolations) {
        this.includeOnlyActiveViolations = includeOnlyActiveViolations;
        return this;
    }

    /**
     * <p>
     * Specifies to include suppressed alerts.
     * </p>
     *
     * @return <p>
     *         Specifies to include suppressed alerts.
     *         </p>
     */
    public Boolean isIncludeSuppressedAlerts() {
        return includeSuppressedAlerts;
    }

    /**
     * <p>
     * Specifies to include suppressed alerts.
     * </p>
     *
     * @return <p>
     *         Specifies to include suppressed alerts.
     *         </p>
     */
    public Boolean getIncludeSuppressedAlerts() {
        return includeSuppressedAlerts;
    }

    /**
     * <p>
     * Specifies to include suppressed alerts.
     * </p>
     *
     * @param includeSuppressedAlerts <p>
     *            Specifies to include suppressed alerts.
     *            </p>
     */
    public void setIncludeSuppressedAlerts(Boolean includeSuppressedAlerts) {
        this.includeSuppressedAlerts = includeSuppressedAlerts;
    }

    /**
     * <p>
     * Specifies to include suppressed alerts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeSuppressedAlerts <p>
     *            Specifies to include suppressed alerts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDetectMitigationActionsTaskRequest withIncludeSuppressedAlerts(
            Boolean includeSuppressedAlerts) {
        this.includeSuppressedAlerts = includeSuppressedAlerts;
        return this;
    }

    /**
     * <p>
     * Each mitigation action task must have a unique client request token. If
     * you try to create a new task with the same token as a task that already
     * exists, an exception occurs. If you omit this value, Amazon Web Services
     * SDKs will automatically generate a unique client request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @return <p>
     *         Each mitigation action task must have a unique client request
     *         token. If you try to create a new task with the same token as a
     *         task that already exists, an exception occurs. If you omit this
     *         value, Amazon Web Services SDKs will automatically generate a
     *         unique client request.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * Each mitigation action task must have a unique client request token. If
     * you try to create a new task with the same token as a task that already
     * exists, an exception occurs. If you omit this value, Amazon Web Services
     * SDKs will automatically generate a unique client request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param clientRequestToken <p>
     *            Each mitigation action task must have a unique client request
     *            token. If you try to create a new task with the same token as
     *            a task that already exists, an exception occurs. If you omit
     *            this value, Amazon Web Services SDKs will automatically
     *            generate a unique client request.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Each mitigation action task must have a unique client request token. If
     * you try to create a new task with the same token as a task that already
     * exists, an exception occurs. If you omit this value, Amazon Web Services
     * SDKs will automatically generate a unique client request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param clientRequestToken <p>
     *            Each mitigation action task must have a unique client request
     *            token. If you try to create a new task with the same token as
     *            a task that already exists, an exception occurs. If you omit
     *            this value, Amazon Web Services SDKs will automatically
     *            generate a unique client request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartDetectMitigationActionsTaskRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
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
        if (getTaskId() != null)
            sb.append("taskId: " + getTaskId() + ",");
        if (getTarget() != null)
            sb.append("target: " + getTarget() + ",");
        if (getActions() != null)
            sb.append("actions: " + getActions() + ",");
        if (getViolationEventOccurrenceRange() != null)
            sb.append("violationEventOccurrenceRange: " + getViolationEventOccurrenceRange() + ",");
        if (getIncludeOnlyActiveViolations() != null)
            sb.append("includeOnlyActiveViolations: " + getIncludeOnlyActiveViolations() + ",");
        if (getIncludeSuppressedAlerts() != null)
            sb.append("includeSuppressedAlerts: " + getIncludeSuppressedAlerts() + ",");
        if (getClientRequestToken() != null)
            sb.append("clientRequestToken: " + getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime
                * hashCode
                + ((getViolationEventOccurrenceRange() == null) ? 0
                        : getViolationEventOccurrenceRange().hashCode());
        hashCode = prime
                * hashCode
                + ((getIncludeOnlyActiveViolations() == null) ? 0
                        : getIncludeOnlyActiveViolations().hashCode());
        hashCode = prime
                * hashCode
                + ((getIncludeSuppressedAlerts() == null) ? 0 : getIncludeSuppressedAlerts()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartDetectMitigationActionsTaskRequest == false)
            return false;
        StartDetectMitigationActionsTaskRequest other = (StartDetectMitigationActionsTaskRequest) obj;

        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getViolationEventOccurrenceRange() == null
                ^ this.getViolationEventOccurrenceRange() == null)
            return false;
        if (other.getViolationEventOccurrenceRange() != null
                && other.getViolationEventOccurrenceRange().equals(
                        this.getViolationEventOccurrenceRange()) == false)
            return false;
        if (other.getIncludeOnlyActiveViolations() == null
                ^ this.getIncludeOnlyActiveViolations() == null)
            return false;
        if (other.getIncludeOnlyActiveViolations() != null
                && other.getIncludeOnlyActiveViolations().equals(
                        this.getIncludeOnlyActiveViolations()) == false)
            return false;
        if (other.getIncludeSuppressedAlerts() == null ^ this.getIncludeSuppressedAlerts() == null)
            return false;
        if (other.getIncludeSuppressedAlerts() != null
                && other.getIncludeSuppressedAlerts().equals(this.getIncludeSuppressedAlerts()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }
}
