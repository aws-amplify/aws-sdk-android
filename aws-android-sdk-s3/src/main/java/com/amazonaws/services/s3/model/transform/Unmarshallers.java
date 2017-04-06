/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.internal.DeleteObjectsResponse;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.BucketAccelerateConfiguration;
import com.amazonaws.services.s3.model.BucketCrossOriginConfiguration;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration;
import com.amazonaws.services.s3.model.BucketLoggingConfiguration;
import com.amazonaws.services.s3.model.BucketReplicationConfiguration;
import com.amazonaws.services.s3.model.BucketTaggingConfiguration;
import com.amazonaws.services.s3.model.BucketVersioningConfiguration;
import com.amazonaws.services.s3.model.BucketWebsiteConfiguration;
import com.amazonaws.services.s3.model.DeleteBucketAnalyticsConfigurationResult;
import com.amazonaws.services.s3.model.DeleteBucketInventoryConfigurationResult;
import com.amazonaws.services.s3.model.DeleteBucketMetricsConfigurationResult;
import com.amazonaws.services.s3.model.DeleteObjectTaggingResult;
import com.amazonaws.services.s3.model.GetBucketAnalyticsConfigurationResult;
import com.amazonaws.services.s3.model.GetBucketInventoryConfigurationResult;
import com.amazonaws.services.s3.model.GetBucketMetricsConfigurationResult;
import com.amazonaws.services.s3.model.GetObjectTaggingResult;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.ListBucketAnalyticsConfigurationsResult;
import com.amazonaws.services.s3.model.ListBucketInventoryConfigurationsResult;
import com.amazonaws.services.s3.model.ListBucketMetricsConfigurationsResult;
import com.amazonaws.services.s3.model.ListObjectsV2Result;
import com.amazonaws.services.s3.model.MultipartUploadListing;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.Owner;
import com.amazonaws.services.s3.model.PartListing;
import com.amazonaws.services.s3.model.RequestPaymentConfiguration;
import com.amazonaws.services.s3.model.SetBucketAnalyticsConfigurationResult;
import com.amazonaws.services.s3.model.SetBucketInventoryConfigurationResult;
import com.amazonaws.services.s3.model.SetBucketMetricsConfigurationResult;
import com.amazonaws.services.s3.model.SetObjectTaggingResult;
import com.amazonaws.services.s3.model.VersionListing;
import com.amazonaws.services.s3.model.transform.XmlResponsesSaxParser.CompleteMultipartUploadHandler;
import com.amazonaws.services.s3.model.transform.XmlResponsesSaxParser.CopyObjectResultHandler;
import com.amazonaws.transform.Unmarshaller;

import java.io.InputStream;
import java.util.List;

/**
 * Collection of unmarshallers for S3 XML responses.
 */
public class Unmarshallers {

    /**
     * Unmarshaller for the ListBuckets XML response.
     */
    public static final class ListBucketsUnmarshaller implements
            Unmarshaller<List<Bucket>, InputStream> {
        @Override
        public List<Bucket> unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser()
                    .parseListMyBucketsResponse(in).getBuckets();
        }
    }

    /**
     * Unmarshaller for the ListBuckets XML response, parsing out the owner even
     * if the list is empty.
     */
    public static final class ListBucketsOwnerUnmarshaller implements
            Unmarshaller<Owner, InputStream> {
        @Override
        public Owner unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser()
                    .parseListMyBucketsResponse(in).getOwner();
        }
    }

    /**
     * Unmarshaller for the ListObjects XML response.
     */
    public static final class ListObjectsUnmarshaller implements
            Unmarshaller<ObjectListing, InputStream> {

        private final boolean shouldSDKDecodeResponse;

        public ListObjectsUnmarshaller(final boolean shouldSDKDecodeResponse) {
            this.shouldSDKDecodeResponse = shouldSDKDecodeResponse;
        }

        @Override
        public ObjectListing unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser()
                    .parseListBucketObjectsResponse(in,
                            shouldSDKDecodeResponse)
                    .getObjectListing();
        }
    }

    /**
     * Unmarshaller for the ListObjectsV2 XML response.
     */
    public static final class ListObjectsV2Unmarshaller implements
            Unmarshaller<ListObjectsV2Result, InputStream> {

        private final boolean shouldSDKDecodeResponse;

        public ListObjectsV2Unmarshaller(final boolean shouldSDKDecodeResponse) {
            this.shouldSDKDecodeResponse = shouldSDKDecodeResponse;
        }

        @Override
        public ListObjectsV2Result unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser()
                    .parseListObjectsV2Response(in, shouldSDKDecodeResponse).getResult();
        }
    }

    /**
     * Unmarshaller for the ListVersions XML response.
     */
    public static final class VersionListUnmarshaller implements
            Unmarshaller<VersionListing, InputStream> {

        private final boolean shouldSDKDecodeResponse;

        public VersionListUnmarshaller(final boolean shouldSDKDecodeResponse) {
            this.shouldSDKDecodeResponse = shouldSDKDecodeResponse;
        }

        @Override
        public VersionListing unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser()
                    .parseListVersionsResponse(in, shouldSDKDecodeResponse).getListing();
        }
    }

    /**
     * Unmarshaller for the AccessControlList XML response.
     */
    public static final class AccessControlListUnmarshaller implements
            Unmarshaller<AccessControlList, InputStream> {
        @Override
        public AccessControlList unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser()
                    .parseAccessControlListResponse(in).getAccessControlList();
        }
    }

    /**
     * Unmarshaller for the BucketLoggingStatus XML response.
     */
    public static final class BucketLoggingConfigurationnmarshaller implements
            Unmarshaller<BucketLoggingConfiguration, InputStream> {
        @Override
        public BucketLoggingConfiguration unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser()
                    .parseLoggingStatusResponse(in).getBucketLoggingConfiguration();
        }
    }

    /**
     * Unmarshaller for the BucketLocation XML response.
     */
    public static final class BucketLocationUnmarshaller implements
            Unmarshaller<String, InputStream> {
        @Override
        public String unmarshall(InputStream in) throws Exception {
            String location = new XmlResponsesSaxParser()
                    .parseBucketLocationResponse(in);

            /*
             * S3 treats the US location differently, and assumes that if the
             * reported location is null, then it's a US bucket.
             */
            if (location == null) {
                location = "US";
            }

            return location;
        }
    }

    /**
     * Unmarshaller for the BucketVersionConfiguration XML response.
     */
    public static final class BucketVersioningConfigurationUnmarshaller implements
            Unmarshaller<BucketVersioningConfiguration, InputStream> {
        @Override
        public BucketVersioningConfiguration unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser()
                    .parseVersioningConfigurationResponse(in).getConfiguration();
        }
    }

    /**
     * Unmarshaller for the BucketWebsiteConfiguration XML response.
     */
    public static final class BucketWebsiteConfigurationUnmarshaller implements
            Unmarshaller<BucketWebsiteConfiguration, InputStream> {
        @Override
        public BucketWebsiteConfiguration unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser()
                    .parseWebsiteConfigurationResponse(in).getConfiguration();
        }
    }

    /**
     * Unmarshaller for the BucketNotificationConfiguration XML response.
     */
    public static final class BucketReplicationConfigurationUnmarshaller implements
            Unmarshaller<BucketReplicationConfiguration, InputStream> {
        @Override
        public BucketReplicationConfiguration unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser()
                    .parseReplicationConfigurationResponse(in).getConfiguration();
        }
    }

    /**
     * Unmarshaller for the BucketTaggingConfiguration XML response.
     */
    public static final class BucketTaggingConfigurationUnmarshaller implements
            Unmarshaller<BucketTaggingConfiguration, InputStream> {
        @Override
        public BucketTaggingConfiguration unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser()
                    .parseTaggingConfigurationResponse(in).getConfiguration();
        }
    }

    /**
     * Unmarshaller for the BucketAccelerateConfiguration XML response.
     */
    public static final class BucketAccelerateConfigurationUnmarshaller implements
            Unmarshaller<BucketAccelerateConfiguration, InputStream> {
        @Override
        public BucketAccelerateConfiguration unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser()
                    .parseAccelerateConfigurationResponse(in).getConfiguration();
        }
    }

    /**
     * Unmarshaller for the a direct InputStream response.
     */
    public static final class InputStreamUnmarshaller implements
            Unmarshaller<InputStream, InputStream> {
        @Override
        public InputStream unmarshall(InputStream in) throws Exception {
            return in;
        }
    }

    /**
     * Unmarshaller for the CopyObject XML response.
     */
    public static final class CopyObjectUnmarshaller implements
            Unmarshaller<CopyObjectResultHandler, InputStream> {
        @Override
        public CopyObjectResultHandler unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser()
                    .parseCopyObjectResponse(in);
        }
    }

    public static final class CompleteMultipartUploadResultUnmarshaller implements
            Unmarshaller<CompleteMultipartUploadHandler, InputStream> {
        @Override
        public CompleteMultipartUploadHandler unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser().parseCompleteMultipartUploadResponse(in);
        }
    }

    public static final class InitiateMultipartUploadResultUnmarshaller implements
            Unmarshaller<InitiateMultipartUploadResult, InputStream> {
        @Override
        public InitiateMultipartUploadResult unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser().parseInitiateMultipartUploadResponse(in)
                    .getInitiateMultipartUploadResult();
        }
    }

    public static final class ListMultipartUploadsResultUnmarshaller implements
            Unmarshaller<MultipartUploadListing, InputStream> {
        @Override
        public MultipartUploadListing unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser().parseListMultipartUploadsResponse(in)
                    .getListMultipartUploadsResult();
        }
    }

    public static final class ListPartsResultUnmarshaller implements
            Unmarshaller<PartListing, InputStream> {
        @Override
        public PartListing unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser().parseListPartsResponse(in)
                    .getListPartsResult();
        }
    }

    public static final class DeleteObjectsResultUnmarshaller implements
            Unmarshaller<DeleteObjectsResponse, InputStream> {

        @Override
        public DeleteObjectsResponse unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser().parseDeletedObjectsResult(in)
                    .getDeleteObjectResult();
        }
    }

    public static final class BucketLifecycleConfigurationUnmarshaller implements
            Unmarshaller<BucketLifecycleConfiguration, InputStream> {

        @Override
        public BucketLifecycleConfiguration unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser().parseBucketLifecycleConfigurationResponse(in)
                    .getConfiguration();
        }
    }

    public static final class BucketCrossOriginConfigurationUnmarshaller implements
            Unmarshaller<BucketCrossOriginConfiguration, InputStream> {
        @Override
        public BucketCrossOriginConfiguration unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser().parseBucketCrossOriginConfigurationResponse(in)
                    .getConfiguration();
        }
    }

    /**
     * Unmarshaller for the RequestPaymentConfiguration XML response.
     */
    public static final class RequestPaymentConfigurationUnmarshaller implements
            Unmarshaller<RequestPaymentConfiguration, InputStream> {
        @Override
        public RequestPaymentConfiguration unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser()
                    .parseRequestPaymentConfigurationResponse(in).getConfiguration();
        }
    }

    public static final class GetObjectTaggingResponseUnmarshaller
            implements Unmarshaller<GetObjectTaggingResult, InputStream> {

        @Override
        public GetObjectTaggingResult unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser().parseObjectTaggingResponse(in).getResult();
        }
    }

    public static final class SetObjectTaggingResponseUnmarshaller
            implements Unmarshaller<SetObjectTaggingResult, InputStream> {

        @Override
        public SetObjectTaggingResult unmarshall(InputStream in) throws Exception {
            return new SetObjectTaggingResult();
        }
    }

    public static final class DeleteObjectTaggingResponseUnmarshaller
            implements Unmarshaller<DeleteObjectTaggingResult, InputStream> {

        @Override
        public DeleteObjectTaggingResult unmarshall(InputStream in) throws Exception {
            return new DeleteObjectTaggingResult();
        }
    }

    /**
     * Unmarshaller for the GetBucketAnalyticsConfiguration XML response.
     */
    public static final class GetBucketAnalyticsConfigurationUnmarshaller implements
            Unmarshaller<GetBucketAnalyticsConfigurationResult, InputStream> {
        @Override
        public GetBucketAnalyticsConfigurationResult unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser().parseGetBucketAnalyticsConfigurationResponse(in)
                    .getResult();
        }
    }

    /**
     * Unmarshaller for the ListBucketAnalyticsConfigurations XML response.
     */
    public static final class ListBucketAnalyticsConfigurationUnmarshaller implements
            Unmarshaller<ListBucketAnalyticsConfigurationsResult, InputStream> {
        @Override
        public ListBucketAnalyticsConfigurationsResult unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser().parseListBucketAnalyticsConfigurationResponse(in)
                    .getResult();
        }
    }

    /**
     * Unmarshaller for the DeleteBucketAnalyticsConfiguration XML response.
     */
    public static final class DeleteBucketAnalyticsConfigurationUnmarshaller implements
            Unmarshaller<DeleteBucketAnalyticsConfigurationResult, InputStream> {
        @Override
        public DeleteBucketAnalyticsConfigurationResult unmarshall(InputStream in)
                throws Exception {
            return new DeleteBucketAnalyticsConfigurationResult();
        }
    }

    /**
     * Unmarshaller for the SetBucketAnalyticsConfiguration XML response.
     */
    public static final class SetBucketAnalyticsConfigurationUnmarshaller implements
            Unmarshaller<SetBucketAnalyticsConfigurationResult, InputStream> {
        @Override
        public SetBucketAnalyticsConfigurationResult unmarshall(InputStream in) throws Exception {
            return new SetBucketAnalyticsConfigurationResult();
        }
    }

    /**
     * Unmarshaller for the GetBucketMetricsConfiguration XML response.
     */
    public static final class GetBucketMetricsConfigurationUnmarshaller implements
            Unmarshaller<GetBucketMetricsConfigurationResult, InputStream> {
        @Override
        public GetBucketMetricsConfigurationResult unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser().parseGetBucketMetricsConfigurationResponse(in)
                    .getResult();
        }
    }

    /**
     * Unmarshaller for the ListBucketMetricsConfigurations XML response.
     */
    public static final class ListBucketMetricsConfigurationsUnmarshaller implements
            Unmarshaller<ListBucketMetricsConfigurationsResult, InputStream> {
        @Override
        public ListBucketMetricsConfigurationsResult unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser().parseListBucketMetricsConfigurationsResponse(in)
                    .getResult();
        }
    }

    /**
     * Unmarshaller for the DeleteBucketMetricsConfiguration XML response.
     */
    public static final class DeleteBucketMetricsConfigurationUnmarshaller implements
            Unmarshaller<DeleteBucketMetricsConfigurationResult, InputStream> {
        @Override
        public DeleteBucketMetricsConfigurationResult unmarshall(InputStream in) throws Exception {
            return new DeleteBucketMetricsConfigurationResult();
        }
    }

    /**
     * Unmarshaller for the SetBucketMetricsConfiguration XML response.
     */
    public static final class SetBucketMetricsConfigurationUnmarshaller implements
            Unmarshaller<SetBucketMetricsConfigurationResult, InputStream> {
        @Override
        public SetBucketMetricsConfigurationResult unmarshall(InputStream in) throws Exception {
            return new SetBucketMetricsConfigurationResult();
        }
    }

    /**
     * Unmarshaller for the GetBucketInventoryConfiguration XML response.
     */
    public static final class GetBucketInventoryConfigurationUnmarshaller implements
            Unmarshaller<GetBucketInventoryConfigurationResult, InputStream> {

        @Override
        public GetBucketInventoryConfigurationResult unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser().parseGetBucketInventoryConfigurationResponse(in)
                    .getResult();
        }
    }

    /**
     * Unmarshaller for the ListBucketInventoryConfigurations XML response.
     */
    public static final class ListBucketInventoryConfigurationsUnmarshaller implements
            Unmarshaller<ListBucketInventoryConfigurationsResult, InputStream> {

        @Override
        public ListBucketInventoryConfigurationsResult unmarshall(InputStream in) throws Exception {
            return new XmlResponsesSaxParser().parseBucketListInventoryConfigurationsResponse(in)
                    .getResult();
        }
    }

    /**
     * Unmarshaller for the DeleteBucketInventoryConfiguration XML response.
     */
    public static final class DeleteBucketInventoryConfigurationUnmarshaller implements
            Unmarshaller<DeleteBucketInventoryConfigurationResult, InputStream> {

        @Override
        public DeleteBucketInventoryConfigurationResult unmarshall(InputStream in)
                throws Exception {
            return new DeleteBucketInventoryConfigurationResult();
        }
    }

    /**
     * Unmarshaller for the SetBucketInventoryConfiguration XML response.
     */
    public static final class SetBucketInventoryConfigurationUnmarshaller implements
            Unmarshaller<SetBucketInventoryConfigurationResult, InputStream> {

        @Override
        public SetBucketInventoryConfigurationResult unmarshall(InputStream in) throws Exception {
            return new SetBucketInventoryConfigurationResult();
        }
    }
}