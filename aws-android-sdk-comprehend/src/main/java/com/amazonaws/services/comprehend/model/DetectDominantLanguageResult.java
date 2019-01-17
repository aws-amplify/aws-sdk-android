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

public class DetectDominantLanguageResult implements Serializable {
    /**
     * <p>
     * The languages that Amazon Comprehend detected in the input text. For each
     * language, the response returns the RFC 5646 language code and the level
     * of confidence that Amazon Comprehend has in the accuracy of its
     * inference. For more information about RFC 5646, see <a
     * href="https://tools.ietf.org/html/rfc5646">Tags for Identifying
     * Languages</a> on the <i>IETF Tools</i> web site.
     * </p>
     */
    private java.util.List<DominantLanguage> languages;

    /**
     * <p>
     * The languages that Amazon Comprehend detected in the input text. For each
     * language, the response returns the RFC 5646 language code and the level
     * of confidence that Amazon Comprehend has in the accuracy of its
     * inference. For more information about RFC 5646, see <a
     * href="https://tools.ietf.org/html/rfc5646">Tags for Identifying
     * Languages</a> on the <i>IETF Tools</i> web site.
     * </p>
     *
     * @return <p>
     *         The languages that Amazon Comprehend detected in the input text.
     *         For each language, the response returns the RFC 5646 language
     *         code and the level of confidence that Amazon Comprehend has in
     *         the accuracy of its inference. For more information about RFC
     *         5646, see <a href="https://tools.ietf.org/html/rfc5646">Tags for
     *         Identifying Languages</a> on the <i>IETF Tools</i> web site.
     *         </p>
     */
    public java.util.List<DominantLanguage> getLanguages() {
        return languages;
    }

    /**
     * <p>
     * The languages that Amazon Comprehend detected in the input text. For each
     * language, the response returns the RFC 5646 language code and the level
     * of confidence that Amazon Comprehend has in the accuracy of its
     * inference. For more information about RFC 5646, see <a
     * href="https://tools.ietf.org/html/rfc5646">Tags for Identifying
     * Languages</a> on the <i>IETF Tools</i> web site.
     * </p>
     *
     * @param languages <p>
     *            The languages that Amazon Comprehend detected in the input
     *            text. For each language, the response returns the RFC 5646
     *            language code and the level of confidence that Amazon
     *            Comprehend has in the accuracy of its inference. For more
     *            information about RFC 5646, see <a
     *            href="https://tools.ietf.org/html/rfc5646">Tags for
     *            Identifying Languages</a> on the <i>IETF Tools</i> web site.
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
     * The languages that Amazon Comprehend detected in the input text. For each
     * language, the response returns the RFC 5646 language code and the level
     * of confidence that Amazon Comprehend has in the accuracy of its
     * inference. For more information about RFC 5646, see <a
     * href="https://tools.ietf.org/html/rfc5646">Tags for Identifying
     * Languages</a> on the <i>IETF Tools</i> web site.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languages <p>
     *            The languages that Amazon Comprehend detected in the input
     *            text. For each language, the response returns the RFC 5646
     *            language code and the level of confidence that Amazon
     *            Comprehend has in the accuracy of its inference. For more
     *            information about RFC 5646, see <a
     *            href="https://tools.ietf.org/html/rfc5646">Tags for
     *            Identifying Languages</a> on the <i>IETF Tools</i> web site.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectDominantLanguageResult withLanguages(DominantLanguage... languages) {
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
     * The languages that Amazon Comprehend detected in the input text. For each
     * language, the response returns the RFC 5646 language code and the level
     * of confidence that Amazon Comprehend has in the accuracy of its
     * inference. For more information about RFC 5646, see <a
     * href="https://tools.ietf.org/html/rfc5646">Tags for Identifying
     * Languages</a> on the <i>IETF Tools</i> web site.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languages <p>
     *            The languages that Amazon Comprehend detected in the input
     *            text. For each language, the response returns the RFC 5646
     *            language code and the level of confidence that Amazon
     *            Comprehend has in the accuracy of its inference. For more
     *            information about RFC 5646, see <a
     *            href="https://tools.ietf.org/html/rfc5646">Tags for
     *            Identifying Languages</a> on the <i>IETF Tools</i> web site.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectDominantLanguageResult withLanguages(
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
        if (getLanguages() != null)
            sb.append("Languages: " + getLanguages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLanguages() == null) ? 0 : getLanguages().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectDominantLanguageResult == false)
            return false;
        DetectDominantLanguageResult other = (DetectDominantLanguageResult) obj;

        if (other.getLanguages() == null ^ this.getLanguages() == null)
            return false;
        if (other.getLanguages() != null
                && other.getLanguages().equals(this.getLanguages()) == false)
            return false;
        return true;
    }
}
