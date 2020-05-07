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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the number of log events scanned by the query, the number of log
 * events that matched the query criteria, and the total number of bytes in the
 * log events that were scanned.
 * </p>
 */
public class QueryStatistics implements Serializable {
    /**
     * <p>
     * The number of log events that matched the query string.
     * </p>
     */
    private Double recordsMatched;

    /**
     * <p>
     * The total number of log events scanned during the query.
     * </p>
     */
    private Double recordsScanned;

    /**
     * <p>
     * The total number of bytes in the log events scanned during the query.
     * </p>
     */
    private Double bytesScanned;

    /**
     * <p>
     * The number of log events that matched the query string.
     * </p>
     *
     * @return <p>
     *         The number of log events that matched the query string.
     *         </p>
     */
    public Double getRecordsMatched() {
        return recordsMatched;
    }

    /**
     * <p>
     * The number of log events that matched the query string.
     * </p>
     *
     * @param recordsMatched <p>
     *            The number of log events that matched the query string.
     *            </p>
     */
    public void setRecordsMatched(Double recordsMatched) {
        this.recordsMatched = recordsMatched;
    }

    /**
     * <p>
     * The number of log events that matched the query string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recordsMatched <p>
     *            The number of log events that matched the query string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryStatistics withRecordsMatched(Double recordsMatched) {
        this.recordsMatched = recordsMatched;
        return this;
    }

    /**
     * <p>
     * The total number of log events scanned during the query.
     * </p>
     *
     * @return <p>
     *         The total number of log events scanned during the query.
     *         </p>
     */
    public Double getRecordsScanned() {
        return recordsScanned;
    }

    /**
     * <p>
     * The total number of log events scanned during the query.
     * </p>
     *
     * @param recordsScanned <p>
     *            The total number of log events scanned during the query.
     *            </p>
     */
    public void setRecordsScanned(Double recordsScanned) {
        this.recordsScanned = recordsScanned;
    }

    /**
     * <p>
     * The total number of log events scanned during the query.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recordsScanned <p>
     *            The total number of log events scanned during the query.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryStatistics withRecordsScanned(Double recordsScanned) {
        this.recordsScanned = recordsScanned;
        return this;
    }

    /**
     * <p>
     * The total number of bytes in the log events scanned during the query.
     * </p>
     *
     * @return <p>
     *         The total number of bytes in the log events scanned during the
     *         query.
     *         </p>
     */
    public Double getBytesScanned() {
        return bytesScanned;
    }

    /**
     * <p>
     * The total number of bytes in the log events scanned during the query.
     * </p>
     *
     * @param bytesScanned <p>
     *            The total number of bytes in the log events scanned during the
     *            query.
     *            </p>
     */
    public void setBytesScanned(Double bytesScanned) {
        this.bytesScanned = bytesScanned;
    }

    /**
     * <p>
     * The total number of bytes in the log events scanned during the query.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bytesScanned <p>
     *            The total number of bytes in the log events scanned during the
     *            query.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryStatistics withBytesScanned(Double bytesScanned) {
        this.bytesScanned = bytesScanned;
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
        if (getRecordsMatched() != null)
            sb.append("recordsMatched: " + getRecordsMatched() + ",");
        if (getRecordsScanned() != null)
            sb.append("recordsScanned: " + getRecordsScanned() + ",");
        if (getBytesScanned() != null)
            sb.append("bytesScanned: " + getBytesScanned());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRecordsMatched() == null) ? 0 : getRecordsMatched().hashCode());
        hashCode = prime * hashCode
                + ((getRecordsScanned() == null) ? 0 : getRecordsScanned().hashCode());
        hashCode = prime * hashCode
                + ((getBytesScanned() == null) ? 0 : getBytesScanned().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryStatistics == false)
            return false;
        QueryStatistics other = (QueryStatistics) obj;

        if (other.getRecordsMatched() == null ^ this.getRecordsMatched() == null)
            return false;
        if (other.getRecordsMatched() != null
                && other.getRecordsMatched().equals(this.getRecordsMatched()) == false)
            return false;
        if (other.getRecordsScanned() == null ^ this.getRecordsScanned() == null)
            return false;
        if (other.getRecordsScanned() != null
                && other.getRecordsScanned().equals(this.getRecordsScanned()) == false)
            return false;
        if (other.getBytesScanned() == null ^ this.getBytesScanned() == null)
            return false;
        if (other.getBytesScanned() != null
                && other.getBytesScanned().equals(this.getBytesScanned()) == false)
            return false;
        return true;
    }
}
