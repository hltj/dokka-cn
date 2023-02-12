[//]: # (title: 简介)

Dokka 是 Kotlin 的 API 文档引擎。

就像 Kotlin 本身一样，Dokka 支持混合语言项目。 它理解 Kotlin 的
[KDoc 注释](https://kotlinlang.org/docs/kotlin-doc.html#kdoc-syntax)与 Java 的 
[Javadoc 注释](https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html)。

Dokka 可以生成多种格式的文档，包括它自己的现代 [HTML 格式](dokka-html.md)、
多种风格的 [Markdown](dokka-markdown.md) 以及 Java 的 [Javadoc HTML](dokka-javadoc.md)。

以下是一些将 Dokka 用于其 API 参考文档的库：

* [kotlinx.coroutines](https://kotlinlang.org/api/kotlinx.coroutines/)
* [Bitmovin](https://cdn.bitmovin.com/player/android/3/docs/index.html)
* [Hexagon](https://hexagonkt.com/api/index.html)
* [Ktor](https://api.ktor.io/)
* [OkHttp](https://square.github.io/okhttp/4.x/okhttp/okhttp3/)（Markdown）

可以使用 [Gradle](dokka-gradle.md)、 [Maven](dokka-maven.md) 或者在[命令行](dokka-cli.md)运行 Dokka。 它也是<!--
-->[高度可插拔的](dokka-plugins.md)。

参见 [Dokka 入门](dokka-get-started.md) 来迈出使用 Dokka 的第一步。

## 社区

Dokka 在 [Kotlin 社区 Slack](https://surveys.jetbrains.com/s3/kotlin-slack-sign-up) 中有个专属的 `#dokka` 频道，
可以在其中讨论 Dokka 及其插件以及如何开发插件，也可以与维护人取得联系。
