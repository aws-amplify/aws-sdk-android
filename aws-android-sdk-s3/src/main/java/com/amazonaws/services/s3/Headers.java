/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3;

/**
 * Common S3 HTTP header values used throughout the AWS S3 Java client.
 */
public interface Headers {

    /*
     * Standard HTTP Headers
     */

    /** Cache control header */
    public static final String CACHE_CONTROL = "Cache-Control";

    /** Content disposition header */
    public static final String CONTENT_DISPOSITION = "Content-Disposition";

    /** Content encoding header */
    public static final String CONTENT_ENCODING = "Content-Encoding";

    /** Content length header */
    public static final String CONTENT_LENGTH = "Content-Length";

    /** Content range header */
    public static final String CONTENT_RANGE = "Content-Range";

    /** Content MD5 header */
    public static final String CONTENT_MD5 = "Content-MD5";

    /** Content type header */
    public static final String CONTENT_TYPE = "Content-Type";

    /** Content language header */
    public static final String CONTENT_LANGUAGE = "Content-Language";

    /** Date header */
    public static final String DATE = "Date";

    /** Etag header */
    public static final String ETAG = "ETag";

    /** Last modified header */
    public static final String LAST_MODIFIED = "Last-Modified";

    /** Server header */
    public static final String SERVER = "Server";

    /** Connection header */
    public static final String CONNECTION = "Connection";

    /*
     * Amazon HTTP Headers
     */

    /** Prefix for general Amazon headers: x-amz- */
    public static final String AMAZON_PREFIX = "x-amz-";

    /** S3's canned ACL header: x-amz-acl */
    public static final String S3_CANNED_ACL = "x-amz-acl";

    /** Amazon's alternative date header: x-amz-date */
    public static final String S3_ALTERNATE_DATE = "x-amz-date";

    /** Prefix for S3 user metadata: x-amz-meta- */
    public static final String S3_USER_METADATA_PREFIX = "x-amz-meta-";

    /** S3's version ID header */
    public static final String S3_VERSION_ID = "x-amz-version-id";

    /** S3's Multi-Factor Authentication header */
    public static final String S3_MFA = "x-amz-mfa";

    /** S3 response header for a request's AWS request ID */
    public static final String REQUEST_ID = "x-amz-request-id";

    /** S3 response header for a request's extended debugging ID */
    public static final String EXTENDED_REQUEST_ID = "x-amz-id-2";

    /** S3 response header in response from accelerate endpoint. */
    public static final String CLOUD_FRONT_ID = "X-Amz-Cf-Id";

    /**
     * S3 request header indicating how to handle metadata when copying an
     * object
     */
    public static final String METADATA_DIRECTIVE = "x-amz-metadata-directive";

    /** DevPay token header */
    public static final String SECURITY_TOKEN = "x-amz-security-token";

    /** Header describing what class of storage a user wants */
    public static final String STORAGE_CLASS = "x-amz-storage-class";

    /** Header for optional server-side encryption algorithm */
    public static final String SERVER_SIDE_ENCRYPTION = "x-amz-server-side-encryption";

    /**
     * Header for optional server-side KMS Key Id to use in conjunction with
     * SERVER_SIDE_ENCRYPTION
     */
    public static final String SERVER_SIDE_ENCRYPTION_KMS_KEY_ID = "x-amz-server-side-encryption-aws-kms-key-id";

    /**
     * Header for the encryption algorithm used when encrypting the object with
     * customer-provided keys
     */
    public static final String SERVER_SIDE_ENCRYPTION_CUSTOMER_ALGORITHM = "x-amz-server-side-encryption-customer-algorithm";

    /** Header for the customer-provided key for server-side encryption */
    public static final String SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY = "x-amz-server-side-encryption-customer-key";

    /**
     * Header for the MD5 digest of the customer-provided key for server-side
     * encryption
     */
    public static final String SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY_MD5 = "x-amz-server-side-encryption-customer-key-MD5";

    /**
     * Header for the encryption algorithm used when encrypting the object with
     * customer-provided keys
     */
    public static final String COPY_SOURCE_SERVER_SIDE_ENCRYPTION_CUSTOMER_ALGORITHM = "x-amz-copy-source-server-side-encryption-customer-algorithm";

    /** Header for the customer-provided key for server-side encryption */
    public static final String COPY_SOURCE_SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY = "x-amz-copy-source-server-side-encryption-customer-key";

    /**
     * Header for the MD5 digest of the customer-provided key for server-side
     * encryption
     */
    public static final String COPY_SOURCE_SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY_MD5 = "x-amz-copy-source-server-side-encryption-customer-key-MD5";

    /** Header for optional object expiration */
    public static final String EXPIRATION = "x-amz-expiration";

    /** Header for optional object expiration */
    public static final String EXPIRES = "Expires";

    /** ETag matching constraint header for the copy object request */
    public static final String COPY_SOURCE_IF_MATCH = "x-amz-copy-source-if-match";

    /** ETag non-matching constraint header for the copy object request */
    public static final String COPY_SOURCE_IF_NO_MATCH = "x-amz-copy-source-if-none-match";

    /** Unmodified since constraint header for the copy object request */
    public static final String COPY_SOURCE_IF_UNMODIFIED_SINCE = "x-amz-copy-source-if-unmodified-since";

    /** Modified since constraint header for the copy object request */
    public static final String COPY_SOURCE_IF_MODIFIED_SINCE = "x-amz-copy-source-if-modified-since";

    /** Range header for the get object request */
    public static final String RANGE = "Range";

    /** Range header for the copy part request */
    public static final String COPY_PART_RANGE = "x-amz-copy-source-range";

    /** Modified since constraint header for the get object request */
    public static final String GET_OBJECT_IF_MODIFIED_SINCE = "If-Modified-Since";

    /** Unmodified since constraint header for the get object request */
    public static final String GET_OBJECT_IF_UNMODIFIED_SINCE = "If-Unmodified-Since";

    /** ETag matching constraint header for the get object request */
    public static final String GET_OBJECT_IF_MATCH = "If-Match";

    /** ETag non-matching constraint header for the get object request */
    public static final String GET_OBJECT_IF_NONE_MATCH = "If-None-Match";

    /**
     * Encrypted symmetric key header that is used in the Encryption Only (EO)
     * envelope encryption mechanism.
     */
    public static final String CRYPTO_KEY = "x-amz-key";

    /**
     * Encrypted symmetric key header that is used in the Authenticated
     * Encryption (AE) cryptographic module. Older versions of S3 encryption
     * client with encryption-only capability would not be able to recognize
     * this AE key, and therefore will be prevented from mistakenly decrypting
     * ciphertext in AE format.
     */
    public static final String CRYPTO_KEY_V2 = "x-amz-key-v2";

    /**
     * Initialization vector (IV) header that is used in the symmetric and
     * envelope encryption mechanisms
     */
    public static final String CRYPTO_IV = "x-amz-iv";

    /** JSON-encoded description of encryption materials used during encryption */
    public static final String MATERIALS_DESCRIPTION = "x-amz-matdesc";

    /**
     * Instruction file header to be placed in the metadata of instruction files
     */
    public static final String CRYPTO_INSTRUCTION_FILE = "x-amz-crypto-instr-file";

    /** Header for the original, unencrypted size of an encrypted object */
    public static final String UNENCRYPTED_CONTENT_LENGTH = "x-amz-unencrypted-content-length";

    /**
     * Header for the optional original unencrypted Content MD5 of an encrypted
     * object
     */
    public static final String UNENCRYPTED_CONTENT_MD5 = "x-amz-unencrypted-content-md5";

    /** Header for optional redirect location of an object */
    public static final String REDIRECT_LOCATION = "x-amz-website-redirect-location";

    /** Header for the optional restore information of an object */
    public static String RESTORE = "x-amz-restore";

    /**
     * Key wrapping algorithm such as "AES_WRAP" and
     * "RSA/ECB/OAEPWithSHA-256AndMGF1Padding".
     */
    public static final String CRYPTO_KEYWRAP_ALGORITHM = "x-amz-wrap-alg";
    /**
     * Content encryption algorithm, such as "AES/GCM/NoPadding".
     */
    public static final String CRYPTO_CEK_ALGORITHM = "x-amz-cek-alg";
    /**
     * Tag length applicable to authenticated encrypt/decryption.
     */
    public static final String CRYPTO_TAG_LENGTH = "x-amz-tag-len";

    /**
     * Headers in request indicating that the requester must be charged for data
     * transfer.
     */
    public static final String REQUESTER_PAYS_HEADER = "x-amz-request-payer";

    /**
     * Header in the response indicating that the requester has been charged for
     * the request.
     */
    public static final String REQUESTER_CHARGED_HEADER = "x-amz-request-charged";


    /** Header for the replication status of an Amazon S3 Object.*/
    public static final String OBJECT_REPLICATION_STATUS = "x-amz-replication-status";

    /** Region where the request is being served */
    public static final String S3_SERVING_REGION = "x-amz-region";

    /** Region where the bucket is located. This header is returned only in HEAD bucket and ListObjects response. */
    public static final String S3_BUCKET_REGION = "x-amz-bucket-region";

    /** Date when multipart upload will become eligible for abort operation by lifecycle. */
    public static final String ABORT_DATE = "x-amz-abort-date";

    /** Id of the lifecycle rule that makes a multipart upload eligible for abort operation. */
    public static final String ABORT_RULE_ID = "x-amz-abort-rule-id";

    /** S3 response header for a multipart object containing the number of parts in the object. */
    public static final String S3_PARTS_COUNT = "x-amz-mp-parts-count";

    /** S3 request header for PUT object with a tag set */
    public static final String S3_TAGGING = "x-amz-tagging";

    /** S3 response header the number of tags on an object */
    public static final String S3_TAGGING_COUNT = "x-amz-tagging-count";

    /** S3 response header for tagging directive */
    public static final String TAGGING_DIRECTIVE = "x-amz-tagging-directive";
}
