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

public class BatchPutDocumentResult implements Serializable {
    /**
     * <p>
     * A list of documents that were not added to the index because the document
     * failed a validation check. Each document contains an error message that
     * indicates why the document couldn't be added to the index.
     * </p>
     * <p>
     * If there was an error adding a document to an index the error is reported
     * in your AWS CloudWatch log. For more information, see <a href=
     * "https://docs.aws.amazon.com/kendra/latest/dg/cloudwatch-logs.html"
     * >Monitoring Amazon Kendra with Amazon CloudWatch Logs</a>
     * </p>
     */
    private java.util.List<BatchPutDocumentResponseFailedDocument> failedDocuments;

    /**
     * <p>
     * A list of documents that were not added to the index because the document
     * failed a validation check. Each document contains an error message that
     * indicates why the document couldn't be added to the index.
     * </p>
     * <p>
     * If there was an error adding a document to an index the error is reported
     * in your AWS CloudWatch log. For more information, see <a href=
     * "https://docs.aws.amazon.com/kendra/latest/dg/cloudwatch-logs.html"
     * >Monitoring Amazon Kendra with Amazon CloudWatch Logs</a>
     * </p>
     *
     * @return <p>
     *         A list of documents that were not added to the index because the
     *         document failed a validation check. Each document contains an
     *         error message that indicates why the document couldn't be added
     *         to the index.
     *         </p>
     *         <p>
     *         If there was an error adding a document to an index the error is
     *         reported in your AWS CloudWatch log. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/kendra/latest/dg/cloudwatch-logs.html"
     *         >Monitoring Amazon Kendra with Amazon CloudWatch Logs</a>
     *         </p>
     */
    public java.util.List<BatchPutDocumentResponseFailedDocument> getFailedDocuments() {
        return failedDocuments;
    }

    /**
     * <p>
     * A list of documents that were not added to the index because the document
     * failed a validation check. Each document contains an error message that
     * indicates why the document couldn't be added to the index.
     * </p>
     * <p>
     * If there was an error adding a document to an index the error is reported
     * in your AWS CloudWatch log. For more information, see <a href=
     * "https://docs.aws.amazon.com/kendra/latest/dg/cloudwatch-logs.html"
     * >Monitoring Amazon Kendra with Amazon CloudWatch Logs</a>
     * </p>
     *
     * @param failedDocuments <p>
     *            A list of documents that were not added to the index because
     *            the document failed a validation check. Each document contains
     *            an error message that indicates why the document couldn't be
     *            added to the index.
     *            </p>
     *            <p>
     *            If there was an error adding a document to an index the error
     *            is reported in your AWS CloudWatch log. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/kendra/latest/dg/cloudwatch-logs.html"
     *            >Monitoring Amazon Kendra with Amazon CloudWatch Logs</a>
     *            </p>
     */
    public void setFailedDocuments(
            java.util.Collection<BatchPutDocumentResponseFailedDocument> failedDocuments) {
        if (failedDocuments == null) {
            this.failedDocuments = null;
            return;
        }

        this.failedDocuments = new java.util.ArrayList<BatchPutDocumentResponseFailedDocument>(
                failedDocuments);
    }

    /**
     * <p>
     * A list of documents that were not added to the index because the document
     * failed a validation check. Each document contains an error message that
     * indicates why the document couldn't be added to the index.
     * </p>
     * <p>
     * If there was an error adding a document to an index the error is reported
     * in your AWS CloudWatch log. For more information, see <a href=
     * "https://docs.aws.amazon.com/kendra/latest/dg/cloudwatch-logs.html"
     * >Monitoring Amazon Kendra with Amazon CloudWatch Logs</a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedDocuments <p>
     *            A list of documents that were not added to the index because
     *            the document failed a validation check. Each document contains
     *            an error message that indicates why the document couldn't be
     *            added to the index.
     *            </p>
     *            <p>
     *            If there was an error adding a document to an index the error
     *            is reported in your AWS CloudWatch log. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/kendra/latest/dg/cloudwatch-logs.html"
     *            >Monitoring Amazon Kendra with Amazon CloudWatch Logs</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutDocumentResult withFailedDocuments(
            BatchPutDocumentResponseFailedDocument... failedDocuments) {
        if (getFailedDocuments() == null) {
            this.failedDocuments = new java.util.ArrayList<BatchPutDocumentResponseFailedDocument>(
                    failedDocuments.length);
        }
        for (BatchPutDocumentResponseFailedDocument value : failedDocuments) {
            this.failedDocuments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of documents that were not added to the index because the document
     * failed a validation check. Each document contains an error message that
     * indicates why the document couldn't be added to the index.
     * </p>
     * <p>
     * If there was an error adding a document to an index the error is reported
     * in your AWS CloudWatch log. For more information, see <a href=
     * "https://docs.aws.amazon.com/kendra/latest/dg/cloudwatch-logs.html"
     * >Monitoring Amazon Kendra with Amazon CloudWatch Logs</a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedDocuments <p>
     *            A list of documents that were not added to the index because
     *            the document failed a validation check. Each document contains
     *            an error message that indicates why the document couldn't be
     *            added to the index.
     *            </p>
     *            <p>
     *            If there was an error adding a document to an index the error
     *            is reported in your AWS CloudWatch log. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/kendra/latest/dg/cloudwatch-logs.html"
     *            >Monitoring Amazon Kendra with Amazon CloudWatch Logs</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutDocumentResult withFailedDocuments(
            java.util.Collection<BatchPutDocumentResponseFailedDocument> failedDocuments) {
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

        if (obj instanceof BatchPutDocumentResult == false)
            return false;
        BatchPutDocumentResult other = (BatchPutDocumentResult) obj;

        if (other.getFailedDocuments() == null ^ this.getFailedDocuments() == null)
            return false;
        if (other.getFailedDocuments() != null
                && other.getFailedDocuments().equals(this.getFailedDocuments()) == false)
            return false;
        return true;
    }
}
