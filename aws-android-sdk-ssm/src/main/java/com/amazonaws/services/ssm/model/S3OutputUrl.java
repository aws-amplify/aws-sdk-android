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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * A URL for the Amazon S3 bucket where you want to store the results of this
 * request.
 * </p>
 */
public class S3OutputUrl implements Serializable {
    /**
     * <p>
     * A URL for an Amazon S3 bucket where you want to store the results of this
     * request.
     * </p>
     */
    private String outputUrl;

    /**
     * <p>
     * A URL for an Amazon S3 bucket where you want to store the results of this
     * request.
     * </p>
     *
     * @return <p>
     *         A URL for an Amazon S3 bucket where you want to store the results
     *         of this request.
     *         </p>
     */
    public String getOutputUrl() {
        return outputUrl;
    }

    /**
     * <p>
     * A URL for an Amazon S3 bucket where you want to store the results of this
     * request.
     * </p>
     *
     * @param outputUrl <p>
     *            A URL for an Amazon S3 bucket where you want to store the
     *            results of this request.
     *            </p>
     */
    public void setOutputUrl(String outputUrl) {
        this.outputUrl = outputUrl;
    }

    /**
     * <p>
     * A URL for an Amazon S3 bucket where you want to store the results of this
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputUrl <p>
     *            A URL for an Amazon S3 bucket where you want to store the
     *            results of this request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3OutputUrl withOutputUrl(String outputUrl) {
        this.outputUrl = outputUrl;
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
        if (getOutputUrl() != null)
            sb.append("OutputUrl: " + getOutputUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutputUrl() == null) ? 0 : getOutputUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3OutputUrl == false)
            return false;
        S3OutputUrl other = (S3OutputUrl) obj;

        if (other.getOutputUrl() == null ^ this.getOutputUrl() == null)
            return false;
        if (other.getOutputUrl() != null
                && other.getOutputUrl().equals(this.getOutputUrl()) == false)
            return false;
        return true;
    }
}
