/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Specifies the starting point in a Kinesis stream to start processing. You can
 * use the producer timestamp or the fragment number. One of either producer
 * timestamp or fragment number is required. If you use the producer timestamp,
 * you must put the time in milliseconds. For more information about fragment
 * numbers, see <a href=
 * "https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_reader_Fragment.html"
 * >Fragment</a>.
 * </p>
 */
public class KinesisVideoStreamStartSelector implements Serializable {
    /**
     * <p>
     * The timestamp from the producer corresponding to the fragment, in
     * milliseconds, expressed in unix time format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long producerTimestamp;

    /**
     * <p>
     * The unique identifier of the fragment. This value monotonically increases
     * based on the ingestion order.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     */
    private String fragmentNumber;

    /**
     * <p>
     * The timestamp from the producer corresponding to the fragment, in
     * milliseconds, expressed in unix time format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The timestamp from the producer corresponding to the fragment, in
     *         milliseconds, expressed in unix time format.
     *         </p>
     */
    public Long getProducerTimestamp() {
        return producerTimestamp;
    }

    /**
     * <p>
     * The timestamp from the producer corresponding to the fragment, in
     * milliseconds, expressed in unix time format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param producerTimestamp <p>
     *            The timestamp from the producer corresponding to the fragment,
     *            in milliseconds, expressed in unix time format.
     *            </p>
     */
    public void setProducerTimestamp(Long producerTimestamp) {
        this.producerTimestamp = producerTimestamp;
    }

    /**
     * <p>
     * The timestamp from the producer corresponding to the fragment, in
     * milliseconds, expressed in unix time format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param producerTimestamp <p>
     *            The timestamp from the producer corresponding to the fragment,
     *            in milliseconds, expressed in unix time format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KinesisVideoStreamStartSelector withProducerTimestamp(Long producerTimestamp) {
        this.producerTimestamp = producerTimestamp;
        return this;
    }

    /**
     * <p>
     * The unique identifier of the fragment. This value monotonically increases
     * based on the ingestion order.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     *
     * @return <p>
     *         The unique identifier of the fragment. This value monotonically
     *         increases based on the ingestion order.
     *         </p>
     */
    public String getFragmentNumber() {
        return fragmentNumber;
    }

    /**
     * <p>
     * The unique identifier of the fragment. This value monotonically increases
     * based on the ingestion order.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     *
     * @param fragmentNumber <p>
     *            The unique identifier of the fragment. This value
     *            monotonically increases based on the ingestion order.
     *            </p>
     */
    public void setFragmentNumber(String fragmentNumber) {
        this.fragmentNumber = fragmentNumber;
    }

    /**
     * <p>
     * The unique identifier of the fragment. This value monotonically increases
     * based on the ingestion order.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^[0-9]+$<br/>
     *
     * @param fragmentNumber <p>
     *            The unique identifier of the fragment. This value
     *            monotonically increases based on the ingestion order.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KinesisVideoStreamStartSelector withFragmentNumber(String fragmentNumber) {
        this.fragmentNumber = fragmentNumber;
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
        if (getProducerTimestamp() != null)
            sb.append("ProducerTimestamp: " + getProducerTimestamp() + ",");
        if (getFragmentNumber() != null)
            sb.append("FragmentNumber: " + getFragmentNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProducerTimestamp() == null) ? 0 : getProducerTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getFragmentNumber() == null) ? 0 : getFragmentNumber().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisVideoStreamStartSelector == false)
            return false;
        KinesisVideoStreamStartSelector other = (KinesisVideoStreamStartSelector) obj;

        if (other.getProducerTimestamp() == null ^ this.getProducerTimestamp() == null)
            return false;
        if (other.getProducerTimestamp() != null
                && other.getProducerTimestamp().equals(this.getProducerTimestamp()) == false)
            return false;
        if (other.getFragmentNumber() == null ^ this.getFragmentNumber() == null)
            return false;
        if (other.getFragmentNumber() != null
                && other.getFragmentNumber().equals(this.getFragmentNumber()) == false)
            return false;
        return true;
    }
}
