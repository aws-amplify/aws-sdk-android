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

package com.amazonaws.services.lexrts.model;

import java.io.Serializable;

/**
 * <p>
 * Represents an option to be shown on the client platform (Facebook, Slack,
 * etc.)
 * </p>
 */
public class Button implements Serializable {
    /**
     * <p>
     * Text that is visible to the user on the button.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 15<br/>
     */
    private String text;

    /**
     * <p>
     * The value sent to Amazon Lex when a user chooses the button. For example,
     * consider button text "NYC." When the user chooses the button, the value
     * sent can be "New York City."
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String value;

    /**
     * <p>
     * Text that is visible to the user on the button.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 15<br/>
     *
     * @return <p>
     *         Text that is visible to the user on the button.
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * Text that is visible to the user on the button.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 15<br/>
     *
     * @param text <p>
     *            Text that is visible to the user on the button.
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * Text that is visible to the user on the button.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 15<br/>
     *
     * @param text <p>
     *            Text that is visible to the user on the button.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Button withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * <p>
     * The value sent to Amazon Lex when a user chooses the button. For example,
     * consider button text "NYC." When the user chooses the button, the value
     * sent can be "New York City."
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The value sent to Amazon Lex when a user chooses the button. For
     *         example, consider button text "NYC." When the user chooses the
     *         button, the value sent can be "New York City."
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value sent to Amazon Lex when a user chooses the button. For example,
     * consider button text "NYC." When the user chooses the button, the value
     * sent can be "New York City."
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param value <p>
     *            The value sent to Amazon Lex when a user chooses the button.
     *            For example, consider button text "NYC." When the user chooses
     *            the button, the value sent can be "New York City."
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value sent to Amazon Lex when a user chooses the button. For example,
     * consider button text "NYC." When the user chooses the button, the value
     * sent can be "New York City."
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param value <p>
     *            The value sent to Amazon Lex when a user chooses the button.
     *            For example, consider button text "NYC." When the user chooses
     *            the button, the value sent can be "New York City."
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Button withValue(String value) {
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
        if (getText() != null)
            sb.append("text: " + getText() + ",");
        if (getValue() != null)
            sb.append("value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Button == false)
            return false;
        Button other = (Button) obj;

        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
