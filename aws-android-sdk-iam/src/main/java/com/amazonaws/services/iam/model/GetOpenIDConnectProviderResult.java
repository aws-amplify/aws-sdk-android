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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a successful <a>GetOpenIDConnectProvider</a>
 * request.
 * </p>
 */
public class GetOpenIDConnectProviderResult implements Serializable {
    /**
     * <p>
     * The URL that the IAM OIDC provider resource object is associated with.
     * For more information, see <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String url;

    /**
     * <p>
     * A list of client IDs (also known as audiences) that are associated with
     * the specified IAM OIDC provider resource object. For more information,
     * see <a>CreateOpenIDConnectProvider</a>.
     * </p>
     */
    private java.util.List<String> clientIDList;

    /**
     * <p>
     * A list of certificate thumbprints that are associated with the specified
     * IAM OIDC provider resource object. For more information, see
     * <a>CreateOpenIDConnectProvider</a>.
     * </p>
     */
    private java.util.List<String> thumbprintList;

    /**
     * <p>
     * The date and time when the IAM OIDC provider resource object was created
     * in the AWS account.
     * </p>
     */
    private java.util.Date createDate;

    /**
     * <p>
     * The URL that the IAM OIDC provider resource object is associated with.
     * For more information, see <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The URL that the IAM OIDC provider resource object is associated
     *         with. For more information, see
     *         <a>CreateOpenIDConnectProvider</a>.
     *         </p>
     */
    public String getUrl() {
        return url;
    }

    /**
     * <p>
     * The URL that the IAM OIDC provider resource object is associated with.
     * For more information, see <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param url <p>
     *            The URL that the IAM OIDC provider resource object is
     *            associated with. For more information, see
     *            <a>CreateOpenIDConnectProvider</a>.
     *            </p>
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL that the IAM OIDC provider resource object is associated with.
     * For more information, see <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param url <p>
     *            The URL that the IAM OIDC provider resource object is
     *            associated with. For more information, see
     *            <a>CreateOpenIDConnectProvider</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOpenIDConnectProviderResult withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * <p>
     * A list of client IDs (also known as audiences) that are associated with
     * the specified IAM OIDC provider resource object. For more information,
     * see <a>CreateOpenIDConnectProvider</a>.
     * </p>
     *
     * @return <p>
     *         A list of client IDs (also known as audiences) that are
     *         associated with the specified IAM OIDC provider resource object.
     *         For more information, see <a>CreateOpenIDConnectProvider</a>.
     *         </p>
     */
    public java.util.List<String> getClientIDList() {
        return clientIDList;
    }

    /**
     * <p>
     * A list of client IDs (also known as audiences) that are associated with
     * the specified IAM OIDC provider resource object. For more information,
     * see <a>CreateOpenIDConnectProvider</a>.
     * </p>
     *
     * @param clientIDList <p>
     *            A list of client IDs (also known as audiences) that are
     *            associated with the specified IAM OIDC provider resource
     *            object. For more information, see
     *            <a>CreateOpenIDConnectProvider</a>.
     *            </p>
     */
    public void setClientIDList(java.util.Collection<String> clientIDList) {
        if (clientIDList == null) {
            this.clientIDList = null;
            return;
        }

        this.clientIDList = new java.util.ArrayList<String>(clientIDList);
    }

    /**
     * <p>
     * A list of client IDs (also known as audiences) that are associated with
     * the specified IAM OIDC provider resource object. For more information,
     * see <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientIDList <p>
     *            A list of client IDs (also known as audiences) that are
     *            associated with the specified IAM OIDC provider resource
     *            object. For more information, see
     *            <a>CreateOpenIDConnectProvider</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOpenIDConnectProviderResult withClientIDList(String... clientIDList) {
        if (getClientIDList() == null) {
            this.clientIDList = new java.util.ArrayList<String>(clientIDList.length);
        }
        for (String value : clientIDList) {
            this.clientIDList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of client IDs (also known as audiences) that are associated with
     * the specified IAM OIDC provider resource object. For more information,
     * see <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientIDList <p>
     *            A list of client IDs (also known as audiences) that are
     *            associated with the specified IAM OIDC provider resource
     *            object. For more information, see
     *            <a>CreateOpenIDConnectProvider</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOpenIDConnectProviderResult withClientIDList(java.util.Collection<String> clientIDList) {
        setClientIDList(clientIDList);
        return this;
    }

    /**
     * <p>
     * A list of certificate thumbprints that are associated with the specified
     * IAM OIDC provider resource object. For more information, see
     * <a>CreateOpenIDConnectProvider</a>.
     * </p>
     *
     * @return <p>
     *         A list of certificate thumbprints that are associated with the
     *         specified IAM OIDC provider resource object. For more
     *         information, see <a>CreateOpenIDConnectProvider</a>.
     *         </p>
     */
    public java.util.List<String> getThumbprintList() {
        return thumbprintList;
    }

    /**
     * <p>
     * A list of certificate thumbprints that are associated with the specified
     * IAM OIDC provider resource object. For more information, see
     * <a>CreateOpenIDConnectProvider</a>.
     * </p>
     *
     * @param thumbprintList <p>
     *            A list of certificate thumbprints that are associated with the
     *            specified IAM OIDC provider resource object. For more
     *            information, see <a>CreateOpenIDConnectProvider</a>.
     *            </p>
     */
    public void setThumbprintList(java.util.Collection<String> thumbprintList) {
        if (thumbprintList == null) {
            this.thumbprintList = null;
            return;
        }

        this.thumbprintList = new java.util.ArrayList<String>(thumbprintList);
    }

    /**
     * <p>
     * A list of certificate thumbprints that are associated with the specified
     * IAM OIDC provider resource object. For more information, see
     * <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thumbprintList <p>
     *            A list of certificate thumbprints that are associated with the
     *            specified IAM OIDC provider resource object. For more
     *            information, see <a>CreateOpenIDConnectProvider</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOpenIDConnectProviderResult withThumbprintList(String... thumbprintList) {
        if (getThumbprintList() == null) {
            this.thumbprintList = new java.util.ArrayList<String>(thumbprintList.length);
        }
        for (String value : thumbprintList) {
            this.thumbprintList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of certificate thumbprints that are associated with the specified
     * IAM OIDC provider resource object. For more information, see
     * <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param thumbprintList <p>
     *            A list of certificate thumbprints that are associated with the
     *            specified IAM OIDC provider resource object. For more
     *            information, see <a>CreateOpenIDConnectProvider</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOpenIDConnectProviderResult withThumbprintList(
            java.util.Collection<String> thumbprintList) {
        setThumbprintList(thumbprintList);
        return this;
    }

    /**
     * <p>
     * The date and time when the IAM OIDC provider resource object was created
     * in the AWS account.
     * </p>
     *
     * @return <p>
     *         The date and time when the IAM OIDC provider resource object was
     *         created in the AWS account.
     *         </p>
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }

    /**
     * <p>
     * The date and time when the IAM OIDC provider resource object was created
     * in the AWS account.
     * </p>
     *
     * @param createDate <p>
     *            The date and time when the IAM OIDC provider resource object
     *            was created in the AWS account.
     *            </p>
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time when the IAM OIDC provider resource object was created
     * in the AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createDate <p>
     *            The date and time when the IAM OIDC provider resource object
     *            was created in the AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOpenIDConnectProviderResult withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
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
        if (getUrl() != null)
            sb.append("Url: " + getUrl() + ",");
        if (getClientIDList() != null)
            sb.append("ClientIDList: " + getClientIDList() + ",");
        if (getThumbprintList() != null)
            sb.append("ThumbprintList: " + getThumbprintList() + ",");
        if (getCreateDate() != null)
            sb.append("CreateDate: " + getCreateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode
                + ((getClientIDList() == null) ? 0 : getClientIDList().hashCode());
        hashCode = prime * hashCode
                + ((getThumbprintList() == null) ? 0 : getThumbprintList().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOpenIDConnectProviderResult == false)
            return false;
        GetOpenIDConnectProviderResult other = (GetOpenIDConnectProviderResult) obj;

        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getClientIDList() == null ^ this.getClientIDList() == null)
            return false;
        if (other.getClientIDList() != null
                && other.getClientIDList().equals(this.getClientIDList()) == false)
            return false;
        if (other.getThumbprintList() == null ^ this.getThumbprintList() == null)
            return false;
        if (other.getThumbprintList() != null
                && other.getThumbprintList().equals(this.getThumbprintList()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null
                && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        return true;
    }
}
