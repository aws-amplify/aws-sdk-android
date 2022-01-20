/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Configuration information of a Kinesis Data Firehose delivery stream.
 * </p>
 */
public class KinesisFirehoseConfig implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the delivery stream.
     * </p>
     */
    private String firehoseArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the delivery stream.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the delivery stream.
     *         </p>
     */
    public String getFirehoseArn() {
        return firehoseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the delivery stream.
     * </p>
     *
     * @param firehoseArn <p>
     *            The Amazon Resource Name (ARN) of the delivery stream.
     *            </p>
     */
    public void setFirehoseArn(String firehoseArn) {
        this.firehoseArn = firehoseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the delivery stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param firehoseArn <p>
     *            The Amazon Resource Name (ARN) of the delivery stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KinesisFirehoseConfig withFirehoseArn(String firehoseArn) {
        this.firehoseArn = firehoseArn;
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
        if (getFirehoseArn() != null)
            sb.append("FirehoseArn: " + getFirehoseArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFirehoseArn() == null) ? 0 : getFirehoseArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisFirehoseConfig == false)
            return false;
        KinesisFirehoseConfig other = (KinesisFirehoseConfig) obj;

        if (other.getFirehoseArn() == null ^ this.getFirehoseArn() == null)
            return false;
        if (other.getFirehoseArn() != null
                && other.getFirehoseArn().equals(this.getFirehoseArn()) == false)
            return false;
        return true;
    }
}
