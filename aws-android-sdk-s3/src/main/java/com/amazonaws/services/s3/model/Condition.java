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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * A container for describing a condition that must be met for the specified
 * redirect to apply. For example, 1. If request is for pages in the
 * <code>/docs</code> folder, redirect to the <code>/documents</code> folder. 2.
 * If request results in HTTP error 4xx, redirect request to another host where
 * you might process the error.
 * </p>
 */
public class Condition implements Serializable {
    /**
     * <p>
     * The HTTP error code when the redirect is applied. In the event of an
     * error, if the error code equals this value, then the specified redirect
     * is applied. Required when parent element <code>Condition</code> is
     * specified and sibling <code>KeyPrefixEquals</code> is not specified. If
     * both are specified, then both must be true for the redirect to be
     * applied.
     * </p>
     */
    private String httpErrorCodeReturnedEquals;

    /**
     * <p>
     * The object key name prefix when the redirect is applied. For example, to
     * redirect requests for <code>ExamplePage.html</code>, the key prefix will
     * be <code>ExamplePage.html</code>. To redirect request for all pages with
     * the prefix <code>docs/</code>, the key prefix will be <code>/docs</code>,
     * which identifies all objects in the <code>docs/</code> folder. Required
     * when the parent element <code>Condition</code> is specified and sibling
     * <code>HttpErrorCodeReturnedEquals</code> is not specified. If both
     * conditions are specified, both must be true for the redirect to be
     * applied.
     * </p>
     */
    private String keyPrefixEquals;

    /**
     * <p>
     * The HTTP error code when the redirect is applied. In the event of an
     * error, if the error code equals this value, then the specified redirect
     * is applied. Required when parent element <code>Condition</code> is
     * specified and sibling <code>KeyPrefixEquals</code> is not specified. If
     * both are specified, then both must be true for the redirect to be
     * applied.
     * </p>
     *
     * @return <p>
     *         The HTTP error code when the redirect is applied. In the event of
     *         an error, if the error code equals this value, then the specified
     *         redirect is applied. Required when parent element
     *         <code>Condition</code> is specified and sibling
     *         <code>KeyPrefixEquals</code> is not specified. If both are
     *         specified, then both must be true for the redirect to be applied.
     *         </p>
     */
    public String getHttpErrorCodeReturnedEquals() {
        return httpErrorCodeReturnedEquals;
    }

    /**
     * <p>
     * The HTTP error code when the redirect is applied. In the event of an
     * error, if the error code equals this value, then the specified redirect
     * is applied. Required when parent element <code>Condition</code> is
     * specified and sibling <code>KeyPrefixEquals</code> is not specified. If
     * both are specified, then both must be true for the redirect to be
     * applied.
     * </p>
     *
     * @param httpErrorCodeReturnedEquals <p>
     *            The HTTP error code when the redirect is applied. In the event
     *            of an error, if the error code equals this value, then the
     *            specified redirect is applied. Required when parent element
     *            <code>Condition</code> is specified and sibling
     *            <code>KeyPrefixEquals</code> is not specified. If both are
     *            specified, then both must be true for the redirect to be
     *            applied.
     *            </p>
     */
    public void setHttpErrorCodeReturnedEquals(String httpErrorCodeReturnedEquals) {
        this.httpErrorCodeReturnedEquals = httpErrorCodeReturnedEquals;
    }

    /**
     * <p>
     * The HTTP error code when the redirect is applied. In the event of an
     * error, if the error code equals this value, then the specified redirect
     * is applied. Required when parent element <code>Condition</code> is
     * specified and sibling <code>KeyPrefixEquals</code> is not specified. If
     * both are specified, then both must be true for the redirect to be
     * applied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param httpErrorCodeReturnedEquals <p>
     *            The HTTP error code when the redirect is applied. In the event
     *            of an error, if the error code equals this value, then the
     *            specified redirect is applied. Required when parent element
     *            <code>Condition</code> is specified and sibling
     *            <code>KeyPrefixEquals</code> is not specified. If both are
     *            specified, then both must be true for the redirect to be
     *            applied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Condition withHttpErrorCodeReturnedEquals(String httpErrorCodeReturnedEquals) {
        this.httpErrorCodeReturnedEquals = httpErrorCodeReturnedEquals;
        return this;
    }

    /**
     * <p>
     * The object key name prefix when the redirect is applied. For example, to
     * redirect requests for <code>ExamplePage.html</code>, the key prefix will
     * be <code>ExamplePage.html</code>. To redirect request for all pages with
     * the prefix <code>docs/</code>, the key prefix will be <code>/docs</code>,
     * which identifies all objects in the <code>docs/</code> folder. Required
     * when the parent element <code>Condition</code> is specified and sibling
     * <code>HttpErrorCodeReturnedEquals</code> is not specified. If both
     * conditions are specified, both must be true for the redirect to be
     * applied.
     * </p>
     *
     * @return <p>
     *         The object key name prefix when the redirect is applied. For
     *         example, to redirect requests for <code>ExamplePage.html</code>,
     *         the key prefix will be <code>ExamplePage.html</code>. To redirect
     *         request for all pages with the prefix <code>docs/</code>, the key
     *         prefix will be <code>/docs</code>, which identifies all objects
     *         in the <code>docs/</code> folder. Required when the parent
     *         element <code>Condition</code> is specified and sibling
     *         <code>HttpErrorCodeReturnedEquals</code> is not specified. If
     *         both conditions are specified, both must be true for the redirect
     *         to be applied.
     *         </p>
     */
    public String getKeyPrefixEquals() {
        return keyPrefixEquals;
    }

    /**
     * <p>
     * The object key name prefix when the redirect is applied. For example, to
     * redirect requests for <code>ExamplePage.html</code>, the key prefix will
     * be <code>ExamplePage.html</code>. To redirect request for all pages with
     * the prefix <code>docs/</code>, the key prefix will be <code>/docs</code>,
     * which identifies all objects in the <code>docs/</code> folder. Required
     * when the parent element <code>Condition</code> is specified and sibling
     * <code>HttpErrorCodeReturnedEquals</code> is not specified. If both
     * conditions are specified, both must be true for the redirect to be
     * applied.
     * </p>
     *
     * @param keyPrefixEquals <p>
     *            The object key name prefix when the redirect is applied. For
     *            example, to redirect requests for
     *            <code>ExamplePage.html</code>, the key prefix will be
     *            <code>ExamplePage.html</code>. To redirect request for all
     *            pages with the prefix <code>docs/</code>, the key prefix will
     *            be <code>/docs</code>, which identifies all objects in the
     *            <code>docs/</code> folder. Required when the parent element
     *            <code>Condition</code> is specified and sibling
     *            <code>HttpErrorCodeReturnedEquals</code> is not specified. If
     *            both conditions are specified, both must be true for the
     *            redirect to be applied.
     *            </p>
     */
    public void setKeyPrefixEquals(String keyPrefixEquals) {
        this.keyPrefixEquals = keyPrefixEquals;
    }

    /**
     * <p>
     * The object key name prefix when the redirect is applied. For example, to
     * redirect requests for <code>ExamplePage.html</code>, the key prefix will
     * be <code>ExamplePage.html</code>. To redirect request for all pages with
     * the prefix <code>docs/</code>, the key prefix will be <code>/docs</code>,
     * which identifies all objects in the <code>docs/</code> folder. Required
     * when the parent element <code>Condition</code> is specified and sibling
     * <code>HttpErrorCodeReturnedEquals</code> is not specified. If both
     * conditions are specified, both must be true for the redirect to be
     * applied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyPrefixEquals <p>
     *            The object key name prefix when the redirect is applied. For
     *            example, to redirect requests for
     *            <code>ExamplePage.html</code>, the key prefix will be
     *            <code>ExamplePage.html</code>. To redirect request for all
     *            pages with the prefix <code>docs/</code>, the key prefix will
     *            be <code>/docs</code>, which identifies all objects in the
     *            <code>docs/</code> folder. Required when the parent element
     *            <code>Condition</code> is specified and sibling
     *            <code>HttpErrorCodeReturnedEquals</code> is not specified. If
     *            both conditions are specified, both must be true for the
     *            redirect to be applied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Condition withKeyPrefixEquals(String keyPrefixEquals) {
        this.keyPrefixEquals = keyPrefixEquals;
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
        if (getHttpErrorCodeReturnedEquals() != null)
            sb.append("HttpErrorCodeReturnedEquals: " + getHttpErrorCodeReturnedEquals() + ",");
        if (getKeyPrefixEquals() != null)
            sb.append("KeyPrefixEquals: " + getKeyPrefixEquals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getHttpErrorCodeReturnedEquals() == null) ? 0
                        : getHttpErrorCodeReturnedEquals().hashCode());
        hashCode = prime * hashCode
                + ((getKeyPrefixEquals() == null) ? 0 : getKeyPrefixEquals().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Condition == false)
            return false;
        Condition other = (Condition) obj;

        if (other.getHttpErrorCodeReturnedEquals() == null
                ^ this.getHttpErrorCodeReturnedEquals() == null)
            return false;
        if (other.getHttpErrorCodeReturnedEquals() != null
                && other.getHttpErrorCodeReturnedEquals().equals(
                        this.getHttpErrorCodeReturnedEquals()) == false)
            return false;
        if (other.getKeyPrefixEquals() == null ^ this.getKeyPrefixEquals() == null)
            return false;
        if (other.getKeyPrefixEquals() != null
                && other.getKeyPrefixEquals().equals(this.getKeyPrefixEquals()) == false)
            return false;
        return true;
    }
}
