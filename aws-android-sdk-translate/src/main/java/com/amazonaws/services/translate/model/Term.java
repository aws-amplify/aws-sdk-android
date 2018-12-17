/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.translate.model;

import java.io.Serializable;

/**
 * <p>
 * The term being translated by the custom terminology.
 * </p>
 */
public class Term implements Serializable {
    /**
     * <p>
     * The source text of the term being translated by the custom terminology.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,10000}<br/>
     */
    private String sourceText;

    /**
     * <p>
     * The target text of the term being translated by the custom terminology.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,10000}<br/>
     */
    private String targetText;

    /**
     * <p>
     * The source text of the term being translated by the custom terminology.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,10000}<br/>
     *
     * @return <p>
     *         The source text of the term being translated by the custom
     *         terminology.
     *         </p>
     */
    public String getSourceText() {
        return sourceText;
    }

    /**
     * <p>
     * The source text of the term being translated by the custom terminology.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,10000}<br/>
     *
     * @param sourceText <p>
     *            The source text of the term being translated by the custom
     *            terminology.
     *            </p>
     */
    public void setSourceText(String sourceText) {
        this.sourceText = sourceText;
    }

    /**
     * <p>
     * The source text of the term being translated by the custom terminology.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,10000}<br/>
     *
     * @param sourceText <p>
     *            The source text of the term being translated by the custom
     *            terminology.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Term withSourceText(String sourceText) {
        this.sourceText = sourceText;
        return this;
    }

    /**
     * <p>
     * The target text of the term being translated by the custom terminology.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,10000}<br/>
     *
     * @return <p>
     *         The target text of the term being translated by the custom
     *         terminology.
     *         </p>
     */
    public String getTargetText() {
        return targetText;
    }

    /**
     * <p>
     * The target text of the term being translated by the custom terminology.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,10000}<br/>
     *
     * @param targetText <p>
     *            The target text of the term being translated by the custom
     *            terminology.
     *            </p>
     */
    public void setTargetText(String targetText) {
        this.targetText = targetText;
    }

    /**
     * <p>
     * The target text of the term being translated by the custom terminology.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,10000}<br/>
     *
     * @param targetText <p>
     *            The target text of the term being translated by the custom
     *            terminology.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Term withTargetText(String targetText) {
        this.targetText = targetText;
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
        if (getSourceText() != null)
            sb.append("SourceText: " + getSourceText() + ",");
        if (getTargetText() != null)
            sb.append("TargetText: " + getTargetText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceText() == null) ? 0 : getSourceText().hashCode());
        hashCode = prime * hashCode + ((getTargetText() == null) ? 0 : getTargetText().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Term == false)
            return false;
        Term other = (Term) obj;

        if (other.getSourceText() == null ^ this.getSourceText() == null)
            return false;
        if (other.getSourceText() != null
                && other.getSourceText().equals(this.getSourceText()) == false)
            return false;
        if (other.getTargetText() == null ^ this.getTargetText() == null)
            return false;
        if (other.getTargetText() != null
                && other.getTargetText().equals(this.getTargetText()) == false)
            return false;
        return true;
    }
}
