/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

/**
 * <p>
 * Document type for each page in the document.
 * </p>
 */
public class DocumentTypeListItem implements Serializable {
    /**
     * <p>
     * Page number.
     * </p>
     */
    private Integer page;

    /**
     * <p>
     * Document type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NATIVE_PDF, SCANNED_PDF, MS_WORD, IMAGE,
     * PLAIN_TEXT, TEXTRACT_DETECT_DOCUMENT_TEXT_JSON,
     * TEXTRACT_ANALYZE_DOCUMENT_JSON
     */
    private String type;

    /**
     * <p>
     * Page number.
     * </p>
     *
     * @return <p>
     *         Page number.
     *         </p>
     */
    public Integer getPage() {
        return page;
    }

    /**
     * <p>
     * Page number.
     * </p>
     *
     * @param page <p>
     *            Page number.
     *            </p>
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * <p>
     * Page number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param page <p>
     *            Page number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentTypeListItem withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * <p>
     * Document type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NATIVE_PDF, SCANNED_PDF, MS_WORD, IMAGE,
     * PLAIN_TEXT, TEXTRACT_DETECT_DOCUMENT_TEXT_JSON,
     * TEXTRACT_ANALYZE_DOCUMENT_JSON
     *
     * @return <p>
     *         Document type.
     *         </p>
     * @see DocumentType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Document type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NATIVE_PDF, SCANNED_PDF, MS_WORD, IMAGE,
     * PLAIN_TEXT, TEXTRACT_DETECT_DOCUMENT_TEXT_JSON,
     * TEXTRACT_ANALYZE_DOCUMENT_JSON
     *
     * @param type <p>
     *            Document type.
     *            </p>
     * @see DocumentType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Document type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NATIVE_PDF, SCANNED_PDF, MS_WORD, IMAGE,
     * PLAIN_TEXT, TEXTRACT_DETECT_DOCUMENT_TEXT_JSON,
     * TEXTRACT_ANALYZE_DOCUMENT_JSON
     *
     * @param type <p>
     *            Document type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentType
     */
    public DocumentTypeListItem withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Document type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NATIVE_PDF, SCANNED_PDF, MS_WORD, IMAGE,
     * PLAIN_TEXT, TEXTRACT_DETECT_DOCUMENT_TEXT_JSON,
     * TEXTRACT_ANALYZE_DOCUMENT_JSON
     *
     * @param type <p>
     *            Document type.
     *            </p>
     * @see DocumentType
     */
    public void setType(DocumentType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Document type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NATIVE_PDF, SCANNED_PDF, MS_WORD, IMAGE,
     * PLAIN_TEXT, TEXTRACT_DETECT_DOCUMENT_TEXT_JSON,
     * TEXTRACT_ANALYZE_DOCUMENT_JSON
     *
     * @param type <p>
     *            Document type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentType
     */
    public DocumentTypeListItem withType(DocumentType type) {
        this.type = type.toString();
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
        if (getPage() != null)
            sb.append("Page: " + getPage() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPage() == null) ? 0 : getPage().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentTypeListItem == false)
            return false;
        DocumentTypeListItem other = (DocumentTypeListItem) obj;

        if (other.getPage() == null ^ this.getPage() == null)
            return false;
        if (other.getPage() != null && other.getPage().equals(this.getPage()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
