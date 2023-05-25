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

public class CreatePromptResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the prompt.
     * </p>
     */
    private String promptARN;

    /**
     * <p>
     * A unique identifier for the prompt.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String promptId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the prompt.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the prompt.
     *         </p>
     */
    public String getPromptARN() {
        return promptARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the prompt.
     * </p>
     *
     * @param promptARN <p>
     *            The Amazon Resource Name (ARN) of the prompt.
     *            </p>
     */
    public void setPromptARN(String promptARN) {
        this.promptARN = promptARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the prompt.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param promptARN <p>
     *            The Amazon Resource Name (ARN) of the prompt.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePromptResult withPromptARN(String promptARN) {
        this.promptARN = promptARN;
        return this;
    }

    /**
     * <p>
     * A unique identifier for the prompt.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         A unique identifier for the prompt.
     *         </p>
     */
    public String getPromptId() {
        return promptId;
    }

    /**
     * <p>
     * A unique identifier for the prompt.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param promptId <p>
     *            A unique identifier for the prompt.
     *            </p>
     */
    public void setPromptId(String promptId) {
        this.promptId = promptId;
    }

    /**
     * <p>
     * A unique identifier for the prompt.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param promptId <p>
     *            A unique identifier for the prompt.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePromptResult withPromptId(String promptId) {
        this.promptId = promptId;
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
        if (getPromptARN() != null)
            sb.append("PromptARN: " + getPromptARN() + ",");
        if (getPromptId() != null)
            sb.append("PromptId: " + getPromptId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPromptARN() == null) ? 0 : getPromptARN().hashCode());
        hashCode = prime * hashCode + ((getPromptId() == null) ? 0 : getPromptId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePromptResult == false)
            return false;
        CreatePromptResult other = (CreatePromptResult) obj;

        if (other.getPromptARN() == null ^ this.getPromptARN() == null)
            return false;
        if (other.getPromptARN() != null
                && other.getPromptARN().equals(this.getPromptARN()) == false)
            return false;
        if (other.getPromptId() == null ^ this.getPromptId() == null)
            return false;
        if (other.getPromptId() != null && other.getPromptId().equals(this.getPromptId()) == false)
            return false;
        return true;
    }
}
