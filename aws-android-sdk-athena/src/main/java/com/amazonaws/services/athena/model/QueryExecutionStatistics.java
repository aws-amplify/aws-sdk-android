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

package com.amazonaws.services.athena.model;

import java.io.Serializable;

/**
 * <p>
 * The amount of data scanned during the query execution and the amount of time
 * that it took to execute, and the type of statement that was run.
 * </p>
 */
public class QueryExecutionStatistics implements Serializable {
    /**
     * <p>
     * The number of milliseconds that the query took to execute.
     * </p>
     */
    private Long engineExecutionTimeInMillis;

    /**
     * <p>
     * The number of bytes in the data that was queried.
     * </p>
     */
    private Long dataScannedInBytes;

    /**
     * <p>
     * The location and file name of a data manifest file. The manifest file is
     * saved to the Athena query results location in Amazon S3. The manifest
     * file tracks files that the query wrote to Amazon S3. If the query fails,
     * the manifest file also tracks files that the query intended to write. The
     * manifest is useful for identifying orphaned files resulting from a failed
     * query. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Working
     * with Query Results, Output Files, and Query History</a> in the <i>Amazon
     * Athena User Guide</i>.
     * </p>
     */
    private String dataManifestLocation;

    /**
     * <p>
     * The number of milliseconds that Athena took to run the query.
     * </p>
     */
    private Long totalExecutionTimeInMillis;

    /**
     * <p>
     * The number of milliseconds that the query was in your query queue waiting
     * for resources. Note that if transient errors occur, Athena might
     * automatically add the query back to the queue.
     * </p>
     */
    private Long queryQueueTimeInMillis;

    /**
     * <p>
     * The number of milliseconds that Athena took to plan the query processing
     * flow. This includes the time spent retrieving table partitions from the
     * data source. Note that because the query engine performs the query
     * planning, query planning time is a subset of engine processing time.
     * </p>
     */
    private Long queryPlanningTimeInMillis;

    /**
     * <p>
     * The number of milliseconds that Athena took to finalize and publish the
     * query results after the query engine finished running the query.
     * </p>
     */
    private Long serviceProcessingTimeInMillis;

    /**
     * <p>
     * The number of milliseconds that the query took to execute.
     * </p>
     *
     * @return <p>
     *         The number of milliseconds that the query took to execute.
     *         </p>
     */
    public Long getEngineExecutionTimeInMillis() {
        return engineExecutionTimeInMillis;
    }

    /**
     * <p>
     * The number of milliseconds that the query took to execute.
     * </p>
     *
     * @param engineExecutionTimeInMillis <p>
     *            The number of milliseconds that the query took to execute.
     *            </p>
     */
    public void setEngineExecutionTimeInMillis(Long engineExecutionTimeInMillis) {
        this.engineExecutionTimeInMillis = engineExecutionTimeInMillis;
    }

    /**
     * <p>
     * The number of milliseconds that the query took to execute.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineExecutionTimeInMillis <p>
     *            The number of milliseconds that the query took to execute.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryExecutionStatistics withEngineExecutionTimeInMillis(Long engineExecutionTimeInMillis) {
        this.engineExecutionTimeInMillis = engineExecutionTimeInMillis;
        return this;
    }

    /**
     * <p>
     * The number of bytes in the data that was queried.
     * </p>
     *
     * @return <p>
     *         The number of bytes in the data that was queried.
     *         </p>
     */
    public Long getDataScannedInBytes() {
        return dataScannedInBytes;
    }

    /**
     * <p>
     * The number of bytes in the data that was queried.
     * </p>
     *
     * @param dataScannedInBytes <p>
     *            The number of bytes in the data that was queried.
     *            </p>
     */
    public void setDataScannedInBytes(Long dataScannedInBytes) {
        this.dataScannedInBytes = dataScannedInBytes;
    }

    /**
     * <p>
     * The number of bytes in the data that was queried.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataScannedInBytes <p>
     *            The number of bytes in the data that was queried.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryExecutionStatistics withDataScannedInBytes(Long dataScannedInBytes) {
        this.dataScannedInBytes = dataScannedInBytes;
        return this;
    }

    /**
     * <p>
     * The location and file name of a data manifest file. The manifest file is
     * saved to the Athena query results location in Amazon S3. The manifest
     * file tracks files that the query wrote to Amazon S3. If the query fails,
     * the manifest file also tracks files that the query intended to write. The
     * manifest is useful for identifying orphaned files resulting from a failed
     * query. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Working
     * with Query Results, Output Files, and Query History</a> in the <i>Amazon
     * Athena User Guide</i>.
     * </p>
     *
     * @return <p>
     *         The location and file name of a data manifest file. The manifest
     *         file is saved to the Athena query results location in Amazon S3.
     *         The manifest file tracks files that the query wrote to Amazon S3.
     *         If the query fails, the manifest file also tracks files that the
     *         query intended to write. The manifest is useful for identifying
     *         orphaned files resulting from a failed query. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/athena/latest/ug/querying.html"
     *         >Working with Query Results, Output Files, and Query History</a>
     *         in the <i>Amazon Athena User Guide</i>.
     *         </p>
     */
    public String getDataManifestLocation() {
        return dataManifestLocation;
    }

    /**
     * <p>
     * The location and file name of a data manifest file. The manifest file is
     * saved to the Athena query results location in Amazon S3. The manifest
     * file tracks files that the query wrote to Amazon S3. If the query fails,
     * the manifest file also tracks files that the query intended to write. The
     * manifest is useful for identifying orphaned files resulting from a failed
     * query. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Working
     * with Query Results, Output Files, and Query History</a> in the <i>Amazon
     * Athena User Guide</i>.
     * </p>
     *
     * @param dataManifestLocation <p>
     *            The location and file name of a data manifest file. The
     *            manifest file is saved to the Athena query results location in
     *            Amazon S3. The manifest file tracks files that the query wrote
     *            to Amazon S3. If the query fails, the manifest file also
     *            tracks files that the query intended to write. The manifest is
     *            useful for identifying orphaned files resulting from a failed
     *            query. For more information, see <a href=
     *            "https://docs.aws.amazon.com/athena/latest/ug/querying.html"
     *            >Working with Query Results, Output Files, and Query
     *            History</a> in the <i>Amazon Athena User Guide</i>.
     *            </p>
     */
    public void setDataManifestLocation(String dataManifestLocation) {
        this.dataManifestLocation = dataManifestLocation;
    }

    /**
     * <p>
     * The location and file name of a data manifest file. The manifest file is
     * saved to the Athena query results location in Amazon S3. The manifest
     * file tracks files that the query wrote to Amazon S3. If the query fails,
     * the manifest file also tracks files that the query intended to write. The
     * manifest is useful for identifying orphaned files resulting from a failed
     * query. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Working
     * with Query Results, Output Files, and Query History</a> in the <i>Amazon
     * Athena User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataManifestLocation <p>
     *            The location and file name of a data manifest file. The
     *            manifest file is saved to the Athena query results location in
     *            Amazon S3. The manifest file tracks files that the query wrote
     *            to Amazon S3. If the query fails, the manifest file also
     *            tracks files that the query intended to write. The manifest is
     *            useful for identifying orphaned files resulting from a failed
     *            query. For more information, see <a href=
     *            "https://docs.aws.amazon.com/athena/latest/ug/querying.html"
     *            >Working with Query Results, Output Files, and Query
     *            History</a> in the <i>Amazon Athena User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryExecutionStatistics withDataManifestLocation(String dataManifestLocation) {
        this.dataManifestLocation = dataManifestLocation;
        return this;
    }

    /**
     * <p>
     * The number of milliseconds that Athena took to run the query.
     * </p>
     *
     * @return <p>
     *         The number of milliseconds that Athena took to run the query.
     *         </p>
     */
    public Long getTotalExecutionTimeInMillis() {
        return totalExecutionTimeInMillis;
    }

    /**
     * <p>
     * The number of milliseconds that Athena took to run the query.
     * </p>
     *
     * @param totalExecutionTimeInMillis <p>
     *            The number of milliseconds that Athena took to run the query.
     *            </p>
     */
    public void setTotalExecutionTimeInMillis(Long totalExecutionTimeInMillis) {
        this.totalExecutionTimeInMillis = totalExecutionTimeInMillis;
    }

    /**
     * <p>
     * The number of milliseconds that Athena took to run the query.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalExecutionTimeInMillis <p>
     *            The number of milliseconds that Athena took to run the query.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryExecutionStatistics withTotalExecutionTimeInMillis(Long totalExecutionTimeInMillis) {
        this.totalExecutionTimeInMillis = totalExecutionTimeInMillis;
        return this;
    }

    /**
     * <p>
     * The number of milliseconds that the query was in your query queue waiting
     * for resources. Note that if transient errors occur, Athena might
     * automatically add the query back to the queue.
     * </p>
     *
     * @return <p>
     *         The number of milliseconds that the query was in your query queue
     *         waiting for resources. Note that if transient errors occur,
     *         Athena might automatically add the query back to the queue.
     *         </p>
     */
    public Long getQueryQueueTimeInMillis() {
        return queryQueueTimeInMillis;
    }

    /**
     * <p>
     * The number of milliseconds that the query was in your query queue waiting
     * for resources. Note that if transient errors occur, Athena might
     * automatically add the query back to the queue.
     * </p>
     *
     * @param queryQueueTimeInMillis <p>
     *            The number of milliseconds that the query was in your query
     *            queue waiting for resources. Note that if transient errors
     *            occur, Athena might automatically add the query back to the
     *            queue.
     *            </p>
     */
    public void setQueryQueueTimeInMillis(Long queryQueueTimeInMillis) {
        this.queryQueueTimeInMillis = queryQueueTimeInMillis;
    }

    /**
     * <p>
     * The number of milliseconds that the query was in your query queue waiting
     * for resources. Note that if transient errors occur, Athena might
     * automatically add the query back to the queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryQueueTimeInMillis <p>
     *            The number of milliseconds that the query was in your query
     *            queue waiting for resources. Note that if transient errors
     *            occur, Athena might automatically add the query back to the
     *            queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryExecutionStatistics withQueryQueueTimeInMillis(Long queryQueueTimeInMillis) {
        this.queryQueueTimeInMillis = queryQueueTimeInMillis;
        return this;
    }

    /**
     * <p>
     * The number of milliseconds that Athena took to plan the query processing
     * flow. This includes the time spent retrieving table partitions from the
     * data source. Note that because the query engine performs the query
     * planning, query planning time is a subset of engine processing time.
     * </p>
     *
     * @return <p>
     *         The number of milliseconds that Athena took to plan the query
     *         processing flow. This includes the time spent retrieving table
     *         partitions from the data source. Note that because the query
     *         engine performs the query planning, query planning time is a
     *         subset of engine processing time.
     *         </p>
     */
    public Long getQueryPlanningTimeInMillis() {
        return queryPlanningTimeInMillis;
    }

    /**
     * <p>
     * The number of milliseconds that Athena took to plan the query processing
     * flow. This includes the time spent retrieving table partitions from the
     * data source. Note that because the query engine performs the query
     * planning, query planning time is a subset of engine processing time.
     * </p>
     *
     * @param queryPlanningTimeInMillis <p>
     *            The number of milliseconds that Athena took to plan the query
     *            processing flow. This includes the time spent retrieving table
     *            partitions from the data source. Note that because the query
     *            engine performs the query planning, query planning time is a
     *            subset of engine processing time.
     *            </p>
     */
    public void setQueryPlanningTimeInMillis(Long queryPlanningTimeInMillis) {
        this.queryPlanningTimeInMillis = queryPlanningTimeInMillis;
    }

    /**
     * <p>
     * The number of milliseconds that Athena took to plan the query processing
     * flow. This includes the time spent retrieving table partitions from the
     * data source. Note that because the query engine performs the query
     * planning, query planning time is a subset of engine processing time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryPlanningTimeInMillis <p>
     *            The number of milliseconds that Athena took to plan the query
     *            processing flow. This includes the time spent retrieving table
     *            partitions from the data source. Note that because the query
     *            engine performs the query planning, query planning time is a
     *            subset of engine processing time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryExecutionStatistics withQueryPlanningTimeInMillis(Long queryPlanningTimeInMillis) {
        this.queryPlanningTimeInMillis = queryPlanningTimeInMillis;
        return this;
    }

    /**
     * <p>
     * The number of milliseconds that Athena took to finalize and publish the
     * query results after the query engine finished running the query.
     * </p>
     *
     * @return <p>
     *         The number of milliseconds that Athena took to finalize and
     *         publish the query results after the query engine finished running
     *         the query.
     *         </p>
     */
    public Long getServiceProcessingTimeInMillis() {
        return serviceProcessingTimeInMillis;
    }

    /**
     * <p>
     * The number of milliseconds that Athena took to finalize and publish the
     * query results after the query engine finished running the query.
     * </p>
     *
     * @param serviceProcessingTimeInMillis <p>
     *            The number of milliseconds that Athena took to finalize and
     *            publish the query results after the query engine finished
     *            running the query.
     *            </p>
     */
    public void setServiceProcessingTimeInMillis(Long serviceProcessingTimeInMillis) {
        this.serviceProcessingTimeInMillis = serviceProcessingTimeInMillis;
    }

    /**
     * <p>
     * The number of milliseconds that Athena took to finalize and publish the
     * query results after the query engine finished running the query.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceProcessingTimeInMillis <p>
     *            The number of milliseconds that Athena took to finalize and
     *            publish the query results after the query engine finished
     *            running the query.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryExecutionStatistics withServiceProcessingTimeInMillis(
            Long serviceProcessingTimeInMillis) {
        this.serviceProcessingTimeInMillis = serviceProcessingTimeInMillis;
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
        if (getEngineExecutionTimeInMillis() != null)
            sb.append("EngineExecutionTimeInMillis: " + getEngineExecutionTimeInMillis() + ",");
        if (getDataScannedInBytes() != null)
            sb.append("DataScannedInBytes: " + getDataScannedInBytes() + ",");
        if (getDataManifestLocation() != null)
            sb.append("DataManifestLocation: " + getDataManifestLocation() + ",");
        if (getTotalExecutionTimeInMillis() != null)
            sb.append("TotalExecutionTimeInMillis: " + getTotalExecutionTimeInMillis() + ",");
        if (getQueryQueueTimeInMillis() != null)
            sb.append("QueryQueueTimeInMillis: " + getQueryQueueTimeInMillis() + ",");
        if (getQueryPlanningTimeInMillis() != null)
            sb.append("QueryPlanningTimeInMillis: " + getQueryPlanningTimeInMillis() + ",");
        if (getServiceProcessingTimeInMillis() != null)
            sb.append("ServiceProcessingTimeInMillis: " + getServiceProcessingTimeInMillis());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getEngineExecutionTimeInMillis() == null) ? 0
                        : getEngineExecutionTimeInMillis().hashCode());
        hashCode = prime * hashCode
                + ((getDataScannedInBytes() == null) ? 0 : getDataScannedInBytes().hashCode());
        hashCode = prime * hashCode
                + ((getDataManifestLocation() == null) ? 0 : getDataManifestLocation().hashCode());
        hashCode = prime
                * hashCode
                + ((getTotalExecutionTimeInMillis() == null) ? 0 : getTotalExecutionTimeInMillis()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getQueryQueueTimeInMillis() == null) ? 0 : getQueryQueueTimeInMillis()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getQueryPlanningTimeInMillis() == null) ? 0 : getQueryPlanningTimeInMillis()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getServiceProcessingTimeInMillis() == null) ? 0
                        : getServiceProcessingTimeInMillis().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryExecutionStatistics == false)
            return false;
        QueryExecutionStatistics other = (QueryExecutionStatistics) obj;

        if (other.getEngineExecutionTimeInMillis() == null
                ^ this.getEngineExecutionTimeInMillis() == null)
            return false;
        if (other.getEngineExecutionTimeInMillis() != null
                && other.getEngineExecutionTimeInMillis().equals(
                        this.getEngineExecutionTimeInMillis()) == false)
            return false;
        if (other.getDataScannedInBytes() == null ^ this.getDataScannedInBytes() == null)
            return false;
        if (other.getDataScannedInBytes() != null
                && other.getDataScannedInBytes().equals(this.getDataScannedInBytes()) == false)
            return false;
        if (other.getDataManifestLocation() == null ^ this.getDataManifestLocation() == null)
            return false;
        if (other.getDataManifestLocation() != null
                && other.getDataManifestLocation().equals(this.getDataManifestLocation()) == false)
            return false;
        if (other.getTotalExecutionTimeInMillis() == null
                ^ this.getTotalExecutionTimeInMillis() == null)
            return false;
        if (other.getTotalExecutionTimeInMillis() != null
                && other.getTotalExecutionTimeInMillis().equals(
                        this.getTotalExecutionTimeInMillis()) == false)
            return false;
        if (other.getQueryQueueTimeInMillis() == null ^ this.getQueryQueueTimeInMillis() == null)
            return false;
        if (other.getQueryQueueTimeInMillis() != null
                && other.getQueryQueueTimeInMillis().equals(this.getQueryQueueTimeInMillis()) == false)
            return false;
        if (other.getQueryPlanningTimeInMillis() == null
                ^ this.getQueryPlanningTimeInMillis() == null)
            return false;
        if (other.getQueryPlanningTimeInMillis() != null
                && other.getQueryPlanningTimeInMillis().equals(this.getQueryPlanningTimeInMillis()) == false)
            return false;
        if (other.getServiceProcessingTimeInMillis() == null
                ^ this.getServiceProcessingTimeInMillis() == null)
            return false;
        if (other.getServiceProcessingTimeInMillis() != null
                && other.getServiceProcessingTimeInMillis().equals(
                        this.getServiceProcessingTimeInMillis()) == false)
            return false;
        return true;
    }
}
