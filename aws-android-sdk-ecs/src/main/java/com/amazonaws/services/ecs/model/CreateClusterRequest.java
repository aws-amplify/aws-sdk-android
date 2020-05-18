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
 * <p>
 * Creates a new Amazon ECS cluster. By default, your account receives a
 * <code>default</code> cluster when you launch your first container instance.
 * However, you can create your own cluster with a unique name with the
 * <code>CreateCluster</code> action.
 * </p>
 * <note>
 * <p>
 * When you call the <a>CreateCluster</a> API operation, Amazon ECS attempts to
 * create the Amazon ECS service-linked role for your account so that required
 * resources in other AWS services can be managed on your behalf. However, if
 * the IAM user that makes the call does not have permissions to create the
 * service-linked role, it is not created. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using-service-linked-roles.html"
 * >Using Service-Linked Roles for Amazon ECS</a> in the <i>Amazon Elastic
 * Container Service Developer Guide</i>.
 * </p>
 * </note>
 */
public class CreateClusterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of your cluster. If you do not specify a name for your cluster,
     * you create a cluster named <code>default</code>. Up to 255 letters
     * (uppercase and lowercase), numbers, and hyphens are allowed.
     * </p>
     */
    private String clusterName;

    /**
     * <p>
     * The metadata that you apply to the cluster to help you categorize and
     * organize them. Each tag consists of a key and an optional value, both of
     * which you define.
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
     * The setting to use when creating a cluster. This parameter is used to
     * enable CloudWatch Container Insights for a cluster. If this value is
     * specified, it will override the <code>containerInsights</code> value set
     * with <a>PutAccountSetting</a> or <a>PutAccountSettingDefault</a>.
     * </p>
     */
    private java.util.List<ClusterSetting> settings;

    /**
     * <p>
     * The short name of one or more capacity providers to associate with the
     * cluster.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the
     * capacity provider must already be created and not already associated with
     * another cluster. New capacity providers can be created with the
     * <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the
     * <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity providers. The
     * AWS Fargate capacity providers are available to all accounts and only
     * need to be associated with a cluster to be used.
     * </p>
     * <p>
     * The <a>PutClusterCapacityProviders</a> API operation is used to update
     * the list of available capacity providers for a cluster after the cluster
     * is created.
     * </p>
     */
    private java.util.List<String> capacityProviders;

    /**
     * <p>
     * The capacity provider strategy to use by default for the cluster.
     * </p>
     * <p>
     * When creating a service or running a task on a cluster, if no capacity
     * provider or launch type is specified then the default capacity provider
     * strategy for the cluster is used.
     * </p>
     * <p>
     * A capacity provider strategy consists of one or more capacity providers
     * along with the <code>base</code> and <code>weight</code> to assign to
     * them. A capacity provider must be associated with the cluster to be used
     * in a capacity provider strategy. The <a>PutClusterCapacityProviders</a>
     * API is used to associate a capacity provider with a cluster. Only
     * capacity providers with an <code>ACTIVE</code> or <code>UPDATING</code>
     * status can be used.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the
     * capacity provider must already be created. New capacity providers can be
     * created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the
     * <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity providers. The
     * AWS Fargate capacity providers are available to all accounts and only
     * need to be associated with a cluster to be used.
     * </p>
     * <p>
     * If a default capacity provider strategy is not defined for a cluster
     * during creation, it can be defined later with the
     * <a>PutClusterCapacityProviders</a> API operation.
     * </p>
     */
    private java.util.List<CapacityProviderStrategyItem> defaultCapacityProviderStrategy;

    /**
     * <p>
     * The name of your cluster. If you do not specify a name for your cluster,
     * you create a cluster named <code>default</code>. Up to 255 letters
     * (uppercase and lowercase), numbers, and hyphens are allowed.
     * </p>
     *
     * @return <p>
     *         The name of your cluster. If you do not specify a name for your
     *         cluster, you create a cluster named <code>default</code>. Up to
     *         255 letters (uppercase and lowercase), numbers, and hyphens are
     *         allowed.
     *         </p>
     */
    public String getClusterName() {
        return clusterName;
    }

    /**
     * <p>
     * The name of your cluster. If you do not specify a name for your cluster,
     * you create a cluster named <code>default</code>. Up to 255 letters
     * (uppercase and lowercase), numbers, and hyphens are allowed.
     * </p>
     *
     * @param clusterName <p>
     *            The name of your cluster. If you do not specify a name for
     *            your cluster, you create a cluster named <code>default</code>.
     *            Up to 255 letters (uppercase and lowercase), numbers, and
     *            hyphens are allowed.
     *            </p>
     */
    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of your cluster. If you do not specify a name for your cluster,
     * you create a cluster named <code>default</code>. Up to 255 letters
     * (uppercase and lowercase), numbers, and hyphens are allowed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterName <p>
     *            The name of your cluster. If you do not specify a name for
     *            your cluster, you create a cluster named <code>default</code>.
     *            Up to 255 letters (uppercase and lowercase), numbers, and
     *            hyphens are allowed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterRequest withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to the cluster to help you categorize and
     * organize them. Each tag consists of a key and an optional value, both of
     * which you define.
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
     *         The metadata that you apply to the cluster to help you categorize
     *         and organize them. Each tag consists of a key and an optional
     *         value, both of which you define.
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
     * The metadata that you apply to the cluster to help you categorize and
     * organize them. Each tag consists of a key and an optional value, both of
     * which you define.
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
     *            The metadata that you apply to the cluster to help you
     *            categorize and organize them. Each tag consists of a key and
     *            an optional value, both of which you define.
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
     * The metadata that you apply to the cluster to help you categorize and
     * organize them. Each tag consists of a key and an optional value, both of
     * which you define.
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
     *            The metadata that you apply to the cluster to help you
     *            categorize and organize them. Each tag consists of a key and
     *            an optional value, both of which you define.
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
    public CreateClusterRequest withTags(Tag... tags) {
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
     * The metadata that you apply to the cluster to help you categorize and
     * organize them. Each tag consists of a key and an optional value, both of
     * which you define.
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
     *            The metadata that you apply to the cluster to help you
     *            categorize and organize them. Each tag consists of a key and
     *            an optional value, both of which you define.
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
    public CreateClusterRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The setting to use when creating a cluster. This parameter is used to
     * enable CloudWatch Container Insights for a cluster. If this value is
     * specified, it will override the <code>containerInsights</code> value set
     * with <a>PutAccountSetting</a> or <a>PutAccountSettingDefault</a>.
     * </p>
     *
     * @return <p>
     *         The setting to use when creating a cluster. This parameter is
     *         used to enable CloudWatch Container Insights for a cluster. If
     *         this value is specified, it will override the
     *         <code>containerInsights</code> value set with
     *         <a>PutAccountSetting</a> or <a>PutAccountSettingDefault</a>.
     *         </p>
     */
    public java.util.List<ClusterSetting> getSettings() {
        return settings;
    }

    /**
     * <p>
     * The setting to use when creating a cluster. This parameter is used to
     * enable CloudWatch Container Insights for a cluster. If this value is
     * specified, it will override the <code>containerInsights</code> value set
     * with <a>PutAccountSetting</a> or <a>PutAccountSettingDefault</a>.
     * </p>
     *
     * @param settings <p>
     *            The setting to use when creating a cluster. This parameter is
     *            used to enable CloudWatch Container Insights for a cluster. If
     *            this value is specified, it will override the
     *            <code>containerInsights</code> value set with
     *            <a>PutAccountSetting</a> or <a>PutAccountSettingDefault</a>.
     *            </p>
     */
    public void setSettings(java.util.Collection<ClusterSetting> settings) {
        if (settings == null) {
            this.settings = null;
            return;
        }

        this.settings = new java.util.ArrayList<ClusterSetting>(settings);
    }

    /**
     * <p>
     * The setting to use when creating a cluster. This parameter is used to
     * enable CloudWatch Container Insights for a cluster. If this value is
     * specified, it will override the <code>containerInsights</code> value set
     * with <a>PutAccountSetting</a> or <a>PutAccountSettingDefault</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings <p>
     *            The setting to use when creating a cluster. This parameter is
     *            used to enable CloudWatch Container Insights for a cluster. If
     *            this value is specified, it will override the
     *            <code>containerInsights</code> value set with
     *            <a>PutAccountSetting</a> or <a>PutAccountSettingDefault</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterRequest withSettings(ClusterSetting... settings) {
        if (getSettings() == null) {
            this.settings = new java.util.ArrayList<ClusterSetting>(settings.length);
        }
        for (ClusterSetting value : settings) {
            this.settings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The setting to use when creating a cluster. This parameter is used to
     * enable CloudWatch Container Insights for a cluster. If this value is
     * specified, it will override the <code>containerInsights</code> value set
     * with <a>PutAccountSetting</a> or <a>PutAccountSettingDefault</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings <p>
     *            The setting to use when creating a cluster. This parameter is
     *            used to enable CloudWatch Container Insights for a cluster. If
     *            this value is specified, it will override the
     *            <code>containerInsights</code> value set with
     *            <a>PutAccountSetting</a> or <a>PutAccountSettingDefault</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterRequest withSettings(java.util.Collection<ClusterSetting> settings) {
        setSettings(settings);
        return this;
    }

    /**
     * <p>
     * The short name of one or more capacity providers to associate with the
     * cluster.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the
     * capacity provider must already be created and not already associated with
     * another cluster. New capacity providers can be created with the
     * <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the
     * <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity providers. The
     * AWS Fargate capacity providers are available to all accounts and only
     * need to be associated with a cluster to be used.
     * </p>
     * <p>
     * The <a>PutClusterCapacityProviders</a> API operation is used to update
     * the list of available capacity providers for a cluster after the cluster
     * is created.
     * </p>
     *
     * @return <p>
     *         The short name of one or more capacity providers to associate
     *         with the cluster.
     *         </p>
     *         <p>
     *         If specifying a capacity provider that uses an Auto Scaling
     *         group, the capacity provider must already be created and not
     *         already associated with another cluster. New capacity providers
     *         can be created with the <a>CreateCapacityProvider</a> API
     *         operation.
     *         </p>
     *         <p>
     *         To use a AWS Fargate capacity provider, specify either the
     *         <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity
     *         providers. The AWS Fargate capacity providers are available to
     *         all accounts and only need to be associated with a cluster to be
     *         used.
     *         </p>
     *         <p>
     *         The <a>PutClusterCapacityProviders</a> API operation is used to
     *         update the list of available capacity providers for a cluster
     *         after the cluster is created.
     *         </p>
     */
    public java.util.List<String> getCapacityProviders() {
        return capacityProviders;
    }

    /**
     * <p>
     * The short name of one or more capacity providers to associate with the
     * cluster.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the
     * capacity provider must already be created and not already associated with
     * another cluster. New capacity providers can be created with the
     * <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the
     * <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity providers. The
     * AWS Fargate capacity providers are available to all accounts and only
     * need to be associated with a cluster to be used.
     * </p>
     * <p>
     * The <a>PutClusterCapacityProviders</a> API operation is used to update
     * the list of available capacity providers for a cluster after the cluster
     * is created.
     * </p>
     *
     * @param capacityProviders <p>
     *            The short name of one or more capacity providers to associate
     *            with the cluster.
     *            </p>
     *            <p>
     *            If specifying a capacity provider that uses an Auto Scaling
     *            group, the capacity provider must already be created and not
     *            already associated with another cluster. New capacity
     *            providers can be created with the
     *            <a>CreateCapacityProvider</a> API operation.
     *            </p>
     *            <p>
     *            To use a AWS Fargate capacity provider, specify either the
     *            <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity
     *            providers. The AWS Fargate capacity providers are available to
     *            all accounts and only need to be associated with a cluster to
     *            be used.
     *            </p>
     *            <p>
     *            The <a>PutClusterCapacityProviders</a> API operation is used
     *            to update the list of available capacity providers for a
     *            cluster after the cluster is created.
     *            </p>
     */
    public void setCapacityProviders(java.util.Collection<String> capacityProviders) {
        if (capacityProviders == null) {
            this.capacityProviders = null;
            return;
        }

        this.capacityProviders = new java.util.ArrayList<String>(capacityProviders);
    }

    /**
     * <p>
     * The short name of one or more capacity providers to associate with the
     * cluster.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the
     * capacity provider must already be created and not already associated with
     * another cluster. New capacity providers can be created with the
     * <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the
     * <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity providers. The
     * AWS Fargate capacity providers are available to all accounts and only
     * need to be associated with a cluster to be used.
     * </p>
     * <p>
     * The <a>PutClusterCapacityProviders</a> API operation is used to update
     * the list of available capacity providers for a cluster after the cluster
     * is created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityProviders <p>
     *            The short name of one or more capacity providers to associate
     *            with the cluster.
     *            </p>
     *            <p>
     *            If specifying a capacity provider that uses an Auto Scaling
     *            group, the capacity provider must already be created and not
     *            already associated with another cluster. New capacity
     *            providers can be created with the
     *            <a>CreateCapacityProvider</a> API operation.
     *            </p>
     *            <p>
     *            To use a AWS Fargate capacity provider, specify either the
     *            <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity
     *            providers. The AWS Fargate capacity providers are available to
     *            all accounts and only need to be associated with a cluster to
     *            be used.
     *            </p>
     *            <p>
     *            The <a>PutClusterCapacityProviders</a> API operation is used
     *            to update the list of available capacity providers for a
     *            cluster after the cluster is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterRequest withCapacityProviders(String... capacityProviders) {
        if (getCapacityProviders() == null) {
            this.capacityProviders = new java.util.ArrayList<String>(capacityProviders.length);
        }
        for (String value : capacityProviders) {
            this.capacityProviders.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The short name of one or more capacity providers to associate with the
     * cluster.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the
     * capacity provider must already be created and not already associated with
     * another cluster. New capacity providers can be created with the
     * <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the
     * <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity providers. The
     * AWS Fargate capacity providers are available to all accounts and only
     * need to be associated with a cluster to be used.
     * </p>
     * <p>
     * The <a>PutClusterCapacityProviders</a> API operation is used to update
     * the list of available capacity providers for a cluster after the cluster
     * is created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityProviders <p>
     *            The short name of one or more capacity providers to associate
     *            with the cluster.
     *            </p>
     *            <p>
     *            If specifying a capacity provider that uses an Auto Scaling
     *            group, the capacity provider must already be created and not
     *            already associated with another cluster. New capacity
     *            providers can be created with the
     *            <a>CreateCapacityProvider</a> API operation.
     *            </p>
     *            <p>
     *            To use a AWS Fargate capacity provider, specify either the
     *            <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity
     *            providers. The AWS Fargate capacity providers are available to
     *            all accounts and only need to be associated with a cluster to
     *            be used.
     *            </p>
     *            <p>
     *            The <a>PutClusterCapacityProviders</a> API operation is used
     *            to update the list of available capacity providers for a
     *            cluster after the cluster is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterRequest withCapacityProviders(java.util.Collection<String> capacityProviders) {
        setCapacityProviders(capacityProviders);
        return this;
    }

    /**
     * <p>
     * The capacity provider strategy to use by default for the cluster.
     * </p>
     * <p>
     * When creating a service or running a task on a cluster, if no capacity
     * provider or launch type is specified then the default capacity provider
     * strategy for the cluster is used.
     * </p>
     * <p>
     * A capacity provider strategy consists of one or more capacity providers
     * along with the <code>base</code> and <code>weight</code> to assign to
     * them. A capacity provider must be associated with the cluster to be used
     * in a capacity provider strategy. The <a>PutClusterCapacityProviders</a>
     * API is used to associate a capacity provider with a cluster. Only
     * capacity providers with an <code>ACTIVE</code> or <code>UPDATING</code>
     * status can be used.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the
     * capacity provider must already be created. New capacity providers can be
     * created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the
     * <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity providers. The
     * AWS Fargate capacity providers are available to all accounts and only
     * need to be associated with a cluster to be used.
     * </p>
     * <p>
     * If a default capacity provider strategy is not defined for a cluster
     * during creation, it can be defined later with the
     * <a>PutClusterCapacityProviders</a> API operation.
     * </p>
     *
     * @return <p>
     *         The capacity provider strategy to use by default for the cluster.
     *         </p>
     *         <p>
     *         When creating a service or running a task on a cluster, if no
     *         capacity provider or launch type is specified then the default
     *         capacity provider strategy for the cluster is used.
     *         </p>
     *         <p>
     *         A capacity provider strategy consists of one or more capacity
     *         providers along with the <code>base</code> and
     *         <code>weight</code> to assign to them. A capacity provider must
     *         be associated with the cluster to be used in a capacity provider
     *         strategy. The <a>PutClusterCapacityProviders</a> API is used to
     *         associate a capacity provider with a cluster. Only capacity
     *         providers with an <code>ACTIVE</code> or <code>UPDATING</code>
     *         status can be used.
     *         </p>
     *         <p>
     *         If specifying a capacity provider that uses an Auto Scaling
     *         group, the capacity provider must already be created. New
     *         capacity providers can be created with the
     *         <a>CreateCapacityProvider</a> API operation.
     *         </p>
     *         <p>
     *         To use a AWS Fargate capacity provider, specify either the
     *         <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity
     *         providers. The AWS Fargate capacity providers are available to
     *         all accounts and only need to be associated with a cluster to be
     *         used.
     *         </p>
     *         <p>
     *         If a default capacity provider strategy is not defined for a
     *         cluster during creation, it can be defined later with the
     *         <a>PutClusterCapacityProviders</a> API operation.
     *         </p>
     */
    public java.util.List<CapacityProviderStrategyItem> getDefaultCapacityProviderStrategy() {
        return defaultCapacityProviderStrategy;
    }

    /**
     * <p>
     * The capacity provider strategy to use by default for the cluster.
     * </p>
     * <p>
     * When creating a service or running a task on a cluster, if no capacity
     * provider or launch type is specified then the default capacity provider
     * strategy for the cluster is used.
     * </p>
     * <p>
     * A capacity provider strategy consists of one or more capacity providers
     * along with the <code>base</code> and <code>weight</code> to assign to
     * them. A capacity provider must be associated with the cluster to be used
     * in a capacity provider strategy. The <a>PutClusterCapacityProviders</a>
     * API is used to associate a capacity provider with a cluster. Only
     * capacity providers with an <code>ACTIVE</code> or <code>UPDATING</code>
     * status can be used.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the
     * capacity provider must already be created. New capacity providers can be
     * created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the
     * <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity providers. The
     * AWS Fargate capacity providers are available to all accounts and only
     * need to be associated with a cluster to be used.
     * </p>
     * <p>
     * If a default capacity provider strategy is not defined for a cluster
     * during creation, it can be defined later with the
     * <a>PutClusterCapacityProviders</a> API operation.
     * </p>
     *
     * @param defaultCapacityProviderStrategy <p>
     *            The capacity provider strategy to use by default for the
     *            cluster.
     *            </p>
     *            <p>
     *            When creating a service or running a task on a cluster, if no
     *            capacity provider or launch type is specified then the default
     *            capacity provider strategy for the cluster is used.
     *            </p>
     *            <p>
     *            A capacity provider strategy consists of one or more capacity
     *            providers along with the <code>base</code> and
     *            <code>weight</code> to assign to them. A capacity provider
     *            must be associated with the cluster to be used in a capacity
     *            provider strategy. The <a>PutClusterCapacityProviders</a> API
     *            is used to associate a capacity provider with a cluster. Only
     *            capacity providers with an <code>ACTIVE</code> or
     *            <code>UPDATING</code> status can be used.
     *            </p>
     *            <p>
     *            If specifying a capacity provider that uses an Auto Scaling
     *            group, the capacity provider must already be created. New
     *            capacity providers can be created with the
     *            <a>CreateCapacityProvider</a> API operation.
     *            </p>
     *            <p>
     *            To use a AWS Fargate capacity provider, specify either the
     *            <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity
     *            providers. The AWS Fargate capacity providers are available to
     *            all accounts and only need to be associated with a cluster to
     *            be used.
     *            </p>
     *            <p>
     *            If a default capacity provider strategy is not defined for a
     *            cluster during creation, it can be defined later with the
     *            <a>PutClusterCapacityProviders</a> API operation.
     *            </p>
     */
    public void setDefaultCapacityProviderStrategy(
            java.util.Collection<CapacityProviderStrategyItem> defaultCapacityProviderStrategy) {
        if (defaultCapacityProviderStrategy == null) {
            this.defaultCapacityProviderStrategy = null;
            return;
        }

        this.defaultCapacityProviderStrategy = new java.util.ArrayList<CapacityProviderStrategyItem>(
                defaultCapacityProviderStrategy);
    }

    /**
     * <p>
     * The capacity provider strategy to use by default for the cluster.
     * </p>
     * <p>
     * When creating a service or running a task on a cluster, if no capacity
     * provider or launch type is specified then the default capacity provider
     * strategy for the cluster is used.
     * </p>
     * <p>
     * A capacity provider strategy consists of one or more capacity providers
     * along with the <code>base</code> and <code>weight</code> to assign to
     * them. A capacity provider must be associated with the cluster to be used
     * in a capacity provider strategy. The <a>PutClusterCapacityProviders</a>
     * API is used to associate a capacity provider with a cluster. Only
     * capacity providers with an <code>ACTIVE</code> or <code>UPDATING</code>
     * status can be used.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the
     * capacity provider must already be created. New capacity providers can be
     * created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the
     * <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity providers. The
     * AWS Fargate capacity providers are available to all accounts and only
     * need to be associated with a cluster to be used.
     * </p>
     * <p>
     * If a default capacity provider strategy is not defined for a cluster
     * during creation, it can be defined later with the
     * <a>PutClusterCapacityProviders</a> API operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultCapacityProviderStrategy <p>
     *            The capacity provider strategy to use by default for the
     *            cluster.
     *            </p>
     *            <p>
     *            When creating a service or running a task on a cluster, if no
     *            capacity provider or launch type is specified then the default
     *            capacity provider strategy for the cluster is used.
     *            </p>
     *            <p>
     *            A capacity provider strategy consists of one or more capacity
     *            providers along with the <code>base</code> and
     *            <code>weight</code> to assign to them. A capacity provider
     *            must be associated with the cluster to be used in a capacity
     *            provider strategy. The <a>PutClusterCapacityProviders</a> API
     *            is used to associate a capacity provider with a cluster. Only
     *            capacity providers with an <code>ACTIVE</code> or
     *            <code>UPDATING</code> status can be used.
     *            </p>
     *            <p>
     *            If specifying a capacity provider that uses an Auto Scaling
     *            group, the capacity provider must already be created. New
     *            capacity providers can be created with the
     *            <a>CreateCapacityProvider</a> API operation.
     *            </p>
     *            <p>
     *            To use a AWS Fargate capacity provider, specify either the
     *            <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity
     *            providers. The AWS Fargate capacity providers are available to
     *            all accounts and only need to be associated with a cluster to
     *            be used.
     *            </p>
     *            <p>
     *            If a default capacity provider strategy is not defined for a
     *            cluster during creation, it can be defined later with the
     *            <a>PutClusterCapacityProviders</a> API operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterRequest withDefaultCapacityProviderStrategy(
            CapacityProviderStrategyItem... defaultCapacityProviderStrategy) {
        if (getDefaultCapacityProviderStrategy() == null) {
            this.defaultCapacityProviderStrategy = new java.util.ArrayList<CapacityProviderStrategyItem>(
                    defaultCapacityProviderStrategy.length);
        }
        for (CapacityProviderStrategyItem value : defaultCapacityProviderStrategy) {
            this.defaultCapacityProviderStrategy.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The capacity provider strategy to use by default for the cluster.
     * </p>
     * <p>
     * When creating a service or running a task on a cluster, if no capacity
     * provider or launch type is specified then the default capacity provider
     * strategy for the cluster is used.
     * </p>
     * <p>
     * A capacity provider strategy consists of one or more capacity providers
     * along with the <code>base</code> and <code>weight</code> to assign to
     * them. A capacity provider must be associated with the cluster to be used
     * in a capacity provider strategy. The <a>PutClusterCapacityProviders</a>
     * API is used to associate a capacity provider with a cluster. Only
     * capacity providers with an <code>ACTIVE</code> or <code>UPDATING</code>
     * status can be used.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the
     * capacity provider must already be created. New capacity providers can be
     * created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the
     * <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity providers. The
     * AWS Fargate capacity providers are available to all accounts and only
     * need to be associated with a cluster to be used.
     * </p>
     * <p>
     * If a default capacity provider strategy is not defined for a cluster
     * during creation, it can be defined later with the
     * <a>PutClusterCapacityProviders</a> API operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultCapacityProviderStrategy <p>
     *            The capacity provider strategy to use by default for the
     *            cluster.
     *            </p>
     *            <p>
     *            When creating a service or running a task on a cluster, if no
     *            capacity provider or launch type is specified then the default
     *            capacity provider strategy for the cluster is used.
     *            </p>
     *            <p>
     *            A capacity provider strategy consists of one or more capacity
     *            providers along with the <code>base</code> and
     *            <code>weight</code> to assign to them. A capacity provider
     *            must be associated with the cluster to be used in a capacity
     *            provider strategy. The <a>PutClusterCapacityProviders</a> API
     *            is used to associate a capacity provider with a cluster. Only
     *            capacity providers with an <code>ACTIVE</code> or
     *            <code>UPDATING</code> status can be used.
     *            </p>
     *            <p>
     *            If specifying a capacity provider that uses an Auto Scaling
     *            group, the capacity provider must already be created. New
     *            capacity providers can be created with the
     *            <a>CreateCapacityProvider</a> API operation.
     *            </p>
     *            <p>
     *            To use a AWS Fargate capacity provider, specify either the
     *            <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity
     *            providers. The AWS Fargate capacity providers are available to
     *            all accounts and only need to be associated with a cluster to
     *            be used.
     *            </p>
     *            <p>
     *            If a default capacity provider strategy is not defined for a
     *            cluster during creation, it can be defined later with the
     *            <a>PutClusterCapacityProviders</a> API operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterRequest withDefaultCapacityProviderStrategy(
            java.util.Collection<CapacityProviderStrategyItem> defaultCapacityProviderStrategy) {
        setDefaultCapacityProviderStrategy(defaultCapacityProviderStrategy);
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
        if (getClusterName() != null)
            sb.append("clusterName: " + getClusterName() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getSettings() != null)
            sb.append("settings: " + getSettings() + ",");
        if (getCapacityProviders() != null)
            sb.append("capacityProviders: " + getCapacityProviders() + ",");
        if (getDefaultCapacityProviderStrategy() != null)
            sb.append("defaultCapacityProviderStrategy: " + getDefaultCapacityProviderStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode
                + ((getCapacityProviders() == null) ? 0 : getCapacityProviders().hashCode());
        hashCode = prime
                * hashCode
                + ((getDefaultCapacityProviderStrategy() == null) ? 0
                        : getDefaultCapacityProviderStrategy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateClusterRequest == false)
            return false;
        CreateClusterRequest other = (CreateClusterRequest) obj;

        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null
                && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getCapacityProviders() == null ^ this.getCapacityProviders() == null)
            return false;
        if (other.getCapacityProviders() != null
                && other.getCapacityProviders().equals(this.getCapacityProviders()) == false)
            return false;
        if (other.getDefaultCapacityProviderStrategy() == null
                ^ this.getDefaultCapacityProviderStrategy() == null)
            return false;
        if (other.getDefaultCapacityProviderStrategy() != null
                && other.getDefaultCapacityProviderStrategy().equals(
                        this.getDefaultCapacityProviderStrategy()) == false)
            return false;
        return true;
    }
}
