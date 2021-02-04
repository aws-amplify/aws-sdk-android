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

/**
 * <p>
 * Used in MitigationActionParams, this information identifies the target
 * findings to which the mitigation actions are applied. Only one entry appears.
 * </p>
 */
public class AuditMitigationActionsTaskTarget implements Serializable {
    /**
     * <p>
     * If the task will apply a mitigation action to findings from a specific
     * audit, this value uniquely identifies the audit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     */
    private String auditTaskId;

    /**
     * <p>
     * If the task will apply a mitigation action to one or more listed
     * findings, this value uniquely identifies those findings.
     * </p>
     */
    private java.util.List<String> findingIds;

    /**
     * <p>
     * Specifies a filter in the form of an audit check and set of reason codes
     * that identify the findings from the audit to which the audit mitigation
     * actions task apply.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> auditCheckToReasonCodeFilter;

    /**
     * <p>
     * If the task will apply a mitigation action to findings from a specific
     * audit, this value uniquely identifies the audit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @return <p>
     *         If the task will apply a mitigation action to findings from a
     *         specific audit, this value uniquely identifies the audit.
     *         </p>
     */
    public String getAuditTaskId() {
        return auditTaskId;
    }

    /**
     * <p>
     * If the task will apply a mitigation action to findings from a specific
     * audit, this value uniquely identifies the audit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @param auditTaskId <p>
     *            If the task will apply a mitigation action to findings from a
     *            specific audit, this value uniquely identifies the audit.
     *            </p>
     */
    public void setAuditTaskId(String auditTaskId) {
        this.auditTaskId = auditTaskId;
    }

    /**
     * <p>
     * If the task will apply a mitigation action to findings from a specific
     * audit, this value uniquely identifies the audit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @param auditTaskId <p>
     *            If the task will apply a mitigation action to findings from a
     *            specific audit, this value uniquely identifies the audit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditMitigationActionsTaskTarget withAuditTaskId(String auditTaskId) {
        this.auditTaskId = auditTaskId;
        return this;
    }

    /**
     * <p>
     * If the task will apply a mitigation action to one or more listed
     * findings, this value uniquely identifies those findings.
     * </p>
     *
     * @return <p>
     *         If the task will apply a mitigation action to one or more listed
     *         findings, this value uniquely identifies those findings.
     *         </p>
     */
    public java.util.List<String> getFindingIds() {
        return findingIds;
    }

    /**
     * <p>
     * If the task will apply a mitigation action to one or more listed
     * findings, this value uniquely identifies those findings.
     * </p>
     *
     * @param findingIds <p>
     *            If the task will apply a mitigation action to one or more
     *            listed findings, this value uniquely identifies those
     *            findings.
     *            </p>
     */
    public void setFindingIds(java.util.Collection<String> findingIds) {
        if (findingIds == null) {
            this.findingIds = null;
            return;
        }

        this.findingIds = new java.util.ArrayList<String>(findingIds);
    }

    /**
     * <p>
     * If the task will apply a mitigation action to one or more listed
     * findings, this value uniquely identifies those findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingIds <p>
     *            If the task will apply a mitigation action to one or more
     *            listed findings, this value uniquely identifies those
     *            findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditMitigationActionsTaskTarget withFindingIds(String... findingIds) {
        if (getFindingIds() == null) {
            this.findingIds = new java.util.ArrayList<String>(findingIds.length);
        }
        for (String value : findingIds) {
            this.findingIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * If the task will apply a mitigation action to one or more listed
     * findings, this value uniquely identifies those findings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingIds <p>
     *            If the task will apply a mitigation action to one or more
     *            listed findings, this value uniquely identifies those
     *            findings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditMitigationActionsTaskTarget withFindingIds(java.util.Collection<String> findingIds) {
        setFindingIds(findingIds);
        return this;
    }

    /**
     * <p>
     * Specifies a filter in the form of an audit check and set of reason codes
     * that identify the findings from the audit to which the audit mitigation
     * actions task apply.
     * </p>
     *
     * @return <p>
     *         Specifies a filter in the form of an audit check and set of
     *         reason codes that identify the findings from the audit to which
     *         the audit mitigation actions task apply.
     *         </p>
     */
    public java.util.Map<String, java.util.List<String>> getAuditCheckToReasonCodeFilter() {
        return auditCheckToReasonCodeFilter;
    }

    /**
     * <p>
     * Specifies a filter in the form of an audit check and set of reason codes
     * that identify the findings from the audit to which the audit mitigation
     * actions task apply.
     * </p>
     *
     * @param auditCheckToReasonCodeFilter <p>
     *            Specifies a filter in the form of an audit check and set of
     *            reason codes that identify the findings from the audit to
     *            which the audit mitigation actions task apply.
     *            </p>
     */
    public void setAuditCheckToReasonCodeFilter(
            java.util.Map<String, java.util.List<String>> auditCheckToReasonCodeFilter) {
        this.auditCheckToReasonCodeFilter = auditCheckToReasonCodeFilter;
    }

    /**
     * <p>
     * Specifies a filter in the form of an audit check and set of reason codes
     * that identify the findings from the audit to which the audit mitigation
     * actions task apply.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param auditCheckToReasonCodeFilter <p>
     *            Specifies a filter in the form of an audit check and set of
     *            reason codes that identify the findings from the audit to
     *            which the audit mitigation actions task apply.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditMitigationActionsTaskTarget withAuditCheckToReasonCodeFilter(
            java.util.Map<String, java.util.List<String>> auditCheckToReasonCodeFilter) {
        this.auditCheckToReasonCodeFilter = auditCheckToReasonCodeFilter;
        return this;
    }

    /**
     * <p>
     * Specifies a filter in the form of an audit check and set of reason codes
     * that identify the findings from the audit to which the audit mitigation
     * actions task apply.
     * </p>
     * <p>
     * The method adds a new key-value pair into auditCheckToReasonCodeFilter
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into
     *            auditCheckToReasonCodeFilter.
     * @param value The corresponding value of the entry to be added into
     *            auditCheckToReasonCodeFilter.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuditMitigationActionsTaskTarget addauditCheckToReasonCodeFilterEntry(String key,
            java.util.List<String> value) {
        if (null == this.auditCheckToReasonCodeFilter) {
            this.auditCheckToReasonCodeFilter = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.auditCheckToReasonCodeFilter.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.auditCheckToReasonCodeFilter.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into auditCheckToReasonCodeFilter.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public AuditMitigationActionsTaskTarget clearauditCheckToReasonCodeFilterEntries() {
        this.auditCheckToReasonCodeFilter = null;
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
        if (getAuditTaskId() != null)
            sb.append("auditTaskId: " + getAuditTaskId() + ",");
        if (getFindingIds() != null)
            sb.append("findingIds: " + getFindingIds() + ",");
        if (getAuditCheckToReasonCodeFilter() != null)
            sb.append("auditCheckToReasonCodeFilter: " + getAuditCheckToReasonCodeFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAuditTaskId() == null) ? 0 : getAuditTaskId().hashCode());
        hashCode = prime * hashCode + ((getFindingIds() == null) ? 0 : getFindingIds().hashCode());
        hashCode = prime
                * hashCode
                + ((getAuditCheckToReasonCodeFilter() == null) ? 0
                        : getAuditCheckToReasonCodeFilter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuditMitigationActionsTaskTarget == false)
            return false;
        AuditMitigationActionsTaskTarget other = (AuditMitigationActionsTaskTarget) obj;

        if (other.getAuditTaskId() == null ^ this.getAuditTaskId() == null)
            return false;
        if (other.getAuditTaskId() != null
                && other.getAuditTaskId().equals(this.getAuditTaskId()) == false)
            return false;
        if (other.getFindingIds() == null ^ this.getFindingIds() == null)
            return false;
        if (other.getFindingIds() != null
                && other.getFindingIds().equals(this.getFindingIds()) == false)
            return false;
        if (other.getAuditCheckToReasonCodeFilter() == null
                ^ this.getAuditCheckToReasonCodeFilter() == null)
            return false;
        if (other.getAuditCheckToReasonCodeFilter() != null
                && other.getAuditCheckToReasonCodeFilter().equals(
                        this.getAuditCheckToReasonCodeFilter()) == false)
            return false;
        return true;
    }
}
