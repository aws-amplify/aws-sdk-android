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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Detects instances of real-world entities within an image (JPEG or PNG)
 * provided as input. This includes objects like flower, tree, and table; events
 * like wedding, graduation, and birthday party; and concepts like landscape,
 * evening, and nature.
 * </p>
 * <p>
 * For an example, see Analyzing Images Stored in an Amazon S3 Bucket in the
 * Amazon Rekognition Developer Guide.
 * </p>
 * <note>
 * <p>
 * <code>DetectLabels</code> does not support the detection of activities.
 * However, activity detection is supported for label detection in videos. For
 * more information, see StartLabelDetection in the Amazon Rekognition Developer
 * Guide.
 * </p>
 * </note>
 * <p>
 * You pass the input image as base64-encoded image bytes or as a reference to
 * an image in an Amazon S3 bucket. If you use the Amazon CLI to call Amazon
 * Rekognition operations, passing image bytes is not supported. The image must
 * be either a PNG or JPEG formatted file.
 * </p>
 * <p>
 * For each object, scene, and concept the API returns one or more labels. Each
 * label provides the object name, and the level of confidence that the image
 * contains the object. For example, suppose the input image has a lighthouse,
 * the sea, and a rock. The response will include all three labels, one for each
 * object.
 * </p>
 * <p>
 * <code>{Name: lighthouse, Confidence: 98.4629}</code>
 * </p>
 * <p>
 * <code>{Name: rock,Confidence: 79.2097}</code>
 * </p>
 * <p>
 * <code> {Name: sea,Confidence: 75.061}</code>
 * </p>
 * <p>
 * In the preceding example, the operation returns one label for each of the
 * three objects. The operation can also return multiple labels for the same
 * object in the image. For example, if the input image shows a flower (for
 * example, a tulip), the operation might return the following three labels.
 * </p>
 * <p>
 * <code>{Name: flower,Confidence: 99.0562}</code>
 * </p>
 * <p>
 * <code>{Name: plant,Confidence: 99.0562}</code>
 * </p>
 * <p>
 * <code>{Name: tulip,Confidence: 99.0562}</code>
 * </p>
 * <p>
 * In this example, the detection algorithm more precisely identifies the flower
 * as a tulip.
 * </p>
 * <p>
 * In response, the API returns an array of labels. In addition, the response
 * also includes the orientation correction. Optionally, you can specify
 * <code>MinConfidence</code> to control the confidence threshold for the labels
 * returned. The default is 50%. You can also add the <code>MaxLabels</code>
 * parameter to limit the number of labels returned.
 * </p>
 * <note>
 * <p>
 * If the object detected is a person, the operation doesn't provide the same
 * facial details that the <a>DetectFaces</a> operation provides.
 * </p>
 * </note>
 * <p>
 * This is a stateless API operation. That is, the operation does not persist
 * any data.
 * </p>
 * <p>
 * This operation requires permissions to perform the
 * <code>rekognition:DetectLabels</code> action.
 * </p>
 */
public class DetectLabelsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the
     * AWS CLI to call Amazon Rekognition operations, passing base64-encoded
     * image bytes is not supported.
     * </p>
     */
    private Image image;

    /**
     * <p>
     * Maximum number of labels you want the service to return in the response.
     * The service returns the specified number of highest confidence labels.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer maxLabels;

    /**
     * <p>
     * Specifies the minimum confidence level for the labels to return. Amazon
     * Rekognition doesn't return any labels with confidence lower than this
     * specified value.
     * </p>
     * <p>
     * If <code>MinConfidence</code> is not specified, the operation returns
     * labels with a confidence values greater than or equal to 50 percent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float minConfidence;

    /**
     * Default constructor for DetectLabelsRequest object. Callers should use
     * the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     */
    public DetectLabelsRequest() {
    }

    /**
     * Constructs a new DetectLabelsRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param image <p>
     *            The input image as base64-encoded bytes or an S3 object. If
     *            you use the AWS CLI to call Amazon Rekognition operations,
     *            passing base64-encoded image bytes is not supported.
     *            </p>
     */
    public DetectLabelsRequest(Image image) {
        setImage(image);
    }

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the
     * AWS CLI to call Amazon Rekognition operations, passing base64-encoded
     * image bytes is not supported.
     * </p>
     *
     * @return <p>
     *         The input image as base64-encoded bytes or an S3 object. If you
     *         use the AWS CLI to call Amazon Rekognition operations, passing
     *         base64-encoded image bytes is not supported.
     *         </p>
     */
    public Image getImage() {
        return image;
    }

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the
     * AWS CLI to call Amazon Rekognition operations, passing base64-encoded
     * image bytes is not supported.
     * </p>
     *
     * @param image <p>
     *            The input image as base64-encoded bytes or an S3 object. If
     *            you use the AWS CLI to call Amazon Rekognition operations,
     *            passing base64-encoded image bytes is not supported.
     *            </p>
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the
     * AWS CLI to call Amazon Rekognition operations, passing base64-encoded
     * image bytes is not supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param image <p>
     *            The input image as base64-encoded bytes or an S3 object. If
     *            you use the AWS CLI to call Amazon Rekognition operations,
     *            passing base64-encoded image bytes is not supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectLabelsRequest withImage(Image image) {
        this.image = image;
        return this;
    }

    /**
     * <p>
     * Maximum number of labels you want the service to return in the response.
     * The service returns the specified number of highest confidence labels.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         Maximum number of labels you want the service to return in the
     *         response. The service returns the specified number of highest
     *         confidence labels.
     *         </p>
     */
    public Integer getMaxLabels() {
        return maxLabels;
    }

    /**
     * <p>
     * Maximum number of labels you want the service to return in the response.
     * The service returns the specified number of highest confidence labels.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param maxLabels <p>
     *            Maximum number of labels you want the service to return in the
     *            response. The service returns the specified number of highest
     *            confidence labels.
     *            </p>
     */
    public void setMaxLabels(Integer maxLabels) {
        this.maxLabels = maxLabels;
    }

    /**
     * <p>
     * Maximum number of labels you want the service to return in the response.
     * The service returns the specified number of highest confidence labels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param maxLabels <p>
     *            Maximum number of labels you want the service to return in the
     *            response. The service returns the specified number of highest
     *            confidence labels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectLabelsRequest withMaxLabels(Integer maxLabels) {
        this.maxLabels = maxLabels;
        return this;
    }

    /**
     * <p>
     * Specifies the minimum confidence level for the labels to return. Amazon
     * Rekognition doesn't return any labels with confidence lower than this
     * specified value.
     * </p>
     * <p>
     * If <code>MinConfidence</code> is not specified, the operation returns
     * labels with a confidence values greater than or equal to 50 percent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         Specifies the minimum confidence level for the labels to return.
     *         Amazon Rekognition doesn't return any labels with confidence
     *         lower than this specified value.
     *         </p>
     *         <p>
     *         If <code>MinConfidence</code> is not specified, the operation
     *         returns labels with a confidence values greater than or equal to
     *         50 percent.
     *         </p>
     */
    public Float getMinConfidence() {
        return minConfidence;
    }

    /**
     * <p>
     * Specifies the minimum confidence level for the labels to return. Amazon
     * Rekognition doesn't return any labels with confidence lower than this
     * specified value.
     * </p>
     * <p>
     * If <code>MinConfidence</code> is not specified, the operation returns
     * labels with a confidence values greater than or equal to 50 percent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param minConfidence <p>
     *            Specifies the minimum confidence level for the labels to
     *            return. Amazon Rekognition doesn't return any labels with
     *            confidence lower than this specified value.
     *            </p>
     *            <p>
     *            If <code>MinConfidence</code> is not specified, the operation
     *            returns labels with a confidence values greater than or equal
     *            to 50 percent.
     *            </p>
     */
    public void setMinConfidence(Float minConfidence) {
        this.minConfidence = minConfidence;
    }

    /**
     * <p>
     * Specifies the minimum confidence level for the labels to return. Amazon
     * Rekognition doesn't return any labels with confidence lower than this
     * specified value.
     * </p>
     * <p>
     * If <code>MinConfidence</code> is not specified, the operation returns
     * labels with a confidence values greater than or equal to 50 percent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param minConfidence <p>
     *            Specifies the minimum confidence level for the labels to
     *            return. Amazon Rekognition doesn't return any labels with
     *            confidence lower than this specified value.
     *            </p>
     *            <p>
     *            If <code>MinConfidence</code> is not specified, the operation
     *            returns labels with a confidence values greater than or equal
     *            to 50 percent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectLabelsRequest withMinConfidence(Float minConfidence) {
        this.minConfidence = minConfidence;
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
        if (getImage() != null)
            sb.append("Image: " + getImage() + ",");
        if (getMaxLabels() != null)
            sb.append("MaxLabels: " + getMaxLabels() + ",");
        if (getMinConfidence() != null)
            sb.append("MinConfidence: " + getMinConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getMaxLabels() == null) ? 0 : getMaxLabels().hashCode());
        hashCode = prime * hashCode
                + ((getMinConfidence() == null) ? 0 : getMinConfidence().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectLabelsRequest == false)
            return false;
        DetectLabelsRequest other = (DetectLabelsRequest) obj;

        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getMaxLabels() == null ^ this.getMaxLabels() == null)
            return false;
        if (other.getMaxLabels() != null
                && other.getMaxLabels().equals(this.getMaxLabels()) == false)
            return false;
        if (other.getMinConfidence() == null ^ this.getMinConfidence() == null)
            return false;
        if (other.getMinConfidence() != null
                && other.getMinConfidence().equals(this.getMinConfidence()) == false)
            return false;
        return true;
    }
}
