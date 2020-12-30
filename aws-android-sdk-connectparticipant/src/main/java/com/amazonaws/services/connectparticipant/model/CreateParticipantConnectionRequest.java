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

package com.amazonaws.services.connectparticipant.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates the participant's connection. Note that ParticipantToken is used for
 * invoking this API instead of ConnectionToken.
 * </p>
 * <p>
 * The participant token is valid for the lifetime of the participant – until
 * they are part of a contact.
 * </p>
 * <p>
 * The response URL for <code>WEBSOCKET</code> Type has a connect expiry timeout
 * of 100s. Clients must manually connect to the returned websocket URL and
 * subscribe to the desired topic.
 * </p>
 * <p>
 * For chat, you need to publish the following on the established websocket
 * connection:
 * </p>
 * <p>
 * <code>{"topic":"aws/subscribe","content":{"topics":["aws/chat"]}}</code>
 * </p>
 * <p>
 * Upon websocket URL expiry, as specified in the response ConnectionExpiry
 * parameter, clients need to call this API again to obtain a new websocket URL
 * and perform the same steps as before.
 * </p>
 * <note>
 * <p>
 * The Amazon Connect Participant Service APIs do not use <a href=
 * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
 * >Signature Version 4 authentication</a>.
 * </p>
 * </note>
 */
public class CreateParticipantConnectionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Type of connection information required.
     * </p>
     */
    private java.util.List<String> type;

    /**
     * <p>
     * This is a header parameter.
     * </p>
     * <p>
     * The Participant Token as obtained from <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_StartChatContact.html"
     * >StartChatContact</a> API response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String participantToken;

    /**
     * <p>
     * Type of connection information required.
     * </p>
     *
     * @return <p>
     *         Type of connection information required.
     *         </p>
     */
    public java.util.List<String> getType() {
        return type;
    }

    /**
     * <p>
     * Type of connection information required.
     * </p>
     *
     * @param type <p>
     *            Type of connection information required.
     *            </p>
     */
    public void setType(java.util.Collection<String> type) {
        if (type == null) {
            this.type = null;
            return;
        }

        this.type = new java.util.ArrayList<String>(type);
    }

    /**
     * <p>
     * Type of connection information required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            Type of connection information required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateParticipantConnectionRequest withType(String... type) {
        if (getType() == null) {
            this.type = new java.util.ArrayList<String>(type.length);
        }
        for (String value : type) {
            this.type.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Type of connection information required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            Type of connection information required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateParticipantConnectionRequest withType(java.util.Collection<String> type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * This is a header parameter.
     * </p>
     * <p>
     * The Participant Token as obtained from <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_StartChatContact.html"
     * >StartChatContact</a> API response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         This is a header parameter.
     *         </p>
     *         <p>
     *         The Participant Token as obtained from <a href=
     *         "https://docs.aws.amazon.com/connect/latest/APIReference/API_StartChatContact.html"
     *         >StartChatContact</a> API response.
     *         </p>
     */
    public String getParticipantToken() {
        return participantToken;
    }

    /**
     * <p>
     * This is a header parameter.
     * </p>
     * <p>
     * The Participant Token as obtained from <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_StartChatContact.html"
     * >StartChatContact</a> API response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param participantToken <p>
     *            This is a header parameter.
     *            </p>
     *            <p>
     *            The Participant Token as obtained from <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_StartChatContact.html"
     *            >StartChatContact</a> API response.
     *            </p>
     */
    public void setParticipantToken(String participantToken) {
        this.participantToken = participantToken;
    }

    /**
     * <p>
     * This is a header parameter.
     * </p>
     * <p>
     * The Participant Token as obtained from <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_StartChatContact.html"
     * >StartChatContact</a> API response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param participantToken <p>
     *            This is a header parameter.
     *            </p>
     *            <p>
     *            The Participant Token as obtained from <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_StartChatContact.html"
     *            >StartChatContact</a> API response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateParticipantConnectionRequest withParticipantToken(String participantToken) {
        this.participantToken = participantToken;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getParticipantToken() != null)
            sb.append("ParticipantToken: " + getParticipantToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getParticipantToken() == null) ? 0 : getParticipantToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateParticipantConnectionRequest == false)
            return false;
        CreateParticipantConnectionRequest other = (CreateParticipantConnectionRequest) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getParticipantToken() == null ^ this.getParticipantToken() == null)
            return false;
        if (other.getParticipantToken() != null
                && other.getParticipantToken().equals(this.getParticipantToken()) == false)
            return false;
        return true;
    }
}
