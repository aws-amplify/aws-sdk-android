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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Analyzes identity documents for relevant information. This information is
 * extracted and returned as <code>IdentityDocumentFields</code>, which records
 * both the normalized field and value of the extracted text.
 * </p>
 */
public class AnalyzeIDRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The document being passed to AnalyzeID.
     * </p>
     */
    private java.util.List<Document> documentPages;

    /**
     * <p>
     * The document being passed to AnalyzeID.
     * </p>
     *
     * @return <p>
     *         The document being passed to AnalyzeID.
     *         </p>
     */
    public java.util.List<Document> getDocumentPages() {
        return documentPages;
    }

    /**
     * <p>
     * The document being passed to AnalyzeID.
     * </p>
     *
     * @param documentPages <p>
     *            The document being passed to AnalyzeID.
     *            </p>
     */
    public void setDocumentPages(java.util.Collection<Document> documentPages) {
        if (documentPages == null) {
            this.documentPages = null;
            return;
        }

        this.documentPages = new java.util.ArrayList<Document>(documentPages);
    }

    /**
     * <p>
     * The document being passed to AnalyzeID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentPages <p>
     *            The document being passed to AnalyzeID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzeIDRequest withDocumentPages(Document... documentPages) {
        if (getDocumentPages() == null) {
            this.documentPages = new java.util.ArrayList<Document>(documentPages.length);
        }
        for (Document value : documentPages) {
            this.documentPages.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The document being passed to AnalyzeID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentPages <p>
     *            The document being passed to AnalyzeID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzeIDRequest withDocumentPages(java.util.Collection<Document> documentPages) {
        setDocumentPages(documentPages);
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
        if (getDocumentPages() != null)
            sb.append("DocumentPages: " + getDocumentPages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDocumentPages() == null) ? 0 : getDocumentPages().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalyzeIDRequest == false)
            return false;
        AnalyzeIDRequest other = (AnalyzeIDRequest) obj;

        if (other.getDocumentPages() == null ^ this.getDocumentPages() == null)
            return false;
        if (other.getDocumentPages() != null
                && other.getDocumentPages().equals(this.getDocumentPages()) == false)
            return false;
        return true;
    }
}
