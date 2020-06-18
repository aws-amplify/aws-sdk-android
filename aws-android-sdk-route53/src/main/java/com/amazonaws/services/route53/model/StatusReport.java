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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains the status that one Amazon Route 53 health
 * checker reports and the time of the health check.
 * </p>
 */
public class StatusReport implements Serializable {
    /**
     * <p>
     * A description of the status of the health check endpoint as reported by
     * one of the Amazon Route 53 health checkers.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The date and time that the health checker performed the health check in
     * <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601 format</a> and
     * Coordinated Universal Time (UTC). For example, the value
     * <code>2017-03-27T17:48:16.751Z</code> represents March 27, 2017 at
     * 17:48:16.751 UTC.
     * </p>
     */
    private java.util.Date checkedTime;

    /**
     * <p>
     * A description of the status of the health check endpoint as reported by
     * one of the Amazon Route 53 health checkers.
     * </p>
     *
     * @return <p>
     *         A description of the status of the health check endpoint as
     *         reported by one of the Amazon Route 53 health checkers.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * A description of the status of the health check endpoint as reported by
     * one of the Amazon Route 53 health checkers.
     * </p>
     *
     * @param status <p>
     *            A description of the status of the health check endpoint as
     *            reported by one of the Amazon Route 53 health checkers.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A description of the status of the health check endpoint as reported by
     * one of the Amazon Route 53 health checkers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            A description of the status of the health check endpoint as
     *            reported by one of the Amazon Route 53 health checkers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StatusReport withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The date and time that the health checker performed the health check in
     * <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601 format</a> and
     * Coordinated Universal Time (UTC). For example, the value
     * <code>2017-03-27T17:48:16.751Z</code> represents March 27, 2017 at
     * 17:48:16.751 UTC.
     * </p>
     *
     * @return <p>
     *         The date and time that the health checker performed the health
     *         check in <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO
     *         8601 format</a> and Coordinated Universal Time (UTC). For
     *         example, the value <code>2017-03-27T17:48:16.751Z</code>
     *         represents March 27, 2017 at 17:48:16.751 UTC.
     *         </p>
     */
    public java.util.Date getCheckedTime() {
        return checkedTime;
    }

    /**
     * <p>
     * The date and time that the health checker performed the health check in
     * <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601 format</a> and
     * Coordinated Universal Time (UTC). For example, the value
     * <code>2017-03-27T17:48:16.751Z</code> represents March 27, 2017 at
     * 17:48:16.751 UTC.
     * </p>
     *
     * @param checkedTime <p>
     *            The date and time that the health checker performed the health
     *            check in <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO
     *            8601 format</a> and Coordinated Universal Time (UTC). For
     *            example, the value <code>2017-03-27T17:48:16.751Z</code>
     *            represents March 27, 2017 at 17:48:16.751 UTC.
     *            </p>
     */
    public void setCheckedTime(java.util.Date checkedTime) {
        this.checkedTime = checkedTime;
    }

    /**
     * <p>
     * The date and time that the health checker performed the health check in
     * <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601 format</a> and
     * Coordinated Universal Time (UTC). For example, the value
     * <code>2017-03-27T17:48:16.751Z</code> represents March 27, 2017 at
     * 17:48:16.751 UTC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param checkedTime <p>
     *            The date and time that the health checker performed the health
     *            check in <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO
     *            8601 format</a> and Coordinated Universal Time (UTC). For
     *            example, the value <code>2017-03-27T17:48:16.751Z</code>
     *            represents March 27, 2017 at 17:48:16.751 UTC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StatusReport withCheckedTime(java.util.Date checkedTime) {
        this.checkedTime = checkedTime;
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
            sb.append("Status: " + getStatus() + ",");
        if (getCheckedTime() != null)
            sb.append("CheckedTime: " + getCheckedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCheckedTime() == null) ? 0 : getCheckedTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StatusReport == false)
            return false;
        StatusReport other = (StatusReport) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCheckedTime() == null ^ this.getCheckedTime() == null)
            return false;
        if (other.getCheckedTime() != null
                && other.getCheckedTime().equals(this.getCheckedTime()) == false)
            return false;
        return true;
    }
}
