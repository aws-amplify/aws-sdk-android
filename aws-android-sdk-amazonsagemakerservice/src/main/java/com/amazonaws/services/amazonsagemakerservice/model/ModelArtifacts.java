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
 * Provides information about the location that is configured for storing model
 * artifacts.
 * </p>
 */
public class ModelArtifacts implements Serializable {
    /**
     * <p>
     * The path of the S3 object that contains the model artifacts. For example,
     * <code>s3://bucket-name/keynameprefix/model.tar.gz</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     */
    private String s3ModelArtifacts;

    /**
     * <p>
     * The path of the S3 object that contains the model artifacts. For example,
     * <code>s3://bucket-name/keynameprefix/model.tar.gz</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @return <p>
     *         The path of the S3 object that contains the model artifacts. For
     *         example, <code>s3://bucket-name/keynameprefix/model.tar.gz</code>
     *         .
     *         </p>
     */
    public String getS3ModelArtifacts() {
        return s3ModelArtifacts;
    }

    /**
     * <p>
     * The path of the S3 object that contains the model artifacts. For example,
     * <code>s3://bucket-name/keynameprefix/model.tar.gz</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param s3ModelArtifacts <p>
     *            The path of the S3 object that contains the model artifacts.
     *            For example,
     *            <code>s3://bucket-name/keynameprefix/model.tar.gz</code>.
     *            </p>
     */
    public void setS3ModelArtifacts(String s3ModelArtifacts) {
        this.s3ModelArtifacts = s3ModelArtifacts;
    }

    /**
     * <p>
     * The path of the S3 object that contains the model artifacts. For example,
     * <code>s3://bucket-name/keynameprefix/model.tar.gz</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param s3ModelArtifacts <p>
     *            The path of the S3 object that contains the model artifacts.
     *            For example,
     *            <code>s3://bucket-name/keynameprefix/model.tar.gz</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelArtifacts withS3ModelArtifacts(String s3ModelArtifacts) {
        this.s3ModelArtifacts = s3ModelArtifacts;
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
        if (getS3ModelArtifacts() != null)
            sb.append("S3ModelArtifacts: " + getS3ModelArtifacts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getS3ModelArtifacts() == null) ? 0 : getS3ModelArtifacts().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelArtifacts == false)
            return false;
        ModelArtifacts other = (ModelArtifacts) obj;

        if (other.getS3ModelArtifacts() == null ^ this.getS3ModelArtifacts() == null)
            return false;
        if (other.getS3ModelArtifacts() != null
                && other.getS3ModelArtifacts().equals(this.getS3ModelArtifacts()) == false)
            return false;
        return true;
    }
}
