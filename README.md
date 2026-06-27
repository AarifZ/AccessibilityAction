<div align="center">
<h4><b>The code in this repo was mainly generated with the assistance of AI tools and adapted for Tasker Java Code / Kid App usage.</b></h4>

&nbsp;

# Accessibility Action

Accessibility-related actions and events for Android automation with [Tasker](https://play.google.com/store/apps/details?id=net.dinglisch.android.taskerm).

[![Downloads](https://img.shields.io/github/downloads/AarifZ/AccessibilityAction/total?label=downloads&labelColor=27303D&color=0D1117&logo=github&logoColor=FFFFFF&&style=for-the-badge)](https://github.com/AarifZ/AccessibilityAction/releases/latest/download/AccessibilityAction.zip)
[![Stable](https://img.shields.io/github/v/release/AarifZ/AccessibilityAction?sort=date&display_name=tag&style=for-the-badge&label=stable)](https://github.com/AarifZ/AccessibilityAction/releases/latest)
[![Beta](https://img.shields.io/github/v/release/AarifZ/AccessibilityAction?include_prereleases&sort=semver&display_name=tag&style=for-the-badge&label=beta)](https://github.com/AarifZ/AccessibilityAction/releases)

_Requires Tasker's **Java Code** action. This fork also keeps fallback UI paths for **Tasker App Factory / Kid App** exports where Google Material Components may not be bundled._

</div>

&nbsp;

## About this fork

This AarifZ fork is based on the upstream project by `mqwec43as/AccessibilityAction`, with extra compatibility work for Tasker App Factory / Kid Apps.

The goal is to keep the latest upstream AccessibilityAction behavior while avoiding hard runtime failures in Kid App exports that do not include optional libraries such as:

- `com.google.android.material.*`
- `androidx.appcompat.*`
- public `okhttp3.*` classes

The updater in this fork downloads releases from AarifZ's GitHub releases, so release assets must keep this exact file name:

```text
AccessibilityAction.zip
```

Expected updater URL:

```text
https://github.com/AarifZ/AccessibilityAction/releases/latest/download/AccessibilityAction.zip
```

See [CHANGELOG.md](CHANGELOG.md) for the Kid App compatibility update notes.

&nbsp;

<div align="center">

# Features

</div>

### 1. Syntax-based UI automation actions

Use text to build automation, similar to AutoHotkey or AutoInput Action V2.

**Open YouTube today feed**

```java
openApp("Youtube");
click("Subscription");
click("Today");
```

**Open Reddit on a secondary display and scroll to r/tasker**

```java
setDisplay(21); // or setDisplay("scrcpy");
openApp("Reddit");
node = scrollTo("r/tasker");
click(node);
```

**React on click**

```java
a11Y.set();
myEvent() {
	String PackageName = "net.dinglisch.android.taskerm";
	
	Source() {
		String ViewIdResourceName = "net.dinglisch.android.taskerm:id/button_add_action";
		return this;
	}

	onViewClicked(Object event) {
		click("Filter");
	}

	return this;
}

String myEvent = myEvent();
String eventName = "Tasker add action";
a11Y.addEvent(eventName, myEvent);
```

&nbsp;

### 2. Debug highlighter and UI inspector

Highlight actions and map the current UI tree.

<video height="560" src="https://github.com/user-attachments/assets/d87dbd79-3aab-4c42-a4eb-f2b5e4397771" controls="controls" muted="muted" playsinline="playsinline"></video>

&nbsp;

### 3. Script builder

Create and test UI automation scripts by choosing actions through dialogs.

<video height="560" src="https://github.com/user-attachments/assets/37fbec1e-f809-4241-a570-e2dee39b005a" controls="controls" muted="muted" playsinline="playsinline"></video>

&nbsp;

## Tasker App Factory / Kid App notes

Newer Tasker App Factory builds support Java Code in Kid Apps, but Material Components and public OkHttp classes may still be absent from the exported Kid App runtime.

This fork keeps fallback-safe behavior for that case:

- Uses Android framework UI controls when Material Components are missing.
- Does not hard-stop assist/fallback UI only because Material Components are unavailable.
- Keeps the updater on standard Java/Android HTTP APIs instead of requiring OkHttp.
- Guards Material-only assist UI paths so the Kid App can continue running with reduced/fallback UI.

Recommended validation before publishing a release:

1. Build/export the Kid App with the latest Tasker App Factory.
2. Install on device.
3. Test import/update flow.
4. Test Accessibility Service enablement.
5. Test syntax actions such as `click()`, `scrollTo()`, `openApp()`.
6. Test assist/debug UI. If Material UI is unavailable, verify fallback UI opens instead of crashing.

&nbsp;

<div align="center">

# Documentation

[Read here](/readme/Documentation.md) | [Examples](/code/examples/) | [Changelog](CHANGELOG.md)

</div>

&nbsp;

<div align="center">

# FAQ

</div>

1. [What is a11Y?](/readme/What%20is%20a11Y.md)
2. [Why this won't work on some screen?](/readme/Why%20this%20won't%20work%20on%20some%20screen.md)
3. [How to use this without Taskernet project?](/readme/Use%20without%20taskernet%20project.md)
