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

/**
 * <p>
 * A list of files containing the environment variables to pass to a container.
 * You can specify up to ten environment files. The file must have a
 * <code>.env</code> file extension. Each line in an environment file should
 * contain an environment variable in <code>VARIABLE=VALUE</code> format. Lines
 * beginning with <code>#</code> are treated as comments and are ignored. For
 * more information on the environment variable file syntax, see <a
 * href="https://docs.docker.com/compose/env-file/">Declare default environment
 * variables in file</a>.
 * </p>
 * <p>
 * If there are environment variables specified using the
 * <code>environment</code> parameter in a container definition, they take
 * precedence over the variables contained within an environment file. If
 * multiple environment files are specified that contain the same variable, they
 * are processed from the top down. It is recommended to use unique variable
 * names. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/taskdef-envfiles.html"
 * >Specifying Environment Variables</a> in the <i>Amazon Elastic Container
 * Service Developer Guide</i>.
 * </p>
 * <p>
 * This field is not valid for containers in tasks using the Fargate launch
 * type.
 * </p>
 */
public class EnvironmentFile implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 object containing the
     * environment variable file.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The file type to use. The only supported value is <code>s3</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>s3
     */
    private String type;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 object containing the
     * environment variable file.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Amazon S3 object containing
     *         the environment variable file.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 object containing the
     * environment variable file.
     * </p>
     *
     * @param value <p>
     *            The Amazon Resource Name (ARN) of the Amazon S3 object
     *            containing the environment variable file.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 object containing the
     * environment variable file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The Amazon Resource Name (ARN) of the Amazon S3 object
     *            containing the environment variable file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnvironmentFile withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The file type to use. The only supported value is <code>s3</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>s3
     *
     * @return <p>
     *         The file type to use. The only supported value is <code>s3</code>
     *         .
     *         </p>
     * @see EnvironmentFileType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The file type to use. The only supported value is <code>s3</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>s3
     *
     * @param type <p>
     *            The file type to use. The only supported value is
     *            <code>s3</code>.
     *            </p>
     * @see EnvironmentFileType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The file type to use. The only supported value is <code>s3</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>s3
     *
     * @param type <p>
     *            The file type to use. The only supported value is
     *            <code>s3</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnvironmentFileType
     */
    public EnvironmentFile withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The file type to use. The only supported value is <code>s3</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>s3
     *
     * @param type <p>
     *            The file type to use. The only supported value is
     *            <code>s3</code>.
     *            </p>
     * @see EnvironmentFileType
     */
    public void setType(EnvironmentFileType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The file type to use. The only supported value is <code>s3</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>s3
     *
     * @param type <p>
     *            The file type to use. The only supported value is
     *            <code>s3</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnvironmentFileType
     */
    public EnvironmentFile withType(EnvironmentFileType type) {
        this.type = type.toString();
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
        if (getValue() != null)
            sb.append("value: " + getValue() + ",");
        if (getType() != null)
            sb.append("type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentFile == false)
            return false;
        EnvironmentFile other = (EnvironmentFile) obj;

        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
