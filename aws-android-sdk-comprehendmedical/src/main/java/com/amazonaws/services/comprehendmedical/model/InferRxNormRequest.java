/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehendmedical.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * InferRxNorm detects medications as entities listed in a patient record and
 * links to the normalized concept identifiers in the RxNorm database from the
 * National Library of Medicine. Amazon Comprehend Medical only detects medical
 * entities in English language texts.
 * </p>
 */
public class InferRxNormRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The input text used for analysis. The input for InferRxNorm is a string
     * from 1 to 10000 characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10000<br/>
     */
    private String text;

    /**
     * <p>
     * The input text used for analysis. The input for InferRxNorm is a string
     * from 1 to 10000 characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10000<br/>
     *
     * @return <p>
     *         The input text used for analysis. The input for InferRxNorm is a
     *         string from 1 to 10000 characters.
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * The input text used for analysis. The input for InferRxNorm is a string
     * from 1 to 10000 characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10000<br/>
     *
     * @param text <p>
     *            The input text used for analysis. The input for InferRxNorm is
     *            a string from 1 to 10000 characters.
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The input text used for analysis. The input for InferRxNorm is a string
     * from 1 to 10000 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10000<br/>
     *
     * @param text <p>
     *            The input text used for analysis. The input for InferRxNorm is
     *            a string from 1 to 10000 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InferRxNormRequest withText(String text) {
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

        if (obj instanceof InferRxNormRequest == false)
            return false;
        InferRxNormRequest other = (InferRxNormRequest) obj;

        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        return true;
    }
}
