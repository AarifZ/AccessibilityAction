# [setDisplayIdByPackageName](/code/main/setDisplayIdByPackageName.bsh)

Select the display ID by matching a window package name.

&nbsp;
# Dependencies
1. [getRoot](/readme/main/getRoot.md)
2. [getService](/readme/main/getService.md)
3. [setDisplayId](/readme/main/setDisplayId.md)

&nbsp;
# How it works
`setDisplayIdByPackageName` inspects all active windows on all displays, finds the first application window whose root node package name matches the provided package, and stores that window's display ID globally.

&nbsp;
# How it use

**Select display for a package:**
```
setDisplayIdByPackageName("com.android.settings");
```

&nbsp;
## Return Value
Returns the display ID of the matched package, or `0` if no matching window is found.