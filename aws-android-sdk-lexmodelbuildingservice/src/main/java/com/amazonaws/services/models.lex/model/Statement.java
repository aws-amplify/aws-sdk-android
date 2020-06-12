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
 * A collection of messages that convey information to the user. At runtime,
 * Amazon Lex selects the message to convey.
 * </p>
 */
public class Statement implements Serializable {
    /**
     * <p>
     * A collection of message objects.
     * </p>
     */
    private java.util.List<Message> messages;

    /**
     * <p>
     * At runtime, if the client is using the <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html"
     * >PostText</a> API, Amazon Lex includes the response card in the response.
     * It substitutes all of the session attributes and slot values for
     * placeholders in the response card.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50000<br/>
     */
    private String responseCard;

    /**
     * <p>
     * A collection of message objects.
     * </p>
     *
     * @return <p>
     *         A collection of message objects.
     *         </p>
     */
    public java.util.List<Message> getMessages() {
        return messages;
    }

    /**
     * <p>
     * A collection of message objects.
     * </p>
     *
     * @param messages <p>
     *            A collection of message objects.
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
     * A collection of message objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messages <p>
     *            A collection of message objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Statement withMessages(Message... messages) {
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
     * A collection of message objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messages <p>
     *            A collection of message objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Statement withMessages(java.util.Collection<Message> messages) {
        setMessages(messages);
        return this;
    }

    /**
     * <p>
     * At runtime, if the client is using the <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html"
     * >PostText</a> API, Amazon Lex includes the response card in the response.
     * It substitutes all of the session attributes and slot values for
     * placeholders in the response card.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50000<br/>
     *
     * @return <p>
     *         At runtime, if the client is using the <a href=
     *         "http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html"
     *         >PostText</a> API, Amazon Lex includes the response card in the
     *         response. It substitutes all of the session attributes and slot
     *         values for placeholders in the response card.
     *         </p>
     */
    public String getResponseCard() {
        return responseCard;
    }

    /**
     * <p>
     * At runtime, if the client is using the <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html"
     * >PostText</a> API, Amazon Lex includes the response card in the response.
     * It substitutes all of the session attributes and slot values for
     * placeholders in the response card.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50000<br/>
     *
     * @param responseCard <p>
     *            At runtime, if the client is using the <a href=
     *            "http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html"
     *            >PostText</a> API, Amazon Lex includes the response card in
     *            the response. It substitutes all of the session attributes and
     *            slot values for placeholders in the response card.
     *            </p>
     */
    public void setResponseCard(String responseCard) {
        this.responseCard = responseCard;
    }

    /**
     * <p>
     * At runtime, if the client is using the <a href=
     * "http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html"
     * >PostText</a> API, Amazon Lex includes the response card in the response.
     * It substitutes all of the session attributes and slot values for
     * placeholders in the response card.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50000<br/>
     *
     * @param responseCard <p>
     *            At runtime, if the client is using the <a href=
     *            "http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html"
     *            >PostText</a> API, Amazon Lex includes the response card in
     *            the response. It substitutes all of the session attributes and
     *            slot values for placeholders in the response card.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Statement withResponseCard(String responseCard) {
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
                + ((getResponseCard() == null) ? 0 : getResponseCard().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Statement == false)
            return false;
        Statement other = (Statement) obj;

        if (other.getMessages() == null ^ this.getMessages() == null)
            return false;
        if (other.getMessages() != null && other.getMessages().equals(this.getMessages()) == false)
            return false;
        if (other.getResponseCard() == null ^ this.getResponseCard() == null)
            return false;
        if (other.getResponseCard() != null
                && other.getResponseCard().equals(this.getResponseCard()) == false)
            return false;
        return true;
    }
}
