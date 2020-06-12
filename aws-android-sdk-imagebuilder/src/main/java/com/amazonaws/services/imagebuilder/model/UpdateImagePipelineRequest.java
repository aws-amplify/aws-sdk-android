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

package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates a new image pipeline. Image pipelines enable you to automate the
 * creation and distribution of images.
 * </p>
 */
public class UpdateImagePipelineRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline that you want to
     * update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):image-pipeline
     * /[a-z0-9-_]+$<br/>
     */
    private String imagePipelineArn;

    /**
     * <p>
     * The description of the image pipeline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe that will be used to
     * configure images updated by this image pipeline.
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
     * The Amazon Resource Name (ARN) of the infrastructure configuration that
     * will be used to build images updated by this image pipeline.
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
     * The Amazon Resource Name (ARN) of the distribution configuration that
     * will be used to configure and distribute images updated by this image
     * pipeline.
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
     * The image test configuration of the image pipeline.
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
     * The schedule of the image pipeline.
     * </p>
     */
    private Schedule schedule;

    /**
     * <p>
     * The status of the image pipeline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     */
    private String status;

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
     * The Amazon Resource Name (ARN) of the image pipeline that you want to
     * update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):image-pipeline
     * /[a-z0-9-_]+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the image pipeline that you
     *         want to update.
     *         </p>
     */
    public String getImagePipelineArn() {
        return imagePipelineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline that you want to
     * update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):image-pipeline
     * /[a-z0-9-_]+$<br/>
     *
     * @param imagePipelineArn <p>
     *            The Amazon Resource Name (ARN) of the image pipeline that you
     *            want to update.
     *            </p>
     */
    public void setImagePipelineArn(String imagePipelineArn) {
        this.imagePipelineArn = imagePipelineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline that you want to
     * update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):image-pipeline
     * /[a-z0-9-_]+$<br/>
     *
     * @param imagePipelineArn <p>
     *            The Amazon Resource Name (ARN) of the image pipeline that you
     *            want to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateImagePipelineRequest withImagePipelineArn(String imagePipelineArn) {
        this.imagePipelineArn = imagePipelineArn;
        return this;
    }

    /**
     * <p>
     * The description of the image pipeline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The description of the image pipeline.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the image pipeline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            The description of the image pipeline.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the image pipeline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            The description of the image pipeline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateImagePipelineRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe that will be used to
     * configure images updated by this image pipeline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):image-recipe
     * /[a-z0-9-_]+/\d+\.\d+\.\d+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the image recipe that will be
     *         used to configure images updated by this image pipeline.
     *         </p>
     */
    public String getImageRecipeArn() {
        return imageRecipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe that will be used to
     * configure images updated by this image pipeline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):image-recipe
     * /[a-z0-9-_]+/\d+\.\d+\.\d+$<br/>
     *
     * @param imageRecipeArn <p>
     *            The Amazon Resource Name (ARN) of the image recipe that will
     *            be used to configure images updated by this image pipeline.
     *            </p>
     */
    public void setImageRecipeArn(String imageRecipeArn) {
        this.imageRecipeArn = imageRecipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe that will be used to
     * configure images updated by this image pipeline.
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
     *            The Amazon Resource Name (ARN) of the image recipe that will
     *            be used to configure images updated by this image pipeline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateImagePipelineRequest withImageRecipeArn(String imageRecipeArn) {
        this.imageRecipeArn = imageRecipeArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration that
     * will be used to build images updated by this image pipeline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):infrastructure
     * -configuration/[a-z0-9-_]+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the infrastructure
     *         configuration that will be used to build images updated by this
     *         image pipeline.
     *         </p>
     */
    public String getInfrastructureConfigurationArn() {
        return infrastructureConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration that
     * will be used to build images updated by this image pipeline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):infrastructure
     * -configuration/[a-z0-9-_]+$<br/>
     *
     * @param infrastructureConfigurationArn <p>
     *            The Amazon Resource Name (ARN) of the infrastructure
     *            configuration that will be used to build images updated by
     *            this image pipeline.
     *            </p>
     */
    public void setInfrastructureConfigurationArn(String infrastructureConfigurationArn) {
        this.infrastructureConfigurationArn = infrastructureConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration that
     * will be used to build images updated by this image pipeline.
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
     *            configuration that will be used to build images updated by
     *            this image pipeline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateImagePipelineRequest withInfrastructureConfigurationArn(
            String infrastructureConfigurationArn) {
        this.infrastructureConfigurationArn = infrastructureConfigurationArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration that
     * will be used to configure and distribute images updated by this image
     * pipeline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):distribution
     * -configuration/[a-z0-9-_]+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the distribution configuration
     *         that will be used to configure and distribute images updated by
     *         this image pipeline.
     *         </p>
     */
    public String getDistributionConfigurationArn() {
        return distributionConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration that
     * will be used to configure and distribute images updated by this image
     * pipeline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):distribution
     * -configuration/[a-z0-9-_]+$<br/>
     *
     * @param distributionConfigurationArn <p>
     *            The Amazon Resource Name (ARN) of the distribution
     *            configuration that will be used to configure and distribute
     *            images updated by this image pipeline.
     *            </p>
     */
    public void setDistributionConfigurationArn(String distributionConfigurationArn) {
        this.distributionConfigurationArn = distributionConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration that
     * will be used to configure and distribute images updated by this image
     * pipeline.
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
     *            configuration that will be used to configure and distribute
     *            images updated by this image pipeline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateImagePipelineRequest withDistributionConfigurationArn(
            String distributionConfigurationArn) {
        this.distributionConfigurationArn = distributionConfigurationArn;
        return this;
    }

    /**
     * <p>
     * The image test configuration of the image pipeline.
     * </p>
     *
     * @return <p>
     *         The image test configuration of the image pipeline.
     *         </p>
     */
    public ImageTestsConfiguration getImageTestsConfiguration() {
        return imageTestsConfiguration;
    }

    /**
     * <p>
     * The image test configuration of the image pipeline.
     * </p>
     *
     * @param imageTestsConfiguration <p>
     *            The image test configuration of the image pipeline.
     *            </p>
     */
    public void setImageTestsConfiguration(ImageTestsConfiguration imageTestsConfiguration) {
        this.imageTestsConfiguration = imageTestsConfiguration;
    }

    /**
     * <p>
     * The image test configuration of the image pipeline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageTestsConfiguration <p>
     *            The image test configuration of the image pipeline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateImagePipelineRequest withImageTestsConfiguration(
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
    public UpdateImagePipelineRequest withEnhancedImageMetadataEnabled(
            Boolean enhancedImageMetadataEnabled) {
        this.enhancedImageMetadataEnabled = enhancedImageMetadataEnabled;
        return this;
    }

    /**
     * <p>
     * The schedule of the image pipeline.
     * </p>
     *
     * @return <p>
     *         The schedule of the image pipeline.
     *         </p>
     */
    public Schedule getSchedule() {
        return schedule;
    }

    /**
     * <p>
     * The schedule of the image pipeline.
     * </p>
     *
     * @param schedule <p>
     *            The schedule of the image pipeline.
     *            </p>
     */
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The schedule of the image pipeline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schedule <p>
     *            The schedule of the image pipeline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateImagePipelineRequest withSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * <p>
     * The status of the image pipeline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return <p>
     *         The status of the image pipeline.
     *         </p>
     * @see PipelineStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the image pipeline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param status <p>
     *            The status of the image pipeline.
     *            </p>
     * @see PipelineStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the image pipeline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param status <p>
     *            The status of the image pipeline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PipelineStatus
     */
    public UpdateImagePipelineRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the image pipeline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param status <p>
     *            The status of the image pipeline.
     *            </p>
     * @see PipelineStatus
     */
    public void setStatus(PipelineStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the image pipeline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param status <p>
     *            The status of the image pipeline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PipelineStatus
     */
    public UpdateImagePipelineRequest withStatus(PipelineStatus status) {
        this.status = status.toString();
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
    public UpdateImagePipelineRequest withClientToken(String clientToken) {
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
        if (getImagePipelineArn() != null)
            sb.append("imagePipelineArn: " + getImagePipelineArn() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getImageRecipeArn() != null)
            sb.append("imageRecipeArn: " + getImageRecipeArn() + ",");
        if (getInfrastructureConfigurationArn() != null)
            sb.append("infrastructureConfigurationArn: " + getInfrastructureConfigurationArn()
                    + ",");
        if (getDistributionConfigurationArn() != null)
            sb.append("distributionConfigurationArn: " + getDistributionConfigurationArn() + ",");
        if (getImageTestsConfiguration() != null)
            sb.append("imageTestsConfiguration: " + getImageTestsConfiguration() + ",");
        if (getEnhancedImageMetadataEnabled() != null)
            sb.append("enhancedImageMetadataEnabled: " + getEnhancedImageMetadataEnabled() + ",");
        if (getSchedule() != null)
            sb.append("schedule: " + getSchedule() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
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
                + ((getImagePipelineArn() == null) ? 0 : getImagePipelineArn().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getImageRecipeArn() == null) ? 0 : getImageRecipeArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getInfrastructureConfigurationArn() == null) ? 0
                        : getInfrastructureConfigurationArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getDistributionConfigurationArn() == null) ? 0
                        : getDistributionConfigurationArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getImageTestsConfiguration() == null) ? 0 : getImageTestsConfiguration()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEnhancedImageMetadataEnabled() == null) ? 0
                        : getEnhancedImageMetadataEnabled().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
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

        if (obj instanceof UpdateImagePipelineRequest == false)
            return false;
        UpdateImagePipelineRequest other = (UpdateImagePipelineRequest) obj;

        if (other.getImagePipelineArn() == null ^ this.getImagePipelineArn() == null)
            return false;
        if (other.getImagePipelineArn() != null
                && other.getImagePipelineArn().equals(this.getImagePipelineArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getImageRecipeArn() == null ^ this.getImageRecipeArn() == null)
            return false;
        if (other.getImageRecipeArn() != null
                && other.getImageRecipeArn().equals(this.getImageRecipeArn()) == false)
            return false;
        if (other.getInfrastructureConfigurationArn() == null
                ^ this.getInfrastructureConfigurationArn() == null)
            return false;
        if (other.getInfrastructureConfigurationArn() != null
                && other.getInfrastructureConfigurationArn().equals(
                        this.getInfrastructureConfigurationArn()) == false)
            return false;
        if (other.getDistributionConfigurationArn() == null
                ^ this.getDistributionConfigurationArn() == null)
            return false;
        if (other.getDistributionConfigurationArn() != null
                && other.getDistributionConfigurationArn().equals(
                        this.getDistributionConfigurationArn()) == false)
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
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }
}
