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

/**
 * <p>
 * Details of an image pipeline.
 * </p>
 */
public class ImagePipeline implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):(?:image-recipe
     * |infrastructure
     * -configuration|distribution-configuration|component|image|image
     * -pipeline)/[a-z0-9-_]+(?:/(?:(?:x|\d+)\.(?:x|\d+)\.(?:x|\d+))(?:/\d+)?)?$
     * <br/>
     */
    private String arn;

    /**
     * <p>
     * The name of the image pipeline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[-_A-Za-z-0-9][-_A-Za-z0-9 ]{1,126}[-_A-Za-z-0-9]$<br/>
     */
    private String name;

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
     * The platform of the image pipeline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows, Linux
     */
    private String platform;

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
     * The Amazon Resource Name (ARN) of the image recipe associated with this
     * image pipeline.
     * </p>
     */
    private String imageRecipeArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration
     * associated with this image pipeline.
     * </p>
     */
    private String infrastructureConfigurationArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration
     * associated with this image pipeline.
     * </p>
     */
    private String distributionConfigurationArn;

    /**
     * <p>
     * The image tests configuration of the image pipeline.
     * </p>
     */
    private ImageTestsConfiguration imageTestsConfiguration;

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
     * The date on which this image pipeline was created.
     * </p>
     */
    private String dateCreated;

    /**
     * <p>
     * The date on which this image pipeline was last updated.
     * </p>
     */
    private String dateUpdated;

    /**
     * <p>
     * The date on which this image pipeline was last run.
     * </p>
     */
    private String dateLastRun;

    /**
     * <p>
     * The date on which this image pipeline will next be run.
     * </p>
     */
    private String dateNextRun;

    /**
     * <p>
     * The tags of this image pipeline.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):(?:image-recipe
     * |infrastructure
     * -configuration|distribution-configuration|component|image|image
     * -pipeline)/[a-z0-9-_]+(?:/(?:(?:x|\d+)\.(?:x|\d+)\.(?:x|\d+))(?:/\d+)?)?$
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the image pipeline.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):(?:image-recipe
     * |infrastructure
     * -configuration|distribution-configuration|component|image|image
     * -pipeline)/[a-z0-9-_]+(?:/(?:(?:x|\d+)\.(?:x|\d+)\.(?:x|\d+))(?:/\d+)?)?$
     * <br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the image pipeline.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):(?:image-recipe
     * |infrastructure
     * -configuration|distribution-configuration|component|image|image
     * -pipeline)/[a-z0-9-_]+(?:/(?:(?:x|\d+)\.(?:x|\d+)\.(?:x|\d+))(?:/\d+)?)?$
     * <br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the image pipeline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImagePipeline withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The name of the image pipeline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[-_A-Za-z-0-9][-_A-Za-z0-9 ]{1,126}[-_A-Za-z-0-9]$<br/>
     *
     * @return <p>
     *         The name of the image pipeline.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the image pipeline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[-_A-Za-z-0-9][-_A-Za-z0-9 ]{1,126}[-_A-Za-z-0-9]$<br/>
     *
     * @param name <p>
     *            The name of the image pipeline.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the image pipeline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[-_A-Za-z-0-9][-_A-Za-z0-9 ]{1,126}[-_A-Za-z-0-9]$<br/>
     *
     * @param name <p>
     *            The name of the image pipeline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImagePipeline withName(String name) {
        this.name = name;
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
    public ImagePipeline withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The platform of the image pipeline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows, Linux
     *
     * @return <p>
     *         The platform of the image pipeline.
     *         </p>
     * @see Platform
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * <p>
     * The platform of the image pipeline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows, Linux
     *
     * @param platform <p>
     *            The platform of the image pipeline.
     *            </p>
     * @see Platform
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform of the image pipeline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows, Linux
     *
     * @param platform <p>
     *            The platform of the image pipeline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Platform
     */
    public ImagePipeline withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * <p>
     * The platform of the image pipeline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows, Linux
     *
     * @param platform <p>
     *            The platform of the image pipeline.
     *            </p>
     * @see Platform
     */
    public void setPlatform(Platform platform) {
        this.platform = platform.toString();
    }

    /**
     * <p>
     * The platform of the image pipeline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows, Linux
     *
     * @param platform <p>
     *            The platform of the image pipeline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Platform
     */
    public ImagePipeline withPlatform(Platform platform) {
        this.platform = platform.toString();
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
    public ImagePipeline withEnhancedImageMetadataEnabled(Boolean enhancedImageMetadataEnabled) {
        this.enhancedImageMetadataEnabled = enhancedImageMetadataEnabled;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe associated with this
     * image pipeline.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the image recipe associated
     *         with this image pipeline.
     *         </p>
     */
    public String getImageRecipeArn() {
        return imageRecipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe associated with this
     * image pipeline.
     * </p>
     *
     * @param imageRecipeArn <p>
     *            The Amazon Resource Name (ARN) of the image recipe associated
     *            with this image pipeline.
     *            </p>
     */
    public void setImageRecipeArn(String imageRecipeArn) {
        this.imageRecipeArn = imageRecipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe associated with this
     * image pipeline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageRecipeArn <p>
     *            The Amazon Resource Name (ARN) of the image recipe associated
     *            with this image pipeline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImagePipeline withImageRecipeArn(String imageRecipeArn) {
        this.imageRecipeArn = imageRecipeArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration
     * associated with this image pipeline.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the infrastructure
     *         configuration associated with this image pipeline.
     *         </p>
     */
    public String getInfrastructureConfigurationArn() {
        return infrastructureConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration
     * associated with this image pipeline.
     * </p>
     *
     * @param infrastructureConfigurationArn <p>
     *            The Amazon Resource Name (ARN) of the infrastructure
     *            configuration associated with this image pipeline.
     *            </p>
     */
    public void setInfrastructureConfigurationArn(String infrastructureConfigurationArn) {
        this.infrastructureConfigurationArn = infrastructureConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration
     * associated with this image pipeline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param infrastructureConfigurationArn <p>
     *            The Amazon Resource Name (ARN) of the infrastructure
     *            configuration associated with this image pipeline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImagePipeline withInfrastructureConfigurationArn(String infrastructureConfigurationArn) {
        this.infrastructureConfigurationArn = infrastructureConfigurationArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration
     * associated with this image pipeline.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the distribution configuration
     *         associated with this image pipeline.
     *         </p>
     */
    public String getDistributionConfigurationArn() {
        return distributionConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration
     * associated with this image pipeline.
     * </p>
     *
     * @param distributionConfigurationArn <p>
     *            The Amazon Resource Name (ARN) of the distribution
     *            configuration associated with this image pipeline.
     *            </p>
     */
    public void setDistributionConfigurationArn(String distributionConfigurationArn) {
        this.distributionConfigurationArn = distributionConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the distribution configuration
     * associated with this image pipeline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param distributionConfigurationArn <p>
     *            The Amazon Resource Name (ARN) of the distribution
     *            configuration associated with this image pipeline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImagePipeline withDistributionConfigurationArn(String distributionConfigurationArn) {
        this.distributionConfigurationArn = distributionConfigurationArn;
        return this;
    }

    /**
     * <p>
     * The image tests configuration of the image pipeline.
     * </p>
     *
     * @return <p>
     *         The image tests configuration of the image pipeline.
     *         </p>
     */
    public ImageTestsConfiguration getImageTestsConfiguration() {
        return imageTestsConfiguration;
    }

    /**
     * <p>
     * The image tests configuration of the image pipeline.
     * </p>
     *
     * @param imageTestsConfiguration <p>
     *            The image tests configuration of the image pipeline.
     *            </p>
     */
    public void setImageTestsConfiguration(ImageTestsConfiguration imageTestsConfiguration) {
        this.imageTestsConfiguration = imageTestsConfiguration;
    }

    /**
     * <p>
     * The image tests configuration of the image pipeline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageTestsConfiguration <p>
     *            The image tests configuration of the image pipeline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImagePipeline withImageTestsConfiguration(ImageTestsConfiguration imageTestsConfiguration) {
        this.imageTestsConfiguration = imageTestsConfiguration;
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
    public ImagePipeline withSchedule(Schedule schedule) {
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
    public ImagePipeline withStatus(String status) {
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
    public ImagePipeline withStatus(PipelineStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date on which this image pipeline was created.
     * </p>
     *
     * @return <p>
     *         The date on which this image pipeline was created.
     *         </p>
     */
    public String getDateCreated() {
        return dateCreated;
    }

    /**
     * <p>
     * The date on which this image pipeline was created.
     * </p>
     *
     * @param dateCreated <p>
     *            The date on which this image pipeline was created.
     *            </p>
     */
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The date on which this image pipeline was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateCreated <p>
     *            The date on which this image pipeline was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImagePipeline withDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    /**
     * <p>
     * The date on which this image pipeline was last updated.
     * </p>
     *
     * @return <p>
     *         The date on which this image pipeline was last updated.
     *         </p>
     */
    public String getDateUpdated() {
        return dateUpdated;
    }

    /**
     * <p>
     * The date on which this image pipeline was last updated.
     * </p>
     *
     * @param dateUpdated <p>
     *            The date on which this image pipeline was last updated.
     *            </p>
     */
    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    /**
     * <p>
     * The date on which this image pipeline was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateUpdated <p>
     *            The date on which this image pipeline was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImagePipeline withDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
        return this;
    }

    /**
     * <p>
     * The date on which this image pipeline was last run.
     * </p>
     *
     * @return <p>
     *         The date on which this image pipeline was last run.
     *         </p>
     */
    public String getDateLastRun() {
        return dateLastRun;
    }

    /**
     * <p>
     * The date on which this image pipeline was last run.
     * </p>
     *
     * @param dateLastRun <p>
     *            The date on which this image pipeline was last run.
     *            </p>
     */
    public void setDateLastRun(String dateLastRun) {
        this.dateLastRun = dateLastRun;
    }

    /**
     * <p>
     * The date on which this image pipeline was last run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateLastRun <p>
     *            The date on which this image pipeline was last run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImagePipeline withDateLastRun(String dateLastRun) {
        this.dateLastRun = dateLastRun;
        return this;
    }

    /**
     * <p>
     * The date on which this image pipeline will next be run.
     * </p>
     *
     * @return <p>
     *         The date on which this image pipeline will next be run.
     *         </p>
     */
    public String getDateNextRun() {
        return dateNextRun;
    }

    /**
     * <p>
     * The date on which this image pipeline will next be run.
     * </p>
     *
     * @param dateNextRun <p>
     *            The date on which this image pipeline will next be run.
     *            </p>
     */
    public void setDateNextRun(String dateNextRun) {
        this.dateNextRun = dateNextRun;
    }

    /**
     * <p>
     * The date on which this image pipeline will next be run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateNextRun <p>
     *            The date on which this image pipeline will next be run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImagePipeline withDateNextRun(String dateNextRun) {
        this.dateNextRun = dateNextRun;
        return this;
    }

    /**
     * <p>
     * The tags of this image pipeline.
     * </p>
     *
     * @return <p>
     *         The tags of this image pipeline.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of this image pipeline.
     * </p>
     *
     * @param tags <p>
     *            The tags of this image pipeline.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags of this image pipeline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags of this image pipeline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImagePipeline withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags of this image pipeline.
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
    public ImagePipeline addtagsEntry(String key, String value) {
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
    public ImagePipeline cleartagsEntries() {
        this.tags = null;
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
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getPlatform() != null)
            sb.append("platform: " + getPlatform() + ",");
        if (getEnhancedImageMetadataEnabled() != null)
            sb.append("enhancedImageMetadataEnabled: " + getEnhancedImageMetadataEnabled() + ",");
        if (getImageRecipeArn() != null)
            sb.append("imageRecipeArn: " + getImageRecipeArn() + ",");
        if (getInfrastructureConfigurationArn() != null)
            sb.append("infrastructureConfigurationArn: " + getInfrastructureConfigurationArn()
                    + ",");
        if (getDistributionConfigurationArn() != null)
            sb.append("distributionConfigurationArn: " + getDistributionConfigurationArn() + ",");
        if (getImageTestsConfiguration() != null)
            sb.append("imageTestsConfiguration: " + getImageTestsConfiguration() + ",");
        if (getSchedule() != null)
            sb.append("schedule: " + getSchedule() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getDateCreated() != null)
            sb.append("dateCreated: " + getDateCreated() + ",");
        if (getDateUpdated() != null)
            sb.append("dateUpdated: " + getDateUpdated() + ",");
        if (getDateLastRun() != null)
            sb.append("dateLastRun: " + getDateLastRun() + ",");
        if (getDateNextRun() != null)
            sb.append("dateNextRun: " + getDateNextRun() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnhancedImageMetadataEnabled() == null) ? 0
                        : getEnhancedImageMetadataEnabled().hashCode());
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
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode
                + ((getDateUpdated() == null) ? 0 : getDateUpdated().hashCode());
        hashCode = prime * hashCode
                + ((getDateLastRun() == null) ? 0 : getDateLastRun().hashCode());
        hashCode = prime * hashCode
                + ((getDateNextRun() == null) ? 0 : getDateNextRun().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImagePipeline == false)
            return false;
        ImagePipeline other = (ImagePipeline) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getEnhancedImageMetadataEnabled() == null
                ^ this.getEnhancedImageMetadataEnabled() == null)
            return false;
        if (other.getEnhancedImageMetadataEnabled() != null
                && other.getEnhancedImageMetadataEnabled().equals(
                        this.getEnhancedImageMetadataEnabled()) == false)
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
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null
                && other.getDateCreated().equals(this.getDateCreated()) == false)
            return false;
        if (other.getDateUpdated() == null ^ this.getDateUpdated() == null)
            return false;
        if (other.getDateUpdated() != null
                && other.getDateUpdated().equals(this.getDateUpdated()) == false)
            return false;
        if (other.getDateLastRun() == null ^ this.getDateLastRun() == null)
            return false;
        if (other.getDateLastRun() != null
                && other.getDateLastRun().equals(this.getDateLastRun()) == false)
            return false;
        if (other.getDateNextRun() == null ^ this.getDateNextRun() == null)
            return false;
        if (other.getDateNextRun() != null
                && other.getDateNextRun().equals(this.getDateNextRun()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
