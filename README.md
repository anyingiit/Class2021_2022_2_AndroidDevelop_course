<!-- Source: Best-README-Template BLANK_README (Unlicense) — https://github.com/othneildrew/Best-README-Template -->
<a id="readme-top"></a>

# Class2021 2022 2 AndroidDevelop Course

A coursework Android app of small Java activities and fragments that demonstrate core UI widgets, including image views, alert and picker dialogs, and Fragment-based navigation between screens.

**English** · [简体中文](README.zh-CN.md)

[![CI](https://github.com/anyingiit/Class2021_2022_2_AndroidDevelop_course/actions/workflows/ci.yml/badge.svg)](https://github.com/anyingiit/Class2021_2022_2_AndroidDevelop_course/actions/workflows/ci.yml)
[![License](https://img.shields.io/github/license/anyingiit/Class2021_2022_2_AndroidDevelop_course)](LICENSE)

[Report a bug](https://github.com/anyingiit/Class2021_2022_2_AndroidDevelop_course/issues/new?template=bug_report.yml) · [Request a feature](https://github.com/anyingiit/Class2021_2022_2_AndroidDevelop_course/issues/new?template=feature_request.yml)

<details>
  <summary>Table of Contents</summary>
  <ol>
    <li><a href="#about-the-project">About The Project</a></li>
    <li><a href="#getting-started">Getting Started</a></li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>

## About The Project

This repository holds the classroom exercises for an Android development course: a single Android Studio module (`app/build.gradle`) whose `MainActivity` hosts a Jetpack Navigation graph that switches between a menu of fragments. Each fragment isolates one Android UI API on its own screen — a `Gallery`-style image grid (`ExGallery.java`), scaling an `ImageView` two different ways, alert and system dialogs, and starting a second `Activity`.

See the [open issues](https://github.com/anyingiit/Class2021_2022_2_AndroidDevelop_course/issues) for planned features and known issues.

## Getting Started

### Prerequisites

- Android Studio (or the command-line SDK tools) with the Android SDK Platform 32 and matching Build-Tools, the `compileSdk` declared in `app/build.gradle`
- A device or emulator running Android 9.0 (API 28) or newer, the project's `minSdk` in `app/build.gradle`
- JDK 11, to run the Gradle 7.3.3 wrapper pinned in `gradle/wrapper/gradle-wrapper.properties`

### Installation

```sh
git clone https://github.com/anyingiit/Class2021_2022_2_AndroidDevelop_course.git
cd Class2021_2022_2_AndroidDevelop_course
./gradlew assembleDebug
```

This produces an unsigned debug APK under `app/build/outputs/apk/debug/`.

## Usage

```sh
./gradlew installDebug
adb shell am start -n com.example.class2021_2022_2_androiddevelop_course/.MainActivity
```

The app opens on the menu fragment; each button navigates to one exercise fragment, wired up in `app/src/main/res/navigation/nav_graph.xml`.

## Contributing

Contributions are welcome. Read [CONTRIBUTING.md](CONTRIBUTING.md) for how to open an issue or a pull request, and [CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md) for the standards expected of everyone taking part.

Please do not report security issues in public issues or pull requests. [SECURITY.md](SECURITY.md) explains how to report them privately.

## License

Distributed under the MIT License. See [LICENSE](LICENSE) for details.

## Contact

Project link: [https://github.com/anyingiit/Class2021_2022_2_AndroidDevelop_course](https://github.com/anyingiit/Class2021_2022_2_AndroidDevelop_course)

<p align="right">(<a href="#readme-top">back to top</a>)</p>
