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
 * Returns properties of the user that you specify.
 * </p>
 */
public class ListedUser implements Serializable {
    /**
     * <p>
     * The unique Amazon Resource Name (ARN) for the user that you want to learn
     * about.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     * <b>Pattern: </b>arn:.*<br/>
     */
    private String arn;

    /**
     * <p>
     * Specifies the location that files are written to or read from an Amazon
     * S3 bucket for the user you specify by their ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^$|/.*<br/>
     */
    private String homeDirectory;

    /**
     * <p>
     * The type of landing directory (folder) you mapped for your users' home
     * directory. If you set it to <code>PATH</code>, the user will see the
     * absolute Amazon S3 bucket paths as is in their file transfer protocol
     * clients. If you set it <code>LOGICAL</code>, you will need to provide
     * mappings in the <code>HomeDirectoryMappings</code> for how you want to
     * make Amazon S3 paths visible to your users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PATH, LOGICAL
     */
    private String homeDirectoryType;

    /**
     * <p>
     * The role in use by this user. A <i>role</i> is an AWS Identity and Access
     * Management (IAM) entity that, in this case, allows a file transfer
     * protocol-enabled server to act on a user's behalf. It allows the server
     * to inherit the trust relationship that enables that user to perform file
     * operations to their Amazon S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:.*role/.*<br/>
     */
    private String role;

    /**
     * <p>
     * The number of SSH public keys stored for the user you specified.
     * </p>
     */
    private Integer sshPublicKeyCount;

    /**
     * <p>
     * The name of the user whose ARN was specified. User names are used for
     * authentication purposes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,31}$<br/>
     */
    private String userName;

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) for the user that you want to learn
     * about.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     * <b>Pattern: </b>arn:.*<br/>
     *
     * @return <p>
     *         The unique Amazon Resource Name (ARN) for the user that you want
     *         to learn about.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) for the user that you want to learn
     * about.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     * <b>Pattern: </b>arn:.*<br/>
     *
     * @param arn <p>
     *            The unique Amazon Resource Name (ARN) for the user that you
     *            want to learn about.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) for the user that you want to learn
     * about.
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
     *            The unique Amazon Resource Name (ARN) for the user that you
     *            want to learn about.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListedUser withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * Specifies the location that files are written to or read from an Amazon
     * S3 bucket for the user you specify by their ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^$|/.*<br/>
     *
     * @return <p>
     *         Specifies the location that files are written to or read from an
     *         Amazon S3 bucket for the user you specify by their ARN.
     *         </p>
     */
    public String getHomeDirectory() {
        return homeDirectory;
    }

    /**
     * <p>
     * Specifies the location that files are written to or read from an Amazon
     * S3 bucket for the user you specify by their ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^$|/.*<br/>
     *
     * @param homeDirectory <p>
     *            Specifies the location that files are written to or read from
     *            an Amazon S3 bucket for the user you specify by their ARN.
     *            </p>
     */
    public void setHomeDirectory(String homeDirectory) {
        this.homeDirectory = homeDirectory;
    }

    /**
     * <p>
     * Specifies the location that files are written to or read from an Amazon
     * S3 bucket for the user you specify by their ARN.
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
     *            Specifies the location that files are written to or read from
     *            an Amazon S3 bucket for the user you specify by their ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListedUser withHomeDirectory(String homeDirectory) {
        this.homeDirectory = homeDirectory;
        return this;
    }

    /**
     * <p>
     * The type of landing directory (folder) you mapped for your users' home
     * directory. If you set it to <code>PATH</code>, the user will see the
     * absolute Amazon S3 bucket paths as is in their file transfer protocol
     * clients. If you set it <code>LOGICAL</code>, you will need to provide
     * mappings in the <code>HomeDirectoryMappings</code> for how you want to
     * make Amazon S3 paths visible to your users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PATH, LOGICAL
     *
     * @return <p>
     *         The type of landing directory (folder) you mapped for your users'
     *         home directory. If you set it to <code>PATH</code>, the user will
     *         see the absolute Amazon S3 bucket paths as is in their file
     *         transfer protocol clients. If you set it <code>LOGICAL</code>,
     *         you will need to provide mappings in the
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
     * The type of landing directory (folder) you mapped for your users' home
     * directory. If you set it to <code>PATH</code>, the user will see the
     * absolute Amazon S3 bucket paths as is in their file transfer protocol
     * clients. If you set it <code>LOGICAL</code>, you will need to provide
     * mappings in the <code>HomeDirectoryMappings</code> for how you want to
     * make Amazon S3 paths visible to your users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PATH, LOGICAL
     *
     * @param homeDirectoryType <p>
     *            The type of landing directory (folder) you mapped for your
     *            users' home directory. If you set it to <code>PATH</code>, the
     *            user will see the absolute Amazon S3 bucket paths as is in
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
     * The type of landing directory (folder) you mapped for your users' home
     * directory. If you set it to <code>PATH</code>, the user will see the
     * absolute Amazon S3 bucket paths as is in their file transfer protocol
     * clients. If you set it <code>LOGICAL</code>, you will need to provide
     * mappings in the <code>HomeDirectoryMappings</code> for how you want to
     * make Amazon S3 paths visible to your users.
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
     *            users' home directory. If you set it to <code>PATH</code>, the
     *            user will see the absolute Amazon S3 bucket paths as is in
     *            their file transfer protocol clients. If you set it
     *            <code>LOGICAL</code>, you will need to provide mappings in the
     *            <code>HomeDirectoryMappings</code> for how you want to make
     *            Amazon S3 paths visible to your users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HomeDirectoryType
     */
    public ListedUser withHomeDirectoryType(String homeDirectoryType) {
        this.homeDirectoryType = homeDirectoryType;
        return this;
    }

    /**
     * <p>
     * The type of landing directory (folder) you mapped for your users' home
     * directory. If you set it to <code>PATH</code>, the user will see the
     * absolute Amazon S3 bucket paths as is in their file transfer protocol
     * clients. If you set it <code>LOGICAL</code>, you will need to provide
     * mappings in the <code>HomeDirectoryMappings</code> for how you want to
     * make Amazon S3 paths visible to your users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PATH, LOGICAL
     *
     * @param homeDirectoryType <p>
     *            The type of landing directory (folder) you mapped for your
     *            users' home directory. If you set it to <code>PATH</code>, the
     *            user will see the absolute Amazon S3 bucket paths as is in
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
     * The type of landing directory (folder) you mapped for your users' home
     * directory. If you set it to <code>PATH</code>, the user will see the
     * absolute Amazon S3 bucket paths as is in their file transfer protocol
     * clients. If you set it <code>LOGICAL</code>, you will need to provide
     * mappings in the <code>HomeDirectoryMappings</code> for how you want to
     * make Amazon S3 paths visible to your users.
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
     *            users' home directory. If you set it to <code>PATH</code>, the
     *            user will see the absolute Amazon S3 bucket paths as is in
     *            their file transfer protocol clients. If you set it
     *            <code>LOGICAL</code>, you will need to provide mappings in the
     *            <code>HomeDirectoryMappings</code> for how you want to make
     *            Amazon S3 paths visible to your users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HomeDirectoryType
     */
    public ListedUser withHomeDirectoryType(HomeDirectoryType homeDirectoryType) {
        this.homeDirectoryType = homeDirectoryType.toString();
        return this;
    }

    /**
     * <p>
     * The role in use by this user. A <i>role</i> is an AWS Identity and Access
     * Management (IAM) entity that, in this case, allows a file transfer
     * protocol-enabled server to act on a user's behalf. It allows the server
     * to inherit the trust relationship that enables that user to perform file
     * operations to their Amazon S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:.*role/.*<br/>
     *
     * @return <p>
     *         The role in use by this user. A <i>role</i> is an AWS Identity
     *         and Access Management (IAM) entity that, in this case, allows a
     *         file transfer protocol-enabled server to act on a user's behalf.
     *         It allows the server to inherit the trust relationship that
     *         enables that user to perform file operations to their Amazon S3
     *         bucket.
     *         </p>
     */
    public String getRole() {
        return role;
    }

    /**
     * <p>
     * The role in use by this user. A <i>role</i> is an AWS Identity and Access
     * Management (IAM) entity that, in this case, allows a file transfer
     * protocol-enabled server to act on a user's behalf. It allows the server
     * to inherit the trust relationship that enables that user to perform file
     * operations to their Amazon S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:.*role/.*<br/>
     *
     * @param role <p>
     *            The role in use by this user. A <i>role</i> is an AWS Identity
     *            and Access Management (IAM) entity that, in this case, allows
     *            a file transfer protocol-enabled server to act on a user's
     *            behalf. It allows the server to inherit the trust relationship
     *            that enables that user to perform file operations to their
     *            Amazon S3 bucket.
     *            </p>
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The role in use by this user. A <i>role</i> is an AWS Identity and Access
     * Management (IAM) entity that, in this case, allows a file transfer
     * protocol-enabled server to act on a user's behalf. It allows the server
     * to inherit the trust relationship that enables that user to perform file
     * operations to their Amazon S3 bucket.
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
     *            The role in use by this user. A <i>role</i> is an AWS Identity
     *            and Access Management (IAM) entity that, in this case, allows
     *            a file transfer protocol-enabled server to act on a user's
     *            behalf. It allows the server to inherit the trust relationship
     *            that enables that user to perform file operations to their
     *            Amazon S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListedUser withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * <p>
     * The number of SSH public keys stored for the user you specified.
     * </p>
     *
     * @return <p>
     *         The number of SSH public keys stored for the user you specified.
     *         </p>
     */
    public Integer getSshPublicKeyCount() {
        return sshPublicKeyCount;
    }

    /**
     * <p>
     * The number of SSH public keys stored for the user you specified.
     * </p>
     *
     * @param sshPublicKeyCount <p>
     *            The number of SSH public keys stored for the user you
     *            specified.
     *            </p>
     */
    public void setSshPublicKeyCount(Integer sshPublicKeyCount) {
        this.sshPublicKeyCount = sshPublicKeyCount;
    }

    /**
     * <p>
     * The number of SSH public keys stored for the user you specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sshPublicKeyCount <p>
     *            The number of SSH public keys stored for the user you
     *            specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListedUser withSshPublicKeyCount(Integer sshPublicKeyCount) {
        this.sshPublicKeyCount = sshPublicKeyCount;
        return this;
    }

    /**
     * <p>
     * The name of the user whose ARN was specified. User names are used for
     * authentication purposes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,31}$<br/>
     *
     * @return <p>
     *         The name of the user whose ARN was specified. User names are used
     *         for authentication purposes.
     *         </p>
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>
     * The name of the user whose ARN was specified. User names are used for
     * authentication purposes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,31}$<br/>
     *
     * @param userName <p>
     *            The name of the user whose ARN was specified. User names are
     *            used for authentication purposes.
     *            </p>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the user whose ARN was specified. User names are used for
     * authentication purposes.
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
     *            The name of the user whose ARN was specified. User names are
     *            used for authentication purposes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListedUser withUserName(String userName) {
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
        if (getHomeDirectoryType() != null)
            sb.append("HomeDirectoryType: " + getHomeDirectoryType() + ",");
        if (getRole() != null)
            sb.append("Role: " + getRole() + ",");
        if (getSshPublicKeyCount() != null)
            sb.append("SshPublicKeyCount: " + getSshPublicKeyCount() + ",");
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
        hashCode = prime * hashCode
                + ((getHomeDirectoryType() == null) ? 0 : getHomeDirectoryType().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode
                + ((getSshPublicKeyCount() == null) ? 0 : getSshPublicKeyCount().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListedUser == false)
            return false;
        ListedUser other = (ListedUser) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getHomeDirectory() == null ^ this.getHomeDirectory() == null)
            return false;
        if (other.getHomeDirectory() != null
                && other.getHomeDirectory().equals(this.getHomeDirectory()) == false)
            return false;
        if (other.getHomeDirectoryType() == null ^ this.getHomeDirectoryType() == null)
            return false;
        if (other.getHomeDirectoryType() != null
                && other.getHomeDirectoryType().equals(this.getHomeDirectoryType()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getSshPublicKeyCount() == null ^ this.getSshPublicKeyCount() == null)
            return false;
        if (other.getSshPublicKeyCount() != null
                && other.getSshPublicKeyCount().equals(this.getSshPublicKeyCount()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        return true;
    }
}
