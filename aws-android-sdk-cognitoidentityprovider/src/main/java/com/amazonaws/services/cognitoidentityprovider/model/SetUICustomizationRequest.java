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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sets the UI customization information for a user pool's built-in app UI.
 * </p>
 * <p>
 * You can specify app UI customization settings for a single client (with a
 * specific <code>clientId</code>) or for all clients (by setting the
 * <code>clientId</code> to <code>ALL</code>). If you specify <code>ALL</code>,
 * the default configuration will be used for every client that has no UI
 * customization set previously. If you specify UI customization settings for a
 * particular client, it will no longer fall back to the <code>ALL</code>
 * configuration.
 * </p>
 * <note>
 * <p>
 * To use this API, your user pool must have a domain associated with it.
 * Otherwise, there is no place to host the app's pages, and the service will
 * throw an error.
 * </p>
 * </note>
 */
public class SetUICustomizationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The user pool ID for the user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String userPoolId;

    /**
     * <p>
     * The client ID for the client app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     */
    private String clientId;

    /**
     * <p>
     * The CSS values in the UI customization.
     * </p>
     */
    private String cSS;

    /**
     * <p>
     * The uploaded logo image for the UI customization.
     * </p>
     */
    private java.nio.ByteBuffer imageFile;

    /**
     * <p>
     * The user pool ID for the user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The user pool ID for the user pool.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetUICustomizationRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * The client ID for the client app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @return <p>
     *         The client ID for the client app.
     *         </p>
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * <p>
     * The client ID for the client app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientId <p>
     *            The client ID for the client app.
     *            </p>
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The client ID for the client app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientId <p>
     *            The client ID for the client app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetUICustomizationRequest withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * <p>
     * The CSS values in the UI customization.
     * </p>
     *
     * @return <p>
     *         The CSS values in the UI customization.
     *         </p>
     */
    public String getCSS() {
        return cSS;
    }

    /**
     * <p>
     * The CSS values in the UI customization.
     * </p>
     *
     * @param cSS <p>
     *            The CSS values in the UI customization.
     *            </p>
     */
    public void setCSS(String cSS) {
        this.cSS = cSS;
    }

    /**
     * <p>
     * The CSS values in the UI customization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cSS <p>
     *            The CSS values in the UI customization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetUICustomizationRequest withCSS(String cSS) {
        this.cSS = cSS;
        return this;
    }

    /**
     * <p>
     * The uploaded logo image for the UI customization.
     * </p>
     *
     * @return <p>
     *         The uploaded logo image for the UI customization.
     *         </p>
     */
    public java.nio.ByteBuffer getImageFile() {
        return imageFile;
    }

    /**
     * <p>
     * The uploaded logo image for the UI customization.
     * </p>
     *
     * @param imageFile <p>
     *            The uploaded logo image for the UI customization.
     *            </p>
     */
    public void setImageFile(java.nio.ByteBuffer imageFile) {
        this.imageFile = imageFile;
    }

    /**
     * <p>
     * The uploaded logo image for the UI customization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageFile <p>
     *            The uploaded logo image for the UI customization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetUICustomizationRequest withImageFile(java.nio.ByteBuffer imageFile) {
        this.imageFile = imageFile;
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getClientId() != null)
            sb.append("ClientId: " + getClientId() + ",");
        if (getCSS() != null)
            sb.append("CSS: " + getCSS() + ",");
        if (getImageFile() != null)
            sb.append("ImageFile: " + getImageFile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getCSS() == null) ? 0 : getCSS().hashCode());
        hashCode = prime * hashCode + ((getImageFile() == null) ? 0 : getImageFile().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetUICustomizationRequest == false)
            return false;
        SetUICustomizationRequest other = (SetUICustomizationRequest) obj;

        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getCSS() == null ^ this.getCSS() == null)
            return false;
        if (other.getCSS() != null && other.getCSS().equals(this.getCSS()) == false)
            return false;
        if (other.getImageFile() == null ^ this.getImageFile() == null)
            return false;
        if (other.getImageFile() != null
                && other.getImageFile().equals(this.getImageFile()) == false)
            return false;
        return true;
    }
}
