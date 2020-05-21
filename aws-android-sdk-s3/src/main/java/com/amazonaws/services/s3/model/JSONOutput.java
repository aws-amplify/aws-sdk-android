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
 * Specifies JSON as request's output serialization format.
 * </p>
 */
public class JSONOutput implements Serializable {
    /**
     * <p>
     * The value used to separate individual records in the output. If no value
     * is specified, Amazon S3 uses a newline character ('\n').
     * </p>
     */
    private String recordDelimiter;

    /**
     * <p>
     * The value used to separate individual records in the output. If no value
     * is specified, Amazon S3 uses a newline character ('\n').
     * </p>
     *
     * @return <p>
     *         The value used to separate individual records in the output. If
     *         no value is specified, Amazon S3 uses a newline character ('\n').
     *         </p>
     */
    public String getRecordDelimiter() {
        return recordDelimiter;
    }

    /**
     * <p>
     * The value used to separate individual records in the output. If no value
     * is specified, Amazon S3 uses a newline character ('\n').
     * </p>
     *
     * @param recordDelimiter <p>
     *            The value used to separate individual records in the output.
     *            If no value is specified, Amazon S3 uses a newline character
     *            ('\n').
     *            </p>
     */
    public void setRecordDelimiter(String recordDelimiter) {
        this.recordDelimiter = recordDelimiter;
    }

    /**
     * <p>
     * The value used to separate individual records in the output. If no value
     * is specified, Amazon S3 uses a newline character ('\n').
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recordDelimiter <p>
     *            The value used to separate individual records in the output.
     *            If no value is specified, Amazon S3 uses a newline character
     *            ('\n').
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JSONOutput withRecordDelimiter(String recordDelimiter) {
        this.recordDelimiter = recordDelimiter;
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
        if (getRecordDelimiter() != null)
            sb.append("RecordDelimiter: " + getRecordDelimiter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRecordDelimiter() == null) ? 0 : getRecordDelimiter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JSONOutput == false)
            return false;
        JSONOutput other = (JSONOutput) obj;

        if (other.getRecordDelimiter() == null ^ this.getRecordDelimiter() == null)
            return false;
        if (other.getRecordDelimiter() != null
                && other.getRecordDelimiter().equals(this.getRecordDelimiter()) == false)
            return false;
        return true;
    }
}
