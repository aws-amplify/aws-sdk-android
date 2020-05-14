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
 * An image build version.
 * </p>
 */
public class Image implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image.
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
     * The name of the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[-_A-Za-z-0-9][-_A-Za-z0-9 ]{1,126}[-_A-Za-z-0-9]$<br/>
     */
    private String name;

    /**
     * <p>
     * The semantic version of the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]+\.[0-9]+\.[0-9]+$<br/>
     */
    private String version;

    /**
     * <p>
     * The platform of the image.
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
     * The operating system version of the instance. For example, Amazon Linux
     * 2, Ubuntu 18, or Microsoft Windows Server 2019.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String osVersion;

    /**
     * <p>
     * The state of the image.
     * </p>
     */
    private ImageState state;

    /**
     * <p>
     * The image recipe used when creating the image.
     * </p>
     */
    private ImageRecipe imageRecipe;

    /**
     * <p>
     * The name of the image pipeline that created this image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[-_A-Za-z-0-9][-_A-Za-z0-9 ]{1,126}[-_A-Za-z-0-9]$<br/>
     */
    private String sourcePipelineName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline that created this
     * image.
     * </p>
     */
    private String sourcePipelineArn;

    /**
     * <p>
     * The infrastructure used when creating this image.
     * </p>
     */
    private InfrastructureConfiguration infrastructureConfiguration;

    /**
     * <p>
     * The distribution configuration used when creating this image.
     * </p>
     */
    private DistributionConfiguration distributionConfiguration;

    /**
     * <p>
     * The image tests configuration used when creating this image.
     * </p>
     */
    private ImageTestsConfiguration imageTestsConfiguration;

    /**
     * <p>
     * The date on which this image was created.
     * </p>
     */
    private String dateCreated;

    /**
     * <p>
     * The output resources produced when creating this image.
     * </p>
     */
    private OutputResources outputResources;

    /**
     * <p>
     * The tags of the image.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image.
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
     *         The Amazon Resource Name (ARN) of the image.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image.
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
     *            The Amazon Resource Name (ARN) of the image.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image.
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
     *            The Amazon Resource Name (ARN) of the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The name of the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[-_A-Za-z-0-9][-_A-Za-z0-9 ]{1,126}[-_A-Za-z-0-9]$<br/>
     *
     * @return <p>
     *         The name of the image.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[-_A-Za-z-0-9][-_A-Za-z0-9 ]{1,126}[-_A-Za-z-0-9]$<br/>
     *
     * @param name <p>
     *            The name of the image.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[-_A-Za-z-0-9][-_A-Za-z0-9 ]{1,126}[-_A-Za-z-0-9]$<br/>
     *
     * @param name <p>
     *            The name of the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The semantic version of the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]+\.[0-9]+\.[0-9]+$<br/>
     *
     * @return <p>
     *         The semantic version of the image.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * The semantic version of the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]+\.[0-9]+\.[0-9]+$<br/>
     *
     * @param version <p>
     *            The semantic version of the image.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The semantic version of the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]+\.[0-9]+\.[0-9]+$<br/>
     *
     * @param version <p>
     *            The semantic version of the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The platform of the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows, Linux
     *
     * @return <p>
     *         The platform of the image.
     *         </p>
     * @see Platform
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * <p>
     * The platform of the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows, Linux
     *
     * @param platform <p>
     *            The platform of the image.
     *            </p>
     * @see Platform
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform of the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows, Linux
     *
     * @param platform <p>
     *            The platform of the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Platform
     */
    public Image withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * <p>
     * The platform of the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows, Linux
     *
     * @param platform <p>
     *            The platform of the image.
     *            </p>
     * @see Platform
     */
    public void setPlatform(Platform platform) {
        this.platform = platform.toString();
    }

    /**
     * <p>
     * The platform of the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows, Linux
     *
     * @param platform <p>
     *            The platform of the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Platform
     */
    public Image withPlatform(Platform platform) {
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
    public Image withEnhancedImageMetadataEnabled(Boolean enhancedImageMetadataEnabled) {
        this.enhancedImageMetadataEnabled = enhancedImageMetadataEnabled;
        return this;
    }

    /**
     * <p>
     * The operating system version of the instance. For example, Amazon Linux
     * 2, Ubuntu 18, or Microsoft Windows Server 2019.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The operating system version of the instance. For example, Amazon
     *         Linux 2, Ubuntu 18, or Microsoft Windows Server 2019.
     *         </p>
     */
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * <p>
     * The operating system version of the instance. For example, Amazon Linux
     * 2, Ubuntu 18, or Microsoft Windows Server 2019.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param osVersion <p>
     *            The operating system version of the instance. For example,
     *            Amazon Linux 2, Ubuntu 18, or Microsoft Windows Server 2019.
     *            </p>
     */
    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    /**
     * <p>
     * The operating system version of the instance. For example, Amazon Linux
     * 2, Ubuntu 18, or Microsoft Windows Server 2019.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param osVersion <p>
     *            The operating system version of the instance. For example,
     *            Amazon Linux 2, Ubuntu 18, or Microsoft Windows Server 2019.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * <p>
     * The state of the image.
     * </p>
     *
     * @return <p>
     *         The state of the image.
     *         </p>
     */
    public ImageState getState() {
        return state;
    }

    /**
     * <p>
     * The state of the image.
     * </p>
     *
     * @param state <p>
     *            The state of the image.
     *            </p>
     */
    public void setState(ImageState state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param state <p>
     *            The state of the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withState(ImageState state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The image recipe used when creating the image.
     * </p>
     *
     * @return <p>
     *         The image recipe used when creating the image.
     *         </p>
     */
    public ImageRecipe getImageRecipe() {
        return imageRecipe;
    }

    /**
     * <p>
     * The image recipe used when creating the image.
     * </p>
     *
     * @param imageRecipe <p>
     *            The image recipe used when creating the image.
     *            </p>
     */
    public void setImageRecipe(ImageRecipe imageRecipe) {
        this.imageRecipe = imageRecipe;
    }

    /**
     * <p>
     * The image recipe used when creating the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageRecipe <p>
     *            The image recipe used when creating the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withImageRecipe(ImageRecipe imageRecipe) {
        this.imageRecipe = imageRecipe;
        return this;
    }

    /**
     * <p>
     * The name of the image pipeline that created this image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[-_A-Za-z-0-9][-_A-Za-z0-9 ]{1,126}[-_A-Za-z-0-9]$<br/>
     *
     * @return <p>
     *         The name of the image pipeline that created this image.
     *         </p>
     */
    public String getSourcePipelineName() {
        return sourcePipelineName;
    }

    /**
     * <p>
     * The name of the image pipeline that created this image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[-_A-Za-z-0-9][-_A-Za-z0-9 ]{1,126}[-_A-Za-z-0-9]$<br/>
     *
     * @param sourcePipelineName <p>
     *            The name of the image pipeline that created this image.
     *            </p>
     */
    public void setSourcePipelineName(String sourcePipelineName) {
        this.sourcePipelineName = sourcePipelineName;
    }

    /**
     * <p>
     * The name of the image pipeline that created this image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[-_A-Za-z-0-9][-_A-Za-z0-9 ]{1,126}[-_A-Za-z-0-9]$<br/>
     *
     * @param sourcePipelineName <p>
     *            The name of the image pipeline that created this image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withSourcePipelineName(String sourcePipelineName) {
        this.sourcePipelineName = sourcePipelineName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline that created this
     * image.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the image pipeline that created
     *         this image.
     *         </p>
     */
    public String getSourcePipelineArn() {
        return sourcePipelineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline that created this
     * image.
     * </p>
     *
     * @param sourcePipelineArn <p>
     *            The Amazon Resource Name (ARN) of the image pipeline that
     *            created this image.
     *            </p>
     */
    public void setSourcePipelineArn(String sourcePipelineArn) {
        this.sourcePipelineArn = sourcePipelineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline that created this
     * image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourcePipelineArn <p>
     *            The Amazon Resource Name (ARN) of the image pipeline that
     *            created this image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withSourcePipelineArn(String sourcePipelineArn) {
        this.sourcePipelineArn = sourcePipelineArn;
        return this;
    }

    /**
     * <p>
     * The infrastructure used when creating this image.
     * </p>
     *
     * @return <p>
     *         The infrastructure used when creating this image.
     *         </p>
     */
    public InfrastructureConfiguration getInfrastructureConfiguration() {
        return infrastructureConfiguration;
    }

    /**
     * <p>
     * The infrastructure used when creating this image.
     * </p>
     *
     * @param infrastructureConfiguration <p>
     *            The infrastructure used when creating this image.
     *            </p>
     */
    public void setInfrastructureConfiguration(
            InfrastructureConfiguration infrastructureConfiguration) {
        this.infrastructureConfiguration = infrastructureConfiguration;
    }

    /**
     * <p>
     * The infrastructure used when creating this image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param infrastructureConfiguration <p>
     *            The infrastructure used when creating this image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withInfrastructureConfiguration(
            InfrastructureConfiguration infrastructureConfiguration) {
        this.infrastructureConfiguration = infrastructureConfiguration;
        return this;
    }

    /**
     * <p>
     * The distribution configuration used when creating this image.
     * </p>
     *
     * @return <p>
     *         The distribution configuration used when creating this image.
     *         </p>
     */
    public DistributionConfiguration getDistributionConfiguration() {
        return distributionConfiguration;
    }

    /**
     * <p>
     * The distribution configuration used when creating this image.
     * </p>
     *
     * @param distributionConfiguration <p>
     *            The distribution configuration used when creating this image.
     *            </p>
     */
    public void setDistributionConfiguration(DistributionConfiguration distributionConfiguration) {
        this.distributionConfiguration = distributionConfiguration;
    }

    /**
     * <p>
     * The distribution configuration used when creating this image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param distributionConfiguration <p>
     *            The distribution configuration used when creating this image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withDistributionConfiguration(DistributionConfiguration distributionConfiguration) {
        this.distributionConfiguration = distributionConfiguration;
        return this;
    }

    /**
     * <p>
     * The image tests configuration used when creating this image.
     * </p>
     *
     * @return <p>
     *         The image tests configuration used when creating this image.
     *         </p>
     */
    public ImageTestsConfiguration getImageTestsConfiguration() {
        return imageTestsConfiguration;
    }

    /**
     * <p>
     * The image tests configuration used when creating this image.
     * </p>
     *
     * @param imageTestsConfiguration <p>
     *            The image tests configuration used when creating this image.
     *            </p>
     */
    public void setImageTestsConfiguration(ImageTestsConfiguration imageTestsConfiguration) {
        this.imageTestsConfiguration = imageTestsConfiguration;
    }

    /**
     * <p>
     * The image tests configuration used when creating this image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageTestsConfiguration <p>
     *            The image tests configuration used when creating this image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withImageTestsConfiguration(ImageTestsConfiguration imageTestsConfiguration) {
        this.imageTestsConfiguration = imageTestsConfiguration;
        return this;
    }

    /**
     * <p>
     * The date on which this image was created.
     * </p>
     *
     * @return <p>
     *         The date on which this image was created.
     *         </p>
     */
    public String getDateCreated() {
        return dateCreated;
    }

    /**
     * <p>
     * The date on which this image was created.
     * </p>
     *
     * @param dateCreated <p>
     *            The date on which this image was created.
     *            </p>
     */
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The date on which this image was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateCreated <p>
     *            The date on which this image was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    /**
     * <p>
     * The output resources produced when creating this image.
     * </p>
     *
     * @return <p>
     *         The output resources produced when creating this image.
     *         </p>
     */
    public OutputResources getOutputResources() {
        return outputResources;
    }

    /**
     * <p>
     * The output resources produced when creating this image.
     * </p>
     *
     * @param outputResources <p>
     *            The output resources produced when creating this image.
     *            </p>
     */
    public void setOutputResources(OutputResources outputResources) {
        this.outputResources = outputResources;
    }

    /**
     * <p>
     * The output resources produced when creating this image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputResources <p>
     *            The output resources produced when creating this image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withOutputResources(OutputResources outputResources) {
        this.outputResources = outputResources;
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
    public Image withTags(java.util.Map<String, String> tags) {
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
    public Image addtagsEntry(String key, String value) {
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
    public Image cleartagsEntries() {
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
        if (getVersion() != null)
            sb.append("version: " + getVersion() + ",");
        if (getPlatform() != null)
            sb.append("platform: " + getPlatform() + ",");
        if (getEnhancedImageMetadataEnabled() != null)
            sb.append("enhancedImageMetadataEnabled: " + getEnhancedImageMetadataEnabled() + ",");
        if (getOsVersion() != null)
            sb.append("osVersion: " + getOsVersion() + ",");
        if (getState() != null)
            sb.append("state: " + getState() + ",");
        if (getImageRecipe() != null)
            sb.append("imageRecipe: " + getImageRecipe() + ",");
        if (getSourcePipelineName() != null)
            sb.append("sourcePipelineName: " + getSourcePipelineName() + ",");
        if (getSourcePipelineArn() != null)
            sb.append("sourcePipelineArn: " + getSourcePipelineArn() + ",");
        if (getInfrastructureConfiguration() != null)
            sb.append("infrastructureConfiguration: " + getInfrastructureConfiguration() + ",");
        if (getDistributionConfiguration() != null)
            sb.append("distributionConfiguration: " + getDistributionConfiguration() + ",");
        if (getImageTestsConfiguration() != null)
            sb.append("imageTestsConfiguration: " + getImageTestsConfiguration() + ",");
        if (getDateCreated() != null)
            sb.append("dateCreated: " + getDateCreated() + ",");
        if (getOutputResources() != null)
            sb.append("outputResources: " + getOutputResources() + ",");
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
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnhancedImageMetadataEnabled() == null) ? 0
                        : getEnhancedImageMetadataEnabled().hashCode());
        hashCode = prime * hashCode + ((getOsVersion() == null) ? 0 : getOsVersion().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getImageRecipe() == null) ? 0 : getImageRecipe().hashCode());
        hashCode = prime * hashCode
                + ((getSourcePipelineName() == null) ? 0 : getSourcePipelineName().hashCode());
        hashCode = prime * hashCode
                + ((getSourcePipelineArn() == null) ? 0 : getSourcePipelineArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getInfrastructureConfiguration() == null) ? 0
                        : getInfrastructureConfiguration().hashCode());
        hashCode = prime
                * hashCode
                + ((getDistributionConfiguration() == null) ? 0 : getDistributionConfiguration()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getImageTestsConfiguration() == null) ? 0 : getImageTestsConfiguration()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode
                + ((getOutputResources() == null) ? 0 : getOutputResources().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Image == false)
            return false;
        Image other = (Image) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
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
        if (other.getOsVersion() == null ^ this.getOsVersion() == null)
            return false;
        if (other.getOsVersion() != null
                && other.getOsVersion().equals(this.getOsVersion()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getImageRecipe() == null ^ this.getImageRecipe() == null)
            return false;
        if (other.getImageRecipe() != null
                && other.getImageRecipe().equals(this.getImageRecipe()) == false)
            return false;
        if (other.getSourcePipelineName() == null ^ this.getSourcePipelineName() == null)
            return false;
        if (other.getSourcePipelineName() != null
                && other.getSourcePipelineName().equals(this.getSourcePipelineName()) == false)
            return false;
        if (other.getSourcePipelineArn() == null ^ this.getSourcePipelineArn() == null)
            return false;
        if (other.getSourcePipelineArn() != null
                && other.getSourcePipelineArn().equals(this.getSourcePipelineArn()) == false)
            return false;
        if (other.getInfrastructureConfiguration() == null
                ^ this.getInfrastructureConfiguration() == null)
            return false;
        if (other.getInfrastructureConfiguration() != null
                && other.getInfrastructureConfiguration().equals(
                        this.getInfrastructureConfiguration()) == false)
            return false;
        if (other.getDistributionConfiguration() == null
                ^ this.getDistributionConfiguration() == null)
            return false;
        if (other.getDistributionConfiguration() != null
                && other.getDistributionConfiguration().equals(this.getDistributionConfiguration()) == false)
            return false;
        if (other.getImageTestsConfiguration() == null ^ this.getImageTestsConfiguration() == null)
            return false;
        if (other.getImageTestsConfiguration() != null
                && other.getImageTestsConfiguration().equals(this.getImageTestsConfiguration()) == false)
            return false;
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null
                && other.getDateCreated().equals(this.getDateCreated()) == false)
            return false;
        if (other.getOutputResources() == null ^ this.getOutputResources() == null)
            return false;
        if (other.getOutputResources() != null
                && other.getOutputResources().equals(this.getOutputResources()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
