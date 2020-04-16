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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

public class ListMonitoringSchedulesResult implements Serializable {
    /**
     * <p>
     * A JSON array in which each element is a summary for a monitoring
     * schedule.
     * </p>
     */
    private java.util.List<MonitoringScheduleSummary> monitoringScheduleSummaries;

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of jobs, use it in the subsequent reques
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A JSON array in which each element is a summary for a monitoring
     * schedule.
     * </p>
     *
     * @return <p>
     *         A JSON array in which each element is a summary for a monitoring
     *         schedule.
     *         </p>
     */
    public java.util.List<MonitoringScheduleSummary> getMonitoringScheduleSummaries() {
        return monitoringScheduleSummaries;
    }

    /**
     * <p>
     * A JSON array in which each element is a summary for a monitoring
     * schedule.
     * </p>
     *
     * @param monitoringScheduleSummaries <p>
     *            A JSON array in which each element is a summary for a
     *            monitoring schedule.
     *            </p>
     */
    public void setMonitoringScheduleSummaries(
            java.util.Collection<MonitoringScheduleSummary> monitoringScheduleSummaries) {
        if (monitoringScheduleSummaries == null) {
            this.monitoringScheduleSummaries = null;
            return;
        }

        this.monitoringScheduleSummaries = new java.util.ArrayList<MonitoringScheduleSummary>(
                monitoringScheduleSummaries);
    }

    /**
     * <p>
     * A JSON array in which each element is a summary for a monitoring
     * schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param monitoringScheduleSummaries <p>
     *            A JSON array in which each element is a summary for a
     *            monitoring schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMonitoringSchedulesResult withMonitoringScheduleSummaries(
            MonitoringScheduleSummary... monitoringScheduleSummaries) {
        if (getMonitoringScheduleSummaries() == null) {
            this.monitoringScheduleSummaries = new java.util.ArrayList<MonitoringScheduleSummary>(
                    monitoringScheduleSummaries.length);
        }
        for (MonitoringScheduleSummary value : monitoringScheduleSummaries) {
            this.monitoringScheduleSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A JSON array in which each element is a summary for a monitoring
     * schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param monitoringScheduleSummaries <p>
     *            A JSON array in which each element is a summary for a
     *            monitoring schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMonitoringSchedulesResult withMonitoringScheduleSummaries(
            java.util.Collection<MonitoringScheduleSummary> monitoringScheduleSummaries) {
        setMonitoringScheduleSummaries(monitoringScheduleSummaries);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of jobs, use it in the subsequent reques
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         If the response is truncated, Amazon SageMaker returns this
     *         token. To retrieve the next set of jobs, use it in the subsequent
     *         reques
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of jobs, use it in the subsequent reques
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon SageMaker returns this
     *            token. To retrieve the next set of jobs, use it in the
     *            subsequent reques
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of jobs, use it in the subsequent reques
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon SageMaker returns this
     *            token. To retrieve the next set of jobs, use it in the
     *            subsequent reques
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMonitoringSchedulesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getMonitoringScheduleSummaries() != null)
            sb.append("MonitoringScheduleSummaries: " + getMonitoringScheduleSummaries() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getMonitoringScheduleSummaries() == null) ? 0
                        : getMonitoringScheduleSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMonitoringSchedulesResult == false)
            return false;
        ListMonitoringSchedulesResult other = (ListMonitoringSchedulesResult) obj;

        if (other.getMonitoringScheduleSummaries() == null
                ^ this.getMonitoringScheduleSummaries() == null)
            return false;
        if (other.getMonitoringScheduleSummaries() != null
                && other.getMonitoringScheduleSummaries().equals(
                        this.getMonitoringScheduleSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
