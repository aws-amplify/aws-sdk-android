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

package com.amazonaws.services.kinesisvideosignaling.model;

import java.io.Serializable;

public class SendAlexaOfferToMasterResult implements Serializable {
    /**
     * <p>
     * The base64-encoded SDP answer content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10000<br/>
     */
    private String answer;

    /**
     * <p>
     * The base64-encoded SDP answer content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10000<br/>
     *
     * @return <p>
     *         The base64-encoded SDP answer content.
     *         </p>
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * <p>
     * The base64-encoded SDP answer content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10000<br/>
     *
     * @param answer <p>
     *            The base64-encoded SDP answer content.
     *            </p>
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * <p>
     * The base64-encoded SDP answer content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10000<br/>
     *
     * @param answer <p>
     *            The base64-encoded SDP answer content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendAlexaOfferToMasterResult withAnswer(String answer) {
        this.answer = answer;
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
        if (getAnswer() != null)
            sb.append("Answer: " + getAnswer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnswer() == null) ? 0 : getAnswer().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendAlexaOfferToMasterResult == false)
            return false;
        SendAlexaOfferToMasterResult other = (SendAlexaOfferToMasterResult) obj;

        if (other.getAnswer() == null ^ this.getAnswer() == null)
            return false;
        if (other.getAnswer() != null && other.getAnswer().equals(this.getAnswer()) == false)
            return false;
        return true;
    }
}
