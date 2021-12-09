/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

public class AnalyzeIDResult implements Serializable {
    /**
     * <p>
     * The list of documents processed by AnalyzeID. Includes a number denoting
     * their place in the list and the response structure for the document.
     * </p>
     */
    private java.util.List<IdentityDocument> identityDocuments;

    /**
     * <p>
     * Information about the input document.
     * </p>
     */
    private DocumentMetadata documentMetadata;

    /**
     * <p>
     * The version of the AnalyzeIdentity API being used to process documents.
     * </p>
     */
    private String analyzeIDModelVersion;

    /**
     * <p>
     * The list of documents processed by AnalyzeID. Includes a number denoting
     * their place in the list and the response structure for the document.
     * </p>
     *
     * @return <p>
     *         The list of documents processed by AnalyzeID. Includes a number
     *         denoting their place in the list and the response structure for
     *         the document.
     *         </p>
     */
    public java.util.List<IdentityDocument> getIdentityDocuments() {
        return identityDocuments;
    }

    /**
     * <p>
     * The list of documents processed by AnalyzeID. Includes a number denoting
     * their place in the list and the response structure for the document.
     * </p>
     *
     * @param identityDocuments <p>
     *            The list of documents processed by AnalyzeID. Includes a
     *            number denoting their place in the list and the response
     *            structure for the document.
     *            </p>
     */
    public void setIdentityDocuments(java.util.Collection<IdentityDocument> identityDocuments) {
        if (identityDocuments == null) {
            this.identityDocuments = null;
            return;
        }

        this.identityDocuments = new java.util.ArrayList<IdentityDocument>(identityDocuments);
    }

    /**
     * <p>
     * The list of documents processed by AnalyzeID. Includes a number denoting
     * their place in the list and the response structure for the document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identityDocuments <p>
     *            The list of documents processed by AnalyzeID. Includes a
     *            number denoting their place in the list and the response
     *            structure for the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzeIDResult withIdentityDocuments(IdentityDocument... identityDocuments) {
        if (getIdentityDocuments() == null) {
            this.identityDocuments = new java.util.ArrayList<IdentityDocument>(
                    identityDocuments.length);
        }
        for (IdentityDocument value : identityDocuments) {
            this.identityDocuments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of documents processed by AnalyzeID. Includes a number denoting
     * their place in the list and the response structure for the document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identityDocuments <p>
     *            The list of documents processed by AnalyzeID. Includes a
     *            number denoting their place in the list and the response
     *            structure for the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzeIDResult withIdentityDocuments(
            java.util.Collection<IdentityDocument> identityDocuments) {
        setIdentityDocuments(identityDocuments);
        return this;
    }

    /**
     * <p>
     * Information about the input document.
     * </p>
     *
     * @return <p>
     *         Information about the input document.
     *         </p>
     */
    public DocumentMetadata getDocumentMetadata() {
        return documentMetadata;
    }

    /**
     * <p>
     * Information about the input document.
     * </p>
     *
     * @param documentMetadata <p>
     *            Information about the input document.
     *            </p>
     */
    public void setDocumentMetadata(DocumentMetadata documentMetadata) {
        this.documentMetadata = documentMetadata;
    }

    /**
     * <p>
     * Information about the input document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentMetadata <p>
     *            Information about the input document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzeIDResult withDocumentMetadata(DocumentMetadata documentMetadata) {
        this.documentMetadata = documentMetadata;
        return this;
    }

    /**
     * <p>
     * The version of the AnalyzeIdentity API being used to process documents.
     * </p>
     *
     * @return <p>
     *         The version of the AnalyzeIdentity API being used to process
     *         documents.
     *         </p>
     */
    public String getAnalyzeIDModelVersion() {
        return analyzeIDModelVersion;
    }

    /**
     * <p>
     * The version of the AnalyzeIdentity API being used to process documents.
     * </p>
     *
     * @param analyzeIDModelVersion <p>
     *            The version of the AnalyzeIdentity API being used to process
     *            documents.
     *            </p>
     */
    public void setAnalyzeIDModelVersion(String analyzeIDModelVersion) {
        this.analyzeIDModelVersion = analyzeIDModelVersion;
    }

    /**
     * <p>
     * The version of the AnalyzeIdentity API being used to process documents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param analyzeIDModelVersion <p>
     *            The version of the AnalyzeIdentity API being used to process
     *            documents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzeIDResult withAnalyzeIDModelVersion(String analyzeIDModelVersion) {
        this.analyzeIDModelVersion = analyzeIDModelVersion;
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
        if (getIdentityDocuments() != null)
            sb.append("IdentityDocuments: " + getIdentityDocuments() + ",");
        if (getDocumentMetadata() != null)
            sb.append("DocumentMetadata: " + getDocumentMetadata() + ",");
        if (getAnalyzeIDModelVersion() != null)
            sb.append("AnalyzeIDModelVersion: " + getAnalyzeIDModelVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIdentityDocuments() == null) ? 0 : getIdentityDocuments().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentMetadata() == null) ? 0 : getDocumentMetadata().hashCode());
        hashCode = prime
                * hashCode
                + ((getAnalyzeIDModelVersion() == null) ? 0 : getAnalyzeIDModelVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalyzeIDResult == false)
            return false;
        AnalyzeIDResult other = (AnalyzeIDResult) obj;

        if (other.getIdentityDocuments() == null ^ this.getIdentityDocuments() == null)
            return false;
        if (other.getIdentityDocuments() != null
                && other.getIdentityDocuments().equals(this.getIdentityDocuments()) == false)
            return false;
        if (other.getDocumentMetadata() == null ^ this.getDocumentMetadata() == null)
            return false;
        if (other.getDocumentMetadata() != null
                && other.getDocumentMetadata().equals(this.getDocumentMetadata()) == false)
            return false;
        if (other.getAnalyzeIDModelVersion() == null ^ this.getAnalyzeIDModelVersion() == null)
            return false;
        if (other.getAnalyzeIDModelVersion() != null
                && other.getAnalyzeIDModelVersion().equals(this.getAnalyzeIDModelVersion()) == false)
            return false;
        return true;
    }
}
