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

package com.amazonaws.services.models.lex.model;

import java.io.Serializable;

/**
 * <p>
 * A prompt for additional activity after an intent is fulfilled. For example,
 * after the <code>OrderPizza</code> intent is fulfilled, you might prompt the
 * user to find out whether the user wants to order drinks.
 * </p>
 */
public class FollowUpPrompt implements Serializable {
    /**
     * <p>
     * Prompts for information from the user.
     * </p>
     */
    private Prompt prompt;

    /**
     * <p>
     * If the user answers "no" to the question defined in the
     * <code>prompt</code> field, Amazon Lex responds with this statement to
     * acknowledge that the intent was canceled.
     * </p>
     */
    private Statement rejectionStatement;

    /**
     * <p>
     * Prompts for information from the user.
     * </p>
     *
     * @return <p>
     *         Prompts for information from the user.
     *         </p>
     */
    public Prompt getPrompt() {
        return prompt;
    }

    /**
     * <p>
     * Prompts for information from the user.
     * </p>
     *
     * @param prompt <p>
     *            Prompts for information from the user.
     *            </p>
     */
    public void setPrompt(Prompt prompt) {
        this.prompt = prompt;
    }

    /**
     * <p>
     * Prompts for information from the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prompt <p>
     *            Prompts for information from the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FollowUpPrompt withPrompt(Prompt prompt) {
        this.prompt = prompt;
        return this;
    }

    /**
     * <p>
     * If the user answers "no" to the question defined in the
     * <code>prompt</code> field, Amazon Lex responds with this statement to
     * acknowledge that the intent was canceled.
     * </p>
     *
     * @return <p>
     *         If the user answers "no" to the question defined in the
     *         <code>prompt</code> field, Amazon Lex responds with this
     *         statement to acknowledge that the intent was canceled.
     *         </p>
     */
    public Statement getRejectionStatement() {
        return rejectionStatement;
    }

    /**
     * <p>
     * If the user answers "no" to the question defined in the
     * <code>prompt</code> field, Amazon Lex responds with this statement to
     * acknowledge that the intent was canceled.
     * </p>
     *
     * @param rejectionStatement <p>
     *            If the user answers "no" to the question defined in the
     *            <code>prompt</code> field, Amazon Lex responds with this
     *            statement to acknowledge that the intent was canceled.
     *            </p>
     */
    public void setRejectionStatement(Statement rejectionStatement) {
        this.rejectionStatement = rejectionStatement;
    }

    /**
     * <p>
     * If the user answers "no" to the question defined in the
     * <code>prompt</code> field, Amazon Lex responds with this statement to
     * acknowledge that the intent was canceled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rejectionStatement <p>
     *            If the user answers "no" to the question defined in the
     *            <code>prompt</code> field, Amazon Lex responds with this
     *            statement to acknowledge that the intent was canceled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FollowUpPrompt withRejectionStatement(Statement rejectionStatement) {
        this.rejectionStatement = rejectionStatement;
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
            sb.append("prompt: " + getPrompt() + ",");
        if (getRejectionStatement() != null)
            sb.append("rejectionStatement: " + getRejectionStatement());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrompt() == null) ? 0 : getPrompt().hashCode());
        hashCode = prime * hashCode
                + ((getRejectionStatement() == null) ? 0 : getRejectionStatement().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FollowUpPrompt == false)
            return false;
        FollowUpPrompt other = (FollowUpPrompt) obj;

        if (other.getPrompt() == null ^ this.getPrompt() == null)
            return false;
        if (other.getPrompt() != null && other.getPrompt().equals(this.getPrompt()) == false)
            return false;
        if (other.getRejectionStatement() == null ^ this.getRejectionStatement() == null)
            return false;
        if (other.getRejectionStatement() != null
                && other.getRejectionStatement().equals(this.getRejectionStatement()) == false)
            return false;
        return true;
    }
}
