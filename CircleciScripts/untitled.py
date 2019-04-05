from send_email import *
import sys

release_version = sys.argv[1]
releae_content = sys.argv[2]. 

title = "AWS SDK for Android - {0} release".format(release_version)

content = """Hello all,

We released AWS SDK for iOS - 2.9.2 today. Here is the summary of the changes:\r\n""".format(release_version)

content += release_content 

send_email(title, content , contentformat = ContentFormat.Markdown, toaddresses = "sdechunq@amazon.com" )
