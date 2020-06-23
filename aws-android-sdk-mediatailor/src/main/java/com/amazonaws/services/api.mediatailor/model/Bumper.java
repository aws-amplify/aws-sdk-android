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

package com.amazonaws.services.api.mediatailor.model;

import java.io.Serializable;

/**
 * <p>
 * The configuration for bumpers. Bumpers are short audio or video clips that
 * play at the start or before the end of an ad break.
 * </p>
 */
public class Bumper implements Serializable {
    /**
     * <p>
     * The URL for the end bumper asset.
     * </p>
     */
    private String endUrl;

    /**
     * <p>
     * The URL for the start bumper asset.
     * </p>
     */
    private String startUrl;

    /**
     * <p>
     * The URL for the end bumper asset.
     * </p>
     *
     * @return <p>
     *         The URL for the end bumper asset.
     *         </p>
     */
    public String getEndUrl() {
        return endUrl;
    }

    /**
     * <p>
     * The URL for the end bumper asset.
     * </p>
     *
     * @param endUrl <p>
     *            The URL for the end bumper asset.
     *            </p>
     */
    public void setEndUrl(String endUrl) {
        this.endUrl = endUrl;
    }

    /**
     * <p>
     * The URL for the end bumper asset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endUrl <p>
     *            The URL for the end bumper asset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Bumper withEndUrl(String endUrl) {
        this.endUrl = endUrl;
        return this;
    }

    /**
     * <p>
     * The URL for the start bumper asset.
     * </p>
     *
     * @return <p>
     *         The URL for the start bumper asset.
     *         </p>
     */
    public String getStartUrl() {
        return startUrl;
    }

    /**
     * <p>
     * The URL for the start bumper asset.
     * </p>
     *
     * @param startUrl <p>
     *            The URL for the start bumper asset.
     *            </p>
     */
    public void setStartUrl(String startUrl) {
        this.startUrl = startUrl;
    }

    /**
     * <p>
     * The URL for the start bumper asset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startUrl <p>
     *            The URL for the start bumper asset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Bumper withStartUrl(String startUrl) {
        this.startUrl = startUrl;
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
        if (getEndUrl() != null)
            sb.append("EndUrl: " + getEndUrl() + ",");
        if (getStartUrl() != null)
            sb.append("StartUrl: " + getStartUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndUrl() == null) ? 0 : getEndUrl().hashCode());
        hashCode = prime * hashCode + ((getStartUrl() == null) ? 0 : getStartUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Bumper == false)
            return false;
        Bumper other = (Bumper) obj;

        if (other.getEndUrl() == null ^ this.getEndUrl() == null)
            return false;
        if (other.getEndUrl() != null && other.getEndUrl().equals(this.getEndUrl()) == false)
            return false;
        if (other.getStartUrl() == null ^ this.getStartUrl() == null)
            return false;
        if (other.getStartUrl() != null && other.getStartUrl().equals(this.getStartUrl()) == false)
            return false;
        return true;
    }
}
