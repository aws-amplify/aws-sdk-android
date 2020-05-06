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
 * Inspects the clinical text for a variety of medical entities and returns
 * specific information about them such as entity category, location, and
 * confidence score on that information. Amazon Comprehend Medical only detects
 * medical entities in English language texts.
 * </p>
 * <p>
 * The <code>DetectEntitiesV2</code> operation replaces the
 * <a>DetectEntities</a> operation. This new action uses a different model for
 * determining the entities in your medical text and changes the way that some
 * entities are returned in the output. You should use the
 * <code>DetectEntitiesV2</code> operation in all new applications.
 * </p>
 * <p>
 * The <code>DetectEntitiesV2</code> operation returns the <code>Acuity</code>
 * and <code>Direction</code> entities as attributes instead of types.
 * </p>
 */
public class DetectEntitiesV2Request extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A UTF-8 string containing the clinical content being examined for
     * entities. Each string must contain fewer than 20,000 bytes of characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20000<br/>
     */
    private String text;

    /**
     * <p>
     * A UTF-8 string containing the clinical content being examined for
     * entities. Each string must contain fewer than 20,000 bytes of characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20000<br/>
     *
     * @return <p>
     *         A UTF-8 string containing the clinical content being examined for
     *         entities. Each string must contain fewer than 20,000 bytes of
     *         characters.
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * A UTF-8 string containing the clinical content being examined for
     * entities. Each string must contain fewer than 20,000 bytes of characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20000<br/>
     *
     * @param text <p>
     *            A UTF-8 string containing the clinical content being examined
     *            for entities. Each string must contain fewer than 20,000 bytes
     *            of characters.
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * A UTF-8 string containing the clinical content being examined for
     * entities. Each string must contain fewer than 20,000 bytes of characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20000<br/>
     *
     * @param text <p>
     *            A UTF-8 string containing the clinical content being examined
     *            for entities. Each string must contain fewer than 20,000 bytes
     *            of characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectEntitiesV2Request withText(String text) {
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

        if (obj instanceof DetectEntitiesV2Request == false)
            return false;
        DetectEntitiesV2Request other = (DetectEntitiesV2Request) obj;

        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        return true;
    }
}
