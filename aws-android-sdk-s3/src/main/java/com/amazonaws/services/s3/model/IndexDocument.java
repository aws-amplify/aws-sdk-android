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
 * Container for the <code>Suffix</code> element.
 * </p>
 */
public class IndexDocument implements Serializable {
    /**
     * <p>
     * A suffix that is appended to a request that is for a directory on the
     * website endpoint (for example,if the suffix is index.html and you make a
     * request to samplebucket/images/ the data that is returned will be for the
     * object with the key name images/index.html) The suffix must not be empty
     * and must not include a slash character.
     * </p>
     */
    private String suffix;

    /**
     * <p>
     * A suffix that is appended to a request that is for a directory on the
     * website endpoint (for example,if the suffix is index.html and you make a
     * request to samplebucket/images/ the data that is returned will be for the
     * object with the key name images/index.html) The suffix must not be empty
     * and must not include a slash character.
     * </p>
     *
     * @return <p>
     *         A suffix that is appended to a request that is for a directory on
     *         the website endpoint (for example,if the suffix is index.html and
     *         you make a request to samplebucket/images/ the data that is
     *         returned will be for the object with the key name
     *         images/index.html) The suffix must not be empty and must not
     *         include a slash character.
     *         </p>
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * <p>
     * A suffix that is appended to a request that is for a directory on the
     * website endpoint (for example,if the suffix is index.html and you make a
     * request to samplebucket/images/ the data that is returned will be for the
     * object with the key name images/index.html) The suffix must not be empty
     * and must not include a slash character.
     * </p>
     *
     * @param suffix <p>
     *            A suffix that is appended to a request that is for a directory
     *            on the website endpoint (for example,if the suffix is
     *            index.html and you make a request to samplebucket/images/ the
     *            data that is returned will be for the object with the key name
     *            images/index.html) The suffix must not be empty and must not
     *            include a slash character.
     *            </p>
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * <p>
     * A suffix that is appended to a request that is for a directory on the
     * website endpoint (for example,if the suffix is index.html and you make a
     * request to samplebucket/images/ the data that is returned will be for the
     * object with the key name images/index.html) The suffix must not be empty
     * and must not include a slash character.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param suffix <p>
     *            A suffix that is appended to a request that is for a directory
     *            on the website endpoint (for example,if the suffix is
     *            index.html and you make a request to samplebucket/images/ the
     *            data that is returned will be for the object with the key name
     *            images/index.html) The suffix must not be empty and must not
     *            include a slash character.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IndexDocument withSuffix(String suffix) {
        this.suffix = suffix;
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
        if (getSuffix() != null)
            sb.append("Suffix: " + getSuffix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuffix() == null) ? 0 : getSuffix().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IndexDocument == false)
            return false;
        IndexDocument other = (IndexDocument) obj;

        if (other.getSuffix() == null ^ this.getSuffix() == null)
            return false;
        if (other.getSuffix() != null && other.getSuffix().equals(this.getSuffix()) == false)
            return false;
        return true;
    }
}
