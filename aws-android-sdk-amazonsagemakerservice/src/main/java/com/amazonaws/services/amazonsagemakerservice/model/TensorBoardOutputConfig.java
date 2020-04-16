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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Configuration of storage locations for TensorBoard output.
 * </p>
 */
public class TensorBoardOutputConfig implements Serializable {
    /**
     * <p>
     * Path to local storage location for tensorBoard output. Defaults to
     * <code>/opt/ml/output/tensorboard</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String localPath;

    /**
     * <p>
     * Path to Amazon S3 storage location for TensorBoard output.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     */
    private String s3OutputPath;

    /**
     * <p>
     * Path to local storage location for tensorBoard output. Defaults to
     * <code>/opt/ml/output/tensorboard</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         Path to local storage location for tensorBoard output. Defaults
     *         to <code>/opt/ml/output/tensorboard</code>.
     *         </p>
     */
    public String getLocalPath() {
        return localPath;
    }

    /**
     * <p>
     * Path to local storage location for tensorBoard output. Defaults to
     * <code>/opt/ml/output/tensorboard</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param localPath <p>
     *            Path to local storage location for tensorBoard output.
     *            Defaults to <code>/opt/ml/output/tensorboard</code>.
     *            </p>
     */
    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    /**
     * <p>
     * Path to local storage location for tensorBoard output. Defaults to
     * <code>/opt/ml/output/tensorboard</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param localPath <p>
     *            Path to local storage location for tensorBoard output.
     *            Defaults to <code>/opt/ml/output/tensorboard</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TensorBoardOutputConfig withLocalPath(String localPath) {
        this.localPath = localPath;
        return this;
    }

    /**
     * <p>
     * Path to Amazon S3 storage location for TensorBoard output.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @return <p>
     *         Path to Amazon S3 storage location for TensorBoard output.
     *         </p>
     */
    public String getS3OutputPath() {
        return s3OutputPath;
    }

    /**
     * <p>
     * Path to Amazon S3 storage location for TensorBoard output.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param s3OutputPath <p>
     *            Path to Amazon S3 storage location for TensorBoard output.
     *            </p>
     */
    public void setS3OutputPath(String s3OutputPath) {
        this.s3OutputPath = s3OutputPath;
    }

    /**
     * <p>
     * Path to Amazon S3 storage location for TensorBoard output.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param s3OutputPath <p>
     *            Path to Amazon S3 storage location for TensorBoard output.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TensorBoardOutputConfig withS3OutputPath(String s3OutputPath) {
        this.s3OutputPath = s3OutputPath;
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
        if (getLocalPath() != null)
            sb.append("LocalPath: " + getLocalPath() + ",");
        if (getS3OutputPath() != null)
            sb.append("S3OutputPath: " + getS3OutputPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocalPath() == null) ? 0 : getLocalPath().hashCode());
        hashCode = prime * hashCode
                + ((getS3OutputPath() == null) ? 0 : getS3OutputPath().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TensorBoardOutputConfig == false)
            return false;
        TensorBoardOutputConfig other = (TensorBoardOutputConfig) obj;

        if (other.getLocalPath() == null ^ this.getLocalPath() == null)
            return false;
        if (other.getLocalPath() != null
                && other.getLocalPath().equals(this.getLocalPath()) == false)
            return false;
        if (other.getS3OutputPath() == null ^ this.getS3OutputPath() == null)
            return false;
        if (other.getS3OutputPath() != null
                && other.getS3OutputPath().equals(this.getS3OutputPath()) == false)
            return false;
        return true;
    }
}
