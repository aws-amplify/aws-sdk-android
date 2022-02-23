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

public class AnalyzeDocumentResult implements Serializable {
    /**
     * <p>
     * Metadata about the analyzed document. An example is the number of pages.
     * </p>
     */
    private DocumentMetadata documentMetadata;

    /**
     * <p>
     * The items that are detected and analyzed by <code>AnalyzeDocument</code>.
     * </p>
     */
    private java.util.List<Block> blocks;

    /**
     * <p>
     * Shows the results of the human in the loop evaluation.
     * </p>
     */
    private HumanLoopActivationOutput humanLoopActivationOutput;

    /**
     * <p>
     * The version of the model used to analyze the document.
     * </p>
     */
    private String analyzeDocumentModelVersion;

    /**
     * <p>
     * Metadata about the analyzed document. An example is the number of pages.
     * </p>
     *
     * @return <p>
     *         Metadata about the analyzed document. An example is the number of
     *         pages.
     *         </p>
     */
    public DocumentMetadata getDocumentMetadata() {
        return documentMetadata;
    }

    /**
     * <p>
     * Metadata about the analyzed document. An example is the number of pages.
     * </p>
     *
     * @param documentMetadata <p>
     *            Metadata about the analyzed document. An example is the number
     *            of pages.
     *            </p>
     */
    public void setDocumentMetadata(DocumentMetadata documentMetadata) {
        this.documentMetadata = documentMetadata;
    }

    /**
     * <p>
     * Metadata about the analyzed document. An example is the number of pages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentMetadata <p>
     *            Metadata about the analyzed document. An example is the number
     *            of pages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzeDocumentResult withDocumentMetadata(DocumentMetadata documentMetadata) {
        this.documentMetadata = documentMetadata;
        return this;
    }

    /**
     * <p>
     * The items that are detected and analyzed by <code>AnalyzeDocument</code>.
     * </p>
     *
     * @return <p>
     *         The items that are detected and analyzed by
     *         <code>AnalyzeDocument</code>.
     *         </p>
     */
    public java.util.List<Block> getBlocks() {
        return blocks;
    }

    /**
     * <p>
     * The items that are detected and analyzed by <code>AnalyzeDocument</code>.
     * </p>
     *
     * @param blocks <p>
     *            The items that are detected and analyzed by
     *            <code>AnalyzeDocument</code>.
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
     * The items that are detected and analyzed by <code>AnalyzeDocument</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blocks <p>
     *            The items that are detected and analyzed by
     *            <code>AnalyzeDocument</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzeDocumentResult withBlocks(Block... blocks) {
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
     * The items that are detected and analyzed by <code>AnalyzeDocument</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blocks <p>
     *            The items that are detected and analyzed by
     *            <code>AnalyzeDocument</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzeDocumentResult withBlocks(java.util.Collection<Block> blocks) {
        setBlocks(blocks);
        return this;
    }

    /**
     * <p>
     * Shows the results of the human in the loop evaluation.
     * </p>
     *
     * @return <p>
     *         Shows the results of the human in the loop evaluation.
     *         </p>
     */
    public HumanLoopActivationOutput getHumanLoopActivationOutput() {
        return humanLoopActivationOutput;
    }

    /**
     * <p>
     * Shows the results of the human in the loop evaluation.
     * </p>
     *
     * @param humanLoopActivationOutput <p>
     *            Shows the results of the human in the loop evaluation.
     *            </p>
     */
    public void setHumanLoopActivationOutput(HumanLoopActivationOutput humanLoopActivationOutput) {
        this.humanLoopActivationOutput = humanLoopActivationOutput;
    }

    /**
     * <p>
     * Shows the results of the human in the loop evaluation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param humanLoopActivationOutput <p>
     *            Shows the results of the human in the loop evaluation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzeDocumentResult withHumanLoopActivationOutput(
            HumanLoopActivationOutput humanLoopActivationOutput) {
        this.humanLoopActivationOutput = humanLoopActivationOutput;
        return this;
    }

    /**
     * <p>
     * The version of the model used to analyze the document.
     * </p>
     *
     * @return <p>
     *         The version of the model used to analyze the document.
     *         </p>
     */
    public String getAnalyzeDocumentModelVersion() {
        return analyzeDocumentModelVersion;
    }

    /**
     * <p>
     * The version of the model used to analyze the document.
     * </p>
     *
     * @param analyzeDocumentModelVersion <p>
     *            The version of the model used to analyze the document.
     *            </p>
     */
    public void setAnalyzeDocumentModelVersion(String analyzeDocumentModelVersion) {
        this.analyzeDocumentModelVersion = analyzeDocumentModelVersion;
    }

    /**
     * <p>
     * The version of the model used to analyze the document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param analyzeDocumentModelVersion <p>
     *            The version of the model used to analyze the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyzeDocumentResult withAnalyzeDocumentModelVersion(String analyzeDocumentModelVersion) {
        this.analyzeDocumentModelVersion = analyzeDocumentModelVersion;
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
        if (getHumanLoopActivationOutput() != null)
            sb.append("HumanLoopActivationOutput: " + getHumanLoopActivationOutput() + ",");
        if (getAnalyzeDocumentModelVersion() != null)
            sb.append("AnalyzeDocumentModelVersion: " + getAnalyzeDocumentModelVersion());
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
                + ((getHumanLoopActivationOutput() == null) ? 0 : getHumanLoopActivationOutput()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAnalyzeDocumentModelVersion() == null) ? 0
                        : getAnalyzeDocumentModelVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalyzeDocumentResult == false)
            return false;
        AnalyzeDocumentResult other = (AnalyzeDocumentResult) obj;

        if (other.getDocumentMetadata() == null ^ this.getDocumentMetadata() == null)
            return false;
        if (other.getDocumentMetadata() != null
                && other.getDocumentMetadata().equals(this.getDocumentMetadata()) == false)
            return false;
        if (other.getBlocks() == null ^ this.getBlocks() == null)
            return false;
        if (other.getBlocks() != null && other.getBlocks().equals(this.getBlocks()) == false)
            return false;
        if (other.getHumanLoopActivationOutput() == null
                ^ this.getHumanLoopActivationOutput() == null)
            return false;
        if (other.getHumanLoopActivationOutput() != null
                && other.getHumanLoopActivationOutput().equals(this.getHumanLoopActivationOutput()) == false)
            return false;
        if (other.getAnalyzeDocumentModelVersion() == null
                ^ this.getAnalyzeDocumentModelVersion() == null)
            return false;
        if (other.getAnalyzeDocumentModelVersion() != null
                && other.getAnalyzeDocumentModelVersion().equals(
                        this.getAnalyzeDocumentModelVersion()) == false)
            return false;
        return true;
    }
}
