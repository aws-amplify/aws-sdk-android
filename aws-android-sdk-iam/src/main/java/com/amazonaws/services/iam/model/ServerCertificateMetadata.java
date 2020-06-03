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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about a server certificate without its certificate body,
 * certificate chain, and private key.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * <a>UploadServerCertificate</a> and <a>ListServerCertificates</a> operations.
 * </p>
 */
public class ServerCertificateMetadata implements Serializable {
    /**
     * <p>
     * The path to the server certificate. For more information about paths, see
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     */
    private String path;

    /**
     * <p>
     * The name that identifies the server certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String serverCertificateName;

    /**
     * <p>
     * The stable and unique string identifying the server certificate. For more
     * information about IDs, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     */
    private String serverCertificateId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the server certificate. For
     * more information about ARNs and how to use them in policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String arn;

    /**
     * <p>
     * The date when the server certificate was uploaded.
     * </p>
     */
    private java.util.Date uploadDate;

    /**
     * <p>
     * The date on which the certificate is set to expire.
     * </p>
     */
    private java.util.Date expiration;

    /**
     * <p>
     * The path to the server certificate. For more information about paths, see
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @return <p>
     *         The path to the server certificate. For more information about
     *         paths, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *         >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *         </p>
     */
    public String getPath() {
        return path;
    }

    /**
     * <p>
     * The path to the server certificate. For more information about paths, see
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param path <p>
     *            The path to the server certificate. For more information about
     *            paths, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the server certificate. For more information about paths, see
     * <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param path <p>
     *            The path to the server certificate. For more information about
     *            paths, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServerCertificateMetadata withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * <p>
     * The name that identifies the server certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The name that identifies the server certificate.
     *         </p>
     */
    public String getServerCertificateName() {
        return serverCertificateName;
    }

    /**
     * <p>
     * The name that identifies the server certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param serverCertificateName <p>
     *            The name that identifies the server certificate.
     *            </p>
     */
    public void setServerCertificateName(String serverCertificateName) {
        this.serverCertificateName = serverCertificateName;
    }

    /**
     * <p>
     * The name that identifies the server certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param serverCertificateName <p>
     *            The name that identifies the server certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServerCertificateMetadata withServerCertificateName(String serverCertificateName) {
        this.serverCertificateName = serverCertificateName;
        return this;
    }

    /**
     * <p>
     * The stable and unique string identifying the server certificate. For more
     * information about IDs, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @return <p>
     *         The stable and unique string identifying the server certificate.
     *         For more information about IDs, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *         >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *         </p>
     */
    public String getServerCertificateId() {
        return serverCertificateId;
    }

    /**
     * <p>
     * The stable and unique string identifying the server certificate. For more
     * information about IDs, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param serverCertificateId <p>
     *            The stable and unique string identifying the server
     *            certificate. For more information about IDs, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     */
    public void setServerCertificateId(String serverCertificateId) {
        this.serverCertificateId = serverCertificateId;
    }

    /**
     * <p>
     * The stable and unique string identifying the server certificate. For more
     * information about IDs, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param serverCertificateId <p>
     *            The stable and unique string identifying the server
     *            certificate. For more information about IDs, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServerCertificateMetadata withServerCertificateId(String serverCertificateId) {
        this.serverCertificateId = serverCertificateId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the server certificate. For
     * more information about ARNs and how to use them in policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) specifying the server certificate.
     *         For more information about ARNs and how to use them in policies,
     *         see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *         >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the server certificate. For
     * more information about ARNs and how to use them in policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) specifying the server
     *            certificate. For more information about ARNs and how to use
     *            them in policies, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the server certificate. For
     * more information about ARNs and how to use them in policies, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) specifying the server
     *            certificate. For more information about ARNs and how to use
     *            them in policies, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServerCertificateMetadata withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The date when the server certificate was uploaded.
     * </p>
     *
     * @return <p>
     *         The date when the server certificate was uploaded.
     *         </p>
     */
    public java.util.Date getUploadDate() {
        return uploadDate;
    }

    /**
     * <p>
     * The date when the server certificate was uploaded.
     * </p>
     *
     * @param uploadDate <p>
     *            The date when the server certificate was uploaded.
     *            </p>
     */
    public void setUploadDate(java.util.Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    /**
     * <p>
     * The date when the server certificate was uploaded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uploadDate <p>
     *            The date when the server certificate was uploaded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServerCertificateMetadata withUploadDate(java.util.Date uploadDate) {
        this.uploadDate = uploadDate;
        return this;
    }

    /**
     * <p>
     * The date on which the certificate is set to expire.
     * </p>
     *
     * @return <p>
     *         The date on which the certificate is set to expire.
     *         </p>
     */
    public java.util.Date getExpiration() {
        return expiration;
    }

    /**
     * <p>
     * The date on which the certificate is set to expire.
     * </p>
     *
     * @param expiration <p>
     *            The date on which the certificate is set to expire.
     *            </p>
     */
    public void setExpiration(java.util.Date expiration) {
        this.expiration = expiration;
    }

    /**
     * <p>
     * The date on which the certificate is set to expire.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expiration <p>
     *            The date on which the certificate is set to expire.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServerCertificateMetadata withExpiration(java.util.Date expiration) {
        this.expiration = expiration;
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
            sb.append("Path: " + getPath() + ",");
        if (getServerCertificateName() != null)
            sb.append("ServerCertificateName: " + getServerCertificateName() + ",");
        if (getServerCertificateId() != null)
            sb.append("ServerCertificateId: " + getServerCertificateId() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getUploadDate() != null)
            sb.append("UploadDate: " + getUploadDate() + ",");
        if (getExpiration() != null)
            sb.append("Expiration: " + getExpiration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime
                * hashCode
                + ((getServerCertificateName() == null) ? 0 : getServerCertificateName().hashCode());
        hashCode = prime * hashCode
                + ((getServerCertificateId() == null) ? 0 : getServerCertificateId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getUploadDate() == null) ? 0 : getUploadDate().hashCode());
        hashCode = prime * hashCode + ((getExpiration() == null) ? 0 : getExpiration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerCertificateMetadata == false)
            return false;
        ServerCertificateMetadata other = (ServerCertificateMetadata) obj;

        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getServerCertificateName() == null ^ this.getServerCertificateName() == null)
            return false;
        if (other.getServerCertificateName() != null
                && other.getServerCertificateName().equals(this.getServerCertificateName()) == false)
            return false;
        if (other.getServerCertificateId() == null ^ this.getServerCertificateId() == null)
            return false;
        if (other.getServerCertificateId() != null
                && other.getServerCertificateId().equals(this.getServerCertificateId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getUploadDate() == null ^ this.getUploadDate() == null)
            return false;
        if (other.getUploadDate() != null
                && other.getUploadDate().equals(this.getUploadDate()) == false)
            return false;
        if (other.getExpiration() == null ^ this.getExpiration() == null)
            return false;
        if (other.getExpiration() != null
                && other.getExpiration().equals(this.getExpiration()) == false)
            return false;
        return true;
    }
}
