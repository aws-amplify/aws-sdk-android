/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class GetTranscriptResult implements Serializable {
    /**
     * <p>
     * The initial contact ID for the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String initialContactId;

    /**
     * <p>
     * The list of messages in the session.
     * </p>
     */
    private java.util.List<Item> transcript;

    /**
     * <p>
     * The pagination token. Use the value returned previously in the next
     * subsequent request to retrieve the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The initial contact ID for the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The initial contact ID for the contact.
     *         </p>
     */
    public String getInitialContactId() {
        return initialContactId;
    }

    /**
     * <p>
     * The initial contact ID for the contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param initialContactId <p>
     *            The initial contact ID for the contact.
     *            </p>
     */
    public void setInitialContactId(String initialContactId) {
        this.initialContactId = initialContactId;
    }

    /**
     * <p>
     * The initial contact ID for the contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param initialContactId <p>
     *            The initial contact ID for the contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTranscriptResult withInitialContactId(String initialContactId) {
        this.initialContactId = initialContactId;
        return this;
    }

    /**
     * <p>
     * The list of messages in the session.
     * </p>
     *
     * @return <p>
     *         The list of messages in the session.
     *         </p>
     */
    public java.util.List<Item> getTranscript() {
        return transcript;
    }

    /**
     * <p>
     * The list of messages in the session.
     * </p>
     *
     * @param transcript <p>
     *            The list of messages in the session.
     *            </p>
     */
    public void setTranscript(java.util.Collection<Item> transcript) {
        if (transcript == null) {
            this.transcript = null;
            return;
        }

        this.transcript = new java.util.ArrayList<Item>(transcript);
    }

    /**
     * <p>
     * The list of messages in the session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transcript <p>
     *            The list of messages in the session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTranscriptResult withTranscript(Item... transcript) {
        if (getTranscript() == null) {
            this.transcript = new java.util.ArrayList<Item>(transcript.length);
        }
        for (Item value : transcript) {
            this.transcript.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of messages in the session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transcript <p>
     *            The list of messages in the session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTranscriptResult withTranscript(java.util.Collection<Item> transcript) {
        setTranscript(transcript);
        return this;
    }

    /**
     * <p>
     * The pagination token. Use the value returned previously in the next
     * subsequent request to retrieve the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The pagination token. Use the value returned previously in the
     *         next subsequent request to retrieve the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The pagination token. Use the value returned previously in the next
     * subsequent request to retrieve the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param nextToken <p>
     *            The pagination token. Use the value returned previously in the
     *            next subsequent request to retrieve the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token. Use the value returned previously in the next
     * subsequent request to retrieve the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param nextToken <p>
     *            The pagination token. Use the value returned previously in the
     *            next subsequent request to retrieve the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTranscriptResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getInitialContactId() != null)
            sb.append("InitialContactId: " + getInitialContactId() + ",");
        if (getTranscript() != null)
            sb.append("Transcript: " + getTranscript() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInitialContactId() == null) ? 0 : getInitialContactId().hashCode());
        hashCode = prime * hashCode + ((getTranscript() == null) ? 0 : getTranscript().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTranscriptResult == false)
            return false;
        GetTranscriptResult other = (GetTranscriptResult) obj;

        if (other.getInitialContactId() == null ^ this.getInitialContactId() == null)
            return false;
        if (other.getInitialContactId() != null
                && other.getInitialContactId().equals(this.getInitialContactId()) == false)
            return false;
        if (other.getTranscript() == null ^ this.getTranscript() == null)
            return false;
        if (other.getTranscript() != null
                && other.getTranscript().equals(this.getTranscript()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
