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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the Amazon EBS features supported by the instance type.
 * </p>
 */
public class EbsInfo implements Serializable {
    /**
     * <p>
     * Indicates that the instance type is Amazon EBS-optimized. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html"
     * >Amazon EBS-Optimized Instances</a> in <i>Amazon EC2 User Guide for Linux
     * Instances</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unsupported, supported, default
     */
    private String ebsOptimizedSupport;

    /**
     * <p>
     * Indicates whether Amazon EBS encryption is supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unsupported, supported
     */
    private String encryptionSupport;

    /**
     * <p>
     * Indicates that the instance type is Amazon EBS-optimized. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html"
     * >Amazon EBS-Optimized Instances</a> in <i>Amazon EC2 User Guide for Linux
     * Instances</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unsupported, supported, default
     *
     * @return <p>
     *         Indicates that the instance type is Amazon EBS-optimized. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html"
     *         >Amazon EBS-Optimized Instances</a> in <i>Amazon EC2 User Guide
     *         for Linux Instances</i>.
     *         </p>
     * @see EbsOptimizedSupport
     */
    public String getEbsOptimizedSupport() {
        return ebsOptimizedSupport;
    }

    /**
     * <p>
     * Indicates that the instance type is Amazon EBS-optimized. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html"
     * >Amazon EBS-Optimized Instances</a> in <i>Amazon EC2 User Guide for Linux
     * Instances</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unsupported, supported, default
     *
     * @param ebsOptimizedSupport <p>
     *            Indicates that the instance type is Amazon EBS-optimized. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html"
     *            >Amazon EBS-Optimized Instances</a> in <i>Amazon EC2 User
     *            Guide for Linux Instances</i>.
     *            </p>
     * @see EbsOptimizedSupport
     */
    public void setEbsOptimizedSupport(String ebsOptimizedSupport) {
        this.ebsOptimizedSupport = ebsOptimizedSupport;
    }

    /**
     * <p>
     * Indicates that the instance type is Amazon EBS-optimized. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html"
     * >Amazon EBS-Optimized Instances</a> in <i>Amazon EC2 User Guide for Linux
     * Instances</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unsupported, supported, default
     *
     * @param ebsOptimizedSupport <p>
     *            Indicates that the instance type is Amazon EBS-optimized. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html"
     *            >Amazon EBS-Optimized Instances</a> in <i>Amazon EC2 User
     *            Guide for Linux Instances</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EbsOptimizedSupport
     */
    public EbsInfo withEbsOptimizedSupport(String ebsOptimizedSupport) {
        this.ebsOptimizedSupport = ebsOptimizedSupport;
        return this;
    }

    /**
     * <p>
     * Indicates that the instance type is Amazon EBS-optimized. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html"
     * >Amazon EBS-Optimized Instances</a> in <i>Amazon EC2 User Guide for Linux
     * Instances</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unsupported, supported, default
     *
     * @param ebsOptimizedSupport <p>
     *            Indicates that the instance type is Amazon EBS-optimized. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html"
     *            >Amazon EBS-Optimized Instances</a> in <i>Amazon EC2 User
     *            Guide for Linux Instances</i>.
     *            </p>
     * @see EbsOptimizedSupport
     */
    public void setEbsOptimizedSupport(EbsOptimizedSupport ebsOptimizedSupport) {
        this.ebsOptimizedSupport = ebsOptimizedSupport.toString();
    }

    /**
     * <p>
     * Indicates that the instance type is Amazon EBS-optimized. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html"
     * >Amazon EBS-Optimized Instances</a> in <i>Amazon EC2 User Guide for Linux
     * Instances</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unsupported, supported, default
     *
     * @param ebsOptimizedSupport <p>
     *            Indicates that the instance type is Amazon EBS-optimized. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html"
     *            >Amazon EBS-Optimized Instances</a> in <i>Amazon EC2 User
     *            Guide for Linux Instances</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EbsOptimizedSupport
     */
    public EbsInfo withEbsOptimizedSupport(EbsOptimizedSupport ebsOptimizedSupport) {
        this.ebsOptimizedSupport = ebsOptimizedSupport.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether Amazon EBS encryption is supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unsupported, supported
     *
     * @return <p>
     *         Indicates whether Amazon EBS encryption is supported.
     *         </p>
     * @see EbsEncryptionSupport
     */
    public String getEncryptionSupport() {
        return encryptionSupport;
    }

    /**
     * <p>
     * Indicates whether Amazon EBS encryption is supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unsupported, supported
     *
     * @param encryptionSupport <p>
     *            Indicates whether Amazon EBS encryption is supported.
     *            </p>
     * @see EbsEncryptionSupport
     */
    public void setEncryptionSupport(String encryptionSupport) {
        this.encryptionSupport = encryptionSupport;
    }

    /**
     * <p>
     * Indicates whether Amazon EBS encryption is supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unsupported, supported
     *
     * @param encryptionSupport <p>
     *            Indicates whether Amazon EBS encryption is supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EbsEncryptionSupport
     */
    public EbsInfo withEncryptionSupport(String encryptionSupport) {
        this.encryptionSupport = encryptionSupport;
        return this;
    }

    /**
     * <p>
     * Indicates whether Amazon EBS encryption is supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unsupported, supported
     *
     * @param encryptionSupport <p>
     *            Indicates whether Amazon EBS encryption is supported.
     *            </p>
     * @see EbsEncryptionSupport
     */
    public void setEncryptionSupport(EbsEncryptionSupport encryptionSupport) {
        this.encryptionSupport = encryptionSupport.toString();
    }

    /**
     * <p>
     * Indicates whether Amazon EBS encryption is supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>unsupported, supported
     *
     * @param encryptionSupport <p>
     *            Indicates whether Amazon EBS encryption is supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EbsEncryptionSupport
     */
    public EbsInfo withEncryptionSupport(EbsEncryptionSupport encryptionSupport) {
        this.encryptionSupport = encryptionSupport.toString();
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
        if (getEbsOptimizedSupport() != null)
            sb.append("EbsOptimizedSupport: " + getEbsOptimizedSupport() + ",");
        if (getEncryptionSupport() != null)
            sb.append("EncryptionSupport: " + getEncryptionSupport());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEbsOptimizedSupport() == null) ? 0 : getEbsOptimizedSupport().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionSupport() == null) ? 0 : getEncryptionSupport().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EbsInfo == false)
            return false;
        EbsInfo other = (EbsInfo) obj;

        if (other.getEbsOptimizedSupport() == null ^ this.getEbsOptimizedSupport() == null)
            return false;
        if (other.getEbsOptimizedSupport() != null
                && other.getEbsOptimizedSupport().equals(this.getEbsOptimizedSupport()) == false)
            return false;
        if (other.getEncryptionSupport() == null ^ this.getEncryptionSupport() == null)
            return false;
        if (other.getEncryptionSupport() != null
                && other.getEncryptionSupport().equals(this.getEncryptionSupport()) == false)
            return false;
        return true;
    }
}
