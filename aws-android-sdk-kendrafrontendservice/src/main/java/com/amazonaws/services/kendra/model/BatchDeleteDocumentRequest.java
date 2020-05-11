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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Removes one or more documents from an index. The documents must have been
 * added with the <a>BatchPutDocument</a> operation.
 * </p>
 * <p>
 * The documents are deleted asynchronously. You can see the progress of the
 * deletion by using AWS CloudWatch. Any error messages releated to the
 * processing of the batch are sent to you CloudWatch log.
 * </p>
 */
public class BatchDeleteDocumentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the index that contains the documents to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     */
    private String indexId;

    /**
     * <p>
     * One or more identifiers for documents to delete from the index.
     * </p>
     */
    private java.util.List<String> documentIdList;

    /**
     * <p>
     * Maps a particular data source sync job to a particular data source.
     * </p>
     */
    private DataSourceSyncJobMetricTarget dataSourceSyncJobMetricTarget;

    /**
     * <p>
     * The identifier of the index that contains the documents to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     *
     * @return <p>
     *         The identifier of the index that contains the documents to
     *         delete.
     *         </p>
     */
    public String getIndexId() {
        return indexId;
    }

    /**
     * <p>
     * The identifier of the index that contains the documents to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     *
     * @param indexId <p>
     *            The identifier of the index that contains the documents to
     *            delete.
     *            </p>
     */
    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index that contains the documents to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     *
     * @param indexId <p>
     *            The identifier of the index that contains the documents to
     *            delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeleteDocumentRequest withIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }

    /**
     * <p>
     * One or more identifiers for documents to delete from the index.
     * </p>
     *
     * @return <p>
     *         One or more identifiers for documents to delete from the index.
     *         </p>
     */
    public java.util.List<String> getDocumentIdList() {
        return documentIdList;
    }

    /**
     * <p>
     * One or more identifiers for documents to delete from the index.
     * </p>
     *
     * @param documentIdList <p>
     *            One or more identifiers for documents to delete from the
     *            index.
     *            </p>
     */
    public void setDocumentIdList(java.util.Collection<String> documentIdList) {
        if (documentIdList == null) {
            this.documentIdList = null;
            return;
        }

        this.documentIdList = new java.util.ArrayList<String>(documentIdList);
    }

    /**
     * <p>
     * One or more identifiers for documents to delete from the index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentIdList <p>
     *            One or more identifiers for documents to delete from the
     *            index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeleteDocumentRequest withDocumentIdList(String... documentIdList) {
        if (getDocumentIdList() == null) {
            this.documentIdList = new java.util.ArrayList<String>(documentIdList.length);
        }
        for (String value : documentIdList) {
            this.documentIdList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more identifiers for documents to delete from the index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentIdList <p>
     *            One or more identifiers for documents to delete from the
     *            index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeleteDocumentRequest withDocumentIdList(java.util.Collection<String> documentIdList) {
        setDocumentIdList(documentIdList);
        return this;
    }

    /**
     * <p>
     * Maps a particular data source sync job to a particular data source.
     * </p>
     *
     * @return <p>
     *         Maps a particular data source sync job to a particular data
     *         source.
     *         </p>
     */
    public DataSourceSyncJobMetricTarget getDataSourceSyncJobMetricTarget() {
        return dataSourceSyncJobMetricTarget;
    }

    /**
     * <p>
     * Maps a particular data source sync job to a particular data source.
     * </p>
     *
     * @param dataSourceSyncJobMetricTarget <p>
     *            Maps a particular data source sync job to a particular data
     *            source.
     *            </p>
     */
    public void setDataSourceSyncJobMetricTarget(
            DataSourceSyncJobMetricTarget dataSourceSyncJobMetricTarget) {
        this.dataSourceSyncJobMetricTarget = dataSourceSyncJobMetricTarget;
    }

    /**
     * <p>
     * Maps a particular data source sync job to a particular data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSourceSyncJobMetricTarget <p>
     *            Maps a particular data source sync job to a particular data
     *            source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeleteDocumentRequest withDataSourceSyncJobMetricTarget(
            DataSourceSyncJobMetricTarget dataSourceSyncJobMetricTarget) {
        this.dataSourceSyncJobMetricTarget = dataSourceSyncJobMetricTarget;
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
        if (getIndexId() != null)
            sb.append("IndexId: " + getIndexId() + ",");
        if (getDocumentIdList() != null)
            sb.append("DocumentIdList: " + getDocumentIdList() + ",");
        if (getDataSourceSyncJobMetricTarget() != null)
            sb.append("DataSourceSyncJobMetricTarget: " + getDataSourceSyncJobMetricTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentIdList() == null) ? 0 : getDocumentIdList().hashCode());
        hashCode = prime
                * hashCode
                + ((getDataSourceSyncJobMetricTarget() == null) ? 0
                        : getDataSourceSyncJobMetricTarget().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteDocumentRequest == false)
            return false;
        BatchDeleteDocumentRequest other = (BatchDeleteDocumentRequest) obj;

        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getDocumentIdList() == null ^ this.getDocumentIdList() == null)
            return false;
        if (other.getDocumentIdList() != null
                && other.getDocumentIdList().equals(this.getDocumentIdList()) == false)
            return false;
        if (other.getDataSourceSyncJobMetricTarget() == null
                ^ this.getDataSourceSyncJobMetricTarget() == null)
            return false;
        if (other.getDataSourceSyncJobMetricTarget() != null
                && other.getDataSourceSyncJobMetricTarget().equals(
                        this.getDataSourceSyncJobMetricTarget()) == false)
            return false;
        return true;
    }
}
