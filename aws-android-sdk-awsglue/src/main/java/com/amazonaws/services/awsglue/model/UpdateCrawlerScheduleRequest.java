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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the schedule of a crawler using a <code>cron</code> expression.
 * </p>
 */
public class UpdateCrawlerScheduleRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the crawler whose schedule to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String crawlerName;

    /**
     * <p>
     * The updated <code>cron</code> expression used to specify the schedule.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html"
     * >Time-Based Schedules for Jobs and Crawlers</a>. For example, to run
     * something every day at 12:15 UTC, specify
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     */
    private String schedule;

    /**
     * <p>
     * The name of the crawler whose schedule to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the crawler whose schedule to update.
     *         </p>
     */
    public String getCrawlerName() {
        return crawlerName;
    }

    /**
     * <p>
     * The name of the crawler whose schedule to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param crawlerName <p>
     *            The name of the crawler whose schedule to update.
     *            </p>
     */
    public void setCrawlerName(String crawlerName) {
        this.crawlerName = crawlerName;
    }

    /**
     * <p>
     * The name of the crawler whose schedule to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param crawlerName <p>
     *            The name of the crawler whose schedule to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCrawlerScheduleRequest withCrawlerName(String crawlerName) {
        this.crawlerName = crawlerName;
        return this;
    }

    /**
     * <p>
     * The updated <code>cron</code> expression used to specify the schedule.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html"
     * >Time-Based Schedules for Jobs and Crawlers</a>. For example, to run
     * something every day at 12:15 UTC, specify
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     *
     * @return <p>
     *         The updated <code>cron</code> expression used to specify the
     *         schedule. For more information, see <a href=
     *         "http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html"
     *         >Time-Based Schedules for Jobs and Crawlers</a>. For example, to
     *         run something every day at 12:15 UTC, specify
     *         <code>cron(15 12 * * ? *)</code>.
     *         </p>
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * <p>
     * The updated <code>cron</code> expression used to specify the schedule.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html"
     * >Time-Based Schedules for Jobs and Crawlers</a>. For example, to run
     * something every day at 12:15 UTC, specify
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     *
     * @param schedule <p>
     *            The updated <code>cron</code> expression used to specify the
     *            schedule. For more information, see <a href=
     *            "http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html"
     *            >Time-Based Schedules for Jobs and Crawlers</a>. For example,
     *            to run something every day at 12:15 UTC, specify
     *            <code>cron(15 12 * * ? *)</code>.
     *            </p>
     */
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The updated <code>cron</code> expression used to specify the schedule.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html"
     * >Time-Based Schedules for Jobs and Crawlers</a>. For example, to run
     * something every day at 12:15 UTC, specify
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schedule <p>
     *            The updated <code>cron</code> expression used to specify the
     *            schedule. For more information, see <a href=
     *            "http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html"
     *            >Time-Based Schedules for Jobs and Crawlers</a>. For example,
     *            to run something every day at 12:15 UTC, specify
     *            <code>cron(15 12 * * ? *)</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCrawlerScheduleRequest withSchedule(String schedule) {
        this.schedule = schedule;
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
        if (getCrawlerName() != null)
            sb.append("CrawlerName: " + getCrawlerName() + ",");
        if (getSchedule() != null)
            sb.append("Schedule: " + getSchedule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCrawlerName() == null) ? 0 : getCrawlerName().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCrawlerScheduleRequest == false)
            return false;
        UpdateCrawlerScheduleRequest other = (UpdateCrawlerScheduleRequest) obj;

        if (other.getCrawlerName() == null ^ this.getCrawlerName() == null)
            return false;
        if (other.getCrawlerName() != null
                && other.getCrawlerName().equals(this.getCrawlerName()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        return true;
    }
}
