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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the result of a cluster resize operation.
 * </p>
 */
public class DescribeResizeResult implements Serializable {
    /**
     * <p>
     * The node type that the cluster will have after the resize operation is
     * complete.
     * </p>
     */
    private String targetNodeType;

    /**
     * <p>
     * The number of nodes that the cluster will have after the resize operation
     * is complete.
     * </p>
     */
    private Integer targetNumberOfNodes;

    /**
     * <p>
     * The cluster type after the resize operation is complete.
     * </p>
     * <p>
     * Valid Values: <code>multi-node</code> | <code>single-node</code>
     * </p>
     */
    private String targetClusterType;

    /**
     * <p>
     * The status of the resize operation.
     * </p>
     * <p>
     * Valid Values: <code>NONE</code> | <code>IN_PROGRESS</code> |
     * <code>FAILED</code> | <code>SUCCEEDED</code> | <code>CANCELLING</code>
     * </p>
     */
    private String status;

    /**
     * <p>
     * The names of tables that have been completely imported .
     * </p>
     * <p>
     * Valid Values: List of table names.
     * </p>
     */
    private java.util.List<String> importTablesCompleted;

    /**
     * <p>
     * The names of tables that are being currently imported.
     * </p>
     * <p>
     * Valid Values: List of table names.
     * </p>
     */
    private java.util.List<String> importTablesInProgress;

    /**
     * <p>
     * The names of tables that have not been yet imported.
     * </p>
     * <p>
     * Valid Values: List of table names
     * </p>
     */
    private java.util.List<String> importTablesNotStarted;

    /**
     * <p>
     * The average rate of the resize operation over the last few minutes,
     * measured in megabytes per second. After the resize operation completes,
     * this value shows the average rate of the entire resize operation.
     * </p>
     */
    private Double avgResizeRateInMegaBytesPerSecond;

    /**
     * <p>
     * The estimated total amount of data, in megabytes, on the cluster before
     * the resize operation began.
     * </p>
     */
    private Long totalResizeDataInMegaBytes;

    /**
     * <p>
     * While the resize operation is in progress, this value shows the current
     * amount of data, in megabytes, that has been processed so far. When the
     * resize operation is complete, this value shows the total amount of data,
     * in megabytes, on the cluster, which may be more or less than
     * TotalResizeDataInMegaBytes (the estimated total amount of data before
     * resize).
     * </p>
     */
    private Long progressInMegaBytes;

    /**
     * <p>
     * The amount of seconds that have elapsed since the resize operation began.
     * After the resize operation completes, this value shows the total actual
     * time, in seconds, for the resize operation.
     * </p>
     */
    private Long elapsedTimeInSeconds;

    /**
     * <p>
     * The estimated time remaining, in seconds, until the resize operation is
     * complete. This value is calculated based on the average resize rate and
     * the estimated amount of data remaining to be processed. Once the resize
     * operation is complete, this value will be 0.
     * </p>
     */
    private Long estimatedTimeToCompletionInSeconds;

    /**
     * <p>
     * An enum with possible values of <code>ClassicResize</code> and
     * <code>ElasticResize</code>. These values describe the type of resize
     * operation being performed.
     * </p>
     */
    private String resizeType;

    /**
     * <p>
     * An optional string to provide additional details about the resize action.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The type of encryption for the cluster after the resize is complete.
     * </p>
     * <p>
     * Possible values are <code>KMS</code> and <code>None</code>. In the China
     * region possible values are: <code>Legacy</code> and <code>None</code>.
     * </p>
     */
    private String targetEncryptionType;

    /**
     * <p>
     * The percent of data transferred from source cluster to target cluster.
     * </p>
     */
    private Double dataTransferProgressPercent;

    /**
     * <p>
     * The node type that the cluster will have after the resize operation is
     * complete.
     * </p>
     *
     * @return <p>
     *         The node type that the cluster will have after the resize
     *         operation is complete.
     *         </p>
     */
    public String getTargetNodeType() {
        return targetNodeType;
    }

    /**
     * <p>
     * The node type that the cluster will have after the resize operation is
     * complete.
     * </p>
     *
     * @param targetNodeType <p>
     *            The node type that the cluster will have after the resize
     *            operation is complete.
     *            </p>
     */
    public void setTargetNodeType(String targetNodeType) {
        this.targetNodeType = targetNodeType;
    }

    /**
     * <p>
     * The node type that the cluster will have after the resize operation is
     * complete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetNodeType <p>
     *            The node type that the cluster will have after the resize
     *            operation is complete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeResizeResult withTargetNodeType(String targetNodeType) {
        this.targetNodeType = targetNodeType;
        return this;
    }

    /**
     * <p>
     * The number of nodes that the cluster will have after the resize operation
     * is complete.
     * </p>
     *
     * @return <p>
     *         The number of nodes that the cluster will have after the resize
     *         operation is complete.
     *         </p>
     */
    public Integer getTargetNumberOfNodes() {
        return targetNumberOfNodes;
    }

    /**
     * <p>
     * The number of nodes that the cluster will have after the resize operation
     * is complete.
     * </p>
     *
     * @param targetNumberOfNodes <p>
     *            The number of nodes that the cluster will have after the
     *            resize operation is complete.
     *            </p>
     */
    public void setTargetNumberOfNodes(Integer targetNumberOfNodes) {
        this.targetNumberOfNodes = targetNumberOfNodes;
    }

    /**
     * <p>
     * The number of nodes that the cluster will have after the resize operation
     * is complete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetNumberOfNodes <p>
     *            The number of nodes that the cluster will have after the
     *            resize operation is complete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeResizeResult withTargetNumberOfNodes(Integer targetNumberOfNodes) {
        this.targetNumberOfNodes = targetNumberOfNodes;
        return this;
    }

    /**
     * <p>
     * The cluster type after the resize operation is complete.
     * </p>
     * <p>
     * Valid Values: <code>multi-node</code> | <code>single-node</code>
     * </p>
     *
     * @return <p>
     *         The cluster type after the resize operation is complete.
     *         </p>
     *         <p>
     *         Valid Values: <code>multi-node</code> | <code>single-node</code>
     *         </p>
     */
    public String getTargetClusterType() {
        return targetClusterType;
    }

    /**
     * <p>
     * The cluster type after the resize operation is complete.
     * </p>
     * <p>
     * Valid Values: <code>multi-node</code> | <code>single-node</code>
     * </p>
     *
     * @param targetClusterType <p>
     *            The cluster type after the resize operation is complete.
     *            </p>
     *            <p>
     *            Valid Values: <code>multi-node</code> |
     *            <code>single-node</code>
     *            </p>
     */
    public void setTargetClusterType(String targetClusterType) {
        this.targetClusterType = targetClusterType;
    }

    /**
     * <p>
     * The cluster type after the resize operation is complete.
     * </p>
     * <p>
     * Valid Values: <code>multi-node</code> | <code>single-node</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetClusterType <p>
     *            The cluster type after the resize operation is complete.
     *            </p>
     *            <p>
     *            Valid Values: <code>multi-node</code> |
     *            <code>single-node</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeResizeResult withTargetClusterType(String targetClusterType) {
        this.targetClusterType = targetClusterType;
        return this;
    }

    /**
     * <p>
     * The status of the resize operation.
     * </p>
     * <p>
     * Valid Values: <code>NONE</code> | <code>IN_PROGRESS</code> |
     * <code>FAILED</code> | <code>SUCCEEDED</code> | <code>CANCELLING</code>
     * </p>
     *
     * @return <p>
     *         The status of the resize operation.
     *         </p>
     *         <p>
     *         Valid Values: <code>NONE</code> | <code>IN_PROGRESS</code> |
     *         <code>FAILED</code> | <code>SUCCEEDED</code> |
     *         <code>CANCELLING</code>
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the resize operation.
     * </p>
     * <p>
     * Valid Values: <code>NONE</code> | <code>IN_PROGRESS</code> |
     * <code>FAILED</code> | <code>SUCCEEDED</code> | <code>CANCELLING</code>
     * </p>
     *
     * @param status <p>
     *            The status of the resize operation.
     *            </p>
     *            <p>
     *            Valid Values: <code>NONE</code> | <code>IN_PROGRESS</code> |
     *            <code>FAILED</code> | <code>SUCCEEDED</code> |
     *            <code>CANCELLING</code>
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the resize operation.
     * </p>
     * <p>
     * Valid Values: <code>NONE</code> | <code>IN_PROGRESS</code> |
     * <code>FAILED</code> | <code>SUCCEEDED</code> | <code>CANCELLING</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the resize operation.
     *            </p>
     *            <p>
     *            Valid Values: <code>NONE</code> | <code>IN_PROGRESS</code> |
     *            <code>FAILED</code> | <code>SUCCEEDED</code> |
     *            <code>CANCELLING</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeResizeResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The names of tables that have been completely imported .
     * </p>
     * <p>
     * Valid Values: List of table names.
     * </p>
     *
     * @return <p>
     *         The names of tables that have been completely imported .
     *         </p>
     *         <p>
     *         Valid Values: List of table names.
     *         </p>
     */
    public java.util.List<String> getImportTablesCompleted() {
        return importTablesCompleted;
    }

    /**
     * <p>
     * The names of tables that have been completely imported .
     * </p>
     * <p>
     * Valid Values: List of table names.
     * </p>
     *
     * @param importTablesCompleted <p>
     *            The names of tables that have been completely imported .
     *            </p>
     *            <p>
     *            Valid Values: List of table names.
     *            </p>
     */
    public void setImportTablesCompleted(java.util.Collection<String> importTablesCompleted) {
        if (importTablesCompleted == null) {
            this.importTablesCompleted = null;
            return;
        }

        this.importTablesCompleted = new java.util.ArrayList<String>(importTablesCompleted);
    }

    /**
     * <p>
     * The names of tables that have been completely imported .
     * </p>
     * <p>
     * Valid Values: List of table names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importTablesCompleted <p>
     *            The names of tables that have been completely imported .
     *            </p>
     *            <p>
     *            Valid Values: List of table names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeResizeResult withImportTablesCompleted(String... importTablesCompleted) {
        if (getImportTablesCompleted() == null) {
            this.importTablesCompleted = new java.util.ArrayList<String>(
                    importTablesCompleted.length);
        }
        for (String value : importTablesCompleted) {
            this.importTablesCompleted.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of tables that have been completely imported .
     * </p>
     * <p>
     * Valid Values: List of table names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importTablesCompleted <p>
     *            The names of tables that have been completely imported .
     *            </p>
     *            <p>
     *            Valid Values: List of table names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeResizeResult withImportTablesCompleted(
            java.util.Collection<String> importTablesCompleted) {
        setImportTablesCompleted(importTablesCompleted);
        return this;
    }

    /**
     * <p>
     * The names of tables that are being currently imported.
     * </p>
     * <p>
     * Valid Values: List of table names.
     * </p>
     *
     * @return <p>
     *         The names of tables that are being currently imported.
     *         </p>
     *         <p>
     *         Valid Values: List of table names.
     *         </p>
     */
    public java.util.List<String> getImportTablesInProgress() {
        return importTablesInProgress;
    }

    /**
     * <p>
     * The names of tables that are being currently imported.
     * </p>
     * <p>
     * Valid Values: List of table names.
     * </p>
     *
     * @param importTablesInProgress <p>
     *            The names of tables that are being currently imported.
     *            </p>
     *            <p>
     *            Valid Values: List of table names.
     *            </p>
     */
    public void setImportTablesInProgress(java.util.Collection<String> importTablesInProgress) {
        if (importTablesInProgress == null) {
            this.importTablesInProgress = null;
            return;
        }

        this.importTablesInProgress = new java.util.ArrayList<String>(importTablesInProgress);
    }

    /**
     * <p>
     * The names of tables that are being currently imported.
     * </p>
     * <p>
     * Valid Values: List of table names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importTablesInProgress <p>
     *            The names of tables that are being currently imported.
     *            </p>
     *            <p>
     *            Valid Values: List of table names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeResizeResult withImportTablesInProgress(String... importTablesInProgress) {
        if (getImportTablesInProgress() == null) {
            this.importTablesInProgress = new java.util.ArrayList<String>(
                    importTablesInProgress.length);
        }
        for (String value : importTablesInProgress) {
            this.importTablesInProgress.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of tables that are being currently imported.
     * </p>
     * <p>
     * Valid Values: List of table names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importTablesInProgress <p>
     *            The names of tables that are being currently imported.
     *            </p>
     *            <p>
     *            Valid Values: List of table names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeResizeResult withImportTablesInProgress(
            java.util.Collection<String> importTablesInProgress) {
        setImportTablesInProgress(importTablesInProgress);
        return this;
    }

    /**
     * <p>
     * The names of tables that have not been yet imported.
     * </p>
     * <p>
     * Valid Values: List of table names
     * </p>
     *
     * @return <p>
     *         The names of tables that have not been yet imported.
     *         </p>
     *         <p>
     *         Valid Values: List of table names
     *         </p>
     */
    public java.util.List<String> getImportTablesNotStarted() {
        return importTablesNotStarted;
    }

    /**
     * <p>
     * The names of tables that have not been yet imported.
     * </p>
     * <p>
     * Valid Values: List of table names
     * </p>
     *
     * @param importTablesNotStarted <p>
     *            The names of tables that have not been yet imported.
     *            </p>
     *            <p>
     *            Valid Values: List of table names
     *            </p>
     */
    public void setImportTablesNotStarted(java.util.Collection<String> importTablesNotStarted) {
        if (importTablesNotStarted == null) {
            this.importTablesNotStarted = null;
            return;
        }

        this.importTablesNotStarted = new java.util.ArrayList<String>(importTablesNotStarted);
    }

    /**
     * <p>
     * The names of tables that have not been yet imported.
     * </p>
     * <p>
     * Valid Values: List of table names
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importTablesNotStarted <p>
     *            The names of tables that have not been yet imported.
     *            </p>
     *            <p>
     *            Valid Values: List of table names
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeResizeResult withImportTablesNotStarted(String... importTablesNotStarted) {
        if (getImportTablesNotStarted() == null) {
            this.importTablesNotStarted = new java.util.ArrayList<String>(
                    importTablesNotStarted.length);
        }
        for (String value : importTablesNotStarted) {
            this.importTablesNotStarted.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of tables that have not been yet imported.
     * </p>
     * <p>
     * Valid Values: List of table names
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importTablesNotStarted <p>
     *            The names of tables that have not been yet imported.
     *            </p>
     *            <p>
     *            Valid Values: List of table names
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeResizeResult withImportTablesNotStarted(
            java.util.Collection<String> importTablesNotStarted) {
        setImportTablesNotStarted(importTablesNotStarted);
        return this;
    }

    /**
     * <p>
     * The average rate of the resize operation over the last few minutes,
     * measured in megabytes per second. After the resize operation completes,
     * this value shows the average rate of the entire resize operation.
     * </p>
     *
     * @return <p>
     *         The average rate of the resize operation over the last few
     *         minutes, measured in megabytes per second. After the resize
     *         operation completes, this value shows the average rate of the
     *         entire resize operation.
     *         </p>
     */
    public Double getAvgResizeRateInMegaBytesPerSecond() {
        return avgResizeRateInMegaBytesPerSecond;
    }

    /**
     * <p>
     * The average rate of the resize operation over the last few minutes,
     * measured in megabytes per second. After the resize operation completes,
     * this value shows the average rate of the entire resize operation.
     * </p>
     *
     * @param avgResizeRateInMegaBytesPerSecond <p>
     *            The average rate of the resize operation over the last few
     *            minutes, measured in megabytes per second. After the resize
     *            operation completes, this value shows the average rate of the
     *            entire resize operation.
     *            </p>
     */
    public void setAvgResizeRateInMegaBytesPerSecond(Double avgResizeRateInMegaBytesPerSecond) {
        this.avgResizeRateInMegaBytesPerSecond = avgResizeRateInMegaBytesPerSecond;
    }

    /**
     * <p>
     * The average rate of the resize operation over the last few minutes,
     * measured in megabytes per second. After the resize operation completes,
     * this value shows the average rate of the entire resize operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param avgResizeRateInMegaBytesPerSecond <p>
     *            The average rate of the resize operation over the last few
     *            minutes, measured in megabytes per second. After the resize
     *            operation completes, this value shows the average rate of the
     *            entire resize operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeResizeResult withAvgResizeRateInMegaBytesPerSecond(
            Double avgResizeRateInMegaBytesPerSecond) {
        this.avgResizeRateInMegaBytesPerSecond = avgResizeRateInMegaBytesPerSecond;
        return this;
    }

    /**
     * <p>
     * The estimated total amount of data, in megabytes, on the cluster before
     * the resize operation began.
     * </p>
     *
     * @return <p>
     *         The estimated total amount of data, in megabytes, on the cluster
     *         before the resize operation began.
     *         </p>
     */
    public Long getTotalResizeDataInMegaBytes() {
        return totalResizeDataInMegaBytes;
    }

    /**
     * <p>
     * The estimated total amount of data, in megabytes, on the cluster before
     * the resize operation began.
     * </p>
     *
     * @param totalResizeDataInMegaBytes <p>
     *            The estimated total amount of data, in megabytes, on the
     *            cluster before the resize operation began.
     *            </p>
     */
    public void setTotalResizeDataInMegaBytes(Long totalResizeDataInMegaBytes) {
        this.totalResizeDataInMegaBytes = totalResizeDataInMegaBytes;
    }

    /**
     * <p>
     * The estimated total amount of data, in megabytes, on the cluster before
     * the resize operation began.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalResizeDataInMegaBytes <p>
     *            The estimated total amount of data, in megabytes, on the
     *            cluster before the resize operation began.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeResizeResult withTotalResizeDataInMegaBytes(Long totalResizeDataInMegaBytes) {
        this.totalResizeDataInMegaBytes = totalResizeDataInMegaBytes;
        return this;
    }

    /**
     * <p>
     * While the resize operation is in progress, this value shows the current
     * amount of data, in megabytes, that has been processed so far. When the
     * resize operation is complete, this value shows the total amount of data,
     * in megabytes, on the cluster, which may be more or less than
     * TotalResizeDataInMegaBytes (the estimated total amount of data before
     * resize).
     * </p>
     *
     * @return <p>
     *         While the resize operation is in progress, this value shows the
     *         current amount of data, in megabytes, that has been processed so
     *         far. When the resize operation is complete, this value shows the
     *         total amount of data, in megabytes, on the cluster, which may be
     *         more or less than TotalResizeDataInMegaBytes (the estimated total
     *         amount of data before resize).
     *         </p>
     */
    public Long getProgressInMegaBytes() {
        return progressInMegaBytes;
    }

    /**
     * <p>
     * While the resize operation is in progress, this value shows the current
     * amount of data, in megabytes, that has been processed so far. When the
     * resize operation is complete, this value shows the total amount of data,
     * in megabytes, on the cluster, which may be more or less than
     * TotalResizeDataInMegaBytes (the estimated total amount of data before
     * resize).
     * </p>
     *
     * @param progressInMegaBytes <p>
     *            While the resize operation is in progress, this value shows
     *            the current amount of data, in megabytes, that has been
     *            processed so far. When the resize operation is complete, this
     *            value shows the total amount of data, in megabytes, on the
     *            cluster, which may be more or less than
     *            TotalResizeDataInMegaBytes (the estimated total amount of data
     *            before resize).
     *            </p>
     */
    public void setProgressInMegaBytes(Long progressInMegaBytes) {
        this.progressInMegaBytes = progressInMegaBytes;
    }

    /**
     * <p>
     * While the resize operation is in progress, this value shows the current
     * amount of data, in megabytes, that has been processed so far. When the
     * resize operation is complete, this value shows the total amount of data,
     * in megabytes, on the cluster, which may be more or less than
     * TotalResizeDataInMegaBytes (the estimated total amount of data before
     * resize).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param progressInMegaBytes <p>
     *            While the resize operation is in progress, this value shows
     *            the current amount of data, in megabytes, that has been
     *            processed so far. When the resize operation is complete, this
     *            value shows the total amount of data, in megabytes, on the
     *            cluster, which may be more or less than
     *            TotalResizeDataInMegaBytes (the estimated total amount of data
     *            before resize).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeResizeResult withProgressInMegaBytes(Long progressInMegaBytes) {
        this.progressInMegaBytes = progressInMegaBytes;
        return this;
    }

    /**
     * <p>
     * The amount of seconds that have elapsed since the resize operation began.
     * After the resize operation completes, this value shows the total actual
     * time, in seconds, for the resize operation.
     * </p>
     *
     * @return <p>
     *         The amount of seconds that have elapsed since the resize
     *         operation began. After the resize operation completes, this value
     *         shows the total actual time, in seconds, for the resize
     *         operation.
     *         </p>
     */
    public Long getElapsedTimeInSeconds() {
        return elapsedTimeInSeconds;
    }

    /**
     * <p>
     * The amount of seconds that have elapsed since the resize operation began.
     * After the resize operation completes, this value shows the total actual
     * time, in seconds, for the resize operation.
     * </p>
     *
     * @param elapsedTimeInSeconds <p>
     *            The amount of seconds that have elapsed since the resize
     *            operation began. After the resize operation completes, this
     *            value shows the total actual time, in seconds, for the resize
     *            operation.
     *            </p>
     */
    public void setElapsedTimeInSeconds(Long elapsedTimeInSeconds) {
        this.elapsedTimeInSeconds = elapsedTimeInSeconds;
    }

    /**
     * <p>
     * The amount of seconds that have elapsed since the resize operation began.
     * After the resize operation completes, this value shows the total actual
     * time, in seconds, for the resize operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elapsedTimeInSeconds <p>
     *            The amount of seconds that have elapsed since the resize
     *            operation began. After the resize operation completes, this
     *            value shows the total actual time, in seconds, for the resize
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeResizeResult withElapsedTimeInSeconds(Long elapsedTimeInSeconds) {
        this.elapsedTimeInSeconds = elapsedTimeInSeconds;
        return this;
    }

    /**
     * <p>
     * The estimated time remaining, in seconds, until the resize operation is
     * complete. This value is calculated based on the average resize rate and
     * the estimated amount of data remaining to be processed. Once the resize
     * operation is complete, this value will be 0.
     * </p>
     *
     * @return <p>
     *         The estimated time remaining, in seconds, until the resize
     *         operation is complete. This value is calculated based on the
     *         average resize rate and the estimated amount of data remaining to
     *         be processed. Once the resize operation is complete, this value
     *         will be 0.
     *         </p>
     */
    public Long getEstimatedTimeToCompletionInSeconds() {
        return estimatedTimeToCompletionInSeconds;
    }

    /**
     * <p>
     * The estimated time remaining, in seconds, until the resize operation is
     * complete. This value is calculated based on the average resize rate and
     * the estimated amount of data remaining to be processed. Once the resize
     * operation is complete, this value will be 0.
     * </p>
     *
     * @param estimatedTimeToCompletionInSeconds <p>
     *            The estimated time remaining, in seconds, until the resize
     *            operation is complete. This value is calculated based on the
     *            average resize rate and the estimated amount of data remaining
     *            to be processed. Once the resize operation is complete, this
     *            value will be 0.
     *            </p>
     */
    public void setEstimatedTimeToCompletionInSeconds(Long estimatedTimeToCompletionInSeconds) {
        this.estimatedTimeToCompletionInSeconds = estimatedTimeToCompletionInSeconds;
    }

    /**
     * <p>
     * The estimated time remaining, in seconds, until the resize operation is
     * complete. This value is calculated based on the average resize rate and
     * the estimated amount of data remaining to be processed. Once the resize
     * operation is complete, this value will be 0.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param estimatedTimeToCompletionInSeconds <p>
     *            The estimated time remaining, in seconds, until the resize
     *            operation is complete. This value is calculated based on the
     *            average resize rate and the estimated amount of data remaining
     *            to be processed. Once the resize operation is complete, this
     *            value will be 0.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeResizeResult withEstimatedTimeToCompletionInSeconds(
            Long estimatedTimeToCompletionInSeconds) {
        this.estimatedTimeToCompletionInSeconds = estimatedTimeToCompletionInSeconds;
        return this;
    }

    /**
     * <p>
     * An enum with possible values of <code>ClassicResize</code> and
     * <code>ElasticResize</code>. These values describe the type of resize
     * operation being performed.
     * </p>
     *
     * @return <p>
     *         An enum with possible values of <code>ClassicResize</code> and
     *         <code>ElasticResize</code>. These values describe the type of
     *         resize operation being performed.
     *         </p>
     */
    public String getResizeType() {
        return resizeType;
    }

    /**
     * <p>
     * An enum with possible values of <code>ClassicResize</code> and
     * <code>ElasticResize</code>. These values describe the type of resize
     * operation being performed.
     * </p>
     *
     * @param resizeType <p>
     *            An enum with possible values of <code>ClassicResize</code> and
     *            <code>ElasticResize</code>. These values describe the type of
     *            resize operation being performed.
     *            </p>
     */
    public void setResizeType(String resizeType) {
        this.resizeType = resizeType;
    }

    /**
     * <p>
     * An enum with possible values of <code>ClassicResize</code> and
     * <code>ElasticResize</code>. These values describe the type of resize
     * operation being performed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resizeType <p>
     *            An enum with possible values of <code>ClassicResize</code> and
     *            <code>ElasticResize</code>. These values describe the type of
     *            resize operation being performed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeResizeResult withResizeType(String resizeType) {
        this.resizeType = resizeType;
        return this;
    }

    /**
     * <p>
     * An optional string to provide additional details about the resize action.
     * </p>
     *
     * @return <p>
     *         An optional string to provide additional details about the resize
     *         action.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * An optional string to provide additional details about the resize action.
     * </p>
     *
     * @param message <p>
     *            An optional string to provide additional details about the
     *            resize action.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * An optional string to provide additional details about the resize action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            An optional string to provide additional details about the
     *            resize action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeResizeResult withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The type of encryption for the cluster after the resize is complete.
     * </p>
     * <p>
     * Possible values are <code>KMS</code> and <code>None</code>. In the China
     * region possible values are: <code>Legacy</code> and <code>None</code>.
     * </p>
     *
     * @return <p>
     *         The type of encryption for the cluster after the resize is
     *         complete.
     *         </p>
     *         <p>
     *         Possible values are <code>KMS</code> and <code>None</code>. In
     *         the China region possible values are: <code>Legacy</code> and
     *         <code>None</code>.
     *         </p>
     */
    public String getTargetEncryptionType() {
        return targetEncryptionType;
    }

    /**
     * <p>
     * The type of encryption for the cluster after the resize is complete.
     * </p>
     * <p>
     * Possible values are <code>KMS</code> and <code>None</code>. In the China
     * region possible values are: <code>Legacy</code> and <code>None</code>.
     * </p>
     *
     * @param targetEncryptionType <p>
     *            The type of encryption for the cluster after the resize is
     *            complete.
     *            </p>
     *            <p>
     *            Possible values are <code>KMS</code> and <code>None</code>. In
     *            the China region possible values are: <code>Legacy</code> and
     *            <code>None</code>.
     *            </p>
     */
    public void setTargetEncryptionType(String targetEncryptionType) {
        this.targetEncryptionType = targetEncryptionType;
    }

    /**
     * <p>
     * The type of encryption for the cluster after the resize is complete.
     * </p>
     * <p>
     * Possible values are <code>KMS</code> and <code>None</code>. In the China
     * region possible values are: <code>Legacy</code> and <code>None</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetEncryptionType <p>
     *            The type of encryption for the cluster after the resize is
     *            complete.
     *            </p>
     *            <p>
     *            Possible values are <code>KMS</code> and <code>None</code>. In
     *            the China region possible values are: <code>Legacy</code> and
     *            <code>None</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeResizeResult withTargetEncryptionType(String targetEncryptionType) {
        this.targetEncryptionType = targetEncryptionType;
        return this;
    }

    /**
     * <p>
     * The percent of data transferred from source cluster to target cluster.
     * </p>
     *
     * @return <p>
     *         The percent of data transferred from source cluster to target
     *         cluster.
     *         </p>
     */
    public Double getDataTransferProgressPercent() {
        return dataTransferProgressPercent;
    }

    /**
     * <p>
     * The percent of data transferred from source cluster to target cluster.
     * </p>
     *
     * @param dataTransferProgressPercent <p>
     *            The percent of data transferred from source cluster to target
     *            cluster.
     *            </p>
     */
    public void setDataTransferProgressPercent(Double dataTransferProgressPercent) {
        this.dataTransferProgressPercent = dataTransferProgressPercent;
    }

    /**
     * <p>
     * The percent of data transferred from source cluster to target cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataTransferProgressPercent <p>
     *            The percent of data transferred from source cluster to target
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeResizeResult withDataTransferProgressPercent(Double dataTransferProgressPercent) {
        this.dataTransferProgressPercent = dataTransferProgressPercent;
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
        if (getTargetNodeType() != null)
            sb.append("TargetNodeType: " + getTargetNodeType() + ",");
        if (getTargetNumberOfNodes() != null)
            sb.append("TargetNumberOfNodes: " + getTargetNumberOfNodes() + ",");
        if (getTargetClusterType() != null)
            sb.append("TargetClusterType: " + getTargetClusterType() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getImportTablesCompleted() != null)
            sb.append("ImportTablesCompleted: " + getImportTablesCompleted() + ",");
        if (getImportTablesInProgress() != null)
            sb.append("ImportTablesInProgress: " + getImportTablesInProgress() + ",");
        if (getImportTablesNotStarted() != null)
            sb.append("ImportTablesNotStarted: " + getImportTablesNotStarted() + ",");
        if (getAvgResizeRateInMegaBytesPerSecond() != null)
            sb.append("AvgResizeRateInMegaBytesPerSecond: "
                    + getAvgResizeRateInMegaBytesPerSecond() + ",");
        if (getTotalResizeDataInMegaBytes() != null)
            sb.append("TotalResizeDataInMegaBytes: " + getTotalResizeDataInMegaBytes() + ",");
        if (getProgressInMegaBytes() != null)
            sb.append("ProgressInMegaBytes: " + getProgressInMegaBytes() + ",");
        if (getElapsedTimeInSeconds() != null)
            sb.append("ElapsedTimeInSeconds: " + getElapsedTimeInSeconds() + ",");
        if (getEstimatedTimeToCompletionInSeconds() != null)
            sb.append("EstimatedTimeToCompletionInSeconds: "
                    + getEstimatedTimeToCompletionInSeconds() + ",");
        if (getResizeType() != null)
            sb.append("ResizeType: " + getResizeType() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getTargetEncryptionType() != null)
            sb.append("TargetEncryptionType: " + getTargetEncryptionType() + ",");
        if (getDataTransferProgressPercent() != null)
            sb.append("DataTransferProgressPercent: " + getDataTransferProgressPercent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTargetNodeType() == null) ? 0 : getTargetNodeType().hashCode());
        hashCode = prime * hashCode
                + ((getTargetNumberOfNodes() == null) ? 0 : getTargetNumberOfNodes().hashCode());
        hashCode = prime * hashCode
                + ((getTargetClusterType() == null) ? 0 : getTargetClusterType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getImportTablesCompleted() == null) ? 0 : getImportTablesCompleted().hashCode());
        hashCode = prime
                * hashCode
                + ((getImportTablesInProgress() == null) ? 0 : getImportTablesInProgress()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getImportTablesNotStarted() == null) ? 0 : getImportTablesNotStarted()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAvgResizeRateInMegaBytesPerSecond() == null) ? 0
                        : getAvgResizeRateInMegaBytesPerSecond().hashCode());
        hashCode = prime
                * hashCode
                + ((getTotalResizeDataInMegaBytes() == null) ? 0 : getTotalResizeDataInMegaBytes()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getProgressInMegaBytes() == null) ? 0 : getProgressInMegaBytes().hashCode());
        hashCode = prime * hashCode
                + ((getElapsedTimeInSeconds() == null) ? 0 : getElapsedTimeInSeconds().hashCode());
        hashCode = prime
                * hashCode
                + ((getEstimatedTimeToCompletionInSeconds() == null) ? 0
                        : getEstimatedTimeToCompletionInSeconds().hashCode());
        hashCode = prime * hashCode + ((getResizeType() == null) ? 0 : getResizeType().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode
                + ((getTargetEncryptionType() == null) ? 0 : getTargetEncryptionType().hashCode());
        hashCode = prime
                * hashCode
                + ((getDataTransferProgressPercent() == null) ? 0
                        : getDataTransferProgressPercent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeResizeResult == false)
            return false;
        DescribeResizeResult other = (DescribeResizeResult) obj;

        if (other.getTargetNodeType() == null ^ this.getTargetNodeType() == null)
            return false;
        if (other.getTargetNodeType() != null
                && other.getTargetNodeType().equals(this.getTargetNodeType()) == false)
            return false;
        if (other.getTargetNumberOfNodes() == null ^ this.getTargetNumberOfNodes() == null)
            return false;
        if (other.getTargetNumberOfNodes() != null
                && other.getTargetNumberOfNodes().equals(this.getTargetNumberOfNodes()) == false)
            return false;
        if (other.getTargetClusterType() == null ^ this.getTargetClusterType() == null)
            return false;
        if (other.getTargetClusterType() != null
                && other.getTargetClusterType().equals(this.getTargetClusterType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getImportTablesCompleted() == null ^ this.getImportTablesCompleted() == null)
            return false;
        if (other.getImportTablesCompleted() != null
                && other.getImportTablesCompleted().equals(this.getImportTablesCompleted()) == false)
            return false;
        if (other.getImportTablesInProgress() == null ^ this.getImportTablesInProgress() == null)
            return false;
        if (other.getImportTablesInProgress() != null
                && other.getImportTablesInProgress().equals(this.getImportTablesInProgress()) == false)
            return false;
        if (other.getImportTablesNotStarted() == null ^ this.getImportTablesNotStarted() == null)
            return false;
        if (other.getImportTablesNotStarted() != null
                && other.getImportTablesNotStarted().equals(this.getImportTablesNotStarted()) == false)
            return false;
        if (other.getAvgResizeRateInMegaBytesPerSecond() == null
                ^ this.getAvgResizeRateInMegaBytesPerSecond() == null)
            return false;
        if (other.getAvgResizeRateInMegaBytesPerSecond() != null
                && other.getAvgResizeRateInMegaBytesPerSecond().equals(
                        this.getAvgResizeRateInMegaBytesPerSecond()) == false)
            return false;
        if (other.getTotalResizeDataInMegaBytes() == null
                ^ this.getTotalResizeDataInMegaBytes() == null)
            return false;
        if (other.getTotalResizeDataInMegaBytes() != null
                && other.getTotalResizeDataInMegaBytes().equals(
                        this.getTotalResizeDataInMegaBytes()) == false)
            return false;
        if (other.getProgressInMegaBytes() == null ^ this.getProgressInMegaBytes() == null)
            return false;
        if (other.getProgressInMegaBytes() != null
                && other.getProgressInMegaBytes().equals(this.getProgressInMegaBytes()) == false)
            return false;
        if (other.getElapsedTimeInSeconds() == null ^ this.getElapsedTimeInSeconds() == null)
            return false;
        if (other.getElapsedTimeInSeconds() != null
                && other.getElapsedTimeInSeconds().equals(this.getElapsedTimeInSeconds()) == false)
            return false;
        if (other.getEstimatedTimeToCompletionInSeconds() == null
                ^ this.getEstimatedTimeToCompletionInSeconds() == null)
            return false;
        if (other.getEstimatedTimeToCompletionInSeconds() != null
                && other.getEstimatedTimeToCompletionInSeconds().equals(
                        this.getEstimatedTimeToCompletionInSeconds()) == false)
            return false;
        if (other.getResizeType() == null ^ this.getResizeType() == null)
            return false;
        if (other.getResizeType() != null
                && other.getResizeType().equals(this.getResizeType()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getTargetEncryptionType() == null ^ this.getTargetEncryptionType() == null)
            return false;
        if (other.getTargetEncryptionType() != null
                && other.getTargetEncryptionType().equals(this.getTargetEncryptionType()) == false)
            return false;
        if (other.getDataTransferProgressPercent() == null
                ^ this.getDataTransferProgressPercent() == null)
            return false;
        if (other.getDataTransferProgressPercent() != null
                && other.getDataTransferProgressPercent().equals(
                        this.getDataTransferProgressPercent()) == false)
            return false;
        return true;
    }
}
