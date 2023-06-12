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
 * Searches for UserIDs using a supplied image. It first detects the largest
 * face in the image, and then searches a specified collection for matching
 * UserIDs.
 * </p>
 * <p>
 * The operation returns an array of UserIDs that match the face in the supplied
 * image, ordered by similarity score with the highest similarity first. It also
 * returns a bounding box for the face found in the input image.
 * </p>
 * <p>
 * Information about faces detected in the supplied image, but not used for the
 * search, is returned in an array of <code>UnsearchedFace</code> objects. If no
 * valid face is detected in the image, the response will contain an empty
 * <code>UserMatches</code> list and no <code>SearchedFace</code> object.
 * </p>
 */
public class SearchUsersByImageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of an existing collection containing the UserID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     */
    private String collectionId;

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
     * permission to access the S3 object. For more information, see How Amazon
     * Rekognition works with IAM in the Amazon Rekognition Developer Guide.
     * </p>
     */
    private Image image;

    /**
     * <p>
     * Specifies the minimum confidence in the UserID match to return. Default
     * value is 80.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     */
    private Float userMatchThreshold;

    /**
     * <p>
     * Maximum number of UserIDs to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     */
    private Integer maxUsers;

    /**
     * <p>
     * A filter that specifies a quality bar for how much filtering is done to
     * identify faces. Filtered faces aren't searched for in the collection. The
     * default value is NONE.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, AUTO, LOW, MEDIUM, HIGH
     */
    private String qualityFilter;

    /**
     * <p>
     * The ID of an existing collection containing the UserID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @return <p>
     *         The ID of an existing collection containing the UserID.
     *         </p>
     */
    public String getCollectionId() {
        return collectionId;
    }

    /**
     * <p>
     * The ID of an existing collection containing the UserID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @param collectionId <p>
     *            The ID of an existing collection containing the UserID.
     *            </p>
     */
    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * <p>
     * The ID of an existing collection containing the UserID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @param collectionId <p>
     *            The ID of an existing collection containing the UserID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchUsersByImageRequest withCollectionId(String collectionId) {
        this.collectionId = collectionId;
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
     * permission to access the S3 object. For more information, see How Amazon
     * Rekognition works with IAM in the Amazon Rekognition Developer Guide.
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
     *         see How Amazon Rekognition works with IAM in the Amazon
     *         Rekognition Developer Guide.
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
     * permission to access the S3 object. For more information, see How Amazon
     * Rekognition works with IAM in the Amazon Rekognition Developer Guide.
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
     *            see How Amazon Rekognition works with IAM in the Amazon
     *            Rekognition Developer Guide.
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
     * permission to access the S3 object. For more information, see How Amazon
     * Rekognition works with IAM in the Amazon Rekognition Developer Guide.
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
     *            see How Amazon Rekognition works with IAM in the Amazon
     *            Rekognition Developer Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchUsersByImageRequest withImage(Image image) {
        this.image = image;
        return this;
    }

    /**
     * <p>
     * Specifies the minimum confidence in the UserID match to return. Default
     * value is 80.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @return <p>
     *         Specifies the minimum confidence in the UserID match to return.
     *         Default value is 80.
     *         </p>
     */
    public Float getUserMatchThreshold() {
        return userMatchThreshold;
    }

    /**
     * <p>
     * Specifies the minimum confidence in the UserID match to return. Default
     * value is 80.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @param userMatchThreshold <p>
     *            Specifies the minimum confidence in the UserID match to
     *            return. Default value is 80.
     *            </p>
     */
    public void setUserMatchThreshold(Float userMatchThreshold) {
        this.userMatchThreshold = userMatchThreshold;
    }

    /**
     * <p>
     * Specifies the minimum confidence in the UserID match to return. Default
     * value is 80.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @param userMatchThreshold <p>
     *            Specifies the minimum confidence in the UserID match to
     *            return. Default value is 80.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchUsersByImageRequest withUserMatchThreshold(Float userMatchThreshold) {
        this.userMatchThreshold = userMatchThreshold;
        return this;
    }

    /**
     * <p>
     * Maximum number of UserIDs to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     *
     * @return <p>
     *         Maximum number of UserIDs to return.
     *         </p>
     */
    public Integer getMaxUsers() {
        return maxUsers;
    }

    /**
     * <p>
     * Maximum number of UserIDs to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     *
     * @param maxUsers <p>
     *            Maximum number of UserIDs to return.
     *            </p>
     */
    public void setMaxUsers(Integer maxUsers) {
        this.maxUsers = maxUsers;
    }

    /**
     * <p>
     * Maximum number of UserIDs to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     *
     * @param maxUsers <p>
     *            Maximum number of UserIDs to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchUsersByImageRequest withMaxUsers(Integer maxUsers) {
        this.maxUsers = maxUsers;
        return this;
    }

    /**
     * <p>
     * A filter that specifies a quality bar for how much filtering is done to
     * identify faces. Filtered faces aren't searched for in the collection. The
     * default value is NONE.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, AUTO, LOW, MEDIUM, HIGH
     *
     * @return <p>
     *         A filter that specifies a quality bar for how much filtering is
     *         done to identify faces. Filtered faces aren't searched for in the
     *         collection. The default value is NONE.
     *         </p>
     * @see QualityFilter
     */
    public String getQualityFilter() {
        return qualityFilter;
    }

    /**
     * <p>
     * A filter that specifies a quality bar for how much filtering is done to
     * identify faces. Filtered faces aren't searched for in the collection. The
     * default value is NONE.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, AUTO, LOW, MEDIUM, HIGH
     *
     * @param qualityFilter <p>
     *            A filter that specifies a quality bar for how much filtering
     *            is done to identify faces. Filtered faces aren't searched for
     *            in the collection. The default value is NONE.
     *            </p>
     * @see QualityFilter
     */
    public void setQualityFilter(String qualityFilter) {
        this.qualityFilter = qualityFilter;
    }

    /**
     * <p>
     * A filter that specifies a quality bar for how much filtering is done to
     * identify faces. Filtered faces aren't searched for in the collection. The
     * default value is NONE.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, AUTO, LOW, MEDIUM, HIGH
     *
     * @param qualityFilter <p>
     *            A filter that specifies a quality bar for how much filtering
     *            is done to identify faces. Filtered faces aren't searched for
     *            in the collection. The default value is NONE.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QualityFilter
     */
    public SearchUsersByImageRequest withQualityFilter(String qualityFilter) {
        this.qualityFilter = qualityFilter;
        return this;
    }

    /**
     * <p>
     * A filter that specifies a quality bar for how much filtering is done to
     * identify faces. Filtered faces aren't searched for in the collection. The
     * default value is NONE.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, AUTO, LOW, MEDIUM, HIGH
     *
     * @param qualityFilter <p>
     *            A filter that specifies a quality bar for how much filtering
     *            is done to identify faces. Filtered faces aren't searched for
     *            in the collection. The default value is NONE.
     *            </p>
     * @see QualityFilter
     */
    public void setQualityFilter(QualityFilter qualityFilter) {
        this.qualityFilter = qualityFilter.toString();
    }

    /**
     * <p>
     * A filter that specifies a quality bar for how much filtering is done to
     * identify faces. Filtered faces aren't searched for in the collection. The
     * default value is NONE.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, AUTO, LOW, MEDIUM, HIGH
     *
     * @param qualityFilter <p>
     *            A filter that specifies a quality bar for how much filtering
     *            is done to identify faces. Filtered faces aren't searched for
     *            in the collection. The default value is NONE.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QualityFilter
     */
    public SearchUsersByImageRequest withQualityFilter(QualityFilter qualityFilter) {
        this.qualityFilter = qualityFilter.toString();
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
        if (getCollectionId() != null)
            sb.append("CollectionId: " + getCollectionId() + ",");
        if (getImage() != null)
            sb.append("Image: " + getImage() + ",");
        if (getUserMatchThreshold() != null)
            sb.append("UserMatchThreshold: " + getUserMatchThreshold() + ",");
        if (getMaxUsers() != null)
            sb.append("MaxUsers: " + getMaxUsers() + ",");
        if (getQualityFilter() != null)
            sb.append("QualityFilter: " + getQualityFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCollectionId() == null) ? 0 : getCollectionId().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode
                + ((getUserMatchThreshold() == null) ? 0 : getUserMatchThreshold().hashCode());
        hashCode = prime * hashCode + ((getMaxUsers() == null) ? 0 : getMaxUsers().hashCode());
        hashCode = prime * hashCode
                + ((getQualityFilter() == null) ? 0 : getQualityFilter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchUsersByImageRequest == false)
            return false;
        SearchUsersByImageRequest other = (SearchUsersByImageRequest) obj;

        if (other.getCollectionId() == null ^ this.getCollectionId() == null)
            return false;
        if (other.getCollectionId() != null
                && other.getCollectionId().equals(this.getCollectionId()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getUserMatchThreshold() == null ^ this.getUserMatchThreshold() == null)
            return false;
        if (other.getUserMatchThreshold() != null
                && other.getUserMatchThreshold().equals(this.getUserMatchThreshold()) == false)
            return false;
        if (other.getMaxUsers() == null ^ this.getMaxUsers() == null)
            return false;
        if (other.getMaxUsers() != null && other.getMaxUsers().equals(this.getMaxUsers()) == false)
            return false;
        if (other.getQualityFilter() == null ^ this.getQualityFilter() == null)
            return false;
        if (other.getQualityFilter() != null
                && other.getQualityFilter().equals(this.getQualityFilter()) == false)
            return false;
        return true;
    }
}
