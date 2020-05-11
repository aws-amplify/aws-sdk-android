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
 * Adds one or more documents to an index.
 * </p>
 * <p>
 * The <code>BatchPutDocument</code> operation enables you to ingest inline
 * documents or a set of documents stored in an Amazon S3 bucket. Use this
 * operation to ingest your text and unstructured text into an index, add custom
 * attributes to the documents, and to attach an access control list to the
 * documents added to the index.
 * </p>
 * <p>
 * The documents are indexed asynchronously. You can see the progress of the
 * batch using AWS CloudWatch. Any error messages related to processing the
 * batch are sent to your AWS CloudWatch log.
 * </p>
 */
public class BatchPutDocumentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the index to add the documents to. You need to create
     * the index first using the <a>CreateIndex</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     */
    private String indexId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role that is allowed to run the
     * <code>BatchPutDocument</code> operation. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM
     * Roles for Amazon Kendra</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String roleArn;

    /**
     * <p>
     * One or more documents to add to the index.
     * </p>
     * <p>
     * Documents have the following file size limits.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 5 MB total size for inline documents
     * </p>
     * </li>
     * <li>
     * <p>
     * 50 MB total size for files from an S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * 5 MB extracted text for any file
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about file size and transaction per second quotas,
     * see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas
     * </a>.
     * </p>
     */
    private java.util.List<Document> documents;

    /**
     * <p>
     * The identifier of the index to add the documents to. You need to create
     * the index first using the <a>CreateIndex</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     *
     * @return <p>
     *         The identifier of the index to add the documents to. You need to
     *         create the index first using the <a>CreateIndex</a> operation.
     *         </p>
     */
    public String getIndexId() {
        return indexId;
    }

    /**
     * <p>
     * The identifier of the index to add the documents to. You need to create
     * the index first using the <a>CreateIndex</a> operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     *
     * @param indexId <p>
     *            The identifier of the index to add the documents to. You need
     *            to create the index first using the <a>CreateIndex</a>
     *            operation.
     *            </p>
     */
    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index to add the documents to. You need to create
     * the index first using the <a>CreateIndex</a> operation.
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
     *            The identifier of the index to add the documents to. You need
     *            to create the index first using the <a>CreateIndex</a>
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutDocumentRequest withIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role that is allowed to run the
     * <code>BatchPutDocument</code> operation. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM
     * Roles for Amazon Kendra</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of a role that is allowed to run
     *         the <code>BatchPutDocument</code> operation. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM
     *         Roles for Amazon Kendra</a>.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role that is allowed to run the
     * <code>BatchPutDocument</code> operation. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM
     * Roles for Amazon Kendra</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of a role that is allowed to
     *            run the <code>BatchPutDocument</code> operation. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html"
     *            >IAM Roles for Amazon Kendra</a>.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role that is allowed to run the
     * <code>BatchPutDocument</code> operation. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM
     * Roles for Amazon Kendra</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of a role that is allowed to
     *            run the <code>BatchPutDocument</code> operation. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html"
     *            >IAM Roles for Amazon Kendra</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutDocumentRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * One or more documents to add to the index.
     * </p>
     * <p>
     * Documents have the following file size limits.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 5 MB total size for inline documents
     * </p>
     * </li>
     * <li>
     * <p>
     * 50 MB total size for files from an S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * 5 MB extracted text for any file
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about file size and transaction per second quotas,
     * see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas
     * </a>.
     * </p>
     *
     * @return <p>
     *         One or more documents to add to the index.
     *         </p>
     *         <p>
     *         Documents have the following file size limits.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         5 MB total size for inline documents
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         50 MB total size for files from an S3 bucket
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         5 MB extracted text for any file
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about file size and transaction per second
     *         quotas, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html"
     *         >Quotas</a>.
     *         </p>
     */
    public java.util.List<Document> getDocuments() {
        return documents;
    }

    /**
     * <p>
     * One or more documents to add to the index.
     * </p>
     * <p>
     * Documents have the following file size limits.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 5 MB total size for inline documents
     * </p>
     * </li>
     * <li>
     * <p>
     * 50 MB total size for files from an S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * 5 MB extracted text for any file
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about file size and transaction per second quotas,
     * see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas
     * </a>.
     * </p>
     *
     * @param documents <p>
     *            One or more documents to add to the index.
     *            </p>
     *            <p>
     *            Documents have the following file size limits.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            5 MB total size for inline documents
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            50 MB total size for files from an S3 bucket
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            5 MB extracted text for any file
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about file size and transaction per
     *            second quotas, see <a href=
     *            "https://docs.aws.amazon.com/kendra/latest/dg/quotas.html"
     *            >Quotas</a>.
     *            </p>
     */
    public void setDocuments(java.util.Collection<Document> documents) {
        if (documents == null) {
            this.documents = null;
            return;
        }

        this.documents = new java.util.ArrayList<Document>(documents);
    }

    /**
     * <p>
     * One or more documents to add to the index.
     * </p>
     * <p>
     * Documents have the following file size limits.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 5 MB total size for inline documents
     * </p>
     * </li>
     * <li>
     * <p>
     * 50 MB total size for files from an S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * 5 MB extracted text for any file
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about file size and transaction per second quotas,
     * see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas
     * </a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documents <p>
     *            One or more documents to add to the index.
     *            </p>
     *            <p>
     *            Documents have the following file size limits.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            5 MB total size for inline documents
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            50 MB total size for files from an S3 bucket
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            5 MB extracted text for any file
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about file size and transaction per
     *            second quotas, see <a href=
     *            "https://docs.aws.amazon.com/kendra/latest/dg/quotas.html"
     *            >Quotas</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutDocumentRequest withDocuments(Document... documents) {
        if (getDocuments() == null) {
            this.documents = new java.util.ArrayList<Document>(documents.length);
        }
        for (Document value : documents) {
            this.documents.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more documents to add to the index.
     * </p>
     * <p>
     * Documents have the following file size limits.
     * </p>
     * <ul>
     * <li>
     * <p>
     * 5 MB total size for inline documents
     * </p>
     * </li>
     * <li>
     * <p>
     * 50 MB total size for files from an S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * 5 MB extracted text for any file
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about file size and transaction per second quotas,
     * see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas
     * </a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documents <p>
     *            One or more documents to add to the index.
     *            </p>
     *            <p>
     *            Documents have the following file size limits.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            5 MB total size for inline documents
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            50 MB total size for files from an S3 bucket
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            5 MB extracted text for any file
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about file size and transaction per
     *            second quotas, see <a href=
     *            "https://docs.aws.amazon.com/kendra/latest/dg/quotas.html"
     *            >Quotas</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutDocumentRequest withDocuments(java.util.Collection<Document> documents) {
        setDocuments(documents);
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
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getDocuments() != null)
            sb.append("Documents: " + getDocuments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDocuments() == null) ? 0 : getDocuments().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchPutDocumentRequest == false)
            return false;
        BatchPutDocumentRequest other = (BatchPutDocumentRequest) obj;

        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getDocuments() == null ^ this.getDocuments() == null)
            return false;
        if (other.getDocuments() != null
                && other.getDocuments().equals(this.getDocuments()) == false)
            return false;
        return true;
    }
}
