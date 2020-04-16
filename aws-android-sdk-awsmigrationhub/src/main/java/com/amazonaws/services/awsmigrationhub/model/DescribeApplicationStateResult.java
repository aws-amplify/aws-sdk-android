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

package com.amazonaws.services.awsmigrationhub.model;

import java.io.Serializable;

public class DescribeApplicationStateResult implements Serializable {
    /**
     * <p>
     * Status of the application - Not Started, In-Progress, Complete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_STARTED, IN_PROGRESS, COMPLETED
     */
    private String applicationStatus;

    /**
     * <p>
     * The timestamp when the application status was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * Status of the application - Not Started, In-Progress, Complete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_STARTED, IN_PROGRESS, COMPLETED
     *
     * @return <p>
     *         Status of the application - Not Started, In-Progress, Complete.
     *         </p>
     * @see ApplicationStatus
     */
    public String getApplicationStatus() {
        return applicationStatus;
    }

    /**
     * <p>
     * Status of the application - Not Started, In-Progress, Complete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_STARTED, IN_PROGRESS, COMPLETED
     *
     * @param applicationStatus <p>
     *            Status of the application - Not Started, In-Progress,
     *            Complete.
     *            </p>
     * @see ApplicationStatus
     */
    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    /**
     * <p>
     * Status of the application - Not Started, In-Progress, Complete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_STARTED, IN_PROGRESS, COMPLETED
     *
     * @param applicationStatus <p>
     *            Status of the application - Not Started, In-Progress,
     *            Complete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ApplicationStatus
     */
    public DescribeApplicationStateResult withApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
        return this;
    }

    /**
     * <p>
     * Status of the application - Not Started, In-Progress, Complete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_STARTED, IN_PROGRESS, COMPLETED
     *
     * @param applicationStatus <p>
     *            Status of the application - Not Started, In-Progress,
     *            Complete.
     *            </p>
     * @see ApplicationStatus
     */
    public void setApplicationStatus(ApplicationStatus applicationStatus) {
        this.applicationStatus = applicationStatus.toString();
    }

    /**
     * <p>
     * Status of the application - Not Started, In-Progress, Complete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NOT_STARTED, IN_PROGRESS, COMPLETED
     *
     * @param applicationStatus <p>
     *            Status of the application - Not Started, In-Progress,
     *            Complete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ApplicationStatus
     */
    public DescribeApplicationStateResult withApplicationStatus(ApplicationStatus applicationStatus) {
        this.applicationStatus = applicationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when the application status was last updated.
     * </p>
     *
     * @return <p>
     *         The timestamp when the application status was last updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * <p>
     * The timestamp when the application status was last updated.
     * </p>
     *
     * @param lastUpdatedTime <p>
     *            The timestamp when the application status was last updated.
     *            </p>
     */
    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The timestamp when the application status was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTime <p>
     *            The timestamp when the application status was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeApplicationStateResult withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
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
        if (getApplicationStatus() != null)
            sb.append("ApplicationStatus: " + getApplicationStatus() + ",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: " + getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationStatus() == null) ? 0 : getApplicationStatus().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeApplicationStateResult == false)
            return false;
        DescribeApplicationStateResult other = (DescribeApplicationStateResult) obj;

        if (other.getApplicationStatus() == null ^ this.getApplicationStatus() == null)
            return false;
        if (other.getApplicationStatus() != null
                && other.getApplicationStatus().equals(this.getApplicationStatus()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null
                && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }
}
