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
 * Information about the source where the association execution details are
 * stored.
 * </p>
 */
public class OutputSource implements Serializable {
    /**
     * <p>
     * The ID of the output source, for example the URL of an S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     */
    private String outputSourceId;

    /**
     * <p>
     * The type of source where the association execution details are stored,
     * for example, Amazon S3.
     * </p>
     */
    private String outputSourceType;

    /**
     * <p>
     * The ID of the output source, for example the URL of an S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @return <p>
     *         The ID of the output source, for example the URL of an S3 bucket.
     *         </p>
     */
    public String getOutputSourceId() {
        return outputSourceId;
    }

    /**
     * <p>
     * The ID of the output source, for example the URL of an S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param outputSourceId <p>
     *            The ID of the output source, for example the URL of an S3
     *            bucket.
     *            </p>
     */
    public void setOutputSourceId(String outputSourceId) {
        this.outputSourceId = outputSourceId;
    }

    /**
     * <p>
     * The ID of the output source, for example the URL of an S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     *
     * @param outputSourceId <p>
     *            The ID of the output source, for example the URL of an S3
     *            bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputSource withOutputSourceId(String outputSourceId) {
        this.outputSourceId = outputSourceId;
        return this;
    }

    /**
     * <p>
     * The type of source where the association execution details are stored,
     * for example, Amazon S3.
     * </p>
     *
     * @return <p>
     *         The type of source where the association execution details are
     *         stored, for example, Amazon S3.
     *         </p>
     */
    public String getOutputSourceType() {
        return outputSourceType;
    }

    /**
     * <p>
     * The type of source where the association execution details are stored,
     * for example, Amazon S3.
     * </p>
     *
     * @param outputSourceType <p>
     *            The type of source where the association execution details are
     *            stored, for example, Amazon S3.
     *            </p>
     */
    public void setOutputSourceType(String outputSourceType) {
        this.outputSourceType = outputSourceType;
    }

    /**
     * <p>
     * The type of source where the association execution details are stored,
     * for example, Amazon S3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputSourceType <p>
     *            The type of source where the association execution details are
     *            stored, for example, Amazon S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputSource withOutputSourceType(String outputSourceType) {
        this.outputSourceType = outputSourceType;
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
        if (getOutputSourceId() != null)
            sb.append("OutputSourceId: " + getOutputSourceId() + ",");
        if (getOutputSourceType() != null)
            sb.append("OutputSourceType: " + getOutputSourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOutputSourceId() == null) ? 0 : getOutputSourceId().hashCode());
        hashCode = prime * hashCode
                + ((getOutputSourceType() == null) ? 0 : getOutputSourceType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputSource == false)
            return false;
        OutputSource other = (OutputSource) obj;

        if (other.getOutputSourceId() == null ^ this.getOutputSourceId() == null)
            return false;
        if (other.getOutputSourceId() != null
                && other.getOutputSourceId().equals(this.getOutputSourceId()) == false)
            return false;
        if (other.getOutputSourceType() == null ^ this.getOutputSourceType() == null)
            return false;
        if (other.getOutputSourceType() != null
                && other.getOutputSourceType().equals(this.getOutputSourceType()) == false)
            return false;
        return true;
    }
}
