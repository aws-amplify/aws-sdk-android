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

package com.amazonaws.services.amazonelasticfilesystem.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns the description of a specific Amazon EFS file system if either the
 * file system <code>CreationToken</code> or the <code>FileSystemId</code> is
 * provided. Otherwise, it returns descriptions of all file systems owned by the
 * caller's AWS account in the AWS Region of the endpoint that you're calling.
 * </p>
 * <p>
 * When retrieving all file system descriptions, you can optionally specify the
 * <code>MaxItems</code> parameter to limit the number of descriptions in a
 * response. Currently, this number is automatically set to 10. If more file
 * system descriptions remain, Amazon EFS returns a <code>NextMarker</code>, an
 * opaque token, in the response. In this case, you should send a subsequent
 * request with the <code>Marker</code> request parameter set to the value of
 * <code>NextMarker</code>.
 * </p>
 * <p>
 * To retrieve a list of your file system descriptions, this operation is used
 * in an iterative process, where <code>DescribeFileSystems</code> is called
 * first without the <code>Marker</code> and then the operation continues to
 * call it with the <code>Marker</code> parameter set to the value of the
 * <code>NextMarker</code> from the previous response until the response has no
 * <code>NextMarker</code>.
 * </p>
 * <p>
 * The order of file systems returned in the response of one
 * <code>DescribeFileSystems</code> call and the order of file systems returned
 * across the responses of a multi-call iteration is unspecified.
 * </p>
 * <p>
 * This operation requires permissions for the
 * <code>elasticfilesystem:DescribeFileSystems</code> action.
 * </p>
 */
public class DescribeFileSystemsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * (Optional) Specifies the maximum number of file systems to return in the
     * response (integer). This number is automatically set to 100. The response
     * is paginated at 100 per page if you have more than 100 file systems.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer maxItems;

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous
     * <code>DescribeFileSystems</code> operation (String). If present,
     * specifies to continue the list from where the returning call had left
     * off.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * (Optional) Restricts the list to the file system with this creation token
     * (String). You specify a creation token when you create an Amazon EFS file
     * system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String creationToken;

    /**
     * <p>
     * (Optional) ID of the file system whose description you want to retrieve
     * (String).
     * </p>
     */
    private String fileSystemId;

    /**
     * <p>
     * (Optional) Specifies the maximum number of file systems to return in the
     * response (integer). This number is automatically set to 100. The response
     * is paginated at 100 per page if you have more than 100 file systems.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         (Optional) Specifies the maximum number of file systems to return
     *         in the response (integer). This number is automatically set to
     *         100. The response is paginated at 100 per page if you have more
     *         than 100 file systems.
     *         </p>
     */
    public Integer getMaxItems() {
        return maxItems;
    }

    /**
     * <p>
     * (Optional) Specifies the maximum number of file systems to return in the
     * response (integer). This number is automatically set to 100. The response
     * is paginated at 100 per page if you have more than 100 file systems.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxItems <p>
     *            (Optional) Specifies the maximum number of file systems to
     *            return in the response (integer). This number is automatically
     *            set to 100. The response is paginated at 100 per page if you
     *            have more than 100 file systems.
     *            </p>
     */
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * (Optional) Specifies the maximum number of file systems to return in the
     * response (integer). This number is automatically set to 100. The response
     * is paginated at 100 per page if you have more than 100 file systems.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxItems <p>
     *            (Optional) Specifies the maximum number of file systems to
     *            return in the response (integer). This number is automatically
     *            set to 100. The response is paginated at 100 per page if you
     *            have more than 100 file systems.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFileSystemsRequest withMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous
     * <code>DescribeFileSystems</code> operation (String). If present,
     * specifies to continue the list from where the returning call had left
     * off.
     * </p>
     *
     * @return <p>
     *         (Optional) Opaque pagination token returned from a previous
     *         <code>DescribeFileSystems</code> operation (String). If present,
     *         specifies to continue the list from where the returning call had
     *         left off.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous
     * <code>DescribeFileSystems</code> operation (String). If present,
     * specifies to continue the list from where the returning call had left
     * off.
     * </p>
     *
     * @param marker <p>
     *            (Optional) Opaque pagination token returned from a previous
     *            <code>DescribeFileSystems</code> operation (String). If
     *            present, specifies to continue the list from where the
     *            returning call had left off.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous
     * <code>DescribeFileSystems</code> operation (String). If present,
     * specifies to continue the list from where the returning call had left
     * off.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            (Optional) Opaque pagination token returned from a previous
     *            <code>DescribeFileSystems</code> operation (String). If
     *            present, specifies to continue the list from where the
     *            returning call had left off.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFileSystemsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * (Optional) Restricts the list to the file system with this creation token
     * (String). You specify a creation token when you create an Amazon EFS file
     * system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         (Optional) Restricts the list to the file system with this
     *         creation token (String). You specify a creation token when you
     *         create an Amazon EFS file system.
     *         </p>
     */
    public String getCreationToken() {
        return creationToken;
    }

    /**
     * <p>
     * (Optional) Restricts the list to the file system with this creation token
     * (String). You specify a creation token when you create an Amazon EFS file
     * system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param creationToken <p>
     *            (Optional) Restricts the list to the file system with this
     *            creation token (String). You specify a creation token when you
     *            create an Amazon EFS file system.
     *            </p>
     */
    public void setCreationToken(String creationToken) {
        this.creationToken = creationToken;
    }

    /**
     * <p>
     * (Optional) Restricts the list to the file system with this creation token
     * (String). You specify a creation token when you create an Amazon EFS file
     * system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param creationToken <p>
     *            (Optional) Restricts the list to the file system with this
     *            creation token (String). You specify a creation token when you
     *            create an Amazon EFS file system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFileSystemsRequest withCreationToken(String creationToken) {
        this.creationToken = creationToken;
        return this;
    }

    /**
     * <p>
     * (Optional) ID of the file system whose description you want to retrieve
     * (String).
     * </p>
     *
     * @return <p>
     *         (Optional) ID of the file system whose description you want to
     *         retrieve (String).
     *         </p>
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * <p>
     * (Optional) ID of the file system whose description you want to retrieve
     * (String).
     * </p>
     *
     * @param fileSystemId <p>
     *            (Optional) ID of the file system whose description you want to
     *            retrieve (String).
     *            </p>
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * (Optional) ID of the file system whose description you want to retrieve
     * (String).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileSystemId <p>
     *            (Optional) ID of the file system whose description you want to
     *            retrieve (String).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFileSystemsRequest withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
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
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getCreationToken() != null)
            sb.append("CreationToken: " + getCreationToken() + ",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: " + getFileSystemId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getCreationToken() == null) ? 0 : getCreationToken().hashCode());
        hashCode = prime * hashCode
                + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFileSystemsRequest == false)
            return false;
        DescribeFileSystemsRequest other = (DescribeFileSystemsRequest) obj;

        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getCreationToken() == null ^ this.getCreationToken() == null)
            return false;
        if (other.getCreationToken() != null
                && other.getCreationToken().equals(this.getCreationToken()) == false)
            return false;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null
                && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        return true;
    }
}
