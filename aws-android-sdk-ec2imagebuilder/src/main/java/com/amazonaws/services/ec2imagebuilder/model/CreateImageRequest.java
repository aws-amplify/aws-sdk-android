/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.ec2imagebuilder.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new image. This request will create a new image along with all of
 * the configured output resources defined in the distribution configuration.
 * </p>
 */
public class CreateImageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe that defines how
     * images are configured, tested, and assessed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):image-recipe
     * /[a-z0-9-_]+/\d+\.\d+\.\d+$<br/>
     */
    private String imageRecipeArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration that
     * defines and configures the outputs of your pipeline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):distribution
     * -configuration/[a-z0-9-_]+$<br/>
     */
    private String distributionConfigurationArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration that
     * defines the environment in which your image will be built and tested.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):infrastructure
     * -configuration/[a-z0-9-_]+$<br/>
     */
    private String infrastructureConfigurationArn;

    /**
     * <p>
     * The image tests configuration of the image.
     * </p>
     */
    private ImageTestsConfiguration imageTestsConfiguration;

    /**
     * <p>
     * Collects additional information about the image being created, including
     * the operating system (OS) version and package list. This information is
     * used to enhance the overall experience of using EC2 Image Builder.
     * Enabled by default.
     * </p>
     */
    private Boolean enhancedImageMetadataEnabled;

    /**
     * <p>
     * The tags of the image.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The idempotency token used to make this request idempotent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     */
    private String clientToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe that defines how
     * images are configured, tested, and assessed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):image-recipe
     * /[a-z0-9-_]+/\d+\.\d+\.\d+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the image recipe that defines
     *         how images are configured, tested, and assessed.
     *         </p>
     */
    public String getImageRecipeArn() {
        return imageRecipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe that defines how
     * images are configured, tested, and assessed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):image-recipe
     * /[a-z0-9-_]+/\d+\.\d+\.\d+$<br/>
     *
     * @param imageRecipeArn <p>
     *            The Amazon Resource Name (ARN) of the image recipe that
     *            defines how images are configured, tested, and assessed.
     *            </p>
     */
    public void setImageRecipeArn(String imageRecipeArn) {
        this.imageRecipeArn = imageRecipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe that defines how
     * images are configured, tested, and assessed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):image-recipe
     * /[a-z0-9-_]+/\d+\.\d+\.\d+$<br/>
     *
     * @param imageRecipeArn <p>
     *            The Amazon Resource Name (ARN) of the image recipe that
     *            defines how images are configured, tested, and assessed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateImageRequest withImageRecipeArn(String imageRecipeArn) {
        this.imageRecipeArn = imageRecipeArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration that
     * defines and configures the outputs of your pipeline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):distribution
     * -configuration/[a-z0-9-_]+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the distribution configuration
     *         that defines and configures the outputs of your pipeline.
     *         </p>
     */
    public String getDistributionConfigurationArn() {
        return distributionConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration that
     * defines and configures the outputs of your pipeline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):distribution
     * -configuration/[a-z0-9-_]+$<br/>
     *
     * @param distributionConfigurationArn <p>
     *            The Amazon Resource Name (ARN) of the distribution
     *            configuration that defines and configures the outputs of your
     *            pipeline.
     *            </p>
     */
    public void setDistributionConfigurationArn(String distributionConfigurationArn) {
        this.distributionConfigurationArn = distributionConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration that
     * defines and configures the outputs of your pipeline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):distribution
     * -configuration/[a-z0-9-_]+$<br/>
     *
     * @param distributionConfigurationArn <p>
     *            The Amazon Resource Name (ARN) of the distribution
     *            configuration that defines and configures the outputs of your
     *            pipeline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateImageRequest withDistributionConfigurationArn(String distributionConfigurationArn) {
        this.distributionConfigurationArn = distributionConfigurationArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration that
     * defines the environment in which your image will be built and tested.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):infrastructure
     * -configuration/[a-z0-9-_]+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the infrastructure
     *         configuration that defines the environment in which your image
     *         will be built and tested.
     *         </p>
     */
    public String getInfrastructureConfigurationArn() {
        return infrastructureConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration that
     * defines the environment in which your image will be built and tested.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):infrastructure
     * -configuration/[a-z0-9-_]+$<br/>
     *
     * @param infrastructureConfigurationArn <p>
     *            The Amazon Resource Name (ARN) of the infrastructure
     *            configuration that defines the environment in which your image
     *            will be built and tested.
     *            </p>
     */
    public void setInfrastructureConfigurationArn(String infrastructureConfigurationArn) {
        this.infrastructureConfigurationArn = infrastructureConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration that
     * defines the environment in which your image will be built and tested.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):infrastructure
     * -configuration/[a-z0-9-_]+$<br/>
     *
     * @param infrastructureConfigurationArn <p>
     *            The Amazon Resource Name (ARN) of the infrastructure
     *            configuration that defines the environment in which your image
     *            will be built and tested.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateImageRequest withInfrastructureConfigurationArn(
            String infrastructureConfigurationArn) {
        this.infrastructureConfigurationArn = infrastructureConfigurationArn;
        return this;
    }

    /**
     * <p>
     * The image tests configuration of the image.
     * </p>
     *
     * @return <p>
     *         The image tests configuration of the image.
     *         </p>
     */
    public ImageTestsConfiguration getImageTestsConfiguration() {
        return imageTestsConfiguration;
    }

    /**
     * <p>
     * The image tests configuration of the image.
     * </p>
     *
     * @param imageTestsConfiguration <p>
     *            The image tests configuration of the image.
     *            </p>
     */
    public void setImageTestsConfiguration(ImageTestsConfiguration imageTestsConfiguration) {
        this.imageTestsConfiguration = imageTestsConfiguration;
    }

    /**
     * <p>
     * The image tests configuration of the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageTestsConfiguration <p>
     *            The image tests configuration of the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateImageRequest withImageTestsConfiguration(
            ImageTestsConfiguration imageTestsConfiguration) {
        this.imageTestsConfiguration = imageTestsConfiguration;
        return this;
    }

    /**
     * <p>
     * Collects additional information about the image being created, including
     * the operating system (OS) version and package list. This information is
     * used to enhance the overall experience of using EC2 Image Builder.
     * Enabled by default.
     * </p>
     *
     * @return <p>
     *         Collects additional information about the image being created,
     *         including the operating system (OS) version and package list.
     *         This information is used to enhance the overall experience of
     *         using EC2 Image Builder. Enabled by default.
     *         </p>
     */
    public Boolean isEnhancedImageMetadataEnabled() {
        return enhancedImageMetadataEnabled;
    }

    /**
     * <p>
     * Collects additional information about the image being created, including
     * the operating system (OS) version and package list. This information is
     * used to enhance the overall experience of using EC2 Image Builder.
     * Enabled by default.
     * </p>
     *
     * @return <p>
     *         Collects additional information about the image being created,
     *         including the operating system (OS) version and package list.
     *         This information is used to enhance the overall experience of
     *         using EC2 Image Builder. Enabled by default.
     *         </p>
     */
    public Boolean getEnhancedImageMetadataEnabled() {
        return enhancedImageMetadataEnabled;
    }

    /**
     * <p>
     * Collects additional information about the image being created, including
     * the operating system (OS) version and package list. This information is
     * used to enhance the overall experience of using EC2 Image Builder.
     * Enabled by default.
     * </p>
     *
     * @param enhancedImageMetadataEnabled <p>
     *            Collects additional information about the image being created,
     *            including the operating system (OS) version and package list.
     *            This information is used to enhance the overall experience of
     *            using EC2 Image Builder. Enabled by default.
     *            </p>
     */
    public void setEnhancedImageMetadataEnabled(Boolean enhancedImageMetadataEnabled) {
        this.enhancedImageMetadataEnabled = enhancedImageMetadataEnabled;
    }

    /**
     * <p>
     * Collects additional information about the image being created, including
     * the operating system (OS) version and package list. This information is
     * used to enhance the overall experience of using EC2 Image Builder.
     * Enabled by default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enhancedImageMetadataEnabled <p>
     *            Collects additional information about the image being created,
     *            including the operating system (OS) version and package list.
     *            This information is used to enhance the overall experience of
     *            using EC2 Image Builder. Enabled by default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateImageRequest withEnhancedImageMetadataEnabled(Boolean enhancedImageMetadataEnabled) {
        this.enhancedImageMetadataEnabled = enhancedImageMetadataEnabled;
        return this;
    }

    /**
     * <p>
     * The tags of the image.
     * </p>
     *
     * @return <p>
     *         The tags of the image.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of the image.
     * </p>
     *
     * @param tags <p>
     *            The tags of the image.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags of the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags of the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateImageRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags of the image.
     * </p>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateImageRequest addtagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateImageRequest cleartagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The idempotency token used to make this request idempotent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @return <p>
     *         The idempotency token used to make this request idempotent.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * The idempotency token used to make this request idempotent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param clientToken <p>
     *            The idempotency token used to make this request idempotent.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token used to make this request idempotent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param clientToken <p>
     *            The idempotency token used to make this request idempotent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateImageRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
        if (getImageRecipeArn() != null)
            sb.append("imageRecipeArn: " + getImageRecipeArn() + ",");
        if (getDistributionConfigurationArn() != null)
            sb.append("distributionConfigurationArn: " + getDistributionConfigurationArn() + ",");
        if (getInfrastructureConfigurationArn() != null)
            sb.append("infrastructureConfigurationArn: " + getInfrastructureConfigurationArn()
                    + ",");
        if (getImageTestsConfiguration() != null)
            sb.append("imageTestsConfiguration: " + getImageTestsConfiguration() + ",");
        if (getEnhancedImageMetadataEnabled() != null)
            sb.append("enhancedImageMetadataEnabled: " + getEnhancedImageMetadataEnabled() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getClientToken() != null)
            sb.append("clientToken: " + getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getImageRecipeArn() == null) ? 0 : getImageRecipeArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getDistributionConfigurationArn() == null) ? 0
                        : getDistributionConfigurationArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getInfrastructureConfigurationArn() == null) ? 0
                        : getInfrastructureConfigurationArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getImageTestsConfiguration() == null) ? 0 : getImageTestsConfiguration()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEnhancedImageMetadataEnabled() == null) ? 0
                        : getEnhancedImageMetadataEnabled().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateImageRequest == false)
            return false;
        CreateImageRequest other = (CreateImageRequest) obj;

        if (other.getImageRecipeArn() == null ^ this.getImageRecipeArn() == null)
            return false;
        if (other.getImageRecipeArn() != null
                && other.getImageRecipeArn().equals(this.getImageRecipeArn()) == false)
            return false;
        if (other.getDistributionConfigurationArn() == null
                ^ this.getDistributionConfigurationArn() == null)
            return false;
        if (other.getDistributionConfigurationArn() != null
                && other.getDistributionConfigurationArn().equals(
                        this.getDistributionConfigurationArn()) == false)
            return false;
        if (other.getInfrastructureConfigurationArn() == null
                ^ this.getInfrastructureConfigurationArn() == null)
            return false;
        if (other.getInfrastructureConfigurationArn() != null
                && other.getInfrastructureConfigurationArn().equals(
                        this.getInfrastructureConfigurationArn()) == false)
            return false;
        if (other.getImageTestsConfiguration() == null ^ this.getImageTestsConfiguration() == null)
            return false;
        if (other.getImageTestsConfiguration() != null
                && other.getImageTestsConfiguration().equals(this.getImageTestsConfiguration()) == false)
            return false;
        if (other.getEnhancedImageMetadataEnabled() == null
                ^ this.getEnhancedImageMetadataEnabled() == null)
            return false;
        if (other.getEnhancedImageMetadataEnabled() != null
                && other.getEnhancedImageMetadataEnabled().equals(
                        this.getEnhancedImageMetadataEnabled()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }
}
