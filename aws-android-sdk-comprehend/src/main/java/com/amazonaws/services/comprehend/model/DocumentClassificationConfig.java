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
 * Configuration required for a custom classification model.
 * </p>
 */
public class DocumentClassificationConfig implements Serializable {
    /**
     * <p>
     * Classification mode indicates whether the documents are
     * <code>MULTI_CLASS</code> or <code>MULTI_LABEL</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTI_CLASS, MULTI_LABEL
     */
    private String mode;

    /**
     * <p>
     * One or more labels to associate with the custom classifier.
     * </p>
     */
    private java.util.List<String> labels;

    /**
     * <p>
     * Classification mode indicates whether the documents are
     * <code>MULTI_CLASS</code> or <code>MULTI_LABEL</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTI_CLASS, MULTI_LABEL
     *
     * @return <p>
     *         Classification mode indicates whether the documents are
     *         <code>MULTI_CLASS</code> or <code>MULTI_LABEL</code>.
     *         </p>
     * @see DocumentClassifierMode
     */
    public String getMode() {
        return mode;
    }

    /**
     * <p>
     * Classification mode indicates whether the documents are
     * <code>MULTI_CLASS</code> or <code>MULTI_LABEL</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTI_CLASS, MULTI_LABEL
     *
     * @param mode <p>
     *            Classification mode indicates whether the documents are
     *            <code>MULTI_CLASS</code> or <code>MULTI_LABEL</code>.
     *            </p>
     * @see DocumentClassifierMode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * Classification mode indicates whether the documents are
     * <code>MULTI_CLASS</code> or <code>MULTI_LABEL</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTI_CLASS, MULTI_LABEL
     *
     * @param mode <p>
     *            Classification mode indicates whether the documents are
     *            <code>MULTI_CLASS</code> or <code>MULTI_LABEL</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentClassifierMode
     */
    public DocumentClassificationConfig withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * <p>
     * Classification mode indicates whether the documents are
     * <code>MULTI_CLASS</code> or <code>MULTI_LABEL</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTI_CLASS, MULTI_LABEL
     *
     * @param mode <p>
     *            Classification mode indicates whether the documents are
     *            <code>MULTI_CLASS</code> or <code>MULTI_LABEL</code>.
     *            </p>
     * @see DocumentClassifierMode
     */
    public void setMode(DocumentClassifierMode mode) {
        this.mode = mode.toString();
    }

    /**
     * <p>
     * Classification mode indicates whether the documents are
     * <code>MULTI_CLASS</code> or <code>MULTI_LABEL</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTI_CLASS, MULTI_LABEL
     *
     * @param mode <p>
     *            Classification mode indicates whether the documents are
     *            <code>MULTI_CLASS</code> or <code>MULTI_LABEL</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentClassifierMode
     */
    public DocumentClassificationConfig withMode(DocumentClassifierMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * One or more labels to associate with the custom classifier.
     * </p>
     *
     * @return <p>
     *         One or more labels to associate with the custom classifier.
     *         </p>
     */
    public java.util.List<String> getLabels() {
        return labels;
    }

    /**
     * <p>
     * One or more labels to associate with the custom classifier.
     * </p>
     *
     * @param labels <p>
     *            One or more labels to associate with the custom classifier.
     *            </p>
     */
    public void setLabels(java.util.Collection<String> labels) {
        if (labels == null) {
            this.labels = null;
            return;
        }

        this.labels = new java.util.ArrayList<String>(labels);
    }

    /**
     * <p>
     * One or more labels to associate with the custom classifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labels <p>
     *            One or more labels to associate with the custom classifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassificationConfig withLabels(String... labels) {
        if (getLabels() == null) {
            this.labels = new java.util.ArrayList<String>(labels.length);
        }
        for (String value : labels) {
            this.labels.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more labels to associate with the custom classifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labels <p>
     *            One or more labels to associate with the custom classifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentClassificationConfig withLabels(java.util.Collection<String> labels) {
        setLabels(labels);
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
        if (getMode() != null)
            sb.append("Mode: " + getMode() + ",");
        if (getLabels() != null)
            sb.append("Labels: " + getLabels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentClassificationConfig == false)
            return false;
        DocumentClassificationConfig other = (DocumentClassificationConfig) obj;

        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        return true;
    }
}
