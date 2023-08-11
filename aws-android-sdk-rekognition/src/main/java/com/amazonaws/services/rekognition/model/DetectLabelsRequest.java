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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Detects instances of real-world entities within an image (JPEG or PNG)
 * provided as input. This includes objects like flower, tree, and table; events
 * like wedding, graduation, and birthday party; and concepts like landscape,
 * evening, and nature.
 * </p>
 * <p>
 * For an example, see Analyzing images stored in an Amazon S3 bucket in the
 * Amazon Rekognition Developer Guide.
 * </p>
 * <p>
 * You pass the input image as base64-encoded image bytes or as a reference to
 * an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon
 * Rekognition operations, passing image bytes is not supported. The image must
 * be either a PNG or JPEG formatted file.
 * </p>
 * <p>
 * <b>Optional Parameters</b>
 * </p>
 * <p>
 * You can specify one or both of the <code>GENERAL_LABELS</code> and
 * <code>IMAGE_PROPERTIES</code> feature types when calling the DetectLabels
 * API. Including <code>GENERAL_LABELS</code> will ensure the response includes
 * the labels detected in the input image, while including
 * <code>IMAGE_PROPERTIES </code>will ensure the response includes information
 * about the image quality and color.
 * </p>
 * <p>
 * When using <code>GENERAL_LABELS</code> and/or <code>IMAGE_PROPERTIES</code>
 * you can provide filtering criteria to the Settings parameter. You can filter
 * with sets of individual labels or with label categories. You can specify
 * inclusive filters, exclusive filters, or a combination of inclusive and
 * exclusive filters. For more information on filtering see <a href=
 * "https://docs.aws.amazon.com/rekognition/latest/dg/labels-detect-labels-image.html"
 * >Detecting Labels in an Image</a>.
 * </p>
 * <p>
 * When getting labels, you can specify <code>MinConfidence</code> to control
 * the confidence threshold for the labels returned. The default is 55%. You can
 * also add the <code>MaxLabels</code> parameter to limit the number of labels
 * returned. The default and upper limit is 1000 labels. These arguments are
 * only valid when supplying GENERAL_LABELS as a feature type.
 * </p>
 * <p>
 * <b>Response Elements</b>
 * </p>
 * <p>
 * For each object, scene, and concept the API returns one or more labels. The
 * API returns the following types of information about labels:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Name - The name of the detected label.
 * </p>
 * </li>
 * <li>
 * <p>
 * Confidence - The level of confidence in the label assigned to a detected
 * object.
 * </p>
 * </li>
 * <li>
 * <p>
 * Parents - The ancestor labels for a detected label. DetectLabels returns a
 * hierarchical taxonomy of detected labels. For example, a detected car might
 * be assigned the label car. The label car has two parent labels: Vehicle (its
 * parent) and Transportation (its grandparent). The response includes the all
 * ancestors for a label, where every ancestor is a unique label. In the
 * previous example, Car, Vehicle, and Transportation are returned as unique
 * labels in the response.
 * </p>
 * </li>
 * <li>
 * <p>
 * Aliases - Possible Aliases for the label.
 * </p>
 * </li>
 * <li>
 * <p>
 * Categories - The label categories that the detected label belongs to.
 * </p>
 * </li>
 * <li>
 * <p>
 * BoundingBox — Bounding boxes are described for all instances of detected
 * common object labels, returned in an array of Instance objects. An Instance
 * object contains a BoundingBox object, describing the location of the label on
 * the input image. It also includes the confidence for the accuracy of the
 * detected bounding box.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The API returns the following information regarding the image, as part of the
 * ImageProperties structure:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Quality - Information about the Sharpness, Brightness, and Contrast of the
 * input image, scored between 0 to 100. Image quality is returned for the
 * entire image, as well as the background and the foreground.
 * </p>
 * </li>
 * <li>
 * <p>
 * Dominant Color - An array of the dominant colors in the image.
 * </p>
 * </li>
 * <li>
 * <p>
 * Foreground - Information about the sharpness, brightness, and dominant colors
 * of the input image’s foreground.
 * </p>
 * </li>
 * <li>
 * <p>
 * Background - Information about the sharpness, brightness, and dominant colors
 * of the input image’s background.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The list of returned labels will include at least one label for every
 * detected object, along with information about that label. In the following
 * example, suppose the input image has a lighthouse, the sea, and a rock. The
 * response includes all three labels, one for each object, as well as the
 * confidence in the label:
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
 * The list of labels can include multiple labels for the same object. For
 * example, if the input image shows a flower (for example, a tulip), the
 * operation might return the following three labels.
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
 * <note>
 * <p>
 * If the object detected is a person, the operation doesn't provide the same
 * facial details that the <a>DetectFaces</a> operation provides.
 * </p>
 * </note>
 * <p>
 * This is a stateless API operation that doesn't return any data.
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
     * AWS CLI to call Amazon Rekognition operations, passing image bytes is not
     * supported. Images stored in an S3 Bucket do not need to be
     * base64-encoded.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not
     * need to base64-encode image bytes passed using the <code>Bytes</code>
     * field. For more information, see Images in the Amazon Rekognition
     * developer guide.
     * </p>
     */
    private Image image;

    /**
     * <p>
     * Maximum number of labels you want the service to return in the response.
     * The service returns the specified number of highest confidence labels.
     * Only valid when GENERAL_LABELS is specified as a feature type in the
     * Feature input parameter.
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
     * labels with a confidence values greater than or equal to 55 percent. Only
     * valid when GENERAL_LABELS is specified as a feature type in the Feature
     * input parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     */
    private Float minConfidence;

    /**
     * <p>
     * A list of the types of analysis to perform. Specifying GENERAL_LABELS
     * uses the label detection feature, while specifying IMAGE_PROPERTIES
     * returns information regarding image color and quality. If no option is
     * specified GENERAL_LABELS is used by default.
     * </p>
     */
    private java.util.List<String> features;

    /**
     * <p>
     * A list of the filters to be applied to returned detected labels and image
     * properties. Specified filters can be inclusive, exclusive, or a
     * combination of both. Filters can be used for individual labels or label
     * categories. The exact label names or label categories must be supplied.
     * For a full list of labels and label categories, see <a
     * href="https://docs.aws.amazon.com/rekognition/latest/dg/labels.html"
     * >Detecting labels</a>.
     * </p>
     */
    private DetectLabelsSettings settings;

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
     *            passing image bytes is not supported. Images stored in an S3
     *            Bucket do not need to be base64-encoded.
     *            </p>
     *            <p>
     *            If you are using an AWS SDK to call Amazon Rekognition, you
     *            might not need to base64-encode image bytes passed using the
     *            <code>Bytes</code> field. For more information, see Images in
     *            the Amazon Rekognition developer guide.
     *            </p>
     */
    public DetectLabelsRequest(Image image) {
        setImage(image);
    }

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the
     * AWS CLI to call Amazon Rekognition operations, passing image bytes is not
     * supported. Images stored in an S3 Bucket do not need to be
     * base64-encoded.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not
     * need to base64-encode image bytes passed using the <code>Bytes</code>
     * field. For more information, see Images in the Amazon Rekognition
     * developer guide.
     * </p>
     *
     * @return <p>
     *         The input image as base64-encoded bytes or an S3 object. If you
     *         use the AWS CLI to call Amazon Rekognition operations, passing
     *         image bytes is not supported. Images stored in an S3 Bucket do
     *         not need to be base64-encoded.
     *         </p>
     *         <p>
     *         If you are using an AWS SDK to call Amazon Rekognition, you might
     *         not need to base64-encode image bytes passed using the
     *         <code>Bytes</code> field. For more information, see Images in the
     *         Amazon Rekognition developer guide.
     *         </p>
     */
    public Image getImage() {
        return image;
    }

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the
     * AWS CLI to call Amazon Rekognition operations, passing image bytes is not
     * supported. Images stored in an S3 Bucket do not need to be
     * base64-encoded.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not
     * need to base64-encode image bytes passed using the <code>Bytes</code>
     * field. For more information, see Images in the Amazon Rekognition
     * developer guide.
     * </p>
     *
     * @param image <p>
     *            The input image as base64-encoded bytes or an S3 object. If
     *            you use the AWS CLI to call Amazon Rekognition operations,
     *            passing image bytes is not supported. Images stored in an S3
     *            Bucket do not need to be base64-encoded.
     *            </p>
     *            <p>
     *            If you are using an AWS SDK to call Amazon Rekognition, you
     *            might not need to base64-encode image bytes passed using the
     *            <code>Bytes</code> field. For more information, see Images in
     *            the Amazon Rekognition developer guide.
     *            </p>
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the
     * AWS CLI to call Amazon Rekognition operations, passing image bytes is not
     * supported. Images stored in an S3 Bucket do not need to be
     * base64-encoded.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not
     * need to base64-encode image bytes passed using the <code>Bytes</code>
     * field. For more information, see Images in the Amazon Rekognition
     * developer guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param image <p>
     *            The input image as base64-encoded bytes or an S3 object. If
     *            you use the AWS CLI to call Amazon Rekognition operations,
     *            passing image bytes is not supported. Images stored in an S3
     *            Bucket do not need to be base64-encoded.
     *            </p>
     *            <p>
     *            If you are using an AWS SDK to call Amazon Rekognition, you
     *            might not need to base64-encode image bytes passed using the
     *            <code>Bytes</code> field. For more information, see Images in
     *            the Amazon Rekognition developer guide.
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
     * Only valid when GENERAL_LABELS is specified as a feature type in the
     * Feature input parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         Maximum number of labels you want the service to return in the
     *         response. The service returns the specified number of highest
     *         confidence labels. Only valid when GENERAL_LABELS is specified as
     *         a feature type in the Feature input parameter.
     *         </p>
     */
    public Integer getMaxLabels() {
        return maxLabels;
    }

    /**
     * <p>
     * Maximum number of labels you want the service to return in the response.
     * The service returns the specified number of highest confidence labels.
     * Only valid when GENERAL_LABELS is specified as a feature type in the
     * Feature input parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param maxLabels <p>
     *            Maximum number of labels you want the service to return in the
     *            response. The service returns the specified number of highest
     *            confidence labels. Only valid when GENERAL_LABELS is specified
     *            as a feature type in the Feature input parameter.
     *            </p>
     */
    public void setMaxLabels(Integer maxLabels) {
        this.maxLabels = maxLabels;
    }

    /**
     * <p>
     * Maximum number of labels you want the service to return in the response.
     * The service returns the specified number of highest confidence labels.
     * Only valid when GENERAL_LABELS is specified as a feature type in the
     * Feature input parameter.
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
     *            confidence labels. Only valid when GENERAL_LABELS is specified
     *            as a feature type in the Feature input parameter.
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
     * labels with a confidence values greater than or equal to 55 percent. Only
     * valid when GENERAL_LABELS is specified as a feature type in the Feature
     * input parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @return <p>
     *         Specifies the minimum confidence level for the labels to return.
     *         Amazon Rekognition doesn't return any labels with confidence
     *         lower than this specified value.
     *         </p>
     *         <p>
     *         If <code>MinConfidence</code> is not specified, the operation
     *         returns labels with a confidence values greater than or equal to
     *         55 percent. Only valid when GENERAL_LABELS is specified as a
     *         feature type in the Feature input parameter.
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
     * labels with a confidence values greater than or equal to 55 percent. Only
     * valid when GENERAL_LABELS is specified as a feature type in the Feature
     * input parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @param minConfidence <p>
     *            Specifies the minimum confidence level for the labels to
     *            return. Amazon Rekognition doesn't return any labels with
     *            confidence lower than this specified value.
     *            </p>
     *            <p>
     *            If <code>MinConfidence</code> is not specified, the operation
     *            returns labels with a confidence values greater than or equal
     *            to 55 percent. Only valid when GENERAL_LABELS is specified as
     *            a feature type in the Feature input parameter.
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
     * labels with a confidence values greater than or equal to 55 percent. Only
     * valid when GENERAL_LABELS is specified as a feature type in the Feature
     * input parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @param minConfidence <p>
     *            Specifies the minimum confidence level for the labels to
     *            return. Amazon Rekognition doesn't return any labels with
     *            confidence lower than this specified value.
     *            </p>
     *            <p>
     *            If <code>MinConfidence</code> is not specified, the operation
     *            returns labels with a confidence values greater than or equal
     *            to 55 percent. Only valid when GENERAL_LABELS is specified as
     *            a feature type in the Feature input parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectLabelsRequest withMinConfidence(Float minConfidence) {
        this.minConfidence = minConfidence;
        return this;
    }

    /**
     * <p>
     * A list of the types of analysis to perform. Specifying GENERAL_LABELS
     * uses the label detection feature, while specifying IMAGE_PROPERTIES
     * returns information regarding image color and quality. If no option is
     * specified GENERAL_LABELS is used by default.
     * </p>
     *
     * @return <p>
     *         A list of the types of analysis to perform. Specifying
     *         GENERAL_LABELS uses the label detection feature, while specifying
     *         IMAGE_PROPERTIES returns information regarding image color and
     *         quality. If no option is specified GENERAL_LABELS is used by
     *         default.
     *         </p>
     */
    public java.util.List<String> getFeatures() {
        return features;
    }

    /**
     * <p>
     * A list of the types of analysis to perform. Specifying GENERAL_LABELS
     * uses the label detection feature, while specifying IMAGE_PROPERTIES
     * returns information regarding image color and quality. If no option is
     * specified GENERAL_LABELS is used by default.
     * </p>
     *
     * @param features <p>
     *            A list of the types of analysis to perform. Specifying
     *            GENERAL_LABELS uses the label detection feature, while
     *            specifying IMAGE_PROPERTIES returns information regarding
     *            image color and quality. If no option is specified
     *            GENERAL_LABELS is used by default.
     *            </p>
     */
    public void setFeatures(java.util.Collection<String> features) {
        if (features == null) {
            this.features = null;
            return;
        }

        this.features = new java.util.ArrayList<String>(features);
    }

    /**
     * <p>
     * A list of the types of analysis to perform. Specifying GENERAL_LABELS
     * uses the label detection feature, while specifying IMAGE_PROPERTIES
     * returns information regarding image color and quality. If no option is
     * specified GENERAL_LABELS is used by default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param features <p>
     *            A list of the types of analysis to perform. Specifying
     *            GENERAL_LABELS uses the label detection feature, while
     *            specifying IMAGE_PROPERTIES returns information regarding
     *            image color and quality. If no option is specified
     *            GENERAL_LABELS is used by default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectLabelsRequest withFeatures(String... features) {
        if (getFeatures() == null) {
            this.features = new java.util.ArrayList<String>(features.length);
        }
        for (String value : features) {
            this.features.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the types of analysis to perform. Specifying GENERAL_LABELS
     * uses the label detection feature, while specifying IMAGE_PROPERTIES
     * returns information regarding image color and quality. If no option is
     * specified GENERAL_LABELS is used by default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param features <p>
     *            A list of the types of analysis to perform. Specifying
     *            GENERAL_LABELS uses the label detection feature, while
     *            specifying IMAGE_PROPERTIES returns information regarding
     *            image color and quality. If no option is specified
     *            GENERAL_LABELS is used by default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectLabelsRequest withFeatures(java.util.Collection<String> features) {
        setFeatures(features);
        return this;
    }

    /**
     * <p>
     * A list of the filters to be applied to returned detected labels and image
     * properties. Specified filters can be inclusive, exclusive, or a
     * combination of both. Filters can be used for individual labels or label
     * categories. The exact label names or label categories must be supplied.
     * For a full list of labels and label categories, see <a
     * href="https://docs.aws.amazon.com/rekognition/latest/dg/labels.html"
     * >Detecting labels</a>.
     * </p>
     *
     * @return <p>
     *         A list of the filters to be applied to returned detected labels
     *         and image properties. Specified filters can be inclusive,
     *         exclusive, or a combination of both. Filters can be used for
     *         individual labels or label categories. The exact label names or
     *         label categories must be supplied. For a full list of labels and
     *         label categories, see <a href=
     *         "https://docs.aws.amazon.com/rekognition/latest/dg/labels.html"
     *         >Detecting labels</a>.
     *         </p>
     */
    public DetectLabelsSettings getSettings() {
        return settings;
    }

    /**
     * <p>
     * A list of the filters to be applied to returned detected labels and image
     * properties. Specified filters can be inclusive, exclusive, or a
     * combination of both. Filters can be used for individual labels or label
     * categories. The exact label names or label categories must be supplied.
     * For a full list of labels and label categories, see <a
     * href="https://docs.aws.amazon.com/rekognition/latest/dg/labels.html"
     * >Detecting labels</a>.
     * </p>
     *
     * @param settings <p>
     *            A list of the filters to be applied to returned detected
     *            labels and image properties. Specified filters can be
     *            inclusive, exclusive, or a combination of both. Filters can be
     *            used for individual labels or label categories. The exact
     *            label names or label categories must be supplied. For a full
     *            list of labels and label categories, see <a href=
     *            "https://docs.aws.amazon.com/rekognition/latest/dg/labels.html"
     *            >Detecting labels</a>.
     *            </p>
     */
    public void setSettings(DetectLabelsSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * A list of the filters to be applied to returned detected labels and image
     * properties. Specified filters can be inclusive, exclusive, or a
     * combination of both. Filters can be used for individual labels or label
     * categories. The exact label names or label categories must be supplied.
     * For a full list of labels and label categories, see <a
     * href="https://docs.aws.amazon.com/rekognition/latest/dg/labels.html"
     * >Detecting labels</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings <p>
     *            A list of the filters to be applied to returned detected
     *            labels and image properties. Specified filters can be
     *            inclusive, exclusive, or a combination of both. Filters can be
     *            used for individual labels or label categories. The exact
     *            label names or label categories must be supplied. For a full
     *            list of labels and label categories, see <a href=
     *            "https://docs.aws.amazon.com/rekognition/latest/dg/labels.html"
     *            >Detecting labels</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectLabelsRequest withSettings(DetectLabelsSettings settings) {
        this.settings = settings;
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
            sb.append("MinConfidence: " + getMinConfidence() + ",");
        if (getFeatures() != null)
            sb.append("Features: " + getFeatures() + ",");
        if (getSettings() != null)
            sb.append("Settings: " + getSettings());
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
        hashCode = prime * hashCode + ((getFeatures() == null) ? 0 : getFeatures().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
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
        if (other.getFeatures() == null ^ this.getFeatures() == null)
            return false;
        if (other.getFeatures() != null && other.getFeatures().equals(this.getFeatures()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        return true;
    }
}
