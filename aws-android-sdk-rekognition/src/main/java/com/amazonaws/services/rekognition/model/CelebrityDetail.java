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
 * Information about a recognized celebrity.
 * </p>
 */
public class CelebrityDetail implements Serializable {
    /**
     * <p>
     * An array of URLs pointing to additional celebrity information.
     * </p>
     */
    private java.util.List<String> urls;

    /**
     * <p>
     * The name of the celebrity.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The unique identifier for the celebrity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9A-Za-z]*<br/>
     */
    private String id;

    /**
     * <p>
     * The confidence, in percentage, that Amazon Rekognition has that the
     * recognized face is the celebrity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float confidence;

    /**
     * <p>
     * Bounding box around the body of a celebrity.
     * </p>
     */
    private BoundingBox boundingBox;

    /**
     * <p>
     * Face details for the recognized celebrity.
     * </p>
     */
    private FaceDetail face;

    /**
     * <p>
     * An array of URLs pointing to additional celebrity information.
     * </p>
     *
     * @return <p>
     *         An array of URLs pointing to additional celebrity information.
     *         </p>
     */
    public java.util.List<String> getUrls() {
        return urls;
    }

    /**
     * <p>
     * An array of URLs pointing to additional celebrity information.
     * </p>
     *
     * @param urls <p>
     *            An array of URLs pointing to additional celebrity information.
     *            </p>
     */
    public void setUrls(java.util.Collection<String> urls) {
        if (urls == null) {
            this.urls = null;
            return;
        }

        this.urls = new java.util.ArrayList<String>(urls);
    }

    /**
     * <p>
     * An array of URLs pointing to additional celebrity information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param urls <p>
     *            An array of URLs pointing to additional celebrity information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CelebrityDetail withUrls(String... urls) {
        if (getUrls() == null) {
            this.urls = new java.util.ArrayList<String>(urls.length);
        }
        for (String value : urls) {
            this.urls.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of URLs pointing to additional celebrity information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param urls <p>
     *            An array of URLs pointing to additional celebrity information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CelebrityDetail withUrls(java.util.Collection<String> urls) {
        setUrls(urls);
        return this;
    }

    /**
     * <p>
     * The name of the celebrity.
     * </p>
     *
     * @return <p>
     *         The name of the celebrity.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the celebrity.
     * </p>
     *
     * @param name <p>
     *            The name of the celebrity.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the celebrity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the celebrity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CelebrityDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the celebrity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9A-Za-z]*<br/>
     *
     * @return <p>
     *         The unique identifier for the celebrity.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier for the celebrity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9A-Za-z]*<br/>
     *
     * @param id <p>
     *            The unique identifier for the celebrity.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the celebrity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9A-Za-z]*<br/>
     *
     * @param id <p>
     *            The unique identifier for the celebrity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CelebrityDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The confidence, in percentage, that Amazon Rekognition has that the
     * recognized face is the celebrity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         The confidence, in percentage, that Amazon Rekognition has that
     *         the recognized face is the celebrity.
     *         </p>
     */
    public Float getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * The confidence, in percentage, that Amazon Rekognition has that the
     * recognized face is the celebrity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            The confidence, in percentage, that Amazon Rekognition has
     *            that the recognized face is the celebrity.
     *            </p>
     */
    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The confidence, in percentage, that Amazon Rekognition has that the
     * recognized face is the celebrity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            The confidence, in percentage, that Amazon Rekognition has
     *            that the recognized face is the celebrity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CelebrityDetail withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * <p>
     * Bounding box around the body of a celebrity.
     * </p>
     *
     * @return <p>
     *         Bounding box around the body of a celebrity.
     *         </p>
     */
    public BoundingBox getBoundingBox() {
        return boundingBox;
    }

    /**
     * <p>
     * Bounding box around the body of a celebrity.
     * </p>
     *
     * @param boundingBox <p>
     *            Bounding box around the body of a celebrity.
     *            </p>
     */
    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    /**
     * <p>
     * Bounding box around the body of a celebrity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param boundingBox <p>
     *            Bounding box around the body of a celebrity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CelebrityDetail withBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    /**
     * <p>
     * Face details for the recognized celebrity.
     * </p>
     *
     * @return <p>
     *         Face details for the recognized celebrity.
     *         </p>
     */
    public FaceDetail getFace() {
        return face;
    }

    /**
     * <p>
     * Face details for the recognized celebrity.
     * </p>
     *
     * @param face <p>
     *            Face details for the recognized celebrity.
     *            </p>
     */
    public void setFace(FaceDetail face) {
        this.face = face;
    }

    /**
     * <p>
     * Face details for the recognized celebrity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param face <p>
     *            Face details for the recognized celebrity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CelebrityDetail withFace(FaceDetail face) {
        this.face = face;
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
        if (getUrls() != null)
            sb.append("Urls: " + getUrls() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getConfidence() != null)
            sb.append("Confidence: " + getConfidence() + ",");
        if (getBoundingBox() != null)
            sb.append("BoundingBox: " + getBoundingBox() + ",");
        if (getFace() != null)
            sb.append("Face: " + getFace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrls() == null) ? 0 : getUrls().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode
                + ((getBoundingBox() == null) ? 0 : getBoundingBox().hashCode());
        hashCode = prime * hashCode + ((getFace() == null) ? 0 : getFace().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CelebrityDetail == false)
            return false;
        CelebrityDetail other = (CelebrityDetail) obj;

        if (other.getUrls() == null ^ this.getUrls() == null)
            return false;
        if (other.getUrls() != null && other.getUrls().equals(this.getUrls()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null
                && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getBoundingBox() == null ^ this.getBoundingBox() == null)
            return false;
        if (other.getBoundingBox() != null
                && other.getBoundingBox().equals(this.getBoundingBox()) == false)
            return false;
        if (other.getFace() == null ^ this.getFace() == null)
            return false;
        if (other.getFace() != null && other.getFace().equals(this.getFace()) == false)
            return false;
        return true;
    }
}
