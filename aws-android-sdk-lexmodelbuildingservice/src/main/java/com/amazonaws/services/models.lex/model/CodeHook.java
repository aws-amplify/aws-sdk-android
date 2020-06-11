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
 * Specifies a Lambda function that verifies requests to a bot or fulfills the
 * user's request to a bot..
 * </p>
 */
public class CodeHook implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws:lambda:[a-z]+-[a-z]+-[0-9]:[0-9]{12}:function:[a-zA
     * -Z0-9-_]+(/
     * [0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12})?(
     * :[a-zA-Z0-9-_]+)?<br/>
     */
    private String uri;

    /**
     * <p>
     * The version of the request-response that you want Amazon Lex to use to
     * invoke your Lambda function. For more information, see
     * <a>using-lambda</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5<br/>
     */
    private String messageVersion;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws:lambda:[a-z]+-[a-z]+-[0-9]:[0-9]{12}:function:[a-zA
     * -Z0-9-_]+(/
     * [0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12})?(
     * :[a-zA-Z0-9-_]+)?<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Lambda function.
     *         </p>
     */
    public String getUri() {
        return uri;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws:lambda:[a-z]+-[a-z]+-[0-9]:[0-9]{12}:function:[a-zA
     * -Z0-9-_]+(/
     * [0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12})?(
     * :[a-zA-Z0-9-_]+)?<br/>
     *
     * @param uri <p>
     *            The Amazon Resource Name (ARN) of the Lambda function.
     *            </p>
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws:lambda:[a-z]+-[a-z]+-[0-9]:[0-9]{12}:function:[a-zA
     * -Z0-9-_]+(/
     * [0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12})?(
     * :[a-zA-Z0-9-_]+)?<br/>
     *
     * @param uri <p>
     *            The Amazon Resource Name (ARN) of the Lambda function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CodeHook withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * <p>
     * The version of the request-response that you want Amazon Lex to use to
     * invoke your Lambda function. For more information, see
     * <a>using-lambda</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5<br/>
     *
     * @return <p>
     *         The version of the request-response that you want Amazon Lex to
     *         use to invoke your Lambda function. For more information, see
     *         <a>using-lambda</a>.
     *         </p>
     */
    public String getMessageVersion() {
        return messageVersion;
    }

    /**
     * <p>
     * The version of the request-response that you want Amazon Lex to use to
     * invoke your Lambda function. For more information, see
     * <a>using-lambda</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5<br/>
     *
     * @param messageVersion <p>
     *            The version of the request-response that you want Amazon Lex
     *            to use to invoke your Lambda function. For more information,
     *            see <a>using-lambda</a>.
     *            </p>
     */
    public void setMessageVersion(String messageVersion) {
        this.messageVersion = messageVersion;
    }

    /**
     * <p>
     * The version of the request-response that you want Amazon Lex to use to
     * invoke your Lambda function. For more information, see
     * <a>using-lambda</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5<br/>
     *
     * @param messageVersion <p>
     *            The version of the request-response that you want Amazon Lex
     *            to use to invoke your Lambda function. For more information,
     *            see <a>using-lambda</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CodeHook withMessageVersion(String messageVersion) {
        this.messageVersion = messageVersion;
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
        if (getUri() != null)
            sb.append("uri: " + getUri() + ",");
        if (getMessageVersion() != null)
            sb.append("messageVersion: " + getMessageVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        hashCode = prime * hashCode
                + ((getMessageVersion() == null) ? 0 : getMessageVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeHook == false)
            return false;
        CodeHook other = (CodeHook) obj;

        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false)
            return false;
        if (other.getMessageVersion() == null ^ this.getMessageVersion() == null)
            return false;
        if (other.getMessageVersion() != null
                && other.getMessageVersion().equals(this.getMessageVersion()) == false)
            return false;
        return true;
    }
}
