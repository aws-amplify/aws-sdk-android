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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an authorizer.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >CreateAuthorizer</a> action.
 * </p>
 */
public class CreateAuthorizerRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The authorizer name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     */
    private String authorizerName;

    /**
     * <p>
     * The ARN of the authorizer's Lambda function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     */
    private String authorizerFunctionArn;

    /**
     * <p>
     * The name of the token key used to extract the token from the HTTP
     * headers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String tokenKeyName;

    /**
     * <p>
     * The public keys used to verify the digital signature returned by your
     * custom authentication service.
     * </p>
     */
    private java.util.Map<String, String> tokenSigningPublicKeys;

    /**
     * <p>
     * The status of the create authorizer request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     */
    private String status;

    /**
     * <p>
     * Metadata which can be used to manage the custom authorizer.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags":
     * "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Specifies whether IoT validates the token signature in an authorization
     * request.
     * </p>
     */
    private Boolean signingDisabled;

    /**
     * <p>
     * The authorizer name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     *
     * @return <p>
     *         The authorizer name.
     *         </p>
     */
    public String getAuthorizerName() {
        return authorizerName;
    }

    /**
     * <p>
     * The authorizer name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     *
     * @param authorizerName <p>
     *            The authorizer name.
     *            </p>
     */
    public void setAuthorizerName(String authorizerName) {
        this.authorizerName = authorizerName;
    }

    /**
     * <p>
     * The authorizer name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     *
     * @param authorizerName <p>
     *            The authorizer name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAuthorizerRequest withAuthorizerName(String authorizerName) {
        this.authorizerName = authorizerName;
        return this;
    }

    /**
     * <p>
     * The ARN of the authorizer's Lambda function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @return <p>
     *         The ARN of the authorizer's Lambda function.
     *         </p>
     */
    public String getAuthorizerFunctionArn() {
        return authorizerFunctionArn;
    }

    /**
     * <p>
     * The ARN of the authorizer's Lambda function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @param authorizerFunctionArn <p>
     *            The ARN of the authorizer's Lambda function.
     *            </p>
     */
    public void setAuthorizerFunctionArn(String authorizerFunctionArn) {
        this.authorizerFunctionArn = authorizerFunctionArn;
    }

    /**
     * <p>
     * The ARN of the authorizer's Lambda function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @param authorizerFunctionArn <p>
     *            The ARN of the authorizer's Lambda function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAuthorizerRequest withAuthorizerFunctionArn(String authorizerFunctionArn) {
        this.authorizerFunctionArn = authorizerFunctionArn;
        return this;
    }

    /**
     * <p>
     * The name of the token key used to extract the token from the HTTP
     * headers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The name of the token key used to extract the token from the HTTP
     *         headers.
     *         </p>
     */
    public String getTokenKeyName() {
        return tokenKeyName;
    }

    /**
     * <p>
     * The name of the token key used to extract the token from the HTTP
     * headers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param tokenKeyName <p>
     *            The name of the token key used to extract the token from the
     *            HTTP headers.
     *            </p>
     */
    public void setTokenKeyName(String tokenKeyName) {
        this.tokenKeyName = tokenKeyName;
    }

    /**
     * <p>
     * The name of the token key used to extract the token from the HTTP
     * headers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param tokenKeyName <p>
     *            The name of the token key used to extract the token from the
     *            HTTP headers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAuthorizerRequest withTokenKeyName(String tokenKeyName) {
        this.tokenKeyName = tokenKeyName;
        return this;
    }

    /**
     * <p>
     * The public keys used to verify the digital signature returned by your
     * custom authentication service.
     * </p>
     *
     * @return <p>
     *         The public keys used to verify the digital signature returned by
     *         your custom authentication service.
     *         </p>
     */
    public java.util.Map<String, String> getTokenSigningPublicKeys() {
        return tokenSigningPublicKeys;
    }

    /**
     * <p>
     * The public keys used to verify the digital signature returned by your
     * custom authentication service.
     * </p>
     *
     * @param tokenSigningPublicKeys <p>
     *            The public keys used to verify the digital signature returned
     *            by your custom authentication service.
     *            </p>
     */
    public void setTokenSigningPublicKeys(java.util.Map<String, String> tokenSigningPublicKeys) {
        this.tokenSigningPublicKeys = tokenSigningPublicKeys;
    }

    /**
     * <p>
     * The public keys used to verify the digital signature returned by your
     * custom authentication service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tokenSigningPublicKeys <p>
     *            The public keys used to verify the digital signature returned
     *            by your custom authentication service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAuthorizerRequest withTokenSigningPublicKeys(
            java.util.Map<String, String> tokenSigningPublicKeys) {
        this.tokenSigningPublicKeys = tokenSigningPublicKeys;
        return this;
    }

    /**
     * <p>
     * The public keys used to verify the digital signature returned by your
     * custom authentication service.
     * </p>
     * <p>
     * The method adds a new key-value pair into tokenSigningPublicKeys
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into tokenSigningPublicKeys.
     * @param value The corresponding value of the entry to be added into
     *            tokenSigningPublicKeys.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAuthorizerRequest addtokenSigningPublicKeysEntry(String key, String value) {
        if (null == this.tokenSigningPublicKeys) {
            this.tokenSigningPublicKeys = new java.util.HashMap<String, String>();
        }
        if (this.tokenSigningPublicKeys.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tokenSigningPublicKeys.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into tokenSigningPublicKeys.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateAuthorizerRequest cleartokenSigningPublicKeysEntries() {
        this.tokenSigningPublicKeys = null;
        return this;
    }

    /**
     * <p>
     * The status of the create authorizer request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @return <p>
     *         The status of the create authorizer request.
     *         </p>
     * @see AuthorizerStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the create authorizer request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of the create authorizer request.
     *            </p>
     * @see AuthorizerStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the create authorizer request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of the create authorizer request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthorizerStatus
     */
    public CreateAuthorizerRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the create authorizer request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of the create authorizer request.
     *            </p>
     * @see AuthorizerStatus
     */
    public void setStatus(AuthorizerStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the create authorizer request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The status of the create authorizer request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthorizerStatus
     */
    public CreateAuthorizerRequest withStatus(AuthorizerStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the custom authorizer.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags":
     * "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     *
     * @return <p>
     *         Metadata which can be used to manage the custom authorizer.
     *         </p>
     *         <note>
     *         <p>
     *         For URI Request parameters use format:
     *         ...key1=value1&amp;key2=value2...
     *         </p>
     *         <p>
     *         For the CLI command-line parameter use format: &amp;&amp;tags
     *         "key1=value1&amp;key2=value2..."
     *         </p>
     *         <p>
     *         For the cli-input-json file use format: "tags":
     *         "key1=value1&amp;key2=value2..."
     *         </p>
     *         </note>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata which can be used to manage the custom authorizer.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags":
     * "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     *
     * @param tags <p>
     *            Metadata which can be used to manage the custom authorizer.
     *            </p>
     *            <note>
     *            <p>
     *            For URI Request parameters use format:
     *            ...key1=value1&amp;key2=value2...
     *            </p>
     *            <p>
     *            For the CLI command-line parameter use format: &amp;&amp;tags
     *            "key1=value1&amp;key2=value2..."
     *            </p>
     *            <p>
     *            For the cli-input-json file use format: "tags":
     *            "key1=value1&amp;key2=value2..."
     *            </p>
     *            </note>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Metadata which can be used to manage the custom authorizer.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags":
     * "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata which can be used to manage the custom authorizer.
     *            </p>
     *            <note>
     *            <p>
     *            For URI Request parameters use format:
     *            ...key1=value1&amp;key2=value2...
     *            </p>
     *            <p>
     *            For the CLI command-line parameter use format: &amp;&amp;tags
     *            "key1=value1&amp;key2=value2..."
     *            </p>
     *            <p>
     *            For the cli-input-json file use format: "tags":
     *            "key1=value1&amp;key2=value2..."
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAuthorizerRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the custom authorizer.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags":
     * "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata which can be used to manage the custom authorizer.
     *            </p>
     *            <note>
     *            <p>
     *            For URI Request parameters use format:
     *            ...key1=value1&amp;key2=value2...
     *            </p>
     *            <p>
     *            For the CLI command-line parameter use format: &amp;&amp;tags
     *            "key1=value1&amp;key2=value2..."
     *            </p>
     *            <p>
     *            For the cli-input-json file use format: "tags":
     *            "key1=value1&amp;key2=value2..."
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAuthorizerRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Specifies whether IoT validates the token signature in an authorization
     * request.
     * </p>
     *
     * @return <p>
     *         Specifies whether IoT validates the token signature in an
     *         authorization request.
     *         </p>
     */
    public Boolean isSigningDisabled() {
        return signingDisabled;
    }

    /**
     * <p>
     * Specifies whether IoT validates the token signature in an authorization
     * request.
     * </p>
     *
     * @return <p>
     *         Specifies whether IoT validates the token signature in an
     *         authorization request.
     *         </p>
     */
    public Boolean getSigningDisabled() {
        return signingDisabled;
    }

    /**
     * <p>
     * Specifies whether IoT validates the token signature in an authorization
     * request.
     * </p>
     *
     * @param signingDisabled <p>
     *            Specifies whether IoT validates the token signature in an
     *            authorization request.
     *            </p>
     */
    public void setSigningDisabled(Boolean signingDisabled) {
        this.signingDisabled = signingDisabled;
    }

    /**
     * <p>
     * Specifies whether IoT validates the token signature in an authorization
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param signingDisabled <p>
     *            Specifies whether IoT validates the token signature in an
     *            authorization request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAuthorizerRequest withSigningDisabled(Boolean signingDisabled) {
        this.signingDisabled = signingDisabled;
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
        if (getAuthorizerName() != null)
            sb.append("authorizerName: " + getAuthorizerName() + ",");
        if (getAuthorizerFunctionArn() != null)
            sb.append("authorizerFunctionArn: " + getAuthorizerFunctionArn() + ",");
        if (getTokenKeyName() != null)
            sb.append("tokenKeyName: " + getTokenKeyName() + ",");
        if (getTokenSigningPublicKeys() != null)
            sb.append("tokenSigningPublicKeys: " + getTokenSigningPublicKeys() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getSigningDisabled() != null)
            sb.append("signingDisabled: " + getSigningDisabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAuthorizerName() == null) ? 0 : getAuthorizerName().hashCode());
        hashCode = prime
                * hashCode
                + ((getAuthorizerFunctionArn() == null) ? 0 : getAuthorizerFunctionArn().hashCode());
        hashCode = prime * hashCode
                + ((getTokenKeyName() == null) ? 0 : getTokenKeyName().hashCode());
        hashCode = prime
                * hashCode
                + ((getTokenSigningPublicKeys() == null) ? 0 : getTokenSigningPublicKeys()
                        .hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getSigningDisabled() == null) ? 0 : getSigningDisabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAuthorizerRequest == false)
            return false;
        CreateAuthorizerRequest other = (CreateAuthorizerRequest) obj;

        if (other.getAuthorizerName() == null ^ this.getAuthorizerName() == null)
            return false;
        if (other.getAuthorizerName() != null
                && other.getAuthorizerName().equals(this.getAuthorizerName()) == false)
            return false;
        if (other.getAuthorizerFunctionArn() == null ^ this.getAuthorizerFunctionArn() == null)
            return false;
        if (other.getAuthorizerFunctionArn() != null
                && other.getAuthorizerFunctionArn().equals(this.getAuthorizerFunctionArn()) == false)
            return false;
        if (other.getTokenKeyName() == null ^ this.getTokenKeyName() == null)
            return false;
        if (other.getTokenKeyName() != null
                && other.getTokenKeyName().equals(this.getTokenKeyName()) == false)
            return false;
        if (other.getTokenSigningPublicKeys() == null ^ this.getTokenSigningPublicKeys() == null)
            return false;
        if (other.getTokenSigningPublicKeys() != null
                && other.getTokenSigningPublicKeys().equals(this.getTokenSigningPublicKeys()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getSigningDisabled() == null ^ this.getSigningDisabled() == null)
            return false;
        if (other.getSigningDisabled() != null
                && other.getSigningDisabled().equals(this.getSigningDisabled()) == false)
            return false;
        return true;
    }
}
