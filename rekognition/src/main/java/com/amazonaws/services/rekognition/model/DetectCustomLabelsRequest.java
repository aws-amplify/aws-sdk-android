/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Detects custom labels in a supplied image by using an Amazon Rekognition
 * Custom Labels model.
 * </p>
 * <p>
 * You specify which version of a model version to use by using the
 * <code>ProjectVersionArn</code> input parameter.
 * </p>
 * <p>
 * You pass the input image as base64-encoded image bytes or as a reference to
 * an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon
 * Rekognition operations, passing image bytes is not supported. The image must
 * be either a PNG or JPEG formatted file.
 * </p>
 * <p>
 * For each object that the model version detects on an image, the API returns a
 * (<code>CustomLabel</code>) object in an array (<code>CustomLabels</code>).
 * Each <code>CustomLabel</code> object provides the label name (
 * <code>Name</code>), the level of confidence that the image contains the
 * object (<code>Confidence</code>), and object location information, if it
 * exists, for the label on the image (<code>Geometry</code>).
 * </p>
 * <p>
 * During training model calculates a threshold value that determines if a
 * prediction for a label is true. By default, <code>DetectCustomLabels</code>
 * doesn't return labels whose confidence value is below the model's calculated
 * threshold value. To filter labels that are returned, specify a value for
 * <code>MinConfidence</code> that is higher than the model's calculated
 * threshold. You can get the model's calculated threshold from the model's
 * training results shown in the Amazon Rekognition Custom Labels console. To
 * get all labels, regardless of confidence, specify a
 * <code>MinConfidence</code> value of 0.
 * </p>
 * <p>
 * You can also add the <code>MaxResults</code> parameter to limit the number of
 * labels returned.
 * </p>
 * <p>
 * This is a stateless API operation. That is, the operation does not persist
 * any data.
 * </p>
 * <p>
 * This operation requires permissions to perform the
 * <code>rekognition:DetectCustomLabels</code> action.
 * </p>
 */
public class DetectCustomLabelsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the model version that you want to use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/version\/[a-zA-Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     */
    private String projectVersionArn;

    /**
     * <p>
     * Provides the input image either as bytes or an S3 object.
     * </p>
     * <p>
     * You pass image bytes to an Amazon Rekognition API operation by using the
     * <code>Bytes</code> property. For example, you would use the
     * <code>Bytes</code> property to pass an image loaded from a local file
     * system. Image bytes passed by using the <code>Bytes</code> property must
     * be base64-encoded. Your code may not need to encode image bytes if you
     * are using an AWS SDK to call Amazon Rekognition API operations.
     * </p>
     * <p>
     * For more information, see Analyzing an Image Loaded from a Local File
     * System in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * You pass images stored in an S3 bucket to an Amazon Rekognition API
     * operation by using the <code>S3Object</code> property. Images stored in
     * an S3 bucket do not need to be base64-encoded.
     * </p>
     * <p>
     * The region for the S3 bucket containing the S3 object must match the
     * region you use for Amazon Rekognition operations.
     * </p>
     * <p>
     * If you use the AWS CLI to call Amazon Rekognition operations, passing
     * image bytes using the Bytes property is not supported. You must first
     * upload the image to an Amazon S3 bucket and then call the operation using
     * the S3Object property.
     * </p>
     * <p>
     * For Amazon Rekognition to process an S3 object, the user must have
     * permission to access the S3 object. For more information, see Resource
     * Based Policies in the Amazon Rekognition Developer Guide.
     * </p>
     */
    private Image image;

    /**
     * <p>
     * Maximum number of results you want the service to return in the response.
     * The service returns the specified number of highest confidence labels
     * ranked from highest confidence to lowest.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * Specifies the minimum confidence level for the labels to return. Amazon
     * Rekognition doesn't return any labels with a confidence lower than this
     * specified value. If you specify a value of 0, all labels are return,
     * regardless of the default thresholds that the model version applies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float minConfidence;

    /**
     * <p>
     * The ARN of the model version that you want to use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/version\/[a-zA-Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @return <p>
     *         The ARN of the model version that you want to use.
     *         </p>
     */
    public String getProjectVersionArn() {
        return projectVersionArn;
    }

    /**
     * <p>
     * The ARN of the model version that you want to use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/version\/[a-zA-Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @param projectVersionArn <p>
     *            The ARN of the model version that you want to use.
     *            </p>
     */
    public void setProjectVersionArn(String projectVersionArn) {
        this.projectVersionArn = projectVersionArn;
    }

    /**
     * <p>
     * The ARN of the model version that you want to use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/version\/[a-zA-Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @param projectVersionArn <p>
     *            The ARN of the model version that you want to use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectCustomLabelsRequest withProjectVersionArn(String projectVersionArn) {
        this.projectVersionArn = projectVersionArn;
        return this;
    }

    /**
     * <p>
     * Provides the input image either as bytes or an S3 object.
     * </p>
     * <p>
     * You pass image bytes to an Amazon Rekognition API operation by using the
     * <code>Bytes</code> property. For example, you would use the
     * <code>Bytes</code> property to pass an image loaded from a local file
     * system. Image bytes passed by using the <code>Bytes</code> property must
     * be base64-encoded. Your code may not need to encode image bytes if you
     * are using an AWS SDK to call Amazon Rekognition API operations.
     * </p>
     * <p>
     * For more information, see Analyzing an Image Loaded from a Local File
     * System in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * You pass images stored in an S3 bucket to an Amazon Rekognition API
     * operation by using the <code>S3Object</code> property. Images stored in
     * an S3 bucket do not need to be base64-encoded.
     * </p>
     * <p>
     * The region for the S3 bucket containing the S3 object must match the
     * region you use for Amazon Rekognition operations.
     * </p>
     * <p>
     * If you use the AWS CLI to call Amazon Rekognition operations, passing
     * image bytes using the Bytes property is not supported. You must first
     * upload the image to an Amazon S3 bucket and then call the operation using
     * the S3Object property.
     * </p>
     * <p>
     * For Amazon Rekognition to process an S3 object, the user must have
     * permission to access the S3 object. For more information, see Resource
     * Based Policies in the Amazon Rekognition Developer Guide.
     * </p>
     *
     * @return <p>
     *         Provides the input image either as bytes or an S3 object.
     *         </p>
     *         <p>
     *         You pass image bytes to an Amazon Rekognition API operation by
     *         using the <code>Bytes</code> property. For example, you would use
     *         the <code>Bytes</code> property to pass an image loaded from a
     *         local file system. Image bytes passed by using the
     *         <code>Bytes</code> property must be base64-encoded. Your code may
     *         not need to encode image bytes if you are using an AWS SDK to
     *         call Amazon Rekognition API operations.
     *         </p>
     *         <p>
     *         For more information, see Analyzing an Image Loaded from a Local
     *         File System in the Amazon Rekognition Developer Guide.
     *         </p>
     *         <p>
     *         You pass images stored in an S3 bucket to an Amazon Rekognition
     *         API operation by using the <code>S3Object</code> property. Images
     *         stored in an S3 bucket do not need to be base64-encoded.
     *         </p>
     *         <p>
     *         The region for the S3 bucket containing the S3 object must match
     *         the region you use for Amazon Rekognition operations.
     *         </p>
     *         <p>
     *         If you use the AWS CLI to call Amazon Rekognition operations,
     *         passing image bytes using the Bytes property is not supported.
     *         You must first upload the image to an Amazon S3 bucket and then
     *         call the operation using the S3Object property.
     *         </p>
     *         <p>
     *         For Amazon Rekognition to process an S3 object, the user must
     *         have permission to access the S3 object. For more information,
     *         see Resource Based Policies in the Amazon Rekognition Developer
     *         Guide.
     *         </p>
     */
    public Image getImage() {
        return image;
    }

    /**
     * <p>
     * Provides the input image either as bytes or an S3 object.
     * </p>
     * <p>
     * You pass image bytes to an Amazon Rekognition API operation by using the
     * <code>Bytes</code> property. For example, you would use the
     * <code>Bytes</code> property to pass an image loaded from a local file
     * system. Image bytes passed by using the <code>Bytes</code> property must
     * be base64-encoded. Your code may not need to encode image bytes if you
     * are using an AWS SDK to call Amazon Rekognition API operations.
     * </p>
     * <p>
     * For more information, see Analyzing an Image Loaded from a Local File
     * System in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * You pass images stored in an S3 bucket to an Amazon Rekognition API
     * operation by using the <code>S3Object</code> property. Images stored in
     * an S3 bucket do not need to be base64-encoded.
     * </p>
     * <p>
     * The region for the S3 bucket containing the S3 object must match the
     * region you use for Amazon Rekognition operations.
     * </p>
     * <p>
     * If you use the AWS CLI to call Amazon Rekognition operations, passing
     * image bytes using the Bytes property is not supported. You must first
     * upload the image to an Amazon S3 bucket and then call the operation using
     * the S3Object property.
     * </p>
     * <p>
     * For Amazon Rekognition to process an S3 object, the user must have
     * permission to access the S3 object. For more information, see Resource
     * Based Policies in the Amazon Rekognition Developer Guide.
     * </p>
     *
     * @param image <p>
     *            Provides the input image either as bytes or an S3 object.
     *            </p>
     *            <p>
     *            You pass image bytes to an Amazon Rekognition API operation by
     *            using the <code>Bytes</code> property. For example, you would
     *            use the <code>Bytes</code> property to pass an image loaded
     *            from a local file system. Image bytes passed by using the
     *            <code>Bytes</code> property must be base64-encoded. Your code
     *            may not need to encode image bytes if you are using an AWS SDK
     *            to call Amazon Rekognition API operations.
     *            </p>
     *            <p>
     *            For more information, see Analyzing an Image Loaded from a
     *            Local File System in the Amazon Rekognition Developer Guide.
     *            </p>
     *            <p>
     *            You pass images stored in an S3 bucket to an Amazon
     *            Rekognition API operation by using the <code>S3Object</code>
     *            property. Images stored in an S3 bucket do not need to be
     *            base64-encoded.
     *            </p>
     *            <p>
     *            The region for the S3 bucket containing the S3 object must
     *            match the region you use for Amazon Rekognition operations.
     *            </p>
     *            <p>
     *            If you use the AWS CLI to call Amazon Rekognition operations,
     *            passing image bytes using the Bytes property is not supported.
     *            You must first upload the image to an Amazon S3 bucket and
     *            then call the operation using the S3Object property.
     *            </p>
     *            <p>
     *            For Amazon Rekognition to process an S3 object, the user must
     *            have permission to access the S3 object. For more information,
     *            see Resource Based Policies in the Amazon Rekognition
     *            Developer Guide.
     *            </p>
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * <p>
     * Provides the input image either as bytes or an S3 object.
     * </p>
     * <p>
     * You pass image bytes to an Amazon Rekognition API operation by using the
     * <code>Bytes</code> property. For example, you would use the
     * <code>Bytes</code> property to pass an image loaded from a local file
     * system. Image bytes passed by using the <code>Bytes</code> property must
     * be base64-encoded. Your code may not need to encode image bytes if you
     * are using an AWS SDK to call Amazon Rekognition API operations.
     * </p>
     * <p>
     * For more information, see Analyzing an Image Loaded from a Local File
     * System in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * You pass images stored in an S3 bucket to an Amazon Rekognition API
     * operation by using the <code>S3Object</code> property. Images stored in
     * an S3 bucket do not need to be base64-encoded.
     * </p>
     * <p>
     * The region for the S3 bucket containing the S3 object must match the
     * region you use for Amazon Rekognition operations.
     * </p>
     * <p>
     * If you use the AWS CLI to call Amazon Rekognition operations, passing
     * image bytes using the Bytes property is not supported. You must first
     * upload the image to an Amazon S3 bucket and then call the operation using
     * the S3Object property.
     * </p>
     * <p>
     * For Amazon Rekognition to process an S3 object, the user must have
     * permission to access the S3 object. For more information, see Resource
     * Based Policies in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param image <p>
     *            Provides the input image either as bytes or an S3 object.
     *            </p>
     *            <p>
     *            You pass image bytes to an Amazon Rekognition API operation by
     *            using the <code>Bytes</code> property. For example, you would
     *            use the <code>Bytes</code> property to pass an image loaded
     *            from a local file system. Image bytes passed by using the
     *            <code>Bytes</code> property must be base64-encoded. Your code
     *            may not need to encode image bytes if you are using an AWS SDK
     *            to call Amazon Rekognition API operations.
     *            </p>
     *            <p>
     *            For more information, see Analyzing an Image Loaded from a
     *            Local File System in the Amazon Rekognition Developer Guide.
     *            </p>
     *            <p>
     *            You pass images stored in an S3 bucket to an Amazon
     *            Rekognition API operation by using the <code>S3Object</code>
     *            property. Images stored in an S3 bucket do not need to be
     *            base64-encoded.
     *            </p>
     *            <p>
     *            The region for the S3 bucket containing the S3 object must
     *            match the region you use for Amazon Rekognition operations.
     *            </p>
     *            <p>
     *            If you use the AWS CLI to call Amazon Rekognition operations,
     *            passing image bytes using the Bytes property is not supported.
     *            You must first upload the image to an Amazon S3 bucket and
     *            then call the operation using the S3Object property.
     *            </p>
     *            <p>
     *            For Amazon Rekognition to process an S3 object, the user must
     *            have permission to access the S3 object. For more information,
     *            see Resource Based Policies in the Amazon Rekognition
     *            Developer Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectCustomLabelsRequest withImage(Image image) {
        this.image = image;
        return this;
    }

    /**
     * <p>
     * Maximum number of results you want the service to return in the response.
     * The service returns the specified number of highest confidence labels
     * ranked from highest confidence to lowest.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         Maximum number of results you want the service to return in the
     *         response. The service returns the specified number of highest
     *         confidence labels ranked from highest confidence to lowest.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * Maximum number of results you want the service to return in the response.
     * The service returns the specified number of highest confidence labels
     * ranked from highest confidence to lowest.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param maxResults <p>
     *            Maximum number of results you want the service to return in
     *            the response. The service returns the specified number of
     *            highest confidence labels ranked from highest confidence to
     *            lowest.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of results you want the service to return in the response.
     * The service returns the specified number of highest confidence labels
     * ranked from highest confidence to lowest.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param maxResults <p>
     *            Maximum number of results you want the service to return in
     *            the response. The service returns the specified number of
     *            highest confidence labels ranked from highest confidence to
     *            lowest.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectCustomLabelsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * Specifies the minimum confidence level for the labels to return. Amazon
     * Rekognition doesn't return any labels with a confidence lower than this
     * specified value. If you specify a value of 0, all labels are return,
     * regardless of the default thresholds that the model version applies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         Specifies the minimum confidence level for the labels to return.
     *         Amazon Rekognition doesn't return any labels with a confidence
     *         lower than this specified value. If you specify a value of 0, all
     *         labels are return, regardless of the default thresholds that the
     *         model version applies.
     *         </p>
     */
    public Float getMinConfidence() {
        return minConfidence;
    }

    /**
     * <p>
     * Specifies the minimum confidence level for the labels to return. Amazon
     * Rekognition doesn't return any labels with a confidence lower than this
     * specified value. If you specify a value of 0, all labels are return,
     * regardless of the default thresholds that the model version applies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param minConfidence <p>
     *            Specifies the minimum confidence level for the labels to
     *            return. Amazon Rekognition doesn't return any labels with a
     *            confidence lower than this specified value. If you specify a
     *            value of 0, all labels are return, regardless of the default
     *            thresholds that the model version applies.
     *            </p>
     */
    public void setMinConfidence(Float minConfidence) {
        this.minConfidence = minConfidence;
    }

    /**
     * <p>
     * Specifies the minimum confidence level for the labels to return. Amazon
     * Rekognition doesn't return any labels with a confidence lower than this
     * specified value. If you specify a value of 0, all labels are return,
     * regardless of the default thresholds that the model version applies.
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
     *            return. Amazon Rekognition doesn't return any labels with a
     *            confidence lower than this specified value. If you specify a
     *            value of 0, all labels are return, regardless of the default
     *            thresholds that the model version applies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectCustomLabelsRequest withMinConfidence(Float minConfidence) {
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
        if (getProjectVersionArn() != null)
            sb.append("ProjectVersionArn: " + getProjectVersionArn() + ",");
        if (getImage() != null)
            sb.append("Image: " + getImage() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getMinConfidence() != null)
            sb.append("MinConfidence: " + getMinConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProjectVersionArn() == null) ? 0 : getProjectVersionArn().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
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

        if (obj instanceof DetectCustomLabelsRequest == false)
            return false;
        DetectCustomLabelsRequest other = (DetectCustomLabelsRequest) obj;

        if (other.getProjectVersionArn() == null ^ this.getProjectVersionArn() == null)
            return false;
        if (other.getProjectVersionArn() != null
                && other.getProjectVersionArn().equals(this.getProjectVersionArn()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getMinConfidence() == null ^ this.getMinConfidence() == null)
            return false;
        if (other.getMinConfidence() != null
                && other.getMinConfidence().equals(this.getMinConfidence()) == false)
            return false;
        return true;
    }
}
