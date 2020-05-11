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
 * Provides information about text documents indexed in an index.
 * </p>
 */
public class TextDocumentStatistics implements Serializable {
    /**
     * <p>
     * The number of text documents indexed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer indexedTextDocumentsCount;

    /**
     * <p>
     * The total size, in bytes, of the indexed documents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long indexedTextBytes;

    /**
     * <p>
     * The number of text documents indexed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of text documents indexed.
     *         </p>
     */
    public Integer getIndexedTextDocumentsCount() {
        return indexedTextDocumentsCount;
    }

    /**
     * <p>
     * The number of text documents indexed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param indexedTextDocumentsCount <p>
     *            The number of text documents indexed.
     *            </p>
     */
    public void setIndexedTextDocumentsCount(Integer indexedTextDocumentsCount) {
        this.indexedTextDocumentsCount = indexedTextDocumentsCount;
    }

    /**
     * <p>
     * The number of text documents indexed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param indexedTextDocumentsCount <p>
     *            The number of text documents indexed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextDocumentStatistics withIndexedTextDocumentsCount(Integer indexedTextDocumentsCount) {
        this.indexedTextDocumentsCount = indexedTextDocumentsCount;
        return this;
    }

    /**
     * <p>
     * The total size, in bytes, of the indexed documents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The total size, in bytes, of the indexed documents.
     *         </p>
     */
    public Long getIndexedTextBytes() {
        return indexedTextBytes;
    }

    /**
     * <p>
     * The total size, in bytes, of the indexed documents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param indexedTextBytes <p>
     *            The total size, in bytes, of the indexed documents.
     *            </p>
     */
    public void setIndexedTextBytes(Long indexedTextBytes) {
        this.indexedTextBytes = indexedTextBytes;
    }

    /**
     * <p>
     * The total size, in bytes, of the indexed documents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param indexedTextBytes <p>
     *            The total size, in bytes, of the indexed documents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextDocumentStatistics withIndexedTextBytes(Long indexedTextBytes) {
        this.indexedTextBytes = indexedTextBytes;
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
        if (getIndexedTextDocumentsCount() != null)
            sb.append("IndexedTextDocumentsCount: " + getIndexedTextDocumentsCount() + ",");
        if (getIndexedTextBytes() != null)
            sb.append("IndexedTextBytes: " + getIndexedTextBytes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getIndexedTextDocumentsCount() == null) ? 0 : getIndexedTextDocumentsCount()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getIndexedTextBytes() == null) ? 0 : getIndexedTextBytes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TextDocumentStatistics == false)
            return false;
        TextDocumentStatistics other = (TextDocumentStatistics) obj;

        if (other.getIndexedTextDocumentsCount() == null
                ^ this.getIndexedTextDocumentsCount() == null)
            return false;
        if (other.getIndexedTextDocumentsCount() != null
                && other.getIndexedTextDocumentsCount().equals(this.getIndexedTextDocumentsCount()) == false)
            return false;
        if (other.getIndexedTextBytes() == null ^ this.getIndexedTextBytes() == null)
            return false;
        if (other.getIndexedTextBytes() != null
                && other.getIndexedTextBytes().equals(this.getIndexedTextBytes()) == false)
            return false;
        return true;
    }
}
