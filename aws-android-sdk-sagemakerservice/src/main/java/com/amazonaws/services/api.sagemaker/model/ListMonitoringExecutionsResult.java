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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

public class ListMonitoringExecutionsResult implements Serializable {
    /**
     * <p>
     * A JSON array in which each element is a summary for a monitoring
     * execution.
     * </p>
     */
    private java.util.List<MonitoringExecutionSummary> monitoringExecutionSummaries;

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
     * execution.
     * </p>
     *
     * @return <p>
     *         A JSON array in which each element is a summary for a monitoring
     *         execution.
     *         </p>
     */
    public java.util.List<MonitoringExecutionSummary> getMonitoringExecutionSummaries() {
        return monitoringExecutionSummaries;
    }

    /**
     * <p>
     * A JSON array in which each element is a summary for a monitoring
     * execution.
     * </p>
     *
     * @param monitoringExecutionSummaries <p>
     *            A JSON array in which each element is a summary for a
     *            monitoring execution.
     *            </p>
     */
    public void setMonitoringExecutionSummaries(
            java.util.Collection<MonitoringExecutionSummary> monitoringExecutionSummaries) {
        if (monitoringExecutionSummaries == null) {
            this.monitoringExecutionSummaries = null;
            return;
        }

        this.monitoringExecutionSummaries = new java.util.ArrayList<MonitoringExecutionSummary>(
                monitoringExecutionSummaries);
    }

    /**
     * <p>
     * A JSON array in which each element is a summary for a monitoring
     * execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param monitoringExecutionSummaries <p>
     *            A JSON array in which each element is a summary for a
     *            monitoring execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMonitoringExecutionsResult withMonitoringExecutionSummaries(
            MonitoringExecutionSummary... monitoringExecutionSummaries) {
        if (getMonitoringExecutionSummaries() == null) {
            this.monitoringExecutionSummaries = new java.util.ArrayList<MonitoringExecutionSummary>(
                    monitoringExecutionSummaries.length);
        }
        for (MonitoringExecutionSummary value : monitoringExecutionSummaries) {
            this.monitoringExecutionSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A JSON array in which each element is a summary for a monitoring
     * execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param monitoringExecutionSummaries <p>
     *            A JSON array in which each element is a summary for a
     *            monitoring execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMonitoringExecutionsResult withMonitoringExecutionSummaries(
            java.util.Collection<MonitoringExecutionSummary> monitoringExecutionSummaries) {
        setMonitoringExecutionSummaries(monitoringExecutionSummaries);
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
    public ListMonitoringExecutionsResult withNextToken(String nextToken) {
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
        if (getMonitoringExecutionSummaries() != null)
            sb.append("MonitoringExecutionSummaries: " + getMonitoringExecutionSummaries() + ",");
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
                + ((getMonitoringExecutionSummaries() == null) ? 0
                        : getMonitoringExecutionSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMonitoringExecutionsResult == false)
            return false;
        ListMonitoringExecutionsResult other = (ListMonitoringExecutionsResult) obj;

        if (other.getMonitoringExecutionSummaries() == null
                ^ this.getMonitoringExecutionSummaries() == null)
            return false;
        if (other.getMonitoringExecutionSummaries() != null
                && other.getMonitoringExecutionSummaries().equals(
                        this.getMonitoringExecutionSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
