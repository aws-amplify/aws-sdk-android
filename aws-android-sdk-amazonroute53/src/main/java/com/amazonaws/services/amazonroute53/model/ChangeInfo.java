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

package com.amazonaws.services.amazonroute53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that describes change information about changes made to your
 * hosted zone.
 * </p>
 */
public class ChangeInfo implements Serializable {
    /**
     * <p>
     * The ID of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     */
    private String id;

    /**
     * <p>
     * The current state of the request. <code>PENDING</code> indicates that
     * this request has not yet been applied to all Amazon Route 53 DNS servers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INSYNC
     */
    private String status;

    /**
     * <p>
     * The date and time that the change request was submitted in <a
     * href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601 format</a> and
     * Coordinated Universal Time (UTC). For example, the value
     * <code>2017-03-27T17:48:16.751Z</code> represents March 27, 2017 at
     * 17:48:16.751 UTC.
     * </p>
     */
    private java.util.Date submittedAt;

    /**
     * <p>
     * A complex type that describes change information about changes made to
     * your hosted zone.
     * </p>
     * <p>
     * This element contains an ID that you use when performing a <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetChange.html"
     * >GetChange</a> action to get detailed information about the change.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String comment;

    /**
     * <p>
     * The ID of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @return <p>
     *         The ID of the request.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param id <p>
     *            The ID of the request.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param id <p>
     *            The ID of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangeInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The current state of the request. <code>PENDING</code> indicates that
     * this request has not yet been applied to all Amazon Route 53 DNS servers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INSYNC
     *
     * @return <p>
     *         The current state of the request. <code>PENDING</code> indicates
     *         that this request has not yet been applied to all Amazon Route 53
     *         DNS servers.
     *         </p>
     * @see ChangeStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current state of the request. <code>PENDING</code> indicates that
     * this request has not yet been applied to all Amazon Route 53 DNS servers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INSYNC
     *
     * @param status <p>
     *            The current state of the request. <code>PENDING</code>
     *            indicates that this request has not yet been applied to all
     *            Amazon Route 53 DNS servers.
     *            </p>
     * @see ChangeStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the request. <code>PENDING</code> indicates that
     * this request has not yet been applied to all Amazon Route 53 DNS servers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INSYNC
     *
     * @param status <p>
     *            The current state of the request. <code>PENDING</code>
     *            indicates that this request has not yet been applied to all
     *            Amazon Route 53 DNS servers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeStatus
     */
    public ChangeInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current state of the request. <code>PENDING</code> indicates that
     * this request has not yet been applied to all Amazon Route 53 DNS servers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INSYNC
     *
     * @param status <p>
     *            The current state of the request. <code>PENDING</code>
     *            indicates that this request has not yet been applied to all
     *            Amazon Route 53 DNS servers.
     *            </p>
     * @see ChangeStatus
     */
    public void setStatus(ChangeStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current state of the request. <code>PENDING</code> indicates that
     * this request has not yet been applied to all Amazon Route 53 DNS servers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INSYNC
     *
     * @param status <p>
     *            The current state of the request. <code>PENDING</code>
     *            indicates that this request has not yet been applied to all
     *            Amazon Route 53 DNS servers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeStatus
     */
    public ChangeInfo withStatus(ChangeStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the change request was submitted in <a
     * href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601 format</a> and
     * Coordinated Universal Time (UTC). For example, the value
     * <code>2017-03-27T17:48:16.751Z</code> represents March 27, 2017 at
     * 17:48:16.751 UTC.
     * </p>
     *
     * @return <p>
     *         The date and time that the change request was submitted in <a
     *         href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601 format</a>
     *         and Coordinated Universal Time (UTC). For example, the value
     *         <code>2017-03-27T17:48:16.751Z</code> represents March 27, 2017
     *         at 17:48:16.751 UTC.
     *         </p>
     */
    public java.util.Date getSubmittedAt() {
        return submittedAt;
    }

    /**
     * <p>
     * The date and time that the change request was submitted in <a
     * href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601 format</a> and
     * Coordinated Universal Time (UTC). For example, the value
     * <code>2017-03-27T17:48:16.751Z</code> represents March 27, 2017 at
     * 17:48:16.751 UTC.
     * </p>
     *
     * @param submittedAt <p>
     *            The date and time that the change request was submitted in <a
     *            href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601
     *            format</a> and Coordinated Universal Time (UTC). For example,
     *            the value <code>2017-03-27T17:48:16.751Z</code> represents
     *            March 27, 2017 at 17:48:16.751 UTC.
     *            </p>
     */
    public void setSubmittedAt(java.util.Date submittedAt) {
        this.submittedAt = submittedAt;
    }

    /**
     * <p>
     * The date and time that the change request was submitted in <a
     * href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601 format</a> and
     * Coordinated Universal Time (UTC). For example, the value
     * <code>2017-03-27T17:48:16.751Z</code> represents March 27, 2017 at
     * 17:48:16.751 UTC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param submittedAt <p>
     *            The date and time that the change request was submitted in <a
     *            href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601
     *            format</a> and Coordinated Universal Time (UTC). For example,
     *            the value <code>2017-03-27T17:48:16.751Z</code> represents
     *            March 27, 2017 at 17:48:16.751 UTC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangeInfo withSubmittedAt(java.util.Date submittedAt) {
        this.submittedAt = submittedAt;
        return this;
    }

    /**
     * <p>
     * A complex type that describes change information about changes made to
     * your hosted zone.
     * </p>
     * <p>
     * This element contains an ID that you use when performing a <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetChange.html"
     * >GetChange</a> action to get detailed information about the change.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         A complex type that describes change information about changes
     *         made to your hosted zone.
     *         </p>
     *         <p>
     *         This element contains an ID that you use when performing a <a
     *         href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetChange.html"
     *         >GetChange</a> action to get detailed information about the
     *         change.
     *         </p>
     */
    public String getComment() {
        return comment;
    }

    /**
     * <p>
     * A complex type that describes change information about changes made to
     * your hosted zone.
     * </p>
     * <p>
     * This element contains an ID that you use when performing a <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetChange.html"
     * >GetChange</a> action to get detailed information about the change.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param comment <p>
     *            A complex type that describes change information about changes
     *            made to your hosted zone.
     *            </p>
     *            <p>
     *            This element contains an ID that you use when performing a <a
     *            href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetChange.html"
     *            >GetChange</a> action to get detailed information about the
     *            change.
     *            </p>
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * A complex type that describes change information about changes made to
     * your hosted zone.
     * </p>
     * <p>
     * This element contains an ID that you use when performing a <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetChange.html"
     * >GetChange</a> action to get detailed information about the change.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param comment <p>
     *            A complex type that describes change information about changes
     *            made to your hosted zone.
     *            </p>
     *            <p>
     *            This element contains an ID that you use when performing a <a
     *            href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetChange.html"
     *            >GetChange</a> action to get detailed information about the
     *            change.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangeInfo withComment(String comment) {
        this.comment = comment;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getSubmittedAt() != null)
            sb.append("SubmittedAt: " + getSubmittedAt() + ",");
        if (getComment() != null)
            sb.append("Comment: " + getComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getSubmittedAt() == null) ? 0 : getSubmittedAt().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangeInfo == false)
            return false;
        ChangeInfo other = (ChangeInfo) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSubmittedAt() == null ^ this.getSubmittedAt() == null)
            return false;
        if (other.getSubmittedAt() != null
                && other.getSubmittedAt().equals(this.getSubmittedAt()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        return true;
    }
}
