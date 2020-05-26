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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * Dashboard summary.
 * </p>
 */
public class DashboardSummary implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * Dashboard ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     */
    private String dashboardId;

    /**
     * <p>
     * A display name for the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String name;

    /**
     * <p>
     * The time that this dashboard was created.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * The last time that this dashboard was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * Published version number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long publishedVersionNumber;

    /**
     * <p>
     * The last time that this dashboard was published.
     * </p>
     */
    private java.util.Date lastPublishedTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the resource.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the resource.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DashboardSummary withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * Dashboard ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @return <p>
     *         Dashboard ID.
     *         </p>
     */
    public String getDashboardId() {
        return dashboardId;
    }

    /**
     * <p>
     * Dashboard ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @param dashboardId <p>
     *            Dashboard ID.
     *            </p>
     */
    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    /**
     * <p>
     * Dashboard ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @param dashboardId <p>
     *            Dashboard ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DashboardSummary withDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
        return this;
    }

    /**
     * <p>
     * A display name for the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         A display name for the dashboard.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A display name for the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param name <p>
     *            A display name for the dashboard.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A display name for the dashboard.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param name <p>
     *            A display name for the dashboard.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DashboardSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The time that this dashboard was created.
     * </p>
     *
     * @return <p>
     *         The time that this dashboard was created.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * The time that this dashboard was created.
     * </p>
     *
     * @param createdTime <p>
     *            The time that this dashboard was created.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time that this dashboard was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            The time that this dashboard was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DashboardSummary withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * <p>
     * The last time that this dashboard was updated.
     * </p>
     *
     * @return <p>
     *         The last time that this dashboard was updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * <p>
     * The last time that this dashboard was updated.
     * </p>
     *
     * @param lastUpdatedTime <p>
     *            The last time that this dashboard was updated.
     *            </p>
     */
    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The last time that this dashboard was updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTime <p>
     *            The last time that this dashboard was updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DashboardSummary withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    /**
     * <p>
     * Published version number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         Published version number.
     *         </p>
     */
    public Long getPublishedVersionNumber() {
        return publishedVersionNumber;
    }

    /**
     * <p>
     * Published version number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param publishedVersionNumber <p>
     *            Published version number.
     *            </p>
     */
    public void setPublishedVersionNumber(Long publishedVersionNumber) {
        this.publishedVersionNumber = publishedVersionNumber;
    }

    /**
     * <p>
     * Published version number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param publishedVersionNumber <p>
     *            Published version number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DashboardSummary withPublishedVersionNumber(Long publishedVersionNumber) {
        this.publishedVersionNumber = publishedVersionNumber;
        return this;
    }

    /**
     * <p>
     * The last time that this dashboard was published.
     * </p>
     *
     * @return <p>
     *         The last time that this dashboard was published.
     *         </p>
     */
    public java.util.Date getLastPublishedTime() {
        return lastPublishedTime;
    }

    /**
     * <p>
     * The last time that this dashboard was published.
     * </p>
     *
     * @param lastPublishedTime <p>
     *            The last time that this dashboard was published.
     *            </p>
     */
    public void setLastPublishedTime(java.util.Date lastPublishedTime) {
        this.lastPublishedTime = lastPublishedTime;
    }

    /**
     * <p>
     * The last time that this dashboard was published.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastPublishedTime <p>
     *            The last time that this dashboard was published.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DashboardSummary withLastPublishedTime(java.util.Date lastPublishedTime) {
        this.lastPublishedTime = lastPublishedTime;
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getDashboardId() != null)
            sb.append("DashboardId: " + getDashboardId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: " + getLastUpdatedTime() + ",");
        if (getPublishedVersionNumber() != null)
            sb.append("PublishedVersionNumber: " + getPublishedVersionNumber() + ",");
        if (getLastPublishedTime() != null)
            sb.append("LastPublishedTime: " + getLastPublishedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getDashboardId() == null) ? 0 : getDashboardId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getPublishedVersionNumber() == null) ? 0 : getPublishedVersionNumber()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLastPublishedTime() == null) ? 0 : getLastPublishedTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DashboardSummary == false)
            return false;
        DashboardSummary other = (DashboardSummary) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDashboardId() == null ^ this.getDashboardId() == null)
            return false;
        if (other.getDashboardId() != null
                && other.getDashboardId().equals(this.getDashboardId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null
                && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getPublishedVersionNumber() == null ^ this.getPublishedVersionNumber() == null)
            return false;
        if (other.getPublishedVersionNumber() != null
                && other.getPublishedVersionNumber().equals(this.getPublishedVersionNumber()) == false)
            return false;
        if (other.getLastPublishedTime() == null ^ this.getLastPublishedTime() == null)
            return false;
        if (other.getLastPublishedTime() != null
                && other.getLastPublishedTime().equals(this.getLastPublishedTime()) == false)
            return false;
        return true;
    }
}
