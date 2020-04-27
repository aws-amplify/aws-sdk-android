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

package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the status for the specified findings.
 * </p>
 */
public class UpdateFindingsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the analyzer that generated the findings to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[^:]*:[^:]*:[^:]*:[^:]*:[^:]*:analyzer/.{1,255}$<br/>
     */
    private String analyzerArn;

    /**
     * <p>
     * A client token.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The IDs of the findings to update.
     * </p>
     */
    private java.util.List<String> ids;

    /**
     * <p>
     * The ARN of the resource identified in the finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:[^:]*:[^:]*:[^:]*:[^:]*:.*$<br/>
     */
    private String resourceArn;

    /**
     * <p>
     * The state represents the action to take to update the finding Status. Use
     * <code>ARCHIVE</code> to change an Active finding to an Archived finding.
     * Use <code>ACTIVE</code> to change an Archived finding to an Active
     * finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     */
    private String status;

    /**
     * <p>
     * The ARN of the analyzer that generated the findings to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[^:]*:[^:]*:[^:]*:[^:]*:[^:]*:analyzer/.{1,255}$<br/>
     *
     * @return <p>
     *         The ARN of the analyzer that generated the findings to update.
     *         </p>
     */
    public String getAnalyzerArn() {
        return analyzerArn;
    }

    /**
     * <p>
     * The ARN of the analyzer that generated the findings to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[^:]*:[^:]*:[^:]*:[^:]*:[^:]*:analyzer/.{1,255}$<br/>
     *
     * @param analyzerArn <p>
     *            The ARN of the analyzer that generated the findings to update.
     *            </p>
     */
    public void setAnalyzerArn(String analyzerArn) {
        this.analyzerArn = analyzerArn;
    }

    /**
     * <p>
     * The ARN of the analyzer that generated the findings to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[^:]*:[^:]*:[^:]*:[^:]*:[^:]*:analyzer/.{1,255}$<br/>
     *
     * @param analyzerArn <p>
     *            The ARN of the analyzer that generated the findings to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFindingsRequest withAnalyzerArn(String analyzerArn) {
        this.analyzerArn = analyzerArn;
        return this;
    }

    /**
     * <p>
     * A client token.
     * </p>
     *
     * @return <p>
     *         A client token.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A client token.
     * </p>
     *
     * @param clientToken <p>
     *            A client token.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A client token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            A client token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFindingsRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The IDs of the findings to update.
     * </p>
     *
     * @return <p>
     *         The IDs of the findings to update.
     *         </p>
     */
    public java.util.List<String> getIds() {
        return ids;
    }

    /**
     * <p>
     * The IDs of the findings to update.
     * </p>
     *
     * @param ids <p>
     *            The IDs of the findings to update.
     *            </p>
     */
    public void setIds(java.util.Collection<String> ids) {
        if (ids == null) {
            this.ids = null;
            return;
        }

        this.ids = new java.util.ArrayList<String>(ids);
    }

    /**
     * <p>
     * The IDs of the findings to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ids <p>
     *            The IDs of the findings to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFindingsRequest withIds(String... ids) {
        if (getIds() == null) {
            this.ids = new java.util.ArrayList<String>(ids.length);
        }
        for (String value : ids) {
            this.ids.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the findings to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ids <p>
     *            The IDs of the findings to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFindingsRequest withIds(java.util.Collection<String> ids) {
        setIds(ids);
        return this;
    }

    /**
     * <p>
     * The ARN of the resource identified in the finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:[^:]*:[^:]*:[^:]*:[^:]*:.*$<br/>
     *
     * @return <p>
     *         The ARN of the resource identified in the finding.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource identified in the finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:[^:]*:[^:]*:[^:]*:[^:]*:.*$<br/>
     *
     * @param resourceArn <p>
     *            The ARN of the resource identified in the finding.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource identified in the finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:[^:]*:[^:]*:[^:]*:[^:]*:.*$<br/>
     *
     * @param resourceArn <p>
     *            The ARN of the resource identified in the finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFindingsRequest withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * The state represents the action to take to update the finding Status. Use
     * <code>ARCHIVE</code> to change an Active finding to an Archived finding.
     * Use <code>ACTIVE</code> to change an Archived finding to an Active
     * finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @return <p>
     *         The state represents the action to take to update the finding
     *         Status. Use <code>ARCHIVE</code> to change an Active finding to
     *         an Archived finding. Use <code>ACTIVE</code> to change an
     *         Archived finding to an Active finding.
     *         </p>
     * @see FindingStatusUpdate
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The state represents the action to take to update the finding Status. Use
     * <code>ARCHIVE</code> to change an Active finding to an Archived finding.
     * Use <code>ACTIVE</code> to change an Archived finding to an Active
     * finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @param status <p>
     *            The state represents the action to take to update the finding
     *            Status. Use <code>ARCHIVE</code> to change an Active finding
     *            to an Archived finding. Use <code>ACTIVE</code> to change an
     *            Archived finding to an Active finding.
     *            </p>
     * @see FindingStatusUpdate
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The state represents the action to take to update the finding Status. Use
     * <code>ARCHIVE</code> to change an Active finding to an Archived finding.
     * Use <code>ACTIVE</code> to change an Archived finding to an Active
     * finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @param status <p>
     *            The state represents the action to take to update the finding
     *            Status. Use <code>ARCHIVE</code> to change an Active finding
     *            to an Archived finding. Use <code>ACTIVE</code> to change an
     *            Archived finding to an Active finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingStatusUpdate
     */
    public UpdateFindingsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The state represents the action to take to update the finding Status. Use
     * <code>ARCHIVE</code> to change an Active finding to an Archived finding.
     * Use <code>ACTIVE</code> to change an Archived finding to an Active
     * finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @param status <p>
     *            The state represents the action to take to update the finding
     *            Status. Use <code>ARCHIVE</code> to change an Active finding
     *            to an Archived finding. Use <code>ACTIVE</code> to change an
     *            Archived finding to an Active finding.
     *            </p>
     * @see FindingStatusUpdate
     */
    public void setStatus(FindingStatusUpdate status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The state represents the action to take to update the finding Status. Use
     * <code>ARCHIVE</code> to change an Active finding to an Archived finding.
     * Use <code>ACTIVE</code> to change an Archived finding to an Active
     * finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @param status <p>
     *            The state represents the action to take to update the finding
     *            Status. Use <code>ARCHIVE</code> to change an Active finding
     *            to an Archived finding. Use <code>ACTIVE</code> to change an
     *            Archived finding to an Active finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingStatusUpdate
     */
    public UpdateFindingsRequest withStatus(FindingStatusUpdate status) {
        this.status = status.toString();
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
        if (getAnalyzerArn() != null)
            sb.append("analyzerArn: " + getAnalyzerArn() + ",");
        if (getClientToken() != null)
            sb.append("clientToken: " + getClientToken() + ",");
        if (getIds() != null)
            sb.append("ids: " + getIds() + ",");
        if (getResourceArn() != null)
            sb.append("resourceArn: " + getResourceArn() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAnalyzerArn() == null) ? 0 : getAnalyzerArn().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getIds() == null) ? 0 : getIds().hashCode());
        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFindingsRequest == false)
            return false;
        UpdateFindingsRequest other = (UpdateFindingsRequest) obj;

        if (other.getAnalyzerArn() == null ^ this.getAnalyzerArn() == null)
            return false;
        if (other.getAnalyzerArn() != null
                && other.getAnalyzerArn().equals(this.getAnalyzerArn()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getIds() == null ^ this.getIds() == null)
            return false;
        if (other.getIds() != null && other.getIds().equals(this.getIds()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
