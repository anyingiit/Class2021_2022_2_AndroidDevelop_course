[English](README.md) · **简体中文**

> 英文版是规范版本。本页与 [README.md](README.md) 不一致时，以英文版为准。

<!-- translation-of: README.md sha256:bb8e48b361a83639 -->

<!-- Source: Best-README-Template BLANK_README (Unlicense) — https://github.com/othneildrew/Best-README-Template -->
<a id="readme-top"></a>

# Class2021 2022 2 AndroidDevelop Course

一个课程作业性质的 Android 应用，由若干个 Java Activity 与 Fragment 组成，用来演示图片视图、提示框与选择器对话框、以及 Fragment 间导航等核心 UI 组件。

[![CI](https://github.com/anyingiit/Class2021_2022_2_AndroidDevelop_course/actions/workflows/ci.yml/badge.svg)](https://github.com/anyingiit/Class2021_2022_2_AndroidDevelop_course/actions/workflows/ci.yml)
[![License](https://img.shields.io/github/license/anyingiit/Class2021_2022_2_AndroidDevelop_course)](LICENSE)

[报告问题](https://github.com/anyingiit/Class2021_2022_2_AndroidDevelop_course/issues/new?template=bug_report.yml) · [提出需求](https://github.com/anyingiit/Class2021_2022_2_AndroidDevelop_course/issues/new?template=feature_request.yml)

<details>
  <summary>目录</summary>
  <ol>
    <li><a href="#about-the-project">关于本项目</a></li>
    <li><a href="#getting-started">开始使用</a></li>
    <li><a href="#usage">用法</a></li>
    <li><a href="#contributing">参与贡献</a></li>
    <li><a href="#license">许可证</a></li>
    <li><a href="#contact">联系方式</a></li>
  </ol>
</details>

## 关于本项目

本仓库是一门 Android 开发课程的课堂练习：一个单模块 Android Studio 工程（`app/build.gradle`），其中 `MainActivity` 承载了一个 Jetpack Navigation 导航图，用于在菜单 Fragment 之间切换。每个 Fragment 各自独立演示一个 Android UI API —— 一个类似 `Gallery` 的图片网格（`ExGallery.java`）、以两种方式缩放 `ImageView`、提示框与系统对话框，以及跳转到另一个 `Activity`。

计划中的功能与已知问题，见 [open issues](https://github.com/anyingiit/Class2021_2022_2_AndroidDevelop_course/issues)。

## 开始使用

### 环境要求

- Android Studio（或命令行 SDK 工具），并安装 `app/build.gradle` 中 `compileSdk` 所要求的 Android SDK Platform 32 及配套 Build-Tools
- 一台运行 Android 9.0（API 28）及以上版本的设备或模拟器，对应 `app/build.gradle` 中的 `minSdk`
- JDK 11，用于运行 `gradle/wrapper/gradle-wrapper.properties` 中固定的 Gradle 7.3.3 包装器

### 安装

```sh
git clone https://github.com/anyingiit/Class2021_2022_2_AndroidDevelop_course.git
cd Class2021_2022_2_AndroidDevelop_course
./gradlew assembleDebug
```

该命令会在 `app/build/outputs/apk/debug/` 下生成一个未签名的调试版 APK。

## 用法

```sh
./gradlew installDebug
adb shell am start -n com.example.class2021_2022_2_androiddevelop_course/.MainActivity
```

应用启动后会显示菜单 Fragment；每个按钮都会跳转到一个练习 Fragment，其跳转关系定义在 `app/src/main/res/navigation/nav_graph.xml` 中。

## 参与贡献

欢迎参与。[CONTRIBUTING.md](CONTRIBUTING.md) 说明如何提交 issue 或 pull request，[CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md) 说明对所有参与者的行为要求。

请不要在公开的 issue 或 pull request 中报告安全问题。[SECURITY.md](SECURITY.md) 说明了私下报告的方式。

## 许可证

以 MIT 许可证分发。详见 [LICENSE](LICENSE)。

## 联系方式

项目地址：[https://github.com/anyingiit/Class2021_2022_2_AndroidDevelop_course](https://github.com/anyingiit/Class2021_2022_2_AndroidDevelop_course)

<p align="right">(<a href="#readme-top">back to top</a>)</p>
