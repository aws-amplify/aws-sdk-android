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
 * Information about a file system created by Amazon Elastic File System (EFS).
 * For more information, see <a
 * href="https://docs.aws.amazon.com/efs/latest/ug/whatisefs.html">What Is
 * Amazon Elastic File System?</a>
 * </p>
 */
public class ProjectFileSystemLocation implements Serializable {
    /**
     * <p>
     * The type of the file system. The one supported type is <code>EFS</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EFS
     */
    private String type;

    /**
     * <p>
     * A string that specifies the location of the file system created by Amazon
     * EFS. Its format is <code>efs-dns-name:/directory-path</code>. You can
     * find the DNS name of file system when you view it in the AWS EFS console.
     * The directory path is a path to a directory in the file system that
     * CodeBuild mounts. For example, if the DNS name of a file system is
     * <code>fs-abcd1234.efs.us-west-2.amazonaws.com</code>, and its mount
     * directory is <code>my-efs-mount-directory</code>, then the
     * <code>location</code> is
     * <code>fs-abcd1234.efs.us-west-2.amazonaws.com:/my-efs-mount-directory</code>
     * .
     * </p>
     * <p>
     * The directory path in the format
     * <code>efs-dns-name:/directory-path</code> is optional. If you do not
     * specify a directory path, the location is only the DNS name and CodeBuild
     * mounts the entire file system.
     * </p>
     */
    private String location;

    /**
     * <p>
     * The location in the container where you mount the file system.
     * </p>
     */
    private String mountPoint;

    /**
     * <p>
     * The name used to access a file system created by Amazon EFS. CodeBuild
     * creates an environment variable by appending the <code>identifier</code>
     * in all capital letters to <code>CODEBUILD_</code>. For example, if you
     * specify <code>my-efs</code> for <code>identifier</code>, a new
     * environment variable is create named <code>CODEBUILD_MY-EFS</code>.
     * </p>
     * <p>
     * The <code>identifier</code> is used to mount your file system.
     * </p>
     */
    private String identifier;

    /**
     * <p>
     * The mount options for a file system created by AWS EFS. The default mount
     * options used by CodeBuild are
     * <code>nfsvers=4.1,rsize=1048576,wsize=1048576,hard,timeo=600,retrans=2</code>
     * . For more information, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/mounting-fs-nfs-mount-settings.html"
     * >Recommended NFS Mount Options</a>.
     * </p>
     */
    private String mountOptions;

    /**
     * <p>
     * The type of the file system. The one supported type is <code>EFS</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EFS
     *
     * @return <p>
     *         The type of the file system. The one supported type is
     *         <code>EFS</code>.
     *         </p>
     * @see FileSystemType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the file system. The one supported type is <code>EFS</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EFS
     *
     * @param type <p>
     *            The type of the file system. The one supported type is
     *            <code>EFS</code>.
     *            </p>
     * @see FileSystemType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the file system. The one supported type is <code>EFS</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EFS
     *
     * @param type <p>
     *            The type of the file system. The one supported type is
     *            <code>EFS</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileSystemType
     */
    public ProjectFileSystemLocation withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the file system. The one supported type is <code>EFS</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EFS
     *
     * @param type <p>
     *            The type of the file system. The one supported type is
     *            <code>EFS</code>.
     *            </p>
     * @see FileSystemType
     */
    public void setType(FileSystemType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the file system. The one supported type is <code>EFS</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EFS
     *
     * @param type <p>
     *            The type of the file system. The one supported type is
     *            <code>EFS</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileSystemType
     */
    public ProjectFileSystemLocation withType(FileSystemType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A string that specifies the location of the file system created by Amazon
     * EFS. Its format is <code>efs-dns-name:/directory-path</code>. You can
     * find the DNS name of file system when you view it in the AWS EFS console.
     * The directory path is a path to a directory in the file system that
     * CodeBuild mounts. For example, if the DNS name of a file system is
     * <code>fs-abcd1234.efs.us-west-2.amazonaws.com</code>, and its mount
     * directory is <code>my-efs-mount-directory</code>, then the
     * <code>location</code> is
     * <code>fs-abcd1234.efs.us-west-2.amazonaws.com:/my-efs-mount-directory</code>
     * .
     * </p>
     * <p>
     * The directory path in the format
     * <code>efs-dns-name:/directory-path</code> is optional. If you do not
     * specify a directory path, the location is only the DNS name and CodeBuild
     * mounts the entire file system.
     * </p>
     *
     * @return <p>
     *         A string that specifies the location of the file system created
     *         by Amazon EFS. Its format is
     *         <code>efs-dns-name:/directory-path</code>. You can find the DNS
     *         name of file system when you view it in the AWS EFS console. The
     *         directory path is a path to a directory in the file system that
     *         CodeBuild mounts. For example, if the DNS name of a file system
     *         is <code>fs-abcd1234.efs.us-west-2.amazonaws.com</code>, and its
     *         mount directory is <code>my-efs-mount-directory</code>, then the
     *         <code>location</code> is
     *         <code>fs-abcd1234.efs.us-west-2.amazonaws.com:/my-efs-mount-directory</code>
     *         .
     *         </p>
     *         <p>
     *         The directory path in the format
     *         <code>efs-dns-name:/directory-path</code> is optional. If you do
     *         not specify a directory path, the location is only the DNS name
     *         and CodeBuild mounts the entire file system.
     *         </p>
     */
    public String getLocation() {
        return location;
    }

    /**
     * <p>
     * A string that specifies the location of the file system created by Amazon
     * EFS. Its format is <code>efs-dns-name:/directory-path</code>. You can
     * find the DNS name of file system when you view it in the AWS EFS console.
     * The directory path is a path to a directory in the file system that
     * CodeBuild mounts. For example, if the DNS name of a file system is
     * <code>fs-abcd1234.efs.us-west-2.amazonaws.com</code>, and its mount
     * directory is <code>my-efs-mount-directory</code>, then the
     * <code>location</code> is
     * <code>fs-abcd1234.efs.us-west-2.amazonaws.com:/my-efs-mount-directory</code>
     * .
     * </p>
     * <p>
     * The directory path in the format
     * <code>efs-dns-name:/directory-path</code> is optional. If you do not
     * specify a directory path, the location is only the DNS name and CodeBuild
     * mounts the entire file system.
     * </p>
     *
     * @param location <p>
     *            A string that specifies the location of the file system
     *            created by Amazon EFS. Its format is
     *            <code>efs-dns-name:/directory-path</code>. You can find the
     *            DNS name of file system when you view it in the AWS EFS
     *            console. The directory path is a path to a directory in the
     *            file system that CodeBuild mounts. For example, if the DNS
     *            name of a file system is
     *            <code>fs-abcd1234.efs.us-west-2.amazonaws.com</code>, and its
     *            mount directory is <code>my-efs-mount-directory</code>, then
     *            the <code>location</code> is
     *            <code>fs-abcd1234.efs.us-west-2.amazonaws.com:/my-efs-mount-directory</code>
     *            .
     *            </p>
     *            <p>
     *            The directory path in the format
     *            <code>efs-dns-name:/directory-path</code> is optional. If you
     *            do not specify a directory path, the location is only the DNS
     *            name and CodeBuild mounts the entire file system.
     *            </p>
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * A string that specifies the location of the file system created by Amazon
     * EFS. Its format is <code>efs-dns-name:/directory-path</code>. You can
     * find the DNS name of file system when you view it in the AWS EFS console.
     * The directory path is a path to a directory in the file system that
     * CodeBuild mounts. For example, if the DNS name of a file system is
     * <code>fs-abcd1234.efs.us-west-2.amazonaws.com</code>, and its mount
     * directory is <code>my-efs-mount-directory</code>, then the
     * <code>location</code> is
     * <code>fs-abcd1234.efs.us-west-2.amazonaws.com:/my-efs-mount-directory</code>
     * .
     * </p>
     * <p>
     * The directory path in the format
     * <code>efs-dns-name:/directory-path</code> is optional. If you do not
     * specify a directory path, the location is only the DNS name and CodeBuild
     * mounts the entire file system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param location <p>
     *            A string that specifies the location of the file system
     *            created by Amazon EFS. Its format is
     *            <code>efs-dns-name:/directory-path</code>. You can find the
     *            DNS name of file system when you view it in the AWS EFS
     *            console. The directory path is a path to a directory in the
     *            file system that CodeBuild mounts. For example, if the DNS
     *            name of a file system is
     *            <code>fs-abcd1234.efs.us-west-2.amazonaws.com</code>, and its
     *            mount directory is <code>my-efs-mount-directory</code>, then
     *            the <code>location</code> is
     *            <code>fs-abcd1234.efs.us-west-2.amazonaws.com:/my-efs-mount-directory</code>
     *            .
     *            </p>
     *            <p>
     *            The directory path in the format
     *            <code>efs-dns-name:/directory-path</code> is optional. If you
     *            do not specify a directory path, the location is only the DNS
     *            name and CodeBuild mounts the entire file system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectFileSystemLocation withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * <p>
     * The location in the container where you mount the file system.
     * </p>
     *
     * @return <p>
     *         The location in the container where you mount the file system.
     *         </p>
     */
    public String getMountPoint() {
        return mountPoint;
    }

    /**
     * <p>
     * The location in the container where you mount the file system.
     * </p>
     *
     * @param mountPoint <p>
     *            The location in the container where you mount the file system.
     *            </p>
     */
    public void setMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
    }

    /**
     * <p>
     * The location in the container where you mount the file system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mountPoint <p>
     *            The location in the container where you mount the file system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectFileSystemLocation withMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
        return this;
    }

    /**
     * <p>
     * The name used to access a file system created by Amazon EFS. CodeBuild
     * creates an environment variable by appending the <code>identifier</code>
     * in all capital letters to <code>CODEBUILD_</code>. For example, if you
     * specify <code>my-efs</code> for <code>identifier</code>, a new
     * environment variable is create named <code>CODEBUILD_MY-EFS</code>.
     * </p>
     * <p>
     * The <code>identifier</code> is used to mount your file system.
     * </p>
     *
     * @return <p>
     *         The name used to access a file system created by Amazon EFS.
     *         CodeBuild creates an environment variable by appending the
     *         <code>identifier</code> in all capital letters to
     *         <code>CODEBUILD_</code>. For example, if you specify
     *         <code>my-efs</code> for <code>identifier</code>, a new
     *         environment variable is create named
     *         <code>CODEBUILD_MY-EFS</code>.
     *         </p>
     *         <p>
     *         The <code>identifier</code> is used to mount your file system.
     *         </p>
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * <p>
     * The name used to access a file system created by Amazon EFS. CodeBuild
     * creates an environment variable by appending the <code>identifier</code>
     * in all capital letters to <code>CODEBUILD_</code>. For example, if you
     * specify <code>my-efs</code> for <code>identifier</code>, a new
     * environment variable is create named <code>CODEBUILD_MY-EFS</code>.
     * </p>
     * <p>
     * The <code>identifier</code> is used to mount your file system.
     * </p>
     *
     * @param identifier <p>
     *            The name used to access a file system created by Amazon EFS.
     *            CodeBuild creates an environment variable by appending the
     *            <code>identifier</code> in all capital letters to
     *            <code>CODEBUILD_</code>. For example, if you specify
     *            <code>my-efs</code> for <code>identifier</code>, a new
     *            environment variable is create named
     *            <code>CODEBUILD_MY-EFS</code>.
     *            </p>
     *            <p>
     *            The <code>identifier</code> is used to mount your file system.
     *            </p>
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The name used to access a file system created by Amazon EFS. CodeBuild
     * creates an environment variable by appending the <code>identifier</code>
     * in all capital letters to <code>CODEBUILD_</code>. For example, if you
     * specify <code>my-efs</code> for <code>identifier</code>, a new
     * environment variable is create named <code>CODEBUILD_MY-EFS</code>.
     * </p>
     * <p>
     * The <code>identifier</code> is used to mount your file system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identifier <p>
     *            The name used to access a file system created by Amazon EFS.
     *            CodeBuild creates an environment variable by appending the
     *            <code>identifier</code> in all capital letters to
     *            <code>CODEBUILD_</code>. For example, if you specify
     *            <code>my-efs</code> for <code>identifier</code>, a new
     *            environment variable is create named
     *            <code>CODEBUILD_MY-EFS</code>.
     *            </p>
     *            <p>
     *            The <code>identifier</code> is used to mount your file system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectFileSystemLocation withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * <p>
     * The mount options for a file system created by AWS EFS. The default mount
     * options used by CodeBuild are
     * <code>nfsvers=4.1,rsize=1048576,wsize=1048576,hard,timeo=600,retrans=2</code>
     * . For more information, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/mounting-fs-nfs-mount-settings.html"
     * >Recommended NFS Mount Options</a>.
     * </p>
     *
     * @return <p>
     *         The mount options for a file system created by AWS EFS. The
     *         default mount options used by CodeBuild are
     *         <code>nfsvers=4.1,rsize=1048576,wsize=1048576,hard,timeo=600,retrans=2</code>
     *         . For more information, see <a href=
     *         "https://docs.aws.amazon.com/efs/latest/ug/mounting-fs-nfs-mount-settings.html"
     *         >Recommended NFS Mount Options</a>.
     *         </p>
     */
    public String getMountOptions() {
        return mountOptions;
    }

    /**
     * <p>
     * The mount options for a file system created by AWS EFS. The default mount
     * options used by CodeBuild are
     * <code>nfsvers=4.1,rsize=1048576,wsize=1048576,hard,timeo=600,retrans=2</code>
     * . For more information, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/mounting-fs-nfs-mount-settings.html"
     * >Recommended NFS Mount Options</a>.
     * </p>
     *
     * @param mountOptions <p>
     *            The mount options for a file system created by AWS EFS. The
     *            default mount options used by CodeBuild are
     *            <code>nfsvers=4.1,rsize=1048576,wsize=1048576,hard,timeo=600,retrans=2</code>
     *            . For more information, see <a href=
     *            "https://docs.aws.amazon.com/efs/latest/ug/mounting-fs-nfs-mount-settings.html"
     *            >Recommended NFS Mount Options</a>.
     *            </p>
     */
    public void setMountOptions(String mountOptions) {
        this.mountOptions = mountOptions;
    }

    /**
     * <p>
     * The mount options for a file system created by AWS EFS. The default mount
     * options used by CodeBuild are
     * <code>nfsvers=4.1,rsize=1048576,wsize=1048576,hard,timeo=600,retrans=2</code>
     * . For more information, see <a href=
     * "https://docs.aws.amazon.com/efs/latest/ug/mounting-fs-nfs-mount-settings.html"
     * >Recommended NFS Mount Options</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mountOptions <p>
     *            The mount options for a file system created by AWS EFS. The
     *            default mount options used by CodeBuild are
     *            <code>nfsvers=4.1,rsize=1048576,wsize=1048576,hard,timeo=600,retrans=2</code>
     *            . For more information, see <a href=
     *            "https://docs.aws.amazon.com/efs/latest/ug/mounting-fs-nfs-mount-settings.html"
     *            >Recommended NFS Mount Options</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectFileSystemLocation withMountOptions(String mountOptions) {
        this.mountOptions = mountOptions;
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
        if (getMountPoint() != null)
            sb.append("mountPoint: " + getMountPoint() + ",");
        if (getIdentifier() != null)
            sb.append("identifier: " + getIdentifier() + ",");
        if (getMountOptions() != null)
            sb.append("mountOptions: " + getMountOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getMountPoint() == null) ? 0 : getMountPoint().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getMountOptions() == null) ? 0 : getMountOptions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectFileSystemLocation == false)
            return false;
        ProjectFileSystemLocation other = (ProjectFileSystemLocation) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getMountPoint() == null ^ this.getMountPoint() == null)
            return false;
        if (other.getMountPoint() != null
                && other.getMountPoint().equals(this.getMountPoint()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null
                && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getMountOptions() == null ^ this.getMountOptions() == null)
            return false;
        if (other.getMountOptions() != null
                && other.getMountOptions().equals(this.getMountOptions()) == false)
            return false;
        return true;
    }
}
