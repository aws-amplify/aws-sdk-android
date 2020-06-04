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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

public class ListDocumentVersionsResult implements Serializable {
    /**
     * <p>
     * The document versions.
     * </p>
     */
    private java.util.List<DocumentVersionInfo> documentVersions;

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The document versions.
     * </p>
     *
     * @return <p>
     *         The document versions.
     *         </p>
     */
    public java.util.List<DocumentVersionInfo> getDocumentVersions() {
        return documentVersions;
    }

    /**
     * <p>
     * The document versions.
     * </p>
     *
     * @param documentVersions <p>
     *            The document versions.
     *            </p>
     */
    public void setDocumentVersions(java.util.Collection<DocumentVersionInfo> documentVersions) {
        if (documentVersions == null) {
            this.documentVersions = null;
            return;
        }

        this.documentVersions = new java.util.ArrayList<DocumentVersionInfo>(documentVersions);
    }

    /**
     * <p>
     * The document versions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentVersions <p>
     *            The document versions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDocumentVersionsResult withDocumentVersions(DocumentVersionInfo... documentVersions) {
        if (getDocumentVersions() == null) {
            this.documentVersions = new java.util.ArrayList<DocumentVersionInfo>(
                    documentVersions.length);
        }
        for (DocumentVersionInfo value : documentVersions) {
            this.documentVersions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The document versions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentVersions <p>
     *            The document versions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDocumentVersionsResult withDocumentVersions(
            java.util.Collection<DocumentVersionInfo> documentVersions) {
        setDocumentVersions(documentVersions);
        return this;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     *
     * @return <p>
     *         The token to use when requesting the next set of items. If there
     *         are no additional items to return, the string is empty.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use when requesting the next set of items. If
     *            there are no additional items to return, the string is empty.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use when requesting the next set of items. If
     *            there are no additional items to return, the string is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDocumentVersionsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getDocumentVersions() != null)
            sb.append("DocumentVersions: " + getDocumentVersions() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDocumentVersions() == null) ? 0 : getDocumentVersions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDocumentVersionsResult == false)
            return false;
        ListDocumentVersionsResult other = (ListDocumentVersionsResult) obj;

        if (other.getDocumentVersions() == null ^ this.getDocumentVersions() == null)
            return false;
        if (other.getDocumentVersions() != null
                && other.getDocumentVersions().equals(this.getDocumentVersions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
