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

public class DetectKeyPhrasesResult implements Serializable {
    /**
     * <p>
     * A collection of key phrases that Amazon Comprehend identified in the
     * input text. For each key phrase, the response provides the text of the
     * key phrase, where the key phrase begins and ends, and the level of
     * confidence that Amazon Comprehend has in the accuracy of the detection.
     * </p>
     */
    private java.util.List<KeyPhrase> keyPhrases;

    /**
     * <p>
     * A collection of key phrases that Amazon Comprehend identified in the
     * input text. For each key phrase, the response provides the text of the
     * key phrase, where the key phrase begins and ends, and the level of
     * confidence that Amazon Comprehend has in the accuracy of the detection.
     * </p>
     *
     * @return <p>
     *         A collection of key phrases that Amazon Comprehend identified in
     *         the input text. For each key phrase, the response provides the
     *         text of the key phrase, where the key phrase begins and ends, and
     *         the level of confidence that Amazon Comprehend has in the
     *         accuracy of the detection.
     *         </p>
     */
    public java.util.List<KeyPhrase> getKeyPhrases() {
        return keyPhrases;
    }

    /**
     * <p>
     * A collection of key phrases that Amazon Comprehend identified in the
     * input text. For each key phrase, the response provides the text of the
     * key phrase, where the key phrase begins and ends, and the level of
     * confidence that Amazon Comprehend has in the accuracy of the detection.
     * </p>
     *
     * @param keyPhrases <p>
     *            A collection of key phrases that Amazon Comprehend identified
     *            in the input text. For each key phrase, the response provides
     *            the text of the key phrase, where the key phrase begins and
     *            ends, and the level of confidence that Amazon Comprehend has
     *            in the accuracy of the detection.
     *            </p>
     */
    public void setKeyPhrases(java.util.Collection<KeyPhrase> keyPhrases) {
        if (keyPhrases == null) {
            this.keyPhrases = null;
            return;
        }

        this.keyPhrases = new java.util.ArrayList<KeyPhrase>(keyPhrases);
    }

    /**
     * <p>
     * A collection of key phrases that Amazon Comprehend identified in the
     * input text. For each key phrase, the response provides the text of the
     * key phrase, where the key phrase begins and ends, and the level of
     * confidence that Amazon Comprehend has in the accuracy of the detection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyPhrases <p>
     *            A collection of key phrases that Amazon Comprehend identified
     *            in the input text. For each key phrase, the response provides
     *            the text of the key phrase, where the key phrase begins and
     *            ends, and the level of confidence that Amazon Comprehend has
     *            in the accuracy of the detection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectKeyPhrasesResult withKeyPhrases(KeyPhrase... keyPhrases) {
        if (getKeyPhrases() == null) {
            this.keyPhrases = new java.util.ArrayList<KeyPhrase>(keyPhrases.length);
        }
        for (KeyPhrase value : keyPhrases) {
            this.keyPhrases.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A collection of key phrases that Amazon Comprehend identified in the
     * input text. For each key phrase, the response provides the text of the
     * key phrase, where the key phrase begins and ends, and the level of
     * confidence that Amazon Comprehend has in the accuracy of the detection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyPhrases <p>
     *            A collection of key phrases that Amazon Comprehend identified
     *            in the input text. For each key phrase, the response provides
     *            the text of the key phrase, where the key phrase begins and
     *            ends, and the level of confidence that Amazon Comprehend has
     *            in the accuracy of the detection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectKeyPhrasesResult withKeyPhrases(java.util.Collection<KeyPhrase> keyPhrases) {
        setKeyPhrases(keyPhrases);
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
        if (getKeyPhrases() != null)
            sb.append("KeyPhrases: " + getKeyPhrases());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyPhrases() == null) ? 0 : getKeyPhrases().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectKeyPhrasesResult == false)
            return false;
        DetectKeyPhrasesResult other = (DetectKeyPhrasesResult) obj;

        if (other.getKeyPhrases() == null ^ this.getKeyPhrases() == null)
            return false;
        if (other.getKeyPhrases() != null
                && other.getKeyPhrases().equals(this.getKeyPhrases()) == false)
            return false;
        return true;
    }
}
