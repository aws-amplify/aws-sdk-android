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

package com.amazonaws.services.qldb.model;

import java.io.Serializable;

/**
 * <p>
 * The configuration settings of the Amazon Kinesis Data Streams destination for
 * your Amazon QLDB journal stream.
 * </p>
 */
public class KinesisConfiguration implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis data stream resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     */
    private String streamArn;

    /**
     * <p>
     * Enables QLDB to publish multiple stream records in a single Kinesis Data
     * Streams record. To learn more, see <a href=
     * "https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-concepts.html"
     * >KPL Key Concepts</a> in the <i>Amazon Kinesis Data Streams Developer
     * Guide</i>.
     * </p>
     */
    private Boolean aggregationEnabled;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis data stream resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Kinesis data stream
     *         resource.
     *         </p>
     */
    public String getStreamArn() {
        return streamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis data stream resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     *
     * @param streamArn <p>
     *            The Amazon Resource Name (ARN) of the Kinesis data stream
     *            resource.
     *            </p>
     */
    public void setStreamArn(String streamArn) {
        this.streamArn = streamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis data stream resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     *
     * @param streamArn <p>
     *            The Amazon Resource Name (ARN) of the Kinesis data stream
     *            resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KinesisConfiguration withStreamArn(String streamArn) {
        this.streamArn = streamArn;
        return this;
    }

    /**
     * <p>
     * Enables QLDB to publish multiple stream records in a single Kinesis Data
     * Streams record. To learn more, see <a href=
     * "https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-concepts.html"
     * >KPL Key Concepts</a> in the <i>Amazon Kinesis Data Streams Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         Enables QLDB to publish multiple stream records in a single
     *         Kinesis Data Streams record. To learn more, see <a href=
     *         "https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-concepts.html"
     *         >KPL Key Concepts</a> in the <i>Amazon Kinesis Data Streams
     *         Developer Guide</i>.
     *         </p>
     */
    public Boolean isAggregationEnabled() {
        return aggregationEnabled;
    }

    /**
     * <p>
     * Enables QLDB to publish multiple stream records in a single Kinesis Data
     * Streams record. To learn more, see <a href=
     * "https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-concepts.html"
     * >KPL Key Concepts</a> in the <i>Amazon Kinesis Data Streams Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         Enables QLDB to publish multiple stream records in a single
     *         Kinesis Data Streams record. To learn more, see <a href=
     *         "https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-concepts.html"
     *         >KPL Key Concepts</a> in the <i>Amazon Kinesis Data Streams
     *         Developer Guide</i>.
     *         </p>
     */
    public Boolean getAggregationEnabled() {
        return aggregationEnabled;
    }

    /**
     * <p>
     * Enables QLDB to publish multiple stream records in a single Kinesis Data
     * Streams record. To learn more, see <a href=
     * "https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-concepts.html"
     * >KPL Key Concepts</a> in the <i>Amazon Kinesis Data Streams Developer
     * Guide</i>.
     * </p>
     *
     * @param aggregationEnabled <p>
     *            Enables QLDB to publish multiple stream records in a single
     *            Kinesis Data Streams record. To learn more, see <a href=
     *            "https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-concepts.html"
     *            >KPL Key Concepts</a> in the <i>Amazon Kinesis Data Streams
     *            Developer Guide</i>.
     *            </p>
     */
    public void setAggregationEnabled(Boolean aggregationEnabled) {
        this.aggregationEnabled = aggregationEnabled;
    }

    /**
     * <p>
     * Enables QLDB to publish multiple stream records in a single Kinesis Data
     * Streams record. To learn more, see <a href=
     * "https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-concepts.html"
     * >KPL Key Concepts</a> in the <i>Amazon Kinesis Data Streams Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aggregationEnabled <p>
     *            Enables QLDB to publish multiple stream records in a single
     *            Kinesis Data Streams record. To learn more, see <a href=
     *            "https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-concepts.html"
     *            >KPL Key Concepts</a> in the <i>Amazon Kinesis Data Streams
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KinesisConfiguration withAggregationEnabled(Boolean aggregationEnabled) {
        this.aggregationEnabled = aggregationEnabled;
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
        if (getStreamArn() != null)
            sb.append("StreamArn: " + getStreamArn() + ",");
        if (getAggregationEnabled() != null)
            sb.append("AggregationEnabled: " + getAggregationEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamArn() == null) ? 0 : getStreamArn().hashCode());
        hashCode = prime * hashCode
                + ((getAggregationEnabled() == null) ? 0 : getAggregationEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisConfiguration == false)
            return false;
        KinesisConfiguration other = (KinesisConfiguration) obj;

        if (other.getStreamArn() == null ^ this.getStreamArn() == null)
            return false;
        if (other.getStreamArn() != null
                && other.getStreamArn().equals(this.getStreamArn()) == false)
            return false;
        if (other.getAggregationEnabled() == null ^ this.getAggregationEnabled() == null)
            return false;
        if (other.getAggregationEnabled() != null
                && other.getAggregationEnabled().equals(this.getAggregationEnabled()) == false)
            return false;
        return true;
    }
}
