/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information about notes for a contact evaluation.
 * </p>
 */
public class EvaluationNote implements Serializable {
    /**
     * <p>
     * The note for an item (section or question) in a contact evaluation.
     * </p>
     * <note>
     * <p>
     * Even though a note in an evaluation can have up to 3072 chars, there is
     * also a limit on the total number of chars for all the notes in the
     * evaluation combined. Assuming there are N questions in the evaluation
     * being submitted, then the max char limit for all notes combined is N x
     * 1024.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3072<br/>
     */
    private String value;

    /**
     * <p>
     * The note for an item (section or question) in a contact evaluation.
     * </p>
     * <note>
     * <p>
     * Even though a note in an evaluation can have up to 3072 chars, there is
     * also a limit on the total number of chars for all the notes in the
     * evaluation combined. Assuming there are N questions in the evaluation
     * being submitted, then the max char limit for all notes combined is N x
     * 1024.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3072<br/>
     *
     * @return <p>
     *         The note for an item (section or question) in a contact
     *         evaluation.
     *         </p>
     *         <note>
     *         <p>
     *         Even though a note in an evaluation can have up to 3072 chars,
     *         there is also a limit on the total number of chars for all the
     *         notes in the evaluation combined. Assuming there are N questions
     *         in the evaluation being submitted, then the max char limit for
     *         all notes combined is N x 1024.
     *         </p>
     *         </note>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The note for an item (section or question) in a contact evaluation.
     * </p>
     * <note>
     * <p>
     * Even though a note in an evaluation can have up to 3072 chars, there is
     * also a limit on the total number of chars for all the notes in the
     * evaluation combined. Assuming there are N questions in the evaluation
     * being submitted, then the max char limit for all notes combined is N x
     * 1024.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3072<br/>
     *
     * @param value <p>
     *            The note for an item (section or question) in a contact
     *            evaluation.
     *            </p>
     *            <note>
     *            <p>
     *            Even though a note in an evaluation can have up to 3072 chars,
     *            there is also a limit on the total number of chars for all the
     *            notes in the evaluation combined. Assuming there are N
     *            questions in the evaluation being submitted, then the max char
     *            limit for all notes combined is N x 1024.
     *            </p>
     *            </note>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The note for an item (section or question) in a contact evaluation.
     * </p>
     * <note>
     * <p>
     * Even though a note in an evaluation can have up to 3072 chars, there is
     * also a limit on the total number of chars for all the notes in the
     * evaluation combined. Assuming there are N questions in the evaluation
     * being submitted, then the max char limit for all notes combined is N x
     * 1024.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3072<br/>
     *
     * @param value <p>
     *            The note for an item (section or question) in a contact
     *            evaluation.
     *            </p>
     *            <note>
     *            <p>
     *            Even though a note in an evaluation can have up to 3072 chars,
     *            there is also a limit on the total number of chars for all the
     *            notes in the evaluation combined. Assuming there are N
     *            questions in the evaluation being submitted, then the max char
     *            limit for all notes combined is N x 1024.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationNote withValue(String value) {
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

        if (obj instanceof EvaluationNote == false)
            return false;
        EvaluationNote other = (EvaluationNote) obj;

        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
