/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Compares a face in the <i>source</i> input image with each face detected in
 * the <i>target</i> input image.
 * </p>
 * <note>
 * <p>
 * If the source image contains multiple faces, the service detects the largest
 * face and uses it to compare with each face detected in the target image.
 * </p>
 * </note>
 * <p>
 * In response, the operation returns an array of face matches ordered by
 * similarity score with the highest similarity scores first. For each face
 * match, the response provides a bounding box of the face and
 * <code>confidence</code> value (indicating the level of confidence that the
 * bounding box contains a face). The response also provides a
 * <code>similarity</code> score, which indicates how closely the faces match.
 * </p>
 * <note>
 * <p>
 * By default, only faces with the similarity score of greater than or equal to
 * 80% are returned in the response. You can change this value.
 * </p>
 * </note>
 * <p>
 * In addition to the face matches, the response returns information about the
 * face in the source image, including the bounding box of the face and
 * confidence value.
 * </p>
 * <note>
 * <p>
 * This is a stateless API operation. That is, the operation does not persist
 * any data.
 * </p>
 * </note>
 * <p>
 * For an example, see <a>get-started-exercise-compare-faces</a>
 * </p>
 * <p>
 * This operation requires permissions to perform the
 * <code>rekognition:CompareFaces</code> action.
 * </p>
 */
public class CompareFacesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Source image either as bytes or an Amazon S3 object
     * </p>
     */
    private Image sourceImage;

    /**
     * <p>
     * Target image either as bytes or an Amazon S3 object
     * </p>
     */
    private Image targetImage;

    /**
     * <p>
     * The minimum level of confidence in the match you want included in the
     * result.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float similarityThreshold;

    /**
     * <p>
     * Source image either as bytes or an Amazon S3 object
     * </p>
     *
     * @return <p>
     *         Source image either as bytes or an Amazon S3 object
     *         </p>
     */
    public Image getSourceImage() {
        return sourceImage;
    }

    /**
     * <p>
     * Source image either as bytes or an Amazon S3 object
     * </p>
     *
     * @param sourceImage <p>
     *            Source image either as bytes or an Amazon S3 object
     *            </p>
     */
    public void setSourceImage(Image sourceImage) {
        this.sourceImage = sourceImage;
    }

    /**
     * <p>
     * Source image either as bytes or an Amazon S3 object
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceImage <p>
     *            Source image either as bytes or an Amazon S3 object
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompareFacesRequest withSourceImage(Image sourceImage) {
        this.sourceImage = sourceImage;
        return this;
    }

    /**
     * <p>
     * Target image either as bytes or an Amazon S3 object
     * </p>
     *
     * @return <p>
     *         Target image either as bytes or an Amazon S3 object
     *         </p>
     */
    public Image getTargetImage() {
        return targetImage;
    }

    /**
     * <p>
     * Target image either as bytes or an Amazon S3 object
     * </p>
     *
     * @param targetImage <p>
     *            Target image either as bytes or an Amazon S3 object
     *            </p>
     */
    public void setTargetImage(Image targetImage) {
        this.targetImage = targetImage;
    }

    /**
     * <p>
     * Target image either as bytes or an Amazon S3 object
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetImage <p>
     *            Target image either as bytes or an Amazon S3 object
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompareFacesRequest withTargetImage(Image targetImage) {
        this.targetImage = targetImage;
        return this;
    }

    /**
     * <p>
     * The minimum level of confidence in the match you want included in the
     * result.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         The minimum level of confidence in the match you want included in
     *         the result.
     *         </p>
     */
    public Float getSimilarityThreshold() {
        return similarityThreshold;
    }

    /**
     * <p>
     * The minimum level of confidence in the match you want included in the
     * result.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param similarityThreshold <p>
     *            The minimum level of confidence in the match you want included
     *            in the result.
     *            </p>
     */
    public void setSimilarityThreshold(Float similarityThreshold) {
        this.similarityThreshold = similarityThreshold;
    }

    /**
     * <p>
     * The minimum level of confidence in the match you want included in the
     * result.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param similarityThreshold <p>
     *            The minimum level of confidence in the match you want included
     *            in the result.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompareFacesRequest withSimilarityThreshold(Float similarityThreshold) {
        this.similarityThreshold = similarityThreshold;
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
        if (getSourceImage() != null)
            sb.append("SourceImage: " + getSourceImage() + ",");
        if (getTargetImage() != null)
            sb.append("TargetImage: " + getTargetImage() + ",");
        if (getSimilarityThreshold() != null)
            sb.append("SimilarityThreshold: " + getSimilarityThreshold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSourceImage() == null) ? 0 : getSourceImage().hashCode());
        hashCode = prime * hashCode
                + ((getTargetImage() == null) ? 0 : getTargetImage().hashCode());
        hashCode = prime * hashCode
                + ((getSimilarityThreshold() == null) ? 0 : getSimilarityThreshold().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompareFacesRequest == false)
            return false;
        CompareFacesRequest other = (CompareFacesRequest) obj;

        if (other.getSourceImage() == null ^ this.getSourceImage() == null)
            return false;
        if (other.getSourceImage() != null
                && other.getSourceImage().equals(this.getSourceImage()) == false)
            return false;
        if (other.getTargetImage() == null ^ this.getTargetImage() == null)
            return false;
        if (other.getTargetImage() != null
                && other.getTargetImage().equals(this.getTargetImage()) == false)
            return false;
        if (other.getSimilarityThreshold() == null ^ this.getSimilarityThreshold() == null)
            return false;
        if (other.getSimilarityThreshold() != null
                && other.getSimilarityThreshold().equals(this.getSimilarityThreshold()) == false)
            return false;
        return true;
    }
}
