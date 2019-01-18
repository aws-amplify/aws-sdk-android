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

/**
 * <p>
 * A container for the UI customization information for a user pool's built-in
 * app UI.
 * </p>
 */
public class UICustomizationType implements Serializable {
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
     * The logo image for the UI customization.
     * </p>
     */
    private String imageUrl;

    /**
     * <p>
     * The CSS values in the UI customization.
     * </p>
     */
    private String cSS;

    /**
     * <p>
     * The CSS version number.
     * </p>
     */
    private String cSSVersion;

    /**
     * <p>
     * The last-modified date for the UI customization.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * The creation date for the UI customization.
     * </p>
     */
    private java.util.Date creationDate;

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
    public UICustomizationType withUserPoolId(String userPoolId) {
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
    public UICustomizationType withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * <p>
     * The logo image for the UI customization.
     * </p>
     *
     * @return <p>
     *         The logo image for the UI customization.
     *         </p>
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * <p>
     * The logo image for the UI customization.
     * </p>
     *
     * @param imageUrl <p>
     *            The logo image for the UI customization.
     *            </p>
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * <p>
     * The logo image for the UI customization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageUrl <p>
     *            The logo image for the UI customization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UICustomizationType withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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
    public UICustomizationType withCSS(String cSS) {
        this.cSS = cSS;
        return this;
    }

    /**
     * <p>
     * The CSS version number.
     * </p>
     *
     * @return <p>
     *         The CSS version number.
     *         </p>
     */
    public String getCSSVersion() {
        return cSSVersion;
    }

    /**
     * <p>
     * The CSS version number.
     * </p>
     *
     * @param cSSVersion <p>
     *            The CSS version number.
     *            </p>
     */
    public void setCSSVersion(String cSSVersion) {
        this.cSSVersion = cSSVersion;
    }

    /**
     * <p>
     * The CSS version number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cSSVersion <p>
     *            The CSS version number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UICustomizationType withCSSVersion(String cSSVersion) {
        this.cSSVersion = cSSVersion;
        return this;
    }

    /**
     * <p>
     * The last-modified date for the UI customization.
     * </p>
     *
     * @return <p>
     *         The last-modified date for the UI customization.
     *         </p>
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * The last-modified date for the UI customization.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            The last-modified date for the UI customization.
     *            </p>
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The last-modified date for the UI customization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            The last-modified date for the UI customization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UICustomizationType withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * <p>
     * The creation date for the UI customization.
     * </p>
     *
     * @return <p>
     *         The creation date for the UI customization.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The creation date for the UI customization.
     * </p>
     *
     * @param creationDate <p>
     *            The creation date for the UI customization.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The creation date for the UI customization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The creation date for the UI customization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UICustomizationType withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
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
        if (getImageUrl() != null)
            sb.append("ImageUrl: " + getImageUrl() + ",");
        if (getCSS() != null)
            sb.append("CSS: " + getCSS() + ",");
        if (getCSSVersion() != null)
            sb.append("CSSVersion: " + getCSSVersion() + ",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: " + getLastModifiedDate() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getImageUrl() == null) ? 0 : getImageUrl().hashCode());
        hashCode = prime * hashCode + ((getCSS() == null) ? 0 : getCSS().hashCode());
        hashCode = prime * hashCode + ((getCSSVersion() == null) ? 0 : getCSSVersion().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UICustomizationType == false)
            return false;
        UICustomizationType other = (UICustomizationType) obj;

        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getImageUrl() == null ^ this.getImageUrl() == null)
            return false;
        if (other.getImageUrl() != null && other.getImageUrl().equals(this.getImageUrl()) == false)
            return false;
        if (other.getCSS() == null ^ this.getCSS() == null)
            return false;
        if (other.getCSS() != null && other.getCSS().equals(this.getCSS()) == false)
            return false;
        if (other.getCSSVersion() == null ^ this.getCSSVersion() == null)
            return false;
        if (other.getCSSVersion() != null
                && other.getCSSVersion().equals(this.getCSSVersion()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }
}
