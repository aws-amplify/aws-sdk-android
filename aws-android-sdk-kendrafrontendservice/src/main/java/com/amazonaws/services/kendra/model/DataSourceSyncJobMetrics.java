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

/**
 * <p>
 * Maps a batch delete document request to a specific data source sync job. This
 * is optional and should only be supplied when documents are deleted by a
 * connector.
 * </p>
 */
public class DataSourceSyncJobMetrics implements Serializable {
    /**
     * <p>
     * The number of documents added from the data source up to now in the data
     * source sync.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(([1-9][0-9]*)|0)<br/>
     */
    private String documentsAdded;

    /**
     * <p>
     * The number of documents modified in the data source up to now in the data
     * source sync run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(([1-9][0-9]*)|0)<br/>
     */
    private String documentsModified;

    /**
     * <p>
     * The number of documents deleted from the data source up to now in the
     * data source sync run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(([1-9][0-9]*)|0)<br/>
     */
    private String documentsDeleted;

    /**
     * <p>
     * The number of documents that failed to sync from the data source up to
     * now in the data source sync run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(([1-9][0-9]*)|0)<br/>
     */
    private String documentsFailed;

    /**
     * <p>
     * The current number of documents crawled by the current sync job in the
     * data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(([1-9][0-9]*)|0)<br/>
     */
    private String documentsScanned;

    /**
     * <p>
     * The number of documents added from the data source up to now in the data
     * source sync.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(([1-9][0-9]*)|0)<br/>
     *
     * @return <p>
     *         The number of documents added from the data source up to now in
     *         the data source sync.
     *         </p>
     */
    public String getDocumentsAdded() {
        return documentsAdded;
    }

    /**
     * <p>
     * The number of documents added from the data source up to now in the data
     * source sync.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(([1-9][0-9]*)|0)<br/>
     *
     * @param documentsAdded <p>
     *            The number of documents added from the data source up to now
     *            in the data source sync.
     *            </p>
     */
    public void setDocumentsAdded(String documentsAdded) {
        this.documentsAdded = documentsAdded;
    }

    /**
     * <p>
     * The number of documents added from the data source up to now in the data
     * source sync.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(([1-9][0-9]*)|0)<br/>
     *
     * @param documentsAdded <p>
     *            The number of documents added from the data source up to now
     *            in the data source sync.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceSyncJobMetrics withDocumentsAdded(String documentsAdded) {
        this.documentsAdded = documentsAdded;
        return this;
    }

    /**
     * <p>
     * The number of documents modified in the data source up to now in the data
     * source sync run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(([1-9][0-9]*)|0)<br/>
     *
     * @return <p>
     *         The number of documents modified in the data source up to now in
     *         the data source sync run.
     *         </p>
     */
    public String getDocumentsModified() {
        return documentsModified;
    }

    /**
     * <p>
     * The number of documents modified in the data source up to now in the data
     * source sync run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(([1-9][0-9]*)|0)<br/>
     *
     * @param documentsModified <p>
     *            The number of documents modified in the data source up to now
     *            in the data source sync run.
     *            </p>
     */
    public void setDocumentsModified(String documentsModified) {
        this.documentsModified = documentsModified;
    }

    /**
     * <p>
     * The number of documents modified in the data source up to now in the data
     * source sync run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(([1-9][0-9]*)|0)<br/>
     *
     * @param documentsModified <p>
     *            The number of documents modified in the data source up to now
     *            in the data source sync run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceSyncJobMetrics withDocumentsModified(String documentsModified) {
        this.documentsModified = documentsModified;
        return this;
    }

    /**
     * <p>
     * The number of documents deleted from the data source up to now in the
     * data source sync run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(([1-9][0-9]*)|0)<br/>
     *
     * @return <p>
     *         The number of documents deleted from the data source up to now in
     *         the data source sync run.
     *         </p>
     */
    public String getDocumentsDeleted() {
        return documentsDeleted;
    }

    /**
     * <p>
     * The number of documents deleted from the data source up to now in the
     * data source sync run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(([1-9][0-9]*)|0)<br/>
     *
     * @param documentsDeleted <p>
     *            The number of documents deleted from the data source up to now
     *            in the data source sync run.
     *            </p>
     */
    public void setDocumentsDeleted(String documentsDeleted) {
        this.documentsDeleted = documentsDeleted;
    }

    /**
     * <p>
     * The number of documents deleted from the data source up to now in the
     * data source sync run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(([1-9][0-9]*)|0)<br/>
     *
     * @param documentsDeleted <p>
     *            The number of documents deleted from the data source up to now
     *            in the data source sync run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceSyncJobMetrics withDocumentsDeleted(String documentsDeleted) {
        this.documentsDeleted = documentsDeleted;
        return this;
    }

    /**
     * <p>
     * The number of documents that failed to sync from the data source up to
     * now in the data source sync run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(([1-9][0-9]*)|0)<br/>
     *
     * @return <p>
     *         The number of documents that failed to sync from the data source
     *         up to now in the data source sync run.
     *         </p>
     */
    public String getDocumentsFailed() {
        return documentsFailed;
    }

    /**
     * <p>
     * The number of documents that failed to sync from the data source up to
     * now in the data source sync run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(([1-9][0-9]*)|0)<br/>
     *
     * @param documentsFailed <p>
     *            The number of documents that failed to sync from the data
     *            source up to now in the data source sync run.
     *            </p>
     */
    public void setDocumentsFailed(String documentsFailed) {
        this.documentsFailed = documentsFailed;
    }

    /**
     * <p>
     * The number of documents that failed to sync from the data source up to
     * now in the data source sync run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(([1-9][0-9]*)|0)<br/>
     *
     * @param documentsFailed <p>
     *            The number of documents that failed to sync from the data
     *            source up to now in the data source sync run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceSyncJobMetrics withDocumentsFailed(String documentsFailed) {
        this.documentsFailed = documentsFailed;
        return this;
    }

    /**
     * <p>
     * The current number of documents crawled by the current sync job in the
     * data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(([1-9][0-9]*)|0)<br/>
     *
     * @return <p>
     *         The current number of documents crawled by the current sync job
     *         in the data source.
     *         </p>
     */
    public String getDocumentsScanned() {
        return documentsScanned;
    }

    /**
     * <p>
     * The current number of documents crawled by the current sync job in the
     * data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(([1-9][0-9]*)|0)<br/>
     *
     * @param documentsScanned <p>
     *            The current number of documents crawled by the current sync
     *            job in the data source.
     *            </p>
     */
    public void setDocumentsScanned(String documentsScanned) {
        this.documentsScanned = documentsScanned;
    }

    /**
     * <p>
     * The current number of documents crawled by the current sync job in the
     * data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(([1-9][0-9]*)|0)<br/>
     *
     * @param documentsScanned <p>
     *            The current number of documents crawled by the current sync
     *            job in the data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSourceSyncJobMetrics withDocumentsScanned(String documentsScanned) {
        this.documentsScanned = documentsScanned;
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
        if (getDocumentsAdded() != null)
            sb.append("DocumentsAdded: " + getDocumentsAdded() + ",");
        if (getDocumentsModified() != null)
            sb.append("DocumentsModified: " + getDocumentsModified() + ",");
        if (getDocumentsDeleted() != null)
            sb.append("DocumentsDeleted: " + getDocumentsDeleted() + ",");
        if (getDocumentsFailed() != null)
            sb.append("DocumentsFailed: " + getDocumentsFailed() + ",");
        if (getDocumentsScanned() != null)
            sb.append("DocumentsScanned: " + getDocumentsScanned());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDocumentsAdded() == null) ? 0 : getDocumentsAdded().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentsModified() == null) ? 0 : getDocumentsModified().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentsDeleted() == null) ? 0 : getDocumentsDeleted().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentsFailed() == null) ? 0 : getDocumentsFailed().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentsScanned() == null) ? 0 : getDocumentsScanned().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceSyncJobMetrics == false)
            return false;
        DataSourceSyncJobMetrics other = (DataSourceSyncJobMetrics) obj;

        if (other.getDocumentsAdded() == null ^ this.getDocumentsAdded() == null)
            return false;
        if (other.getDocumentsAdded() != null
                && other.getDocumentsAdded().equals(this.getDocumentsAdded()) == false)
            return false;
        if (other.getDocumentsModified() == null ^ this.getDocumentsModified() == null)
            return false;
        if (other.getDocumentsModified() != null
                && other.getDocumentsModified().equals(this.getDocumentsModified()) == false)
            return false;
        if (other.getDocumentsDeleted() == null ^ this.getDocumentsDeleted() == null)
            return false;
        if (other.getDocumentsDeleted() != null
                && other.getDocumentsDeleted().equals(this.getDocumentsDeleted()) == false)
            return false;
        if (other.getDocumentsFailed() == null ^ this.getDocumentsFailed() == null)
            return false;
        if (other.getDocumentsFailed() != null
                && other.getDocumentsFailed().equals(this.getDocumentsFailed()) == false)
            return false;
        if (other.getDocumentsScanned() == null ^ this.getDocumentsScanned() == null)
            return false;
        if (other.getDocumentsScanned() != null
                && other.getDocumentsScanned().equals(this.getDocumentsScanned()) == false)
            return false;
        return true;
    }
}
