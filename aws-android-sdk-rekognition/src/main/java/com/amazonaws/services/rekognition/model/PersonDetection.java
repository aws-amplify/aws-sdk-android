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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/**
 * <p>
 * Details and tracking information for a single time a person is tracked in a
 * video. Amazon Rekognition operations that track persons return an array of
 * <code>PersonDetection</code> objects with elements for each time a person is
 * tracked in a video.
 * </p>
 * <p>
 * For more information, see API_GetPersonTracking in the Amazon Rekognition
 * Developer Guide.
 * </p>
 */
public class PersonDetection implements Serializable {
    /**
     * <p>
     * The time, in milliseconds from the start of the video, that the person
     * was tracked.
     * </p>
     */
    private Long timestamp;

    /**
     * <p>
     * Details about a person tracked in a video.
     * </p>
     */
    private PersonDetail person;

    /**
     * <p>
     * The time, in milliseconds from the start of the video, that the person
     * was tracked.
     * </p>
     *
     * @return <p>
     *         The time, in milliseconds from the start of the video, that the
     *         person was tracked.
     *         </p>
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * The time, in milliseconds from the start of the video, that the person
     * was tracked.
     * </p>
     *
     * @param timestamp <p>
     *            The time, in milliseconds from the start of the video, that
     *            the person was tracked.
     *            </p>
     */
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time, in milliseconds from the start of the video, that the person
     * was tracked.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            The time, in milliseconds from the start of the video, that
     *            the person was tracked.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PersonDetection withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * <p>
     * Details about a person tracked in a video.
     * </p>
     *
     * @return <p>
     *         Details about a person tracked in a video.
     *         </p>
     */
    public PersonDetail getPerson() {
        return person;
    }

    /**
     * <p>
     * Details about a person tracked in a video.
     * </p>
     *
     * @param person <p>
     *            Details about a person tracked in a video.
     *            </p>
     */
    public void setPerson(PersonDetail person) {
        this.person = person;
    }

    /**
     * <p>
     * Details about a person tracked in a video.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param person <p>
     *            Details about a person tracked in a video.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PersonDetection withPerson(PersonDetail person) {
        this.person = person;
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
        if (getTimestamp() != null)
            sb.append("Timestamp: " + getTimestamp() + ",");
        if (getPerson() != null)
            sb.append("Person: " + getPerson());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getPerson() == null) ? 0 : getPerson().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PersonDetection == false)
            return false;
        PersonDetection other = (PersonDetection) obj;

        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getPerson() == null ^ this.getPerson() == null)
            return false;
        if (other.getPerson() != null && other.getPerson().equals(this.getPerson()) == false)
            return false;
        return true;
    }
}
