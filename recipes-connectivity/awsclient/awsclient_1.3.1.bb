SUMMARY = "The AWS IoT client establishes a connection to AWS IoT, executes jobs and sends status information."

LICENSE = "CLOSED"

SRC_URI = "gitsm://git@github.com/osb-cc-esec/awsclient.git;protocol=ssh;branch=master"

SRCREV = "fa01a3fc783b6ddf4188d2f065173e8806674a33"
S = "${WORKDIR}/git"

DEPENDS = "curl glib-2.0 glib-2.0-native json-glib openssl"

inherit cmake

OECMAKE_GENERATOR = "Unix Makefiles"

do_install () {
    install -d ${D}${bindir}/
    install -m 0755 ${B}/src/awsclient ${D}${bindir}/
}
