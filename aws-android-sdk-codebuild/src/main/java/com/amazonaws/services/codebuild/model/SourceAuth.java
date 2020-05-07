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

package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the authorization settings for AWS CodeBuild to access the
 * source code to be built.
 * </p>
 * <p>
 * This information is for the AWS CodeBuild console's use only. Your code
 * should not get or set this information directly.
 * </p>
 */
public class SourceAuth implements Serializable {
    /**
     * <note>
     * <p>
     * This data type is deprecated and is no longer accurate or used.
     * </p>
     * </note>
     * <p>
     * The authorization type to use. The only valid value is <code>OAUTH</code>
     * , which represents the OAuth authorization type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OAUTH
     */
    private String type;

    /**
     * <p>
     * The resource value that applies to the specified authorization type.
     * </p>
     */
    private String resource;

    /**
     * <note>
     * <p>
     * This data type is deprecated and is no longer accurate or used.
     * </p>
     * </note>
     * <p>
     * The authorization type to use. The only valid value is <code>OAUTH</code>
     * , which represents the OAuth authorization type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OAUTH
     *
     * @return <note>
     *         <p>
     *         This data type is deprecated and is no longer accurate or used.
     *         </p>
     *         </note>
     *         <p>
     *         The authorization type to use. The only valid value is
     *         <code>OAUTH</code>, which represents the OAuth authorization
     *         type.
     *         </p>
     * @see SourceAuthType
     */
    public String getType() {
        return type;
    }

    /**
     * <note>
     * <p>
     * This data type is deprecated and is no longer accurate or used.
     * </p>
     * </note>
     * <p>
     * The authorization type to use. The only valid value is <code>OAUTH</code>
     * , which represents the OAuth authorization type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OAUTH
     *
     * @param type <note>
     *            <p>
     *            This data type is deprecated and is no longer accurate or
     *            used.
     *            </p>
     *            </note>
     *            <p>
     *            The authorization type to use. The only valid value is
     *            <code>OAUTH</code>, which represents the OAuth authorization
     *            type.
     *            </p>
     * @see SourceAuthType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <note>
     * <p>
     * This data type is deprecated and is no longer accurate or used.
     * </p>
     * </note>
     * <p>
     * The authorization type to use. The only valid value is <code>OAUTH</code>
     * , which represents the OAuth authorization type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OAUTH
     *
     * @param type <note>
     *            <p>
     *            This data type is deprecated and is no longer accurate or
     *            used.
     *            </p>
     *            </note>
     *            <p>
     *            The authorization type to use. The only valid value is
     *            <code>OAUTH</code>, which represents the OAuth authorization
     *            type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SourceAuthType
     */
    public SourceAuth withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <note>
     * <p>
     * This data type is deprecated and is no longer accurate or used.
     * </p>
     * </note>
     * <p>
     * The authorization type to use. The only valid value is <code>OAUTH</code>
     * , which represents the OAuth authorization type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OAUTH
     *
     * @param type <note>
     *            <p>
     *            This data type is deprecated and is no longer accurate or
     *            used.
     *            </p>
     *            </note>
     *            <p>
     *            The authorization type to use. The only valid value is
     *            <code>OAUTH</code>, which represents the OAuth authorization
     *            type.
     *            </p>
     * @see SourceAuthType
     */
    public void setType(SourceAuthType type) {
        this.type = type.toString();
    }

    /**
     * <note>
     * <p>
     * This data type is deprecated and is no longer accurate or used.
     * </p>
     * </note>
     * <p>
     * The authorization type to use. The only valid value is <code>OAUTH</code>
     * , which represents the OAuth authorization type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OAUTH
     *
     * @param type <note>
     *            <p>
     *            This data type is deprecated and is no longer accurate or
     *            used.
     *            </p>
     *            </note>
     *            <p>
     *            The authorization type to use. The only valid value is
     *            <code>OAUTH</code>, which represents the OAuth authorization
     *            type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SourceAuthType
     */
    public SourceAuth withType(SourceAuthType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The resource value that applies to the specified authorization type.
     * </p>
     *
     * @return <p>
     *         The resource value that applies to the specified authorization
     *         type.
     *         </p>
     */
    public String getResource() {
        return resource;
    }

    /**
     * <p>
     * The resource value that applies to the specified authorization type.
     * </p>
     *
     * @param resource <p>
     *            The resource value that applies to the specified authorization
     *            type.
     *            </p>
     */
    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The resource value that applies to the specified authorization type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resource <p>
     *            The resource value that applies to the specified authorization
     *            type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SourceAuth withResource(String resource) {
        this.resource = resource;
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
            sb.append("type: " + getType() + ",");
        if (getResource() != null)
            sb.append("resource: " + getResource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceAuth == false)
            return false;
        SourceAuth other = (SourceAuth) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        return true;
    }
}
