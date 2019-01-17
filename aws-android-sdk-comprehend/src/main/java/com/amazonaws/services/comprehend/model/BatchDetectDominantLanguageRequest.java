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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Determines the dominant language of the input text for a batch of documents.
 * For a list of languages that Amazon Comprehend can detect, see <a
 * href="http://docs.aws.amazon.com/comprehend/latest/dg/how-languages.html"
 * >Amazon Comprehend Supported Languages</a>.
 * </p>
 */
public class BatchDetectDominantLanguageRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A list containing the text of the input documents. The list can contain a
     * maximum of 25 documents. Each document should contain at least 20
     * characters and must contain fewer than 5,000 bytes of UTF-8 encoded
     * characters.
     * </p>
     */
    private java.util.List<String> textList;

    /**
     * <p>
     * A list containing the text of the input documents. The list can contain a
     * maximum of 25 documents. Each document should contain at least 20
     * characters and must contain fewer than 5,000 bytes of UTF-8 encoded
     * characters.
     * </p>
     *
     * @return <p>
     *         A list containing the text of the input documents. The list can
     *         contain a maximum of 25 documents. Each document should contain
     *         at least 20 characters and must contain fewer than 5,000 bytes of
     *         UTF-8 encoded characters.
     *         </p>
     */
    public java.util.List<String> getTextList() {
        return textList;
    }

    /**
     * <p>
     * A list containing the text of the input documents. The list can contain a
     * maximum of 25 documents. Each document should contain at least 20
     * characters and must contain fewer than 5,000 bytes of UTF-8 encoded
     * characters.
     * </p>
     *
     * @param textList <p>
     *            A list containing the text of the input documents. The list
     *            can contain a maximum of 25 documents. Each document should
     *            contain at least 20 characters and must contain fewer than
     *            5,000 bytes of UTF-8 encoded characters.
     *            </p>
     */
    public void setTextList(java.util.Collection<String> textList) {
        if (textList == null) {
            this.textList = null;
            return;
        }

        this.textList = new java.util.ArrayList<String>(textList);
    }

    /**
     * <p>
     * A list containing the text of the input documents. The list can contain a
     * maximum of 25 documents. Each document should contain at least 20
     * characters and must contain fewer than 5,000 bytes of UTF-8 encoded
     * characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param textList <p>
     *            A list containing the text of the input documents. The list
     *            can contain a maximum of 25 documents. Each document should
     *            contain at least 20 characters and must contain fewer than
     *            5,000 bytes of UTF-8 encoded characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDetectDominantLanguageRequest withTextList(String... textList) {
        if (getTextList() == null) {
            this.textList = new java.util.ArrayList<String>(textList.length);
        }
        for (String value : textList) {
            this.textList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list containing the text of the input documents. The list can contain a
     * maximum of 25 documents. Each document should contain at least 20
     * characters and must contain fewer than 5,000 bytes of UTF-8 encoded
     * characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param textList <p>
     *            A list containing the text of the input documents. The list
     *            can contain a maximum of 25 documents. Each document should
     *            contain at least 20 characters and must contain fewer than
     *            5,000 bytes of UTF-8 encoded characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDetectDominantLanguageRequest withTextList(java.util.Collection<String> textList) {
        setTextList(textList);
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
        if (getTextList() != null)
            sb.append("TextList: " + getTextList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTextList() == null) ? 0 : getTextList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDetectDominantLanguageRequest == false)
            return false;
        BatchDetectDominantLanguageRequest other = (BatchDetectDominantLanguageRequest) obj;

        if (other.getTextList() == null ^ this.getTextList() == null)
            return false;
        if (other.getTextList() != null && other.getTextList().equals(this.getTextList()) == false)
            return false;
        return true;
    }
}
