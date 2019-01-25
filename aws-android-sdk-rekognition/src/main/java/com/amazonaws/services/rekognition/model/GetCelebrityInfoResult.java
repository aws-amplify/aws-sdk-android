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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

public class GetCelebrityInfoResult implements Serializable {
    /**
     * <p>
     * An array of URLs pointing to additional celebrity information.
     * </p>
     */
    private java.util.List<String> urls;

    /**
     * <p>
     * The name of the celebrity.
     * </p>
     */
    private String name;

    /**
     * <p>
     * An array of URLs pointing to additional celebrity information.
     * </p>
     *
     * @return <p>
     *         An array of URLs pointing to additional celebrity information.
     *         </p>
     */
    public java.util.List<String> getUrls() {
        return urls;
    }

    /**
     * <p>
     * An array of URLs pointing to additional celebrity information.
     * </p>
     *
     * @param urls <p>
     *            An array of URLs pointing to additional celebrity information.
     *            </p>
     */
    public void setUrls(java.util.Collection<String> urls) {
        if (urls == null) {
            this.urls = null;
            return;
        }

        this.urls = new java.util.ArrayList<String>(urls);
    }

    /**
     * <p>
     * An array of URLs pointing to additional celebrity information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param urls <p>
     *            An array of URLs pointing to additional celebrity information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCelebrityInfoResult withUrls(String... urls) {
        if (getUrls() == null) {
            this.urls = new java.util.ArrayList<String>(urls.length);
        }
        for (String value : urls) {
            this.urls.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of URLs pointing to additional celebrity information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param urls <p>
     *            An array of URLs pointing to additional celebrity information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCelebrityInfoResult withUrls(java.util.Collection<String> urls) {
        setUrls(urls);
        return this;
    }

    /**
     * <p>
     * The name of the celebrity.
     * </p>
     *
     * @return <p>
     *         The name of the celebrity.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the celebrity.
     * </p>
     *
     * @param name <p>
     *            The name of the celebrity.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the celebrity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the celebrity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCelebrityInfoResult withName(String name) {
        this.name = name;
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
        if (getUrls() != null)
            sb.append("Urls: " + getUrls() + ",");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrls() == null) ? 0 : getUrls().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCelebrityInfoResult == false)
            return false;
        GetCelebrityInfoResult other = (GetCelebrityInfoResult) obj;

        if (other.getUrls() == null ^ this.getUrls() == null)
            return false;
        if (other.getUrls() != null && other.getUrls().equals(this.getUrls()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
