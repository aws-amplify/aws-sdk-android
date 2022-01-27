/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class CreateVocabularyResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom vocabulary.
     * </p>
     */
    private String vocabularyArn;

    /**
     * <p>
     * The identifier of the custom vocabulary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     */
    private String vocabularyId;

    /**
     * <p>
     * The current state of the custom vocabulary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, ACTIVE, CREATION_FAILED,
     * DELETE_IN_PROGRESS
     */
    private String state;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom vocabulary.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the custom vocabulary.
     *         </p>
     */
    public String getVocabularyArn() {
        return vocabularyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom vocabulary.
     * </p>
     *
     * @param vocabularyArn <p>
     *            The Amazon Resource Name (ARN) of the custom vocabulary.
     *            </p>
     */
    public void setVocabularyArn(String vocabularyArn) {
        this.vocabularyArn = vocabularyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom vocabulary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vocabularyArn <p>
     *            The Amazon Resource Name (ARN) of the custom vocabulary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVocabularyResult withVocabularyArn(String vocabularyArn) {
        this.vocabularyArn = vocabularyArn;
        return this;
    }

    /**
     * <p>
     * The identifier of the custom vocabulary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @return <p>
     *         The identifier of the custom vocabulary.
     *         </p>
     */
    public String getVocabularyId() {
        return vocabularyId;
    }

    /**
     * <p>
     * The identifier of the custom vocabulary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param vocabularyId <p>
     *            The identifier of the custom vocabulary.
     *            </p>
     */
    public void setVocabularyId(String vocabularyId) {
        this.vocabularyId = vocabularyId;
    }

    /**
     * <p>
     * The identifier of the custom vocabulary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param vocabularyId <p>
     *            The identifier of the custom vocabulary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVocabularyResult withVocabularyId(String vocabularyId) {
        this.vocabularyId = vocabularyId;
        return this;
    }

    /**
     * <p>
     * The current state of the custom vocabulary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, ACTIVE, CREATION_FAILED,
     * DELETE_IN_PROGRESS
     *
     * @return <p>
     *         The current state of the custom vocabulary.
     *         </p>
     * @see VocabularyState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The current state of the custom vocabulary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, ACTIVE, CREATION_FAILED,
     * DELETE_IN_PROGRESS
     *
     * @param state <p>
     *            The current state of the custom vocabulary.
     *            </p>
     * @see VocabularyState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the custom vocabulary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, ACTIVE, CREATION_FAILED,
     * DELETE_IN_PROGRESS
     *
     * @param state <p>
     *            The current state of the custom vocabulary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VocabularyState
     */
    public CreateVocabularyResult withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The current state of the custom vocabulary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, ACTIVE, CREATION_FAILED,
     * DELETE_IN_PROGRESS
     *
     * @param state <p>
     *            The current state of the custom vocabulary.
     *            </p>
     * @see VocabularyState
     */
    public void setState(VocabularyState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The current state of the custom vocabulary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATION_IN_PROGRESS, ACTIVE, CREATION_FAILED,
     * DELETE_IN_PROGRESS
     *
     * @param state <p>
     *            The current state of the custom vocabulary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VocabularyState
     */
    public CreateVocabularyResult withState(VocabularyState state) {
        this.state = state.toString();
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
        if (getVocabularyArn() != null)
            sb.append("VocabularyArn: " + getVocabularyArn() + ",");
        if (getVocabularyId() != null)
            sb.append("VocabularyId: " + getVocabularyId() + ",");
        if (getState() != null)
            sb.append("State: " + getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVocabularyArn() == null) ? 0 : getVocabularyArn().hashCode());
        hashCode = prime * hashCode
                + ((getVocabularyId() == null) ? 0 : getVocabularyId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVocabularyResult == false)
            return false;
        CreateVocabularyResult other = (CreateVocabularyResult) obj;

        if (other.getVocabularyArn() == null ^ this.getVocabularyArn() == null)
            return false;
        if (other.getVocabularyArn() != null
                && other.getVocabularyArn().equals(this.getVocabularyArn()) == false)
            return false;
        if (other.getVocabularyId() == null ^ this.getVocabularyId() == null)
            return false;
        if (other.getVocabularyId() != null
                && other.getVocabularyId().equals(this.getVocabularyId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }
}
