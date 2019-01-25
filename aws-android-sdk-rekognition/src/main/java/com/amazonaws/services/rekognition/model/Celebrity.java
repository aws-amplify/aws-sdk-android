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
 * Provides information about a celebrity recognized by the operation.
 * </p>
 */
public class Celebrity implements Serializable {
    /**
     * <p>
     * An array of URLs pointing to additional information about the celebrity.
     * If there is no additional information about the celebrity, this list is
     * empty.
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
     * A unique identifier for the celebrity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9A-Za-z]*<br/>
     */
    private String id;

    /**
     * <p>
     * Provides information about the celebrity's face, such as its location on
     * the image.
     * </p>
     */
    private ComparedFace face;

    /**
     * <p>
     * The confidence, in percentage, that Rekognition has that the recognized
     * face is the celebrity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float matchConfidence;

    /**
     * <p>
     * An array of URLs pointing to additional information about the celebrity.
     * If there is no additional information about the celebrity, this list is
     * empty.
     * </p>
     *
     * @return <p>
     *         An array of URLs pointing to additional information about the
     *         celebrity. If there is no additional information about the
     *         celebrity, this list is empty.
     *         </p>
     */
    public java.util.List<String> getUrls() {
        return urls;
    }

    /**
     * <p>
     * An array of URLs pointing to additional information about the celebrity.
     * If there is no additional information about the celebrity, this list is
     * empty.
     * </p>
     *
     * @param urls <p>
     *            An array of URLs pointing to additional information about the
     *            celebrity. If there is no additional information about the
     *            celebrity, this list is empty.
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
     * An array of URLs pointing to additional information about the celebrity.
     * If there is no additional information about the celebrity, this list is
     * empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param urls <p>
     *            An array of URLs pointing to additional information about the
     *            celebrity. If there is no additional information about the
     *            celebrity, this list is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Celebrity withUrls(String... urls) {
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
     * An array of URLs pointing to additional information about the celebrity.
     * If there is no additional information about the celebrity, this list is
     * empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param urls <p>
     *            An array of URLs pointing to additional information about the
     *            celebrity. If there is no additional information about the
     *            celebrity, this list is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Celebrity withUrls(java.util.Collection<String> urls) {
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
    public Celebrity withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A unique identifier for the celebrity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9A-Za-z]*<br/>
     *
     * @return <p>
     *         A unique identifier for the celebrity.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * A unique identifier for the celebrity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9A-Za-z]*<br/>
     *
     * @param id <p>
     *            A unique identifier for the celebrity.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique identifier for the celebrity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9A-Za-z]*<br/>
     *
     * @param id <p>
     *            A unique identifier for the celebrity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Celebrity withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * Provides information about the celebrity's face, such as its location on
     * the image.
     * </p>
     *
     * @return <p>
     *         Provides information about the celebrity's face, such as its
     *         location on the image.
     *         </p>
     */
    public ComparedFace getFace() {
        return face;
    }

    /**
     * <p>
     * Provides information about the celebrity's face, such as its location on
     * the image.
     * </p>
     *
     * @param face <p>
     *            Provides information about the celebrity's face, such as its
     *            location on the image.
     *            </p>
     */
    public void setFace(ComparedFace face) {
        this.face = face;
    }

    /**
     * <p>
     * Provides information about the celebrity's face, such as its location on
     * the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param face <p>
     *            Provides information about the celebrity's face, such as its
     *            location on the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Celebrity withFace(ComparedFace face) {
        this.face = face;
        return this;
    }

    /**
     * <p>
     * The confidence, in percentage, that Rekognition has that the recognized
     * face is the celebrity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         The confidence, in percentage, that Rekognition has that the
     *         recognized face is the celebrity.
     *         </p>
     */
    public Float getMatchConfidence() {
        return matchConfidence;
    }

    /**
     * <p>
     * The confidence, in percentage, that Rekognition has that the recognized
     * face is the celebrity.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param matchConfidence <p>
     *            The confidence, in percentage, that Rekognition has that the
     *            recognized face is the celebrity.
     *            </p>
     */
    public void setMatchConfidence(Float matchConfidence) {
        this.matchConfidence = matchConfidence;
    }

    /**
     * <p>
     * The confidence, in percentage, that Rekognition has that the recognized
     * face is the celebrity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param matchConfidence <p>
     *            The confidence, in percentage, that Rekognition has that the
     *            recognized face is the celebrity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Celebrity withMatchConfidence(Float matchConfidence) {
        this.matchConfidence = matchConfidence;
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
        if (getFace() != null)
            sb.append("Face: " + getFace() + ",");
        if (getMatchConfidence() != null)
            sb.append("MatchConfidence: " + getMatchConfidence());
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
        hashCode = prime * hashCode + ((getFace() == null) ? 0 : getFace().hashCode());
        hashCode = prime * hashCode
                + ((getMatchConfidence() == null) ? 0 : getMatchConfidence().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Celebrity == false)
            return false;
        Celebrity other = (Celebrity) obj;

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
        if (other.getFace() == null ^ this.getFace() == null)
            return false;
        if (other.getFace() != null && other.getFace().equals(this.getFace()) == false)
            return false;
        if (other.getMatchConfidence() == null ^ this.getMatchConfidence() == null)
            return false;
        if (other.getMatchConfidence() != null
                && other.getMatchConfidence().equals(this.getMatchConfidence()) == false)
            return false;
        return true;
    }
}
