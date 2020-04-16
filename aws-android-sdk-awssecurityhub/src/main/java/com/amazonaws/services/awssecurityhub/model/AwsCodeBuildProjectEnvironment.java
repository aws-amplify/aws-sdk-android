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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the build environment for this build project.
 * </p>
 */
public class AwsCodeBuildProjectEnvironment implements Serializable {
    /**
     * <p>
     * The certificate to use with this build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String certificate;

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own
     * credentials. This requires that you modify your ECR repository policy to
     * trust the AWS CodeBuild service principal.
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
     * <code>SERVICE_ROLE</code> credentials. When you use an AWS CodeBuild
     * curated image, you must use <code>CODEBUILD</code> credentials.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String imagePullCredentialsType;

    /**
     * <p>
     * The credentials for access to a private registry.
     * </p>
     */
    private AwsCodeBuildProjectEnvironmentRegistryCredential registryCredential;

    /**
     * <p>
     * The type of build environment to use for related builds.
     * </p>
     * <p>
     * The environment type <code>ARM_CONTAINER</code> is available only in
     * regions US East (N. Virginia), US East (Ohio), US West (Oregon), Europe
     * (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific
     * (Sydney), and Europe (Frankfurt).
     * </p>
     * <p>
     * The environment type <code>LINUX_CONTAINER</code> with compute type
     * build.general1.2xlarge is available only in regions US East (N.
     * Virginia), US East (N. Virginia), US West (Oregon), Canada (Central),
     * Europe (Ireland), Europe (London), Europe (Frankfurt), Asia Pacific
     * (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific
     * (Sydney), China (Beijing), and China (Ningxia).
     * </p>
     * <p>
     * The environment type <code>LINUX_GPU_CONTAINER</code> is available only
     * in regions US East (N. Virginia), US East (N. Virginia), US West
     * (Oregon), Canada (Central), Europe (Ireland), Europe (London), Europe
     * (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific
     * (Singapore), Asia Pacific (Sydney) , China (Beijing), and China
     * (Ningxia).
     * </p>
     * <p>
     * Valid values: <code>WINDOWS_CONTAINER</code> |
     * <code>LINUX_CONTAINER</code> | <code>LINUX_GPU_CONTAINER</code> |
     * <code>ARM_CONTAINER</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String type;

    /**
     * <p>
     * The certificate to use with this build project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param certificate <p>
     *            The certificate to use with this build project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCodeBuildProjectEnvironment withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own
     * credentials. This requires that you modify your ECR repository policy to
     * trust the AWS CodeBuild service principal.
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
     * <code>SERVICE_ROLE</code> credentials. When you use an AWS CodeBuild
     * curated image, you must use <code>CODEBUILD</code> credentials.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The type of credentials AWS CodeBuild uses to pull images in your
     *         build.
     *         </p>
     *         <p>
     *         Valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own
     *         credentials. This requires that you modify your ECR repository
     *         policy to trust the AWS CodeBuild service principal.
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
     *         use <code>SERVICE_ROLE</code> credentials. When you use an AWS
     *         CodeBuild curated image, you must use <code>CODEBUILD</code>
     *         credentials.
     *         </p>
     */
    public String getImagePullCredentialsType() {
        return imagePullCredentialsType;
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own
     * credentials. This requires that you modify your ECR repository policy to
     * trust the AWS CodeBuild service principal.
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
     * <code>SERVICE_ROLE</code> credentials. When you use an AWS CodeBuild
     * curated image, you must use <code>CODEBUILD</code> credentials.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param imagePullCredentialsType <p>
     *            The type of credentials AWS CodeBuild uses to pull images in
     *            your build.
     *            </p>
     *            <p>
     *            Valid values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CODEBUILD</code> specifies that AWS CodeBuild uses its
     *            own credentials. This requires that you modify your ECR
     *            repository policy to trust the AWS CodeBuild service
     *            principal.
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
     *            must use <code>SERVICE_ROLE</code> credentials. When you use
     *            an AWS CodeBuild curated image, you must use
     *            <code>CODEBUILD</code> credentials.
     *            </p>
     */
    public void setImagePullCredentialsType(String imagePullCredentialsType) {
        this.imagePullCredentialsType = imagePullCredentialsType;
    }

    /**
     * <p>
     * The type of credentials AWS CodeBuild uses to pull images in your build.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CODEBUILD</code> specifies that AWS CodeBuild uses its own
     * credentials. This requires that you modify your ECR repository policy to
     * trust the AWS CodeBuild service principal.
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
     * <code>SERVICE_ROLE</code> credentials. When you use an AWS CodeBuild
     * curated image, you must use <code>CODEBUILD</code> credentials.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param imagePullCredentialsType <p>
     *            The type of credentials AWS CodeBuild uses to pull images in
     *            your build.
     *            </p>
     *            <p>
     *            Valid values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CODEBUILD</code> specifies that AWS CodeBuild uses its
     *            own credentials. This requires that you modify your ECR
     *            repository policy to trust the AWS CodeBuild service
     *            principal.
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
     *            must use <code>SERVICE_ROLE</code> credentials. When you use
     *            an AWS CodeBuild curated image, you must use
     *            <code>CODEBUILD</code> credentials.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCodeBuildProjectEnvironment withImagePullCredentialsType(
            String imagePullCredentialsType) {
        this.imagePullCredentialsType = imagePullCredentialsType;
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
    public AwsCodeBuildProjectEnvironmentRegistryCredential getRegistryCredential() {
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
    public void setRegistryCredential(
            AwsCodeBuildProjectEnvironmentRegistryCredential registryCredential) {
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
    public AwsCodeBuildProjectEnvironment withRegistryCredential(
            AwsCodeBuildProjectEnvironmentRegistryCredential registryCredential) {
        this.registryCredential = registryCredential;
        return this;
    }

    /**
     * <p>
     * The type of build environment to use for related builds.
     * </p>
     * <p>
     * The environment type <code>ARM_CONTAINER</code> is available only in
     * regions US East (N. Virginia), US East (Ohio), US West (Oregon), Europe
     * (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific
     * (Sydney), and Europe (Frankfurt).
     * </p>
     * <p>
     * The environment type <code>LINUX_CONTAINER</code> with compute type
     * build.general1.2xlarge is available only in regions US East (N.
     * Virginia), US East (N. Virginia), US West (Oregon), Canada (Central),
     * Europe (Ireland), Europe (London), Europe (Frankfurt), Asia Pacific
     * (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific
     * (Sydney), China (Beijing), and China (Ningxia).
     * </p>
     * <p>
     * The environment type <code>LINUX_GPU_CONTAINER</code> is available only
     * in regions US East (N. Virginia), US East (N. Virginia), US West
     * (Oregon), Canada (Central), Europe (Ireland), Europe (London), Europe
     * (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific
     * (Singapore), Asia Pacific (Sydney) , China (Beijing), and China
     * (Ningxia).
     * </p>
     * <p>
     * Valid values: <code>WINDOWS_CONTAINER</code> |
     * <code>LINUX_CONTAINER</code> | <code>LINUX_GPU_CONTAINER</code> |
     * <code>ARM_CONTAINER</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The type of build environment to use for related builds.
     *         </p>
     *         <p>
     *         The environment type <code>ARM_CONTAINER</code> is available only
     *         in regions US East (N. Virginia), US East (Ohio), US West
     *         (Oregon), Europe (Ireland), Asia Pacific (Mumbai), Asia Pacific
     *         (Tokyo), Asia Pacific (Sydney), and Europe (Frankfurt).
     *         </p>
     *         <p>
     *         The environment type <code>LINUX_CONTAINER</code> with compute
     *         type build.general1.2xlarge is available only in regions US East
     *         (N. Virginia), US East (N. Virginia), US West (Oregon), Canada
     *         (Central), Europe (Ireland), Europe (London), Europe (Frankfurt),
     *         Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific
     *         (Singapore), Asia Pacific (Sydney), China (Beijing), and China
     *         (Ningxia).
     *         </p>
     *         <p>
     *         The environment type <code>LINUX_GPU_CONTAINER</code> is
     *         available only in regions US East (N. Virginia), US East (N.
     *         Virginia), US West (Oregon), Canada (Central), Europe (Ireland),
     *         Europe (London), Europe (Frankfurt), Asia Pacific (Tokyo), Asia
     *         Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific (Sydney)
     *         , China (Beijing), and China (Ningxia).
     *         </p>
     *         <p>
     *         Valid values: <code>WINDOWS_CONTAINER</code> |
     *         <code>LINUX_CONTAINER</code> | <code>LINUX_GPU_CONTAINER</code> |
     *         <code>ARM_CONTAINER</code>
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of build environment to use for related builds.
     * </p>
     * <p>
     * The environment type <code>ARM_CONTAINER</code> is available only in
     * regions US East (N. Virginia), US East (Ohio), US West (Oregon), Europe
     * (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific
     * (Sydney), and Europe (Frankfurt).
     * </p>
     * <p>
     * The environment type <code>LINUX_CONTAINER</code> with compute type
     * build.general1.2xlarge is available only in regions US East (N.
     * Virginia), US East (N. Virginia), US West (Oregon), Canada (Central),
     * Europe (Ireland), Europe (London), Europe (Frankfurt), Asia Pacific
     * (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific
     * (Sydney), China (Beijing), and China (Ningxia).
     * </p>
     * <p>
     * The environment type <code>LINUX_GPU_CONTAINER</code> is available only
     * in regions US East (N. Virginia), US East (N. Virginia), US West
     * (Oregon), Canada (Central), Europe (Ireland), Europe (London), Europe
     * (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific
     * (Singapore), Asia Pacific (Sydney) , China (Beijing), and China
     * (Ningxia).
     * </p>
     * <p>
     * Valid values: <code>WINDOWS_CONTAINER</code> |
     * <code>LINUX_CONTAINER</code> | <code>LINUX_GPU_CONTAINER</code> |
     * <code>ARM_CONTAINER</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param type <p>
     *            The type of build environment to use for related builds.
     *            </p>
     *            <p>
     *            The environment type <code>ARM_CONTAINER</code> is available
     *            only in regions US East (N. Virginia), US East (Ohio), US West
     *            (Oregon), Europe (Ireland), Asia Pacific (Mumbai), Asia
     *            Pacific (Tokyo), Asia Pacific (Sydney), and Europe
     *            (Frankfurt).
     *            </p>
     *            <p>
     *            The environment type <code>LINUX_CONTAINER</code> with compute
     *            type build.general1.2xlarge is available only in regions US
     *            East (N. Virginia), US East (N. Virginia), US West (Oregon),
     *            Canada (Central), Europe (Ireland), Europe (London), Europe
     *            (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia
     *            Pacific (Singapore), Asia Pacific (Sydney), China (Beijing),
     *            and China (Ningxia).
     *            </p>
     *            <p>
     *            The environment type <code>LINUX_GPU_CONTAINER</code> is
     *            available only in regions US East (N. Virginia), US East (N.
     *            Virginia), US West (Oregon), Canada (Central), Europe
     *            (Ireland), Europe (London), Europe (Frankfurt), Asia Pacific
     *            (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia
     *            Pacific (Sydney) , China (Beijing), and China (Ningxia).
     *            </p>
     *            <p>
     *            Valid values: <code>WINDOWS_CONTAINER</code> |
     *            <code>LINUX_CONTAINER</code> |
     *            <code>LINUX_GPU_CONTAINER</code> | <code>ARM_CONTAINER</code>
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of build environment to use for related builds.
     * </p>
     * <p>
     * The environment type <code>ARM_CONTAINER</code> is available only in
     * regions US East (N. Virginia), US East (Ohio), US West (Oregon), Europe
     * (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia Pacific
     * (Sydney), and Europe (Frankfurt).
     * </p>
     * <p>
     * The environment type <code>LINUX_CONTAINER</code> with compute type
     * build.general1.2xlarge is available only in regions US East (N.
     * Virginia), US East (N. Virginia), US West (Oregon), Canada (Central),
     * Europe (Ireland), Europe (London), Europe (Frankfurt), Asia Pacific
     * (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific
     * (Sydney), China (Beijing), and China (Ningxia).
     * </p>
     * <p>
     * The environment type <code>LINUX_GPU_CONTAINER</code> is available only
     * in regions US East (N. Virginia), US East (N. Virginia), US West
     * (Oregon), Canada (Central), Europe (Ireland), Europe (London), Europe
     * (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific
     * (Singapore), Asia Pacific (Sydney) , China (Beijing), and China
     * (Ningxia).
     * </p>
     * <p>
     * Valid values: <code>WINDOWS_CONTAINER</code> |
     * <code>LINUX_CONTAINER</code> | <code>LINUX_GPU_CONTAINER</code> |
     * <code>ARM_CONTAINER</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param type <p>
     *            The type of build environment to use for related builds.
     *            </p>
     *            <p>
     *            The environment type <code>ARM_CONTAINER</code> is available
     *            only in regions US East (N. Virginia), US East (Ohio), US West
     *            (Oregon), Europe (Ireland), Asia Pacific (Mumbai), Asia
     *            Pacific (Tokyo), Asia Pacific (Sydney), and Europe
     *            (Frankfurt).
     *            </p>
     *            <p>
     *            The environment type <code>LINUX_CONTAINER</code> with compute
     *            type build.general1.2xlarge is available only in regions US
     *            East (N. Virginia), US East (N. Virginia), US West (Oregon),
     *            Canada (Central), Europe (Ireland), Europe (London), Europe
     *            (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia
     *            Pacific (Singapore), Asia Pacific (Sydney), China (Beijing),
     *            and China (Ningxia).
     *            </p>
     *            <p>
     *            The environment type <code>LINUX_GPU_CONTAINER</code> is
     *            available only in regions US East (N. Virginia), US East (N.
     *            Virginia), US West (Oregon), Canada (Central), Europe
     *            (Ireland), Europe (London), Europe (Frankfurt), Asia Pacific
     *            (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia
     *            Pacific (Sydney) , China (Beijing), and China (Ningxia).
     *            </p>
     *            <p>
     *            Valid values: <code>WINDOWS_CONTAINER</code> |
     *            <code>LINUX_CONTAINER</code> |
     *            <code>LINUX_GPU_CONTAINER</code> | <code>ARM_CONTAINER</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCodeBuildProjectEnvironment withType(String type) {
        this.type = type;
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
        if (getCertificate() != null)
            sb.append("Certificate: " + getCertificate() + ",");
        if (getImagePullCredentialsType() != null)
            sb.append("ImagePullCredentialsType: " + getImagePullCredentialsType() + ",");
        if (getRegistryCredential() != null)
            sb.append("RegistryCredential: " + getRegistryCredential() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        hashCode = prime
                * hashCode
                + ((getImagePullCredentialsType() == null) ? 0 : getImagePullCredentialsType()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getRegistryCredential() == null) ? 0 : getRegistryCredential().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCodeBuildProjectEnvironment == false)
            return false;
        AwsCodeBuildProjectEnvironment other = (AwsCodeBuildProjectEnvironment) obj;

        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null
                && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
        if (other.getImagePullCredentialsType() == null
                ^ this.getImagePullCredentialsType() == null)
            return false;
        if (other.getImagePullCredentialsType() != null
                && other.getImagePullCredentialsType().equals(this.getImagePullCredentialsType()) == false)
            return false;
        if (other.getRegistryCredential() == null ^ this.getRegistryCredential() == null)
            return false;
        if (other.getRegistryCredential() != null
                && other.getRegistryCredential().equals(this.getRegistryCredential()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
