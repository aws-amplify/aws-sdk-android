/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * Status information about the instance association.
 * </p>
 */
public class InstanceAssociationStatusInfo implements Serializable {
    /**
     * <p>
     * The association ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     */
    private String associationId;

    /**
     * <p>
     * The name of the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     */
    private String name;

    /**
     * <p>
     * The association document versions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     */
    private String documentVersion;

    /**
     * <p>
     * The version of the association applied to the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST)|([1-9][0-9]*)<br/>
     */
    private String associationVersion;

    /**
     * <p>
     * The instance ID where the association was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The date the instance association ran.
     * </p>
     */
    private java.util.Date executionDate;

    /**
     * <p>
     * Status information about the instance association.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Detailed status information about the instance association.
     * </p>
     */
    private String detailedStatus;

    /**
     * <p>
     * Summary information about association execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String executionSummary;

    /**
     * <p>
     * An error code returned by the request to create the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10<br/>
     */
    private String errorCode;

    /**
     * <p>
     * A URL for an Amazon S3 bucket where you want to store the results of this
     * request.
     * </p>
     */
    private InstanceAssociationOutputUrl outputUrl;

    /**
     * <p>
     * The name of the association applied to the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     */
    private String associationName;

    /**
     * <p>
     * The association ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @return <p>
     *         The association ID.
     *         </p>
     */
    public String getAssociationId() {
        return associationId;
    }

    /**
     * <p>
     * The association ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @param associationId <p>
     *            The association ID.
     *            </p>
     */
    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The association ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4
     * }-[0-9a-fA-F]{12}<br/>
     *
     * @param associationId <p>
     *            The association ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceAssociationStatusInfo withAssociationId(String associationId) {
        this.associationId = associationId;
        return this;
    }

    /**
     * <p>
     * The name of the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     *
     * @return <p>
     *         The name of the association.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     *
     * @param name <p>
     *            The name of the association.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     *
     * @param name <p>
     *            The name of the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceAssociationStatusInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The association document versions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @return <p>
     *         The association document versions.
     *         </p>
     */
    public String getDocumentVersion() {
        return documentVersion;
    }

    /**
     * <p>
     * The association document versions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param documentVersion <p>
     *            The association document versions.
     *            </p>
     */
    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The association document versions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param documentVersion <p>
     *            The association document versions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceAssociationStatusInfo withDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
        return this;
    }

    /**
     * <p>
     * The version of the association applied to the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST)|([1-9][0-9]*)<br/>
     *
     * @return <p>
     *         The version of the association applied to the instance.
     *         </p>
     */
    public String getAssociationVersion() {
        return associationVersion;
    }

    /**
     * <p>
     * The version of the association applied to the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST)|([1-9][0-9]*)<br/>
     *
     * @param associationVersion <p>
     *            The version of the association applied to the instance.
     *            </p>
     */
    public void setAssociationVersion(String associationVersion) {
        this.associationVersion = associationVersion;
    }

    /**
     * <p>
     * The version of the association applied to the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST)|([1-9][0-9]*)<br/>
     *
     * @param associationVersion <p>
     *            The version of the association applied to the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceAssociationStatusInfo withAssociationVersion(String associationVersion) {
        this.associationVersion = associationVersion;
        return this;
    }

    /**
     * <p>
     * The instance ID where the association was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @return <p>
     *         The instance ID where the association was created.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The instance ID where the association was created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @param instanceId <p>
     *            The instance ID where the association was created.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID where the association was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @param instanceId <p>
     *            The instance ID where the association was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceAssociationStatusInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The date the instance association ran.
     * </p>
     *
     * @return <p>
     *         The date the instance association ran.
     *         </p>
     */
    public java.util.Date getExecutionDate() {
        return executionDate;
    }

    /**
     * <p>
     * The date the instance association ran.
     * </p>
     *
     * @param executionDate <p>
     *            The date the instance association ran.
     *            </p>
     */
    public void setExecutionDate(java.util.Date executionDate) {
        this.executionDate = executionDate;
    }

    /**
     * <p>
     * The date the instance association ran.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executionDate <p>
     *            The date the instance association ran.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceAssociationStatusInfo withExecutionDate(java.util.Date executionDate) {
        this.executionDate = executionDate;
        return this;
    }

    /**
     * <p>
     * Status information about the instance association.
     * </p>
     *
     * @return <p>
     *         Status information about the instance association.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Status information about the instance association.
     * </p>
     *
     * @param status <p>
     *            Status information about the instance association.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status information about the instance association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            Status information about the instance association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceAssociationStatusInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Detailed status information about the instance association.
     * </p>
     *
     * @return <p>
     *         Detailed status information about the instance association.
     *         </p>
     */
    public String getDetailedStatus() {
        return detailedStatus;
    }

    /**
     * <p>
     * Detailed status information about the instance association.
     * </p>
     *
     * @param detailedStatus <p>
     *            Detailed status information about the instance association.
     *            </p>
     */
    public void setDetailedStatus(String detailedStatus) {
        this.detailedStatus = detailedStatus;
    }

    /**
     * <p>
     * Detailed status information about the instance association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detailedStatus <p>
     *            Detailed status information about the instance association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceAssociationStatusInfo withDetailedStatus(String detailedStatus) {
        this.detailedStatus = detailedStatus;
        return this;
    }

    /**
     * <p>
     * Summary information about association execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return <p>
     *         Summary information about association execution.
     *         </p>
     */
    public String getExecutionSummary() {
        return executionSummary;
    }

    /**
     * <p>
     * Summary information about association execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param executionSummary <p>
     *            Summary information about association execution.
     *            </p>
     */
    public void setExecutionSummary(String executionSummary) {
        this.executionSummary = executionSummary;
    }

    /**
     * <p>
     * Summary information about association execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param executionSummary <p>
     *            Summary information about association execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceAssociationStatusInfo withExecutionSummary(String executionSummary) {
        this.executionSummary = executionSummary;
        return this;
    }

    /**
     * <p>
     * An error code returned by the request to create the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10<br/>
     *
     * @return <p>
     *         An error code returned by the request to create the association.
     *         </p>
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * <p>
     * An error code returned by the request to create the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10<br/>
     *
     * @param errorCode <p>
     *            An error code returned by the request to create the
     *            association.
     *            </p>
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * An error code returned by the request to create the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10<br/>
     *
     * @param errorCode <p>
     *            An error code returned by the request to create the
     *            association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceAssociationStatusInfo withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * <p>
     * A URL for an Amazon S3 bucket where you want to store the results of this
     * request.
     * </p>
     *
     * @return <p>
     *         A URL for an Amazon S3 bucket where you want to store the results
     *         of this request.
     *         </p>
     */
    public InstanceAssociationOutputUrl getOutputUrl() {
        return outputUrl;
    }

    /**
     * <p>
     * A URL for an Amazon S3 bucket where you want to store the results of this
     * request.
     * </p>
     *
     * @param outputUrl <p>
     *            A URL for an Amazon S3 bucket where you want to store the
     *            results of this request.
     *            </p>
     */
    public void setOutputUrl(InstanceAssociationOutputUrl outputUrl) {
        this.outputUrl = outputUrl;
    }

    /**
     * <p>
     * A URL for an Amazon S3 bucket where you want to store the results of this
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputUrl <p>
     *            A URL for an Amazon S3 bucket where you want to store the
     *            results of this request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceAssociationStatusInfo withOutputUrl(InstanceAssociationOutputUrl outputUrl) {
        this.outputUrl = outputUrl;
        return this;
    }

    /**
     * <p>
     * The name of the association applied to the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>
     *         The name of the association applied to the instance.
     *         </p>
     */
    public String getAssociationName() {
        return associationName;
    }

    /**
     * <p>
     * The name of the association applied to the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param associationName <p>
     *            The name of the association applied to the instance.
     *            </p>
     */
    public void setAssociationName(String associationName) {
        this.associationName = associationName;
    }

    /**
     * <p>
     * The name of the association applied to the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param associationName <p>
     *            The name of the association applied to the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceAssociationStatusInfo withAssociationName(String associationName) {
        this.associationName = associationName;
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
        if (getAssociationId() != null)
            sb.append("AssociationId: " + getAssociationId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: " + getDocumentVersion() + ",");
        if (getAssociationVersion() != null)
            sb.append("AssociationVersion: " + getAssociationVersion() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getExecutionDate() != null)
            sb.append("ExecutionDate: " + getExecutionDate() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getDetailedStatus() != null)
            sb.append("DetailedStatus: " + getDetailedStatus() + ",");
        if (getExecutionSummary() != null)
            sb.append("ExecutionSummary: " + getExecutionSummary() + ",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: " + getErrorCode() + ",");
        if (getOutputUrl() != null)
            sb.append("OutputUrl: " + getOutputUrl() + ",");
        if (getAssociationName() != null)
            sb.append("AssociationName: " + getAssociationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode
                + ((getAssociationVersion() == null) ? 0 : getAssociationVersion().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionDate() == null) ? 0 : getExecutionDate().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getDetailedStatus() == null) ? 0 : getDetailedStatus().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionSummary() == null) ? 0 : getExecutionSummary().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getOutputUrl() == null) ? 0 : getOutputUrl().hashCode());
        hashCode = prime * hashCode
                + ((getAssociationName() == null) ? 0 : getAssociationName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceAssociationStatusInfo == false)
            return false;
        InstanceAssociationStatusInfo other = (InstanceAssociationStatusInfo) obj;

        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null
                && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null
                && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getAssociationVersion() == null ^ this.getAssociationVersion() == null)
            return false;
        if (other.getAssociationVersion() != null
                && other.getAssociationVersion().equals(this.getAssociationVersion()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getExecutionDate() == null ^ this.getExecutionDate() == null)
            return false;
        if (other.getExecutionDate() != null
                && other.getExecutionDate().equals(this.getExecutionDate()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDetailedStatus() == null ^ this.getDetailedStatus() == null)
            return false;
        if (other.getDetailedStatus() != null
                && other.getDetailedStatus().equals(this.getDetailedStatus()) == false)
            return false;
        if (other.getExecutionSummary() == null ^ this.getExecutionSummary() == null)
            return false;
        if (other.getExecutionSummary() != null
                && other.getExecutionSummary().equals(this.getExecutionSummary()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null
                && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getOutputUrl() == null ^ this.getOutputUrl() == null)
            return false;
        if (other.getOutputUrl() != null
                && other.getOutputUrl().equals(this.getOutputUrl()) == false)
            return false;
        if (other.getAssociationName() == null ^ this.getAssociationName() == null)
            return false;
        if (other.getAssociationName() != null
                && other.getAssociationName().equals(this.getAssociationName()) == false)
            return false;
        return true;
    }
}
