::#! 2> /dev/null                                             #
@ 2>/dev/null # 2>nul & echo off & goto BOF                   #
if [ -f "$0.com" ] && [ "$0.com" -nt "$0" ]; then             #
  exec "$0.com" "$@"                                          #
fi                                                            #
rm -f "$0.com"                                                #
if [ -z ${SIREUM_HOME} ]; then                                #
  echo "Please set SIREUM_HOME env var"                       #
  exit -1                                                     #
fi                                                            #
exec ${SIREUM_HOME}/bin/sireum slang run -s -n "$0" "$@"      #
:BOF
if not defined SIREUM_HOME (
  echo Please set SIREUM_HOME env var
  exit /B -1
)
%SIREUM_HOME%\bin\sireum.bat slang run -s -n "%0" %*
exit /B %errorlevel%
::!#
// #Sireum

import org.sireum._

val featureId: String = "com.collins.trustedsystems.briefcase.feature.feature.group"

val sireumHome: Os.Path = Os.path(Os.env("SIREUM_HOME").get)

val zipUrl: String = Os.cliArgs(0)

val updateSite = s"jar:${zipUrl}!"

val fmideLoc: Os.Path = Os.kind match {
  case Os.Kind.Linux => sireumHome / "bin/linux/fmide/fmide"
  case Os.Kind.Mac => sireumHome / "bin/mac/fmide.app/Contents/MacOS/fmide"
  case _ => halt("Unsupported platform")
}

val p2Args: ISZ[String] = ISZ[String](
  fmideLoc.canon.value,
  "-nosplash",
  "-console",
  "-consoleLog",
  "-application",
  "org.eclipse.equinox.p2.director",
  "-repository",
  updateSite,
  "-installIU",
  featureId,
  "-uninstallIU",
  featureId
)

val results = Os.proc(p2Args).console.runCheck()
