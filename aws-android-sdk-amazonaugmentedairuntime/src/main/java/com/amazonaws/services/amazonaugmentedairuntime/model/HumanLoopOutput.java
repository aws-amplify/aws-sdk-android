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

package com.amazonaws.services.amazonaugmentedairuntime.model;

import java.io.Serializable;

/**
 * <p>
 * Information about where the human output will be stored.
 * </p>
 */
public class HumanLoopOutput implements Serializable {
    /**
     * <p>
     * The location of the Amazon S3 object where Amazon Augmented AI stores
     * your human loop output.
     * </p>
     */
    private String outputS3Uri;

    /**
     * <p>
     * The location of the Amazon S3 object where Amazon Augmented AI stores
     * your human loop output.
     * </p>
     *
     * @return <p>
     *         The location of the Amazon S3 object where Amazon Augmented AI
     *         stores your human loop output.
     *         </p>
     */
    public String getOutputS3Uri() {
        return outputS3Uri;
    }

    /**
     * <p>
     * The location of the Amazon S3 object where Amazon Augmented AI stores
     * your human loop output.
     * </p>
     *
     * @param outputS3Uri <p>
     *            The location of the Amazon S3 object where Amazon Augmented AI
     *            stores your human loop output.
     *            </p>
     */
    public void setOutputS3Uri(String outputS3Uri) {
        this.outputS3Uri = outputS3Uri;
    }

    /**
     * <p>
     * The location of the Amazon S3 object where Amazon Augmented AI stores
     * your human loop output.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputS3Uri <p>
     *            The location of the Amazon S3 object where Amazon Augmented AI
     *            stores your human loop output.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HumanLoopOutput withOutputS3Uri(String outputS3Uri) {
        this.outputS3Uri = outputS3Uri;
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
        if (getOutputS3Uri() != null)
            sb.append("OutputS3Uri: " + getOutputS3Uri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOutputS3Uri() == null) ? 0 : getOutputS3Uri().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HumanLoopOutput == false)
            return false;
        HumanLoopOutput other = (HumanLoopOutput) obj;

        if (other.getOutputS3Uri() == null ^ this.getOutputS3Uri() == null)
            return false;
        if (other.getOutputS3Uri() != null
                && other.getOutputS3Uri().equals(this.getOutputS3Uri()) == false)
            return false;
        return true;
    }
}
