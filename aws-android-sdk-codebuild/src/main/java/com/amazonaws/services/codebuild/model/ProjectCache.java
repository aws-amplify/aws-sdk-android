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
 * Information about the cache for the build project.
 * </p>
 */
public class ProjectCache implements Serializable {
    /**
     * <p>
     * The type of cache used by the build project. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NO_CACHE</code>: The build project does not use any cache.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The build project reads and writes from and to S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL</code>: The build project stores a cache locally on a build
     * host that is only available to that build host.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_CACHE, S3, LOCAL
     */
    private String type;

    /**
     * <p>
     * Information about the cache location:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NO_CACHE</code> or <code>LOCAL</code>: This value is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: This is the S3 bucket name/prefix.
     * </p>
     * </li>
     * </ul>
     */
    private String location;

    /**
     * <p>
     * If you use a <code>LOCAL</code> cache, the local cache mode. You can use
     * one or more local cache modes at the same time.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LOCAL_SOURCE_CACHE</code> mode caches Git metadata for primary and
     * secondary sources. After the cache is created, subsequent builds pull
     * only the change between commits. This mode is a good choice for projects
     * with a clean working directory and a source that is a large Git
     * repository. If you choose this option and your project does not use a Git
     * repository (GitHub, GitHub Enterprise, or Bitbucket), the option is
     * ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL_DOCKER_LAYER_CACHE</code> mode caches existing Docker layers.
     * This mode is a good choice for projects that build or pull large Docker
     * images. It can prevent the performance issues caused by pulling large
     * Docker images down from the network.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You can use a Docker layer cache in the Linux environment only.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>privileged</code> flag must be set so that your project has the
     * required Docker permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * You should consider the security implications before you use a Docker
     * layer cache.
     * </p>
     * </li>
     * </ul>
     * </note></li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>LOCAL_CUSTOM_CACHE</code> mode caches directories you specify in
     * the buildspec file. This mode is a good choice if your build scenario is
     * not suited to one of the other three local cache modes. If you use a
     * custom cache:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Only directories can be specified for caching. You cannot specify
     * individual files.
     * </p>
     * </li>
     * <li>
     * <p>
     * Symlinks are used to reference cached directories.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cached directories are linked to your build before it downloads its
     * project sources. Cached items are overridden if a source item has the
     * same name. Directories are specified using cache paths in the buildspec
     * file.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private java.util.List<String> modes;

    /**
     * <p>
     * The type of cache used by the build project. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NO_CACHE</code>: The build project does not use any cache.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The build project reads and writes from and to S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL</code>: The build project stores a cache locally on a build
     * host that is only available to that build host.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_CACHE, S3, LOCAL
     *
     * @return <p>
     *         The type of cache used by the build project. Valid values
     *         include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NO_CACHE</code>: The build project does not use any cache.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>S3</code>: The build project reads and writes from and to
     *         S3.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LOCAL</code>: The build project stores a cache locally on a
     *         build host that is only available to that build host.
     *         </p>
     *         </li>
     *         </ul>
     * @see CacheType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of cache used by the build project. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NO_CACHE</code>: The build project does not use any cache.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The build project reads and writes from and to S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL</code>: The build project stores a cache locally on a build
     * host that is only available to that build host.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_CACHE, S3, LOCAL
     *
     * @param type <p>
     *            The type of cache used by the build project. Valid values
     *            include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NO_CACHE</code>: The build project does not use any
     *            cache.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>S3</code>: The build project reads and writes from and
     *            to S3.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>LOCAL</code>: The build project stores a cache locally
     *            on a build host that is only available to that build host.
     *            </p>
     *            </li>
     *            </ul>
     * @see CacheType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of cache used by the build project. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NO_CACHE</code>: The build project does not use any cache.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The build project reads and writes from and to S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL</code>: The build project stores a cache locally on a build
     * host that is only available to that build host.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_CACHE, S3, LOCAL
     *
     * @param type <p>
     *            The type of cache used by the build project. Valid values
     *            include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NO_CACHE</code>: The build project does not use any
     *            cache.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>S3</code>: The build project reads and writes from and
     *            to S3.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>LOCAL</code>: The build project stores a cache locally
     *            on a build host that is only available to that build host.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CacheType
     */
    public ProjectCache withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of cache used by the build project. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NO_CACHE</code>: The build project does not use any cache.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The build project reads and writes from and to S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL</code>: The build project stores a cache locally on a build
     * host that is only available to that build host.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_CACHE, S3, LOCAL
     *
     * @param type <p>
     *            The type of cache used by the build project. Valid values
     *            include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NO_CACHE</code>: The build project does not use any
     *            cache.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>S3</code>: The build project reads and writes from and
     *            to S3.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>LOCAL</code>: The build project stores a cache locally
     *            on a build host that is only available to that build host.
     *            </p>
     *            </li>
     *            </ul>
     * @see CacheType
     */
    public void setType(CacheType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of cache used by the build project. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NO_CACHE</code>: The build project does not use any cache.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The build project reads and writes from and to S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL</code>: The build project stores a cache locally on a build
     * host that is only available to that build host.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_CACHE, S3, LOCAL
     *
     * @param type <p>
     *            The type of cache used by the build project. Valid values
     *            include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NO_CACHE</code>: The build project does not use any
     *            cache.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>S3</code>: The build project reads and writes from and
     *            to S3.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>LOCAL</code>: The build project stores a cache locally
     *            on a build host that is only available to that build host.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CacheType
     */
    public ProjectCache withType(CacheType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Information about the cache location:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NO_CACHE</code> or <code>LOCAL</code>: This value is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: This is the S3 bucket name/prefix.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Information about the cache location:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NO_CACHE</code> or <code>LOCAL</code>: This value is
     *         ignored.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>S3</code>: This is the S3 bucket name/prefix.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getLocation() {
        return location;
    }

    /**
     * <p>
     * Information about the cache location:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NO_CACHE</code> or <code>LOCAL</code>: This value is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: This is the S3 bucket name/prefix.
     * </p>
     * </li>
     * </ul>
     *
     * @param location <p>
     *            Information about the cache location:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NO_CACHE</code> or <code>LOCAL</code>: This value is
     *            ignored.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>S3</code>: This is the S3 bucket name/prefix.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * Information about the cache location:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NO_CACHE</code> or <code>LOCAL</code>: This value is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: This is the S3 bucket name/prefix.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            Information about the cache location:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>NO_CACHE</code> or <code>LOCAL</code>: This value is
     *            ignored.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>S3</code>: This is the S3 bucket name/prefix.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectCache withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * If you use a <code>LOCAL</code> cache, the local cache mode. You can use
     * one or more local cache modes at the same time.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LOCAL_SOURCE_CACHE</code> mode caches Git metadata for primary and
     * secondary sources. After the cache is created, subsequent builds pull
     * only the change between commits. This mode is a good choice for projects
     * with a clean working directory and a source that is a large Git
     * repository. If you choose this option and your project does not use a Git
     * repository (GitHub, GitHub Enterprise, or Bitbucket), the option is
     * ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL_DOCKER_LAYER_CACHE</code> mode caches existing Docker layers.
     * This mode is a good choice for projects that build or pull large Docker
     * images. It can prevent the performance issues caused by pulling large
     * Docker images down from the network.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You can use a Docker layer cache in the Linux environment only.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>privileged</code> flag must be set so that your project has the
     * required Docker permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * You should consider the security implications before you use a Docker
     * layer cache.
     * </p>
     * </li>
     * </ul>
     * </note></li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>LOCAL_CUSTOM_CACHE</code> mode caches directories you specify in
     * the buildspec file. This mode is a good choice if your build scenario is
     * not suited to one of the other three local cache modes. If you use a
     * custom cache:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Only directories can be specified for caching. You cannot specify
     * individual files.
     * </p>
     * </li>
     * <li>
     * <p>
     * Symlinks are used to reference cached directories.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cached directories are linked to your build before it downloads its
     * project sources. Cached items are overridden if a source item has the
     * same name. Directories are specified using cache paths in the buildspec
     * file.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     *
     * @return <p>
     *         If you use a <code>LOCAL</code> cache, the local cache mode. You
     *         can use one or more local cache modes at the same time.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>LOCAL_SOURCE_CACHE</code> mode caches Git metadata for
     *         primary and secondary sources. After the cache is created,
     *         subsequent builds pull only the change between commits. This mode
     *         is a good choice for projects with a clean working directory and
     *         a source that is a large Git repository. If you choose this
     *         option and your project does not use a Git repository (GitHub,
     *         GitHub Enterprise, or Bitbucket), the option is ignored.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LOCAL_DOCKER_LAYER_CACHE</code> mode caches existing Docker
     *         layers. This mode is a good choice for projects that build or
     *         pull large Docker images. It can prevent the performance issues
     *         caused by pulling large Docker images down from the network.
     *         </p>
     *         <note>
     *         <ul>
     *         <li>
     *         <p>
     *         You can use a Docker layer cache in the Linux environment only.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>privileged</code> flag must be set so that your project
     *         has the required Docker permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You should consider the security implications before you use a
     *         Docker layer cache.
     *         </p>
     *         </li>
     *         </ul>
     *         </note></li>
     *         </ul>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>LOCAL_CUSTOM_CACHE</code> mode caches directories you
     *         specify in the buildspec file. This mode is a good choice if your
     *         build scenario is not suited to one of the other three local
     *         cache modes. If you use a custom cache:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Only directories can be specified for caching. You cannot specify
     *         individual files.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Symlinks are used to reference cached directories.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cached directories are linked to your build before it downloads
     *         its project sources. Cached items are overridden if a source item
     *         has the same name. Directories are specified using cache paths in
     *         the buildspec file.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getModes() {
        return modes;
    }

    /**
     * <p>
     * If you use a <code>LOCAL</code> cache, the local cache mode. You can use
     * one or more local cache modes at the same time.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LOCAL_SOURCE_CACHE</code> mode caches Git metadata for primary and
     * secondary sources. After the cache is created, subsequent builds pull
     * only the change between commits. This mode is a good choice for projects
     * with a clean working directory and a source that is a large Git
     * repository. If you choose this option and your project does not use a Git
     * repository (GitHub, GitHub Enterprise, or Bitbucket), the option is
     * ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL_DOCKER_LAYER_CACHE</code> mode caches existing Docker layers.
     * This mode is a good choice for projects that build or pull large Docker
     * images. It can prevent the performance issues caused by pulling large
     * Docker images down from the network.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You can use a Docker layer cache in the Linux environment only.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>privileged</code> flag must be set so that your project has the
     * required Docker permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * You should consider the security implications before you use a Docker
     * layer cache.
     * </p>
     * </li>
     * </ul>
     * </note></li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>LOCAL_CUSTOM_CACHE</code> mode caches directories you specify in
     * the buildspec file. This mode is a good choice if your build scenario is
     * not suited to one of the other three local cache modes. If you use a
     * custom cache:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Only directories can be specified for caching. You cannot specify
     * individual files.
     * </p>
     * </li>
     * <li>
     * <p>
     * Symlinks are used to reference cached directories.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cached directories are linked to your build before it downloads its
     * project sources. Cached items are overridden if a source item has the
     * same name. Directories are specified using cache paths in the buildspec
     * file.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     *
     * @param modes <p>
     *            If you use a <code>LOCAL</code> cache, the local cache mode.
     *            You can use one or more local cache modes at the same time.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>LOCAL_SOURCE_CACHE</code> mode caches Git metadata for
     *            primary and secondary sources. After the cache is created,
     *            subsequent builds pull only the change between commits. This
     *            mode is a good choice for projects with a clean working
     *            directory and a source that is a large Git repository. If you
     *            choose this option and your project does not use a Git
     *            repository (GitHub, GitHub Enterprise, or Bitbucket), the
     *            option is ignored.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>LOCAL_DOCKER_LAYER_CACHE</code> mode caches existing
     *            Docker layers. This mode is a good choice for projects that
     *            build or pull large Docker images. It can prevent the
     *            performance issues caused by pulling large Docker images down
     *            from the network.
     *            </p>
     *            <note>
     *            <ul>
     *            <li>
     *            <p>
     *            You can use a Docker layer cache in the Linux environment
     *            only.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The <code>privileged</code> flag must be set so that your
     *            project has the required Docker permissions.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You should consider the security implications before you use a
     *            Docker layer cache.
     *            </p>
     *            </li>
     *            </ul>
     *            </note></li>
     *            </ul>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>LOCAL_CUSTOM_CACHE</code> mode caches directories you
     *            specify in the buildspec file. This mode is a good choice if
     *            your build scenario is not suited to one of the other three
     *            local cache modes. If you use a custom cache:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Only directories can be specified for caching. You cannot
     *            specify individual files.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Symlinks are used to reference cached directories.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cached directories are linked to your build before it
     *            downloads its project sources. Cached items are overridden if
     *            a source item has the same name. Directories are specified
     *            using cache paths in the buildspec file.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     */
    public void setModes(java.util.Collection<String> modes) {
        if (modes == null) {
            this.modes = null;
            return;
        }

        this.modes = new java.util.ArrayList<String>(modes);
    }

    /**
     * <p>
     * If you use a <code>LOCAL</code> cache, the local cache mode. You can use
     * one or more local cache modes at the same time.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LOCAL_SOURCE_CACHE</code> mode caches Git metadata for primary and
     * secondary sources. After the cache is created, subsequent builds pull
     * only the change between commits. This mode is a good choice for projects
     * with a clean working directory and a source that is a large Git
     * repository. If you choose this option and your project does not use a Git
     * repository (GitHub, GitHub Enterprise, or Bitbucket), the option is
     * ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL_DOCKER_LAYER_CACHE</code> mode caches existing Docker layers.
     * This mode is a good choice for projects that build or pull large Docker
     * images. It can prevent the performance issues caused by pulling large
     * Docker images down from the network.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You can use a Docker layer cache in the Linux environment only.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>privileged</code> flag must be set so that your project has the
     * required Docker permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * You should consider the security implications before you use a Docker
     * layer cache.
     * </p>
     * </li>
     * </ul>
     * </note></li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>LOCAL_CUSTOM_CACHE</code> mode caches directories you specify in
     * the buildspec file. This mode is a good choice if your build scenario is
     * not suited to one of the other three local cache modes. If you use a
     * custom cache:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Only directories can be specified for caching. You cannot specify
     * individual files.
     * </p>
     * </li>
     * <li>
     * <p>
     * Symlinks are used to reference cached directories.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cached directories are linked to your build before it downloads its
     * project sources. Cached items are overridden if a source item has the
     * same name. Directories are specified using cache paths in the buildspec
     * file.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modes <p>
     *            If you use a <code>LOCAL</code> cache, the local cache mode.
     *            You can use one or more local cache modes at the same time.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>LOCAL_SOURCE_CACHE</code> mode caches Git metadata for
     *            primary and secondary sources. After the cache is created,
     *            subsequent builds pull only the change between commits. This
     *            mode is a good choice for projects with a clean working
     *            directory and a source that is a large Git repository. If you
     *            choose this option and your project does not use a Git
     *            repository (GitHub, GitHub Enterprise, or Bitbucket), the
     *            option is ignored.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>LOCAL_DOCKER_LAYER_CACHE</code> mode caches existing
     *            Docker layers. This mode is a good choice for projects that
     *            build or pull large Docker images. It can prevent the
     *            performance issues caused by pulling large Docker images down
     *            from the network.
     *            </p>
     *            <note>
     *            <ul>
     *            <li>
     *            <p>
     *            You can use a Docker layer cache in the Linux environment
     *            only.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The <code>privileged</code> flag must be set so that your
     *            project has the required Docker permissions.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You should consider the security implications before you use a
     *            Docker layer cache.
     *            </p>
     *            </li>
     *            </ul>
     *            </note></li>
     *            </ul>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>LOCAL_CUSTOM_CACHE</code> mode caches directories you
     *            specify in the buildspec file. This mode is a good choice if
     *            your build scenario is not suited to one of the other three
     *            local cache modes. If you use a custom cache:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Only directories can be specified for caching. You cannot
     *            specify individual files.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Symlinks are used to reference cached directories.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cached directories are linked to your build before it
     *            downloads its project sources. Cached items are overridden if
     *            a source item has the same name. Directories are specified
     *            using cache paths in the buildspec file.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectCache withModes(String... modes) {
        if (getModes() == null) {
            this.modes = new java.util.ArrayList<String>(modes.length);
        }
        for (String value : modes) {
            this.modes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * If you use a <code>LOCAL</code> cache, the local cache mode. You can use
     * one or more local cache modes at the same time.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LOCAL_SOURCE_CACHE</code> mode caches Git metadata for primary and
     * secondary sources. After the cache is created, subsequent builds pull
     * only the change between commits. This mode is a good choice for projects
     * with a clean working directory and a source that is a large Git
     * repository. If you choose this option and your project does not use a Git
     * repository (GitHub, GitHub Enterprise, or Bitbucket), the option is
     * ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL_DOCKER_LAYER_CACHE</code> mode caches existing Docker layers.
     * This mode is a good choice for projects that build or pull large Docker
     * images. It can prevent the performance issues caused by pulling large
     * Docker images down from the network.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You can use a Docker layer cache in the Linux environment only.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>privileged</code> flag must be set so that your project has the
     * required Docker permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * You should consider the security implications before you use a Docker
     * layer cache.
     * </p>
     * </li>
     * </ul>
     * </note></li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>LOCAL_CUSTOM_CACHE</code> mode caches directories you specify in
     * the buildspec file. This mode is a good choice if your build scenario is
     * not suited to one of the other three local cache modes. If you use a
     * custom cache:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Only directories can be specified for caching. You cannot specify
     * individual files.
     * </p>
     * </li>
     * <li>
     * <p>
     * Symlinks are used to reference cached directories.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cached directories are linked to your build before it downloads its
     * project sources. Cached items are overridden if a source item has the
     * same name. Directories are specified using cache paths in the buildspec
     * file.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modes <p>
     *            If you use a <code>LOCAL</code> cache, the local cache mode.
     *            You can use one or more local cache modes at the same time.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>LOCAL_SOURCE_CACHE</code> mode caches Git metadata for
     *            primary and secondary sources. After the cache is created,
     *            subsequent builds pull only the change between commits. This
     *            mode is a good choice for projects with a clean working
     *            directory and a source that is a large Git repository. If you
     *            choose this option and your project does not use a Git
     *            repository (GitHub, GitHub Enterprise, or Bitbucket), the
     *            option is ignored.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>LOCAL_DOCKER_LAYER_CACHE</code> mode caches existing
     *            Docker layers. This mode is a good choice for projects that
     *            build or pull large Docker images. It can prevent the
     *            performance issues caused by pulling large Docker images down
     *            from the network.
     *            </p>
     *            <note>
     *            <ul>
     *            <li>
     *            <p>
     *            You can use a Docker layer cache in the Linux environment
     *            only.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The <code>privileged</code> flag must be set so that your
     *            project has the required Docker permissions.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You should consider the security implications before you use a
     *            Docker layer cache.
     *            </p>
     *            </li>
     *            </ul>
     *            </note></li>
     *            </ul>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>LOCAL_CUSTOM_CACHE</code> mode caches directories you
     *            specify in the buildspec file. This mode is a good choice if
     *            your build scenario is not suited to one of the other three
     *            local cache modes. If you use a custom cache:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Only directories can be specified for caching. You cannot
     *            specify individual files.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Symlinks are used to reference cached directories.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cached directories are linked to your build before it
     *            downloads its project sources. Cached items are overridden if
     *            a source item has the same name. Directories are specified
     *            using cache paths in the buildspec file.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectCache withModes(java.util.Collection<String> modes) {
        setModes(modes);
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
        if (getModes() != null)
            sb.append("modes: " + getModes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getModes() == null) ? 0 : getModes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectCache == false)
            return false;
        ProjectCache other = (ProjectCache) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getModes() == null ^ this.getModes() == null)
            return false;
        if (other.getModes() != null && other.getModes().equals(this.getModes()) == false)
            return false;
        return true;
    }
}
