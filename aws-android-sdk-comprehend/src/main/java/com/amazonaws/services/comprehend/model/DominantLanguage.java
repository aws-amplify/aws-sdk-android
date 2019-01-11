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
 * Returns the code for the dominant language in the input text and the level of
 * confidence that Amazon Comprehend has in the accuracy of the detection.
 * </p>
 */
public class DominantLanguage implements Serializable {
    /**
     * <p>
     * The RFC 5646 language code for the dominant language. For more
     * information about RFC 5646, see <a
     * href="https://tools.ietf.org/html/rfc5646">Tags for Identifying
     * Languages</a> on the <i>IETF Tools</i> web site.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String languageCode;

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of the
     * detection.
     * </p>
     */
    private Float score;

    /**
     * <p>
     * The RFC 5646 language code for the dominant language. For more
     * information about RFC 5646, see <a
     * href="https://tools.ietf.org/html/rfc5646">Tags for Identifying
     * Languages</a> on the <i>IETF Tools</i> web site.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The RFC 5646 language code for the dominant language. For more
     *         information about RFC 5646, see <a
     *         href="https://tools.ietf.org/html/rfc5646">Tags for Identifying
     *         Languages</a> on the <i>IETF Tools</i> web site.
     *         </p>
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The RFC 5646 language code for the dominant language. For more
     * information about RFC 5646, see <a
     * href="https://tools.ietf.org/html/rfc5646">Tags for Identifying
     * Languages</a> on the <i>IETF Tools</i> web site.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param languageCode <p>
     *            The RFC 5646 language code for the dominant language. For more
     *            information about RFC 5646, see <a
     *            href="https://tools.ietf.org/html/rfc5646">Tags for
     *            Identifying Languages</a> on the <i>IETF Tools</i> web site.
     *            </p>
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The RFC 5646 language code for the dominant language. For more
     * information about RFC 5646, see <a
     * href="https://tools.ietf.org/html/rfc5646">Tags for Identifying
     * Languages</a> on the <i>IETF Tools</i> web site.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param languageCode <p>
     *            The RFC 5646 language code for the dominant language. For more
     *            information about RFC 5646, see <a
     *            href="https://tools.ietf.org/html/rfc5646">Tags for
     *            Identifying Languages</a> on the <i>IETF Tools</i> web site.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DominantLanguage withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of the
     * detection.
     * </p>
     *
     * @return <p>
     *         The level of confidence that Amazon Comprehend has in the
     *         accuracy of the detection.
     *         </p>
     */
    public Float getScore() {
        return score;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of the
     * detection.
     * </p>
     *
     * @param score <p>
     *            The level of confidence that Amazon Comprehend has in the
     *            accuracy of the detection.
     *            </p>
     */
    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of the
     * detection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param score <p>
     *            The level of confidence that Amazon Comprehend has in the
     *            accuracy of the detection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DominantLanguage withScore(Float score) {
        this.score = score;
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
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getScore() != null)
            sb.append("Score: " + getScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DominantLanguage == false)
            return false;
        DominantLanguage other = (DominantLanguage) obj;

        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        return true;
    }
}
