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
 * Information about the document, discovered during text extraction.
 * </p>
 */
public class DocumentMetadata implements Serializable {
    /**
     * <p>
     * Number of pages in the document.
     * </p>
     */
    private Integer pages;

    /**
     * <p>
     * List of pages in the document, with the number of characters extracted
     * from each page.
     * </p>
     */
    private java.util.List<ExtractedCharactersListItem> extractedCharacters;

    /**
     * <p>
     * Number of pages in the document.
     * </p>
     *
     * @return <p>
     *         Number of pages in the document.
     *         </p>
     */
    public Integer getPages() {
        return pages;
    }

    /**
     * <p>
     * Number of pages in the document.
     * </p>
     *
     * @param pages <p>
     *            Number of pages in the document.
     *            </p>
     */
    public void setPages(Integer pages) {
        this.pages = pages;
    }

    /**
     * <p>
     * Number of pages in the document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pages <p>
     *            Number of pages in the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentMetadata withPages(Integer pages) {
        this.pages = pages;
        return this;
    }

    /**
     * <p>
     * List of pages in the document, with the number of characters extracted
     * from each page.
     * </p>
     *
     * @return <p>
     *         List of pages in the document, with the number of characters
     *         extracted from each page.
     *         </p>
     */
    public java.util.List<ExtractedCharactersListItem> getExtractedCharacters() {
        return extractedCharacters;
    }

    /**
     * <p>
     * List of pages in the document, with the number of characters extracted
     * from each page.
     * </p>
     *
     * @param extractedCharacters <p>
     *            List of pages in the document, with the number of characters
     *            extracted from each page.
     *            </p>
     */
    public void setExtractedCharacters(
            java.util.Collection<ExtractedCharactersListItem> extractedCharacters) {
        if (extractedCharacters == null) {
            this.extractedCharacters = null;
            return;
        }

        this.extractedCharacters = new java.util.ArrayList<ExtractedCharactersListItem>(
                extractedCharacters);
    }

    /**
     * <p>
     * List of pages in the document, with the number of characters extracted
     * from each page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param extractedCharacters <p>
     *            List of pages in the document, with the number of characters
     *            extracted from each page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentMetadata withExtractedCharacters(
            ExtractedCharactersListItem... extractedCharacters) {
        if (getExtractedCharacters() == null) {
            this.extractedCharacters = new java.util.ArrayList<ExtractedCharactersListItem>(
                    extractedCharacters.length);
        }
        for (ExtractedCharactersListItem value : extractedCharacters) {
            this.extractedCharacters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of pages in the document, with the number of characters extracted
     * from each page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param extractedCharacters <p>
     *            List of pages in the document, with the number of characters
     *            extracted from each page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentMetadata withExtractedCharacters(
            java.util.Collection<ExtractedCharactersListItem> extractedCharacters) {
        setExtractedCharacters(extractedCharacters);
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
        if (getPages() != null)
            sb.append("Pages: " + getPages() + ",");
        if (getExtractedCharacters() != null)
            sb.append("ExtractedCharacters: " + getExtractedCharacters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPages() == null) ? 0 : getPages().hashCode());
        hashCode = prime * hashCode
                + ((getExtractedCharacters() == null) ? 0 : getExtractedCharacters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentMetadata == false)
            return false;
        DocumentMetadata other = (DocumentMetadata) obj;

        if (other.getPages() == null ^ this.getPages() == null)
            return false;
        if (other.getPages() != null && other.getPages().equals(this.getPages()) == false)
            return false;
        if (other.getExtractedCharacters() == null ^ this.getExtractedCharacters() == null)
            return false;
        if (other.getExtractedCharacters() != null
                && other.getExtractedCharacters().equals(this.getExtractedCharacters()) == false)
            return false;
        return true;
    }
}
