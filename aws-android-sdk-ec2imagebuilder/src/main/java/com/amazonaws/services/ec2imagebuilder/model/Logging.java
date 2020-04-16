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

package com.amazonaws.services.ec2imagebuilder.model;

import java.io.Serializable;

/**
 * <p>
 * Logging configuration defines where Image Builder uploads your logs.
 * </p>
 */
public class Logging implements Serializable {
    /**
     * <p>
     * The Amazon S3 logging configuration.
     * </p>
     */
    private S3Logs s3Logs;

    /**
     * <p>
     * The Amazon S3 logging configuration.
     * </p>
     *
     * @return <p>
     *         The Amazon S3 logging configuration.
     *         </p>
     */
    public S3Logs getS3Logs() {
        return s3Logs;
    }

    /**
     * <p>
     * The Amazon S3 logging configuration.
     * </p>
     *
     * @param s3Logs <p>
     *            The Amazon S3 logging configuration.
     *            </p>
     */
    public void setS3Logs(S3Logs s3Logs) {
        this.s3Logs = s3Logs;
    }

    /**
     * <p>
     * The Amazon S3 logging configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Logs <p>
     *            The Amazon S3 logging configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Logging withS3Logs(S3Logs s3Logs) {
        this.s3Logs = s3Logs;
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
        if (getS3Logs() != null)
            sb.append("s3Logs: " + getS3Logs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Logs() == null) ? 0 : getS3Logs().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Logging == false)
            return false;
        Logging other = (Logging) obj;

        if (other.getS3Logs() == null ^ this.getS3Logs() == null)
            return false;
        if (other.getS3Logs() != null && other.getS3Logs().equals(this.getS3Logs()) == false)
            return false;
        return true;
    }
}
