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

package com.amazonaws.services.awsdatabasemigrationservice.model;

import java.io.Serializable;

/**
 * <p>
 * In response to a request by the <code>DescribeReplicationTasks</code>
 * operation, this object provides a collection of statistics about a
 * replication task.
 * </p>
 */
public class ReplicationTaskStats implements Serializable {
    /**
     * <p>
     * The percent complete for the full load migration task.
     * </p>
     */
    private Integer fullLoadProgressPercent;

    /**
     * <p>
     * The elapsed time of the task, in milliseconds.
     * </p>
     */
    private Long elapsedTimeMillis;

    /**
     * <p>
     * The number of tables loaded for this task.
     * </p>
     */
    private Integer tablesLoaded;

    /**
     * <p>
     * The number of tables currently loading for this task.
     * </p>
     */
    private Integer tablesLoading;

    /**
     * <p>
     * The number of tables queued for this task.
     * </p>
     */
    private Integer tablesQueued;

    /**
     * <p>
     * The number of errors that have occurred during this task.
     * </p>
     */
    private Integer tablesErrored;

    /**
     * <p>
     * The date the replication task was started either with a fresh start or a
     * target reload.
     * </p>
     */
    private java.util.Date freshStartDate;

    /**
     * <p>
     * The date the replication task was started either with a fresh start or a
     * resume. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html#DMS-StartReplicationTask-request-StartReplicationTaskType"
     * >StartReplicationTaskType</a>.
     * </p>
     */
    private java.util.Date startDate;

    /**
     * <p>
     * The date the replication task was stopped.
     * </p>
     */
    private java.util.Date stopDate;

    /**
     * <p>
     * The date the replication task full load was started.
     * </p>
     */
    private java.util.Date fullLoadStartDate;

    /**
     * <p>
     * The date the replication task full load was completed.
     * </p>
     */
    private java.util.Date fullLoadFinishDate;

    /**
     * <p>
     * The percent complete for the full load migration task.
     * </p>
     *
     * @return <p>
     *         The percent complete for the full load migration task.
     *         </p>
     */
    public Integer getFullLoadProgressPercent() {
        return fullLoadProgressPercent;
    }

    /**
     * <p>
     * The percent complete for the full load migration task.
     * </p>
     *
     * @param fullLoadProgressPercent <p>
     *            The percent complete for the full load migration task.
     *            </p>
     */
    public void setFullLoadProgressPercent(Integer fullLoadProgressPercent) {
        this.fullLoadProgressPercent = fullLoadProgressPercent;
    }

    /**
     * <p>
     * The percent complete for the full load migration task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fullLoadProgressPercent <p>
     *            The percent complete for the full load migration task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTaskStats withFullLoadProgressPercent(Integer fullLoadProgressPercent) {
        this.fullLoadProgressPercent = fullLoadProgressPercent;
        return this;
    }

    /**
     * <p>
     * The elapsed time of the task, in milliseconds.
     * </p>
     *
     * @return <p>
     *         The elapsed time of the task, in milliseconds.
     *         </p>
     */
    public Long getElapsedTimeMillis() {
        return elapsedTimeMillis;
    }

    /**
     * <p>
     * The elapsed time of the task, in milliseconds.
     * </p>
     *
     * @param elapsedTimeMillis <p>
     *            The elapsed time of the task, in milliseconds.
     *            </p>
     */
    public void setElapsedTimeMillis(Long elapsedTimeMillis) {
        this.elapsedTimeMillis = elapsedTimeMillis;
    }

    /**
     * <p>
     * The elapsed time of the task, in milliseconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elapsedTimeMillis <p>
     *            The elapsed time of the task, in milliseconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTaskStats withElapsedTimeMillis(Long elapsedTimeMillis) {
        this.elapsedTimeMillis = elapsedTimeMillis;
        return this;
    }

    /**
     * <p>
     * The number of tables loaded for this task.
     * </p>
     *
     * @return <p>
     *         The number of tables loaded for this task.
     *         </p>
     */
    public Integer getTablesLoaded() {
        return tablesLoaded;
    }

    /**
     * <p>
     * The number of tables loaded for this task.
     * </p>
     *
     * @param tablesLoaded <p>
     *            The number of tables loaded for this task.
     *            </p>
     */
    public void setTablesLoaded(Integer tablesLoaded) {
        this.tablesLoaded = tablesLoaded;
    }

    /**
     * <p>
     * The number of tables loaded for this task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tablesLoaded <p>
     *            The number of tables loaded for this task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTaskStats withTablesLoaded(Integer tablesLoaded) {
        this.tablesLoaded = tablesLoaded;
        return this;
    }

    /**
     * <p>
     * The number of tables currently loading for this task.
     * </p>
     *
     * @return <p>
     *         The number of tables currently loading for this task.
     *         </p>
     */
    public Integer getTablesLoading() {
        return tablesLoading;
    }

    /**
     * <p>
     * The number of tables currently loading for this task.
     * </p>
     *
     * @param tablesLoading <p>
     *            The number of tables currently loading for this task.
     *            </p>
     */
    public void setTablesLoading(Integer tablesLoading) {
        this.tablesLoading = tablesLoading;
    }

    /**
     * <p>
     * The number of tables currently loading for this task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tablesLoading <p>
     *            The number of tables currently loading for this task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTaskStats withTablesLoading(Integer tablesLoading) {
        this.tablesLoading = tablesLoading;
        return this;
    }

    /**
     * <p>
     * The number of tables queued for this task.
     * </p>
     *
     * @return <p>
     *         The number of tables queued for this task.
     *         </p>
     */
    public Integer getTablesQueued() {
        return tablesQueued;
    }

    /**
     * <p>
     * The number of tables queued for this task.
     * </p>
     *
     * @param tablesQueued <p>
     *            The number of tables queued for this task.
     *            </p>
     */
    public void setTablesQueued(Integer tablesQueued) {
        this.tablesQueued = tablesQueued;
    }

    /**
     * <p>
     * The number of tables queued for this task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tablesQueued <p>
     *            The number of tables queued for this task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTaskStats withTablesQueued(Integer tablesQueued) {
        this.tablesQueued = tablesQueued;
        return this;
    }

    /**
     * <p>
     * The number of errors that have occurred during this task.
     * </p>
     *
     * @return <p>
     *         The number of errors that have occurred during this task.
     *         </p>
     */
    public Integer getTablesErrored() {
        return tablesErrored;
    }

    /**
     * <p>
     * The number of errors that have occurred during this task.
     * </p>
     *
     * @param tablesErrored <p>
     *            The number of errors that have occurred during this task.
     *            </p>
     */
    public void setTablesErrored(Integer tablesErrored) {
        this.tablesErrored = tablesErrored;
    }

    /**
     * <p>
     * The number of errors that have occurred during this task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tablesErrored <p>
     *            The number of errors that have occurred during this task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTaskStats withTablesErrored(Integer tablesErrored) {
        this.tablesErrored = tablesErrored;
        return this;
    }

    /**
     * <p>
     * The date the replication task was started either with a fresh start or a
     * target reload.
     * </p>
     *
     * @return <p>
     *         The date the replication task was started either with a fresh
     *         start or a target reload.
     *         </p>
     */
    public java.util.Date getFreshStartDate() {
        return freshStartDate;
    }

    /**
     * <p>
     * The date the replication task was started either with a fresh start or a
     * target reload.
     * </p>
     *
     * @param freshStartDate <p>
     *            The date the replication task was started either with a fresh
     *            start or a target reload.
     *            </p>
     */
    public void setFreshStartDate(java.util.Date freshStartDate) {
        this.freshStartDate = freshStartDate;
    }

    /**
     * <p>
     * The date the replication task was started either with a fresh start or a
     * target reload.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param freshStartDate <p>
     *            The date the replication task was started either with a fresh
     *            start or a target reload.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTaskStats withFreshStartDate(java.util.Date freshStartDate) {
        this.freshStartDate = freshStartDate;
        return this;
    }

    /**
     * <p>
     * The date the replication task was started either with a fresh start or a
     * resume. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html#DMS-StartReplicationTask-request-StartReplicationTaskType"
     * >StartReplicationTaskType</a>.
     * </p>
     *
     * @return <p>
     *         The date the replication task was started either with a fresh
     *         start or a resume. For more information, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html#DMS-StartReplicationTask-request-StartReplicationTaskType"
     *         >StartReplicationTaskType</a>.
     *         </p>
     */
    public java.util.Date getStartDate() {
        return startDate;
    }

    /**
     * <p>
     * The date the replication task was started either with a fresh start or a
     * resume. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html#DMS-StartReplicationTask-request-StartReplicationTaskType"
     * >StartReplicationTaskType</a>.
     * </p>
     *
     * @param startDate <p>
     *            The date the replication task was started either with a fresh
     *            start or a resume. For more information, see <a href=
     *            "https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html#DMS-StartReplicationTask-request-StartReplicationTaskType"
     *            >StartReplicationTaskType</a>.
     *            </p>
     */
    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The date the replication task was started either with a fresh start or a
     * resume. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html#DMS-StartReplicationTask-request-StartReplicationTaskType"
     * >StartReplicationTaskType</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startDate <p>
     *            The date the replication task was started either with a fresh
     *            start or a resume. For more information, see <a href=
     *            "https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html#DMS-StartReplicationTask-request-StartReplicationTaskType"
     *            >StartReplicationTaskType</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTaskStats withStartDate(java.util.Date startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * <p>
     * The date the replication task was stopped.
     * </p>
     *
     * @return <p>
     *         The date the replication task was stopped.
     *         </p>
     */
    public java.util.Date getStopDate() {
        return stopDate;
    }

    /**
     * <p>
     * The date the replication task was stopped.
     * </p>
     *
     * @param stopDate <p>
     *            The date the replication task was stopped.
     *            </p>
     */
    public void setStopDate(java.util.Date stopDate) {
        this.stopDate = stopDate;
    }

    /**
     * <p>
     * The date the replication task was stopped.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stopDate <p>
     *            The date the replication task was stopped.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTaskStats withStopDate(java.util.Date stopDate) {
        this.stopDate = stopDate;
        return this;
    }

    /**
     * <p>
     * The date the replication task full load was started.
     * </p>
     *
     * @return <p>
     *         The date the replication task full load was started.
     *         </p>
     */
    public java.util.Date getFullLoadStartDate() {
        return fullLoadStartDate;
    }

    /**
     * <p>
     * The date the replication task full load was started.
     * </p>
     *
     * @param fullLoadStartDate <p>
     *            The date the replication task full load was started.
     *            </p>
     */
    public void setFullLoadStartDate(java.util.Date fullLoadStartDate) {
        this.fullLoadStartDate = fullLoadStartDate;
    }

    /**
     * <p>
     * The date the replication task full load was started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fullLoadStartDate <p>
     *            The date the replication task full load was started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTaskStats withFullLoadStartDate(java.util.Date fullLoadStartDate) {
        this.fullLoadStartDate = fullLoadStartDate;
        return this;
    }

    /**
     * <p>
     * The date the replication task full load was completed.
     * </p>
     *
     * @return <p>
     *         The date the replication task full load was completed.
     *         </p>
     */
    public java.util.Date getFullLoadFinishDate() {
        return fullLoadFinishDate;
    }

    /**
     * <p>
     * The date the replication task full load was completed.
     * </p>
     *
     * @param fullLoadFinishDate <p>
     *            The date the replication task full load was completed.
     *            </p>
     */
    public void setFullLoadFinishDate(java.util.Date fullLoadFinishDate) {
        this.fullLoadFinishDate = fullLoadFinishDate;
    }

    /**
     * <p>
     * The date the replication task full load was completed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fullLoadFinishDate <p>
     *            The date the replication task full load was completed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplicationTaskStats withFullLoadFinishDate(java.util.Date fullLoadFinishDate) {
        this.fullLoadFinishDate = fullLoadFinishDate;
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
        if (getFullLoadProgressPercent() != null)
            sb.append("FullLoadProgressPercent: " + getFullLoadProgressPercent() + ",");
        if (getElapsedTimeMillis() != null)
            sb.append("ElapsedTimeMillis: " + getElapsedTimeMillis() + ",");
        if (getTablesLoaded() != null)
            sb.append("TablesLoaded: " + getTablesLoaded() + ",");
        if (getTablesLoading() != null)
            sb.append("TablesLoading: " + getTablesLoading() + ",");
        if (getTablesQueued() != null)
            sb.append("TablesQueued: " + getTablesQueued() + ",");
        if (getTablesErrored() != null)
            sb.append("TablesErrored: " + getTablesErrored() + ",");
        if (getFreshStartDate() != null)
            sb.append("FreshStartDate: " + getFreshStartDate() + ",");
        if (getStartDate() != null)
            sb.append("StartDate: " + getStartDate() + ",");
        if (getStopDate() != null)
            sb.append("StopDate: " + getStopDate() + ",");
        if (getFullLoadStartDate() != null)
            sb.append("FullLoadStartDate: " + getFullLoadStartDate() + ",");
        if (getFullLoadFinishDate() != null)
            sb.append("FullLoadFinishDate: " + getFullLoadFinishDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getFullLoadProgressPercent() == null) ? 0 : getFullLoadProgressPercent()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getElapsedTimeMillis() == null) ? 0 : getElapsedTimeMillis().hashCode());
        hashCode = prime * hashCode
                + ((getTablesLoaded() == null) ? 0 : getTablesLoaded().hashCode());
        hashCode = prime * hashCode
                + ((getTablesLoading() == null) ? 0 : getTablesLoading().hashCode());
        hashCode = prime * hashCode
                + ((getTablesQueued() == null) ? 0 : getTablesQueued().hashCode());
        hashCode = prime * hashCode
                + ((getTablesErrored() == null) ? 0 : getTablesErrored().hashCode());
        hashCode = prime * hashCode
                + ((getFreshStartDate() == null) ? 0 : getFreshStartDate().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getStopDate() == null) ? 0 : getStopDate().hashCode());
        hashCode = prime * hashCode
                + ((getFullLoadStartDate() == null) ? 0 : getFullLoadStartDate().hashCode());
        hashCode = prime * hashCode
                + ((getFullLoadFinishDate() == null) ? 0 : getFullLoadFinishDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationTaskStats == false)
            return false;
        ReplicationTaskStats other = (ReplicationTaskStats) obj;

        if (other.getFullLoadProgressPercent() == null ^ this.getFullLoadProgressPercent() == null)
            return false;
        if (other.getFullLoadProgressPercent() != null
                && other.getFullLoadProgressPercent().equals(this.getFullLoadProgressPercent()) == false)
            return false;
        if (other.getElapsedTimeMillis() == null ^ this.getElapsedTimeMillis() == null)
            return false;
        if (other.getElapsedTimeMillis() != null
                && other.getElapsedTimeMillis().equals(this.getElapsedTimeMillis()) == false)
            return false;
        if (other.getTablesLoaded() == null ^ this.getTablesLoaded() == null)
            return false;
        if (other.getTablesLoaded() != null
                && other.getTablesLoaded().equals(this.getTablesLoaded()) == false)
            return false;
        if (other.getTablesLoading() == null ^ this.getTablesLoading() == null)
            return false;
        if (other.getTablesLoading() != null
                && other.getTablesLoading().equals(this.getTablesLoading()) == false)
            return false;
        if (other.getTablesQueued() == null ^ this.getTablesQueued() == null)
            return false;
        if (other.getTablesQueued() != null
                && other.getTablesQueued().equals(this.getTablesQueued()) == false)
            return false;
        if (other.getTablesErrored() == null ^ this.getTablesErrored() == null)
            return false;
        if (other.getTablesErrored() != null
                && other.getTablesErrored().equals(this.getTablesErrored()) == false)
            return false;
        if (other.getFreshStartDate() == null ^ this.getFreshStartDate() == null)
            return false;
        if (other.getFreshStartDate() != null
                && other.getFreshStartDate().equals(this.getFreshStartDate()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null
                && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getStopDate() == null ^ this.getStopDate() == null)
            return false;
        if (other.getStopDate() != null && other.getStopDate().equals(this.getStopDate()) == false)
            return false;
        if (other.getFullLoadStartDate() == null ^ this.getFullLoadStartDate() == null)
            return false;
        if (other.getFullLoadStartDate() != null
                && other.getFullLoadStartDate().equals(this.getFullLoadStartDate()) == false)
            return false;
        if (other.getFullLoadFinishDate() == null ^ this.getFullLoadFinishDate() == null)
            return false;
        if (other.getFullLoadFinishDate() != null
                && other.getFullLoadFinishDate().equals(this.getFullLoadFinishDate()) == false)
            return false;
        return true;
    }
}
