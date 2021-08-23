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

package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Decodes additional information about the authorization status of a request
 * from an encoded message returned in response to an Amazon Web Services
 * request.
 * </p>
 * <p>
 * For example, if a user is not authorized to perform an operation that he or
 * she has requested, the request returns a
 * <code>Client.UnauthorizedOperation</code> response (an HTTP 403 response).
 * Some Amazon Web Services operations additionally return an encoded message
 * that can provide details about this authorization failure.
 * </p>
 * <note>
 * <p>
 * Only certain Amazon Web Services operations return an encoded authorization
 * message. The documentation for an individual operation indicates whether that
 * operation returns an encoded message in addition to returning an HTTP code.
 * </p>
 * </note>
 * <p>
 * The message is encoded because the details of the authorization status can
 * constitute privileged information that the user who requested the operation
 * should not see. To decode an authorization status message, a user must be
 * granted permissions via an IAM policy to request the
 * <code>DecodeAuthorizationMessage</code> (
 * <code>sts:DecodeAuthorizationMessage</code>) action.
 * </p>
 * <p>
 * The decoded message includes the following type of information:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Whether the request was denied due to an explicit deny or due to the absence
 * of an explicit allow. For more information, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-denyallow"
 * >Determining Whether a Request is Allowed or Denied</a> in the <i>IAM User
 * Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The principal who made the request.
 * </p>
 * </li>
 * <li>
 * <p>
 * The requested action.
 * </p>
 * </li>
 * <li>
 * <p>
 * The requested resource.
 * </p>
 * </li>
 * <li>
 * <p>
 * The values of condition keys in the context of the user's request.
 * </p>
 * </li>
 * </ul>
 */
public class DecodeAuthorizationMessageRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The encoded message that was returned with the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10240<br/>
     */
    private String encodedMessage;

    /**
     * <p>
     * The encoded message that was returned with the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10240<br/>
     *
     * @return <p>
     *         The encoded message that was returned with the response.
     *         </p>
     */
    public String getEncodedMessage() {
        return encodedMessage;
    }

    /**
     * <p>
     * The encoded message that was returned with the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10240<br/>
     *
     * @param encodedMessage <p>
     *            The encoded message that was returned with the response.
     *            </p>
     */
    public void setEncodedMessage(String encodedMessage) {
        this.encodedMessage = encodedMessage;
    }

    /**
     * <p>
     * The encoded message that was returned with the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10240<br/>
     *
     * @param encodedMessage <p>
     *            The encoded message that was returned with the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DecodeAuthorizationMessageRequest withEncodedMessage(String encodedMessage) {
        this.encodedMessage = encodedMessage;
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
        if (getEncodedMessage() != null)
            sb.append("EncodedMessage: " + getEncodedMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEncodedMessage() == null) ? 0 : getEncodedMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DecodeAuthorizationMessageRequest == false)
            return false;
        DecodeAuthorizationMessageRequest other = (DecodeAuthorizationMessageRequest) obj;

        if (other.getEncodedMessage() == null ^ this.getEncodedMessage() == null)
            return false;
        if (other.getEncodedMessage() != null
                && other.getEncodedMessage().equals(this.getEncodedMessage()) == false)
            return false;
        return true;
    }
}
