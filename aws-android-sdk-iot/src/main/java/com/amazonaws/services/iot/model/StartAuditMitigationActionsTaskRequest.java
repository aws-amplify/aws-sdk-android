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
 * Starts a task that applies a set of mitigation actions to the specified
 * target.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >StartAuditMitigationActionsTask</a> action.
 * </p>
 */
public class StartAuditMitigationActionsTaskRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A unique identifier for the task. You can use this identifier to check
     * the status of the task or to cancel it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String taskId;

    /**
     * <p>
     * Specifies the audit findings to which the mitigation actions are applied.
     * You can apply them to a type of audit check, to all findings from an
     * audit, or to a specific set of findings.
     * </p>
     */
    private AuditMitigationActionsTaskTarget target;

    /**
     * <p>
     * For an audit check, specifies which mitigation actions to apply. Those
     * actions must be defined in your Amazon Web Services accounts.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> auditCheckToActionsMapping;

    /**
     * <p>
     * Each audit mitigation task must have a unique client request token. If
     * you try to start a new task with the same token as a task that already
     * exists, an exception occurs. If you omit this value, a unique client
     * request token is generated automatically.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * A unique identifier for the task. You can use this identifier to check
     * the status of the task or to cancel it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         A unique identifier for the task. You can use this identifier to
     *         check the status of the task or to cancel it.
     *         </p>
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * <p>
     * A unique identifier for the task. You can use this identifier to check
     * the status of the task or to cancel it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param taskId <p>
     *            A unique identifier for the task. You can use this identifier
     *            to check the status of the task or to cancel it.
     *            </p>
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * A unique identifier for the task. You can use this identifier to check
     * the status of the task or to cancel it.
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
     *            A unique identifier for the task. You can use this identifier
     *            to check the status of the task or to cancel it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAuditMitigationActionsTaskRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * <p>
     * Specifies the audit findings to which the mitigation actions are applied.
     * You can apply them to a type of audit check, to all findings from an
     * audit, or to a specific set of findings.
     * </p>
     *
     * @return <p>
     *         Specifies the audit findings to which the mitigation actions are
     *         applied. You can apply them to a type of audit check, to all
     *         findings from an audit, or to a specific set of findings.
     *         </p>
     */
    public AuditMitigationActionsTaskTarget getTarget() {
        return target;
    }

    /**
     * <p>
     * Specifies the audit findings to which the mitigation actions are applied.
     * You can apply them to a type of audit check, to all findings from an
     * audit, or to a specific set of findings.
     * </p>
     *
     * @param target <p>
     *            Specifies the audit findings to which the mitigation actions
     *            are applied. You can apply them to a type of audit check, to
     *            all findings from an audit, or to a specific set of findings.
     *            </p>
     */
    public void setTarget(AuditMitigationActionsTaskTarget target) {
        this.target = target;
    }

    /**
     * <p>
     * Specifies the audit findings to which the mitigation actions are applied.
     * You can apply them to a type of audit check, to all findings from an
     * audit, or to a specific set of findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param target <p>
     *            Specifies the audit findings to which the mitigation actions
     *            are applied. You can apply them to a type of audit check, to
     *            all findings from an audit, or to a specific set of findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAuditMitigationActionsTaskRequest withTarget(AuditMitigationActionsTaskTarget target) {
        this.target = target;
        return this;
    }

    /**
     * <p>
     * For an audit check, specifies which mitigation actions to apply. Those
     * actions must be defined in your Amazon Web Services accounts.
     * </p>
     *
     * @return <p>
     *         For an audit check, specifies which mitigation actions to apply.
     *         Those actions must be defined in your Amazon Web Services
     *         accounts.
     *         </p>
     */
    public java.util.Map<String, java.util.List<String>> getAuditCheckToActionsMapping() {
        return auditCheckToActionsMapping;
    }

    /**
     * <p>
     * For an audit check, specifies which mitigation actions to apply. Those
     * actions must be defined in your Amazon Web Services accounts.
     * </p>
     *
     * @param auditCheckToActionsMapping <p>
     *            For an audit check, specifies which mitigation actions to
     *            apply. Those actions must be defined in your Amazon Web
     *            Services accounts.
     *            </p>
     */
    public void setAuditCheckToActionsMapping(
            java.util.Map<String, java.util.List<String>> auditCheckToActionsMapping) {
        this.auditCheckToActionsMapping = auditCheckToActionsMapping;
    }

    /**
     * <p>
     * For an audit check, specifies which mitigation actions to apply. Those
     * actions must be defined in your Amazon Web Services accounts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param auditCheckToActionsMapping <p>
     *            For an audit check, specifies which mitigation actions to
     *            apply. Those actions must be defined in your Amazon Web
     *            Services accounts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAuditMitigationActionsTaskRequest withAuditCheckToActionsMapping(
            java.util.Map<String, java.util.List<String>> auditCheckToActionsMapping) {
        this.auditCheckToActionsMapping = auditCheckToActionsMapping;
        return this;
    }

    /**
     * <p>
     * For an audit check, specifies which mitigation actions to apply. Those
     * actions must be defined in your Amazon Web Services accounts.
     * </p>
     * <p>
     * The method adds a new key-value pair into auditCheckToActionsMapping
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into
     *            auditCheckToActionsMapping.
     * @param value The corresponding value of the entry to be added into
     *            auditCheckToActionsMapping.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAuditMitigationActionsTaskRequest addauditCheckToActionsMappingEntry(String key,
            java.util.List<String> value) {
        if (null == this.auditCheckToActionsMapping) {
            this.auditCheckToActionsMapping = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.auditCheckToActionsMapping.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.auditCheckToActionsMapping.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into auditCheckToActionsMapping.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public StartAuditMitigationActionsTaskRequest clearauditCheckToActionsMappingEntries() {
        this.auditCheckToActionsMapping = null;
        return this;
    }

    /**
     * <p>
     * Each audit mitigation task must have a unique client request token. If
     * you try to start a new task with the same token as a task that already
     * exists, an exception occurs. If you omit this value, a unique client
     * request token is generated automatically.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @return <p>
     *         Each audit mitigation task must have a unique client request
     *         token. If you try to start a new task with the same token as a
     *         task that already exists, an exception occurs. If you omit this
     *         value, a unique client request token is generated automatically.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * Each audit mitigation task must have a unique client request token. If
     * you try to start a new task with the same token as a task that already
     * exists, an exception occurs. If you omit this value, a unique client
     * request token is generated automatically.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param clientRequestToken <p>
     *            Each audit mitigation task must have a unique client request
     *            token. If you try to start a new task with the same token as a
     *            task that already exists, an exception occurs. If you omit
     *            this value, a unique client request token is generated
     *            automatically.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Each audit mitigation task must have a unique client request token. If
     * you try to start a new task with the same token as a task that already
     * exists, an exception occurs. If you omit this value, a unique client
     * request token is generated automatically.
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
     *            Each audit mitigation task must have a unique client request
     *            token. If you try to start a new task with the same token as a
     *            task that already exists, an exception occurs. If you omit
     *            this value, a unique client request token is generated
     *            automatically.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAuditMitigationActionsTaskRequest withClientRequestToken(String clientRequestToken) {
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
        if (getAuditCheckToActionsMapping() != null)
            sb.append("auditCheckToActionsMapping: " + getAuditCheckToActionsMapping() + ",");
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
        hashCode = prime
                * hashCode
                + ((getAuditCheckToActionsMapping() == null) ? 0 : getAuditCheckToActionsMapping()
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

        if (obj instanceof StartAuditMitigationActionsTaskRequest == false)
            return false;
        StartAuditMitigationActionsTaskRequest other = (StartAuditMitigationActionsTaskRequest) obj;

        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getAuditCheckToActionsMapping() == null
                ^ this.getAuditCheckToActionsMapping() == null)
            return false;
        if (other.getAuditCheckToActionsMapping() != null
                && other.getAuditCheckToActionsMapping().equals(
                        this.getAuditCheckToActionsMapping()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }
}
