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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Container for user interface template information.
 * </p>
 */
public class UiTemplateInfo implements Serializable {
    /**
     * <p>
     * The URL for the user interface template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String url;

    /**
     * <p>
     * The SHA-256 digest of the contents of the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128000<br/>
     */
    private String contentSha256;

    /**
     * <p>
     * The URL for the user interface template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The URL for the user interface template.
     *         </p>
     */
    public String getUrl() {
        return url;
    }

    /**
     * <p>
     * The URL for the user interface template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param url <p>
     *            The URL for the user interface template.
     *            </p>
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL for the user interface template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param url <p>
     *            The URL for the user interface template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UiTemplateInfo withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * <p>
     * The SHA-256 digest of the contents of the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128000<br/>
     *
     * @return <p>
     *         The SHA-256 digest of the contents of the template.
     *         </p>
     */
    public String getContentSha256() {
        return contentSha256;
    }

    /**
     * <p>
     * The SHA-256 digest of the contents of the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128000<br/>
     *
     * @param contentSha256 <p>
     *            The SHA-256 digest of the contents of the template.
     *            </p>
     */
    public void setContentSha256(String contentSha256) {
        this.contentSha256 = contentSha256;
    }

    /**
     * <p>
     * The SHA-256 digest of the contents of the template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128000<br/>
     *
     * @param contentSha256 <p>
     *            The SHA-256 digest of the contents of the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UiTemplateInfo withContentSha256(String contentSha256) {
        this.contentSha256 = contentSha256;
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
        if (getContentSha256() != null)
            sb.append("ContentSha256: " + getContentSha256());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode
                + ((getContentSha256() == null) ? 0 : getContentSha256().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UiTemplateInfo == false)
            return false;
        UiTemplateInfo other = (UiTemplateInfo) obj;

        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getContentSha256() == null ^ this.getContentSha256() == null)
            return false;
        if (other.getContentSha256() != null
                && other.getContentSha256().equals(this.getContentSha256()) == false)
            return false;
        return true;
    }
}
