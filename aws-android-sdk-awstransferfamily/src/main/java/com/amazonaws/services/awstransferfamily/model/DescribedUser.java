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

package com.amazonaws.services.awstransferfamily.model;

import java.io.Serializable;

/**
 * <p>
 * Returns properties of the user that you want to describe.
 * </p>
 */
public class DescribedUser implements Serializable {
    /**
     * <p>
     * Contains the unique Amazon Resource Name (ARN) for the user that was
     * requested to be described.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     * <b>Pattern: </b>arn:.*<br/>
     */
    private String arn;

    /**
     * <p>
     * Specifies the landing directory (or folder), which is the location that
     * files are written to or read from in an Amazon S3 bucket for the
     * described user. An example is
     * <code>/<i>your s3 bucket name</i>/home/<i>username</i> </code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^$|/.*<br/>
     */
    private String homeDirectory;

    /**
     * <p>
     * Logical directory mappings that you specified for what Amazon S3 paths
     * and keys should be visible to your user and how you want to make them
     * visible. You will need to specify the "<code>Entry</code>" and "
     * <code>Target</code>" pair, where <code>Entry</code> shows how the path is
     * made visible and <code>Target</code> is the actual Amazon S3 path. If you
     * only specify a target, it will be displayed as is. You will need to also
     * make sure that your AWS IAM Role provides access to paths in
     * <code>Target</code>.
     * </p>
     * <p>
     * In most cases, you can use this value instead of the scope-down policy to
     * lock your user down to the designated home directory ("chroot"). To do
     * this, you can set <code>Entry</code> to '/' and set <code>Target</code>
     * to the HomeDirectory parameter value.
     * </p>
     */
    private java.util.List<HomeDirectoryMapEntry> homeDirectoryMappings;

    /**
     * <p>
     * The type of landing directory (folder) you mapped for your users to see
     * when they log into the file transfer protocol-enabled server. If you set
     * it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket
     * paths as is in their file transfer protocol clients. If you set it
     * <code>LOGICAL</code>, you will need to provide mappings in the
     * <code>HomeDirectoryMappings</code> for how you want to make Amazon S3
     * paths visible to your users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PATH, LOGICAL
     */
    private String homeDirectoryType;

    /**
     * <p>
     * Specifies the name of the policy in use for the described user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     */
    private String policy;

    /**
     * <p>
     * Specifies the IAM role that controls your users' access to your Amazon S3
     * bucket. The policies attached to this role will determine the level of
     * access you want to provide your users when transferring files into and
     * out of your Amazon S3 bucket or buckets. The IAM role should also contain
     * a trust relationship that allows a file transfer protocol-enabled server
     * to access your resources when servicing your users' transfer requests.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:.*role/.*<br/>
     */
    private String role;

    /**
     * <p>
     * Contains the public key portion of the Secure Shell (SSH) keys stored for
     * the described user.
     * </p>
     */
    private java.util.List<SshPublicKey> sshPublicKeys;

    /**
     * <p>
     * Contains the key-value pairs for the user requested. Tag can be used to
     * search for and group users for a variety of purposes.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the user that was requested to be described. User names are
     * used for authentication purposes. This is the string that will be used by
     * your user when they log in to your file transfer protocol-enabled server.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,31}$<br/>
     */
    private String userName;

    /**
     * <p>
     * Contains the unique Amazon Resource Name (ARN) for the user that was
     * requested to be described.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     * <b>Pattern: </b>arn:.*<br/>
     *
     * @return <p>
     *         Contains the unique Amazon Resource Name (ARN) for the user that
     *         was requested to be described.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * Contains the unique Amazon Resource Name (ARN) for the user that was
     * requested to be described.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     * <b>Pattern: </b>arn:.*<br/>
     *
     * @param arn <p>
     *            Contains the unique Amazon Resource Name (ARN) for the user
     *            that was requested to be described.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Contains the unique Amazon Resource Name (ARN) for the user that was
     * requested to be described.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     * <b>Pattern: </b>arn:.*<br/>
     *
     * @param arn <p>
     *            Contains the unique Amazon Resource Name (ARN) for the user
     *            that was requested to be described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribedUser withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * Specifies the landing directory (or folder), which is the location that
     * files are written to or read from in an Amazon S3 bucket for the
     * described user. An example is
     * <code>/<i>your s3 bucket name</i>/home/<i>username</i> </code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^$|/.*<br/>
     *
     * @return <p>
     *         Specifies the landing directory (or folder), which is the
     *         location that files are written to or read from in an Amazon S3
     *         bucket for the described user. An example is
     *         <code>/<i>your s3 bucket name</i>/home/<i>username</i> </code>.
     *         </p>
     */
    public String getHomeDirectory() {
        return homeDirectory;
    }

    /**
     * <p>
     * Specifies the landing directory (or folder), which is the location that
     * files are written to or read from in an Amazon S3 bucket for the
     * described user. An example is
     * <code>/<i>your s3 bucket name</i>/home/<i>username</i> </code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^$|/.*<br/>
     *
     * @param homeDirectory <p>
     *            Specifies the landing directory (or folder), which is the
     *            location that files are written to or read from in an Amazon
     *            S3 bucket for the described user. An example is
     *            <code>/<i>your s3 bucket name</i>/home/<i>username</i> </code>
     *            .
     *            </p>
     */
    public void setHomeDirectory(String homeDirectory) {
        this.homeDirectory = homeDirectory;
    }

    /**
     * <p>
     * Specifies the landing directory (or folder), which is the location that
     * files are written to or read from in an Amazon S3 bucket for the
     * described user. An example is
     * <code>/<i>your s3 bucket name</i>/home/<i>username</i> </code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^$|/.*<br/>
     *
     * @param homeDirectory <p>
     *            Specifies the landing directory (or folder), which is the
     *            location that files are written to or read from in an Amazon
     *            S3 bucket for the described user. An example is
     *            <code>/<i>your s3 bucket name</i>/home/<i>username</i> </code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribedUser withHomeDirectory(String homeDirectory) {
        this.homeDirectory = homeDirectory;
        return this;
    }

    /**
     * <p>
     * Logical directory mappings that you specified for what Amazon S3 paths
     * and keys should be visible to your user and how you want to make them
     * visible. You will need to specify the "<code>Entry</code>" and "
     * <code>Target</code>" pair, where <code>Entry</code> shows how the path is
     * made visible and <code>Target</code> is the actual Amazon S3 path. If you
     * only specify a target, it will be displayed as is. You will need to also
     * make sure that your AWS IAM Role provides access to paths in
     * <code>Target</code>.
     * </p>
     * <p>
     * In most cases, you can use this value instead of the scope-down policy to
     * lock your user down to the designated home directory ("chroot"). To do
     * this, you can set <code>Entry</code> to '/' and set <code>Target</code>
     * to the HomeDirectory parameter value.
     * </p>
     *
     * @return <p>
     *         Logical directory mappings that you specified for what Amazon S3
     *         paths and keys should be visible to your user and how you want to
     *         make them visible. You will need to specify the "
     *         <code>Entry</code>" and "<code>Target</code>" pair, where
     *         <code>Entry</code> shows how the path is made visible and
     *         <code>Target</code> is the actual Amazon S3 path. If you only
     *         specify a target, it will be displayed as is. You will need to
     *         also make sure that your AWS IAM Role provides access to paths in
     *         <code>Target</code>.
     *         </p>
     *         <p>
     *         In most cases, you can use this value instead of the scope-down
     *         policy to lock your user down to the designated home directory
     *         ("chroot"). To do this, you can set <code>Entry</code> to '/' and
     *         set <code>Target</code> to the HomeDirectory parameter value.
     *         </p>
     */
    public java.util.List<HomeDirectoryMapEntry> getHomeDirectoryMappings() {
        return homeDirectoryMappings;
    }

    /**
     * <p>
     * Logical directory mappings that you specified for what Amazon S3 paths
     * and keys should be visible to your user and how you want to make them
     * visible. You will need to specify the "<code>Entry</code>" and "
     * <code>Target</code>" pair, where <code>Entry</code> shows how the path is
     * made visible and <code>Target</code> is the actual Amazon S3 path. If you
     * only specify a target, it will be displayed as is. You will need to also
     * make sure that your AWS IAM Role provides access to paths in
     * <code>Target</code>.
     * </p>
     * <p>
     * In most cases, you can use this value instead of the scope-down policy to
     * lock your user down to the designated home directory ("chroot"). To do
     * this, you can set <code>Entry</code> to '/' and set <code>Target</code>
     * to the HomeDirectory parameter value.
     * </p>
     *
     * @param homeDirectoryMappings <p>
     *            Logical directory mappings that you specified for what Amazon
     *            S3 paths and keys should be visible to your user and how you
     *            want to make them visible. You will need to specify the "
     *            <code>Entry</code>" and "<code>Target</code>" pair, where
     *            <code>Entry</code> shows how the path is made visible and
     *            <code>Target</code> is the actual Amazon S3 path. If you only
     *            specify a target, it will be displayed as is. You will need to
     *            also make sure that your AWS IAM Role provides access to paths
     *            in <code>Target</code>.
     *            </p>
     *            <p>
     *            In most cases, you can use this value instead of the
     *            scope-down policy to lock your user down to the designated
     *            home directory ("chroot"). To do this, you can set
     *            <code>Entry</code> to '/' and set <code>Target</code> to the
     *            HomeDirectory parameter value.
     *            </p>
     */
    public void setHomeDirectoryMappings(
            java.util.Collection<HomeDirectoryMapEntry> homeDirectoryMappings) {
        if (homeDirectoryMappings == null) {
            this.homeDirectoryMappings = null;
            return;
        }

        this.homeDirectoryMappings = new java.util.ArrayList<HomeDirectoryMapEntry>(
                homeDirectoryMappings);
    }

    /**
     * <p>
     * Logical directory mappings that you specified for what Amazon S3 paths
     * and keys should be visible to your user and how you want to make them
     * visible. You will need to specify the "<code>Entry</code>" and "
     * <code>Target</code>" pair, where <code>Entry</code> shows how the path is
     * made visible and <code>Target</code> is the actual Amazon S3 path. If you
     * only specify a target, it will be displayed as is. You will need to also
     * make sure that your AWS IAM Role provides access to paths in
     * <code>Target</code>.
     * </p>
     * <p>
     * In most cases, you can use this value instead of the scope-down policy to
     * lock your user down to the designated home directory ("chroot"). To do
     * this, you can set <code>Entry</code> to '/' and set <code>Target</code>
     * to the HomeDirectory parameter value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param homeDirectoryMappings <p>
     *            Logical directory mappings that you specified for what Amazon
     *            S3 paths and keys should be visible to your user and how you
     *            want to make them visible. You will need to specify the "
     *            <code>Entry</code>" and "<code>Target</code>" pair, where
     *            <code>Entry</code> shows how the path is made visible and
     *            <code>Target</code> is the actual Amazon S3 path. If you only
     *            specify a target, it will be displayed as is. You will need to
     *            also make sure that your AWS IAM Role provides access to paths
     *            in <code>Target</code>.
     *            </p>
     *            <p>
     *            In most cases, you can use this value instead of the
     *            scope-down policy to lock your user down to the designated
     *            home directory ("chroot"). To do this, you can set
     *            <code>Entry</code> to '/' and set <code>Target</code> to the
     *            HomeDirectory parameter value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribedUser withHomeDirectoryMappings(HomeDirectoryMapEntry... homeDirectoryMappings) {
        if (getHomeDirectoryMappings() == null) {
            this.homeDirectoryMappings = new java.util.ArrayList<HomeDirectoryMapEntry>(
                    homeDirectoryMappings.length);
        }
        for (HomeDirectoryMapEntry value : homeDirectoryMappings) {
            this.homeDirectoryMappings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Logical directory mappings that you specified for what Amazon S3 paths
     * and keys should be visible to your user and how you want to make them
     * visible. You will need to specify the "<code>Entry</code>" and "
     * <code>Target</code>" pair, where <code>Entry</code> shows how the path is
     * made visible and <code>Target</code> is the actual Amazon S3 path. If you
     * only specify a target, it will be displayed as is. You will need to also
     * make sure that your AWS IAM Role provides access to paths in
     * <code>Target</code>.
     * </p>
     * <p>
     * In most cases, you can use this value instead of the scope-down policy to
     * lock your user down to the designated home directory ("chroot"). To do
     * this, you can set <code>Entry</code> to '/' and set <code>Target</code>
     * to the HomeDirectory parameter value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param homeDirectoryMappings <p>
     *            Logical directory mappings that you specified for what Amazon
     *            S3 paths and keys should be visible to your user and how you
     *            want to make them visible. You will need to specify the "
     *            <code>Entry</code>" and "<code>Target</code>" pair, where
     *            <code>Entry</code> shows how the path is made visible and
     *            <code>Target</code> is the actual Amazon S3 path. If you only
     *            specify a target, it will be displayed as is. You will need to
     *            also make sure that your AWS IAM Role provides access to paths
     *            in <code>Target</code>.
     *            </p>
     *            <p>
     *            In most cases, you can use this value instead of the
     *            scope-down policy to lock your user down to the designated
     *            home directory ("chroot"). To do this, you can set
     *            <code>Entry</code> to '/' and set <code>Target</code> to the
     *            HomeDirectory parameter value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribedUser withHomeDirectoryMappings(
            java.util.Collection<HomeDirectoryMapEntry> homeDirectoryMappings) {
        setHomeDirectoryMappings(homeDirectoryMappings);
        return this;
    }

    /**
     * <p>
     * The type of landing directory (folder) you mapped for your users to see
     * when they log into the file transfer protocol-enabled server. If you set
     * it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket
     * paths as is in their file transfer protocol clients. If you set it
     * <code>LOGICAL</code>, you will need to provide mappings in the
     * <code>HomeDirectoryMappings</code> for how you want to make Amazon S3
     * paths visible to your users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PATH, LOGICAL
     *
     * @return <p>
     *         The type of landing directory (folder) you mapped for your users
     *         to see when they log into the file transfer protocol-enabled
     *         server. If you set it to <code>PATH</code>, the user will see the
     *         absolute Amazon S3 bucket paths as is in their file transfer
     *         protocol clients. If you set it <code>LOGICAL</code>, you will
     *         need to provide mappings in the
     *         <code>HomeDirectoryMappings</code> for how you want to make
     *         Amazon S3 paths visible to your users.
     *         </p>
     * @see HomeDirectoryType
     */
    public String getHomeDirectoryType() {
        return homeDirectoryType;
    }

    /**
     * <p>
     * The type of landing directory (folder) you mapped for your users to see
     * when they log into the file transfer protocol-enabled server. If you set
     * it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket
     * paths as is in their file transfer protocol clients. If you set it
     * <code>LOGICAL</code>, you will need to provide mappings in the
     * <code>HomeDirectoryMappings</code> for how you want to make Amazon S3
     * paths visible to your users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PATH, LOGICAL
     *
     * @param homeDirectoryType <p>
     *            The type of landing directory (folder) you mapped for your
     *            users to see when they log into the file transfer
     *            protocol-enabled server. If you set it to <code>PATH</code>,
     *            the user will see the absolute Amazon S3 bucket paths as is in
     *            their file transfer protocol clients. If you set it
     *            <code>LOGICAL</code>, you will need to provide mappings in the
     *            <code>HomeDirectoryMappings</code> for how you want to make
     *            Amazon S3 paths visible to your users.
     *            </p>
     * @see HomeDirectoryType
     */
    public void setHomeDirectoryType(String homeDirectoryType) {
        this.homeDirectoryType = homeDirectoryType;
    }

    /**
     * <p>
     * The type of landing directory (folder) you mapped for your users to see
     * when they log into the file transfer protocol-enabled server. If you set
     * it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket
     * paths as is in their file transfer protocol clients. If you set it
     * <code>LOGICAL</code>, you will need to provide mappings in the
     * <code>HomeDirectoryMappings</code> for how you want to make Amazon S3
     * paths visible to your users.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PATH, LOGICAL
     *
     * @param homeDirectoryType <p>
     *            The type of landing directory (folder) you mapped for your
     *            users to see when they log into the file transfer
     *            protocol-enabled server. If you set it to <code>PATH</code>,
     *            the user will see the absolute Amazon S3 bucket paths as is in
     *            their file transfer protocol clients. If you set it
     *            <code>LOGICAL</code>, you will need to provide mappings in the
     *            <code>HomeDirectoryMappings</code> for how you want to make
     *            Amazon S3 paths visible to your users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HomeDirectoryType
     */
    public DescribedUser withHomeDirectoryType(String homeDirectoryType) {
        this.homeDirectoryType = homeDirectoryType;
        return this;
    }

    /**
     * <p>
     * The type of landing directory (folder) you mapped for your users to see
     * when they log into the file transfer protocol-enabled server. If you set
     * it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket
     * paths as is in their file transfer protocol clients. If you set it
     * <code>LOGICAL</code>, you will need to provide mappings in the
     * <code>HomeDirectoryMappings</code> for how you want to make Amazon S3
     * paths visible to your users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PATH, LOGICAL
     *
     * @param homeDirectoryType <p>
     *            The type of landing directory (folder) you mapped for your
     *            users to see when they log into the file transfer
     *            protocol-enabled server. If you set it to <code>PATH</code>,
     *            the user will see the absolute Amazon S3 bucket paths as is in
     *            their file transfer protocol clients. If you set it
     *            <code>LOGICAL</code>, you will need to provide mappings in the
     *            <code>HomeDirectoryMappings</code> for how you want to make
     *            Amazon S3 paths visible to your users.
     *            </p>
     * @see HomeDirectoryType
     */
    public void setHomeDirectoryType(HomeDirectoryType homeDirectoryType) {
        this.homeDirectoryType = homeDirectoryType.toString();
    }

    /**
     * <p>
     * The type of landing directory (folder) you mapped for your users to see
     * when they log into the file transfer protocol-enabled server. If you set
     * it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket
     * paths as is in their file transfer protocol clients. If you set it
     * <code>LOGICAL</code>, you will need to provide mappings in the
     * <code>HomeDirectoryMappings</code> for how you want to make Amazon S3
     * paths visible to your users.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PATH, LOGICAL
     *
     * @param homeDirectoryType <p>
     *            The type of landing directory (folder) you mapped for your
     *            users to see when they log into the file transfer
     *            protocol-enabled server. If you set it to <code>PATH</code>,
     *            the user will see the absolute Amazon S3 bucket paths as is in
     *            their file transfer protocol clients. If you set it
     *            <code>LOGICAL</code>, you will need to provide mappings in the
     *            <code>HomeDirectoryMappings</code> for how you want to make
     *            Amazon S3 paths visible to your users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HomeDirectoryType
     */
    public DescribedUser withHomeDirectoryType(HomeDirectoryType homeDirectoryType) {
        this.homeDirectoryType = homeDirectoryType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the name of the policy in use for the described user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @return <p>
     *         Specifies the name of the policy in use for the described user.
     *         </p>
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * <p>
     * Specifies the name of the policy in use for the described user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @param policy <p>
     *            Specifies the name of the policy in use for the described
     *            user.
     *            </p>
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * Specifies the name of the policy in use for the described user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @param policy <p>
     *            Specifies the name of the policy in use for the described
     *            user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribedUser withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * <p>
     * Specifies the IAM role that controls your users' access to your Amazon S3
     * bucket. The policies attached to this role will determine the level of
     * access you want to provide your users when transferring files into and
     * out of your Amazon S3 bucket or buckets. The IAM role should also contain
     * a trust relationship that allows a file transfer protocol-enabled server
     * to access your resources when servicing your users' transfer requests.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:.*role/.*<br/>
     *
     * @return <p>
     *         Specifies the IAM role that controls your users' access to your
     *         Amazon S3 bucket. The policies attached to this role will
     *         determine the level of access you want to provide your users when
     *         transferring files into and out of your Amazon S3 bucket or
     *         buckets. The IAM role should also contain a trust relationship
     *         that allows a file transfer protocol-enabled server to access
     *         your resources when servicing your users' transfer requests.
     *         </p>
     */
    public String getRole() {
        return role;
    }

    /**
     * <p>
     * Specifies the IAM role that controls your users' access to your Amazon S3
     * bucket. The policies attached to this role will determine the level of
     * access you want to provide your users when transferring files into and
     * out of your Amazon S3 bucket or buckets. The IAM role should also contain
     * a trust relationship that allows a file transfer protocol-enabled server
     * to access your resources when servicing your users' transfer requests.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:.*role/.*<br/>
     *
     * @param role <p>
     *            Specifies the IAM role that controls your users' access to
     *            your Amazon S3 bucket. The policies attached to this role will
     *            determine the level of access you want to provide your users
     *            when transferring files into and out of your Amazon S3 bucket
     *            or buckets. The IAM role should also contain a trust
     *            relationship that allows a file transfer protocol-enabled
     *            server to access your resources when servicing your users'
     *            transfer requests.
     *            </p>
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * Specifies the IAM role that controls your users' access to your Amazon S3
     * bucket. The policies attached to this role will determine the level of
     * access you want to provide your users when transferring files into and
     * out of your Amazon S3 bucket or buckets. The IAM role should also contain
     * a trust relationship that allows a file transfer protocol-enabled server
     * to access your resources when servicing your users' transfer requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:.*role/.*<br/>
     *
     * @param role <p>
     *            Specifies the IAM role that controls your users' access to
     *            your Amazon S3 bucket. The policies attached to this role will
     *            determine the level of access you want to provide your users
     *            when transferring files into and out of your Amazon S3 bucket
     *            or buckets. The IAM role should also contain a trust
     *            relationship that allows a file transfer protocol-enabled
     *            server to access your resources when servicing your users'
     *            transfer requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribedUser withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * <p>
     * Contains the public key portion of the Secure Shell (SSH) keys stored for
     * the described user.
     * </p>
     *
     * @return <p>
     *         Contains the public key portion of the Secure Shell (SSH) keys
     *         stored for the described user.
     *         </p>
     */
    public java.util.List<SshPublicKey> getSshPublicKeys() {
        return sshPublicKeys;
    }

    /**
     * <p>
     * Contains the public key portion of the Secure Shell (SSH) keys stored for
     * the described user.
     * </p>
     *
     * @param sshPublicKeys <p>
     *            Contains the public key portion of the Secure Shell (SSH) keys
     *            stored for the described user.
     *            </p>
     */
    public void setSshPublicKeys(java.util.Collection<SshPublicKey> sshPublicKeys) {
        if (sshPublicKeys == null) {
            this.sshPublicKeys = null;
            return;
        }

        this.sshPublicKeys = new java.util.ArrayList<SshPublicKey>(sshPublicKeys);
    }

    /**
     * <p>
     * Contains the public key portion of the Secure Shell (SSH) keys stored for
     * the described user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sshPublicKeys <p>
     *            Contains the public key portion of the Secure Shell (SSH) keys
     *            stored for the described user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribedUser withSshPublicKeys(SshPublicKey... sshPublicKeys) {
        if (getSshPublicKeys() == null) {
            this.sshPublicKeys = new java.util.ArrayList<SshPublicKey>(sshPublicKeys.length);
        }
        for (SshPublicKey value : sshPublicKeys) {
            this.sshPublicKeys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains the public key portion of the Secure Shell (SSH) keys stored for
     * the described user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sshPublicKeys <p>
     *            Contains the public key portion of the Secure Shell (SSH) keys
     *            stored for the described user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribedUser withSshPublicKeys(java.util.Collection<SshPublicKey> sshPublicKeys) {
        setSshPublicKeys(sshPublicKeys);
        return this;
    }

    /**
     * <p>
     * Contains the key-value pairs for the user requested. Tag can be used to
     * search for and group users for a variety of purposes.
     * </p>
     *
     * @return <p>
     *         Contains the key-value pairs for the user requested. Tag can be
     *         used to search for and group users for a variety of purposes.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Contains the key-value pairs for the user requested. Tag can be used to
     * search for and group users for a variety of purposes.
     * </p>
     *
     * @param tags <p>
     *            Contains the key-value pairs for the user requested. Tag can
     *            be used to search for and group users for a variety of
     *            purposes.
     *            </p>
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
     * Contains the key-value pairs for the user requested. Tag can be used to
     * search for and group users for a variety of purposes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Contains the key-value pairs for the user requested. Tag can
     *            be used to search for and group users for a variety of
     *            purposes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribedUser withTags(Tag... tags) {
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
     * Contains the key-value pairs for the user requested. Tag can be used to
     * search for and group users for a variety of purposes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Contains the key-value pairs for the user requested. Tag can
     *            be used to search for and group users for a variety of
     *            purposes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribedUser withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The name of the user that was requested to be described. User names are
     * used for authentication purposes. This is the string that will be used by
     * your user when they log in to your file transfer protocol-enabled server.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,31}$<br/>
     *
     * @return <p>
     *         The name of the user that was requested to be described. User
     *         names are used for authentication purposes. This is the string
     *         that will be used by your user when they log in to your file
     *         transfer protocol-enabled server.
     *         </p>
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>
     * The name of the user that was requested to be described. User names are
     * used for authentication purposes. This is the string that will be used by
     * your user when they log in to your file transfer protocol-enabled server.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,31}$<br/>
     *
     * @param userName <p>
     *            The name of the user that was requested to be described. User
     *            names are used for authentication purposes. This is the string
     *            that will be used by your user when they log in to your file
     *            transfer protocol-enabled server.
     *            </p>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the user that was requested to be described. User names are
     * used for authentication purposes. This is the string that will be used by
     * your user when they log in to your file transfer protocol-enabled server.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,31}$<br/>
     *
     * @param userName <p>
     *            The name of the user that was requested to be described. User
     *            names are used for authentication purposes. This is the string
     *            that will be used by your user when they log in to your file
     *            transfer protocol-enabled server.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribedUser withUserName(String userName) {
        this.userName = userName;
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
            sb.append("Arn: " + getArn() + ",");
        if (getHomeDirectory() != null)
            sb.append("HomeDirectory: " + getHomeDirectory() + ",");
        if (getHomeDirectoryMappings() != null)
            sb.append("HomeDirectoryMappings: " + getHomeDirectoryMappings() + ",");
        if (getHomeDirectoryType() != null)
            sb.append("HomeDirectoryType: " + getHomeDirectoryType() + ",");
        if (getPolicy() != null)
            sb.append("Policy: " + getPolicy() + ",");
        if (getRole() != null)
            sb.append("Role: " + getRole() + ",");
        if (getSshPublicKeys() != null)
            sb.append("SshPublicKeys: " + getSshPublicKeys() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getUserName() != null)
            sb.append("UserName: " + getUserName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getHomeDirectory() == null) ? 0 : getHomeDirectory().hashCode());
        hashCode = prime
                * hashCode
                + ((getHomeDirectoryMappings() == null) ? 0 : getHomeDirectoryMappings().hashCode());
        hashCode = prime * hashCode
                + ((getHomeDirectoryType() == null) ? 0 : getHomeDirectoryType().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode
                + ((getSshPublicKeys() == null) ? 0 : getSshPublicKeys().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribedUser == false)
            return false;
        DescribedUser other = (DescribedUser) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getHomeDirectory() == null ^ this.getHomeDirectory() == null)
            return false;
        if (other.getHomeDirectory() != null
                && other.getHomeDirectory().equals(this.getHomeDirectory()) == false)
            return false;
        if (other.getHomeDirectoryMappings() == null ^ this.getHomeDirectoryMappings() == null)
            return false;
        if (other.getHomeDirectoryMappings() != null
                && other.getHomeDirectoryMappings().equals(this.getHomeDirectoryMappings()) == false)
            return false;
        if (other.getHomeDirectoryType() == null ^ this.getHomeDirectoryType() == null)
            return false;
        if (other.getHomeDirectoryType() != null
                && other.getHomeDirectoryType().equals(this.getHomeDirectoryType()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getSshPublicKeys() == null ^ this.getSshPublicKeys() == null)
            return false;
        if (other.getSshPublicKeys() != null
                && other.getSshPublicKeys().equals(this.getSshPublicKeys()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        return true;
    }
}
