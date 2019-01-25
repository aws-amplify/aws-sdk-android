/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Portions copyright 2006-2009 James Murty. Please see LICENSE.txt
 * for applicable license terms and NOTICE.txt for applicable notices.
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

package com.amazonaws.services.s3.util;

import com.amazonaws.util.StringUtils;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Utility class that maintains a listing of known Mimetypes, and determines the
 * mimetype of files based on file extensions.
 * <p>
 * This class is obtained with the {#link {@link #getInstance()} method. It has
 * a default extension to mimetype mapping which is taken from the Apache HTTP
 * server's mime.types file. New mappings can be added or overwritten by
 * {@link #registerMimetype(String, String)}.
 * <p>
 * The format for mime type setting documents is:
 * <code>mimetype <Space | Tab>+ extension (<Space|Tab>+ extension)*</code>. Any
 * blank lines in the file are ignored, as are lines starting with
 * <code>#</code> which are considered comments. Lines that have a mimetype but
 * no associated extensions are also ignored.
 */
public final class Mimetypes {
    private static final Log log = LogFactory.getLog(Mimetypes.class);

    /** The default XML mimetype: application/xml */
    public static final String MIMETYPE_XML = "application/xml";

    /** The default HTML mimetype: text/html */
    public static final String MIMETYPE_HTML = "text/html";

    /** The default binary mimetype: application/octet-stream */
    public static final String MIMETYPE_OCTET_STREAM = "application/octet-stream";

    /** The default gzip mimetype: application/x-gzip */
    public static final String MIMETYPE_GZIP = "application/x-gzip";

    private static Mimetypes mimetypes = null;

    /**
     * Map that stores file extensions as keys, and the corresponding mimetype
     * as values.
     */
    private final HashMap<String, String> extensionToMimetypeMap;

    @SuppressWarnings("checkstyle:methodlength")
    Mimetypes() {
        extensionToMimetypeMap = new HashMap<String, String>();
        // Default mime types
        extensionToMimetypeMap.put("3gp", "video/3gpp");
        extensionToMimetypeMap.put("ai", "application/postscript");
        extensionToMimetypeMap.put("aif", "audio/x-aiff");
        extensionToMimetypeMap.put("aifc", "audio/x-aiff");
        extensionToMimetypeMap.put("aiff", "audio/x-aiff");
        extensionToMimetypeMap.put("asc", "text/plain");
        extensionToMimetypeMap.put("atom", "application/atom+xml");
        extensionToMimetypeMap.put("au", "audio/basic");
        extensionToMimetypeMap.put("avi", "video/x-msvideo");
        extensionToMimetypeMap.put("bcpio", "application/x-bcpio");
        extensionToMimetypeMap.put("bin", "application/octet-stream");
        extensionToMimetypeMap.put("bmp", "image/bmp");
        extensionToMimetypeMap.put("cdf", "application/x-netcdf");
        extensionToMimetypeMap.put("cgm", "image/cgm");
        extensionToMimetypeMap.put("class", "application/octet-stream");
        extensionToMimetypeMap.put("cpio", "application/x-cpio");
        extensionToMimetypeMap.put("cpt", "application/mac-compactpro");
        extensionToMimetypeMap.put("csh", "application/x-csh");
        extensionToMimetypeMap.put("css", "text/css");
        extensionToMimetypeMap.put("dcr", "application/x-director");
        extensionToMimetypeMap.put("dif", "video/x-dv");
        extensionToMimetypeMap.put("dir", "application/x-director");
        extensionToMimetypeMap.put("djv", "image/vnd.djvu");
        extensionToMimetypeMap.put("djvu", "image/vnd.djvu");
        extensionToMimetypeMap.put("dll", "application/octet-stream");
        extensionToMimetypeMap.put("dmg", "application/octet-stream");
        extensionToMimetypeMap.put("dms", "application/octet-stream");
        extensionToMimetypeMap.put("doc", "application/msword");
        extensionToMimetypeMap.put("dtd", "application/xml-dtd");
        extensionToMimetypeMap.put("dv", "video/x-dv");
        extensionToMimetypeMap.put("dvi", "application/x-dvi");
        extensionToMimetypeMap.put("dxr", "application/x-director");
        extensionToMimetypeMap.put("eps", "application/postscript");
        extensionToMimetypeMap.put("etx", "text/x-setext");
        extensionToMimetypeMap.put("exe", "application/octet-stream");
        extensionToMimetypeMap.put("ez", "application/andrew-inset");
        extensionToMimetypeMap.put("flv", "video/x-flv");
        extensionToMimetypeMap.put("gif", "image/gif");
        extensionToMimetypeMap.put("gram", "application/srgs");
        extensionToMimetypeMap.put("grxml", "application/srgs+xml");
        extensionToMimetypeMap.put("gtar", "application/x-gtar");
        extensionToMimetypeMap.put("gz", "application/x-gzip");
        extensionToMimetypeMap.put("hdf", "application/x-hdf");
        extensionToMimetypeMap.put("hqx", "application/mac-binhex40");
        extensionToMimetypeMap.put("htm", "text/html");
        extensionToMimetypeMap.put("html", "text/html");
        extensionToMimetypeMap.put("ice", "x-conference/x-cooltalk");
        extensionToMimetypeMap.put("ico", "image/x-icon");
        extensionToMimetypeMap.put("ics", "text/calendar");
        extensionToMimetypeMap.put("ief", "image/ief");
        extensionToMimetypeMap.put("ifb", "text/calendar");
        extensionToMimetypeMap.put("iges", "model/iges");
        extensionToMimetypeMap.put("igs", "model/iges");
        extensionToMimetypeMap.put("jnlp", "application/x-java-jnlp-file");
        extensionToMimetypeMap.put("jp2", "image/jp2");
        extensionToMimetypeMap.put("jpe", "image/jpeg");
        extensionToMimetypeMap.put("jpeg", "image/jpeg");
        extensionToMimetypeMap.put("jpg", "image/jpeg");
        extensionToMimetypeMap.put("js", "application/x-javascript");
        extensionToMimetypeMap.put("kar", "audio/midi");
        extensionToMimetypeMap.put("latex", "application/x-latex");
        extensionToMimetypeMap.put("lha", "application/octet-stream");
        extensionToMimetypeMap.put("lzh", "application/octet-stream");
        extensionToMimetypeMap.put("m3u", "audio/x-mpegurl");
        extensionToMimetypeMap.put("m4a", "audio/mp4a-latm");
        extensionToMimetypeMap.put("m4p", "audio/mp4a-latm");
        extensionToMimetypeMap.put("m4u", "video/vnd.mpegurl");
        extensionToMimetypeMap.put("m4v", "video/x-m4v");
        extensionToMimetypeMap.put("mac", "image/x-macpaint");
        extensionToMimetypeMap.put("man", "application/x-troff-man");
        extensionToMimetypeMap.put("mathml", "application/mathml+xml");
        extensionToMimetypeMap.put("me", "application/x-troff-me");
        extensionToMimetypeMap.put("mesh", "model/mesh");
        extensionToMimetypeMap.put("mid", "audio/midi");
        extensionToMimetypeMap.put("midi", "audio/midi");
        extensionToMimetypeMap.put("mif", "application/vnd.mif");
        extensionToMimetypeMap.put("mov", "video/quicktime");
        extensionToMimetypeMap.put("movie", "video/x-sgi-movie");
        extensionToMimetypeMap.put("mp2", "audio/mpeg");
        extensionToMimetypeMap.put("mp3", "audio/mpeg");
        extensionToMimetypeMap.put("mp4", "video/mp4");
        extensionToMimetypeMap.put("mpe", "video/mpeg");
        extensionToMimetypeMap.put("mpeg", "video/mpeg");
        extensionToMimetypeMap.put("mpg", "video/mpeg");
        extensionToMimetypeMap.put("mpga", "audio/mpeg");
        extensionToMimetypeMap.put("ms", "application/x-troff-ms");
        extensionToMimetypeMap.put("msh", "model/mesh");
        extensionToMimetypeMap.put("mxu", "video/vnd.mpegurl");
        extensionToMimetypeMap.put("nc", "application/x-netcdf");
        extensionToMimetypeMap.put("oda", "application/oda");
        extensionToMimetypeMap.put("ogg", "application/ogg");
        extensionToMimetypeMap.put("ogv", "video/ogv");
        extensionToMimetypeMap.put("pbm", "image/x-portable-bitmap");
        extensionToMimetypeMap.put("pct", "image/pict");
        extensionToMimetypeMap.put("pdb", "chemical/x-pdb");
        extensionToMimetypeMap.put("pdf", "application/pdf");
        extensionToMimetypeMap.put("pgm", "image/x-portable-graymap");
        extensionToMimetypeMap.put("pgn", "application/x-chess-pgn");
        extensionToMimetypeMap.put("pic", "image/pict");
        extensionToMimetypeMap.put("pict", "image/pict");
        extensionToMimetypeMap.put("png", "image/png");
        extensionToMimetypeMap.put("pnm", "image/x-portable-anymap");
        extensionToMimetypeMap.put("pnt", "image/x-macpaint");
        extensionToMimetypeMap.put("pntg", "image/x-macpaint");
        extensionToMimetypeMap.put("ppm", "image/x-portable-pixmap");
        extensionToMimetypeMap.put("ppt", "application/vnd.ms-powerpoint");
        extensionToMimetypeMap.put("ps", "application/postscript");
        extensionToMimetypeMap.put("qt", "video/quicktime");
        extensionToMimetypeMap.put("qti", "image/x-quicktime");
        extensionToMimetypeMap.put("qtif", "image/x-quicktime");
        extensionToMimetypeMap.put("ra", "audio/x-pn-realaudio");
        extensionToMimetypeMap.put("ram", "audio/x-pn-realaudio");
        extensionToMimetypeMap.put("ras", "image/x-cmu-raster");
        extensionToMimetypeMap.put("rdf", "application/rdf+xml");
        extensionToMimetypeMap.put("rgb", "image/x-rgb");
        extensionToMimetypeMap.put("rm", "application/vnd.rn-realmedia");
        extensionToMimetypeMap.put("roff", "application/x-troff");
        extensionToMimetypeMap.put("rtf", "text/rtf");
        extensionToMimetypeMap.put("rtx", "text/richtext");
        extensionToMimetypeMap.put("sgm", "text/sgml");
        extensionToMimetypeMap.put("sgml", "text/sgml");
        extensionToMimetypeMap.put("sh", "application/x-sh");
        extensionToMimetypeMap.put("shar", "application/x-shar");
        extensionToMimetypeMap.put("silo", "model/mesh");
        extensionToMimetypeMap.put("sit", "application/x-stuffit");
        extensionToMimetypeMap.put("skd", "application/x-koan");
        extensionToMimetypeMap.put("skm", "application/x-koan");
        extensionToMimetypeMap.put("skp", "application/x-koan");
        extensionToMimetypeMap.put("skt", "application/x-koan");
        extensionToMimetypeMap.put("smi", "application/smil");
        extensionToMimetypeMap.put("smil", "application/smil");
        extensionToMimetypeMap.put("snd", "audio/basic");
        extensionToMimetypeMap.put("so", "application/octet-stream");
        extensionToMimetypeMap.put("spl", "application/x-futuresplash");
        extensionToMimetypeMap.put("src", "application/x-wais-source");
        extensionToMimetypeMap.put("sv4cpio", "application/x-sv4cpio");
        extensionToMimetypeMap.put("sv4crc", "application/x-sv4crc");
        extensionToMimetypeMap.put("svg", "image/svg+xml");
        extensionToMimetypeMap.put("swf", "application/x-shockwave-flash");
        extensionToMimetypeMap.put("t", "application/x-troff");
        extensionToMimetypeMap.put("tar", "application/x-tar");
        extensionToMimetypeMap.put("tcl", "application/x-tcl");
        extensionToMimetypeMap.put("tex", "application/x-tex");
        extensionToMimetypeMap.put("texi", "application/x-texinfo");
        extensionToMimetypeMap.put("texinfo", "application/x-texinfo");
        extensionToMimetypeMap.put("tif", "image/tiff");
        extensionToMimetypeMap.put("tiff", "image/tiff");
        extensionToMimetypeMap.put("tr", "application/x-troff");
        extensionToMimetypeMap.put("tsv", "text/tab-separated-values");
        extensionToMimetypeMap.put("txt", "text/plain");
        extensionToMimetypeMap.put("ustar", "application/x-ustar");
        extensionToMimetypeMap.put("vcd", "application/x-cdlink");
        extensionToMimetypeMap.put("vrml", "model/vrml");
        extensionToMimetypeMap.put("vxml", "application/voicexml+xml");
        extensionToMimetypeMap.put("wav", "audio/x-wav");
        extensionToMimetypeMap.put("wbmp", "image/vnd.wap.wbmp");
        extensionToMimetypeMap.put("wbxml", "application/vnd.wap.wbxml");
        extensionToMimetypeMap.put("webm", "video/webm");
        extensionToMimetypeMap.put("wml", "text/vnd.wap.wml");
        extensionToMimetypeMap.put("wmlc", "application/vnd.wap.wmlc");
        extensionToMimetypeMap.put("wmls", "text/vnd.wap.wmlscript");
        extensionToMimetypeMap.put("wmlsc", "application/vnd.wap.wmlscriptc");
        extensionToMimetypeMap.put("wmv", "video/x-ms-wmv");
        extensionToMimetypeMap.put("wrl", "model/vrml");
        extensionToMimetypeMap.put("xbm", "image/x-xbitmap");
        extensionToMimetypeMap.put("xht", "application/xhtml+xml");
        extensionToMimetypeMap.put("xhtml", "application/xhtml+xml");
        extensionToMimetypeMap.put("xls", "application/vnd.ms-excel");
        extensionToMimetypeMap.put("xml", "application/xml");
        extensionToMimetypeMap.put("xpm", "image/x-xpixmap");
        extensionToMimetypeMap.put("xsl", "application/xml");
        extensionToMimetypeMap.put("xslt", "application/xslt+xml");
        extensionToMimetypeMap.put("xul", "application/vnd.mozilla.xul+xml");
        extensionToMimetypeMap.put("xwd", "image/x-xwindowdump");
        extensionToMimetypeMap.put("xyz", "chemical/x-xyz");
        extensionToMimetypeMap.put("zip", "application/zip");
    }

    /**
     * Gets an instance of {@link Mimetypes} with default mime type info. You
     * can load more via {@link #loadAndReplaceMimetypes(InputStream)}.
     * <p>
     * For more information about Internet media types, please read RFC 2045,
     * 2046, 2047, 2048, and 2077. The Internet media type registry is at
     * http://www.iana.org/assignments/media-types/
     * </p>
     *
     * @return an instance of {@link Mimetypes}
     */
    public static synchronized Mimetypes getInstance() {
        if (mimetypes != null)
            return mimetypes;

        mimetypes = new Mimetypes();
        if (log.isDebugEnabled()) {
            Map<String, String> map = mimetypes.extensionToMimetypeMap;
            for (String extension : map.keySet()) {
                log.debug("Setting mime type for extension '" + extension + "' to '"
                        + map.get(extension) + "'");
            }
        }
        return mimetypes;
    }

    /**
     * Reads and stores the mime type setting corresponding to a file extension,
     * by reading text from an InputStream. If a mime type setting already
     * exists when this method is run, the mime type value is replaced with the
     * newer one.
     *
     * @param is the input stream.
     * @throws IOException
     */
    public void loadAndReplaceMimetypes(InputStream is) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(is, StringUtils.UTF8));
        String line = null;

        while ((line = br.readLine()) != null) {
            line = line.trim();

            if (line.startsWith("#") || line.length() == 0) {
                // Ignore comments and empty lines.
                log.debug("Ignoring comments and empty lines.");
            } else {
                StringTokenizer st = new StringTokenizer(line, " \t");
                if (st.countTokens() > 1) {
                    String mimetype = st.nextToken();
                    while (st.hasMoreTokens()) {
                        String extension = st.nextToken();
                        extensionToMimetypeMap.put(StringUtils.lowerCase(extension), mimetype);
                        if (log.isDebugEnabled()) {
                            log.debug("Setting mime type for extension '"
                                    + StringUtils.lowerCase(extension)
                                    + "' to '" + mimetype + "'");
                        }
                    }
                } else {
                    if (log.isDebugEnabled()) {
                        log.debug("Ignoring mimetype with no associated file extensions: '" + line
                                + "'");
                    }
                }
            }
        }
    }

    /**
     * Determines the mimetype of a file by looking up the file's extension in
     * an internal listing to find the corresponding mime type. If the file has
     * no extension, or the extension is not available in the listing contained
     * in this class, the default mimetype <code>application/octet-stream</code>
     * is returned.
     * <p>
     * A file extension is one or more characters that occur after the last
     * period (.) in the file's name. If a file has an extension, Guesses the
     * mimetype of file data based on the file's extension.
     *
     * @param fileName The name of the file whose extension may match a known
     *            mimetype.
     * @return The file's mimetype based on its extension, or a default value of
     *         <code>application/octet-stream</code> if a mime type value cannot
     *         be found.
     */
    public String getMimetype(String fileName) {
        int lastPeriodIndex = fileName.lastIndexOf(".");
        if (lastPeriodIndex > 0 && lastPeriodIndex + 1 < fileName.length()) {
            String ext = StringUtils.lowerCase(fileName.substring(lastPeriodIndex + 1));
            if (extensionToMimetypeMap.containsKey(ext)) {
                String mimetype = extensionToMimetypeMap.get(ext);
                if (log.isDebugEnabled()) {
                    log.debug("Recognised extension '" + ext + "', mimetype is: '" + mimetype + "'");
                }
                return mimetype;
            } else {
                if (log.isDebugEnabled()) {
                    log.debug("Extension '" + ext + "' is unrecognized in mime type listing"
                            + ", using default mime type: '" + MIMETYPE_OCTET_STREAM + "'");
                }
            }
        } else {
            if (log.isDebugEnabled()) {
                log.debug("File name has no extension, mime type cannot be recognised for: "
                        + fileName);
            }
        }
        return MIMETYPE_OCTET_STREAM;
    }

    /**
     * Determines the mimetype of a file by looking up the file's extension in
     * an internal listing to find the corresponding mime type. If the file has
     * no extension, or the extension is not available in the listing contained
     * in this class, the default mimetype <code>application/octet-stream</code>
     * is returned.
     * <p>
     * A file extension is one or more characters that occur after the last
     * period (.) in the file's name. If a file has no extension, Guesses the
     * mimetype of file data based on the file's extension.
     *
     * @param file the file whose extension may match a known mimetype.
     * @return the file's mimetype based on its extension, or a default value of
     *         <code>application/octet-stream</code> if a mime type value cannot
     *         be found.
     */
    public String getMimetype(File file) {
        return getMimetype(file.getName());
    }

    /**
     * Register a new mimetype for the given extension. If a mapping for the
     * extension exists, this will overwrite it. Note that extension is case
     * insensitive.
     *
     * @param extension a file extension
     * @param mimetype mime type string
     */
    public void registerMimetype(String extension, String mimetype) {
        extensionToMimetypeMap.put(StringUtils.lowerCase(extension), mimetype);
    }
}
