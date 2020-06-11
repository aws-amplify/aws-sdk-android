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
 * Obtains information from the user. To define a prompt, provide one or more
 * messages and specify the number of attempts to get information from the user.
 * If you provide more than one message, Amazon Lex chooses one of the messages
 * to use to prompt the user. For more information, see <a>how-it-works</a>.
 * </p>
 */
public class Prompt implements Serializable {
    /**
     * <p>
     * An array of objects, each of which provides a message string and its
     * type. You can specify the message string in plain text or in Speech
     * Synthesis Markup Language (SSML).
     * </p>
     */
    private java.util.List<Message> messages;

    /**
     * <p>
     * The number of times to prompt the user for information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5<br/>
     */
    private Integer maxAttempts;

    /**
     * <p>
     * A response card. Amazon Lex uses this prompt at runtime, in the
     * <code>PostText</code> API response. It substitutes session attributes and
     * slot values for placeholders in the response card. For more information,
     * see <a>ex-resp-card</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50000<br/>
     */
    private String responseCard;

    /**
     * <p>
     * An array of objects, each of which provides a message string and its
     * type. You can specify the message string in plain text or in Speech
     * Synthesis Markup Language (SSML).
     * </p>
     *
     * @return <p>
     *         An array of objects, each of which provides a message string and
     *         its type. You can specify the message string in plain text or in
     *         Speech Synthesis Markup Language (SSML).
     *         </p>
     */
    public java.util.List<Message> getMessages() {
        return messages;
    }

    /**
     * <p>
     * An array of objects, each of which provides a message string and its
     * type. You can specify the message string in plain text or in Speech
     * Synthesis Markup Language (SSML).
     * </p>
     *
     * @param messages <p>
     *            An array of objects, each of which provides a message string
     *            and its type. You can specify the message string in plain text
     *            or in Speech Synthesis Markup Language (SSML).
     *            </p>
     */
    public void setMessages(java.util.Collection<Message> messages) {
        if (messages == null) {
            this.messages = null;
            return;
        }

        this.messages = new java.util.ArrayList<Message>(messages);
    }

    /**
     * <p>
     * An array of objects, each of which provides a message string and its
     * type. You can specify the message string in plain text or in Speech
     * Synthesis Markup Language (SSML).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messages <p>
     *            An array of objects, each of which provides a message string
     *            and its type. You can specify the message string in plain text
     *            or in Speech Synthesis Markup Language (SSML).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Prompt withMessages(Message... messages) {
        if (getMessages() == null) {
            this.messages = new java.util.ArrayList<Message>(messages.length);
        }
        for (Message value : messages) {
            this.messages.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, each of which provides a message string and its
     * type. You can specify the message string in plain text or in Speech
     * Synthesis Markup Language (SSML).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messages <p>
     *            An array of objects, each of which provides a message string
     *            and its type. You can specify the message string in plain text
     *            or in Speech Synthesis Markup Language (SSML).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Prompt withMessages(java.util.Collection<Message> messages) {
        setMessages(messages);
        return this;
    }

    /**
     * <p>
     * The number of times to prompt the user for information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5<br/>
     *
     * @return <p>
     *         The number of times to prompt the user for information.
     *         </p>
     */
    public Integer getMaxAttempts() {
        return maxAttempts;
    }

    /**
     * <p>
     * The number of times to prompt the user for information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5<br/>
     *
     * @param maxAttempts <p>
     *            The number of times to prompt the user for information.
     *            </p>
     */
    public void setMaxAttempts(Integer maxAttempts) {
        this.maxAttempts = maxAttempts;
    }

    /**
     * <p>
     * The number of times to prompt the user for information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5<br/>
     *
     * @param maxAttempts <p>
     *            The number of times to prompt the user for information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Prompt withMaxAttempts(Integer maxAttempts) {
        this.maxAttempts = maxAttempts;
        return this;
    }

    /**
     * <p>
     * A response card. Amazon Lex uses this prompt at runtime, in the
     * <code>PostText</code> API response. It substitutes session attributes and
     * slot values for placeholders in the response card. For more information,
     * see <a>ex-resp-card</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50000<br/>
     *
     * @return <p>
     *         A response card. Amazon Lex uses this prompt at runtime, in the
     *         <code>PostText</code> API response. It substitutes session
     *         attributes and slot values for placeholders in the response card.
     *         For more information, see <a>ex-resp-card</a>.
     *         </p>
     */
    public String getResponseCard() {
        return responseCard;
    }

    /**
     * <p>
     * A response card. Amazon Lex uses this prompt at runtime, in the
     * <code>PostText</code> API response. It substitutes session attributes and
     * slot values for placeholders in the response card. For more information,
     * see <a>ex-resp-card</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50000<br/>
     *
     * @param responseCard <p>
     *            A response card. Amazon Lex uses this prompt at runtime, in
     *            the <code>PostText</code> API response. It substitutes session
     *            attributes and slot values for placeholders in the response
     *            card. For more information, see <a>ex-resp-card</a>.
     *            </p>
     */
    public void setResponseCard(String responseCard) {
        this.responseCard = responseCard;
    }

    /**
     * <p>
     * A response card. Amazon Lex uses this prompt at runtime, in the
     * <code>PostText</code> API response. It substitutes session attributes and
     * slot values for placeholders in the response card. For more information,
     * see <a>ex-resp-card</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50000<br/>
     *
     * @param responseCard <p>
     *            A response card. Amazon Lex uses this prompt at runtime, in
     *            the <code>PostText</code> API response. It substitutes session
     *            attributes and slot values for placeholders in the response
     *            card. For more information, see <a>ex-resp-card</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Prompt withResponseCard(String responseCard) {
        this.responseCard = responseCard;
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
        if (getMessages() != null)
            sb.append("messages: " + getMessages() + ",");
        if (getMaxAttempts() != null)
            sb.append("maxAttempts: " + getMaxAttempts() + ",");
        if (getResponseCard() != null)
            sb.append("responseCard: " + getResponseCard());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessages() == null) ? 0 : getMessages().hashCode());
        hashCode = prime * hashCode
                + ((getMaxAttempts() == null) ? 0 : getMaxAttempts().hashCode());
        hashCode = prime * hashCode
                + ((getResponseCard() == null) ? 0 : getResponseCard().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Prompt == false)
            return false;
        Prompt other = (Prompt) obj;

        if (other.getMessages() == null ^ this.getMessages() == null)
            return false;
        if (other.getMessages() != null && other.getMessages().equals(this.getMessages()) == false)
            return false;
        if (other.getMaxAttempts() == null ^ this.getMaxAttempts() == null)
            return false;
        if (other.getMaxAttempts() != null
                && other.getMaxAttempts().equals(this.getMaxAttempts()) == false)
            return false;
        if (other.getResponseCard() == null ^ this.getResponseCard() == null)
            return false;
        if (other.getResponseCard() != null
                && other.getResponseCard().equals(this.getResponseCard()) == false)
            return false;
        return true;
    }
}
