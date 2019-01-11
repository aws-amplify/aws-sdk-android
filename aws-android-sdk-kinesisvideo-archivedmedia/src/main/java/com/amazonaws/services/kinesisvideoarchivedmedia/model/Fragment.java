/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideoarchivedmedia.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a segment of video or other time-delimited data.
 * </p>
 */
public class Fragment implements Serializable {
    /**
     * <p>
     * The index value of the fragment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String fragmentNumber;

    /**
     * <p>
     * The total fragment size, including information about the fragment and
     * contained media data.
     * </p>
     */
    private Long fragmentSizeInBytes;

    /**
     * <p>
     * The time stamp from the producer corresponding to the fragment.
     * </p>
     */
    private java.util.Date producerTimestamp;

    /**
     * <p>
     * The time stamp from the AWS server corresponding to the fragment.
     * </p>
     */
    private java.util.Date serverTimestamp;

    /**
     * <p>
     * The playback duration or other time value associated with the fragment.
     * </p>
     */
    private Long fragmentLengthInMilliseconds;

    /**
     * <p>
     * The index value of the fragment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The index value of the fragment.
     *         </p>
     */
    public String getFragmentNumber() {
        return fragmentNumber;
    }

    /**
     * <p>
     * The index value of the fragment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param fragmentNumber <p>
     *            The index value of the fragment.
     *            </p>
     */
    public void setFragmentNumber(String fragmentNumber) {
        this.fragmentNumber = fragmentNumber;
    }

    /**
     * <p>
     * The index value of the fragment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param fragmentNumber <p>
     *            The index value of the fragment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Fragment withFragmentNumber(String fragmentNumber) {
        this.fragmentNumber = fragmentNumber;
        return this;
    }

    /**
     * <p>
     * The total fragment size, including information about the fragment and
     * contained media data.
     * </p>
     *
     * @return <p>
     *         The total fragment size, including information about the fragment
     *         and contained media data.
     *         </p>
     */
    public Long getFragmentSizeInBytes() {
        return fragmentSizeInBytes;
    }

    /**
     * <p>
     * The total fragment size, including information about the fragment and
     * contained media data.
     * </p>
     *
     * @param fragmentSizeInBytes <p>
     *            The total fragment size, including information about the
     *            fragment and contained media data.
     *            </p>
     */
    public void setFragmentSizeInBytes(Long fragmentSizeInBytes) {
        this.fragmentSizeInBytes = fragmentSizeInBytes;
    }

    /**
     * <p>
     * The total fragment size, including information about the fragment and
     * contained media data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fragmentSizeInBytes <p>
     *            The total fragment size, including information about the
     *            fragment and contained media data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Fragment withFragmentSizeInBytes(Long fragmentSizeInBytes) {
        this.fragmentSizeInBytes = fragmentSizeInBytes;
        return this;
    }

    /**
     * <p>
     * The time stamp from the producer corresponding to the fragment.
     * </p>
     *
     * @return <p>
     *         The time stamp from the producer corresponding to the fragment.
     *         </p>
     */
    public java.util.Date getProducerTimestamp() {
        return producerTimestamp;
    }

    /**
     * <p>
     * The time stamp from the producer corresponding to the fragment.
     * </p>
     *
     * @param producerTimestamp <p>
     *            The time stamp from the producer corresponding to the
     *            fragment.
     *            </p>
     */
    public void setProducerTimestamp(java.util.Date producerTimestamp) {
        this.producerTimestamp = producerTimestamp;
    }

    /**
     * <p>
     * The time stamp from the producer corresponding to the fragment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param producerTimestamp <p>
     *            The time stamp from the producer corresponding to the
     *            fragment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Fragment withProducerTimestamp(java.util.Date producerTimestamp) {
        this.producerTimestamp = producerTimestamp;
        return this;
    }

    /**
     * <p>
     * The time stamp from the AWS server corresponding to the fragment.
     * </p>
     *
     * @return <p>
     *         The time stamp from the AWS server corresponding to the fragment.
     *         </p>
     */
    public java.util.Date getServerTimestamp() {
        return serverTimestamp;
    }

    /**
     * <p>
     * The time stamp from the AWS server corresponding to the fragment.
     * </p>
     *
     * @param serverTimestamp <p>
     *            The time stamp from the AWS server corresponding to the
     *            fragment.
     *            </p>
     */
    public void setServerTimestamp(java.util.Date serverTimestamp) {
        this.serverTimestamp = serverTimestamp;
    }

    /**
     * <p>
     * The time stamp from the AWS server corresponding to the fragment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serverTimestamp <p>
     *            The time stamp from the AWS server corresponding to the
     *            fragment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Fragment withServerTimestamp(java.util.Date serverTimestamp) {
        this.serverTimestamp = serverTimestamp;
        return this;
    }

    /**
     * <p>
     * The playback duration or other time value associated with the fragment.
     * </p>
     *
     * @return <p>
     *         The playback duration or other time value associated with the
     *         fragment.
     *         </p>
     */
    public Long getFragmentLengthInMilliseconds() {
        return fragmentLengthInMilliseconds;
    }

    /**
     * <p>
     * The playback duration or other time value associated with the fragment.
     * </p>
     *
     * @param fragmentLengthInMilliseconds <p>
     *            The playback duration or other time value associated with the
     *            fragment.
     *            </p>
     */
    public void setFragmentLengthInMilliseconds(Long fragmentLengthInMilliseconds) {
        this.fragmentLengthInMilliseconds = fragmentLengthInMilliseconds;
    }

    /**
     * <p>
     * The playback duration or other time value associated with the fragment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fragmentLengthInMilliseconds <p>
     *            The playback duration or other time value associated with the
     *            fragment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Fragment withFragmentLengthInMilliseconds(Long fragmentLengthInMilliseconds) {
        this.fragmentLengthInMilliseconds = fragmentLengthInMilliseconds;
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
        if (getFragmentNumber() != null)
            sb.append("FragmentNumber: " + getFragmentNumber() + ",");
        if (getFragmentSizeInBytes() != null)
            sb.append("FragmentSizeInBytes: " + getFragmentSizeInBytes() + ",");
        if (getProducerTimestamp() != null)
            sb.append("ProducerTimestamp: " + getProducerTimestamp() + ",");
        if (getServerTimestamp() != null)
            sb.append("ServerTimestamp: " + getServerTimestamp() + ",");
        if (getFragmentLengthInMilliseconds() != null)
            sb.append("FragmentLengthInMilliseconds: " + getFragmentLengthInMilliseconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFragmentNumber() == null) ? 0 : getFragmentNumber().hashCode());
        hashCode = prime * hashCode
                + ((getFragmentSizeInBytes() == null) ? 0 : getFragmentSizeInBytes().hashCode());
        hashCode = prime * hashCode
                + ((getProducerTimestamp() == null) ? 0 : getProducerTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getServerTimestamp() == null) ? 0 : getServerTimestamp().hashCode());
        hashCode = prime
                * hashCode
                + ((getFragmentLengthInMilliseconds() == null) ? 0
                        : getFragmentLengthInMilliseconds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Fragment == false)
            return false;
        Fragment other = (Fragment) obj;

        if (other.getFragmentNumber() == null ^ this.getFragmentNumber() == null)
            return false;
        if (other.getFragmentNumber() != null
                && other.getFragmentNumber().equals(this.getFragmentNumber()) == false)
            return false;
        if (other.getFragmentSizeInBytes() == null ^ this.getFragmentSizeInBytes() == null)
            return false;
        if (other.getFragmentSizeInBytes() != null
                && other.getFragmentSizeInBytes().equals(this.getFragmentSizeInBytes()) == false)
            return false;
        if (other.getProducerTimestamp() == null ^ this.getProducerTimestamp() == null)
            return false;
        if (other.getProducerTimestamp() != null
                && other.getProducerTimestamp().equals(this.getProducerTimestamp()) == false)
            return false;
        if (other.getServerTimestamp() == null ^ this.getServerTimestamp() == null)
            return false;
        if (other.getServerTimestamp() != null
                && other.getServerTimestamp().equals(this.getServerTimestamp()) == false)
            return false;
        if (other.getFragmentLengthInMilliseconds() == null
                ^ this.getFragmentLengthInMilliseconds() == null)
            return false;
        if (other.getFragmentLengthInMilliseconds() != null
                && other.getFragmentLengthInMilliseconds().equals(
                        this.getFragmentLengthInMilliseconds()) == false)
            return false;
        return true;
    }
}
