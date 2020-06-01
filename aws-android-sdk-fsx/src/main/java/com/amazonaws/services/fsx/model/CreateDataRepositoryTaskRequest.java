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

package com.amazonaws.services.fsx.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an Amazon FSx for Lustre data repository task. You use data
 * repository tasks to perform bulk operations between your Amazon FSx file
 * system and its linked data repository. An example of a data repository task
 * is exporting any data and metadata changes, including POSIX metadata, to
 * files, directories, and symbolic links (symlinks) from your FSx file system
 * to its linked data repository. A <code>CreateDataRepositoryTask</code>
 * operation will fail if a data repository is not linked to the FSx file
 * system. To learn more about data repository tasks, see <a href=
 * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/data-repository-tasks.html"
 * >Using Data Repository Tasks</a>. To learn more about linking a data
 * repository to your file system, see <a href=
 * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/export-data-repository.html#export-prefix"
 * >Setting the Export Prefix</a>.
 * </p>
 */
public class CreateDataRepositoryTaskRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Specifies the type of data repository task to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPORT_TO_REPOSITORY
     */
    private String type;

    /**
     * <p>
     * (Optional) The path or paths on the Amazon FSx file system to use when
     * the data repository task is processed. The default path is the file
     * system root directory. The paths you provide need to be relative to the
     * mount point of the file system. If the mount point is
     * <code>/mnt/fsx</code> and <code>/mnt/fsx/path1</code> is a directory or
     * file on the file system you want to export, then the path to provide is
     * <code>path1</code>. If a path that you provide isn't valid, the task
     * fails.
     * </p>
     */
    private java.util.List<String> paths;

    /**
     * <p>
     * The globally unique ID of the file system, assigned by Amazon FSx.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 21<br/>
     * <b>Pattern: </b>^(fs-[0-9a-f]{8,})$<br/>
     */
    private String fileSystemId;

    /**
     * <p>
     * Defines whether or not Amazon FSx provides a CompletionReport once the
     * task has completed. A CompletionReport provides a detailed report on the
     * files that Amazon FSx processed that meet the criteria specified by the
     * <code>Scope</code> parameter. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/task-completion-report.html"
     * >Working with Task Completion Reports</a>.
     * </p>
     */
    private CompletionReport report;

    /**
     * <p>
     * (Optional) An idempotency token for resource creation, in a string of up
     * to 64 ASCII characters. This token is automatically filled on your behalf
     * when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>[A-za-z0-9_.-]{0,63}$<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * A list of <code>Tag</code> values, with a maximum of 50 elements.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Specifies the type of data repository task to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPORT_TO_REPOSITORY
     *
     * @return <p>
     *         Specifies the type of data repository task to create.
     *         </p>
     * @see DataRepositoryTaskType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Specifies the type of data repository task to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPORT_TO_REPOSITORY
     *
     * @param type <p>
     *            Specifies the type of data repository task to create.
     *            </p>
     * @see DataRepositoryTaskType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies the type of data repository task to create.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPORT_TO_REPOSITORY
     *
     * @param type <p>
     *            Specifies the type of data repository task to create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataRepositoryTaskType
     */
    public CreateDataRepositoryTaskRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Specifies the type of data repository task to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPORT_TO_REPOSITORY
     *
     * @param type <p>
     *            Specifies the type of data repository task to create.
     *            </p>
     * @see DataRepositoryTaskType
     */
    public void setType(DataRepositoryTaskType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Specifies the type of data repository task to create.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPORT_TO_REPOSITORY
     *
     * @param type <p>
     *            Specifies the type of data repository task to create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataRepositoryTaskType
     */
    public CreateDataRepositoryTaskRequest withType(DataRepositoryTaskType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * (Optional) The path or paths on the Amazon FSx file system to use when
     * the data repository task is processed. The default path is the file
     * system root directory. The paths you provide need to be relative to the
     * mount point of the file system. If the mount point is
     * <code>/mnt/fsx</code> and <code>/mnt/fsx/path1</code> is a directory or
     * file on the file system you want to export, then the path to provide is
     * <code>path1</code>. If a path that you provide isn't valid, the task
     * fails.
     * </p>
     *
     * @return <p>
     *         (Optional) The path or paths on the Amazon FSx file system to use
     *         when the data repository task is processed. The default path is
     *         the file system root directory. The paths you provide need to be
     *         relative to the mount point of the file system. If the mount
     *         point is <code>/mnt/fsx</code> and <code>/mnt/fsx/path1</code> is
     *         a directory or file on the file system you want to export, then
     *         the path to provide is <code>path1</code>. If a path that you
     *         provide isn't valid, the task fails.
     *         </p>
     */
    public java.util.List<String> getPaths() {
        return paths;
    }

    /**
     * <p>
     * (Optional) The path or paths on the Amazon FSx file system to use when
     * the data repository task is processed. The default path is the file
     * system root directory. The paths you provide need to be relative to the
     * mount point of the file system. If the mount point is
     * <code>/mnt/fsx</code> and <code>/mnt/fsx/path1</code> is a directory or
     * file on the file system you want to export, then the path to provide is
     * <code>path1</code>. If a path that you provide isn't valid, the task
     * fails.
     * </p>
     *
     * @param paths <p>
     *            (Optional) The path or paths on the Amazon FSx file system to
     *            use when the data repository task is processed. The default
     *            path is the file system root directory. The paths you provide
     *            need to be relative to the mount point of the file system. If
     *            the mount point is <code>/mnt/fsx</code> and
     *            <code>/mnt/fsx/path1</code> is a directory or file on the file
     *            system you want to export, then the path to provide is
     *            <code>path1</code>. If a path that you provide isn't valid,
     *            the task fails.
     *            </p>
     */
    public void setPaths(java.util.Collection<String> paths) {
        if (paths == null) {
            this.paths = null;
            return;
        }

        this.paths = new java.util.ArrayList<String>(paths);
    }

    /**
     * <p>
     * (Optional) The path or paths on the Amazon FSx file system to use when
     * the data repository task is processed. The default path is the file
     * system root directory. The paths you provide need to be relative to the
     * mount point of the file system. If the mount point is
     * <code>/mnt/fsx</code> and <code>/mnt/fsx/path1</code> is a directory or
     * file on the file system you want to export, then the path to provide is
     * <code>path1</code>. If a path that you provide isn't valid, the task
     * fails.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param paths <p>
     *            (Optional) The path or paths on the Amazon FSx file system to
     *            use when the data repository task is processed. The default
     *            path is the file system root directory. The paths you provide
     *            need to be relative to the mount point of the file system. If
     *            the mount point is <code>/mnt/fsx</code> and
     *            <code>/mnt/fsx/path1</code> is a directory or file on the file
     *            system you want to export, then the path to provide is
     *            <code>path1</code>. If a path that you provide isn't valid,
     *            the task fails.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataRepositoryTaskRequest withPaths(String... paths) {
        if (getPaths() == null) {
            this.paths = new java.util.ArrayList<String>(paths.length);
        }
        for (String value : paths) {
            this.paths.add(value);
        }
        return this;
    }

    /**
     * <p>
     * (Optional) The path or paths on the Amazon FSx file system to use when
     * the data repository task is processed. The default path is the file
     * system root directory. The paths you provide need to be relative to the
     * mount point of the file system. If the mount point is
     * <code>/mnt/fsx</code> and <code>/mnt/fsx/path1</code> is a directory or
     * file on the file system you want to export, then the path to provide is
     * <code>path1</code>. If a path that you provide isn't valid, the task
     * fails.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param paths <p>
     *            (Optional) The path or paths on the Amazon FSx file system to
     *            use when the data repository task is processed. The default
     *            path is the file system root directory. The paths you provide
     *            need to be relative to the mount point of the file system. If
     *            the mount point is <code>/mnt/fsx</code> and
     *            <code>/mnt/fsx/path1</code> is a directory or file on the file
     *            system you want to export, then the path to provide is
     *            <code>path1</code>. If a path that you provide isn't valid,
     *            the task fails.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataRepositoryTaskRequest withPaths(java.util.Collection<String> paths) {
        setPaths(paths);
        return this;
    }

    /**
     * <p>
     * The globally unique ID of the file system, assigned by Amazon FSx.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 21<br/>
     * <b>Pattern: </b>^(fs-[0-9a-f]{8,})$<br/>
     *
     * @return <p>
     *         The globally unique ID of the file system, assigned by Amazon
     *         FSx.
     *         </p>
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * <p>
     * The globally unique ID of the file system, assigned by Amazon FSx.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 21<br/>
     * <b>Pattern: </b>^(fs-[0-9a-f]{8,})$<br/>
     *
     * @param fileSystemId <p>
     *            The globally unique ID of the file system, assigned by Amazon
     *            FSx.
     *            </p>
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The globally unique ID of the file system, assigned by Amazon FSx.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 21<br/>
     * <b>Pattern: </b>^(fs-[0-9a-f]{8,})$<br/>
     *
     * @param fileSystemId <p>
     *            The globally unique ID of the file system, assigned by Amazon
     *            FSx.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataRepositoryTaskRequest withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }

    /**
     * <p>
     * Defines whether or not Amazon FSx provides a CompletionReport once the
     * task has completed. A CompletionReport provides a detailed report on the
     * files that Amazon FSx processed that meet the criteria specified by the
     * <code>Scope</code> parameter. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/task-completion-report.html"
     * >Working with Task Completion Reports</a>.
     * </p>
     *
     * @return <p>
     *         Defines whether or not Amazon FSx provides a CompletionReport
     *         once the task has completed. A CompletionReport provides a
     *         detailed report on the files that Amazon FSx processed that meet
     *         the criteria specified by the <code>Scope</code> parameter. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/fsx/latest/LustreGuide/task-completion-report.html"
     *         >Working with Task Completion Reports</a>.
     *         </p>
     */
    public CompletionReport getReport() {
        return report;
    }

    /**
     * <p>
     * Defines whether or not Amazon FSx provides a CompletionReport once the
     * task has completed. A CompletionReport provides a detailed report on the
     * files that Amazon FSx processed that meet the criteria specified by the
     * <code>Scope</code> parameter. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/task-completion-report.html"
     * >Working with Task Completion Reports</a>.
     * </p>
     *
     * @param report <p>
     *            Defines whether or not Amazon FSx provides a CompletionReport
     *            once the task has completed. A CompletionReport provides a
     *            detailed report on the files that Amazon FSx processed that
     *            meet the criteria specified by the <code>Scope</code>
     *            parameter. For more information, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/LustreGuide/task-completion-report.html"
     *            >Working with Task Completion Reports</a>.
     *            </p>
     */
    public void setReport(CompletionReport report) {
        this.report = report;
    }

    /**
     * <p>
     * Defines whether or not Amazon FSx provides a CompletionReport once the
     * task has completed. A CompletionReport provides a detailed report on the
     * files that Amazon FSx processed that meet the criteria specified by the
     * <code>Scope</code> parameter. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/task-completion-report.html"
     * >Working with Task Completion Reports</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param report <p>
     *            Defines whether or not Amazon FSx provides a CompletionReport
     *            once the task has completed. A CompletionReport provides a
     *            detailed report on the files that Amazon FSx processed that
     *            meet the criteria specified by the <code>Scope</code>
     *            parameter. For more information, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/LustreGuide/task-completion-report.html"
     *            >Working with Task Completion Reports</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataRepositoryTaskRequest withReport(CompletionReport report) {
        this.report = report;
        return this;
    }

    /**
     * <p>
     * (Optional) An idempotency token for resource creation, in a string of up
     * to 64 ASCII characters. This token is automatically filled on your behalf
     * when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>[A-za-z0-9_.-]{0,63}$<br/>
     *
     * @return <p>
     *         (Optional) An idempotency token for resource creation, in a
     *         string of up to 64 ASCII characters. This token is automatically
     *         filled on your behalf when you use the AWS Command Line Interface
     *         (AWS CLI) or an AWS SDK.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * (Optional) An idempotency token for resource creation, in a string of up
     * to 64 ASCII characters. This token is automatically filled on your behalf
     * when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>[A-za-z0-9_.-]{0,63}$<br/>
     *
     * @param clientRequestToken <p>
     *            (Optional) An idempotency token for resource creation, in a
     *            string of up to 64 ASCII characters. This token is
     *            automatically filled on your behalf when you use the AWS
     *            Command Line Interface (AWS CLI) or an AWS SDK.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * (Optional) An idempotency token for resource creation, in a string of up
     * to 64 ASCII characters. This token is automatically filled on your behalf
     * when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>[A-za-z0-9_.-]{0,63}$<br/>
     *
     * @param clientRequestToken <p>
     *            (Optional) An idempotency token for resource creation, in a
     *            string of up to 64 ASCII characters. This token is
     *            automatically filled on your behalf when you use the AWS
     *            Command Line Interface (AWS CLI) or an AWS SDK.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataRepositoryTaskRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * A list of <code>Tag</code> values, with a maximum of 50 elements.
     * </p>
     *
     * @return <p>
     *         A list of <code>Tag</code> values, with a maximum of 50 elements.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of <code>Tag</code> values, with a maximum of 50 elements.
     * </p>
     *
     * @param tags <p>
     *            A list of <code>Tag</code> values, with a maximum of 50
     *            elements.
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
     * A list of <code>Tag</code> values, with a maximum of 50 elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of <code>Tag</code> values, with a maximum of 50
     *            elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataRepositoryTaskRequest withTags(Tag... tags) {
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
     * A list of <code>Tag</code> values, with a maximum of 50 elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of <code>Tag</code> values, with a maximum of 50
     *            elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataRepositoryTaskRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getPaths() != null)
            sb.append("Paths: " + getPaths() + ",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: " + getFileSystemId() + ",");
        if (getReport() != null)
            sb.append("Report: " + getReport() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getPaths() == null) ? 0 : getPaths().hashCode());
        hashCode = prime * hashCode
                + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getReport() == null) ? 0 : getReport().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDataRepositoryTaskRequest == false)
            return false;
        CreateDataRepositoryTaskRequest other = (CreateDataRepositoryTaskRequest) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getPaths() == null ^ this.getPaths() == null)
            return false;
        if (other.getPaths() != null && other.getPaths().equals(this.getPaths()) == false)
            return false;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null
                && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getReport() == null ^ this.getReport() == null)
            return false;
        if (other.getReport() != null && other.getReport().equals(this.getReport()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
