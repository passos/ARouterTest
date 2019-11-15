# ARouterTest
a test project to show ARouter compile warning message

```
$ ./gradlew asDebug
Starting a Gradle Daemon, 1 incompatible Daemon could not be reused, use --status for details

> Task :app:compileDebugJavaWithJavac
Gradle may disable incremental compilation as the following annotation processors are not incremental: jetified-arouter-compiler-1.2.2.jar (com.alibaba:arouter-compiler:1.2.2), auto-service-1.0-rc2.jar (com.google.auto.service:auto-service:1.0-rc2).
Consider setting the experimental feature flag android.enableSeparateAnnotationProcessing=true in the gradle.properties file to run annotation processing in a separate task and make compilation incremental.
注: ARouter::Compiler >>> AutowiredProcessor init. <<<
警告: 来自注释处理程序 'org.gradle.api.internal.tasks.compile.processing.TimeTrackingProcessor' 的受支持 source 版本 'RELEASE_7' 低于 -source '1.8'
注: ARouter::Compiler The user has configuration the module name, it was [app]
注: ARouter::Compiler >>> InterceptorProcessor init. <<<
警告: 来自注释处理程序 'org.gradle.api.internal.tasks.compile.processing.TimeTrackingProcessor' 的受支持 source 版本 'RELEASE_7' 低于 -source '1.8'
注: ARouter::Compiler The user has configuration the module name, it was [app]
注: ARouter::Compiler >>> RouteProcessor init. <<<
initial commit
警告: 来自注释处理程序 'org.gradle.api.internal.tasks.compile.processing.TimeTrackingProcessor' 的受支持 source 版本 'RELEASE_7' 低于 -source '1.8'
注: ARouter::Compiler >>> Found routes, start... <<<
注: ARouter::Compiler >>> Found routes, size is 1 <<<
注: ARouter::Compiler >>> Found activity route: com.example.aroutertest.TestActivity <<<
注: ARouter::Compiler >>> Start categories, group = test, path = /test/activity <<<
注: ARouter::Compiler >>> Generated group: test<<<
注: ARouter::Compiler >>> Generated provider map, name is ARouter$$Providers$$app <<<
注: ARouter::Compiler >>> Generated root, name is ARouter$$Root$$app <<<
3 个警告

Deprecated Gradle features were used in this build, making it incompatible with Gradle 6.0.
Use '--warning-mode all' to show the individual deprecation warnings.
See https://docs.gradle.org/5.4.1/userguide/command_line_interface.html#sec:command_line_warnings

BUILD SUCCESSFUL in 22s
26 actionable tasks: 21 executed, 5 up-to-date

```
