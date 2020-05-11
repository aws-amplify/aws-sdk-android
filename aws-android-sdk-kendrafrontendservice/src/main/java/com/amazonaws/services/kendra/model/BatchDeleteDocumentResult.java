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

public class BatchDeleteDocumentResult implements Serializable {
    /**
     * <p>
     * A list of documents that could not be removed from the index. Each entry
     * contains an error message that indicates why the document couldn't be
     * removed from the index.
     * </p>
     */
    private java.util.List<BatchDeleteDocumentResponseFailedDocument> failedDocuments;

    /**
     * <p>
     * A list of documents that could not be removed from the index. Each entry
     * contains an error message that indicates why the document couldn't be
     * removed from the index.
     * </p>
     *
     * @return <p>
     *         A list of documents that could not be removed from the index.
     *         Each entry contains an error message that indicates why the
     *         document couldn't be removed from the index.
     *         </p>
     */
    public java.util.List<BatchDeleteDocumentResponseFailedDocument> getFailedDocuments() {
        return failedDocuments;
    }

    /**
     * <p>
     * A list of documents that could not be removed from the index. Each entry
     * contains an error message that indicates why the document couldn't be
     * removed from the index.
     * </p>
     *
     * @param failedDocuments <p>
     *            A list of documents that could not be removed from the index.
     *            Each entry contains an error message that indicates why the
     *            document couldn't be removed from the index.
     *            </p>
     */
    public void setFailedDocuments(
            java.util.Collection<BatchDeleteDocumentResponseFailedDocument> failedDocuments) {
        if (failedDocuments == null) {
            this.failedDocuments = null;
            return;
        }

        this.failedDocuments = new java.util.ArrayList<BatchDeleteDocumentResponseFailedDocument>(
                failedDocuments);
    }

    /**
     * <p>
     * A list of documents that could not be removed from the index. Each entry
     * contains an error message that indicates why the document couldn't be
     * removed from the index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedDocuments <p>
     *            A list of documents that could not be removed from the index.
     *            Each entry contains an error message that indicates why the
     *            document couldn't be removed from the index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeleteDocumentResult withFailedDocuments(
            BatchDeleteDocumentResponseFailedDocument... failedDocuments) {
        if (getFailedDocuments() == null) {
            this.failedDocuments = new java.util.ArrayList<BatchDeleteDocumentResponseFailedDocument>(
                    failedDocuments.length);
        }
        for (BatchDeleteDocumentResponseFailedDocument value : failedDocuments) {
            this.failedDocuments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of documents that could not be removed from the index. Each entry
     * contains an error message that indicates why the document couldn't be
     * removed from the index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedDocuments <p>
     *            A list of documents that could not be removed from the index.
     *            Each entry contains an error message that indicates why the
     *            document couldn't be removed from the index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeleteDocumentResult withFailedDocuments(
            java.util.Collection<BatchDeleteDocumentResponseFailedDocument> failedDocuments) {
        setFailedDocuments(failedDocuments);
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
        if (getFailedDocuments() != null)
            sb.append("FailedDocuments: " + getFailedDocuments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFailedDocuments() == null) ? 0 : getFailedDocuments().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteDocumentResult == false)
            return false;
        BatchDeleteDocumentResult other = (BatchDeleteDocumentResult) obj;

        if (other.getFailedDocuments() == null ^ this.getFailedDocuments() == null)
            return false;
        if (other.getFailedDocuments() != null
                && other.getFailedDocuments().equals(this.getFailedDocuments()) == false)
            return false;
        return true;
    }
}
