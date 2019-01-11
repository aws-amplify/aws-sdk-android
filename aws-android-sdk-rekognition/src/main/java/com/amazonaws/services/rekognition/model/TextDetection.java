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
 * Information about a word or line of text detected by .
 * </p>
 * <p>
 * The <code>DetectedText</code> field contains the text that Amazon Rekognition
 * detected in the image.
 * </p>
 * <p>
 * Every word and line has an identifier (<code>Id</code>). Each word belongs to
 * a line and has a parent identifier (<code>ParentId</code>) that identifies
 * the line of text in which the word appears. The word <code>Id</code> is also
 * an index for the word within a line of words.
 * </p>
 * <p>
 * For more information, see Detecting Text in the Amazon Rekognition Developer
 * Guide.
 * </p>
 */
public class TextDetection implements Serializable {
    /**
     * <p>
     * The word or line of text recognized by Amazon Rekognition.
     * </p>
     */
    private String detectedText;

    /**
     * <p>
     * The type of text that was detected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINE, WORD
     */
    private String type;

    /**
     * <p>
     * The identifier for the detected text. The identifier is only unique for a
     * single call to <code>DetectText</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer id;

    /**
     * <p>
     * The Parent identifier for the detected text identified by the value of
     * <code>ID</code>. If the type of detected text is <code>LINE</code>, the
     * value of <code>ParentId</code> is <code>Null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer parentId;

    /**
     * <p>
     * The confidence that Amazon Rekognition has in the accuracy of the
     * detected text and the accuracy of the geometry points around the detected
     * text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float confidence;

    /**
     * <p>
     * The location of the detected text on the image. Includes an axis aligned
     * coarse bounding box surrounding the text and a finer grain polygon for
     * more accurate spatial information.
     * </p>
     */
    private Geometry geometry;

    /**
     * <p>
     * The word or line of text recognized by Amazon Rekognition.
     * </p>
     *
     * @return <p>
     *         The word or line of text recognized by Amazon Rekognition.
     *         </p>
     */
    public String getDetectedText() {
        return detectedText;
    }

    /**
     * <p>
     * The word or line of text recognized by Amazon Rekognition.
     * </p>
     *
     * @param detectedText <p>
     *            The word or line of text recognized by Amazon Rekognition.
     *            </p>
     */
    public void setDetectedText(String detectedText) {
        this.detectedText = detectedText;
    }

    /**
     * <p>
     * The word or line of text recognized by Amazon Rekognition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detectedText <p>
     *            The word or line of text recognized by Amazon Rekognition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextDetection withDetectedText(String detectedText) {
        this.detectedText = detectedText;
        return this;
    }

    /**
     * <p>
     * The type of text that was detected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINE, WORD
     *
     * @return <p>
     *         The type of text that was detected.
     *         </p>
     * @see TextTypes
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of text that was detected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINE, WORD
     *
     * @param type <p>
     *            The type of text that was detected.
     *            </p>
     * @see TextTypes
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of text that was detected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINE, WORD
     *
     * @param type <p>
     *            The type of text that was detected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TextTypes
     */
    public TextDetection withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of text that was detected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINE, WORD
     *
     * @param type <p>
     *            The type of text that was detected.
     *            </p>
     * @see TextTypes
     */
    public void setType(TextTypes type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of text that was detected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LINE, WORD
     *
     * @param type <p>
     *            The type of text that was detected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TextTypes
     */
    public TextDetection withType(TextTypes type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The identifier for the detected text. The identifier is only unique for a
     * single call to <code>DetectText</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The identifier for the detected text. The identifier is only
     *         unique for a single call to <code>DetectText</code>.
     *         </p>
     */
    public Integer getId() {
        return id;
    }

    /**
     * <p>
     * The identifier for the detected text. The identifier is only unique for a
     * single call to <code>DetectText</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param id <p>
     *            The identifier for the detected text. The identifier is only
     *            unique for a single call to <code>DetectText</code>.
     *            </p>
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the detected text. The identifier is only unique for a
     * single call to <code>DetectText</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param id <p>
     *            The identifier for the detected text. The identifier is only
     *            unique for a single call to <code>DetectText</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextDetection withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The Parent identifier for the detected text identified by the value of
     * <code>ID</code>. If the type of detected text is <code>LINE</code>, the
     * value of <code>ParentId</code> is <code>Null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The Parent identifier for the detected text identified by the
     *         value of <code>ID</code>. If the type of detected text is
     *         <code>LINE</code>, the value of <code>ParentId</code> is
     *         <code>Null</code>.
     *         </p>
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * <p>
     * The Parent identifier for the detected text identified by the value of
     * <code>ID</code>. If the type of detected text is <code>LINE</code>, the
     * value of <code>ParentId</code> is <code>Null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param parentId <p>
     *            The Parent identifier for the detected text identified by the
     *            value of <code>ID</code>. If the type of detected text is
     *            <code>LINE</code>, the value of <code>ParentId</code> is
     *            <code>Null</code>.
     *            </p>
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * <p>
     * The Parent identifier for the detected text identified by the value of
     * <code>ID</code>. If the type of detected text is <code>LINE</code>, the
     * value of <code>ParentId</code> is <code>Null</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param parentId <p>
     *            The Parent identifier for the detected text identified by the
     *            value of <code>ID</code>. If the type of detected text is
     *            <code>LINE</code>, the value of <code>ParentId</code> is
     *            <code>Null</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextDetection withParentId(Integer parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has in the accuracy of the
     * detected text and the accuracy of the geometry points around the detected
     * text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         The confidence that Amazon Rekognition has in the accuracy of the
     *         detected text and the accuracy of the geometry points around the
     *         detected text.
     *         </p>
     */
    public Float getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has in the accuracy of the
     * detected text and the accuracy of the geometry points around the detected
     * text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            The confidence that Amazon Rekognition has in the accuracy of
     *            the detected text and the accuracy of the geometry points
     *            around the detected text.
     *            </p>
     */
    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has in the accuracy of the
     * detected text and the accuracy of the geometry points around the detected
     * text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            The confidence that Amazon Rekognition has in the accuracy of
     *            the detected text and the accuracy of the geometry points
     *            around the detected text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextDetection withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * <p>
     * The location of the detected text on the image. Includes an axis aligned
     * coarse bounding box surrounding the text and a finer grain polygon for
     * more accurate spatial information.
     * </p>
     *
     * @return <p>
     *         The location of the detected text on the image. Includes an axis
     *         aligned coarse bounding box surrounding the text and a finer
     *         grain polygon for more accurate spatial information.
     *         </p>
     */
    public Geometry getGeometry() {
        return geometry;
    }

    /**
     * <p>
     * The location of the detected text on the image. Includes an axis aligned
     * coarse bounding box surrounding the text and a finer grain polygon for
     * more accurate spatial information.
     * </p>
     *
     * @param geometry <p>
     *            The location of the detected text on the image. Includes an
     *            axis aligned coarse bounding box surrounding the text and a
     *            finer grain polygon for more accurate spatial information.
     *            </p>
     */
    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    /**
     * <p>
     * The location of the detected text on the image. Includes an axis aligned
     * coarse bounding box surrounding the text and a finer grain polygon for
     * more accurate spatial information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param geometry <p>
     *            The location of the detected text on the image. Includes an
     *            axis aligned coarse bounding box surrounding the text and a
     *            finer grain polygon for more accurate spatial information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TextDetection withGeometry(Geometry geometry) {
        this.geometry = geometry;
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
        if (getDetectedText() != null)
            sb.append("DetectedText: " + getDetectedText() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getParentId() != null)
            sb.append("ParentId: " + getParentId() + ",");
        if (getConfidence() != null)
            sb.append("Confidence: " + getConfidence() + ",");
        if (getGeometry() != null)
            sb.append("Geometry: " + getGeometry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDetectedText() == null) ? 0 : getDetectedText().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getParentId() == null) ? 0 : getParentId().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode + ((getGeometry() == null) ? 0 : getGeometry().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TextDetection == false)
            return false;
        TextDetection other = (TextDetection) obj;

        if (other.getDetectedText() == null ^ this.getDetectedText() == null)
            return false;
        if (other.getDetectedText() != null
                && other.getDetectedText().equals(this.getDetectedText()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getParentId() == null ^ this.getParentId() == null)
            return false;
        if (other.getParentId() != null && other.getParentId().equals(this.getParentId()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null
                && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getGeometry() == null ^ this.getGeometry() == null)
            return false;
        if (other.getGeometry() != null && other.getGeometry().equals(this.getGeometry()) == false)
            return false;
        return true;
    }
}
