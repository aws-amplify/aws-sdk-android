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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Information about input answers for a contact evaluation.
 * </p>
 */
public class EvaluationAnswerInput implements Serializable {
    /**
     * <p>
     * The value for an answer in a contact evaluation.
     * </p>
     */
    private EvaluationAnswerData value;

    /**
     * <p>
     * The value for an answer in a contact evaluation.
     * </p>
     *
     * @return <p>
     *         The value for an answer in a contact evaluation.
     *         </p>
     */
    public EvaluationAnswerData getValue() {
        return value;
    }

    /**
     * <p>
     * The value for an answer in a contact evaluation.
     * </p>
     *
     * @param value <p>
     *            The value for an answer in a contact evaluation.
     *            </p>
     */
    public void setValue(EvaluationAnswerData value) {
        this.value = value;
    }

    /**
     * <p>
     * The value for an answer in a contact evaluation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value for an answer in a contact evaluation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationAnswerInput withValue(EvaluationAnswerData value) {
        this.value = value;
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
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationAnswerInput == false)
            return false;
        EvaluationAnswerInput other = (EvaluationAnswerInput) obj;

        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
