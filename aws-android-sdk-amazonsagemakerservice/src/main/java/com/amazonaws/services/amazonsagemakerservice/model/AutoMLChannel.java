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
 * Similar to Channel. A channel is a named input source that training
 * algorithms can consume. Refer to Channel for detailed descriptions.
 * </p>
 */
public class AutoMLChannel implements Serializable {
    /**
     * <p>
     * The data source.
     * </p>
     */
    private AutoMLDataSource dataSource;

    /**
     * <p>
     * You can use Gzip or None. The default value is None.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Gzip
     */
    private String compressionType;

    /**
     * <p>
     * The name of the target variable in supervised learning, a.k.a. 'y'.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String targetAttributeName;

    /**
     * <p>
     * The data source.
     * </p>
     *
     * @return <p>
     *         The data source.
     *         </p>
     */
    public AutoMLDataSource getDataSource() {
        return dataSource;
    }

    /**
     * <p>
     * The data source.
     * </p>
     *
     * @param dataSource <p>
     *            The data source.
     *            </p>
     */
    public void setDataSource(AutoMLDataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSource <p>
     *            The data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLChannel withDataSource(AutoMLDataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    /**
     * <p>
     * You can use Gzip or None. The default value is None.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Gzip
     *
     * @return <p>
     *         You can use Gzip or None. The default value is None.
     *         </p>
     * @see CompressionType
     */
    public String getCompressionType() {
        return compressionType;
    }

    /**
     * <p>
     * You can use Gzip or None. The default value is None.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Gzip
     *
     * @param compressionType <p>
     *            You can use Gzip or None. The default value is None.
     *            </p>
     * @see CompressionType
     */
    public void setCompressionType(String compressionType) {
        this.compressionType = compressionType;
    }

    /**
     * <p>
     * You can use Gzip or None. The default value is None.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Gzip
     *
     * @param compressionType <p>
     *            You can use Gzip or None. The default value is None.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CompressionType
     */
    public AutoMLChannel withCompressionType(String compressionType) {
        this.compressionType = compressionType;
        return this;
    }

    /**
     * <p>
     * You can use Gzip or None. The default value is None.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Gzip
     *
     * @param compressionType <p>
     *            You can use Gzip or None. The default value is None.
     *            </p>
     * @see CompressionType
     */
    public void setCompressionType(CompressionType compressionType) {
        this.compressionType = compressionType.toString();
    }

    /**
     * <p>
     * You can use Gzip or None. The default value is None.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>None, Gzip
     *
     * @param compressionType <p>
     *            You can use Gzip or None. The default value is None.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CompressionType
     */
    public AutoMLChannel withCompressionType(CompressionType compressionType) {
        this.compressionType = compressionType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the target variable in supervised learning, a.k.a. 'y'.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The name of the target variable in supervised learning, a.k.a.
     *         'y'.
     *         </p>
     */
    public String getTargetAttributeName() {
        return targetAttributeName;
    }

    /**
     * <p>
     * The name of the target variable in supervised learning, a.k.a. 'y'.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param targetAttributeName <p>
     *            The name of the target variable in supervised learning, a.k.a.
     *            'y'.
     *            </p>
     */
    public void setTargetAttributeName(String targetAttributeName) {
        this.targetAttributeName = targetAttributeName;
    }

    /**
     * <p>
     * The name of the target variable in supervised learning, a.k.a. 'y'.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param targetAttributeName <p>
     *            The name of the target variable in supervised learning, a.k.a.
     *            'y'.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLChannel withTargetAttributeName(String targetAttributeName) {
        this.targetAttributeName = targetAttributeName;
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
        if (getDataSource() != null)
            sb.append("DataSource: " + getDataSource() + ",");
        if (getCompressionType() != null)
            sb.append("CompressionType: " + getCompressionType() + ",");
        if (getTargetAttributeName() != null)
            sb.append("TargetAttributeName: " + getTargetAttributeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode
                + ((getCompressionType() == null) ? 0 : getCompressionType().hashCode());
        hashCode = prime * hashCode
                + ((getTargetAttributeName() == null) ? 0 : getTargetAttributeName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLChannel == false)
            return false;
        AutoMLChannel other = (AutoMLChannel) obj;

        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null
                && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getCompressionType() == null ^ this.getCompressionType() == null)
            return false;
        if (other.getCompressionType() != null
                && other.getCompressionType().equals(this.getCompressionType()) == false)
            return false;
        if (other.getTargetAttributeName() == null ^ this.getTargetAttributeName() == null)
            return false;
        if (other.getTargetAttributeName() != null
                && other.getTargetAttributeName().equals(this.getTargetAttributeName()) == false)
            return false;
        return true;
    }
}
