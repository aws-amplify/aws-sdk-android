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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <note>
 * <p>
 * This action is only used by the Amazon ECS agent, and it is not intended for
 * use outside of the agent.
 * </p>
 * </note>
 * <p>
 * Registers an EC2 instance into the specified cluster. This instance becomes
 * available to place containers on.
 * </p>
 */
public class RegisterContainerInstanceRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster with
     * which to register your container instance. If you do not specify a
     * cluster, the default cluster is assumed.
     * </p>
     */
    private String cluster;

    /**
     * <p>
     * The instance identity document for the EC2 instance to register. This
     * document can be found by running the following command from the instance:
     * <code>curl http://169.254.169.254/latest/dynamic/instance-identity/document/</code>
     * </p>
     */
    private String instanceIdentityDocument;

    /**
     * <p>
     * The instance identity document signature for the EC2 instance to
     * register. This signature can be found by running the following command
     * from the instance:
     * <code>curl http://169.254.169.254/latest/dynamic/instance-identity/signature/</code>
     * </p>
     */
    private String instanceIdentityDocumentSignature;

    /**
     * <p>
     * The resources available on the instance.
     * </p>
     */
    private java.util.List<Resource> totalResources;

    /**
     * <p>
     * The version information for the Amazon ECS container agent and Docker
     * daemon running on the container instance.
     * </p>
     */
    private VersionInfo versionInfo;

    /**
     * <p>
     * The ARN of the container instance (if it was previously registered).
     * </p>
     */
    private String containerInstanceArn;

    /**
     * <p>
     * The container instance attributes that this container instance supports.
     * </p>
     */
    private java.util.List<Attribute> attributes;

    /**
     * <p>
     * The devices that are available on the container instance. The only
     * supported device type is a GPU.
     * </p>
     */
    private java.util.List<PlatformDevice> platformDevices;

    /**
     * <p>
     * The metadata that you apply to the container instance to help you
     * categorize and organize them. Each tag consists of a key and an optional
     * value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have
     * only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources,
     * remember that other services may have restrictions on allowed characters.
     * Generally allowed characters are: letters, numbers, and spaces
     * representable in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or
     * lowercase combination of such as a prefix for either keys or values as it
     * is reserved for AWS use. You cannot edit or delete tag keys or values
     * with this prefix. Tags with this prefix do not count against your tags
     * per resource limit.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster with
     * which to register your container instance. If you do not specify a
     * cluster, the default cluster is assumed.
     * </p>
     *
     * @return <p>
     *         The short name or full Amazon Resource Name (ARN) of the cluster
     *         with which to register your container instance. If you do not
     *         specify a cluster, the default cluster is assumed.
     *         </p>
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster with
     * which to register your container instance. If you do not specify a
     * cluster, the default cluster is assumed.
     * </p>
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster with which to register your container instance. If you
     *            do not specify a cluster, the default cluster is assumed.
     *            </p>
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster with
     * which to register your container instance. If you do not specify a
     * cluster, the default cluster is assumed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cluster <p>
     *            The short name or full Amazon Resource Name (ARN) of the
     *            cluster with which to register your container instance. If you
     *            do not specify a cluster, the default cluster is assumed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterContainerInstanceRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * <p>
     * The instance identity document for the EC2 instance to register. This
     * document can be found by running the following command from the instance:
     * <code>curl http://169.254.169.254/latest/dynamic/instance-identity/document/</code>
     * </p>
     *
     * @return <p>
     *         The instance identity document for the EC2 instance to register.
     *         This document can be found by running the following command from
     *         the instance:
     *         <code>curl http://169.254.169.254/latest/dynamic/instance-identity/document/</code>
     *         </p>
     */
    public String getInstanceIdentityDocument() {
        return instanceIdentityDocument;
    }

    /**
     * <p>
     * The instance identity document for the EC2 instance to register. This
     * document can be found by running the following command from the instance:
     * <code>curl http://169.254.169.254/latest/dynamic/instance-identity/document/</code>
     * </p>
     *
     * @param instanceIdentityDocument <p>
     *            The instance identity document for the EC2 instance to
     *            register. This document can be found by running the following
     *            command from the instance:
     *            <code>curl http://169.254.169.254/latest/dynamic/instance-identity/document/</code>
     *            </p>
     */
    public void setInstanceIdentityDocument(String instanceIdentityDocument) {
        this.instanceIdentityDocument = instanceIdentityDocument;
    }

    /**
     * <p>
     * The instance identity document for the EC2 instance to register. This
     * document can be found by running the following command from the instance:
     * <code>curl http://169.254.169.254/latest/dynamic/instance-identity/document/</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceIdentityDocument <p>
     *            The instance identity document for the EC2 instance to
     *            register. This document can be found by running the following
     *            command from the instance:
     *            <code>curl http://169.254.169.254/latest/dynamic/instance-identity/document/</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterContainerInstanceRequest withInstanceIdentityDocument(
            String instanceIdentityDocument) {
        this.instanceIdentityDocument = instanceIdentityDocument;
        return this;
    }

    /**
     * <p>
     * The instance identity document signature for the EC2 instance to
     * register. This signature can be found by running the following command
     * from the instance:
     * <code>curl http://169.254.169.254/latest/dynamic/instance-identity/signature/</code>
     * </p>
     *
     * @return <p>
     *         The instance identity document signature for the EC2 instance to
     *         register. This signature can be found by running the following
     *         command from the instance:
     *         <code>curl http://169.254.169.254/latest/dynamic/instance-identity/signature/</code>
     *         </p>
     */
    public String getInstanceIdentityDocumentSignature() {
        return instanceIdentityDocumentSignature;
    }

    /**
     * <p>
     * The instance identity document signature for the EC2 instance to
     * register. This signature can be found by running the following command
     * from the instance:
     * <code>curl http://169.254.169.254/latest/dynamic/instance-identity/signature/</code>
     * </p>
     *
     * @param instanceIdentityDocumentSignature <p>
     *            The instance identity document signature for the EC2 instance
     *            to register. This signature can be found by running the
     *            following command from the instance:
     *            <code>curl http://169.254.169.254/latest/dynamic/instance-identity/signature/</code>
     *            </p>
     */
    public void setInstanceIdentityDocumentSignature(String instanceIdentityDocumentSignature) {
        this.instanceIdentityDocumentSignature = instanceIdentityDocumentSignature;
    }

    /**
     * <p>
     * The instance identity document signature for the EC2 instance to
     * register. This signature can be found by running the following command
     * from the instance:
     * <code>curl http://169.254.169.254/latest/dynamic/instance-identity/signature/</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceIdentityDocumentSignature <p>
     *            The instance identity document signature for the EC2 instance
     *            to register. This signature can be found by running the
     *            following command from the instance:
     *            <code>curl http://169.254.169.254/latest/dynamic/instance-identity/signature/</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterContainerInstanceRequest withInstanceIdentityDocumentSignature(
            String instanceIdentityDocumentSignature) {
        this.instanceIdentityDocumentSignature = instanceIdentityDocumentSignature;
        return this;
    }

    /**
     * <p>
     * The resources available on the instance.
     * </p>
     *
     * @return <p>
     *         The resources available on the instance.
     *         </p>
     */
    public java.util.List<Resource> getTotalResources() {
        return totalResources;
    }

    /**
     * <p>
     * The resources available on the instance.
     * </p>
     *
     * @param totalResources <p>
     *            The resources available on the instance.
     *            </p>
     */
    public void setTotalResources(java.util.Collection<Resource> totalResources) {
        if (totalResources == null) {
            this.totalResources = null;
            return;
        }

        this.totalResources = new java.util.ArrayList<Resource>(totalResources);
    }

    /**
     * <p>
     * The resources available on the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalResources <p>
     *            The resources available on the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterContainerInstanceRequest withTotalResources(Resource... totalResources) {
        if (getTotalResources() == null) {
            this.totalResources = new java.util.ArrayList<Resource>(totalResources.length);
        }
        for (Resource value : totalResources) {
            this.totalResources.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The resources available on the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalResources <p>
     *            The resources available on the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterContainerInstanceRequest withTotalResources(
            java.util.Collection<Resource> totalResources) {
        setTotalResources(totalResources);
        return this;
    }

    /**
     * <p>
     * The version information for the Amazon ECS container agent and Docker
     * daemon running on the container instance.
     * </p>
     *
     * @return <p>
     *         The version information for the Amazon ECS container agent and
     *         Docker daemon running on the container instance.
     *         </p>
     */
    public VersionInfo getVersionInfo() {
        return versionInfo;
    }

    /**
     * <p>
     * The version information for the Amazon ECS container agent and Docker
     * daemon running on the container instance.
     * </p>
     *
     * @param versionInfo <p>
     *            The version information for the Amazon ECS container agent and
     *            Docker daemon running on the container instance.
     *            </p>
     */
    public void setVersionInfo(VersionInfo versionInfo) {
        this.versionInfo = versionInfo;
    }

    /**
     * <p>
     * The version information for the Amazon ECS container agent and Docker
     * daemon running on the container instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionInfo <p>
     *            The version information for the Amazon ECS container agent and
     *            Docker daemon running on the container instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterContainerInstanceRequest withVersionInfo(VersionInfo versionInfo) {
        this.versionInfo = versionInfo;
        return this;
    }

    /**
     * <p>
     * The ARN of the container instance (if it was previously registered).
     * </p>
     *
     * @return <p>
     *         The ARN of the container instance (if it was previously
     *         registered).
     *         </p>
     */
    public String getContainerInstanceArn() {
        return containerInstanceArn;
    }

    /**
     * <p>
     * The ARN of the container instance (if it was previously registered).
     * </p>
     *
     * @param containerInstanceArn <p>
     *            The ARN of the container instance (if it was previously
     *            registered).
     *            </p>
     */
    public void setContainerInstanceArn(String containerInstanceArn) {
        this.containerInstanceArn = containerInstanceArn;
    }

    /**
     * <p>
     * The ARN of the container instance (if it was previously registered).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerInstanceArn <p>
     *            The ARN of the container instance (if it was previously
     *            registered).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterContainerInstanceRequest withContainerInstanceArn(String containerInstanceArn) {
        this.containerInstanceArn = containerInstanceArn;
        return this;
    }

    /**
     * <p>
     * The container instance attributes that this container instance supports.
     * </p>
     *
     * @return <p>
     *         The container instance attributes that this container instance
     *         supports.
     *         </p>
     */
    public java.util.List<Attribute> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The container instance attributes that this container instance supports.
     * </p>
     *
     * @param attributes <p>
     *            The container instance attributes that this container instance
     *            supports.
     *            </p>
     */
    public void setAttributes(java.util.Collection<Attribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<Attribute>(attributes);
    }

    /**
     * <p>
     * The container instance attributes that this container instance supports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            The container instance attributes that this container instance
     *            supports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterContainerInstanceRequest withAttributes(Attribute... attributes) {
        if (getAttributes() == null) {
            this.attributes = new java.util.ArrayList<Attribute>(attributes.length);
        }
        for (Attribute value : attributes) {
            this.attributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The container instance attributes that this container instance supports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            The container instance attributes that this container instance
     *            supports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterContainerInstanceRequest withAttributes(
            java.util.Collection<Attribute> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * <p>
     * The devices that are available on the container instance. The only
     * supported device type is a GPU.
     * </p>
     *
     * @return <p>
     *         The devices that are available on the container instance. The
     *         only supported device type is a GPU.
     *         </p>
     */
    public java.util.List<PlatformDevice> getPlatformDevices() {
        return platformDevices;
    }

    /**
     * <p>
     * The devices that are available on the container instance. The only
     * supported device type is a GPU.
     * </p>
     *
     * @param platformDevices <p>
     *            The devices that are available on the container instance. The
     *            only supported device type is a GPU.
     *            </p>
     */
    public void setPlatformDevices(java.util.Collection<PlatformDevice> platformDevices) {
        if (platformDevices == null) {
            this.platformDevices = null;
            return;
        }

        this.platformDevices = new java.util.ArrayList<PlatformDevice>(platformDevices);
    }

    /**
     * <p>
     * The devices that are available on the container instance. The only
     * supported device type is a GPU.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformDevices <p>
     *            The devices that are available on the container instance. The
     *            only supported device type is a GPU.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterContainerInstanceRequest withPlatformDevices(PlatformDevice... platformDevices) {
        if (getPlatformDevices() == null) {
            this.platformDevices = new java.util.ArrayList<PlatformDevice>(platformDevices.length);
        }
        for (PlatformDevice value : platformDevices) {
            this.platformDevices.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The devices that are available on the container instance. The only
     * supported device type is a GPU.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformDevices <p>
     *            The devices that are available on the container instance. The
     *            only supported device type is a GPU.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterContainerInstanceRequest withPlatformDevices(
            java.util.Collection<PlatformDevice> platformDevices) {
        setPlatformDevices(platformDevices);
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to the container instance to help you
     * categorize and organize them. Each tag consists of a key and an optional
     * value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have
     * only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources,
     * remember that other services may have restrictions on allowed characters.
     * Generally allowed characters are: letters, numbers, and spaces
     * representable in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or
     * lowercase combination of such as a prefix for either keys or values as it
     * is reserved for AWS use. You cannot edit or delete tag keys or values
     * with this prefix. Tags with this prefix do not count against your tags
     * per resource limit.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The metadata that you apply to the container instance to help you
     *         categorize and organize them. Each tag consists of a key and an
     *         optional value, both of which you define.
     *         </p>
     *         <p>
     *         The following basic restrictions apply to tags:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Maximum number of tags per resource - 50
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For each resource, each tag key must be unique, and each tag key
     *         can have only one value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum key length - 128 Unicode characters in UTF-8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum value length - 256 Unicode characters in UTF-8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If your tagging schema is used across multiple services and
     *         resources, remember that other services may have restrictions on
     *         allowed characters. Generally allowed characters are: letters,
     *         numbers, and spaces representable in UTF-8, and the following
     *         characters: + - = . _ : / @.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Tag keys and values are case-sensitive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or
     *         lowercase combination of such as a prefix for either keys or
     *         values as it is reserved for AWS use. You cannot edit or delete
     *         tag keys or values with this prefix. Tags with this prefix do not
     *         count against your tags per resource limit.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The metadata that you apply to the container instance to help you
     * categorize and organize them. Each tag consists of a key and an optional
     * value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have
     * only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources,
     * remember that other services may have restrictions on allowed characters.
     * Generally allowed characters are: letters, numbers, and spaces
     * representable in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or
     * lowercase combination of such as a prefix for either keys or values as it
     * is reserved for AWS use. You cannot edit or delete tag keys or values
     * with this prefix. Tags with this prefix do not count against your tags
     * per resource limit.
     * </p>
     * </li>
     * </ul>
     *
     * @param tags <p>
     *            The metadata that you apply to the container instance to help
     *            you categorize and organize them. Each tag consists of a key
     *            and an optional value, both of which you define.
     *            </p>
     *            <p>
     *            The following basic restrictions apply to tags:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Maximum number of tags per resource - 50
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For each resource, each tag key must be unique, and each tag
     *            key can have only one value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum key length - 128 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum value length - 256 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If your tagging schema is used across multiple services and
     *            resources, remember that other services may have restrictions
     *            on allowed characters. Generally allowed characters are:
     *            letters, numbers, and spaces representable in UTF-8, and the
     *            following characters: + - = . _ : / @.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Tag keys and values are case-sensitive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Do not use <code>aws:</code>, <code>AWS:</code>, or any upper
     *            or lowercase combination of such as a prefix for either keys
     *            or values as it is reserved for AWS use. You cannot edit or
     *            delete tag keys or values with this prefix. Tags with this
     *            prefix do not count against your tags per resource limit.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The metadata that you apply to the container instance to help you
     * categorize and organize them. Each tag consists of a key and an optional
     * value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have
     * only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources,
     * remember that other services may have restrictions on allowed characters.
     * Generally allowed characters are: letters, numbers, and spaces
     * representable in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or
     * lowercase combination of such as a prefix for either keys or values as it
     * is reserved for AWS use. You cannot edit or delete tag keys or values
     * with this prefix. Tags with this prefix do not count against your tags
     * per resource limit.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The metadata that you apply to the container instance to help
     *            you categorize and organize them. Each tag consists of a key
     *            and an optional value, both of which you define.
     *            </p>
     *            <p>
     *            The following basic restrictions apply to tags:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Maximum number of tags per resource - 50
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For each resource, each tag key must be unique, and each tag
     *            key can have only one value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum key length - 128 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum value length - 256 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If your tagging schema is used across multiple services and
     *            resources, remember that other services may have restrictions
     *            on allowed characters. Generally allowed characters are:
     *            letters, numbers, and spaces representable in UTF-8, and the
     *            following characters: + - = . _ : / @.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Tag keys and values are case-sensitive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Do not use <code>aws:</code>, <code>AWS:</code>, or any upper
     *            or lowercase combination of such as a prefix for either keys
     *            or values as it is reserved for AWS use. You cannot edit or
     *            delete tag keys or values with this prefix. Tags with this
     *            prefix do not count against your tags per resource limit.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterContainerInstanceRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to the container instance to help you
     * categorize and organize them. Each tag consists of a key and an optional
     * value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have
     * only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources,
     * remember that other services may have restrictions on allowed characters.
     * Generally allowed characters are: letters, numbers, and spaces
     * representable in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or
     * lowercase combination of such as a prefix for either keys or values as it
     * is reserved for AWS use. You cannot edit or delete tag keys or values
     * with this prefix. Tags with this prefix do not count against your tags
     * per resource limit.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The metadata that you apply to the container instance to help
     *            you categorize and organize them. Each tag consists of a key
     *            and an optional value, both of which you define.
     *            </p>
     *            <p>
     *            The following basic restrictions apply to tags:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Maximum number of tags per resource - 50
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For each resource, each tag key must be unique, and each tag
     *            key can have only one value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum key length - 128 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum value length - 256 Unicode characters in UTF-8
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If your tagging schema is used across multiple services and
     *            resources, remember that other services may have restrictions
     *            on allowed characters. Generally allowed characters are:
     *            letters, numbers, and spaces representable in UTF-8, and the
     *            following characters: + - = . _ : / @.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Tag keys and values are case-sensitive.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Do not use <code>aws:</code>, <code>AWS:</code>, or any upper
     *            or lowercase combination of such as a prefix for either keys
     *            or values as it is reserved for AWS use. You cannot edit or
     *            delete tag keys or values with this prefix. Tags with this
     *            prefix do not count against your tags per resource limit.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterContainerInstanceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getCluster() != null)
            sb.append("cluster: " + getCluster() + ",");
        if (getInstanceIdentityDocument() != null)
            sb.append("instanceIdentityDocument: " + getInstanceIdentityDocument() + ",");
        if (getInstanceIdentityDocumentSignature() != null)
            sb.append("instanceIdentityDocumentSignature: "
                    + getInstanceIdentityDocumentSignature() + ",");
        if (getTotalResources() != null)
            sb.append("totalResources: " + getTotalResources() + ",");
        if (getVersionInfo() != null)
            sb.append("versionInfo: " + getVersionInfo() + ",");
        if (getContainerInstanceArn() != null)
            sb.append("containerInstanceArn: " + getContainerInstanceArn() + ",");
        if (getAttributes() != null)
            sb.append("attributes: " + getAttributes() + ",");
        if (getPlatformDevices() != null)
            sb.append("platformDevices: " + getPlatformDevices() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceIdentityDocument() == null) ? 0 : getInstanceIdentityDocument()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceIdentityDocumentSignature() == null) ? 0
                        : getInstanceIdentityDocumentSignature().hashCode());
        hashCode = prime * hashCode
                + ((getTotalResources() == null) ? 0 : getTotalResources().hashCode());
        hashCode = prime * hashCode
                + ((getVersionInfo() == null) ? 0 : getVersionInfo().hashCode());
        hashCode = prime * hashCode
                + ((getContainerInstanceArn() == null) ? 0 : getContainerInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getPlatformDevices() == null) ? 0 : getPlatformDevices().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterContainerInstanceRequest == false)
            return false;
        RegisterContainerInstanceRequest other = (RegisterContainerInstanceRequest) obj;

        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getInstanceIdentityDocument() == null
                ^ this.getInstanceIdentityDocument() == null)
            return false;
        if (other.getInstanceIdentityDocument() != null
                && other.getInstanceIdentityDocument().equals(this.getInstanceIdentityDocument()) == false)
            return false;
        if (other.getInstanceIdentityDocumentSignature() == null
                ^ this.getInstanceIdentityDocumentSignature() == null)
            return false;
        if (other.getInstanceIdentityDocumentSignature() != null
                && other.getInstanceIdentityDocumentSignature().equals(
                        this.getInstanceIdentityDocumentSignature()) == false)
            return false;
        if (other.getTotalResources() == null ^ this.getTotalResources() == null)
            return false;
        if (other.getTotalResources() != null
                && other.getTotalResources().equals(this.getTotalResources()) == false)
            return false;
        if (other.getVersionInfo() == null ^ this.getVersionInfo() == null)
            return false;
        if (other.getVersionInfo() != null
                && other.getVersionInfo().equals(this.getVersionInfo()) == false)
            return false;
        if (other.getContainerInstanceArn() == null ^ this.getContainerInstanceArn() == null)
            return false;
        if (other.getContainerInstanceArn() != null
                && other.getContainerInstanceArn().equals(this.getContainerInstanceArn()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getPlatformDevices() == null ^ this.getPlatformDevices() == null)
            return false;
        if (other.getPlatformDevices() != null
                && other.getPlatformDevices().equals(this.getPlatformDevices()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
