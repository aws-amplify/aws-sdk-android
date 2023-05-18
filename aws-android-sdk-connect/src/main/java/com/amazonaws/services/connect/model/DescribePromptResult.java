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

public class DescribePromptResult implements Serializable {
    /**
     * <p>
     * Information about the prompt.
     * </p>
     */
    private Prompt prompt;

    /**
     * <p>
     * Information about the prompt.
     * </p>
     *
     * @return <p>
     *         Information about the prompt.
     *         </p>
     */
    public Prompt getPrompt() {
        return prompt;
    }

    /**
     * <p>
     * Information about the prompt.
     * </p>
     *
     * @param prompt <p>
     *            Information about the prompt.
     *            </p>
     */
    public void setPrompt(Prompt prompt) {
        this.prompt = prompt;
    }

    /**
     * <p>
     * Information about the prompt.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prompt <p>
     *            Information about the prompt.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePromptResult withPrompt(Prompt prompt) {
        this.prompt = prompt;
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
        if (getPrompt() != null)
            sb.append("Prompt: " + getPrompt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrompt() == null) ? 0 : getPrompt().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePromptResult == false)
            return false;
        DescribePromptResult other = (DescribePromptResult) obj;

        if (other.getPrompt() == null ^ this.getPrompt() == null)
            return false;
        if (other.getPrompt() != null && other.getPrompt().equals(this.getPrompt()) == false)
            return false;
        return true;
    }
}
