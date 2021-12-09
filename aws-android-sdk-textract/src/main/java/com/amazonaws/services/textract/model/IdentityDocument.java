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

/**
 * <p>
 * The structure that lists each document processed in an AnalyzeID operation.
 * </p>
 */
public class IdentityDocument implements Serializable {
    /**
     * <p>
     * Denotes the placement of a document in the IdentityDocument list. The
     * first document is marked 1, the second 2 and so on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer documentIndex;

    /**
     * <p>
     * The structure used to record information extracted from identity
     * documents. Contains both normalized field and value of the extracted
     * text.
     * </p>
     */
    private java.util.List<IdentityDocumentField> identityDocumentFields;

    /**
     * <p>
     * Denotes the placement of a document in the IdentityDocument list. The
     * first document is marked 1, the second 2 and so on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         Denotes the placement of a document in the IdentityDocument list.
     *         The first document is marked 1, the second 2 and so on.
     *         </p>
     */
    public Integer getDocumentIndex() {
        return documentIndex;
    }

    /**
     * <p>
     * Denotes the placement of a document in the IdentityDocument list. The
     * first document is marked 1, the second 2 and so on.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param documentIndex <p>
     *            Denotes the placement of a document in the IdentityDocument
     *            list. The first document is marked 1, the second 2 and so on.
     *            </p>
     */
    public void setDocumentIndex(Integer documentIndex) {
        this.documentIndex = documentIndex;
    }

    /**
     * <p>
     * Denotes the placement of a document in the IdentityDocument list. The
     * first document is marked 1, the second 2 and so on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param documentIndex <p>
     *            Denotes the placement of a document in the IdentityDocument
     *            list. The first document is marked 1, the second 2 and so on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IdentityDocument withDocumentIndex(Integer documentIndex) {
        this.documentIndex = documentIndex;
        return this;
    }

    /**
     * <p>
     * The structure used to record information extracted from identity
     * documents. Contains both normalized field and value of the extracted
     * text.
     * </p>
     *
     * @return <p>
     *         The structure used to record information extracted from identity
     *         documents. Contains both normalized field and value of the
     *         extracted text.
     *         </p>
     */
    public java.util.List<IdentityDocumentField> getIdentityDocumentFields() {
        return identityDocumentFields;
    }

    /**
     * <p>
     * The structure used to record information extracted from identity
     * documents. Contains both normalized field and value of the extracted
     * text.
     * </p>
     *
     * @param identityDocumentFields <p>
     *            The structure used to record information extracted from
     *            identity documents. Contains both normalized field and value
     *            of the extracted text.
     *            </p>
     */
    public void setIdentityDocumentFields(
            java.util.Collection<IdentityDocumentField> identityDocumentFields) {
        if (identityDocumentFields == null) {
            this.identityDocumentFields = null;
            return;
        }

        this.identityDocumentFields = new java.util.ArrayList<IdentityDocumentField>(
                identityDocumentFields);
    }

    /**
     * <p>
     * The structure used to record information extracted from identity
     * documents. Contains both normalized field and value of the extracted
     * text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identityDocumentFields <p>
     *            The structure used to record information extracted from
     *            identity documents. Contains both normalized field and value
     *            of the extracted text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IdentityDocument withIdentityDocumentFields(
            IdentityDocumentField... identityDocumentFields) {
        if (getIdentityDocumentFields() == null) {
            this.identityDocumentFields = new java.util.ArrayList<IdentityDocumentField>(
                    identityDocumentFields.length);
        }
        for (IdentityDocumentField value : identityDocumentFields) {
            this.identityDocumentFields.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The structure used to record information extracted from identity
     * documents. Contains both normalized field and value of the extracted
     * text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identityDocumentFields <p>
     *            The structure used to record information extracted from
     *            identity documents. Contains both normalized field and value
     *            of the extracted text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IdentityDocument withIdentityDocumentFields(
            java.util.Collection<IdentityDocumentField> identityDocumentFields) {
        setIdentityDocumentFields(identityDocumentFields);
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
        if (getDocumentIndex() != null)
            sb.append("DocumentIndex: " + getDocumentIndex() + ",");
        if (getIdentityDocumentFields() != null)
            sb.append("IdentityDocumentFields: " + getIdentityDocumentFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDocumentIndex() == null) ? 0 : getDocumentIndex().hashCode());
        hashCode = prime
                * hashCode
                + ((getIdentityDocumentFields() == null) ? 0 : getIdentityDocumentFields()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdentityDocument == false)
            return false;
        IdentityDocument other = (IdentityDocument) obj;

        if (other.getDocumentIndex() == null ^ this.getDocumentIndex() == null)
            return false;
        if (other.getDocumentIndex() != null
                && other.getDocumentIndex().equals(this.getDocumentIndex()) == false)
            return false;
        if (other.getIdentityDocumentFields() == null ^ this.getIdentityDocumentFields() == null)
            return false;
        if (other.getIdentityDocumentFields() != null
                && other.getIdentityDocumentFields().equals(this.getIdentityDocumentFields()) == false)
            return false;
        return true;
    }
}
