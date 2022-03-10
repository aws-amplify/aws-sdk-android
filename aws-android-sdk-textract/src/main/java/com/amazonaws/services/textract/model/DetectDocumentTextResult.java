/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class DetectDocumentTextResult implements Serializable {
    /**
     * <p>
     * Metadata about the document. It contains the number of pages that are
     * detected in the document.
     * </p>
     */
    private DocumentMetadata documentMetadata;

    /**
     * <p>
     * An array of <code>Block</code> objects that contain the text that's
     * detected in the document.
     * </p>
     */
    private java.util.List<Block> blocks;

    /**
     * <p/>
     */
    private String detectDocumentTextModelVersion;

    /**
     * <p>
     * Metadata about the document. It contains the number of pages that are
     * detected in the document.
     * </p>
     *
     * @return <p>
     *         Metadata about the document. It contains the number of pages that
     *         are detected in the document.
     *         </p>
     */
    public DocumentMetadata getDocumentMetadata() {
        return documentMetadata;
    }

    /**
     * <p>
     * Metadata about the document. It contains the number of pages that are
     * detected in the document.
     * </p>
     *
     * @param documentMetadata <p>
     *            Metadata about the document. It contains the number of pages
     *            that are detected in the document.
     *            </p>
     */
    public void setDocumentMetadata(DocumentMetadata documentMetadata) {
        this.documentMetadata = documentMetadata;
    }

    /**
     * <p>
     * Metadata about the document. It contains the number of pages that are
     * detected in the document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentMetadata <p>
     *            Metadata about the document. It contains the number of pages
     *            that are detected in the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectDocumentTextResult withDocumentMetadata(DocumentMetadata documentMetadata) {
        this.documentMetadata = documentMetadata;
        return this;
    }

    /**
     * <p>
     * An array of <code>Block</code> objects that contain the text that's
     * detected in the document.
     * </p>
     *
     * @return <p>
     *         An array of <code>Block</code> objects that contain the text
     *         that's detected in the document.
     *         </p>
     */
    public java.util.List<Block> getBlocks() {
        return blocks;
    }

    /**
     * <p>
     * An array of <code>Block</code> objects that contain the text that's
     * detected in the document.
     * </p>
     *
     * @param blocks <p>
     *            An array of <code>Block</code> objects that contain the text
     *            that's detected in the document.
     *            </p>
     */
    public void setBlocks(java.util.Collection<Block> blocks) {
        if (blocks == null) {
            this.blocks = null;
            return;
        }

        this.blocks = new java.util.ArrayList<Block>(blocks);
    }

    /**
     * <p>
     * An array of <code>Block</code> objects that contain the text that's
     * detected in the document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blocks <p>
     *            An array of <code>Block</code> objects that contain the text
     *            that's detected in the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectDocumentTextResult withBlocks(Block... blocks) {
        if (getBlocks() == null) {
            this.blocks = new java.util.ArrayList<Block>(blocks.length);
        }
        for (Block value : blocks) {
            this.blocks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>Block</code> objects that contain the text that's
     * detected in the document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blocks <p>
     *            An array of <code>Block</code> objects that contain the text
     *            that's detected in the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectDocumentTextResult withBlocks(java.util.Collection<Block> blocks) {
        setBlocks(blocks);
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public String getDetectDocumentTextModelVersion() {
        return detectDocumentTextModelVersion;
    }

    /**
     * <p/>
     *
     * @param detectDocumentTextModelVersion <p/>
     */
    public void setDetectDocumentTextModelVersion(String detectDocumentTextModelVersion) {
        this.detectDocumentTextModelVersion = detectDocumentTextModelVersion;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detectDocumentTextModelVersion <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectDocumentTextResult withDetectDocumentTextModelVersion(
            String detectDocumentTextModelVersion) {
        this.detectDocumentTextModelVersion = detectDocumentTextModelVersion;
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
        if (getDocumentMetadata() != null)
            sb.append("DocumentMetadata: " + getDocumentMetadata() + ",");
        if (getBlocks() != null)
            sb.append("Blocks: " + getBlocks() + ",");
        if (getDetectDocumentTextModelVersion() != null)
            sb.append("DetectDocumentTextModelVersion: " + getDetectDocumentTextModelVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDocumentMetadata() == null) ? 0 : getDocumentMetadata().hashCode());
        hashCode = prime * hashCode + ((getBlocks() == null) ? 0 : getBlocks().hashCode());
        hashCode = prime
                * hashCode
                + ((getDetectDocumentTextModelVersion() == null) ? 0
                        : getDetectDocumentTextModelVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectDocumentTextResult == false)
            return false;
        DetectDocumentTextResult other = (DetectDocumentTextResult) obj;

        if (other.getDocumentMetadata() == null ^ this.getDocumentMetadata() == null)
            return false;
        if (other.getDocumentMetadata() != null
                && other.getDocumentMetadata().equals(this.getDocumentMetadata()) == false)
            return false;
        if (other.getBlocks() == null ^ this.getBlocks() == null)
            return false;
        if (other.getBlocks() != null && other.getBlocks().equals(this.getBlocks()) == false)
            return false;
        if (other.getDetectDocumentTextModelVersion() == null
                ^ this.getDetectDocumentTextModelVersion() == null)
            return false;
        if (other.getDetectDocumentTextModelVersion() != null
                && other.getDetectDocumentTextModelVersion().equals(
                        this.getDetectDocumentTextModelVersion()) == false)
            return false;
        return true;
    }
}
