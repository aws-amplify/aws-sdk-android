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
 * Information about the build environment of the build project.
 * </p>
 */
public class ProjectEnvironment implements Serializable {
    /**
     * <p>
     * The type of build environment to use for related builds.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The environment type <code>ARM_CONTAINER</code> is available only in
     * regions US East (N. Virginia), US East (Ohio), US West (Oregon), EU
     * (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific
     * (Sydney), and EU (Frankfurt).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_CONTAINER</code> with compute type
     * <code>build.general1.2xlarge</code> is available only in regions US East
     * (N. Virginia), US East (Ohio), US West (Oregon), Canada (Central), EU
     * (Ireland), EU (London), EU (Frankfurt), Asia Pacific (Tokyo), Asia
     * Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific (Sydney), China
     * (Beijing), and China (Ningxia).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_GPU_CONTAINER</code> is available only
     * in regions US East (N. Virginia), US East (Ohio), US West (Oregon),
     * Canada (Central), EU (Ireland), EU (London), EU (Frankfurt), Asia Pacific
     * (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific
     * (Sydney) , China (Beijing), and China (Ningxia).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS_CONTAINER, LINUX_CONTAINER,
     * LINUX_GPU_CONTAINER, ARM_CONTAINER
     */
    private String type;

    /**
     * <p>
     * The image tag or image digest that identifies the Docker image to use for
     * this build project. Use the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an image tag: <code>registry/repository:tag</code>. For example, to
     * specify an image with the tag "latest," use
     * <code>registry/repository:latest</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For an image digest: <code>registry/repository@digest</code>. For
     * example, to specify an image with the digest
     * "sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf,"
     * use
     * <code>registry/repository@sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf</code>
     * .
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String image;

    /**
     * <p>
     * Information about the compute resources the build project uses. Available
     * values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for
     * builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for
     * builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and 8 vCPUs for
     * builds, depending on your environment type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory, 72 vCPUs,
     * and 824 GB of SSD storage for builds. This compute type supports Docker
     * images up to 100 GB uncompressed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use <code>BUILD_GENERAL1_LARGE</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For environment type <code>LINUX_CONTAINER</code>, you can use up to 15
     * GB memory and 8 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to
     * 255 GB memory, 32 vCPUs, and 4 NVIDIA Tesla V100 GPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>ARM_CONTAINER</code>, you can use up to 16 GB
     * memory and 8 vCPUs on ARM-based processors for builds.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html"
     * >Build Environment Compute Types</a> in the <i>AWS CodeBuild User
     * Guide.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BUILD_GENERAL1_SMALL, BUILD_GENERAL1_MEDIUM,
     * BUILD_GENERAL1_LARGE, BUILD_GENERAL1_2XLARGE
     */
    private String computeType;

    /**
     * <p>
     * A set of environment variables to make available to builds for this build
     * project.
     * </p>
     */
    private java.util.List<EnvironmentVariable> environmentVariables;

    /**
     * <p>
     * Enables running the Docker daemon inside a Docker container. Set to true
     * only if the build project is used to build Docker images. Otherwise, a
     * build that attempts to interact with the Docker daemon fails. The default
     * setting is <code>false</code>.
     * </p>
     * <p>
     * You can initialize the Docker daemon during the install phase of your
     * build by adding one of the following sets of commands to the install
     * phase of your buildspec file:
     * </p>
     * <p>
     * If the operating system's base image is Ubuntu Linux:
     * </p>
     * <p>
     * <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     * </p>
     * <p>
     * <code>- timeout 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     * </p>
     * <p>
     * If the operating system's base image is Alpine Linux and the previous
     * command does not work, add the <code>-t</code> argument to
     * <code>timeout</code>:
     * </p>
     * <p>
     * <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     * </p>
     * <p>
     * <code>- timeout -t 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     * </p>
     */
    private Boolean privilegedMode;

    /**
     * <p>
     * The certificate to use with this build project.
     * </p>
     */
    private String certificate;

    /**
     * <p>
     * The credentials for access to a private registry.
     * </p>
     */
    private RegistryCredential registryCredential;

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build.
     * There are two valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own
     * credentials. This requires that you modify your ECR repository policy to
     * trust AWS CodeBuild's service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build
     * project's service role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you use a cross-account or private registry image, you must use
     * SERVICE_ROLE credentials. When you use an AWS CodeBuild curated image,
     * you must use CODEBUILD credentials.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODEBUILD, SERVICE_ROLE
     */
    private String imagePullCredentialsType;

    /**
     * <p>
     * The type of build environment to use for related builds.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The environment type <code>ARM_CONTAINER</code> is available only in
     * regions US East (N. Virginia), US East (Ohio), US West (Oregon), EU
     * (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific
     * (Sydney), and EU (Frankfurt).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_CONTAINER</code> with compute type
     * <code>build.general1.2xlarge</code> is available only in regions US East
     * (N. Virginia), US East (Ohio), US West (Oregon), Canada (Central), EU
     * (Ireland), EU (London), EU (Frankfurt), Asia Pacific (Tokyo), Asia
     * Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific (Sydney), China
     * (Beijing), and China (Ningxia).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_GPU_CONTAINER</code> is available only
     * in regions US East (N. Virginia), US East (Ohio), US West (Oregon),
     * Canada (Central), EU (Ireland), EU (London), EU (Frankfurt), Asia Pacific
     * (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific
     * (Sydney) , China (Beijing), and China (Ningxia).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS_CONTAINER, LINUX_CONTAINER,
     * LINUX_GPU_CONTAINER, ARM_CONTAINER
     *
     * @return <p>
     *         The type of build environment to use for related builds.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The environment type <code>ARM_CONTAINER</code> is available only
     *         in regions US East (N. Virginia), US East (Ohio), US West
     *         (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific
     *         (Tokyo), Asia Pacific (Sydney), and EU (Frankfurt).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The environment type <code>LINUX_CONTAINER</code> with compute
     *         type <code>build.general1.2xlarge</code> is available only in
     *         regions US East (N. Virginia), US East (Ohio), US West (Oregon),
     *         Canada (Central), EU (Ireland), EU (London), EU (Frankfurt), Asia
     *         Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore),
     *         Asia Pacific (Sydney), China (Beijing), and China (Ningxia).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The environment type <code>LINUX_GPU_CONTAINER</code> is
     *         available only in regions US East (N. Virginia), US East (Ohio),
     *         US West (Oregon), Canada (Central), EU (Ireland), EU (London), EU
     *         (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia
     *         Pacific (Singapore), Asia Pacific (Sydney) , China (Beijing), and
     *         China (Ningxia).
     *         </p>
     *         </li>
     *         </ul>
     * @see EnvironmentType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of build environment to use for related builds.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The environment type <code>ARM_CONTAINER</code> is available only in
     * regions US East (N. Virginia), US East (Ohio), US West (Oregon), EU
     * (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific
     * (Sydney), and EU (Frankfurt).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_CONTAINER</code> with compute type
     * <code>build.general1.2xlarge</code> is available only in regions US East
     * (N. Virginia), US East (Ohio), US West (Oregon), Canada (Central), EU
     * (Ireland), EU (London), EU (Frankfurt), Asia Pacific (Tokyo), Asia
     * Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific (Sydney), China
     * (Beijing), and China (Ningxia).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_GPU_CONTAINER</code> is available only
     * in regions US East (N. Virginia), US East (Ohio), US West (Oregon),
     * Canada (Central), EU (Ireland), EU (London), EU (Frankfurt), Asia Pacific
     * (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific
     * (Sydney) , China (Beijing), and China (Ningxia).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS_CONTAINER, LINUX_CONTAINER,
     * LINUX_GPU_CONTAINER, ARM_CONTAINER
     *
     * @param type <p>
     *            The type of build environment to use for related builds.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The environment type <code>ARM_CONTAINER</code> is available
     *            only in regions US East (N. Virginia), US East (Ohio), US West
     *            (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific
     *            (Tokyo), Asia Pacific (Sydney), and EU (Frankfurt).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The environment type <code>LINUX_CONTAINER</code> with compute
     *            type <code>build.general1.2xlarge</code> is available only in
     *            regions US East (N. Virginia), US East (Ohio), US West
     *            (Oregon), Canada (Central), EU (Ireland), EU (London), EU
     *            (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia
     *            Pacific (Singapore), Asia Pacific (Sydney), China (Beijing),
     *            and China (Ningxia).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The environment type <code>LINUX_GPU_CONTAINER</code> is
     *            available only in regions US East (N. Virginia), US East
     *            (Ohio), US West (Oregon), Canada (Central), EU (Ireland), EU
     *            (London), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific
     *            (Seoul), Asia Pacific (Singapore), Asia Pacific (Sydney) ,
     *            China (Beijing), and China (Ningxia).
     *            </p>
     *            </li>
     *            </ul>
     * @see EnvironmentType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of build environment to use for related builds.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The environment type <code>ARM_CONTAINER</code> is available only in
     * regions US East (N. Virginia), US East (Ohio), US West (Oregon), EU
     * (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific
     * (Sydney), and EU (Frankfurt).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_CONTAINER</code> with compute type
     * <code>build.general1.2xlarge</code> is available only in regions US East
     * (N. Virginia), US East (Ohio), US West (Oregon), Canada (Central), EU
     * (Ireland), EU (London), EU (Frankfurt), Asia Pacific (Tokyo), Asia
     * Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific (Sydney), China
     * (Beijing), and China (Ningxia).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_GPU_CONTAINER</code> is available only
     * in regions US East (N. Virginia), US East (Ohio), US West (Oregon),
     * Canada (Central), EU (Ireland), EU (London), EU (Frankfurt), Asia Pacific
     * (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific
     * (Sydney) , China (Beijing), and China (Ningxia).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS_CONTAINER, LINUX_CONTAINER,
     * LINUX_GPU_CONTAINER, ARM_CONTAINER
     *
     * @param type <p>
     *            The type of build environment to use for related builds.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The environment type <code>ARM_CONTAINER</code> is available
     *            only in regions US East (N. Virginia), US East (Ohio), US West
     *            (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific
     *            (Tokyo), Asia Pacific (Sydney), and EU (Frankfurt).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The environment type <code>LINUX_CONTAINER</code> with compute
     *            type <code>build.general1.2xlarge</code> is available only in
     *            regions US East (N. Virginia), US East (Ohio), US West
     *            (Oregon), Canada (Central), EU (Ireland), EU (London), EU
     *            (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia
     *            Pacific (Singapore), Asia Pacific (Sydney), China (Beijing),
     *            and China (Ningxia).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The environment type <code>LINUX_GPU_CONTAINER</code> is
     *            available only in regions US East (N. Virginia), US East
     *            (Ohio), US West (Oregon), Canada (Central), EU (Ireland), EU
     *            (London), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific
     *            (Seoul), Asia Pacific (Singapore), Asia Pacific (Sydney) ,
     *            China (Beijing), and China (Ningxia).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnvironmentType
     */
    public ProjectEnvironment withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of build environment to use for related builds.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The environment type <code>ARM_CONTAINER</code> is available only in
     * regions US East (N. Virginia), US East (Ohio), US West (Oregon), EU
     * (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific
     * (Sydney), and EU (Frankfurt).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_CONTAINER</code> with compute type
     * <code>build.general1.2xlarge</code> is available only in regions US East
     * (N. Virginia), US East (Ohio), US West (Oregon), Canada (Central), EU
     * (Ireland), EU (London), EU (Frankfurt), Asia Pacific (Tokyo), Asia
     * Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific (Sydney), China
     * (Beijing), and China (Ningxia).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_GPU_CONTAINER</code> is available only
     * in regions US East (N. Virginia), US East (Ohio), US West (Oregon),
     * Canada (Central), EU (Ireland), EU (London), EU (Frankfurt), Asia Pacific
     * (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific
     * (Sydney) , China (Beijing), and China (Ningxia).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS_CONTAINER, LINUX_CONTAINER,
     * LINUX_GPU_CONTAINER, ARM_CONTAINER
     *
     * @param type <p>
     *            The type of build environment to use for related builds.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The environment type <code>ARM_CONTAINER</code> is available
     *            only in regions US East (N. Virginia), US East (Ohio), US West
     *            (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific
     *            (Tokyo), Asia Pacific (Sydney), and EU (Frankfurt).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The environment type <code>LINUX_CONTAINER</code> with compute
     *            type <code>build.general1.2xlarge</code> is available only in
     *            regions US East (N. Virginia), US East (Ohio), US West
     *            (Oregon), Canada (Central), EU (Ireland), EU (London), EU
     *            (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia
     *            Pacific (Singapore), Asia Pacific (Sydney), China (Beijing),
     *            and China (Ningxia).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The environment type <code>LINUX_GPU_CONTAINER</code> is
     *            available only in regions US East (N. Virginia), US East
     *            (Ohio), US West (Oregon), Canada (Central), EU (Ireland), EU
     *            (London), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific
     *            (Seoul), Asia Pacific (Singapore), Asia Pacific (Sydney) ,
     *            China (Beijing), and China (Ningxia).
     *            </p>
     *            </li>
     *            </ul>
     * @see EnvironmentType
     */
    public void setType(EnvironmentType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of build environment to use for related builds.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The environment type <code>ARM_CONTAINER</code> is available only in
     * regions US East (N. Virginia), US East (Ohio), US West (Oregon), EU
     * (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific
     * (Sydney), and EU (Frankfurt).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_CONTAINER</code> with compute type
     * <code>build.general1.2xlarge</code> is available only in regions US East
     * (N. Virginia), US East (Ohio), US West (Oregon), Canada (Central), EU
     * (Ireland), EU (London), EU (Frankfurt), Asia Pacific (Tokyo), Asia
     * Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific (Sydney), China
     * (Beijing), and China (Ningxia).
     * </p>
     * </li>
     * <li>
     * <p>
     * The environment type <code>LINUX_GPU_CONTAINER</code> is available only
     * in regions US East (N. Virginia), US East (Ohio), US West (Oregon),
     * Canada (Central), EU (Ireland), EU (London), EU (Frankfurt), Asia Pacific
     * (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific
     * (Sydney) , China (Beijing), and China (Ningxia).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS_CONTAINER, LINUX_CONTAINER,
     * LINUX_GPU_CONTAINER, ARM_CONTAINER
     *
     * @param type <p>
     *            The type of build environment to use for related builds.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The environment type <code>ARM_CONTAINER</code> is available
     *            only in regions US East (N. Virginia), US East (Ohio), US West
     *            (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific
     *            (Tokyo), Asia Pacific (Sydney), and EU (Frankfurt).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The environment type <code>LINUX_CONTAINER</code> with compute
     *            type <code>build.general1.2xlarge</code> is available only in
     *            regions US East (N. Virginia), US East (Ohio), US West
     *            (Oregon), Canada (Central), EU (Ireland), EU (London), EU
     *            (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia
     *            Pacific (Singapore), Asia Pacific (Sydney), China (Beijing),
     *            and China (Ningxia).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The environment type <code>LINUX_GPU_CONTAINER</code> is
     *            available only in regions US East (N. Virginia), US East
     *            (Ohio), US West (Oregon), Canada (Central), EU (Ireland), EU
     *            (London), EU (Frankfurt), Asia Pacific (Tokyo), Asia Pacific
     *            (Seoul), Asia Pacific (Singapore), Asia Pacific (Sydney) ,
     *            China (Beijing), and China (Ningxia).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnvironmentType
     */
    public ProjectEnvironment withType(EnvironmentType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The image tag or image digest that identifies the Docker image to use for
     * this build project. Use the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an image tag: <code>registry/repository:tag</code>. For example, to
     * specify an image with the tag "latest," use
     * <code>registry/repository:latest</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For an image digest: <code>registry/repository@digest</code>. For
     * example, to specify an image with the digest
     * "sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf,"
     * use
     * <code>registry/repository@sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf</code>
     * .
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The image tag or image digest that identifies the Docker image to
     *         use for this build project. Use the following formats:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For an image tag: <code>registry/repository:tag</code>. For
     *         example, to specify an image with the tag "latest," use
     *         <code>registry/repository:latest</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For an image digest: <code>registry/repository@digest</code>. For
     *         example, to specify an image with the digest
     *         "sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf,"
     *         use
     *         <code>registry/repository@sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf</code>
     *         .
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getImage() {
        return image;
    }

    /**
     * <p>
     * The image tag or image digest that identifies the Docker image to use for
     * this build project. Use the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an image tag: <code>registry/repository:tag</code>. For example, to
     * specify an image with the tag "latest," use
     * <code>registry/repository:latest</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For an image digest: <code>registry/repository@digest</code>. For
     * example, to specify an image with the digest
     * "sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf,"
     * use
     * <code>registry/repository@sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf</code>
     * .
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param image <p>
     *            The image tag or image digest that identifies the Docker image
     *            to use for this build project. Use the following formats:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For an image tag: <code>registry/repository:tag</code>. For
     *            example, to specify an image with the tag "latest," use
     *            <code>registry/repository:latest</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For an image digest: <code>registry/repository@digest</code>.
     *            For example, to specify an image with the digest
     *            "sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf,"
     *            use
     *            <code>registry/repository@sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf</code>
     *            .
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * <p>
     * The image tag or image digest that identifies the Docker image to use for
     * this build project. Use the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an image tag: <code>registry/repository:tag</code>. For example, to
     * specify an image with the tag "latest," use
     * <code>registry/repository:latest</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For an image digest: <code>registry/repository@digest</code>. For
     * example, to specify an image with the digest
     * "sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf,"
     * use
     * <code>registry/repository@sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf</code>
     * .
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param image <p>
     *            The image tag or image digest that identifies the Docker image
     *            to use for this build project. Use the following formats:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For an image tag: <code>registry/repository:tag</code>. For
     *            example, to specify an image with the tag "latest," use
     *            <code>registry/repository:latest</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For an image digest: <code>registry/repository@digest</code>.
     *            For example, to specify an image with the digest
     *            "sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf,"
     *            use
     *            <code>registry/repository@sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf</code>
     *            .
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectEnvironment withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * <p>
     * Information about the compute resources the build project uses. Available
     * values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for
     * builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for
     * builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and 8 vCPUs for
     * builds, depending on your environment type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory, 72 vCPUs,
     * and 824 GB of SSD storage for builds. This compute type supports Docker
     * images up to 100 GB uncompressed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use <code>BUILD_GENERAL1_LARGE</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For environment type <code>LINUX_CONTAINER</code>, you can use up to 15
     * GB memory and 8 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to
     * 255 GB memory, 32 vCPUs, and 4 NVIDIA Tesla V100 GPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>ARM_CONTAINER</code>, you can use up to 16 GB
     * memory and 8 vCPUs on ARM-based processors for builds.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html"
     * >Build Environment Compute Types</a> in the <i>AWS CodeBuild User
     * Guide.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BUILD_GENERAL1_SMALL, BUILD_GENERAL1_MEDIUM,
     * BUILD_GENERAL1_LARGE, BUILD_GENERAL1_2XLARGE
     *
     * @return <p>
     *         Information about the compute resources the build project uses.
     *         Available values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2
     *         vCPUs for builds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4
     *         vCPUs for builds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and 8
     *         vCPUs for builds, depending on your environment type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory, 72
     *         vCPUs, and 824 GB of SSD storage for builds. This compute type
     *         supports Docker images up to 100 GB uncompressed.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you use <code>BUILD_GENERAL1_LARGE</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For environment type <code>LINUX_CONTAINER</code>, you can use up
     *         to 15 GB memory and 8 vCPUs for builds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For environment type <code>LINUX_GPU_CONTAINER</code>, you can
     *         use up to 255 GB memory, 32 vCPUs, and 4 NVIDIA Tesla V100 GPUs
     *         for builds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For environment type <code>ARM_CONTAINER</code>, you can use up
     *         to 16 GB memory and 8 vCPUs on ARM-based processors for builds.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html"
     *         >Build Environment Compute Types</a> in the <i>AWS CodeBuild User
     *         Guide.</i>
     *         </p>
     * @see ComputeType
     */
    public String getComputeType() {
        return computeType;
    }

    /**
     * <p>
     * Information about the compute resources the build project uses. Available
     * values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for
     * builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for
     * builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and 8 vCPUs for
     * builds, depending on your environment type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory, 72 vCPUs,
     * and 824 GB of SSD storage for builds. This compute type supports Docker
     * images up to 100 GB uncompressed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use <code>BUILD_GENERAL1_LARGE</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For environment type <code>LINUX_CONTAINER</code>, you can use up to 15
     * GB memory and 8 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to
     * 255 GB memory, 32 vCPUs, and 4 NVIDIA Tesla V100 GPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>ARM_CONTAINER</code>, you can use up to 16 GB
     * memory and 8 vCPUs on ARM-based processors for builds.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html"
     * >Build Environment Compute Types</a> in the <i>AWS CodeBuild User
     * Guide.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BUILD_GENERAL1_SMALL, BUILD_GENERAL1_MEDIUM,
     * BUILD_GENERAL1_LARGE, BUILD_GENERAL1_2XLARGE
     *
     * @param computeType <p>
     *            Information about the compute resources the build project
     *            uses. Available values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2
     *            vCPUs for builds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and
     *            4 vCPUs for builds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and
     *            8 vCPUs for builds, depending on your environment type.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory,
     *            72 vCPUs, and 824 GB of SSD storage for builds. This compute
     *            type supports Docker images up to 100 GB uncompressed.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you use <code>BUILD_GENERAL1_LARGE</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For environment type <code>LINUX_CONTAINER</code>, you can use
     *            up to 15 GB memory and 8 vCPUs for builds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For environment type <code>LINUX_GPU_CONTAINER</code>, you can
     *            use up to 255 GB memory, 32 vCPUs, and 4 NVIDIA Tesla V100
     *            GPUs for builds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For environment type <code>ARM_CONTAINER</code>, you can use
     *            up to 16 GB memory and 8 vCPUs on ARM-based processors for
     *            builds.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html"
     *            >Build Environment Compute Types</a> in the <i>AWS CodeBuild
     *            User Guide.</i>
     *            </p>
     * @see ComputeType
     */
    public void setComputeType(String computeType) {
        this.computeType = computeType;
    }

    /**
     * <p>
     * Information about the compute resources the build project uses. Available
     * values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for
     * builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for
     * builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and 8 vCPUs for
     * builds, depending on your environment type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory, 72 vCPUs,
     * and 824 GB of SSD storage for builds. This compute type supports Docker
     * images up to 100 GB uncompressed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use <code>BUILD_GENERAL1_LARGE</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For environment type <code>LINUX_CONTAINER</code>, you can use up to 15
     * GB memory and 8 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to
     * 255 GB memory, 32 vCPUs, and 4 NVIDIA Tesla V100 GPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>ARM_CONTAINER</code>, you can use up to 16 GB
     * memory and 8 vCPUs on ARM-based processors for builds.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html"
     * >Build Environment Compute Types</a> in the <i>AWS CodeBuild User
     * Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BUILD_GENERAL1_SMALL, BUILD_GENERAL1_MEDIUM,
     * BUILD_GENERAL1_LARGE, BUILD_GENERAL1_2XLARGE
     *
     * @param computeType <p>
     *            Information about the compute resources the build project
     *            uses. Available values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2
     *            vCPUs for builds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and
     *            4 vCPUs for builds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and
     *            8 vCPUs for builds, depending on your environment type.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory,
     *            72 vCPUs, and 824 GB of SSD storage for builds. This compute
     *            type supports Docker images up to 100 GB uncompressed.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you use <code>BUILD_GENERAL1_LARGE</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For environment type <code>LINUX_CONTAINER</code>, you can use
     *            up to 15 GB memory and 8 vCPUs for builds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For environment type <code>LINUX_GPU_CONTAINER</code>, you can
     *            use up to 255 GB memory, 32 vCPUs, and 4 NVIDIA Tesla V100
     *            GPUs for builds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For environment type <code>ARM_CONTAINER</code>, you can use
     *            up to 16 GB memory and 8 vCPUs on ARM-based processors for
     *            builds.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html"
     *            >Build Environment Compute Types</a> in the <i>AWS CodeBuild
     *            User Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComputeType
     */
    public ProjectEnvironment withComputeType(String computeType) {
        this.computeType = computeType;
        return this;
    }

    /**
     * <p>
     * Information about the compute resources the build project uses. Available
     * values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for
     * builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for
     * builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and 8 vCPUs for
     * builds, depending on your environment type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory, 72 vCPUs,
     * and 824 GB of SSD storage for builds. This compute type supports Docker
     * images up to 100 GB uncompressed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use <code>BUILD_GENERAL1_LARGE</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For environment type <code>LINUX_CONTAINER</code>, you can use up to 15
     * GB memory and 8 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to
     * 255 GB memory, 32 vCPUs, and 4 NVIDIA Tesla V100 GPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>ARM_CONTAINER</code>, you can use up to 16 GB
     * memory and 8 vCPUs on ARM-based processors for builds.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html"
     * >Build Environment Compute Types</a> in the <i>AWS CodeBuild User
     * Guide.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BUILD_GENERAL1_SMALL, BUILD_GENERAL1_MEDIUM,
     * BUILD_GENERAL1_LARGE, BUILD_GENERAL1_2XLARGE
     *
     * @param computeType <p>
     *            Information about the compute resources the build project
     *            uses. Available values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2
     *            vCPUs for builds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and
     *            4 vCPUs for builds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and
     *            8 vCPUs for builds, depending on your environment type.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory,
     *            72 vCPUs, and 824 GB of SSD storage for builds. This compute
     *            type supports Docker images up to 100 GB uncompressed.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you use <code>BUILD_GENERAL1_LARGE</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For environment type <code>LINUX_CONTAINER</code>, you can use
     *            up to 15 GB memory and 8 vCPUs for builds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For environment type <code>LINUX_GPU_CONTAINER</code>, you can
     *            use up to 255 GB memory, 32 vCPUs, and 4 NVIDIA Tesla V100
     *            GPUs for builds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For environment type <code>ARM_CONTAINER</code>, you can use
     *            up to 16 GB memory and 8 vCPUs on ARM-based processors for
     *            builds.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html"
     *            >Build Environment Compute Types</a> in the <i>AWS CodeBuild
     *            User Guide.</i>
     *            </p>
     * @see ComputeType
     */
    public void setComputeType(ComputeType computeType) {
        this.computeType = computeType.toString();
    }

    /**
     * <p>
     * Information about the compute resources the build project uses. Available
     * values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2 vCPUs for
     * builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and 4 vCPUs for
     * builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and 8 vCPUs for
     * builds, depending on your environment type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory, 72 vCPUs,
     * and 824 GB of SSD storage for builds. This compute type supports Docker
     * images up to 100 GB uncompressed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use <code>BUILD_GENERAL1_LARGE</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For environment type <code>LINUX_CONTAINER</code>, you can use up to 15
     * GB memory and 8 vCPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>LINUX_GPU_CONTAINER</code>, you can use up to
     * 255 GB memory, 32 vCPUs, and 4 NVIDIA Tesla V100 GPUs for builds.
     * </p>
     * </li>
     * <li>
     * <p>
     * For environment type <code>ARM_CONTAINER</code>, you can use up to 16 GB
     * memory and 8 vCPUs on ARM-based processors for builds.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html"
     * >Build Environment Compute Types</a> in the <i>AWS CodeBuild User
     * Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BUILD_GENERAL1_SMALL, BUILD_GENERAL1_MEDIUM,
     * BUILD_GENERAL1_LARGE, BUILD_GENERAL1_2XLARGE
     *
     * @param computeType <p>
     *            Information about the compute resources the build project
     *            uses. Available values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>BUILD_GENERAL1_SMALL</code>: Use up to 3 GB memory and 2
     *            vCPUs for builds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BUILD_GENERAL1_MEDIUM</code>: Use up to 7 GB memory and
     *            4 vCPUs for builds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BUILD_GENERAL1_LARGE</code>: Use up to 16 GB memory and
     *            8 vCPUs for builds, depending on your environment type.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BUILD_GENERAL1_2XLARGE</code>: Use up to 145 GB memory,
     *            72 vCPUs, and 824 GB of SSD storage for builds. This compute
     *            type supports Docker images up to 100 GB uncompressed.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you use <code>BUILD_GENERAL1_LARGE</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For environment type <code>LINUX_CONTAINER</code>, you can use
     *            up to 15 GB memory and 8 vCPUs for builds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For environment type <code>LINUX_GPU_CONTAINER</code>, you can
     *            use up to 255 GB memory, 32 vCPUs, and 4 NVIDIA Tesla V100
     *            GPUs for builds.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For environment type <code>ARM_CONTAINER</code>, you can use
     *            up to 16 GB memory and 8 vCPUs on ARM-based processors for
     *            builds.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html"
     *            >Build Environment Compute Types</a> in the <i>AWS CodeBuild
     *            User Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComputeType
     */
    public ProjectEnvironment withComputeType(ComputeType computeType) {
        this.computeType = computeType.toString();
        return this;
    }

    /**
     * <p>
     * A set of environment variables to make available to builds for this build
     * project.
     * </p>
     *
     * @return <p>
     *         A set of environment variables to make available to builds for
     *         this build project.
     *         </p>
     */
    public java.util.List<EnvironmentVariable> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * <p>
     * A set of environment variables to make available to builds for this build
     * project.
     * </p>
     *
     * @param environmentVariables <p>
     *            A set of environment variables to make available to builds for
     *            this build project.
     *            </p>
     */
    public void setEnvironmentVariables(
            java.util.Collection<EnvironmentVariable> environmentVariables) {
        if (environmentVariables == null) {
            this.environmentVariables = null;
            return;
        }

        this.environmentVariables = new java.util.ArrayList<EnvironmentVariable>(
                environmentVariables);
    }

    /**
     * <p>
     * A set of environment variables to make available to builds for this build
     * project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environmentVariables <p>
     *            A set of environment variables to make available to builds for
     *            this build project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectEnvironment withEnvironmentVariables(EnvironmentVariable... environmentVariables) {
        if (getEnvironmentVariables() == null) {
            this.environmentVariables = new java.util.ArrayList<EnvironmentVariable>(
                    environmentVariables.length);
        }
        for (EnvironmentVariable value : environmentVariables) {
            this.environmentVariables.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A set of environment variables to make available to builds for this build
     * project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environmentVariables <p>
     *            A set of environment variables to make available to builds for
     *            this build project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectEnvironment withEnvironmentVariables(
            java.util.Collection<EnvironmentVariable> environmentVariables) {
        setEnvironmentVariables(environmentVariables);
        return this;
    }

    /**
     * <p>
     * Enables running the Docker daemon inside a Docker container. Set to true
     * only if the build project is used to build Docker images. Otherwise, a
     * build that attempts to interact with the Docker daemon fails. The default
     * setting is <code>false</code>.
     * </p>
     * <p>
     * You can initialize the Docker daemon during the install phase of your
     * build by adding one of the following sets of commands to the install
     * phase of your buildspec file:
     * </p>
     * <p>
     * If the operating system's base image is Ubuntu Linux:
     * </p>
     * <p>
     * <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     * </p>
     * <p>
     * <code>- timeout 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     * </p>
     * <p>
     * If the operating system's base image is Alpine Linux and the previous
     * command does not work, add the <code>-t</code> argument to
     * <code>timeout</code>:
     * </p>
     * <p>
     * <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     * </p>
     * <p>
     * <code>- timeout -t 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     * </p>
     *
     * @return <p>
     *         Enables running the Docker daemon inside a Docker container. Set
     *         to true only if the build project is used to build Docker images.
     *         Otherwise, a build that attempts to interact with the Docker
     *         daemon fails. The default setting is <code>false</code>.
     *         </p>
     *         <p>
     *         You can initialize the Docker daemon during the install phase of
     *         your build by adding one of the following sets of commands to the
     *         install phase of your buildspec file:
     *         </p>
     *         <p>
     *         If the operating system's base image is Ubuntu Linux:
     *         </p>
     *         <p>
     *         <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     *         </p>
     *         <p>
     *         <code>- timeout 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     *         </p>
     *         <p>
     *         If the operating system's base image is Alpine Linux and the
     *         previous command does not work, add the <code>-t</code> argument
     *         to <code>timeout</code>:
     *         </p>
     *         <p>
     *         <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     *         </p>
     *         <p>
     *         <code>- timeout -t 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     *         </p>
     */
    public Boolean isPrivilegedMode() {
        return privilegedMode;
    }

    /**
     * <p>
     * Enables running the Docker daemon inside a Docker container. Set to true
     * only if the build project is used to build Docker images. Otherwise, a
     * build that attempts to interact with the Docker daemon fails. The default
     * setting is <code>false</code>.
     * </p>
     * <p>
     * You can initialize the Docker daemon during the install phase of your
     * build by adding one of the following sets of commands to the install
     * phase of your buildspec file:
     * </p>
     * <p>
     * If the operating system's base image is Ubuntu Linux:
     * </p>
     * <p>
     * <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     * </p>
     * <p>
     * <code>- timeout 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     * </p>
     * <p>
     * If the operating system's base image is Alpine Linux and the previous
     * command does not work, add the <code>-t</code> argument to
     * <code>timeout</code>:
     * </p>
     * <p>
     * <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     * </p>
     * <p>
     * <code>- timeout -t 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     * </p>
     *
     * @return <p>
     *         Enables running the Docker daemon inside a Docker container. Set
     *         to true only if the build project is used to build Docker images.
     *         Otherwise, a build that attempts to interact with the Docker
     *         daemon fails. The default setting is <code>false</code>.
     *         </p>
     *         <p>
     *         You can initialize the Docker daemon during the install phase of
     *         your build by adding one of the following sets of commands to the
     *         install phase of your buildspec file:
     *         </p>
     *         <p>
     *         If the operating system's base image is Ubuntu Linux:
     *         </p>
     *         <p>
     *         <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     *         </p>
     *         <p>
     *         <code>- timeout 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     *         </p>
     *         <p>
     *         If the operating system's base image is Alpine Linux and the
     *         previous command does not work, add the <code>-t</code> argument
     *         to <code>timeout</code>:
     *         </p>
     *         <p>
     *         <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     *         </p>
     *         <p>
     *         <code>- timeout -t 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     *         </p>
     */
    public Boolean getPrivilegedMode() {
        return privilegedMode;
    }

    /**
     * <p>
     * Enables running the Docker daemon inside a Docker container. Set to true
     * only if the build project is used to build Docker images. Otherwise, a
     * build that attempts to interact with the Docker daemon fails. The default
     * setting is <code>false</code>.
     * </p>
     * <p>
     * You can initialize the Docker daemon during the install phase of your
     * build by adding one of the following sets of commands to the install
     * phase of your buildspec file:
     * </p>
     * <p>
     * If the operating system's base image is Ubuntu Linux:
     * </p>
     * <p>
     * <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     * </p>
     * <p>
     * <code>- timeout 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     * </p>
     * <p>
     * If the operating system's base image is Alpine Linux and the previous
     * command does not work, add the <code>-t</code> argument to
     * <code>timeout</code>:
     * </p>
     * <p>
     * <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     * </p>
     * <p>
     * <code>- timeout -t 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     * </p>
     *
     * @param privilegedMode <p>
     *            Enables running the Docker daemon inside a Docker container.
     *            Set to true only if the build project is used to build Docker
     *            images. Otherwise, a build that attempts to interact with the
     *            Docker daemon fails. The default setting is <code>false</code>
     *            .
     *            </p>
     *            <p>
     *            You can initialize the Docker daemon during the install phase
     *            of your build by adding one of the following sets of commands
     *            to the install phase of your buildspec file:
     *            </p>
     *            <p>
     *            If the operating system's base image is Ubuntu Linux:
     *            </p>
     *            <p>
     *            <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     *            </p>
     *            <p>
     *            <code>- timeout 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     *            </p>
     *            <p>
     *            If the operating system's base image is Alpine Linux and the
     *            previous command does not work, add the <code>-t</code>
     *            argument to <code>timeout</code>:
     *            </p>
     *            <p>
     *            <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     *            </p>
     *            <p>
     *            <code>- timeout -t 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     *            </p>
     */
    public void setPrivilegedMode(Boolean privilegedMode) {
        this.privilegedMode = privilegedMode;
    }

    /**
     * <p>
     * Enables running the Docker daemon inside a Docker container. Set to true
     * only if the build project is used to build Docker images. Otherwise, a
     * build that attempts to interact with the Docker daemon fails. The default
     * setting is <code>false</code>.
     * </p>
     * <p>
     * You can initialize the Docker daemon during the install phase of your
     * build by adding one of the following sets of commands to the install
     * phase of your buildspec file:
     * </p>
     * <p>
     * If the operating system's base image is Ubuntu Linux:
     * </p>
     * <p>
     * <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     * </p>
     * <p>
     * <code>- timeout 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     * </p>
     * <p>
     * If the operating system's base image is Alpine Linux and the previous
     * command does not work, add the <code>-t</code> argument to
     * <code>timeout</code>:
     * </p>
     * <p>
     * <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     * </p>
     * <p>
     * <code>- timeout -t 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privilegedMode <p>
     *            Enables running the Docker daemon inside a Docker container.
     *            Set to true only if the build project is used to build Docker
     *            images. Otherwise, a build that attempts to interact with the
     *            Docker daemon fails. The default setting is <code>false</code>
     *            .
     *            </p>
     *            <p>
     *            You can initialize the Docker daemon during the install phase
     *            of your build by adding one of the following sets of commands
     *            to the install phase of your buildspec file:
     *            </p>
     *            <p>
     *            If the operating system's base image is Ubuntu Linux:
     *            </p>
     *            <p>
     *            <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     *            </p>
     *            <p>
     *            <code>- timeout 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     *            </p>
     *            <p>
     *            If the operating system's base image is Alpine Linux and the
     *            previous command does not work, add the <code>-t</code>
     *            argument to <code>timeout</code>:
     *            </p>
     *            <p>
     *            <code>- nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;</code>
     *            </p>
     *            <p>
     *            <code>- timeout -t 15 sh -c "until docker info; do echo .; sleep 1; done"</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectEnvironment withPrivilegedMode(Boolean privilegedMode) {
        this.privilegedMode = privilegedMode;
        return this;
    }

    /**
     * <p>
     * The certificate to use with this build project.
     * </p>
     *
     * @return <p>
     *         The certificate to use with this build project.
     *         </p>
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * <p>
     * The certificate to use with this build project.
     * </p>
     *
     * @param certificate <p>
     *            The certificate to use with this build project.
     *            </p>
     */
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * The certificate to use with this build project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificate <p>
     *            The certificate to use with this build project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectEnvironment withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * <p>
     * The credentials for access to a private registry.
     * </p>
     *
     * @return <p>
     *         The credentials for access to a private registry.
     *         </p>
     */
    public RegistryCredential getRegistryCredential() {
        return registryCredential;
    }

    /**
     * <p>
     * The credentials for access to a private registry.
     * </p>
     *
     * @param registryCredential <p>
     *            The credentials for access to a private registry.
     *            </p>
     */
    public void setRegistryCredential(RegistryCredential registryCredential) {
        this.registryCredential = registryCredential;
    }

    /**
     * <p>
     * The credentials for access to a private registry.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param registryCredential <p>
     *            The credentials for access to a private registry.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectEnvironment withRegistryCredential(RegistryCredential registryCredential) {
        this.registryCredential = registryCredential;
        return this;
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build.
     * There are two valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own
     * credentials. This requires that you modify your ECR repository policy to
     * trust AWS CodeBuild's service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build
     * project's service role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you use a cross-account or private registry image, you must use
     * SERVICE_ROLE credentials. When you use an AWS CodeBuild curated image,
     * you must use CODEBUILD credentials.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODEBUILD, SERVICE_ROLE
     *
     * @return <p>
     *         The type of credentials AWS CodeBuild uses to pull images in your
     *         build. There are two valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own
     *         credentials. This requires that you modify your ECR repository
     *         policy to trust AWS CodeBuild's service principal.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your
     *         build project's service role.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When you use a cross-account or private registry image, you must
     *         use SERVICE_ROLE credentials. When you use an AWS CodeBuild
     *         curated image, you must use CODEBUILD credentials.
     *         </p>
     * @see ImagePullCredentialsType
     */
    public String getImagePullCredentialsType() {
        return imagePullCredentialsType;
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build.
     * There are two valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own
     * credentials. This requires that you modify your ECR repository policy to
     * trust AWS CodeBuild's service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build
     * project's service role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you use a cross-account or private registry image, you must use
     * SERVICE_ROLE credentials. When you use an AWS CodeBuild curated image,
     * you must use CODEBUILD credentials.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODEBUILD, SERVICE_ROLE
     *
     * @param imagePullCredentialsType <p>
     *            The type of credentials AWS CodeBuild uses to pull images in
     *            your build. There are two valid values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CODEBUILD</code> specifies that AWS CodeBuild uses its
     *            own credentials. This requires that you modify your ECR
     *            repository policy to trust AWS CodeBuild's service principal.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses
     *            your build project's service role.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            When you use a cross-account or private registry image, you
     *            must use SERVICE_ROLE credentials. When you use an AWS
     *            CodeBuild curated image, you must use CODEBUILD credentials.
     *            </p>
     * @see ImagePullCredentialsType
     */
    public void setImagePullCredentialsType(String imagePullCredentialsType) {
        this.imagePullCredentialsType = imagePullCredentialsType;
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build.
     * There are two valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own
     * credentials. This requires that you modify your ECR repository policy to
     * trust AWS CodeBuild's service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build
     * project's service role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you use a cross-account or private registry image, you must use
     * SERVICE_ROLE credentials. When you use an AWS CodeBuild curated image,
     * you must use CODEBUILD credentials.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODEBUILD, SERVICE_ROLE
     *
     * @param imagePullCredentialsType <p>
     *            The type of credentials AWS CodeBuild uses to pull images in
     *            your build. There are two valid values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CODEBUILD</code> specifies that AWS CodeBuild uses its
     *            own credentials. This requires that you modify your ECR
     *            repository policy to trust AWS CodeBuild's service principal.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses
     *            your build project's service role.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            When you use a cross-account or private registry image, you
     *            must use SERVICE_ROLE credentials. When you use an AWS
     *            CodeBuild curated image, you must use CODEBUILD credentials.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ImagePullCredentialsType
     */
    public ProjectEnvironment withImagePullCredentialsType(String imagePullCredentialsType) {
        this.imagePullCredentialsType = imagePullCredentialsType;
        return this;
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build.
     * There are two valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own
     * credentials. This requires that you modify your ECR repository policy to
     * trust AWS CodeBuild's service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build
     * project's service role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you use a cross-account or private registry image, you must use
     * SERVICE_ROLE credentials. When you use an AWS CodeBuild curated image,
     * you must use CODEBUILD credentials.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODEBUILD, SERVICE_ROLE
     *
     * @param imagePullCredentialsType <p>
     *            The type of credentials AWS CodeBuild uses to pull images in
     *            your build. There are two valid values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CODEBUILD</code> specifies that AWS CodeBuild uses its
     *            own credentials. This requires that you modify your ECR
     *            repository policy to trust AWS CodeBuild's service principal.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses
     *            your build project's service role.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            When you use a cross-account or private registry image, you
     *            must use SERVICE_ROLE credentials. When you use an AWS
     *            CodeBuild curated image, you must use CODEBUILD credentials.
     *            </p>
     * @see ImagePullCredentialsType
     */
    public void setImagePullCredentialsType(ImagePullCredentialsType imagePullCredentialsType) {
        this.imagePullCredentialsType = imagePullCredentialsType.toString();
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build.
     * There are two valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own
     * credentials. This requires that you modify your ECR repository policy to
     * trust AWS CodeBuild's service principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses your build
     * project's service role.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you use a cross-account or private registry image, you must use
     * SERVICE_ROLE credentials. When you use an AWS CodeBuild curated image,
     * you must use CODEBUILD credentials.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CODEBUILD, SERVICE_ROLE
     *
     * @param imagePullCredentialsType <p>
     *            The type of credentials AWS CodeBuild uses to pull images in
     *            your build. There are two valid values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CODEBUILD</code> specifies that AWS CodeBuild uses its
     *            own credentials. This requires that you modify your ECR
     *            repository policy to trust AWS CodeBuild's service principal.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SERVICE_ROLE</code> specifies that AWS CodeBuild uses
     *            your build project's service role.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            When you use a cross-account or private registry image, you
     *            must use SERVICE_ROLE credentials. When you use an AWS
     *            CodeBuild curated image, you must use CODEBUILD credentials.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ImagePullCredentialsType
     */
    public ProjectEnvironment withImagePullCredentialsType(
            ImagePullCredentialsType imagePullCredentialsType) {
        this.imagePullCredentialsType = imagePullCredentialsType.toString();
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
        if (getImage() != null)
            sb.append("image: " + getImage() + ",");
        if (getComputeType() != null)
            sb.append("computeType: " + getComputeType() + ",");
        if (getEnvironmentVariables() != null)
            sb.append("environmentVariables: " + getEnvironmentVariables() + ",");
        if (getPrivilegedMode() != null)
            sb.append("privilegedMode: " + getPrivilegedMode() + ",");
        if (getCertificate() != null)
            sb.append("certificate: " + getCertificate() + ",");
        if (getRegistryCredential() != null)
            sb.append("registryCredential: " + getRegistryCredential() + ",");
        if (getImagePullCredentialsType() != null)
            sb.append("imagePullCredentialsType: " + getImagePullCredentialsType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode
                + ((getComputeType() == null) ? 0 : getComputeType().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironmentVariables() == null) ? 0 : getEnvironmentVariables().hashCode());
        hashCode = prime * hashCode
                + ((getPrivilegedMode() == null) ? 0 : getPrivilegedMode().hashCode());
        hashCode = prime * hashCode
                + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        hashCode = prime * hashCode
                + ((getRegistryCredential() == null) ? 0 : getRegistryCredential().hashCode());
        hashCode = prime
                * hashCode
                + ((getImagePullCredentialsType() == null) ? 0 : getImagePullCredentialsType()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectEnvironment == false)
            return false;
        ProjectEnvironment other = (ProjectEnvironment) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getComputeType() == null ^ this.getComputeType() == null)
            return false;
        if (other.getComputeType() != null
                && other.getComputeType().equals(this.getComputeType()) == false)
            return false;
        if (other.getEnvironmentVariables() == null ^ this.getEnvironmentVariables() == null)
            return false;
        if (other.getEnvironmentVariables() != null
                && other.getEnvironmentVariables().equals(this.getEnvironmentVariables()) == false)
            return false;
        if (other.getPrivilegedMode() == null ^ this.getPrivilegedMode() == null)
            return false;
        if (other.getPrivilegedMode() != null
                && other.getPrivilegedMode().equals(this.getPrivilegedMode()) == false)
            return false;
        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null
                && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
        if (other.getRegistryCredential() == null ^ this.getRegistryCredential() == null)
            return false;
        if (other.getRegistryCredential() != null
                && other.getRegistryCredential().equals(this.getRegistryCredential()) == false)
            return false;
        if (other.getImagePullCredentialsType() == null
                ^ this.getImagePullCredentialsType() == null)
            return false;
        if (other.getImagePullCredentialsType() != null
                && other.getImagePullCredentialsType().equals(this.getImagePullCredentialsType()) == false)
            return false;
        return true;
    }
}
