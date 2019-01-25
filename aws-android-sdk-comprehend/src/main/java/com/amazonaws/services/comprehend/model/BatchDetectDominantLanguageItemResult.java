/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The result of calling the operation. The operation returns one object for
 * each document that is successfully processed by the operation.
 * </p>
 */
public class BatchDetectDominantLanguageItemResult implements Serializable {
    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     */
    private Integer index;

    /**
     * <p>
     * One or more <a>DominantLanguage</a> objects describing the dominant
     * languages in the document.
     * </p>
     */
    private java.util.List<DominantLanguage> languages;

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     *
     * @return <p>
     *         The zero-based index of the document in the input list.
     *         </p>
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     *
     * @param index <p>
     *            The zero-based index of the document in the input list.
     *            </p>
     */
    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param index <p>
     *            The zero-based index of the document in the input list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDetectDominantLanguageItemResult withIndex(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * <p>
     * One or more <a>DominantLanguage</a> objects describing the dominant
     * languages in the document.
     * </p>
     *
     * @return <p>
     *         One or more <a>DominantLanguage</a> objects describing the
     *         dominant languages in the document.
     *         </p>
     */
    public java.util.List<DominantLanguage> getLanguages() {
        return languages;
    }

    /**
     * <p>
     * One or more <a>DominantLanguage</a> objects describing the dominant
     * languages in the document.
     * </p>
     *
     * @param languages <p>
     *            One or more <a>DominantLanguage</a> objects describing the
     *            dominant languages in the document.
     *            </p>
     */
    public void setLanguages(java.util.Collection<DominantLanguage> languages) {
        if (languages == null) {
            this.languages = null;
            return;
        }

        this.languages = new java.util.ArrayList<DominantLanguage>(languages);
    }

    /**
     * <p>
     * One or more <a>DominantLanguage</a> objects describing the dominant
     * languages in the document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languages <p>
     *            One or more <a>DominantLanguage</a> objects describing the
     *            dominant languages in the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDetectDominantLanguageItemResult withLanguages(DominantLanguage... languages) {
        if (getLanguages() == null) {
            this.languages = new java.util.ArrayList<DominantLanguage>(languages.length);
        }
        for (DominantLanguage value : languages) {
            this.languages.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more <a>DominantLanguage</a> objects describing the dominant
     * languages in the document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languages <p>
     *            One or more <a>DominantLanguage</a> objects describing the
     *            dominant languages in the document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDetectDominantLanguageItemResult withLanguages(
            java.util.Collection<DominantLanguage> languages) {
        setLanguages(languages);
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
        if (getIndex() != null)
            sb.append("Index: " + getIndex() + ",");
        if (getLanguages() != null)
            sb.append("Languages: " + getLanguages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndex() == null) ? 0 : getIndex().hashCode());
        hashCode = prime * hashCode + ((getLanguages() == null) ? 0 : getLanguages().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDetectDominantLanguageItemResult == false)
            return false;
        BatchDetectDominantLanguageItemResult other = (BatchDetectDominantLanguageItemResult) obj;

        if (other.getIndex() == null ^ this.getIndex() == null)
            return false;
        if (other.getIndex() != null && other.getIndex().equals(this.getIndex()) == false)
            return false;
        if (other.getLanguages() == null ^ this.getLanguages() == null)
            return false;
        if (other.getLanguages() != null
                && other.getLanguages().equals(this.getLanguages()) == false)
            return false;
        return true;
    }
}
