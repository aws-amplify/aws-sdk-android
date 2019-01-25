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
 * Determines the dominant language of the input text. For a list of languages
 * that Amazon Comprehend can detect, see <a
 * href="http://docs.aws.amazon.com/comprehend/latest/dg/how-languages.html"
 * >Amazon Comprehend Supported Languages</a>.
 * </p>
 */
public class DetectDominantLanguageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A UTF-8 text string. Each string should contain at least 20 characters
     * and must contain fewer that 5,000 bytes of UTF-8 encoded characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String text;

    /**
     * <p>
     * A UTF-8 text string. Each string should contain at least 20 characters
     * and must contain fewer that 5,000 bytes of UTF-8 encoded characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         A UTF-8 text string. Each string should contain at least 20
     *         characters and must contain fewer that 5,000 bytes of UTF-8
     *         encoded characters.
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * A UTF-8 text string. Each string should contain at least 20 characters
     * and must contain fewer that 5,000 bytes of UTF-8 encoded characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param text <p>
     *            A UTF-8 text string. Each string should contain at least 20
     *            characters and must contain fewer that 5,000 bytes of UTF-8
     *            encoded characters.
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * A UTF-8 text string. Each string should contain at least 20 characters
     * and must contain fewer that 5,000 bytes of UTF-8 encoded characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param text <p>
     *            A UTF-8 text string. Each string should contain at least 20
     *            characters and must contain fewer that 5,000 bytes of UTF-8
     *            encoded characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectDominantLanguageRequest withText(String text) {
        this.text = text;
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
        if (getText() != null)
            sb.append("Text: " + getText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectDominantLanguageRequest == false)
            return false;
        DetectDominantLanguageRequest other = (DetectDominantLanguageRequest) obj;

        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        return true;
    }
}
