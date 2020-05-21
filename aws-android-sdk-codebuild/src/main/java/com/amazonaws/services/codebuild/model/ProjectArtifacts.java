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

package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the build output artifacts for the build project.
 * </p>
 */
public class ProjectArtifacts implements Serializable {
    /**
     * <p>
     * The type of build output artifact. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The build project has build output generated
     * through AWS CodePipeline.
     * </p>
     * <note>
     * <p>
     * The <code>CODEPIPELINE</code> type is not supported for
     * <code>secondaryArtifacts</code>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>NO_ARTIFACTS</code>: The build project does not produce any build
     * output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The build project stores build output in Amazon Simple
     * Storage Service (Amazon S3).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODEPIPELINE, S3, NO_ARTIFACTS
     */
    private String type;

    /**
     * <p>
     * Information about the build output artifact location:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     * CodePipeline ignores this value if specified. This is because AWS
     * CodePipeline manages its build output locations instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is
     * ignored if specified, because no build output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the name of the
     * output bucket.
     * </p>
     * </li>
     * </ul>
     */
    private String location;

    /**
     * <p>
     * Along with <code>namespaceType</code> and <code>name</code>, the pattern
     * that AWS CodeBuild uses to name and store the output artifact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     * CodePipeline ignores this value if specified. This is because AWS
     * CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is
     * ignored if specified, because no build output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the path to the
     * output artifact. If <code>path</code> is not specified, <code>path</code>
     * is not used.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>,
     * <code>namespaceType</code> is set to <code>NONE</code>, and
     * <code>name</code> is set to <code>MyArtifact.zip</code>, the output
     * artifact is stored in the output bucket at
     * <code>MyArtifacts/MyArtifact.zip</code>.
     * </p>
     */
    private String path;

    /**
     * <p>
     * Along with <code>path</code> and <code>name</code>, the pattern that AWS
     * CodeBuild uses to determine the name and location to store the output
     * artifact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     * CodePipeline ignores this value if specified. This is because AWS
     * CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is
     * ignored if specified, because no build output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_ID</code>: Include the build ID in the location of the build
     * output artifact.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Do not include the build ID. This is the default if
     * <code>namespaceType</code> is not specified.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>,
     * <code>namespaceType</code> is set to <code>BUILD_ID</code>, and
     * <code>name</code> is set to <code>MyArtifact.zip</code>, the output
     * artifact is stored in
     * <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, BUILD_ID
     */
    private String namespaceType;

    /**
     * <p>
     * Along with <code>path</code> and <code>namespaceType</code>, the pattern
     * that AWS CodeBuild uses to name and store the output artifact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     * CodePipeline ignores this value if specified. This is because AWS
     * CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is
     * ignored if specified, because no build output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the name of the
     * output artifact object. If you set the name to be a forward slash ("/"),
     * the artifact is stored in the root of the output bucket.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>path</code> is set to <code>MyArtifacts</code>,
     * <code>namespaceType</code> is set to <code>BUILD_ID</code>, and
     * <code>name</code> is set to <code>MyArtifact.zip</code>, then the output
     * artifact is stored in
     * <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>path</code> is empty, <code>namespaceType</code> is set to
     * <code>NONE</code>, and <code>name</code> is set to "<code>/</code>", the
     * output artifact is stored in the root of the output bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>path</code> is set to <code>MyArtifacts</code>,
     * <code>namespaceType</code> is set to <code>BUILD_ID</code>, and
     * <code>name</code> is set to "<code>/</code>", the output artifact is
     * stored in <code>MyArtifacts/<i>build-ID</i> </code>.
     * </p>
     * </li>
     * </ul>
     */
    private String name;

    /**
     * <p>
     * The type of build output artifact to create:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     * CodePipeline ignores this value if specified. This is because AWS
     * CodePipeline manages its build output artifacts instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is
     * ignored if specified, because no build output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: AWS CodeBuild creates in the output bucket a folder
     * that contains the build output. This is the default if
     * <code>packaging</code> is not specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZIP</code>: AWS CodeBuild creates in the output bucket a ZIP file
     * that contains the build output.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ZIP
     */
    private String packaging;

    /**
     * <p>
     * If this flag is set, a name specified in the buildspec file overrides the
     * artifact name. The name specified in a buildspec file is calculated at
     * build time and uses the Shell Command Language. For example, you can
     * append a date and time to your artifact name so that it is always unique.
     * </p>
     */
    private Boolean overrideArtifactName;

    /**
     * <p>
     * Set to true if you do not want your output artifacts encrypted. This
     * option is valid only if your artifacts type is Amazon Simple Storage
     * Service (Amazon S3). If this is set with another artifacts type, an
     * invalidInputException is thrown.
     * </p>
     */
    private Boolean encryptionDisabled;

    /**
     * <p>
     * An identifier for this artifact definition.
     * </p>
     */
    private String artifactIdentifier;

    /**
     * <p>
     * The type of build output artifact. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The build project has build output generated
     * through AWS CodePipeline.
     * </p>
     * <note>
     * <p>
     * The <code>CODEPIPELINE</code> type is not supported for
     * <code>secondaryArtifacts</code>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>NO_ARTIFACTS</code>: The build project does not produce any build
     * output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The build project stores build output in Amazon Simple
     * Storage Service (Amazon S3).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODEPIPELINE, S3, NO_ARTIFACTS
     *
     * @return <p>
     *         The type of build output artifact. Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CODEPIPELINE</code>: The build project has build output
     *         generated through AWS CodePipeline.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>CODEPIPELINE</code> type is not supported for
     *         <code>secondaryArtifacts</code>.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         <code>NO_ARTIFACTS</code>: The build project does not produce any
     *         build output.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>S3</code>: The build project stores build output in Amazon
     *         Simple Storage Service (Amazon S3).
     *         </p>
     *         </li>
     *         </ul>
     * @see ArtifactsType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of build output artifact. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The build project has build output generated
     * through AWS CodePipeline.
     * </p>
     * <note>
     * <p>
     * The <code>CODEPIPELINE</code> type is not supported for
     * <code>secondaryArtifacts</code>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>NO_ARTIFACTS</code>: The build project does not produce any build
     * output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The build project stores build output in Amazon Simple
     * Storage Service (Amazon S3).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODEPIPELINE, S3, NO_ARTIFACTS
     *
     * @param type <p>
     *            The type of build output artifact. Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CODEPIPELINE</code>: The build project has build output
     *            generated through AWS CodePipeline.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>CODEPIPELINE</code> type is not supported for
     *            <code>secondaryArtifacts</code>.
     *            </p>
     *            </note></li>
     *            <li>
     *            <p>
     *            <code>NO_ARTIFACTS</code>: The build project does not produce
     *            any build output.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>S3</code>: The build project stores build output in
     *            Amazon Simple Storage Service (Amazon S3).
     *            </p>
     *            </li>
     *            </ul>
     * @see ArtifactsType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of build output artifact. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The build project has build output generated
     * through AWS CodePipeline.
     * </p>
     * <note>
     * <p>
     * The <code>CODEPIPELINE</code> type is not supported for
     * <code>secondaryArtifacts</code>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>NO_ARTIFACTS</code>: The build project does not produce any build
     * output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The build project stores build output in Amazon Simple
     * Storage Service (Amazon S3).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODEPIPELINE, S3, NO_ARTIFACTS
     *
     * @param type <p>
     *            The type of build output artifact. Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CODEPIPELINE</code>: The build project has build output
     *            generated through AWS CodePipeline.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>CODEPIPELINE</code> type is not supported for
     *            <code>secondaryArtifacts</code>.
     *            </p>
     *            </note></li>
     *            <li>
     *            <p>
     *            <code>NO_ARTIFACTS</code>: The build project does not produce
     *            any build output.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>S3</code>: The build project stores build output in
     *            Amazon Simple Storage Service (Amazon S3).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ArtifactsType
     */
    public ProjectArtifacts withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of build output artifact. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The build project has build output generated
     * through AWS CodePipeline.
     * </p>
     * <note>
     * <p>
     * The <code>CODEPIPELINE</code> type is not supported for
     * <code>secondaryArtifacts</code>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>NO_ARTIFACTS</code>: The build project does not produce any build
     * output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The build project stores build output in Amazon Simple
     * Storage Service (Amazon S3).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODEPIPELINE, S3, NO_ARTIFACTS
     *
     * @param type <p>
     *            The type of build output artifact. Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CODEPIPELINE</code>: The build project has build output
     *            generated through AWS CodePipeline.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>CODEPIPELINE</code> type is not supported for
     *            <code>secondaryArtifacts</code>.
     *            </p>
     *            </note></li>
     *            <li>
     *            <p>
     *            <code>NO_ARTIFACTS</code>: The build project does not produce
     *            any build output.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>S3</code>: The build project stores build output in
     *            Amazon Simple Storage Service (Amazon S3).
     *            </p>
     *            </li>
     *            </ul>
     * @see ArtifactsType
     */
    public void setType(ArtifactsType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of build output artifact. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEPIPELINE</code>: The build project has build output generated
     * through AWS CodePipeline.
     * </p>
     * <note>
     * <p>
     * The <code>CODEPIPELINE</code> type is not supported for
     * <code>secondaryArtifacts</code>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>NO_ARTIFACTS</code>: The build project does not produce any build
     * output.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The build project stores build output in Amazon Simple
     * Storage Service (Amazon S3).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODEPIPELINE, S3, NO_ARTIFACTS
     *
     * @param type <p>
     *            The type of build output artifact. Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CODEPIPELINE</code>: The build project has build output
     *            generated through AWS CodePipeline.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>CODEPIPELINE</code> type is not supported for
     *            <code>secondaryArtifacts</code>.
     *            </p>
     *            </note></li>
     *            <li>
     *            <p>
     *            <code>NO_ARTIFACTS</code>: The build project does not produce
     *            any build output.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>S3</code>: The build project stores build output in
     *            Amazon Simple Storage Service (Amazon S3).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ArtifactsType
     */
    public ProjectArtifacts withType(ArtifactsType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Information about the build output artifact location:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     * CodePipeline ignores this value if specified. This is because AWS
     * CodePipeline manages its build output locations instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is
     * ignored if specified, because no build output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the name of the
     * output bucket.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Information about the build output artifact location:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     *         CodePipeline ignores this value if specified. This is because AWS
     *         CodePipeline manages its build output locations instead of AWS
     *         CodeBuild.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this
     *         value is ignored if specified, because no build output is
     *         produced.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>S3</code>, this is the name
     *         of the output bucket.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getLocation() {
        return location;
    }

    /**
     * <p>
     * Information about the build output artifact location:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     * CodePipeline ignores this value if specified. This is because AWS
     * CodePipeline manages its build output locations instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is
     * ignored if specified, because no build output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the name of the
     * output bucket.
     * </p>
     * </li>
     * </ul>
     *
     * @param location <p>
     *            Information about the build output artifact location:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     *            CodePipeline ignores this value if specified. This is because
     *            AWS CodePipeline manages its build output locations instead of
     *            AWS CodeBuild.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this
     *            value is ignored if specified, because no build output is
     *            produced.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>S3</code>, this is the
     *            name of the output bucket.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * Information about the build output artifact location:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     * CodePipeline ignores this value if specified. This is because AWS
     * CodePipeline manages its build output locations instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is
     * ignored if specified, because no build output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the name of the
     * output bucket.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            Information about the build output artifact location:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     *            CodePipeline ignores this value if specified. This is because
     *            AWS CodePipeline manages its build output locations instead of
     *            AWS CodeBuild.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this
     *            value is ignored if specified, because no build output is
     *            produced.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>S3</code>, this is the
     *            name of the output bucket.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectArtifacts withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * Along with <code>namespaceType</code> and <code>name</code>, the pattern
     * that AWS CodeBuild uses to name and store the output artifact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     * CodePipeline ignores this value if specified. This is because AWS
     * CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is
     * ignored if specified, because no build output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the path to the
     * output artifact. If <code>path</code> is not specified, <code>path</code>
     * is not used.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>,
     * <code>namespaceType</code> is set to <code>NONE</code>, and
     * <code>name</code> is set to <code>MyArtifact.zip</code>, the output
     * artifact is stored in the output bucket at
     * <code>MyArtifacts/MyArtifact.zip</code>.
     * </p>
     *
     * @return <p>
     *         Along with <code>namespaceType</code> and <code>name</code>, the
     *         pattern that AWS CodeBuild uses to name and store the output
     *         artifact:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     *         CodePipeline ignores this value if specified. This is because AWS
     *         CodePipeline manages its build output names instead of AWS
     *         CodeBuild.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this
     *         value is ignored if specified, because no build output is
     *         produced.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>S3</code>, this is the path
     *         to the output artifact. If <code>path</code> is not specified,
     *         <code>path</code> is not used.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For example, if <code>path</code> is set to
     *         <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     *         <code>NONE</code>, and <code>name</code> is set to
     *         <code>MyArtifact.zip</code>, the output artifact is stored in the
     *         output bucket at <code>MyArtifacts/MyArtifact.zip</code>.
     *         </p>
     */
    public String getPath() {
        return path;
    }

    /**
     * <p>
     * Along with <code>namespaceType</code> and <code>name</code>, the pattern
     * that AWS CodeBuild uses to name and store the output artifact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     * CodePipeline ignores this value if specified. This is because AWS
     * CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is
     * ignored if specified, because no build output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the path to the
     * output artifact. If <code>path</code> is not specified, <code>path</code>
     * is not used.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>,
     * <code>namespaceType</code> is set to <code>NONE</code>, and
     * <code>name</code> is set to <code>MyArtifact.zip</code>, the output
     * artifact is stored in the output bucket at
     * <code>MyArtifacts/MyArtifact.zip</code>.
     * </p>
     *
     * @param path <p>
     *            Along with <code>namespaceType</code> and <code>name</code>,
     *            the pattern that AWS CodeBuild uses to name and store the
     *            output artifact:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     *            CodePipeline ignores this value if specified. This is because
     *            AWS CodePipeline manages its build output names instead of AWS
     *            CodeBuild.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this
     *            value is ignored if specified, because no build output is
     *            produced.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>S3</code>, this is the
     *            path to the output artifact. If <code>path</code> is not
     *            specified, <code>path</code> is not used.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For example, if <code>path</code> is set to
     *            <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     *            <code>NONE</code>, and <code>name</code> is set to
     *            <code>MyArtifact.zip</code>, the output artifact is stored in
     *            the output bucket at <code>MyArtifacts/MyArtifact.zip</code>.
     *            </p>
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * Along with <code>namespaceType</code> and <code>name</code>, the pattern
     * that AWS CodeBuild uses to name and store the output artifact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     * CodePipeline ignores this value if specified. This is because AWS
     * CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is
     * ignored if specified, because no build output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the path to the
     * output artifact. If <code>path</code> is not specified, <code>path</code>
     * is not used.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>,
     * <code>namespaceType</code> is set to <code>NONE</code>, and
     * <code>name</code> is set to <code>MyArtifact.zip</code>, the output
     * artifact is stored in the output bucket at
     * <code>MyArtifacts/MyArtifact.zip</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param path <p>
     *            Along with <code>namespaceType</code> and <code>name</code>,
     *            the pattern that AWS CodeBuild uses to name and store the
     *            output artifact:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     *            CodePipeline ignores this value if specified. This is because
     *            AWS CodePipeline manages its build output names instead of AWS
     *            CodeBuild.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this
     *            value is ignored if specified, because no build output is
     *            produced.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>S3</code>, this is the
     *            path to the output artifact. If <code>path</code> is not
     *            specified, <code>path</code> is not used.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For example, if <code>path</code> is set to
     *            <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     *            <code>NONE</code>, and <code>name</code> is set to
     *            <code>MyArtifact.zip</code>, the output artifact is stored in
     *            the output bucket at <code>MyArtifacts/MyArtifact.zip</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectArtifacts withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * <p>
     * Along with <code>path</code> and <code>name</code>, the pattern that AWS
     * CodeBuild uses to determine the name and location to store the output
     * artifact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     * CodePipeline ignores this value if specified. This is because AWS
     * CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is
     * ignored if specified, because no build output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_ID</code>: Include the build ID in the location of the build
     * output artifact.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Do not include the build ID. This is the default if
     * <code>namespaceType</code> is not specified.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>,
     * <code>namespaceType</code> is set to <code>BUILD_ID</code>, and
     * <code>name</code> is set to <code>MyArtifact.zip</code>, the output
     * artifact is stored in
     * <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, BUILD_ID
     *
     * @return <p>
     *         Along with <code>path</code> and <code>name</code>, the pattern
     *         that AWS CodeBuild uses to determine the name and location to
     *         store the output artifact:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     *         CodePipeline ignores this value if specified. This is because AWS
     *         CodePipeline manages its build output names instead of AWS
     *         CodeBuild.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this
     *         value is ignored if specified, because no build output is
     *         produced.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>S3</code>, valid values
     *         include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BUILD_ID</code>: Include the build ID in the location of
     *         the build output artifact.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NONE</code>: Do not include the build ID. This is the
     *         default if <code>namespaceType</code> is not specified.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <p>
     *         For example, if <code>path</code> is set to
     *         <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     *         <code>BUILD_ID</code>, and <code>name</code> is set to
     *         <code>MyArtifact.zip</code>, the output artifact is stored in
     *         <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     *         </p>
     * @see ArtifactNamespace
     */
    public String getNamespaceType() {
        return namespaceType;
    }

    /**
     * <p>
     * Along with <code>path</code> and <code>name</code>, the pattern that AWS
     * CodeBuild uses to determine the name and location to store the output
     * artifact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     * CodePipeline ignores this value if specified. This is because AWS
     * CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is
     * ignored if specified, because no build output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_ID</code>: Include the build ID in the location of the build
     * output artifact.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Do not include the build ID. This is the default if
     * <code>namespaceType</code> is not specified.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>,
     * <code>namespaceType</code> is set to <code>BUILD_ID</code>, and
     * <code>name</code> is set to <code>MyArtifact.zip</code>, the output
     * artifact is stored in
     * <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, BUILD_ID
     *
     * @param namespaceType <p>
     *            Along with <code>path</code> and <code>name</code>, the
     *            pattern that AWS CodeBuild uses to determine the name and
     *            location to store the output artifact:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     *            CodePipeline ignores this value if specified. This is because
     *            AWS CodePipeline manages its build output names instead of AWS
     *            CodeBuild.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this
     *            value is ignored if specified, because no build output is
     *            produced.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>S3</code>, valid values
     *            include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>BUILD_ID</code>: Include the build ID in the location of
     *            the build output artifact.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NONE</code>: Do not include the build ID. This is the
     *            default if <code>namespaceType</code> is not specified.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     *            <p>
     *            For example, if <code>path</code> is set to
     *            <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     *            <code>BUILD_ID</code>, and <code>name</code> is set to
     *            <code>MyArtifact.zip</code>, the output artifact is stored in
     *            <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     *            </p>
     * @see ArtifactNamespace
     */
    public void setNamespaceType(String namespaceType) {
        this.namespaceType = namespaceType;
    }

    /**
     * <p>
     * Along with <code>path</code> and <code>name</code>, the pattern that AWS
     * CodeBuild uses to determine the name and location to store the output
     * artifact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     * CodePipeline ignores this value if specified. This is because AWS
     * CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is
     * ignored if specified, because no build output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_ID</code>: Include the build ID in the location of the build
     * output artifact.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Do not include the build ID. This is the default if
     * <code>namespaceType</code> is not specified.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>,
     * <code>namespaceType</code> is set to <code>BUILD_ID</code>, and
     * <code>name</code> is set to <code>MyArtifact.zip</code>, the output
     * artifact is stored in
     * <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, BUILD_ID
     *
     * @param namespaceType <p>
     *            Along with <code>path</code> and <code>name</code>, the
     *            pattern that AWS CodeBuild uses to determine the name and
     *            location to store the output artifact:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     *            CodePipeline ignores this value if specified. This is because
     *            AWS CodePipeline manages its build output names instead of AWS
     *            CodeBuild.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this
     *            value is ignored if specified, because no build output is
     *            produced.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>S3</code>, valid values
     *            include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>BUILD_ID</code>: Include the build ID in the location of
     *            the build output artifact.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NONE</code>: Do not include the build ID. This is the
     *            default if <code>namespaceType</code> is not specified.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     *            <p>
     *            For example, if <code>path</code> is set to
     *            <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     *            <code>BUILD_ID</code>, and <code>name</code> is set to
     *            <code>MyArtifact.zip</code>, the output artifact is stored in
     *            <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ArtifactNamespace
     */
    public ProjectArtifacts withNamespaceType(String namespaceType) {
        this.namespaceType = namespaceType;
        return this;
    }

    /**
     * <p>
     * Along with <code>path</code> and <code>name</code>, the pattern that AWS
     * CodeBuild uses to determine the name and location to store the output
     * artifact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     * CodePipeline ignores this value if specified. This is because AWS
     * CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is
     * ignored if specified, because no build output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_ID</code>: Include the build ID in the location of the build
     * output artifact.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Do not include the build ID. This is the default if
     * <code>namespaceType</code> is not specified.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>,
     * <code>namespaceType</code> is set to <code>BUILD_ID</code>, and
     * <code>name</code> is set to <code>MyArtifact.zip</code>, the output
     * artifact is stored in
     * <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, BUILD_ID
     *
     * @param namespaceType <p>
     *            Along with <code>path</code> and <code>name</code>, the
     *            pattern that AWS CodeBuild uses to determine the name and
     *            location to store the output artifact:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     *            CodePipeline ignores this value if specified. This is because
     *            AWS CodePipeline manages its build output names instead of AWS
     *            CodeBuild.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this
     *            value is ignored if specified, because no build output is
     *            produced.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>S3</code>, valid values
     *            include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>BUILD_ID</code>: Include the build ID in the location of
     *            the build output artifact.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NONE</code>: Do not include the build ID. This is the
     *            default if <code>namespaceType</code> is not specified.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     *            <p>
     *            For example, if <code>path</code> is set to
     *            <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     *            <code>BUILD_ID</code>, and <code>name</code> is set to
     *            <code>MyArtifact.zip</code>, the output artifact is stored in
     *            <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     *            </p>
     * @see ArtifactNamespace
     */
    public void setNamespaceType(ArtifactNamespace namespaceType) {
        this.namespaceType = namespaceType.toString();
    }

    /**
     * <p>
     * Along with <code>path</code> and <code>name</code>, the pattern that AWS
     * CodeBuild uses to determine the name and location to store the output
     * artifact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     * CodePipeline ignores this value if specified. This is because AWS
     * CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is
     * ignored if specified, because no build output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_ID</code>: Include the build ID in the location of the build
     * output artifact.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Do not include the build ID. This is the default if
     * <code>namespaceType</code> is not specified.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For example, if <code>path</code> is set to <code>MyArtifacts</code>,
     * <code>namespaceType</code> is set to <code>BUILD_ID</code>, and
     * <code>name</code> is set to <code>MyArtifact.zip</code>, the output
     * artifact is stored in
     * <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, BUILD_ID
     *
     * @param namespaceType <p>
     *            Along with <code>path</code> and <code>name</code>, the
     *            pattern that AWS CodeBuild uses to determine the name and
     *            location to store the output artifact:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     *            CodePipeline ignores this value if specified. This is because
     *            AWS CodePipeline manages its build output names instead of AWS
     *            CodeBuild.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this
     *            value is ignored if specified, because no build output is
     *            produced.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>S3</code>, valid values
     *            include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>BUILD_ID</code>: Include the build ID in the location of
     *            the build output artifact.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NONE</code>: Do not include the build ID. This is the
     *            default if <code>namespaceType</code> is not specified.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     *            <p>
     *            For example, if <code>path</code> is set to
     *            <code>MyArtifacts</code>, <code>namespaceType</code> is set to
     *            <code>BUILD_ID</code>, and <code>name</code> is set to
     *            <code>MyArtifact.zip</code>, the output artifact is stored in
     *            <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ArtifactNamespace
     */
    public ProjectArtifacts withNamespaceType(ArtifactNamespace namespaceType) {
        this.namespaceType = namespaceType.toString();
        return this;
    }

    /**
     * <p>
     * Along with <code>path</code> and <code>namespaceType</code>, the pattern
     * that AWS CodeBuild uses to name and store the output artifact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     * CodePipeline ignores this value if specified. This is because AWS
     * CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is
     * ignored if specified, because no build output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the name of the
     * output artifact object. If you set the name to be a forward slash ("/"),
     * the artifact is stored in the root of the output bucket.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>path</code> is set to <code>MyArtifacts</code>,
     * <code>namespaceType</code> is set to <code>BUILD_ID</code>, and
     * <code>name</code> is set to <code>MyArtifact.zip</code>, then the output
     * artifact is stored in
     * <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>path</code> is empty, <code>namespaceType</code> is set to
     * <code>NONE</code>, and <code>name</code> is set to "<code>/</code>", the
     * output artifact is stored in the root of the output bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>path</code> is set to <code>MyArtifacts</code>,
     * <code>namespaceType</code> is set to <code>BUILD_ID</code>, and
     * <code>name</code> is set to "<code>/</code>", the output artifact is
     * stored in <code>MyArtifacts/<i>build-ID</i> </code>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Along with <code>path</code> and <code>namespaceType</code>, the
     *         pattern that AWS CodeBuild uses to name and store the output
     *         artifact:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     *         CodePipeline ignores this value if specified. This is because AWS
     *         CodePipeline manages its build output names instead of AWS
     *         CodeBuild.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this
     *         value is ignored if specified, because no build output is
     *         produced.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>S3</code>, this is the name
     *         of the output artifact object. If you set the name to be a
     *         forward slash ("/"), the artifact is stored in the root of the
     *         output bucket.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>path</code> is set to <code>MyArtifacts</code>,
     *         <code>namespaceType</code> is set to <code>BUILD_ID</code>, and
     *         <code>name</code> is set to <code>MyArtifact.zip</code>, then the
     *         output artifact is stored in
     *         <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>path</code> is empty, <code>namespaceType</code> is set
     *         to <code>NONE</code>, and <code>name</code> is set to "
     *         <code>/</code>", the output artifact is stored in the root of the
     *         output bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>path</code> is set to <code>MyArtifacts</code>,
     *         <code>namespaceType</code> is set to <code>BUILD_ID</code>, and
     *         <code>name</code> is set to "<code>/</code>", the output artifact
     *         is stored in <code>MyArtifacts/<i>build-ID</i> </code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Along with <code>path</code> and <code>namespaceType</code>, the pattern
     * that AWS CodeBuild uses to name and store the output artifact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     * CodePipeline ignores this value if specified. This is because AWS
     * CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is
     * ignored if specified, because no build output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the name of the
     * output artifact object. If you set the name to be a forward slash ("/"),
     * the artifact is stored in the root of the output bucket.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>path</code> is set to <code>MyArtifacts</code>,
     * <code>namespaceType</code> is set to <code>BUILD_ID</code>, and
     * <code>name</code> is set to <code>MyArtifact.zip</code>, then the output
     * artifact is stored in
     * <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>path</code> is empty, <code>namespaceType</code> is set to
     * <code>NONE</code>, and <code>name</code> is set to "<code>/</code>", the
     * output artifact is stored in the root of the output bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>path</code> is set to <code>MyArtifacts</code>,
     * <code>namespaceType</code> is set to <code>BUILD_ID</code>, and
     * <code>name</code> is set to "<code>/</code>", the output artifact is
     * stored in <code>MyArtifacts/<i>build-ID</i> </code>.
     * </p>
     * </li>
     * </ul>
     *
     * @param name <p>
     *            Along with <code>path</code> and <code>namespaceType</code>,
     *            the pattern that AWS CodeBuild uses to name and store the
     *            output artifact:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     *            CodePipeline ignores this value if specified. This is because
     *            AWS CodePipeline manages its build output names instead of AWS
     *            CodeBuild.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this
     *            value is ignored if specified, because no build output is
     *            produced.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>S3</code>, this is the
     *            name of the output artifact object. If you set the name to be
     *            a forward slash ("/"), the artifact is stored in the root of
     *            the output bucket.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If <code>path</code> is set to <code>MyArtifacts</code>,
     *            <code>namespaceType</code> is set to <code>BUILD_ID</code>,
     *            and <code>name</code> is set to <code>MyArtifact.zip</code>,
     *            then the output artifact is stored in
     *            <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>path</code> is empty, <code>namespaceType</code> is
     *            set to <code>NONE</code>, and <code>name</code> is set to "
     *            <code>/</code>", the output artifact is stored in the root of
     *            the output bucket.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>path</code> is set to <code>MyArtifacts</code>,
     *            <code>namespaceType</code> is set to <code>BUILD_ID</code>,
     *            and <code>name</code> is set to "<code>/</code>", the output
     *            artifact is stored in
     *            <code>MyArtifacts/<i>build-ID</i> </code>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Along with <code>path</code> and <code>namespaceType</code>, the pattern
     * that AWS CodeBuild uses to name and store the output artifact:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     * CodePipeline ignores this value if specified. This is because AWS
     * CodePipeline manages its build output names instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is
     * ignored if specified, because no build output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, this is the name of the
     * output artifact object. If you set the name to be a forward slash ("/"),
     * the artifact is stored in the root of the output bucket.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>path</code> is set to <code>MyArtifacts</code>,
     * <code>namespaceType</code> is set to <code>BUILD_ID</code>, and
     * <code>name</code> is set to <code>MyArtifact.zip</code>, then the output
     * artifact is stored in
     * <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>path</code> is empty, <code>namespaceType</code> is set to
     * <code>NONE</code>, and <code>name</code> is set to "<code>/</code>", the
     * output artifact is stored in the root of the output bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>path</code> is set to <code>MyArtifacts</code>,
     * <code>namespaceType</code> is set to <code>BUILD_ID</code>, and
     * <code>name</code> is set to "<code>/</code>", the output artifact is
     * stored in <code>MyArtifacts/<i>build-ID</i> </code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            Along with <code>path</code> and <code>namespaceType</code>,
     *            the pattern that AWS CodeBuild uses to name and store the
     *            output artifact:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     *            CodePipeline ignores this value if specified. This is because
     *            AWS CodePipeline manages its build output names instead of AWS
     *            CodeBuild.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this
     *            value is ignored if specified, because no build output is
     *            produced.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>S3</code>, this is the
     *            name of the output artifact object. If you set the name to be
     *            a forward slash ("/"), the artifact is stored in the root of
     *            the output bucket.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If <code>path</code> is set to <code>MyArtifacts</code>,
     *            <code>namespaceType</code> is set to <code>BUILD_ID</code>,
     *            and <code>name</code> is set to <code>MyArtifact.zip</code>,
     *            then the output artifact is stored in
     *            <code>MyArtifacts/<i>build-ID</i>/MyArtifact.zip</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>path</code> is empty, <code>namespaceType</code> is
     *            set to <code>NONE</code>, and <code>name</code> is set to "
     *            <code>/</code>", the output artifact is stored in the root of
     *            the output bucket.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>path</code> is set to <code>MyArtifacts</code>,
     *            <code>namespaceType</code> is set to <code>BUILD_ID</code>,
     *            and <code>name</code> is set to "<code>/</code>", the output
     *            artifact is stored in
     *            <code>MyArtifacts/<i>build-ID</i> </code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectArtifacts withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of build output artifact to create:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     * CodePipeline ignores this value if specified. This is because AWS
     * CodePipeline manages its build output artifacts instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is
     * ignored if specified, because no build output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: AWS CodeBuild creates in the output bucket a folder
     * that contains the build output. This is the default if
     * <code>packaging</code> is not specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZIP</code>: AWS CodeBuild creates in the output bucket a ZIP file
     * that contains the build output.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ZIP
     *
     * @return <p>
     *         The type of build output artifact to create:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     *         CodePipeline ignores this value if specified. This is because AWS
     *         CodePipeline manages its build output artifacts instead of AWS
     *         CodeBuild.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this
     *         value is ignored if specified, because no build output is
     *         produced.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>type</code> is set to <code>S3</code>, valid values
     *         include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NONE</code>: AWS CodeBuild creates in the output bucket a
     *         folder that contains the build output. This is the default if
     *         <code>packaging</code> is not specified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ZIP</code>: AWS CodeBuild creates in the output bucket a
     *         ZIP file that contains the build output.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     * @see ArtifactPackaging
     */
    public String getPackaging() {
        return packaging;
    }

    /**
     * <p>
     * The type of build output artifact to create:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     * CodePipeline ignores this value if specified. This is because AWS
     * CodePipeline manages its build output artifacts instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is
     * ignored if specified, because no build output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: AWS CodeBuild creates in the output bucket a folder
     * that contains the build output. This is the default if
     * <code>packaging</code> is not specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZIP</code>: AWS CodeBuild creates in the output bucket a ZIP file
     * that contains the build output.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ZIP
     *
     * @param packaging <p>
     *            The type of build output artifact to create:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     *            CodePipeline ignores this value if specified. This is because
     *            AWS CodePipeline manages its build output artifacts instead of
     *            AWS CodeBuild.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this
     *            value is ignored if specified, because no build output is
     *            produced.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>S3</code>, valid values
     *            include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NONE</code>: AWS CodeBuild creates in the output bucket
     *            a folder that contains the build output. This is the default
     *            if <code>packaging</code> is not specified.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ZIP</code>: AWS CodeBuild creates in the output bucket a
     *            ZIP file that contains the build output.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @see ArtifactPackaging
     */
    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    /**
     * <p>
     * The type of build output artifact to create:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     * CodePipeline ignores this value if specified. This is because AWS
     * CodePipeline manages its build output artifacts instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is
     * ignored if specified, because no build output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: AWS CodeBuild creates in the output bucket a folder
     * that contains the build output. This is the default if
     * <code>packaging</code> is not specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZIP</code>: AWS CodeBuild creates in the output bucket a ZIP file
     * that contains the build output.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ZIP
     *
     * @param packaging <p>
     *            The type of build output artifact to create:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     *            CodePipeline ignores this value if specified. This is because
     *            AWS CodePipeline manages its build output artifacts instead of
     *            AWS CodeBuild.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this
     *            value is ignored if specified, because no build output is
     *            produced.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>S3</code>, valid values
     *            include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NONE</code>: AWS CodeBuild creates in the output bucket
     *            a folder that contains the build output. This is the default
     *            if <code>packaging</code> is not specified.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ZIP</code>: AWS CodeBuild creates in the output bucket a
     *            ZIP file that contains the build output.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ArtifactPackaging
     */
    public ProjectArtifacts withPackaging(String packaging) {
        this.packaging = packaging;
        return this;
    }

    /**
     * <p>
     * The type of build output artifact to create:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     * CodePipeline ignores this value if specified. This is because AWS
     * CodePipeline manages its build output artifacts instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is
     * ignored if specified, because no build output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: AWS CodeBuild creates in the output bucket a folder
     * that contains the build output. This is the default if
     * <code>packaging</code> is not specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZIP</code>: AWS CodeBuild creates in the output bucket a ZIP file
     * that contains the build output.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ZIP
     *
     * @param packaging <p>
     *            The type of build output artifact to create:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     *            CodePipeline ignores this value if specified. This is because
     *            AWS CodePipeline manages its build output artifacts instead of
     *            AWS CodeBuild.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this
     *            value is ignored if specified, because no build output is
     *            produced.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>S3</code>, valid values
     *            include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NONE</code>: AWS CodeBuild creates in the output bucket
     *            a folder that contains the build output. This is the default
     *            if <code>packaging</code> is not specified.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ZIP</code>: AWS CodeBuild creates in the output bucket a
     *            ZIP file that contains the build output.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @see ArtifactPackaging
     */
    public void setPackaging(ArtifactPackaging packaging) {
        this.packaging = packaging.toString();
    }

    /**
     * <p>
     * The type of build output artifact to create:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     * CodePipeline ignores this value if specified. This is because AWS
     * CodePipeline manages its build output artifacts instead of AWS CodeBuild.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this value is
     * ignored if specified, because no build output is produced.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>type</code> is set to <code>S3</code>, valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: AWS CodeBuild creates in the output bucket a folder
     * that contains the build output. This is the default if
     * <code>packaging</code> is not specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZIP</code>: AWS CodeBuild creates in the output bucket a ZIP file
     * that contains the build output.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ZIP
     *
     * @param packaging <p>
     *            The type of build output artifact to create:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>CODEPIPELINE</code>, AWS
     *            CodePipeline ignores this value if specified. This is because
     *            AWS CodePipeline manages its build output artifacts instead of
     *            AWS CodeBuild.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>NO_ARTIFACTS</code>, this
     *            value is ignored if specified, because no build output is
     *            produced.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>type</code> is set to <code>S3</code>, valid values
     *            include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NONE</code>: AWS CodeBuild creates in the output bucket
     *            a folder that contains the build output. This is the default
     *            if <code>packaging</code> is not specified.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ZIP</code>: AWS CodeBuild creates in the output bucket a
     *            ZIP file that contains the build output.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ArtifactPackaging
     */
    public ProjectArtifacts withPackaging(ArtifactPackaging packaging) {
        this.packaging = packaging.toString();
        return this;
    }

    /**
     * <p>
     * If this flag is set, a name specified in the buildspec file overrides the
     * artifact name. The name specified in a buildspec file is calculated at
     * build time and uses the Shell Command Language. For example, you can
     * append a date and time to your artifact name so that it is always unique.
     * </p>
     *
     * @return <p>
     *         If this flag is set, a name specified in the buildspec file
     *         overrides the artifact name. The name specified in a buildspec
     *         file is calculated at build time and uses the Shell Command
     *         Language. For example, you can append a date and time to your
     *         artifact name so that it is always unique.
     *         </p>
     */
    public Boolean isOverrideArtifactName() {
        return overrideArtifactName;
    }

    /**
     * <p>
     * If this flag is set, a name specified in the buildspec file overrides the
     * artifact name. The name specified in a buildspec file is calculated at
     * build time and uses the Shell Command Language. For example, you can
     * append a date and time to your artifact name so that it is always unique.
     * </p>
     *
     * @return <p>
     *         If this flag is set, a name specified in the buildspec file
     *         overrides the artifact name. The name specified in a buildspec
     *         file is calculated at build time and uses the Shell Command
     *         Language. For example, you can append a date and time to your
     *         artifact name so that it is always unique.
     *         </p>
     */
    public Boolean getOverrideArtifactName() {
        return overrideArtifactName;
    }

    /**
     * <p>
     * If this flag is set, a name specified in the buildspec file overrides the
     * artifact name. The name specified in a buildspec file is calculated at
     * build time and uses the Shell Command Language. For example, you can
     * append a date and time to your artifact name so that it is always unique.
     * </p>
     *
     * @param overrideArtifactName <p>
     *            If this flag is set, a name specified in the buildspec file
     *            overrides the artifact name. The name specified in a buildspec
     *            file is calculated at build time and uses the Shell Command
     *            Language. For example, you can append a date and time to your
     *            artifact name so that it is always unique.
     *            </p>
     */
    public void setOverrideArtifactName(Boolean overrideArtifactName) {
        this.overrideArtifactName = overrideArtifactName;
    }

    /**
     * <p>
     * If this flag is set, a name specified in the buildspec file overrides the
     * artifact name. The name specified in a buildspec file is calculated at
     * build time and uses the Shell Command Language. For example, you can
     * append a date and time to your artifact name so that it is always unique.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param overrideArtifactName <p>
     *            If this flag is set, a name specified in the buildspec file
     *            overrides the artifact name. The name specified in a buildspec
     *            file is calculated at build time and uses the Shell Command
     *            Language. For example, you can append a date and time to your
     *            artifact name so that it is always unique.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectArtifacts withOverrideArtifactName(Boolean overrideArtifactName) {
        this.overrideArtifactName = overrideArtifactName;
        return this;
    }

    /**
     * <p>
     * Set to true if you do not want your output artifacts encrypted. This
     * option is valid only if your artifacts type is Amazon Simple Storage
     * Service (Amazon S3). If this is set with another artifacts type, an
     * invalidInputException is thrown.
     * </p>
     *
     * @return <p>
     *         Set to true if you do not want your output artifacts encrypted.
     *         This option is valid only if your artifacts type is Amazon Simple
     *         Storage Service (Amazon S3). If this is set with another
     *         artifacts type, an invalidInputException is thrown.
     *         </p>
     */
    public Boolean isEncryptionDisabled() {
        return encryptionDisabled;
    }

    /**
     * <p>
     * Set to true if you do not want your output artifacts encrypted. This
     * option is valid only if your artifacts type is Amazon Simple Storage
     * Service (Amazon S3). If this is set with another artifacts type, an
     * invalidInputException is thrown.
     * </p>
     *
     * @return <p>
     *         Set to true if you do not want your output artifacts encrypted.
     *         This option is valid only if your artifacts type is Amazon Simple
     *         Storage Service (Amazon S3). If this is set with another
     *         artifacts type, an invalidInputException is thrown.
     *         </p>
     */
    public Boolean getEncryptionDisabled() {
        return encryptionDisabled;
    }

    /**
     * <p>
     * Set to true if you do not want your output artifacts encrypted. This
     * option is valid only if your artifacts type is Amazon Simple Storage
     * Service (Amazon S3). If this is set with another artifacts type, an
     * invalidInputException is thrown.
     * </p>
     *
     * @param encryptionDisabled <p>
     *            Set to true if you do not want your output artifacts
     *            encrypted. This option is valid only if your artifacts type is
     *            Amazon Simple Storage Service (Amazon S3). If this is set with
     *            another artifacts type, an invalidInputException is thrown.
     *            </p>
     */
    public void setEncryptionDisabled(Boolean encryptionDisabled) {
        this.encryptionDisabled = encryptionDisabled;
    }

    /**
     * <p>
     * Set to true if you do not want your output artifacts encrypted. This
     * option is valid only if your artifacts type is Amazon Simple Storage
     * Service (Amazon S3). If this is set with another artifacts type, an
     * invalidInputException is thrown.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionDisabled <p>
     *            Set to true if you do not want your output artifacts
     *            encrypted. This option is valid only if your artifacts type is
     *            Amazon Simple Storage Service (Amazon S3). If this is set with
     *            another artifacts type, an invalidInputException is thrown.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectArtifacts withEncryptionDisabled(Boolean encryptionDisabled) {
        this.encryptionDisabled = encryptionDisabled;
        return this;
    }

    /**
     * <p>
     * An identifier for this artifact definition.
     * </p>
     *
     * @return <p>
     *         An identifier for this artifact definition.
     *         </p>
     */
    public String getArtifactIdentifier() {
        return artifactIdentifier;
    }

    /**
     * <p>
     * An identifier for this artifact definition.
     * </p>
     *
     * @param artifactIdentifier <p>
     *            An identifier for this artifact definition.
     *            </p>
     */
    public void setArtifactIdentifier(String artifactIdentifier) {
        this.artifactIdentifier = artifactIdentifier;
    }

    /**
     * <p>
     * An identifier for this artifact definition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param artifactIdentifier <p>
     *            An identifier for this artifact definition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectArtifacts withArtifactIdentifier(String artifactIdentifier) {
        this.artifactIdentifier = artifactIdentifier;
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
        if (getType() != null)
            sb.append("type: " + getType() + ",");
        if (getLocation() != null)
            sb.append("location: " + getLocation() + ",");
        if (getPath() != null)
            sb.append("path: " + getPath() + ",");
        if (getNamespaceType() != null)
            sb.append("namespaceType: " + getNamespaceType() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getPackaging() != null)
            sb.append("packaging: " + getPackaging() + ",");
        if (getOverrideArtifactName() != null)
            sb.append("overrideArtifactName: " + getOverrideArtifactName() + ",");
        if (getEncryptionDisabled() != null)
            sb.append("encryptionDisabled: " + getEncryptionDisabled() + ",");
        if (getArtifactIdentifier() != null)
            sb.append("artifactIdentifier: " + getArtifactIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode
                + ((getNamespaceType() == null) ? 0 : getNamespaceType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPackaging() == null) ? 0 : getPackaging().hashCode());
        hashCode = prime * hashCode
                + ((getOverrideArtifactName() == null) ? 0 : getOverrideArtifactName().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionDisabled() == null) ? 0 : getEncryptionDisabled().hashCode());
        hashCode = prime * hashCode
                + ((getArtifactIdentifier() == null) ? 0 : getArtifactIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectArtifacts == false)
            return false;
        ProjectArtifacts other = (ProjectArtifacts) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getNamespaceType() == null ^ this.getNamespaceType() == null)
            return false;
        if (other.getNamespaceType() != null
                && other.getNamespaceType().equals(this.getNamespaceType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPackaging() == null ^ this.getPackaging() == null)
            return false;
        if (other.getPackaging() != null
                && other.getPackaging().equals(this.getPackaging()) == false)
            return false;
        if (other.getOverrideArtifactName() == null ^ this.getOverrideArtifactName() == null)
            return false;
        if (other.getOverrideArtifactName() != null
                && other.getOverrideArtifactName().equals(this.getOverrideArtifactName()) == false)
            return false;
        if (other.getEncryptionDisabled() == null ^ this.getEncryptionDisabled() == null)
            return false;
        if (other.getEncryptionDisabled() != null
                && other.getEncryptionDisabled().equals(this.getEncryptionDisabled()) == false)
            return false;
        if (other.getArtifactIdentifier() == null ^ this.getArtifactIdentifier() == null)
            return false;
        if (other.getArtifactIdentifier() != null
                && other.getArtifactIdentifier().equals(this.getArtifactIdentifier()) == false)
            return false;
        return true;
    }
}
