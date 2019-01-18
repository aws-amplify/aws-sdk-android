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
 * Information about a person whose face matches a face(s) in a Amazon
 * Rekognition collection. Includes information about the faces in the Amazon
 * Rekognition collection (), information about the person (<a>PersonDetail</a>)
 * and the timestamp for when the person was detected in a video. An array of
 * <code>PersonMatch</code> objects is returned by .
 * </p>
 */
public class PersonMatch implements Serializable {
    /**
     * <p>
     * The time, in milliseconds from the beginning of the video, that the
     * person was matched in the video.
     * </p>
     */
    private Long timestamp;

    /**
     * <p>
     * Information about the matched person.
     * </p>
     */
    private PersonDetail person;

    /**
     * <p>
     * Information about the faces in the input collection that match the face
     * of a person in the video.
     * </p>
     */
    private java.util.List<FaceMatch> faceMatches;

    /**
     * <p>
     * The time, in milliseconds from the beginning of the video, that the
     * person was matched in the video.
     * </p>
     *
     * @return <p>
     *         The time, in milliseconds from the beginning of the video, that
     *         the person was matched in the video.
     *         </p>
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * The time, in milliseconds from the beginning of the video, that the
     * person was matched in the video.
     * </p>
     *
     * @param timestamp <p>
     *            The time, in milliseconds from the beginning of the video,
     *            that the person was matched in the video.
     *            </p>
     */
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time, in milliseconds from the beginning of the video, that the
     * person was matched in the video.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            The time, in milliseconds from the beginning of the video,
     *            that the person was matched in the video.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PersonMatch withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * <p>
     * Information about the matched person.
     * </p>
     *
     * @return <p>
     *         Information about the matched person.
     *         </p>
     */
    public PersonDetail getPerson() {
        return person;
    }

    /**
     * <p>
     * Information about the matched person.
     * </p>
     *
     * @param person <p>
     *            Information about the matched person.
     *            </p>
     */
    public void setPerson(PersonDetail person) {
        this.person = person;
    }

    /**
     * <p>
     * Information about the matched person.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param person <p>
     *            Information about the matched person.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PersonMatch withPerson(PersonDetail person) {
        this.person = person;
        return this;
    }

    /**
     * <p>
     * Information about the faces in the input collection that match the face
     * of a person in the video.
     * </p>
     *
     * @return <p>
     *         Information about the faces in the input collection that match
     *         the face of a person in the video.
     *         </p>
     */
    public java.util.List<FaceMatch> getFaceMatches() {
        return faceMatches;
    }

    /**
     * <p>
     * Information about the faces in the input collection that match the face
     * of a person in the video.
     * </p>
     *
     * @param faceMatches <p>
     *            Information about the faces in the input collection that match
     *            the face of a person in the video.
     *            </p>
     */
    public void setFaceMatches(java.util.Collection<FaceMatch> faceMatches) {
        if (faceMatches == null) {
            this.faceMatches = null;
            return;
        }

        this.faceMatches = new java.util.ArrayList<FaceMatch>(faceMatches);
    }

    /**
     * <p>
     * Information about the faces in the input collection that match the face
     * of a person in the video.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceMatches <p>
     *            Information about the faces in the input collection that match
     *            the face of a person in the video.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PersonMatch withFaceMatches(FaceMatch... faceMatches) {
        if (getFaceMatches() == null) {
            this.faceMatches = new java.util.ArrayList<FaceMatch>(faceMatches.length);
        }
        for (FaceMatch value : faceMatches) {
            this.faceMatches.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the faces in the input collection that match the face
     * of a person in the video.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceMatches <p>
     *            Information about the faces in the input collection that match
     *            the face of a person in the video.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PersonMatch withFaceMatches(java.util.Collection<FaceMatch> faceMatches) {
        setFaceMatches(faceMatches);
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
            sb.append("Person: " + getPerson() + ",");
        if (getFaceMatches() != null)
            sb.append("FaceMatches: " + getFaceMatches());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getPerson() == null) ? 0 : getPerson().hashCode());
        hashCode = prime * hashCode
                + ((getFaceMatches() == null) ? 0 : getFaceMatches().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PersonMatch == false)
            return false;
        PersonMatch other = (PersonMatch) obj;

        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getPerson() == null ^ this.getPerson() == null)
            return false;
        if (other.getPerson() != null && other.getPerson().equals(this.getPerson()) == false)
            return false;
        if (other.getFaceMatches() == null ^ this.getFaceMatches() == null)
            return false;
        if (other.getFaceMatches() != null
                && other.getFaceMatches().equals(this.getFaceMatches()) == false)
            return false;
        return true;
    }
}
