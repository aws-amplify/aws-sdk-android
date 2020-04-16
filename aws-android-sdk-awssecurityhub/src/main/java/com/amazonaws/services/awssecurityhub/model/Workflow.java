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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about the status of the investigation into a finding.
 * </p>
 */
public class Workflow implements Serializable {
    /**
     * <p>
     * The status of the investigation into the finding. The allowed values are
     * the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code> - The initial state of a finding, before it is reviewed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTIFIED</code> - Indicates that you notified the resource owner
     * about the security issue. Used when the initial reviewer is not the
     * resource owner, and needs intervention from the resource owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUPPRESSED</code> - The finding will not be reviewed again and will
     * not be acted upon.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOLVED</code> - The finding was reviewed and remediated and is
     * now considered resolved.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NEW, NOTIFIED, RESOLVED, SUPPRESSED
     */
    private String status;

    /**
     * <p>
     * The status of the investigation into the finding. The allowed values are
     * the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code> - The initial state of a finding, before it is reviewed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTIFIED</code> - Indicates that you notified the resource owner
     * about the security issue. Used when the initial reviewer is not the
     * resource owner, and needs intervention from the resource owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUPPRESSED</code> - The finding will not be reviewed again and will
     * not be acted upon.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOLVED</code> - The finding was reviewed and remediated and is
     * now considered resolved.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NEW, NOTIFIED, RESOLVED, SUPPRESSED
     *
     * @return <p>
     *         The status of the investigation into the finding. The allowed
     *         values are the following.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NEW</code> - The initial state of a finding, before it is
     *         reviewed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOTIFIED</code> - Indicates that you notified the resource
     *         owner about the security issue. Used when the initial reviewer is
     *         not the resource owner, and needs intervention from the resource
     *         owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUPPRESSED</code> - The finding will not be reviewed again
     *         and will not be acted upon.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RESOLVED</code> - The finding was reviewed and remediated
     *         and is now considered resolved.
     *         </p>
     *         </li>
     *         </ul>
     * @see WorkflowStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the investigation into the finding. The allowed values are
     * the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code> - The initial state of a finding, before it is reviewed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTIFIED</code> - Indicates that you notified the resource owner
     * about the security issue. Used when the initial reviewer is not the
     * resource owner, and needs intervention from the resource owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUPPRESSED</code> - The finding will not be reviewed again and will
     * not be acted upon.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOLVED</code> - The finding was reviewed and remediated and is
     * now considered resolved.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NEW, NOTIFIED, RESOLVED, SUPPRESSED
     *
     * @param status <p>
     *            The status of the investigation into the finding. The allowed
     *            values are the following.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NEW</code> - The initial state of a finding, before it
     *            is reviewed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOTIFIED</code> - Indicates that you notified the
     *            resource owner about the security issue. Used when the initial
     *            reviewer is not the resource owner, and needs intervention
     *            from the resource owner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUPPRESSED</code> - The finding will not be reviewed
     *            again and will not be acted upon.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RESOLVED</code> - The finding was reviewed and
     *            remediated and is now considered resolved.
     *            </p>
     *            </li>
     *            </ul>
     * @see WorkflowStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the investigation into the finding. The allowed values are
     * the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code> - The initial state of a finding, before it is reviewed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTIFIED</code> - Indicates that you notified the resource owner
     * about the security issue. Used when the initial reviewer is not the
     * resource owner, and needs intervention from the resource owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUPPRESSED</code> - The finding will not be reviewed again and will
     * not be acted upon.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOLVED</code> - The finding was reviewed and remediated and is
     * now considered resolved.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NEW, NOTIFIED, RESOLVED, SUPPRESSED
     *
     * @param status <p>
     *            The status of the investigation into the finding. The allowed
     *            values are the following.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NEW</code> - The initial state of a finding, before it
     *            is reviewed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOTIFIED</code> - Indicates that you notified the
     *            resource owner about the security issue. Used when the initial
     *            reviewer is not the resource owner, and needs intervention
     *            from the resource owner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUPPRESSED</code> - The finding will not be reviewed
     *            again and will not be acted upon.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RESOLVED</code> - The finding was reviewed and
     *            remediated and is now considered resolved.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WorkflowStatus
     */
    public Workflow withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the investigation into the finding. The allowed values are
     * the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code> - The initial state of a finding, before it is reviewed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTIFIED</code> - Indicates that you notified the resource owner
     * about the security issue. Used when the initial reviewer is not the
     * resource owner, and needs intervention from the resource owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUPPRESSED</code> - The finding will not be reviewed again and will
     * not be acted upon.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOLVED</code> - The finding was reviewed and remediated and is
     * now considered resolved.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NEW, NOTIFIED, RESOLVED, SUPPRESSED
     *
     * @param status <p>
     *            The status of the investigation into the finding. The allowed
     *            values are the following.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NEW</code> - The initial state of a finding, before it
     *            is reviewed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOTIFIED</code> - Indicates that you notified the
     *            resource owner about the security issue. Used when the initial
     *            reviewer is not the resource owner, and needs intervention
     *            from the resource owner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUPPRESSED</code> - The finding will not be reviewed
     *            again and will not be acted upon.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RESOLVED</code> - The finding was reviewed and
     *            remediated and is now considered resolved.
     *            </p>
     *            </li>
     *            </ul>
     * @see WorkflowStatus
     */
    public void setStatus(WorkflowStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the investigation into the finding. The allowed values are
     * the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code> - The initial state of a finding, before it is reviewed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTIFIED</code> - Indicates that you notified the resource owner
     * about the security issue. Used when the initial reviewer is not the
     * resource owner, and needs intervention from the resource owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUPPRESSED</code> - The finding will not be reviewed again and will
     * not be acted upon.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOLVED</code> - The finding was reviewed and remediated and is
     * now considered resolved.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NEW, NOTIFIED, RESOLVED, SUPPRESSED
     *
     * @param status <p>
     *            The status of the investigation into the finding. The allowed
     *            values are the following.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NEW</code> - The initial state of a finding, before it
     *            is reviewed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOTIFIED</code> - Indicates that you notified the
     *            resource owner about the security issue. Used when the initial
     *            reviewer is not the resource owner, and needs intervention
     *            from the resource owner.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUPPRESSED</code> - The finding will not be reviewed
     *            again and will not be acted upon.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RESOLVED</code> - The finding was reviewed and
     *            remediated and is now considered resolved.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WorkflowStatus
     */
    public Workflow withStatus(WorkflowStatus status) {
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Workflow == false)
            return false;
        Workflow other = (Workflow) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
