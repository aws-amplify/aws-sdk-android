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

package com.amazonaws.services.appmesh.model;

import java.io.Serializable;

/**
 * <p>
 * An object that represents an access log file.
 * </p>
 */
public class FileAccessLog implements Serializable {
    /**
     * <p>
     * The file path to write access logs to. You can use
     * <code>/dev/stdout</code> to send access logs to standard out and
     * configure your Envoy container to use a log driver, such as
     * <code>awslogs</code>, to export the access logs to a log storage service
     * such as Amazon CloudWatch Logs. You can also specify a path in the Envoy
     * container's file system to write the files to disk.
     * </p>
     * <note>
     * <p>
     * The Envoy process must have write permissions to the path that you
     * specify here. Otherwise, Envoy fails to bootstrap properly.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String path;

    /**
     * <p>
     * The file path to write access logs to. You can use
     * <code>/dev/stdout</code> to send access logs to standard out and
     * configure your Envoy container to use a log driver, such as
     * <code>awslogs</code>, to export the access logs to a log storage service
     * such as Amazon CloudWatch Logs. You can also specify a path in the Envoy
     * container's file system to write the files to disk.
     * </p>
     * <note>
     * <p>
     * The Envoy process must have write permissions to the path that you
     * specify here. Otherwise, Envoy fails to bootstrap properly.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The file path to write access logs to. You can use
     *         <code>/dev/stdout</code> to send access logs to standard out and
     *         configure your Envoy container to use a log driver, such as
     *         <code>awslogs</code>, to export the access logs to a log storage
     *         service such as Amazon CloudWatch Logs. You can also specify a
     *         path in the Envoy container's file system to write the files to
     *         disk.
     *         </p>
     *         <note>
     *         <p>
     *         The Envoy process must have write permissions to the path that
     *         you specify here. Otherwise, Envoy fails to bootstrap properly.
     *         </p>
     *         </note>
     */
    public String getPath() {
        return path;
    }

    /**
     * <p>
     * The file path to write access logs to. You can use
     * <code>/dev/stdout</code> to send access logs to standard out and
     * configure your Envoy container to use a log driver, such as
     * <code>awslogs</code>, to export the access logs to a log storage service
     * such as Amazon CloudWatch Logs. You can also specify a path in the Envoy
     * container's file system to write the files to disk.
     * </p>
     * <note>
     * <p>
     * The Envoy process must have write permissions to the path that you
     * specify here. Otherwise, Envoy fails to bootstrap properly.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param path <p>
     *            The file path to write access logs to. You can use
     *            <code>/dev/stdout</code> to send access logs to standard out
     *            and configure your Envoy container to use a log driver, such
     *            as <code>awslogs</code>, to export the access logs to a log
     *            storage service such as Amazon CloudWatch Logs. You can also
     *            specify a path in the Envoy container's file system to write
     *            the files to disk.
     *            </p>
     *            <note>
     *            <p>
     *            The Envoy process must have write permissions to the path that
     *            you specify here. Otherwise, Envoy fails to bootstrap
     *            properly.
     *            </p>
     *            </note>
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The file path to write access logs to. You can use
     * <code>/dev/stdout</code> to send access logs to standard out and
     * configure your Envoy container to use a log driver, such as
     * <code>awslogs</code>, to export the access logs to a log storage service
     * such as Amazon CloudWatch Logs. You can also specify a path in the Envoy
     * container's file system to write the files to disk.
     * </p>
     * <note>
     * <p>
     * The Envoy process must have write permissions to the path that you
     * specify here. Otherwise, Envoy fails to bootstrap properly.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param path <p>
     *            The file path to write access logs to. You can use
     *            <code>/dev/stdout</code> to send access logs to standard out
     *            and configure your Envoy container to use a log driver, such
     *            as <code>awslogs</code>, to export the access logs to a log
     *            storage service such as Amazon CloudWatch Logs. You can also
     *            specify a path in the Envoy container's file system to write
     *            the files to disk.
     *            </p>
     *            <note>
     *            <p>
     *            The Envoy process must have write permissions to the path that
     *            you specify here. Otherwise, Envoy fails to bootstrap
     *            properly.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileAccessLog withPath(String path) {
        this.path = path;
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
        if (getPath() != null)
            sb.append("path: " + getPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileAccessLog == false)
            return false;
        FileAccessLog other = (FileAccessLog) obj;

        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        return true;
    }
}
