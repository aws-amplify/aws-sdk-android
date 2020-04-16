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
 * Information about a Session Manager connection to an instance.
 * </p>
 */
public class Session implements Serializable {
    /**
     * <p>
     * The ID of the session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 96<br/>
     */
    private String sessionId;

    /**
     * <p>
     * The instance that the Session Manager session connected to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 400<br/>
     */
    private String target;

    /**
     * <p>
     * The status of the session. For example, "Connected" or "Terminated".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Connected, Connecting, Disconnected, Terminated,
     * Terminating, Failed
     */
    private String status;

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, when the session began.
     * </p>
     */
    private java.util.Date startDate;

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, when the session was
     * terminated.
     * </p>
     */
    private java.util.Date endDate;

    /**
     * <p>
     * The name of the Session Manager SSM document used to define the
     * parameters and plugin settings for the session. For example,
     * <code>SSM-SessionManagerRunShell</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     */
    private String documentName;

    /**
     * <p>
     * The ID of the AWS user account that started the session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String owner;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String details;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private SessionManagerOutputUrl outputUrl;

    /**
     * <p>
     * The ID of the session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 96<br/>
     *
     * @return <p>
     *         The ID of the session.
     *         </p>
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * <p>
     * The ID of the session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 96<br/>
     *
     * @param sessionId <p>
     *            The ID of the session.
     *            </p>
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The ID of the session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 96<br/>
     *
     * @param sessionId <p>
     *            The ID of the session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Session withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * <p>
     * The instance that the Session Manager session connected to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 400<br/>
     *
     * @return <p>
     *         The instance that the Session Manager session connected to.
     *         </p>
     */
    public String getTarget() {
        return target;
    }

    /**
     * <p>
     * The instance that the Session Manager session connected to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 400<br/>
     *
     * @param target <p>
     *            The instance that the Session Manager session connected to.
     *            </p>
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The instance that the Session Manager session connected to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 400<br/>
     *
     * @param target <p>
     *            The instance that the Session Manager session connected to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Session withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * <p>
     * The status of the session. For example, "Connected" or "Terminated".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Connected, Connecting, Disconnected, Terminated,
     * Terminating, Failed
     *
     * @return <p>
     *         The status of the session. For example, "Connected" or
     *         "Terminated".
     *         </p>
     * @see SessionStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the session. For example, "Connected" or "Terminated".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Connected, Connecting, Disconnected, Terminated,
     * Terminating, Failed
     *
     * @param status <p>
     *            The status of the session. For example, "Connected" or
     *            "Terminated".
     *            </p>
     * @see SessionStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the session. For example, "Connected" or "Terminated".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Connected, Connecting, Disconnected, Terminated,
     * Terminating, Failed
     *
     * @param status <p>
     *            The status of the session. For example, "Connected" or
     *            "Terminated".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SessionStatus
     */
    public Session withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the session. For example, "Connected" or "Terminated".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Connected, Connecting, Disconnected, Terminated,
     * Terminating, Failed
     *
     * @param status <p>
     *            The status of the session. For example, "Connected" or
     *            "Terminated".
     *            </p>
     * @see SessionStatus
     */
    public void setStatus(SessionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the session. For example, "Connected" or "Terminated".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Connected, Connecting, Disconnected, Terminated,
     * Terminating, Failed
     *
     * @param status <p>
     *            The status of the session. For example, "Connected" or
     *            "Terminated".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SessionStatus
     */
    public Session withStatus(SessionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, when the session began.
     * </p>
     *
     * @return <p>
     *         The date and time, in ISO-8601 Extended format, when the session
     *         began.
     *         </p>
     */
    public java.util.Date getStartDate() {
        return startDate;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, when the session began.
     * </p>
     *
     * @param startDate <p>
     *            The date and time, in ISO-8601 Extended format, when the
     *            session began.
     *            </p>
     */
    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, when the session began.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startDate <p>
     *            The date and time, in ISO-8601 Extended format, when the
     *            session began.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Session withStartDate(java.util.Date startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, when the session was
     * terminated.
     * </p>
     *
     * @return <p>
     *         The date and time, in ISO-8601 Extended format, when the session
     *         was terminated.
     *         </p>
     */
    public java.util.Date getEndDate() {
        return endDate;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, when the session was
     * terminated.
     * </p>
     *
     * @param endDate <p>
     *            The date and time, in ISO-8601 Extended format, when the
     *            session was terminated.
     *            </p>
     */
    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The date and time, in ISO-8601 Extended format, when the session was
     * terminated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endDate <p>
     *            The date and time, in ISO-8601 Extended format, when the
     *            session was terminated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Session withEndDate(java.util.Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * <p>
     * The name of the Session Manager SSM document used to define the
     * parameters and plugin settings for the session. For example,
     * <code>SSM-SessionManagerRunShell</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>
     *         The name of the Session Manager SSM document used to define the
     *         parameters and plugin settings for the session. For example,
     *         <code>SSM-SessionManagerRunShell</code>.
     *         </p>
     */
    public String getDocumentName() {
        return documentName;
    }

    /**
     * <p>
     * The name of the Session Manager SSM document used to define the
     * parameters and plugin settings for the session. For example,
     * <code>SSM-SessionManagerRunShell</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param documentName <p>
     *            The name of the Session Manager SSM document used to define
     *            the parameters and plugin settings for the session. For
     *            example, <code>SSM-SessionManagerRunShell</code>.
     *            </p>
     */
    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * <p>
     * The name of the Session Manager SSM document used to define the
     * parameters and plugin settings for the session. For example,
     * <code>SSM-SessionManagerRunShell</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param documentName <p>
     *            The name of the Session Manager SSM document used to define
     *            the parameters and plugin settings for the session. For
     *            example, <code>SSM-SessionManagerRunShell</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Session withDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS user account that started the session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The ID of the AWS user account that started the session.
     *         </p>
     */
    public String getOwner() {
        return owner;
    }

    /**
     * <p>
     * The ID of the AWS user account that started the session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param owner <p>
     *            The ID of the AWS user account that started the session.
     *            </p>
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The ID of the AWS user account that started the session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param owner <p>
     *            The ID of the AWS user account that started the session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Session withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public String getDetails() {
        return details;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param details <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param details <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Session withDetails(String details) {
        this.details = details;
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public SessionManagerOutputUrl getOutputUrl() {
        return outputUrl;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param outputUrl <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setOutputUrl(SessionManagerOutputUrl outputUrl) {
        this.outputUrl = outputUrl;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputUrl <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Session withOutputUrl(SessionManagerOutputUrl outputUrl) {
        this.outputUrl = outputUrl;
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
        if (getSessionId() != null)
            sb.append("SessionId: " + getSessionId() + ",");
        if (getTarget() != null)
            sb.append("Target: " + getTarget() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStartDate() != null)
            sb.append("StartDate: " + getStartDate() + ",");
        if (getEndDate() != null)
            sb.append("EndDate: " + getEndDate() + ",");
        if (getDocumentName() != null)
            sb.append("DocumentName: " + getDocumentName() + ",");
        if (getOwner() != null)
            sb.append("Owner: " + getOwner() + ",");
        if (getDetails() != null)
            sb.append("Details: " + getDetails() + ",");
        if (getOutputUrl() != null)
            sb.append("OutputUrl: " + getOutputUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentName() == null) ? 0 : getDocumentName().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        hashCode = prime * hashCode + ((getOutputUrl() == null) ? 0 : getOutputUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Session == false)
            return false;
        Session other = (Session) obj;

        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null
                && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null
                && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getDocumentName() == null ^ this.getDocumentName() == null)
            return false;
        if (other.getDocumentName() != null
                && other.getDocumentName().equals(this.getDocumentName()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        if (other.getOutputUrl() == null ^ this.getOutputUrl() == null)
            return false;
        if (other.getOutputUrl() != null
                && other.getOutputUrl().equals(this.getOutputUrl()) == false)
            return false;
        return true;
    }
}
